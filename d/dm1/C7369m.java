package dm1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import di3.C86312j;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: dm1.m */
public final class C7369m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7370n f25501d;

    /* renamed from: e */
    public final /* synthetic */ C4191v0 f25502e;

    public C7369m(C7370n nVar, C4191v0 v0Var) {
        this.f25501d = nVar;
        this.f25502e = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderTopicFollowHelper$showBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (AndroidContextUtil.castActivityOrNull(this.f25501d.f25503d) != null) {
            C7370n nVar = this.f25501d;
            Intent intent = new Intent();
            intent.putExtra("key_create_scene", 12);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13297zc(nVar.f25503d, intent);
        }
        this.f25502e.mo5072g();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderTopicFollowHelper$showBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
