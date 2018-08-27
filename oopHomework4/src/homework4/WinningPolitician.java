package homework4;

public class WinningPolitician {

	public static void main(String[] args) {
		Politicians politicians = new Obama();
		politicians.statesman();
		politicians.campaignPromises();
		politicians.strongCoilition();
		politicians.machiavellian();
		
		Obama prez = new Obama();
		prez.thirdTerm();
		prez.benefitsConsumer();
		
		AmericanRecoveryAct sBill = new Obama();
		sBill.StimulusBill();
		
		Hillary hrc = new Hillary();
		hrc.statesman();
		hrc.campaignPromises();
		hrc.strongCoilition();
		hrc.machiavellian();
		
		House h = new House();
		h.name= "Paul Ryan";
		System.out.println(h.name);
		
	}

}
