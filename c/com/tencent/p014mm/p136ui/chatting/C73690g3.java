package com.tencent.p014mm.p136ui.chatting;

import ck3.C67398g;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import go3.C76019y;
import km3.C21358a;
import p739wi.C78597c;

/* renamed from: com.tencent.mm.ui.chatting.g3 */
public class C73690g3 extends C67398g {

    /* renamed from: d */
    public final /* synthetic */ ChattingUIFragment f216349d;

    public C73690g3(ChattingUIFragment chattingUIFragment) {
        this.f216349d = chattingUIFragment;
    }

    /* renamed from: a */
    public void mo91597a() {
        this.f216349d.mo102034f0();
        if (this.f216349d.thisActivity() instanceof C78597c.C78600d) {
            ((C78597c.C78600d) this.f216349d.thisActivity()).mo94875S3();
        }
        ChattingUIFragment chattingUIFragment = this.f216349d;
        if (chattingUIFragment.isCurrentActivity || !chattingUIFragment.isSupportNavigationSwipeBack()) {
            this.f216349d.mo102083n0();
            return;
        }
        SwipeBackLayout swipeBackLayout = this.f216349d.getSwipeBackLayout();
        Log.m105925i("MicroMsg.SwipeBackLayout", "scrollToFinishActivity, Scrolling %B, hasTranslucent %B, hasCallPopOut %B", Boolean.valueOf(swipeBackLayout.f56498v), Boolean.valueOf(swipeBackLayout.f56496t), Boolean.valueOf(swipeBackLayout.f56497u));
        if (!swipeBackLayout.mo26379a()) {
            C76019y.m91314b(0.0f);
            swipeBackLayout.f56498v = true;
            swipeBackLayout.f56497u = false;
            int width = swipeBackLayout.f56488i.getWidth() + swipeBackLayout.f56491o.getIntrinsicWidth() + 10;
            C21358a aVar = swipeBackLayout.f56489j;
            aVar.f60423s = swipeBackLayout.f56488i;
            aVar.f60407c = -1;
            aVar.mo33431g(width, 0, 0, 0, 260);
            swipeBackLayout.invalidate();
            SwipeBackLayout.C19847c cVar = swipeBackLayout.f56482C;
            if (cVar != null) {
                cVar.onDrag();
            }
            C76019y.m91313a(true, 0);
        }
    }
}
