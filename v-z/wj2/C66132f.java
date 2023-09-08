package wj2;

import android.app.NotificationManager;
import android.os.Build;
import c30.C104289g;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import d03.C58010a;
import gk2.C59528a;
import gy3.C8480h;
import gy3.C87412m;
import ve3.C52824a1;
import ve3.C65685n0;

/* renamed from: wj2.f */
public class C66132f {

    /* renamed from: D */
    public static final C66133a f190074D = new C66133a((C8480h) null);

    /* renamed from: A */
    public String f190075A = "";

    /* renamed from: B */
    public String f190076B = "";

    /* renamed from: C */
    public boolean f190077C;

    /* renamed from: a */
    public C58010a f190078a;

    /* renamed from: b */
    public long f190079b;

    /* renamed from: c */
    public long f190080c;

    /* renamed from: d */
    public FinderObject f190081d;

    /* renamed from: e */
    public String f190082e;

    /* renamed from: f */
    public C65685n0 f190083f;

    /* renamed from: g */
    public long f190084g;

    /* renamed from: h */
    public String f190085h = "";

    /* renamed from: i */
    public String f190086i = "";

    /* renamed from: j */
    public String f190087j = "";

    /* renamed from: k */
    public String f190088k = "";

    /* renamed from: l */
    public String f190089l = "";

    /* renamed from: m */
    public C53183e f190090m = C53183e.UNKNOWN;

    /* renamed from: n */
    public boolean f190091n;

    /* renamed from: o */
    public long f190092o;

    /* renamed from: p */
    public String f190093p = "";

    /* renamed from: q */
    public int f190094q;

    /* renamed from: r */
    public C52824a1 f190095r;

    /* renamed from: s */
    public long f190096s;

    /* renamed from: t */
    public String f190097t = "";

    /* renamed from: u */
    public String f190098u = "";

    /* renamed from: v */
    public String f190099v = "";

    /* renamed from: w */
    public int f190100w;

    /* renamed from: x */
    public int f190101x;

    /* renamed from: y */
    public boolean f190102y;

    /* renamed from: z */
    public String f190103z = "";

    /* renamed from: wj2.f$a */
    public static final class C66133a {
        public C66133a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x0119 A[Catch:{ Exception -> 0x0123 }] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x011b A[Catch:{ Exception -> 0x0123 }] */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x011e A[Catch:{ Exception -> 0x0123 }] */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0136 A[Catch:{ Exception -> 0x0140 }] */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0138 A[Catch:{ Exception -> 0x0140 }] */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x013b A[Catch:{ Exception -> 0x0140 }] */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x0154 A[Catch:{ Exception -> 0x015e }] */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x0156 A[Catch:{ Exception -> 0x015e }] */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x0159 A[Catch:{ Exception -> 0x015e }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ Exception -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x004b A[Catch:{ Exception -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x004e A[Catch:{ Exception -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0067 A[Catch:{ Exception -> 0x0071 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[Catch:{ Exception -> 0x0071 }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x006c A[Catch:{ Exception -> 0x0071 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0085 A[Catch:{ Exception -> 0x008f }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0087 A[Catch:{ Exception -> 0x008f }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x008a A[Catch:{ Exception -> 0x008f }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00a3 A[Catch:{ Exception -> 0x00ad }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5 A[Catch:{ Exception -> 0x00ad }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8 A[Catch:{ Exception -> 0x00ad }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00c0 A[Catch:{ Exception -> 0x00ca }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00c2 A[Catch:{ Exception -> 0x00ca }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5 A[Catch:{ Exception -> 0x00ca }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00dd A[Catch:{ Exception -> 0x00e7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00df A[Catch:{ Exception -> 0x00e7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x00e2 A[Catch:{ Exception -> 0x00e7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x00f9 A[Catch:{ Exception -> 0x0103 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x00fb A[Catch:{ Exception -> 0x0103 }] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x00fe A[Catch:{ Exception -> 0x0103 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final d03.C58010a mo90184a(d03.C58010a r11, java.lang.String r12) {
            /*
                r10 = this;
                java.lang.String r0 = "safeGetBoolean"
                java.lang.String r1 = "safeGetInt"
                java.lang.String r2 = "safeGetString"
                java.lang.String r3 = ""
                java.lang.String r4 = "<this>"
                gy3.C87412m.m108594g(r11, r4)
                java.lang.String r11 = "json"
                gy3.C87412m.m108594g(r12, r11)
                d03.a r11 = new d03.a
                r11.<init>()
                c30.g r4 = new c30.g     // Catch:{ Exception -> 0x0168 }
                r4.<init>((java.lang.String) r12)     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "mediaId"
                r5 = 0
                r6 = 0
                r7 = 1
                boolean r8 = r4.has(r12)     // Catch:{ Exception -> 0x0035 }
                if (r8 != r7) goto L_0x002d
                r8 = 1
                goto L_0x002e
            L_0x002d:
                r8 = 0
            L_0x002e:
                if (r8 == 0) goto L_0x003d
                java.lang.String r12 = r4.getString(r12)     // Catch:{ Exception -> 0x0035 }
                goto L_0x003e
            L_0x0035:
                r12 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r8[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r8)     // Catch:{ Exception -> 0x0168 }
            L_0x003d:
                r12 = r5
            L_0x003e:
                r11.f165947s = r12     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "path"
                boolean r8 = r4.has(r12)     // Catch:{ Exception -> 0x0053 }
                if (r8 != r7) goto L_0x004b
                r8 = 1
                goto L_0x004c
            L_0x004b:
                r8 = 0
            L_0x004c:
                if (r8 == 0) goto L_0x005b
                java.lang.String r12 = r4.getString(r12)     // Catch:{ Exception -> 0x0053 }
                goto L_0x005c
            L_0x0053:
                r12 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r8[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r8)     // Catch:{ Exception -> 0x0168 }
            L_0x005b:
                r12 = r5
            L_0x005c:
                r11.f165948t = r12     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "url"
                boolean r8 = r4.has(r12)     // Catch:{ Exception -> 0x0071 }
                if (r8 != r7) goto L_0x0069
                r8 = 1
                goto L_0x006a
            L_0x0069:
                r8 = 0
            L_0x006a:
                if (r8 == 0) goto L_0x0079
                java.lang.String r12 = r4.getString(r12)     // Catch:{ Exception -> 0x0071 }
                goto L_0x007a
            L_0x0071:
                r12 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r8[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r8)     // Catch:{ Exception -> 0x0168 }
            L_0x0079:
                r12 = r5
            L_0x007a:
                r11.f165949u = r12     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "urlToken"
                boolean r8 = r4.has(r12)     // Catch:{ Exception -> 0x008f }
                if (r8 != r7) goto L_0x0087
                r8 = 1
                goto L_0x0088
            L_0x0087:
                r8 = 0
            L_0x0088:
                if (r8 == 0) goto L_0x0097
                java.lang.String r12 = r4.getString(r12)     // Catch:{ Exception -> 0x008f }
                goto L_0x0098
            L_0x008f:
                r12 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r8[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r8)     // Catch:{ Exception -> 0x0168 }
            L_0x0097:
                r12 = r5
            L_0x0098:
                r11.f165931c = r12     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "width"
                boolean r8 = r4.has(r12)     // Catch:{ Exception -> 0x00ad }
                if (r8 != r7) goto L_0x00a5
                r8 = 1
                goto L_0x00a6
            L_0x00a5:
                r8 = 0
            L_0x00a6:
                if (r8 == 0) goto L_0x00b5
                int r12 = r4.getInt(r12)     // Catch:{ Exception -> 0x00ad }
                goto L_0x00b6
            L_0x00ad:
                r12 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r8[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r8)     // Catch:{ Exception -> 0x0168 }
            L_0x00b5:
                r12 = 0
            L_0x00b6:
                r11.f165950v = r12     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "height"
                boolean r8 = r4.has(r12)     // Catch:{ Exception -> 0x00ca }
                if (r8 != r7) goto L_0x00c2
                r8 = 1
                goto L_0x00c3
            L_0x00c2:
                r8 = 0
            L_0x00c3:
                if (r8 == 0) goto L_0x00d2
                int r12 = r4.getInt(r12)     // Catch:{ Exception -> 0x00ca }
                goto L_0x00d3
            L_0x00ca:
                r12 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r8[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r8)     // Catch:{ Exception -> 0x0168 }
            L_0x00d2:
                r12 = 0
            L_0x00d3:
                r11.f165951w = r12     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "decodeKey"
                boolean r8 = r4.has(r12)     // Catch:{ Exception -> 0x00e7 }
                if (r8 != r7) goto L_0x00df
                r8 = 1
                goto L_0x00e0
            L_0x00df:
                r8 = 0
            L_0x00e0:
                if (r8 == 0) goto L_0x00ef
                java.lang.String r5 = r4.getString(r12)     // Catch:{ Exception -> 0x00e7 }
                goto L_0x00ef
            L_0x00e7:
                r12 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r8[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r8)     // Catch:{ Exception -> 0x0168 }
            L_0x00ef:
                r11.f165932d = r5     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "isLocal"
                boolean r2 = r4.has(r12)     // Catch:{ Exception -> 0x0103 }
                if (r2 != r7) goto L_0x00fb
                r2 = 1
                goto L_0x00fc
            L_0x00fb:
                r2 = 0
            L_0x00fc:
                if (r2 == 0) goto L_0x010b
                boolean r12 = r4.getBoolean(r12)     // Catch:{ Exception -> 0x0103 }
                goto L_0x010c
            L_0x0103:
                r12 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r2[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r3, r2)     // Catch:{ Exception -> 0x0168 }
            L_0x010b:
                r12 = 0
            L_0x010c:
                r11.f165933e = r12     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "videoDuration"
                r8 = 0
                boolean r2 = r4.has(r12)     // Catch:{ Exception -> 0x0123 }
                if (r2 != r7) goto L_0x011b
                r2 = 1
                goto L_0x011c
            L_0x011b:
                r2 = 0
            L_0x011c:
                if (r2 == 0) goto L_0x012b
                long r8 = r4.getLong(r12)     // Catch:{ Exception -> 0x0123 }
                goto L_0x012b
            L_0x0123:
                r12 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r2[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r2)     // Catch:{ Exception -> 0x0168 }
            L_0x012b:
                r11.f165935g = r8     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "rotate"
                boolean r2 = r4.has(r12)     // Catch:{ Exception -> 0x0140 }
                if (r2 != r7) goto L_0x0138
                r2 = 1
                goto L_0x0139
            L_0x0138:
                r2 = 0
            L_0x0139:
                if (r2 == 0) goto L_0x0148
                int r12 = r4.getInt(r12)     // Catch:{ Exception -> 0x0140 }
                goto L_0x0149
            L_0x0140:
                r12 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r2[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r2)     // Catch:{ Exception -> 0x0168 }
            L_0x0148:
                r12 = 0
            L_0x0149:
                r11.f165939k = r12     // Catch:{ Exception -> 0x0168 }
                java.lang.String r12 = "loop"
                boolean r1 = r4.has(r12)     // Catch:{ Exception -> 0x015e }
                if (r1 != r7) goto L_0x0156
                r1 = 1
                goto L_0x0157
            L_0x0156:
                r1 = 0
            L_0x0157:
                if (r1 == 0) goto L_0x0166
                boolean r6 = r4.getBoolean(r12)     // Catch:{ Exception -> 0x015e }
                goto L_0x0166
            L_0x015e:
                r12 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0168 }
                r1[r6] = r12     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r3, r1)     // Catch:{ Exception -> 0x0168 }
            L_0x0166:
                r11.f165940l = r6     // Catch:{ Exception -> 0x0168 }
            L_0x0168:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: wj2.C66132f.C66133a.mo90184a(d03.a, java.lang.String):d03.a");
        }

        /* renamed from: b */
        public final String mo90185b(C58010a aVar) {
            if (aVar == null) {
                return "{}";
            }
            C104289g gVar = new C104289g();
            gVar.put("mediaId", aVar.f165947s);
            gVar.put("path", aVar.f165948t);
            gVar.put("url", aVar.f165949u);
            gVar.put("urlToken", aVar.f165931c);
            gVar.mo145953n("width", aVar.f165950v);
            gVar.mo145953n("height", aVar.f165951w);
            gVar.put("decodeKey", aVar.f165932d);
            gVar.mo145966q("isLocal", aVar.f165933e);
            gVar.mo145954o("videoDuration", aVar.f165935g);
            gVar.mo145953n(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, aVar.f165939k);
            gVar.mo145966q("loop", aVar.f165940l);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "JSONObject().apply {\n   …\n            }.toString()");
            return gVar2;
        }
    }

    public C66132f() {
    }

    /* renamed from: a */
    public final boolean mo90170a() {
        Object systemService = MMApplicationContext.getContext().getSystemService("notification");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        try {
            if (notificationManager.getNotificationChannel(this.f190089l) == null) {
                z = false;
            }
            return z;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.TPMediaInfoDesc", "checkIfChannelValid fail:" + e.getLocalizedMessage());
            return false;
        }
    }

    /* renamed from: b */
    public final String mo90171b(Object obj) {
        String str;
        if (obj == null || (str = obj.toString()) == null) {
            str = "";
        }
        String escapeStringForXml = Util.escapeStringForXml(str);
        C87412m.m108593f(escapeStringForXml, "escapeStringForXml(this?.toString() ?: \"\")");
        return escapeStringForXml;
    }

    /* renamed from: c */
    public final long mo90172c() {
        if (mo90180k()) {
            return 1;
        }
        return mo90179j() ? 2 : 3;
    }

    /* renamed from: d */
    public final String mo90173d() {
        String unsignedLongString = Util.getUnsignedLongString(this.f190092o);
        C87412m.m108593f(unsignedLongString, "getUnsignedLongString(finderObjectId)");
        return unsignedLongString;
    }

    /* renamed from: e */
    public final String mo90174e() {
        long j = this.f190092o;
        if (j != 0) {
            String unsignedLongString = Util.getUnsignedLongString(j);
            C87412m.m108593f(unsignedLongString, "getUnsignedLongString(finderObjectId)");
            return unsignedLongString;
        }
        int i = this.f190094q;
        if (i != 0) {
            return String.valueOf(i);
        }
        String str = this.f190082e;
        return str == null ? "" : str;
    }

    /* renamed from: f */
    public final String mo90175f() {
        return this.f190085h;
    }

    /* renamed from: g */
    public final String mo90176g() {
        C58010a aVar = this.f190078a;
        String str = aVar != null ? aVar.f165947s : null;
        return str == null ? "" : str;
    }

    /* renamed from: h */
    public final String mo90177h() {
        C58010a aVar = this.f190078a;
        String str = aVar != null ? aVar.f165948t : null;
        return str == null ? "" : str;
    }

    /* renamed from: i */
    public final C59528a mo90178i() {
        C59528a aVar = new C59528a();
        C58010a aVar2 = this.f190078a;
        String str = null;
        aVar.f170150b = aVar2 != null ? aVar2.f165947s : null;
        C52824a1 a1Var = this.f190095r;
        if (a1Var != null) {
            str = a1Var.f147574d;
        }
        aVar.f170149a = str;
        return aVar;
    }

    /* renamed from: j */
    public final boolean mo90179j() {
        if (this.f190092o != 0) {
            if (this.f190093p.length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo90180k() {
        return this.f190094q != 0;
    }

    /* renamed from: l */
    public final void mo90181l(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f190085h = str;
    }

    /* renamed from: m */
    public final void mo90182m(boolean z) {
        this.f190077C = z;
        C58010a aVar = this.f190078a;
        if (aVar != null) {
            aVar.f165946r = z ? "A0" : "";
        }
    }

    /* renamed from: n */
    public final String mo90183n() {
        C104289g gVar = new C104289g();
        C58010a aVar = this.f190078a;
        gVar.put("mInfo", aVar != null ? f190074D.mo90185b(aVar) : "{}");
        gVar.mo145954o("mStartTime", this.f190079b);
        gVar.mo145954o("mEndTime", this.f190080c);
        gVar.put("mHashCode", this.f190082e);
        gVar.mo145954o("mDuration", this.f190084g);
        gVar.put("mShortSongName", this.f190086i);
        gVar.put("mSongName", this.f190085h);
        gVar.put("mSingerName", this.f190087j);
        gVar.put("cover", this.f190088k);
        gVar.put(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, this.f190089l);
        gVar.mo145953n("ringtoneSource", this.f190090m.ordinal());
        gVar.mo145954o("finderObjectId", this.f190092o);
        gVar.put("finderNonceId", this.f190093p);
        gVar.mo145953n("musicSid", this.f190094q);
        gVar.mo145966q("unAvailable", this.f190091n);
        gVar.put("finderAuthorHeadUrl", this.f190097t);
        gVar.put("finderAuthIconUrl", this.f190098u);
        gVar.put("finderAuthProfession", this.f190099v);
        gVar.mo145953n("finderAuthProfessionType", this.f190100w);
        gVar.mo145953n("authProfessionType", this.f190101x);
        C52824a1 a1Var = this.f190095r;
        gVar.put("mVibrateInfo", a1Var != null ? a1Var.f147574d : null);
        gVar.mo145954o("createTime", this.f190096s);
        gVar.put("singerFinderUserName", this.f190075A);
        gVar.put("singerBaikeURL", this.f190076B);
        gVar.put("finderUserName", this.f190103z);
        gVar.mo145966q("hasBgm", this.f190102y);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "JSONObject().apply {\n   …Bgm)\n        }.toString()");
        return gVar2;
    }

    public C66132f(C58010a aVar, long j, long j2) {
        C87412m.m108594g(aVar, "info");
        this.f190078a = aVar;
        this.f190079b = j;
        this.f190080c = j2;
    }
}
