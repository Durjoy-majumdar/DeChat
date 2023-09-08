package r61;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import qo3.C101218e0;

/* renamed from: r61.e */
public final class C101355e implements C101218e0.C77394n {

    /* renamed from: a */
    public final /* synthetic */ C101358h f296903a;

    public C101355e(C101358h hVar) {
        this.f296903a = hVar;
    }

    public final void dismiss() {
        Log.m105918d(this.f296903a.f296926y, "dismiss");
        C86709a0.m107529k().f251779b.mo123470p(521, this.f296903a);
        C86709a0.m107529k().f251779b.mo123470p(WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, this.f296903a);
        C86709a0.m107529k().f251779b.mo123470p(412, this.f296903a);
    }
}
