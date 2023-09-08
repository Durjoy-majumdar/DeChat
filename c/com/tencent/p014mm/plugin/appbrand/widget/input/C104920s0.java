package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import to0.C90561a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.s0 */
public final class C104920s0 extends LinearLayout implements C84956g1 {

    /* renamed from: n */
    public static final C104921a f311539n = new C104921a((C8480h) null);

    /* renamed from: d */
    public final int f311540d;

    /* renamed from: e */
    public final String f311541e;

    /* renamed from: f */
    public View f311542f;

    /* renamed from: g */
    public final AppBrandSecureKeyboard f311543g;

    /* renamed from: h */
    public EditText f311544h;

    /* renamed from: i */
    public C104922b f311545i;

    /* renamed from: j */
    public boolean f311546j;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.s0$a */
    public static final class C104921a {
        public C104921a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C104920s0 mo148914a(View view) {
            C87412m.m108594g(view, "view");
            View rootView = view.getRootView();
            C104921a aVar = C104920s0.f311539n;
            return (C104920s0) rootView.findViewById(C0966R.C0970id.f5934sp);
        }

        /* renamed from: b */
        public final C104920s0 mo148915b(View view, boolean z, C90561a aVar) {
            C87412m.m108594g(view, "view");
            C104920s0 a = mo148914a(view);
            if (a != null) {
                a.mo148913v(z, aVar);
                return a;
            }
            C85004y d = C85004y.m104825d(view);
            if (d == null) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandSecureKeyboardPanel", "settleKeyboardPanel, rootFrameLayout is null");
                return null;
            }
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            C104920s0 s0Var = new C104920s0(context, z, aVar);
            d.mo117919a(s0Var, false);
            return s0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.s0$b */
    public interface C104922b {
        void onDone();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104920s0(Context context, boolean z, C90561a aVar) {
        super(context);
        C87412m.m108594g(context, "context");
        int hashCode = hashCode();
        this.f311540d = hashCode;
        String str = "MicroMsg.AppBrand.AppBrandSecureKeyboardPanel#" + hashCode;
        this.f311541e = str;
        AppBrandSecureKeyboard appBrandSecureKeyboard = new AppBrandSecureKeyboard(context);
        this.f311543g = appBrandSecureKeyboard;
        Log.m105918d(str, APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        super.setId(C0966R.C0970id.f5934sp);
        setOrientation(1);
        setBackgroundColor(-1);
        if (z && aVar != null) {
            ViewParent parent = aVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(aVar);
            }
            addView(aVar);
            this.f311542f = aVar;
        }
        addView(appBrandSecureKeyboard, new LinearLayout.LayoutParams(-1, -2));
    }

    public final EditText getAttachedInputWidget() {
        String str = this.f311541e;
        Log.m105918d(str, "getAttachedInputWidget, inputWidget: " + this.f311544h);
        return this.f311544h;
    }

    public void onDetachedFromWindow() {
        Log.m105918d(this.f311541e, "onDetachedFromWindow");
        super.onDetachedFromWindow();
        removeAllViews();
    }

    /* renamed from: q */
    public boolean mo117827q() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        boolean c = C107207u.C107211e.m145208c(this);
        String str = this.f311541e;
        Log.m105918d(str, "isRealHeightSettled, settled: " + c);
        return c;
    }

    public void setId(int i) {
    }

    public final void setInputWidget(EditText editText) {
        String str = this.f311541e;
        Log.m105918d(str, "setInputWidget, inputWidget: " + editText);
        this.f311544h = editText;
        this.f311543g.setInputEditText(editText);
        if (editText != null) {
            editText.setShowSoftInputOnFocus(false);
        }
        if (editText != null) {
            C84975p1.m104767b(editText).hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    public final void setOnDoneListener(C104922b bVar) {
        String str = this.f311541e;
        Log.m105918d(str, "setOnDoneListener, onDoneListener: " + bVar);
        this.f311545i = bVar;
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        String str = this.f311541e;
        Log.m105918d(str, "setVisibility, visibility: " + i + ", curVisibility: " + visibility);
        if (i == visibility && (visibility == 0 || 8 == visibility)) {
            Log.m105924i(this.f311541e, "setVisibility, same visibility");
        } else if (i != 0) {
            super.setVisibility(8);
            Log.m105918d(this.f311541e, "performOnDone");
            if (this.f311546j) {
                Log.m105924i(this.f311541e, "performOnDone, performingOnDone");
                return;
            }
            this.f311546j = true;
            C104922b bVar = this.f311545i;
            if (bVar != null) {
                bVar.onDone();
            }
            this.f311546j = false;
        } else {
            super.setVisibility(i);
        }
    }

    /* renamed from: t */
    public final void mo148911t(EditText editText) {
        Log.m105918d(this.f311541e, "show");
        if (editText == null) {
            Log.m105924i(this.f311541e, "show, inputWidget is null");
            return;
        }
        if (!C87412m.m108589b(editText, this.f311544h)) {
            Log.m105918d(this.f311541e, "resetFocusStatus");
            EditText editText2 = this.f311544h;
            if (editText2 != null) {
                editText2.clearFocus();
                this.f311544h = null;
                this.f311545i = null;
                this.f311546j = false;
            }
        }
        setInputWidget(editText);
        setVisibility(0);
    }

    public String toString() {
        return "AppBrandSecureKeyboardPanel#" + this.f311540d;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo148913v(boolean r4, to0.C90561a r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0031
            android.view.View r4 = r3.f311542f
            if (r4 == 0) goto L_0x0018
            android.view.ViewParent r1 = r4.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0012
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            if (r1 == 0) goto L_0x0018
            r1.removeView(r4)
        L_0x0018:
            if (r5 == 0) goto L_0x002e
            android.view.ViewParent r4 = r5.getParent()
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0025
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.removeView(r5)
        L_0x002a:
            r4 = 0
            r3.addView(r5, r4)
        L_0x002e:
            r3.f311542f = r5
            goto L_0x0044
        L_0x0031:
            android.view.View r4 = r3.f311542f
            if (r4 == 0) goto L_0x0042
            android.view.ViewParent r5 = r4.getParent()
            boolean r5 = gy3.C87412m.m108589b(r3, r5)
            if (r5 == 0) goto L_0x0042
            r3.removeView(r4)
        L_0x0042:
            r3.f311542f = r0
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C104920s0.mo148913v(boolean, to0.a):void");
    }
}
