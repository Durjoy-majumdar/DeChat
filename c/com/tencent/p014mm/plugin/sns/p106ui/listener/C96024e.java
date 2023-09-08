package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.ContextMenu;
import android.view.View;
import c00.C0405n;
import c00.C92330r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.C96113p5;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsWsFoldDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ke3.C88144b;
import p255vr.C65873e;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.e */
public class C96024e extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280430d;

    public C96024e(TimelineClickListener timelineClickListener) {
        this.f280430d = timelineClickListener;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        int i;
        ContextMenu contextMenu2 = contextMenu;
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
        C96113p5 p5Var = (C96113p5) view.getTag();
        SnsInfo DN = C94866e1.Yx0().mo139798DN(p5Var.f280720b);
        if (DN == null) {
            DN = C94866e1.Yx0().mo139807TE(p5Var.f280719a);
        }
        if (DN == null) {
            Log.m105925i("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu: desc failed, snsId:%s, localId:%s", p5Var.f280719a, p5Var.f280720b);
            SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
            return;
        }
        if (!DN.isNoCopy()) {
            contextMenu2.add(0, 0, 0, TimelineClickListener.m122988j(this.f280430d).getString(C0966R.string.f7936wt));
        }
        C88144b.m109788f("favorite");
        if (!DN.isAd()) {
            contextMenu2.add(0, 1, 0, TimelineClickListener.m122988j(this.f280430d).getString(C0966R.string.f361137hk2));
        }
        TimeLineObject timeLine = DN.getTimeLine();
        if (p5Var.f280721c || !(timeLine == null || timeLine.contentDescShowType == 1 || p5Var.f280722d)) {
            if (!p5Var.mo133678b()) {
                C94965w1.m120621b(contextMenu2, true);
            } else {
                C94965w1.m120622c(contextMenu2, true);
            }
        }
        NotInteresetABTestManager.m119627b(contextMenu2, DN);
        if (((TimelineClickListener.m122988j(this.f280430d) instanceof SnsTimeLineUI) || (TimelineClickListener.m122988j(this.f280430d) instanceof SnsCommentDetailUI) || (TimelineClickListener.m122988j(this.f280430d) instanceof ImproveSnsTimelineUI) || (TimelineClickListener.m122988j(this.f280430d) instanceof SnsWsFoldDetailUI)) && !((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
            contextMenu2.add(0, 27, 0, TimelineClickListener.m122988j(this.f280430d).getString(C0966R.string.cwg));
            String nullAs = Util.nullAs(DN.getTimeLine().ContentDesc, "");
            if (!(TimelineClickListener.m122988j(this.f280430d) instanceof SnsCommentDetailUI)) {
                if (TimelineClickListener.m122988j(this.f280430d) instanceof SnsWsFoldDetailUI) {
                    i = 6;
                } else if (!(TimelineClickListener.m122988j(this.f280430d) instanceof SnsTimeLineUI) && !(TimelineClickListener.m122988j(this.f280430d) instanceof ImproveSnsTimelineUI)) {
                    i = 0;
                }
                ((C92330r) C86312j.m106911c(C92330r.class)).Hh0(1, ((C65873e) C86312j.m106911c(C65873e.class)).ep0(77), 77, 0, "", "", C102236a0.m134765q0(DN.field_snsId), "", 3, "", 0, (long) nullAs.length(), i, "", "", -1);
            }
            i = 5;
            ((C92330r) C86312j.m106911c(C92330r.class)).Hh0(1, ((C65873e) C86312j.m106911c(C65873e.class)).ep0(77), 77, 0, "", "", C102236a0.m134765q0(DN.field_snsId), "", 3, "", 0, (long) nullAs.length(), i, "", "", -1);
        }
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
        if (view.getTag() instanceof C96113p5) {
            C96113p5 p5Var = (C96113p5) view.getTag();
            SnsInfo DN = C94866e1.Yx0().mo139798DN(p5Var.f280720b);
            if (DN == null) {
                DN = C94866e1.Yx0().mo139807TE(p5Var.f280719a);
            }
            if (DN == null) {
                Log.m105925i("MicroMsg.TimelineOnCreateContextMenuListener", "onbindOnSelectedView: desc failed, snsId:%s, localId:%s", p5Var.f280719a, p5Var.f280720b);
                SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
                return false;
            }
            this.f280430d.f280381k.mo133554b(view, DN.getLocalid(), DN.getTimeLine());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
        return false;
    }
}
