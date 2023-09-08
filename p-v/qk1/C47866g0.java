package qk1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizPrepareUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import te3.C50249le;

/* renamed from: qk1.g0 */
public final class C47866g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C50249le f128469d;

    public C47866g0(C50249le leVar) {
        this.f128469d = leVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveBizListAdapter$BizItemHolder$initClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = view.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        Intent intent = new Intent(activity, FinderLiveBizPrepareUI.class);
        C50249le leVar = this.f128469d;
        intent.putExtra("finder_biz_live_article_url", leVar.f137340h);
        intent.putExtra("finder_biz_live_article_title", leVar.f137336d);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(5);
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveBizListAdapter$BizItemHolder$initClick$1", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveBizListAdapter$BizItemHolder$initClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
