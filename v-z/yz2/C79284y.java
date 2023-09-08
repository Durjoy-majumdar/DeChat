package yz2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import b03.C39693c0;
import b03.C39696f;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.textstatus.p112ui.LongTextView;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import d03.C58010a;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fb2.C58935b;
import fy3.C32224a;
import go3.C59600d;
import gy3.C87412m;
import gy3.C87413o;
import hz2.C60235a;
import j03.C60695a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60905o;
import jq3.C9493c;
import jz2.C76474e;
import jz2.C76486l;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lz2.C46919a;
import lz2.C46927m;
import lz2.C76738b;
import nc3.C34767b;
import nj3.C76875f0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import oz2.C47412d;
import p182kk.C61104a;
import p232rw.C63679m;
import p640ox.C77049b;
import p773yy.C66710j;
import p823sg.C90193h;
import qc0.C101093a;
import qo3.C77407n;
import qo3.C89779i0;
import qy2.C47894a0;
import qy2.C47896n;
import qy2.C47898p;
import qy2.C77452i;
import rr3.C110622b;
import rr3.C110632i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rz2.C48201c;
import su0.C13781a;
import uz2.C52678e0;
import uz2.C52691j0;
import uz2.C78315f0;
import vz2.C78501d;
import z04.C112551y;
import z04.C119027c;
import zp3.C79406f;

/* renamed from: yz2.y */
public final class C79284y implements C47896n, C47898p, View.OnClickListener, C11385n {

    /* renamed from: A */
    public View f232734A;

    /* renamed from: B */
    public ViewGroup f232735B;

    /* renamed from: C */
    public TextView f232736C;

    /* renamed from: D */
    public TextView f232737D;

    /* renamed from: E */
    public ViewGroup f232738E;

    /* renamed from: F */
    public ViewGroup f232739F;

    /* renamed from: G */
    public View f232740G;

    /* renamed from: H */
    public View f232741H;

    /* renamed from: I */
    public MMTPEffectVideoLayout f232742I;

    /* renamed from: J */
    public FrameLayout f232743J;

    /* renamed from: K */
    public FrameLayout f232744K;

    /* renamed from: L */
    public boolean f232745L;

    /* renamed from: M */
    public final View.OnAttachStateChangeListener f232746M;

    /* renamed from: N */
    public String f232747N;

    /* renamed from: P */
    public String f232748P;

    /* renamed from: Q */
    public long f232749Q;

    /* renamed from: R */
    public final C47896n.C47897a f232750R;

    /* renamed from: S */
    public C52678e0 f232751S;

    /* renamed from: T */
    public C59600d f232752T;

    /* renamed from: U */
    public View.OnClickListener f232753U;

    /* renamed from: V */
    public C47896n.C47897a f232754V;

    /* renamed from: W */
    public C34767b.C34768c f232755W;

    /* renamed from: d */
    public final C47894a0 f232756d;

    /* renamed from: e */
    public final String f232757e = ("MicroMsg.TextStatus.StatusCardView@" + hashCode());

    /* renamed from: f */
    public final C13601g f232758f = C36568h.m40985a(C79287e.f232778d);

    /* renamed from: g */
    public final C13601g f232759g = C36568h.m40985a(C79288f.f232779d);

    /* renamed from: h */
    public final C13601g f232760h = C36568h.m40985a(new C79289g(this));

    /* renamed from: i */
    public final float f232761i = 1.7777778f;

    /* renamed from: j */
    public final View f232762j;

    /* renamed from: n */
    public C89779i0 f232763n;

    /* renamed from: o */
    public Context f232764o;

    /* renamed from: p */
    public LongTextView f232765p;

    /* renamed from: q */
    public String f232766q;

    /* renamed from: r */
    public View f232767r;

    /* renamed from: s */
    public View f232768s;

    /* renamed from: t */
    public ImageView f232769t;

    /* renamed from: u */
    public View f232770u;

    /* renamed from: v */
    public TextView f232771v;

    /* renamed from: w */
    public C48201c f232772w;

    /* renamed from: x */
    public FrameLayout f232773x;

    /* renamed from: y */
    public C76486l f232774y;

    /* renamed from: z */
    public View f232775z;

    /* renamed from: yz2.y$b */
    public static final class C53728b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79284y f150842d;

        /* renamed from: e */
        public final /* synthetic */ Context f150843e;

        public C53728b(C79284y yVar, Context context) {
            this.f150842d = yVar;
            this.f150843e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/StatusCardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C79284y yVar = this.f150842d;
            Context context = this.f150843e;
            yVar.getClass();
            LayoutInflater.from(context);
            boolean z = true;
            C77407n nVar = new C77407n(context, 1, false);
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            C53730z zVar = C53730z.f150845d;
            C48201c cVar = yVar.f232772w;
            String str = cVar != null ? cVar.field_StatusID : null;
            if (str != null) {
                C53664a0 a0Var = new C53664a0(yVar, context, str);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                    f0Var.f224728w = null;
                    f0Var.f224729x = null;
                }
                arrayList2.clear();
                ArrayList arrayList3 = new ArrayList();
                C76875f0 f0Var2 = new C76875f0(context, C0966R.C0970id.grz, 0);
                f0Var2.f224717i = "删除";
                arrayList3.add(f0Var2);
                if (arrayList3.size() != 0) {
                    z = false;
                }
                if (z) {
                    Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                } else {
                    nVar.f225771i = zVar;
                    nVar.f225782p = a0Var;
                    nVar.f225761d = null;
                    nVar.f225725D = null;
                    nVar.mo107573q();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/StatusCardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yz2.y$c */
    public static final class C53729c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79284y f150844d;

        public C53729c(C79284y yVar) {
            this.f150844d = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/StatusCardView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C47896n.C47897a aVar = this.f150844d.f232754V;
            if (aVar != null) {
                aVar.mo67431a(1, view);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/StatusCardView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yz2.y$a */
    public static final class C79285a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C79284y f232776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79285a(C79284y yVar) {
            super(0);
            this.f232776d = yVar;
        }

        public Object invoke() {
            this.f232776d.mo109285e();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: yz2.y$d */
    public static final class C79286d implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C79284y f232777d;

        public C79286d(C79284y yVar) {
            this.f232777d = yVar;
        }

        public void onViewAttachedToWindow(View view) {
            String str = this.f232777d.f232757e;
            Log.m105918d(str, "onViewAttachedToWindow() called with: v = " + view);
        }

        public void onViewDetachedFromWindow(View view) {
            String str = this.f232777d.f232757e;
            Log.m105918d(str, "onViewDetachedFromWindow() called with: v = " + view);
            this.f232777d.f232745L = true;
        }
    }

    /* renamed from: yz2.y$e */
    public static final class C79287e extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C79287e f232778d = new C79287e();

        public C79287e() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf((float) ((int) (((float) C85875k4.m106180f()) * 1.0f)));
        }
    }

    /* renamed from: yz2.y$f */
    public static final class C79288f extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C79288f f232779d = new C79288f();

        public C79288f() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf((float) C85875k4.m106196n(1.0f));
        }
    }

    /* renamed from: yz2.y$g */
    public static final class C79289g extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ C79284y f232780d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79289g(C79284y yVar) {
            super(0);
            this.f232780d = yVar;
        }

        public Object invoke() {
            return Float.valueOf((float) C75044y4.m89994f(this.f232780d.f232764o));
        }
    }

    /* renamed from: yz2.y$h */
    public static final class C79290h implements C47896n.C47897a {

        /* renamed from: a */
        public final /* synthetic */ C79284y f232781a;

        public C79290h(C79284y yVar) {
            this.f232781a = yVar;
        }

        /* renamed from: a */
        public void mo67431a(int i, Object obj) {
            C59600d dVar;
            if (i == 2) {
                C47896n.C47897a aVar = this.f232781a.f232754V;
                if (aVar != null) {
                    aVar.mo67431a(2, obj);
                }
            } else if (i == 4) {
                C59600d dVar2 = this.f232781a.f232752T;
                if (dVar2 != null) {
                    dVar2.mo84136b();
                }
            } else if (i == 5 && (dVar = this.f232781a.f232752T) != null) {
                dVar.mo84135a();
            }
        }
    }

    /* renamed from: yz2.y$i */
    public static final class C79291i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C48201c f232782d;

        /* renamed from: e */
        public final /* synthetic */ C79284y f232783e;

        public C79291i(C48201c cVar, C79284y yVar) {
            this.f232782d = cVar;
            this.f232783e = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/StatusCardView$update$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C48201c cVar = this.f232782d;
            C52678e0 e0Var = null;
            if (cVar != null) {
                e0Var = C66710j.C53637a.m60171a(cVar, false, 1, (Object) null);
            }
            if (e0Var != null) {
                C79284y yVar = this.f232783e;
                Context context = yVar.f232764o;
                C60235a.m70504d(e0Var);
                C77452i z = ((C76474e) yVar.f232774y).mo106711c();
                C87412m.m108593f(e0Var.f147090g, "topicInfo.jumpInfos");
                C87412m.m108594g(context, "context");
                if (z != null) {
                    z.mo107630c(context);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/StatusCardView$update$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yz2.y$j */
    public static final class C79292j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C79284y f232784d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f232785e;

        public C79292j(C79284y yVar, ViewGroup viewGroup) {
            this.f232784d = yVar;
            this.f232785e = viewGroup;
        }

        public final void run() {
            LongTextView longTextView = this.f232784d.f232765p;
            if (longTextView != null) {
                longTextView.setPaddingTopAfterExpand(this.f232785e.getHeight() + C79406f.m96347a(this.f232784d.f232764o, 16.0f));
            }
        }
    }

    public C79284y(Context context, C47894a0 a0Var) {
        Context context2 = context;
        C47894a0 a0Var2 = a0Var;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(a0Var2, "showParam");
        this.f232756d = a0Var2;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cmm, (ViewGroup) null, false);
        C87412m.m108593f(inflate, "from(context).inflate(R.…card_new_ui, null, false)");
        this.f232762j = inflate;
        this.f232764o = context2;
        C79286d dVar = new C79286d(this);
        this.f232746M = dVar;
        C76474e eVar = new C76474e(a0Var2);
        this.f232774y = eVar;
        eVar.mo106674h(inflate);
        ((C76474e) this.f232774y).f223870W = new C79285a(this);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kyg);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.kxy);
        if (textView2 != null) {
            textView2.setTextSize(0, (float) C76577a.m92155f(context2, C0966R.dimen.f3684bd));
        }
        this.f232765p = (LongTextView) inflate.findViewById(C0966R.C0970id.f359429kw2);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(C0966R.C0970id.m2q);
        TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.kxe);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.alu);
        View findViewById = inflate.findViewById(C0966R.C0970id.alw);
        C87412m.m108593f(findViewById, "cardView.findViewById(R.id.btn_like)");
        ImageView imageView2 = (ImageView) findViewById;
        this.f232769t = (ImageView) inflate.findViewById(C0966R.C0970id.f2o);
        TextView textView4 = (TextView) inflate.findViewById(C0966R.C0970id.ky8);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.f359441kx1);
        C87412m.m108593f(findViewById2, "cardView.findViewById(R.id.tv_like_num)");
        TextView textView5 = (TextView) findViewById2;
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.m2w);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0966R.C0970id.m2w);
        TextView textView6 = (TextView) inflate.findViewById(C0966R.C0970id.kxw);
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        this.f232739F = (ViewGroup) inflate.findViewById(C0966R.C0970id.m2r);
        ImageView imageView3 = (ImageView) inflate.findViewById(C0966R.C0970id.m2c);
        ImageView imageView4 = (ImageView) inflate.findViewById(C0966R.C0970id.l2t);
        this.f232740G = inflate.findViewById(C0966R.C0970id.fd5);
        this.f232741H = inflate.findViewById(C0966R.C0970id.mif);
        this.f232773x = (FrameLayout) inflate.findViewById(C0966R.C0970id.fli);
        this.f232767r = inflate.findViewById(C0966R.C0970id.fkc);
        this.f232768s = inflate.findViewById(C0966R.C0970id.fk4);
        this.f232743J = (FrameLayout) inflate.findViewById(C0966R.C0970id.fla);
        this.f232744K = (FrameLayout) inflate.findViewById(C0966R.C0970id.fl_);
        this.f232775z = inflate.findViewById(C0966R.C0970id.ale);
        this.f232734A = inflate.findViewById(C0966R.C0970id.mav);
        this.f232770u = inflate.findViewById(C0966R.C0970id.m8s);
        this.f232771v = (TextView) inflate.findViewById(C0966R.C0970id.kyk);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(C0966R.C0970id.kin);
        this.f232735B = (ViewGroup) inflate.findViewById(C0966R.C0970id.mfe);
        this.f232736C = (TextView) inflate.findViewById(C0966R.C0970id.mhy);
        this.f232737D = (TextView) inflate.findViewById(C0966R.C0970id.mid);
        this.f232738E = (ViewGroup) inflate.findViewById(C0966R.C0970id.fku);
        if (a0Var2.mo72635a(128)) {
            inflate.setOutlineProvider(new C39693c0(true, true, (float) C76577a.m92150a(this.f232764o, 12.0f)));
            inflate.setClipToOutline(true);
        }
        View view = this.f232775z;
        if (view != null) {
            int i = a0Var2.mo72635a(512) ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (a0Var2.mo72635a(65536)) {
            View view3 = this.f232734A;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view5 = this.f232734A;
            if (view5 != null) {
                view5.setOnClickListener(new C53728b(this, context2));
            }
        } else {
            View view6 = this.f232734A;
            if (view6 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        View view7 = this.f232775z;
        if (view7 != null) {
            view7.setOnClickListener(new C53729c(this));
        }
        inflate.addOnAttachStateChangeListener(dVar);
        this.f232747N = "";
        this.f232748P = "";
        this.f232750R = new C79290h(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0501  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72646a(java.lang.String r28, rz2.C48201c r29, uz2.C52691j0 r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            java.lang.Class<uz2.f0> r3 = uz2.C78315f0.class
            java.lang.Class<ox.b> r4 = p640ox.C77049b.class
            java.lang.String r5 = "username"
            gy3.C87412m.m108594g(r1, r5)
            r0.f232772w = r2
            r0.f232766q = r1
            di3.d r5 = di3.C86312j.m106911c(r4)
            ox.b r5 = (p640ox.C77049b) r5
            android.content.Context r6 = r0.f232764o
            r7 = 9
            pe3.a r5 = r5.Wi0(r6, r7, r3)
            uz2.f0 r5 = (uz2.C78315f0) r5
            if (r5 == 0) goto L_0x002e
            r5.f229429e = r1
            qy2.a0 r6 = r0.f232756d
            int r6 = r6.f128519g
            r5.f229434j = r6
        L_0x002e:
            qy2.a0 r5 = r0.f232756d
            int r5 = r5.f128519g
            r6 = 3
            if (r5 != r6) goto L_0x003e
            az2.e r5 = az2.C39674e.f106452d
            rz2.h r5 = r5.mo62255t0()
            r5.mo72971mI(r1)
        L_0x003e:
            jz2.l r5 = r0.f232774y
            jz2.e r5 = (jz2.C76474e) r5
            r6 = r30
            boolean r1 = r5.mo106661a(r1, r2, r6)
            r5 = 8
            r6 = 0
            if (r1 != 0) goto L_0x0090
            android.view.View r1 = r0.f232762j
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.mo10233c(r3)
            java.lang.Object[] r9 = r2.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r11 = "update"
            java.lang.String r12 = "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r1
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r10 = "update"
            java.lang.String r11 = "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0090:
            android.view.View r1 = r0.f232762j
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8.mo10233c(r9)
            java.lang.Object[] r16 = r8.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r18 = "update"
            java.lang.String r19 = "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r8 = r8.mo10231a(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.setVisibility(r8)
            java.lang.String r16 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r17 = "update"
            java.lang.String r18 = "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            qy2.a0 r1 = r0.f232756d
            r8 = 32
            boolean r1 = r1.mo72635a(r8)
            r8 = 2131165337(0x7f070099, float:1.7944888E38)
            r9 = 12
            if (r1 == 0) goto L_0x01ab
            android.view.View r1 = r0.f232768s
            if (r1 == 0) goto L_0x00ea
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L_0x00eb
        L_0x00ea:
            r1 = 0
        L_0x00eb:
            boolean r11 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r11 == 0) goto L_0x00f2
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            goto L_0x00f3
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            if (r1 == 0) goto L_0x0107
            r1.removeRule(r9)
            r9 = 2
            r11 = 2131316076(0x7f094d6c, float:1.8250623E38)
            r1.addRule(r9, r11)
            android.view.View r9 = r0.f232768s
            if (r9 != 0) goto L_0x0104
            goto L_0x0107
        L_0x0104:
            r9.setLayoutParams(r1)
        L_0x0107:
            android.view.View r1 = r0.f232767r
            if (r1 == 0) goto L_0x0110
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L_0x0111
        L_0x0110:
            r1 = 0
        L_0x0111:
            boolean r9 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r9 == 0) goto L_0x0118
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            goto L_0x0119
        L_0x0118:
            r1 = 0
        L_0x0119:
            if (r1 == 0) goto L_0x0126
            r9 = -1
            r1.height = r9
            android.view.View r9 = r0.f232767r
            if (r9 != 0) goto L_0x0123
            goto L_0x0126
        L_0x0123:
            r9.setLayoutParams(r1)
        L_0x0126:
            android.view.View r1 = r0.f232767r
            if (r1 == 0) goto L_0x0267
            android.content.Context r9 = r0.f232764o
            int r8 = kg3.C76577a.m92157h(r9, r8)
            android.content.Context r9 = r0.f232764o
            int r9 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r9)
            int r8 = r8 + r9
            android.view.View r9 = r0.f232770u
            if (r9 != 0) goto L_0x013c
            goto L_0x0181
        L_0x013c:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r15.mo10233c(r11)
            java.lang.Object[] r12 = r15.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r14 = "fixLayout"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r11 = r9
            r10 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r10 = r10.mo10231a(r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r12 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r13 = "fixLayout"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0181:
            qy2.a0 r9 = r0.f232756d
            int r9 = r9.f128519g
            if (r9 != r7) goto L_0x019a
            android.widget.TextView r9 = r0.f232771v
            if (r9 != 0) goto L_0x018c
            goto L_0x019a
        L_0x018c:
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r11 = 2131837920(0x7f1143e0, float:1.9309049E38)
            java.lang.String r10 = r10.getString(r11)
            r9.setText(r10)
        L_0x019a:
            int r9 = r1.getPaddingLeft()
            int r10 = r1.getPaddingRight()
            int r11 = r1.getPaddingBottom()
            r1.setPadding(r9, r8, r10, r11)
            goto L_0x0267
        L_0x01ab:
            qy2.a0 r1 = r0.f232756d
            r9 = 2048(0x800, float:2.87E-42)
            boolean r1 = r1.mo72635a(r9)
            if (r1 == 0) goto L_0x01cf
            android.view.View r1 = r0.f232767r
            if (r1 == 0) goto L_0x01be
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L_0x01bf
        L_0x01be:
            r1 = 0
        L_0x01bf:
            boolean r8 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r8 == 0) goto L_0x01c6
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            goto L_0x01c7
        L_0x01c6:
            r1 = 0
        L_0x01c7:
            if (r1 == 0) goto L_0x0267
            java.lang.String r8 = "16:9"
            r1.f44410B = r8
            goto L_0x0267
        L_0x01cf:
            rx3.g r1 = r0.f232758f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            rx3.g r9 = r0.f232760h
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r1 = r1 - r9
            android.content.Context r9 = r0.f232764o
            int r8 = kg3.C76577a.m92157h(r9, r8)
            float r8 = (float) r8
            float r1 = r1 - r8
            rx3.g r8 = r0.f232759g
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r1 = r1 / r8
            float r8 = r0.f232761i
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0267
            rx3.g r1 = r0.f232759g
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            rx3.g r8 = r0.f232758f
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            rx3.g r9 = r0.f232760h
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r8 = r8 - r9
            android.content.Context r9 = r0.f232764o
            r10 = 2131165367(0x7f0700b7, float:1.794495E38)
            int r9 = kg3.C76577a.m92157h(r9, r10)
            float r9 = (float) r9
            float r8 = r8 - r9
            float r1 = r1 / r8
            android.view.View r8 = r0.f232767r
            if (r8 == 0) goto L_0x0249
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            goto L_0x024a
        L_0x0249:
            r8 = 0
        L_0x024a:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r9 == 0) goto L_0x0251
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8
            goto L_0x0252
        L_0x0251:
            r8 = 0
        L_0x0252:
            if (r8 == 0) goto L_0x0267
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            java.lang.String r1 = ":1"
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            r8.f44410B = r1
        L_0x0267:
            r27.mo109289q()     // Catch:{ all -> 0x026b }
            goto L_0x026c
        L_0x026b:
        L_0x026c:
            qy2.a0 r1 = r0.f232756d
            r8 = 32768(0x8000, float:4.5918E-41)
            boolean r1 = r1.mo72635a(r8)
            r8 = 1
            if (r1 == 0) goto L_0x030b
            android.view.View r1 = r0.f232741H
            if (r1 != 0) goto L_0x027d
            goto L_0x02c2
        L_0x027d:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r15.mo10233c(r9)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r12 = "updateMask"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r9 = r1
            r7 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r7 = r7.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r11 = "updateMask"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x02c2:
            android.view.View r1 = r0.f232740G
            if (r1 != 0) goto L_0x02c8
            goto L_0x0403
        L_0x02c8:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.mo10233c(r9)
            java.lang.Object[] r20 = r7.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r22 = "updateMask"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r7 = r7.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r21 = "updateMask"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0403
        L_0x030b:
            android.view.View r1 = r0.f232741H
            if (r1 != 0) goto L_0x0310
            goto L_0x0350
        L_0x0310:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.mo10233c(r9)
            java.lang.Object[] r10 = r7.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r12 = "updateMask"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r7 = r7.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r11 = "updateMask"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0350:
            rz2.c r1 = r0.f232772w
            if (r1 == 0) goto L_0x0357
            java.lang.String r1 = r1.field_MediaThumbUrl
            goto L_0x0358
        L_0x0357:
            r1 = 0
        L_0x0358:
            if (r1 == 0) goto L_0x0363
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x0361
            goto L_0x0363
        L_0x0361:
            r1 = 0
            goto L_0x0364
        L_0x0363:
            r1 = 1
        L_0x0364:
            if (r1 != 0) goto L_0x03bd
            rz2.c r1 = r0.f232772w
            if (r1 == 0) goto L_0x0372
            boolean r1 = r1.mo72933B0()
            if (r1 != r8) goto L_0x0372
            r1 = 1
            goto L_0x0373
        L_0x0372:
            r1 = 0
        L_0x0373:
            if (r1 == 0) goto L_0x0376
            goto L_0x03bd
        L_0x0376:
            android.view.View r1 = r0.f232740G
            if (r1 != 0) goto L_0x037c
            goto L_0x0403
        L_0x037c:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7.mo10233c(r9)
            java.lang.Object[] r10 = r7.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r12 = "updateMask"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r7 = r7.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r11 = "updateMask"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0403
        L_0x03bd:
            android.view.View r1 = r0.f232740G
            if (r1 != 0) goto L_0x03c2
            goto L_0x0403
        L_0x03c2:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.mo10233c(r9)
            java.lang.Object[] r20 = r7.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r22 = "updateMask"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r7 = r7.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r20 = "com/tencent/mm/plugin/textstatus/ui/StatusCardView"
            java.lang.String r21 = "updateMask"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0403:
            android.widget.ImageView r1 = r0.f232769t
            if (r1 == 0) goto L_0x040b
            int r1 = r1.getVisibility()
        L_0x040b:
            android.view.View r1 = r0.f232762j
            r1.setOnClickListener(r0)
            android.view.ViewGroup r1 = r0.f232739F
            if (r1 == 0) goto L_0x041c
            yz2.y$i r7 = new yz2.y$i
            r7.<init>(r2, r0)
            r1.setOnClickListener(r7)
        L_0x041c:
            di3.d r1 = di3.C86312j.m106911c(r4)
            ox.b r1 = (p640ox.C77049b) r1
            android.content.Context r4 = r0.f232764o
            r7 = 9
            pe3.a r1 = r1.Wi0(r4, r7, r3)
            uz2.f0 r1 = (uz2.C78315f0) r1
            if (r1 == 0) goto L_0x0464
            java.lang.String r3 = r1.f229428d
            java.lang.String r4 = r0.f232747N
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0447
            java.lang.String r3 = r0.f232748P
            if (r2 == 0) goto L_0x043f
            java.lang.String r4 = r2.field_StatusID
            goto L_0x0440
        L_0x043f:
            r4 = 0
        L_0x0440:
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0447
            return
        L_0x0447:
            qy2.a0 r3 = r0.f232756d
            r4 = 16384(0x4000, float:2.2959E-41)
            boolean r3 = r3.mo72635a(r4)
            if (r3 != 0) goto L_0x0454
            r27.mo109292w()
        L_0x0454:
            java.lang.String r1 = r1.f229428d
            r0.f232747N = r1
            if (r2 == 0) goto L_0x045d
            java.lang.String r10 = r2.field_StatusID
            goto L_0x045e
        L_0x045d:
            r10 = 0
        L_0x045e:
            if (r10 != 0) goto L_0x0462
            java.lang.String r10 = ""
        L_0x0462:
            r0.f232748P = r10
        L_0x0464:
            jz2.l r1 = r0.f232774y
            jz2.e r1 = (jz2.C76474e) r1
            qy2.i r1 = r1.mo106711c()
            android.widget.FrameLayout r3 = r0.f232743J
            if (r3 == 0) goto L_0x047f
            r3.removeAllViews()
            if (r1 == 0) goto L_0x047f
            android.widget.FrameLayout r3 = r0.f232743J
            boolean r1 = r1.mo84150q(r3)
            if (r1 != r8) goto L_0x047f
            r1 = 1
            goto L_0x0480
        L_0x047f:
            r1 = 0
        L_0x0480:
            if (r1 == 0) goto L_0x048b
            android.widget.FrameLayout r1 = r0.f232743J
            if (r1 != 0) goto L_0x0487
            goto L_0x0493
        L_0x0487:
            r1.setVisibility(r6)
            goto L_0x0493
        L_0x048b:
            android.widget.FrameLayout r1 = r0.f232743J
            if (r1 != 0) goto L_0x0490
            goto L_0x0493
        L_0x0490:
            r1.setVisibility(r5)
        L_0x0493:
            if (r2 == 0) goto L_0x0499
            int r1 = r2.field_CreateTime
            long r3 = (long) r1
            goto L_0x049b
        L_0x0499:
            r3 = 0
        L_0x049b:
            r1 = 1000(0x3e8, float:1.401E-42)
            long r9 = (long) r1
            long r3 = r3 * r9
            qy2.a0 r1 = r0.f232756d
            r7 = 131072(0x20000, float:1.83671E-40)
            boolean r1 = r1.mo72635a(r7)
            if (r1 == 0) goto L_0x04ed
            android.view.ViewGroup r1 = r0.f232738E
            if (r1 != 0) goto L_0x04af
            goto L_0x04b2
        L_0x04af:
            r1.setVisibility(r5)
        L_0x04b2:
            android.view.ViewGroup r1 = r0.f232735B
            if (r1 != 0) goto L_0x04b7
            goto L_0x04ba
        L_0x04b7:
            r1.setVisibility(r6)
        L_0x04ba:
            android.widget.TextView r1 = r0.f232736C
            if (r1 != 0) goto L_0x04bf
            goto L_0x04d3
        L_0x04bf:
            android.content.Context r5 = r0.f232764o
            r7 = 2131837865(0x7f1143a9, float:1.9308937E38)
            java.lang.String r5 = r5.getString(r7)
            java.lang.CharSequence r5 = android.text.format.DateFormat.format(r5, r3)
            java.lang.String r5 = r5.toString()
            r1.setText(r5)
        L_0x04d3:
            android.widget.TextView r1 = r0.f232737D
            if (r1 != 0) goto L_0x04d8
            goto L_0x04fd
        L_0x04d8:
            android.content.Context r5 = r0.f232764o
            r7 = 2131837993(0x7f114429, float:1.9309197E38)
            java.lang.String r5 = r5.getString(r7)
            java.lang.CharSequence r3 = android.text.format.DateFormat.format(r5, r3)
            java.lang.String r3 = r3.toString()
            r1.setText(r3)
            goto L_0x04fd
        L_0x04ed:
            android.view.ViewGroup r1 = r0.f232738E
            if (r1 != 0) goto L_0x04f2
            goto L_0x04f5
        L_0x04f2:
            r1.setVisibility(r6)
        L_0x04f5:
            android.view.ViewGroup r1 = r0.f232735B
            if (r1 != 0) goto L_0x04fa
            goto L_0x04fd
        L_0x04fa:
            r1.setVisibility(r5)
        L_0x04fd:
            android.view.ViewGroup r1 = r0.f232735B
            if (r1 == 0) goto L_0x0523
            int r3 = r1.getVisibility()
            if (r3 != 0) goto L_0x0508
            r6 = 1
        L_0x0508:
            if (r6 == 0) goto L_0x0513
            yz2.y$j r3 = new yz2.y$j
            r3.<init>(r0, r1)
            r1.post(r3)
            goto L_0x0523
        L_0x0513:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r1 = r0.f232765p
            if (r1 != 0) goto L_0x0518
            goto L_0x0523
        L_0x0518:
            android.content.Context r3 = r0.f232764o
            r4 = 1107296256(0x42000000, float:32.0)
            int r3 = zp3.C79406f.m96347a(r3, r4)
            r1.setPaddingTopAfterExpand(r3)
        L_0x0523:
            r0.mo109287n(r2)     // Catch:{ all -> 0x0526 }
        L_0x0526:
            jz2.l r1 = r0.f232774y
            qy2.n$a r2 = r0.f232750R
            jz2.e r1 = (jz2.C76474e) r1
            r1.f223871X = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79284y.mo72646a(java.lang.String, rz2.c, uz2.j0):void");
    }

    /* renamed from: c */
    public void mo72647c() {
        Log.m105924i(this.f232757e, "[onStatusShowDestroy]");
        mo109286i();
        ((C76474e) this.f232774y).mo106713m();
        this.f232774y.getClass();
        C59600d dVar = this.f232752T;
        if (dVar != null) {
            dVar.mo79963g();
        }
        C59600d dVar2 = this.f232752T;
        if (dVar2 != null) {
            dVar2.mo79961e();
        }
        C59600d dVar3 = this.f232752T;
        if (dVar3 != null) {
            dVar3.onDestroy();
        }
        this.f232752T = null;
        this.f232751S = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109285e() {
        /*
            r20 = this;
            r0 = r20
            qy2.a0 r1 = r0.f232756d
            int r1 = r1.f128519g
            r2 = 6
            if (r1 != r2) goto L_0x009e
            android.view.View r1 = r0.f232762j
            r2 = 2131314869(0x7f0948b5, float:1.8248175E38)
            java.lang.Object r1 = r1.getTag(r2)
            boolean r2 = r1 instanceof uz2.C52673c1
            r3 = 0
            if (r2 == 0) goto L_0x001a
            uz2.c1 r1 = (uz2.C52673c1) r1
            goto L_0x001b
        L_0x001a:
            r1 = r3
        L_0x001b:
            r2 = 0
            if (r1 == 0) goto L_0x006f
            int r4 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDetailActivity.f206752q
            android.content.Context r4 = r0.f232764o
            java.lang.String r5 = "context"
            gy3.C87412m.m108594g(r4, r5)
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity> r6 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDetailActivity.class
            r5.<init>(r4, r6)
            byte[] r1 = r1.toByteArray()
            java.lang.String r6 = "history_item"
            r5.putExtra(r6, r1)
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r5)
            java.lang.Object[] r6 = r1.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity$Companion"
            java.lang.String r8 = "start"
            java.lang.String r9 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusHistory;)V"
            java.lang.String r10 = "Undefined"
            java.lang.String r11 = "startActivity"
            java.lang.String r12 = "(Landroid/content/Intent;)V"
            r5 = r4
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r1.mo10231a(r2)
            android.content.Intent r1 = (android.content.Intent) r1
            r4.startActivity(r1)
            java.lang.String r6 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity$Companion"
            java.lang.String r7 = "start"
            java.lang.String r8 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusHistory;)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x006f:
            android.view.View r1 = r0.f232762j
            r4 = 2131314871(0x7f0948b7, float:1.824818E38)
            java.lang.Object r1 = r1.getTag(r4)
            boolean r4 = r1 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x007f
            r3 = r1
            java.lang.Integer r3 = (java.lang.Integer) r3
        L_0x007f:
            if (r3 == 0) goto L_0x0085
            int r2 = r3.intValue()
        L_0x0085:
            vz2.d r3 = vz2.C78501d.f229945a
            android.content.Context r4 = r0.f232764o
            r5 = 27
            r7 = 0
            rz2.c r8 = r0.f232772w
            r9 = 0
            r11 = 0
            long r13 = (long) r2
            r15 = 0
            r17 = 0
            r18 = 436(0x1b4, float:6.11E-43)
            r19 = 0
            vz2.C78501d.m94806h(r3, r4, r5, r7, r8, r9, r11, r13, r15, r17, r18, r19)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79284y.mo109285e():void");
    }

    /* renamed from: f */
    public void mo72640f(C47896n.C47897a aVar) {
        this.f232754V = aVar;
    }

    public View getView() {
        return this.f232762j;
    }

    /* renamed from: h */
    public void mo72650h(String str) {
        if (!(str == null || C112551y.m153811k(str))) {
            new C46927m.C46938k(str, this);
            C47898p.C47899a.m53214a(this, str, C39674e.f106452d.mo62253n0(str), (C52691j0) null, 4, (Object) null);
        }
    }

    /* renamed from: i */
    public final void mo109286i() {
        C60695a player;
        C60695a player2;
        FrameLayout frameLayout = this.f232773x;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.f232773x;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232742I;
        if (!(mMTPEffectVideoLayout == null || (player2 = mMTPEffectVideoLayout.getPlayer()) == null)) {
            player2.stopAsync();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f232742I;
        if (!(mMTPEffectVideoLayout2 == null || (player = mMTPEffectVideoLayout2.getPlayer()) == null)) {
            player.recycle();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.f232742I;
        if (mMTPEffectVideoLayout3 != null) {
            mMTPEffectVideoLayout3.mo81101g();
        }
        mo109291u();
    }

    /* renamed from: k */
    public void mo72648k() {
        Log.m105924i(this.f232757e, "[onStatusShowResume]");
        C59600d dVar = this.f232752T;
        if ((this.f232756d.mo72635a(32) && !(dVar != null ? dVar instanceof C58935b : false)) && C101093a.m132481c()) {
            C101093a.m132490l();
        }
        C59600d dVar2 = this.f232752T;
        if (dVar2 != null) {
            dVar2.mo79964h();
        }
        C59600d dVar3 = this.f232752T;
        if (dVar3 != null) {
            dVar3.mo79962f();
        }
        mo109290t();
        ((C76474e) this.f232774y).mo106709a0();
        C39674e.f106452d.mo62255t0().mo72971mI(this.f232766q);
        LongTextView longTextView = this.f232765p;
        if (longTextView != null) {
            longTextView.mo98338a(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r2 = r2.getPlayer();
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72649m() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f232757e
            java.lang.String r1 = "[onStatusShowPause]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            go3.d r0 = r4.f232752T
            if (r0 == 0) goto L_0x000e
            r0.mo79963g()
        L_0x000e:
            go3.d r0 = r4.f232752T
            if (r0 == 0) goto L_0x0015
            r0.mo79961e()
        L_0x0015:
            java.lang.String r0 = r4.f232757e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "pauseVideo() called textureView:"
            r1.append(r2)
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r2 = r4.f232742I
            r3 = 0
            if (r2 == 0) goto L_0x0035
            j03.a r2 = r2.getPlayer()
            if (r2 == 0) goto L_0x0035
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            r1.append(r2)
            java.lang.String r2 = " state:"
            r1.append(r2)
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r2 = r4.f232742I
            if (r2 == 0) goto L_0x0051
            j03.a r2 = r2.getPlayer()
            if (r2 == 0) goto L_0x0051
            int r2 = r2.mo85608f()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0052
        L_0x0051:
            r2 = r3
        L_0x0052:
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r0 = r4.f232742I
            r1 = 0
            if (r0 == 0) goto L_0x0070
            j03.a r0 = r0.getPlayer()
            if (r0 == 0) goto L_0x0070
            r2 = 1
            j03.C60695a.C60696a.m70998a(r0, r1, r2, r3)
        L_0x0070:
            r4.mo109291u()
            jz2.l r0 = r4.f232774y
            jz2.e r0 = (jz2.C76474e) r0
            android.widget.ImageView r0 = r0.mo106715x()
            r0.setTag(r3)
            com.tencent.mm.plugin.textstatus.ui.LongTextView r0 = r4.f232765p
            if (r0 == 0) goto L_0x0085
            r0.mo98338a(r1)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79284y.mo72649m():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if ((r3 != null && yz2.C79224c.m95929a(r3, r9)) == false) goto L_0x003d;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109287n(rz2.C48201c r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r9 == 0) goto L_0x000a
            uz2.e0 r9 = p773yy.C66710j.C53637a.m60171a(r9, r2, r0, r1)
            goto L_0x000b
        L_0x000a:
            r9 = r1
        L_0x000b:
            if (r9 == 0) goto L_0x00c5
            java.lang.String r3 = hz2.C60235a.m70504d(r9)
            if (r3 == 0) goto L_0x001c
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = 1
        L_0x001d:
            if (r3 != 0) goto L_0x00c5
            qy2.a0 r3 = r8.f232756d
            r4 = 16
            boolean r3 = r3.mo72635a(r4)
            if (r3 == 0) goto L_0x00c5
            go3.d r3 = r8.f232752T
            if (r3 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            uz2.e0 r3 = r8.f232751S
            if (r3 == 0) goto L_0x003a
            boolean r3 = yz2.C79224c.m95929a(r3, r9)
            if (r3 != r0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            if (r3 != 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 != 0) goto L_0x00a4
            go3.d r0 = r8.f232752T
            if (r0 == 0) goto L_0x0047
            r0.mo79963g()
        L_0x0047:
            go3.d r0 = r8.f232752T
            if (r0 == 0) goto L_0x004e
            r0.mo79961e()
        L_0x004e:
            go3.d r0 = r8.f232752T
            if (r0 == 0) goto L_0x0055
            r0.onDestroy()
        L_0x0055:
            r8.f232752T = r1
            r8.f232751S = r1
            android.widget.FrameLayout r0 = r8.f232744K
            if (r0 == 0) goto L_0x0060
            r0.removeAllViews()
        L_0x0060:
            java.lang.String r0 = hz2.C60235a.m70504d(r9)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = ""
        L_0x0068:
            java.util.LinkedList<uz2.a0> r3 = r9.f147090g
            uz2.m r4 = new uz2.m
            r4.<init>()
            r4.f188445d = r2
            r5 = 2
            r4.f188446e = r5
            rz2.c r5 = r8.f232772w
            if (r5 == 0) goto L_0x007b
            int r5 = r5.field_CreateTime
            goto L_0x007f
        L_0x007b:
            int r5 = eb0.C31543z5.m39455e()
        L_0x007f:
            r4.f188448g = r5
            android.widget.FrameLayout r5 = r8.f232744K     // Catch:{ all -> 0x00a0 }
            if (r5 != 0) goto L_0x0086
            goto L_0x00a0
        L_0x0086:
            if (r3 == 0) goto L_0x008d
            uz2.a0 r3 = xz2.C79020s.m95585a(r3)     // Catch:{ all -> 0x00a0 }
            goto L_0x008e
        L_0x008d:
            r3 = r1
        L_0x008e:
            xz2.r r6 = xz2.C79019r.f232026a     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0095
            java.lang.String r7 = r3.f188439d     // Catch:{ all -> 0x00a0 }
            goto L_0x0096
        L_0x0095:
            r7 = r1
        L_0x0096:
            qy2.r r6 = r6.mo108986a(r7)     // Catch:{ all -> 0x00a0 }
            if (r6 == 0) goto L_0x00a0
            go3.d r1 = r6.mo84138IT(r0, r5, r3, r4)     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r8.f232752T = r1
            r8.f232751S = r9
        L_0x00a4:
            qy2.a0 r9 = r8.f232756d
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r9 = r9.mo72635a(r0)
            if (r9 == 0) goto L_0x00bc
            go3.d r9 = r8.f232752T
            if (r9 == 0) goto L_0x00b5
            r9.mo79964h()
        L_0x00b5:
            go3.d r9 = r8.f232752T
            if (r9 == 0) goto L_0x00bc
            r9.mo79962f()
        L_0x00bc:
            android.widget.FrameLayout r9 = r8.f232744K
            if (r9 != 0) goto L_0x00c1
            goto L_0x00ef
        L_0x00c1:
            r9.setVisibility(r2)
            goto L_0x00ef
        L_0x00c5:
            go3.d r9 = r8.f232752T
            if (r9 == 0) goto L_0x00cc
            r9.mo79963g()
        L_0x00cc:
            go3.d r9 = r8.f232752T
            if (r9 == 0) goto L_0x00d3
            r9.mo79961e()
        L_0x00d3:
            go3.d r9 = r8.f232752T
            if (r9 == 0) goto L_0x00da
            r9.onDestroy()
        L_0x00da:
            r8.f232752T = r1
            r8.f232751S = r1
            android.widget.FrameLayout r9 = r8.f232744K
            if (r9 == 0) goto L_0x00e5
            r9.removeAllViews()
        L_0x00e5:
            android.widget.FrameLayout r9 = r8.f232744K
            if (r9 != 0) goto L_0x00ea
            goto L_0x00ef
        L_0x00ea:
            r0 = 8
            r9.setVisibility(r0)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79284y.mo109287n(rz2.c):void");
    }

    /* renamed from: o */
    public void mo72642o(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (z) {
            View view = this.f232770u;
            if (view != null && (layoutParams2 = view.getLayoutParams()) != null) {
                layoutParams2.height = -2;
                return;
            }
            return;
        }
        View view2 = this.f232770u;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = 0;
            View view3 = this.f232770u;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams);
            }
        }
    }

    public void onBackPressed() {
        C59600d dVar = this.f232752T;
        if (dVar != null) {
            dVar.onBackPressed();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/StatusCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View.OnClickListener onClickListener = this.f232753U;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.kin) {
            mo109285e();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/StatusCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = true;
        if (yVar instanceof C76738b) {
            C89137b0 d = C86709a0.m107524d();
            ((C76738b) yVar).getClass();
            d.mo123470p(5293, this);
            if (!(i == 0 && i2 == 0)) {
                Context context = this.f232764o;
                C76879j.m92748s(context, context.getString(C0966R.string.jzj), "");
                z = false;
            }
            C47896n.C47897a aVar = this.f232754V;
            if (aVar != null) {
                aVar.mo67431a(0, Boolean.valueOf(z));
            }
        } else if (yVar instanceof C46919a) {
            C86709a0.m107524d().mo123470p(5967, this);
            if (!(i == 0 && i2 == 0)) {
                Context context2 = this.f232764o;
                C76879j.m92748s(context2, context2.getString(C0966R.string.jzj), "");
                z = false;
            }
            if (z) {
                C53673f2 f2Var = (C53673f2) C39818r.f106831a.mo62443b(this.f232764o).mo75002a(C53673f2.class);
                String str2 = ((C46919a) yVar).f126144d;
                f2Var.getClass();
                C87412m.m108594g(str2, "statusId");
                Iterator<C9493c> it = f2Var.f150749g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9493c next = it.next();
                    if ((next instanceof C47412d) && C87412m.m108589b(((C47412d) next).f127195d.field_StatusID, str2)) {
                        f2Var.f150749g.remove(next);
                        break;
                    }
                }
                RecyclerView.C16613e<C60905o> eVar = f2Var.f150747e;
                if (eVar != null) {
                    eVar.notifyDataSetChanged();
                }
            }
        }
        C89779i0 i0Var = this.f232763n;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }

    /* renamed from: p */
    public void mo72644p(long j) {
        long c = C31543z5.m39453c();
        long j2 = this.f232749Q;
        long j3 = c - j2;
        C78501d.m94806h(C78501d.f229945a, this.f232764o, 2, (String) null, this.f232772w, j, (j3 < 0 || j2 == 0) ? 0 : j3, 0, 0, (Integer) null, 452, (Object) null);
    }

    /* renamed from: q */
    public final void mo109289q() {
        C48201c cVar;
        String str;
        C60695a player;
        String str2 = this.f232766q;
        if (str2 != null && (cVar = this.f232772w) != null) {
            if (cVar.field_MediaType != 2 || !this.f232756d.mo72635a(16)) {
                mo109286i();
                return;
            }
            Log.m105924i(this.f232757e, "playVideo called");
            FrameLayout frameLayout = this.f232773x;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            if (this.f232742I == null) {
                this.f232742I = new MMTPEffectVideoLayout(this.f232764o);
            }
            MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232742I;
            if (mMTPEffectVideoLayout != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                FrameLayout frameLayout2 = this.f232773x;
                if (frameLayout2 != null) {
                    frameLayout2.addView(mMTPEffectVideoLayout, layoutParams);
                }
                FrameLayout frameLayout3 = this.f232773x;
                boolean z = false;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                String str3 = cVar.field_MediaUrl;
                String str4 = null;
                if (str3 != null) {
                    byte[] bytes = str3.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    str = C90193h.m112878f(bytes);
                } else {
                    str = null;
                }
                String str5 = str == null ? "" : str;
                String str6 = cVar.field_MediaUrl;
                if (str6 != null) {
                    str4 = str6;
                }
                String str7 = str4 == null ? "" : str4;
                C39696f fVar = C39696f.f106501a;
                String c = fVar.mo62320c(str2);
                boolean k = C86013q1.m106450k(c);
                if (!k) {
                    c = fVar.mo62321d("video", str2);
                }
                if (this.f232756d.f128518f) {
                    String a = C13781a.m13082a();
                    C87412m.m108593f(a, "username()");
                    c = fVar.mo62319b(str7, a);
                    k = false;
                }
                int i = cVar.field_mediaWidth;
                int i2 = cVar.field_mediaHeight;
                if (i <= 0 || i2 <= 0) {
                    i = C74783i3.m89537a(this.f232764o).f24704a;
                    i2 = C74783i3.m89537a(this.f232764o).f24705b;
                }
                C58010a aVar = new C58010a(str5, c, str7, i, i2);
                aVar.f165933e = k;
                if (k) {
                    C63679m.C63680a UU = ((C63679m) C86312j.m106911c(C63679m.class)).mo88484UU(c, true);
                    aVar.f165935g = UU != null ? UU.f180528d : 0;
                    aVar.f165939k = UU != null ? UU.f180530f : 0;
                }
                mMTPEffectVideoLayout.mo81100f();
                mMTPEffectVideoLayout.setMediaInfo(aVar);
                C60695a player2 = mMTPEffectVideoLayout.getPlayer();
                if (player2 != null) {
                    player2.mo85614i(true);
                }
                C60695a player3 = mMTPEffectVideoLayout.getPlayer();
                if (player3 != null) {
                    player3.setLoop(true);
                }
                mMTPEffectVideoLayout.getEffectManager().mo154926f();
                mMTPEffectVideoLayout.getEffectManager().mo154924d();
                if (cVar.mo72933B0()) {
                    C110622b b = mMTPEffectVideoLayout.getEffectManager().mo154922b();
                    b.mo162186d(5.0f);
                    b.mo162187e(1.0f);
                } else {
                    mMTPEffectVideoLayout.getEffectManager().mo154936p(C110632i.BlurEffect);
                }
                this.f232742I = mMTPEffectVideoLayout;
                if (!this.f232756d.mo72635a(64) || !C61104a.m71668x()) {
                    boolean B = C61104a.m71642B(this.f232764o, false);
                }
                if (!((this.f232756d.mo72635a(64) && C61104a.m71668x()) || C61104a.m71642B(this.f232764o, false))) {
                    C34767b.C34768c el = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34774j.f93457c, new C79221b0(this));
                    this.f232755W = el;
                    if (el != null && el.mo34198a()) {
                        z = true;
                    }
                } else {
                    mo109291u();
                }
                MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f232742I;
                if (!(mMTPEffectVideoLayout2 == null || (player = mMTPEffectVideoLayout2.getPlayer()) == null)) {
                    player.setMute(!z);
                }
                if (this.f232756d.mo72635a(8192)) {
                    mo109290t();
                }
            }
        }
    }

    /* renamed from: s */
    public void mo72645s(boolean z) {
        if (z) {
            C78501d.m94806h(C78501d.f229945a, this.f232764o, 72, (String) null, this.f232772w, 0, 0, 0, 0, (Integer) null, 500, (Object) null);
        } else {
            C78501d.m94806h(C78501d.f229945a, this.f232764o, 71, (String) null, this.f232772w, 0, 0, 0, 0, (Integer) null, 500, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r2 = r2.getPlayer();
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109290t() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f232757e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "playVideo() called textureView:"
            r1.append(r2)
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r2 = r7.f232742I
            if (r2 == 0) goto L_0x001f
            j03.a r2 = r2.getPlayer()
            if (r2 == 0) goto L_0x001f
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            boolean r0 = r7.f232745L
            if (r0 == 0) goto L_0x0043
            r0 = 0
            r7.f232745L = r0
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r0 = r7.f232742I
            if (r0 == 0) goto L_0x0043
            j03.a r1 = r0.getPlayer()
            if (r1 == 0) goto L_0x0043
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            j03.C60695a.C60696a.m70999b(r1, r2, r3, r4, r5, r6)
        L_0x0043:
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r0 = r7.f232742I
            if (r0 == 0) goto L_0x0050
            j03.a r0 = r0.getPlayer()
            if (r0 == 0) goto L_0x0050
            r0.mo85619m()
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79284y.mo109290t():void");
    }

    /* renamed from: u */
    public final void mo109291u() {
        C34767b.C34768c cVar = this.f232755W;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
        this.f232755W = null;
    }

    /* renamed from: w */
    public void mo109292w() {
        C78315f0 f0Var = (C78315f0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f232764o, 9, C78315f0.class);
        if (f0Var != null) {
            Object tag = this.f232762j.getTag(C0966R.C0970id.ke6);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            f0Var.f229436o = num != null ? num.intValue() : 0;
            C78501d.m94806h(C78501d.f229945a, this.f232764o, 1, (String) null, this.f232772w, 0, 0, 0, 0, (Integer) null, 500, (Object) null);
        }
        this.f232749Q = C31543z5.m39453c();
    }
}
