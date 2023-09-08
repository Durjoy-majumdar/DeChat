package n13;

import a12.C79450b;
import a70.C79471a;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.text.TextUtils;
import b12.C79645d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80590e1;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.p064hp.mmdiff.MMDiffPatchResultService;
import com.tencent.p014mm.plugin.p064hp.tinker.TinkerPatchResultService;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44563k0;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import ev3.C86700b;
import ex3.C86702a;
import gy3.C24564k0;
import gy3.C87412m;
import hv3.C87598a;
import iv3.C87821a;
import java.io.File;
import java.util.HashMap;
import kj2.C117407d;
import nd3.C47223a;
import p1054vg.C90793a;
import p910lj.C76701a;
import p918s2.C90116e;
import qo3.C47883u;
import v02.C90737d;
import w02.C90878b;
import w02.C90879c;
import w02.C90882e;
import w02.C90884g;
import zt3.C119157j;

/* renamed from: n13.b */
public final class C88880b {

    /* renamed from: a */
    public static final C88880b f256362a = new C88880b();

    /* renamed from: b */
    public static final HashMap<Long, Long> f256363b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, Boolean> f256364c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<Long, String> f256365d = new HashMap<>();

    /* renamed from: e */
    public static C88874a f256366e;

    /* renamed from: n13.b$a */
    public static final class C88881a implements C86702a {

        /* renamed from: a */
        public final /* synthetic */ TinkerSyncResponse f256367a;

        public C88881a(TinkerSyncResponse tinkerSyncResponse) {
            this.f256367a = tinkerSyncResponse;
        }

        /* renamed from: a */
        public final void mo121089a(C87598a aVar) {
            TinkerPatchResultService.f248331e = null;
            C88880b bVar = C88880b.f256362a;
            Log.m105925i("MicroMsg.Updater.ManualUpdaterProcessor", "patchResult costTime: %s, path: %s, isSuccess: %b", Long.valueOf(aVar.f253685f), aVar.f253684e, Boolean.valueOf(aVar.f253683d));
            if (aVar.f253683d) {
                C88880b.m110962i(this.f256367a);
                return;
            }
            C117407d.INSTANCE.idkeyStat(1429, 24, 1, false);
            C88880b.f256362a.mo123268k();
        }
    }

    /* renamed from: n13.b$b */
    public static final class C88882b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TinkerSyncResponse f256368d;

        /* renamed from: e */
        public final /* synthetic */ C86009m1 f256369e;

        /* renamed from: n13.b$b$a */
        public static final class C88883a implements C90884g {

            /* renamed from: a */
            public final /* synthetic */ TinkerSyncResponse f256370a;

            /* renamed from: b */
            public final /* synthetic */ String f256371b;

            /* renamed from: n13.b$b$a$a */
            public static final class C88884a implements Runnable {

                /* renamed from: d */
                public static final C88884a f256372d = new C88884a();

                public final void run() {
                    C88880b.m110961c();
                }
            }

            public C88883a(TinkerSyncResponse tinkerSyncResponse, String str) {
                this.f256370a = tinkerSyncResponse;
                this.f256371b = str;
            }

            /* renamed from: a */
            public final void mo123270a(C90878b bVar) {
                MMDiffPatchResultService.f248323e = null;
                int i = bVar.f260856e;
                C79645d.m96728d(this.f256370a, i);
                C79645d.m96745u();
                C79645d.m96729e();
                C88880b bVar2 = C88880b.f256362a;
                Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "HdiffApk merge finish, maunal retCode = " + i);
                if (bVar.f260855d) {
                    C88880b bVar3 = C88880b.f256362a;
                    String str = this.f256371b;
                    C87412m.m108593f(str, "newApkMd5");
                    if (!bVar3.mo123263d(str)) {
                        bVar3.mo123268k();
                        C117407d.INSTANCE.idkeyStat(1429, 19, 1, false);
                        return;
                    }
                    C90737d.m113803k(114);
                    C115669n.INSTANCE.idkeyStat(614, 114, 1, false);
                    ((C119157j) C119157j.f356862d).mo183895z(C88884a.f256372d);
                    return;
                }
                C88880b.f256362a.mo123268k();
                C117407d.INSTANCE.idkeyStat(1429, 18, 1, false);
            }
        }

        public C88882b(TinkerSyncResponse tinkerSyncResponse, C86009m1 m1Var) {
            this.f256368d = tinkerSyncResponse;
            this.f256369e = m1Var;
        }

        public final void run() {
            TinkerSyncResponse tinkerSyncResponse = this.f256368d;
            tinkerSyncResponse.f248353v = false;
            C79645d.m96726b(tinkerSyncResponse);
            ((C90882e) C90879c.m113993a(MMApplicationContext.getContext()).f260860b).mo124981a(this.f256369e.mo119971i(), this.f256368d, false);
            String str = this.f256368d.f248346o;
            C88880b bVar = C88880b.f256362a;
            Log.m105925i("MicroMsg.Updater.ManualUpdaterProcessor", "newApkMd5 = %s", str);
            MMDiffPatchResultService.f248323e = new C88883a(this.f256368d, str);
        }
    }

    /* renamed from: n13.b$c */
    public static final class C88885c implements Runnable {

        /* renamed from: d */
        public static final C88885c f256373d = new C88885c();

        public final void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f361242ig0, 0).show();
        }
    }

    /* renamed from: n13.b$d */
    public static final class C88886d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TinkerSyncResponse f256374d;

        /* renamed from: n13.b$d$a */
        public static final class C88887a implements C47883u {

            /* renamed from: a */
            public static final C88887a f256375a = new C88887a();

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                C88880b bVar = C88880b.f256362a;
                Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "hotPatchInstallSuccessDialog click " + z);
                if (z && C85623c.f249568a != null) {
                    MMAppMgr.m85985e(MMApplicationContext.getContext(), true);
                }
            }
        }

        /* renamed from: n13.b$d$b */
        public static final class C88888b implements DialogInterface.OnDismissListener {

            /* renamed from: d */
            public static final C88888b f256376d = new C88888b();

            public final void onDismiss(DialogInterface dialogInterface) {
                C88880b.m110961c();
            }
        }

        public C88886d(TinkerSyncResponse tinkerSyncResponse) {
            this.f256374d = tinkerSyncResponse;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                qo3.q r0 = new qo3.q
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r0.<init>(r1)
                n13.b r1 = n13.C88880b.f256362a
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                com.tencent.mm.plugin.hp.util.TinkerSyncResponse r3 = r6.f256374d
                int r3 = r3.f248345n
                long r3 = (long) r3
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getSizeMB(r3)
                java.lang.String r4 = "getSizeMB(response.fileSize.toLong())"
                gy3.C87412m.m108593f(r3, r4)
                r4 = 0
                r2[r4] = r3
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.Object[] r5 = new java.lang.Object[r1]
                r5[r4] = r2
                r2 = 2131838218(0x7f11450a, float:1.9309653E38)
                java.lang.String r2 = r3.getString(r2, r5)
                java.lang.String r3 = "getContext().getString(resId, args)"
                gy3.C87412m.m108593f(r2, r3)
                r0.mo107595g(r2)
                n13.b$d$a r2 = n13.C88880b.C88886d.C88887a.f256375a
                r0.mo107590b(r2)
                n13.b$d$b r2 = n13.C88880b.C88886d.C88888b.f256376d
                r0.mo107593e(r2)
                r0.mo107589a(r1)
                r0.mo107603o()
                java.lang.String r0 = "MicroMsg.Updater.ManualUpdaterProcessor"
                java.lang.String r1 = "hotPatchInstallSuccessDialog show"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n13.C88880b.C88886d.run():void");
        }
    }

    /* renamed from: n13.b$e */
    public static final class C88889e implements Runnable {

        /* renamed from: d */
        public static final C88889e f256377d = new C88889e();

        public final void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) C88880b.f256362a.mo123265f(C0966R.string.k7m), 1).show();
            C88880b.m110961c();
        }
    }

    /* renamed from: b */
    public static final void m110960b() {
        Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "cancelNotification, hdiff");
        Object systemService = MMApplicationContext.getContext().getSystemService("notification");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(9342);
    }

    /* renamed from: c */
    public static final void m110961c() {
        Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "cancelNotification");
        Object systemService = MMApplicationContext.getContext().getSystemService("notification");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(8341);
    }

    /* renamed from: i */
    public static final void m110962i(TinkerSyncResponse tinkerSyncResponse) {
        C87412m.m108594g(tinkerSyncResponse, "response");
        m110961c();
        C117407d.INSTANCE.idkeyStat(1429, 23, 1, false);
        ((C119157j) C119157j.f356862d).mo183895z(new C88886d(tinkerSyncResponse));
    }

    /* renamed from: j */
    public static final void m110963j(String str, String str2, PendingIntent pendingIntent) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, MimeTypes.BASE_TYPE_TEXT);
        Log.m105925i("MicroMsg.Updater.ManualUpdaterProcessor", "showNotification, title = %s, text = %s", str, str2);
        C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
        cVar.mo124390o((CharSequence) null);
        cVar.mo124384i(16, true);
        cVar.f258814z.when = System.currentTimeMillis();
        cVar.mo124383h(str);
        cVar.mo124382g(str2);
        cVar.f258795g = pendingIntent;
        cVar.f258814z.icon = C0966R.C0969drawable.c9k;
        Notification b = cVar.mo124378b();
        C87412m.m108593f(b, "getNotificationBuilder(M…ficationIconRs()).build()");
        Object systemService = MMApplicationContext.getContext().getSystemService("notification");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(8341, b);
    }

    /* renamed from: a */
    public final void mo123262a(String str, TinkerSyncResponse tinkerSyncResponse) {
        String str2 = str;
        ShareSecurityCheck shareSecurityCheck = new ShareSecurityCheck(MMApplicationContext.getContext());
        boolean z = false;
        try {
            z = shareSecurityCheck.verifyPatchMetaSignature(new File(C86013q1.m106448i(str2, false)));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Updater.ManualUpdaterProcessor", e, "verifyPatchMetaSignature", new Object[0]);
        }
        if (!z) {
            mo123268k();
            C117407d.INSTANCE.idkeyStat(1429, 17, 1, false);
            Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "hot patch verfiy signature error");
        } else if (C80590e1.C28678b.f78659a.mo112297a()) {
            HashMap<String, String> packagePropertiesIfPresent = shareSecurityCheck.getPackagePropertiesIfPresent();
            if (packagePropertiesIfPresent != null) {
                String str3 = packagePropertiesIfPresent.get("patch.client.ver");
                if (!TextUtils.isEmpty(str3)) {
                    C79450b bVar = new C79450b(C79471a.f233015c, str3);
                    bVar.mo109428f(bVar.mo109423a(2));
                } else {
                    Log.m105920e("MicroMsg.Updater.ManualUpdaterProcessor", "Fail to get patch clientversion.");
                }
            }
            TinkerPatchResultService.f248331e = new C88881a(tinkerSyncResponse);
            int a = ((C86700b) C87821a.m109275c(MMApplicationContext.getContext()).f254230c).mo121088a(str2);
            Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "start to run patch. ret = " + a);
            if (a == -6) {
                m110962i(tinkerSyncResponse);
                C117407d.INSTANCE.idkeyStat(1429, 30, 1, false);
            } else if (a == -3 || a == 0) {
                C117407d.INSTANCE.idkeyStat(1429, 22, 1, false);
            } else {
                mo123268k();
                C117407d.INSTANCE.idkeyStat(1429, 21, 1, false);
            }
        } else {
            mo123268k();
            C117407d.INSTANCE.idkeyStat(1429, 20, 1, false);
            Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "patch applying is blocked by TinkerEnsuranceOnFault, update basepack with different clientversion to recover.");
        }
    }

    /* renamed from: d */
    public final boolean mo123263d(String str) {
        Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "HdiffApk checkAndShowInstallPatchDialog, newApkMd5 = " + str);
        String l = C79645d.m96736l(str);
        if (!C86013q1.m106450k(l) || !C90793a.m113860a(l) || !C79645d.m96738n(l)) {
            return false;
        }
        Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "checkAndShowInstallPatchDialog apk ready " + l);
        C44563k0.m48979d(MMApplicationContext.getContext(), l, (C47223a) null, false);
        C117407d.INSTANCE.idkeyStat(1429, 5, 1, false);
        return true;
    }

    /* renamed from: e */
    public final void mo123264e(C86009m1 m1Var, long j, TinkerSyncResponse tinkerSyncResponse) {
        C87412m.m108594g(m1Var, "patchFile");
        C87412m.m108594g(tinkerSyncResponse, "response");
        String str = f256365d.get(Long.valueOf(j));
        if (str != null) {
            HashMap<String, Boolean> hashMap = f256364c;
            if (hashMap.get(str) != null) {
                Boolean bool = hashMap.get(str);
                C87412m.m108591d(bool);
                if (!bool.booleanValue()) {
                    return;
                }
            }
        }
        C24564k0.m30739c(f256364c).remove(str);
        C117407d.INSTANCE.idkeyStat(1429, 8, 1, false);
        ((C119157j) C119157j.f356862d).mo183876g(new C88882b(tinkerSyncResponse, m1Var), "Updater");
    }

    /* renamed from: f */
    public final String mo123265f(int i) {
        String string = MMApplicationContext.getContext().getString(i);
        C87412m.m108593f(string, "getContext().getString(resId)");
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ab, code lost:
        r0 = r0.f348991a.mo119945q(r0.f348992b);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123266g(com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse r25) {
        /*
            r24 = this;
            r7 = r25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "prepare to download fileMd5:"
            r0.append(r1)
            java.lang.String r1 = r7.f248343i
            r0.append(r1)
            java.lang.String r1 = " fileSize:"
            r0.append(r1)
            int r1 = r7.f248345n
            r0.append(r1)
            java.lang.String r1 = " cdnUrl:"
            r0.append(r1)
            java.lang.String r1 = r7.f248342h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "MicroMsg.Updater.ManualUpdaterProcessor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.String r0 = p206nj.C88956h.m111062c()
            java.lang.String r1 = "mounted"
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            java.lang.String r1 = "response.packageType"
            r2 = 10
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "no sdcard."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            kj2.d r9 = kj2.C117407d.INSTANCE
            r10 = 1429(0x595, double:7.06E-321)
            r12 = 9
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            java.lang.Integer r0 = r7.f248340f
            gy3.C87412m.m108593f(r0, r1)
            int r0 = r0.intValue()
            r1 = 103(0x67, float:1.44E-43)
            v02.C90737d.m113801i(r2, r0, r1)
            return
        L_0x0061:
            java.lang.Integer r0 = r7.f248340f
            r3 = 0
            r5 = 0
            r9 = 4
            r10 = 1
            r11 = 0
            if (r0 != 0) goto L_0x006c
            goto L_0x00c1
        L_0x006c:
            int r0 = r0.intValue()
            if (r0 != r9) goto L_0x00c1
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = b12.C79645d.m96733i(r0)
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r6 = r0.getPath()
            if (r6 == 0) goto L_0x009e
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r5, r5)
            java.lang.String r12 = r0.getPath()
            boolean r12 = r12.equals(r6)
            if (r12 != 0) goto L_0x009e
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r6)
            android.net.Uri r0 = r0.build()
        L_0x009e:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r0 = r6.mo177799l(r0, r11)
            boolean r6 = r0.mo177810a()
            if (r6 != 0) goto L_0x00ab
            goto L_0x00b5
        L_0x00ab:
            com.tencent.mm.vfs.FileSystem$c r6 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            com.tencent.mm.vfs.b0 r0 = r6.mo119945q(r0)
            if (r0 != 0) goto L_0x00b7
        L_0x00b5:
            r12 = r3
            goto L_0x00b9
        L_0x00b7:
            long r12 = r0.f250473c
        L_0x00b9:
            long r14 = (long) r9
            long r12 = r12 * r14
            boolean r0 = p206nj.C88955f.m111059c(r12)
            goto L_0x00c8
        L_0x00c1:
            int r0 = r7.f248345n
            long r12 = (long) r0
            boolean r0 = p206nj.C88955f.m111059c(r12)
        L_0x00c8:
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x0102
            java.lang.String r0 = "sdcard is full."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            zt3.t r0 = zt3.C119157j.f356862d
            n13.b$c r3 = n13.C88880b.C88885c.f256373d
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r3)
            kj2.d r8 = kj2.C117407d.INSTANCE
            r9 = 1429(0x595, double:7.06E-321)
            r11 = 10
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 614(0x266, double:3.034E-321)
            r19 = 55
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            java.lang.Integer r0 = r7.f248340f
            gy3.C87412m.m108593f(r0, r1)
            int r0 = r0.intValue()
            r1 = 104(0x68, float:1.46E-43)
            v02.C90737d.m113801i(r2, r0, r1)
            return
        L_0x0102:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            b12.C79645d.m96730f(r0)
            zt3.t r0 = zt3.C119157j.f356862d
            b12.c r1 = new b12.c
            r1.<init>()
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r1)
            com.tencent.mm.plugin.downloader.model.n r0 = new com.tencent.mm.plugin.downloader.model.n
            r0.<init>(r11)
            java.lang.String r1 = r7.f248342h
            r0.f110176a = r1
            java.lang.String r1 = r7.f248344j
            r0.f110179d = r1
            java.lang.String r1 = r7.f248343i
            r0.f110180e = r1
            r0.f110184i = r5
            r0.f110186k = r10
            r0.f110200y = r10
            r0.f110185j = r5
            r1 = 2
            r0.f110181f = r1
            java.lang.Integer r2 = r7.f248340f
            if (r2 != 0) goto L_0x0136
            goto L_0x0159
        L_0x0136:
            int r2 = r2.intValue()
            if (r2 != r1) goto L_0x0159
            java.lang.String r1 = r7.f248349r
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0159
            java.lang.String r1 = a70.C79471a.f233015c
            java.lang.String r2 = r7.f248349r
            a12.b r5 = new a12.b
            r5.<init>(r1, r2)
            r1 = 5
            java.lang.String r1 = r5.mo109423a(r1)
            r5.mo109428f(r1)
            r1 = 7
            r5.mo109425c(r1, r3)
        L_0x0159:
            com.tencent.mm.plugin.downloader.model.l r1 = com.tencent.p014mm.plugin.downloader.model.C40935l.m44326g()
            long r12 = r1.mo63956b(r0)
            n13.a r14 = new n13.a
            java.util.HashMap<java.lang.Long, java.lang.Long> r4 = f256363b
            java.util.HashMap<java.lang.String, java.lang.Boolean> r5 = f256364c
            java.util.HashMap<java.lang.Long, java.lang.String> r6 = f256365d
            r0 = r14
            r1 = r25
            r2 = r12
            r0.<init>(r1, r2, r4, r5, r6)
            f256366e = r14
            com.tencent.mm.plugin.downloader.model.l r0 = com.tencent.p014mm.plugin.downloader.model.C40935l.m44326g()
            n13.a r1 = f256366e
            if (r1 == 0) goto L_0x01c8
            r0.mo63955a(r1)
            java.lang.String r0 = "download start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            kj2.d r14 = kj2.C117407d.INSTANCE
            r15 = 1429(0x595, double:7.06E-321)
            r17 = 11
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)
            java.lang.Integer r0 = r7.f248340f
            if (r0 != 0) goto L_0x0194
            goto L_0x01c7
        L_0x0194:
            int r0 = r0.intValue()
            if (r0 != r9) goto L_0x01c7
            te3.xf2 r0 = new te3.xf2
            r0.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r12)
            r0.f186294d = r1
            java.lang.String r1 = r7.f248342h
            r0.f186295e = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f186298h = r1
            java.lang.String r1 = "2"
            r0.f186297g = r1
            b12.C79645d.m96743s(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            w02.c r0 = w02.C90879c.m113993a(r0)
            w02.f r0 = r0.f260860b
            w02.e r0 = (w02.C90882e) r0
            java.lang.String r1 = ""
            r0.mo124981a(r1, r7, r10)
        L_0x01c7:
            return
        L_0x01c8:
            java.lang.String r0 = "downloadCallbackListener"
            gy3.C87412m.m108603p(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n13.C88880b.mo123266g(com.tencent.mm.plugin.hp.util.TinkerSyncResponse):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0284  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123267h(com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "response"
            gy3.C87412m.m108594g(r0, r1)
            boolean r1 = r17.mo118342a()
            java.lang.String r2 = "MicroMsg.Updater.ManualUpdaterProcessor"
            if (r1 != 0) goto L_0x0022
            java.lang.String r0 = "check response error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 1429(0x595, double:7.06E-321)
            r6 = 0
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            return
        L_0x0022:
            boolean r1 = r17.mo118343b()
            r3 = 0
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "need to rollback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            kj2.d r4 = kj2.C117407d.INSTANCE
            r5 = 1429(0x595, double:7.06E-321)
            r7 = 1
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            iv3.a r1 = iv3.C87821a.m109275c(r0)
            boolean r4 = r1.f254239l
            if (r4 != 0) goto L_0x004c
            java.lang.String r0 = "SyncResponseProcessor: onPatchRollback, tinker is not loaded, just return"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x005c
        L_0x004c:
            java.lang.String r4 = "tinker wait screen to clean patch and kill all process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            com.tencent.mm.modelmulti.a r2 = new com.tencent.mm.modelmulti.a
            n13.f r4 = new n13.f
            r4.<init>(r0, r1)
            r2.<init>(r0, r4, r3)
        L_0x005c:
            return
        L_0x005d:
            boolean r1 = r17.mo118345d()
            if (r1 != 0) goto L_0x0075
            java.lang.String r0 = "check not need to update"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 1429(0x595, double:7.06E-321)
            r6 = 2
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            return
        L_0x0075:
            boolean r1 = r17.mo118348f()
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = "lower client version"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 1429(0x595, double:7.06E-321)
            r6 = 3
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            return
        L_0x008d:
            boolean r1 = com.tencent.p014mm.sdk.crash.CrashReportFactory.isOnlinePatchBlocked()
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "patch downloading is blocked by assist."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return
        L_0x009a:
            java.lang.Integer r1 = r0.f248340f
            r4 = 3
            r5 = 2
            r6 = 4
            if (r1 != 0) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            int r1 = r1.intValue()
            if (r1 == r4) goto L_0x00eb
        L_0x00a8:
            java.lang.Integer r1 = r0.f248340f
            if (r1 != 0) goto L_0x00ad
            goto L_0x00b4
        L_0x00ad:
            int r1 = r1.intValue()
            if (r1 != r6) goto L_0x00b4
            goto L_0x00eb
        L_0x00b4:
            java.lang.Integer r1 = r0.f248340f
            if (r1 != 0) goto L_0x00b9
            goto L_0x00e4
        L_0x00b9:
            int r1 = r1.intValue()
            if (r1 != r5) goto L_0x00e4
            com.tencent.mm.app.e1 r1 = com.tencent.p014mm.app.C80590e1.C28678b.f78659a
            boolean r1 = r1.mo112297a()
            if (r1 == 0) goto L_0x00dd
            java.lang.String r1 = "handle hotpatch"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r16.mo123266g(r17)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 1429(0x595, double:7.06E-321)
            r6 = 7
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            goto L_0x022a
        L_0x00dd:
            java.lang.String r0 = "TinkerEnsuranceOnFault can not apply patch"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x022a
        L_0x00e4:
            java.lang.String r0 = "full apk not support, comming soon"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x022a
        L_0x00eb:
            java.lang.String r1 = "processBsAndHPatch"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.lang.Integer r1 = r0.f248340f
            r4 = 1
            if (r1 != 0) goto L_0x00f7
            goto L_0x010f
        L_0x00f7:
            int r1 = r1.intValue()
            if (r1 != r6) goto L_0x010f
            bp3.p r1 = bp3.C79758p.f233760a
            bp3.f r7 = bp3.C104160f.RepairerConfig_Updater_DISABLEALPHA_Int
            int r1 = r1.mo109882e(r7, r3)
            if (r1 != r4) goto L_0x0109
            r1 = 1
            goto L_0x010a
        L_0x0109:
            r1 = 0
        L_0x010a:
            if (r1 != 0) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r1 = 0
            goto L_0x0110
        L_0x010f:
            r1 = 1
        L_0x0110:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "HdiffApk, manual,handle alpha version "
            r7.append(r8)
            java.lang.String r8 = r0.f248349r
            r7.append(r8)
            java.lang.String r8 = ", isHdiffDisableAlphaSwitch = "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            java.lang.String r7 = r0.f248349r
            boolean r7 = b12.C79644b.m96724b(r7)
            if (r7 == 0) goto L_0x022d
            if (r1 == 0) goto L_0x022d
            kj2.d r8 = kj2.C117407d.INSTANCE
            r9 = 1429(0x595, double:7.06E-321)
            r11 = 4
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "dealWithAlphaVersion "
            r1.append(r5)
            java.lang.String r5 = r0.f248349r
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = r0.f248350s
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x016e
            r2 = 2131821657(0x7f110459, float:1.9276063E38)
            java.lang.String r2 = r1.getString(r2)
            goto L_0x0170
        L_0x016e:
            java.lang.String r2 = r0.f248350s
        L_0x0170:
            java.lang.String r5 = r0.f248351t
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x017b
            java.lang.String r5 = ""
            goto L_0x017d
        L_0x017b:
            java.lang.String r5 = r0.f248351t
        L_0x017d:
            java.lang.String r6 = r0.f248352u
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x01a3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "http://"
            r0.append(r6)
            r6 = 2131831337(0x7f112a29, float:1.9295697E38)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r6)
            r0.append(r6)
            java.lang.String r6 = "/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L_0x01a5
        L_0x01a3:
            java.lang.String r0 = r0.f248352u
        L_0x01a5:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = "android.intent.action.VIEW"
            r6.<init>(r7)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getSourcePackageName()
            r8.append(r9)
            java.lang.String r9 = ".plugin.webview.ui.tools.WebViewUI"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.setClassName(r7, r8)
            java.lang.String r7 = "rawUrl"
            r6.putExtra(r7, r0)
            java.lang.String r0 = "useJs"
            r6.putExtra(r0, r4)
            java.lang.String r0 = "vertical_scroll"
            r6.putExtra(r0, r4)
            r0 = 872415232(0x34000000, float:1.1920929E-7)
            r6.setFlags(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r3, r6, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.app.Notification r1 = new android.app.Notification
            r1.<init>()
            long r3 = java.lang.System.currentTimeMillis()
            r1.when = r3
            r3 = -1
            r1.audioStreamType = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3 = 0
            r1.tickerText = r3
            long r3 = java.lang.System.currentTimeMillis()
            r1.when = r3
            p918s2.C90116e.C90121c.m112748d(r2)
            p918s2.C90116e.C90121c.m112748d(r5)
            r3 = 2131233736(0x7f080bc8, float:1.8083618E38)
            r1.icon = r3
            java.lang.String r1 = "title"
            gy3.C87412m.m108593f(r2, r1)
            java.lang.String r1 = "text"
            gy3.C87412m.m108593f(r5, r1)
            m110963j(r2, r5, r0)
        L_0x022a:
            r3 = r16
            goto L_0x0292
        L_0x022d:
            java.lang.Integer r1 = r0.f248340f
            java.lang.String r2 = "response.packageType"
            gy3.C87412m.m108593f(r1, r2)
            int r1 = r1.intValue()
            b12.C79645d.m96727c(r1, r5)
            java.lang.Integer r1 = r0.f248340f
            gy3.C87412m.m108593f(r1, r2)
            int r1 = r1.intValue()
            v02.C90737d.m113800h(r4, r1)
            java.lang.String r1 = r0.f248346o
            java.lang.String r3 = "response.newApkMd5"
            gy3.C87412m.m108593f(r1, r3)
            r3 = r16
            boolean r1 = r3.mo123263d(r1)
            if (r1 != 0) goto L_0x0284
            kj2.d r7 = kj2.C117407d.INSTANCE
            r8 = 1429(0x595, double:7.06E-321)
            r10 = 6
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            r16.mo123266g(r17)
            java.lang.Integer r0 = r0.f248340f
            if (r0 != 0) goto L_0x026c
            goto L_0x0292
        L_0x026c:
            int r0 = r0.intValue()
            if (r0 != r6) goto L_0x0292
            r0 = 111(0x6f, float:1.56E-43)
            v02.C90737d.m113803k(r0)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 614(0x266, double:3.034E-321)
            r7 = 111(0x6f, double:5.5E-322)
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            goto L_0x0292
        L_0x0284:
            r1 = 13
            java.lang.Integer r0 = r0.f248340f
            gy3.C87412m.m108593f(r0, r2)
            int r0 = r0.intValue()
            v02.C90737d.m113800h(r1, r0)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n13.C88880b.mo123267h(com.tencent.mm.plugin.hp.util.TinkerSyncResponse):void");
    }

    /* renamed from: k */
    public final void mo123268k() {
        Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "updateFailToast");
        ((C119157j) C119157j.f356862d).mo183895z(C88889e.f256377d);
    }
}
