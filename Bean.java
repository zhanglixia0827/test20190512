package cn.kgc.tangcco.zhanglixia.common;

import java.util.List;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Bean {
	@NonNull
	private String id,className;
	private List<Property> propertyList;
}
