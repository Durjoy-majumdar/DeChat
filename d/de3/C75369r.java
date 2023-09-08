package de3;

import java.util.regex.Pattern;

/* renamed from: de3.r */
public class C75369r {

    /* renamed from: a */
    public static final Pattern f221585a = Pattern.compile("<a[^>]*href\\s*=\\s*[\"|']\\s*([^>]{0,2048})\\s*[\"|'][^>]*>((\\s|\\S){0,1024}?)</a>");

    /* renamed from: b */
    public static final Pattern f221586b = Pattern.compile("<a[^>]*href\\s*=\\s*[\"|']\\s*([^>]{0,2048})\\s*[\"|'][^>]*>((\\s|\\S){0,1024}?)</a>");

    /* renamed from: c */
    public static final Pattern f221587c = Pattern.compile("<a.{1,1000}?href\\s*=\\s*[\"|']\\s*(.{1,500}?)\\s*[\"|']\\s*>(.+?)</a>");

    /* renamed from: d */
    public static final Pattern f221588d = Pattern.compile("<a.{1,1000}?href\\s*=\\s*[\"|']\\s*(.{1,300}?)\\s*[\"|']\\s*>(.+?)</a>");

    /* renamed from: e */
    public static final Pattern f221589e = Pattern.compile("<a.{1,500}?href\\s*=\\s*[\"|']\\s*(.{1,1024}?)\\s*[\"|']\\s*>(.+?)</a>");

    /* renamed from: f */
    public static final Pattern f221590f = Pattern.compile("<a.{1,100}?href\\s*=\\s*[\"|']\\s*(.{1,1024}?)\\s*[\"|']\\s*>(.+?)</a>");

    /* renamed from: g */
    public static final Pattern f221591g = Pattern.compile("<_wc_custom_link_.+?color\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*href\\s*=\\s*[\"|']\\s*(.*?)\\s*[\"|']\\s*.*?>(.*?)</_wc_custom_link_>");

    /* renamed from: h */
    public static final Pattern f221592h = Pattern.compile("<_wc_custom_link_.+?\\s*href\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*>(.*?)</_wc_custom_link_>");

    /* renamed from: i */
    public static final Pattern f221593i = Pattern.compile("<img.+?src=\"(.+?).png\"/>\\s*");

    /* renamed from: j */
    public static final Pattern f221594j = Pattern.compile("weixin://\\S+");

    /* renamed from: k */
    public static final Pattern f221595k = Pattern.compile("((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:(([-_a-zA-Z0-9]([-_a-zA-Z0-9\\-]{0,61}[-_a-zA-Z0-9]){0,1}\\.)+[a-zA-Z]{2,6}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)(\\/(?:(?:[-_a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?", 2);

    /* renamed from: l */
    public static final Pattern f221596l = Pattern.compile("(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?");

    /* renamed from: m */
    public static final Pattern f221597m = Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9._-]+\\.[A-Z]+", 2);

    /* renamed from: n */
    public static final Pattern f221598n = Pattern.compile("\\+?(\\d{2,8}([- ]?\\d{3,8}){2,6}|\\d{5,20})([,;]+\\d{0,20}#?){0,5}");

    /* renamed from: o */
    public static final Pattern f221599o = Pattern.compile("weixin://wxpay/\\S+");

    /* renamed from: p */
    public static final Pattern f221600p = Pattern.compile("weixin://dl/\\w+");

    /* renamed from: q */
    public static final Pattern f221601q = Pattern.compile("weixin://dl/business(\\/(?:(?:[a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~%\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?");

    /* renamed from: r */
    public static final Pattern f221602r = Pattern.compile("\\d{1,5}\\s(\\w+[\\s,.]+){2,8}\\d{5}(-\\d{4})?([\\s,]*USA)?", 2);

    /* renamed from: s */
    public static final Pattern f221603s = Pattern.compile("([A-Za-z0-9]{3,})");

    /* renamed from: t */
    public static final Pattern f221604t = Pattern.compile("([#＃][^#＃\\s,.，。@]{1,1000})");

    /* renamed from: u */
    public static final Pattern f221605u = Pattern.compile("mp://\\w+");

    static {
        Pattern.compile("#冒泡#");
        Pattern.compile("^(62[0-9]{14,17})$");
        Pattern.compile("^(1[0-9]{10})$");
    }
}
