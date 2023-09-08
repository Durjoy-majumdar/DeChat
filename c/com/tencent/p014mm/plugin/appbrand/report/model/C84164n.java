package com.tencent.p014mm.plugin.appbrand.report.model;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.C84241t;
import com.tencent.p014mm.plugin.appbrand.report.model.C84153l;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Set;
import js0.C88024r;
import p1044ub.C90630c;
import p963fc.C86812g;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.n */
public final class C84164n {

    /* renamed from: C */
    public static final C84164n f245711C = new C84164n(true, (C84153l) null);

    /* renamed from: A */
    public String f245712A;

    /* renamed from: B */
    public long f245713B;

    /* renamed from: a */
    public final boolean f245714a;

    /* renamed from: b */
    public final C84153l f245715b;

    /* renamed from: c */
    public boolean f245716c = false;

    /* renamed from: d */
    public int f245717d;

    /* renamed from: e */
    public String f245718e;

    /* renamed from: f */
    public String f245719f;

    /* renamed from: g */
    public String f245720g;

    /* renamed from: h */
    public AppBrandRuntime f245721h;

    /* renamed from: i */
    public int f245722i;

    /* renamed from: j */
    public int f245723j;

    /* renamed from: k */
    public int f245724k;

    /* renamed from: l */
    public String f245725l;

    /* renamed from: m */
    public String f245726m;

    /* renamed from: n */
    public long f245727n;

    /* renamed from: o */
    public long f245728o;

    /* renamed from: p */
    public String f245729p;

    /* renamed from: q */
    public int f245730q;

    /* renamed from: r */
    public String f245731r;

    /* renamed from: s */
    public long f245732s;

    /* renamed from: t */
    public int f245733t;

    /* renamed from: u */
    public int f245734u;

    /* renamed from: v */
    public String f245735v;

    /* renamed from: w */
    public int f245736w;

    /* renamed from: x */
    public String f245737x;

    /* renamed from: y */
    public int f245738y;

    /* renamed from: z */
    public int f245739z;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.n$a */
    public class C84165a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Object[] f245740d;

        public C84165a(C84164n nVar, Object[] objArr) {
            this.f245740d = objArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r10.f245740d[19] = "";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.nullAsNil("").length() > 1024) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
            r10.f245740d[19] = "".substring(0, 1024);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c3, code lost:
            r1 = (java.lang.String) r10.f245740d[19];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(r1).length() > 1024) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
            r10.f245740d[19] = r1.substring(0, 1024);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00db, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                java.lang.String r0 = ""
                java.lang.Class<hr0.b> r1 = hr0.C87584b.class
                r2 = 1
                ra.d r1 = p224ra.C89909e.m112439d(r1, r2)
                hr0.b r1 = (hr0.C87584b) r1
                java.lang.String r3 = "MicroMsg.AppBrand.Report.kv_13536"
                if (r1 != 0) goto L_0x0016
                java.lang.String r0 = "report get null kvReporter"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                return
            L_0x0016:
                r4 = 0
                r5 = 1024(0x400, float:1.435E-42)
                r6 = 19
                java.lang.Object[] r7 = r10.f245740d     // Catch:{ Exception -> 0x005d }
                r7 = r7[r6]     // Catch:{ Exception -> 0x005d }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x005d }
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x005d }
                if (r8 != 0) goto L_0x0042
                r8 = 63
                int r8 = r7.indexOf(r8)     // Catch:{ Exception -> 0x005d }
                if (r8 >= 0) goto L_0x0031
                r2 = r0
                goto L_0x003e
            L_0x0031:
                int r8 = r8 + r2
                int r2 = r7.length()     // Catch:{ Exception -> 0x005d }
                java.lang.String r2 = r7.substring(r8, r2)     // Catch:{ Exception -> 0x005d }
                java.lang.String r2 = p206nj.C117627q.m165908a(r2)     // Catch:{ Exception -> 0x005d }
            L_0x003e:
                java.lang.Object[] r7 = r10.f245740d     // Catch:{ Exception -> 0x005d }
                r7[r6] = r2     // Catch:{ Exception -> 0x005d }
            L_0x0042:
                java.lang.Object[] r0 = r10.f245740d
                r0 = r0[r6]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
                int r2 = r2.length()
                if (r2 <= r5) goto L_0x0073
                java.lang.String r0 = r0.substring(r4, r5)
                java.lang.Object[] r2 = r10.f245740d
                r2[r6] = r0
                goto L_0x0073
            L_0x005b:
                r0 = move-exception
                goto L_0x00c3
            L_0x005d:
                java.lang.Object[] r2 = r10.f245740d     // Catch:{ all -> 0x005b }
                r2[r6] = r0     // Catch:{ all -> 0x005b }
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
                int r2 = r2.length()
                if (r2 <= r5) goto L_0x0073
                java.lang.String r0 = r0.substring(r4, r5)
                java.lang.Object[] r2 = r10.f245740d
                r2[r6] = r0
            L_0x0073:
                r0 = 3
                int[] r2 = new int[r0]
                r2 = {1, 11, 13} // fill-array
                r6 = 0
            L_0x007a:
                if (r6 >= r0) goto L_0x0099
                r7 = r2[r6]
                java.lang.Object[] r8 = r10.f245740d
                r8 = r8[r7]
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
                int r9 = r9.length()
                if (r9 <= r5) goto L_0x0096
                java.lang.String r8 = r8.substring(r4, r5)
                java.lang.Object[] r9 = r10.f245740d
                r9[r7] = r8
            L_0x0096:
                int r6 = r6 + 1
                goto L_0x007a
            L_0x0099:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "report "
                r0.append(r2)
                java.lang.Object[] r2 = r10.f245740d
                java.lang.String r2 = java.util.Arrays.deepToString(r2)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                r0 = 13536(0x34e0, float:1.8968E-41)
                java.lang.Object[] r2 = r10.f245740d
                java.lang.Object[] r2 = com.tencent.p014mm.plugin.appbrand.report.C68632h0.m80873a(r2)
                r1.mo121691h(r0, r2)
                r1.mo121692i()
                return
            L_0x00c3:
                java.lang.Object[] r1 = r10.f245740d
                r1 = r1[r6]
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                int r2 = r2.length()
                if (r2 <= r5) goto L_0x00db
                java.lang.String r1 = r1.substring(r4, r5)
                java.lang.Object[] r2 = r10.f245740d
                r2[r6] = r1
            L_0x00db:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.model.C84164n.C84165a.run():void");
        }
    }

    public C84164n(boolean z, C84153l lVar) {
        this.f245714a = z;
        this.f245715b = lVar;
    }

    /* renamed from: a */
    public final void mo116836a(AppBrandRuntime appBrandRuntime, C90630c cVar) {
        C84153l.C84156c cVar2;
        C84153l.C84157d dVar;
        C90988l d0 = appBrandRuntime.mo113051d0();
        if (d0 != null) {
            this.f245722i = d0.f261072r.pkgVersion;
        }
        ICommLibReader k = cVar.mo114272k();
        if (k != null) {
            this.f245733t = k.mo113371a();
        }
        this.f245732s = cVar.f260370X0.f245636e;
        this.f245727n = Math.max(0, cVar.f260370X0.f245637f);
        this.f245728o = cVar.f260370X0.mo116801c();
        C84139c cVar3 = cVar.f260370X0;
        if (cVar3 instanceof C84146i) {
            C84146i iVar = (C84146i) cVar3;
            this.f245713B = iVar.mo116817b();
            this.f245725l = iVar.mo116816a() == null ? cVar.mo116162Q0() : iVar.mo116816a();
        } else {
            this.f245725l = cVar.mo116162Q0();
        }
        this.f245737x = cVar.mo116163R0();
        this.f245726m = C84116i0.m103659b(MMApplicationContext.getContext());
        AppBrandStatObject n1 = ((C86812g) appBrandRuntime).mo121253n1();
        this.f245724k = n1 != null ? n1.f245535h : 0;
        C84153l.C84155b o = this.f245715b.mo116807o(cVar);
        String str = null;
        if (o != null) {
            C84153l.C84157d dVar2 = o.f245691c;
            cVar2 = o.f245692d;
            dVar = dVar2;
        } else if (appBrandRuntime.f238117P) {
            C83231l.C83235e d = C83231l.m102143d(cVar.getAppId());
            Log.m105925i("MicroMsg.AppBrand.Report.kv_13536", "visitNode (%s) not found, runtime.isFinishing=TRUE, pauseType=%s, maybe closed by user in LoadingSplash", cVar.mo116163R0(), d);
            int ordinal = d.ordinal();
            dVar = ordinal != 0 ? ordinal != 1 ? null : new C84153l.C84157d(5, (String) null) : new C84153l.C84157d(4, (String) null);
            cVar2 = null;
        } else {
            Log.m105921e("MicroMsg.AppBrand.Report.kv_13536", "visitNode (%s) not found, maybe page switching to quickly", cVar.mo116163R0());
            dVar = null;
            cVar2 = null;
        }
        this.f245730q = dVar == null ? 0 : dVar.f245694a;
        this.f245731r = dVar == null ? null : dVar.f245695b;
        if (cVar2 != null) {
            str = cVar2.f245693a;
        }
        this.f245729p = str;
        this.f245736w = this.f245715b.mo116806i(this.f245737x) ? 1 : 0;
        AppBrandInitConfigLU appBrandInitConfigLU = (AppBrandInitConfigLU) appBrandRuntime.mo113036W();
        if (appBrandInitConfigLU != null) {
            this.f245738y = appBrandInitConfigLU.f234841u;
            this.f245739z = appBrandInitConfigLU.f234835p;
        } else {
            int b = C84241t.m103848b(this.f245720g);
            this.f245738y = b;
            Log.m105925i("MicroMsg.AppBrand.Report.kv_13536", "prepareCommonFields null = initConfig! apptype:%s", Integer.valueOf(b));
        }
        this.f245738y += 1000;
        String str2 = C84072q1.m103587b(cVar.getAppId()).f245465i;
        if (!Util.isNullOrNil(str2)) {
            this.f245712A = str2;
        }
    }

    /* renamed from: b */
    public final void mo116837b() {
        if (!this.f245714a) {
            C84165a aVar = new C84165a(this, new Object[]{Integer.valueOf(this.f245717d), this.f245718e, this.f245719f, this.f245720g, Integer.valueOf(this.f245722i), Integer.valueOf(this.f245723j), Integer.valueOf(this.f245724k), this.f245725l, this.f245726m, Long.valueOf(this.f245727n), Long.valueOf(this.f245728o), this.f245729p, Integer.valueOf(this.f245730q), this.f245731r, Long.valueOf(this.f245732s), Integer.valueOf(this.f245733t), Integer.valueOf(this.f245734u), this.f245735v, Integer.valueOf(this.f245736w), this.f245737x, Integer.valueOf(this.f245738y), Integer.valueOf(this.f245739z), this.f245712A, null, Long.valueOf(this.f245713B)});
            if (this.f245716c) {
                aVar.run();
                return;
            }
            Set<Object> set = C84737f0.f247137a;
            C88024r.m109571a().postToWorker(aVar);
        }
    }

    public String toString() {
        return "kv_13536{scene=" + this.f245717d + ", sceneNote='" + this.f245718e + '\'' + ", sessionId='" + this.f245719f + '\'' + ", appId='" + this.f245720g + '\'' + ", appVersion=" + this.f245722i + ", appState=" + this.f245723j + ", usedState=" + this.f245724k + ", pagePath='" + this.f245725l + '\'' + ", networkType='" + this.f245726m + '\'' + ", costTime=" + this.f245727n + ", stayTime=" + this.f245728o + ", referPagePath='" + this.f245729p + '\'' + ", targetAction=" + this.f245730q + ", targetPagePath='" + this.f245731r + '\'' + ", clickTimestamp=" + this.f245732s + ", publicLibVersion=" + this.f245733t + ", preScene=" + this.f245734u + ", preSceneNote='" + this.f245735v + '\'' + ", isEntrance=" + this.f245736w + ", apptype=" + this.f245738y + ", systemRecentsReason=" + this.f245739z + ", referAction=" + this.f245712A + ", manufacturerAppId=" + null + ", stayTimeFuncPageStart=" + this.f245713B + '}';
    }
}
