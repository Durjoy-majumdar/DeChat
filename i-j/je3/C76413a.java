package je3;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72681a;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Iterator;
import java.util.LinkedList;
import p823sg.C77710q;

/* renamed from: je3.a */
public final class C76413a<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ WXMediaMessage f223725a;

    /* renamed from: b */
    public final /* synthetic */ WXMiniProgramObject f223726b;

    /* renamed from: c */
    public final /* synthetic */ LinkedList<String> f223727c;

    /* renamed from: d */
    public final /* synthetic */ C44561j f223728d;

    public C76413a(WXMediaMessage wXMediaMessage, WXMiniProgramObject wXMiniProgramObject, LinkedList<String> linkedList, C44561j jVar) {
        this.f223725a = wXMediaMessage;
        this.f223726b = wXMiniProgramObject;
        this.f223727c = linkedList;
        this.f223728d = jVar;
    }

    public Object call(Object obj) {
        WxaAttributes wxaAttributes = (WxaAttributes) obj;
        if (wxaAttributes == null) {
            Log.m105920e("MicroMsg.WxImeHelper", "get wxaAttributes for appbrand info failed");
            return null;
        }
        C76414c cVar = C76414c.f223729a;
        WXMediaMessage wXMediaMessage = this.f223725a;
        WXMiniProgramObject wXMiniProgramObject = this.f223726b;
        LinkedList<String> linkedList = this.f223727c;
        C44561j jVar = this.f223728d;
        cVar.getClass();
        String str = "1_" + jVar.field_appId + "_" + MD5Util.getMD5String(C77710q.m93738a(C97625j3.m125812b().mo105881G())) + "_" + Util.nowSecond() + "_" + "0";
        C87412m.m108593f(str, "shareActionId.toString()");
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C68070l.C68072b bVar = new C68070l.C68072b();
            String str2 = jVar.field_appId;
            C87412m.m108593f(str2, "app.field_appId");
            bVar.f195562d = str2;
            bVar.f195577g2 = wxaAttributes.field_appId;
            bVar.f195653z2 = wXMiniProgramObject.miniprogramType;
            bVar.f195484F = jVar.field_appName;
            bVar.f195618r = 2;
            bVar.f195589j2 = str;
            bVar.f195581h2 = 2;
            bVar.f195634v = wxaAttributes.field_username;
            bVar.f195638w = wxaAttributes.field_nickname;
            int i = 0;
            bVar.f195617q2 = 0;
            C80995a aVar = new C80995a();
            aVar.f237906o = wxaAttributes.mo113940m2() != null ? wxaAttributes.mo113940m2().f239500p : 0;
            if (wxaAttributes.mo113940m2() != null) {
                i = wxaAttributes.mo113940m2().f239501q;
            }
            aVar.f237908q = i;
            bVar.mo93545f(aVar);
            C72681a aVar2 = new C72681a();
            aVar2.f211479a = 1;
            aVar2.f211480b = "net.sourceforge.simcpux";
            aVar2.f211481c = "";
            C72695v.m85084z(bVar, wXMediaMessage, next, (String) null, 0, aVar2);
        }
        return null;
    }
}
