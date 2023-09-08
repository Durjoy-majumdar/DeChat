package fn0;

import an0.C79592a;
import android.text.TextUtils;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lu0.C88650c;

/* renamed from: fn0.e */
public class C87000e {

    /* renamed from: h */
    public static final Pattern f252477h = Pattern.compile("[R,r]ange:\\s*bytes=(\\d*)\\s*-\\s*(\\d*)");

    /* renamed from: i */
    public static HashMap<String, Map<String, String>> f252478i = new HashMap<>();

    /* renamed from: a */
    public BufferedReader f252479a;

    /* renamed from: b */
    public LinkedHashMap<String, String> f252480b = new LinkedHashMap<>();

    /* renamed from: c */
    public LinkedHashMap<String, String> f252481c = new LinkedHashMap<>();

    /* renamed from: d */
    public int[] f252482d = new int[2];

    /* renamed from: e */
    public ArrayList<String> f252483e = new ArrayList<>();

    /* renamed from: f */
    public String f252484f;

    /* renamed from: g */
    public String f252485g;

    public C87000e(InputStream inputStream, String str) {
        this.f252479a = new BufferedReader(new InputStreamReader(inputStream));
        this.f252485g = str + "HttpParser";
        try {
            mo121403e();
        } catch (IOException e) {
            String str2 = this.f252485g;
            C87002g.m108023q(6, str2, "error parsing request " + C87002g.m108014h(e, false), (Throwable) null);
        }
    }

    /* renamed from: a */
    public static String m108001a(Map<String, List<String>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            for (int i = 0; i < list.size(); i++) {
                if (str != null) {
                    linkedHashMap.put(str.toLowerCase().trim(), (String) list.get(i));
                } else {
                    linkedHashMap.put(str, (String) list.get(i));
                }
            }
        }
        String str2 = "";
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getKey() != null) {
                str2 = (str2 + ((String) entry.getKey())) + ": ";
            }
            str2 = (str2 + ((String) entry.getValue())) + APLogFileUtil.SEPARATOR_LINE;
        }
        return str2;
    }

    /* renamed from: c */
    public static long[] m108002c(String str) {
        long j;
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = f252477h.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                try {
                    j = Long.parseLong(group);
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                try {
                    return new long[]{j, Long.parseLong(group2)};
                } catch (NumberFormatException unused2) {
                    return new long[]{j, -2};
                }
            }
        }
        return new long[]{-1, -1};
    }

    /* renamed from: d */
    public static String m108003d(long j, long j2, long j3, String str, boolean z) {
        long j4;
        String str2;
        String str3;
        boolean z2;
        long j5 = j2;
        String str4 = str;
        boolean z3 = j != -1;
        boolean z4 = !TextUtils.isEmpty(str);
        boolean z5 = j3 >= 0;
        if (!z3) {
            j4 = j3;
        } else if (j5 == -2) {
            j4 = j3 - j;
        } else {
            long j6 = j3 - 1;
            if (j5 > j6) {
                C87002g.m108023q(5, "HttpParser", "fix rangeEnd. max=" + j6 + " current=" + j5, (Throwable) null);
            }
            j5 = Math.min(j5, j6);
            j4 = (j5 - j) + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(z3 ? "HTTP/1.1 206 PARTIAL CONTENT\r\n" : "HTTP/1.1 200 OK\r\n");
        String str5 = sb.toString() + "Connection: close\r\n";
        if (z5 && z3) {
            if (j5 == -2) {
                str5 = str5 + String.format(Locale.US, "Content-Range: bytes %d-%d/%d\r\n", new Object[]{Long.valueOf(j), Long.valueOf(j3 - 1), Long.valueOf(j3)});
            } else {
                str5 = str5 + String.format(Locale.US, "Content-Range: bytes %d-%d/%d\r\n", new Object[]{Long.valueOf(j), Long.valueOf(j5), Long.valueOf(j3)});
            }
        }
        if (z) {
            str2 = str5 + String.format(Locale.US, "Cache-Control: max-age=%d\r\n", new Object[]{10800});
        } else {
            str2 = str5 + "Cache-Control: no-cache\r\n";
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        sb4.append("Date: " + simpleDateFormat.format(new Date()) + " GMT");
        sb4.append(APLogFileUtil.SEPARATOR_LINE);
        String sb5 = sb4.toString();
        if (z) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb5);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", locale);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Expires: ");
            str3 = "";
            z2 = z3;
            sb7.append(simpleDateFormat2.format(new Date(System.currentTimeMillis() + ((long) 10800000))));
            sb7.append(" GMT");
            sb6.append(sb7.toString());
            sb6.append(APLogFileUtil.SEPARATOR_LINE);
            sb5 = sb6.toString();
        } else {
            str3 = "";
            z2 = z3;
        }
        StringBuilder sb8 = new StringBuilder();
        sb8.append(sb5);
        sb8.append(z5 ? String.format(Locale.US, "Content-Length: %d\r\n", new Object[]{Long.valueOf(j4)}) : str3);
        StringBuilder sb9 = new StringBuilder();
        sb9.append(sb8.toString() + "Accept-Ranges: bytes\r\n");
        sb9.append(z4 ? String.format("Content-Type: %s\r\n", new Object[]{str4}) : str3);
        String str6 = (sb9.toString() + String.format("X-Server: %s\r\n", new Object[]{"VideoProxy 1.4.1"})) + APLogFileUtil.SEPARATOR_LINE;
        if (!z2 && z4 && str4.equalsIgnoreCase(MimeTypes.VIDEO_MP4)) {
            ((C88650c) C79592a.m96648a().f233411n).getClass();
            C115669n.INSTANCE.idkeyStat(1234, 37, j3, false);
        }
        return str6;
    }

    /* renamed from: b */
    public String mo121402b(String str) {
        return this.f252481c.get(str);
    }

    /* renamed from: e */
    public void mo121403e() {
        String readLine = this.f252479a.readLine();
        String str = this.f252485g;
        C87002g.m108023q(4, str, "parseRequest:" + readLine, (Throwable) null);
        if (readLine == null || readLine.length() == 0) {
            C87002g.m108023q(6, this.f252485g, "initial is not valid", (Throwable) null);
        } else if (Character.isWhitespace(readLine.charAt(0))) {
            C87002g.m108023q(6, this.f252485g, "character first char is whitespace", (Throwable) null);
        } else {
            String[] split = readLine.split("\\s");
            if (split.length != 3) {
                C87002g.m108023q(6, this.f252485g, "cmd.length is not 3", (Throwable) null);
                return;
            }
            this.f252483e.add(readLine);
            this.f252484f = split[0];
            String str2 = (split[2].indexOf("HTTP/") != 0 || split[2].indexOf(46) <= 5) ? (split[0].indexOf("HTTP/") != 0 || split[0].indexOf(46) <= 5) ? null : split[0] : split[2];
            if (str2 != null) {
                String[] split2 = str2.substring(5).split("\\.");
                try {
                    this.f252482d[0] = Integer.parseInt(split2[0]);
                    this.f252482d[1] = Integer.parseInt(split2[1]);
                } catch (NumberFormatException e) {
                    String str3 = this.f252485g;
                    C87002g.m108023q(6, str3, "error parsing request NumberFormatException:" + C87002g.m108014h(e, false), (Throwable) null);
                    return;
                }
            }
            if (split[0].equals("GET") || split[0].equals("HEAD")) {
                int indexOf = split[1].indexOf(63);
                if (indexOf >= 0) {
                    String[] split3 = split[1].substring(indexOf + 1).split("&");
                    this.f252481c = new LinkedHashMap<>();
                    for (int i = 0; i < split3.length; i++) {
                        String[] split4 = split3[i].split("=");
                        if (split4.length == 2) {
                            this.f252481c.put(URLDecoder.decode(split4[0], "UTF-8"), URLDecoder.decode(split4[1], "UTF-8"));
                        } else if (split4.length == 1 && split3[i].indexOf(61) == split3[i].length() - 1) {
                            this.f252481c.put(URLDecoder.decode(split4[0], "UTF-8"), "");
                        }
                    }
                }
            } else if (!split[0].equals("POST") && !split[0].equals("OPTIONS") && !split[0].equals("PUT") && !split[0].equals("DELETE") && !split[0].equals("TRACE")) {
                split[0].equals("CONNECT");
            }
            StringBuilder sb = new StringBuilder();
            String readLine2 = this.f252479a.readLine();
            sb.append(readLine2);
            sb.append("|");
            while (true) {
                if (readLine2.equals("")) {
                    break;
                }
                int indexOf2 = readLine2.indexOf(58);
                if (indexOf2 < 0) {
                    this.f252480b = null;
                    break;
                }
                this.f252480b.put(readLine2.substring(0, indexOf2).toLowerCase().trim(), readLine2.substring(indexOf2 + 1).trim());
                this.f252483e.add(readLine2);
                readLine2 = this.f252479a.readLine();
                sb.append(readLine2);
                sb.append("|");
            }
            String str4 = this.f252485g;
            C87002g.m108023q(4, str4, "parseHeaders:" + sb.toString(), (Throwable) null);
        }
    }
}
