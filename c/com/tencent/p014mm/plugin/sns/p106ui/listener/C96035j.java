package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import c00.C0405n;
import c00.C92330r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import di3.C86312j;
import ke3.C88144b;
import p823sg.C90193h;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.j */
public class C96035j extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280443d;

    public C96035j(TimelineClickListener timelineClickListener) {
        this.f280443d = timelineClickListener;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
        if (view != null && (view.getTag() instanceof C96235u4)) {
            C96235u4 u4Var = (C96235u4) view.getTag();
            String str = u4Var.f281206a;
            SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
            C88144b.m109788f("favorite");
            if (DN != null && !DN.isAd()) {
                contextMenu.add(0, 2, 0, TimelineClickListener.m122988j(this.f280443d).getString(C0966R.string.f361137hk2));
            }
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236181b = str;
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                contextMenu.add(0, 18, 0, TimelineClickListener.m122988j(this.f280443d).getString(C0966R.string.a19));
            }
            NotInteresetABTestManager.m119627b(contextMenu, DN);
            MenuItem add = contextMenu.add(0, 21, 0, TimelineClickListener.m122988j(this.f280443d).getString(C0966R.string.jby));
            int[] iArr = new int[2];
            int width = view.getWidth();
            int height = view.getHeight();
            view.getLocationInWindow(iArr);
            Intent intent = new Intent();
            intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
            add.setIntent(intent);
            if (((TimelineClickListener.m122988j(this.f280443d) instanceof SnsTimeLineUI) || (TimelineClickListener.m122988j(this.f280443d) instanceof ImproveSnsTimelineUI) || (TimelineClickListener.m122988j(this.f280443d) instanceof SnsCommentDetailUI)) && !((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
                contextMenu.add(0, 26, 0, TimelineClickListener.m122988j(this.f280443d).getString(C0966R.string.cwg));
                int i = ((TimelineClickListener.m122988j(this.f280443d) instanceof SnsTimeLineUI) || (TimelineClickListener.m122988j(this.f280443d) instanceof ImproveSnsTimelineUI)) ? 10 : 7;
                TimeLineObject timeLine = DN.getTimeLine();
                C101804kv2 kv22 = u4Var.f281207b < timeLine.ContentObj.f298427h.size() ? timeLine.ContentObj.f298427h.get(u4Var.f281207b) : new C101804kv2();
                ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
                chatImageWebSearchActionStruct.mo126611w("");
                chatImageWebSearchActionStruct.mo126609u(C102236a0.m134765q0(DN.field_snsId));
                chatImageWebSearchActionStruct.f265370f = i;
                chatImageWebSearchActionStruct.f265369e = 1;
                chatImageWebSearchActionStruct.f265371g = 81;
                chatImageWebSearchActionStruct.mo126608t("");
                chatImageWebSearchActionStruct.mo126607s("");
                chatImageWebSearchActionStruct.mo126610v(C90193h.m112876d(C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134717L(kv22)));
                chatImageWebSearchActionStruct.f265377m = System.currentTimeMillis();
                chatImageWebSearchActionStruct.mo86054n();
                ((C92330r) C86312j.m106911c(C92330r.class)).Ec0(chatImageWebSearchActionStruct);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
        if (view.getTag() instanceof C96235u4) {
            String str = ((C96235u4) view.getTag()).f281206a;
            this.f280443d.f280381k.mo133554b(view, str, C94866e1.Yx0().mo139798DN(str).getTimeLine());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
        return false;
    }
}
