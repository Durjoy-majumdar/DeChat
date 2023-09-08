package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.map.tools.net.NetUtil;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.hb */
public final class C113798hb {

    /* renamed from: A */
    private static C113799a f340462A = null;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final String f340463B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final String f340464C;

    /* renamed from: D */
    private static String f340465D = null;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static String f340466E = null;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static String f340467F = null;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static String f340468G = null;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static String f340469H = null;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static String f340470I = null;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static String f340471J = null;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public static int f340472K = 0;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public static String f340473L = null;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public static String f340474M = "undefined";
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static float f340475N = 1.0f;

    /* renamed from: O */
    private static final int f340476O = 100;

    /* renamed from: P */
    private static final int f340477P = 4000000;

    /* renamed from: Q */
    private static final int f340478Q = 53500000;

    /* renamed from: R */
    private static final int f340479R = 73670000;

    /* renamed from: S */
    private static final int f340480S = 135100000;

    /* renamed from: T */
    private static final int f340481T = -85000000;

    /* renamed from: U */
    private static final int f340482U = 85000000;

    /* renamed from: V */
    private static final int f340483V = -180000000;

    /* renamed from: W */
    private static final int f340484W = 180000000;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static int f340485X = 0;

    /* renamed from: Y */
    private static int f340486Y = 160;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static float f340487Z = 0.0f;

    /* renamed from: a */
    public static final File f340488a;

    /* renamed from: aa */
    private static final int f340489aa = 20;

    /* renamed from: ab */
    private static final double f340490ab = 6378137.0d;

    /* renamed from: ac */
    private static final double f340491ac = 4.007501668557849E7d;

    /* renamed from: ad */
    private static final double f340492ad = 0.017453292519943295d;

    /* renamed from: ae */
    private static final double f340493ae = 2.68435456E8d;

    /* renamed from: b */
    public static final File f340494b;

    /* renamed from: c */
    public static final File f340495c;

    /* renamed from: d */
    public static final String f340496d = "tencentmap/mapsdk_vector/";

    /* renamed from: e */
    public static final int f340497e = -1;

    /* renamed from: f */
    public static final int f340498f = 0;

    /* renamed from: g */
    public static final int f340499g = 1;

    /* renamed from: h */
    public static final int f340500h = 2;

    /* renamed from: i */
    public static int f340501i = 2;

    /* renamed from: j */
    public static int f340502j = 0;

    /* renamed from: k */
    public static int f340503k = 0;

    /* renamed from: l */
    public static int f340504l = 0;

    /* renamed from: m */
    public static final int f340505m = 1;

    /* renamed from: n */
    public static final int f340506n = 2;

    /* renamed from: o */
    public static final int f340507o = 3;

    /* renamed from: p */
    public static int f340508p = 2;

    /* renamed from: q */
    public static int f340509q = f340477P;

    /* renamed from: r */
    public static int f340510r = f340478Q;

    /* renamed from: s */
    public static int f340511s = f340479R;

    /* renamed from: t */
    public static int f340512t = f340480S;

    /* renamed from: u */
    private static final String f340513u = "Tencent";

    /* renamed from: v */
    private static final String f340514v = "MapSDK";

    /* renamed from: w */
    private static final String f340515w = "Caches";
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static String f340516x = null;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static String f340517y = null;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static String f340518z = null;

    /* renamed from: com.tencent.mapsdk.internal.hb$a */
    public static final class C113799a {

        /* renamed from: a */
        public final boolean f340519a;

        public /* synthetic */ C113799a(boolean z, byte b) {
            this(z);
        }

        /* renamed from: a */
        private String m157110a() {
            return (this.f340519a || C113798hb.f340468G == null) ? "" : C113798hb.f340468G;
        }

        /* renamed from: b */
        private String m157111b() {
            return (this.f340519a || C113798hb.f340469H == null) ? "" : C113798hb.f340469H;
        }

        /* renamed from: c */
        private static String m157112c() {
            return NetUtil.STR_UserAgent;
        }

        /* renamed from: d */
        private String m157113d() {
            return (this.f340519a || C113798hb.f340473L == null) ? "" : C113798hb.f340473L;
        }

        /* renamed from: e */
        private String m157114e() {
            return this.f340519a ? "" : C113798hb.f340474M;
        }

        /* renamed from: f */
        private int m157115f() {
            if (this.f340519a) {
                return 0;
            }
            return C113798hb.f340472K;
        }

        /* renamed from: g */
        private String m157116g() {
            return (this.f340519a || C113798hb.f340467F == null) ? "" : C113798hb.f340467F;
        }

        /* renamed from: h */
        private static int m157117h() {
            return C113798hb.f340485X;
        }

        /* renamed from: i */
        private String m157118i() {
            return (this.f340519a || C113798hb.f340470I == null) ? "" : C113798hb.f340470I;
        }

        /* renamed from: j */
        private static String m157119j() {
            String y = C113798hb.f340518z;
            return (y == null || TextUtils.isEmpty(y) || y.equals(C113798hb.f340471J)) ? C113798hb.f340471J == null ? "" : C113798hb.f340471J : y;
        }

        /* renamed from: k */
        private static String m157120k() {
            return C113798hb.f340463B;
        }

        /* renamed from: l */
        private static String m157121l() {
            return C113798hb.f340466E == null ? "" : C113798hb.f340466E;
        }

        /* renamed from: m */
        private static String m157122m() {
            return C113798hb.f340464C;
        }

        /* renamed from: n */
        private static float m157123n() {
            return C113798hb.f340475N;
        }

        /* renamed from: o */
        private static float m157124o() {
            return C113798hb.f340487Z;
        }

        /* renamed from: p */
        private static String m157125p() {
            String F = C113798hb.f340517y;
            return (F == null || F.equals(C113798hb.f340516x)) ? C113798hb.f340516x : F;
        }

        private C113799a(boolean z) {
            this.f340519a = z;
        }
    }

    static {
        File file = new File(Environment.getExternalStorageDirectory(), f340513u);
        f340488a = file;
        File file2 = new File(file, f340514v);
        f340494b = file2;
        f340495c = new File(file2, f340515w);
        String str = C114207sl.f341938j;
        f340463B = str;
        f340464C = str;
    }

    /* renamed from: H */
    private static Date m157056H() {
        return Calendar.getInstance().getTime();
    }

    /* renamed from: I */
    private static String m157057I() {
        return m157064P().f340519a ? "" : f340474M;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = f340467F;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m157058J() {
        /*
            com.tencent.mapsdk.internal.hb$a r0 = m157064P()
            boolean r0 = r0.f340519a
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = f340467F
            if (r0 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return r0
        L_0x000e:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113798hb.m157058J():java.lang.String");
    }

    /* renamed from: K */
    private static void m157059K() {
        int i = f340486Y;
        if (i <= 120) {
            f340508p = 1;
        } else if (i <= 160) {
            f340508p = 2;
        } else if (i <= 240) {
            f340508p = 3;
        } else {
            m157060L();
        }
    }

    /* renamed from: L */
    private static void m157060L() {
        int i = f340485X;
        if (i > 153600) {
            f340508p = 3;
        } else if (i < 153600) {
            f340508p = 1;
        } else {
            f340508p = 2;
        }
    }

    /* renamed from: M */
    private static String m157061M() {
        return f340513u;
    }

    /* renamed from: N */
    private static String m157062N() {
        return f340514v;
    }

    /* renamed from: O */
    private static String m157063O() {
        return f340515w;
    }

    /* renamed from: P */
    private static C113799a m157064P() {
        C113799a aVar = f340462A;
        return aVar != null ? aVar : new C113799a(false, (byte) 0);
    }

    /* renamed from: Q */
    private static C113799a m157065Q() {
        return new C113799a(false, (byte) 0);
    }

    /* renamed from: a */
    private static float m157067a(int i) {
        return ((float) i) / 255.0f;
    }

    /* renamed from: a */
    public static String m157068a() {
        m157064P();
        String str = f340517y;
        if (str == null || str.equals(f340516x)) {
            return f340516x;
        }
        return str;
    }

    /* renamed from: b */
    public static float m157078b() {
        m157064P();
        return f340475N;
    }

    /* renamed from: c */
    public static String m157083c() {
        m157064P();
        return NetUtil.STR_UserAgent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = f340468G;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m157085d() {
        /*
            com.tencent.mapsdk.internal.hb$a r0 = m157064P()
            boolean r0 = r0.f340519a
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = f340468G
            if (r0 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return r0
        L_0x000e:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113798hb.m157085d():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = f340469H;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m157087e() {
        /*
            com.tencent.mapsdk.internal.hb$a r0 = m157064P()
            boolean r0 = r0.f340519a
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = f340469H
            if (r0 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return r0
        L_0x000e:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113798hb.m157087e():java.lang.String");
    }

    /* renamed from: f */
    public static int m157089f() {
        m157064P();
        return f340485X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = f340470I;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m157090g() {
        /*
            com.tencent.mapsdk.internal.hb$a r0 = m157064P()
            boolean r0 = r0.f340519a
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = f340470I
            if (r0 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return r0
        L_0x000e:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113798hb.m157090g():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = f340473L;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m157091h() {
        /*
            com.tencent.mapsdk.internal.hb$a r0 = m157064P()
            boolean r0 = r0.f340519a
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = f340473L
            if (r0 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return r0
        L_0x000e:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113798hb.m157091h():java.lang.String");
    }

    /* renamed from: i */
    public static String m157092i() {
        m157064P();
        return f340463B;
    }

    /* renamed from: j */
    public static int m157093j() {
        if (m157064P().f340519a) {
            return 0;
        }
        return f340472K;
    }

    /* renamed from: k */
    public static String m157094k() {
        m157064P();
        String str = f340466E;
        return str == null ? "" : str;
    }

    /* renamed from: l */
    public static String m157095l() {
        m157064P();
        String str = f340518z;
        if (str != null && !TextUtils.isEmpty(str) && !str.equals(f340471J)) {
            return str;
        }
        String str2 = f340471J;
        return str2 == null ? "" : str2;
    }

    /* renamed from: m */
    public static String m157096m() {
        m157064P();
        return f340464C;
    }

    /* renamed from: n */
    public static float m157097n() {
        m157064P();
        return f340487Z;
    }

    /* renamed from: o */
    public static void m157098o() {
        f340511s = f340479R;
        f340512t = f340480S;
        f340510r = f340478Q;
        f340509q = f340477P;
    }

    /* renamed from: p */
    public static void m157099p() {
        f340462A = null;
        f340518z = null;
        f340517y = null;
    }

    /* renamed from: c */
    private static String m157084c(String str) {
        return Pattern.compile("[^a-zA-Z0-9]").matcher(str).replaceAll("").trim();
    }

    /* renamed from: b */
    private static String m157081b(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("&", "").replace("#", "").replace("?", "");
    }

    /* renamed from: d */
    private static String m157086d(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString(b & ExifInterface.MARKER));
                sb.append("");
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: e */
    private static String[] m157088e(String str) {
        String[] strArr = new String[3];
        try {
            JSONObject jSONObject = new JSONObject(str);
            strArr[0] = jSONObject.optString(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            strArr[1] = jSONObject.optString("data");
            strArr[2] = jSONObject.optString("otherDistrict");
        } catch (JSONException unused) {
        }
        return strArr;
    }

    /* renamed from: a */
    public static void m157073a(Context context, String str, String str2, String str3) {
        C113884kf.f340711d = f340495c;
        f340517y = str;
        f340518z = str2;
        f340474M = str3;
        if (f340485X == 0 && context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f340485X = displayMetrics.widthPixels * displayMetrics.heightPixels;
            if (Build.VERSION.SDK_INT < 24) {
                m157074a(displayMetrics);
            } else {
                f340486Y = displayMetrics.densityDpi;
                m157059K();
            }
        }
        if (f340473L == null) {
            try {
                String b = C113801hf.m157141b();
                f340473L = b;
                String b2 = m157081b(b);
                f340473L = b2;
                f340473L = URLEncoder.encode(b2, "utf-8");
            } catch (Exception unused) {
            }
        }
        if (f340472K == 0) {
            f340472K = Build.VERSION.SDK_INT;
        }
        if (f340471J == null) {
            try {
                String packageName = context.getPackageName();
                f340471J = packageName;
                String b3 = m157081b(packageName);
                f340471J = b3;
                f340471J = URLEncoder.encode(b3, "utf-8");
            } catch (Exception unused2) {
            }
        }
        if (f340465D == null) {
            try {
                String h = C113801hf.m157148h(context);
                f340465D = h;
                String b4 = m157081b(h);
                f340465D = b4;
                f340465D = URLEncoder.encode(b4, "utf-8");
            } catch (Exception unused3) {
            }
        }
        if (f340466E == null) {
            try {
                String e = C113801hf.m157145e(context);
                f340466E = e;
                String b5 = m157081b(e);
                f340466E = b5;
                f340466E = URLEncoder.encode(b5, "utf-8");
            } catch (Exception unused4) {
            }
        }
        if (f340467F == null) {
            try {
                String i = C113801hf.m157149i(context);
                f340467F = i;
                String b6 = m157081b(i);
                f340467F = b6;
                f340467F = URLEncoder.encode(b6, "utf-8");
            } catch (Exception unused5) {
            }
        }
        if (f340468G == null) {
            try {
                String f = C113801hf.m157146f(context);
                f340468G = f;
                String b7 = m157081b(f);
                f340468G = b7;
                f340468G = URLEncoder.encode(b7, "utf-8");
            } catch (Exception unused6) {
            }
        }
        if (TextUtils.isEmpty(f340469H)) {
            try {
                String g = C113801hf.m157147g(context);
                f340469H = g;
                String b8 = m157081b(g);
                f340469H = b8;
                f340469H = URLEncoder.encode(b8, "utf-8");
            } catch (Exception unused7) {
            }
        }
        if (f340470I == null) {
            try {
                String netTypeStr = NetUtil.getNetTypeStr(context);
                f340470I = netTypeStr;
                String b9 = m157081b(netTypeStr);
                f340470I = b9;
                f340470I = URLEncoder.encode(b9, "utf-8");
            } catch (Exception unused8) {
            }
        }
        if (f340516x == null) {
            try {
                String a = C113801hf.m157138a(context, "TencentMapSDK");
                f340516x = a;
                f340516x = URLEncoder.encode(a, "utf-8");
            } catch (Exception unused9) {
            }
        }
        if (f340475N == 1.0f) {
            f340475N = 320.0f / ((float) context.getResources().getDisplayMetrics().densityDpi);
        }
        f340487Z = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    private static void m157082b(DisplayMetrics displayMetrics) {
        f340486Y = displayMetrics.densityDpi;
        m157059K();
    }

    /* renamed from: b */
    private static String m157080b(Context context) {
        CharSequence charSequence;
        if (context == null) {
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo != null) {
            charSequence = applicationInfo.loadLabel(packageManager);
        } else {
            charSequence = "can't find app name";
        }
        try {
            return URLEncoder.encode(charSequence.toString(), "utf-8");
        } catch (Exception unused2) {
            return "can't find app name";
        }
    }

    /* renamed from: b */
    public static int m157079b(String str, String str2) {
        if (C40002he.m42805a(str2)) {
            return 1;
        }
        if (C40002he.m42805a(str)) {
            return -1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length;
        if (length > split2.length) {
            length = split2.length;
        }
        for (int i = 0; i < length; i++) {
            String str3 = split2[i];
            String str4 = split[i];
            if (TextUtils.isEmpty(str3)) {
                str3 = "0";
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = "0";
            }
            if (Integer.valueOf(str3).intValue() < Integer.valueOf(str4).intValue()) {
                return 1;
            }
            if (Integer.valueOf(str3).intValue() > Integer.valueOf(str4).intValue()) {
                return -1;
            }
        }
        if (split.length > split2.length) {
            return 1;
        }
        if (split.length == split2.length) {
            return 0;
        }
        return -1;
    }

    /* renamed from: a */
    public static String m157070a(String str, String str2) {
        String str3;
        String str4;
        String str5 = "";
        if (C40002he.m42805a(str)) {
            str = str5;
        }
        if (C40002he.m42805a(str2)) {
            str2 = str5;
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("key=");
        sb.append(m157068a());
        sb.append("&pid=");
        sb.append(m157095l());
        sb.append("&key2=");
        sb.append(str);
        sb.append("&pid2=");
        sb.append(str2);
        sb.append("&psv=");
        sb.append(m157094k());
        sb.append("&ver=");
        m157064P();
        sb.append(f340464C);
        sb.append("&pf=");
        m157064P();
        sb.append("androidsdk&hm=");
        sb.append(m157091h());
        sb.append("&suid=");
        sb.append(m157085d());
        sb.append("&os=");
        sb.append(m157093j());
        sb.append("&dip=");
        if (!m157064P().f340519a && (str4 = f340467F) != null) {
            str5 = str4;
        }
        sb.append(str5);
        sb.append("&nt=");
        sb.append(m157090g());
        sb.append("&channel=1&output=json");
        if (!TextUtils.isEmpty(f340474M)) {
            try {
                str3 = URLEncoder.encode(f340474M, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str3 = m157084c(f340474M);
            }
            sb.append("&cuid=");
            sb.append(str3);
            sb.append("&uuid=");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m157069a(String str) {
        StringBuilder sb = new StringBuilder(256);
        if (!TextUtils.isEmpty(f340468G)) {
            sb.append("&suid=");
            sb.append(m157085d());
        }
        if (!TextUtils.isEmpty(f340469H)) {
            sb.append("&duid=");
            sb.append(m157087e());
        }
        if (!TextUtils.isEmpty(f340471J)) {
            sb.append("&appid=");
            sb.append(m157095l());
        }
        String str2 = f340463B;
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&sdkver=");
            m157064P();
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("&ui=");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(f340474M)) {
            sb.append("&appsuid=");
            try {
                sb.append(URLEncoder.encode(f340474M, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                sb.append(m157084c(f340474M));
            }
            sb.append("&cuid=");
            sb.append(f340474M);
        }
        sb.append("&api_key=" + m157068a());
        return sb.toString();
    }

    /* renamed from: a */
    private static String m157071a(byte[] bArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toHexString(b & ExifInterface.MARKER));
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m157074a(DisplayMetrics displayMetrics) {
        Field field;
        try {
            field = displayMetrics.getClass().getField("densityDpi");
        } catch (NoSuchFieldException | SecurityException unused) {
            field = null;
        }
        if (field != null) {
            try {
                f340486Y = field.getInt(displayMetrics);
                m157059K();
            } catch (IllegalAccessException | IllegalArgumentException unused2) {
            }
        } else {
            m157060L();
        }
    }

    /* renamed from: a */
    private static void m157072a(Context context) {
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f340485X = displayMetrics.widthPixels * displayMetrics.heightPixels;
            if (Build.VERSION.SDK_INT < 24) {
                m157074a(displayMetrics);
                return;
            }
            f340486Y = displayMetrics.densityDpi;
            m157059K();
        }
    }

    /* renamed from: a */
    public static double m157066a(double d, double d2) {
        return (d * 6.698324247899813d) / Math.cos(d2 * f340492ad);
    }

    /* renamed from: a */
    private static boolean m157076a(Context context, byte[] bArr, String str) {
        int i;
        File fileStreamPath = context.getFileStreamPath("tecentmap");
        if (!fileStreamPath.exists()) {
            fileStreamPath.mkdirs();
        }
        String str2 = fileStreamPath.getPath() + "/" + str;
        if (TextUtils.isEmpty(str2)) {
            i = 0;
        } else {
            i = C113886kg.m157511a(bArr, new File(str2));
        }
        if (i == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static byte[] m157077a(Context context, String str) {
        File fileStreamPath = context.getFileStreamPath("tecentmap");
        InputStream b = C113886kg.m157521b(fileStreamPath.getPath() + "/" + str);
        byte[] b2 = C113886kg.m157522b(b);
        C113886kg.m157515a((Closeable) b);
        return b2;
    }

    /* renamed from: a */
    public static void m157075a(boolean z) {
        f340462A = new C113799a(z, (byte) 0);
    }
}
