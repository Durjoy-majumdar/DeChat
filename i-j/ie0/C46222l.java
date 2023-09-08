package ie0;

import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import he0.C46020f;
import he0.C46021h;
import he0.C46027q;
import he0.C76158j;
import java.util.Arrays;
import rx3.C13598b0;

/* renamed from: ie0.l */
public final class C46222l implements C46021h.C46022a {

    /* renamed from: a */
    public final /* synthetic */ PBool f124593a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<String, C13598b0> f124594b;

    /* renamed from: c */
    public final /* synthetic */ String f124595c;

    public C46222l(PBool pBool, C32226l<? super String, C13598b0> lVar, String str, String str2) {
        this.f124593a = pBool;
        this.f124594b = lVar;
        this.f124595c = str2;
    }

    /* renamed from: a */
    public void mo33215a(C46027q qVar) {
        Class cls = C76158j.class;
        C46020f fVar = qVar != null ? qVar.f124111d : null;
        if (fVar == null) {
            this.f124593a.value = false;
            Log.m105920e("MicroMsg.OpenIMKefuContactCardContent", "alvinluo kefuCard getShareCardMsgContent contact invalid");
            this.f124594b.invoke(null);
            return;
        }
        C46220j jVar = (C46220j) fVar;
        String format = String.format("<msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", Arrays.copyOf(new Object[]{Util.escapeStringForXml(jVar.field_bigHeadImg), Util.escapeStringForXml(jVar.field_smallHeadImg), Util.escapeStringForXml(jVar.field_username), Util.escapeStringForXml(jVar.field_nickname), Util.escapeStringForXml(jVar.field_openImAppId), Util.escapeStringForXml(((C76158j) C86312j.m106911c(cls)).mo106373wo(jVar.field_openImAppId, jVar.field_openImDescWordingId)), Util.escapeStringForXml(((C76158j) C86312j.m106911c(cls)).S10(jVar.field_openImAppId, "openim_desc_icon", C76158j.C8510a.TYPE_URL, 1))}, 7));
        C87412m.m108593f(format, "format(format, *args)");
        Log.m105925i("MicroMsg.OpenIMKefuContactCardContent", "alvinluo getShareCardMsgContent toSendUsername: %s, msgContent: %s", this.f124595c, format);
        this.f124594b.invoke(format);
        this.f124593a.value = true;
    }

    /* renamed from: b */
    public void mo33216b(String str) {
    }
}
