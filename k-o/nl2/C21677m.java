package nl2;

import com.tencent.p014mm.plugin.scanner.model.ScanProductInfo;
import java.util.ArrayList;

/* renamed from: nl2.m */
public final class C21677m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C21672j f61344d;

    /* renamed from: e */
    public final /* synthetic */ C21683r f61345e;

    /* renamed from: f */
    public final /* synthetic */ ScanProductInfo f61346f;

    public C21677m(C21672j jVar, C21683r rVar, ScanProductInfo scanProductInfo) {
        this.f61344d = jVar;
        this.f61345e = rVar;
        this.f61346f = scanProductInfo;
    }

    public final void run() {
        C21671i iVar = this.f61344d.f61334g;
        C21683r rVar = this.f61345e;
        C21680p pVar = new C21680p(rVar.f61380a, rVar.f61381b, 1);
        ScanProductInfo scanProductInfo = this.f61346f;
        ArrayList<C109753o> arrayList = pVar.f61356d;
        C109753o oVar = new C109753o();
        oVar.f328501h = scanProductInfo.getId();
        arrayList.add(oVar);
        iVar.mo24285d(pVar, 1001, "convert yuv to jpg failed");
    }
}
