package go3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: go3.e */
public class C76004e extends ActionBar {

    /* renamed from: a */
    public ActionBar f222859a;

    /* renamed from: b */
    public View f222860b;

    public C76004e(ActionBar actionBar) {
        this.f222859a = actionBar;
    }

    /* renamed from: N */
    public static ActionBar m91288N(ActionBar actionBar) {
        return actionBar == null ? actionBar : new C76004e(actionBar);
    }

    /* renamed from: B */
    public void mo91084B(boolean z) {
        this.f222859a.mo91084B(z);
    }

    /* renamed from: C */
    public void mo91085C(int i) {
        this.f222859a.mo91085C(i);
    }

    /* renamed from: D */
    public void mo91086D(boolean z) {
        this.f222859a.mo91086D(z);
    }

    /* renamed from: E */
    public void mo91087E(boolean z) {
        this.f222859a.mo91087E(z);
    }

    /* renamed from: F */
    public void mo91088F(boolean z) {
        this.f222859a.mo91088F(z);
    }

    /* renamed from: G */
    public void mo91089G(float f) {
        this.f222859a.mo91089G(f);
    }

    /* renamed from: H */
    public void mo91090H(int i) {
        this.f222859a.mo91090H(i);
    }

    /* renamed from: I */
    public void mo91091I(Drawable drawable) {
        this.f222859a.mo91091I(drawable);
    }

    /* renamed from: L */
    public void mo91094L() {
        this.f222859a.mo91094L();
    }

    /* renamed from: O */
    public final void mo106228O() {
        if (this.f222859a.mo91099j() == null) {
            Log.m105924i("MicroMsg.MMActionBarProxy", "updateMenuView, getCustomView is null.");
            this.f222860b = null;
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f222859a.mo91099j().findViewById(C0966R.C0970id.f357825by3);
        if (viewGroup == null) {
            this.f222860b = null;
            Log.m105924i("MicroMsg.MMActionBarProxy", "preSetCustomView, mActionbar.customMenuContainerOutside is null.");
            return;
        }
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f357824by2);
        if (!(findViewById instanceof ViewGroup)) {
            this.f222860b = null;
            Log.m105924i("MicroMsg.MMActionBarProxy", "preSetCustomView, menuView no instanceof ViewGroup.");
            return;
        }
        Log.m105924i("MicroMsg.MMActionBarProxy", "preSetCustomView,, ((ViewGroup)menuView).getChildCount(): " + ((ViewGroup) findViewById).getChildCount() + ", menuView = " + findViewById);
        View findViewById2 = findViewById.findViewById(C0966R.C0970id.f357824by2);
        this.f222860b = findViewById2;
        mo106229P(findViewById2);
        Log.m105924i("MicroMsg.MMActionBarProxy", "preSetCustomView, menuViewCache: " + this.f222860b);
    }

    /* renamed from: P */
    public final void mo106229P(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
            Log.m105924i("MicroMsg.MMActionBarProxy", "removeParentHold, menuView is hasparent, has ? " + view.getParent());
        }
    }

    /* renamed from: Q */
    public final void mo106230Q() {
        View j = this.f222859a.mo91099j();
        if (j == null) {
            Log.m105924i("MicroMsg.MMActionBarProxy", "updateMenuView, getCustomView is null.");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) j.findViewById(C0966R.C0970id.f357825by3);
        if (viewGroup == null) {
            Log.m105924i("MicroMsg.MMActionBarProxy", "updateMenuView, customMenuContainerOutside is null.");
        } else if (!(this.f222860b instanceof ViewGroup)) {
            Log.m105924i("MicroMsg.MMActionBarProxy", "preSetCustomView, menuView no instanceof ViewGroup.");
        } else {
            Log.m105924i("MicroMsg.MMActionBarProxy", "updateMenuView, menuViewCache = ." + this.f222860b + ", menuView childCount = " + ((ViewGroup) this.f222860b).getChildCount() + ", customMenuContainerOutside = " + viewGroup);
            mo106229P(this.f222860b);
            viewGroup.removeAllViews();
            viewGroup.addView(this.f222860b);
        }
    }

    /* renamed from: j */
    public View mo91099j() {
        return this.f222859a.mo91099j();
    }

    /* renamed from: k */
    public int mo91100k() {
        return this.f222859a.mo91100k();
    }

    /* renamed from: l */
    public int mo91101l() {
        return this.f222859a.mo91101l();
    }

    /* renamed from: m */
    public Context mo91102m() {
        return this.f222859a.mo91102m();
    }

    /* renamed from: n */
    public CharSequence mo91103n() {
        return this.f222859a.mo91103n();
    }

    /* renamed from: o */
    public void mo91104o() {
        this.f222859a.mo91104o();
    }

    /* renamed from: q */
    public boolean mo91106q() {
        return this.f222859a.mo91106q();
    }

    /* renamed from: w */
    public void mo91112w(Drawable drawable) {
        this.f222859a.mo91112w(drawable);
    }

    /* renamed from: x */
    public void mo91113x(int i) {
        mo106228O();
        this.f222859a.mo91113x(i);
        mo106230Q();
    }

    /* renamed from: y */
    public void mo91114y(View view) {
        mo106228O();
        this.f222859a.mo91114y(view);
        mo106230Q();
    }

    /* renamed from: z */
    public void mo91115z(View view, ActionBar.LayoutParams layoutParams) {
        mo106228O();
        this.f222859a.mo91115z(view, layoutParams);
        mo106230Q();
    }
}
