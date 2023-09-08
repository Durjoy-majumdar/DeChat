package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.exdevice.model.C2242s0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import p003ay.C0235b;
import p447aw.C103918d;
import p910lj.C76701a;
import qo3.C89779i0;
import r71.C63376a;
import r71.C63377b;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI */
public class ExdeviceConnectWifiUI extends MMActivity {

    /* renamed from: I */
    public static final /* synthetic */ int f52385I = 0;

    /* renamed from: A */
    public boolean f52386A = false;

    /* renamed from: B */
    public C63377b f52387B;

    /* renamed from: C */
    public C18727n f52388C;

    /* renamed from: D */
    public C29060q f52389D;

    /* renamed from: E */
    public C2242s0.C2243a f52390E;

    /* renamed from: F */
    public WifiManager.MulticastLock f52391F;

    /* renamed from: G */
    public Runnable f52392G = new C18719e();

    /* renamed from: H */
    public boolean f52393H = true;

    /* renamed from: d */
    public View f52394d;

    /* renamed from: e */
    public TextView f52395e;

    /* renamed from: f */
    public View f52396f;

    /* renamed from: g */
    public EditText f52397g;

    /* renamed from: h */
    public View f52398h;

    /* renamed from: i */
    public TextWatcher f52399i;

    /* renamed from: j */
    public C89779i0 f52400j;

    /* renamed from: n */
    public String f52401n;

    /* renamed from: o */
    public C63376a f52402o;

    /* renamed from: p */
    public boolean f52403p;

    /* renamed from: q */
    public boolean f52404q;

    /* renamed from: r */
    public int f52405r;

    /* renamed from: s */
    public byte[] f52406s;

    /* renamed from: t */
    public int f52407t;

    /* renamed from: u */
    public int f52408u;

    /* renamed from: v */
    public int f52409v;

    /* renamed from: w */
    public String f52410w = "";

    /* renamed from: x */
    public String f52411x = "";

    /* renamed from: y */
    public int f52412y;

    /* renamed from: z */
    public long f52413z;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$b */
    public class C18716b implements Runnable {
        public C18716b() {
        }

        public void run() {
            ExdeviceConnectWifiUI exdeviceConnectWifiUI = ExdeviceConnectWifiUI.this;
            String str = exdeviceConnectWifiUI.f52401n;
            String nullAsNil = Util.nullAsNil(exdeviceConnectWifiUI.mo23574L7());
            if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid is null or nil.");
                return;
            }
            if (Util.isNullOrNil(exdeviceConnectWifiUI.f52402o.f179777e) || (str.equals(exdeviceConnectWifiUI.f52402o.f179777e) && !nullAsNil.equals(exdeviceConnectWifiUI.f52402o.f179778f))) {
                C63376a K7 = exdeviceConnectWifiUI.mo23573K7(exdeviceConnectWifiUI.f52405r, str);
                if (K7 == null) {
                    K7 = new C63376a();
                    K7.f179777e = str;
                    K7.f179776d = exdeviceConnectWifiUI.f52405r;
                    exdeviceConnectWifiUI.f52387B.f179779d.add(K7);
                }
                K7.f179778f = ((C0235b) C86312j.m106911c(C0235b.class)).mo259Ce(nullAsNil, C18728m.m19501a(exdeviceConnectWifiUI.f52405r, str));
            } else if (!exdeviceConnectWifiUI.f52403p) {
                Log.m105924i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "password hasn't changed, so do not need to save.");
                return;
            }
            String str2 = C86709a0.m107535s().f251806d + "exdevice_wifi_infos";
            try {
                byte[] byteArray = exdeviceConnectWifiUI.f52387B.toByteArray();
                C86013q1.m106438T(str2, byteArray, 0, byteArray.length);
            } catch (IOException e) {
                Log.m105918d("MicroMsg.exdevice.ExdeviceConnectWifiUI", e.getMessage());
                Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceConnectWifiUI", e, "", new Object[0]);
            }
            Log.m105927v("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Current wifiInfo was save to file(%s).", str2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$c */
    public class C18717c implements DialogInterface.OnClickListener {
        public C18717c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(ExdeviceConnectWifiUI.this.getContext());
            ExdeviceConnectWifiUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$d */
    public class C18718d implements DialogInterface.OnClickListener {
        public C18718d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ExdeviceConnectWifiUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$e */
    public class C18719e implements Runnable {
        public C18719e() {
        }

        public void run() {
            ExdeviceConnectWifiUI exdeviceConnectWifiUI = ExdeviceConnectWifiUI.this;
            int i = ExdeviceConnectWifiUI.f52385I;
            if (!Util.isNullOrNil(exdeviceConnectWifiUI.mo23574L7())) {
                Log.m105924i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "User has input password.");
                return;
            }
            ExdeviceConnectWifiUI exdeviceConnectWifiUI2 = ExdeviceConnectWifiUI.this;
            exdeviceConnectWifiUI2.f52397g.setText(exdeviceConnectWifiUI2.f52402o.f179778f);
            Editable text = ExdeviceConnectWifiUI.this.f52397g.getText();
            if (text != null) {
                Selection.setSelection(text, text.length());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$f */
    public class C18720f extends C29060q.C29061a {

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$f$a */
        public class C18721a implements Runnable {
            public C18721a() {
            }

            public void run() {
                ExdeviceConnectWifiUI exdeviceConnectWifiUI = ExdeviceConnectWifiUI.this;
                if (exdeviceConnectWifiUI.f52388C != C18727n.FINISH) {
                    exdeviceConnectWifiUI.mo23576N7(true);
                }
            }
        }

        public C18720f() {
        }

        public void onNetworkChange(int i) {
            MMHandlerThread.postToMainThread(new C18721a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$g */
    public class C18722g implements C2242s0.C2243a {

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$g$a */
        public class C18723a implements Runnable {
            public C18723a() {
            }

            public void run() {
                ExdeviceConnectWifiUI.this.mo23578P7(C18727n.FINISH);
            }
        }

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$g$b */
        public class C18724b implements Runnable {

            /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$g$b$a */
            public class C18725a implements DialogInterface.OnClickListener {
                public C18725a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    ExdeviceConnectWifiUI.this.mo23578P7(C18727n.TIMEOUT);
                }
            }

            public C18724b() {
            }

            public void run() {
                C89779i0 i0Var = ExdeviceConnectWifiUI.this.f52400j;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                C76879j.m92709C(ExdeviceConnectWifiUI.this.getContext(), ExdeviceConnectWifiUI.this.getContext().getString(C0966R.string.cbr), "", ExdeviceConnectWifiUI.this.getContext().getString(C0966R.string.f360388cd2), "", false, new C18725a(), (DialogInterface.OnClickListener) null).show();
            }
        }

        public C18722g() {
        }

        /* renamed from: a */
        public void mo2128a(int i, Object... objArr) {
            if (i == 0 && objArr != null && objArr.length >= 2) {
                Integer num = objArr[0];
                if ((num instanceof Integer) && (objArr[1] instanceof Integer)) {
                    int intValue = num.intValue();
                    int intValue2 = objArr[1].intValue();
                    if (ExdeviceConnectWifiUI.this.f52391F.isHeld()) {
                        ExdeviceConnectWifiUI.this.f52391F.release();
                    }
                    Log.m105925i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "AirKiss jni callback (%d, %d)", Integer.valueOf(intValue), Integer.valueOf(intValue2));
                    if (intValue == 0 && intValue2 == 0) {
                        MMHandlerThread.postToMainThread(new C18723a());
                    } else {
                        ExdeviceConnectWifiUI.this.runOnUiThread(new C18724b());
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$h */
    public class C18726h implements MenuItem.OnMenuItemClickListener {
        public C18726h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!ExdeviceConnectWifiUI.this.f52404q) {
                Intent intent = new Intent();
                intent.putExtra("is_wifi_connected", ExdeviceConnectWifiUI.this.f52388C != C18727n.NO_WIFI_CONNECTED);
                ExdeviceConnectWifiUI.this.setResult(0, intent);
                ExdeviceConnectWifiUI.this.finish();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$n */
    public enum C18727n {
        NORMAL,
        NO_WIFI_CONNECTED,
        SETTING,
        FINISH,
        TIMEOUT
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$m */
    public static class C18728m {
        /* renamed from: a */
        public static String m19501a(int i, String str) {
            if (Util.isNullOrNil(str)) {
                return null;
            }
            return i + "@" + str.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$a */
    public class C18729a implements View.OnKeyListener {
        public C18729a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$10", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (66 == i && keyEvent.getAction() == 0) {
                ExdeviceConnectWifiUI.m19491H7(ExdeviceConnectWifiUI.this);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$10", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$10", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$i */
    public class C18730i implements TextWatcher {
        public C18730i() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.length() > 31) {
                View view = ExdeviceConnectWifiUI.this.f52396f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$6", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$6", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ExdeviceConnectWifiUI.this.f52398h.setEnabled(false);
                return;
            }
            View view2 = ExdeviceConnectWifiUI.this.f52396f;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$6", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$6", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ExdeviceConnectWifiUI.this.f52398h.setEnabled(true);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$j */
    public class C18731j implements View.OnTouchListener {
        public C18731j() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            ExdeviceConnectWifiUI.this.f52397g.clearFocus();
            ExdeviceConnectWifiUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$k */
    public class C18732k implements View.OnClickListener {
        public C18732k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "onClick connectBtn.");
            ExdeviceConnectWifiUI.m19491H7(ExdeviceConnectWifiUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$l */
    public class C18733l implements TextView.OnEditorActionListener {
        public C18733l() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return false;
            }
            Log.m105924i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "on next Key down.");
            ExdeviceConnectWifiUI.m19491H7(ExdeviceConnectWifiUI.this);
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m19491H7(ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        exdeviceConnectWifiUI.f52386A = true;
        exdeviceConnectWifiUI.f52413z = System.currentTimeMillis();
        exdeviceConnectWifiUI.mo23577O7(3);
        String L7 = exdeviceConnectWifiUI.mo23574L7();
        String str = exdeviceConnectWifiUI.f52401n;
        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "do start AirKiss, ssid(%s).", str);
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid is invalid");
            C76701a.makeText((Context) exdeviceConnectWifiUI.getContext(), (CharSequence) "SSID is invalid", 0).show();
            return;
        }
        exdeviceConnectWifiUI.mo23578P7(C18727n.SETTING);
        C86709a0.m107525e().postToWorker(new C18736c(exdeviceConnectWifiUI, L7, str));
    }

    /* renamed from: I7 */
    public final void mo23571I7(boolean z, boolean z2, boolean z3) {
        View view = this.f52394d;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI", "changeUiStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI", "changeUiStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z2) {
            runOnUiThread(new C18739e(this));
        } else {
            runOnUiThread(new C18741f(this));
            if (this.f52391F.isHeld()) {
                this.f52391F.release();
            }
        }
        if (z3) {
            C76701a.makeText((Context) getContext(), (int) C0966R.string.cd9, 0).show();
        }
    }

    /* renamed from: J7 */
    public final void mo23572J7() {
        C63376a aVar = this.f52402o;
        aVar.f179778f = "";
        aVar.f179777e = "";
        String str = this.f52401n;
        C63376a K7 = mo23573K7(this.f52405r, str);
        if (K7 != null && !Util.isNullOrNil(str)) {
            if (Util.isNullOrNil(K7.f179778f)) {
                Log.m105924i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Do not have a local password to fill for the current wifi.");
                this.f52387B.f179779d.remove(K7);
                this.f52403p = true;
                return;
            }
            this.f52402o.f179778f = ((C0235b) C86312j.m106911c(C0235b.class)).mo259Ce(K7.f179778f, C18728m.m19501a(this.f52405r, K7.f179777e));
            this.f52402o.f179777e = K7.f179777e;
            MMHandlerThread.postToMainThread(this.f52392G);
        }
    }

    /* renamed from: K7 */
    public final C63376a mo23573K7(int i, String str) {
        if (Util.isNullOrNil(str) || this.f52387B == null) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid or wifiInfoList is null or nil.");
            return null;
        }
        int i2 = 0;
        while (i2 < this.f52387B.f179779d.size()) {
            C63376a aVar = this.f52387B.f179779d.get(i2);
            if (aVar == null) {
                this.f52387B.f179779d.remove(i2);
                this.f52403p = true;
                i2--;
            } else if (aVar.f179776d == i && str.equals(aVar.f179777e)) {
                return aVar;
            }
            i2++;
        }
        return null;
    }

    /* renamed from: L7 */
    public final String mo23574L7() {
        if (this.f52397g.getText() != null) {
            return this.f52397g.getText().toString();
        }
        return null;
    }

    /* renamed from: M7 */
    public final void mo23575M7() {
        Intent intent = new Intent();
        intent.putExtra("device_scan_mode", getIntent().getStringExtra("device_scan_mode"));
        intent.putExtra("device_scan_conn_proto", getIntent().getStringExtra("device_scan_conn_proto"));
        intent.putExtra(TPDownloadProxyEnum.USER_DEVICE_ID, getIntent().getStringExtra(TPDownloadProxyEnum.USER_DEVICE_ID));
        intent.putExtra("device_type", getIntent().getStringExtra("device_type"));
        intent.putExtra("device_title", getIntent().getStringExtra("device_title"));
        intent.putExtra("device_desc", getIntent().getStringExtra("device_desc"));
        intent.putExtra("device_icon_url", getIntent().getStringExtra("device_icon_url"));
        intent.putExtra("device_category_id", getIntent().getStringExtra("device_category_id"));
        intent.putExtra("device_brand_name", getIntent().getStringExtra("device_brand_name"));
        intent.putExtra("bind_ticket", getIntent().getStringExtra("bind_ticket"));
        C88144b.m109791i(getContext(), "exdevice", ".ui.ExdeviceBindDeviceUI", intent, (Bundle) null);
    }

    /* renamed from: N7 */
    public final void mo23576N7(boolean z) {
        C18727n nVar = z ? C18727n.NORMAL : this.f52388C;
        if (NetStatusUtil.getNetType((Context) this) != 0) {
            nVar = C18727n.NO_WIFI_CONNECTED;
        } else {
            String formattedWiFiSsid = ConnectivityCompat.Companion.getFormattedWiFiSsid();
            this.f52401n = formattedWiFiSsid;
            Log.m105925i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Get SSID(%s)", formattedWiFiSsid);
            if (!Util.isNullOrNil(this.f52401n)) {
                this.f52395e.setText(this.f52401n);
            } else {
                this.f52395e.setText("");
            }
        }
        mo23578P7(nVar);
    }

    /* renamed from: O7 */
    public final void mo23577O7(int i) {
        C115669n.INSTANCE.mo160131h(13503, Integer.valueOf(i), Integer.valueOf(this.f52409v), Long.valueOf(i == 4 ? System.currentTimeMillis() - this.f52413z : 0), this.f52410w, this.f52411x, Integer.valueOf(this.f52412y));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        return;
     */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo23578P7(com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceConnectWifiUI.C18727n r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L_0x000c
            java.lang.String r6 = "MicroMsg.exdevice.ExdeviceConnectWifiUI"
            java.lang.String r0 = "Status is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ all -> 0x0073 }
            monitor-exit(r5)
            return
        L_0x000c:
            r5.f52388C = r6     // Catch:{ all -> 0x0073 }
            int r0 = r6.ordinal()     // Catch:{ all -> 0x0073 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 == r2) goto L_0x005e
            r3 = 2
            if (r0 == r3) goto L_0x005a
            r3 = 3
            r4 = 4
            if (r0 == r3) goto L_0x002f
            if (r0 == r4) goto L_0x0022
            goto L_0x0065
        L_0x0022:
            r0 = 5
            r5.mo23577O7(r0)     // Catch:{ all -> 0x0073 }
            r5.f52404q = r2     // Catch:{ all -> 0x0073 }
            r5.setResult(r2)     // Catch:{ all -> 0x0073 }
            r5.finish()     // Catch:{ all -> 0x0073 }
            goto L_0x0065
        L_0x002f:
            r5.mo23577O7(r4)     // Catch:{ all -> 0x0073 }
            r5.mo23571I7(r2, r1, r2)     // Catch:{ all -> 0x0073 }
            r5.f52404q = r2     // Catch:{ all -> 0x0073 }
            r0 = -1
            r5.setResult(r0)     // Catch:{ all -> 0x0073 }
            com.tencent.mm.sdk.platformtools.MMHandlerThread r0 = f40.C86709a0.m107525e()     // Catch:{ all -> 0x0073 }
            com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$b r2 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$b     // Catch:{ all -> 0x0073 }
            r2.<init>()     // Catch:{ all -> 0x0073 }
            r0.postToWorker(r2)     // Catch:{ all -> 0x0073 }
            android.content.Intent r0 = r5.getIntent()     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "jumpToBindDevice"
            boolean r0 = r0.getBooleanExtra(r2, r1)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0056
            r5.mo23575M7()     // Catch:{ all -> 0x0073 }
        L_0x0056:
            r5.finish()     // Catch:{ all -> 0x0073 }
            goto L_0x0065
        L_0x005a:
            r5.mo23571I7(r2, r2, r1)     // Catch:{ all -> 0x0073 }
            goto L_0x0065
        L_0x005e:
            r5.mo23571I7(r1, r1, r1)     // Catch:{ all -> 0x0073 }
            goto L_0x0065
        L_0x0062:
            r5.mo23571I7(r2, r1, r1)     // Catch:{ all -> 0x0073 }
        L_0x0065:
            com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$n r0 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceConnectWifiUI.C18727n.NORMAL     // Catch:{ all -> 0x0073 }
            if (r6 == r0) goto L_0x0071
            android.widget.EditText r6 = r5.f52397g     // Catch:{ all -> 0x0073 }
            r6.clearFocus()     // Catch:{ all -> 0x0073 }
            r5.hideVKB()     // Catch:{ all -> 0x0073 }
        L_0x0071:
            monitor-exit(r5)
            return
        L_0x0073:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceConnectWifiUI.mo23578P7(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$n):void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a46;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.cd6);
        setBackBtn(new C18726h());
        this.f52394d = findViewById(C0966R.C0970id.jco);
        this.f52395e = (TextView) findViewById(C0966R.C0970id.h_3);
        this.f52396f = findViewById(C0966R.C0970id.f5778od);
        this.f52397g = (EditText) findViewById(C0966R.C0970id.hrg);
        this.f52398h = findViewById(C0966R.C0970id.blz);
        this.f52399i = new C18730i();
        this.f52394d.setOnTouchListener(new C18731j());
        this.f52398h.setOnClickListener(new C18732k());
        this.f52397g.setTransformationMethod(new PasswordTransformationMethod());
        this.f52397g.addTextChangedListener(this.f52399i);
        this.f52397g.setOnEditorActionListener(new C18733l());
        this.f52397g.setOnKeyListener(new C18729a());
        this.f52397g.requestFocus();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (r3 == false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            r12 = 28
            boolean r12 = p206nj.C11171e.m11045b(r12)
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L_0x001a
            java.lang.String r12 = android.os.Build.VERSION.CODENAME
            java.lang.String r2 = "Q"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r12 = 0
            goto L_0x001b
        L_0x001a:
            r12 = 1
        L_0x001b:
            java.lang.String r2 = "MicroMsg.exdevice.ExdeviceConnectWifiUI"
            if (r12 == 0) goto L_0x0086
            java.lang.Class<aw.d> r12 = p447aw.C103918d.class
            boolean r3 = r11.f52393H
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            if (r3 == 0) goto L_0x004d
            di3.d r3 = di3.C86312j.m106911c(r12)
            r5 = r3
            aw.d r5 = (p447aw.C103918d) r5
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r7 = new java.lang.String[]{r4, r3}
            r8 = 77
            r9 = 0
            r10 = 0
            r6 = r11
            boolean r3 = r5.Uu0(r6, r7, r8, r9, r10)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r5[r1] = r6
            java.lang.String r6 = "checkPermission checkLocation [%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
            if (r3 != 0) goto L_0x004d
            goto L_0x0086
        L_0x004d:
            di3.d r12 = di3.C86312j.m106911c(r12)
            aw.d r12 = (p447aw.C103918d) r12
            boolean r12 = r12.Lb0(r11, r4)
            if (r12 == 0) goto L_0x0086
            boolean r12 = com.tencent.p014mm.sdk.platformtools.LocationUtil.isGpsEnable()
            if (r12 != 0) goto L_0x0086
            r12 = 2131831054(0x7f11290e, float:1.9295123E38)
            java.lang.String r4 = r11.getString(r12)
            r12 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r5 = r11.getString(r12)
            r12 = 2131831713(0x7f112ba1, float:1.929646E38)
            java.lang.String r6 = r11.getString(r12)
            r12 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r7 = r11.getString(r12)
            r8 = 0
            com.tencent.mm.plugin.exdevice.ui.g r9 = new com.tencent.mm.plugin.exdevice.ui.g
            r9.<init>(r11)
            r10 = 0
            r3 = r11
            nj3.C76879j.m92709C(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0086:
            com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$f r12 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$f
            r12.<init>()
            r11.f52389D = r12
            com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$n r12 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceConnectWifiUI.C18727n.NORMAL
            r11.f52388C = r12
            boolean r12 = f40.C86709a0.m107522a()
            if (r12 != 0) goto L_0x009b
            r11.finish()
            return
        L_0x009b:
            r71.b r12 = new r71.b
            r12.<init>()
            r11.f52387B = r12
            r71.a r12 = new r71.a
            r12.<init>()
            r11.f52402o = r12
            f40.e r12 = f40.C86709a0.m107523b()
            int r12 = r12.mo121110g()
            r11.f52405r = r12
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r3 = "encryptKey"
            java.lang.String r12 = r12.getStringExtra(r3)
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r4 = "procInterval"
            int r3 = r3.getIntExtra(r4, r1)
            r11.f52407t = r3
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r4 = "dataInterval"
            int r3 = r3.getIntExtra(r4, r1)
            r11.f52408u = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Process interval:"
            r3.append(r4)
            int r4 = r11.f52407t
            r3.append(r4)
            java.lang.String r4 = " Data interval:"
            r3.append(r4)
            int r4 = r11.f52408u
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r2 != 0) goto L_0x0104
            byte[] r12 = android.util.Base64.decode(r12, r1)
            r11.f52406s = r12
            r11.f52412y = r0
        L_0x0104:
            r11.f52386A = r1
            android.content.Intent r12 = r11.getIntent()
            android.os.Bundle r12 = r12.getExtras()
            java.lang.String r2 = "exdevice_airkiss_open_type"
            int r12 = r12.getInt(r2)
            r11.f52409v = r12
            r2 = 2
            if (r12 != r2) goto L_0x0131
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r2 = "device_brand_name"
            java.lang.String r12 = r12.getStringExtra(r2)
            r11.f52410w = r12
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r2 = "device_category_id"
            java.lang.String r12 = r12.getStringExtra(r2)
            r11.f52411x = r12
        L_0x0131:
            com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$g r12 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI$g
            r12.<init>()
            r11.f52390E = r12
            com.tencent.mm.plugin.exdevice.model.s0 r12 = com.tencent.p014mm.plugin.exdevice.model.C2242s0.m2051a()
            com.tencent.mm.plugin.exdevice.model.s0$a r2 = r11.f52390E
            r12.mo2132c(r1, r2)
            r11.initView()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r12 = f40.C86709a0.m107525e()
            com.tencent.mm.plugin.exdevice.ui.d r1 = new com.tencent.mm.plugin.exdevice.ui.d
            r1.<init>(r11)
            r12.postToWorker(r1)
            r11.mo23577O7(r0)
            android.content.Context r12 = r11.getApplicationContext()
            java.lang.String r0 = "wifi"
            java.lang.Object r12 = r12.getSystemService(r0)
            android.net.wifi.WifiManager r12 = (android.net.wifi.WifiManager) r12
            java.lang.String r0 = "localWifi"
            android.net.wifi.WifiManager$MulticastLock r12 = r12.createMulticastLock(r0)
            r11.f52391F = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceConnectWifiUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.f52386A) {
            mo23577O7(2);
        }
        C2242s0.m2051a().mo2133d(0, this.f52390E);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 77 && iArr.length > 0 && iArr[0] == -1) {
            this.f52393H = false;
            C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C18717c(), new C18718d());
        }
    }

    public void onResume() {
        super.onResume();
        mo23576N7(false);
        C86709a0.m107529k().mo121126a(this.f52389D);
    }

    public void onStop() {
        super.onStop();
        C86709a0.m107529k().mo121129d(this.f52389D);
    }
}
