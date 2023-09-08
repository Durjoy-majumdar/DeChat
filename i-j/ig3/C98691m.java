package ig3;

import com.tencent.p014mm.autogen.mmdata.rpt.VideoSendReporterStruct;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98429r0;

/* renamed from: ig3.m */
public final class C98691m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f289403d;

    public C98691m(String str) {
        this.f289403d = str;
    }

    public final void run() {
        C98692n nVar = C98692n.f289404a;
        VideoSendReporterStruct b = C98692n.m128464b(nVar, this.f289403d);
        VideoSendReporterStruct a = C98692n.m128463a(nVar, b);
        a.f266532k = 4;
        if (!Util.isNullOrNil(a.f266528g)) {
            a.mo86054n();
            return;
        }
        C98408n0 i = C98429r0.m127818i(this.f289403d);
        if (i != null) {
            b.f266528g = b.mo86045b("ToUsername", i.mo137707k(), true);
            b.f266529h = ((long) i.f288566m) * 1000;
            b.f266531j = C86013q1.m106451l(C98398h0.Bx0().mo137728q(this.f289403d));
            b.f266530i = C86013q1.m106451l(i.mo137702f());
            b.f266527f = i.f288546N != null ? 1 : 2;
            a.f266528g = a.mo86045b("ToUsername", b.f266528g, true);
            a.f266529h = b.f266529h;
            a.f266531j = b.f266531j;
            a.f266530i = b.f266530i;
            a.f266527f = b.f266527f;
            a.mo86054n();
        }
    }
}
