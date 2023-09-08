package ry1;

import com.tencent.p014mm.plugin.game.model.C42062h0;
import com.tencent.p014mm.plugin.game.p061ui.GameDetailUI2;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: ry1.y */
public class C48170y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[] f129106d;

    /* renamed from: e */
    public final /* synthetic */ GameDetailUI2 f129107e;

    /* renamed from: ry1.y$a */
    public class C48171a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C42062h0 f129108d;

        public C48171a(C42062h0 h0Var) {
            this.f129108d = h0Var;
        }

        public void run() {
            GameDetailUI2.m45863H7(C48170y.this.f129107e, this.f129108d);
        }
    }

    public C48170y(GameDetailUI2 gameDetailUI2, byte[] bArr) {
        this.f129107e = gameDetailUI2;
        this.f129106d = bArr;
    }

    public void run() {
        MMHandlerThread.postToMainThread(new C48171a(new C42062h0(this.f129106d)));
    }
}
