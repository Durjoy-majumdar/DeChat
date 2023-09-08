package il1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.content.Context;
import android.content.DialogInterface;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import nj3.C76912y0;
import pe3.C89349b;
import qg1.C12221g;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64273c21;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubDescWidget$directJoin$1", mo125469f = "FinderLiveFansClubDescWidget.kt", mo125470l = {226}, mo125471m = "invokeSuspend")
/* renamed from: il1.p2 */
public final class C9087p2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f28656d;

    /* renamed from: e */
    public int f28657e;

    /* renamed from: f */
    public final /* synthetic */ C9114t2 f28658f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubDescWidget$directJoin$1$success$1", mo125469f = "FinderLiveFansClubDescWidget.kt", mo125470l = {227}, mo125471m = "invokeSuspend")
    /* renamed from: il1.p2$a */
    public static final class C9088a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f28659d;

        /* renamed from: e */
        public final /* synthetic */ C9114t2 f28660e;

        /* renamed from: f */
        public final /* synthetic */ byte[] f28661f;

        /* renamed from: g */
        public final /* synthetic */ long f28662g;

        /* renamed from: h */
        public final /* synthetic */ long f28663h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9088a(C9114t2 t2Var, byte[] bArr, long j, long j2, C15601d<? super C9088a> dVar) {
            super(2, dVar);
            this.f28660e = t2Var;
            this.f28661f = bArr;
            this.f28662g = j;
            this.f28663h = j2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C9088a(this.f28660e, this.f28661f, this.f28662g, this.f28663h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C9088a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f28659d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9114t2 t2Var = this.f28660e;
                C89349b a = C89349b.m111674a(this.f28661f);
                long j = this.f28662g;
                long j2 = this.f28663h;
                this.f28659d = 1;
                int i2 = C9114t2.f28705D;
                t2Var.getClass();
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                Log.m105924i("FinderLiveFansClubDescWidget", "join,liveId:" + j);
                new C12221g(2, a, j, j2, (C49712hj1) null).mo9225i().mo123420E(new C9107s2(hVar));
                obj = hVar.mo90314b();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9087p2(C9114t2 t2Var, C15601d<? super C9087p2> dVar) {
        super(2, dVar);
        this.f28658f = t2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9087p2(this.f28658f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9087p2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C89779i0 i0Var;
        C64273c21 c212;
        Class cls = C55001u.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f28657e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.f28658f.getContext();
            Context context2 = this.f28658f.getContext();
            byte[] bArr = null;
            C89779i0 c = C89779i0.m112246c(context, context2 != null ? context2.getString(C0966R.string.ett) : null, false, 0, (DialogInterface.OnCancelListener) null);
            c.show();
            C45795b buContext = this.f28658f.getBuContext();
            if (buContext != null) {
                bArr = ((C55001u) buContext.mo71262a(cls)).f154417n;
            }
            byte[] bArr2 = bArr;
            C45795b buContext2 = this.f28658f.getBuContext();
            long j = 0;
            long j2 = (buContext2 == null || (c212 = ((C55001u) buContext2.mo71262a(cls)).f154420q) == null) ? 0 : c212.f182392d;
            C45795b buContext3 = this.f28658f.getBuContext();
            if (buContext3 != null) {
                j = ((C55001u) buContext3.mo71262a(cls)).f154416j;
            }
            C53896h0 h0Var = C53872d1.f151119c;
            C9088a aVar2 = new C9088a(this.f28658f, bArr2, j2, j, (C15601d<? super C9088a>) null);
            this.f28656d = c;
            this.f28657e = 1;
            Object g = C53895h.m60469g(h0Var, aVar2, this);
            if (g == aVar) {
                return aVar;
            }
            Object obj2 = g;
            i0Var = c;
            obj = obj2;
        } else if (i == 1) {
            i0Var = (C89779i0) this.f28656d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i0Var.hide();
        i0Var.dismiss();
        if (booleanValue) {
            this.f28658f.mo9909c();
            C76912y0.m92769h(this.f28658f.getContext(), this.f28658f.getContext().getString(C0966R.string.dli), C0966R.raw.icons_outlined_done);
            C32226l<Boolean, C13598b0> directJoinListener = this.f28658f.getDirectJoinListener();
            if (directJoinListener != null) {
                directJoinListener.invoke(Boolean.TRUE);
            }
        } else {
            C76912y0.m92767f(this.f28658f.getContext(), this.f28658f.getContext().getString(C0966R.string.dlf));
            C32226l<Boolean, C13598b0> directJoinListener2 = this.f28658f.getDirectJoinListener();
            if (directJoinListener2 != null) {
                directJoinListener2.invoke(Boolean.FALSE);
            }
        }
        return C13598b0.f38549a;
    }
}
