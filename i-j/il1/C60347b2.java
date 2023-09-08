package il1;

import a14.C0000n0;
import di3.C86312j;
import fy3.C32227p;
import il1.C60557z1;
import java.util.LinkedList;
import kotlin.ResultKt;
import p523fp.C59265h;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C64780vo2;
import te3.C64807wo2;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveElementWidget$ElementAdapter$onBindViewHolder$2", mo125469f = "FinderLiveElementWidget.kt", mo125470l = {244, 246}, mo125471m = "invokeSuspend")
/* renamed from: il1.b2 */
public final class C60347b2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f172006d;

    /* renamed from: e */
    public Object f172007e;

    /* renamed from: f */
    public int f172008f;

    /* renamed from: g */
    public final /* synthetic */ C64807wo2 f172009g;

    /* renamed from: h */
    public final /* synthetic */ C60557z1.C60562e f172010h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60347b2(C64807wo2 wo22, C60557z1.C60562e eVar, C15601d<? super C60347b2> dVar) {
        super(2, dVar);
        this.f172009g = wo22;
        this.f172010h = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60347b2(this.f172009g, this.f172010h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60347b2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C60557z1.C60562e eVar;
        C64780vo2 vo22;
        Class cls = C59265h.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f172008f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C64807wo2 wo22 = C60557z1.f172604i;
            LinkedList<C64780vo2> linkedList = this.f172009g.f186149h;
            vo22 = linkedList != null ? (C64780vo2) C110818d0.m150916N(linkedList) : null;
            if (vo22 != null) {
                C60557z1.C60562e eVar2 = this.f172010h;
                String str = vo22.f185964e;
                this.f172006d = eVar2;
                this.f172007e = vo22;
                this.f172008f = 1;
                Object bi = ((C59265h) C86312j.m106911c(cls)).mo58905bi(str, this);
                if (bi == aVar) {
                    return aVar;
                }
                Object obj2 = bi;
                eVar = eVar2;
                obj = obj2;
            }
            return C13598b0.f38549a;
        } else if (i == 1) {
            vo22 = (C64780vo2) this.f172007e;
            eVar = (C60557z1.C60562e) this.f172006d;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            String str2 = vo22.f185964e;
            String str3 = vo22.f185965f;
            this.f172006d = null;
            this.f172007e = null;
            this.f172008f = 2;
            if (eVar.mo85528y(str2, false, str3, this) == aVar) {
                return aVar;
            }
        } else if (((C59265h) C86312j.m106911c(cls)).Ft0(vo22.f185964e)) {
            eVar.f172626z.setVisibility(8);
            eVar.f172617A.setVisibility(8);
        } else {
            eVar.f172626z.setVisibility(0);
            eVar.f172617A.setVisibility(8);
        }
        return C13598b0.f38549a;
    }
}
