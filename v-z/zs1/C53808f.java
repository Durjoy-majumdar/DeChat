package zs1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ScrollFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7865r3;
import gy3.C87412m;
import qo3.C77390c0;

/* renamed from: zs1.f */
public class C53808f extends C77390c0 implements C53812i {

    /* renamed from: d */
    public Context f150976d;

    /* renamed from: e */
    public ViewGroup f150977e;

    /* renamed from: f */
    public ScrollFrameLayout f150978f;

    /* renamed from: g */
    public final int f150979g;

    /* renamed from: h */
    public final int f150980h;

    /* renamed from: i */
    public final int f150981i = C75044y4.m89991c(this.f150976d);

    /* renamed from: j */
    public final int f150982j;

    /* renamed from: n */
    public int f150983n;

    /* renamed from: o */
    public int f150984o;

    /* renamed from: p */
    public int f150985p;

    /* renamed from: q */
    public int f150986q;

    /* renamed from: r */
    public int f150987r;

    /* renamed from: s */
    public int f150988s;

    /* renamed from: t */
    public int f150989t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53808f(Context context, int i) {
        super(context, C0966R.style.f8382gi);
        C87412m.m108594g(context, "context");
        this.f150976d = context;
        C7865r3 r3Var = C7865r3.f26468a;
        this.f150979g = r3Var.mo8969b(context);
        this.f150980h = r3Var.mo8970c();
        C75044y4.m89994f(this.f150976d);
        this.f150982j = (int) this.f150976d.getResources().getDimension(C0966R.dimen.f3758d_);
        this.f150989t = 80;
        View inflate = C85868k2.m106137b(this.f150976d).inflate(C0966R.C0971layout.a8v, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f150977e = viewGroup;
        viewGroup.setOnClickListener(new C53807e(this));
        mo74374d();
        mo74375f();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f150986q);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = this.f150987r;
        layoutParams.bottomMargin = 0;
        ViewGroup viewGroup2 = this.f150977e;
        if (viewGroup2 != null) {
            viewGroup2.addView(mo74379e(), layoutParams);
            setCanceledOnTouchOutside(true);
            return;
        }
        C87412m.m108603p("mRootView");
        throw null;
    }

    /* renamed from: c */
    public void mo74373c() {
        throw null;
    }

    public void cancel() {
        if (!mo74379e().f112059s) {
            super.cancel();
        } else {
            Log.m105928w("Finder.FinderScrollDialog", "cancel return isAnimating.");
        }
    }

    public Context context() {
        return this.f150976d;
    }

    /* renamed from: d */
    public void mo74374d() {
        throw null;
    }

    public void dismiss() {
        super.dismiss();
    }

    /* renamed from: e */
    public final ScrollFrameLayout mo74379e() {
        ScrollFrameLayout scrollFrameLayout = this.f150978f;
        if (scrollFrameLayout != null) {
            return scrollFrameLayout;
        }
        C87412m.m108603p("mContentView");
        throw null;
    }

    /* renamed from: f */
    public void mo74375f() {
        throw null;
    }

    public void onBackPressed() {
        mo74373c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = this.f150977e;
        if (viewGroup != null) {
            setContentView(viewGroup);
            Window window = getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = this.f150983n;
                attributes.height = this.f150984o;
                attributes.gravity = this.f150989t;
                window.setAttributes(attributes);
                window.setWindowAnimations(0);
                return;
            }
            return;
        }
        C87412m.m108603p("mRootView");
        throw null;
    }

    /* renamed from: p */
    public ScrollFrameLayout mo74382p() {
        return mo74379e();
    }
}
