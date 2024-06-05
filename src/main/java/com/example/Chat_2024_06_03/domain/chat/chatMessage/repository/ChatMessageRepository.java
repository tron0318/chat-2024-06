package com.example.Chat_2024_06_03.domain.chat.chatMessage.repository;

import com.example.Chat_2024_06_03.domain.chat.chatMessage.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findByChatRoomIdAndIdAfter(Long roomId, long afterId);
}
