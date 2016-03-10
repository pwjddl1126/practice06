package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	private List<Board> boardList = new ArrayList<>();;
	
	public BoardDao(){	
		Board temp = new Board();
		temp.setTitle("제목1");
		temp.setContent("내용1");
		boardList.add(temp);
		
		Board temp2 = new Board();
		temp2.setTitle("제목2");
		temp2.setContent("내용2");
		boardList.add(temp2);
		
		Board temp3 = new Board();
		temp3.setTitle("제목3");
		temp3.setContent("내용3");
		boardList.add(temp3);
	}
	
	public List<Board> getBoardList(){
		return boardList;
	}
}
