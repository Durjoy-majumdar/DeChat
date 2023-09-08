package im0;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83762b1;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;

/* renamed from: im0.f */
public class C76362f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f223632d;

    /* renamed from: e */
    public final /* synthetic */ boolean f223633e;

    /* renamed from: f */
    public final /* synthetic */ C83780d1 f223634f;

    /* renamed from: g */
    public final /* synthetic */ int f223635g;

    /* renamed from: h */
    public final /* synthetic */ String f223636h;

    /* renamed from: i */
    public final /* synthetic */ int f223637i;

    /* renamed from: j */
    public final /* synthetic */ boolean f223638j;

    /* renamed from: n */
    public final /* synthetic */ String f223639n;

    /* renamed from: o */
    public final /* synthetic */ String f223640o;

    /* renamed from: p */
    public final /* synthetic */ C9198j f223641p;

    /* renamed from: im0.f$a */
    public class C76363a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f223642d;

        public C76363a(View view) {
            this.f223642d = view;
        }

        public void run() {
            this.f223642d.announceForAccessibility(C76362f.this.f223636h);
        }
    }

    public C76362f(C9198j jVar, C81925i2 i2Var, boolean z, C83780d1 d1Var, int i, String str, int i2, boolean z2, String str2, String str3) {
        this.f223641p = jVar;
        this.f223632d = i2Var;
        this.f223633e = z;
        this.f223634f = d1Var;
        this.f223635g = i;
        this.f223636h = str;
        this.f223637i = i2;
        this.f223638j = z2;
        this.f223639n = str2;
        this.f223640o = str3;
    }

    public void run() {
        if (!this.f223632d.isRunning()) {
            Log.m105928w("MicroMsg.JsApiShowToast", "service is not running");
            return;
        }
        View inflate = this.f223633e ? LayoutInflater.from(this.f223634f.getContext()).inflate(C0966R.C0971layout.f6470fq, this.f223634f.f244552D, false) : LayoutInflater.from(this.f223634f.getContext()).inflate(C0966R.C0971layout.f6471fr, this.f223634f.f244552D, false);
        if (this.f223638j) {
            new C76364g(this, inflate);
        }
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.knx);
        if (!Util.isNullOrNil(this.f223636h)) {
            textView.setLineSpacing(0.0f, 1.0f);
            textView.setSpannableFactory(new C76367i(this, C76577a.m92157h(textView.getContext(), C0966R.dimen.f3967lp)));
            textView.setText(this.f223636h, TextView.BufferType.SPANNABLE);
            textView.setVisibility(0);
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new C76366h(this, textView));
            if (!this.f223633e) {
                inflate.findViewById(C0966R.C0970id.jkd).setPadding(0, C76577a.m92151b(textView.getContext(), 27), 0, 0);
            }
        } else {
            textView.setVisibility(8);
        }
        if (!this.f223633e) {
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f358476fd0);
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(C0966R.C0970id.i7j);
            if (this.f223639n.equals("loading")) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            } else {
                imageView.setVisibility(0);
                progressBar.setVisibility(8);
                Drawable drawable = null;
                if (!Util.isNullOrNil(this.f223640o)) {
                    Bitmap b = C83762b1.m102898b(this.f223632d.getRuntime(), this.f223640o);
                    if (b != null && !b.isRecycled()) {
                        drawable = new BitmapDrawable(imageView.getResources(), b);
                    }
                } else {
                    drawable = this.f223639n.equals("error") ? this.f223632d.getContext().getResources().getDrawable(C0966R.C0969drawable.f357098com) : this.f223632d.getContext().getResources().getDrawable(C0966R.C0969drawable.cop);
                    drawable.mutate().setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
                }
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
            }
        }
        this.f223634f.f244570T.mo125168b(false);
        this.f223634f.f244570T.mo125171e(inflate, (long) this.f223635g);
        inflate.post(new C76363a(inflate));
        this.f223632d.mo109647a(this.f223637i, this.f223641p.mo115109j("ok"));
    }
}
