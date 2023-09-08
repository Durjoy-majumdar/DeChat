package hh3;

import com.tencent.p014mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: hh3.e */
public final class C117097e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f350875d;

    /* renamed from: e */
    public final /* synthetic */ int f350876e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117097e(long j, int i) {
        super(0);
        this.f350875d = j;
        this.f350876e = i;
    }

    public Object invoke() {
        SystemServiceHookStatusStruct systemServiceHookStatusStruct = new SystemServiceHookStatusStruct();
        systemServiceHookStatusStruct.f343841d = 3;
        systemServiceHookStatusStruct.f343848k = systemServiceHookStatusStruct.mo86045b("ProcessName", MMApplicationContext.getProcessName(), true);
        systemServiceHookStatusStruct.f343852o = this.f350875d / ((long) 1000);
        systemServiceHookStatusStruct.f343853p = this.f350876e;
        systemServiceHookStatusStruct.f343851n = 3;
        C117092b.m165125a(C117092b.f350860a, systemServiceHookStatusStruct);
        return C13598b0.f38549a;
    }
}
