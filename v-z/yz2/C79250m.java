package yz2;

import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import nz2.C47313a;
import vz2.C78501d;

/* renamed from: yz2.m */
public final class C79250m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79239k f232673d;

    /* renamed from: e */
    public final /* synthetic */ C47313a f232674e;

    public C79250m(C79239k kVar, C47313a aVar) {
        this.f232673d = kVar;
        this.f232674e = aVar;
    }

    public final void run() {
        try {
            View view = this.f232673d.f232658z;
            boolean z = true;
            if (view == null || !view.getGlobalVisibleRect(new Rect())) {
                z = false;
            }
            if (z) {
                C78501d.m94805g(C78501d.f229945a, 9, String.valueOf(this.f232674e.f126986b), this.f232673d.f232626M, 0, (String) null, 0, 56, (Object) null);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.TextStatus.MoreTabCardView", th, "[expose notify]err", new Object[0]);
        }
    }
}
