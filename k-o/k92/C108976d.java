package k92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import d92.C107028a;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import g92.C59398d;
import gy3.C87412m;
import gy3.C87413o;
import h92.C108177a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l92.C109293a;
import l92.C109296d;
import l92.C109298e;
import l92.C109299f;
import o40.C61926c;
import qp0.C89784b;
import rx3.C13598b0;
import te3.C110959d13;
import te3.C110964i13;
import te3.C51173ry;
import te3.C64272c13;
import te3.C64459j13;

/* renamed from: k92.d */
public class C108976d extends C108972a implements C109298e {

    /* renamed from: e */
    public C107028a f326423e;

    /* renamed from: f */
    public C109296d f326424f;

    /* renamed from: g */
    public C109296d f326425g;

    /* renamed from: h */
    public C109299f f326426h;

    /* renamed from: i */
    public C59398d f326427i;

    /* renamed from: j */
    public C108177a f326428j;

    /* renamed from: k */
    public C109296d f326429k;

    /* renamed from: l */
    public String f326430l;

    /* renamed from: m */
    public String f326431m;

    /* renamed from: n */
    public boolean f326432n;

    /* renamed from: o */
    public int f326433o;

    /* renamed from: p */
    public Bitmap f326434p;

    /* renamed from: q */
    public boolean f326435q;

    /* renamed from: r */
    public C108975c f326436r;

    /* renamed from: s */
    public boolean f326437s;

    /* renamed from: t */
    public boolean f326438t;

    /* renamed from: k92.d$a */
    public interface C108977a {
        void proceed();
    }

    /* renamed from: k92.d$b */
    public static final class C108978b implements C109296d {

        /* renamed from: a */
        public final /* synthetic */ C108976d f326439a;

        /* renamed from: b */
        public final /* synthetic */ boolean f326440b;

        /* renamed from: k92.d$b$a */
        public static final class C108979a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C108976d f326441d;

            /* renamed from: e */
            public final /* synthetic */ boolean f326442e;

            /* renamed from: f */
            public final /* synthetic */ Bitmap f326443f;

            /* renamed from: k92.d$b$a$a */
            public static final class C108980a extends AnimatorListenerAdapter {

                /* renamed from: d */
                public final /* synthetic */ boolean f326444d;

                /* renamed from: e */
                public final /* synthetic */ C108976d f326445e;

                /* renamed from: f */
                public final /* synthetic */ Bitmap f326446f;

                public C108980a(boolean z, C108976d dVar, Bitmap bitmap) {
                    this.f326444d = z;
                    this.f326445e = dVar;
                    this.f326446f = bitmap;
                }

                public void onAnimationCancel(Animator animator) {
                    if (!this.f326444d) {
                        C108976d dVar = this.f326445e;
                        dVar.mo160098W(dVar.mo160095Q(this.f326446f, dVar.f326435q), true, true, true);
                    }
                    C109296d dVar2 = this.f326445e.f326429k;
                    if (dVar2 != null) {
                        C109296d.C109297a.m148405a(dVar2, 0, 1, (Object) null);
                    }
                }

                public void onAnimationEnd(Animator animator) {
                    C87412m.m108594g(animator, "animation");
                    if (!this.f326444d) {
                        C108976d dVar = this.f326445e;
                        dVar.mo160098W(dVar.mo160095Q(this.f326446f, dVar.f326435q), true, true, true);
                    }
                    C109296d dVar2 = this.f326445e.f326429k;
                    if (dVar2 != null) {
                        C109296d.C109297a.m148406b(dVar2, this.f326446f, 0, 2, (Object) null);
                    }
                }
            }

            public C108979a(C108976d dVar, boolean z, Bitmap bitmap) {
                this.f326441d = dVar;
                this.f326442e = z;
                this.f326443f = bitmap;
            }

            public final void run() {
                C108976d dVar = this.f326441d;
                C108975c cVar = dVar.f326436r;
                if (cVar != null) {
                    cVar.mo160094c(!Boolean.valueOf(dVar.f326432n).booleanValue() || Boolean.valueOf(this.f326441d.f326432n) == null, Boolean.valueOf(this.f326441d.f326432n).booleanValue(), new C108980a(this.f326442e, this.f326441d, this.f326443f));
                }
            }
        }

        public C108978b(C108976d dVar, boolean z) {
            this.f326439a = dVar;
            this.f326440b = z;
        }

        /* renamed from: a */
        public void mo90716a(Bitmap bitmap, boolean z, int i) {
            Log.m105924i("MicroMsg.PageMultiTaskHelper", "transform to float ball animation start, isSwipeBack:" + z + ", way:" + i);
            C108976d dVar = this.f326439a;
            C108975c cVar = dVar.f326436r;
            if (cVar != null) {
                cVar.mo151060b(dVar.f326418a, (AnimatorListenerAdapter) null);
            }
            C109296d dVar2 = this.f326439a.f326429k;
            if (dVar2 != null) {
                C109296d.C109297a.m148407c(dVar2, bitmap, z, 0, 4, (Object) null);
            }
            C108976d dVar3 = this.f326439a;
            dVar3.f326435q = dVar3.mo160079b();
        }

        /* renamed from: b */
        public void mo90717b(int i) {
            C108976d dVar;
            C107028a aVar;
            Log.m105924i("MicroMsg.PageMultiTaskHelper", "transform to float ball animation cancel, way:" + i);
            C107028a aVar2 = this.f326439a.f326423e;
            if (aVar2 != null) {
                aVar2.mo70835k();
            }
            C108976d dVar2 = this.f326439a;
            C107028a aVar3 = dVar2.f326423e;
            dVar2.mo160090r(dVar2.mo160095Q(aVar3 != null ? aVar3.getBitmap() : null, this.f326439a.mo160079b()), true);
            C108975c cVar = this.f326439a.f326436r;
            if (cVar != null) {
                cVar.mo160094c(false, false, (AnimatorListenerAdapter) null);
            }
            if (!this.f326440b && (aVar = dVar.f326423e) != null) {
                aVar.mo67906e(true, (dVar = this.f326439a));
            }
        }

        /* renamed from: c */
        public void mo90718c(Bitmap bitmap, int i) {
            Log.m105924i("MicroMsg.PageMultiTaskHelper", "transform to float ball animation end ,way:" + i);
            MMHandlerThread.postToMainThreadDelayed(new C108979a(this.f326439a, this.f326440b, bitmap), 150);
        }
    }

    /* renamed from: k92.d$c */
    public static final class C108981c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108976d f326447d;

        public C108981c(C108976d dVar) {
            this.f326447d = dVar;
        }

        public final void run() {
            C107028a aVar = this.f326447d.f326423e;
            if (aVar != null) {
                View view = null;
                if ((aVar != null ? aVar.getContentView() : null) != null) {
                    C107028a aVar2 = this.f326447d.f326423e;
                    if (aVar2 != null) {
                        view = aVar2.getContentView();
                    }
                    if (view != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/multitask/helper/PageMultiTaskHelper$finishPage$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/multitask/helper/PageMultiTaskHelper$finishPage$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
    }

    /* renamed from: k92.d$d */
    public static final class C108982d implements C108977a {

        /* renamed from: a */
        public final /* synthetic */ C108976d f326448a;

        public C108982d(C108976d dVar) {
            this.f326448a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
            r1 = r10.f326448a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void proceed() {
            /*
                r10 = this;
                java.lang.Class<com.tencent.mm.plugin.multitask.k> r0 = com.tencent.p014mm.plugin.multitask.C105919k.class
                k92.d r1 = r10.f326448a
                r1.getClass()
                k92.d r1 = r10.f326448a
                boolean r1 = r1.mo138111x()
                if (r1 != 0) goto L_0x001c
                k92.d r0 = r10.f326448a
                l92.d r0 = r0.f326424f
                if (r0 == 0) goto L_0x001b
                r1 = 0
                r2 = 1
                r3 = 0
                l92.C109296d.C109297a.m148405a(r0, r1, r2, r3)
            L_0x001b:
                return
            L_0x001c:
                di3.d r1 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.multitask.k r1 = (com.tencent.p014mm.plugin.multitask.C105919k) r1
                android.graphics.Point r4 = r1.mo151043b4()
                if (r4 == 0) goto L_0x0056
                k92.d r1 = r10.f326448a
                d92.a r9 = r1.f326423e
                if (r9 == 0) goto L_0x0056
                l92.d r3 = r1.f326424f
                r6 = 0
                r7 = 1
                r8 = -1082130432(0xffffffffbf800000, float:-1.0)
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.multitask.k r0 = (com.tencent.p014mm.plugin.multitask.C105919k) r0
                r0.mo151041Y1()
                boolean r0 = r9.mo70828c()
                if (r0 == 0) goto L_0x004e
                f92.b r0 = new f92.b
                r2 = r0
                r5 = r9
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r9.mo67912n(r0)
                goto L_0x0056
            L_0x004e:
                f92.c r0 = new f92.c
                r0.<init>(r3)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k92.C108976d.C108982d.proceed():void");
        }
    }

    /* renamed from: k92.d$e */
    public static final class C108983e implements C109293a {

        /* renamed from: a */
        public final /* synthetic */ C108976d f326449a;

        public C108983e(C108976d dVar) {
            this.f326449a = dVar;
        }

        /* renamed from: a */
        public void mo160106a() {
        }

        /* renamed from: b */
        public void mo160107b() {
            this.f326449a.mo160097T();
        }
    }

    /* renamed from: k92.d$f */
    public static final class C108984f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108976d f326450d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108984f(C108976d dVar) {
            super(0);
            this.f326450d = dVar;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("auto hideUIC, id:");
            MultiTaskInfo multiTaskInfo = this.f326450d.f326418a;
            sb.append(multiTaskInfo != null ? multiTaskInfo.field_id : null);
            Log.m105924i("MicroMsg.PageMultiTaskHelper", sb.toString());
            ((C105919k) C86312j.m106911c(C105919k.class)).mo151050r5(0, "MultiTaskForSnapshotMinusScreen", 1048576);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k92.d$g */
    public static final class C108985g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108976d f326451d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108985g(C108976d dVar) {
            super(0);
            this.f326451d = dVar;
        }

        public Object invoke() {
            C108976d dVar = this.f326451d;
            C107028a aVar = dVar.f326423e;
            if (aVar != null) {
                aVar.mo67906e(false, dVar);
            }
            return C13598b0.f38549a;
        }
    }

    public C108976d() {
        this((C107028a) null);
    }

    /* renamed from: D */
    public void mo35809D(int i, String str) {
        C107028a aVar;
        Intent intent;
        byte[] byteArrayExtra;
        Class cls = C105919k.class;
        super.mo35809D(i, str);
        mo90713R(false);
        this.f326425g = new C108987f(this);
        this.f326426h = new C108986e(this);
        this.f326436r = ((C105919k) C86312j.m106911c(cls)).tt0(this.f326423e, this);
        C107028a aVar2 = this.f326423e;
        if (!(aVar2 == null || (intent = aVar2.getIntent()) == null || (byteArrayExtra = intent.getByteArrayExtra("key_multi_task_common_info")) == null)) {
            C51173ry ryVar = new C51173ry();
            try {
                ryVar.parseFrom(byteArrayExtra);
            } catch (Exception unused) {
            }
            mo160099Y(ryVar);
            C110959d13 d132 = ryVar.f141210d;
            if (d132 != null && !Util.isNullOrNil(d132.f331946e)) {
                boolean isNullOrNil = Util.isNullOrNil(d132.f331945d);
            }
        }
        if (mo67894B() && mo160082g() && (aVar = this.f326423e) != null) {
            aVar.mo70830f(this);
        }
        C107028a aVar3 = this.f326423e;
        if (aVar3 != null) {
            aVar3.mo70836l(i);
        }
        mo160096S();
        ((C105919k) C86312j.m106911c(cls)).nb0(this.f326423e, this.f326420c, this.f326418a);
    }

    /* renamed from: H */
    public void mo124068H(boolean z, int i) {
        C110964i13 i132 = this.f326420c;
        C64272c13 c132 = null;
        C64272c13 c133 = i132 != null ? i132.f332063j : null;
        if (c133 != null) {
            c133.f182352d = (long) i;
        }
        if (mo160082g()) {
            if (mo160080e()) {
                Log.m105925i("MicroMsg.PageMultiTaskHelper", "onMenuMultiTaskSelected, has info, type: %d", Integer.valueOf(i));
                C110964i13 i133 = this.f326420c;
                if (i133 != null) {
                    c132 = i133.f332063j;
                }
                if (c132 != null) {
                    c132.f182353e = 1;
                }
                mo67896U(4, false);
            } else if (z) {
                C109296d dVar = this.f326424f;
                if (dVar != null) {
                    C109296d.C109297a.m148405a(dVar, 0, 1, (Object) null);
                }
                Log.m105925i("MicroMsg.PageMultiTaskHelper", "onMenuMultiTaskSelected, has not info, type: %d", Integer.valueOf(i));
            }
        } else if (z) {
            Log.m105925i("MicroMsg.PageMultiTaskHelper", "onMenuMultiTaskSelected, enter multiTask, type: %d", Integer.valueOf(i));
            mo136900P(new C108982d(this));
        } else {
            Log.m105924i("MicroMsg.PageMultiTaskHelper", "onMenuMultiTaskSelected, do nothing");
        }
    }

    /* renamed from: P */
    public void mo136900P(C108977a aVar) {
        if (aVar != null) {
            aVar.proceed();
        }
    }

    /* renamed from: Q */
    public final Bitmap mo160095Q(Bitmap bitmap, boolean z) {
        C64459j13 j132 = null;
        if (!mo124070z()) {
            MultiTaskInfo multiTaskInfo = this.f326418a;
            if (multiTaskInfo != null) {
                j132 = multiTaskInfo.mo80305m2();
            }
            if (j132 != null) {
                j132.f183760p = 0;
            }
            return bitmap;
        }
        if (bitmap != null) {
            if (z) {
                MultiTaskInfo multiTaskInfo2 = this.f326418a;
                C64459j13 m2 = multiTaskInfo2 != null ? multiTaskInfo2.mo80305m2() : null;
                if (m2 != null) {
                    m2.f183760p = 90;
                }
                C107028a aVar = this.f326423e;
                if (aVar != null) {
                    return aVar.mo70832h(bitmap, 90);
                }
                return null;
            }
            MultiTaskInfo multiTaskInfo3 = this.f326418a;
            if (multiTaskInfo3 != null) {
                j132 = multiTaskInfo3.mo80305m2();
            }
            if (j132 != null) {
                j132.f183760p = 0;
            }
        }
        return bitmap;
    }

    /* renamed from: R */
    public void mo90713R(boolean z) {
        this.f326424f = new C108978b(this, z);
    }

    /* renamed from: S */
    public final void mo160096S() {
        Class cls = C105919k.class;
        if (!mo160082g() || !mo160080e()) {
            if (mo35808C() && this.f326427i == null) {
                C107028a aVar = this.f326423e;
                if (aVar != null) {
                    this.f326427i = ((C105919k) C86312j.m106911c(cls)).mo151044bP(aVar, this.f326426h);
                }
                C59398d dVar = this.f326427i;
                if (dVar != null) {
                    dVar.start();
                }
                C59398d dVar2 = this.f326427i;
                if (dVar2 != null) {
                    dVar2.mo84523a();
                }
            }
        } else if (mo35808C() || mo35811y()) {
            C107028a aVar2 = this.f326423e;
            Activity activity = null;
            if ((aVar2 != null ? aVar2.getActivity() : null) instanceof MMActivity) {
                if (this.f326428j == null) {
                    C108177a PA = ((C105919k) C86312j.m106911c(cls)).mo151037PA();
                    this.f326428j = PA;
                    C107028a aVar3 = this.f326423e;
                    if (!(aVar3 == null || PA == null)) {
                        PA.mo158585a(aVar3, this, this.f326425g);
                    }
                }
                this.f326437s = mo35808C();
                return;
            }
            C107028a aVar4 = this.f326423e;
            if (aVar4 != null) {
                activity = aVar4.getActivity();
            }
            if (activity instanceof MMFragmentActivity) {
                if (this.f326428j == null) {
                    C108177a W10 = ((C105919k) C86312j.m106911c(cls)).W10();
                    this.f326428j = W10;
                    C107028a aVar5 = this.f326423e;
                    if (!(aVar5 == null || W10 == null)) {
                        W10.mo158585a(aVar5, this, this.f326425g);
                    }
                }
                this.f326437s = mo35808C();
            }
        }
    }

    /* renamed from: T */
    public final void mo160097T() {
        Log.m105924i("MicroMsg.PageMultiTaskHelper", "finishPage");
        C107028a aVar = this.f326423e;
        if ((aVar != null ? aVar.getActivity() : null) instanceof MMActivity) {
            MMHandlerThread.postToMainThreadDelayed(new C108981c(this), 200);
        }
        C107028a aVar2 = this.f326423e;
        if (aVar2 != null) {
            aVar2.mo67906e(false, this);
        }
    }

    /* renamed from: U */
    public boolean mo67896U(int i, boolean z) {
        C107028a aVar;
        boolean z2 = false;
        boolean z3 = true;
        Log.m105925i("MicroMsg.PageMultiTaskHelper", "onClose, way:%d, ended", Integer.valueOf(i), Boolean.valueOf(z));
        C108975c cVar = this.f326436r;
        if (cVar != null && cVar.mo160093a()) {
            Log.m105924i("MicroMsg.PageMultiTaskHelper", "onClose, is Animation!");
            return true;
        }
        this.f326438t = z;
        boolean e = mo160080e();
        Bitmap bitmap = null;
        if (!mo160082g() || !e) {
            if (!(this instanceof C89784b)) {
                if (e) {
                    Bitmap bitmap2 = this.f326434p;
                    if (bitmap2 == null) {
                        C107028a aVar2 = this.f326423e;
                        if (aVar2 != null) {
                            aVar2.mo70835k();
                        }
                        C107028a aVar3 = this.f326423e;
                        if (aVar3 != null) {
                            bitmap = aVar3.getBitmap();
                        }
                        bitmap2 = mo160089o(bitmap);
                    }
                    mo74193c(bitmap2);
                    mo74197w(bitmap2, this.f326438t);
                } else {
                    if (this.f326438t || !mo74190J()) {
                        z3 = false;
                    }
                    if (z3) {
                        Bitmap bitmap3 = this.f326434p;
                        if (bitmap3 == null) {
                            C107028a aVar4 = this.f326423e;
                            if (aVar4 != null) {
                                aVar4.mo70835k();
                            }
                            C107028a aVar5 = this.f326423e;
                            if (aVar5 != null) {
                                bitmap = aVar5.getBitmap();
                            }
                            bitmap3 = mo160089o(bitmap);
                        }
                        bitmap = bitmap3;
                    }
                    mo74197w(bitmap, this.f326438t);
                }
            } else if (e) {
                C107028a aVar6 = this.f326423e;
                if (aVar6 != null) {
                    aVar6.mo70835k();
                }
                C107028a aVar7 = this.f326423e;
                if (aVar7 != null) {
                    bitmap = aVar7.getBitmap();
                }
                mo74193c(mo160089o(bitmap));
            }
            return false;
        }
        mo160096S();
        Log.m105924i("MicroMsg.PageMultiTaskHelper", "onClose, isSupportSwipeToMultiTask:" + mo35808C() + ", isSupportExitToMultiTask:" + mo35811y());
        if (this.f326428j == null || (!mo35808C() && !mo35811y())) {
            C109296d dVar = this.f326425g;
            if (dVar != null) {
                C109296d.C109297a.m148405a(dVar, 0, 1, (Object) null);
            }
        } else {
            C108177a aVar8 = this.f326428j;
            if (aVar8 != null) {
                aVar8.mo158586b(i);
            }
        }
        if (!(this instanceof C89784b)) {
            if (e) {
                C107028a aVar9 = this.f326423e;
                if (aVar9 != null) {
                    aVar9.mo70835k();
                }
                C107028a aVar10 = this.f326423e;
                if (aVar10 != null) {
                    bitmap = aVar10.getBitmap();
                }
                mo74197w(mo160089o(bitmap), this.f326438t);
            } else {
                if (!this.f326438t && mo74190J()) {
                    z2 = true;
                }
                if (z2 && (aVar = this.f326423e) != null) {
                    aVar.mo70835k();
                }
                if (z2) {
                    C107028a aVar11 = this.f326423e;
                    if (aVar11 != null) {
                        bitmap = aVar11.getBitmap();
                    }
                    bitmap = mo160089o(bitmap);
                }
                mo74197w(bitmap, this.f326438t);
            }
        }
        return true;
    }

    /* renamed from: V */
    public void mo74191V() {
    }

    /* renamed from: W */
    public final void mo160098W(Bitmap bitmap, boolean z, boolean z2, boolean z3) {
        Log.m105924i("MicroMsg.PageMultiTaskHelper", "onMultiTaskAnimDone, forceUpdate:" + z + ", needUpdateInfo:" + z2 + ", needShowTip:" + z3);
        if (z2) {
            mo160090r(bitmap, z);
        }
        if (z3) {
            ((C105919k) C86312j.m106911c(C105919k.class)).mo151038Ph(this.f326423e, new C108983e(this));
        } else {
            mo160097T();
        }
    }

    /* renamed from: X */
    public boolean mo90714X() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r9.f141210d;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo160099Y(te3.C51173ry r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x000a
            te3.d13 r1 = r9.f141210d
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = r1.f331946e
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            r8.f326430l = r1
            if (r9 == 0) goto L_0x0016
            te3.d13 r1 = r9.f141210d
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = r1.f331949h
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            r8.f326431m = r1
            r1 = 1
            if (r9 == 0) goto L_0x0022
            te3.d13 r2 = r9.f141210d
            if (r2 == 0) goto L_0x0022
            boolean r2 = r2.f331950i
        L_0x0022:
            if (r9 == 0) goto L_0x002a
            te3.d13 r2 = r9.f141210d
            if (r2 == 0) goto L_0x002a
            boolean r2 = r2.f331951j
        L_0x002a:
            if (r9 == 0) goto L_0x0033
            te3.d13 r2 = r9.f141210d
            if (r2 == 0) goto L_0x0033
            int r2 = r2.f331952n
            goto L_0x0034
        L_0x0033:
            r2 = -1
        L_0x0034:
            r8.f326433o = r2
            r2 = 0
            if (r9 == 0) goto L_0x003f
            boolean r3 = r9.f141212f
            if (r3 == 0) goto L_0x003f
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            r8.f326432n = r3
            r8.f326419b = r9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "commoninfo position: "
            r3.append(r4)
            java.lang.String r4 = r8.f326430l
            r3.append(r4)
            java.lang.String r4 = ",ori_position: "
            r3.append(r4)
            java.lang.String r4 = r8.f326431m
            r3.append(r4)
            java.lang.String r4 = ", itemPos:"
            r3.append(r4)
            int r4 = r8.f326433o
            r3.append(r4)
            java.lang.String r4 = ", fromTaskBar:"
            r3.append(r4)
            boolean r4 = r8.f326432n
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r4.booleanValue()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.PageMultiTaskHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            boolean r3 = r8.mo160082g()
            if (r3 == 0) goto L_0x00a7
            long r5 = r8.mo138110t()
            k92.d$f r3 = new k92.d$f
            r3.<init>(r8)
            o40.C61926c.m72666K(r5, r3)
            boolean r3 = r8.mo124070z()
            if (r3 == 0) goto L_0x00a7
            d92.a r3 = r8.f326423e
            if (r3 == 0) goto L_0x00a7
            android.app.Activity r3 = r3.getActivity()
            if (r3 == 0) goto L_0x00a7
            r3.setRequestedOrientation(r1)
        L_0x00a7:
            if (r9 != 0) goto L_0x00b2
            te3.i13 r3 = r8.f326420c
            if (r3 != 0) goto L_0x00ae
            goto L_0x00b2
        L_0x00ae:
            java.lang.String r5 = ""
            r3.f332057d = r5
        L_0x00b2:
            if (r9 == 0) goto L_0x012d
            java.lang.String r3 = r9.f141211e
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x010b
            te3.i13 r3 = r8.f326420c
            if (r3 != 0) goto L_0x00c1
            goto L_0x00c5
        L_0x00c1:
            java.lang.String r5 = r9.f141211e
            r3.f332057d = r5
        L_0x00c5:
            if (r3 != 0) goto L_0x00c8
            goto L_0x00da
        L_0x00c8:
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r5 = r8.f326418a
            if (r5 == 0) goto L_0x00d3
            int r5 = r5.field_type
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x00d4
        L_0x00d3:
            r5 = r0
        L_0x00d4:
            int r5 = r5.intValue()
            r3.f332060g = r5
        L_0x00da:
            te3.i13 r3 = r8.f326420c
            if (r3 != 0) goto L_0x00df
            goto L_0x00e9
        L_0x00df:
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r5 = r8.f326418a
            if (r5 == 0) goto L_0x00e6
            java.lang.String r5 = r5.field_id
            goto L_0x00e7
        L_0x00e6:
            r5 = r0
        L_0x00e7:
            r3.f332059f = r5
        L_0x00e9:
            if (r3 == 0) goto L_0x00ee
            te3.e13 r3 = r3.f332062i
            goto L_0x00ef
        L_0x00ee:
            r3 = r0
        L_0x00ef:
            if (r3 != 0) goto L_0x00f2
            goto L_0x0100
        L_0x00f2:
            java.lang.Class<com.tencent.mm.plugin.multitask.k> r5 = com.tencent.p014mm.plugin.multitask.C105919k.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            com.tencent.mm.plugin.multitask.k r5 = (com.tencent.p014mm.plugin.multitask.C105919k) r5
            long r5 = r5.mo151030Bv()
            r3.f182918d = r5
        L_0x0100:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r9.f141211e
            r1[r2] = r3
            java.lang.String r2 = "secdata multitask scene enter contextId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
        L_0x010b:
            te3.d13 r9 = r9.f141210d
            if (r9 == 0) goto L_0x012d
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r9.f331953o
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x012d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x012d
            te3.i13 r7 = r8.f326420c
            if (r7 == 0) goto L_0x0125
            te3.h13 r0 = r7.f332065o
        L_0x0125:
            if (r0 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            long r1 = r1 - r3
            r0.f134406d = r1
        L_0x012b:
            r9.f331953o = r5
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k92.C108976d.mo160099Y(te3.ry):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = (r0 = (r0 = r0.getActivity()).getResources()).getConfiguration();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo160079b() {
        /*
            r3 = this;
            d92.a r0 = r3.f326423e
            r1 = 0
            if (r0 == 0) goto L_0x001d
            android.app.Activity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x001d
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x001d
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L_0x001d
            int r0 = r0.orientation
            r2 = 2
            if (r0 != r2) goto L_0x001d
            r1 = 1
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k92.C108976d.mo160079b():boolean");
    }

    /* renamed from: f */
    public void mo160081f() {
        Log.m105924i("MicroMsg.PageMultiTaskHelper", "showHome");
        C7335d c = C86312j.m106911c(C105919k.class);
        C87412m.m108593f(c, "getService(IPluginMultiTaskService::class.java)");
        C105919k.C105920a.m142391a((C105919k) c, 1, (String) null, 0, 6, (Object) null);
        C61926c.m72666K(50, new C108985g(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r0.f141210d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo160082g() {
        /*
            r1 = this;
            java.lang.String r0 = r1.f326430l
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0025
            te3.ry r0 = r1.f326419b
            if (r0 == 0) goto L_0x0013
            te3.d13 r0 = r0.f141210d
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.f331945d
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r1.f326431m
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k92.C108976d.mo160082g():boolean");
    }

    public String getPosition() {
        return this.f326430l;
    }

    /* renamed from: h */
    public Bitmap mo160084h() {
        return ((C105919k) C86312j.m106911c(C105919k.class)).mo151029AF(this.f326419b);
    }

    /* renamed from: m */
    public boolean mo160087m() {
        return this.f326437s;
    }

    /* renamed from: n */
    public String mo160088n() {
        return this.f326431m;
    }

    /* renamed from: o */
    public Bitmap mo160089o(Bitmap bitmap) {
        return mo160095Q(bitmap, mo160079b());
    }

    public void onOrientationChange(int i) {
    }

    /* renamed from: v */
    public int mo160091v() {
        return this.f326433o;
    }

    public C108976d(C107028a aVar) {
        this.f326423e = aVar;
        this.f326433o = -1;
    }
}
