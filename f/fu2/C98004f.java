package fu2;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gv2.C98242p;
import te3.w64;

/* renamed from: fu2.f */
public final class C98004f implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ w64 f287413d;

    /* renamed from: e */
    public final /* synthetic */ C98005g f287414e;

    public C98004f(w64 w64, C98005g gVar) {
        this.f287413d = w64;
        this.f287414e = gVar;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuListener$1");
        if (!C98242p.m126942d(this.f287413d.f299716t, 64) && !C98242p.m126942d(this.f287413d.f299716t, 16)) {
            contextMenu.add(0, 0, 0, this.f287414e.mo137309b().getString(C0966R.string.f7936wt));
        }
        contextMenu.add(1, 1, 0, this.f287414e.mo137309b().getString(C0966R.string.f7944x1));
        SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuListener$1");
    }
}
