package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import bp3.C79758p;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.plugin.location.p069ui.RemarkUI;
import com.tencent.p014mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import oa1.C117731d;
import p206nj.C88956h;
import p629ny.C76979h;
import p702ts.C78083b;
import p702ts.C78085c;
import tf3.C101877q;
import x22.C102550b;
import x22.C91134d;
import y22.C118910b;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.a */
public abstract class C94161a extends C118910b {

    /* renamed from: d */
    public Activity f271948d;

    /* renamed from: e */
    public C91134d f271949e;

    /* renamed from: f */
    public int f271950f = 0;

    /* renamed from: g */
    public LocationInfo f271951g = new LocationInfo(false);

    /* renamed from: h */
    public LocationInfo f271952h = new LocationInfo(false);

    /* renamed from: i */
    public a$$c f271953i;

    /* renamed from: j */
    public HashMap<String, C102550b> f271954j = new HashMap<>();

    /* renamed from: n */
    public C78083b f271955n;

    /* renamed from: o */
    public String f271956o;

    /* renamed from: p */
    public String f271957p = "";

    /* renamed from: q */
    public ArrayList<String> f271958q = new ArrayList<>();

    /* renamed from: r */
    public int f271959r;

    /* renamed from: s */
    public String f271960s = "";

    /* renamed from: t */
    public SoSoMapView f271961t;

    /* renamed from: u */
    public long f271962u;

    /* renamed from: v */
    public String f271963v = "";

    /* renamed from: w */
    public C92411b f271964w;

    /* renamed from: x */
    public C78083b.C78084a f271965x = new a$$b(this);

    public C94161a(Activity activity) {
        this.f271948d = activity;
        this.f271955n = ((C78085c) C86312j.m106911c(C78085c.class)).oe0();
    }

    /* renamed from: a */
    public boolean mo129355a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        Log.m105918d("MicroMsg.BaseMapUI", "dispatchKeyEvent");
        mo129357j();
        this.f271948d.finish();
        return true;
    }

    /* renamed from: d */
    public void mo129356d() {
        this.f271948d.finish();
    }

    /* renamed from: j */
    public abstract void mo129357j();

    /* renamed from: k */
    public abstract void mo129358k();

    /* renamed from: l */
    public void mo129359l() {
        Intent intent = new Intent(this.f271948d, RemarkUI.class);
        intent.putExtra("key_nullable", true);
        intent.putExtra("key_value", Util.nullAs(this.f271956o, ""));
        intent.putExtra("key_hint", this.f271948d.getString(C0966R.string.gbc));
        intent.putExtra("Kwebmap_locaion", this.f271951g.f271933h);
        intent.putExtra("kFavInfoLocalId", mo129361n().getLongExtra("kFavInfoLocalId", -1));
        intent.putExtra("kRemark", mo129361n().getStringExtra("kRemark"));
        Activity activity = this.f271948d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4096);
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "editRemark", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: m */
    public View mo129360m(int i) {
        return this.f271948d.findViewById(i);
    }

    /* renamed from: n */
    public Intent mo129361n() {
        return this.f271948d.getIntent();
    }

    /* renamed from: o */
    public abstract int mo129362o();

    /* renamed from: p */
    public void mo129363p() {
        View currentFocus;
        IBinder windowToken;
        InputMethodManager inputMethodManager = (InputMethodManager) this.f271948d.getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = this.f271948d.getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    /* renamed from: q */
    public boolean mo129364q() {
        boolean z = this.f271950f == 10;
        C101877q qVar = new C101877q();
        if (!z) {
            return C117731d.m166007c().mo182440a(qVar) == 1 || C79758p.f233760a.mo109883f(qVar) == 1;
        }
        return false;
    }

    /* renamed from: r */
    public void mo129365r() {
        Class cls = C76979h.class;
        a$$c a__c = this.f271953i;
        TextView textView = a__c.f271975i;
        if (textView != null && a__c.f271976j != null) {
            textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f271953i.f271975i.getContext(), this.f271956o, this.f271953i.f271975i.getTextSize()));
            ArrayList<String> arrayList = this.f271958q;
            if (arrayList == null || arrayList.isEmpty()) {
                this.f271953i.f271976j.setText("");
                return;
            }
            String str = this.f271958q.get(0);
            String string = this.f271948d.getResources().getString(C0966R.string.cry);
            for (int i = 1; i < this.f271958q.size(); i++) {
                str = str + string + this.f271958q.get(i);
            }
            this.f271953i.f271976j.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f271953i.f271976j.getContext(), str, this.f271953i.f271976j.getTextSize()));
        }
    }

    /* renamed from: s */
    public void mo129366s(int i) {
        this.f271953i.f271974h.setBackgroundColor(i);
        Boolean valueOf = Boolean.valueOf(C74933u4.m89770g(i));
        if (valueOf.booleanValue()) {
            this.f271953i.f271968b.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
            this.f271953i.f271969c.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
            this.f271953i.f271973g.setTextColor(MMApplicationContext.getResources().getColor(C0966R.color.al_));
        } else {
            this.f271953i.f271968b.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f271953i.f271969c.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f271953i.f271973g.setTextColor(MMApplicationContext.getResources().getColor(C0966R.color.f3139gn));
        }
        int i2 = Build.VERSION.SDK_INT;
        Window window = this.f271948d.getWindow();
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        if (i2 < 23 || C88956h.m111064e()) {
            i = C74933u4.m89765b(this.f271948d.getResources().getColor(C0966R.color.aec), i);
        }
        this.f271948d.getWindow().setStatusBarColor(i);
        if (i2 >= 23) {
            View decorView = this.f271948d.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility((valueOf.booleanValue() ? systemUiVisibility & -8193 : systemUiVisibility | 8192) | 1280);
        }
    }
}
