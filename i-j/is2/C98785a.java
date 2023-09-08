package is2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.graphics.Bitmap;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32227p;
import jr2.C76439o;
import jr2.C99019x;
import kotlin.ResultKt;
import os2.C100408j0;
import rx3.C13598b0;
import te3.C101804kv2;
import vr2.C102236a0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2", mo125469f = "SnsImageLoader.kt", mo125470l = {90}, mo125471m = "invokeSuspend")
/* renamed from: is2.a */
public final class C98785a extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

    /* renamed from: d */
    public int f289616d;

    /* renamed from: e */
    public final /* synthetic */ C101804kv2 f289617e;

    /* renamed from: f */
    public final /* synthetic */ boolean f289618f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98785a(C101804kv2 kv22, boolean z, C15601d<? super C98785a> dVar) {
        super(2, dVar);
        this.f289617e = kv22;
        this.f289618f = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        C98785a aVar = new C98785a(this.f289617e, this.f289618f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        return aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        Object invokeSuspend = ((C98785a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f289616d;
        Bitmap bitmap = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C101804kv2 kv22 = this.f289617e;
            boolean z = this.f289618f;
            this.f289616d = 1;
            SnsMethodCalculate.markStartTimeMs("getImagePathFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
            obj = C53895h.m60469g(C53872d1.f151119c, new C98787c(z, kv22, (C15601d<? super C98787c>) null), this);
            SnsMethodCalculate.markEndTimeMs("getImagePathFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
            if (obj == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
            throw illegalStateException;
        }
        String str = (String) obj;
        if (!C86013q1.m106450k(str)) {
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
            return null;
        } else if (this.f289618f) {
            Bitmap n = ((C94901o) C99019x.m128972d()).mo131130n(this.f289617e);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
            return n;
        } else {
            C76439o d = C99019x.m128972d();
            String str2 = this.f289617e.f298689d;
            C94901o oVar = (C94901o) d;
            oVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            C92714n i2 = oVar.mo131121i(str, str2);
            if (C102236a0.m134742f(i2)) {
                i2.f266822h = false;
                bitmap = i2.f266818d;
                SnsMethodCalculate.markEndTimeMs("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            } else if (C86013q1.m106450k(str)) {
                C92714n c = str2.startsWith("pre_temp_extend_pic") ? C92714n.m116851c(C100408j0.m131394mL(str)) : C92714n.m116851c(C100408j0.m131394mL(str));
                if (C102236a0.m134742f(c)) {
                    oVar.mo131087G(str, c);
                    c.f266822h = false;
                    bitmap = c.f266818d;
                    SnsMethodCalculate.markEndTimeMs("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                } else {
                    SnsMethodCalculate.markEndTimeMs("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                }
            } else {
                SnsMethodCalculate.markEndTimeMs("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            }
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImageFromMedia$2");
            return bitmap;
        }
    }
}
