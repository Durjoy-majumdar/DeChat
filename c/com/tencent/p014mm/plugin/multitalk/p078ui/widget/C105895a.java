package com.tencent.p014mm.plugin.multitalk.p078ui.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import as3.C103898r0;
import b43.C104032b;
import c92.C104328f;
import c92.C104331h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.p136ui.C85985z2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1821q0;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105603b2;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105718x1;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.model.C105770a;
import com.tencent.p014mm.plugin.multitalk.model.C105789c;
import com.tencent.p014mm.plugin.multitalk.model.C105798e1;
import com.tencent.p014mm.plugin.multitalk.model.C105806i0;
import com.tencent.p014mm.plugin.multitalk.model.C105825p;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkAddMembersUI;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.CollapseView;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultitalkFrameView;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.file.XVFSFile;
import d82.C107025a;
import dd0.C75346e;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import j20.C117292a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l31.C61212e;
import nj3.C76912y0;
import nw3.C109779e;
import p196ln.C10579k;
import p196ln.C76706g;
import p447aw.C103918d;
import p626nv.C109759g;
import p910lj.C76701a;
import qo3.C101218e0;
import rx3.C13598b0;
import u82.C52476a;
import v82.C111418b0;
import v82.C111424d;
import v82.C111433e;
import v82.C111453i;
import v82.C78366i1;
import x82.C112102l;
import x82.C112113q;
import z82.C112612a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a */
public class C105895a implements View.OnClickListener, C10579k.C10580a, C105789c, C104032b.C104033a {

    /* renamed from: A */
    public MultiTalkControlIconLayout f315022A;

    /* renamed from: B */
    public MultiTalkControlIconLayout f315023B;

    /* renamed from: C */
    public int f315024C;

    /* renamed from: D */
    public int f315025D;

    /* renamed from: E */
    public RelativeLayout f315026E;

    /* renamed from: F */
    public RelativeLayout f315027F;

    /* renamed from: G */
    public ConstraintLayout f315028G;

    /* renamed from: H */
    public RelativeLayout f315029H;

    /* renamed from: I */
    public CollapseView f315030I;

    /* renamed from: J */
    public ArrayList<Integer> f315031J = new ArrayList<>();

    /* renamed from: K */
    public ArrayList<Integer> f315032K = new ArrayList<>();

    /* renamed from: L */
    public boolean f315033L;

    /* renamed from: M */
    public boolean f315034M = false;

    /* renamed from: N */
    public boolean f315035N = true;

    /* renamed from: P */
    public int f315036P = 15;

    /* renamed from: Q */
    public int f315037Q = 0;

    /* renamed from: R */
    public FrameLayout f315038R;

    /* renamed from: S */
    public RelativeLayout f315039S;

    /* renamed from: T */
    public C112612a f315040T;

    /* renamed from: U */
    public View.OnClickListener f315041U = new C105907l();

    /* renamed from: V */
    public Runnable f315042V = new C69863o();

    /* renamed from: W */
    public MTimerHandler f315043W = new MTimerHandler("MultiTalkTimer", (MTimerHandler.CallBack) new C105901f(), false);

    /* renamed from: X */
    public long f315044X;

    /* renamed from: Y */
    public C104032b f315045Y;

    /* renamed from: Z */
    public boolean f315046Z = true;

    /* renamed from: d */
    public MultiTalkMainUI f315047d;

    /* renamed from: e */
    public final View f315048e;

    /* renamed from: f */
    public RecyclerView f315049f;

    /* renamed from: g */
    public C105770a f315050g;

    /* renamed from: h */
    public GridLayoutManager f315051h;

    /* renamed from: i */
    public ImageButton f315052i;

    /* renamed from: j */
    public TextView f315053j;

    /* renamed from: n */
    public View f315054n;

    /* renamed from: o */
    public TextView f315055o;

    /* renamed from: p */
    public TextView f315056p;

    /* renamed from: q */
    public ImageView f315057q;

    /* renamed from: r */
    public View f315058r;

    /* renamed from: s */
    public WeImageButton f315059s;

    /* renamed from: t */
    public WeImageView f315060t;

    /* renamed from: u */
    public View f315061u;

    /* renamed from: v */
    public View f315062v;

    /* renamed from: w */
    public View f315063w;

    /* renamed from: x */
    public View f315064x;

    /* renamed from: y */
    public C52476a f315065y;

    /* renamed from: z */
    public MultiTalkControlIconLayout f315066z;

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$i */
    public class C69860i extends RecyclerView.C0130p {
        public C69860i() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C105895a aVar = C105895a.this;
                if (aVar.f315033L) {
                    aVar.mo150976z(false);
                    C115669n.INSTANCE.idkeyStat(220, 33, 1, false);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C105895a.this.f315033L = i2 != 0;
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$m */
    public class C69861m implements CollapseView.C69859c {
        public C69861m() {
        }

        /* renamed from: a */
        public void mo96156a() {
            C105895a.this.f315047d.mo150873V(2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$n */
    public class C69862n implements View.OnClickListener {
        public C69862n() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C105895a.this.f315047d.findViewById(C0966R.C0970id.has) != null) {
                C105895a.this.f315047d.mo150873V(2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$o */
    public class C69863o implements Runnable {
        public C69863o() {
        }

        public void run() {
            MultiTalkMainUI multiTalkMainUI = C105895a.this.f315047d;
            if (multiTalkMainUI != null && !multiTalkMainUI.isFinishing()) {
                if (C105895a.this.f315047d.findViewById(C0966R.C0970id.has) != null) {
                    C105895a.this.f315047d.findViewById(C0966R.C0970id.has).setOnClickListener((View.OnClickListener) null);
                }
                CollapseView collapseView = C105895a.this.f315030I;
                if (collapseView != null) {
                    collapseView.setLinkToAutoMobileListener((CollapseView.C69859c) null);
                }
                C105895a.this.getClass();
                C105895a.this.f315056p.setVisibility(8);
                C105895a.this.f315057q.setVisibility(8);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$a */
    public class C105896a implements Runnable {
        public C105896a(C105895a aVar) {
        }

        public void run() {
            VoipFloatCardPermissionDialog.f117099e.mo57461a(MMApplicationContext.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$b */
    public class C105897b implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f315067a;

        public C105897b(C101218e0 e0Var) {
            this.f315067a = e0Var;
        }

        /* renamed from: a */
        public void mo2001a() {
            this.f315067a.mo140680z();
            C105853x.f314828f++;
            if (C105851w0.zx0().f314506t != null) {
                String str = C105851w0.zx0().f314506t.f320042d;
            }
            Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
            C115669n.INSTANCE.mo175913w(1538, 0, 1);
            C105895a.this.f315047d.mo150870I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$c */
    public class C105898c implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f315069a;

        public C105898c(C105895a aVar, C101218e0 e0Var) {
            this.f315069a = e0Var;
        }

        /* renamed from: a */
        public void mo2001a() {
            this.f315069a.mo140680z();
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$d */
    public class C105899d implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f315070a;

        public C105899d(C101218e0 e0Var) {
            this.f315070a = e0Var;
        }

        /* renamed from: a */
        public void mo2001a() {
            this.f315070a.mo140680z();
            C105853x.f314828f++;
            if (C105851w0.zx0().f314506t != null) {
                String str = C105851w0.zx0().f314506t.f320042d;
            }
            Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
            C115669n.INSTANCE.mo175913w(1538, 0, 1);
            C105895a.this.f315047d.mo150870I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$e */
    public class C105900e implements C85878m2.C85879a {
        public C105900e() {
        }

        /* renamed from: a */
        public void mo4167a() {
            C105895a.this.f315060t.setBackgroundResource(C0966R.raw.icons_outlined_sperated);
        }

        /* renamed from: b */
        public void mo4168b() {
            C105895a.this.f315060t.setBackgroundResource(C0966R.raw.icons_outlined_merge);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$f */
    public class C105901f implements MTimerHandler.CallBack {

        /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$f$a */
        public class C105902a implements Runnable {
            public C105902a() {
            }

            public void run() {
                C105895a.this.f315055o.setVisibility(8);
                C105895a.this.f315053j.setVisibility(0);
            }
        }

        public C105901f() {
        }

        public boolean onTimerExpired() {
            ((C119157j) C119157j.f356862d).mo183895z(new C105902a());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$g */
    public class C105903g implements Runnable {
        public C105903g() {
        }

        public void run() {
            C105895a.this.f315053j.setText(C0966R.string.gyt);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$h */
    public class C105904h extends GridLayoutManager.C0127b {

        /* renamed from: b */
        public final /* synthetic */ C111424d f315076b;

        public C105904h(C111424d dVar) {
            this.f315076b = dVar;
        }

        /* renamed from: c */
        public int mo118c(int i) {
            C111424d dVar = this.f315076b;
            if (i < dVar.f333583n || i > (dVar.getItemCount() - dVar.f333584o) - 1) {
                return C105895a.this.f315051h.f44669w;
            }
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$j */
    public class C105905j implements View.OnClickListener {
        public C105905j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C105853x.f314824b++;
            C105851w0.zx0().mo150641R(!C105895a.this.f315022A.mo96157a());
            if (C105895a.this.f315022A.mo96157a()) {
                C105895a.this.f315022A.setChecked(false);
                C105853x.m142230a(1);
                C105851w0.xx0().mo150826f(true);
                C105851w0.Cx0().getClass();
            } else {
                C105895a.this.f315022A.setChecked(true);
                C105851w0.Cx0().getClass();
                C105853x.m142230a(2);
                C105851w0.xx0().mo150826f(false);
            }
            if (C105851w0.zx0().mo150670m().mo150708j()) {
                C104328f.f308805a.mo146025b(5, 2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$k */
    public class C105906k implements View.OnClickListener {
        public C105906k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C105895a.this.f315023B.isEnabled()) {
                C105853x.f314825c++;
                C105851w0.zx0().mo150642S(C105895a.this.f315023B.mo96157a());
                C105895a.this.mo150975y();
                if (C105895a.this.f315023B.mo96157a()) {
                    C105895a.this.f315023B.setChecked(true);
                    C105853x.m142230a(3);
                    C105851w0.xx0().mo150827g(true);
                } else {
                    C105895a.this.f315023B.setChecked(false);
                    C105853x.m142230a(4);
                    C105851w0.xx0().mo150827g(false);
                }
                if (C105851w0.zx0().mo150670m().mo150708j()) {
                    C104328f.f308805a.mo146025b(6, 2);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$l */
    public class C105907l implements View.OnClickListener {
        public C105907l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C105853x.f314826d++;
            C105895a aVar = C105895a.this;
            aVar.getClass();
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(aVar.f315047d.getContext(), "android.permission.CAMERA", 22, "", "");
            Log.m105925i("MicroMsg.MT.MultiTalkTalkingUILogic", "summerper checkPermission checkcamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), aVar.f315047d.getContext());
            if (!z1) {
                C105895a.this.f315066z.setChecked(false);
                C115669n.INSTANCE.idkeyStat(220, 26, 1, false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!C105851w0.zx0().mo150683y()) {
                C105895a.this.f315066z.setChecked(false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!C105851w0.zx0().mo150684z()) {
                C105895a.this.f315066z.setChecked(false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!NetStatusUtil.isNetworkConnected(C105895a.this.f315047d)) {
                C75346e.m90356b(C105895a.this.f315047d, C0966R.string.f360087a11, (Runnable) null);
                C105895a.this.f315066z.setChecked(false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                long a = C105806i0.m142148a();
                if (a > 0) {
                    Log.m105925i("MicroMsg.MT.MultiTalkTalkingUILogic", "onClickVideoAction, isOverLoadFail is true! videoWaitMills:%s", Long.valueOf(a));
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.lv6, new Object[]{Integer.valueOf((int) Math.ceil((double) (((float) a) / 1000.0f)))}), 0).show();
                    C105895a.this.f315066z.setChecked(false);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C104328f fVar = C104328f.f308805a;
                if (C105895a.this.f315066z.mo96157a()) {
                    C104328f.f308824t.mo479b();
                    C104328f.f308821q = true;
                } else {
                    C104328f.f308824t.mo478a();
                }
                if (C105895a.this.f315066z.mo96157a()) {
                    C105895a.this.mo150971u(false);
                    C105851w0.zx0().getClass();
                    ((C105798e1) C105851w0.zx0().mo150677r()).mo150747b(true);
                    C105853x.m142230a(5);
                    C105724z zVar = C105724z.INSTANCE;
                    zVar.getClass();
                    Log.m105924i("MicroMsg.Multitalk.ILinkService", "hy: onCameraStart");
                    zVar.mo150614x(new C105603b2(zVar));
                    C105851w0.Cx0().getClass();
                } else {
                    C105895a.this.mo150972v(false);
                    C105851w0.zx0().mo150655c0(1, C105851w0.zx0().f314498j);
                    C105853x.m142230a(6);
                    C105724z.INSTANCE.mo150612v();
                    C105851w0.Cx0().getClass();
                }
                if (C105851w0.zx0().mo150670m().mo150708j()) {
                    String str = C105851w0.zx0().f314506t.f320042d;
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.a$p */
    public class C105908p implements Comparable {

        /* renamed from: d */
        public MultiTalkGroupMember f315081d;

        /* renamed from: e */
        public int f315082e;

        public C105908p(C105895a aVar, MultiTalkGroupMember multiTalkGroupMember, int i) {
            this.f315081d = multiTalkGroupMember;
            this.f315082e = i;
        }

        public int compareTo(Object obj) {
            return Integer.compare(this.f315082e, ((C105908p) obj).f315082e);
        }

        public String toString() {
            return this.f315081d + XVFSFile.PATH_SEPARATOR + this.f315082e;
        }
    }

    public C105895a(MultiTalkMainUI multiTalkMainUI) {
        MultiTalkMainUI multiTalkMainUI2 = multiTalkMainUI;
        Class cls = C61212e.class;
        this.f315047d = multiTalkMainUI2;
        int i = C85875k4.m106184h(multiTalkMainUI).x;
        this.f315024C = i;
        this.f315025D = i + C76577a.m92151b(multiTalkMainUI2, 52) + C85875k4.m106198o(multiTalkMainUI);
        this.f315053j = (TextView) multiTalkMainUI2.findViewById(C0966R.C0970id.kky);
        this.f315054n = multiTalkMainUI2.findViewById(C0966R.C0970id.krg);
        this.f315055o = (TextView) multiTalkMainUI2.findViewById(C0966R.C0970id.kpm);
        this.f315058r = multiTalkMainUI2.findViewById(C0966R.C0970id.kfq);
        this.f315037Q = C76577a.m92159j(multiTalkMainUI) - C76577a.m92151b(multiTalkMainUI2, C1821q0.CTRL_INDEX);
        this.f315026E = (RelativeLayout) multiTalkMainUI2.findViewById(C0966R.C0970id.bsw);
        this.f315027F = (RelativeLayout) multiTalkMainUI2.findViewById(C0966R.C0970id.ete);
        this.f315028G = (ConstraintLayout) multiTalkMainUI.getLayoutInflater().inflate(C0966R.C0971layout.bhd, (ViewGroup) null, false);
        RelativeLayout relativeLayout = (RelativeLayout) multiTalkMainUI.getLayoutInflater().inflate(C0966R.C0971layout.bhc, (ViewGroup) null, false);
        this.f315029H = relativeLayout;
        this.f315052i = (ImageButton) relativeLayout.findViewById(C0966R.C0970id.kfp);
        this.f315049f = (RecyclerView) multiTalkMainUI2.findViewById(C0966R.C0970id.kfr);
        RelativeLayout relativeLayout2 = (RelativeLayout) multiTalkMainUI2.findViewById(C0966R.C0970id.kfs);
        this.f315038R = (FrameLayout) multiTalkMainUI2.findViewById(C0966R.C0970id.kfn);
        this.f315050g = C105851w0.zx0().mo150670m();
        this.f315039S = (RelativeLayout) multiTalkMainUI2.findViewById(C0966R.C0970id.j2z);
        View findViewById = multiTalkMainUI2.findViewById(C0966R.C0970id.kr_);
        this.f315048e = findViewById;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.topMargin = C85875k4.m106198o(multiTalkMainUI) + C76577a.m92151b(multiTalkMainUI2, 12);
        findViewById.setLayoutParams(layoutParams);
        ((RelativeLayout.LayoutParams) this.f315038R.getLayoutParams()).topMargin = C76577a.m92151b(multiTalkMainUI2, 52) + C85875k4.m106198o(multiTalkMainUI);
        this.f315051h = new GridLayoutManager(multiTalkMainUI2, 3);
        C111424d dVar = new C111424d(multiTalkMainUI2);
        this.f315049f.setLayoutManager(this.f315051h);
        this.f315051h.f44666B = new C105904h(dVar);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f315049f.getLayoutParams();
        int i2 = this.f315037Q;
        int i3 = this.f315024C;
        if (i2 > i3) {
            layoutParams2.width = i3;
            layoutParams2.height = this.f315025D;
        } else {
            layoutParams2.width = i2;
            layoutParams2.height = i2 + C76577a.m92151b(multiTalkMainUI2, 52) + C85875k4.m106198o(multiTalkMainUI);
            layoutParams2.addRule(14);
        }
        Log.m105925i("MicroMsg.MT.MultiTalkTalkingUILogic", "mAvatarLastHeight is %s and talkingAvatarContainerWidth is %s", Integer.valueOf(this.f315037Q), Integer.valueOf(this.f315024C));
        this.f315049f.setLayoutParams(layoutParams2);
        dVar.f333585p = this.f315050g;
        this.f315049f.setAdapter(dVar);
        this.f315049f.setOnScrollListener(new C69860i());
        this.f315050g.mo150709k(this.f315049f, this.f315038R, multiTalkMainUI2, this);
        this.f315059s = (WeImageButton) multiTalkMainUI2.findViewById(C0966R.C0970id.h4f);
        this.f315060t = (WeImageView) multiTalkMainUI2.findViewById(C0966R.C0970id.amh);
        View findViewById2 = multiTalkMainUI2.findViewById(C0966R.C0970id.f358791h41);
        this.f315061u = findViewById2;
        findViewById2.setBackground(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_outlined_add, -1));
        this.f315062v = multiTalkMainUI2.findViewById(C0966R.C0970id.h4u);
        View findViewById3 = multiTalkMainUI2.findViewById(C0966R.C0970id.h37);
        this.f315063w = findViewById3;
        this.f315065y = new C52476a(multiTalkMainUI2, this.f315062v, "screenShare", findViewById3);
        this.f315062v.setBackground(C74933u4.m89768e(multiTalkMainUI2, C0966R.raw.icons_outlined_board, multiTalkMainUI.getResources().getColor(C0966R.color.f2975b6)));
        this.f315061u.bringToFront();
        this.f315061u.setOnClickListener(this);
        MultiTalkControlIconLayout multiTalkControlIconLayout = (MultiTalkControlIconLayout) this.f315028G.findViewById(C0966R.C0970id.h59);
        this.f315066z = multiTalkControlIconLayout;
        multiTalkControlIconLayout.setIconEnabled(C105851w0.zx0().mo150684z());
        this.f315066z.setOnClickListener(this.f315041U);
        MultiTalkControlIconLayout multiTalkControlIconLayout2 = (MultiTalkControlIconLayout) this.f315028G.findViewById(C0966R.C0970id.h4k);
        this.f315022A = multiTalkControlIconLayout2;
        multiTalkControlIconLayout2.setOnClickListener(new C105905j());
        MultiTalkControlIconLayout multiTalkControlIconLayout3 = (MultiTalkControlIconLayout) this.f315028G.findViewById(C0966R.C0970id.h49);
        this.f315023B = multiTalkControlIconLayout3;
        multiTalkControlIconLayout3.setOnClickListener(new C105906k());
        this.f315030I = (CollapseView) multiTalkMainUI2.findViewById(C0966R.C0970id.f358366ep1);
        this.f315064x = this.f315029H.findViewById(C0966R.C0970id.h46);
        this.f315022A.setChecked(!C105851w0.zx0().f314493e);
        this.f315023B.setChecked(C105851w0.zx0().f314494f);
        this.f315066z.setChecked(C105851w0.zx0().mo150625B());
        Log.m105925i("MicroMsg.MT.MultiTalkTalkingUILogic", "talkingAvatarContainerHeight %d", Integer.valueOf(this.f315025D));
        this.f315052i.setOnClickListener(this);
        this.f315059s.bringToFront();
        this.f315059s.setOnClickListener(this);
        this.f315059s.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_outlined_mini_windows_new, -1));
        this.f315059s.setIconColor(-1);
        this.f315062v.setOnClickListener(this);
        this.f315064x.setOnClickListener(this);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b(this);
        this.f315060t.setOnClickListener(this);
        if (C85875k4.m106208w() || C85985z2.m106332d(multiTalkMainUI.getTaskId())) {
            this.f315060t.setVisibility(0);
            ((C61212e) C86312j.m106911c(cls)).o30(this.f315060t, "split_view_icon");
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f315060t, 40, 26430);
        }
        if (C85875k4.m106209x(multiTalkMainUI.getTaskId())) {
            this.f315060t.setBackground(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_outlined_merge, -1));
        } else {
            this.f315060t.setBackground(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_outlined_sperated, -1));
        }
        if (C105851w0.zx0().mo150625B()) {
            View view = this.f315064x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo150974x();
        } else {
            View view3 = this.f315064x;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (C105851w0.zx0().f314469K != null) {
            boolean z = !C105851w0.zx0().f314469K.mo146014f0();
            MultiTalkControlIconLayout multiTalkControlIconLayout4 = this.f315023B;
            if (multiTalkControlIconLayout4 != null) {
                multiTalkControlIconLayout4.setEnabled(z);
                this.f315023B.setIconEnabled(z);
            }
        }
        mo150975y();
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        MultitalkFrameView multitalkFrameView;
        Log.m105925i("MicroMsg.MT.MultiTalkTalkingUILogic", "notifyChanged %s", str);
        C105770a aVar = this.f315050g;
        aVar.getClass();
        C87412m.m108594g(str, "wxUserName");
        C111433e f = aVar.mo150704f(str);
        if (f != null && (multitalkFrameView = f.f333625z) != null) {
            multitalkFrameView.mo150936k();
        }
    }

    /* renamed from: a */
    public void mo150951a(int i) {
        ImageButton imageButton;
        C112612a aVar = this.f315040T;
        if (aVar != null) {
            aVar.f337243e = i;
            C112113q qVar = aVar.f337244f;
            if (!(qVar == null || qVar.f335671j == i)) {
                qVar.f335671j = i;
                C112102l lVar = qVar.f335668g;
                if (lVar != null) {
                    lVar.mo163815a(i);
                }
            }
            CollapseView collapseView = this.f315030I;
            if (!(collapseView == null || (imageButton = collapseView.f314970s) == null)) {
                imageButton.setRotation((float) (360 - i));
            }
            View view = this.f315064x;
            if (view != null) {
                view.setRotation((float) i);
            }
            MultiTalkControlIconLayout multiTalkControlIconLayout = this.f315066z;
            if (multiTalkControlIconLayout != null) {
                multiTalkControlIconLayout.f201555e.setRotation(((float) v2helper.VOIP_ENC_HEIGHT_LV1) - ((float) i));
            }
            MultiTalkControlIconLayout multiTalkControlIconLayout2 = this.f315023B;
            if (multiTalkControlIconLayout2 != null) {
                multiTalkControlIconLayout2.f201555e.setRotation(((float) v2helper.VOIP_ENC_HEIGHT_LV1) - ((float) i));
            }
            MultiTalkControlIconLayout multiTalkControlIconLayout3 = this.f315022A;
            if (multiTalkControlIconLayout3 != null) {
                multiTalkControlIconLayout3.f201555e.setRotation(((float) v2helper.VOIP_ENC_HEIGHT_LV1) - ((float) i));
            }
        }
    }

    /* renamed from: b */
    public void mo150952b() {
        MultiTalkControlIconLayout multiTalkControlIconLayout = this.f315066z;
        if (multiTalkControlIconLayout != null && multiTalkControlIconLayout.mo96157a()) {
            mo150972v(false);
            C105851w0.zx0().mo150655c0(1, C105851w0.zx0().f314498j);
            C105853x.m142230a(6);
            C105724z.INSTANCE.mo150612v();
            C104328f fVar = C104328f.f308805a;
            C104328f.f308824t.mo478a();
            MultiTalkMainUI multiTalkMainUI = this.f315047d;
            C76912y0.m92773l(multiTalkMainUI, multiTalkMainUI.getResources().getString(C0966R.string.ifa));
            C105851w0.Cx0().getClass();
        }
    }

    /* renamed from: c */
    public void mo145644c(int i) {
        if (C105851w0.vx0().mo150809d()) {
            C105851w0.vx0().getClass();
        }
    }

    /* renamed from: d */
    public void mo150953d() {
        View view = this.f315058r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f315061u;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f315062v;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view6 = this.f315063w;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: e */
    public int mo150954e(ArrayList<Integer> arrayList) {
        if (arrayList == null || arrayList.size() < 1) {
            return -1;
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int intValue = arrayList.get(i).intValue();
            sb.append(intValue);
            sb.append(",");
            iArr[i] = intValue;
        }
        Log.m105925i("MicroMsg.MT.MultiTalkTalkingUILogic", "steve: engineDoMemberSelectForView: selected id list: %s", sb.toString());
        ByteBuffer allocate = ByteBuffer.allocate(size * 4);
        allocate.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().put(iArr);
        int i2 = ((C109779e) C105851w0.xx0().f314798d).mo161038i(23, allocate.array(), size);
        if (i2 >= 0) {
            return i2;
        }
        Log.m105920e("MicroMsg.MT.MultiTalkTalkingUILogic", "steve:engineDoMemberSelectForView failed!!");
        C105853x.m142231b();
        return -1;
    }

    /* renamed from: f */
    public void mo150955f(boolean z) {
        View view = this.f315061u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f315062v;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f315063w;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z) {
            this.f315059s.setVisibility(8);
        }
        this.f315060t.setVisibility(8);
    }

    /* renamed from: g */
    public void mo150956g() {
        if (this.f315040T != null) {
            mo150951a(0);
            C112113q qVar = this.f315040T.f337244f;
            if (qVar != null) {
                qVar.mo163847g();
            }
            this.f315040T.mo164385f(this.f315039S);
            this.f315040T = null;
            mo150976z(true);
        }
    }

    /* renamed from: h */
    public void mo150957h() {
        View view = this.f315058r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f315054n;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: i */
    public void mo150958i(MultiTalkGroup multiTalkGroup) {
        if (!this.f315047d.mo150871J7() && !this.f315050g.mo150708j()) {
            if (!this.f315050g.mo150708j()) {
                View view = this.f315058r;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f315066z.setIconEnabled(C105851w0.zx0().mo150684z());
                View view2 = this.f315061u;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (!C105851w0.zx0().mo150684z()) {
                    View view4 = this.f315062v;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view5 = this.f315063w;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (this.f315047d.mo150871J7()) {
                    View view7 = this.f315062v;
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(8);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view9 = this.f315063w;
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(8);
                    C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view10 = this.f315061u;
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(8);
                    View view11 = view10;
                    C117292a.m165358d(view11, aVar7.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (BuildInfo.IS_ARM64) {
                    View view12 = this.f315062v;
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(0);
                    C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view12.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (!C104331h.m139310a()) {
                        ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(this.f315065y);
                    } else {
                        View view13 = this.f315063w;
                        C9556a aVar9 = new C9556a();
                        aVar9.mo10233c(8);
                        View view14 = view13;
                        C117292a.m165358d(view14, aVar9.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view13.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                        C117292a.m165359e(view14, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            mo150970t(multiTalkGroup, true);
            this.f315050g.mo150709k(this.f315049f, this.f315038R, this.f315047d, this);
            mo150975y();
        }
    }

    /* renamed from: j */
    public void mo150959j() {
        if (C105851w0.zx0().f314469K != null) {
            boolean z = !C105851w0.zx0().f314469K.mo146014f0();
            MultiTalkControlIconLayout multiTalkControlIconLayout = this.f315023B;
            if (multiTalkControlIconLayout != null) {
                multiTalkControlIconLayout.setEnabled(z);
                this.f315023B.setIconEnabled(z);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fe  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150960k(boolean r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r8 = "MicroMsg.MT.MultiTalkTalkingUILogic"
            java.lang.String r0 = "onRefreshed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.mm.plugin.multitalk.model.a r8 = r6.f315050g
            boolean r8 = r8.mo150708j()
            if (r8 == 0) goto L_0x001c
            r6.mo150962m()
            com.tencent.mm.plugin.multitalk.ui.widget.CollapseView r8 = r6.f315030I
            r8.mo150911e()
            com.tencent.mm.plugin.multitalk.model.a r8 = r6.f315050g
            r8.mo150703e()
        L_0x001c:
            com.tencent.mm.sdk.platformtools.MTimerHandler r8 = r6.f315043W
            r8.stopTimer()
            com.tencent.mm.sdk.platformtools.MTimerHandler r8 = r6.f315043W
            r0 = 0
            r8.removeCallbacksAndMessages(r0)
            com.tencent.mm.sdk.platformtools.MTimerHandler r8 = r6.f315043W
            r8.quitSafely()
            if (r7 != 0) goto L_0x004e
            com.tencent.mm.plugin.multitalk.ui.widget.a$g r8 = new com.tencent.mm.plugin.multitalk.ui.widget.a$g
            r8.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r8)
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r8 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.g0 r8 = r8.mo150672o()
            android.util.ArrayMap<java.lang.String, java.lang.Integer> r1 = r8.f314612b
            r1.clear()
            r8.f314611a = r0
            java.util.ArrayList<java.lang.String> r1 = r8.f314613c
            if (r1 == 0) goto L_0x004c
            r1.clear()
        L_0x004c:
            r8.f314613c = r0
        L_0x004e:
            com.tencent.mm.plugin.multitalk.model.a r8 = r6.f315050g
            v82.d r1 = r8.f314545i
            if (r1 == 0) goto L_0x00ba
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r1 = r1.f333577e
            if (r1 == 0) goto L_0x00ba
            java.util.Iterator r1 = r1.iterator()
        L_0x005c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ba
            java.lang.Object r2 = r1.next()
            d82.a r2 = (d82.C107025a) r2
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r3 = r2.f320414a
            java.lang.String r3 = r3.f320048d
            java.lang.String r4 = "it.member.usrName"
            gy3.C87412m.m108593f(r3, r4)
            v82.e r3 = r8.mo150704f(r3)
            if (r3 == 0) goto L_0x008e
            com.tencent.mm.sdk.platformtools.MTimerHandler r5 = r3.f333614K
            if (r5 == 0) goto L_0x007e
            r5.quitSafely()
        L_0x007e:
            com.tencent.mm.sdk.platformtools.MTimerHandler r5 = r3.f333614K
            if (r5 == 0) goto L_0x0085
            r5.stopTimer()
        L_0x0085:
            com.tencent.mm.sdk.platformtools.MTimerHandler r5 = r3.f333614K
            if (r5 == 0) goto L_0x008c
            r5.removeCallbacksAndMessages(r0)
        L_0x008c:
            r3.f333614K = r0
        L_0x008e:
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r2 = r2.f320414a
            java.lang.String r2 = r2.f320048d
            gy3.C87412m.m108593f(r2, r4)
            v82.e r2 = r8.mo150704f(r2)
            if (r2 == 0) goto L_0x005c
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r2 = r2.f333625z
            if (r2 == 0) goto L_0x005c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "release it "
            r3.append(r4)
            int r2 = r2.hashCode()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.MultitalkFrameView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            goto L_0x005c
        L_0x00ba:
            r1 = 0
            if (r7 == 0) goto L_0x0101
            v82.e r7 = r8.f314544h
            if (r7 == 0) goto L_0x0101
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r7 = r7.f333625z
            if (r7 == 0) goto L_0x0101
            java.lang.String r7 = r7.getUsername()
            if (r7 == 0) goto L_0x0101
            boolean r2 = r8.mo150708j()
            if (r2 == 0) goto L_0x00d6
            r2 = 3
            r8.mo150710l(r7, r2)
            goto L_0x0101
        L_0x00d6:
            android.widget.FrameLayout r2 = r8.f314541e
            r3 = 1
            if (r2 == 0) goto L_0x00e3
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x00e3
            r2 = 1
            goto L_0x00e4
        L_0x00e3:
            r2 = 0
        L_0x00e4:
            if (r2 == 0) goto L_0x00fb
            v82.e r2 = r8.f314544h
            if (r2 == 0) goto L_0x00f6
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r2 = r2.f333625z
            if (r2 == 0) goto L_0x00f6
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView$b r2 = r2.f314989p
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView$b r4 = com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultitalkFrameView.C105888b.Video
            if (r2 != r4) goto L_0x00f6
            r2 = 1
            goto L_0x00f7
        L_0x00f6:
            r2 = 0
        L_0x00f7:
            if (r2 == 0) goto L_0x00fb
            r2 = 1
            goto L_0x00fc
        L_0x00fb:
            r2 = 0
        L_0x00fc:
            if (r2 == 0) goto L_0x0101
            r8.mo150710l(r7, r3)
        L_0x0101:
            r8.f314544h = r0
            r8.f314545i = r0
            r8.f314542f = r0
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r7 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.z0 r7 = r7.mo150676q()
            r7.mo150845i(r8)
            v82.d r7 = r8.f314545i
            if (r7 == 0) goto L_0x0118
            r7.f333585p = r0
        L_0x0118:
            r8.f314547n = r0
            r8.f314540d = r0
            r8.f314541e = r0
            r8.f314542f = r0
            r8.f314544h = r0
            r8.f314543g = r0
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r7 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.g0 r7 = r7.mo150672o()
            r7.f314611a = r0
            b43.b r7 = r6.f315045Y
            if (r7 == 0) goto L_0x0139
            r7.disable()
            r7.f307669c = r0
            r6.f315045Y = r0
        L_0x0139:
            java.lang.Class<ln.g> r7 = p196ln.C76706g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ln.g r7 = (p196ln.C76706g) r7
            ln.k r7 = r7.mo106826RE()
            com.tencent.mm.modelavatar.AvatarStorage r7 = (com.tencent.p014mm.modelavatar.AvatarStorage) r7
            r7.mo93567p(r6)
            java.lang.String r7 = "multi_talk_config"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)
            java.lang.String r8 = "has_opened_screen_cast"
            boolean r8 = r7.getBoolean(r8, r1)
            if (r8 == 0) goto L_0x015d
            java.lang.String r8 = "has_showed_tip_window"
            r7.putBoolean(r8, r1)
        L_0x015d:
            java.lang.Class<nv.g> r7 = p626nv.C109759g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            nv.g r7 = (p626nv.C109759g) r7
            nv.e r7 = r7.V40()
            u82.a r8 = r6.f315065y
            com.tencent.mm.plugin.newtips.model.l r7 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r7
            r7.mo175776r(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a.mo150960k(boolean, boolean):void");
    }

    /* renamed from: l */
    public final void mo150961l(HashSet<String> hashSet) {
        CopyOnWriteArrayList<C107025a> copyOnWriteArrayList;
        MultitalkFrameView multitalkFrameView;
        C105770a aVar = this.f315050g;
        aVar.getClass();
        C87412m.m108594g(hashSet, "videoUserSet");
        Log.m105925i("AvatarViewManager", "openMemberToVideo, %s", hashSet);
        C111424d dVar = aVar.f314545i;
        if (!(dVar == null || (copyOnWriteArrayList = dVar.f333577e) == null)) {
            Iterator<C107025a> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C107025a next = it.next();
                String str = next.f320414a.f320048d;
                C87412m.m108593f(str, "it.member.usrName");
                C111433e f = aVar.mo150704f(str);
                C13598b0 b0Var = null;
                if (!(f == null || (multitalkFrameView = f.f333625z) == null)) {
                    if (!(!C87412m.m108589b(C75592q0.m90789s(), multitalkFrameView.getUsername()) && !multitalkFrameView.mo150935j())) {
                        multitalkFrameView = null;
                    }
                    if (multitalkFrameView != null) {
                        if (hashSet.contains(multitalkFrameView.getUsername())) {
                            if (multitalkFrameView.f314989p == MultitalkFrameView.C105888b.Avatar) {
                                aVar.mo150710l(multitalkFrameView.getUsername(), 1);
                            }
                        } else {
                            aVar.mo150710l(multitalkFrameView.getUsername(), 0);
                        }
                        b0Var = C13598b0.f38549a;
                    }
                }
                if (b0Var == null) {
                    Log.m105924i("AvatarViewManager", "UI not ready, just init state");
                    if (hashSet.contains(next.f320414a.f320048d) && !C87412m.m108589b(C75592q0.m90789s(), next.f320414a.f320048d)) {
                        ArrayList<String> arrayList = C105851w0.zx0().mo150672o().f314613c;
                        if (!(arrayList != null && arrayList.contains(next.f320414a.f320048d))) {
                            Log.m105924i("AvatarViewManager", "init " + next.f320414a.f320048d + " to VIDEO_SMALL");
                            String str2 = next.f320414a.f320048d;
                            C87412m.m108593f(str2, "it.member.usrName");
                            aVar.mo150710l(str2, 1);
                        }
                    }
                }
            }
        }
        mo150976z(false);
    }

    /* renamed from: m */
    public void mo150962m() {
        View view = this.f315061u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f315059s.setVisibility(0);
        if (C85875k4.m106208w() || C85985z2.m106332d(this.f315047d.getTaskId())) {
            this.f315060t.setVisibility(0);
        }
        if (BuildInfo.IS_ARM64) {
            View view2 = this.f315062v;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!C104331h.m139310a()) {
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(this.f315065y);
                return;
            }
            View view3 = this.f315063w;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: n */
    public final void mo150963n(int i, boolean z) {
        this.f315055o.setVisibility(i);
        if (i == 0) {
            this.f315043W.stopTimer();
            this.f315043W.removeCallbacksAndMessages((Object) null);
            if (z) {
                this.f315043W.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
            this.f315053j.setVisibility(8);
            return;
        }
        this.f315053j.setVisibility(0);
    }

    /* renamed from: o */
    public final void mo150964o() {
        MultiTalkControlIconLayout multiTalkControlIconLayout;
        if (!this.f315034M) {
            this.f315034M = true;
            this.f315030I.setVisibility(0);
            CollapseView collapseView = this.f315030I;
            RelativeLayout relativeLayout = this.f315029H;
            collapseView.getClass();
            Boolean bool = Boolean.TRUE;
            Log.m105925i("MicroMsg.CollapseView", "setCollapseContent, animate:%s, collapseView:%s", bool, relativeLayout);
            if (collapseView.f314967p != null) {
                Log.m105924i("MicroMsg.CollapseView", "setCollapseContent already has collapseView");
            } else {
                if (((ViewGroup) relativeLayout.getParent()) != null) {
                    ((ViewGroup) relativeLayout.getParent()).removeView(relativeLayout);
                }
                collapseView.f314967p = relativeLayout;
                collapseView.f314962h.addView(relativeLayout);
                ImageButton imageButton = (ImageButton) relativeLayout.findViewById(C0966R.C0970id.kfp);
                collapseView.f314970s = imageButton;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageButton.getLayoutParams();
                int i = C111418b0.f333554o;
                layoutParams.width = i;
                layoutParams.height = i;
                layoutParams.bottomMargin = C111418b0.f333547h;
                collapseView.f314970s.setLayoutParams(layoutParams);
            }
            CollapseView collapseView2 = this.f315030I;
            ConstraintLayout constraintLayout = this.f315028G;
            int height = this.f315047d.mo150869H7().findViewById(C0966R.C0970id.kfo).getHeight();
            collapseView2.getClass();
            Log.m105925i("MicroMsg.CollapseView", "setContent animate:%s, controlView:%s, height:%s", bool, constraintLayout, Integer.valueOf(height));
            if (collapseView2.f314966o != null) {
                Log.m105924i("MicroMsg.CollapseView", "setContent already have content layout");
            } else {
                if (constraintLayout.getParent() != null) {
                    ((ViewGroup) constraintLayout.getParent()).removeView(constraintLayout);
                }
                collapseView2.f314966o = constraintLayout;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 17;
                collapseView2.f314963i.addView(collapseView2.f314966o, layoutParams2);
                collapseView2.f314963i.setVisibility(0);
                collapseView2.f314963i.setVisibility(0);
                collapseView2.setAlpha(0.0f);
                collapseView2.f314961g.setAlpha(0.0f);
                collapseView2.animate().alpha(1.0f).setDuration(500).setListener(new C111453i(collapseView2));
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f315049f.getLayoutParams();
            int i2 = this.f315037Q;
            int i3 = this.f315024C;
            if (i2 > i3) {
                layoutParams3.height = ((i3 / 3) * 5) + C76577a.m92151b(this.f315047d, 52) + C85875k4.m106198o(this.f315047d);
            } else {
                layoutParams3.height = ((i2 / 3) * 5) + C85875k4.m106198o(this.f315047d);
            }
            this.f315049f.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f315030I.findViewById(C0966R.C0970id.iwe).getLayoutParams();
            layoutParams4.bottomMargin = C75044y4.m89991c(this.f315047d);
            this.f315030I.findViewById(C0966R.C0970id.iwe).setLayoutParams(layoutParams4);
            if (C105851w0.zx0().mo150683y() && (multiTalkControlIconLayout = this.f315066z) != null && !multiTalkControlIconLayout.mo96157a()) {
                C105851w0.zx0().mo150655c0(1, C105851w0.zx0().f314498j);
            }
        }
        TextView textView = this.f315056p;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.f315057q;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        CollapseView collapseView3 = this.f315030I;
        this.f315056p = collapseView3.f314964j;
        ImageView imageView2 = collapseView3.f314965n;
        this.f315057q = imageView2;
        imageView2.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_arrow, -1));
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f315046Z) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == C0966R.C0970id.kfp) {
            C105851w0.zx0().mo150660f(true, false);
            Context context = view.getContext();
            if (context != null && !((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(context)) {
                C119179t tVar = C119157j.f356862d;
                C105896a aVar = new C105896a(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, 2000, false);
            }
        } else if (view.getId() == C0966R.C0970id.h4f) {
            if (this.f315050g.mo150708j()) {
                mo150962m();
                this.f315030I.mo150911e();
                this.f315050g.mo150703e();
                mo150976z(true);
            } else {
                C105853x.f314823a++;
                C105851w0.zx0().mo150626C(true);
                C105853x.m142230a(8);
            }
        } else if (view.getId() == C0966R.C0970id.h46) {
            C105851w0.vx0().mo150807a();
            C105851w0.vx0().getClass();
            C105853x.m142230a(7);
            mo150974x();
        } else if (view.getId() == C0966R.C0970id.f358791h41) {
            C105853x.f314827e++;
            MultiTalkMainUI multiTalkMainUI = this.f315047d;
            if (!multiTalkMainUI.f314904x) {
                multiTalkMainUI.f314904x = true;
                Intent intent = new Intent(multiTalkMainUI, MultiTalkAddMembersUI.class);
                ArrayList arrayList2 = new ArrayList();
                if (C105851w0.zx0().f314506t != null) {
                    for (MultiTalkGroupMember next : C105851w0.zx0().f314506t.f320047i) {
                        int i = next.f320050f;
                        if (i == 10 || i == 1) {
                            arrayList2.add(next.f320048d);
                        }
                    }
                    intent.putExtra("titile", multiTalkMainUI.getString(C0966R.string.gyh));
                    intent.putExtra("chatroomName", C105851w0.zx0().f314506t.f320044f);
                    intent.putExtra("always_select_contact", Util.listToString(arrayList2, ","));
                    intent.putExtra("key_need_gallery", false);
                    multiTalkMainUI.startActivityForResult(intent, 1);
                }
            }
        } else if (view.getId() == C0966R.C0970id.h4u) {
            C104328f fVar = C104328f.f308805a;
            C104328f.f308808d = System.currentTimeMillis();
            fVar.mo146025b(1, 1);
            if (!C104331h.m139310a()) {
                if (this.f315063w.getVisibility() != 0) {
                    C101218e0 e0Var = new C101218e0(this.f315047d, 2, 3, false);
                    e0Var.mo140677w(this.f315047d.getResources().getString(C0966R.string.f8028zq));
                    e0Var.mo140676v(1);
                    e0Var.mo140678x(Color.parseColor("#07C160"));
                    e0Var.mo140662i(C0966R.C0971layout.bur);
                    e0Var.f296375F = new C105897b(e0Var);
                    e0Var.mo140655A();
                } else {
                    View view2 = this.f315063w;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C101218e0 e0Var2 = new C101218e0(this.f315047d, 1, 3, false);
                    e0Var2.mo140667n(this.f315047d.getResources().getString(C0966R.string.f7926wf), this.f315047d.getResources().getString(C0966R.string.ifi));
                    e0Var2.mo140675u(Color.parseColor("#07C160"));
                    e0Var2.mo140668o(0);
                    e0Var2.mo140662i(C0966R.C0971layout.bur);
                    C105898c cVar = new C105898c(this, e0Var2);
                    C105899d dVar = new C105899d(e0Var2);
                    e0Var2.f296373D = cVar;
                    e0Var2.f296374E = dVar;
                    e0Var2.mo140655A();
                }
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(35);
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv_screen_project_info");
                C87412m.m108593f(mmkv, "getMMKV(KV_NAME)");
                mmkv.putBoolean("screen_project_has_been_educated", true);
            } else {
                C105853x.f314828f++;
                if (C105851w0.zx0().f314506t != null) {
                    String str = C105851w0.zx0().f314506t.f320042d;
                }
                Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
                C115669n.INSTANCE.mo175913w(1538, 0, 1);
                this.f315047d.mo150870I7();
            }
        } else if (view.getId() == C0966R.C0970id.amh) {
            C85878m2.m106216e(this.f315047d.getTaskId(), new C105900e());
            this.f315047d.f314901u = true;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: p */
    public void mo150966p(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f315047d.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (((float) displayMetrics.heightPixels) / displayMetrics.density <= 540.0f) {
            MultiTalkMainUI multiTalkMainUI = this.f315047d;
            C76912y0.m92774m(multiTalkMainUI, multiTalkMainUI.getString(C0966R.string.keq));
        } else if (this.f315056p != null) {
            if (this.f315047d.findViewById(C0966R.C0970id.has) != null) {
                this.f315047d.findViewById(C0966R.C0970id.has).setOnClickListener((View.OnClickListener) null);
            }
            CollapseView collapseView = this.f315030I;
            if (collapseView != null) {
                collapseView.setLinkToAutoMobileListener((CollapseView.C69859c) null);
            }
            if (this.f315034M) {
                this.f315030I.setLinkToAutoMobileListener(new C69864b(this));
            } else if (this.f315047d.findViewById(C0966R.C0970id.has) != null) {
                this.f315047d.findViewById(C0966R.C0970id.has).setOnClickListener(new C78366i1(this));
            }
            this.f315057q.setVisibility(0);
            this.f315056p.setVisibility(0);
            this.f315056p.setText(C0966R.string.keq);
            MultiTalkMainUI multiTalkMainUI2 = this.f315047d;
            multiTalkMainUI2.f314895o.removeCallbacks(this.f315042V);
            MultiTalkMainUI multiTalkMainUI3 = this.f315047d;
            multiTalkMainUI3.f314895o.postDelayed(this.f315042V, (long) (i * 1000));
        }
    }

    /* renamed from: q */
    public void mo150967q(int i) {
        boolean z;
        if (C105724z.INSTANCE.f314414t < 3600 || C105724z.f314341E1) {
            z = false;
        } else {
            z = true;
            C105724z.f314341E1 = true;
        }
        if (z) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) this.f315047d.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if (((float) displayMetrics.heightPixels) / displayMetrics.density <= 540.0f) {
                MultiTalkMainUI multiTalkMainUI = this.f315047d;
                C76912y0.m92774m(multiTalkMainUI, multiTalkMainUI.getString(C0966R.string.kem));
                return;
            }
            if (this.f315047d.findViewById(C0966R.C0970id.has) != null) {
                this.f315047d.findViewById(C0966R.C0970id.has).setOnClickListener((View.OnClickListener) null);
            }
            CollapseView collapseView = this.f315030I;
            if (collapseView != null) {
                collapseView.setLinkToAutoMobileListener((CollapseView.C69859c) null);
            }
            if (this.f315034M) {
                this.f315030I.setLinkToAutoMobileListener(new C69861m());
            } else if (this.f315047d.findViewById(C0966R.C0970id.has) != null) {
                this.f315047d.findViewById(C0966R.C0970id.has).setOnClickListener(new C69862n());
            }
            this.f315057q.setVisibility(8);
            this.f315056p.setVisibility(0);
            this.f315056p.setText(C0966R.string.kem);
            MultiTalkMainUI multiTalkMainUI2 = this.f315047d;
            multiTalkMainUI2.f314895o.removeCallbacks(this.f315042V);
            MultiTalkMainUI multiTalkMainUI3 = this.f315047d;
            multiTalkMainUI3.f314895o.postDelayed(this.f315042V, (long) (i * 1000));
        }
    }

    /* renamed from: r */
    public void mo150968r(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            mo150963n(8, z);
            return;
        }
        this.f315055o.setText(str);
        mo150963n(0, z);
    }

    /* renamed from: s */
    public void mo150969s() {
        if (!this.f315035N) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation2.setDuration(150);
            this.f315035N = true;
            this.f315054n.setAnimation(alphaAnimation);
            View view = this.f315054n;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f315048e.setAnimation(alphaAnimation);
            View view3 = this.f315048e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f315030I.setAnimation(alphaAnimation2);
            this.f315030I.setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027d, code lost:
        if ((r10 != null && r10.contains(r12.f320048d)) != false) goto L_0x027f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0386 A[SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo150970t(com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup r22, boolean r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            if (r0 == 0) goto L_0x0481
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List<com.tencent.pb.talkroom.sdk.MultiTalkGroupMember> r4 = r0.f320047i
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = r5
        L_0x0018:
            boolean r7 = r4.hasNext()
            r8 = -1
            r9 = 1
            if (r7 == 0) goto L_0x0051
            java.lang.Object r7 = r4.next()
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r7 = (com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember) r7
            int r10 = r7.f320050f
            r11 = 10
            if (r10 == r11) goto L_0x002e
            if (r10 != r9) goto L_0x0018
        L_0x002e:
            java.lang.String r9 = r7.f320048d
            java.lang.String r10 = eb0.C75592q0.m90789s()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x004f
            java.lang.String r9 = r7.f320048d
            int r9 = c92.C104331h.m139311c(r9)
            if (r9 != r8) goto L_0x0046
            r3.add(r7)
            goto L_0x0018
        L_0x0046:
            com.tencent.mm.plugin.multitalk.ui.widget.a$p r8 = new com.tencent.mm.plugin.multitalk.ui.widget.a$p
            r8.<init>(r1, r7, r9)
            r2.add(r8)
            goto L_0x0018
        L_0x004f:
            r6 = r7
            goto L_0x0018
        L_0x0051:
            if (r6 == 0) goto L_0x0056
            r3.add(r6)
        L_0x0056:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r2.size()
            int r6 = r6 - r9
        L_0x0060:
            r7 = 0
            if (r6 < 0) goto L_0x0086
            java.lang.String r10 = "MicroMsg.MT.MultiTalkTalkingUILogic"
            java.lang.String r11 = "memberis is %s"
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Object r13 = r2.get(r6)
            com.tencent.mm.plugin.multitalk.ui.widget.a$p r13 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a.C105908p) r13
            int r13 = r13.f315082e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r7] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)
            java.lang.Object r7 = r2.get(r6)
            com.tencent.mm.plugin.multitalk.ui.widget.a$p r7 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a.C105908p) r7
            r4.add(r7)
            int r6 = r6 + -1
            goto L_0x0060
        L_0x0086:
            java.util.Comparator r2 = java.util.Collections.reverseOrder()
            java.util.Collections.sort(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r6 = r4.size()
            int r6 = r6 - r9
        L_0x0097:
            if (r6 < 0) goto L_0x00be
            java.lang.String r10 = "MicroMsg.MT.MultiTalkTalkingUILogic"
            java.lang.String r11 = "memberis is %s"
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Object r13 = r4.get(r6)
            com.tencent.mm.plugin.multitalk.ui.widget.a$p r13 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a.C105908p) r13
            int r13 = r13.f315082e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r7] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)
            java.lang.Object r10 = r4.get(r6)
            com.tencent.mm.plugin.multitalk.ui.widget.a$p r10 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a.C105908p) r10
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r10 = r10.f315081d
            r2.add(r10)
            int r6 = r6 + -1
            goto L_0x0097
        L_0x00be:
            com.tencent.mm.plugin.multitalk.ui.widget.CollapseView r4 = r1.f315030I
            if (r4 == 0) goto L_0x00d7
            java.lang.String r4 = com.tencent.p014mm.plugin.multitalk.model.C105806i0.m142152e(r22)
            java.lang.String r6 = r0.f320043e
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x00d7
            com.tencent.mm.plugin.multitalk.ui.widget.CollapseView r4 = r1.f315030I
            java.lang.String r0 = com.tencent.p014mm.plugin.multitalk.model.C105806i0.m142152e(r22)
            r4.setRoomKey(r0)
        L_0x00d7:
            r2.addAll(r3)
            int r0 = r2.size()
            r3 = 5
            if (r0 >= r3) goto L_0x00e3
            r3 = 2
            goto L_0x00e4
        L_0x00e3:
            r3 = 3
        L_0x00e4:
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r10 = r1.f315047d
            android.view.ViewGroup r10 = r10.mo150869H7()
            if (r10 == 0) goto L_0x011e
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r10 = r1.f315047d
            android.view.ViewGroup r10 = r10.mo150869H7()
            r11 = 2131312648(0x7f094008, float:1.824367E38)
            android.view.View r10 = r10.findViewById(r11)
            if (r10 == 0) goto L_0x011e
            java.lang.String r10 = "MicroMsg.MT.MultiTalkTalkingUILogic"
            java.lang.String r12 = "inflateLineUser"
            java.lang.Object[] r13 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r10, r12, r13)
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams
            r10.<init>(r8, r8)
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r12 = r1.f315047d
            int r12 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r12)
            r10.bottomMargin = r12
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r12 = r1.f315047d
            android.view.ViewGroup r12 = r12.mo150869H7()
            android.view.View r11 = r12.findViewById(r11)
            r11.setLayoutParams(r10)
        L_0x011e:
            androidx.recyclerview.widget.RecyclerView r10 = r1.f315049f
            r10.removeAllViewsInLayout()
            r10 = 9
            if (r0 > r10) goto L_0x01cd
            boolean r10 = r1.f315034M
            if (r10 == 0) goto L_0x012d
            goto L_0x01cd
        L_0x012d:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f315028G
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0142
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f315028G
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.constraintlayout.widget.ConstraintLayout r10 = r1.f315028G
            r0.removeView(r10)
        L_0x0142:
            android.widget.RelativeLayout r0 = r1.f315029H
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0157
            android.widget.RelativeLayout r0 = r1.f315029H
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.widget.RelativeLayout r10 = r1.f315029H
            r0.removeView(r10)
        L_0x0157:
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r0 = r1.f315047d
            r10 = 2131314931(0x7f0948f3, float:1.82483E38)
            android.view.View r0 = r0.findViewById(r10)
            if (r0 == 0) goto L_0x017f
            android.view.ViewGroup$LayoutParams r10 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r10 = (android.widget.RelativeLayout.LayoutParams) r10
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r11 = r1.f315047d
            int r11 = kg3.C76577a.m92159j(r11)
            double r11 = (double) r11
            r13 = 4615288898129284301(0x400ccccccccccccd, double:3.6)
            double r11 = r11 * r13
            r13 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r11 = r11 / r13
            int r11 = (int) r11
            r10.bottomMargin = r11
            r0.setLayoutParams(r10)
        L_0x017f:
            com.tencent.mm.plugin.multitalk.ui.widget.CollapseView r0 = r1.f315030I
            r10 = 4
            r0.setVisibility(r10)
            android.widget.RelativeLayout r0 = r1.f315026E
            if (r0 == 0) goto L_0x019b
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r10 = -2
            r0.<init>(r8, r10)
            r10 = 13
            r0.addRule(r10)
            android.widget.RelativeLayout r10 = r1.f315026E
            androidx.constraintlayout.widget.ConstraintLayout r11 = r1.f315028G
            r10.addView(r11, r0)
        L_0x019b:
            android.widget.RelativeLayout r0 = r1.f315027F
            android.widget.RelativeLayout r10 = r1.f315029H
            r0.addView(r10)
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r0 = r1.f315047d
            r10 = 2131316513(0x7f094f21, float:1.825151E38)
            android.view.View r0 = r0.findViewById(r10)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f315056p = r0
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r0 = r1.f315047d
            r10 = 2131307322(0x7f092b3a, float:1.8232868E38)
            android.view.View r0 = r0.findViewById(r10)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f315057q = r0
            if (r0 == 0) goto L_0x01f5
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r11 = 2131755951(0x7f1003af, float:1.9142796E38)
            android.graphics.drawable.Drawable r8 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r10, r11, r8)
            r0.setImageDrawable(r8)
            goto L_0x01f5
        L_0x01cd:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r8 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r8 = r8.f314508v
            if (r8 != 0) goto L_0x01f2
            r8 = 12
            if (r0 <= r8) goto L_0x01f2
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            r0.f314508v = r9
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r0 = r1.f315047d
            android.content.res.Resources r8 = r0.getResources()
            r10 = 2131833239(0x7f113197, float:1.9299554E38)
            java.lang.String r8 = r8.getString(r10)
            r10 = 2131756715(0x7f1006ab, float:1.9144345E38)
            nj3.C76912y0.m92769h(r0, r8, r10)
        L_0x01f2:
            r21.mo150964o()
        L_0x01f5:
            androidx.recyclerview.widget.GridLayoutManager r0 = r1.f315051h
            r0.mo16940i0(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r1.f315049f
            androidx.recyclerview.widget.GridLayoutManager r3 = r1.f315051h
            r0.setLayoutManager(r3)
            java.util.HashSet r0 = new java.util.HashSet
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            java.util.HashSet<java.lang.String> r3 = r3.f314503q
            r0.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r8 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.g0 r8 = r8.mo150672o()
            java.util.ArrayList<java.lang.String> r8 = r8.f314613c
            if (r8 == 0) goto L_0x021b
            goto L_0x0220
        L_0x021b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0220:
            r3.<init>(r8)
            androidx.recyclerview.widget.RecyclerView r8 = r1.f315049f
            androidx.recyclerview.widget.RecyclerView$e r8 = r8.getAdapter()
            v82.d r8 = (v82.C111424d) r8
            if (r8 == 0) goto L_0x032a
            r8.f333578f = r7
            r8.f333579g = r0
            r8.f333580h = r3
            com.tencent.mm.plugin.multitalk.model.a r3 = r1.f315050g
            java.lang.Class<f62.k0> r16 = f62.C75700k0.class
            monitor-enter(r8)
            java.lang.String r10 = "clickListener"
            gy3.C87412m.m108594g(r3, r10)     // Catch:{ all -> 0x0327 }
            java.util.concurrent.CopyOnWriteArrayList r15 = new java.util.concurrent.CopyOnWriteArrayList     // Catch:{ all -> 0x0327 }
            r15.<init>()     // Catch:{ all -> 0x0327 }
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ all -> 0x0327 }
            r14.<init>()     // Catch:{ all -> 0x0327 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0327 }
            r13 = 0
        L_0x024c:
            boolean r10 = r2.hasNext()     // Catch:{ all -> 0x0327 }
            if (r10 == 0) goto L_0x030b
            java.lang.Object r10 = r2.next()     // Catch:{ all -> 0x0327 }
            int r17 = r13 + 1
            if (r13 < 0) goto L_0x0307
            r12 = r10
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r12 = (com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember) r12     // Catch:{ all -> 0x0327 }
            java.util.HashSet<java.lang.String> r10 = r8.f333579g     // Catch:{ all -> 0x0327 }
            if (r10 == 0) goto L_0x026b
            java.lang.String r11 = r12.f320048d     // Catch:{ all -> 0x0327 }
            boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x0327 }
            if (r10 != r9) goto L_0x026b
            r10 = 1
            goto L_0x026c
        L_0x026b:
            r10 = 0
        L_0x026c:
            if (r10 != 0) goto L_0x027f
            java.util.ArrayList<java.lang.String> r10 = r8.f333580h     // Catch:{ all -> 0x0327 }
            if (r10 == 0) goto L_0x027c
            java.lang.String r11 = r12.f320048d     // Catch:{ all -> 0x0327 }
            boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x0327 }
            if (r10 != r9) goto L_0x027c
            r10 = 1
            goto L_0x027d
        L_0x027c:
            r10 = 0
        L_0x027d:
            if (r10 == 0) goto L_0x02b8
        L_0x027f:
            boolean r10 = r8.f333578f     // Catch:{ all -> 0x0327 }
            if (r10 != 0) goto L_0x02b8
            k40.a r10 = f40.C86709a0.m107533q(r16)     // Catch:{ all -> 0x0327 }
            f62.k0 r10 = (f62.C75700k0) r10     // Catch:{ all -> 0x0327 }
            com.tencent.mm.storage.u3 r10 = r10.mo96097Ni()     // Catch:{ all -> 0x0327 }
            java.lang.String r11 = r12.f320048d     // Catch:{ all -> 0x0327 }
            com.tencent.mm.storage.z1 r10 = r10.get(r11)     // Catch:{ all -> 0x0327 }
            d82.a r18 = new d82.a     // Catch:{ all -> 0x0327 }
            r19 = 1
            if (r10 == 0) goto L_0x029f
            java.lang.String r10 = r10.mo62909j3()     // Catch:{ all -> 0x0327 }
            if (r10 != 0) goto L_0x02a1
        L_0x029f:
            java.lang.String r10 = r12.f320048d     // Catch:{ all -> 0x0327 }
        L_0x02a1:
            r11 = r10
            java.lang.String r10 = "contact?.displayNick?:member.usrName"
            gy3.C87412m.m108593f(r11, r10)     // Catch:{ all -> 0x0327 }
            r10 = r18
            r20 = r11
            r11 = r12
            r7 = r12
            r12 = r3
            r4 = r14
            r14 = r19
            r6 = r15
            r15 = r20
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0327 }
            goto L_0x02e5
        L_0x02b8:
            r7 = r12
            r4 = r14
            r6 = r15
            k40.a r10 = f40.C86709a0.m107533q(r16)     // Catch:{ all -> 0x0327 }
            f62.k0 r10 = (f62.C75700k0) r10     // Catch:{ all -> 0x0327 }
            com.tencent.mm.storage.u3 r10 = r10.mo96097Ni()     // Catch:{ all -> 0x0327 }
            java.lang.String r11 = r7.f320048d     // Catch:{ all -> 0x0327 }
            com.tencent.mm.storage.z1 r10 = r10.get(r11)     // Catch:{ all -> 0x0327 }
            d82.a r18 = new d82.a     // Catch:{ all -> 0x0327 }
            r14 = 0
            if (r10 == 0) goto L_0x02d6
            java.lang.String r10 = r10.mo62909j3()     // Catch:{ all -> 0x0327 }
            if (r10 != 0) goto L_0x02d8
        L_0x02d6:
            java.lang.String r10 = r7.f320048d     // Catch:{ all -> 0x0327 }
        L_0x02d8:
            r15 = r10
            java.lang.String r10 = "contact?.displayNick?:member.usrName"
            gy3.C87412m.m108593f(r15, r10)     // Catch:{ all -> 0x0327 }
            r10 = r18
            r11 = r7
            r12 = r3
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0327 }
        L_0x02e5:
            r10 = r18
            java.util.HashSet<java.lang.String> r11 = r8.f333581i     // Catch:{ all -> 0x0327 }
            if (r11 == 0) goto L_0x02f5
            java.lang.String r12 = r7.f320048d     // Catch:{ all -> 0x0327 }
            boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x0327 }
            if (r11 != r9) goto L_0x02f5
            r11 = 1
            goto L_0x02f6
        L_0x02f5:
            r11 = 0
        L_0x02f6:
            if (r11 == 0) goto L_0x02fd
            java.lang.String r7 = r7.f320048d     // Catch:{ all -> 0x0327 }
            r4.add(r7)     // Catch:{ all -> 0x0327 }
        L_0x02fd:
            r6.add(r10)     // Catch:{ all -> 0x0327 }
            r14 = r4
            r15 = r6
            r13 = r17
            r7 = 0
            goto L_0x024c
        L_0x0307:
            sx3.C64197v.m75542k()     // Catch:{ all -> 0x0327 }
            throw r5     // Catch:{ all -> 0x0327 }
        L_0x030b:
            r4 = r14
            r6 = r15
            r8.f333581i = r4     // Catch:{ all -> 0x0327 }
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r2 = r8.f333577e     // Catch:{ all -> 0x0327 }
            monitor-enter(r2)     // Catch:{ all -> 0x0327 }
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r3 = r8.f333577e     // Catch:{ all -> 0x0324 }
            r3.clear()     // Catch:{ all -> 0x0324 }
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r3 = r8.f333577e     // Catch:{ all -> 0x0324 }
            r3.addAll(r6)     // Catch:{ all -> 0x0324 }
            r8.notifyDataSetChanged()     // Catch:{ all -> 0x0324 }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0324 }
            monitor-exit(r2)     // Catch:{ all -> 0x0327 }
            monitor-exit(r8)
            goto L_0x032a
        L_0x0324:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0327 }
            throw r0     // Catch:{ all -> 0x0327 }
        L_0x0327:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x032a:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r2 = r2.mo150683y()
            if (r2 == 0) goto L_0x034b
            com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout r2 = r1.f315066z
            if (r2 == 0) goto L_0x034b
            boolean r2 = r2.mo96157a()
            if (r2 != 0) goto L_0x034b
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r3 = r3.f314498j
            r2.mo150655c0(r9, r3)
        L_0x034b:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            int r2 = r2.f314496h
            if (r2 == r9) goto L_0x0359
            r3 = 3
            if (r2 != r3) goto L_0x0357
            goto L_0x0359
        L_0x0357:
            r2 = 0
            goto L_0x035a
        L_0x0359:
            r2 = 1
        L_0x035a:
            if (r2 == 0) goto L_0x0481
            if (r23 == 0) goto L_0x047d
            com.tencent.mm.plugin.multitalk.model.a r2 = r1.f315050g
            r2.getClass()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            v82.d r4 = r2.f314545i
            if (r4 == 0) goto L_0x0370
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r4 = r4.f333577e
            goto L_0x0371
        L_0x0370:
            r4 = r5
        L_0x0371:
            r3[r9] = r4
            java.lang.String r4 = "AvatarViewManager"
            java.lang.String r6 = "openMemberToVideo, %s,%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
            v82.d r3 = r2.f314545i
            if (r3 == 0) goto L_0x047d
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r3 = r3.f333577e
            if (r3 == 0) goto L_0x047d
            java.util.Iterator r3 = r3.iterator()
        L_0x0386:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x047d
            java.lang.Object r6 = r3.next()
            d82.a r6 = (d82.C107025a) r6
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r7 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.g0 r7 = r7.mo150672o()
            java.util.ArrayList<java.lang.String> r7 = r7.f314613c
            if (r7 == 0) goto L_0x03aa
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r8 = r6.f320414a
            java.lang.String r8 = r8.f320048d
            boolean r7 = r7.contains(r8)
            if (r7 != r9) goto L_0x03aa
            r7 = 1
            goto L_0x03ab
        L_0x03aa:
            r7 = 0
        L_0x03ab:
            java.lang.String r8 = "init "
            java.lang.String r10 = "it.member.usrName"
            if (r7 == 0) goto L_0x03d8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r8 = r6.f320414a
            java.lang.String r8 = r8.f320048d
            r7.append(r8)
            java.lang.String r8 = " to SCREEN_CAST_SMALL"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r7 = r6.f320414a
            java.lang.String r7 = r7.f320048d
            gy3.C87412m.m108593f(r7, r10)
            r11 = 3
            r2.mo150710l(r7, r11)
            goto L_0x0414
        L_0x03d8:
            r11 = 3
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r7 = r6.f320414a
            java.lang.String r7 = r7.f320048d
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto L_0x0409
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r8 = r6.f320414a
            java.lang.String r8 = r8.f320048d
            r7.append(r8)
            java.lang.String r8 = " to VIDEO_SMALL"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r7 = r6.f320414a
            java.lang.String r7 = r7.f320048d
            gy3.C87412m.m108593f(r7, r10)
            r2.mo150710l(r7, r9)
            goto L_0x0414
        L_0x0409:
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r7 = r6.f320414a
            java.lang.String r7 = r7.f320048d
            gy3.C87412m.m108593f(r7, r10)
            r8 = 0
            r2.mo150710l(r7, r8)
        L_0x0414:
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r7 = r6.f320414a
            java.lang.String r7 = r7.f320048d
            gy3.C87412m.m108593f(r7, r10)
            v82.e r7 = r2.mo150704f(r7)
            if (r7 == 0) goto L_0x046a
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r7 = r7.f333625z
            if (r7 == 0) goto L_0x046a
            java.lang.String r8 = eb0.C75592q0.m90789s()
            java.lang.String r10 = r7.getUsername()
            boolean r8 = gy3.C87412m.m108589b(r8, r10)
            if (r8 != 0) goto L_0x043b
            boolean r8 = r7.mo150935j()
            if (r8 != 0) goto L_0x043b
            r8 = 1
            goto L_0x043c
        L_0x043b:
            r8 = 0
        L_0x043c:
            if (r8 == 0) goto L_0x043f
            goto L_0x0440
        L_0x043f:
            r7 = r5
        L_0x0440:
            if (r7 == 0) goto L_0x046a
            java.lang.String r8 = r7.getUsername()
            boolean r8 = r0.contains(r8)
            if (r8 == 0) goto L_0x045f
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView$b r8 = r7.f314989p
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView$b r10 = com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultitalkFrameView.C105888b.Avatar
            if (r8 != r10) goto L_0x0454
            r8 = 1
            goto L_0x0455
        L_0x0454:
            r8 = 0
        L_0x0455:
            if (r8 == 0) goto L_0x0467
            java.lang.String r7 = r7.getUsername()
            r2.mo150710l(r7, r9)
            goto L_0x0467
        L_0x045f:
            java.lang.String r7 = r7.getUsername()
            r8 = 0
            r2.mo150710l(r7, r8)
        L_0x0467:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x046b
        L_0x046a:
            r7 = r5
        L_0x046b:
            if (r7 != 0) goto L_0x0386
            java.lang.Object[] r7 = new java.lang.Object[r9]
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r6 = r6.f320414a
            java.lang.String r6 = r6.f320048d
            r8 = 0
            r7[r8] = r6
            java.lang.String r6 = "UI not ready, just init state user name is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r7)
            goto L_0x0386
        L_0x047d:
            r8 = 0
            r1.mo150976z(r8)
        L_0x0481:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a.mo150970t(com.tencent.pb.talkroom.sdk.MultiTalkGroup, boolean):void");
    }

    /* renamed from: u */
    public void mo150971u(boolean z) {
        if (!z) {
            this.f315044X = System.currentTimeMillis();
        }
        Log.m105924i("MicroMsg.MT.MultiTalkTalkingUILogic", "start capture render");
        C105825p vx02 = C105851w0.vx0();
        vx02.getClass();
        C105825p.m142196h(vx02, false, 1, (Object) null);
        if (this.f315045Y == null) {
            this.f315045Y = new C104032b(this);
        }
        C105851w0.vx0().getClass();
    }

    /* renamed from: v */
    public void mo150972v(boolean z) {
        if (!z && this.f315044X != 0 && System.currentTimeMillis() - this.f315044X > 0 && C105851w0.zx0().mo150684z()) {
            long currentTimeMillis = System.currentTimeMillis() - this.f315044X;
            String e = C105806i0.m142152e(C105851w0.zx0().f314506t);
            long j = currentTimeMillis > 1000 ? currentTimeMillis / 1000 : 1;
            Log.m105927v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkVideoDuration %d %s", Long.valueOf(j), e);
            C115669n.INSTANCE.mo160131h(12728, Long.valueOf(j), e);
            this.f315044X = 0;
        }
        if (!z) {
            C105851w0.vx0().mo150813i(true);
        }
    }

    /* renamed from: w */
    public final void mo150973w(Boolean bool) {
        if (bool.booleanValue()) {
            this.f315059s.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_back, -1));
            this.f315059s.setIconColor(-1);
            this.f315054n.getLayoutParams().height = C76577a.m92151b(this.f315047d, 52) + C85875k4.m106198o(this.f315047d);
            this.f315054n.setBackgroundColor(this.f315047d.getResources().getColor(C0966R.color.f3285m7));
            this.f315053j.setVisibility(4);
            View view = this.f315061u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f315062v;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f315059s.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_outlined_mini_windows_new, -1));
        this.f315059s.setIconColor(-1);
        ViewGroup.LayoutParams layoutParams = this.f315054n.getLayoutParams();
        MultiTalkMainUI multiTalkMainUI = this.f315047d;
        layoutParams.height = C76577a.m92150a(multiTalkMainUI, multiTalkMainUI.getResources().getDimension(C0966R.dimen.afw));
        this.f315054n.setBackground(this.f315047d.getResources().getDrawable(C0966R.C0969drawable.ai_));
        this.f315053j.setVisibility(0);
        View view4 = this.f315061u;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (BuildInfo.IS_ARM64) {
            View view5 = this.f315062v;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!C104331h.m139310a()) {
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(this.f315065y);
                return;
            }
            View view7 = this.f315063w;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view9 = this.f315062v;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        View view10 = view9;
        C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view10, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view11 = this.f315063w;
        C9556a aVar7 = new C9556a();
        aVar7.mo10233c(8);
        View view12 = view11;
        C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
        C117292a.m165359e(view12, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: x */
    public final void mo150974x() {
        if (C105851w0.vx0().mo150810e()) {
            this.f315064x.setContentDescription(this.f315047d.getString(C0966R.string.gzb));
        } else {
            this.f315064x.setContentDescription(this.f315047d.getString(C0966R.string.gyj));
        }
    }

    /* renamed from: y */
    public final void mo150975y() {
        if (this.f315023B.isEnabled()) {
            MultiTalkManager zx02 = C105851w0.zx0();
            boolean a = this.f315023B.mo96157a();
            zx02.getClass();
            Log.printInfoStack("MicroMsg.MT.MultiTalkManager", "setHandsFreeUIStatus: %s", Boolean.valueOf(a));
            zx02.f314495g = a;
        }
    }

    /* renamed from: z */
    public void mo150976z(boolean z) {
        ArrayList<Integer> arrayList;
        ArrayList<Integer> arrayList2;
        MultitalkFrameView multitalkFrameView;
        boolean v = C105851w0.zx0().mo150680v();
        if (this.f315049f.getAdapter() != null && this.f315051h != null) {
            ArrayList<Integer> arrayList3 = new ArrayList<>();
            ArrayList<Integer> arrayList4 = new ArrayList<>();
            arrayList3.clear();
            arrayList4.clear();
            C111424d dVar = (C111424d) this.f315049f.getAdapter();
            int z2 = this.f315051h.mo17004z();
            int i = z2 == 0 ? 0 : z2 - dVar.f333583n;
            int D = (this.f315051h.mo16958D() - dVar.f333583n) - dVar.f333584o;
            boolean z3 = true;
            if (i >= 0 && D >= 0) {
                while (i <= D) {
                    C111433e f = this.f315050g.mo150704f(dVar.f333577e.get(i).f320414a.f320048d);
                    if (!(f == null || (multitalkFrameView = f.f333625z) == null)) {
                        if ((multitalkFrameView.f314989p == MultitalkFrameView.C105888b.Video) || multitalkFrameView.mo150935j()) {
                            int c = C104331h.m139311c(f.f333625z.getUsername());
                            arrayList3.add(Integer.valueOf(c));
                            if (v) {
                                int p = C105724z.INSTANCE.mo150606p(c);
                                arrayList4.add(Integer.valueOf((p == 102 || p == 101) ? 1 : 0));
                            }
                            Log.m105925i("MicroMsg.MT.MultiTalkTalkingUILogic", "memberIds is %s", Integer.valueOf(c));
                        }
                    }
                    i++;
                }
                if (!v) {
                    mo150954e(arrayList3);
                }
            } else if (this.f315049f.getAdapter() != null) {
                Iterator<C107025a> it = ((C111424d) this.f315049f.getAdapter()).f333577e.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    C107025a next = it.next();
                    if (next.f320417d && i2 < this.f315036P) {
                        int c2 = C104331h.m139311c(next.f320414a.f320048d);
                        arrayList3.add(Integer.valueOf(c2));
                        if (v) {
                            int p2 = C105724z.INSTANCE.mo150606p(c2);
                            arrayList4.add(Integer.valueOf((p2 == 102 || p2 == 101) ? 1 : 0));
                        }
                        Log.m105925i("MicroMsg.MT.MultiTalkTalkingUILogic", "memberIds is %s", Integer.valueOf(c2));
                    }
                    if (i2 >= this.f315036P) {
                        break;
                    }
                    i2++;
                }
                if (!v) {
                    mo150954e(arrayList3);
                }
            }
            if (!v ? z || (arrayList = this.f315031J) == null || !arrayList3.containsAll(arrayList) || !this.f315031J.containsAll(arrayList3) : z || (arrayList2 = this.f315031J) == null || !arrayList3.containsAll(arrayList2) || !this.f315031J.containsAll(arrayList3) || !arrayList4.containsAll(this.f315032K) || !this.f315032K.containsAll(arrayList4)) {
                z3 = false;
            }
            if (!z3) {
                if (!v) {
                    int size = arrayList3.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int i3 = 0; i3 < size; i3++) {
                        C103898r0 r0Var = new C103898r0();
                        r0Var.f307152b = arrayList3.get(i3).intValue();
                        arrayList5.add(r0Var);
                    }
                    C105851w0.zx0().mo150649Z(arrayList5);
                } else if (!C105851w0.zx0().mo150670m().mo150708j()) {
                    C105724z zVar = C105724z.INSTANCE;
                    zVar.getClass();
                    zVar.mo150614x(new C105718x1(zVar, arrayList3, false));
                    Log.m105924i("MicroMsg.MT.MultiTalkTalkingUILogic", "ilink subscribeByUserMids ok, mids:" + arrayList3);
                }
            }
            this.f315031J = arrayList3;
            if (v) {
                this.f315032K = arrayList4;
            }
        }
    }
}
