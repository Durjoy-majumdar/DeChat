package fp0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.utils.html.C84746b;
import go3.C87282f;
import gy3.C87412m;
import in3.C87763b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ke3.C88144b;
import p385u2.C111105a;
import p849e3.C107168a0;
import p849e3.C107207u;
import rx3.C13598b0;
import wq0.C91072j;
import z04.C112551y;

/* renamed from: fp0.l */
public final class C87060l extends C87763b implements C91072j {

    /* renamed from: A */
    public boolean f252636A;

    /* renamed from: w */
    public final TextView f252637w;

    /* renamed from: x */
    public final TextView f252638x;

    /* renamed from: y */
    public String f252639y;

    /* renamed from: z */
    public String f252640z;

    /* renamed from: fp0.l$a */
    public static final class C87061a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C87060l f252641d;

        public C87061a(C87060l lVar) {
            this.f252641d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePrivacyExplainPresenterUIView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f252641d.mo121520S();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePrivacyExplainPresenterUIView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fp0.l$b */
    public static final class C87062b extends C87282f {

        /* renamed from: a */
        public final /* synthetic */ C87060l f252642a;

        public C87062b(C87060l lVar) {
            this.f252642a = lVar;
        }

        public void onAnimationEnd(Animation animation) {
            C8180a.m8260a(this.f252642a);
        }
    }

    /* renamed from: fp0.l$c */
    public static final class C87063c implements C84746b.C40567a {

        /* renamed from: a */
        public final /* synthetic */ C87060l f252643a;

        public C87063c(C87060l lVar) {
            this.f252643a = lVar;
        }

        /* renamed from: a */
        public final void mo63415a(String str) {
            Context context = this.f252643a.getContext();
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("forceHideShare", true);
            C13598b0 b0Var = C13598b0.f38549a;
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87060l(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6405dy, this, true);
        setBackgroundColor(C111105a.m151500b(context, C0966R.color.al6));
        mo122166H(false);
        View findViewById = findViewById(C0966R.C0970id.i2t);
        C87412m.m108593f(findViewById, "this.findViewById(R.id.privacy_explain_title)");
        this.f252637w = (TextView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.i2s);
        C87412m.m108593f(findViewById2, "this.findViewById(R.id.privacy_explain_content)");
        this.f252638x = (TextView) findViewById2;
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.f5442f9);
        weImageView.setIconColor(C111105a.m151500b(context, C0966R.color.BW_0_Alpha_0_9));
        weImageView.setOnClickListener(new C87061a(this));
    }

    /* renamed from: S */
    public final void mo121520S() {
        if (!this.f252636A) {
            this.f252636A = true;
            animate().cancel();
            Animation animation = getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), MMFragmentActivity$$c.f318647d);
            loadAnimation.setAnimationListener(new C87062b(this));
            startAnimation(loadAnimation);
        }
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(this)) {
            boolean z = false;
            if (keyEvent != null && 4 == keyEvent.getKeyCode()) {
                z = true;
            }
            if (z && (keyDispatcherState = getKeyDispatcherState()) != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (1 == keyEvent.getAction() && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    mo121520S();
                    return true;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public final String getExplainContent() {
        return this.f252640z;
    }

    public final String getExplainTitle() {
        return this.f252639y;
    }

    /* renamed from: o */
    public void mo121451o(C81879g gVar) {
        ViewGroup viewGroup;
        C87412m.m108594g(gVar, "component");
        Context context = gVar.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (viewGroup = (ViewGroup) activity.findViewById(16908290)) != null) {
            viewGroup.addView(this, new ViewGroup.LayoutParams(-1, -1));
            bringToFront();
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestFocus();
            getViewTreeObserver().addOnPreDrawListener(new C87064m(this, this));
        }
    }

    public final void setExplainContent(String str) {
        this.f252640z = str;
        if (str == null || C112551y.m153811k(str)) {
            this.f252638x.setText("");
            return;
        }
        this.f252638x.setText(C84746b.m104407a(str, false, new C87063c(this)));
        this.f252638x.setMovementMethod(LinkMovementMethod.getInstance());
        this.f252638x.setLinkTextColor(Color.parseColor("#FF576B95"));
    }

    public final void setExplainTitle(String str) {
        if (str == null || str.length() == 0) {
            str = getContext().getString(C0966R.string.a7l);
        }
        this.f252639y = str;
        this.f252637w.setText(str);
    }
}
