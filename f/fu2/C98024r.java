package fu2;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import l31.C99333f;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: fu2.r */
public class C98024r extends C97987a {

    /* renamed from: h */
    public final C13601g f287436h = C36568h.m40985a(new C98025a(this));

    /* renamed from: fu2.r$a */
    public static final class C98025a extends C87413o implements C32224a<C98023q> {

        /* renamed from: d */
        public final /* synthetic */ C98024r f287437d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98025a(C98024r rVar) {
            super(0);
            this.f287437d = rVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2");
            C98023q qVar = new C98023q(this.f287437d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2");
            return qVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98024r(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: i */
    public boolean mo137315i(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        C87412m.m108594g(menuItem, "menuItem");
        if (menuItem.getItemId() == 4 || menuItem.getItemId() == 28 || menuItem.getItemId() == 5 || menuItem.getItemId() == 3 || menuItem.getItemId() == 10 || menuItem.getItemId() == 22 || menuItem.getItemId() == 2 || menuItem.getItemId() == 23 || menuItem.getItemId() == 24) {
            C98214b c = mo137310c();
            if (c != null) {
                ((C99333f) C86312j.m106911c(C99333f.class)).mo138726rL(12076, "FavFeedCount", c.mo137504B2());
            } else {
                super.mo137315i(menuItem, i);
                SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
                return false;
            }
        }
        super.mo137315i(menuItem, i);
        SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        return false;
    }

    /* renamed from: n */
    public final C95787g0 mo137330n() {
        SnsMethodCalculate.markStartTimeMs("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
            return null;
        }
        C95787g0 g0Var = new C95787g0(c.mo137509G2(), c.mo137503A2());
        g0Var.f279454e = 1;
        SnsMethodCalculate.markEndTimeMs("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        return g0Var;
    }
}
