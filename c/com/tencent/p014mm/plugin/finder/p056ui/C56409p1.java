package com.tencent.p014mm.plugin.finder.p056ui;

import df1.C58259c;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.p1 */
public final class C56409p1 extends C58555d {

    /* renamed from: g */
    public final /* synthetic */ FinderMediaPreviewUI f161260g;

    /* renamed from: com.tencent.mm.plugin.finder.ui.p1$a */
    public static final class C56410a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58259c.C58260a f161261d;

        /* renamed from: e */
        public final /* synthetic */ FinderMediaPreviewUI f161262e;

        public C56410a(C58259c.C58260a aVar, FinderMediaPreviewUI finderMediaPreviewUI) {
            this.f161261d = aVar;
            this.f161262e = finderMediaPreviewUI;
        }

        public final void run() {
            int i = this.f161261d.f166811b;
            if (i == 2) {
                FinderMediaPreviewUI finderMediaPreviewUI = this.f161262e;
                int i2 = FinderMediaPreviewUI.f161053y;
                finderMediaPreviewUI.mo79092O7().seek(0);
            } else if (i == 3) {
                FinderMediaPreviewUI finderMediaPreviewUI2 = this.f161262e;
                int i3 = FinderMediaPreviewUI.f161053y;
                finderMediaPreviewUI2.mo79092O7().setVideoTotalTime(this.f161261d.f166816g);
                this.f161262e.mo79092O7().seek(this.f161261d.f166815f);
            }
        }
    }

    public C56409p1(FinderMediaPreviewUI finderMediaPreviewUI) {
        this.f161260g = finderMediaPreviewUI;
    }

    /* renamed from: B1 */
    public void mo2331B1(C7637b bVar) {
        C87412m.m108594g(bVar, "ev");
        C58259c.C58260a aVar = bVar instanceof C58259c.C58260a ? (C58259c.C58260a) bVar : null;
        if (aVar != null) {
            FinderMediaPreviewUI finderMediaPreviewUI = this.f161260g;
            int i = FinderMediaPreviewUI.f161053y;
            finderMediaPreviewUI.mo79092O7().post(new C56410a(aVar, this.f161260g));
        }
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        return bVar instanceof C58259c.C58260a;
    }
}
