package org.study.home.mapper;

import java.util.List;

import org.study.home.model.AttachImageDTO;
import org.study.home.model.Criteria;
import org.study.home.model.ShipDTO;

public interface AdminMapper {
	public void shipEnroll(ShipDTO ship);

	public List<ShipDTO> goodsGetList(Criteria cri);

	   public int goodsGetTotal(Criteria cri);
	   /* 이미지 등록 */
		public void imageEnroll(AttachImageDTO dto);

		   public ShipDTO goodsRead(String shipId);
		   public void goodsUpdate(ShipDTO dto);
}
