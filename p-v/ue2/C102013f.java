package ue2;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87412m;
import k14.C60942d;
import k14.C99088c;
import kotlin.ResultKt;
import rx3.C13598b0;
import ve2.C102179e;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.PreloadNowTaskController$cancelTask$2", mo125469f = "PreloadNowTaskController.kt", mo125470l = {109, 72}, mo125471m = "invokeSuspend")
/* renamed from: ue2.f */
public final class C102013f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f300369d;

    /* renamed from: e */
    public Object f300370e;

    /* renamed from: f */
    public Object f300371f;

    /* renamed from: g */
    public int f300372g;

    /* renamed from: h */
    public final /* synthetic */ C102007e f300373h;

    /* renamed from: i */
    public final /* synthetic */ String f300374i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102013f(C102007e eVar, String str, C15601d<? super C102013f> dVar) {
        super(2, dVar);
        this.f300373h = eVar;
        this.f300374i = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C102013f(this.f300373h, this.f300374i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C102013f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C99088c cVar;
        C102007e eVar;
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f300372g;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C102007e eVar2 = this.f300373h;
            C99088c cVar2 = eVar2.f300343b;
            String str2 = this.f300374i;
            this.f300369d = cVar2;
            this.f300370e = eVar2;
            this.f300371f = str2;
            this.f300372g = 1;
            C60942d dVar = (C60942d) cVar2;
            if (dVar.mo85908b((Object) null, this) == aVar) {
                return aVar;
            }
            eVar = eVar2;
            String str3 = str2;
            cVar = dVar;
            str = str3;
        } else if (i == 1) {
            str = (String) this.f300371f;
            eVar = (C102007e) this.f300370e;
            cVar = (C99088c) this.f300369d;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            C102179e eVar3 = eVar.f300344c;
            if (eVar3 != null && C87412m.m108589b(eVar3.f300868e.mo142476r2(), str)) {
                eVar.f300344c = null;
            }
            for (C102179e eVar4 : eVar.mo141505c()) {
                if (C87412m.m108589b(eVar4.f300868e.mo142476r2(), str)) {
                    eVar.mo141505c().remove(eVar4);
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
            cVar.mo85909c((Object) null);
            C102007e eVar5 = this.f300373h;
            this.f300369d = null;
            this.f300370e = null;
            this.f300371f = null;
            this.f300372g = 2;
            if (eVar5.mo141507e(this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        } catch (Throwable th) {
            cVar.mo85909c((Object) null);
            throw th;
        }
    }
}
