package fu2;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gu2.C98214b;
import gy3.C87412m;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: fu2.w */
public final class C98035w extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ C98036x f287447d;

    public C98035w(C98036x xVar) {
        this.f287447d = xVar;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2$1");
        C87412m.m108594g(contextMenu, "menu");
        C87412m.m108594g(view, "v");
        view.setTag(this.f287447d.mo137330n());
        C98036x xVar = this.f287447d;
        xVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getUrlMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        SnsMethodCalculate.markEndTimeMs("getUrlMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        ((C96049p0) ((C36570n) xVar.f287436h).getValue()).onCreateContextMenu(contextMenu, view, contextMenuInfo);
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2$1");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2$1");
        C87412m.m108594g(view, "view");
        C98214b c = this.f287447d.mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2$1");
            return false;
        }
        this.f287447d.mo137312e().mo133554b(view, c.mo137503A2(), c.mo137509G2());
        view.setTag(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2$1");
        return true;
    }
}
