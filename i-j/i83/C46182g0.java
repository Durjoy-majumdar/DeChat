package i83;

import c30.C104289g;
import c30.C26827e;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.WebViewTransHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;
import yp3.C91542c;

/* renamed from: i83.g0 */
public final class C46182g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewTransHelper f124483d;

    /* renamed from: e */
    public final /* synthetic */ String f124484e;

    public C46182g0(WebViewTransHelper webViewTransHelper, String str) {
        this.f124483d = webViewTransHelper;
        this.f124484e = str;
    }

    public final void run() {
        WebViewTransHelper webViewTransHelper = this.f124483d;
        if (webViewTransHelper.f117505e != null) {
            C46198u b = webViewTransHelper.mo67655b();
            String str = this.f124484e;
            C87412m.m108594g(str, "content");
            ArrayList arrayList = new ArrayList();
            try {
                C104289g gVar = new C104289g(str);
                String optString = gVar.optString("randomID");
                C46178e eVar = b.f124531n;
                if (!C87412m.m108589b(eVar != null ? eVar.mo67660a() : null, optString)) {
                    Log.m105920e(b.f124525e, "localRandomID != randomID");
                    return;
                }
                C26827e eVar2 = new C26827e(gVar.optString("data"));
                if (eVar2.length() == 0) {
                    Log.m105928w(b.f124525e, "get nothing from webpage!");
                    return;
                }
                int length = eVar2.length();
                for (int i = 0; i < length; i++) {
                    String optString2 = eVar2.mo53814m(i).optString(MimeTypes.BASE_TYPE_TEXT);
                    String str2 = "";
                    if (optString2 == null) {
                        optString2 = str2;
                    }
                    String optString3 = eVar2.mo53814m(i).optString("hashID");
                    if (optString3 == null) {
                        optString3 = str2;
                    }
                    String optString4 = eVar2.mo53814m(i).optString("isFirstScreen");
                    if (optString4 == null) {
                        optString4 = str2;
                    }
                    String optString5 = eVar2.mo53814m(i).optString("isTitle");
                    if (optString5 != null) {
                        str2 = optString5;
                    }
                    arrayList.add(C90364q0.m113147f(new C13604l(MimeTypes.BASE_TYPE_TEXT, optString2), new C13604l("hashID", optString3), new C13604l("isFirstScreen", optString4), new C13604l(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2)));
                }
                C46193o oVar = new C46193o();
                C46178e eVar3 = b.f124531n;
                Map<String, String> b2 = eVar3 != null ? eVar3.mo67661b() : null;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Map map = (Map) it.next();
                    C46192n nVar = new C46192n();
                    nVar.f124507a = String.valueOf(map.get("hashID"));
                    String valueOf = String.valueOf(map.get(MimeTypes.BASE_TYPE_TEXT));
                    nVar.f124508b = valueOf;
                    if (b2 == null || !b2.containsKey(valueOf)) {
                        oVar.f124511a.add(nVar);
                    } else {
                        String str3 = nVar.f124508b;
                        C87412m.m108591d(str3);
                        arrayList2.add(C90364q0.m113147f(new C13604l("transText", b2.get(str3)), new C13604l("hashCode", nVar.f124507a)));
                    }
                }
                if (arrayList2.size() > 0) {
                    String eVar4 = new C26827e((Collection) arrayList2).toString();
                    C87412m.m108593f(eVar4, "JSONArray(needReplaceTextArrInCache).toString()");
                    b.mo71625d(eVar4);
                }
                if (oVar.f124511a.size() == 0) {
                    Log.m105924i(b.f124525e, "all nodes are in cache");
                    return;
                }
                b.f124532o.setValue(C46177b0.DoingTrans);
                C46190l lVar = b.f124527g;
                lVar.getClass();
                LinkedList linkedList = new LinkedList();
                if (oVar.f124511a.size() == 0) {
                    Log.m105928w("MicroMsg.WebTransCgiLogic", "slicePack parameters are wrong!");
                } else {
                    int size = oVar.f124511a.size() / 20;
                    if (oVar.f124511a.size() % 20 > 0) {
                        size++;
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        int i3 = i2 * 20;
                        int min = Math.min(20, oVar.f124511a.size() - i3);
                        C46193o oVar2 = new C46193o();
                        ArrayList<C46192n> arrayList3 = oVar.f124511a;
                        C87412m.m108594g(arrayList3, "list");
                        List<C46192n> subList = arrayList3.subList(i3, min + i3);
                        C87412m.m108593f(subList, "list.subList(from, to)");
                        for (C46192n add : subList) {
                            oVar2.f124511a.add(add);
                        }
                        linkedList.add(oVar2);
                    }
                }
                lVar.f124498g.addAll(linkedList);
                lVar.mo71621a();
            } catch (Exception e) {
                Log.m105920e(b.f124525e, C91542c.m114880a(e));
            }
        }
    }
}
