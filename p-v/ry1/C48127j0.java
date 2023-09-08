package ry1;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.game.p061ui.GameInstalledView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import ic0.C21070h;
import jc0.C21210b;

/* renamed from: ry1.j0 */
public class C48127j0 implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ View f129015a;

    /* renamed from: b */
    public final /* synthetic */ GameInstalledView f129016b;

    /* renamed from: ry1.j0$a */
    public class C48128a implements Runnable {
        public C48128a() {
        }

        public void run() {
            C48127j0 j0Var = C48127j0.this;
            GameInstalledView gameInstalledView = j0Var.f129016b;
            int i = gameInstalledView.f113988o;
            if (i == 0) {
                gameInstalledView.f113988o = i + 1;
                gameInstalledView.f113980d.addView(j0Var.f129015a, gameInstalledView.f113994u);
            }
        }
    }

    public C48127j0(GameInstalledView gameInstalledView, View view) {
        this.f129016b = gameInstalledView;
        this.f129015a = view;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        if (bVar.f59985a == 0) {
            MMHandlerThread.postToMainThread(new C48128a());
        }
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}
