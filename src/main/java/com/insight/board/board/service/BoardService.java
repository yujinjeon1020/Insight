package com.insight.board.board.service;

import com.insight.board.board.dto.BoardDto;

import java.util.List;

public interface BoardService {

    List<BoardDto> selectBoardList() throws Exception;
}
