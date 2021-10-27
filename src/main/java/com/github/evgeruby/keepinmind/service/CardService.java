package com.github.evgeruby.keepinmind.service;

import com.github.evgeruby.keepinmind.model.Card;
import com.github.evgeruby.keepinmind.pojo.AddCardRequest;
import javassist.NotFoundException;

import java.util.List;

public interface CardService {
    Card getCardById(long id) throws NotFoundException;

    List<Card> getAllCards();

    Card save(AddCardRequest request);
}
