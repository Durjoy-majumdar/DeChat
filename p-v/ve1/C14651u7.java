package ve1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import ht1.C60200t1;
import ke3.C88144b;
import ns3.C11266d;
import rx3.C13598b0;
import te3.C64284cg;

/* renamed from: ve1.u7 */
public final class C14651u7 extends RecyclerView.C16631z {

    /* renamed from: z */
    public final int f40527z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14651u7(View view, int i) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f40527z = i;
    }

    /* renamed from: y */
    public static final void m13989y(C14651u7 u7Var, Context context, BaseFinderFeed baseFinderFeed, String str) {
        u7Var.getClass();
        C64284cg bizInfo = baseFinderFeed.mo3513o().getBizInfo();
        C13598b0 b0Var = null;
        if (bizInfo != null) {
            Intent intent = new Intent();
            String str2 = bizInfo.f182468d;
            if (str2 == null) {
                str2 = "";
            }
            intent.putExtra("Contact_User", str2);
            intent.putExtra("Contact_Scene", 213);
            intent.putExtra("biz_profile_enter_from_finder", true);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("biz_profile_tab_type", 1);
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Intent intent2 = new Intent();
            intent2.putExtra("finder_username", str);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76739CG(((C11266d) C86312j.m106911c(C11266d.class)).mo9187Uy().getContextId(), intent2);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent2);
        }
    }

    /* renamed from: z */
    public final int mo13846z() {
        return C85875k4.m106208w() ? C75044y4.m89990b(this.f44854d.getContext()).x : C75044y4.m89990b(MMApplicationContext.getContext()).x;
    }
}
