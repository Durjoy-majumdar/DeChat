package fu2;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import uo3.C78253a;
import vu2.C102298a;

/* renamed from: fu2.u */
public final class C98031u extends C98038y {

    /* renamed from: fu2.u$a */
    public static final class C98032a implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C98031u f287444d;

        public C98032a(C98031u uVar) {
            this.f287444d = uVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick$register$1$1");
            C87412m.m108594g(menuItem, "menuItem");
            this.f287444d.mo137312e().onMMMenuItemSelected(menuItem, i);
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick$register$1$1");
        }
    }

    /* renamed from: fu2.u$b */
    public static final class C98033b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C98031u f287445d;

        public C98033b(C98031u uVar) {
            this.f287445d = uVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveMultiPhotoClick$register$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick$register$1$2");
            this.f287445d.mo71269a(view);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick$register$1$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveMultiPhotoClick$register$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98031u(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: k */
    public void mo137317k(View view, boolean z, boolean z2, boolean z3) {
        SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick");
        C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        for (View view2 : ((C102298a) view).getChildList()) {
            if (view2.getTag(C0966R.C0970id.f6210qe) == null) {
                view2.setTag(C0966R.C0970id.f6210qe, 1);
                C78253a f = mo137313f();
                SnsMethodCalculate.markStartTimeMs("getPhotoMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
                C96049p0 p0Var = this.f287451i;
                SnsMethodCalculate.markEndTimeMs("getPhotoMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
                f.mo108275j(view2, p0Var, new C98032a(this));
                view2.setOnClickListener(new C98033b(this));
            }
        }
        SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick");
    }
}
