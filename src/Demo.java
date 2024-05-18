public class Demo{
    public static void main(String[] args){
        StrategyClient client = new StrategyClient(3, 300);
        StrategyClient client2 = new StrategyClient(300, 3);
        System.out.println(client.solve());
        System.out.println(client2.solve());
    }
}

class StrategyClient{
   private RollingArrayStrategy strategy; 
   private int m;
   private int n;
   public StrategyClient(int m, int n){
        this.m = m;
        this.n = n;
        this.pickStrategy();
   }

   private void pickStrategy(){
        if(this.n*1.0/this.m <10.0){
            this.setStrategy(strategy = new RowRollingDP());
        }else{
            this.setStrategy(strategy = new ColRollingDP());
        }
   }

   private void setStrategy(RollingArrayStrategy strategy){
        this.strategy = strategy;
   }

   public int solve(){
        return this.strategy.unique(this.m, this.n);
   }
}

interface RollingArrayStrategy{
    int unique(int m, int n);
}

class RowRollingDP implements RollingArrayStrategy{
    public int unique(int m, int n){
        // only logic for row rolling dp, no if judgement
        return 0;
    }
}

class ColRollingDP implements RollingArrayStrategy{
    public int unique(int m, int n){
        // only logic for col rolling dp, no if judgement
        return 1;
    }
}