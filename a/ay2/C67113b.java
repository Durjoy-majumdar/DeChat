package ay2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ay2.C67121f;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: ay2.b */
public abstract class C67113b extends FrameLayout {

    /* renamed from: d */
    public final C67114a f192708d;

    /* renamed from: e */
    public final int f192709e;

    /* renamed from: f */
    public final ViewGroup f192710f;

    /* renamed from: g */
    public final TextView f192711g;

    /* renamed from: h */
    public C67121f f192712h = C67121f.f192725f;

    /* renamed from: i */
    public final FrameLayout f192713i;

    /* renamed from: ay2.b$a */
    public interface C67114a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67113b(Context context, C67114a aVar, int i, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        this.f192708d = aVar;
        this.f192709e = i;
        C67121f.C28169a aVar2 = C67121f.f192724e;
        boolean z = true;
        View inflate = LayoutInflater.from(context).inflate((i == 1 || i == 2) ? C0966R.C0971layout.c8f : i != 3 ? i != 5 ? C0966R.C0971layout.c8c : C0966R.C0971layout.c8e : C0966R.C0971layout.c8d, this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f192710f = viewGroup;
        if (mo91216c().length() <= 0 ? false : z) {
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.knx);
            this.f192711g = textView;
            textView.setText(mo91216c());
        } else {
            this.f192711g = null;
        }
        setImportantForAccessibility(2);
        addView(viewGroup);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f357785br0);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.container)");
        this.f192713i = (FrameLayout) findViewById;
    }

    /* renamed from: a */
    public boolean mo91214a(int i) {
        return true;
    }

    /* renamed from: b */
    public abstract void mo91215b();

    /* renamed from: c */
    public abstract String mo91216c();

    /* renamed from: d */
    public boolean mo91217d(int i) {
        return false;
    }

    public final C67114a getCallback() {
        return this.f192708d;
    }

    public final FrameLayout getContainerView() {
        return this.f192713i;
    }

    public final ViewGroup getRoot() {
        return this.f192710f;
    }

    public final int getSectionType() {
        return this.f192709e;
    }

    public final TextView getTitle() {
        return this.f192711g;
    }

    public final C67121f getViewModel() {
        return this.f192712h;
    }

    public void removeItem(int i) {
    }

    public final void setViewModel(C67121f fVar) {
        C87412m.m108594g(fVar, "<set-?>");
        this.f192712h = fVar;
    }
}
