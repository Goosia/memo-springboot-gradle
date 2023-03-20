package com.goosia.memo.service.impl;

import com.goosia.memo.controller.MemoController;
import com.goosia.memo.mapper.MemoMapper;
import com.goosia.memo.model.MemoDto;
import com.goosia.memo.service.MemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class MemoServiceImpl implements MemoService {

    @Autowired
    private MemoMapper memoMapper;

    @Override
    public List<MemoDto> findMemoList() {
        return memoMapper.selectMemoList();
    }

    @Override
    public MemoDto findMemo(int idx) {
        return memoMapper.selectMemo(idx);
    }

    @Override
    public void insertMemo(MemoDto req) {
        memoMapper.insertMemo(req);
    }

    @Override
    public void updateMemo(MemoDto req) {
        memoMapper.updateMemo(req);
    }

    @Override
    public void deleteMemo(int idx) {
        memoMapper.deleteMemo(idx);
    }
}
