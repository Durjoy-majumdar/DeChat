package j50;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import p156gj.C8325f0;

/* renamed from: j50.l */
public final class C60764l extends C87413o implements C32227p {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173083d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60764l(C60735a aVar) {
        super(2);
        this.f173083d = aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        this.f173083d.f173031q.mo162269d(((Number) obj).intValue(), ((Number) obj2).intValue());
        C8325f0 a = this.f173083d.f173031q.mo162266a();
        int i = a.f27283a;
        Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorLinkVideoPreviewWidth is " + i);
        C115669n nVar = C115669n.INSTANCE;
        int i2 = (int) 1383;
        nVar.mo160138m(i2, 12, 13, i, false);
        int i3 = a.f27284b;
        Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorLinkVideoPreviewHeight is " + i3);
        nVar.mo160138m(i2, 15, 16, i3, false);
        return null;
    }
}
