package jm3;

import java.util.regex.Pattern;

/* renamed from: jm3.c */
public class C117362c {

    /* renamed from: a */
    public static Pattern f351355a = Pattern.compile("^((https|http|ftp|rtsp|mms)?://)?(([0-9a-z_!~*'().&=+$%-]+: )?[0-9a-z_!~*'().&=+$%-]+@)?(([0-9]{1,3}\\.){3}[0-9]{1,3}|([0-9a-z_!~*'()-]+\\.)*([0-9a-z][0-9a-z-]{0,61})?[0-9a-z]\\.[a-z]{2,6})(:[0-9]{1,4})?((/?)|(/[0-9a-z_!~*'().;?:@&=+$,%#-]+)+/?)$");

    /* renamed from: a */
    public static String m165476a(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("      ");
        }
        return sb.toString();
    }
}
