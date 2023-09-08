package qo3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.AlertActivity;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: qo3.e0 */
public class C101218e0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: A */
    public LinearLayout f296370A;

    /* renamed from: B */
    public LinearLayout f296371B;

    /* renamed from: C */
    public TextView f296372C;

    /* renamed from: D */
    public C12907m f296373D;

    /* renamed from: E */
    public C12907m f296374E;

    /* renamed from: F */
    public C12907m f296375F;

    /* renamed from: G */
    public View f296376G;

    /* renamed from: H */
    public boolean f296377H;

    /* renamed from: I */
    public boolean f296378I;

    /* renamed from: J */
    public C77394n f296379J;

    /* renamed from: K */
    public C101230o f296380K;

    /* renamed from: d */
    public Dialog f296381d;

    /* renamed from: e */
    public C101229l f296382e;

    /* renamed from: f */
    public Context f296383f;

    /* renamed from: g */
    public View f296384g;

    /* renamed from: h */
    public boolean f296385h;

    /* renamed from: i */
    public int f296386i;

    /* renamed from: j */
    public View f296387j;

    /* renamed from: n */
    public ViewTreeObserver f296388n;

    /* renamed from: o */
    public boolean f296389o;

    /* renamed from: p */
    public int f296390p;

    /* renamed from: q */
    public int f296391q;

    /* renamed from: r */
    public LinearLayout f296392r;

    /* renamed from: s */
    public LinearLayout f296393s;

    /* renamed from: t */
    public Button f296394t;

    /* renamed from: u */
    public Button f296395u;

    /* renamed from: v */
    public Button f296396v;

    /* renamed from: w */
    public Button f296397w;

    /* renamed from: x */
    public Button f296398x;

    /* renamed from: y */
    public LinearLayout f296399y;

    /* renamed from: z */
    public LinearLayout f296400z;

    /* renamed from: qo3.e0$b */
    public class C12906b implements View.OnClickListener {
        public C12906b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101218e0.this.mo140680z();
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.e0$m */
    public interface C12907m {
        /* renamed from: a */
        void mo2001a();
    }

    /* renamed from: qo3.e0$n */
    public interface C77394n {
        void dismiss();
    }

    /* renamed from: qo3.e0$a */
    public class C101219a implements View.OnClickListener {
        public C101219a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12907m mVar = C101218e0.this.f296374E;
            if (mVar != null) {
                mVar.mo2001a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.e0$c */
    public class C101220c implements View.OnClickListener {
        public C101220c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101218e0 e0Var = C101218e0.this;
            C101230o oVar = e0Var.f296380K;
            if (oVar != null) {
                oVar.mo32720a(e0Var.f296381d, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.e0$d */
    public class C101221d implements View.OnClickListener {
        public C101221d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101218e0 e0Var = C101218e0.this;
            C101230o oVar = e0Var.f296380K;
            if (oVar != null) {
                oVar.mo32720a(e0Var.f296381d, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.e0$e */
    public class C101222e implements DialogInterface.OnDismissListener {
        public C101222e() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C77394n nVar = C101218e0.this.f296379J;
            if (nVar != null) {
                nVar.dismiss();
                dialogInterface.dismiss();
            }
            ViewTreeObserver viewTreeObserver = C101218e0.this.f296388n;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C101218e0 e0Var = C101218e0.this;
                    e0Var.f296388n = e0Var.f296387j.getViewTreeObserver();
                }
                C101218e0 e0Var2 = C101218e0.this;
                e0Var2.f296388n.removeGlobalOnLayoutListener(e0Var2);
                C101218e0.this.f296388n = null;
            }
            C101218e0 e0Var3 = C101218e0.this;
            if (!e0Var3.f296389o) {
                e0Var3.f296381d = null;
            }
        }
    }

    /* renamed from: qo3.e0$f */
    public class C101223f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CharSequence f296405d;

        /* renamed from: e */
        public final /* synthetic */ CharSequence f296406e;

        public C101223f(CharSequence charSequence, CharSequence charSequence2) {
            this.f296405d = charSequence;
            this.f296406e = charSequence2;
        }

        public void run() {
            Layout layout = C101218e0.this.f296394t.getLayout();
            if (layout != null && layout.getEllipsisCount(0) > 0) {
                C85975v4.m106306c("MicroMsg.MMHalfBottomDialog", "RightButton text too long, show updown mode!!", new Object[0]);
                C101218e0.m132762a(C101218e0.this, this.f296405d, this.f296406e);
            }
        }
    }

    /* renamed from: qo3.e0$g */
    public class C101224g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CharSequence f296408d;

        /* renamed from: e */
        public final /* synthetic */ CharSequence f296409e;

        public C101224g(CharSequence charSequence, CharSequence charSequence2) {
            this.f296408d = charSequence;
            this.f296409e = charSequence2;
        }

        public void run() {
            Layout layout = C101218e0.this.f296395u.getLayout();
            if (layout != null && layout.getEllipsisCount(0) > 0) {
                C85975v4.m106306c("MicroMsg.MMHalfBottomDialog", "RightButton text too long, show updown mode!!", new Object[0]);
                C101218e0.m132762a(C101218e0.this, this.f296408d, this.f296409e);
            }
        }
    }

    /* renamed from: qo3.e0$h */
    public class C101225h implements View.OnClickListener {
        public C101225h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12907m mVar = C101218e0.this.f296373D;
            if (mVar != null) {
                mVar.mo2001a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.e0$i */
    public class C101226i implements View.OnClickListener {
        public C101226i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12907m mVar = C101218e0.this.f296374E;
            if (mVar != null) {
                mVar.mo2001a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.e0$j */
    public class C101227j implements View.OnClickListener {
        public C101227j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12907m mVar = C101218e0.this.f296375F;
            if (mVar != null) {
                mVar.mo2001a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.e0$k */
    public class C101228k implements View.OnClickListener {
        public C101228k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12907m mVar = C101218e0.this.f296373D;
            if (mVar != null) {
                mVar.mo2001a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.e0$l */
    public static class C101229l {

        /* renamed from: a */
        public Context f296415a;

        /* renamed from: b */
        public C101217d f296416b = new C101217d();

        public C101229l(Context context) {
            this.f296415a = context;
        }
    }

    /* renamed from: qo3.e0$o */
    public interface C101230o {
        /* renamed from: a */
        void mo32720a(Dialog dialog, int i);
    }

    public C101218e0(Context context) {
        this.f296385h = false;
        this.f296389o = false;
        this.f296377H = true;
        this.f296378I = false;
        this.f296383f = context;
        this.f296390p = 0;
        this.f296391q = 0;
        mo140659f(context);
    }

    /* renamed from: a */
    public static void m132762a(C101218e0 e0Var, CharSequence charSequence, CharSequence charSequence2) {
        e0Var.f296393s.setVisibility(0);
        e0Var.f296392r.setVisibility(8);
        Button button = e0Var.f296397w;
        if (button != null && e0Var.f296396v != null) {
            button.setText(charSequence);
            e0Var.f296396v.setText(charSequence2);
            e0Var.f296397w.setOnClickListener(new C12908f0(e0Var));
            e0Var.f296396v.setOnClickListener(new C12914g0(e0Var));
        }
    }

    /* renamed from: A */
    public void mo140655A() {
        Class<AlertActivity> cls = AlertActivity.class;
        this.f296385h = mo140660g();
        Context context = this.f296383f;
        this.f296386i = context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        if (!(this.f296383f instanceof Activity)) {
            AlertActivity.f284189o = this.f296382e;
            Intent intent = new Intent(this.f296383f, cls);
            intent.setFlags(335544320);
            intent.putExtra("dialog_scene", 3);
            Context context2 = this.f296383f;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (this.f296381d != null) {
            ((ViewGroup) this.f296384g.getParent()).setVisibility(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f296384g.getLayoutParams();
            if (this.f296385h && this.f296387j != null) {
                Rect rect = new Rect();
                this.f296387j.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = Math.min(rect.right, rect.bottom);
            }
            this.f296384g.setLayoutParams(layoutParams);
            this.f296381d.getWindow().addFlags(Integer.MIN_VALUE);
            this.f296381d.getWindow().clearFlags(8);
            this.f296381d.getWindow().clearFlags(131072);
            this.f296381d.getWindow().clearFlags(128);
            this.f296381d.getWindow().getDecorView().setSystemUiVisibility(0);
            View view = this.f296387j;
            if (view != null) {
                boolean z = this.f296388n == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f296388n = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            Context context4 = this.f296383f;
            if (!(context4 instanceof Activity)) {
                AlertActivity.f284189o = this.f296382e;
                Intent intent2 = new Intent(this.f296383f, cls);
                intent2.setFlags(335544320);
                intent2.putExtra("dialog_scene", 3);
                Context context5 = this.f296383f;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                Context context6 = context5;
                C117292a.m165358d(context6, aVar2.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context5.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context6, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog", "tryShow", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (!((Activity) context4).isFinishing()) {
                this.f296381d.show();
            }
        }
    }

    /* renamed from: b */
    public void mo140656b(boolean z) {
        Button button = this.f296395u;
        if (button != null) {
            button.setEnabled(z);
        }
    }

    /* renamed from: c */
    public int mo8783c() {
        return C0966R.C0971layout.bcm;
    }

    /* renamed from: d */
    public final void mo140657d() {
        this.f296392r = (LinearLayout) this.f296384g.findViewById(C0966R.C0970id.alx);
        this.f296394t = (Button) this.f296384g.findViewById(C0966R.C0970id.alm);
        this.f296395u = (Button) this.f296384g.findViewById(C0966R.C0970id.aln);
        this.f296398x = (Button) this.f296384g.findViewById(C0966R.C0970id.amg);
        this.f296393s = (LinearLayout) this.f296384g.findViewById(C0966R.C0970id.aly);
        this.f296396v = (Button) this.f296384g.findViewById(C0966R.C0970id.alo);
        this.f296397w = (Button) this.f296384g.findViewById(C0966R.C0970id.alk);
        int i = this.f296390p;
        if (i == 0) {
            this.f296392r.setVisibility(8);
            this.f296393s.setVisibility(8);
        } else if (i == 1) {
            this.f296393s.setVisibility(8);
            this.f296392r.setVisibility(0);
            this.f296398x.setVisibility(8);
            this.f296394t.setOnClickListener(new C101225h());
            this.f296395u.setOnClickListener(new C101226i());
        } else if (i == 2) {
            this.f296393s.setVisibility(8);
            this.f296392r.setVisibility(0);
            this.f296394t.setVisibility(8);
            this.f296395u.setVisibility(8);
            this.f296398x.setOnClickListener(new C101227j());
        } else if (i == 3) {
            this.f296393s.setVisibility(0);
            this.f296392r.setVisibility(8);
            this.f296397w.setOnClickListener(new C101228k());
            this.f296396v.setOnClickListener(new C101219a());
        }
    }

    /* renamed from: e */
    public final void mo140658e() {
        LinearLayout linearLayout = this.f296399y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            int i = this.f296391q;
            if (i == 0) {
                this.f296399y.setVisibility(8);
            } else if (i == 1) {
                View inflate = LayoutInflater.from(this.f296383f).inflate(C0966R.C0971layout.ayy, (ViewGroup) null);
                View findViewById = inflate.findViewById(C0966R.C0970id.beq);
                WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.bem);
                if (this.f296378I) {
                    findViewById.setBackgroundResource(C0966R.C0969drawable.a8u);
                    weImageView.setIconColor(this.f296383f.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                }
                findViewById.setOnClickListener(new C12906b());
                this.f296399y.removeAllViews();
                this.f296399y.setGravity(17);
                this.f296399y.addView(inflate, -1, -2);
            } else if (i == 2) {
                View inflate2 = LayoutInflater.from(this.f296383f).inflate(C0966R.C0971layout.ayz, (ViewGroup) null);
                this.f296372C = (TextView) inflate2.findViewById(C0966R.C0970id.kpi);
                this.f296399y.removeAllViews();
                this.f296399y.setGravity(17);
                this.f296399y.addView(inflate2, -1, -2);
            }
        }
    }

    /* renamed from: f */
    public final void mo140659f(Context context) {
        Context context2 = this.f296383f;
        if (context2 instanceof Activity) {
            this.f296387j = ((ViewGroup) ((Activity) context2).getWindow().getDecorView()).findViewById(16908290);
            this.f296381d = new C12918l0(context, C0966R.style.f8426i2);
            View inflate = View.inflate(context, mo8783c(), (ViewGroup) null);
            this.f296384g = inflate;
            if (inflate != null && this.f296378I) {
                inflate.setBackgroundResource(C0966R.C0969drawable.az7);
            }
            this.f296399y = (LinearLayout) this.f296384g.findViewById(C0966R.C0970id.ahl);
            this.f296400z = (LinearLayout) this.f296384g.findViewById(C0966R.C0970id.ahd);
            this.f296370A = (LinearLayout) this.f296384g.findViewById(C0966R.C0970id.ahf);
            this.f296371B = (LinearLayout) this.f296384g.findViewById(C0966R.C0970id.ahc);
            this.f296376G = this.f296384g.findViewById(C0966R.C0970id.f359416kt2);
            mo140657d();
            mo140658e();
            this.f296385h = mo140660g();
            this.f296381d.setContentView(this.f296384g);
            this.f296381d.setCancelable(this.f296377H);
            this.f296381d.setOnDismissListener(new C101222e());
            C101229l lVar = this.f296382e;
            if (lVar != null) {
                lVar.f296416b.f296369j = this.f296379J;
                return;
            }
            return;
        }
        C101229l lVar2 = new C101229l(context2);
        this.f296382e = lVar2;
        int i = this.f296390p;
        int i2 = this.f296391q;
        boolean z = this.f296377H;
        C101217d dVar = lVar2.f296416b;
        dVar.f296360a = i;
        dVar.f296361b = i2;
        dVar.f296362c = z;
    }

    /* renamed from: g */
    public final boolean mo140660g() {
        return this.f296383f.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: h */
    public boolean mo140661h() {
        Dialog dialog = this.f296381d;
        return dialog != null && dialog.isShowing();
    }

    /* renamed from: i */
    public C101218e0 mo140662i(int i) {
        LinearLayout linearLayout = this.f296371B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            LayoutInflater.from(this.f296384g.getContext()).inflate(i, this.f296371B, true);
        }
        C101229l lVar = this.f296382e;
        if (lVar != null) {
            lVar.f296416b.f296367h = i;
        }
        return this;
    }

    /* renamed from: j */
    public void mo140663j(View view) {
        LinearLayout linearLayout = this.f296371B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.f296371B.removeAllViews();
            this.f296371B.setGravity(17);
            this.f296371B.addView(view, -1, -2);
            Button button = (Button) this.f296371B.findViewById(C0966R.C0970id.hfe);
            Button button2 = (Button) this.f296371B.findViewById(C0966R.C0970id.apy);
            if (button != null) {
                button.setOnClickListener(new C101220c());
            }
            if (button2 != null) {
                button2.setOnClickListener(new C101221d());
            }
        }
        C101229l lVar = this.f296382e;
        if (lVar != null) {
            lVar.f296416b.f296363d = view;
        }
    }

    /* renamed from: k */
    public void mo140664k(View view, int i, int i2) {
        LinearLayout linearLayout = this.f296371B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.f296371B.removeAllViews();
            this.f296371B.setGravity(17);
            this.f296371B.addView(view, -1, -2);
            this.f296371B.setPadding(i, 0, i2, 0);
        }
    }

    /* renamed from: l */
    public void mo140665l(C77394n nVar) {
        this.f296379J = nVar;
        C101229l lVar = this.f296382e;
        if (lVar != null) {
            lVar.f296416b.f296369j = nVar;
        }
    }

    /* renamed from: m */
    public void mo140666m(boolean z, boolean z2) {
        Button button = this.f296394t;
        if (!(button == null || this.f296395u == null)) {
            button.setEnabled(z);
            this.f296395u.setEnabled(z2);
        }
        Button button2 = this.f296397w;
        if (button2 != null && this.f296396v != null) {
            button2.setEnabled(z);
            this.f296396v.setEnabled(z2);
        }
    }

    /* renamed from: n */
    public void mo140667n(CharSequence charSequence, CharSequence charSequence2) {
        Button button = this.f296394t;
        if (!(button == null || this.f296395u == null)) {
            button.setText(charSequence);
            this.f296395u.setText(charSequence2);
            this.f296394t.post(new C101223f(charSequence, charSequence2));
            this.f296395u.post(new C101224g(charSequence, charSequence2));
        }
        Button button2 = this.f296397w;
        if (button2 != null && this.f296396v != null) {
            button2.setText(charSequence);
            this.f296396v.setText(charSequence2);
        }
    }

    /* renamed from: o */
    public void mo140668o(int i) {
        Button button = this.f296395u;
        if (button == null) {
            return;
        }
        if (i == 0) {
            button.setBackgroundResource(C0966R.C0969drawable.f4653j6);
        } else if (i == 2) {
            button.setBackgroundResource(C0966R.C0969drawable.f4663je);
        } else if (i == 3) {
            button.setBackgroundResource(C0966R.C0969drawable.f4667jh);
        } else if (i == 4) {
            button.setBackgroundResource(C0966R.C0969drawable.f4648j1);
        } else if (i == 5) {
            button.setBackgroundResource(C0966R.C0969drawable.f4653j6);
        } else if (i == 6) {
            button.setBackgroundResource(C0966R.C0969drawable.f4665jf);
        }
    }

    public void onGlobalLayout() {
        if (mo140661h()) {
            View view = this.f296387j;
            if (view == null || (!view.isShown() && view.getVisibility() != 0)) {
                mo140680z();
            } else if (mo140661h()) {
                if (this.f296385h == mo140660g()) {
                    int i = this.f296386i;
                    Context context = this.f296383f;
                    if (i == (context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                mo140680z();
            }
        }
    }

    /* renamed from: p */
    public void mo140670p(View view) {
        LinearLayout linearLayout = this.f296400z;
        if (linearLayout == null) {
            return;
        }
        if (view == null) {
            linearLayout.setVisibility(8);
            this.f296370A.setVisibility(8);
        } else if (this.f296390p == 3) {
            linearLayout.setVisibility(8);
            this.f296370A.setVisibility(0);
            this.f296370A.removeAllViews();
            this.f296370A.setGravity(17);
            this.f296370A.addView(view, -1, -2);
        } else {
            this.f296370A.setVisibility(8);
            this.f296400z.setVisibility(0);
            this.f296400z.removeAllViews();
            this.f296400z.setGravity(17);
            this.f296400z.addView(view, -1, -2);
        }
    }

    /* renamed from: q */
    public void mo140671q(CharSequence charSequence) {
        TextView textView = this.f296372C;
        if (textView != null) {
            textView.setText(charSequence);
        }
        C101229l lVar = this.f296382e;
        if (lVar != null) {
            lVar.f296416b.f296366g = charSequence;
        }
    }

    /* renamed from: r */
    public void mo140672r(View view) {
        LinearLayout linearLayout = this.f296399y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.f296399y.removeAllViews();
            this.f296399y.setGravity(17);
            this.f296399y.addView(view, -1, -2);
        }
    }

    /* renamed from: s */
    public void mo140673s(View view) {
        LinearLayout linearLayout = this.f296399y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f296399y.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.f296399y.setLayoutParams(layoutParams);
            this.f296399y.removeAllViews();
            this.f296399y.setGravity(17);
            this.f296399y.addView(view, -1, -2);
        }
    }

    /* renamed from: t */
    public void mo140674t(int i) {
        if (i != 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f296384g.getLayoutParams();
            layoutParams.height = i;
            this.f296384g.setLayoutParams(layoutParams);
            this.f296384g.invalidate();
        }
    }

    /* renamed from: u */
    public void mo140675u(int i) {
        Button button = this.f296394t;
        if (button != null) {
            button.setTextColor(i);
        }
    }

    /* renamed from: v */
    public void mo140676v(int i) {
        Resources resources;
        Button button = this.f296398x;
        if (button != null) {
            boolean z = this.f296378I;
            int i2 = C0966R.color.f3257l0;
            button.setTextColor(z ? this.f296383f.getResources().getColor(C0966R.color.f3256kz) : this.f296383f.getResources().getColor(C0966R.color.f3257l0));
            switch (i) {
                case 0:
                    this.f296398x.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                    break;
                case 1:
                    this.f296398x.setBackgroundResource(this.f296378I ? C0966R.C0969drawable.f4641ip : C0966R.C0969drawable.f4659ja);
                    Button button2 = this.f296398x;
                    if (this.f296378I) {
                        resources = this.f296383f.getResources();
                    } else {
                        resources = this.f296383f.getResources();
                        i2 = C0966R.color.al7;
                    }
                    button2.setTextColor(resources.getColor(i2));
                    break;
                case 2:
                    this.f296398x.setBackgroundResource(C0966R.C0969drawable.f4663je);
                    break;
                case 3:
                    this.f296398x.setBackgroundResource(C0966R.C0969drawable.f4667jh);
                    break;
                case 4:
                    this.f296398x.setBackgroundResource(C0966R.C0969drawable.f4648j1);
                    break;
                case 5:
                    this.f296398x.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                    break;
                case 6:
                    break;
            }
            this.f296398x.setBackgroundResource(C0966R.C0969drawable.f4642iq);
            this.f296398x.setTextColor(this.f296383f.getResources().getColor(C0966R.color.f3164hk));
        }
        C101229l lVar = this.f296382e;
        if (lVar != null) {
            lVar.f296416b.f296365f = i;
        }
    }

    /* renamed from: w */
    public void mo140677w(CharSequence charSequence) {
        Button button = this.f296398x;
        if (button != null) {
            button.setText(charSequence);
        }
        C101229l lVar = this.f296382e;
        if (lVar != null) {
            lVar.f296416b.f296364e = charSequence;
        }
    }

    /* renamed from: x */
    public void mo140678x(int i) {
        Button button = this.f296398x;
        if (button != null) {
            button.setTextColor(i);
        }
    }

    /* renamed from: y */
    public void mo140679y(int i) {
        this.f296381d.getWindow().getAttributes().softInputMode = i;
    }

    /* renamed from: z */
    public void mo140680z() {
        Dialog dialog = this.f296381d;
        if (dialog != null) {
            Context context = this.f296383f;
            if (!(context instanceof Activity)) {
                dialog.dismiss();
            } else if (context != null && !((Activity) context).isFinishing() && !((Activity) this.f296383f).isDestroyed()) {
                this.f296381d.dismiss();
            }
        } else {
            C77394n nVar = this.f296379J;
            if (nVar != null) {
                nVar.dismiss();
            }
        }
    }

    public C101218e0(Context context, int i, int i2) {
        this.f296385h = false;
        this.f296389o = false;
        this.f296377H = true;
        this.f296378I = false;
        this.f296383f = context;
        this.f296390p = i;
        this.f296391q = i2;
        mo140659f(context);
    }

    public C101218e0(Context context, int i, int i2, boolean z) {
        this.f296385h = false;
        this.f296389o = false;
        this.f296378I = false;
        this.f296383f = context;
        this.f296390p = i;
        this.f296391q = i2;
        this.f296377H = z;
        mo140659f(context);
    }

    public C101218e0(Context context, int i, int i2, boolean z, boolean z2) {
        this.f296385h = false;
        this.f296389o = false;
        this.f296383f = context;
        this.f296390p = i;
        this.f296391q = i2;
        this.f296377H = z;
        this.f296378I = z2;
        mo140659f(context);
    }
}
