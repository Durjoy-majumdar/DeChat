package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.d0 */
public class C96023d0 extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280429d;

    public C96023d0(TimelineClickListener timelineClickListener) {
        this.f280429d = timelineClickListener;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
        if (view != null && (view.getTag() instanceof TimeLineObject)) {
            C88144b.m109788f("favorite");
            contextMenu.add(0, 25, 0, TimelineClickListener.m122988j(this.f280429d).getString(C0966R.string.f361137hk2));
        }
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
        if (view.getTag() == null || !(view.getTag() instanceof TimeLineObject)) {
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
            return false;
        }
        TimeLineObject timeLineObject = (TimeLineObject) view.getTag();
        Log.m105925i("MicroMsg.TimelineOnCreateContextMenuListener", "finderMediaMenuListener onbindOnSelectedView : %s", timeLineObject.f283893Id);
        if (TextUtils.isEmpty(timeLineObject.f283893Id)) {
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
            return false;
        }
        SnsInfo bO = C94866e1.Yx0().mo139816bO(timeLineObject.f283893Id);
        if (bO != null) {
            this.f280429d.f280381k.mo133554b(view, bO.getLocalid(), timeLineObject);
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
        return true;
    }
}
