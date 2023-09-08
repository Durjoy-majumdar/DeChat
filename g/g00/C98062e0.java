package g00;

import com.tencent.p014mm.autogen.events.WebviewReportPublisherIdEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45629t0;
import eb0.C75592q0;
import java.net.URLEncoder;
import java.util.ArrayList;
import jr2.C76442r;
import p740wo.C53193b;

/* renamed from: g00.e0 */
public class C98062e0 extends IStaticListener<WebviewReportPublisherIdEvent> {
    public boolean callback(IEvent iEvent) {
        WebviewReportPublisherIdEvent webviewReportPublisherIdEvent = (WebviewReportPublisherIdEvent) iEvent;
        if (!(webviewReportPublisherIdEvent instanceof WebviewReportPublisherIdEvent)) {
            return false;
        }
        String s = C75592q0.m90789s();
        ArrayList arrayList = new ArrayList();
        arrayList.add(webviewReportPublisherIdEvent.f265259d.f265260a);
        arrayList.add(webviewReportPublisherIdEvent.f265259d.f265261b);
        arrayList.add(webviewReportPublisherIdEvent.f265259d.f265262c);
        arrayList.add(webviewReportPublisherIdEvent.f265259d.f265263d);
        arrayList.add(webviewReportPublisherIdEvent.f265259d.f265264e);
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(webviewReportPublisherIdEvent.f265259d.f265265f);
        arrayList.add(sb.toString());
        arrayList.add(webviewReportPublisherIdEvent.f265259d.f265266g);
        arrayList.add(webviewReportPublisherIdEvent.f265259d.f265267h);
        arrayList.add(str + webviewReportPublisherIdEvent.f265259d.f265268i);
        arrayList.add(str + webviewReportPublisherIdEvent.f265259d.f265269j);
        arrayList.add(s);
        arrayList.add(str + webviewReportPublisherIdEvent.f265259d.f265270k);
        arrayList.add(webviewReportPublisherIdEvent.f265259d.f265271l);
        PString pString = new PString();
        String yc02 = ((C76442r) C86312j.m106911c(C76442r.class)).yc0(webviewReportPublisherIdEvent.f265259d.f265272m, pString);
        arrayList.add(yc02);
        arrayList.add(str);
        arrayList.add(str);
        arrayList.add(str);
        WebviewReportPublisherIdEvent.C92611a aVar = webviewReportPublisherIdEvent.f265259d;
        int b = C45629t0.m50815b(aVar.f265262c, aVar.f265263d);
        int b2 = C45629t0.m50815b(s, webviewReportPublisherIdEvent.f265259d.f265266g);
        arrayList.add(str + b);
        arrayList.add(str + b2);
        WebviewReportPublisherIdEvent.C92611a aVar2 = webviewReportPublisherIdEvent.f265259d;
        String str2 = aVar2.f265273n;
        String str3 = aVar2.f265274o;
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
            if (!Util.isNullOrNil(str3)) {
                str = URLEncoder.encode(str3, "UTF-8");
            }
            str3 = str;
        } catch (Exception e) {
            Log.printErrStackTrace("WvReportPublisherIdListener", e, str, new Object[0]);
        }
        arrayList.add(str2);
        arrayList.add(pString.value);
        arrayList.add(str3);
        arrayList.add(((C53193b) C86312j.m106911c(C53193b.class)).mo73723Hd(webviewReportPublisherIdEvent.f265259d.f265266g) ? "1" : "0");
        Object[] objArr = new Object[20];
        WebviewReportPublisherIdEvent.C92611a aVar3 = webviewReportPublisherIdEvent.f265259d;
        objArr[0] = aVar3.f265260a;
        objArr[1] = aVar3.f265261b;
        objArr[2] = aVar3.f265262c;
        objArr[3] = aVar3.f265263d;
        String str4 = aVar3.f265264e;
        if (str4 != null) {
            str4 = str4.replace(",", "!");
        }
        objArr[4] = str4;
        objArr[5] = Integer.valueOf(webviewReportPublisherIdEvent.f265259d.f265265f);
        WebviewReportPublisherIdEvent.C92611a aVar4 = webviewReportPublisherIdEvent.f265259d;
        objArr[6] = aVar4.f265266g;
        objArr[7] = aVar4.f265267h;
        objArr[8] = Integer.valueOf(aVar4.f265268i);
        objArr[9] = Integer.valueOf(webviewReportPublisherIdEvent.f265259d.f265269j);
        objArr[10] = s;
        objArr[11] = Integer.valueOf(webviewReportPublisherIdEvent.f265259d.f265270k);
        String str5 = webviewReportPublisherIdEvent.f265259d.f265271l;
        if (str5 != null) {
            str5 = str5.replace(",", "!");
        }
        objArr[12] = str5;
        objArr[13] = webviewReportPublisherIdEvent.f265259d.f265272m;
        objArr[14] = yc02;
        objArr[15] = Integer.valueOf(b);
        objArr[16] = Integer.valueOf(b2);
        WebviewReportPublisherIdEvent.C92611a aVar5 = webviewReportPublisherIdEvent.f265259d;
        objArr[17] = aVar5.f265273n;
        objArr[18] = pString.value;
        objArr[19] = aVar5.f265274o;
        Log.m105919d("WvReportPublisherIdListener", "report(11954) : prePublishId : %s, curPublishId : %s, preUsername : %s, preChatName : %s, url : %s, preMsgIndex : %s, curChatName : %s, curChatTitle : %s, curChatMemberCount : %s, sendAppMsgScene : %s, curUserName : %s, getA8KeyScene : %s, referUrl : %s. : statExtStr:%s(%s), preChatType:%d, curChatType:%d, webViewTitle:%s, sourceAppId:%s  webViewDesc: %s", objArr);
        webviewReportPublisherIdEvent.f265259d.getClass();
        C115669n.INSTANCE.mo160137l(11954, arrayList);
        return true;
    }
}
