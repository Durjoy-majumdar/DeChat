package kj3;

import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.view.WindowManager;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: kj3.l */
public class C76590l extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C76593o f224171a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76590l(C76593o oVar, Looper looper) {
        super(looper);
        this.f224171a = oVar;
    }

    public void handleMessage(Message message) {
        boolean z;
        C76593o oVar = this.f224171a;
        if (oVar.f224179i == null || oVar.f224177g == null || oVar.f224176f == null || oVar.f224183p == null) {
            Log.m105920e("MicroMsg.AppBrandServiceImageBubble", "these references include null reference");
            return;
        }
        if (oVar.f224182o != null) {
            Log.m105918d("MicroMsg.AppBrandServiceImageBubble", "bitmap is null,return");
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            oVar.mo1908d();
        } else {
            oVar.onBitmapLoaded(oVar.f224182o);
        }
        boolean z2 = oVar.f224184q;
        int i = z2 ? 83 : 85;
        int i2 = z2 ? 0 : 10;
        int yFromBottom = oVar.f224183p.getYFromBottom();
        Rect rect = C85875k4.f250155a;
        int i3 = oVar.f224184q ? 0 : i2 + rect.right;
        int i4 = yFromBottom + rect.bottom;
        Log.m105925i("MicroMsg.AppBrandServiceImageBubble", "bubble navbar height %s %s", Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
        try {
            oVar.f224177g.showAtLocation(oVar.f224176f, i, i3, i4);
            new MTimerHandler(new C76591m(oVar), false).startTimer(10000);
        } catch (WindowManager.BadTokenException unused) {
        }
    }
}
