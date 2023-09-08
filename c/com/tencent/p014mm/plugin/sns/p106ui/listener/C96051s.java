package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.ContextMenu;
import android.view.View;
import c00.C0405n;
import c00.C92330r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.C96230u;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsWsFoldDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import gv2.C98242p;
import java.util.List;
import os2.C100416r;
import p255vr.C65873e;
import te3.w64;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.s */
public class C96051s extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280461d;

    public C96051s(TimelineClickListener timelineClickListener) {
        this.f280461d = timelineClickListener;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        int i;
        String str;
        ContextMenu contextMenu2 = contextMenu;
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
        if (view.getTag() instanceof C96230u) {
            C96230u uVar = (C96230u) view.getTag();
            boolean z = true;
            if (!C98242p.m126942d(uVar.f281195e.f299716t, 64) && (!C98242p.m126942d(uVar.f281195e.f299716t, 16) || uVar.f281199i == 2)) {
                SnsMethodCalculate.markStartTimeMs("hasEmojiComment", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
                w64 w64 = uVar.f281195e;
                boolean z2 = w64 != null && !Util.isNullOrNil((List) w64.f299717u);
                SnsMethodCalculate.markEndTimeMs("hasEmojiComment", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
                if (!z2) {
                    contextMenu2.add(0, 11, 0, TimelineClickListener.m122988j(this.f280461d).getString(C0966R.string.f7936wt));
                }
            }
            if ((!Util.isNullOrNil(uVar.f281198h) && uVar.f281198h.equals(C75592q0.m90789s())) || ((str = uVar.f281194d) != null && str.equals(C75592q0.m90789s()))) {
                contextMenu2.add(0, 7, 0, TimelineClickListener.m122988j(this.f280461d).getString(C0966R.string.f7944x1));
            }
            if (!C98242p.m126942d(uVar.f281195e.f299716t, 16)) {
                SnsMethodCalculate.markStartTimeMs("hasEmojiComment", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
                w64 w642 = uVar.f281195e;
                if (w642 == null || Util.isNullOrNil((List) w642.f299717u)) {
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("hasEmojiComment", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
                if (!z) {
                    if (!uVar.mo133895b()) {
                        C94965w1.m120621b(contextMenu2, false);
                    } else {
                        C94965w1.m120622c(contextMenu2, false);
                    }
                }
            }
            if (((TimelineClickListener.m122988j(this.f280461d) instanceof SnsTimeLineUI) || (TimelineClickListener.m122988j(this.f280461d) instanceof SnsCommentDetailUI) || (TimelineClickListener.m122988j(this.f280461d) instanceof ImproveSnsTimelineUI) || (TimelineClickListener.m122988j(this.f280461d) instanceof SnsWsFoldDetailUI)) && !((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
                contextMenu2.add(0, 29, 0, TimelineClickListener.m122988j(this.f280461d).getString(C0966R.string.cwg));
                String nullAs = Util.nullAs(uVar.f281193c, "");
                if (!(TimelineClickListener.m122988j(this.f280461d) instanceof SnsCommentDetailUI)) {
                    if (TimelineClickListener.m122988j(this.f280461d) instanceof SnsWsFoldDetailUI) {
                        i = 6;
                    } else if (!(TimelineClickListener.m122988j(this.f280461d) instanceof SnsTimeLineUI) && !(TimelineClickListener.m122988j(this.f280461d) instanceof ImproveSnsTimelineUI)) {
                        i = 0;
                    }
                    ((C92330r) C86312j.m106911c(C92330r.class)).Hh0(1, ((C65873e) C86312j.m106911c(C65873e.class)).ep0(77), 77, 0, "", "", C102236a0.m134765q0(C100416r.m131409b(uVar.f281191a).field_snsId), "", 3, "", 0, (long) nullAs.length(), i, "", "", -1);
                }
                i = 7;
                ((C92330r) C86312j.m106911c(C92330r.class)).Hh0(1, ((C65873e) C86312j.m106911c(C65873e.class)).ep0(77), 77, 0, "", "", C102236a0.m134765q0(C100416r.m131409b(uVar.f281191a).field_snsId), "", 3, "", 0, (long) nullAs.length(), i, "", "", -1);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
        if (view.getTag() instanceof C96230u) {
            SnsInfo TE = C94866e1.Yx0().mo139807TE(((C96230u) view.getTag()).f281192b);
            this.f280461d.f280381k.mo133554b(view, TE.getLocalid(), TE.getTimeLine());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
        return false;
    }
}
