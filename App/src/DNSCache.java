import java.util.HashMap;

class DNSCache {

    static class Entry {
        String ip;
        long expiry;

        Entry(String ip,long ttl){
            this.ip=ip;
            this.expiry=System.currentTimeMillis()+ttl;
        }
    }

    HashMap<String,Entry> cache = new HashMap<>();

    public String resolve(String domain){

        if(cache.containsKey(domain)){
            Entry e = cache.get(domain);

            if(System.currentTimeMillis() < e.expiry){
                return "Cache HIT: "+e.ip;
            }
        }

        String ip="192.168.1.1";
        cache.put(domain,new Entry(ip,5000));

        return "Cache MISS: "+ip;
    }

    public static void main(String[] args){
        DNSCache dns = new DNSCache();

        System.out.println(dns.resolve("google.com"));
        System.out.println(dns.resolve("google.com"));
    }
}
