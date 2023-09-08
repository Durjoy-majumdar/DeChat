package hh3;

import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rx3.C90107a;
import z04.C112551y;

/* renamed from: hh3.b */
public final class C117092b {

    /* renamed from: a */
    public static final C117092b f350860a = new C117092b();

    /* renamed from: b */
    public static final String f350861b = "MicroMsg.SensitiveReporter";

    /* renamed from: c */
    public static final CopyOnWriteArrayList<SystemServiceHookStatusStruct> f350862c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public static final HashMap<String, SystemServiceHookStatusStruct> f350863d = new HashMap<>();

    /* renamed from: e */
    public static final ArrayList<Long> f350864e = new ArrayList<>();

    /* renamed from: f */
    public static final long f350865f = 2000;

    /* renamed from: g */
    public static final C13601g f350866g = C36568h.m40985a(C117093a.f350867d);

    /* renamed from: hh3.b$a */
    public static final class C117093a extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C117093a f350867d = new C117093a();

        public C117093a() {
            super(0);
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler(C117092b.f350861b, (MMHandler.Callback) C117091a.f350859d);
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    /* renamed from: hh3.b$b */
    public static final class C117094b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f350868d;

        /* renamed from: e */
        public final /* synthetic */ String f350869e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117094b(String str, String str2) {
            super(0);
            this.f350868d = str;
            this.f350869e = str2;
        }

        public Object invoke() {
            Throwable th = new Throwable();
            SystemServiceHookStatusStruct systemServiceHookStatusStruct = new SystemServiceHookStatusStruct();
            systemServiceHookStatusStruct.f343841d = 1;
            systemServiceHookStatusStruct.f343848k = systemServiceHookStatusStruct.mo86045b("ProcessName", MMApplicationContext.getProcessName(), true);
            systemServiceHookStatusStruct.f343844g = systemServiceHookStatusStruct.mo86045b("CurrentActivity", AppForegroundDelegate.INSTANCE.mo174210c(), true);
            systemServiceHookStatusStruct.f343845h = systemServiceHookStatusStruct.mo86045b("MethodStack", C112551y.m153814n(C90107a.m112736b(th), ",", ";", false), true);
            systemServiceHookStatusStruct.f343849l = systemServiceHookStatusStruct.mo86045b("ErrStack", C112551y.m153816p(this.f350868d, ",", ";", false, 4, (Object) null), true);
            systemServiceHookStatusStruct.f343843f = systemServiceHookStatusStruct.mo86045b("MethodName", this.f350869e, true);
            systemServiceHookStatusStruct.f343851n = 4;
            C117092b.m165125a(C117092b.f350860a, systemServiceHookStatusStruct);
            return C13598b0.f38549a;
        }
    }

    static {
        new HashMap();
    }

    /* renamed from: a */
    public static final void m165125a(C117092b bVar, SystemServiceHookStatusStruct systemServiceHookStatusStruct) {
        bVar.getClass();
        CopyOnWriteArrayList<SystemServiceHookStatusStruct> copyOnWriteArrayList = f350862c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(systemServiceHookStatusStruct);
        }
        ((MMHandler) ((C36570n) f350866g).getValue()).sendEmptyMessage(1);
    }

    /* renamed from: b */
    public final void mo181043b(String str, String str2) {
        C87412m.m108594g(str, "methodName");
        C87412m.m108594g(str2, "throwAbleStr");
        C61926c.m72659D(f350861b, false, new C117094b(str2, str), 2, (Object) null);
    }
}
