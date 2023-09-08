package dm1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.music.FinderFollowTopicHeaderView;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: dm1.b */
public final class C7361b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowTopicHeaderView f25488d;

    /* renamed from: e */
    public final /* synthetic */ C4191v0 f25489e;

    public C7361b(FinderFollowTopicHeaderView finderFollowTopicHeaderView, C4191v0 v0Var) {
        this.f25488d = finderFollowTopicHeaderView;
        this.f25489e = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$showBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (AndroidContextUtil.castActivityOrNull(this.f25488d.getContext()) != null) {
            FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f25488d;
            Intent intent = new Intent();
            intent.putExtra("key_create_scene", 12);
            Context context = finderFollowTopicHeaderView.getContext();
            C87412m.m108593f(context, "context");
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13297zc(context, intent);
        }
        this.f25489e.mo5072g();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$showBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
