package com.team1.stelling.service;

import com.team1.stelling.domain.dao.SupportDAO;
import com.team1.stelling.domain.dto.SupportDTO;
import com.team1.stelling.domain.vo.Criteria;
import com.team1.stelling.domain.vo.PayDTO;
import com.team1.stelling.domain.vo.SupportVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SupportService{
    private final SupportDAO supportDAO;
    
    //후원 내역
    public List<SupportVO> getSupportList(Criteria criteria, Long supportSponser) {return supportDAO.getSuppotList(criteria, supportSponser);}

    public void register(SupportVO supportVO) {supportDAO.register(supportVO);}
<<<<<<< HEAD

    //검색한 결과의 총 개수(페이징 처리)
    public int getSearchSupportTotal(Criteria criteria){return supportDAO.getSearchSupportTotal(criteria);}
    
    //후원한 코인 총 개수
    public SupportDTO getSupportCoinTotal(Long supportSponser){return supportDAO.getSupportCoinTotal(supportSponser);}
=======
    public List<SupportVO> getSupportListWithNovelNumber(Long novelNumber){return supportDAO.getSupportListWithNovelNumber(novelNumber);}

>>>>>>> d28bdfcd21da60623b1704a11ff562d7b285a735
}
