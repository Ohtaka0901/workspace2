package code17_06;

public class UnsupportedMusicFileException extends Exception  {
	//エラーメッセージを受け取るコンストラクタ
	UnsupportedMusicFileException(String msg){
		super(msg);
	}

}
