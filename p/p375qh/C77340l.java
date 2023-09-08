package p375qh;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Message;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32226l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kd0.C76541g0;
import kd0.C76546u;
import kd0.C76551y;
import kd0.C76552z;
import kd0.C99122f0;
import kd0.C99125s;
import lc3.C10485b;
import lu3.C88656g;
import nc3.C34767b;
import ob0.C77002r;
import p156gj.C107835h0;
import p302ch.C67358b;
import p331dj.C75411c;
import pu0.C110248b;
import qu0.C110472b;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: qh.l */
public class C77340l implements C77002r {

    /* renamed from: t */
    public static boolean f225494t;

    /* renamed from: a */
    public C77339c f225495a = null;

    /* renamed from: b */
    public C34767b.C34768c f225496b;

    /* renamed from: c */
    public C77343c f225497c = null;

    /* renamed from: d */
    public String f225498d;

    /* renamed from: e */
    public String f225499e = "";

    /* renamed from: f */
    public boolean f225500f = false;

    /* renamed from: g */
    public boolean f225501g = false;

    /* renamed from: h */
    public long f225502h;

    /* renamed from: i */
    public long f225503i = 0;

    /* renamed from: j */
    public int f225504j = 0;

    /* renamed from: k */
    public boolean f225505k = false;

    /* renamed from: l */
    public boolean f225506l = false;

    /* renamed from: m */
    public int f225507m = 0;

    /* renamed from: n */
    public C75411c f225508n = C75411c.UNKNOWN;

    /* renamed from: o */
    public C77002r.C77004b f225509o;

    /* renamed from: p */
    public C77002r.C77003a f225510p = null;

    /* renamed from: q */
    public C67358b f225511q;

    /* renamed from: r */
    public MTimerHandler f225512r = new MTimerHandler(new C77342b(), true);

    /* renamed from: s */
    public Runnable f225513s;

    /* renamed from: qh.l$a */
    public class C77341a implements C32226l<Boolean, C13598b0> {
        public C77341a() {
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C77340l.m93228l(C77340l.this);
                return null;
            } else if (!C77340l.this.f225505k) {
                Log.m105924i("MicroMsg.SceneVoice.Recorder", "after start bluetooth, timeout to directly start record");
                C77340l.m93228l(C77340l.this);
                return null;
            } else {
                Log.m105920e("MicroMsg.SceneVoice.Recorder", "mHasBeginRec is true");
                return null;
            }
        }
    }

    /* renamed from: qh.l$b */
    public class C77342b implements MTimerHandler.CallBack {
        public C77342b() {
        }

        public boolean onTimerExpired() {
            C77340l lVar = C77340l.this;
            String str = lVar.f225499e;
            if (str == null) {
                HashMap<String, WeakReference<C77002r>> hashMap = C76552z.f224074a;
            } else {
                C76551y o = C76552z.m92077o(str);
                if (o == null) {
                    Log.m105918d("MicroMsg.VoiceLogic", "startSend null record : " + str);
                } else if (o.f224058i == 1) {
                    o.f224058i = 2;
                    o.f224050a = 64;
                    HashMap<String, WeakReference<C77002r>> hashMap2 = C76552z.f224074a;
                    synchronized (hashMap2) {
                        hashMap2.put(str, new WeakReference(lVar));
                    }
                    C76552z.m92088z(o);
                }
            }
            C76546u.xx0().mo107480e();
            Log.m105918d("MicroMsg.SceneVoice.Recorder", "Start Send fileName :" + C77340l.this.f225499e);
            return false;
        }
    }

    /* renamed from: qh.l$c */
    public final class C77343c implements C88656g {

        /* renamed from: d */
        public MMHandler f225516d;

        /* renamed from: qh.l$c$a */
        public class C77344a extends MMHandler {
            public C77344a(C77340l lVar) {
            }

            public void handleMessage(Message message) {
                if (C77340l.this.f225507m > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("On Part :");
                    sb.append(C77340l.this.f225509o == null);
                    Log.m105918d("MicroMsg.SceneVoice.Recorder", sb.toString());
                    C77340l lVar = C77340l.this;
                    lVar.f225507m = 2;
                    C77002r.C77004b bVar = lVar.f225509o;
                    if (bVar != null) {
                        bVar.mo102901a();
                    }
                }
            }
        }

        public C77343c() {
            this.f225516d = new C77344a(C77340l.this);
        }

        public String getKey() {
            return "SceneVoiceRecorder_record";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
            if (r3 == null) goto L_0x00d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
            r0 = kd0.C76552z.m92072j(r1.f225499e, true);
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SceneVoice.Recorder", "Thread Started Record, fullPath: %s, useSpeex: %s", r0, java.lang.Boolean.valueOf(r9.f225517e.f225506l));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
            if (r3.startRecord(r0) != false) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0072, code lost:
            kd0.C76552z.m92064b(r9.f225517e.f225499e);
            r0 = r9.f225517e;
            r0.f225499e = null;
            r0.f225495a = null;
            r0.mo107475k();
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.SceneVoice.Recorder", "Thread Start Record  Error fileName[" + r9.f225517e.f225499e + "]");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a2, code lost:
            r9.f225517e.f225503i = com.tencent.p014mm.sdk.platformtools.Util.currentTicks();
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.SceneVoice.Recorder", "Thread Started Record fileName[" + r9.f225517e.f225499e + "] time:" + com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r9.f225517e.f225502h));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d4, code lost:
            r9.f225516d.sendEmptyMessageDelayed(0, 1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00db, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                qh.l r0 = p375qh.C77340l.this
                java.lang.Runnable r0 = r0.f225513s
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r0)
                java.lang.String r0 = "MicroMsg.SceneVoice.Recorder"
                java.lang.String r1 = "RecordStartRunnable begin run %s"
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                long r4 = r4.getId()
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r5 = 0
                r3[r5] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
                qh.l r0 = p375qh.C77340l.this
                monitor-enter(r0)
                java.lang.String r1 = "MicroMsg.SceneVoice.Recorder"
                java.lang.String r3 = "lock[%s] of runnable[%s]!"
                r4 = 2
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x00dc }
                java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00dc }
                long r7 = r7.getId()     // Catch:{ all -> 0x00dc }
                java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00dc }
                r6[r5] = r7     // Catch:{ all -> 0x00dc }
                qh.l r7 = p375qh.C77340l.this     // Catch:{ all -> 0x00dc }
                r6[r2] = r7     // Catch:{ all -> 0x00dc }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r6)     // Catch:{ all -> 0x00dc }
                qh.l r1 = p375qh.C77340l.this     // Catch:{ all -> 0x00dc }
                qh.c r3 = r1.f225495a     // Catch:{ all -> 0x00dc }
                if (r3 != 0) goto L_0x004e
                java.lang.String r1 = "MicroMsg.SceneVoice.Recorder"
                java.lang.String r2 = "Stop Record Failed recorder == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x00dc }
                monitor-exit(r0)     // Catch:{ all -> 0x00dc }
                return
            L_0x004e:
                monitor-exit(r0)     // Catch:{ all -> 0x00dc }
                if (r3 == 0) goto L_0x00d4
                java.lang.String r0 = r1.f225499e
                java.lang.String r0 = kd0.C76552z.m92072j(r0, r2)
                java.lang.String r1 = "MicroMsg.SceneVoice.Recorder"
                java.lang.String r6 = "Thread Started Record, fullPath: %s, useSpeex: %s"
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r5] = r0
                qh.l r7 = p375qh.C77340l.this
                boolean r7 = r7.f225506l
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                r4[r2] = r7
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r4)
                boolean r0 = r3.startRecord(r0)
                if (r0 != 0) goto L_0x00a2
                qh.l r0 = p375qh.C77340l.this
                java.lang.String r0 = r0.f225499e
                kd0.C76552z.m92064b(r0)
                qh.l r0 = p375qh.C77340l.this
                r1 = 0
                r0.f225499e = r1
                r0.f225495a = r1
                r0.mo107475k()
                java.lang.String r0 = "MicroMsg.SceneVoice.Recorder"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Thread Start Record  Error fileName["
                r1.append(r2)
                qh.l r2 = p375qh.C77340l.this
                java.lang.String r2 = r2.f225499e
                r1.append(r2)
                java.lang.String r2 = "]"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            L_0x00a2:
                qh.l r0 = p375qh.C77340l.this
                long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                r0.f225503i = r1
                java.lang.String r0 = "MicroMsg.SceneVoice.Recorder"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Thread Started Record fileName["
                r1.append(r2)
                qh.l r2 = p375qh.C77340l.this
                java.lang.String r2 = r2.f225499e
                r1.append(r2)
                java.lang.String r2 = "] time:"
                r1.append(r2)
                qh.l r2 = p375qh.C77340l.this
                long r2 = r2.f225502h
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            L_0x00d4:
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r9.f225516d
                r1 = 1
                r0.sendEmptyMessageDelayed(r5, r1)
                return
            L_0x00dc:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00dc }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p375qh.C77340l.C77343c.run():void");
        }
    }

    public C77340l(Context context, boolean z) {
        this.f225506l = z;
        this.f225511q = new C67358b(new C77341a());
        Log.m105925i("MicroMsg.SceneVoice.Recorder", "new SceneVoiceRecorder, useSpeex: %s", Boolean.valueOf(z));
    }

    /* renamed from: l */
    public static void m93228l(C77340l lVar) {
        if (lVar.f225505k) {
            Log.m105924i("MicroMsg.SceneVoice.Recorder", "[startRecordInternal] return mHasBeginRec is true!");
            return;
        }
        lVar.f225505k = true;
        if (lVar.f225506l) {
            lVar.f225508n = C75411c.SPEEX;
            lVar.f225495a = new C99125s();
        } else {
            Class cls = C10485b.class;
            C75411c cVar = C75411c.PCM;
            C75411c cVar2 = C75411c.AMR;
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
            boolean z = C107835h0.f322846c.f322747i != 1;
            if (!sharedPreferences.contains("settings_voicerecorder_mode")) {
                sharedPreferences.edit().putBoolean("settings_voicerecorder_mode", z).commit();
            }
            Log.m105925i("AudioConfig", "getModeByConfig mVoiceRecordMode:%d defValue:%b settings_voicerecorder_mode:%b", Integer.valueOf(C107835h0.f322846c.f322747i), Boolean.valueOf(z), Boolean.valueOf(sharedPreferences.getBoolean("settings_voicerecorder_mode", z)));
            lVar.f225508n = sharedPreferences.getBoolean("settings_voicerecorder_mode", z) ? cVar : cVar2;
            String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("VoiceFormat");
            String c2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("VoiceFormatToQQ");
            if (lVar.f225508n == cVar) {
                if (4 == Util.getInt(c, 4) && C101195p.f296203b) {
                    lVar.f225508n = C75411c.SILK;
                }
                String str = lVar.f225498d;
                if (str != null && str.endsWith("@qqim")) {
                    lVar.f225508n = cVar2;
                }
            }
            if (lVar.f225508n == cVar) {
                Log.m105924i("MicroMsg.SceneVoice.Recorder", "refreshRecordMode, still in pcm mode, force to amr mode");
                lVar.f225508n = cVar2;
            }
            Log.m105925i("MicroMsg.SceneVoice.Recorder", "refreshRecordMode dynamicFormat:%s dynamicFormatQQ:%s recdMode:%s isSilkSoLoadSuccess:%b", c, c2, lVar.f225508n, Boolean.valueOf(C101195p.f296203b));
            lVar.f225495a = new C99122f0(lVar.f225508n);
        }
        C77345m mVar = new C77345m(lVar);
        C77339c cVar3 = lVar.f225495a;
        if (cVar3 != null) {
            cVar3.mo107470c(mVar);
        }
        C77346n nVar = new C77346n(lVar);
        lVar.f225513s = nVar;
        MMHandlerThread.postToMainThreadDelayed(nVar, 600);
        lVar.f225497c = new C77343c();
        Log.m105925i("MicroMsg.SceneVoice.Recorder", "[startRecordInternal] mRecordStartRunnable has post! threadPool:%s", ((C119157j) C119157j.f356863e).mo183874e());
        ((C119157j) C119157j.f356862d).mo183875f(lVar.f225497c);
        lVar.f225507m = 1;
        lVar.f225512r.startTimer(3000);
        Log.m105918d("MicroMsg.SceneVoice.Recorder", "start end time:" + Util.ticksToNow(lVar.f225502h));
    }

    /* renamed from: a */
    public String mo107315a() {
        return this.f225499e;
    }

    /* renamed from: b */
    public long mo107316b() {
        long j = this.f225503i;
        if (j == 0) {
            return 0;
        }
        return Util.ticksToNow(j);
    }

    /* renamed from: c */
    public void mo107317c(C77002r.C77003a aVar) {
        this.f225510p = aVar;
    }

    public boolean cancel() {
        C77339c cVar;
        Log.m105918d("MicroMsg.SceneVoice.Recorder", "cancel Record :" + this.f225499e);
        synchronized (this) {
            cVar = this.f225495a;
        }
        if (cVar != null) {
            Log.m105925i("MicroMsg.SceneVoice.Recorder", "lock[%s] of cancel[%s]! stop synchronized Record:" + this.f225499e, Long.valueOf(Thread.currentThread().getId()), this);
            cVar.stopRecord();
            mo107475k();
        }
        this.f225511q.mo91494d0();
        C76552z.m92081s(this.f225499e);
        C76546u.xx0().mo107480e();
        if (this.f225495a != null && !Util.isNullOrNil(this.f225499e) && !this.f225506l) {
            String str = this.f225499e;
            long b = mo107316b();
            int a = this.f225495a.mo107469a();
            C115669n nVar = C115669n.INSTANCE;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(",");
            stringBuffer.append(b);
            stringBuffer.append(",");
            stringBuffer.append(1);
            stringBuffer.append(",");
            stringBuffer.append(a);
            Log.m105918d("MicroMsg.AudioRecorderInfo", " getStatInfo " + stringBuffer.toString());
            nVar.kvStat(10513, stringBuffer.toString());
        }
        this.f225499e = "";
        return true;
    }

    /* renamed from: d */
    public int mo107319d() {
        C77339c cVar = this.f225495a;
        if (cVar == null) {
            return 0;
        }
        return cVar.mo107471d();
    }

    /* renamed from: e */
    public int mo107320e() {
        if (this.f225506l) {
            return 1;
        }
        C75411c cVar = this.f225508n;
        if (cVar == C75411c.PCM || cVar == C75411c.AMR) {
            return 0;
        }
        return cVar == C75411c.SILK ? 2 : -1;
    }

    /* renamed from: f */
    public void mo107321f() {
        Log.m105919d("MicroMsg.SceneVoice.Recorder", "stop2 Record: %s.", this.f225499e);
        MTimerHandler mTimerHandler = this.f225512r;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f225512r.removeCallbacksAndMessages((Object) null);
        }
        this.f225511q.mo91494d0();
        synchronized (this) {
            Log.m105925i("MicroMsg.SceneVoice.Recorder", "lock[%s] of stop2[%s]! stop synchronized Record:" + this.f225499e, Long.valueOf(Thread.currentThread().getId()), this);
            C77339c cVar = this.f225495a;
            if (cVar != null) {
                cVar.stopRecord();
                mo107475k();
            }
        }
        this.f225507m = -1;
    }

    /* renamed from: g */
    public boolean mo107322g(String str) {
        Log.m105924i("MicroMsg.SceneVoice.Recorder", "Start Record to  " + str);
        reset();
        this.f225498d = str;
        this.f225502h = Util.currentTicks();
        if (str == null) {
            Log.m105920e("MicroMsg.SceneVoice.Recorder", "Start Record toUser null");
            return false;
        }
        this.f225500f = str.equals("_USER_FOR_THROWBOTTLE_");
        if (str.equals("medianote")) {
            this.f225501g = (C75592q0.m90787q() & 16384) == 0;
        }
        if (this.f225506l) {
            this.f225499e = C76552z.m92071i(str, "spx_");
        } else if (this.f225500f) {
            this.f225499e = C76541g0.m92032SQ(C75592q0.m90789s(), "amr_");
        } else if (this.f225501g) {
            this.f225499e = C76541g0.m92032SQ("medianote", "amr_");
        } else {
            this.f225499e = C76552z.m92071i(str, "amr_");
        }
        String str2 = this.f225499e;
        if (str2 == null || str2.length() <= 0) {
            Log.m105921e("MicroMsg.SceneVoice.Recorder", "Start Record DBError fileName:%s", this.f225499e);
            return false;
        }
        this.f225505k = false;
        this.f225496b = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34775p.f93458c, (C34767b.C21622a) null);
        C67358b bVar = this.f225511q;
        bVar.getClass();
        C110248b.f329777h.mo161664i(bVar, "record");
        Log.m105924i("MicroMsg.SceneVoiceRecorderAudioManager", "some one has been request audio to record");
        if (!C110472b.f330365a.mo161950a() || !C110472b.f330368d) {
            bVar.f193219l.invoke(Boolean.TRUE);
        } else if (bVar.mo157510m()) {
            bVar.f193221n = true;
            bVar.f193219l.invoke(Boolean.TRUE);
            bVar.mo161478U("record", 1);
        } else {
            bVar.f193221n = true;
            if (bVar.mo161478U("record", 4) != -1) {
                bVar.f193220m.sendEmptyMessageDelayed(0, 1000);
            } else {
                bVar.f193219l.invoke(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: h */
    public int mo107323h() {
        return this.f225504j;
    }

    /* renamed from: i */
    public boolean mo107324i() {
        C77339c cVar = this.f225495a;
        return cVar != null && cVar.getStatus() == 1;
    }

    /* renamed from: j */
    public void mo107325j(C77002r.C77004b bVar) {
        this.f225509o = bVar;
    }

    /* renamed from: k */
    public final void mo107475k() {
        Log.m105924i("MicroMsg.SceneVoice.Recorder", "abandonFocus: ");
        if (this.f225496b != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(this.f225496b);
            this.f225496b = null;
        }
    }

    public void reset() {
        C77339c cVar = this.f225495a;
        if (cVar != null) {
            cVar.stopRecord();
            mo107475k();
            Log.m105920e("MicroMsg.SceneVoice.Recorder", "Reset recorder.stopReocrd");
        }
        this.f225499e = "";
        this.f225502h = 0;
        this.f225497c = null;
        this.f225508n = C75411c.UNKNOWN;
        this.f225507m = 0;
        this.f225503i = 0;
    }

    public boolean stop() {
        C77339c cVar;
        MTimerHandler mTimerHandler = this.f225512r;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f225512r.removeCallbacksAndMessages((Object) null);
        }
        this.f225511q.mo91494d0();
        int b = (int) mo107316b();
        this.f225504j = b;
        boolean z = false;
        Log.m105925i("MicroMsg.SceneVoice.Recorder", "stop Record : %s, len: %s", this.f225499e, Integer.valueOf(b));
        if (this.f225495a != null && !Util.isNullOrNil(this.f225499e) && !this.f225506l) {
            String str = this.f225499e;
            int a = this.f225495a.mo107469a();
            C115669n nVar = C115669n.INSTANCE;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(",");
            stringBuffer.append((long) this.f225504j);
            stringBuffer.append(",");
            stringBuffer.append(2);
            stringBuffer.append(",");
            stringBuffer.append(a);
            Log.m105918d("MicroMsg.AudioRecorderInfo", " getStatInfo " + stringBuffer.toString());
            nVar.kvStat(10513, stringBuffer.toString());
        }
        synchronized (this) {
            cVar = this.f225495a;
            if (cVar == null) {
                cVar = null;
            }
        }
        Log.m105925i("MicroMsg.SceneVoice.Recorder", "stop synchronized Record:%s, recorder:%s, lock[%s] of stop[%s]!", this.f225499e, cVar, Long.valueOf(Thread.currentThread().getId()), this);
        if (cVar != null) {
            cVar.stopRecord();
        }
        mo107475k();
        if (this.f225507m != 2) {
            C76552z.m92064b(this.f225499e);
            this.f225499e = null;
            Log.m105924i("MicroMsg.SceneVoice.Recorder", "Stop " + this.f225499e + " by not onPart: " + Util.ticksToNow(this.f225502h));
        } else {
            int i = this.f225504j;
            long j = (long) i;
            if (j < 800 || (this.f225500f && j < 1000)) {
                Log.m105924i("MicroMsg.SceneVoice.Recorder", "Stop " + this.f225499e + " by voiceLen: " + this.f225504j);
                C76552z.m92064b(this.f225499e);
                this.f225499e = "";
            } else {
                C76552z.m92085w(this.f225499e, i, 0);
                C76546u.xx0().mo107480e();
                Log.m105924i("MicroMsg.SceneVoice.Recorder", "Stop file success: " + this.f225499e);
                z = true;
            }
            this.f225499e = "";
        }
        this.f225507m = -1;
        return z;
    }
}
