package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.k */
public class C96036k extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280444d;

    public C96036k(TimelineClickListener timelineClickListener) {
        this.f280444d = timelineClickListener;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
        Object tag = view.getTag();
        String str = tag instanceof C96235u4 ? ((C96235u4) tag).f281206a : tag instanceof C95787g0 ? ((C95787g0) tag).f279451b : null;
        if (str != null) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
            TimeLineObject timeLine = DN.getTimeLine();
            C88144b.m109788f("favorite");
            int i = timeLine.ContentObj.f298424e;
            if (i == 1) {
                contextMenu.add(0, 2, 0, view.getContext().getString(C0966R.string.f361137hk2));
            } else if (i == 15) {
                contextMenu.add(0, 10, 0, view.getContext().getString(C0966R.string.f361137hk2));
            }
            NotInteresetABTestManager.m119627b(contextMenu, DN);
        }
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
        Object tag = view.getTag();
        String str = tag instanceof C96235u4 ? ((C96235u4) tag).f281206a : tag instanceof C95787g0 ? ((C95787g0) tag).f279451b : null;
        if (str != null) {
            this.f280444d.f280381k.mo133554b(view, str, C94866e1.Yx0().mo139798DN(str).getTimeLine());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
        return false;
    }
}
