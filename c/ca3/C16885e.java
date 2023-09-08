package ca3;

import com.tencent.p014mm.plugin.webview.model.C43721l;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.C44209a;
import di3.C86312j;
import e00.C45514j0;
import e00.C45518r0;
import gy3.C87412m;
import java.util.ArrayList;
import p980id.C87696b;
import p980id.C87697c;

/* renamed from: ca3.e */
public class C16885e implements C87697c {

    /* renamed from: d */
    public static C16885e f45647d;

    public C87696b lj0(String str) {
        Class cls = C45518r0.class;
        str.getClass();
        if (!str.equals("finder") && !str.equals("video")) {
            return null;
        }
        C16886m mVar = new C16886m();
        WebViewVideoEventHandler webViewVideoEventHandler = new WebViewVideoEventHandler();
        webViewVideoEventHandler.f119754c = mVar;
        mVar.f45671U = webViewVideoEventHandler;
        C79968g gVar = new C79968g();
        mVar.f45673V = gVar;
        gVar.f234239a = new C16910p(mVar);
        C43721l lVar = mVar.f45696x0;
        if (!(lVar == null || ((C45518r0) C86312j.m106911c(cls)).gi0() == null)) {
            ArrayList<C43721l> arrayList = C44209a.f119776c;
            synchronized (arrayList) {
                arrayList.remove(lVar);
            }
        }
        mVar.f45696x0 = new C16909o(mVar);
        C45514j0 gi02 = ((C45518r0) C86312j.m106911c(cls)).gi0();
        if (gi02 != null) {
            C43721l lVar2 = mVar.f45696x0;
            C87412m.m108591d(lVar2);
            ((C44209a) gi02).mo68871b(lVar2);
        }
        return mVar;
    }
}
