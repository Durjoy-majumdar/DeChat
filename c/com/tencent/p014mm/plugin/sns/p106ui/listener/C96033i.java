package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96167q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.i */
public class C96033i extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280441d;

    public C96033i(TimelineClickListener timelineClickListener) {
        this.f280441d = timelineClickListener;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$15");
        C88144b.m109788f("favorite");
        contextMenu.add(0, 24, 0, view.getContext().getString(C0966R.string.f361137hk2));
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$15");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$15");
        if (view.getTag() instanceof C96167q1) {
            String str = ((C96167q1) view.getTag()).f280948c;
            this.f280441d.f280381k.mo133554b(view, str, C94866e1.Yx0().mo139798DN(str).getTimeLine());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$15");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$15");
        return false;
    }
}
