package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ao1.C0145d1;
import ao1.C0150f1;
import ao1.C0157h1;
import ao1.C0166l;
import ao1.C54269l0;
import ao1.C54270m1;
import ao1.C54277t;
import bl3.C0324s;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import di3.C86312j;
import dp1.C58408t0;
import gy3.C24560g0;
import gy3.C87412m;
import ht1.C8807v3;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kq1.C10389f;
import kq1.C61136e;
import kq1.C61137l;
import l31.C61212e;
import nj3.C88989a;
import o31.C11345b;
import o31.C76986a;
import sx3.C110826x0;
import uc1.C14152r;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderPostUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(17)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostUI */
public class FinderPostUI extends MMFinderUI {
    /* renamed from: I7 */
    public int mo2194I7() {
        return 74;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C54270m1.class, C54277t.class, C0157h1.class, C54269l0.class, PostMainUIC.class, C0145d1.class, C14152r.class, C0166l.class, C0150f1.class, C61137l.class, C61136e.class, C10389f.class);
    }

    public void onBusinessPermissionDenied(String str) {
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        ((C8807v3) C39818r.f106831a.mo62444c(this).mo62447c(C8807v3.class)).mo9633R2(true);
        C58408t0 t0Var = C58408t0.f167336a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        t0Var.mo83263i(context, 65);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderPostUI).mo86179qs(this, C76986a.Finder);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8807v3.class)));
    }
}
