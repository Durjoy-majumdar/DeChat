package yj2;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import oj2.C62035b;
import rx3.C13598b0;
import ve3.C52845p;
import ve3.C65680f;
import ve3.C65682g;
import ve3.C65684l0;
import ve3.C65685n0;
import wj2.C66132f;
import wj2.C66135h;
import wx3.C15601d;
import xx3.C15911a;
import yj2.C66655a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.ringtone.RingtoneSettingHelper$getRingBackPlayInfoParseByRingBackDetail$2", mo125469f = "RingtoneSettingHelper.kt", mo125470l = {111}, mo125471m = "invokeSuspend")
/* renamed from: yj2.c */
public final class C66659c extends C91594j implements C32227p<C0000n0, C15601d<? super C62035b>, Object> {

    /* renamed from: d */
    public int f191670d;

    /* renamed from: e */
    public int f191671e;

    /* renamed from: f */
    public Object f191672f;

    /* renamed from: g */
    public int f191673g;

    /* renamed from: h */
    public final /* synthetic */ C52845p f191674h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66659c(C52845p pVar, C15601d<? super C66659c> dVar) {
        super(2, dVar);
        this.f191674h = pVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66659c(this.f191674h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66659c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C65682g gVar;
        int i;
        int i2;
        Object obj2;
        C65680f fVar;
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i3 = this.f191673g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            C52845p pVar = this.f191674h;
            C65685n0 n0Var = pVar.f147617e;
            if (n0Var != null) {
                int i4 = n0Var.f189020d;
                C65684l0 l0Var = pVar.f147616d;
                if (l0Var != null) {
                    int i5 = l0Var.f189016e;
                    if (l0Var != null) {
                        int i6 = l0Var.f189017f;
                        if (n0Var == null) {
                            return null;
                        }
                        boolean z = false;
                        if (n0Var != null && n0Var.f189024h) {
                            z = true;
                        }
                        if (z) {
                            return null;
                        }
                        if (i4 == 2) {
                            C65682g gVar2 = n0Var.f189022f;
                            if (!(gVar2 == null || (fVar = gVar2.f188994d) == null)) {
                                long j = fVar.f188983d;
                                if (!(fVar == null || (str = fVar.f188984e) == null)) {
                                    this.f191672f = gVar2;
                                    this.f191670d = i5;
                                    this.f191671e = i6;
                                    this.f191673g = 1;
                                    obj2 = C66655a.m78639a(j, str, this);
                                    if (obj2 == aVar) {
                                        return aVar;
                                    }
                                    i = i6;
                                    i2 = i5;
                                    gVar = gVar2;
                                }
                            }
                            return null;
                        }
                        C66132f h = C66135h.C66136a.m77957h(C66135h.f190107E, (long) i5, (long) i6, n0Var, (String) null, 8, (Object) null);
                        if (h == null) {
                            return null;
                        }
                        return new C62035b(1, i5, i6, false, h);
                    }
                }
            }
            return null;
        } else if (i3 == 1) {
            int i7 = this.f191671e;
            int i8 = this.f191670d;
            ResultKt.throwOnFailure(obj);
            i = i7;
            i2 = i8;
            gVar = (C65682g) this.f191672f;
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C66655a.C66656a aVar2 = (C66655a.C66656a) obj2;
        if (aVar2 == null) {
            return null;
        }
        return new C62035b(2, i2, i, aVar2.f191656b, C66135h.f190107E.mo90188d((long) i2, (long) i, gVar, aVar2.f191655a));
    }
}
