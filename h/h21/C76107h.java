package h21;

import com.tencent.p014mm.plugin.collect.p038ui.CollectCreateQRCodeNewUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;

/* renamed from: h21.h */
public class C76107h implements C76879j.C47267l {

    /* renamed from: a */
    public final /* synthetic */ CollectCreateQRCodeNewUI f223021a;

    /* renamed from: h21.h$a */
    public class C76108a implements Runnable {
        public C76108a() {
        }

        public void run() {
            C76107h.this.f223021a.hideVKB();
            C76107h.this.f223021a.showNormalStWcKb();
        }
    }

    public C76107h(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f223021a = collectCreateQRCodeNewUI;
    }

    public boolean onFinish(CharSequence charSequence) {
        if (!Util.isNullOrNil(charSequence.toString())) {
            this.f223021a.f197800g = charSequence.toString();
            this.f223021a.mo94692J7();
        } else {
            CollectCreateQRCodeNewUI collectCreateQRCodeNewUI = this.f223021a;
            collectCreateQRCodeNewUI.f197800g = "";
            collectCreateQRCodeNewUI.mo94692J7();
        }
        MMHandlerThread.postToMainThreadDelayed(new C76108a(), 200);
        return true;
    }
}
