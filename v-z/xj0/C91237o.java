package xj0;

import android.content.Context;
import com.hilive.mediasdk.LoadDelegate;
import com.hilive.mediasdk.LogDelegate;
import com.hilive.mediasdk.MediaSdk;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.app.C81192y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import sj0.C90203b;

/* renamed from: xj0.o */
public class C91237o {

    /* renamed from: g */
    public static volatile Map<String, C91237o> f261804g = new HashMap(1);

    /* renamed from: h */
    public static C91241d f261805h = C91241d.Hardware;

    /* renamed from: a */
    public MMHandler f261806a;

    /* renamed from: b */
    public C91215b f261807b;

    /* renamed from: c */
    public MediaSdk f261808c = new MediaSdk();

    /* renamed from: d */
    public C91243f f261809d = C91243f.NotInit;

    /* renamed from: e */
    public C91258z f261810e = null;

    /* renamed from: f */
    public C91258z f261811f = null;

    /* renamed from: xj0.o$a */
    public class C91238a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f261812d;

        public C91238a(Context context) {
            this.f261812d = context;
        }

        public void run() {
            C81192y0.m99475a();
            C91237o oVar = C91237o.this;
            Context context = this.f261812d;
            oVar.getClass();
            LoadDelegate.setInstance(new C91249s(oVar));
            LogDelegate.setImp(new C91250t(oVar));
            Log.m105924i("MicroMsg.GameRecorderMgr", "init mediasdk");
            oVar.f261808c.init(context);
        }
    }

    /* renamed from: xj0.o$b */
    public class C91239b {

        /* renamed from: a */
        public long f261814a;

        /* renamed from: b */
        public long f261815b;

        public C91239b(C91237o oVar) {
        }
    }

    /* renamed from: xj0.o$c */
    public interface C91240c {
    }

    /* renamed from: xj0.o$d */
    public enum C91241d {
        f261816d,
        Hardware
    }

    /* renamed from: xj0.o$e */
    public class C91242e {

        /* renamed from: a */
        public int f261819a = 64000;

        /* renamed from: b */
        public int f261820b = 44100;

        /* renamed from: c */
        public int f261821c = 2;

        public C91242e(C91237o oVar) {
        }

        public String toString() {
            return "RemuxResult{audioBitrate=" + this.f261819a + ", audioSampleRate=" + this.f261820b + ", audioChannelCount=" + this.f261821c + '}';
        }
    }

    /* renamed from: xj0.o$f */
    public enum C91243f {
        NotInit,
        Inited,
        Running,
        Paused
    }

    /* renamed from: xj0.o$g */
    public class C91244g {

        /* renamed from: a */
        public C91258z f261827a;

        /* renamed from: b */
        public C91258z f261828b;

        public C91244g(C91237o oVar) {
        }
    }

    public C91237o(C81925i2 i2Var) {
        Context context = i2Var.getContext();
        this.f261806a = new MMHandler("wegame_screen_recorder_worker");
        if (f261805h != C91241d.f261816d) {
            this.f261807b = new C91220f(i2Var);
        }
        this.f261806a.postToWorker(new C91238a(context));
    }

    /* renamed from: a */
    public static boolean m114471a(C91237o oVar) {
        C91243f fVar = oVar.f261809d;
        if (!(fVar == C91243f.NotInit || fVar == C91243f.Inited)) {
            oVar.f261807b.getClass();
            C91258z zVar = oVar.f261810e;
            return zVar != null && !Util.isNullOrNil(((C90203b.C90205b) zVar).f258967a);
        }
    }

    /* renamed from: b */
    public static C91237o m114472b(String str, C81925i2 i2Var) {
        if (!Util.isNullOrNil(str)) {
            C91237o oVar = null;
            if (!((HashMap) f261804g).containsKey(str)) {
                synchronized (C91237o.class) {
                    if (!((HashMap) f261804g).containsKey(str)) {
                        oVar = new C91237o(i2Var);
                        ((HashMap) f261804g).put(str, oVar);
                    }
                }
            }
            return oVar == null ? (C91237o) ((HashMap) f261804g).get(str) : oVar;
        }
        throw new RuntimeException("Null or nil appid");
    }
}
