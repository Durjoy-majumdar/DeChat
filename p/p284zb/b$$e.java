package p284zb;

import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82492w;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Arrays;
import p1044ub.C90636f;

/* renamed from: zb.b$$e */
public class b$$e implements C82492w.C82496b {

    /* renamed from: d */
    public final /* synthetic */ int f262513d;

    /* renamed from: e */
    public final /* synthetic */ String f262514e;

    /* renamed from: f */
    public final /* synthetic */ String f262515f;

    /* renamed from: g */
    public final /* synthetic */ boolean f262516g;

    /* renamed from: h */
    public final /* synthetic */ long f262517h;

    /* renamed from: i */
    public final /* synthetic */ C91631b f262518i;

    public b$$e(C91631b bVar, int i, String str, String str2, boolean z, long j) {
        this.f262518i = bVar;
        this.f262513d = i;
        this.f262514e = str;
        this.f262515f = str2;
        this.f262516g = z;
        this.f262517h = j;
    }

    /* renamed from: N */
    public void mo114828N(String str, C90636f.C90637a[] aVarArr, boolean[] zArr, Object[] objArr, long j, long j2) {
        Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadJsFileWithOptions appId[%s] contextId[%d] paths[%s] options[%s] results[%s]", this.f262518i.f262488d.getAppId(), Integer.valueOf(this.f262513d), this.f262514e, this.f262515f, Arrays.toString(zArr));
        if (this.f262516g && this.f262517h > 0) {
            Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadJsFileWithOptions, appId[%s] initialScript[%s] inject done, cost[%d]ms", this.f262518i.f262488d.getAppId(), str, Long.valueOf(j2 - this.f262517h));
        }
        this.f262518i.mo122588c(str, this.f262516g, aVarArr, zArr, objArr, j, j2);
    }
}
