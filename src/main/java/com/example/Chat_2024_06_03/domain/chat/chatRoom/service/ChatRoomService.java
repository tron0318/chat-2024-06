package com.example.Chat_2024_06_03.domain.chat.chatRoom.service;

import com.example.Chat_2024_06_03.domain.chat.chatRoom.entity.ChatRoom;
import com.example.Chat_2024_06_03.domain.chat.chatRoom.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;

    public void make(String name) {
        ChatRoom chatroom = ChatRoom.builder()
                        .name(name)
                                .build();

        chatRoomRepository.save(chatroom);
    }

    public List<ChatRoom> findAll() {
        return chatRoomRepository.findAll();
    }
}
