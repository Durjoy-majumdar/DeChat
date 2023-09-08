package er1;

import android.content.Context;
import android.content.res.Resources;
import bl3.C39818r;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import gy3.C87412m;
import nj3.C76912y0;
import org.json.JSONObject;
import rs1.C63637s6;
import z04.C112551y;

/* renamed from: er1.m1 */
public final class C58748m1 {

    /* renamed from: a */
    public static final C58748m1 f168218a = new C58748m1();

    /* renamed from: a */
    public static final void m68322a(C58748m1 m1Var, Context context) {
        m1Var.getClass();
        Resources resources = context.getResources();
        String string = resources != null ? resources.getString(C0966R.string.edc) : null;
        if (!(string == null || string.length() == 0)) {
            C76912y0.makeText(context, (CharSequence) string, 0).show();
        }
    }

    /* renamed from: d */
    public static String m68323d(C58748m1 m1Var, Context context, int i, boolean z, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        m1Var.getClass();
        C87412m.m108594g(context, "context");
        int c = m1Var.mo83747c(context, i);
        int i3 = 1;
        if (c != 0) {
            i3 = c != 1 ? 3 : 2;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("news_tab", i3);
        jSONObject.put("is_logo", z ? 1 : 0);
        jSONObject.put("uin", str);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "kvJson.toString()");
        return C112551y.m153814n(jSONObject2, ",", ";", false);
    }

    /* renamed from: b */
    public final int mo83746b(C55011a aVar) {
        String str;
        C87412m.m108594g(aVar, "msg");
        FinderContact finderContact = aVar.f154465d.field_contact;
        if (finderContact == null || (str = finderContact.username) == null) {
            str = "";
        }
        return C112551y.m153808h(str, "@finder", false, 2, (Object) null) ? 1 : 2;
    }

    /* renamed from: c */
    public final int mo83747c(Context context, int i) {
        return i == 1 ? ((C63637s6) C39818r.f106831a.mo62443b(context).mo75002a(C63637s6.class)).mo80060n3() : ((FinderWxNotifyTabUIC) C39818r.f106831a.mo62443b(context).mo75002a(FinderWxNotifyTabUIC.class)).mo80060n3();
    }
}
