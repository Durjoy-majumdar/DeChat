package iw2;

import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dw2.C97558d;
import f40.C86709a0;
import ob0.C89137b0;

/* renamed from: iw2.b */
public final class C98808b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98804a f289668d;

    public C98808b(C98804a aVar) {
        this.f289668d = aVar;
    }

    public final void run() {
        Log.m105924i("MicroMsg.AlbumPresenter", "loadFpData username=" + this.f289668d.f289657e + " maxId=" + this.f289668d.f289659g);
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        C98804a aVar = this.f289668d;
        String str = aVar.f289657e;
        b0Var.mo123460f(new C97558d(str, aVar.f289659g, Util.isEqual(str, StoryCore.f281736t.mo134187e())));
    }
}
