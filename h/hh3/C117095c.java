package hh3;

import android.util.Log;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: hh3.c */
public final class C117095c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f350870d;

    /* renamed from: e */
    public final /* synthetic */ String f350871e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117095c(String str, String str2) {
        super(0);
        this.f350870d = str;
        this.f350871e = str2;
    }

    public Object invoke() {
        SystemServiceHookStatusStruct systemServiceHookStatusStruct = new SystemServiceHookStatusStruct();
        systemServiceHookStatusStruct.f343841d = 0;
        systemServiceHookStatusStruct.f343848k = systemServiceHookStatusStruct.mo86045b("ProcessName", MMApplicationContext.getProcessName(), true);
        systemServiceHookStatusStruct.f343849l = systemServiceHookStatusStruct.mo86045b("ErrStack", C112551y.m153816p(this.f350870d + " \n " + Log.getStackTraceString(new Throwable()), ",", ";", false, 4, (Object) null), true);
        systemServiceHookStatusStruct.f343844g = systemServiceHookStatusStruct.mo86045b("CurrentActivity", AppForegroundDelegate.INSTANCE.mo174210c(), true);
        systemServiceHookStatusStruct.f343842e = systemServiceHookStatusStruct.mo86045b("ServiceName", this.f350871e, true);
        systemServiceHookStatusStruct.f343851n = 3;
        C117092b.m165125a(C117092b.f350860a, systemServiceHookStatusStruct);
        return C13598b0.f38549a;
    }
}
