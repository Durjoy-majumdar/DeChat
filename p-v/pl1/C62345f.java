package pl1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58741j5;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import rx3.C13601g;
import up1.C27696y;
import up1.C37521f;

/* renamed from: pl1.f */
public final class C62345f extends C11976a {

    /* renamed from: e */
    public final String f177199e;

    /* renamed from: f */
    public final String f177200f;

    /* renamed from: g */
    public final String f177201g;

    /* renamed from: h */
    public final C13601g f177202h;

    /* renamed from: pl1.f$a */
    public static final class C62346a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C62346a f177203d = new C62346a();

        public C62346a() {
            super(0);
        }

        public Object invoke() {
            try {
                return new JSONObject(C37521f.f99374d.mo61177d()).optString(FirebaseAnalytics.C113379b.MEDIUM, "132");
            } catch (Throwable th) {
                Log.m105921e("FinderAvatar", "mediumSizeUrl:", th);
                return "";
            }
        }
    }

    /* renamed from: pl1.f$b */
    public static final class C62347b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C62347b f177204d = new C62347b();

        public C62347b() {
            super(0);
        }

        public Object invoke() {
            try {
                return new JSONObject(C37521f.f99374d.mo61177d()).optString(FirebaseAnalytics.C113379b.ORIGIN, "0");
            } catch (Throwable th) {
                Log.m105921e("FinderAvatar", "originSizeUrl:", th);
                return "";
            }
        }
    }

    /* renamed from: pl1.f$c */
    public static final class C62348c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C62345f f177205d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62348c(C62345f fVar) {
            super(0);
            this.f177205d = fVar;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("finder_avatar_");
            String str = this.f177205d.f177199e;
            if (str == null) {
                str = "";
            }
            sb.append(MD5Util.getMD5String(str));
            return sb.toString();
        }
    }

    /* renamed from: pl1.f$d */
    public static final class C62349d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C62349d f177206d = new C62349d();

        public C62349d() {
            super(0);
        }

        public Object invoke() {
            try {
                return new JSONObject(C37521f.f99374d.mo61177d()).optString("small", "64");
            } catch (Throwable th) {
                Log.m105921e("FinderAvatar", "smallSizeUrl:", th);
                return "";
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (z04.C112551y.m153808h("/0", r7, false, 2, (java.lang.Object) null) == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62345f(java.lang.String r10, up1.C27696y r11) {
        /*
            r9 = this;
            java.lang.String r0 = "urlFormat"
            gy3.C87412m.m108594g(r11, r0)
            r9.<init>()
            r9.f177199e = r10
            pl1.f$a r0 = pl1.C62345f.C62346a.f177203d
            rx3.g r0 = rx3.C36568h.m40985a(r0)
            pl1.f$d r1 = pl1.C62345f.C62349d.f177206d
            rx3.g r1 = rx3.C36568h.m40985a(r1)
            pl1.f$b r2 = pl1.C62345f.C62347b.f177204d
            rx3.g r2 = rx3.C36568h.m40985a(r2)
            r3 = 0
            if (r10 == 0) goto L_0x008e
            java.lang.String r4 = "/0"
            r5 = 0
            r6 = 2
            boolean r7 = z04.C112551y.m153808h(r10, r4, r5, r6, r3)
            if (r7 != 0) goto L_0x002b
            goto L_0x0044
        L_0x002b:
            up1.y r7 = up1.C27696y.ORIGIN_AVATAR_IMAGE
            if (r11 != r7) goto L_0x0043
            r7 = r2
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "originSizeUrl"
            gy3.C87412m.m108593f(r7, r8)
            boolean r3 = z04.C112551y.m153808h(r4, r7, r5, r6, r3)
            if (r3 != 0) goto L_0x0044
        L_0x0043:
            r5 = 1
        L_0x0044:
            if (r5 == 0) goto L_0x008d
            int r11 = r11.ordinal()
            switch(r11) {
                case 42: goto L_0x0067;
                case 43: goto L_0x005e;
                case 44: goto L_0x0055;
                default: goto L_0x004d;
            }
        L_0x004d:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r11 = "Wrong url format"
            r10.<init>(r11)
            throw r10
        L_0x0055:
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r11 = r1.getValue()
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x006f
        L_0x005e:
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r11 = r0.getValue()
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x006f
        L_0x0067:
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r11 = r2.getValue()
            java.lang.String r11 = (java.lang.String) r11
        L_0x006f:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r0 != 0) goto L_0x008d
            int r0 = r10.length()
            int r0 = r0 + -1
            int r1 = r10.length()
            java.lang.String r2 = "targetFormatSuffix"
            gy3.C87412m.m108593f(r11, r2)
            java.lang.CharSequence r10 = z04.C112550d0.m153781Q(r10, r0, r1, r11)
            java.lang.String r10 = r10.toString()
        L_0x008d:
            r3 = r10
        L_0x008e:
            r9.f177200f = r3
            if (r3 != 0) goto L_0x0094
            java.lang.String r3 = ""
        L_0x0094:
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r3)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "finder_avatar_"
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.f177201g = r10
            pl1.f$c r10 = new pl1.f$c
            r10.<init>(r9)
            rx3.g r10 = rx3.C36568h.m40985a(r10)
            r9.f177202h = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pl1.C62345f.<init>(java.lang.String, up1.y):void");
    }

    /* renamed from: b */
    public String mo11841b() {
        return this.f177201g;
    }

    public String getDecodeKey() {
        return "";
    }

    public C27696y getMediaType() {
        return C27696y.THUMB_IMAGE;
    }

    public String getPath() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168190g + this.f177201g;
    }

    public String getThumbUrl() {
        String nullAsNil = Util.nullAsNil(this.f177200f);
        C87412m.m108593f(nullAsNil, "nullAsNil(url)");
        return nullAsNil;
    }

    public String getThumbUrlToken() {
        return "";
    }

    public String getUrl() {
        String nullAsNil = Util.nullAsNil(this.f177200f);
        C87412m.m108593f(nullAsNil, "nullAsNil(url)");
        return nullAsNil;
    }

    public String getUrlToken() {
        return "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C62345f(String str, C27696y yVar, int i, C8480h hVar) {
        this(str, (i & 2) != 0 ? C27696y.MEDIUM_AVATAR_IMAGE : yVar);
    }
}
