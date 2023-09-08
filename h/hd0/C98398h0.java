package hd0;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import eb0.C86484b;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import j72.C98921l;
import p663qo.C101211h;
import p663qo.C101213l;
import p787ai.C79547b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: hd0.h0 */
public class C98398h0 extends C86301e {

    /* renamed from: n */
    public static MMHandler f288496n;

    /* renamed from: d */
    public volatile C98410o0 f288497d;

    /* renamed from: e */
    public volatile C98445y0 f288498e;

    /* renamed from: f */
    public volatile C98447z0 f288499f = null;

    /* renamed from: g */
    public volatile C98385a0 f288500g = null;

    /* renamed from: h */
    public C92755e0 f288501h = null;

    /* renamed from: i */
    public C98438x f288502i = null;

    /* renamed from: j */
    public C114668z.C104589a f288503j = new C98399a(this);

    /* renamed from: hd0.h0$a */
    public class C98399a extends C114668z.C104589a {

        /* renamed from: hd0.h0$a$a */
        public class C98400a implements Runnable {
            public C98400a(C98399a aVar) {
            }

            public void run() {
                C98398h0.Dx0().mo137787d();
            }
        }

        public C98399a(C98398h0 h0Var) {
        }

        public void onAppBackground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                C86718e.m107551r();
            }
        }

        public void onAppForeground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    C79547b.f233255g.mo109607a(new C98400a(this));
                }
            }
        }
    }

    /* renamed from: hd0.h0$b */
    public class C98401b implements Runnable {
        public C98401b(C98398h0 h0Var) {
        }

        public void run() {
            if (C86709a0.m107522a()) {
                C98410o0 Bx0 = C98398h0.Bx0();
                Bx0.getClass();
                String str = "UPDATE videoinfo2 SET status = 198, lastmodifytime = " + (System.currentTimeMillis() / 1000) + " WHERE " + "masssendid" + " > 0  AND " + "status" + " = " + 200;
                Log.m105925i("MicroMsg.VideoInfoStorage", "fail all massSendInfos, sql %s", str);
                Bx0.f288587a.execSQL("videoinfo2", str);
            }
        }
    }

    public static synchronized C98410o0 Bx0() {
        C98410o0 o0Var;
        synchronized (C98398h0.class) {
            if (C86709a0.m107522a()) {
                if (wx0().f288497d == null) {
                    wx0().f288497d = new C98410o0(C86709a0.m107535s().f251811i);
                    wx0().f288497d.mo137716b(Dx0(), Looper.getMainLooper());
                }
                o0Var = wx0().f288497d;
            } else {
                throw new C86484b();
            }
        }
        return o0Var;
    }

    public static C98445y0 Cx0() {
        if (C86709a0.m107522a()) {
            if (wx0().f288498e == null) {
                wx0().f288498e = new C98445y0(C86709a0.m107535s().f251811i);
            }
            return wx0().f288498e;
        }
        throw new C86484b();
    }

    public static C98447z0 Dx0() {
        if (C86709a0.m107522a()) {
            if (wx0().f288499f == null) {
                wx0().f288499f = new C98447z0();
            }
            return wx0().f288499f;
        }
        throw new C86484b();
    }

    /* renamed from: aL */
    public static boolean m127698aL(Runnable runnable) {
        if (runnable == null) {
            return true;
        }
        vx0();
        MMHandler mMHandler = f288496n;
        if (mMHandler == null) {
            Log.m105920e("MicroMsg.SubCoreVideo", "short video decoder handler is null");
            return false;
        }
        mMHandler.removeCallbacks(runnable);
        return true;
    }

    /* renamed from: fO */
    public static boolean m127699fO(Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        vx0();
        if (j > 0) {
            f288496n.postDelayed(runnable, j);
            return true;
        }
        f288496n.post(runnable);
        return true;
    }

    public static void vx0() {
        MMHandler mMHandler = f288496n;
        if (mMHandler == null || mMHandler.isQuit()) {
            MMHandler mMHandler2 = new MMHandler("Short-Video-Decoder-Thread-" + System.currentTimeMillis());
            f288496n = mMHandler2;
            mMHandler2.setLogging(false);
        }
    }

    public static C98398h0 wx0() {
        return (C98398h0) C86312j.m106911c(C98398h0.class);
    }

    public static C92755e0 xx0() {
        Class cls = C101211h.class;
        C86709a0.m107523b().mo121108c();
        if (wx0().f288501h == null) {
            wx0().f288501h = new C92755e0();
        }
        if (((C101211h) C86312j.m106911c(cls)).mo140291f8()) {
            ((C101211h) C86312j.m106911c(cls)).mo140289dT(wx0().f288501h);
        }
        return wx0().f288501h;
    }

    public static C98438x yx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f288502i == null) {
            wx0().f288502i = new C98438x();
        }
        return wx0().f288502i;
    }

    public static C98385a0 zx0() {
        if (C86709a0.m107522a()) {
            if (wx0().f288500g == null) {
                wx0().f288500g = new C98385a0();
            }
            return wx0().f288500g;
        }
        throw new C86484b();
    }

    public String Ax0() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("subvideo/");
        return C86013q1.m106448i(sb.toString(), true);
    }

    public String ca0() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("video/");
        return C86013q1.m106448i(sb.toString(), true);
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        Log.m105925i("MicroMsg.SubCoreVideo", "%d onAccountPostReset ", Integer.valueOf(hashCode()));
        this.f288503j.alive();
        MMHandler mMHandler = f288496n;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        C86709a0.m107525e().postToWorker(new C98401b(this));
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105925i("MicroMsg.SubCoreVideo", "%d onAccountRelease ", Integer.valueOf(hashCode()));
        this.f288503j.dead();
        try {
            if (wx0().f288499f != null) {
                C98447z0 z0Var = wx0().f288499f;
                z0Var.f288763s = 0;
                if (z0Var.f288765u != null) {
                    C86709a0.m107524d().mo123458d(z0Var.f288765u);
                }
                if (z0Var.f288766v != null) {
                    C86709a0.m107524d().mo123458d(z0Var.f288766v);
                }
                z0Var.f288768x.clear();
            }
            if (wx0().f288500g != null) {
                C98385a0 a0Var = wx0().f288500g;
                a0Var.f288439g = 0;
                Log.m105925i("MicroMsg.SightMassSendService", "stop, cur cdn client id %s", a0Var.f288440h);
                if (!Util.isNullOrNil(a0Var.f288440h)) {
                    ((C101213l) C86312j.m106911c(C101213l.class)).gn0(a0Var.f288440h);
                }
            }
            if (wx0().f288502i != null) {
                C98438x xVar = wx0().f288502i;
                xVar.mo137776g();
                xVar.f288719a.clear();
            }
            if (wx0().f288501h != null) {
                C92755e0 e0Var = wx0().f288501h;
                e0Var.getClass();
                C86709a0.m107524d().mo123470p(379, e0Var);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SubCoreVideo", e, "", new Object[0]);
        }
        MMHandler mMHandler = f288496n;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        try {
            C98447z0 Dx0 = Dx0();
            Dx0.getClass();
            Log.m105924i("MicroMsg.VideoService", "quitVideoSendThread");
            MMHandler mMHandler2 = Dx0.f288751d;
            if (mMHandler2 != null) {
                try {
                    mMHandler2.quit();
                    Dx0.f288752e = false;
                    Dx0.f288751d = null;
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.VideoService", "quitVideoSendThread error: %s", e2.getMessage());
                }
            }
        } catch (Exception e3) {
            Log.m105921e("MicroMsg.SubCoreVideo", "onAccountRelease, quitVideoSendThread error: %s", e3.getMessage());
        }
        C98921l.f289964d.mo126892c();
    }
}
