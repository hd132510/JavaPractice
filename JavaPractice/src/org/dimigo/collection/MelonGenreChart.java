/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author		: 김정혁
 * @version		: 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		
		List<Music> balad = new ArrayList<Music>();
		balad.add(new Music("내 첫사랑", "베리굿"));
		balad.add(new Music("또 다시 사랑", "임창정"));
		balad.add(new Music("부산에 가면", "박진영"));
		
		List<Music> dance = new ArrayList<Music>();
		dance.add(new Music("커피","유재환, 김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		
		map.put("발라드", balad);
		map.put("댄스", dance);
		
		System.out.println("--------<< 멜론 장르별 차트 >>--------");
		printMap(map);
		
		balad.set(2, new Music("지우고 지워도", "차수경"));
		System.out.println("--------<< 발라드 3위 곡 변경 >>--------");
		printMap(map);
		
		balad.remove(0);
		System.out.println("--------<< 발라드 1위 곡 삭제 >>--------");
		printMap(map);
		
		map.clear();
		System.out.println("--------<< 전체 리스트 삭제 >>--------");
		printMap(map);

	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(Map.Entry<String, List<Music>> entry : map.entrySet()) {
			System.out.println("[" + entry.getKey() + "]");
			int i = 1;
			for(Music m : entry.getValue()) {
				System.out.println(i + ". " + m.toString());
				i++;
			}
			i = 1;
		}
		System.out.println();
	}

}
