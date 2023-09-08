package com.tencent.p014mm.plugin.collect.model.voice;

import a70.C112760b;
import android.content.SharedPreferences;
import b21.C113081b;
import cm0.C28615c;
import com.tencent.mapsdk.internal.C0938ej;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.CollectRcvVoiceEvent;
import com.tencent.p014mm.autogen.events.ReInitVoiceOffLineSynthesizerEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.util.concurrent.ConcurrentLinkedQueue;
import p261wl.C15510f;
import p261wl.C38166b;
import p523fp.C32147e;
import p564iq.C87790d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic */
public class F2fRcvVoiceOffLineLogic {

    /* renamed from: i */
    public static boolean f345523i;

    /* renamed from: j */
    public static final String f345524j;

    /* renamed from: k */
    public static final String f345525k;

    /* renamed from: l */
    public static final String f345526l;

    /* renamed from: m */
    public static F2fRcvVoiceOffLineLogic f345527m;

    /* renamed from: a */
    public Object f345528a = new Object();

    /* renamed from: b */
    public C115313d f345529b;

    /* renamed from: c */
    public C115306f f345530c = new C115306f(this, new C115303a(this));

    /* renamed from: d */
    public String f345531d;

    /* renamed from: e */
    public int f345532e = 0;

    /* renamed from: f */
    public IListener<CheckResUpdateCacheFileEvent> f345533f;

    /* renamed from: g */
    public IListener<ReInitVoiceOffLineSynthesizerEvent> f345534g;

    /* renamed from: h */
    public boolean f345535h;

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$d */
    public class C68800d implements CdnLogic.DownloadCallback {

        /* renamed from: d */
        public final /* synthetic */ long f197647d;

        /* renamed from: e */
        public final /* synthetic */ String f197648e;

        /* renamed from: f */
        public final /* synthetic */ String f197649f;

        /* renamed from: g */
        public final /* synthetic */ String f197650g;

        /* renamed from: h */
        public final /* synthetic */ String f197651h;

        /* renamed from: i */
        public final /* synthetic */ String f197652i;

        public C68800d(long j, String str, String str2, String str3, String str4, String str5) {
            this.f197647d = j;
            this.f197648e = str;
            this.f197649f = str2;
            this.f197650g = str3;
            this.f197651h = str4;
            this.f197652i = str5;
        }

        public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
            CdnLogic.CronetTaskResult cronetTaskResult;
            Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download end , cost：%s", Long.valueOf(Util.nowMilliSecond() - this.f197647d));
            if (!(c2CDownloadResult == null || (cronetTaskResult = c2CDownloadResult.cronetTaskResult) == null || cronetTaskResult.performance == null)) {
                Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download end, url:%s, statusCode:%d, profile:%s", this.f197648e, Integer.valueOf(cronetTaskResult.statusCode), c2CDownloadResult.cronetTaskResult.performance);
            }
            String str2 = this.f197649f;
            Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download result.errorCode ：%s， tempFilePath ：%s , md5：%s , file downaload md5:%s ", Integer.valueOf(c2CDownloadResult.errorCode), str2, this.f197650g, C86013q1.m106456q(str2));
            int i = c2CDownloadResult.errorCode;
            if (i != 0) {
                Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download failed:%s", Integer.valueOf(i));
            } else if (!C86013q1.m106450k(this.f197649f)) {
                Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "  download File fail:%s", this.f197649f);
            } else if (!this.f197650g.equalsIgnoreCase(C86013q1.m106456q(this.f197649f))) {
                Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "download md5 check failed，md5 :%s    ,  download md5:%s", this.f197650g, C86013q1.m106456q(this.f197649f));
            } else {
                String str3 = F2fRcvVoiceOffLineLogic.f345524j;
                C86013q1.m106461v(str3);
                String str4 = str3 + this.f197651h + ".pos";
                if (C86013q1.m106450k(str4)) {
                    Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", " has this voice resource before ，first delete exist file");
                    C86013q1.m106447h(str4);
                }
                C86013q1.m106442c(this.f197649f, str4);
                C86013q1.m106447h(this.f197649f);
                Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "copyFile form %s  to   %s", this.f197649f, str4);
                C28615c.m38294b().mo56097e(this.f197651h, str4, this.f197650g, this.f197652i);
                Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "save config  posID： %s，voicePath：%s ， md5 ：%s , version:%s", this.f197651h, str4, this.f197650g, this.f197652i);
                Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "currentResID %s、download ResID %s", F2fRcvVoiceOffLineLogic.m162051f(), this.f197651h);
                if (F2fRcvVoiceOffLineLogic.m162051f().equals(this.f197651h)) {
                    Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "set currentResID  for new resource");
                    F2fRcvVoiceOffLineLogic.m162054n(this.f197651h);
                }
            }
        }

        public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$e */
    public class C68801e {

        /* renamed from: a */
        public int f197653a;

        /* renamed from: b */
        public String f197654b;

        /* renamed from: c */
        public String f197655c;

        /* renamed from: d */
        public String f197656d;

        public C68801e(F2fRcvVoiceOffLineLogic f2fRcvVoiceOffLineLogic, CollectRcvVoiceEvent collectRcvVoiceEvent) {
            CollectRcvVoiceEvent.C67672a aVar = collectRcvVoiceEvent.f193526d;
            this.f197653a = aVar.f193527a;
            String str = aVar.f193528b;
            this.f197654b = aVar.f193529c;
            this.f197655c = aVar.f193530d;
            long j = aVar.f193531e;
            int i = aVar.f193532f;
            this.f197656d = aVar.f193533g;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$a */
    public class C115303a implements C115308h {
        public C115303a(F2fRcvVoiceOffLineLogic f2fRcvVoiceOffLineLogic) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$b */
    public class C115304b implements Runnable {
        public C115304b() {
        }

        public void run() {
            F2fRcvVoiceOffLineLogic.this.mo175084i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$c */
    public class C115305c implements Runnable {
        public C115305c() {
        }

        public void run() {
            F2fRcvVoiceOffLineLogic.this.mo175084i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$f */
    public class C115306f implements C115312c {

        /* renamed from: a */
        public C115308h f345540a;

        /* renamed from: b */
        public ConcurrentLinkedQueue<C68801e> f345541b = new ConcurrentLinkedQueue<>();

        public C115306f(F2fRcvVoiceOffLineLogic f2fRcvVoiceOffLineLogic, C115308h hVar) {
            this.f345540a = hVar;
        }

        /* renamed from: a */
        public void mo175092a(int i, byte[] bArr) {
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = Integer.valueOf(i);
            if (this.f345540a == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.F2fRcvVoiceOffLineLogic.Listener", "onGetResult() errorCode:%s (voiceLlistener == null):%s", objArr);
            if (this.f345540a != null) {
                C68801e poll = this.f345541b.poll();
                C115308h hVar = this.f345540a;
                String str = poll.f197654b;
                String str2 = poll.f197655c;
                String str3 = poll.f197656d;
                int i2 = poll.f197653a;
                String e = F2fRcvVoiceOffLineLogic.m162050d().mo175083e();
                ((C115303a) hVar).getClass();
                C38166b.m41755b(C115307g.class, new F2fRcvVoiceOffLineLogic$a$$a(i, str, str2, str3, i2, e, bArr, 0));
                if (i < 0) {
                    C115669n.INSTANCE.idkeyStat(1143, 20, 1, false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$g */
    public interface C115307g extends C15510f {
        /* renamed from: qL */
        void mo175093qL(int i, String str, String str2, String str3, int i2, String str4, byte[] bArr, int i3);
    }

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$h */
    public interface C115308h {
    }

    static {
        String str = C112760b.m154216X() + "files/wxofflinevoicenew/";
        f345524j = str;
        f345525k = str + "libreadMoney.so";
        f345526l = str + "woman_putonghua" + ".pos";
    }

    public F2fRcvVoiceOffLineLogic() {
        C40008f fVar = C40008f.f107254d;
        this.f345533f = new IListener<CheckResUpdateCacheFileEvent>(fVar) {
            {
                this.__eventId = 905296653;
            }

            public boolean callback(IEvent iEvent) {
                CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
                Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent callback");
                if (checkResUpdateCacheFileEvent.f78743d.f78744a == 60) {
                    synchronized (F2fRcvVoiceOffLineLogic.this.f345528a) {
                        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
                        Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent resTyep:%s subType:%s md5:%s fileVersion:%s", Integer.valueOf(checkResUpdateCacheFileEvent.f78743d.f78744a), Integer.valueOf(checkResUpdateCacheFileEvent.f78743d.f78745b), aVar.f78749f, Integer.valueOf(aVar.f78747d));
                        int i = checkResUpdateCacheFileEvent.f78743d.f78745b;
                        if (i != 1) {
                            if (i == 3) {
                                Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent subType == RES_SUB_TYPE_RES");
                                String str = F2fRcvVoiceOffLineLogic.f345526l;
                                if (C86013q1.m106450k(str)) {
                                    Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", " file exists，first delete exist file");
                                    C86013q1.m106447h(str);
                                }
                                C86013q1.m106442c(checkResUpdateCacheFileEvent.f78743d.f78746c, str);
                                F2fRcvVoiceOffLineLogic.m162055o("0", checkResUpdateCacheFileEvent.f78743d.f78749f);
                            }
                            if (F2fRcvVoiceOffLineLogic.f345523i) {
                                Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent OFF_LINE == true, do not reInit Synthesizer");
                            } else {
                                F2fRcvVoiceOffLineLogic.this.mo175088m();
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f345534g = new IListener<ReInitVoiceOffLineSynthesizerEvent>(fVar) {
            {
                this.__eventId = 788171318;
            }

            public boolean callback(IEvent iEvent) {
                ReInitVoiceOffLineSynthesizerEvent reInitVoiceOffLineSynthesizerEvent = (ReInitVoiceOffLineSynthesizerEvent) iEvent;
                Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "ReInitVoiceOffLineSynthesizerEvent");
                synchronized (F2fRcvVoiceOffLineLogic.this.f345528a) {
                    C113081b.yx0().Ax0();
                    F2fRcvVoiceOffLineLogic.this.mo175088m();
                }
                return false;
            }
        };
        this.f345535h = false;
    }

    /* renamed from: c */
    public static int m162049c(String str, String str2, String str3, String str4) {
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        String str5 = f345524j + str4 + ".pos";
        c2CDownloadRequest.fileKey = str4;
        c2CDownloadRequest.url = str2;
        c2CDownloadRequest.setSavePath(str5);
        c2CDownloadRequest.fileType = 101;
        long nowMilliSecond = Util.nowMilliSecond();
        c2CDownloadRequest.taskStartTime = nowMilliSecond;
        Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download beginTime : %s", Long.valueOf(nowMilliSecond));
        return CdnLogic.startURLDownload(c2CDownloadRequest, new C68800d(nowMilliSecond, str2, str5, str4, str, str3));
    }

    /* renamed from: d */
    public static F2fRcvVoiceOffLineLogic m162050d() {
        synchronized (F2fRcvVoiceOffLineLogic.class) {
            if (f345527m == null) {
                f345527m = new F2fRcvVoiceOffLineLogic();
            }
        }
        return f345527m;
    }

    /* renamed from: f */
    public static String m162051f() {
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, "0");
    }

    /* renamed from: g */
    public static String m162052g(String str) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("voice_offline_res_new");
        return mmkv.getString(str + C0938ej.f2166u, "");
    }

    /* renamed from: h */
    public static String m162053h(String str) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("voice_offline_res_new");
        return mmkv.getString(str + C0938ej.f2165t, "");
    }

    /* renamed from: n */
    public static void m162054n(String str) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, str);
        new ReInitVoiceOffLineSynthesizerEvent().publish();
    }

    /* renamed from: o */
    public static void m162055o(String str, String str2) {
        SharedPreferences.Editor edit = MultiProcessMMKV.getMMKV("voice_offline_res_new").edit();
        edit.putString(str + C0938ej.f2166u, Util.nullAs(str2, "")).commit();
    }

    /* renamed from: a */
    public final boolean mo175081a() {
        return C86013q1.m106450k(f345526l) ? mo175089p(m162052g("0")) : mo175082b();
    }

    /* renamed from: b */
    public final boolean mo175082b() {
        Class cls = C32147e.class;
        String AD = ((C32147e) C86312j.m106911c(cls)).mo58507AD(60, 3);
        boolean k = C86013q1.m106450k(AD);
        Log.m105919d("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "cacheFile:%s", AD);
        String str = f345526l;
        Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "checkDefaultResFromCache() %s no exist, cacheExist: %s", str, Boolean.valueOf(k));
        if (k) {
            long d = C86013q1.m106443d(AD, str, false);
            m162055o("0", "");
            Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "copyFile VOICE_DEFAULT_RES_PATH result == %s", Long.valueOf(d));
            if (!Util.isEqual(d, -1)) {
                String e6 = ((C32147e) C86312j.m106911c(cls)).mo58513e6(60, 3);
                m162055o("0", e6);
                Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "checkDefaultResEnviroment() getOriginalMd5() resMd5:%s", e6);
                return mo175089p(e6);
            }
        }
        return false;
    }

    /* renamed from: e */
    public String mo175083e() {
        return Util.isEqual(this.f345531d, "woman_putonghua") ? "0" : this.f345531d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo175084i() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f345528a
            monitor-enter(r0)
            boolean r1 = f345523i     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = "MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic"
            java.lang.String r2 = "initTTS() OFF_LINE == true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0010:
            b21.b r1 = b21.C113081b.yx0()     // Catch:{ all -> 0x0039 }
            r1.Ax0()     // Catch:{ all -> 0x0039 }
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ReInitVoiceOffLineSynthesizerEvent> r1 = r3.f345534g     // Catch:{ all -> 0x0039 }
            r1.alive()     // Catch:{ all -> 0x0039 }
            boolean r1 = r3.mo175085j()     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic"
            java.lang.String r2 = "initTTS() fail!! "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x0039 }
            r1 = 0
            f345523i = r1     // Catch:{ all -> 0x0039 }
            goto L_0x0037
        L_0x002d:
            java.lang.String r1 = "MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic"
            java.lang.String r2 = "initTTS() success!! "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x0039 }
            r1 = 1
            f345523i = r1     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic.mo175084i():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0129 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x021b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo175085j() {
        /*
            r29 = this;
            r1 = r29
            java.lang.Class<iq.d> r0 = p564iq.C87790d.class
            java.lang.String r2 = f345524j
            com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            java.lang.String r3 = "MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic"
            java.lang.String r4 = " checkResEnviroment() being "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent> r4 = r1.f345533f
            r4.alive()
            java.lang.Class<fp.e> r4 = p523fp.C32147e.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            fp.e r4 = (p523fp.C32147e) r4
            r5 = 60
            r4.Yi0(r5)
            java.lang.String r4 = m162051f()
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r4
            java.lang.String r8 = " resId is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r6)
            java.lang.String r6 = "voice_offline_res_new"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r6)
            java.lang.String r8 = ""
            java.lang.String r6 = r6.getString(r4, r8)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            java.lang.String r10 = " has Default Res"
            java.lang.String r11 = " do not have Default Res"
            java.lang.String r12 = "null"
            java.lang.String r13 = "woman_putonghua"
            java.lang.String r15 = "0"
            if (r9 != 0) goto L_0x00f3
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r9 == 0) goto L_0x00f3
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r15)
            java.lang.String r14 = "0-1"
            if (r9 == 0) goto L_0x0066
            java.lang.String r9 = m162052g(r14)
            java.lang.String r18 = m162053h(r14)
            goto L_0x006e
        L_0x0066:
            java.lang.String r9 = m162052g(r4)
            java.lang.String r18 = m162053h(r4)
        L_0x006e:
            r19 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r12)
            r0[r7] = r12
            java.lang.String r12 = "checkResEnviroment() resMd5:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 == 0) goto L_0x0096
            r12 = 3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r7] = r9
            r0[r5] = r4
            r12 = 2
            r0[r12] = r18
            java.lang.String r6 = " resMd5 is null :%s , resID:%s,version:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r0)
            r1.f345531d = r4
            goto L_0x0127
        L_0x0096:
            r12 = 2
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r7] = r6
            java.lang.String r17 = com.tencent.p014mm.vfs.C86013q1.m106456q(r6)
            r0[r5] = r17
            java.lang.String r5 = "checkResEnviroment() resPath: %s md5:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106456q(r6)
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00bf
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r7] = r4
            r5 = 1
            r0[r5] = r18
            java.lang.String r5 = " resMd5 check success,resID:%s,version:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
            r1.f345531d = r4
            goto L_0x011f
        L_0x00bf:
            java.lang.String r0 = " resMd5 check failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1143(0x477, double:5.647E-321)
            r24 = 31
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r15)
            if (r0 == 0) goto L_0x00de
            m162055o(r14, r8)
            goto L_0x00e1
        L_0x00de:
            m162055o(r4, r8)
        L_0x00e1:
            boolean r0 = r29.mo175081a()
            if (r0 == 0) goto L_0x00ed
            r1.f345531d = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            goto L_0x011f
        L_0x00ed:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            r1.f345531d = r8
            goto L_0x0126
        L_0x00f3:
            r19 = r0
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r12)
            r0[r7] = r4
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 1
            r0[r5] = r4
            java.lang.String r4 = "dont have this resID resource,resPath:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
            java.lang.String r0 = "try to get default res"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            boolean r0 = r29.mo175081a()
            if (r0 == 0) goto L_0x0121
            r1.f345531d = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
        L_0x011f:
            r5 = 1
            goto L_0x0127
        L_0x0121:
            r1.f345531d = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
        L_0x0126:
            r5 = 0
        L_0x0127:
            if (r5 != 0) goto L_0x012a
            return r7
        L_0x012a:
            com.tencent.mm.plugin.collect.model.voice.d r0 = r1.f345529b
            if (r0 == 0) goto L_0x014f
            r0.mo175098a()     // Catch:{ Exception -> 0x0132 }
            goto L_0x014f
        L_0x0132:
            r0 = move-exception
            r2 = r0
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r0[r7] = r4
            java.lang.String r2 = r2.getMessage()
            r4 = 1
            r0[r4] = r2
            java.lang.String r2 = "synthesizer.destroy() Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            return r7
        L_0x014f:
            com.tencent.mm.plugin.collect.model.voice.d r0 = com.tencent.p014mm.plugin.collect.model.voice.C115313d.C115315b.f345564a
            r1.f345529b = r0
            com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$f r4 = r1.f345530c
            com.tencent.mm.plugin.collect.model.voice.b r0 = r0.f345563a
            r0.f345550a = r4
            java.lang.String r4 = r1.f345531d
            boolean r5 = r0.f345555f
            r6 = -207(0xffffffffffffff31, float:NaN)
            r9 = -201(0xffffffffffffff37, float:NaN)
            r10 = -101(0xffffffffffffff9b, float:NaN)
            if (r5 == 0) goto L_0x0167
            goto L_0x01f0
        L_0x0167:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = ".pos"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r5 = 2
            java.lang.Object[] r12 = new java.lang.Object[r5]
            r12[r7] = r2
            r5 = 0
            r14 = 1
            r12[r14] = r5
            java.lang.String r14 = "MicroMsg.OfflineVoice.InnerSynthesizer"
            java.lang.String r11 = "resFilePath:%s soFilePath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r11, r12)
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r11 != 0) goto L_0x019a
            java.lang.String r0 = "init failed:ErrorCode.TTS_RESOURCE_ERROR "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            r2 = -101(0xffffffffffffff9b, float:NaN)
            goto L_0x01f9
        L_0x019a:
            di3.d r11 = di3.C86312j.m106911c(r19)
            iq.d r11 = (p564iq.C87790d) r11
            boolean r11 = r11.W90()
            if (r11 != 0) goto L_0x01ac
            java.lang.String r0 = "init failed:ErrorCode.TTS_SO_ERROR "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            goto L_0x01bd
        L_0x01ac:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ all -> 0x01fd }
            if (r11 != 0) goto L_0x01c4
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)     // Catch:{ all -> 0x01fd }
            if (r11 != 0) goto L_0x01c0
            java.lang.String r0 = "init failed: file not exist - ErrorCode.TTS_SO_ERROR "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)     // Catch:{ all -> 0x01fd }
        L_0x01bd:
            r2 = -103(0xffffffffffffff99, float:NaN)
            goto L_0x01f9
        L_0x01c0:
            java.lang.System.load(r5)     // Catch:{ all -> 0x01fd }
            goto L_0x01d0
        L_0x01c4:
            di3.d r5 = di3.C86312j.m106911c(r19)     // Catch:{ all -> 0x01fd }
            iq.d r5 = (p564iq.C87790d) r5     // Catch:{ all -> 0x01fd }
            java.lang.String r11 = "readMoney"
            r5.mo122034R0(r11)     // Catch:{ all -> 0x01fd }
        L_0x01d0:
            com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x01f2 }
            com.tencent.mm.plugin.collect.model.voice.SynthesizerNative r4 = r0.f345553d     // Catch:{ Exception -> 0x01f2 }
            byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x01f2 }
            int r2 = r4.init(r2)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r4 = "init ret：%s"
            r5 = 1
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01f2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01f2 }
            r11[r7] = r12     // Catch:{ Exception -> 0x01f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r11)     // Catch:{ Exception -> 0x01f2 }
            if (r2 >= 0) goto L_0x01ee
            goto L_0x01f9
        L_0x01ee:
            r0.f345555f = r5
        L_0x01f0:
            r2 = 0
            goto L_0x01f9
        L_0x01f2:
            java.lang.String r0 = "init failed:ErrorCode.TTS_INIT_ERROR "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            r2 = -201(0xffffffffffffff37, float:NaN)
        L_0x01f9:
            r0 = r2
            r2 = 2
            r5 = 1
            goto L_0x0219
        L_0x01fd:
            r0 = move-exception
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4[r7] = r5
            java.lang.String r0 = r0.getMessage()
            r5 = 1
            r4[r5] = r0
            java.lang.String r0 = "init() Throwable:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r4)
            r0 = -207(0xffffffffffffff31, float:NaN)
        L_0x0219:
            if (r0 >= 0) goto L_0x0390
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r4[r7] = r2
            java.lang.String r2 = r1.f345531d
            r4[r5] = r2
            java.lang.String r2 = "init failed by ret%s res:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r4)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r0, (int) r9)
            r4 = -9
            r11 = -2
            if (r2 == 0) goto L_0x0250
            java.lang.String r2 = r1.f345531d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r13)
            if (r2 != 0) goto L_0x02ab
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r5 = r1.f345531d
            r2[r7] = r5
            java.lang.String r5 = "voiceResName:%s fail, setVoiceOfflineLanguageResId(VOICE_DEFAULT_RES_ID)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            m162054n(r15)
            r29.mo175088m()
            goto L_0x02ab
        L_0x0250:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r0, (int) r6)
            if (r2 == 0) goto L_0x0262
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r5 = f345525k
            r2[r7] = r5
            java.lang.String r5 = "ErrorCode.TTS_INIT_SO_ERROR delete %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            goto L_0x02ab
        L_0x0262:
            if (r0 > r11) goto L_0x02ab
            if (r0 < r4) goto L_0x02ab
            java.lang.String r2 = r1.f345531d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r13)
            if (r2 == 0) goto L_0x02a5
            java.lang.String r2 = f345526l
            com.tencent.p014mm.vfs.C86013q1.m106447h(r2)
            m162055o(r15, r8)
            int r5 = r1.f345532e
            r8 = 5
            if (r5 >= r8) goto L_0x0289
            r8 = 1
            int r5 = r5 + r8
            r1.f345532e = r5
            boolean r5 = r29.mo175082b()
            if (r5 == 0) goto L_0x028a
            r29.mo175088m()
            goto L_0x028a
        L_0x0289:
            r8 = 1
        L_0x028a:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r5[r7] = r12
            r5[r8] = r2
            int r2 = r1.f345532e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8 = 2
            r5[r8] = r2
            java.lang.String r2 = "ret:%s delete %s : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r5)
            goto L_0x02ab
        L_0x02a5:
            m162054n(r15)
            r29.mo175088m()
        L_0x02ab:
            if (r0 != r10) goto L_0x02bc
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1143(0x477, double:5.647E-321)
            r22 = 1
            r24 = 1
            r26 = 0
            r19.idkeyStat(r20, r22, r24, r26)
            goto L_0x038f
        L_0x02bc:
            r2 = -102(0xffffffffffffff9a, float:NaN)
            if (r0 != r2) goto L_0x02cf
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1143(0x477, double:5.647E-321)
            r22 = 2
            r24 = 1
            r26 = 0
            r19.idkeyStat(r20, r22, r24, r26)
            goto L_0x038f
        L_0x02cf:
            r2 = -103(0xffffffffffffff99, float:NaN)
            if (r0 != r2) goto L_0x02e2
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1143(0x477, double:5.647E-321)
            r15 = 3
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x038f
        L_0x02e2:
            r2 = -104(0xffffffffffffff98, float:NaN)
            if (r0 != r2) goto L_0x02f5
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1143(0x477, double:5.647E-321)
            r15 = 4
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x038f
        L_0x02f5:
            if (r0 != r9) goto L_0x0306
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 1143(0x477, double:5.647E-321)
            r23 = 5
            r25 = 1
            r27 = 0
            r20.idkeyStat(r21, r23, r25, r27)
            goto L_0x038f
        L_0x0306:
            r2 = -202(0xffffffffffffff36, float:NaN)
            if (r0 != r2) goto L_0x0319
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1143(0x477, double:5.647E-321)
            r15 = 6
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x038f
        L_0x0319:
            r2 = -203(0xffffffffffffff35, float:NaN)
            if (r0 != r2) goto L_0x032b
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1143(0x477, double:5.647E-321)
            r15 = 7
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x038f
        L_0x032b:
            r2 = -204(0xffffffffffffff34, float:NaN)
            if (r0 != r2) goto L_0x033d
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1143(0x477, double:5.647E-321)
            r15 = 8
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x038f
        L_0x033d:
            r2 = -205(0xffffffffffffff33, float:NaN)
            if (r0 != r2) goto L_0x034f
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1143(0x477, double:5.647E-321)
            r15 = 9
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x038f
        L_0x034f:
            r2 = -206(0xffffffffffffff32, float:NaN)
            if (r0 != r2) goto L_0x0361
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1143(0x477, double:5.647E-321)
            r15 = 10
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x038f
        L_0x0361:
            if (r0 != r6) goto L_0x0371
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 1143(0x477, double:5.647E-321)
            r23 = 11
            r25 = 1
            r27 = 0
            r20.idkeyStat(r21, r23, r25, r27)
            goto L_0x038f
        L_0x0371:
            if (r0 > r11) goto L_0x0382
            if (r0 < r4) goto L_0x0382
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 1143(0x477, double:5.647E-321)
            r11 = 12
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            goto L_0x038f
        L_0x0382:
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1143(0x477, double:5.647E-321)
            r19 = 13
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
        L_0x038f:
            return r7
        L_0x0390:
            r1.f345532e = r7
            com.tencent.mm.plugin.collect.model.voice.d r0 = r1.f345529b
            r2 = 1092616192(0x41200000, float:10.0)
            com.tencent.mm.plugin.collect.model.voice.b r0 = r0.f345563a
            r0.f345558i = r2
            r2 = 1063675494(0x3f666666, float:0.9)
            r0.f345559j = r2
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic.mo175085j():boolean");
    }

    /* renamed from: k */
    public void mo175086k(boolean z) {
        Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", " begin initTTS()，delay：%s", Boolean.valueOf(z));
        if (z) {
            ((C119157j) C119157j.f356862d).mo183879j(new C115304b(), 10000, "initTTS");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C115305c(), "initTTS");
    }

    /* renamed from: l */
    public void mo175087l(CollectRcvVoiceEvent collectRcvVoiceEvent) {
        C68801e eVar = new C68801e(this, collectRcvVoiceEvent);
        this.f345530c.f345541b.add(eVar);
        C115313d dVar = this.f345529b;
        String str = eVar.f197656d;
        C115309b bVar = dVar.f345563a;
        if (!bVar.f345555f) {
            Log.m105924i("MicroMsg.OfflineVoice.InnerSynthesizer", "start failed:ErrorCode.TTS_START_ERROR ");
        } else {
            Thread thread = bVar.f345552c;
            if (thread != null && thread.isAlive()) {
                Log.m105924i("MicroMsg.OfflineVoice.InnerSynthesizer", "start failed:ErrorCode.TTS_START_ERROR ");
            } else if (str == null || str.length() > 1024) {
                Log.m105924i("MicroMsg.OfflineVoice.InnerSynthesizer", "start failed:TTS_TEXT_ERROR");
            } else if (!((C87790d) C86312j.m106911c(C87790d.class)).W90()) {
                Log.m105924i("MicroMsg.OfflineVoice.InnerSynthesizer", "start failed:TTS_EXPANSIONS_ERROR");
            } else {
                bVar.f345554e = str;
                bVar.f345556g = false;
                Thread thread2 = new Thread(bVar.f345551b);
                bVar.f345552c = thread2;
                thread2.start();
            }
        }
        Log.m105919d("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "produceVoice() %s", eVar.f197656d);
    }

    /* renamed from: m */
    public final void mo175088m() {
        if (mo175085j()) {
            f345523i = true;
            Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "reInitSynthesizer() success!!");
            return;
        }
        f345523i = false;
        Log.m105924i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "reInitSynthesizer() fail!!");
    }

    /* renamed from: p */
    public final boolean mo175089p(String str) {
        Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "verifyDefaultRes() resMd5:%s", Util.nullAs(str, "null"));
        if (Util.isNullOrNil(str)) {
            return true;
        }
        String str2 = f345526l;
        Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "verifyDefaultRes() %s md5:%s", str2, C86013q1.m106456q(str2));
        if (str.equalsIgnoreCase(C86013q1.m106456q(str2))) {
            return true;
        }
        C115669n.INSTANCE.idkeyStat(1143, 30, 1, false);
        C86013q1.m106447h(str2);
        m162055o("0", "");
        Log.m105925i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "verifyDefaultRes autoDownloadDefaultResNum:%s", Integer.valueOf(this.f345532e));
        int i = this.f345532e;
        if (i >= 5) {
            return false;
        }
        this.f345532e = i + 1;
        return mo175082b();
    }
}
