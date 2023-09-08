package il1;

import a14.C0000n0;
import cl1.C0696x;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87413o;
import nj3.C76912y0;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C50326ly0;
import te3.C50689oj;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveFansModifySettingWidget$delAnnouncement$1", mo125469f = "FinderLiveFansModifySettingWidget.kt", mo125470l = {257}, mo125471m = "invokeSuspend")
/* renamed from: il1.z3 */
public final class C9187z3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f28913d;

    /* renamed from: e */
    public final /* synthetic */ C50326ly0 f28914e;

    /* renamed from: f */
    public final /* synthetic */ C9172y3 f28915f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<C89779i0> f28916g;

    /* renamed from: il1.z3$a */
    public static final class C9188a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9172y3 f28917d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9188a(C9172y3 y3Var) {
            super(0);
            this.f28917d = y3Var;
        }

        public Object invoke() {
            C76912y0.m92768g(this.f28917d.getContext(), this.f28917d.getContext().getResources().getString(C0966R.string.mf8));
            C0696x xVar = (C0696x) FinderLiveService.f159376d.mo77630e(C0696x.class);
            C50326ly0 ly02 = xVar != null ? xVar.f1644g : null;
            if (ly02 != null) {
                ly02.f137713n = null;
            }
            this.f28917d.f28878s.mo3264b((C50689oj) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.z3$b */
    public static final class C9189b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9172y3 f28918d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9189b(C9172y3 y3Var) {
            super(0);
            this.f28918d = y3Var;
        }

        public Object invoke() {
            C76912y0.m92767f(this.f28918d.getContext(), this.f28918d.getContext().getResources().getString(C0966R.string.mfh));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.z3$c */
    public static final class C9190c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f28919d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9190c(C8479f0<C89779i0> f0Var) {
            super(0);
            this.f28919d = f0Var;
        }

        public Object invoke() {
            C89779i0 i0Var = (C89779i0) this.f28919d.f27484d;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9187z3(C50326ly0 ly02, C9172y3 y3Var, C8479f0<C89779i0> f0Var, C15601d<? super C9187z3> dVar) {
        super(2, dVar);
        this.f28914e = ly02;
        this.f28915f = y3Var;
        this.f28916g = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9187z3(this.f28914e, this.f28915f, this.f28916g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9187z3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f28913d
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ d -> 0x0052 }
            goto L_0x0040
        L_0x000d:
            r11 = move-exception
            goto L_0x0069
        L_0x000f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0017:
            kotlin.ResultKt.throwOnFailure(r11)
            te3.ly0 r11 = new te3.ly0     // Catch:{ d -> 0x0052 }
            r11.<init>()     // Catch:{ d -> 0x0052 }
            te3.ly0 r1 = r10.f28914e     // Catch:{ d -> 0x0052 }
            byte[] r1 = r1.toByteArray()     // Catch:{ d -> 0x0052 }
            r11.parseFrom(r1)     // Catch:{ d -> 0x0052 }
            r1 = 0
            r11.f137713n = r1     // Catch:{ d -> 0x0052 }
            qg1.e r3 = new qg1.e     // Catch:{ d -> 0x0052 }
            r4 = 4
            r3.<init>((int) r4, (te3.C50326ly0) r11, (te3.C49712hj1) r1)     // Catch:{ d -> 0x0052 }
            r4 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            r10.f28913d = r2     // Catch:{ d -> 0x0052 }
            r7 = r10
            java.lang.Object r11 = q40.C89456b.m111831a(r3, r4, r6, r7, r8, r9)     // Catch:{ d -> 0x0052 }
            if (r11 != r0) goto L_0x0040
            return r0
        L_0x0040:
            il1.z3$a r11 = new il1.z3$a     // Catch:{ d -> 0x0052 }
            il1.y3 r0 = r10.f28915f     // Catch:{ d -> 0x0052 }
            r11.<init>(r0)     // Catch:{ d -> 0x0052 }
            o40.C61926c.m72668M(r11)     // Catch:{ d -> 0x0052 }
            il1.z3$c r11 = new il1.z3$c
            gy3.f0<qo3.i0> r0 = r10.f28916g
            r11.<init>(r0)
            goto L_0x0063
        L_0x0052:
            il1.z3$b r11 = new il1.z3$b     // Catch:{ all -> 0x000d }
            il1.y3 r0 = r10.f28915f     // Catch:{ all -> 0x000d }
            r11.<init>(r0)     // Catch:{ all -> 0x000d }
            o40.C61926c.m72668M(r11)     // Catch:{ all -> 0x000d }
            il1.z3$c r11 = new il1.z3$c
            gy3.f0<qo3.i0> r0 = r10.f28916g
            r11.<init>(r0)
        L_0x0063:
            o40.C61926c.m72668M(r11)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x0069:
            il1.z3$c r0 = new il1.z3$c
            gy3.f0<qo3.i0> r1 = r10.f28916g
            r0.<init>(r1)
            o40.C61926c.m72668M(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9187z3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
