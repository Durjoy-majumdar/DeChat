package fu2;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import rx3.C36570n;

/* renamed from: fu2.s */
public final class C98026s extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ C98027t f287438d;

    public C98026s(C98027t tVar) {
        this.f287438d = tVar;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$linkMenuListner$2$1");
        C87412m.m108594g(contextMenu, "menu");
        C87412m.m108594g(view, "v");
        view.setTag(this.f287438d.mo137330n());
        C98027t tVar = this.f287438d;
        tVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getUrlMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        SnsMethodCalculate.markEndTimeMs("getUrlMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        ((C96049p0) ((C36570n) tVar.f287436h).getValue()).onCreateContextMenu(contextMenu, view, contextMenuInfo);
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$linkMenuListner$2$1");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$linkMenuListner$2$1");
        C87412m.m108594g(view, "view");
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMVClick$linkMenuListner$2$1");
        return true;
    }
}
