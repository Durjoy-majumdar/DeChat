package ry1;

import com.tencent.p014mm.plugin.game.p061ui.C42307d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.LinkedList;

/* renamed from: ry1.m0 */
public class C48135m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f129030d;

    /* renamed from: e */
    public final /* synthetic */ C42307d f129031e;

    /* renamed from: ry1.m0$a */
    public class C48136a implements Runnable {
        public C48136a() {
        }

        public void run() {
            C48135m0 m0Var = C48135m0.this;
            C48135m0.super.mo72845a(m0Var.f129030d);
            Log.m105925i("MicroMsg.GameListAdapter", "add size: %d", Integer.valueOf(C48135m0.this.f129030d.size()));
        }
    }

    public C48135m0(C42307d dVar, LinkedList linkedList) {
        this.f129031e = dVar;
        this.f129030d = linkedList;
    }

    public void run() {
        C42307d.m46001f(this.f129031e, this.f129030d);
        MMHandlerThread.postToMainThread(new C48136a());
    }
}
