package pn1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C31922b1;
import f62.C75700k0;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ig1.C33320g;
import java.util.Map;
import o40.C11348f;
import ob0.C35136m;
import p165hr.C60106t;
import p565ir.C60606n;
import z04.C112550d0;

/* renamed from: pn1.e */
public final class C35571e implements C31922b1 {

    /* renamed from: d */
    public final String f95107d = "FinderLiveNotifyRevokeConsumer";

    /* renamed from: e */
    public final int f95108e = 1;

    /* renamed from: f */
    public volatile int f95109f;

    /* renamed from: pn1.e$a */
    public static final class C35572a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f95110d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35572a(C72963f4 f4Var) {
            super(0);
            this.f95110d = f4Var;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("index = -1, content = ");
            String content = this.f95110d.getContent();
            if (content == null) {
                content = "";
            }
            sb.append(content);
            return sb.toString();
        }
    }

    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        Map<String, String> map2 = map;
        Class cls = C75700k0.class;
        Class cls2 = C60106t.class;
        C87412m.m108594g(map2, "values");
        if (!C86709a0.m107522a()) {
            return null;
        }
        String str2 = map2.get(".sysmsg.finderliveclosenotifymsg.revoke_id");
        C33320g Lo = ((C60106t) C86312j.m106911c(cls2)).Bx0().mo59079Lo(str2);
        String str3 = map2.get(".sysmsg.finderliveclosenotifymsg.functionmsgid");
        String str4 = this.f95107d;
        Log.m105924i(str4, "get close live notify, revokeID = " + str2 + " rowId = " + Lo.systemRowid + " exposure = " + Lo.field_exposureStatus + " , funcMsgId =  " + str3 + " ,msdId = " + Lo.field_msgId);
        if (Lo.systemRowid != -1) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(Lo.field_msgId);
            if (b002.getMsgId() <= 0) {
                String str5 = this.f95107d;
                Log.m105924i(str5, "msg info not exist, id = " + Lo.field_msgId);
                return null;
            }
            String content = b002.getContent();
            boolean z = false;
            int E = content != null ? C112550d0.m153769E(content, "<status>", 0, false, 6, (Object) null) : 0;
            String content2 = b002.getContent();
            int E2 = content2 != null ? C112550d0.m153769E(content2, "</status>", 0, false, 6, (Object) null) : 0;
            if (E == -1 || E2 == -1) {
                C11348f.C11349a.m11178b(C59319a.f169618b, this.f95107d, false, (C11348f.C11352b) null, false, false, new C35572a(b002), 28, (Object) null);
            } else {
                String content3 = b002.getContent();
                b002.mo108732L2(content3 != null ? C112550d0.m153781Q(content3, E + 8, E2, "0").toString() : null);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
                ((C60106t) C86312j.m106911c(cls2)).Bx0().mo59080Yt(b002.getMsgId(), 0);
                if (C31543z5.m39455e() > this.f95109f) {
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str6 = this.f95107d;
                    Log.m105924i(str6, "[requestLiveNotify] funcMsgId:" + str3);
                    if (str3.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        this.f95109f = C31543z5.m39455e() + this.f95108e;
                        ((C60606n) C86312j.m106911c(C60606n.class)).mo85065jR(str3);
                    }
                } else {
                    String str7 = this.f95107d;
                    Log.m105924i(str7, "funcMsgId：" + str3 + " but Frequency limit");
                }
            }
        }
        return null;
    }
}
