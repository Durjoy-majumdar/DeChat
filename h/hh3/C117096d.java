package hh3;

import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C90107a;
import z04.C112551y;

/* renamed from: hh3.d */
public final class C117096d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f350872d;

    /* renamed from: e */
    public final /* synthetic */ String f350873e;

    /* renamed from: f */
    public final /* synthetic */ boolean f350874f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117096d(String str, String str2, boolean z) {
        super(0);
        this.f350872d = str;
        this.f350873e = str2;
        this.f350874f = z;
    }

    public Object invoke() {
        Throwable th = new Throwable();
        SystemServiceHookStatusStruct systemServiceHookStatusStruct = new SystemServiceHookStatusStruct();
        systemServiceHookStatusStruct.f343841d = 1;
        systemServiceHookStatusStruct.f343848k = systemServiceHookStatusStruct.mo86045b("ProcessName", MMApplicationContext.getProcessName(), true);
        systemServiceHookStatusStruct.f343844g = systemServiceHookStatusStruct.mo86045b("CurrentActivity", AppForegroundDelegate.INSTANCE.mo174210c(), true);
        systemServiceHookStatusStruct.f343842e = systemServiceHookStatusStruct.mo86045b("ServiceName", this.f350872d, true);
        systemServiceHookStatusStruct.f343845h = systemServiceHookStatusStruct.mo86045b("MethodStack", C112551y.m153814n(C90107a.m112736b(th), ",", ";", false), true);
        systemServiceHookStatusStruct.f343843f = systemServiceHookStatusStruct.mo86045b("MethodName", this.f350873e, true);
        systemServiceHookStatusStruct.f343847j = systemServiceHookStatusStruct.mo86045b("MethodOffsetTime", String.valueOf(this.f350874f), true);
        systemServiceHookStatusStruct.f343851n = 3;
        C117092b.m165125a(C117092b.f350860a, systemServiceHookStatusStruct);
        return C13598b0.f38549a;
    }
}
