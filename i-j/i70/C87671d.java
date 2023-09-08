package i70;

import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C86428f;

/* renamed from: i70.d */
public final class C87671d extends C80403e {

    /* renamed from: b */
    public final /* synthetic */ C87667c<Object, C86428f<Object>> f253936b;

    public C87671d(C87667c<Object, C86428f<Object>> cVar) {
        this.f253936b = cVar;
    }

    /* renamed from: a */
    public void mo56329a() {
        Log.m105924i(this.f253936b.mo122096p0(), "onEnterForeground");
        C87667c<Object, C86428f<Object>> cVar = this.f253936b;
        Log.m105924i(cVar.mo122096p0(), "resume");
        cVar.mo122095o0().resume();
    }

    /* renamed from: b */
    public void mo56330b() {
        Log.m105924i(this.f253936b.mo122096p0(), "onExitForeground");
        C87667c<Object, C86428f<Object>> cVar = this.f253936b;
        Log.m105924i(cVar.mo122096p0(), "pause");
        cVar.mo122095o0().pause();
    }
}
