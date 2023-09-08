package iw2;

import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dw2.C97558d;
import f40.C86709a0;
import ob0.C89137b0;

/* renamed from: iw2.c */
public final class C98811c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98804a f289672d;

    public C98811c(C98804a aVar) {
        this.f289672d = aVar;
    }

    public final void run() {
        Log.m105924i("MicroMsg.AlbumPresenter", "loadNpData username=" + this.f289672d.f289657e + " maxId=" + this.f289672d.f289659g);
        C98804a aVar = this.f289672d;
        int i = aVar.f289662j;
        if (i == 0 && !aVar.f289663n) {
            aVar.f289662j = i + 1;
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            C98804a aVar2 = this.f289672d;
            String str = aVar2.f289657e;
            b0Var.mo123460f(new C97558d(str, aVar2.f289659g, Util.isEqual(str, StoryCore.f281736t.mo134187e())));
        }
    }
}
