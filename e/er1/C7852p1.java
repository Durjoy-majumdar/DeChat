package er1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import dp1.C7435f2;
import fe1.C58960c;
import fe1.C58969q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import ke3.C88144b;
import o40.C61926c;
import org.json.JSONObject;
import pf1.C62262d0;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64284cg;
import z04.C112551y;

/* renamed from: er1.p1 */
public final class C7852p1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58969q f26436d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f26437e;

    /* renamed from: f */
    public final /* synthetic */ BaseFinderFeed f26438f;

    public C7852p1(C58969q qVar, C60905o oVar, BaseFinderFeed baseFinderFeed) {
        this.f26436d = qVar;
        this.f26437e = oVar;
        this.f26438f = baseFinderFeed;
    }

    public final void onClick(View view) {
        String str;
        boolean z;
        Object obj;
        int i;
        String str2;
        C13598b0 b0Var;
        boolean z2;
        String str3;
        Intent intent;
        C49712hj1 hj12;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/utils/FinderOriginAuthorUtils$refreshOriginView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7863r1 r1Var = C7863r1.f26466a;
        C58969q qVar = this.f26436d;
        Context context = this.f26437e.f173499A;
        C87412m.m108593f(context, "holder.context");
        long itemId = this.f26438f.getItemId();
        r1Var.getClass();
        Intent intent2 = new Intent();
        C64284cg b = C58960c.m68830b(qVar, false);
        if (b != null) {
            String str4 = b.f182468d;
            if (str4 == null) {
                str4 = "";
            }
            intent2.putExtra("Contact_User", str4);
            intent2.putExtra("Contact_Scene", 213);
            str = "";
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent2, itemId, (String) null, 0, 23, false, 0, 192, (Object) null);
            intent2 = intent2;
            z = true;
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("biz_profile_tab_type", 1);
            str2 = "key_entrance_type";
            i = 14;
            C58679a1.f167972a.mo83554a(context, intent2, 119, intent2.getIntExtra(str2, 14));
            obj = null;
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
            b0Var = C13598b0.f38549a;
        } else {
            str = "";
            str2 = "key_entrance_type";
            z = true;
            obj = null;
            i = 14;
            b0Var = null;
        }
        if (b0Var == null) {
            intent2.putExtra("finder_username", qVar.getUsername());
            intent2.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", z);
            intent2.putExtra("key_enter_profile_type", 39);
            String str5 = str;
            intent2.putExtra("key_udf_kv", str5);
            intent2.putExtra(str2, i);
            intent2.putExtra("key_to_comment_scene", C62262d0.f176978a.mo87316f(qVar.getUsername(), false));
            long j = itemId;
            str3 = str5;
            Object obj2 = obj;
            z2 = true;
            intent = intent2;
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent2, j, (String) null, 0, 39, false, 14, 64, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
        } else {
            intent = intent2;
            str3 = str;
            z2 = true;
        }
        Context context2 = this.f26437e.f173499A;
        C87412m.m108593f(context2, "holder.context");
        long itemId2 = this.f26438f.getItemId();
        r1Var.getClass();
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context2);
        if (f != null) {
            hj12 = f.mo12861q3();
            String stringExtra = intent.getStringExtra("key_jump_id");
            hj12.f134686w = stringExtra != null ? C112551y.m153814n(stringExtra, ",", ";", false) : str3;
        } else {
            hj12 = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("feedid", C61926c.m72691p(itemId2));
        C13598b0 b0Var2 = C13598b0.f38549a;
        f2Var.mo8580d(hj12, "link_original_author_profile", z2, jSONObject);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/utils/FinderOriginAuthorUtils$refreshOriginView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
