package za2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import qc0.C101106m;

/* renamed from: za2.e */
public class C102987e {

    /* renamed from: a */
    public static final String[] f303915a = {"#", "?", "&"};

    /* renamed from: b */
    public static String f303916b = null;

    /* renamed from: c */
    public static String f303917c = null;

    /* renamed from: d */
    public static final Pattern f303918d = Pattern.compile("songid=([0-9]+)");

    /* renamed from: a */
    public static boolean m136173a(String str, boolean z, PString pString) {
        String str2 = new String(m136183k(str));
        int indexOf = str2.indexOf("{");
        if (indexOf != -1) {
            str2 = str2.substring(indexOf);
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("song_WapLiveURL");
            String string2 = jSONObject.getString("song_WifiURL");
            Log.m105918d("MicroMsg.Music.MusicUrlUtil", "waplive: " + string + "  wifi:" + string2);
            if (z) {
                string = string2;
            }
            pString.value = string;
            return true;
        } catch (Exception e) {
            pString.value = str;
            Log.printErrStackTrace("MicroMsg.Music.MusicUrlUtil", e, "decodeJson", new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    public static String m136174b(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String str2 = f303916b;
        if (str2 != null && str.equals(str2)) {
            return f303917c;
        }
        String[] strArr = f303915a;
        String str3 = "";
        String str4 = null;
        for (int i = 0; i < 3; i++) {
            str3 = strArr[i] + "p=";
            if (str.contains(str3)) {
                str4 = str;
            }
            if (str4 != null) {
                break;
            }
        }
        if (str4 == null) {
            return null;
        }
        int indexOf = str4.indexOf(str3);
        if (indexOf < 0) {
            Log.m105929w("MicroMsg.Music.MusicUrlUtil", "pIndex is %d, return", Integer.valueOf(indexOf));
            return null;
        }
        String substring = str4.substring(indexOf + str3.length());
        String[] strArr2 = f303915a;
        for (int i2 = 0; i2 < 3; i2++) {
            int indexOf2 = substring.indexOf(strArr2[i2]);
            if (indexOf2 > 0) {
                substring = substring.substring(0, indexOf2);
            }
        }
        if (substring != null) {
            f303916b = str;
            f303917c = substring;
        }
        return substring;
    }

    /* renamed from: c */
    public static String m136175c(C101106m mVar) {
        if (m136180h(mVar) == null) {
            return null;
        }
        String b = m136174b(mVar.f295966n);
        if (b != null) {
            return b;
        }
        String b2 = m136174b(mVar.f295968p);
        return b2 != null ? b2 : m136174b(mVar.f295967o);
    }

    /* renamed from: d */
    public static String m136176d(String str, String str2, boolean z, PBool pBool) {
        String str3 = (z || Util.isNullOrNil(str2)) ? str : str2;
        if (Util.isNullOrNil(str3)) {
            return str3;
        }
        PString pString = new PString();
        Log.m105925i("MicroMsg.Music.MusicUrlUtil", "url[%s], lowBandUrl[%s], isWifi[%B]", str, str2, Boolean.valueOf(z));
        String b = m136174b(str3);
        if (b != null) {
            if (m136173a(b, z, pString)) {
                pBool.value = z;
            }
        } else if (str3.contains("wechat_music_url=")) {
            m136173a(str3.substring(str3.indexOf("wechat_music_url=") + 17), z, pString);
        } else {
            pString.value = str3;
        }
        return pString.value;
    }

    /* renamed from: e */
    public static int m136177e(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        Matcher matcher = f303918d.matcher(str);
        if (matcher.find()) {
            try {
                return Integer.valueOf(matcher.group(1)).intValue();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Music.MusicUrlUtil", e, "getSongId", new Object[0]);
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static String m136178f(String str) {
        int indexOf = str == null ? -1 : str.indexOf("songid=");
        if (indexOf < 0) {
            return null;
        }
        String substring = str.substring(indexOf + 7);
        return (substring == null || !substring.contains("&")) ? substring : substring.substring(0, substring.indexOf("&"));
    }

    /* renamed from: g */
    public static String m136179g(String str) {
        int indexOf = str == null ? -1 : str.indexOf("songmid=");
        if (indexOf < 0) {
            return null;
        }
        String substring = str.substring(indexOf + 8);
        return (substring == null || !substring.contains("&")) ? substring : substring.substring(0, substring.indexOf("&"));
    }

    /* renamed from: h */
    public static String m136180h(C101106m mVar) {
        if (mVar == null) {
            return null;
        }
        if (!Util.isNullOrNil(mVar.f295966n)) {
            return mVar.f295966n;
        }
        if (!Util.isNullOrNil(mVar.f295968p)) {
            return mVar.f295968p;
        }
        if (!Util.isNullOrNil(mVar.f295967o)) {
            return mVar.f295967o;
        }
        return null;
    }

    /* renamed from: i */
    public static String m136181i(Context context) {
        String str;
        String packageName = MMApplicationContext.getPackageName();
        if (packageName == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return "";
            }
            str = "" + packageInfo.versionName;
            try {
                return str + "" + packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                Log.printErrStackTrace("MicroMsg.Music.MusicUrlUtil", e, "", new Object[0]);
                return str;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            str = "";
            Log.printErrStackTrace("MicroMsg.Music.MusicUrlUtil", e, "", new Object[0]);
            return str;
        }
    }

    /* renamed from: j */
    public static boolean m136182j(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if ((parse != null ? parse.getHost() : "") != null) {
            boolean contains = parse.getHost().contains(".qq.com");
            Log.m105929w("MicroMsg.Music.MusicUrlUtil", "url %s match ? %B", str, Boolean.valueOf(contains));
            return contains;
        }
        Log.m105924i("MicroMsg.Music.MusicUrlUtil", "host is null, url is not match .qq.com");
        return false;
    }

    /* renamed from: k */
    public static byte[] m136183k(String str) {
        int i;
        byte[] bArr = new byte[((str.length() / 2) + (str.length() % 2))];
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            try {
                int i4 = i2 + 1;
                char charAt = str.charAt(i2);
                int i5 = (charAt < '1' || charAt > '9') ? (charAt < 'A' || charAt > 'F') ? 0 : (charAt - 'A') + 10 : charAt - '0';
                if (i4 < str.length()) {
                    int i6 = i4 + 1;
                    char charAt2 = str.charAt(i4);
                    i = (charAt2 < '1' || charAt2 > '9') ? (charAt2 < 'A' || charAt2 > 'F') ? 0 : (charAt2 - 'A') + 10 : charAt2 - '0';
                    i4 = i6;
                } else {
                    i = 0;
                }
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((i5 << 4) | i);
                i2 = i4;
                i3 = i7;
            } catch (Exception unused) {
                return null;
            }
        }
        return bArr;
    }
}
