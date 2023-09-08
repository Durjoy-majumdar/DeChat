package rb2;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rb2.C63380a;
import rx3.C13598b0;
import u23.C65003a;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.thumb.ThumbCachedLoader$enqueue$1$1$1$1", mo125469f = "ThumbCachedLoader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: rb2.b */
public final class C63384b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C63380a.C63381a f179793d;

    /* renamed from: e */
    public final /* synthetic */ long f179794e;

    /* renamed from: f */
    public final /* synthetic */ C65003a f179795f;

    /* renamed from: g */
    public final /* synthetic */ Bitmap f179796g;

    /* renamed from: h */
    public final /* synthetic */ C63380a f179797h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63384b(C63380a.C63381a aVar, long j, C65003a aVar2, Bitmap bitmap, C63380a aVar3, C15601d<? super C63384b> dVar) {
        super(2, dVar);
        this.f179793d = aVar;
        this.f179794e = j;
        this.f179795f = aVar2;
        this.f179796g = bitmap;
        this.f179797h = aVar3;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63384b(this.f179793d, this.f179794e, this.f179795f, this.f179796g, this.f179797h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63384b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f179793d.f179786c.remove(new Long(this.f179794e));
        Log.m105924i("MicroMsg.ThumbCachedLoader", this.f179795f + " receives " + this.f179794e);
        if (this.f179796g != null) {
            this.f179797h.f179783d.put(new C63380a.C63382b(this.f179795f, this.f179794e), this.f179796g);
            this.f179793d.f179787d.add(new Long(this.f179794e));
            this.f179793d.f179788e.mo75539t(new Long(this.f179794e));
        }
        return C13598b0.f38549a;
    }
}
