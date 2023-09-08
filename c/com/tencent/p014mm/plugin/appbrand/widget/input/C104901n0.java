package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import at0.C103915c;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import java.util.WeakHashMap;
import kg3.C76577a;
import p849e3.C107168a0;
import p849e3.C107207u;
import pt0.C110246a;
import to0.C90561a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.n0 */
public final class C104901n0 extends LinearLayout implements C84956g1 {

    /* renamed from: o */
    public static final /* synthetic */ int f311479o = 0;

    /* renamed from: d */
    public View f311480d;

    /* renamed from: e */
    public boolean f311481e = false;

    /* renamed from: f */
    public C104902a f311482f;

    /* renamed from: g */
    public AppBrandNumberKeyboardView f311483g;

    /* renamed from: h */
    public EditText f311484h;

    /* renamed from: i */
    public View f311485i;

    /* renamed from: j */
    public C90561a f311486j = null;

    /* renamed from: n */
    public boolean f311487n = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.n0$a */
    public interface C104902a {
        void onDone();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104901n0(Context context) {
        super(context);
        ViewGroup viewGroup;
        Log.m105918d("MicroMsg.AppBrandNumberKeyboardPanel", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        super.setId(C0966R.C0970id.f5933so);
        setOrientation(1);
        setBackgroundColor(-1);
        if (this.f311487n) {
            C90561a aVar = this.f311486j;
            this.f311485i = aVar;
            if (!(aVar == null || (viewGroup = (ViewGroup) aVar.getParent()) == null)) {
                Log.m105925i("MicroMsg.AppBrandNumberKeyboardPanel", "toolbar is already exsited in a layout,the class of the parent is %s  the id is : %d", viewGroup.getClass().toString(), Integer.valueOf(viewGroup.getId()));
                viewGroup.removeView(this.f311485i);
            }
            addView(this.f311485i);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, C76577a.m92151b(getContext(), 30));
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6508gq, (ViewGroup) null);
        this.f311480d = inflate;
        C103915c.m138604a(inflate, Button.class, Integer.valueOf(C0966R.string.mjg), false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a<Boolean>) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null);
        this.f311480d.setOnClickListener(new C104896m0(this));
        addView(this.f311480d, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, C76577a.m92151b(getContext(), 240));
        AppBrandNumberKeyboardView appBrandNumberKeyboardView = new AppBrandNumberKeyboardView(getContext());
        this.f311483g = appBrandNumberKeyboardView;
        addView(appBrandNumberKeyboardView, layoutParams2);
    }

    /* renamed from: v */
    public static C104901n0 m140624v(View view, C90561a aVar) {
        C104901n0 n0Var = (C104901n0) view.getRootView().findViewById(C0966R.C0970id.f5933so);
        if (n0Var == null) {
            C85004y d = C85004y.m104825d(view);
            if (d == null) {
                return null;
            }
            C104901n0 n0Var2 = new C104901n0(view.getContext());
            d.mo117919a(n0Var2, false);
            n0Var = n0Var2;
        }
        if (n0Var.f311486j != aVar) {
            Log.m105918d("MicroMsg.AppBrandNumberKeyboardPanel", "mComponentView != componentView so we set mComponentView = componentView;");
            n0Var.f311486j = aVar;
        }
        return n0Var;
    }

    public EditText getAttachedEditText() {
        return this.f311484h;
    }

    public int getMinimumHeight() {
        C90561a aVar;
        C83873p2 customViewContainer;
        if (getVisibility() == 0 && this.f311487n && (aVar = this.f311486j) != null && (customViewContainer = aVar.getCustomViewContainer()) != null) {
            ViewGroup viewGroup = customViewContainer.f244867a;
            if ((viewGroup instanceof ViewGroup) && viewGroup.getChildCount() > 0 && customViewContainer.f244867a.getChildAt(0).getLayoutParams() != null) {
                return Math.max(customViewContainer.f244867a.getChildAt(0).getLayoutParams().height, 0);
            }
        }
        return 0;
    }

    public int getPanelHeight() {
        return C76577a.m92151b(getContext(), 270);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    /* renamed from: q */
    public boolean mo117827q() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return C107207u.C107211e.m145208c(this);
    }

    public void setComponentView(boolean z) {
        this.f311487n = z;
    }

    public void setId(int i) {
    }

    public <_Input extends EditText & C110246a> void setInputEditText(_Input _input) {
        this.f311484h = _input;
        this.f311483g.mo148706e((C110246a) _input);
    }

    public <_InputEventReceiver extends C110246a> void setInputEventReceiver(_InputEventReceiver _inputeventreceiver) {
        this.f311483g.mo148706e(_inputeventreceiver);
    }

    public void setOnDoneListener(C104902a aVar) {
        this.f311482f = aVar;
    }

    public void setVisibility(int i) {
        C104902a aVar;
        if (getVisibility() != i || (getVisibility() != 0 && getVisibility() != 8)) {
            if (i != 0) {
                super.setVisibility(8);
                if (!this.f311481e && (aVar = this.f311482f) != null) {
                    this.f311481e = true;
                    aVar.onDone();
                    this.f311481e = false;
                    return;
                }
                return;
            }
            super.setVisibility(i);
        }
    }

    public void setXMode(int i) {
        this.f311483g.setXMode(i);
    }

    /* renamed from: t */
    public void mo148875t(View view) {
        ViewGroup viewGroup;
        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
            viewGroup.removeView(view);
        }
    }

    /* renamed from: w */
    public void mo148876w() {
        View view;
        View view2;
        if (this.f311487n && this.f311485i == null) {
            C90561a aVar = this.f311486j;
            this.f311485i = aVar;
            mo148875t(aVar);
            addView(this.f311485i, 0);
        }
        if (this.f311487n && (view2 = this.f311485i) != this.f311486j) {
            mo148875t(view2);
            C90561a aVar2 = this.f311486j;
            this.f311485i = aVar2;
            mo148875t(aVar2);
            addView(this.f311485i, 0);
            Log.m105918d("MicroMsg.AppBrandNumberKeyboardPanel", "toolbar is changed in updateToolbar() because toolbar != mComponentView");
        }
        if (this.f311487n && this.f311485i.getParent() != this) {
            mo148875t(this.f311485i);
            addView(this.f311485i, 0);
        }
        if (!this.f311487n && (view = this.f311485i) != null && view.getParent() == this) {
            removeView(this.f311485i);
        }
    }
}
