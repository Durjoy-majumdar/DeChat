package nx2;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import i70.C87667c;
import java.util.Map;
import org.xwalk.core.XWalkEnvironment;
import p564iq.C87790d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: nx2.b */
public final class C89096b {

    /* renamed from: a */
    public static final C89096b f256754a = new C89096b();

    /* renamed from: b */
    public static C85486a f256755b;

    /* renamed from: c */
    public static final MMHandler f256756c = new MMHandler();

    /* renamed from: d */
    public static final C13601g f256757d = C36568h.m40985a(C11305b.f33250d);

    /* renamed from: e */
    public static final C32224a<C13598b0> f256758e = C89097a.f256759d;

    /* renamed from: nx2.b$b */
    public static final class C11305b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C11305b f33250d = new C11305b();

        public C11305b() {
            super(0);
        }

        public Object invoke() {
            Boolean valueOf = Boolean.valueOf(((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND));
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "MagicLiveCard open " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: nx2.b$a */
    public static final class C89097a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C89097a f256759d = new C89097a();

        public C89097a() {
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.f253921h;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r5 = this;
                com.tencent.mm.plugin.surface.magiclivecard.mb.a r0 = nx2.C89096b.f256755b
                r1 = 0
                if (r0 == 0) goto L_0x0012
                java.util.HashMap<java.lang.String, g70.i> r0 = r0.f253921h
                if (r0 == 0) goto L_0x0012
                int r0 = r0.size()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x0013
            L_0x0012:
                r0 = r1
            L_0x0013:
                com.tencent.mm.plugin.surface.magiclivecard.mb.a r2 = nx2.C89096b.f256755b
                if (r2 == 0) goto L_0x0024
                java.util.concurrent.ConcurrentHashMap<java.lang.String, i70.c<ViewType, T>$a> r2 = r2.f253923j
                if (r2 == 0) goto L_0x0024
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x0025
            L_0x0024:
                r2 = r1
            L_0x0025:
                java.lang.String r3 = "MicroMsg.SurfaceApp.MagicLiveCardMgr"
                if (r0 != 0) goto L_0x002a
                goto L_0x004f
            L_0x002a:
                int r4 = r0.intValue()
                if (r4 != 0) goto L_0x004f
                if (r2 != 0) goto L_0x0033
                goto L_0x004f
            L_0x0033:
                int r4 = r2.intValue()
                if (r4 != 0) goto L_0x004f
                nx2.b r0 = nx2.C89096b.f256754a
                java.lang.String r0 = "cleanUpService"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                com.tencent.mm.plugin.surface.magiclivecard.mb.a r0 = nx2.C89096b.f256755b
                if (r0 == 0) goto L_0x0047
                r0.mo118861j0()
            L_0x0047:
                nx2.C89096b.f256755b = r1
                java.lang.String r0 = "cleanup reset MagicLiveCardMgr"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                goto L_0x006b
            L_0x004f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "cleanup frameSet or root not empty frameSetSize:"
                r1.append(r4)
                r1.append(r0)
                java.lang.String r0 = " rootSize:"
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            L_0x006b:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: nx2.C89096b.C89097a.invoke():java.lang.Object");
        }
    }

    /* renamed from: nx2.b$c */
    public static final class C89098c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f256760d;

        public C89098c(C32224a aVar) {
            this.f256760d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f256760d.invoke();
        }
    }

    static {
        Log.m105924i("MicroMsg.SurfaceApp.MagicLiveCardMgr", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* renamed from: a */
    public final synchronized void mo123435a(long j) {
        Log.m105924i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanup");
        if (f256755b != null) {
            if (mo123437c()) {
                MMHandler mMHandler = f256756c;
                C32224a<C13598b0> aVar = f256758e;
                mMHandler.removeCallbacks(new C89098c(aVar));
                mMHandler.postUIDelayed(new C89098c(aVar), j);
                return;
            }
        }
        Log.m105920e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanup not registered or not open");
    }

    /* renamed from: b */
    public final synchronized void mo123436b() {
        Log.m105924i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "destroy");
        C85486a aVar = f256755b;
        if (aVar != null) {
            for (Map.Entry<String, C87667c<ViewType, T>.a> value : aVar.f253923j.entrySet()) {
                ((C87667c.C87668a) value.getValue()).mo122100c();
            }
            aVar.f253923j.clear();
        }
        mo123435a(0);
    }

    /* renamed from: c */
    public final boolean mo123437c() {
        return ((Boolean) ((C36570n) f256757d).getValue()).booleanValue();
    }
}
