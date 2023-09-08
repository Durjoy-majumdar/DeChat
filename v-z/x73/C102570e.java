package x73;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C103422m;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import o40.C61926c;
import p662ql.C101204b;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C101810m82;
import te3.C101823o70;
import u73.C101986v;
import w73.C102359e;
import wc3.C78541w;
import wd3.C65953v0;

/* renamed from: x73.e */
public final class C102570e extends C103422m {

    /* renamed from: f */
    public C101823o70 f302014f;

    /* renamed from: g */
    public final C101204b f302015g;

    /* renamed from: h */
    public final String f302016h = "MicroMsg.WebSearch.EmojiSearchDialog";

    /* renamed from: i */
    public View f302017i;

    /* renamed from: j */
    public boolean f302018j;

    /* renamed from: n */
    public C102575h f302019n;

    /* renamed from: o */
    public C102576i f302020o;

    /* renamed from: p */
    public final String f302021p = "com.tencent.mm.Intent.ACTION_NET_STATS";

    /* renamed from: q */
    public long f302022q;

    /* renamed from: r */
    public C89779i0 f302023r;

    /* renamed from: x73.e$a */
    public static final class C102571a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C102570e f302024d;

        /* renamed from: e */
        public final /* synthetic */ C101810m82 f302025e;

        /* renamed from: f */
        public final /* synthetic */ String f302026f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102571a(C102570e eVar, C101810m82 m822, String str) {
            super(0);
            this.f302024d = eVar;
            this.f302025e = m822;
            this.f302026f = str;
        }

        public Object invoke() {
            C102570e eVar = this.f302024d;
            C101810m82 m822 = this.f302025e;
            String str = this.f302026f;
            eVar.getClass();
            C87412m.m108594g(m822, "shareContent");
            if (m822.f298798n != null) {
                eVar.f302022q = Util.currentTicks();
                ((C78541w) C86312j.m106911c(C78541w.class)).mo108489Qb(eVar.getContext(), eVar.f302014f.f298984o, m822.f298798n.toByteArray(), (C65953v0) null, eVar.f302014f.f298986q, eVar.f302022q, new C102573f(eVar, str, m822));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: x73.e$b */
    public static final class C102572b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C102570e f302027d;

        public C102572b(C102570e eVar) {
            this.f302027d = eVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C102359e eVar;
            C101986v vVar;
            C102359e eVar2;
            C101986v vVar2;
            C102575h hVar = this.f302027d.f302019n;
            if (!(hVar == null || (eVar2 = hVar.f302040n) == null || (vVar2 = eVar2.f301456i) == null)) {
                C86709a0.m107524d().mo123458d(vVar2);
                eVar2.f301456i = null;
            }
            C102576i iVar = this.f302027d.f302020o;
            if (!(iVar == null || (eVar = iVar.f302049j) == null || (vVar = eVar.f301456i) == null)) {
                C86709a0.m107524d().mo123458d(vVar);
                eVar.f301456i = null;
            }
            this.f302027d.f302022q = 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102570e(Context context, C101823o70 o702, C101204b bVar) {
        super(context, C0966R.style.a5c);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(o702, "homeContext");
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f302014f = o702;
        this.f302015g = bVar;
    }

    /* renamed from: E */
    public final void mo142197E(C101810m82 m822, String str) {
        C87412m.m108594g(m822, "shareContent");
        String str2 = this.f302016h;
        Log.m105924i(str2, "onSearchShare " + m822.toJSON() + '}');
        C61926c.m72668M(new C102571a(this, m822, str));
    }

    /* renamed from: F */
    public final void mo142198F(String str) {
        C87412m.m108594g(str, "id");
        if (this.f302023r == null) {
            this.f302023r = C89779i0.m112248e(getContext(), getContext().getString(C0966R.string.gas), true, 0, new C102572b(this));
        }
        C89779i0 i0Var = this.f302023r;
        if (i0Var != null && !i0Var.isShowing()) {
            i0Var.show();
        }
    }

    public void dismiss() {
        this.f302022q = 0;
        Util.hideVKB(this.f302017i);
        super.dismiss();
        Intent intent = new Intent(this.f302021p);
        intent.putExtra("ui", C102570e.class.getSimpleName());
        intent.putExtra("opCode", 4);
        getContext().sendBroadcast(intent);
    }

    public void onBackPressed() {
        View findViewById;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator rotation;
        ViewPropertyAnimator duration;
        TextView textView;
        if (this.f302018j) {
            View view = this.f302017i;
            if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.kpm)) == null)) {
                textView.setText(C0966R.string.lqr);
            }
            View view2 = this.f302017i;
            if (!(view2 == null || (findViewById = view2.findViewById(C0966R.C0970id.bec)) == null || (animate = findViewById.animate()) == null || (rotation = animate.rotation(0.0f)) == null || (duration = rotation.setDuration(200)) == null)) {
                duration.start();
            }
            C102576i iVar = this.f302020o;
            if (iVar != null) {
                iVar.f302046g.animate().translationX((float) C76577a.m92145A(iVar.mo24908k0())).setDuration(300).start();
            }
            this.f302018j = false;
            return;
        }
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(C0966R.style.f8365fv);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cl8, (ViewGroup) null);
        setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        inflate.findViewById(C0966R.C0970id.cij).setOnTouchListener(new C78779a(this));
        inflate.findViewById(C0966R.C0970id.bec).setOnClickListener(new C78780b(this));
        ((ImageView) inflate.findViewById(C0966R.C0970id.j5t)).setOnClickListener(new C53295c(inflate));
        ((TextView) inflate.findViewById(C0966R.C0970id.kpm)).setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3879hn)) * C76577a.m92161l(getContext()));
        this.f302019n = new C102575h(this, this.f302014f, this.f302015g, inflate);
        setOnDismissListener(new C102569d(this));
        setCancelable(true);
        this.f302017i = inflate;
        Intent intent = new Intent(this.f302021p);
        intent.putExtra("ui", C102570e.class.getSimpleName());
        intent.putExtra("opCode", 3);
        getContext().sendBroadcast(intent);
    }
}
