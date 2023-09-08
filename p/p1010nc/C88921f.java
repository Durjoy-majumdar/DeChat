package p1010nc;

import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import p1010nc.C88923h;

/* renamed from: nc.f */
public class C88921f extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C88923h.C88924a f256466a;

    public C88921f(C88922g gVar, C88923h.C88924a aVar) {
        this.f256466a = aVar;
    }

    public void onPageFinished(WebView webView, String str) {
        C88918c cVar = (C88918c) this.f256466a;
        C88916a aVar = cVar.f256461a;
        aVar.f256458h = true;
        LinkedList<String> linkedList = aVar.f256457g;
        if (linkedList != null && !linkedList.isEmpty()) {
            Iterator<String> it = cVar.f256461a.f256457g.iterator();
            while (it.hasNext()) {
                cVar.f256461a.mo123303b(it.next());
            }
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C88923h.C88924a aVar = this.f256466a;
        String uri = webResourceRequest.getUrl().toString();
        ((C88918c) aVar).getClass();
        boolean equals = C88916a.f256450i.equals(uri);
        C88923h.C88924a.C88925a aVar2 = null;
        if (!equals) {
            return null;
        }
        C88923h.C88924a aVar3 = this.f256466a;
        aVar3.getClass();
        InputStream openRead = ((C88918c) aVar3).f256461a.f256452b.mo114272k().openRead("WAGameVConsole.html");
        if (openRead != null) {
            aVar2 = new C88923h.C88924a.C88925a(aVar3, MimeTypeUtil.getMimeTypeByFilePath("WAGameVConsole.html"), "UTF-8", openRead);
        }
        return new WebResourceResponse(aVar2.f256468a, "UTF-8", aVar2.f256469b);
    }
}
