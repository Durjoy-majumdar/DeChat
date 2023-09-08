package hk0;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.utils.html.C84746b;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32226l;
import gt0.C87370k0;
import gt0.C87375o0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: hk0.c */
public final class C87537c implements C87370k0 {

    /* renamed from: d */
    public final C87375o0 f253595d;

    /* renamed from: e */
    public final Context f253596e;

    /* renamed from: f */
    public final int f253597f;

    /* renamed from: g */
    public final int f253598g;

    /* renamed from: h */
    public final C32226l<String, C13598b0> f253599h;

    /* renamed from: i */
    public final View f253600i;

    /* renamed from: j */
    public final View f253601j;

    /* renamed from: n */
    public final View f253602n;

    /* renamed from: hk0.c$a */
    public static final class C87538a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C87537c f253603d;

        /* renamed from: hk0.c$a$a */
        public static final class C87539a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C87537c f253604d;

            public C87539a(C87537c cVar) {
                this.f253604d = cVar;
            }

            public final void run() {
                this.f253604d.f253601j.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f253604d.f253598g));
            }
        }

        public C87538a(C87537c cVar) {
            this.f253603d = cVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int abs = Math.abs(i4 - i2);
            C87537c cVar = this.f253603d;
            int i9 = cVar.f253598g;
            if (abs > i9 && i9 >= cVar.f253597f) {
                cVar.f253601j.post(new C87539a(cVar));
            }
        }
    }

    /* renamed from: hk0.c$b */
    public static final class C87540b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C87537c f253605d;

        public C87540b(C87537c cVar) {
            this.f253605d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/RealnameAuthExplainDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87537c cVar = this.f253605d;
            C87375o0 o0Var = cVar.f253595d;
            if (o0Var != null) {
                o0Var.mo121777a(cVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/RealnameAuthExplainDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hk0.c$c */
    public static final class C87541c implements C84746b.C40567a {

        /* renamed from: a */
        public final /* synthetic */ C87537c f253606a;

        public C87541c(C87537c cVar) {
            this.f253606a = cVar;
        }

        /* renamed from: a */
        public final void mo63415a(String str) {
            C32226l<String, C13598b0> lVar = this.f253606a.f253599h;
            C87412m.m108593f(str, "url");
            lVar.invoke(str);
        }
    }

    public C87537c(C87375o0 o0Var, String str, String str2, Context context, int i, int i2, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "content");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "handler");
        this.f253595d = o0Var;
        this.f253596e = context;
        this.f253597f = i;
        this.f253598g = i2;
        this.f253599h = lVar;
        View inflate = View.inflate(context, C0966R.C0971layout.f6432ep, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, com.ten…ber_explain_dialog, null)");
        this.f253602n = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.hv7);
        C87412m.m108593f(findViewById, "rootView.findViewById(co…number_explain_container)");
        this.f253600i = findViewById;
        findViewById.setMinimumHeight(i);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.hv8);
        C87412m.m108593f(findViewById2, "rootView.findViewById(co…e_number_explain_content)");
        this.f253601j = findViewById2;
        findViewById2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        findViewById2.setMinimumHeight(i);
        findViewById2.setPadding(0, 0, 0, C76577a.m92155f(context, C0966R.dimen.f3895i6));
        findViewById2.addOnLayoutChangeListener(new C87538a(this));
        View findViewById3 = inflate.findViewById(C0966R.C0970id.hv9);
        C87412m.m108593f(findViewById3, "rootView.findViewById(co…mber_explain_dialog_back)");
        ((ImageView) findViewById3).setOnClickListener(new C87540b(this));
        View findViewById4 = inflate.findViewById(C0966R.C0970id.hva);
        C87412m.m108593f(findViewById4, "rootView.findViewById(co…ber_explain_dialog_title)");
        ((TextView) findViewById4).setText(str);
        View findViewById5 = inflate.findViewById(C0966R.C0970id.hv_);
        C87412m.m108593f(findViewById5, "rootView.findViewById(co…r_explain_dialog_content)");
        TextView textView = (TextView) findViewById5;
        textView.setText(C84746b.m104407a(str2, false, new C87541c(this)));
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight(C76577a.m92151b(context, 28));
        } else {
            textView.setLineSpacing(C76577a.m92156g(context) * 12.5f, 1.0f);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(Color.parseColor("#FF576B95"));
    }

    /* renamed from: A */
    public void mo36936A(int i) {
    }

    /* renamed from: b */
    public void mo36937b() {
    }

    public void cancel() {
    }

    public void dismiss() {
    }

    public View getContentView() {
        return this.f253602n;
    }

    public int getPosition() {
        return 2;
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
    }

    /* renamed from: k */
    public boolean mo36950k() {
        return true;
    }

    /* renamed from: m */
    public boolean mo36951m() {
        return true;
    }

    public void onCancel() {
    }

    /* renamed from: w */
    public boolean mo36953w() {
        return false;
    }
}
