package pu2;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: pu2.o */
public final class C100937o implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C100930m f295571d;

    public C100937o(C100930m mVar) {
        this.f295571d = mVar;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$registerTouchEvent$2");
        C100930m mVar = this.f295571d;
        SnsMethodCalculate.markStartTimeMs("access$buildAndSetTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        mVar.mo140391H();
        SnsMethodCalculate.markEndTimeMs("access$buildAndSetTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        this.f295571d.getAdapter().f278572f.f280345A.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$registerTouchEvent$2");
    }
}
