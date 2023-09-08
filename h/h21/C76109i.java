package h21;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.collect.p038ui.CollectCreateQRCodeNewUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: h21.i */
public class C76109i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CollectCreateQRCodeNewUI f223023d;

    /* renamed from: h21.i$a */
    public class C76110a implements Runnable {
        public C76110a() {
        }

        public void run() {
            C76109i.this.f223023d.hideVKB();
            C76109i.this.f223023d.showNormalStWcKb();
        }
    }

    public C76109i(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f223023d = collectCreateQRCodeNewUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MMHandlerThread.postToMainThreadDelayed(new C76110a(), 200);
    }
}
