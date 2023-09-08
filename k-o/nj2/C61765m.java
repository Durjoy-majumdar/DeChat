package nj2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import d03.C58010a;
import eb0.C75592q0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13603j;
import wj2.C66130c;
import wj2.C66132f;
import wj2.C66135h;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.RingBackHelper$getRingBackMediaInfo$2", mo125469f = "RingBackHelper.kt", mo125470l = {99}, mo125471m = "invokeSuspend")
/* renamed from: nj2.m */
public final class C61765m extends C91594j implements C32227p<C0000n0, C15601d<? super C66132f>, Object> {

    /* renamed from: d */
    public Object f175569d;

    /* renamed from: e */
    public int f175570e;

    /* renamed from: f */
    public final /* synthetic */ C66130c f175571f;

    /* renamed from: g */
    public final /* synthetic */ String f175572g;

    /* renamed from: h */
    public final /* synthetic */ boolean f175573h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61765m(C66130c cVar, String str, boolean z, C15601d<? super C61765m> dVar) {
        super(2, dVar);
        this.f175571f = cVar;
        this.f175572g = str;
        this.f175573h = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61765m(this.f175571f, this.f175572g, this.f175573h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61765m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C66130c cVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f175570e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C66130c cVar2 = this.f175571f;
            if (cVar2 != null) {
                String str = this.f175572g;
                boolean z = this.f175573h;
                int ordinal = cVar2.f190068a.ordinal();
                boolean z2 = false;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        C61767o oVar = C61767o.f175575a;
                        String str2 = C61767o.f175580f;
                        oVar.mo86686c(str2);
                        C58010a aVar2 = new C58010a("voip_ending_sound", oVar.mo86686c(str2), "", 0, 0);
                        aVar2.f165933e = true;
                        return new C66132f(aVar2, 0, MAlarmHandler.NEXT_FIRE_INTERVAL);
                    } else if (ordinal == 2) {
                        C61767o oVar2 = C61767o.f175575a;
                        oVar2.mo86686c(C61767o.f175580f);
                        C58010a aVar3 = new C58010a("voip_bad_net_sound", oVar2.mo86686c(C61767o.f175582h), "", 0, 0);
                        aVar3.f165933e = true;
                        return new C66132f(aVar3, 0, MAlarmHandler.NEXT_FIRE_INTERVAL);
                    } else if (ordinal == 3) {
                        C61767o oVar3 = C61767o.f175575a;
                        oVar3.mo86686c(C61767o.f175580f);
                        C58010a aVar4 = new C58010a("voip_close_sound", oVar3.mo86686c(C61767o.f175581g), "", 0, 0);
                        aVar4.f165933e = true;
                        aVar4.f165940l = false;
                        return new C66132f(aVar4, 0, MAlarmHandler.NEXT_FIRE_INTERVAL);
                    } else {
                        throw new C13603j();
                    }
                } else if (str != null) {
                    if (!z) {
                        if (str.length() == 0) {
                            z2 = true;
                        }
                        if (!z2) {
                            if (C87412m.m108589b(str, C75592q0.m90789s())) {
                                str = "";
                            }
                            return C61768p.m72482j(str);
                        }
                    }
                    this.f175569d = cVar2;
                    this.f175570e = 1;
                    C61767o oVar4 = C61767o.f175575a;
                    Object g = C53895h.m60469g(C53872d1.f151119c, new C61764l(str, z, (C15601d<? super C61764l>) null), this);
                    if (g == aVar) {
                        return aVar;
                    }
                    cVar = cVar2;
                    obj = g;
                }
            }
            return C66135h.f190107E.mo90187b();
        } else if (i == 1) {
            cVar = (C66130c) this.f175569d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C66132f fVar = (C66132f) obj;
        C58010a aVar5 = fVar.f190078a;
        if (aVar5 != null) {
            aVar5.f165940l = cVar.f190070c;
        }
        C61767o.f175578d.postValue(fVar);
        return obj;
    }
}
