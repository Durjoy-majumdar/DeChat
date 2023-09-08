package jh1;

import a14.C0000n0;
import bi1.C0287e;
import bi1.C0288f;
import cl1.C55006x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.regex.Pattern;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import te3.C51160rv0;
import te3.C64300cx2;
import te3.C64622p31;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneLotteryWidget$attendLottery$$inlined$success$default$1", mo125469f = "MileStoneLotteryWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: jh1.l */
public final class C60832l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f173293d;

    /* renamed from: e */
    public final /* synthetic */ C64622p31 f173294e;

    /* renamed from: f */
    public final /* synthetic */ C60834n f173295f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60832l(C0287e eVar, C15601d dVar, C64622p31 p312, C60834n nVar) {
        super(2, dVar);
        this.f173293d = eVar;
        this.f173294e = p312;
        this.f173295f = nVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60832l(this.f173293d, dVar, this.f173294e, this.f173295f);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60832l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C51160rv0 rv02 = (C51160rv0) ((C0288f) this.f173293d).f855b;
        C64622p31 p312 = this.f173294e;
        int i = p312.f184749g;
        Pattern pattern = C61926c.f176038a;
        p312.f184749g = i | 1;
        C64300cx2 cx22 = p312.f184747e;
        Integer num = cx22 != null ? new Integer(cx22.f182601i) : null;
        ((C55006x0) this.f173295f.f173302b.business(C55006x0.class)).mo76056i3(this.f173294e.f184746d, (Integer) null);
        C64300cx2 cx23 = this.f173294e.f184747e;
        if (cx23 != null) {
            int i2 = cx23.f182601i;
            if (num != null && i2 == num.intValue()) {
                cx23.f182601i++;
                Log.m105924i(this.f173295f.f173303c, "modify ui data, participate_count++, " + cx23.f182601i);
            }
        }
        return C13598b0.f38549a;
    }
}
