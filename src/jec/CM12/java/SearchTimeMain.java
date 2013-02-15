package jec.CM12.java;

public class SearchTimeMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataEntity pe = new DataEntity();
		ReadTool.read(pe);
		SimpleJudgeTools sjt = new SimpleJudgeToolsImp();
		System.out.println(sjt.simpleJudge(pe));
	}
}
