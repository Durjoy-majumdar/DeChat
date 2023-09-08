package com.tencent.p014mm.p136ui.chatting.component;

import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.component.RemittanceSearchComponent;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.ui.chatting.component.h4 */
public class C73492h4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RemittanceSearchComponent.C733811 f215916d;

    /* renamed from: com.tencent.mm.ui.chatting.component.h4$a */
    public class C73493a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f215917d;

        public C73493a(int i) {
            this.f215917d = i;
        }

        public void run() {
            C67391b bVar = RemittanceSearchComponent.this.f215752d;
            int s = ((BaseChattingUIFragment) bVar.f193287k).mo102031Z().mo81305s(1, this.f215917d);
            MMChattingListView mMChattingListView = ((ChattingUIFragment) RemittanceSearchComponent.this.f215752d.f193288l).f215289B;
            if (mMChattingListView != null) {
                mMChattingListView.setHighLightChildNew(s);
                RemittanceSearchComponent.this.f215752d.f193290n = false;
            }
        }
    }

    public C73492h4(RemittanceSearchComponent.C733811 r1) {
        this.f215916d = r1;
    }

    public void run() {
        C67391b bVar = RemittanceSearchComponent.this.f215752d;
        int i = bVar.f193289m;
        C72917n0 k = bVar.mo91570k();
        if (k.getFirstVisiblePosition() < i && i < k.getLastVisiblePosition()) {
            int s = ((BaseChattingUIFragment) RemittanceSearchComponent.this.f215752d.f193287k).mo102031Z().mo81305s(1, i);
            MMChattingListView mMChattingListView = ((ChattingUIFragment) RemittanceSearchComponent.this.f215752d.f193288l).f215289B;
            if (mMChattingListView != null) {
                mMChattingListView.setHighLightChildNew(s);
                RemittanceSearchComponent.this.f215752d.f193290n = false;
                return;
            }
            return;
        }
        C119179t tVar = C119157j.f356862d;
        C73493a aVar = new C73493a(i);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 200, false);
    }
}
