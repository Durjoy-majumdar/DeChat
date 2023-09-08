package qj1;

import a14.C0000n0;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import fy3.C32227p;
import kotlin.ResultKt;
import p50.C62193a;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveTXLivePlayerPlugin$getFrameShot$2", mo125469f = "FinderLiveTXLivePlayerPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: qj1.af */
public final class C12250af extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C63170ze f35328d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f35329e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12250af(C63170ze zeVar, Bitmap bitmap, C15601d<? super C12250af> dVar) {
        super(2, dVar);
        this.f35328d = zeVar;
        this.f35329e = bitmap;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C12250af(this.f35328d, this.f35329e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12250af) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C62193a c = C62193a.f176816k1.mo87262c(this.f35328d.mo87686C0().f151977d.f157064e);
        if (c == null) {
            return null;
        }
        Bitmap bitmap = this.f35329e;
        Matrix matrix = new Matrix();
        matrix.postScale(((float) c.f176825b1) / ((float) bitmap.getWidth()), ((float) c.f176826c1) / ((float) bitmap.getHeight()));
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }
}
