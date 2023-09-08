package oa0;

import a14.C0000n0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C1288t0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55304k;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import p175j0.C108494d2;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.SnsTemplateUIPageKt$TemplateUIPage$3$8$1$2", mo125469f = "SnsTemplateUIPage.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: oa0.q */
public final class C61978q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C55304k f176182d;

    /* renamed from: e */
    public final /* synthetic */ C55366y1 f176183e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61978q(C55304k kVar, C55366y1 y1Var, C15601d<? super C61978q> dVar) {
        super(2, dVar);
        this.f176182d = kVar;
        this.f176183e = y1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61978q(this.f176182d, this.f176183e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61978q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C55304k kVar = this.f176182d;
        String a = this.f176183e.mo76618a();
        kVar.getClass();
        Log.m105924i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "setInitialSelectId " + a);
        kVar.f157520g = a;
        if ((a.length() == 0) || ((List) ((C108494d2) kVar.f157519f).getValue()).isEmpty()) {
            Log.m105928w("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "updateInitialItemSelectedState: " + kVar.f157520g + ", templateDataSize: " + ((List) ((C108494d2) kVar.f157519f).getValue()).size());
        } else {
            Log.m105924i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "update item to select " + kVar.f157520g);
            Iterator it = ((List) ((C108494d2) kVar.f157519f).getValue()).iterator();
            if (it.hasNext()) {
                ((C1288t0) it.next()).getClass();
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
