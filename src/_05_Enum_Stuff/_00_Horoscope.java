package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
	String zodiac = JOptionPane.showInputDialog("Type a zodiac for a horoscope");
	Zodiac zc = Zodiac.valueOf(zodiac);
	Horoscope(zc);
	}
	static void Horoscope(Zodiac z) {
		switch(z) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "A longing for comfort and the small, simple pleasures in life is likely to cripple your initiative today, Aries. Have you decided to withdraw from the career whirl for the time being? Or perhaps you're just discouraged by the lack of enthusiasm in your colleagues. In any case, this would be a good day to stay home and rest, Aries.");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "For the past several days, Taurus, you've been fairly lucky in financial and material terms. But the day ahead will be an exception. If you're planning to make an investment, sign a contract, or purchase a major item, postpone it until another day. You may as well resign yourself to this fate and be grateful that you were spared the chance to make a mistake! ");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "The way you act when you first meet people is typical of Gemini. What is it that you do? You try to teach them something. It seems that you always have a lesson to impart, making you prone to giving advice when it isn't always wanted. Make an effort to accept the points of view of others for a change. ");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Your philosophy of life comes naturally, Cancer. Others need to study, listen to experts, or sign on to various allegiances. You, on the other hand, already have a profound outlook on life that you surely inherited from your past experiences. It would be interesting for you to expand on your philosophy a bit and try to turn it into something concrete. ");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "It isn't because your new projects demand such precision that they're causing you problems, Leo. You tend to think details keep you from having a global vision, but that simply isn't true. There's no conflict between the long-term view and short-term needs. You just think that the latter gets in the way of the former. Try thinking of the details that you find annoying as steppingstones to your larger vision.");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Yes, Virgo, this is a good moment to abandon old beliefs and moral values. Your view of life has changed and, above all, you're more aware of how your outdated, preconceived ideas sometimes poison your life. The past no longer concerns you. It's time for you to make a clean break from the beliefs that are holding you back. You might shock your family, but they'll get over it. ");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "If you aren't careful to keep your eyes straight ahead and focused on the future, the past is likely to catch up to you, Libra. Don't look back, even if you don't see anything in front of you. You must continue to move forward. It's true that this is easier said than done. Nevertheless, you feel inspired to give it a try. ");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "This would be the moment to say yes to your destiny, Scorpio. You're a little frustrated because things haven't been moving forward the way you'd like. But now that opportunities are coming your way, you find you're holding things up. You're just afraid, that's all. But rather than let your fear overtake you, turn its energy to your advantage. ");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "Don't expect to meet the partner of your dreams today, Sagittarius. Rather, your romantic hopes are likely to meet with frustration. It would be better to devote your energies to something more realistic, such as your financial situation. It probably does need some attention, wouldn't you agree? If you redirect your energy, the rewards are more likely to be forthcoming. ");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "There's some likelihood that a recent meeting with an influential person has put a damper on your hopes for your projects. Will you abandon them and live with regret? Or will you choose to maintain your goals despite advice to the contrary and the risk of encountering disapproval from your supervisors? This is the type of question you will have to resolve today, Capricorn.\n" + 
					"\n" + 
					" ");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "You will have to expect a few disturbances in the harmony that has reigned over the past few days, Aquarius. For example, your needs may not match those of your mate or close friends, or you may feel restless. Minor worries about the future may intrude on people's good moods. In short, this won't be a good day to look to emotional harmony as a source of satisfaction. ");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "As a person who embodies affection and tenderness, Pisces, you may feel especially resentful about today's mood. It will be difficult to charm a smile out of anyone or achieve any semblance of harmony. Moreover, the friction won't spare siblings - even close friends may quarrel. Prepare to duck and cover, because clashes are likely to occur all around you. ");
			break;
		}
	}
}
