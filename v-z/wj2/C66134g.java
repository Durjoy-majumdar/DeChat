package wj2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32227p;
import kotlin.ResultKt;
import nj2.C61758f;
import rx3.C13598b0;
import ve3.C52823a0;
import ve3.C65679e0;
import ve3.C65680f;
import ve3.C65684l0;
import ve3.C65685n0;
import wj2.C66135h;
import wx3.C15601d;
import xx3.C15911a;
import yj2.C66655a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.params.TPMediaInfoDescExt$Companion$fromRingBack$2", mo125469f = "TPMediaInfoDescExt.kt", mo125470l = {185, 191}, mo125471m = "invokeSuspend")
/* renamed from: wj2.g */
public final class C66134g extends C91594j implements C32227p<C0000n0, C15601d<? super C66132f>, Object> {

    /* renamed from: d */
    public long f190104d;

    /* renamed from: e */
    public int f190105e;

    /* renamed from: f */
    public final /* synthetic */ C65684l0 f190106f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66134g(C65684l0 l0Var, C15601d<? super C66134g> dVar) {
        super(2, dVar);
        this.f190106f = l0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66134g(this.f190106f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66134g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        Object obj2;
        FinderObject finderObject;
        Object obj3;
        C65685n0 n0Var;
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f190105e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C65684l0 l0Var = this.f190106f;
            if (l0Var.f189015d == 1) {
                C65679e0 e0Var = l0Var.f189018g;
                if (e0Var == null) {
                    return null;
                }
                int i2 = e0Var.f188982d;
                this.f190105e = 1;
                obj3 = C53895h.m60469g(C53872d1.f151119c, new C61758f(i2, (C15601d<? super C61758f>) null), this);
                if (obj3 == aVar) {
                    return aVar;
                }
            } else {
                C65680f fVar = l0Var.f189019h;
                if (fVar != null) {
                    long j2 = fVar.f188983d;
                    if (!(fVar == null || (str = fVar.f188984e) == null)) {
                        this.f190104d = j2;
                        this.f190105e = 2;
                        obj2 = C66655a.m78639a(j2, str, this);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                        j = j2;
                        C66655a.C66656a aVar2 = (C66655a.C66656a) obj2;
                        C65684l0 l0Var2 = this.f190106f;
                        return C66135h.C66136a.m77956c(C66135h.f190107E, (long) l0Var2.f189016e, (long) l0Var2.f189017f, finderObject, j, (C65685n0) null, (String) null, false, 112, (Object) null);
                    }
                }
                return null;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj3 = obj;
        } else if (i == 2) {
            long j3 = this.f190104d;
            ResultKt.throwOnFailure(obj);
            j = j3;
            obj2 = obj;
            C66655a.C66656a aVar22 = (C66655a.C66656a) obj2;
            if (!(aVar22 == null || (finderObject = aVar22.f191655a) == null)) {
                C65684l0 l0Var22 = this.f190106f;
                return C66135h.C66136a.m77956c(C66135h.f190107E, (long) l0Var22.f189016e, (long) l0Var22.f189017f, finderObject, j, (C65685n0) null, (String) null, false, 112, (Object) null);
            }
            return null;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C52823a0 a0Var = (C52823a0) obj3;
        if (!(a0Var == null || (n0Var = a0Var.f147573d) == null)) {
            C65684l0 l0Var3 = this.f190106f;
            return C66135h.C66136a.m77957h(C66135h.f190107E, (long) l0Var3.f189016e, (long) l0Var3.f189017f, n0Var, (String) null, 8, (Object) null);
        }
        return null;
    }
}
