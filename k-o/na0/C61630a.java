package na0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerFactory;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

/* renamed from: na0.a */
public final class C61630a {

    /* renamed from: a */
    public final String f175264a;

    /* renamed from: b */
    public final long f175265b;

    /* renamed from: c */
    public ITPPlayer f175266c;

    /* renamed from: d */
    public final C61631a f175267d = new C61631a();

    /* renamed from: na0.a$a */
    public static final class C61631a implements ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnErrorListener {

        /* renamed from: na0.a$a$a */
        public static final class C61632a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ITPPlayer f175268d;

            public C61632a(ITPPlayer iTPPlayer) {
                this.f175268d = iTPPlayer;
            }

            public final void run() {
                try {
                    ITPPlayer iTPPlayer = this.f175268d;
                    if (iTPPlayer != null) {
                        iTPPlayer.stopAsync();
                    }
                    ITPPlayer iTPPlayer2 = this.f175268d;
                    if (iTPPlayer2 != null) {
                        iTPPlayer2.release();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MusicPlayer", e, "onCompletion release player error", new Object[0]);
                }
            }
        }

        /* renamed from: na0.a$a$b */
        public static final class C61633b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ITPPlayer f175269d;

            public C61633b(ITPPlayer iTPPlayer) {
                this.f175269d = iTPPlayer;
            }

            public final void run() {
                try {
                    ITPPlayer iTPPlayer = this.f175269d;
                    if (iTPPlayer != null) {
                        iTPPlayer.stopAsync();
                    }
                    ITPPlayer iTPPlayer2 = this.f175269d;
                    if (iTPPlayer2 != null) {
                        iTPPlayer2.release();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MusicPlayer", e, "onError release player error", new Object[0]);
                }
            }
        }

        public void onCompletion(ITPPlayer iTPPlayer) {
            Log.m105924i("MicroMsg.MusicPlayer", "onCompletion");
            ((C119157j) C119157j.f356862d).mo183875f(new C61632a(iTPPlayer));
        }

        public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
            Log.m105924i("MicroMsg.MusicPlayer", "onError errType:" + i + " errorCode:" + i2 + ", arg:" + j + ' ' + j2);
            ((C119157j) C119157j.f356862d).mo183875f(new C61633b(iTPPlayer));
        }

        public void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
            Log.m105924i("MicroMsg.MusicPlayer", "onInfo, what:" + i + ' ' + j + ' ' + j2 + ' ' + obj);
        }

        public void onPrepared(ITPPlayer iTPPlayer) {
            Log.m105924i("MicroMsg.MusicPlayer", "onPrepared");
            if (iTPPlayer != null) {
                iTPPlayer.start();
            }
        }

        public void onStateChange(int i, int i2) {
            Log.m105924i("MicroMsg.MusicPlayer", "onStateChange " + i + ' ' + i2);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.MusicPlayer", mo125469f = "MusicPlayer.kt", mo125470l = {83, 85}, mo125471m = "startPlay")
    /* renamed from: na0.a$b */
    public static final class C61634b extends C66704d {

        /* renamed from: d */
        public Object f175270d;

        /* renamed from: e */
        public /* synthetic */ Object f175271e;

        /* renamed from: f */
        public final /* synthetic */ C61630a f175272f;

        /* renamed from: g */
        public int f175273g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61634b(C61630a aVar, C15601d<? super C61634b> dVar) {
            super(dVar);
            this.f175272f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f175271e = obj;
            this.f175273g |= Integer.MIN_VALUE;
            return this.f175272f.mo86580c(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.MusicPlayer$startPlay$3", mo125469f = "MusicPlayer.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: na0.a$c */
    public static final class C61635c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C61630a f175274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61635c(C61630a aVar, C15601d<? super C61635c> dVar) {
            super(2, dVar);
            this.f175274d = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61635c(this.f175274d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61635c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C61630a aVar = this.f175274d;
            try {
                Result.Companion companion = Result.Companion;
                Log.m105924i("MicroMsg.MusicPlayer", "startPlay: start create tpPlayer");
                ITPPlayer createTPPlayer = TPPlayerFactory.createTPPlayer(MMApplicationContext.getContext());
                if (createTPPlayer == null) {
                    return C13598b0.f38549a;
                }
                aVar.f175266c = createTPPlayer;
                Log.m105924i("MicroMsg.MusicPlayer", "startPlay: start set params url " + aVar.f175264a + ", time " + aVar.f175265b);
                createTPPlayer.setDataSource(aVar.f175264a);
                createTPPlayer.setOnPreparedListener(aVar.f175267d);
                createTPPlayer.setOnInfoListener(aVar.f175267d);
                createTPPlayer.setOnPlayerStateChangeListener(aVar.f175267d);
                createTPPlayer.setOnCompletionListener(aVar.f175267d);
                createTPPlayer.setOnErrorListener(aVar.f175267d);
                createTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(100, aVar.f175265b));
                createTPPlayer.setLoopback(true, aVar.f175265b, -1);
                createTPPlayer.prepareAsync();
                Result.m168114constructorimpl(createTPPlayer);
                return C13598b0.f38549a;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.MusicPlayer$stopPlay$2", mo125469f = "MusicPlayer.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: na0.a$d */
    public static final class C61636d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C61630a f175275d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61636d(C61630a aVar, C15601d<? super C61636d> dVar) {
            super(2, dVar);
            this.f175275d = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61636d(this.f175275d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61636d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            ITPPlayer iTPPlayer = this.f175275d.f175266c;
            if (iTPPlayer != null) {
                iTPPlayer.stopAsync();
                iTPPlayer.release();
            }
            this.f175275d.f175266c = null;
            return C13598b0.f38549a;
        }
    }

    public C61630a(String str, long j) {
        C87412m.m108594g(str, V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL);
        this.f175264a = str;
        this.f175265b = j;
    }

    /* renamed from: a */
    public final void mo86578a() {
        Object obj;
        C13598b0 b0Var;
        Log.m105924i("MicroMsg.MusicPlayer", "pausePlay: " + this.f175266c);
        try {
            Result.Companion companion = Result.Companion;
            ITPPlayer iTPPlayer = this.f175266c;
            if (iTPPlayer != null) {
                iTPPlayer.pause();
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            obj = Result.m168114constructorimpl(b0Var);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
        if (r0 != null) {
            Log.m105921e("MicroMsg.MusicPlayer", "pausePlay: error", r0);
        }
    }

    /* renamed from: b */
    public final void mo86579b() {
        Object obj;
        C13598b0 b0Var;
        Log.m105924i("MicroMsg.MusicPlayer", "resumePlay: " + this.f175266c);
        try {
            Result.Companion companion = Result.Companion;
            ITPPlayer iTPPlayer = this.f175266c;
            if (iTPPlayer != null) {
                iTPPlayer.start();
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            obj = Result.m168114constructorimpl(b0Var);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
        if (r0 != null) {
            Log.m105921e("MicroMsg.MusicPlayer", "resumePlay: error", r0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo86580c(wx3.C15601d<? super rx3.C13598b0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof na0.C61630a.C61634b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            na0.a$b r0 = (na0.C61630a.C61634b) r0
            int r1 = r0.f175273g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f175273g = r1
            goto L_0x0018
        L_0x0013:
            na0.a$b r0 = new na0.a$b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f175271e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f175273g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0079
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0032:
            java.lang.Object r2 = r0.f175270d
            na0.a r2 = (na0.C61630a) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0066
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "startPlay: "
            r7.append(r2)
            java.lang.String r2 = r6.f175264a
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "MicroMsg.MusicPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            com.tencent.thumbplayer.api.ITPPlayer r7 = r6.f175266c
            if (r7 == 0) goto L_0x0065
            r0.f175270d = r6
            r0.f175273g = r4
            java.lang.Object r7 = r6.mo86581d(r0)
            if (r7 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r2 = r6
        L_0x0066:
            a14.h0 r7 = a14.C53872d1.f151119c
            na0.a$c r4 = new na0.a$c
            r5 = 0
            r4.<init>(r2, r5)
            r0.f175270d = r5
            r0.f175273g = r3
            java.lang.Object r7 = a14.C53895h.m60469g(r7, r4, r0)
            if (r7 != r1) goto L_0x0079
            return r1
        L_0x0079:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: na0.C61630a.mo86580c(wx3.d):java.lang.Object");
    }

    /* renamed from: d */
    public final Object mo86581d(C15601d<? super C13598b0> dVar) {
        Log.m105924i("MicroMsg.MusicPlayer", "stopPlay: " + this.f175264a);
        Object g = C53895h.m60469g(C53872d1.f151119c, new C61636d(this, (C15601d<? super C61636d>) null), dVar);
        return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
    }
}
