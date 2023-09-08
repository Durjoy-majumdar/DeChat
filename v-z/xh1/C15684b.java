package xh1;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles$getZipPath$2", mo125469f = "GesturesFiles.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: xh1.b */
public final class C15684b extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f42378d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15684b(String str, C15601d<? super C15684b> dVar) {
        super(2, dVar);
        this.f42378d = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15684b(this.f42378d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15684b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        String str = this.f42378d;
        if (str == null || str.length() == 0) {
            return "";
        }
        return C23087a.f66319b + MD5Util.getMD5String(this.f42378d) + ".zip";
    }
}
