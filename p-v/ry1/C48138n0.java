package ry1;

import com.tencent.p014mm.plugin.game.p061ui.C42307d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.LinkedList;

/* renamed from: ry1.n0 */
public class C48138n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f129034d;

    /* renamed from: e */
    public final /* synthetic */ C42307d f129035e;

    /* renamed from: ry1.n0$a */
    public class C48139a implements Runnable {
        public C48139a() {
        }

        public void run() {
            C48138n0 n0Var = C48138n0.this;
            C48138n0.super.mo72847d(n0Var.f129034d);
            Log.m105925i("MicroMsg.GameListAdapter", "set size: %d", Integer.valueOf(C48138n0.this.f129034d.size()));
        }
    }

    public C48138n0(C42307d dVar, LinkedList linkedList) {
        this.f129035e = dVar;
        this.f129034d = linkedList;
    }

    public void run() {
        C42307d.m46001f(this.f129035e, this.f129034d);
        MMHandlerThread.postToMainThread(new C48139a());
    }
}
