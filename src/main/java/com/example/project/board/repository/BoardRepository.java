package com.example.project.board.repository;

import com.example.project.board.domain.Board;
import com.example.project.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository  extends JpaRepository<Board, Long> {
}
