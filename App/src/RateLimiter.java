import java.util.HashMap;

public class RateLimiter {

    HashMap<String,Integer> requests = new HashMap<>();
    int LIMIT = 5;

    public boolean allow(String client){

        int count = requests.getOrDefault(client,0);

        if(count>=LIMIT)
            return false;

        requests.put(client,count+1);
        return true;
    }

    public static void main(String[] args){

        RateLimiter rl = new RateLimiter();

        for(int i=0;i<7;i++)
            System.out.println(rl.allow("user1"));
    }
}
