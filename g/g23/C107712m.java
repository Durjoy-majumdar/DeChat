package g23;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.player.VLogScriptReader$doPreloadMaterials$1$1$1", mo125469f = "VLogScriptReader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: g23.m */
public final class C107712m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C107697b f322280d;

    /* renamed from: e */
    public final /* synthetic */ long f322281e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107712m(C107697b bVar, long j, C15601d<? super C107712m> dVar) {
        super(2, dVar);
        this.f322280d = bVar;
        this.f322281e = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C107712m(this.f322280d, this.f322281e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107712m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.VLogScriptReader", "doPreloadMaterials, play: " + this.f322280d.f322214d.f282491c + ", texture:" + this.f322280d.f322211a + ", pts:" + this.f322281e + ", startTime:" + this.f322280d.f322214d.f282489a);
        C107697b bVar = this.f322280d;
        if (!bVar.f322225o) {
            bVar.mo158105c();
        }
        this.f322280d.mo158106d(0);
        this.f322280d.mo158104b(0, false);
        return C13598b0.f38549a;
    }
}
