package pf1;

import a14.C0000n0;
import android.content.Context;
import bi1.C0283d;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import ob0.C117747y;
import p239sv.C13784j;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.jumper.JumperUtils$jumpToWeComProfile$3$1", mo125469f = "JumperUtils.kt", mo125470l = {722}, mo125471m = "invokeSuspend")
/* renamed from: pf1.i0 */
public final class C11904i0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f34777d;

    /* renamed from: e */
    public final /* synthetic */ C13784j f34778e;

    /* renamed from: f */
    public final /* synthetic */ boolean f34779f;

    /* renamed from: g */
    public final /* synthetic */ Context f34780g;

    /* renamed from: pf1.i0$a */
    public static final class C11905a extends C87413o implements C32229r<Integer, Integer, String, C117747y, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f34781d;

        /* renamed from: e */
        public final /* synthetic */ Context f34782e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11905a(boolean z, Context context) {
            super(4);
            this.f34781d = z;
            this.f34782e = context;
        }

        /* JADX WARNING: type inference failed for: r4v10, types: [android.view.ViewGroup] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo162I(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r2 = r20
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r3 = r21
                java.lang.String r3 = (java.lang.String) r3
                r3 = r22
                ob0.y r3 = (ob0.C117747y) r3
                pf1.d0 r4 = pf1.C62262d0.f176978a
                r4.getClass()
                android.app.ProgressDialog r4 = pf1.C62262d0.f176979b
                if (r4 == 0) goto L_0x0026
                r4.dismiss()
            L_0x0026:
                r4 = 0
                pf1.C62262d0.f176979b = r4
                if (r1 != 0) goto L_0x01e6
                if (r2 != 0) goto L_0x01e6
                r1 = 0
                r2 = 1
                if (r3 == 0) goto L_0x003b
                int r5 = r3.getType()
                r6 = 372(0x174, float:5.21E-43)
                if (r5 != r6) goto L_0x003b
                r5 = 1
                goto L_0x003c
            L_0x003b:
                r5 = 0
            L_0x003c:
                if (r5 == 0) goto L_0x01e6
                boolean r5 = r3 instanceof p239sv.C13784j
                if (r5 == 0) goto L_0x0045
                sv.j r3 = (p239sv.C13784j) r3
                goto L_0x0046
            L_0x0045:
                r3 = r4
            L_0x0046:
                if (r3 == 0) goto L_0x004d
                te3.dy3 r3 = r3.mo13144t()
                goto L_0x004e
            L_0x004d:
                r3 = r4
            L_0x004e:
                if (r3 == 0) goto L_0x0053
                java.lang.String r5 = r3.f227190d
                goto L_0x0054
            L_0x0053:
                r5 = r4
            L_0x0054:
                if (r5 != 0) goto L_0x0058
                java.lang.String r5 = ""
            L_0x0058:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "jumpToWeComProfile username="
                r6.append(r7)
                r6.append(r5)
                java.lang.String r7 = " nickname="
                r6.append(r7)
                if (r3 == 0) goto L_0x006f
                java.lang.String r7 = r3.f227191e
                goto L_0x0070
            L_0x006f:
                r7 = r4
            L_0x0070:
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "Finder.JumperUtils"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r6 != 0) goto L_0x01da
                java.lang.Class<f62.k0> r6 = f62.C75700k0.class
                k40.a r6 = f40.C86709a0.m107533q(r6)
                f62.k0 r6 = (f62.C75700k0) r6
                com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()
                com.tencent.mm.storage.z1 r5 = r6.get(r5)
                r6 = 30
                android.content.Intent r7 = new android.content.Intent
                r7.<init>()
                p248ug.C78157d.m94368a(r7, r3, r6)
                if (r5 == 0) goto L_0x00a9
                boolean r3 = r5.mo62927s3()
                if (r3 != 0) goto L_0x00a9
                java.lang.String r3 = "Contact_IsLBSFriend"
                r7.putExtra(r3, r2)
            L_0x00a9:
                boolean r3 = r0.f34781d
                java.lang.String r5 = "Contact_IsHalfScreen"
                r7.putExtra(r5, r3)
                boolean r3 = r0.f34781d
                if (r3 != 0) goto L_0x00bf
                android.content.Context r1 = r0.f34782e
                java.lang.String r2 = "profile"
                java.lang.String r3 = ".ui.ContactInfoUI"
                ke3.C88144b.m109791i(r1, r2, r3, r7, r4)
                goto L_0x01e6
            L_0x00bf:
                java.lang.Class<yb2.c> r3 = yb2.C15947c.class
                yb2.C79062b.m95631b(r7, r3)
                java.lang.Class<yb2.g> r3 = yb2.C79063g.class
                yb2.C79062b.m95631b(r7, r3)
                r3 = 4
                java.lang.String r5 = "com.tencent.mm.plugin.profile.ui.ContactInfoUI"
                com.tencent.mm.ui.vas.VASCommonFragment r3 = vn3.C118694m.m167384b(r5, r7, r1, r3, r4)
                bl3.r r5 = bl3.C39818r.f106831a
                android.content.Context r6 = r0.f34782e
                androidx.appcompat.app.AppCompatActivity r6 = (androidx.appcompat.app.AppCompatActivity) r6
                bl3.r$a r5 = r5.mo62444c(r6)
                java.lang.Class<rs1.n4> r6 = rs1.C13338n4.class
                androidx.lifecycle.i0 r5 = r5.mo75002a(r6)
                rs1.n4 r5 = (rs1.C13338n4) r5
                r5.getClass()
                androidx.appcompat.app.AppCompatActivity r6 = r5.getActivity()
                android.view.Window r6 = r6.getWindow()
                android.view.View r6 = r6.getDecorView()
                boolean r7 = r6 instanceof android.view.ViewGroup
                if (r7 == 0) goto L_0x00f8
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                goto L_0x00f9
            L_0x00f8:
                r6 = r4
            L_0x00f9:
                if (r6 != 0) goto L_0x00fd
                goto L_0x01ce
            L_0x00fd:
                as1.a r7 = r5.f37833d
                if (r7 == 0) goto L_0x010c
                bs1.e r7 = r7.getCenterComponent()
                if (r7 == 0) goto L_0x010c
                android.view.View r7 = r7.mo408a()
                goto L_0x010d
            L_0x010c:
                r7 = r4
            L_0x010d:
                boolean r8 = r7 instanceof android.view.ViewGroup
                if (r8 == 0) goto L_0x0114
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                goto L_0x0115
            L_0x0114:
                r7 = r4
            L_0x0115:
                r8 = 2131302921(0x7f091a09, float:1.8223942E38)
                if (r7 != 0) goto L_0x0142
                android.widget.FrameLayout r7 = new android.widget.FrameLayout
                android.app.Activity r1 = r5.getContext()
                r7.<init>(r1)
                android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
                r9 = -1
                r1.<init>(r9, r9)
                r7.setLayoutParams(r1)
                r7.setId(r8)
                android.content.Context r1 = r7.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r9 = 2131101688(0x7f0607f8, float:1.7815793E38)
                int r1 = r1.getColor(r9)
                r7.setBackgroundColor(r1)
                r1 = 1
            L_0x0142:
                er1.r3 r9 = er1.C7865r3.f26468a
                android.app.Activity r10 = r5.getContext()
                int r9 = r9.mo8969b(r10)
                float r9 = (float) r9
                ds1.a r10 = ds1.C7515a.f25777a
                android.app.Activity r11 = r5.getContext()
                float r10 = r10.mo8637a(r11)
                float r9 = r9 * r10
                as1.a r10 = r5.f37833d
                if (r10 == 0) goto L_0x0167
                if (r1 == 0) goto L_0x0167
                bs1.b r1 = new bs1.b
                r1.<init>(r7)
                r10.setCenterComponent(r1)
            L_0x0167:
                as1.a r1 = r5.f37833d
                if (r1 != 0) goto L_0x01b0
                if (r1 == 0) goto L_0x017d
                android.view.ViewParent r10 = r1.getParent()
                boolean r11 = r10 instanceof android.view.ViewGroup
                if (r11 == 0) goto L_0x0178
                r4 = r10
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            L_0x0178:
                if (r4 == 0) goto L_0x017d
                r4.removeView(r1)
            L_0x017d:
                as1.a$a r1 = new as1.a$a
                r1.<init>()
                r1.f712d = r9
                bs1.c r4 = new bs1.c
                android.app.Activity r11 = r5.getContext()
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 30
                r17 = 0
                r10 = r4
                r10.<init>(r11, r12, r13, r14, r15, r16, r17)
                r1.f713e = r4
                bs1.b r4 = new bs1.b
                r4.<init>(r7)
                r1.f714f = r4
                bs1.a r4 = new bs1.a
                android.app.Activity r9 = r5.getContext()
                r4.<init>(r9, r2)
                r1.f715g = r4
                as1.a r1 = r1.mo235a(r6)
                r5.f37833d = r1
            L_0x01b0:
                rs1.m4 r1 = new rs1.m4
                r1.<init>(r5)
                r3.f348636F = r1
                r7.removeAllViews()
                androidx.appcompat.app.AppCompatActivity r1 = r5.getActivity()
                androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()
                androidx.fragment.app.c0 r1 = r1.beginTransaction()
                r1.mo165200l(r8, r3)
                r1.mo165164f()
                as1.a r4 = r5.f37833d
            L_0x01ce:
                if (r4 != 0) goto L_0x01d1
                goto L_0x01e6
            L_0x01d1:
                pf1.h0 r1 = new pf1.h0
                r1.<init>(r4)
                r4.setContentReachTop(r1)
                goto L_0x01e6
            L_0x01da:
                android.content.Context r2 = r0.f34782e
                r3 = 2131835398(0x7f113a06, float:1.9303933E38)
                android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r2, (int) r3, (int) r1)
                r1.show()
            L_0x01e6:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: pf1.C11904i0.C11905a.mo162I(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11904i0(C13784j jVar, boolean z, Context context, C15601d<? super C11904i0> dVar) {
        super(2, dVar);
        this.f34778e = jVar;
        this.f34779f = z;
        this.f34780g = context;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11904i0(this.f34778e, this.f34779f, this.f34780g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11904i0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f34777d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C13784j jVar = this.f34778e;
            C87412m.m108592e(jVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            C11905a aVar2 = new C11905a(this.f34779f, this.f34780g);
            this.f34777d = 1;
            if (C0283d.m244b((C117747y) jVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
