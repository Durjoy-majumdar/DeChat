package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.h */
public class C96030h extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280437d;

    public C96030h(TimelineClickListener timelineClickListener) {
        this.f280437d = timelineClickListener;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$14");
        if (view.getTag() instanceof C95787g0) {
            TimelineClickListener timelineClickListener = this.f280437d;
            SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            C96049p0 p0Var = timelineClickListener.f280348D;
            SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            p0Var.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$14");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$14");
        if (view.getTag() instanceof C95787g0) {
            String str = ((C95787g0) view.getTag()).f279451b;
            this.f280437d.f280381k.mo133554b(view, str, C94866e1.Yx0().mo139798DN(str).getTimeLine());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$14");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$14");
        return false;
    }
}
