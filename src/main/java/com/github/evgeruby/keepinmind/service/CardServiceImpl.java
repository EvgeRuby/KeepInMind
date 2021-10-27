package com.github.evgeruby.keepinmind.service;

import com.github.evgeruby.keepinmind.exception.BadRequestException;
import com.github.evgeruby.keepinmind.model.Card;
import com.github.evgeruby.keepinmind.pojo.AddCardRequest;
import com.github.evgeruby.keepinmind.repository.CardRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;


    @Override
    public Card getCardById(long cardId) throws NotFoundException {
        return cardRepository.findById(cardId)
                .orElseThrow(() -> new NotFoundException("Unable to find such card " + cardId));
    }

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @Override
    public Card save(AddCardRequest request) {
        if (cardRepository.findByName(request.getTerm()).isPresent()){
            throw new BadRequestException();
        }
        Card card = new Card();
        card.setTerm(request.getTerm());
        card.setDefinition(request.getDefinition());
        return cardRepository.save(card);
    }
}
