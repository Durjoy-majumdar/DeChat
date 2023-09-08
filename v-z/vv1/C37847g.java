package vv1;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: vv1.g */
public final class C37847g<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C65896f f100205a;

    public C37847g(C65896f fVar) {
        this.f100205a = fVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        String str = this.f100205a.f189455d;
        Log.m105924i(str, "OnPreSearchSceneEnd " + cVar.f256793a + ' ' + cVar.f256794b + ' ' + cVar.f256795c + " pardusCacheExpireTime:" + this.f100205a.f189457f);
        return C13598b0.f38549a;
    }
}
