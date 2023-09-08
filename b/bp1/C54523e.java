package bp1;

import a14.C0000n0;
import a14.C53965x0;
import bp1.C54519d;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32227p;
import kotlin.ResultKt;
import ls3.C61397g;
import p565ir.C60606n;
import rx3.C13598b0;
import te3.C50602nw0;
import te3.C51713vn0;
import te3.C64273c21;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.replay.viewmodel.LiveReplaySlice$checkReplayStatus$1", mo125469f = "LiveReplaySlice.kt", mo125470l = {316, 340, 345}, mo125471m = "invokeSuspend")
/* renamed from: bp1.e */
public final class C54523e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public boolean f152868d;

    /* renamed from: e */
    public int f152869e;

    /* renamed from: f */
    public final /* synthetic */ C54519d f152870f;

    /* renamed from: g */
    public final /* synthetic */ int f152871g;

    /* renamed from: h */
    public final /* synthetic */ long f152872h;

    /* renamed from: i */
    public final /* synthetic */ C54519d.C54520a f152873i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54523e(C54519d dVar, int i, long j, C54519d.C54520a aVar, C15601d<? super C54523e> dVar2) {
        super(2, dVar2);
        this.f152870f = dVar;
        this.f152871g = i;
        this.f152872h = j;
        this.f152873i = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54523e(this.f152870f, this.f152871g, this.f152872h, this.f152873i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54523e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        Object obj2;
        C64273c21 c212;
        C51713vn0 vn02;
        C51713vn0 vn03;
        Class cls = C60606n.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152869e;
        boolean z3 = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long d3 = this.f152870f.mo75371d3();
            this.f152869e = 1;
            obj2 = ((C60606n) C86312j.m106911c(cls)).mo85038Ti(d3, 4, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else if (i == 2) {
            z2 = this.f152868d;
            ResultKt.throwOnFailure(obj);
            z = z2;
            this.f152873i.mo75381a(z);
            return C13598b0.f38549a;
        } else if (i == 3) {
            ResultKt.throwOnFailure(obj);
            this.f152873i.mo75381a(false);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C50602nw0 nw02 = (C50602nw0) obj2;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - (nw02 != null ? nw02.f138804d : currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        sb.append("ReplayTransition1.1:checkReplayStatus liveId:");
        sb.append(this.f152870f.mo75371d3());
        sb.append(",defaultRefreshDuration:");
        sb.append(this.f152871g);
        sb.append(", curTime:");
        sb.append(currentTimeMillis);
        sb.append(", updateTime:");
        C64273c21 c213 = null;
        sb.append(nw02 != null ? new Long(nw02.f138804d) : null);
        sb.append(", passTime:");
        sb.append(j);
        sb.append(", resp interval:");
        sb.append((nw02 == null || (vn03 = nw02.f138805e) == null) ? null : new Integer(vn03.f143574f));
        sb.append(",new Result is null:");
        if (((nw02 == null || (vn02 = nw02.f138805e) == null) ? null : vn02.f143572d) != null) {
            z3 = false;
        }
        sb.append(z3);
        Log.m105924i("MMFinder.LiveReplaySlice", sb.toString());
        if (this.f152870f.mo75371d3() == 0) {
            return C13598b0.f38549a;
        }
        if (nw02 != null) {
            C61397g gVar = (C61397g) C86312j.m106911c(C61397g.class);
            C51713vn0 vn04 = nw02.f138805e;
            if (vn04 != null) {
                c213 = vn04.f143572d;
            }
            z = gVar.Da0(c213);
            if (z) {
                C51713vn0 vn05 = nw02.f138805e;
                if (!(vn05 == null || (c212 = vn05.f143572d) == null)) {
                    ((C55001u) this.f152870f.business(C55001u.class)).mo76042m3(c212);
                }
                this.f152873i.mo75381a(z);
                return C13598b0.f38549a;
            }
            C51713vn0 vn06 = nw02.f138805e;
            long j2 = ((vn06 != null ? (long) vn06.f143574f : 0) * ((long) 1000)) - j;
            if (j2 > 0) {
                long j3 = this.f152872h;
                if (j2 < j3) {
                    j2 = j3;
                }
            } else {
                ((C60606n) C86312j.m106911c(cls)).fs0(this.f152870f.mo75371d3());
                j2 = this.f152872h;
            }
            if (C58739j4.f168176a.mo83692U()) {
                Log.m105924i("MMFinder.LiveReplaySlice", "checkReplayStatus delay:" + j2);
            }
            this.f152868d = z;
            this.f152869e = 2;
            if (C53965x0.m60607b(j2, this) == aVar) {
                return aVar;
            }
            z2 = z;
            z = z2;
            this.f152873i.mo75381a(z);
            return C13598b0.f38549a;
        }
        Log.m105924i("MMFinder.LiveReplaySlice", "checkReplayStatus result is null!");
        this.f152869e = 3;
        if (C53965x0.m60607b((long) this.f152871g, this) == aVar) {
            return aVar;
        }
        this.f152873i.mo75381a(false);
        return C13598b0.f38549a;
    }
}
