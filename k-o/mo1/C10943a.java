package mo1;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import ao1.C0143d;
import ao1.C0145d1;
import bd1.C54446b;
import bl3.C39818r;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.HardTouchableLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8761d3;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import je1.C9377s4;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kd1.C60999e;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ot1.C11767a;
import p629ny.C76979h;
import p823sg.C101614i;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qo3.C77407n;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49098d51;
import te3.C51827wf3;
import up1.C27696y;
import xp1.C15869b;
import ye1.C15970d0;
import ye1.C15983x;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: mo1.a */
public final class C10943a extends C11059w implements C11385n {

    /* renamed from: A */
    public final C13601g f32609A;

    /* renamed from: B */
    public final int f32610B;

    /* renamed from: C */
    public String f32611C;

    /* renamed from: D */
    public final C13601g f32612D;

    /* renamed from: E */
    public final C13601g f32613E;

    /* renamed from: F */
    public final boolean f32614F;

    /* renamed from: G */
    public float f32615G;

    /* renamed from: H */
    public ArgbEvaluator f32616H;

    /* renamed from: I */
    public int f32617I;

    /* renamed from: J */
    public C13604l<Boolean, Integer> f32618J;

    /* renamed from: K */
    public int f32619K;

    /* renamed from: L */
    public int f32620L;

    /* renamed from: M */
    public HashMap<Integer, C51827wf3> f32621M;

    /* renamed from: N */
    public final C13601g f32622N;

    /* renamed from: P */
    public final C13601g f32623P;

    /* renamed from: Q */
    public int f32624Q;

    /* renamed from: R */
    public boolean f32625R;

    /* renamed from: e */
    public final C13601g f32626e = C36568h.m40985a(new C10958h(this));

    /* renamed from: f */
    public final C13601g f32627f = C36568h.m40985a(new C10959h0(this));

    /* renamed from: g */
    public final C13601g f32628g = C36568h.m40985a(new C10963k(this));

    /* renamed from: h */
    public final C13601g f32629h = C36568h.m40985a(new C10953e0(this));

    /* renamed from: i */
    public final C13601g f32630i = C36568h.m40985a(new C10969q(this));

    /* renamed from: j */
    public final C13601g f32631j = C36568h.m40985a(new C10954f(this));

    /* renamed from: n */
    public final C13601g f32632n = C36568h.m40985a(new C10952e(this));

    /* renamed from: o */
    public final C13601g f32633o = C36568h.m40985a(new C10962j(this));

    /* renamed from: p */
    public final C13601g f32634p = C36568h.m40985a(new C10964l(this));

    /* renamed from: q */
    public final C13601g f32635q = C36568h.m40985a(new C10965m(this));

    /* renamed from: r */
    public final C13601g f32636r;

    /* renamed from: s */
    public final C13601g f32637s;

    /* renamed from: t */
    public final C13601g f32638t;

    /* renamed from: u */
    public final C13601g f32639u;

    /* renamed from: v */
    public final C13601g f32640v;

    /* renamed from: w */
    public final C13601g f32641w;

    /* renamed from: x */
    public final C13601g f32642x;

    /* renamed from: y */
    public final C13601g f32643y;

    /* renamed from: z */
    public final C13601g f32644z;

    /* renamed from: mo1.a$a */
    public final class C10944a implements AppBarLayout.C67445c {
        public C10944a() {
        }

        /* renamed from: a */
        public void mo3128a(AppBarLayout appBarLayout, int i) {
            float f;
            MMActivityController controller;
            C87412m.m108594g(appBarLayout, "view");
            C10943a.this.getClass();
            float min = Math.min(1.0f, (((float) Math.abs(i)) * 1.0f) / ((float) C10943a.this.f32624Q));
            C10943a aVar = C10943a.this;
            if (!(min == aVar.f32615G)) {
                aVar.f32615G = min;
                if (min < 0.5f) {
                    f = (0.5f - min) / 0.5f;
                    aVar.mo11149g3().setBackgroundColor(C10943a.this.getResources().getColor(C0966R.color.ahf));
                    if (!C10943a.this.getFragmentMode()) {
                        AppCompatActivity activity = C10943a.this.getActivity();
                        MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
                        if (!(mMActivity == null || (controller = mMActivity.getController()) == null)) {
                            controller.mo177049H0(C85875k4.m106211z());
                        }
                    }
                    ((FrameLayout) ((C36570n) C10943a.this.f32640v).getValue()).setAlpha(0.0f);
                    ((FrameLayout) ((C36570n) C10943a.this.f32609A).getValue()).setVisibility(8);
                    C10943a.this.mo11149g3().setAlpha(1.0f);
                    C10943a.m10947c3(C10943a.this, min, f);
                } else {
                    f = (min - 0.5f) / 0.5f;
                    C13604l<Boolean, Integer> lVar = aVar.f32618J;
                    if (lVar == null) {
                        aVar.f32617I = aVar.f32610B;
                        aVar.f32620L = aVar.f32619K;
                        ((FrameLayout) ((C36570n) aVar.f32609A).getValue()).setVisibility(8);
                    } else if (((Boolean) lVar.f38555d).booleanValue()) {
                        aVar.f32617I = ((Number) lVar.f38556e).intValue();
                        aVar.f32620L = ((Number) lVar.f38556e).intValue();
                        ((FrameLayout) ((C36570n) aVar.f32609A).getValue()).setVisibility(0);
                        ((FrameLayout) ((C36570n) aVar.f32609A).getValue()).setAlpha(0.4f * f);
                    } else {
                        aVar.f32617I = aVar.f32610B;
                        aVar.f32620L = aVar.f32619K;
                        ((FrameLayout) ((C36570n) aVar.f32609A).getValue()).setVisibility(8);
                    }
                    C10943a aVar2 = C10943a.this;
                    Object evaluate = aVar2.f32616H.evaluate(f, Integer.valueOf(aVar2.f32617I), Integer.valueOf(C10943a.this.f32620L));
                    C87412m.m108592e(evaluate, "null cannot be cast to non-null type kotlin.Int");
                    C10943a.this.mo11149g3().setBackgroundColor(((Integer) evaluate).intValue());
                    if (!C10943a.this.getFragmentMode()) {
                        AppCompatActivity activity2 = C10943a.this.getActivity();
                        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        ((MMActivity) activity2).getController().mo177049H0(C85875k4.m106211z());
                    }
                    ((FrameLayout) ((C36570n) C10943a.this.f32640v).getValue()).setAlpha(f);
                    C10943a.this.mo11149g3().setAlpha(f);
                    C10943a.m10947c3(C10943a.this, min, f);
                }
                ((WeImageView) ((C36570n) C10943a.this.f32634p).getValue()).setAlpha(f);
                C10943a.this.mo11150i3().setAlpha(f);
                ((WeImageView) ((C36570n) C10943a.this.f32636r).getValue()).setAlpha(f);
                if (((double) min) < 1.0d) {
                    C11025q qVar = (C11025q) C39818r.f106831a.mo62443b(C10943a.this.getContext()).mo75002a(C11025q.class);
                    if (qVar.f32751B) {
                        C58784w3 w3Var = C58784w3.f168295a;
                        RecyclerView recyclerView = qVar.f32765s;
                        if (recyclerView != null) {
                            qVar.f32767u = ((Number) w3Var.mo83974w0(recyclerView, false).f38556e).intValue();
                            qVar.mo11177e3();
                            return;
                        }
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: mo1.a$a0 */
    public static final class C10945a0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32646d;

        public C10945a0(C10943a aVar) {
            this.f32646d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C10943a aVar = this.f32646d;
            aVar.getClass();
            Class cls = C8761d3.class;
            Class cls2 = C58417y0.class;
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C39818r rVar = C39818r.f106831a;
            C8777j5.C8778a.m8601b((C8777j5) c, 2, ((C8761d3) rVar.mo62444c(aVar.getActivity()).mo62447c(cls)).mo9589n1(), ((C8761d3) rVar.mo62444c(aVar.getActivity()).mo62447c(cls)).mo9585G(), (Map) null, 8, (Object) null);
            ((C58417y0) C86312j.m106911c(cls2)).By0(aVar.getActivity(), 1, 2);
            ((C58417y0) C86312j.m106911c(cls2)).By0(aVar.getActivity(), 1, 3);
            ((C58417y0) C86312j.m106911c(cls2)).By0(aVar.getActivity(), 2, 1);
            C77407n nVar = new C77407n((Context) aVar.getActivity(), 1, false);
            nVar.f225771i = new C11001g(aVar);
            nVar.f225782p = new C11003h(aVar);
            nVar.f225761d = new C11005i(aVar);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mo1.a$b */
    public static final class C10946b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10946b(C10943a aVar) {
            super(0);
            this.f32647d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32647d).f43001a;
        }
    }

    /* renamed from: mo1.a$b0 */
    public static final class C10947b0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32648d;

        public C10947b0(C10943a aVar) {
            this.f32648d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f32648d.mo11148f3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mo1.a$c */
    public static final class C10948c extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32649d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10948c(C10943a aVar) {
            super(0);
            this.f32649d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32649d).f43015o;
        }
    }

    /* renamed from: mo1.a$c0 */
    public static final class C10949c0 implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32650d;

        public C10949c0(C10943a aVar) {
            this.f32650d = aVar;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            StringBuilder sb = new StringBuilder();
            C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
            FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) FinderProfileHeaderUIC.f16192h1.get(this.f32650d.f32611C);
            String str = null;
            C49098d51 d512 = bVar != null ? bVar.f16265d : null;
            sb.append("finderUsername:" + this.f32650d.f32611C + 10);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("noticeId:");
            if (d512 != null) {
                str = d512.f132122h;
            }
            sb4.append(str);
            sb.append(sb4.toString());
            C15869b bVar2 = C15869b.f42722a;
            AppCompatActivity activity = this.f32650d.getActivity();
            String sb5 = sb.toString();
            C87412m.m108593f(sb5, "sb.toString()");
            C15869b.m14792b(bVar2, activity, sb5, (String) null, 4, (Object) null);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: mo1.a$d */
    public static final class C10950d extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32651d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10950d(C10943a aVar) {
            super(0);
            this.f32651d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32651d).f43016p;
        }
    }

    /* renamed from: mo1.a$d0 */
    public static final class C10951d0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32652d;

        public C10951d0(C10943a aVar) {
            this.f32652d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f32652d.mo11148f3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mo1.a$e */
    public static final class C10952e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10952e(C10943a aVar) {
            super(0);
            this.f32653d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32653d).f43003c;
        }
    }

    /* renamed from: mo1.a$e0 */
    public static final class C10953e0 extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10953e0(C10943a aVar) {
            super(0);
            this.f32654d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32654d).f43017q;
        }
    }

    /* renamed from: mo1.a$f */
    public static final class C10954f extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10954f(C10943a aVar) {
            super(0);
            this.f32655d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32655d).f43004d;
        }
    }

    /* renamed from: mo1.a$f0 */
    public static final class C10955f0 extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10955f0(C10943a aVar) {
            super(0);
            this.f32656d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32656d).f43018r;
        }
    }

    /* renamed from: mo1.a$g */
    public static final class C10956g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10956g(C10943a aVar) {
            super(0);
            this.f32657d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32657d).f43006f;
        }
    }

    /* renamed from: mo1.a$g0 */
    public static final class C10957g0 extends C87413o implements C32224a<HardTouchableLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10957g0(C10943a aVar) {
            super(0);
            this.f32658d = aVar;
        }

        public Object invoke() {
            return (HardTouchableLayout) this.f32658d.findViewById(C0966R.C0970id.br_);
        }
    }

    /* renamed from: mo1.a$h */
    public static final class C10958h extends C87413o implements C32224a<C15983x> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10958h(C10943a aVar) {
            super(0);
            this.f32659d = aVar;
        }

        public Object invoke() {
            return C15983x.m14891a(this.f32659d.findViewById(C0966R.C0970id.h9k));
        }
    }

    /* renamed from: mo1.a$h0 */
    public static final class C10959h0 extends C87413o implements C32224a<C15970d0> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10959h0(C10943a aVar) {
            super(0);
            this.f32660d = aVar;
        }

        public Object invoke() {
            return C15970d0.m14886a(this.f32660d.findViewById(C0966R.C0970id.br_));
        }
    }

    /* renamed from: mo1.a$i */
    public static final class C10960i extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10960i(C10943a aVar) {
            super(0);
            this.f32661d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32661d).f43005e;
        }
    }

    /* renamed from: mo1.a$i0 */
    public static final class C10961i0 extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10961i0(C10943a aVar) {
            super(0);
            this.f32662d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32662d).f43019s;
        }
    }

    /* renamed from: mo1.a$j */
    public static final class C10962j extends C87413o implements C32224a<AppBarLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10962j(C10943a aVar) {
            super(0);
            this.f32663d = aVar;
        }

        public Object invoke() {
            return ((C15970d0) this.f32663d.f32627f.getValue()).f42871a;
        }
    }

    /* renamed from: mo1.a$k */
    public static final class C10963k extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10963k(C10943a aVar) {
            super(0);
            this.f32664d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32664d).f43007g;
        }
    }

    /* renamed from: mo1.a$l */
    public static final class C10964l extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10964l(C10943a aVar) {
            super(0);
            this.f32665d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32665d).f43008h;
        }
    }

    /* renamed from: mo1.a$m */
    public static final class C10965m extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10965m(C10943a aVar) {
            super(0);
            this.f32666d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32666d).f43010j;
        }
    }

    /* renamed from: mo1.a$n */
    public static final class C10966n extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10966n(C10943a aVar) {
            super(0);
            this.f32667d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32667d).f43011k;
        }
    }

    /* renamed from: mo1.a$o */
    public static final class C10967o implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32668d;

        public C10967o(C10943a aVar) {
            this.f32668d = aVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            String str;
            if (e0Var.mo107176v()) {
                C10943a aVar = this.f32668d;
                aVar.getClass();
                C58961d.C58963b bVar = C58961d.f168673a;
                C58969q b = bVar.mo84155b(aVar.f32611C);
                boolean z = false;
                if (((b != null ? b.field_extFlag : 0) & 1048576) == 0) {
                    e0Var.mo107125a(10002, C0966R.string.f360764el0);
                }
                C10943a aVar2 = this.f32668d;
                if (aVar2.f32614F && !C87412m.m108589b(aVar2.f32611C, C66785b.f191882e.mo90662O5())) {
                    if (C58739j4.f168176a.mo83680I(bVar.mo84155b(this.f32668d.f32611C))) {
                        e0Var.mo107125a(10010, C0966R.string.esv);
                    } else {
                        e0Var.mo107125a(10010, C0966R.string.d2_);
                    }
                }
                C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
                if (c == null || (str = c.mo75251m2().f132501o) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    z = true;
                }
                if (z) {
                    e0Var.mo107125a(CdnLogic.kMediaTypeBeatificFile, C0966R.string.cxq);
                }
                e0Var.mo107125a(10004, C0966R.string.ek6);
            }
        }
    }

    /* renamed from: mo1.a$p */
    public static final class C10968p implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32669d;

        public C10968p(C10943a aVar) {
            this.f32669d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x017d, code lost:
            r11 = (r11 = r11.mo12855k3(-1)).f167327h;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r23, int r24) {
            /*
                r22 = this;
                r0 = r22
                int r1 = r23.getItemId()
                r2 = 10002(0x2712, float:1.4016E-41)
                if (r1 == r2) goto L_0x0222
                r2 = 10004(0x2714, float:1.4019E-41)
                java.lang.String r3 = ".ui.tools.WebViewUI"
                java.lang.String r4 = "webview"
                java.lang.String r5 = "rawUrl"
                r6 = 0
                r7 = 2
                r8 = 1
                r9 = 0
                if (r1 == r2) goto L_0x0140
                r2 = 10010(0x271a, float:1.4027E-41)
                if (r1 == r2) goto L_0x00c6
                r2 = 10011(0x271b, float:1.4028E-41)
                if (r1 == r2) goto L_0x0023
                goto L_0x024f
            L_0x0023:
                java.lang.Class<er1.b> r1 = er1.C58684b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                er1.b r1 = (er1.C58684b) r1
                mo1.a r2 = r0.f32669d
                androidx.appcompat.app.AppCompatActivity r11 = r2.getActivity()
                r1.getClass()
                java.lang.String r1 = "context"
                gy3.C87412m.m108594g(r11, r1)
                zc1.b r1 = zc1.C66785b.f191882e
                bd1.b r2 = zc1.C66783a.C66784a.m78800c(r1, r9, r8, r6)
                if (r2 == 0) goto L_0x0049
                te3.dr2 r2 = r2.mo75251m2()
                java.lang.String r2 = r2.f132501o
                if (r2 != 0) goto L_0x004b
            L_0x0049:
                java.lang.String r2 = ""
            L_0x004b:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r2)
                java.lang.String r2 = "?wechat_real_lang=%s&username=%s"
                r10.append(r2)
                java.lang.String r2 = r10.toString()
                java.lang.Object[] r10 = new java.lang.Object[r7]
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
                r10[r9] = r12
                java.lang.String r1 = r1.mo90662O5()
                r10[r8] = r1
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r10, r7)
                java.lang.String r1 = java.lang.String.format(r2, r1)
                java.lang.String r2 = "format(format, *args)"
                gy3.C87412m.m108593f(r1, r2)
                er1.w3 r2 = er1.C58784w3.f168295a
                boolean r2 = r2.mo83910X0()
                if (r2 == 0) goto L_0x0098
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "url:"
                r2.append(r7)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                android.widget.Toast r2 = nj3.C76912y0.makeText((android.content.Context) r11, (java.lang.CharSequence) r2, (int) r8)
                r2.show()
            L_0x0098:
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                r2.putExtra(r5, r1)
                ke3.C88144b.m109791i(r11, r4, r3, r2, r6)
                java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r2 = "getService(FinderReportLogic::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r10 = r1
                dp1.y0 r10 = (dp1.C58417y0) r10
                r12 = 9
                r14 = 1
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 120(0x78, float:1.68E-43)
                r21 = 0
                dp1.C58417y0.fy0(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21)
                goto L_0x024f
            L_0x00c6:
                bl3.r r1 = bl3.C39818r.f106831a
                mo1.a r2 = r0.f32669d
                androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                bl3.r$a r1 = r1.mo62444c(r2)
                java.lang.Class<com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC> r2 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC r1 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC) r1
                r1.getClass()
                er1.j4 r2 = er1.C58739j4.f168176a
                fe1.d$b r10 = fe1.C58961d.f168673a
                java.lang.String r3 = r1.f16213S0
                fe1.q r3 = r10.mo84155b(r3)
                boolean r2 = r2.mo83680I(r3)
                java.lang.Class<vq1.t> r3 = vq1.C14967t.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                vq1.t r3 = (vq1.C14967t) r3
                java.lang.String r4 = r1.f16213S0
                r5 = r2 ^ 1
                r3.mo14013LZ(r7, r4, r5)
                if (r2 != 0) goto L_0x013b
                java.lang.String r11 = r1.f16213S0
                r12 = 0
                r13 = 1
                r14 = 0
                r15 = 10
                r16 = 0
                boolean r3 = fe1.C58961d.C58963b.m68836h(r10, r11, r12, r13, r14, r15, r16)
                if (r3 == 0) goto L_0x013b
                qo3.n r3 = new qo3.n
                android.app.Activity r4 = r1.getContext()
                r3.<init>((android.content.Context) r4, (int) r8, (boolean) r8)
                android.app.Activity r4 = r1.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131829175(0x7f1121b7, float:1.9291312E38)
                java.lang.String r4 = r4.getString(r5)
                r5 = 17
                r3.mo107568m(r4, r5, r9)
                mo1.x0 r4 = new mo1.x0
                r4.<init>(r1)
                r3.f225771i = r4
                mo1.y0 r4 = new mo1.y0
                r4.<init>(r1, r2)
                r3.f225782p = r4
                r3.mo107573q()
                goto L_0x024f
            L_0x013b:
                r1.mo3823e3(r5, r8)
                goto L_0x024f
            L_0x0140:
                mo1.a r1 = r0.f32669d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
                android.content.Intent r1 = r1.getIntent()
                r10 = 0
                java.lang.String r2 = "KEY_FINDER_FEEDID"
                long r1 = r1.getLongExtra(r2, r10)
                mo1.a r12 = r0.f32669d
                androidx.appcompat.app.AppCompatActivity r12 = r12.getActivity()
                android.content.Intent r12 = r12.getIntent()
                java.lang.String r13 = "finder_read_feed_id"
                long r12 = r12.getLongExtra(r13, r10)
                int r14 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r14 == 0) goto L_0x0167
                goto L_0x0168
            L_0x0167:
                r1 = r12
            L_0x0168:
                rs1.s8$a r10 = rs1.C13442s8.f38060Q0
                mo1.a r11 = r0.f32669d
                android.app.Activity r11 = r11.getContext()
                rs1.s8 r11 = r10.mo12873f(r11)
                if (r11 == 0) goto L_0x0184
                r12 = -1
                dp1.t r11 = r11.mo12855k3(r12)
                if (r11 == 0) goto L_0x0184
                te3.hj1 r11 = r11.f167327h
                if (r11 == 0) goto L_0x0184
                int r11 = r11.f134675i
                goto L_0x0185
            L_0x0184:
                r11 = 0
            L_0x0185:
                mo1.a r12 = r0.f32669d
                androidx.appcompat.app.AppCompatActivity r12 = r12.getActivity()
                r13 = 2131826498(0x7f111742, float:1.9285882E38)
                r14 = 4
                java.lang.Object[] r14 = new java.lang.Object[r14]
                java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
                r14[r9] = r15
                mo1.a r9 = r0.f32669d
                java.lang.String r9 = r9.f32611C
                r14[r8] = r9
                java.lang.String r8 = java.lang.String.valueOf(r11)
                r14[r7] = r8
                r7 = 3
                java.lang.String r8 = o40.C61926c.m72691p(r1)
                r14[r7] = r8
                java.lang.String r7 = r12.getString(r13, r14)
                java.lang.String r8 = "activity.getString(\n    …Id)\n                    )"
                gy3.C87412m.m108593f(r7, r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "MENU_ID_EXPOSE URL="
                r8.append(r9)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                java.lang.String r9 = "Finder.SelfProfileActionBarUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                r8.putExtra(r5, r7)
                mo1.a r5 = r0.f32669d
                androidx.appcompat.app.AppCompatActivity r5 = r5.getActivity()
                ke3.C88144b.m109791i(r5, r4, r3, r8, r6)
                te3.cb0 r3 = new te3.cb0
                r3.<init>()
                er1.j4 r4 = er1.C58739j4.f168176a
                r5 = 14
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                rx3.l r7 = new rx3.l
                java.lang.String r8 = "feedActionType"
                r7.<init>(r8, r5)
                java.util.Map r5 = sx3.C90363p0.m113143b(r7)
                java.lang.String r4 = r4.mo83702c(r5)
                r3.f131610g = r4
                r3.f131607d = r1
                mo1.a r1 = r0.f32669d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
                android.content.Intent r1 = r1.getIntent()
                java.lang.String r2 = "finder_username"
                java.lang.String r1 = r1.getStringExtra(r2)
                r3.f131608e = r1
                dp1.h1$a r1 = dp1.C58368h1.f167164D
                mo1.a r2 = r0.f32669d
                android.app.Activity r2 = r2.getContext()
                rs1.s8 r2 = r10.mo12873f(r2)
                if (r2 == 0) goto L_0x021e
                te3.hj1 r6 = r2.mo12861q3()
            L_0x021e:
                r1.mo8590b(r6, r3)
                goto L_0x024f
            L_0x0222:
                jm2.f r1 = jm2.C117361f.INSTANCE
                r2 = 540999703(0x203f0017, float:1.6178359E-19)
                r1.mo182041q(r2)
                mo1.a r1 = r0.f32669d
                r1.getClass()
                fe1.d$b r2 = fe1.C58961d.f168673a
                java.lang.String r1 = r1.f32611C
                fe1.q r5 = r2.mo84155b(r1)
                if (r5 == 0) goto L_0x024f
                mo1.a r1 = r0.f32669d
                er1.v2$a r3 = er1.C7888v2.f26513a
                androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r1, r2)
                r4 = r1
                com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
                r6 = 0
                r7 = 4
                r8 = 0
                er1.C7888v2.C7889a.m8055n(r3, r4, r5, r6, r7, r8)
            L_0x024f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mo1.C10943a.C10968p.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: mo1.a$q */
    public static final class C10969q extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10969q(C10943a aVar) {
            super(0);
            this.f32670d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32670d).f43002b;
        }
    }

    /* renamed from: mo1.a$r */
    public static final class C10970r extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10970r(C10943a aVar) {
            super(0);
            this.f32671d = aVar;
        }

        public Object invoke() {
            return Boolean.valueOf(C87412m.m108589b(this.f32671d.f32611C, C66785b.f191882e.mo90662O5()));
        }
    }

    /* renamed from: mo1.a$s */
    public static final class C10971s extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10971s(C10943a aVar) {
            super(0);
            this.f32672d = aVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f32672d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
        }
    }

    /* renamed from: mo1.a$t */
    public static final class C10972t extends C87413o implements C32224a<C8761d3> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32673d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10972t(C10943a aVar) {
            super(0);
            this.f32673d = aVar;
        }

        public Object invoke() {
            return (C8761d3) C39818r.f106831a.mo62444c(this.f32673d.getActivity()).mo62447c(C8761d3.class);
        }
    }

    /* renamed from: mo1.a$u */
    public static final class C10973u extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32674d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10973u(C10943a aVar) {
            super(0);
            this.f32674d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32674d).f43009i;
        }
    }

    /* renamed from: mo1.a$v */
    public static final class C10974v extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32675d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10974v(C10943a aVar) {
            super(0);
            this.f32675d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32675d).f43012l;
        }
    }

    /* renamed from: mo1.a$w */
    public static final class C10975w extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32676d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10975w(C10943a aVar) {
            super(0);
            this.f32676d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32676d).f43013m;
        }
    }

    /* renamed from: mo1.a$x */
    public static final class C10976x extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10976x(C10943a aVar) {
            super(0);
            this.f32677d = aVar;
        }

        public Object invoke() {
            return C10943a.m10949e3(this.f32677d).f43014n;
        }
    }

    /* renamed from: mo1.a$y */
    public static final class C10977y implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32678d;

        public C10977y(C10943a aVar) {
            this.f32678d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C11057v) C39818r.f106831a.mo62444c(this.f32678d.getActivity()).mo75002a(C11057v.class)).getClass();
            this.f32678d.getActivity().finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mo1.a$z */
    public static final class C10978z implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10943a f32679d;

        public C10978z(C10943a aVar) {
            this.f32679d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C11057v) C39818r.f106831a.mo62444c(this.f32679d.getActivity()).mo75002a(C11057v.class)).getClass();
            this.f32679d.getActivity().finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10943a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C36568h.m40985a(new C10966n(this));
        this.f32636r = C36568h.m40985a(new C10955f0(this));
        this.f32637s = C36568h.m40985a(new C10976x(this));
        this.f32638t = C36568h.m40985a(new C10974v(this));
        this.f32639u = C36568h.m40985a(new C10975w(this));
        this.f32640v = C36568h.m40985a(new C10961i0(this));
        this.f32641w = C36568h.m40985a(new C10946b(this));
        this.f32642x = C36568h.m40985a(new C10956g(this));
        this.f32643y = C36568h.m40985a(new C10960i(this));
        this.f32644z = C36568h.m40985a(new C10950d(this));
        C36568h.m40985a(new C10957g0(this));
        this.f32609A = C36568h.m40985a(new C10948c(this));
        int color = getActivity().getResources().getColor(C0966R.color.f2932f);
        this.f32610B = color;
        this.f32611C = "";
        this.f32612D = C36568h.m40985a(new C10971s(this));
        this.f32613E = C36568h.m40985a(new C10970r(this));
        this.f32614F = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
        this.f32616H = new ArgbEvaluator();
        this.f32617I = color;
        int color2 = getActivity().getResources().getColor(C0966R.color.f2932f);
        this.f32619K = color2;
        this.f32620L = color2;
        this.f32621M = new HashMap<>();
        this.f32622N = C36568h.m40985a(new C10972t(this));
        this.f32623P = C36568h.m40985a(new C10973u(this));
        this.f32624Q = C76577a.m92151b(getContext(), 80);
    }

    /* renamed from: c3 */
    public static final void m10947c3(C10943a aVar, float f, float f2) {
        if (!((Boolean) ((C36570n) aVar.f32613E).getValue()).booleanValue()) {
            if (((double) f) < 0.5d) {
                aVar.f32625R = true;
                FrameLayout j3 = aVar.mo11151j3();
                C87412m.m108593f(j3, "moreBtn");
                aVar.mo11153l3(j3, 0);
                View view = (View) ((C36570n) aVar.f32623P).getValue();
                C87412m.m108593f(view, "marginView");
                aVar.mo11153l3(view, 0);
                LinearLayout linearLayout = (LinearLayout) ((C36570n) aVar.f32630i).getValue();
                C87412m.m108593f(linearLayout, "followContainer");
                aVar.mo11153l3(linearLayout, 8);
                aVar.mo11151j3().setAlpha(f2);
                return;
            }
            aVar.f32625R = false;
            FrameLayout j35 = aVar.mo11151j3();
            C87412m.m108593f(j35, "moreBtn");
            aVar.mo11153l3(j35, 8);
            View view2 = (View) ((C36570n) aVar.f32623P).getValue();
            C87412m.m108593f(view2, "marginView");
            aVar.mo11153l3(view2, 8);
            LinearLayout linearLayout2 = (LinearLayout) ((C36570n) aVar.f32630i).getValue();
            C87412m.m108593f(linearLayout2, "followContainer");
            aVar.mo11153l3(linearLayout2, 0);
            ((LinearLayout) ((C36570n) aVar.f32630i).getValue()).setAlpha(f2);
        }
    }

    /* renamed from: d3 */
    public static final void m10948d3(C10943a aVar) {
        aVar.getClass();
        if (!C11767a.f34453a.mo11659a("post")) {
            AppCompatActivity activity = aVar.getActivity();
            String str = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
            int i = C60999e.f173723a.mo85970a((Long) null, 5) ? 9 : 2;
            C7335d c = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            C58684b bVar = (C58684b) c;
            C87412m.m108594g(activity, "context");
            C58408t0 t0Var = C58408t0.f167336a;
            t0Var.mo83266l(i, false);
            t0Var.mo83264j(str);
            t0Var.mo83261g(false, i);
            if (((C0145d1) C39818r.f106831a.mo62444c(aVar.getActivity()).mo75002a(C0145d1.class)).mo136d3(new C10981b(aVar), new C10984c(aVar))) {
                t0Var.mo83265k(str, (String) null);
                C77407n a = C0143d.f574a.mo134a(activity);
                a.f225771i = new C10987d(aVar, activity);
                a.f225782p = new C10990e(activity, aVar, str);
                a.f225761d = C10996f.f32706a;
                a.mo107573q();
            }
        }
    }

    /* renamed from: e3 */
    public static final C15983x m10949e3(C10943a aVar) {
        return (C15983x) aVar.f32626e.getValue();
    }

    /* renamed from: f3 */
    public final void mo11148f3() {
        C77407n nVar = new C77407n((Context) getActivity(), 1, false);
        nVar.f225771i = new C10967o(this);
        nVar.f225782p = new C10968p(this);
        nVar.mo107573q();
    }

    /* renamed from: g3 */
    public final FrameLayout mo11149g3() {
        return (FrameLayout) this.f32644z.getValue();
    }

    /* renamed from: i3 */
    public final FrameLayout mo11150i3() {
        return (FrameLayout) this.f32635q.getValue();
    }

    /* renamed from: j3 */
    public final FrameLayout mo11151j3() {
        return (FrameLayout) this.f32638t.getValue();
    }

    /* renamed from: k3 */
    public final void mo11152k3(boolean z, int i) {
        this.f32618J = new C13604l<>(Boolean.valueOf(z), Integer.valueOf(i));
        if (z) {
            mo11149g3().setBackground((Drawable) null);
        } else {
            mo11149g3().setBackgroundColor(this.f32610B);
        }
    }

    /* renamed from: l3 */
    public final void mo11153l3(View view, int i) {
        if (view.getVisibility() != i) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onCreate(Bundle bundle) {
        MMActivityController controller;
        ActionBar supportActionBar;
        Class cls = FinderProfileHeaderUIC.class;
        Class cls2 = C8761d3.class;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("finder_username");
        C87412m.m108591d(stringExtra);
        this.f32611C = stringExtra;
        C86709a0.m107524d().mo123455a(3736, this);
        if (!getFragmentMode()) {
            View decorView = getActivity().getWindow().getDecorView();
            C87412m.m108593f(decorView, "activity.window.decorView");
            decorView.setSystemUiVisibility(9472);
            C74779i.m89536a(getActivity(), false);
            ActionBar supportActionBar2 = getActivity().getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.mo91112w(new ColorDrawable(0));
                supportActionBar2.mo91104o();
            }
        } else if (getFragment() == null && (supportActionBar = getActivity().getSupportActionBar()) != null) {
            supportActionBar.mo91104o();
        }
        if (!getFragmentMode()) {
            int f = C75044y4.m89994f(getActivity());
            ViewGroup.LayoutParams layoutParams = mo11149g3().getLayoutParams();
            layoutParams.height += f;
            mo11149g3().setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = ((LinearLayout) ((C36570n) this.f32637s).getValue()).getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.topMargin = f;
            ((LinearLayout) ((C36570n) this.f32637s).getValue()).setLayoutParams(layoutParams3);
        }
        ((FrameLayout) ((C36570n) this.f32640v).getValue()).setAlpha(0.0f);
        C39818r rVar = C39818r.f106831a;
        ((C8761d3) rVar.mo62444c(getActivity()).mo62447c(cls2)).mo9586V2(1);
        C10944a aVar = new C10944a();
        AppBarLayout appBarLayout = (AppBarLayout) ((C36570n) this.f32633o).getValue();
        C87412m.m108593f(appBarLayout, "appBarLayout");
        aVar.mo3128a(appBarLayout, 0);
        ((AppBarLayout) ((C36570n) this.f32633o).getValue()).mo146159a(aVar);
        mo11150i3().setOnClickListener(new C10977y(this));
        ((LinearLayout) ((C36570n) this.f32628g).getValue()).setOnClickListener(new C10978z(this));
        ((LinearLayout) ((C36570n) this.f32629h).getValue()).setVisibility(8);
        mo11151j3().setVisibility(8);
        FinderProfileHeaderUIC finderProfileHeaderUIC = (FinderProfileHeaderUIC) rVar.mo62443b(getContext()).mo62449e(cls);
        if (!(finderProfileHeaderUIC != null && finderProfileHeaderUIC.mo3807I3().f42863a.getVisibility() == 0)) {
            if (((Boolean) ((C36570n) this.f32613E).getValue()).booleanValue() && ((Boolean) ((C36570n) this.f32612D).getValue()).booleanValue()) {
                C7335d c = C86312j.m106911c(C8777j5.class);
                C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
                C8777j5.C8778a.m8601b((C8777j5) c, 1, ((C8761d3) rVar.mo62444c(getActivity()).mo62447c(cls2)).mo9589n1(), ((C8761d3) rVar.mo62444c(getActivity()).mo62447c(cls2)).mo9585G(), (Map) null, 8, (Object) null);
                ((LinearLayout) ((C36570n) this.f32629h).getValue()).setVisibility(0);
                mo11151j3().setVisibility(0);
                this.f32625R = true;
                ((LinearLayout) ((C36570n) this.f32629h).getValue()).setOnClickListener(new C10945a0(this));
                FinderProfileHeaderUIC finderProfileHeaderUIC2 = (FinderProfileHeaderUIC) rVar.mo62443b(getContext()).mo75002a(cls);
                FrameLayout j3 = mo11151j3();
                C87412m.m108593f(j3, "moreBtn");
                ImageView imageView = (ImageView) ((C36570n) this.f32639u).getValue();
                C87412m.m108593f(imageView, "moreBtnRedDot");
                finderProfileHeaderUIC2.getClass();
                C61926c.m72695t(C2479n0.f12967m, finderProfileHeaderUIC2.getActivity(), new C11052t0(imageView, finderProfileHeaderUIC2));
                j3.setOnClickListener(new C11056u0(finderProfileHeaderUIC2));
                ((C58417y0) C86312j.m106911c(C58417y0.class)).By0(getActivity(), 1, 1);
            } else if (this.f32614F) {
                LinearLayout linearLayout = (LinearLayout) ((C36570n) this.f32630i).getValue();
                C87412m.m108593f(linearLayout, "followContainer");
                mo11153l3(linearLayout, 8);
                mo11151j3().setVisibility(0);
                this.f32625R = true;
                mo11151j3().setOnClickListener(new C10947b0(this));
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                    mo11151j3().setOnLongClickListener(new C10949c0(this));
                }
            } else {
                mo11151j3().setVisibility(0);
                this.f32625R = true;
                mo11151j3().setOnClickListener(new C10951d0(this));
            }
        }
        if (!getFragmentMode() && (getActivity() instanceof MMActivity)) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).getController().mo177059O0(getActivity(), getResources().getColor(C0966R.color.ahf));
            AppCompatActivity activity2 = getActivity();
            MMActivity mMActivity = activity2 instanceof MMActivity ? (MMActivity) activity2 : null;
            if (!(mMActivity == null || (controller = mMActivity.getController()) == null)) {
                controller.mo177049H0(C85875k4.m106211z());
            }
        }
        if (C85875k4.m106211z()) {
            mo11150i3().setBackgroundResource(C0966R.C0969drawable.a5o);
        } else {
            mo11150i3().setBackgroundResource(C0966R.C0969drawable.a5p);
        }
        ((WeImageView) ((C36570n) this.f32643y).getValue()).setVisibility(8);
        if (getFragmentMode()) {
            float dimension = getContext().getResources().getDimension(C0966R.dimen.f3761db);
            mo11150i3().setVisibility(0);
            ((LinearLayout) ((C36570n) this.f32628g).getValue()).setVisibility(8);
            FrameLayout g3 = mo11149g3();
            ViewGroup.LayoutParams layoutParams4 = mo11149g3().getLayoutParams();
            layoutParams4.height = (int) dimension;
            g3.setLayoutParams(layoutParams4);
        } else {
            mo11150i3().setVisibility(8);
            ((LinearLayout) ((C36570n) this.f32628g).getValue()).setVisibility(0);
        }
        if (getFragmentMode()) {
            mo11149g3().setVisibility(8);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3736, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (i == 0 && i2 == 0 && (yVar instanceof C9377s4)) {
            StringBuilder sb = new StringBuilder();
            sb.append("username=");
            sb.append(this.f32611C);
            sb.append(", scene username=");
            C9377s4 s4Var = (C9377s4) yVar;
            FinderContact P0 = s4Var.mo10101P0();
            sb.append(P0 != null ? P0.username : null);
            Log.m105924i("Finder.SelfProfileActionBarUIC", sb.toString());
            FinderContact P02 = s4Var.mo10101P0();
            if (!(P02 == null || (str2 = P02.username) == null)) {
                this.f32611C = str2;
            }
            C58969q b = C58961d.f168673a.mo84155b(this.f32611C);
            if (b != null) {
                ((TextView) ((C36570n) this.f32642x).getValue()).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getActivity(), b.mo84196w1()));
                C39818r rVar = C39818r.f106831a;
                C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
                C62345f fVar = new C62345f(b.mo84172g0(), (C27696y) null, 2, (C8480h) null);
                ImageView imageView = (ImageView) ((C36570n) this.f32641w).getValue();
                C87412m.m108593f(imageView, "actionBarAvatarIv");
                i25.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10943a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C36568h.m40985a(new C10966n(this));
        this.f32636r = C36568h.m40985a(new C10955f0(this));
        this.f32637s = C36568h.m40985a(new C10976x(this));
        this.f32638t = C36568h.m40985a(new C10974v(this));
        this.f32639u = C36568h.m40985a(new C10975w(this));
        this.f32640v = C36568h.m40985a(new C10961i0(this));
        this.f32641w = C36568h.m40985a(new C10946b(this));
        this.f32642x = C36568h.m40985a(new C10956g(this));
        this.f32643y = C36568h.m40985a(new C10960i(this));
        this.f32644z = C36568h.m40985a(new C10950d(this));
        C36568h.m40985a(new C10957g0(this));
        this.f32609A = C36568h.m40985a(new C10948c(this));
        int color = getActivity().getResources().getColor(C0966R.color.f2932f);
        this.f32610B = color;
        this.f32611C = "";
        this.f32612D = C36568h.m40985a(new C10971s(this));
        this.f32613E = C36568h.m40985a(new C10970r(this));
        this.f32614F = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
        this.f32616H = new ArgbEvaluator();
        this.f32617I = color;
        int color2 = getActivity().getResources().getColor(C0966R.color.f2932f);
        this.f32619K = color2;
        this.f32620L = color2;
        this.f32621M = new HashMap<>();
        this.f32622N = C36568h.m40985a(new C10972t(this));
        this.f32623P = C36568h.m40985a(new C10973u(this));
        this.f32624Q = C76577a.m92151b(getContext(), 80);
    }
}
