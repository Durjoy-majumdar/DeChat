package ry1;

import com.tencent.p014mm.plugin.game.model.C42075l0;
import com.tencent.p014mm.plugin.game.p061ui.GameLibraryUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: ry1.l0 */
public class C48132l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[] f129025d;

    /* renamed from: e */
    public final /* synthetic */ GameLibraryUI f129026e;

    /* renamed from: ry1.l0$a */
    public class C48133a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C42075l0 f129027d;

        public C48133a(C42075l0 l0Var) {
            this.f129027d = l0Var;
        }

        public void run() {
            GameLibraryUI.m45881H7(C48132l0.this.f129026e, this.f129027d, false);
        }
    }

    public C48132l0(GameLibraryUI gameLibraryUI, byte[] bArr) {
        this.f129026e = gameLibraryUI;
        this.f129025d = bArr;
    }

    public void run() {
        MMHandlerThread.postToMainThread(new C48133a(new C42075l0(this.f129025d)));
    }
}
