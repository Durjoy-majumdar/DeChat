package vo3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: vo3.i */
public final class C111568i extends C104428a {

    /* renamed from: n */
    public final C13601g f333983n;

    /* renamed from: o */
    public final C13601g f333984o;

    /* renamed from: p */
    public final C13601g f333985p;

    /* renamed from: q */
    public final C13601g f333986q;

    /* renamed from: r */
    public final C13601g f333987r;

    /* renamed from: s */
    public final View f333988s;

    /* renamed from: t */
    public int f333989t;

    /* renamed from: vo3.i$b */
    public static final class C78463b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C111568i f229875d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<String> f229876e;

        /* renamed from: f */
        public final /* synthetic */ TextView f229877f;

        /* renamed from: vo3.i$b$a */
        public static final class C78464a implements C7045j.C7056k<Object> {

            /* renamed from: a */
            public final /* synthetic */ C7045j f229878a;

            /* renamed from: b */
            public final /* synthetic */ TextView f229879b;

            /* renamed from: c */
            public final /* synthetic */ C111568i f229880c;

            public C78464a(C7045j jVar, TextView textView, C111568i iVar) {
                this.f229878a = jVar;
                this.f229879b = textView;
                this.f229880c = iVar;
            }

            public void onResult(boolean z, Object obj, Object obj2) {
                this.f229878a.mo8101d();
                if (z) {
                    TextView textView = this.f229879b;
                    C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                    textView.setText((CharSequence) obj);
                }
                C111576j.f334002f = this.f229878a.mo8099b();
                this.f229880c.f333989t = this.f229878a.mo8099b();
            }
        }

        public C78463b(C111568i iVar, ArrayList<String> arrayList, TextView textView) {
            this.f229875d = iVar;
            this.f229876e = arrayList;
            this.f229877f = textView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7045j jVar = new C7045j(this.f229875d.getContext(), this.f229876e);
            jVar.mo8106i(this.f229875d.f333989t);
            jVar.f24869t = new C78464a(jVar, this.f229877f, this.f229875d);
            jVar.mo8109l();
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: vo3.i$a */
    public static final class C111569a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C111568i f333990d;

        public C111569a(C111568i iVar) {
            this.f333990d = iVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                Object value = ((C36570n) this.f333990d.f333983n).getValue();
                C87412m.m108593f(value, "<get-edtMinDampingFactor>(...)");
                C111576j.f334000d = (int) Float.parseFloat(((EditText) value).getText().toString());
                Object value2 = ((C36570n) this.f333990d.f333984o).getValue();
                C87412m.m108593f(value2, "<get-edtMaxDampingFactor>(...)");
                C111576j.f334001e = (int) Float.parseFloat(((EditText) value2).getText().toString());
                Object value3 = ((C36570n) this.f333990d.f333986q).getValue();
                C87412m.m108593f(value3, "<get-edtMinSpringDuration>(...)");
                C111576j.f333999c = (int) Float.parseFloat(((EditText) value3).getText().toString());
                Object value4 = ((C36570n) this.f333990d.f333985p).getValue();
                C87412m.m108593f(value4, "<get-edtMaxSpringDuration>(...)");
                C111576j.f333998b = (int) Float.parseFloat(((EditText) value4).getText().toString());
                Object value5 = ((C36570n) this.f333990d.f333987r).getValue();
                C87412m.m108593f(value5, "<get-edtDecelerateRatio>(...)");
                C111576j.f333997a = Float.parseFloat(((EditText) value5).getText().toString());
            } catch (Throwable unused) {
            }
            this.f333990d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: vo3.i$c */
    public static final class C111570c extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ C111568i f333991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111570c(C111568i iVar) {
            super(0);
            this.f333991d = iVar;
        }

        public Object invoke() {
            return (Button) this.f333991d.f333988s.findViewById(C0966R.C0970id.f357588am1);
        }
    }

    /* renamed from: vo3.i$d */
    public static final class C111571d extends C87413o implements C32224a<EditText> {

        /* renamed from: d */
        public final /* synthetic */ C111568i f333992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111571d(C111568i iVar) {
            super(0);
            this.f333992d = iVar;
        }

        public Object invoke() {
            return (EditText) this.f333992d.f333988s.findViewById(C0966R.C0970id.cl4);
        }
    }

    /* renamed from: vo3.i$e */
    public static final class C111572e extends C87413o implements C32224a<EditText> {

        /* renamed from: d */
        public final /* synthetic */ C111568i f333993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111572e(C111568i iVar) {
            super(0);
            this.f333993d = iVar;
        }

        public Object invoke() {
            return (EditText) this.f333993d.f333988s.findViewById(C0966R.C0970id.cl7);
        }
    }

    /* renamed from: vo3.i$f */
    public static final class C111573f extends C87413o implements C32224a<EditText> {

        /* renamed from: d */
        public final /* synthetic */ C111568i f333994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111573f(C111568i iVar) {
            super(0);
            this.f333994d = iVar;
        }

        public Object invoke() {
            return (EditText) this.f333994d.f333988s.findViewById(C0966R.C0970id.cl8);
        }
    }

    /* renamed from: vo3.i$g */
    public static final class C111574g extends C87413o implements C32224a<EditText> {

        /* renamed from: d */
        public final /* synthetic */ C111568i f333995d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111574g(C111568i iVar) {
            super(0);
            this.f333995d = iVar;
        }

        public Object invoke() {
            return (EditText) this.f333995d.f333988s.findViewById(C0966R.C0970id.cl9);
        }
    }

    /* renamed from: vo3.i$h */
    public static final class C111575h extends C87413o implements C32224a<EditText> {

        /* renamed from: d */
        public final /* synthetic */ C111568i f333996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111575h(C111568i iVar) {
            super(0);
            this.f333996d = iVar;
        }

        public Object invoke() {
            return (EditText) this.f333996d.f333988s.findViewById(C0966R.C0970id.cl_);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111568i(Context context) {
        super(context, 0);
        C87412m.m108594g(context, "context");
        C13601g a = C36568h.m40985a(new C111574g(this));
        this.f333983n = a;
        C13601g a2 = C36568h.m40985a(new C111572e(this));
        this.f333984o = a2;
        C13601g a3 = C36568h.m40985a(new C111573f(this));
        this.f333985p = a3;
        C13601g a4 = C36568h.m40985a(new C111575h(this));
        this.f333986q = a4;
        C13601g a5 = C36568h.m40985a(new C111571d(this));
        this.f333987r = a5;
        C13601g a6 = C36568h.m40985a(new C111570c(this));
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b4i, (ViewGroup) null, false);
        this.f333988s = inflate;
        setContentView(inflate);
        Object value = ((C36570n) a).getValue();
        C87412m.m108593f(value, "<get-edtMinDampingFactor>(...)");
        ((EditText) value).setText(String.valueOf(C111576j.f334000d));
        Object value2 = ((C36570n) a2).getValue();
        C87412m.m108593f(value2, "<get-edtMaxDampingFactor>(...)");
        ((EditText) value2).setText(String.valueOf(C111576j.f334001e));
        Object value3 = ((C36570n) a4).getValue();
        C87412m.m108593f(value3, "<get-edtMinSpringDuration>(...)");
        ((EditText) value3).setText(String.valueOf(C111576j.f333999c));
        Object value4 = ((C36570n) a3).getValue();
        C87412m.m108593f(value4, "<get-edtMaxSpringDuration>(...)");
        ((EditText) value4).setText(String.valueOf(C111576j.f333998b));
        Object value5 = ((C36570n) a5).getValue();
        C87412m.m108593f(value5, "<get-edtDecelerateRatio>(...)");
        ((EditText) value5).setText(String.valueOf(C111576j.f333997a));
        Object value6 = ((C36570n) a6).getValue();
        C87412m.m108593f(value6, "<get-btnOk>(...)");
        ((Button) value6).setOnClickListener(new C111569a(this));
        ArrayList arrayList = new ArrayList();
        arrayList.add("default");
        arrayList.add("scale");
        View findViewById = findViewById(C0966R.C0970id.hnh);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        int i = C111576j.f334002f;
        this.f333989t = i;
        textView.setText((CharSequence) arrayList.get(i));
        View findViewById2 = findViewById(C0966R.C0970id.hnd);
        C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.Button");
        ((Button) findViewById2).setOnClickListener(new C78463b(this, arrayList, textView));
    }
}
