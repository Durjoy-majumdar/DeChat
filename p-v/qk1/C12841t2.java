package qk1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import qk1.C12835r2;
import rx3.C13598b0;
import te3.C64373fs0;

/* renamed from: qk1.t2 */
public final class C12841t2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12835r2 f36752d;

    /* renamed from: e */
    public final /* synthetic */ C12835r2.C12837b f36753e;

    public C12841t2(C12835r2 r2Var, C12835r2.C12837b bVar) {
        this.f36752d = r2Var;
        this.f36753e = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindVisitorModeViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof C64373fs0) {
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAliasInfo");
            C64373fs0 fs02 = (C64373fs0) tag;
            C12835r2 r2Var = this.f36752d;
            r2Var.f36736g = fs02.f183215f;
            C32226l<? super C64373fs0, C13598b0> lVar = r2Var.f36733d;
            if (lVar != null) {
                lVar.invoke(fs02);
            }
        } else {
            C62042e eVar = C62042e.f176370a;
            Context context = this.f36753e.f44854d.getContext();
            C87412m.m108593f(context, "holder.itemView.context");
            eVar.mo87041S1(context, "type error!");
            Log.m105920e("FinderLiveVisitorRoleAdapter", "bindVisitorModeViewHolder it.tag:" + view.getTag());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindVisitorModeViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
