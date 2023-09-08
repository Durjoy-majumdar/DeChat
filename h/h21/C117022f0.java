package h21;

import android.widget.Toast;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import te3.C118461r00;
import te3.C118477wj3;

/* renamed from: h21.f0 */
public class C117022f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Toast f350675d;

    /* renamed from: e */
    public final /* synthetic */ C118477wj3 f350676e;

    /* renamed from: f */
    public final /* synthetic */ C118461r00 f350677f;

    /* renamed from: g */
    public final /* synthetic */ CollectMainUI f350678g;

    public C117022f0(CollectMainUI collectMainUI, Toast toast, C118477wj3 wj32, C118461r00 r002) {
        this.f350678g = collectMainUI;
        this.f350675d = toast;
        this.f350676e = wj32;
        this.f350677f = r002;
    }

    public void run() {
        this.f350675d.cancel();
        C118477wj3 wj32 = this.f350676e;
        if (wj32 != null) {
            CollectMainUI collectMainUI = this.f350678g;
            int i = CollectMainUI.f345567z1;
            collectMainUI.mo175112d8(wj32);
        }
        C118461r00 r002 = this.f350677f;
        if (r002 != null) {
            CollectMainUI collectMainUI2 = this.f350678g;
            int i2 = CollectMainUI.f345567z1;
            collectMainUI2.mo175113e8(r002);
        }
    }
}
