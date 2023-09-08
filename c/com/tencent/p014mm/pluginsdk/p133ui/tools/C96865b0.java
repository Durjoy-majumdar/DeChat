package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.b0 */
public final class C96865b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FileSelectorUI.C96829c f283840d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.b0$a */
    public static final class C96866a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FileSelectorUI.C96829c f283841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96866a(FileSelectorUI.C96829c cVar) {
            super(0);
            this.f283841d = cVar;
        }

        public Object invoke() {
            this.f283841d.f283728d.mo135156i();
            return C13598b0.f38549a;
        }
    }

    public C96865b0(FileSelectorUI.C96829c cVar) {
        this.f283840d = cVar;
    }

    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        FileSelectorUI.C96829c cVar = this.f283840d;
        boolean z = cVar.f283732h;
        if (!z) {
            cVar.f283732h = true;
            while (true) {
                if (this.f283840d.f283730f.size() < 10) {
                    if (FileSelectorUI.C96829c.m124383d(this.f283840d) <= 0) {
                        Log.m105924i("MicroMsg.FileSelectorUI", "has no data to load，chatting init sync end:" + (System.currentTimeMillis() - currentTimeMillis));
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            FileSelectorUI.C96829c.m124383d(cVar);
        }
        C61926c.m72668M(new C96866a(this.f283840d));
        Log.m105924i("MicroMsg.FileSelectorUI", "[isInit:" + z + "] fav load data end:" + (System.currentTimeMillis() - currentTimeMillis) + ", startIndex:" + this.f283840d.f283733i);
    }
}
