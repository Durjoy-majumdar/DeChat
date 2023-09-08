package dy1;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LiteAppShowStatusChangeEvent;
import com.tencent.p014mm.plugin.game.commlib.util.C41862c;
import com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743;
import com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743$registerReportListener$1;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import p193la.C10480b;

/* renamed from: dy1.h */
public class C45493h extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionId", C41862c.f112806c.mo65644a().f112808a);
        long optLong = jSONObject.optLong(TPDownloadProxyEnum.USER_SSID);
        String optString = jSONObject.optString("url");
        jSONObject.optString("liteAppPath");
        String optString2 = jSONObject.optString("liteAppReportExtInfoDict");
        if (!"".equals(optString2)) {
            PageTimeReport27743 pageTimeReport27743 = PageTimeReport27743.f113093a;
            C87412m.m108594g(optString, "url");
            C87412m.m108594g(optString2, "extInfo");
            PageTimeReport27743.f113096d.put(optString, optString2);
        }
        C10480b bVar = this.f19814e;
        long j = bVar.f31715c;
        long j2 = bVar.f31716d;
        PageTimeReport27743.f113098f = j;
        Iterator<PageTimeReport27743.C41991a> it = PageTimeReport27743.f113097e.iterator();
        while (true) {
            if (it.hasNext()) {
                PageTimeReport27743.C41991a next = it.next();
                if (C87412m.m108589b(next.f113099a, str) && next.f113103e == j && next.f113104f == j2) {
                    next.f113100b = System.currentTimeMillis();
                    break;
                }
            } else {
                PageTimeReport27743.C41991a aVar = new PageTimeReport27743.C41991a();
                aVar.f113099a = str;
                aVar.f113103e = j;
                aVar.f113104f = j2;
                aVar.f113100b = System.currentTimeMillis();
                aVar.f113101c = optLong;
                aVar.f113102d = optString;
                ((LinkedList) PageTimeReport27743.f113097e).add(aVar);
                if (PageTimeReport27743.f113094b == null) {
                    PageTimeReport27743.f113094b = new PageTimeReport27743$registerReportListener$1(C40008f.f107254d);
                }
                IListener<LiteAppShowStatusChangeEvent> iListener = PageTimeReport27743.f113094b;
                if (iListener != null) {
                    iListener.alive();
                }
                PageTimeReport27743.f113095c.alive();
            }
        }
        this.f19815f.mo5691c(hashMap);
    }
}
