package com.example.Chat_2024_06_03.domain.chat.chatRoom.service;

import com.example.Chat_2024_06_03.domain.chat.chatRoom.entity.ChatRoom;
import com.example.Chat_2024_06_03.domain.chat.chatRoom.repository.ChatRoomRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;

    @Transactional
    public void make(String name) {
        ChatRoom chatRoom = ChatRoom.builder()
                .name(name)
                .build();

        chatRoomRepository.save(chatRoom);
    }

    public List<ChatRoom> findAll() {
        return chatRoomRepository.findAll();
    }

    public Optional<ChatRoom> findById(long roomId) {
        return chatRoomRepository.findById(roomId);
    }

    @Transactional
    public void write(long roomId, String writerName, String content) {
        ChatRoom chatRoom = chatRoomRepository.findById(roomId).get();

        chatRoom.writeMessage(writerName, content);
    }
}
