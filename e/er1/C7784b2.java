package er1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPosterCenterUI;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import rs1.C13442s8;

/* renamed from: er1.b2 */
public final class C7784b2 implements View.OnClickListener {

    /* renamed from: d */
    public static final C7784b2 f26284d = new C7784b2();

    public final void onClick(View view) {
        Class cls = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/utils/FinderPosterCenterUtil$initEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = view.getContext();
        C87412m.m108593f(context, "it.context");
        Intent intent = new Intent();
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, 0, (String) null, 0, 0, false, 0, 128, (Object) null);
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderPosterCenterUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderPosterCenterUtil", "jumpCenterUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/FinderPosterCenterUtil", "jumpCenterUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("FinderPosterEntrance");
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("CreatorCenter");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/utils/FinderPosterCenterUtil$initEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
