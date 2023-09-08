package j42;

import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: j42.i */
public final class C87866i implements IJSRuntime.C80648a {

    /* renamed from: a */
    public long f254357a;

    /* renamed from: b */
    public final /* synthetic */ C87830a f254358b;

    /* renamed from: c */
    public final /* synthetic */ IJSRuntime.Config f254359c;

    public C87866i(C87830a aVar, IJSRuntime.Config config) {
        this.f254358b = aVar;
        this.f254359c = config;
    }

    /* renamed from: a */
    public void mo112457a() {
        this.f254357a = Util.currentTicks();
    }

    /* renamed from: b */
    public void mo112458b(long j, long j2) {
        Long valueOf = Long.valueOf(this.f254357a);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            C87830a aVar = this.f254358b;
            IJSRuntime.Config config = this.f254359c;
            long longValue = valueOf.longValue();
            String str = aVar.f254274E;
            Log.m105924i(str, "hy: js runtime created using " + Util.ticksToNow(longValue) + " and is node snapshot? " + config.f235975c);
        }
    }
}
