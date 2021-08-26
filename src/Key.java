import java.io.UnsupportedEncodingException;

class Key {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "\uD834\uDD1E";
        System.out.println(s);
        
        String str = new String(s.getBytes(), "UTF-8");
        System.setProperty("console.encoding", "UTF-8");
        System.out.println(str);
    }
}
