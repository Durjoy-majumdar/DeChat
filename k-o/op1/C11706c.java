package op1;

import ak1.C54108o;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import o40.C61926c;
import op1.C62080b;
import org.json.JSONObject;
import qo3.C77407n;
import sk1.C63965x;
import z04.C112551y;

/* renamed from: op1.c */
public final class C11706c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62080b f34269d;

    /* renamed from: e */
    public final /* synthetic */ C62080b.C62082b f34270e;

    /* renamed from: f */
    public final /* synthetic */ C63965x f34271f;

    public C11706c(C62080b bVar, C62080b.C62082b bVar2, C63965x xVar) {
        this.f34269d = bVar;
        this.f34270e = bVar2;
        this.f34271f = xVar;
    }

    public final void onClick(View view) {
        String str;
        Class cls = C54108o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingEditAdapter$bindProductItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        JSONObject jSONObject = new JSONObject();
        C63965x xVar = this.f34271f;
        jSONObject.put("type", "1");
        jSONObject.put("product", C61926c.m72691p(xVar.f181347t));
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "this.toString()");
        ((C54108o) C86312j.m106911c(cls)).Yx0(C112551y.m153814n(jSONObject2, ",", ";", false));
        C62080b bVar = this.f34269d;
        Context context = this.f34270e.f44854d.getContext();
        C87412m.m108593f(context, "holder.itemView.context");
        C63965x xVar2 = this.f34271f;
        long j = xVar2.f181347t;
        String str2 = xVar2.f181346s.f183162G;
        if (str2 == null) {
            str2 = "";
        }
        bVar.getClass();
        if (str2.length() == 0) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "2");
            jSONObject3.put("product", C61926c.m72691p(j));
            String jSONObject4 = jSONObject3.toString();
            C87412m.m108593f(jSONObject4, "this.toString()");
            ((C54108o) C86312j.m106911c(cls)).Yx0(C112551y.m153814n(jSONObject4, ",", ";", false));
            str = context.getString(C0966R.string.lqw);
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
            jSONObject5.put("product", C61926c.m72691p(j));
            jSONObject5.put(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str2);
            String jSONObject6 = jSONObject5.toString();
            C87412m.m108593f(jSONObject6, "this.toString()");
            ((C54108o) C86312j.m106911c(cls)).Yx0(C112551y.m153814n(jSONObject6, ",", ";", false));
            str = context.getString(C0966R.string.lqx);
        }
        C87412m.m108593f(str, "if (promotingWording.isE…ommend_wording)\n        }");
        C77407n nVar = new C77407n(context, 1, false);
        nVar.f225771i = new C11707d(str2, str);
        nVar.f225802y = new C11708e(str2, j);
        nVar.f225761d = C11709f.f34276a;
        nVar.f225782p = new C11710g(context, str2, str, bVar, j);
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingEditAdapter$bindProductItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
