package jec.CM12.java;

public class SimpleJudgeToolsImp implements SimpleJudgeTools {

	@Override
	public String simpleJudge(DataEntity pe) {
		return pe.getStart() == pe.getEnd() ? judge4Equal(pe)
				: judge4notEqual(pe);
	}
	
	private String judge4Equal(DataEntity pe) {
		return pe.getTime() == pe.getStart() ? createMessage(pe, true,false)
				: createMessage(pe, false,false);
	}
	
	private String judge4notEqual(DataEntity pe) {
		if (pe.getEnd() > pe.getStart()) {
			return (pe.getTime() >= pe.getStart() && pe.getTime() < pe.getEnd()) 
					 ? createMessage(pe, true,false) : createMessage(pe, false,false);
		}else if(pe.getTime()>=pe.getEnd() && pe.getTime()<pe.getStart()){
			return createMessage(pe,false,true);
		}else{
			return createMessage(pe,true,true);
		}
	}

	public String createMessage(DataEntity pe, boolean judgeResultFlag, boolean plusOnedayFlag) {
		String message="";
		if(plusOnedayFlag){
			message="[INFO]時間範囲帯の終了時刻を翌日の時刻として見なして調べた結果です!\r\n";
		}
		if (judgeResultFlag) {
			return message+"お調べになる時刻[" + pe.getTime() + "]は指定した時間帯[" + pe.getStart()
					+ "~" + pe.getEnd() + "]にありました！";
		} else {
			return message+"お調べになる時刻[" + pe.getTime() + "]は指定した時間帯[" + pe.getStart()
					+ "~" + pe.getEnd() + "]にありませんでした！";
		}
	}
}
