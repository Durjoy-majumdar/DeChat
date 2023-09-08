package e21;

import a70.C112760b;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import b21.C113081b;
import com.tencent.p014mm.autogen.events.CollectRcvVoiceEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayF2FVoicePushReportStruct;
import com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31543z5;
import eu3.C58834h;
import eu3.C97749e;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import ob0.C117747y;
import ob0.C35142u;
import p331dj.C97481g;
import p492dn.C45426j;
import pe3.C89349b;
import te3.C50430mp;

/* renamed from: e21.y */
public class C116660y extends IStaticListener<CollectRcvVoiceEvent> implements C35142u, F2fRcvVoiceOffLineLogic.C115307g {

    /* renamed from: q */
    public static final C89349b f349800q = C89349b.m111675b("元");

    /* renamed from: r */
    public static HandlerThread f349801r = C97749e.m126093a("syncCreatePlayer", 5);

    /* renamed from: d */
    public MediaPlayer f349802d;

    /* renamed from: e */
    public MediaPlayer f349803e;

    /* renamed from: f */
    public ConcurrentLinkedQueue<C116672j> f349804f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    public boolean f349805g = false;

    /* renamed from: h */
    public int f349806h;

    /* renamed from: i */
    public int f349807i;

    /* renamed from: j */
    public long f349808j;

    /* renamed from: n */
    public WeakReference<ArrayList<String>> f349809n;

    /* renamed from: o */
    public WCPayF2FVoicePushReportStruct f349810o;

    /* renamed from: p */
    public Map<String, CollectRcvVoiceEvent> f349811p = new HashMap();

    /* renamed from: e21.y$a */
    public class C116661a implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final /* synthetic */ C116672j f349812a;

        public C116661a(C116672j jVar) {
            this.f349812a = jVar;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            Log.m105924i("MicroMsg.F2fRcvVoiceListener", "start play money");
            C116660y yVar = C116660y.this;
            if (yVar.f349802d == null || !yVar.f349805g || yVar.f349803e != null) {
                Log.m105924i("MicroMsg.F2fRcvVoiceListener", "has played");
            } else {
                yVar.mo180663g0(this.f349812a);
            }
            C116660y.this.f349802d = null;
        }
    }

    /* renamed from: e21.y$b */
    public class C116662b implements MediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final /* synthetic */ C116672j f349814a;

        public C116662b(C116672j jVar) {
            this.f349814a = jVar;
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.m105920e("MicroMsg.F2fRcvVoiceListener", "prefix play error");
            C116660y yVar = C116660y.this;
            yVar.f349805g = false;
            yVar.f349802d = null;
            C116660y.m164526d(yVar);
            C115669n.INSTANCE.mo160131h(14404, 3, this.f349814a.f349832c, 7, Integer.valueOf(i), Integer.valueOf(this.f349814a.f349831b));
            if (!C116660y.this.f349804f.isEmpty()) {
                C116660y.this.mo180660H0();
            } else {
                C116660y.m164524O();
            }
            return false;
        }
    }

    /* renamed from: e21.y$c */
    public class C116663c implements Runnable {
        public C116663c() {
        }

        public void run() {
            C116660y yVar = C116660y.this;
            if (yVar.f349802d != null && yVar.f349805g && yVar.f349803e == null) {
                Log.m105924i("MicroMsg.F2fRcvVoiceListener", "this play may error");
                C115669n.INSTANCE.idkeyStat(699, 1, 1, false);
            }
        }
    }

    /* renamed from: e21.y$d */
    public class C116664d implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final /* synthetic */ C116672j f349817a;

        public C116664d(C116672j jVar) {
            this.f349817a = jVar;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            Log.m105924i("MicroMsg.F2fRcvVoiceListener", "no need to play money this time");
            C116660y.m164526d(C116660y.this);
            C116660y yVar = C116660y.this;
            yVar.f349805g = false;
            yVar.f349802d = null;
            if (C113081b.yx0().f338485d) {
                C115669n nVar = C115669n.INSTANCE;
                C116672j jVar = this.f349817a;
                nVar.mo160131h(14404, 4, jVar.f349832c, "", "", Integer.valueOf(jVar.f349831b));
            } else {
                C115669n nVar2 = C115669n.INSTANCE;
                C116672j jVar2 = this.f349817a;
                nVar2.mo160131h(14404, 4, jVar2.f349832c, "", "", Integer.valueOf(jVar2.f349831b));
            }
            if (!C116660y.this.f349804f.isEmpty()) {
                C116660y.this.mo180660H0();
            } else {
                C116660y.m164524O();
            }
        }
    }

    /* renamed from: e21.y$e */
    public class C116665e implements MediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final /* synthetic */ C116672j f349819a;

        public C116665e(C116672j jVar) {
            this.f349819a = jVar;
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.m105920e("MicroMsg.F2fRcvVoiceListener", "no need play money error");
            C116660y.m164526d(C116660y.this);
            C116660y yVar = C116660y.this;
            yVar.f349805g = false;
            yVar.f349802d = null;
            C115669n.INSTANCE.mo160131h(14404, 3, this.f349819a.f349832c, 7, Integer.valueOf(i), Integer.valueOf(this.f349819a.f349831b));
            return false;
        }
    }

    /* renamed from: e21.y$f */
    public class C116666f implements MediaPlayer.OnCompletionListener {
        public C116666f() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            Log.m105924i("MicroMsg.F2fRcvVoiceListener", "play done");
            C116660y yVar = C116660y.this;
            yVar.f349805g = false;
            yVar.f349803e = null;
            C116660y.m164526d(yVar);
            if (!C116660y.this.f349804f.isEmpty()) {
                C116660y.this.mo180660H0();
            } else {
                C116660y.m164524O();
            }
        }
    }

    /* renamed from: e21.y$g */
    public class C116667g implements MediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final /* synthetic */ C116672j f349822a;

        public C116667g(C116672j jVar) {
            this.f349822a = jVar;
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.m105921e("MicroMsg.F2fRcvVoiceListener", "play money error: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
            C116660y yVar = C116660y.this;
            yVar.f349805g = false;
            yVar.f349803e = null;
            C115669n.INSTANCE.mo160131h(14404, 3, this.f349822a.f349832c, 7, Integer.valueOf(i), Integer.valueOf(this.f349822a.f349831b));
            C116660y.m164526d(C116660y.this);
            if (!C116660y.this.f349804f.isEmpty()) {
                C116660y.this.mo180660H0();
            } else {
                C116660y.m164524O();
            }
            return false;
        }
    }

    /* renamed from: e21.y$h */
    public class C116668h {

        /* renamed from: a */
        public final /* synthetic */ C116672j f349824a;

        public C116668h(C116660y yVar, C116672j jVar) {
            this.f349824a = jVar;
        }

        /* renamed from: a */
        public void mo180674a() {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(1143, 41, 1, false);
            if (C113081b.yx0().f338485d) {
                Log.m105924i("MicroMsg.F2fRcvVoiceListener", "play isForground");
                if (this.f349824a.f349833d) {
                    C116672j jVar = this.f349824a;
                    nVar.mo160131h(14404, 1, jVar.f349832c, "", "", Integer.valueOf(jVar.f349831b), "", "", "", F2fRcvVoiceOffLineLogic.m162050d().mo175083e());
                    return;
                }
                C116672j jVar2 = this.f349824a;
                nVar.mo160131h(14404, 1, jVar2.f349832c, "", "", Integer.valueOf(jVar2.f349831b));
                return;
            }
            Log.m105924i("MicroMsg.F2fRcvVoiceListener", "play isBackground");
            if (this.f349824a.f349833d) {
                C116672j jVar3 = this.f349824a;
                nVar.mo160131h(14404, 2, jVar3.f349832c, "", "", Integer.valueOf(jVar3.f349831b), "", "", "", F2fRcvVoiceOffLineLogic.m162050d().mo175083e());
                return;
            }
            C116672j jVar4 = this.f349824a;
            nVar.mo160131h(14404, 2, jVar4.f349832c, "", "", Integer.valueOf(jVar4.f349831b));
        }
    }

    /* renamed from: e21.y$i */
    public static class C116669i {

        /* renamed from: e21.y$i$a */
        public class C116670a implements MediaPlayer.OnErrorListener {

            /* renamed from: a */
            public final /* synthetic */ MediaPlayer f349825a;

            /* renamed from: b */
            public final /* synthetic */ MediaPlayer.OnErrorListener f349826b;

            public C116670a(MediaPlayer mediaPlayer, MediaPlayer.OnErrorListener onErrorListener) {
                this.f349825a = mediaPlayer;
                this.f349826b = onErrorListener;
            }

            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                Log.m105925i("MicroMsg.F2fRcvVoiceListener", "onError, what: %d, extra: %d", Integer.valueOf(i), Integer.valueOf(i2));
                if (mediaPlayer != null) {
                    try {
                        mediaPlayer.release();
                    } catch (Exception unused) {
                    }
                }
                MediaPlayer mediaPlayer2 = this.f349825a;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.release();
                }
                MediaPlayer.OnErrorListener onErrorListener = this.f349826b;
                if (onErrorListener != null) {
                    onErrorListener.onError(mediaPlayer, i, i2);
                }
                return false;
            }
        }

        /* renamed from: e21.y$i$b */
        public class C116671b implements MediaPlayer.OnCompletionListener {

            /* renamed from: a */
            public final /* synthetic */ String f349827a;

            /* renamed from: b */
            public final /* synthetic */ MediaPlayer f349828b;

            /* renamed from: c */
            public final /* synthetic */ MediaPlayer.OnCompletionListener f349829c;

            public C116671b(String str, MediaPlayer mediaPlayer, MediaPlayer.OnCompletionListener onCompletionListener) {
                this.f349827a = str;
                this.f349828b = mediaPlayer;
                this.f349829c = onCompletionListener;
            }

            public void onCompletion(MediaPlayer mediaPlayer) {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
                objArr[1] = this.f349827a;
                Log.m105925i("MicroMsg.F2fRcvVoiceListener", "play completion mp:%d  path:%s", objArr);
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
                MediaPlayer mediaPlayer2 = this.f349828b;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.release();
                }
                MediaPlayer.OnCompletionListener onCompletionListener = this.f349829c;
                if (onCompletionListener != null) {
                    onCompletionListener.onCompletion(mediaPlayer);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00de A[SYNTHETIC, Splitter:B:33:0x00de] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00ec A[SYNTHETIC, Splitter:B:39:0x00ec] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.media.MediaPlayer m164540a(android.content.Context r16, int r17, android.media.MediaPlayer.OnCompletionListener r18, android.media.MediaPlayer.OnErrorListener r19) {
            /*
                java.lang.String r1 = ""
                r2 = 0
                r3 = 2
                r4 = 1
                java.lang.String r5 = "MicroMsg.F2fRcvVoiceListener"
                r6 = 0
                if (r16 != 0) goto L_0x001b
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r16
                java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
                r0[r4] = r1
                java.lang.String r1 = "play Err context:%s pathId:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r0)
                return r2
            L_0x001b:
                java.lang.String r0 = r16.getString(r17)
                android.media.MediaPlayer r13 = e21.C116660y.m164527q()
                r14 = 3
                r13.setAudioStreamType(r14)
                r7 = 4
                java.lang.Object[] r7 = new java.lang.Object[r7]
                int r8 = r13.hashCode()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r7[r6] = r8
                r7[r4] = r0
                r7[r3] = r16
                java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
                r7[r14] = r8
                java.lang.String r8 = "play start mp:%d path:%s context:%s pathId:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r7)
                android.content.res.AssetManager r7 = r16.getAssets()     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
                android.content.res.AssetFileDescriptor r15 = r7.openFd(r0)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
                java.io.FileDescriptor r8 = r15.getFileDescriptor()     // Catch:{ Exception -> 0x00b9 }
                long r9 = r15.getStartOffset()     // Catch:{ Exception -> 0x00b9 }
                long r11 = r15.getLength()     // Catch:{ Exception -> 0x00b9 }
                r7 = r13
                r7.setDataSource(r8, r9, r11)     // Catch:{ Exception -> 0x00b9 }
                r13.setLooping(r6)     // Catch:{ Exception -> 0x00b9 }
                e21.y$i$a r7 = new e21.y$i$a     // Catch:{ Exception -> 0x00b9 }
                r8 = r19
                r7.<init>(r13, r8)     // Catch:{ Exception -> 0x00b9 }
                r13.setOnErrorListener(r7)     // Catch:{ Exception -> 0x00b9 }
                e21.y$i$b r7 = new e21.y$i$b     // Catch:{ Exception -> 0x00b9 }
                r8 = r18
                r7.<init>(r0, r13, r8)     // Catch:{ Exception -> 0x00b9 }
                r13.setOnCompletionListener(r7)     // Catch:{ Exception -> 0x00b9 }
                r13.prepare()     // Catch:{ Exception -> 0x00b9 }
                r13.start()     // Catch:{ Exception -> 0x00b9 }
                java.lang.String r0 = "play start mp finish [%d], myLooper[%b] mainLooper[%b]"
                java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x00b9 }
                int r8 = r13.hashCode()     // Catch:{ Exception -> 0x00b9 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x00b9 }
                r7[r6] = r8     // Catch:{ Exception -> 0x00b9 }
                android.os.Looper r8 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00b9 }
                if (r8 == 0) goto L_0x0090
                r8 = 1
                goto L_0x0091
            L_0x0090:
                r8 = 0
            L_0x0091:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x00b9 }
                r7[r4] = r8     // Catch:{ Exception -> 0x00b9 }
                android.os.Looper r8 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00b9 }
                if (r8 == 0) goto L_0x009f
                r8 = 1
                goto L_0x00a0
            L_0x009f:
                r8 = 0
            L_0x00a0:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x00b9 }
                r7[r3] = r8     // Catch:{ Exception -> 0x00b9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r7)     // Catch:{ Exception -> 0x00b9 }
                r15.close()     // Catch:{ IOException -> 0x00ad }
                goto L_0x00b4
            L_0x00ad:
                r0 = move-exception
                r2 = r0
                java.lang.Object[] r0 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r2, r1, r0)
            L_0x00b4:
                return r13
            L_0x00b5:
                r0 = move-exception
                r3 = r0
                r2 = r15
                goto L_0x00ea
            L_0x00b9:
                r0 = move-exception
                goto L_0x00c0
            L_0x00bb:
                r0 = move-exception
                r3 = r0
                goto L_0x00ea
            L_0x00be:
                r0 = move-exception
                r15 = r2
            L_0x00c0:
                java.lang.String r7 = "play failed pathId:%d e:%s"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b5 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x00b5 }
                r3[r6] = r8     // Catch:{ all -> 0x00b5 }
                java.lang.String r8 = r0.getMessage()     // Catch:{ all -> 0x00b5 }
                r3[r4] = r8     // Catch:{ all -> 0x00b5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r3)     // Catch:{ all -> 0x00b5 }
                java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b5 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r1, r3)     // Catch:{ all -> 0x00b5 }
                r13.release()     // Catch:{ all -> 0x00b5 }
                if (r15 == 0) goto L_0x00e9
                r15.close()     // Catch:{ IOException -> 0x00e2 }
                goto L_0x00e9
            L_0x00e2:
                r0 = move-exception
                r3 = r0
                java.lang.Object[] r0 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r3, r1, r0)
            L_0x00e9:
                return r2
            L_0x00ea:
                if (r2 == 0) goto L_0x00f7
                r2.close()     // Catch:{ IOException -> 0x00f0 }
                goto L_0x00f7
            L_0x00f0:
                r0 = move-exception
                r2 = r0
                java.lang.Object[] r0 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r2, r1, r0)
            L_0x00f7:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: e21.C116660y.C116669i.m164540a(android.content.Context, int, android.media.MediaPlayer$OnCompletionListener, android.media.MediaPlayer$OnErrorListener):android.media.MediaPlayer");
        }
    }

    /* renamed from: e21.y$j */
    public class C116672j {

        /* renamed from: a */
        public String f349830a;

        /* renamed from: b */
        public int f349831b;

        /* renamed from: c */
        public String f349832c;

        /* renamed from: d */
        public boolean f349833d = false;

        public C116672j(C116660y yVar, C116661a aVar) {
        }
    }

    static {
        int i = C58834h.f168432b;
    }

    /* renamed from: O */
    public static boolean m164524O() {
        Log.m105924i("MicroMsg.F2fRcvVoiceListener", "delete files");
        return C86013q1.m106446g(m164525Q(), true);
    }

    /* renamed from: Q */
    public static String m164525Q() {
        return C112760b.m154195C() + "wallet/voice" + "/";
    }

    /* renamed from: d */
    public static void m164526d(C116660y yVar) {
        Log.m105925i("MicroMsg.F2fRcvVoiceListener", "reset user vol: %s", Integer.valueOf(yVar.f349806h));
        ((C45426j) C86312j.m106911c(C45426j.class)).n40().mo157508g(3, yVar.f349806h, 0);
    }

    /* renamed from: q */
    public static MediaPlayer m164527q() {
        Looper myLooper = Looper.myLooper();
        Log.m105925i("MicroMsg.F2fRcvVoiceListener", "[syncCreatePlayer] %s", myLooper);
        if (myLooper == null || myLooper == Looper.getMainLooper() || myLooper == f349801r.getLooper()) {
            return new C97481g();
        }
        if (!f349801r.isAlive()) {
            f349801r.start();
        }
        MMHandler mMHandler = new MMHandler(f349801r.getLooper());
        Object obj = new Object();
        MediaPlayer[] mediaPlayerArr = {null};
        synchronized (obj) {
            mMHandler.post(new C116676z(mediaPlayerArr, obj));
            try {
                obj.wait();
            } catch (InterruptedException e) {
                Log.printErrStackTrace("MicroMsg.F2fRcvVoiceListener", e, "", new Object[0]);
            }
        }
        return mediaPlayerArr[0];
    }

    /* renamed from: B */
    public final int mo180657B() {
        return ((C45426j) C86312j.m106911c(C45426j.class)).Jh0() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        if (r3.size() <= 10) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.F2fRcvVoiceListener", "over max size, do remove");
        r2 = r3.size();
        r3 = r3.subList(r2 - 10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        f40.C86709a0.m107535s().mo121142i().mo119677K(com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_F2F_RCV_VOICE_PLAYED_LIST_STRING_SYNC, com.tencent.p014mm.sdk.platformtools.Util.listToString(r3, ","));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c2, code lost:
        r8 = false;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo180658D(com.tencent.p014mm.autogen.events.CollectRcvVoiceEvent r25, boolean r26, boolean r27) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            java.lang.String r2 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r3 = "callbackImp() tradeNo:%s useOffline:%s"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r6 = r0.f193526d
            java.lang.String r6 = r6.f193529c
            r7 = 0
            r5[r7] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r26)
            r8 = 1
            r5[r8] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r2 = r0.f193526d
            long r5 = r2.f193531e
            java.lang.String r2 = r2.f193530d
            java.lang.String r3 = "wx_f2f"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x015c
            b21.b r2 = b21.C113081b.yx0()
            boolean r2 = r2.Ax0()
            java.lang.String r3 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r9 = "on recv, fee: %s, voice open: %B"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r10 = r0.f193526d
            int r10 = r10.f193527a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4[r7] = r10
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r4)
            if (r27 != 0) goto L_0x00c9
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r2 = r0.f193526d
            java.lang.String r2 = r2.f193529c
            monitor-enter(r24)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x0066
            java.lang.String r3 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r4 = "illegal no: %s, not do play"
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c6 }
            r9[r7] = r2     // Catch:{ all -> 0x00c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r4, r9)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r24)
            goto L_0x00c3
        L_0x0066:
            java.util.List r3 = r24.mo180662f0()     // Catch:{ all -> 0x00c6 }
            java.util.List r4 = r24.mo180662f0()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x0072:
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x0091
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x00c6 }
            boolean r9 = r9.equals(r2)     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x0072
            java.lang.String r3 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r4 = "has played tradeno: %s"
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c6 }
            r9[r7] = r2     // Catch:{ all -> 0x00c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r9)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r24)
            goto L_0x00c3
        L_0x0091:
            r3.add(r2)     // Catch:{ all -> 0x00c6 }
            int r2 = r3.size()     // Catch:{ all -> 0x00c6 }
            r4 = 10
            if (r2 <= r4) goto L_0x00ae
            java.lang.String r2 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r4 = "over max size, do remove"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x00c6 }
            int r2 = r3.size()     // Catch:{ all -> 0x00c6 }
            int r4 = r2 + -10
            java.util.List r3 = r3.subList(r4, r2)     // Catch:{ all -> 0x00c6 }
        L_0x00ae:
            f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x00c6 }
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()     // Catch:{ all -> 0x00c6 }
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_F2F_RCV_VOICE_PLAYED_LIST_STRING_SYNC     // Catch:{ all -> 0x00c6 }
            java.lang.String r8 = ","
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r3, r8)     // Catch:{ all -> 0x00c6 }
            r2.mo119677K(r4, r3)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r24)
            r8 = 0
        L_0x00c3:
            if (r8 != 0) goto L_0x01b9
            goto L_0x00c9
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        L_0x00c9:
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r2 = r0.f193526d
            int r2 = r2.f193532f
            if (r2 != 0) goto L_0x00dc
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 699(0x2bb, double:3.454E-321)
            r11 = 8
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            goto L_0x00e9
        L_0x00dc:
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 699(0x2bb, double:3.454E-321)
            r19 = 9
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
        L_0x00e9:
            if (r26 == 0) goto L_0x0107
            boolean r2 = com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic.f345523i
            if (r2 != 0) goto L_0x0107
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r2 = r0.f193526d
            java.lang.String r2 = r2.f193533g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0107
            java.lang.String r2 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r3 = "init tts"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic r2 = com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic.m162050d()
            r2.mo175086k(r7)
        L_0x0107:
            if (r26 == 0) goto L_0x0133
            boolean r2 = com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic.f345523i
            if (r2 == 0) goto L_0x0133
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r2 = r0.f193526d
            java.lang.String r2 = r2.f193533g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0133
            java.lang.String r2 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r3 = "useOffline"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.util.Map<java.lang.String, com.tencent.mm.autogen.events.CollectRcvVoiceEvent> r2 = r1.f349811p
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r3 = r0.f193526d
            java.lang.String r3 = r3.f193529c
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r3, r0)
            com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic r2 = com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic.m162050d()
            r2.mo175087l(r0)
            goto L_0x01b9
        L_0x0133:
            java.lang.String r2 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r3 = "useOnline"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            e21.e0 r2 = new e21.e0
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r0 = r0.f193526d
            int r10 = r0.f193527a
            r11 = 0
            r12 = 0
            pe3.b r13 = f349800q
            java.lang.String r14 = r0.f193529c
            int r15 = r0.f193532f
            r9 = r2
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r0.mo123460f(r2)
            goto L_0x01b9
        L_0x015c:
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r2 = r0.f193526d
            java.lang.String r2 = r2.f193530d
            java.lang.String r3 = "wx_md"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01a9
            if (r26 == 0) goto L_0x018c
            boolean r2 = com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic.f345523i
            if (r2 == 0) goto L_0x018c
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r2 = r0.f193526d
            java.lang.String r2 = r2.f193533g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x018c
            java.util.Map<java.lang.String, com.tencent.mm.autogen.events.CollectRcvVoiceEvent> r2 = r1.f349811p
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r3 = r0.f193526d
            java.lang.String r3 = r3.f193529c
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r3, r0)
            com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic r2 = com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic.m162050d()
            r2.mo175087l(r0)
            goto L_0x01b9
        L_0x018c:
            e21.k0 r2 = new e21.k0
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r0 = r0.f193526d
            int r4 = r0.f193527a
            r5 = 0
            r6 = 0
            pe3.b r7 = f349800q
            java.lang.String r8 = r0.f193529c
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r0.mo123460f(r2)
            goto L_0x01b9
        L_0x01a9:
            java.lang.String r2 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r3 = "unknown type: %s"
            java.lang.Object[] r4 = new java.lang.Object[r8]
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r0 = r0.f193526d
            java.lang.String r0 = r0.f193530d
            r4[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r4)
        L_0x01b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.C116660y.mo180658D(com.tencent.mm.autogen.events.CollectRcvVoiceEvent, boolean, boolean):void");
    }

    /* renamed from: E0 */
    public final boolean mo180659E0(String str, byte[] bArr) {
        C86709a0.m107528h();
        if (C86709a0.m107535s().mo121147n()) {
            return C86013q1.m106438T(str, bArr, 0, bArr.length) == 0;
        }
        Log.m105924i("MicroMsg.F2fRcvVoiceListener", "sd card not available");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e0, code lost:
        return;
     */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo180660H0() {
        /*
            r20 = this;
            r1 = r20
            java.lang.Class<dn.j> r0 = p492dn.C45426j.class
            monitor-enter(r20)
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01e1 }
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x01e1 }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ all -> 0x01e1 }
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_f2f_voice_overtime     // Catch:{ all -> 0x01e1 }
            r6 = 10000(0x2710, double:4.9407E-320)
            long r4 = r4.mo58777He(r5, r6)     // Catch:{ all -> 0x01e1 }
            java.lang.String r6 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r7 = "voiceOvertime: %s"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x01e1 }
            java.lang.Long r10 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x01e1 }
            r11 = 0
            r9[r11] = r10     // Catch:{ all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r9)     // Catch:{ all -> 0x01e1 }
            boolean r6 = r1.f349805g     // Catch:{ all -> 0x01e1 }
            if (r6 == 0) goto L_0x0054
            long r6 = r1.f349808j     // Catch:{ all -> 0x01e1 }
            long r2 = r2 - r6
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0054
            java.lang.String r2 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r3 = "last has outdate: %s"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x01e1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01e1 }
            r4[r11] = r5     // Catch:{ all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)     // Catch:{ all -> 0x01e1 }
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x01e1 }
            r13 = 1143(0x477, double:5.647E-321)
            r15 = 42
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)     // Catch:{ all -> 0x01e1 }
            r1.f349805g = r11     // Catch:{ all -> 0x01e1 }
        L_0x0054:
            boolean r2 = r1.f349805g     // Catch:{ all -> 0x01e1 }
            if (r2 == 0) goto L_0x0061
            java.lang.String r0 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r2 = "is playing, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r20)
            return
        L_0x0061:
            r1.f349805g = r8     // Catch:{ all -> 0x01e1 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01e1 }
            r1.f349808j = r2     // Catch:{ all -> 0x01e1 }
            java.util.concurrent.ConcurrentLinkedQueue<e21.y$j> r2 = r1.f349804f     // Catch:{ all -> 0x01e1 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x01e1 }
            e21.y$j r2 = (e21.C116660y.C116672j) r2     // Catch:{ all -> 0x01e1 }
            di3.d r3 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x01e1 }
            dn.j r3 = (p492dn.C45426j) r3     // Catch:{ all -> 0x01e1 }
            dn.n r3 = r3.n40()     // Catch:{ all -> 0x01e1 }
            r4 = 3
            int r3 = r3.mo157507d(r4)     // Catch:{ all -> 0x01e1 }
            di3.d r5 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x01e1 }
            dn.j r5 = (p492dn.C45426j) r5     // Catch:{ all -> 0x01e1 }
            dn.n r5 = r5.n40()     // Catch:{ all -> 0x01e1 }
            int r5 = r5.mo157506c(r4)     // Catch:{ all -> 0x01e1 }
            r1.f349806h = r5     // Catch:{ all -> 0x01e1 }
            float r5 = (float) r3     // Catch:{ all -> 0x01e1 }
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)     // Catch:{ all -> 0x01e1 }
            r1.f349807i = r5     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r6 = "curVol: %s, maxVol: %s, minVol: %s"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e1 }
            int r9 = r1.f349806h     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01e1 }
            r7[r11] = r9     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01e1 }
            r7[r8] = r3     // Catch:{ all -> 0x01e1 }
            int r3 = r1.f349807i     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01e1 }
            r9 = 2
            r7[r9] = r3     // Catch:{ all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)     // Catch:{ all -> 0x01e1 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01e1 }
            r5 = 23
            if (r3 < r5) goto L_0x00df
            di3.d r3 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x01e1 }
            dn.j r3 = (p492dn.C45426j) r3     // Catch:{ all -> 0x01e1 }
            dn.n r3 = r3.n40()     // Catch:{ all -> 0x01e1 }
            boolean r3 = r3.mo157505H(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r6 = "isMute: %s"
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x01e1 }
            r7[r11] = r10     // Catch:{ all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)     // Catch:{ all -> 0x01e1 }
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            int r5 = r1.f349806h     // Catch:{ all -> 0x01e1 }
            if (r5 == 0) goto L_0x00e6
            if (r3 == 0) goto L_0x011d
        L_0x00e6:
            java.lang.String r5 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r6 = "music channel is mute"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x01e1 }
            if (r2 == 0) goto L_0x00f2
            int r5 = r2.f349831b     // Catch:{ all -> 0x01e1 }
            goto L_0x00f3
        L_0x00f2:
            r5 = 1
        L_0x00f3:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x01e1 }
            r7 = 14404(0x3844, float:2.0184E-41)
            r10 = 5
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01e1 }
            r12[r11] = r13     // Catch:{ all -> 0x01e1 }
            if (r2 == 0) goto L_0x0105
            java.lang.String r13 = r2.f349832c     // Catch:{ all -> 0x01e1 }
            goto L_0x0107
        L_0x0105:
            java.lang.String r13 = ""
        L_0x0107:
            r12[r8] = r13     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01e1 }
            r12[r9] = r10     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = ""
            r12[r4] = r10     // Catch:{ all -> 0x01e1 }
            r10 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01e1 }
            r12[r10] = r5     // Catch:{ all -> 0x01e1 }
            r6.mo160131h(r7, r12)     // Catch:{ all -> 0x01e1 }
        L_0x011d:
            int r5 = r1.f349806h     // Catch:{ all -> 0x01e1 }
            if (r5 <= 0) goto L_0x0136
            int r6 = r1.f349807i     // Catch:{ all -> 0x01e1 }
            if (r5 >= r6) goto L_0x0136
            if (r3 != 0) goto L_0x0136
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x01e1 }
            dn.j r0 = (p492dn.C45426j) r0     // Catch:{ all -> 0x01e1 }
            dn.n r0 = r0.n40()     // Catch:{ all -> 0x01e1 }
            int r3 = r1.f349807i     // Catch:{ all -> 0x01e1 }
            r0.mo157508g(r4, r3, r11)     // Catch:{ all -> 0x01e1 }
        L_0x0136:
            if (r2 == 0) goto L_0x01dd
            java.lang.String r0 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r3 = "holder.offLine = %s"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x01e1 }
            boolean r5 = r2.f349833d     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x01e1 }
            r4[r11] = r5     // Catch:{ all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)     // Catch:{ all -> 0x01e1 }
            boolean r0 = r2.f349833d     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0169
            r1.mo180663g0(r2)     // Catch:{ all -> 0x01e1 }
            boolean r0 = r1.f349805g     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0161
            android.media.MediaPlayer r0 = r1.f349803e     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x0161
            java.lang.String r0 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r2 = "isPlaying && moneyPlayer == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x01e1 }
            goto L_0x01df
        L_0x0161:
            java.lang.String r0 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r2 = "has played"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x01e1 }
            goto L_0x01df
        L_0x0169:
            int r0 = r2.f349831b     // Catch:{ all -> 0x01e1 }
            r3 = 2131823927(0x7f110d37, float:1.9280667E38)
            java.lang.String r4 = r2.f349830a     // Catch:{ all -> 0x01e1 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x01e1 }
            if (r4 != 0) goto L_0x01bc
            java.lang.String r4 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r5 = "play prefix voice: %d"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e1 }
            r6[r11] = r0     // Catch:{ all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)     // Catch:{ all -> 0x01e1 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x01e1 }
            e21.y$a r4 = new e21.y$a     // Catch:{ all -> 0x01e1 }
            r4.<init>(r2)     // Catch:{ all -> 0x01e1 }
            e21.y$b r5 = new e21.y$b     // Catch:{ all -> 0x01e1 }
            r5.<init>(r2)     // Catch:{ all -> 0x01e1 }
            android.media.MediaPlayer r0 = e21.C116660y.C116669i.m164540a(r0, r3, r4, r5)     // Catch:{ all -> 0x01e1 }
            r1.f349802d = r0     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x01df
            int r0 = r0.getDuration()     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = "MicroMsg.F2fRcvVoiceListener"
            java.lang.String r3 = "prefix duration: %s"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e1 }
            r4[r11] = r5     // Catch:{ all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)     // Catch:{ all -> 0x01e1 }
            e21.y$c r2 = new e21.y$c     // Catch:{ all -> 0x01e1 }
            r2.<init>()     // Catch:{ all -> 0x01e1 }
            int r0 = r0 + 1000
            long r3 = (long) r0     // Catch:{ all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r2, r3)     // Catch:{ all -> 0x01e1 }
            goto L_0x01df
        L_0x01bc:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x01e1 }
            e21.y$d r4 = new e21.y$d     // Catch:{ all -> 0x01e1 }
            r4.<init>(r2)     // Catch:{ all -> 0x01e1 }
            e21.y$e r5 = new e21.y$e     // Catch:{ all -> 0x01e1 }
            r5.<init>(r2)     // Catch:{ all -> 0x01e1 }
            android.media.MediaPlayer r0 = e21.C116660y.C116669i.m164540a(r0, r3, r4, r5)     // Catch:{ all -> 0x01e1 }
            r1.f349802d = r0     // Catch:{ all -> 0x01e1 }
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x01e1 }
            r3 = 699(0x2bb, double:3.454E-321)
            r5 = 2
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)     // Catch:{ all -> 0x01e1 }
            goto L_0x01df
        L_0x01dd:
            r1.f349805g = r11     // Catch:{ all -> 0x01e1 }
        L_0x01df:
            monitor-exit(r20)
            return
        L_0x01e1:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.C116660y.mo180660H0():void");
    }

    /* renamed from: S */
    public final int mo180661S(String str) {
        if (str.equals("wx_f2f")) {
            return 1;
        }
        return str.equals("wx_md") ? 2 : 0;
    }

    public boolean callback(IEvent iEvent) {
        CollectRcvVoiceEvent collectRcvVoiceEvent = (CollectRcvVoiceEvent) iEvent;
        CollectRcvVoiceEvent.C67672a aVar = collectRcvVoiceEvent.f193526d;
        CollectRcvVoiceEvent.C67672a aVar2 = collectRcvVoiceEvent.f193526d;
        Log.m105925i("MicroMsg.F2fRcvVoiceListener", "feeType: %s, voiceContent: %s, source: %s, tradeNo: %s, expireVoiceTimestamp: %s F2fRcvVoiceOffLineLogic.OFF_LINE: %s needFailover：%s", aVar.f193528b, aVar.f193533g, Integer.valueOf(aVar.f193532f), aVar2.f193529c, aVar2.f193534h, Boolean.valueOf(F2fRcvVoiceOffLineLogic.f345523i), Boolean.valueOf(collectRcvVoiceEvent.f193526d.f193535i));
        long j = collectRcvVoiceEvent.f193526d.f193531e;
        if (j > 60000) {
            Log.m105925i("MicroMsg.F2fRcvVoiceListener", "delay over 1min: %s, tradeNo: %s", Long.valueOf(j), collectRcvVoiceEvent.f193526d.f193529c);
            if (j <= 120000) {
                C115669n.INSTANCE.idkeyStat(699, 3, 1, false);
            } else if (j <= 300000) {
                C115669n.INSTANCE.idkeyStat(699, 4, 1, false);
            } else if (j <= 600000) {
                C115669n.INSTANCE.idkeyStat(699, 5, 1, false);
            } else if (j <= 1800000) {
                C115669n.INSTANCE.idkeyStat(699, 6, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(699, 7, 1, false);
            }
        }
        long j2 = !Util.isNullOrNil(collectRcvVoiceEvent.f193526d.f193534h) ? Util.getLong(collectRcvVoiceEvent.f193526d.f193534h, 0) : 0;
        if (!Util.isEqual(j2, 0) ? C31543z5.m39451a() / 1000 <= j2 : j <= 600000) {
            mo180658D(collectRcvVoiceEvent, true, false);
        } else {
            Log.m105924i("MicroMsg.F2fRcvVoiceListener", "offline Synthesize delay > 10min or CurrentServerTime > expireVoiceTimestamp");
            if (!F2fRcvVoiceOffLineLogic.f345523i || Util.isNullOrNil(collectRcvVoiceEvent.f193526d.f193533g)) {
                CollectRcvVoiceEvent.C67672a aVar3 = collectRcvVoiceEvent.f193526d;
                String str = aVar3.f193529c;
                int S = mo180661S(aVar3.f193530d);
                CollectRcvVoiceEvent.C67672a aVar4 = collectRcvVoiceEvent.f193526d;
                mo180665n0(3, str, S, aVar4.f193533g, aVar4.f193527a, F2fRcvVoiceOffLineLogic.m162050d().mo175083e(), 10);
            } else {
                CollectRcvVoiceEvent.C67672a aVar5 = collectRcvVoiceEvent.f193526d;
                String str2 = aVar5.f193529c;
                int S2 = mo180661S(aVar5.f193530d);
                CollectRcvVoiceEvent.C67672a aVar6 = collectRcvVoiceEvent.f193526d;
                mo180665n0(6, str2, S2, aVar6.f193533g, aVar6.f193527a, F2fRcvVoiceOffLineLogic.m162050d().mo175083e(), 10);
            }
        }
        return false;
    }

    /* renamed from: f0 */
    public final List<String> mo180662f0() {
        WeakReference<ArrayList<String>> weakReference = this.f349809n;
        if (weakReference == null || weakReference.get() == null) {
            Log.m105924i("MicroMsg.F2fRcvVoiceListener", "refer is null");
            this.f349809n = new WeakReference<>(new ArrayList(Util.stringToList((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_F2F_RCV_VOICE_PLAYED_LIST_STRING_SYNC, ""), ",")));
        }
        return this.f349809n.get();
    }

    /* renamed from: g0 */
    public final void mo180663g0(C116672j jVar) {
        String str = jVar.f349830a;
        C116666f fVar = new C116666f();
        C116667g gVar = new C116667g(jVar);
        C116668h hVar = new C116668h(this, jVar);
        MediaPlayer q = m164527q();
        q.setAudioStreamType(3);
        Log.m105925i("MicroMsg.F2fRcvVoiceListener", "play start mp:%d path:%s", Integer.valueOf(q.hashCode()), str);
        try {
            q.setDataSource(str);
            q.setLooping(false);
            q.setOnErrorListener(new C116639a0(q, gVar));
            q.setOnCompletionListener(new C116640b0(str, q, fVar));
            q.prepare();
            q.start();
            hVar.mo180674a();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(q.hashCode());
            objArr[1] = Boolean.valueOf(Looper.myLooper() != null);
            objArr[2] = Boolean.valueOf(Looper.getMainLooper() != null);
            Log.m105925i("MicroMsg.F2fRcvVoiceListener", "play start mp finish [%d], myLooper[%b] mainLooper[%b]", objArr);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.F2fRcvVoiceListener", "play failed path:%s e:%s", str, e.getMessage());
            Log.printErrStackTrace("MicroMsg.F2fRcvVoiceListener", e, "", new Object[0]);
            q.release();
            q = null;
        }
        this.f349803e = q;
    }

    /* renamed from: j0 */
    public final void mo180664j0(int i, String str) {
        Log.m105924i("MicroMsg.F2fRcvVoiceListener", "play default sound only");
        C116672j jVar = new C116672j(this, (C116661a) null);
        jVar.f349831b = i;
        jVar.f349832c = str;
        this.f349804f.add(jVar);
        mo180660H0();
    }

    /* renamed from: n0 */
    public final void mo180665n0(int i, String str, int i2, String str2, int i3, String str3, int i4) {
        WCPayF2FVoicePushReportStruct wCPayF2FVoicePushReportStruct = new WCPayF2FVoicePushReportStruct();
        this.f349810o = wCPayF2FVoicePushReportStruct;
        wCPayF2FVoicePushReportStruct.f343858d = (long) i;
        wCPayF2FVoicePushReportStruct.f343859e = wCPayF2FVoicePushReportStruct.mo86045b("BiilNo", str, true);
        if (!Util.isEqual(i4, 0)) {
            this.f349810o.f343860f = (long) i4;
        }
        this.f349810o.f343861g = (long) i2;
        if (str2.contains(",")) {
            str2 = str2.replaceAll(",", "").trim();
        }
        WCPayF2FVoicePushReportStruct wCPayF2FVoicePushReportStruct2 = this.f349810o;
        wCPayF2FVoicePushReportStruct2.f343862h = wCPayF2FVoicePushReportStruct2.mo86045b("content", str2, true);
        this.f349810o.f343863i = (long) i3;
        if (Util.isEqual(i, 6)) {
            WCPayF2FVoicePushReportStruct wCPayF2FVoicePushReportStruct3 = this.f349810o;
            wCPayF2FVoicePushReportStruct3.f343864j = wCPayF2FVoicePushReportStruct3.mo86045b("packId", str3, true);
        }
        this.f349810o.mo86054n();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89349b bVar;
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        Log.m105924i("MicroMsg.F2fRcvVoiceListener", "errType:" + i3 + " errCode:" + i4 + " errMsg:" + str + " scenetype:" + yVar.getType());
        if (yVar2 instanceof C45531e0) {
            C45531e0 e0Var = (C45531e0) yVar2;
            if (i3 == 0 && i4 == 0) {
                Log.m105925i("MicroMsg.F2fRcvVoiceListener", "overtime: %s retcode: %s", Integer.valueOf(e0Var.f123195f.f138140h), Integer.valueOf(e0Var.f123195f.f138136d));
                C50430mp mpVar = e0Var.f123195f;
                int i5 = mpVar.f138140h;
                if (i5 == 1) {
                    Log.m105929w("MicroMsg.F2fRcvVoiceListener", "skip over 10min: %s", Long.valueOf(e0Var.f123198i));
                    C115669n.INSTANCE.mo160131h(14404, 3, e0Var.f123196g, 1, "", 1);
                    return;
                }
                int i6 = mpVar.f138136d;
                if (i6 != 0 || (bVar = mpVar.f138138f) == null) {
                    C45531e0 e0Var2 = e0Var;
                    Object obj = "";
                    if (i6 <= 100) {
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(i6);
                        objArr[1] = e0Var2.f123195f.f138138f == null ? "null" : "not null";
                        Log.m105925i("MicroMsg.F2fRcvVoiceListener", "play default sound only %s %s", objArr);
                        mo180664j0(1, e0Var2.f123196g);
                        C115669n nVar = C115669n.INSTANCE;
                        Object[] objArr2 = new Object[5];
                        objArr2[0] = e0Var2.f123196g;
                        objArr2[1] = 2;
                        objArr2[2] = Integer.valueOf(e0Var2.f123197h == 1 ? 3 : 2);
                        objArr2[3] = Long.valueOf(e0Var2.f123199j);
                        objArr2[4] = Integer.valueOf(mo180657B());
                        nVar.mo160131h(15763, objArr2);
                        return;
                    }
                    Log.m105924i("MicroMsg.F2fRcvVoiceListener", "retcode > 100, still play default sound");
                    mo180664j0(1, e0Var2.f123196g);
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.mo160131h(14404, 3, e0Var2.f123196g, 2, obj, 1);
                    Object[] objArr3 = new Object[5];
                    objArr3[0] = e0Var2.f123196g;
                    objArr3[1] = 2;
                    objArr3[2] = Integer.valueOf(e0Var2.f123197h == 1 ? 3 : 2);
                    objArr3[3] = Long.valueOf(e0Var2.f123199j);
                    objArr3[4] = Integer.valueOf(mo180657B());
                    nVar2.mo160131h(15763, objArr3);
                    return;
                }
                C45531e0 e0Var3 = e0Var;
                mo180666t0(1, bVar.f257327a, mpVar.f138139g, e0Var.f123196g, i5, false);
                C115669n nVar3 = C115669n.INSTANCE;
                Object[] objArr4 = new Object[5];
                objArr4[0] = e0Var3.f123196g;
                objArr4[1] = 1;
                objArr4[2] = Integer.valueOf(e0Var3.f123197h == 1 ? 3 : 2);
                objArr4[3] = Long.valueOf(e0Var3.f123199j);
                objArr4[4] = Integer.valueOf(mo180657B());
                nVar3.mo160131h(15763, objArr4);
                return;
            }
            C45531e0 e0Var4 = e0Var;
            Object obj2 = "";
            Log.m105921e("MicroMsg.F2fRcvVoiceListener", "net error: %s", e0Var4);
            mo180664j0(1, e0Var4.f123196g);
            C115669n nVar4 = C115669n.INSTANCE;
            Object[] objArr5 = new Object[5];
            objArr5[0] = e0Var4.f123196g;
            objArr5[1] = 2;
            objArr5[2] = Integer.valueOf(e0Var4.f123197h == 1 ? 3 : 2);
            objArr5[3] = Long.valueOf(e0Var4.f123199j);
            objArr5[4] = Integer.valueOf(mo180657B());
            nVar4.mo160131h(15763, objArr5);
            nVar4.mo160131h(14404, 3, e0Var4.f123196g, 3, obj2, 1);
            return;
        }
        Object obj3 = "";
        if (yVar2 instanceof C45538k0) {
            C45538k0 k0Var = (C45538k0) yVar2;
            if (i3 != 0 || i4 != 0) {
                Log.m105921e("MicroMsg.F2fRcvVoiceListener", "net error: %s", k0Var);
                C115669n.INSTANCE.mo160131h(14404, 3, k0Var.f123208g, 3, obj3, 2);
            } else if (k0Var.f123206e.f132472d == 0) {
                Uri n = C116299g2.m163858n(m164525Q());
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0 f0Var = C116281f0.C116289i.f348994a;
                C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                    if (!(!l2.mo177810a() ? false : l2.f348991a.mo119937g(l2.f348992b))) {
                        Log.m105924i("MicroMsg.F2fRcvVoiceListener", "mk dir fail");
                        return;
                    }
                }
                String str2 = m164525Q() + UUID.randomUUID().toString() + ".tmp";
                Log.m105925i("MicroMsg.F2fRcvVoiceListener", "fileName: %s", str2);
                if (mo180659E0(str2, k0Var.f123206e.f132474f.f257327a)) {
                    C116672j jVar = new C116672j(this, (C116661a) null);
                    jVar.f349830a = str2;
                    int i7 = k0Var.f123206e.f132475g;
                    jVar.f349831b = 2;
                    this.f349804f.add(jVar);
                    mo180660H0();
                    return;
                }
                Log.m105924i("MicroMsg.F2fRcvVoiceListener", "save file fail");
            } else {
                C115669n.INSTANCE.mo160131h(14404, 3, k0Var.f123208g, 2, obj3, 2);
            }
        }
    }

    /* renamed from: qL */
    public void mo175093qL(int i, String str, String str2, String str3, int i2, String str4, byte[] bArr, int i3) {
        Log.m105925i("MicroMsg.F2fRcvVoiceListener", "errorCode:%s outTradeNo:%s type:%s content:%s packId:%s overtimeFlag:%s", Integer.valueOf(i), str, str2, str3, str4, Integer.valueOf(i3));
        int S = mo180661S(str2);
        CollectRcvVoiceEvent collectRcvVoiceEvent = (CollectRcvVoiceEvent) ((HashMap) this.f349811p).remove(str);
        if (i < 0) {
            if (collectRcvVoiceEvent == null) {
                mo180664j0(S, str);
            } else if (collectRcvVoiceEvent.f193526d.f193535i) {
                mo180658D(collectRcvVoiceEvent, false, true);
            } else {
                Log.m105924i("MicroMsg.F2fRcvVoiceListener", "onGetResult() needFailover:false");
            }
            mo180665n0(6, str, S, str3, i2, str4, 9);
            return;
        }
        mo180666t0(S, bArr, 1, str, i3, true);
        mo180665n0(5, str, S, str3, i2, str4, 0);
    }

    /* renamed from: t0 */
    public final void mo180666t0(int i, byte[] bArr, int i2, String str, int i3, boolean z) {
        Uri n = C116299g2.m163858n(m164525Q());
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (!(!l2.mo177810a() ? false : l2.f348991a.mo119937g(l2.f348992b))) {
                Log.m105924i("MicroMsg.F2fRcvVoiceListener", "mk dir fail");
                return;
            }
        }
        String str2 = m164525Q() + UUID.randomUUID().toString() + ".tmp";
        Log.m105925i("MicroMsg.F2fRcvVoiceListener", "fileName: %s", str2);
        if (mo180659E0(str2, bArr)) {
            C116672j jVar = new C116672j(this, (C116661a) null);
            jVar.f349830a = str2;
            jVar.f349831b = i;
            jVar.f349832c = str;
            jVar.f349833d = z;
            this.f349804f.add(jVar);
            mo180660H0();
            return;
        }
        Log.m105924i("MicroMsg.F2fRcvVoiceListener", "save file fail");
    }
}
