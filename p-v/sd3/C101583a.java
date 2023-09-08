package sd3;

import android.content.Context;
import android.graphics.Rect;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C97625j3;
import f12.C7970a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: sd3.a */
public class C101583a {

    /* renamed from: a */
    public String f297389a;

    /* renamed from: b */
    public String f297390b;

    /* renamed from: c */
    public String f297391c;

    /* renamed from: d */
    public boolean f297392d;

    /* renamed from: e */
    public boolean f297393e;

    /* renamed from: f */
    public String f297394f;

    /* renamed from: g */
    public String f297395g;

    /* renamed from: h */
    public String f297396h;

    /* renamed from: i */
    public Map<String, String> f297397i;

    /* renamed from: sd3.a$a */
    public enum C101584a {
        ASSET,
        DOWNLOAD,
        ERROR
    }

    public C101583a(String str, String str2, String str3, boolean z, boolean z2) {
        this.f297389a = str;
        this.f297390b = str2;
        this.f297391c = str3;
        this.f297392d = z;
        this.f297393e = z2;
    }

    /* renamed from: a */
    public static void m133406a() {
        C97625j3.m125812b().mo105906u().mo119676J(8193, "");
        C97625j3.m125812b().mo105906u().mo119676J(8449, 0L);
    }

    /* renamed from: b */
    public static String m133407b(String str) {
        C101584a c = m133408c(str);
        if (c == C101584a.ASSET) {
            return str;
        }
        if (c != C101584a.DOWNLOAD) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        String substring = (lastIndexOf < 0 || lastIndexOf >= str.length() + -1) ? null : str.substring(lastIndexOf + 1);
        if (substring == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        C97625j3.m125812b().getClass();
        sb.append(C7970a.m8127a());
        sb.append(substring);
        return sb.toString();
    }

    /* renamed from: c */
    public static C101584a m133408c(String str) {
        return str.indexOf("tips/") == 0 ? C101584a.ASSET : str.indexOf("weixin://") == 0 ? C101584a.DOWNLOAD : C101584a.ERROR;
    }

    /* renamed from: d */
    public static ArrayList<C101583a> m133409d(Context context, String str) {
        HashSet hashSet;
        String str2 = str;
        if (str2 == null || str.length() < 0) {
            return null;
        }
        String displaySizeType = BackwardSupportUtil.BitmapFactory.getDisplaySizeType(context);
        if (displaySizeType == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet();
            hashSet.add(displaySizeType);
            String displayDensityType = BackwardSupportUtil.BitmapFactory.getDisplayDensityType(context);
            Log.m105918d("MicroMsg.PushMessage", "getDisplaySizeType :" + displayDensityType);
            if (displayDensityType != null) {
                String[] split = displayDensityType.split("_");
                String str3 = (split == null || split.length < 2) ? null : split[0];
                hashSet.add(str3 + "_L");
                hashSet.add(str3 + "_P");
            }
        }
        if (hashSet == null || hashSet.size() <= 0) {
            return null;
        }
        Map<String, String> parseXml = XmlParser.parseXml(str2, "tips", (String) null);
        if (parseXml == null) {
            return null;
        }
        ArrayList<C101583a> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(".tips.tip");
            sb.append(i > 0 ? Integer.valueOf(i) : "");
            String sb4 = sb.toString();
            if (parseXml.get(sb4) == null) {
                break;
            }
            String str4 = parseXml.get(sb4 + ".$id");
            Log.m105918d("MicroMsg.PushMessage", "parseMessages id:" + str4);
            String str5 = parseXml.get(sb4 + ".$platform");
            if (str5.equals(Platform.ANDROID)) {
                C101583a aVar = r10;
                C101583a aVar2 = new C101583a(str4, str5, parseXml.get(sb4 + ".$device"), Util.nullAsTrue(Boolean.valueOf(parseXml.get(sb4 + ".$enableclose"))), Util.nullAsTrue(Boolean.valueOf(parseXml.get(sb4 + ".$transparentclose"))));
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(".title.$x");
                int i2 = Util.getInt(parseXml.get(sb5.toString()), 0);
                int i3 = Util.getInt(parseXml.get(sb4 + ".title.$y"), 0);
                int i4 = Util.getInt(parseXml.get(sb4 + ".title.$width"), 0);
                int i5 = Util.getInt(parseXml.get(sb4 + ".title.$font"), 0);
                Util.getHex(parseXml.get(sb4 + ".title.$color"), 0);
                String str6 = parseXml.get(sb4 + ".title");
                new Rect(i2, i3, i4 + i2, i5 + i3);
                int i6 = Util.getInt(parseXml.get(sb4 + ".description.$x"), 0);
                int i7 = Util.getInt(parseXml.get(sb4 + ".description.$y"), 0);
                int i8 = Util.getInt(parseXml.get(sb4 + ".description.$width"), 0);
                int i9 = Util.getInt(parseXml.get(sb4 + ".description.$font"), 0);
                Util.getHex(parseXml.get(sb4 + ".description.$color"), 0);
                String str7 = parseXml.get(sb4 + ".description");
                new Rect(i6, i7, i8 + i6, i9 + i7);
                C101583a aVar3 = aVar;
                aVar3.f297396h = parseXml.get(sb4 + ".url");
                aVar3.f297394f = parseXml.get(sb4 + ".time.start");
                aVar3.f297395g = parseXml.get(sb4 + ".time.end");
                Log.m105918d("MicroMsg.PushMessage", "parseMessages id:" + aVar3.f297389a + " start:" + aVar3.f297394f + " end:" + aVar3.f297395g);
                HashMap hashMap = new HashMap();
                int i15 = 0;
                while (true) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb4);
                    sb6.append(".images.image");
                    sb6.append(i15 > 0 ? Integer.valueOf(i15) : "");
                    String sb7 = sb6.toString();
                    String str8 = parseXml.get(sb7);
                    Log.m105918d("MicroMsg.PushMessage", " img res:" + str8);
                    if (str8 == null) {
                        break;
                    }
                    String str9 = parseXml.get(sb7 + ".$type");
                    if (hashSet.contains(str9)) {
                        hashMap.put(str9, str8);
                    }
                    i15++;
                }
                if (hashMap.size() > 0) {
                    aVar3.f297397i = hashMap;
                }
                Log.m105918d("MicroMsg.PushMessage", "msgid :" + aVar3.f297389a);
                arrayList.add(aVar3);
            }
            i++;
        }
        Log.m105918d("MicroMsg.PushMessage", "msgs size: " + arrayList.size());
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ad.id=");
        sb.append(this.f297389a);
        sb.append(", platform=");
        sb.append(this.f297390b);
        sb.append(", device=");
        sb.append(this.f297391c);
        String str = "";
        sb.append(this.f297392d ? ", closable" : str);
        if (this.f297393e) {
            str = ", trans-closable";
        }
        sb.append(str);
        return sb.toString();
    }
}
