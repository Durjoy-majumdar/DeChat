package com.tencent.p014mm.plugin.account.security.p023ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.account.security.p023ui.MySafeDeviceListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.XWebCleaner;
import di3.C86312j;
import f40.C86709a0;
import ft3.C8206g;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p156gj.C87203t;
import p214om.C11502f;
import p910lj.C76701a;
import rg0.C13000e;
import rg0.C13003h;
import ug0.C14186f;
import ug0.C14188g;

/* renamed from: com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference */
public class SafeDeviceListPreference extends Preference implements C11385n {

    /* renamed from: J */
    public Context f10615J;

    /* renamed from: K */
    public C13000e f10616K;

    /* renamed from: L */
    public int f10617L;

    /* renamed from: M */
    public ProgressDialog f10618M;

    /* renamed from: N */
    public boolean f10619N;

    /* renamed from: P */
    public Button f10620P;

    /* renamed from: Q */
    public TextView f10621Q;

    /* renamed from: R */
    public C1395b f10622R;

    /* renamed from: S */
    public C1396c f10623S;

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference$a */
    public class C1394a implements View.OnClickListener {
        public C1394a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/security/ui/SafeDeviceListPreference$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SafeDeviceListPreference safeDeviceListPreference = SafeDeviceListPreference.this;
            Context context = safeDeviceListPreference.f10615J;
            C76879j.m92707A(context, safeDeviceListPreference.f10616K.field_online ? context.getString(C0966R.string.nfb) : context.getString(C0966R.string.nfa), "", C76577a.m92166q(safeDeviceListPreference.f10615J, C0966R.string.i_x), C76577a.m92166q(safeDeviceListPreference.f10615J, C0966R.string.f7926wf), new C14186f(safeDeviceListPreference), new C14188g(safeDeviceListPreference)).mo107526f(-1).setTextColor(safeDeviceListPreference.f121274d.getResources().getColor(C0966R.color.f2966ao));
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/security/ui/SafeDeviceListPreference$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference$b */
    public interface C1395b {
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference$c */
    public interface C1396c {
    }

    public SafeDeviceListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: I */
    public final void mo1362I() {
        if (!this.f10619N) {
            Log.m105918d("MicroMsg.SafeDeviceListPreference", "has not binded");
            return;
        }
        if (this.f10621Q == null || !C8206g.f27135a.mo9260a(this.f10616K.field_uid, C87203t.m108273i(), "SafeDeviceListPreference", false)) {
            this.f10621Q.setVisibility(8);
        } else {
            this.f10621Q.setVisibility(0);
            this.f10621Q.setText(C0966R.string.nfs);
        }
        int i = this.f10617L;
        if (i == -2) {
            this.f121272H = 0;
            mo69921C(0);
        } else if (i != 1) {
            this.f121272H = 0;
            mo69921C(0);
        } else {
            this.f121272H = C0966R.C0971layout.f7122yy;
            Button button = this.f10620P;
            if (button != null) {
                button.setOnClickListener(new C1394a());
            }
            mo69921C(8);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107524d().mo123470p(XWebCleaner.MIN_APK_VERSION_HAS_RESOURCE_CONFIG_FILE, this);
        ProgressDialog progressDialog = this.f10618M;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f10618M.dismiss();
            this.f10618M = null;
        }
        if (i2 == 0 && i2 == 0) {
            C13003h.vx0().delete(this.f10616K, new String[0]);
            C1396c cVar = this.f10623S;
            if (cVar != null) {
                MySafeDeviceListUI.C1393h hVar = (MySafeDeviceListUI.C1393h) cVar;
                MySafeDeviceListUI.this.f10594d.mo72531o(this.f121285r);
                MySafeDeviceListUI.this.f10605r.sendEmptyMessage(0);
                MySafeDeviceListUI mySafeDeviceListUI = MySafeDeviceListUI.this;
                mySafeDeviceListUI.addTextOptionMenu(0, mySafeDeviceListUI.getString(C0966R.string.i_z), MySafeDeviceListUI.this.f10604q);
                MySafeDeviceListUI mySafeDeviceListUI2 = MySafeDeviceListUI.this;
                mySafeDeviceListUI2.f10595e = ~mySafeDeviceListUI2.f10595e;
                mySafeDeviceListUI2.mo1350I7();
            }
        } else if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this.f10615J, i, i2, str)) {
            Context context = this.f10615J;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.i_y, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            if (this.f10622R != null) {
                String str2 = this.f10616K.field_uid;
                Log.m105920e("MicroMsg.MySafeDeviceListUI", "delete safedevice failed" + str2);
            }
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        this.f10619N = true;
        this.f10620P = (Button) view.findViewById(C0966R.C0970id.c0i);
        this.f10621Q = (TextView) view.findViewById(C0966R.C0970id.ew5);
        mo1362I();
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        LayoutInflater layoutInflater = (LayoutInflater) this.f10615J.getSystemService("layout_inflater");
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            layoutInflater.inflate(C0966R.C0971layout.be8, viewGroup2);
        }
        return x;
    }

    public SafeDeviceListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10617L = -2;
        this.f10619N = false;
        this.f10615J = context;
    }
}
