package cn1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import ns3.C11266d;
import rm1.C13087a;

/* renamed from: cn1.o0 */
public final class C0858o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0868r0 f2033d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f2034e;

    /* renamed from: f */
    public final /* synthetic */ String f2035f;

    public C0858o0(C0868r0 r0Var, C60905o oVar, String str) {
        this.f2033d = r0Var;
        this.f2034e = oVar;
        this.f2035f = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert$onBindViewHolder$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0868r0 r0Var = this.f2033d;
        Context context = this.f2034e.f173499A;
        C87412m.m108593f(context, "holder.context");
        String str = this.f2035f;
        C87412m.m108593f(str, "name");
        r0Var.getClass();
        Class cls = C11266d.class;
        Intent intent = new Intent();
        intent.putExtra("key_click_tab_context_id", ((C11266d) C86312j.m106911c(cls)).mo9187Uy().mo10844b());
        intent.putExtra("finder_username", str);
        intent.putExtra("key_from_comment_scene", 0);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76739CG(((C11266d) C86312j.m106911c(cls)).mo9187Uy().getContextId(), intent);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
        Log.m105924i("FinderLiveSquareTabLifeCycleReport", "enterProfile");
        C13087a.f37257d = "page_profile";
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert$onBindViewHolder$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
