package yt3;

import com.tencent.p014mm.sdk.platformtools.Log;
import nv2.C21696b;
import vt3.C111616b;

/* renamed from: yt3.j */
public class C23336j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23325h f67074d;

    public C23336j(C23325h hVar) {
        this.f67074d = hVar;
    }

    public void run() {
        C111616b bVar = this.f67074d.f67053h;
        if (bVar != null) {
            Log.m105926v("MicroMsg.SoterControllerFingerprint", "alvinluo mp onStartAuthencation");
            C21696b.this.f61407i = true;
        }
    }
}
