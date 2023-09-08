package wg1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: wg1.q2 */
public final class C15339q2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15370z1 f41673d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveNoticeQRCodeUIC$initBottomArea$3$1", mo125469f = "FinderLiveNoticeQRCodeUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.q2$a */
    public static final class C15340a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f41674d;

        /* renamed from: e */
        public final /* synthetic */ C15370z1 f41675e;

        /* renamed from: wg1.q2$a$a */
        public static final class C15341a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C53973z1 f41676d;

            public C15341a(C53973z1 z1Var) {
                this.f41676d = z1Var;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                Log.m105924i("FinderLiveNoticeQRCodeUIC", "REQUEST_CODE_CROP_IMAGE user cancel upload");
                C53973z1.C53974a.m60623a(this.f41676d, (CancellationException) null, 1, (Object) null);
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveNoticeQRCodeUIC$initBottomArea$3$1$job$1", mo125469f = "FinderLiveNoticeQRCodeUIC.kt", mo125470l = {440, 445}, mo125471m = "invokeSuspend")
        /* renamed from: wg1.q2$a$b */
        public static final class C15342b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f41677d;

            /* renamed from: e */
            public int f41678e;

            /* renamed from: f */
            public final /* synthetic */ C15370z1 f41679f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15342b(C15370z1 z1Var, C15601d<? super C15342b> dVar) {
                super(2, dVar);
                this.f41679f = z1Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C15342b(this.f41679f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C15342b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x0088 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r11.f41678e
                    r2 = 0
                    r3 = 1
                    r4 = 2
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r4) goto L_0x0012
                    kotlin.ResultKt.throwOnFailure(r12)
                    goto L_0x0089
                L_0x0012:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x001a:
                    java.lang.Object r1 = r11.f41677d
                    wg1.z1 r1 = (wg1.C15370z1) r1
                    kotlin.ResultKt.throwOnFailure(r12)
                    goto L_0x0040
                L_0x0022:
                    kotlin.ResultKt.throwOnFailure(r12)
                    wg1.z1 r1 = r11.f41679f
                    java.lang.String r12 = r1.f41737L
                    boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
                    if (r12 == 0) goto L_0x0043
                    ok1.b r12 = ok1.C11425b.f33607a
                    wg1.z1 r5 = r11.f41679f
                    java.lang.String r5 = r5.f41737L
                    r11.f41677d = r1
                    r11.f41678e = r3
                    java.lang.Object r12 = r12.mo11425a(r5, r11)
                    if (r12 != r0) goto L_0x0040
                    return r0
                L_0x0040:
                    java.lang.String r12 = (java.lang.String) r12
                    goto L_0x0047
                L_0x0043:
                    wg1.z1 r12 = r11.f41679f
                    java.lang.String r12 = r12.f41737L
                L_0x0047:
                    r1.mo14197l3(r12)
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    java.lang.String r1 = "REQUEST_CODE_CROP_IMAGE uploadImage result: "
                    r12.append(r1)
                    wg1.z1 r1 = r11.f41679f
                    java.lang.String r1 = r1.f41737L
                    r12.append(r1)
                    java.lang.String r12 = r12.toString()
                    java.lang.String r1 = "FinderLiveNoticeQRCodeUIC"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
                    wg1.z1 r5 = r11.f41679f
                    r11.f41677d = r2
                    r11.f41678e = r4
                    r5.getClass()
                    wx3.h r12 = new wx3.h
                    wx3.d r1 = xx3.C66447b.m78392b(r11)
                    r12.<init>(r1)
                    wg1.j2 r8 = new wg1.j2
                    r8.<init>(r5, r12, r2)
                    r6 = 0
                    r7 = 0
                    r9 = 3
                    r10 = 0
                    bl3.C0317e.launchUI$default(r5, r6, r7, r8, r9, r10)
                    java.lang.Object r12 = r12.mo90314b()
                    if (r12 != r0) goto L_0x0089
                    return r0
                L_0x0089:
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    boolean r12 = r12.booleanValue()
                    if (r12 == 0) goto L_0x00a1
                    wg1.z1 r12 = r11.f41679f
                    java.lang.String r0 = r12.f41737L
                    r12.f41736K = r0
                    int r0 = r12.f41734I
                    r12.f41735J = r0
                    r12.f41741Q = r4
                    r12.mo14196k3(r3)
                    goto L_0x00a6
                L_0x00a1:
                    wg1.z1 r12 = r11.f41679f
                    r12.mo14190d3()
                L_0x00a6:
                    wg1.z1 r12 = r11.f41679f
                    r0 = 0
                    r12.getClass()
                    wg1.x2 r1 = new wg1.x2
                    r1.<init>(r0, r12, r2)
                    o40.C61926c.m72668M(r1)
                    rx3.b0 r12 = rx3.C13598b0.f38549a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: wg1.C15339q2.C15340a.C15342b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15340a(C15370z1 z1Var, C15601d<? super C15340a> dVar) {
            super(2, dVar);
            this.f41675e = z1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C15340a aVar = new C15340a(this.f41675e, dVar);
            aVar.f41674d = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15340a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C53973z1 d = C53895h.m60466d((C0000n0) this.f41674d, (C66212f) null, (C53934p0) null, new C15342b(this.f41675e, (C15601d<? super C15342b>) null), 3, (Object) null);
            C15370z1 z1Var = this.f41675e;
            C15341a aVar = new C15341a(d);
            z1Var.getClass();
            C61926c.m72668M(new C15366x2(true, z1Var, aVar));
            return C13598b0.f38549a;
        }
    }

    public C15339q2(C15370z1 z1Var) {
        this.f41673d = z1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C15340a(this.f41673d, (C15601d<? super C15340a>) null), 3, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
