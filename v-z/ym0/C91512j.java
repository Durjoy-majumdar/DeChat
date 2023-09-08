package ym0;

import an0.C79592a;
import android.content.Context;
import android.net.Uri;
import bn0.C79723g;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dn0.C45428e;
import dn0.C86365j;
import dn0.C86368m;
import en0.C86586a;
import fn0.C87002g;
import ln0.C88600e;
import lu0.C88650c;
import p300c8.C79946g;

/* renamed from: ym0.j */
public class C91512j implements C91509g {

    /* renamed from: h */
    public static C91512j f262319h;

    /* renamed from: d */
    public boolean f262320d = false;

    /* renamed from: e */
    public boolean f262321e = true;

    /* renamed from: f */
    public boolean f262322f = false;

    /* renamed from: g */
    public C86365j f262323g = new C91513a();

    /* renamed from: ym0.j$a */
    public class C91513a implements C86365j {
        public C91513a() {
        }
    }

    /* renamed from: c */
    public static C91512j m114810c() {
        if (f262319h == null) {
            synchronized (C91512j.class) {
                if (f262319h == null) {
                    f262319h = new C91512j();
                }
            }
        }
        return f262319h;
    }

    /* renamed from: D */
    public long mo123036D(String str, long j, long j2) {
        if (!this.f262321e) {
            return C88600e.m110458f().mo123036D(str, j, j2);
        }
        try {
            return C86368m.m106993b().mo120758a(str);
        } catch (Exception e) {
            C87002g.m108023q(6, "MicroMsg.SameLayer.VideoCore", "getCachedBytes exception", e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085 A[Catch:{ all -> 0x00ae }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo125424a(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.VideoCore"
            java.lang.String r1 = a70.C112760b.m154195C()
            java.lang.String r2 = "/"
            boolean r3 = r1.endsWith(r2)
            if (r3 != 0) goto L_0x001d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
        L_0x001d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r2 = 0
            r3 = 1
            r4 = 0
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106461v(r1)     // Catch:{ all -> 0x00ae }
            if (r5 != 0) goto L_0x00a1
            java.lang.String r5 = "mkdirs fail 1, maybe dir exist:%s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ae }
            r6[r4] = r1     // Catch:{ all -> 0x00ae }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r5, r6)     // Catch:{ all -> 0x00ae }
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = r5.getPath()     // Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r4, r4)     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = r5.getPath()     // Catch:{ all -> 0x00ae }
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x00ae }
            if (r7 != 0) goto L_0x0065
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ all -> 0x00ae }
            android.net.Uri$Builder r5 = r5.path(r6)     // Catch:{ all -> 0x00ae }
            android.net.Uri r5 = r5.build()     // Catch:{ all -> 0x00ae }
        L_0x0065:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x00ae }
            com.tencent.mm.vfs.f0$h r5 = r6.mo177799l(r5, r2)     // Catch:{ all -> 0x00ae }
            boolean r6 = r5.mo177810a()     // Catch:{ all -> 0x00ae }
            if (r6 != 0) goto L_0x0072
            goto L_0x0082
        L_0x0072:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a     // Catch:{ all -> 0x00ae }
            java.lang.String r5 = r5.f348992b     // Catch:{ all -> 0x00ae }
            com.tencent.mm.vfs.b0 r5 = r6.mo119945q(r5)     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x0082
            boolean r5 = r5.f250476f     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x0082
            r5 = 1
            goto L_0x0083
        L_0x0082:
            r5 = 0
        L_0x0083:
            if (r5 != 0) goto L_0x00a1
            java.lang.String r5 = "mkdirs fail 2, not dir:%s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ae }
            r6[r4] = r1     // Catch:{ all -> 0x00ae }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r5, r6)     // Catch:{ all -> 0x00ae }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)     // Catch:{ all -> 0x00ae }
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106461v(r1)     // Catch:{ all -> 0x00ae }
            if (r5 != 0) goto L_0x00a1
            java.lang.String r9 = "mkdirs fail 3, no space? dir:%s"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ae }
            r5[r4] = r1     // Catch:{ all -> 0x00ae }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r9, r5)     // Catch:{ all -> 0x00ae }
            return r2
        L_0x00a1:
            java.lang.String r5 = "ensureDir %s:%s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ae }
            r6[r4] = r9     // Catch:{ all -> 0x00ae }
            r6[r3] = r1     // Catch:{ all -> 0x00ae }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r6)     // Catch:{ all -> 0x00ae }
            return r1
        L_0x00ae:
            r9 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r9
            java.lang.String r9 = "mkdirs exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ym0.C91512j.mo125424a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public String mo125425b(String str) {
        Uri parse = Uri.parse(str);
        String uri = parse.toString();
        if (str != null) {
            try {
                if (parse.getHost().equals("mpvideo.qpic.cn") && parse.getQueryParameter(TPReportKeys.Common.COMMON_VID) != null) {
                    uri = parse.getPath() + "_" + parse.getQueryParameter(TPReportKeys.Common.COMMON_VID);
                    String queryParameter = parse.getQueryParameter("format_id");
                    if (queryParameter != null) {
                        uri = uri + "_" + queryParameter;
                    }
                    Log.m105925i("MicroMsg.SameLayer.VideoCore", "[TRACE_VIDEO_PRELOAD] cachekey = %s", uri);
                }
            } catch (Exception unused) {
            }
        }
        return uri;
    }

    /* renamed from: d */
    public void mo125426d(Context context, boolean z, boolean z2, C86586a aVar, C45428e eVar) {
        if (this.f262320d) {
            Log.m105925i("MicroMsg.SameLayer.VideoCore", "init already, current enableProxy:%s", Boolean.valueOf(this.f262321e));
            return;
        }
        Log.m105925i("MicroMsg.SameLayer.VideoCore", "init, enableProxy:%s, enableHlsProxy:%s", Boolean.valueOf(z), Boolean.valueOf(z2));
        long nowMilliSecond = Util.nowMilliSecond();
        this.f262320d = true;
        this.f262322f = z2;
        this.f262321e = z;
        if (z) {
            String a = mo125424a("wxvideocache");
            if (Util.isNullOrNil(a)) {
                this.f262321e = false;
                Log.m105924i("MicroMsg.SameLayer.VideoCore", "init, disableProxy for cache dir make fail");
                ((C88650c) aVar).mo123093g(-1);
            } else {
                Context applicationContext = context.getApplicationContext();
                if (C79592a.f233397r == null) {
                    synchronized (C79592a.class) {
                        if (C79592a.f233397r == null) {
                            C79592a.f233397r = new C79592a(applicationContext);
                        }
                    }
                }
                C79592a.m96648a().f233399b = BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE;
                C79592a.m96648a().f233408k = 1048576;
                C79592a.m96648a().f233407j = 536870912;
                C79592a.m96648a().f233400c = true;
                C79592a.m96648a().f233401d = true;
                C79592a.m96648a().f233402e = true;
                C79592a.m96648a().f233403f = z2;
                C79592a.m96648a().f233404g = false;
                C79592a.m96648a().f233409l = 3;
                C79592a.m96648a().f233410m = new C91514k();
                C79592a.m96648a().f233413p = new C79723g();
                C79592a.m96648a().f233411n = aVar;
                C79592a.m96648a().f233414q = eVar;
                C79592a.m96648a().f233412o = this.f262323g;
                C79592a.m96648a().f233406i = a;
                C79592a.m96648a().f233405h = mo125424a("wxvideotmp");
                if (C86368m.f251099c == null) {
                    synchronized (C86368m.class) {
                        if (C86368m.f251099c == null) {
                            C86368m.f251099c = new C86368m();
                        }
                    }
                }
            }
        }
        Log.m105925i("MicroMsg.SameLayer.VideoCore", "init, costTimeMs:%s", Long.valueOf(Util.nowMilliSecond() - nowMilliSecond));
    }

    public String f00(String str) {
        if (!this.f262321e) {
            C88600e.m110458f().getClass();
            return str;
        }
        if (!Util.isNullOrNil(str)) {
            if (!(!Util.isNullOrNil(str) && str.startsWith("http://127.0.0.1"))) {
                try {
                    return C86368m.m106993b().f251100a.mo120766c(str, true, true, MimeTypes.VIDEO_MP4, 90);
                } catch (Exception e) {
                    C87002g.m108023q(6, "MicroMsg.SameLayer.VideoCore", "getProxyUrl exception", e);
                }
            }
        }
        return str;
    }

    /* renamed from: hU */
    public void mo123038hU(String str) {
        if (!this.f262321e) {
            C88600e.m110458f().mo123038hU(str);
        }
    }

    /* renamed from: pR */
    public C79946g.C79947a mo123039pR() {
        if (!this.f262321e) {
            return C88600e.m110458f().f255873e;
        }
        return null;
    }
}
