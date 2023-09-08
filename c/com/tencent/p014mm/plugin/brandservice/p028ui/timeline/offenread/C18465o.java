package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72996z1;
import gy3.C87412m;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.o */
public final class C18465o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineHotView f51244d;

    /* renamed from: e */
    public final /* synthetic */ String f51245e;

    public C18465o(BizTimeLineHotView bizTimeLineHotView, String str) {
        this.f51244d = bizTimeLineHotView;
        this.f51245e = str;
    }

    public final void run() {
        String str;
        if (!this.f51244d.f51172n.isEmpty() && (str = this.f51245e) != null && !C72996z1.m85841l5(str)) {
            try {
                Iterator<C18468r> it = this.f51244d.f51172n.iterator();
                while (it.hasNext()) {
                    C18468r next = it.next();
                    String str2 = this.f51245e;
                    C87412m.m108591d(next);
                    if (C87412m.m108589b(str2, next.f354229d)) {
                        if (this.f51244d.mo23035g(next)) {
                            BizTimeLineHotView bizTimeLineHotView = this.f51244d;
                            bizTimeLineHotView.getClass();
                            MMHandlerThread.postToMainThread(new C18463m(bizTimeLineHotView, next));
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.BizTimeLineHotList", "updateGreenDot ex:%s", e.getMessage());
            }
        }
    }
}
