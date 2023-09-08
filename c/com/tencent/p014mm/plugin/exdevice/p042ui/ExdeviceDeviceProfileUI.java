package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.ExDeviceBindHardDeviceEvent;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.exdevice.model.C41135i1;
import com.tencent.p014mm.plugin.exdevice.model.C41137j1;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.exdevice.model.C41170u0;
import com.tencent.p014mm.plugin.exdevice.model.C41173v0;
import com.tencent.p014mm.plugin.exdevice.model.C41175x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import d81.C45288e;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p227rn.C48054w;
import p910lj.C76701a;
import pj3.C47511g;
import qo3.C89779i0;
import te3.C49697hf2;
import z71.C53753b;
import z71.C53754c;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI */
public class ExdeviceDeviceProfileUI extends MMPreference implements C11385n {

    /* renamed from: y */
    public static final /* synthetic */ int f111080y = 0;

    /* renamed from: d */
    public C89779i0 f111081d = null;

    /* renamed from: e */
    public C89779i0 f111082e;

    /* renamed from: f */
    public String f111083f;

    /* renamed from: g */
    public long f111084g;

    /* renamed from: h */
    public String f111085h;

    /* renamed from: i */
    public String f111086i;

    /* renamed from: j */
    public String f111087j;

    /* renamed from: n */
    public String f111088n;

    /* renamed from: o */
    public String f111089o;

    /* renamed from: p */
    public int f111090p;

    /* renamed from: q */
    public String f111091q;

    /* renamed from: r */
    public String f111092r;

    /* renamed from: s */
    public boolean f111093s;

    /* renamed from: t */
    public String f111094t;

    /* renamed from: u */
    public String f111095u;

    /* renamed from: v */
    public boolean f111096v;

    /* renamed from: w */
    public String f111097w;

    /* renamed from: x */
    public C76879j.C47267l f111098x;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$a */
    public class C41250a implements MenuItem.OnMenuItemClickListener {
        public C41250a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExdeviceDeviceProfileUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$b */
    public class C41251b implements C76879j.C47267l {

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$b$a */
        public class C41252a implements Runnable {
            public C41252a() {
            }

            public void run() {
                ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = ExdeviceDeviceProfileUI.this;
                int i = ExdeviceDeviceProfileUI.f111080y;
                exdeviceDeviceProfileUI.mo64321H7((DeviceProfileHeaderPreference) exdeviceDeviceProfileUI.getPreferenceScreen().mo72519a("device_profile_header"));
            }
        }

        public C41251b() {
        }

        public boolean onFinish(CharSequence charSequence) {
            Log.m105919d("MicroMsg.ExdeviceDeviceProfileUI", "result : %s.", charSequence);
            String charSequence2 = charSequence != null ? charSequence.toString() : "";
            ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = ExdeviceDeviceProfileUI.this;
            if (exdeviceDeviceProfileUI.f111096v) {
                exdeviceDeviceProfileUI.f111091q = charSequence2;
                exdeviceDeviceProfileUI.runOnUiThread(new C41252a());
                C53754c Bx0 = C41166r1.Bx0();
                ExdeviceDeviceProfileUI exdeviceDeviceProfileUI2 = ExdeviceDeviceProfileUI.this;
                C53753b Ow = Bx0.mo74330Ow(exdeviceDeviceProfileUI2.f111087j, exdeviceDeviceProfileUI2.f111088n);
                if (Ow == null) {
                    ExdeviceDeviceProfileUI exdeviceDeviceProfileUI3 = ExdeviceDeviceProfileUI.this;
                    Log.m105925i("MicroMsg.ExdeviceDeviceProfileUI", "hard device info is null.(deviceId:%s, deviceType:%s)", exdeviceDeviceProfileUI3.f111087j, exdeviceDeviceProfileUI3.f111088n);
                    return false;
                }
                Ow.f150113y = ExdeviceDeviceProfileUI.this.f111091q;
                Ow.f150108t = true;
                C41166r1.Bx0().update(Ow, new String[0]);
            } else {
                C41137j1 j1Var = new C41137j1(exdeviceDeviceProfileUI.f111087j, exdeviceDeviceProfileUI.f111088n, charSequence2, 0);
                ExdeviceDeviceProfileUI exdeviceDeviceProfileUI4 = ExdeviceDeviceProfileUI.this;
                exdeviceDeviceProfileUI4.getClass();
                exdeviceDeviceProfileUI4.runOnUiThread(new C41342l(exdeviceDeviceProfileUI4, j1Var));
                C86709a0.m107529k().f251779b.mo123455a(1263, ExdeviceDeviceProfileUI.this);
                C86709a0.m107529k().f251779b.mo123460f(j1Var);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$c */
    public class C41253c implements View.OnClickListener {
        public C41253c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceDeviceProfileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = ExdeviceDeviceProfileUI.this;
            C76879j.m92720N(exdeviceDeviceProfileUI, exdeviceDeviceProfileUI.getString(C0966R.string.cds), "", "", 50, ExdeviceDeviceProfileUI.this.f111098x);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceDeviceProfileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$d */
    public class C41254d implements View.OnClickListener {
        public C41254d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceDeviceProfileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = ExdeviceDeviceProfileUI.this;
            String string = exdeviceDeviceProfileUI.getString(C0966R.string.cds);
            ExdeviceDeviceProfileUI exdeviceDeviceProfileUI2 = ExdeviceDeviceProfileUI.this;
            C76879j.m92720N(exdeviceDeviceProfileUI, string, exdeviceDeviceProfileUI2.f111091q, "", 50, exdeviceDeviceProfileUI2.f111098x);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceDeviceProfileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$e */
    public class C41255e implements Runnable {
        public C41255e() {
        }

        public void run() {
            ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = ExdeviceDeviceProfileUI.this;
            exdeviceDeviceProfileUI.f111093s = true;
            exdeviceDeviceProfileUI.mo64323J7();
            ExdeviceDeviceProfileUI.this.getPreferenceScreen().notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$f */
    public class C41256f implements Runnable {
        public C41256f() {
        }

        public void run() {
            ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = ExdeviceDeviceProfileUI.this;
            exdeviceDeviceProfileUI.f111093s = true;
            exdeviceDeviceProfileUI.mo64323J7();
            ExdeviceDeviceProfileUI.this.getPreferenceScreen().notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$g */
    public class C41257g implements Runnable {
        public C41257g() {
        }

        public void run() {
            ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = ExdeviceDeviceProfileUI.this;
            int i = ExdeviceDeviceProfileUI.f111080y;
            exdeviceDeviceProfileUI.mo64321H7((DeviceProfileHeaderPreference) exdeviceDeviceProfileUI.getPreferenceScreen().mo72519a("device_profile_header"));
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$h */
    public class C41258h implements Runnable {
        public C41258h() {
        }

        public void run() {
            ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = ExdeviceDeviceProfileUI.this;
            exdeviceDeviceProfileUI.f111091q = null;
            exdeviceDeviceProfileUI.f111093s = false;
            exdeviceDeviceProfileUI.mo64323J7();
            ExdeviceDeviceProfileUI.this.getPreferenceScreen().notifyDataSetChanged();
        }
    }

    /* renamed from: H7 */
    public final void mo64321H7(DeviceProfileHeaderPreference deviceProfileHeaderPreference) {
        String str = Util.isNullOrNil(this.f111092r) ? this.f111085h : this.f111092r;
        if (!Util.isNullOrNil(this.f111091q)) {
            String str2 = this.f111091q;
            deviceProfileHeaderPreference.f110976U = str2;
            TextView textView = deviceProfileHeaderPreference.f110967K;
            if (textView != null) {
                textView.setText(str2);
            }
            String string = getString(C0966R.string.cdl, new Object[]{str});
            deviceProfileHeaderPreference.f110975T = string;
            TextView textView2 = deviceProfileHeaderPreference.f110969M;
            if (textView2 != null) {
                textView2.setText(string);
            }
            deviceProfileHeaderPreference.mo64270L(3, true);
            deviceProfileHeaderPreference.mo64270L(4, true);
            deviceProfileHeaderPreference.mo64270L(1, false);
        } else {
            deviceProfileHeaderPreference.f110976U = str;
            TextView textView3 = deviceProfileHeaderPreference.f110967K;
            if (textView3 != null) {
                textView3.setText(str);
            }
            deviceProfileHeaderPreference.f110975T = "";
            TextView textView4 = deviceProfileHeaderPreference.f110969M;
            if (textView4 != null) {
                textView4.setText("");
            }
            deviceProfileHeaderPreference.mo64270L(3, false);
            deviceProfileHeaderPreference.mo64270L(4, false);
            deviceProfileHeaderPreference.mo64270L(1, this.f111093s);
        }
        String str3 = this.f111094t;
        deviceProfileHeaderPreference.f110974S = str3;
        TextView textView5 = deviceProfileHeaderPreference.f110971P;
        if (textView5 != null) {
            textView5.setText(str3);
        }
    }

    /* renamed from: I7 */
    public final void mo64322I7(C53753b bVar) {
        if (bVar != null) {
            this.f111087j = bVar.field_deviceID;
            this.f111088n = bVar.field_deviceType;
            this.f111091q = Util.nullAsNil(bVar.f150113y);
            this.f111092r = Util.nullAsNil(bVar.f150085B);
            this.f111085h = Util.nullAsNil(bVar.field_brandName);
            this.f111094t = Util.nullAsNil(bVar.f150086C);
            this.f111095u = Util.nullAsNil(bVar.f150114z);
            this.f111086i = Util.nullAsNil(bVar.f150084A);
        }
    }

    /* renamed from: J7 */
    public final void mo64323J7() {
        C47511g preferenceScreen = getPreferenceScreen();
        DeviceProfileHeaderPreference deviceProfileHeaderPreference = (DeviceProfileHeaderPreference) preferenceScreen.mo72519a("device_profile_header");
        deviceProfileHeaderPreference.mo64269K(1, new C41253c());
        deviceProfileHeaderPreference.mo64269K(4, new C41254d());
        mo64321H7(deviceProfileHeaderPreference);
        deviceProfileHeaderPreference.mo64268J(this.f111095u);
        ((KeyValuePreference) preferenceScreen.mo72519a("message_manage")).mo69912I(true);
        ((KeyValuePreference) preferenceScreen.mo72519a("connect_setting")).mo69912I(true);
        ((KeyValuePreference) preferenceScreen.mo72519a("user_list")).mo69912I(true);
        preferenceScreen.mo72529n("message_manage", true);
        preferenceScreen.mo72529n("connect_setting", true);
        preferenceScreen.mo72529n("user_list", true);
        if (this.f111096v) {
            preferenceScreen.mo72529n("sub_device_desc", false);
            preferenceScreen.mo72519a("sub_device_desc").mo69924H(getResources().getString(C0966R.string.f360399cg3, new Object[]{this.f111097w}));
            preferenceScreen.mo72529n("bind_device", true);
            preferenceScreen.mo72529n("unbind_device", true);
        } else {
            preferenceScreen.mo72529n("sub_device_desc", true);
            preferenceScreen.mo72529n("bind_device", this.f111093s);
            preferenceScreen.mo72529n("unbind_device", !this.f111093s);
        }
        if (Util.isNullOrNil(this.f111086i)) {
            preferenceScreen.mo72529n("open_device_panel", true);
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8889aj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018f, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r8.f111089o) != false) goto L_0x01a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$a r9 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$a
            r9.<init>()
            r8.setBackBtn(r9)
            r9 = 2131825204(0x7f111234, float:1.9283258E38)
            r8.setMMTitle((int) r9)
            androidx.appcompat.app.AppCompatActivity r9 = r8.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r0 = 2131101833(0x7f060889, float:1.7816087E38)
            int r9 = r9.getColor(r0)
            r8.setActionbarColor(r9)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$b r9 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI$b
            r9.<init>()
            r8.f111098x = r9
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r0 = "device_mac"
            java.lang.String r0 = r9.getStringExtra(r0)
            r8.f111083f = r0
            r0 = 0
            java.lang.String r2 = "device_ble_simple_proto"
            long r0 = r9.getLongExtra(r2, r0)
            r8.f111084g = r0
            java.lang.String r0 = "device_jump_url"
            java.lang.String r0 = r9.getStringExtra(r0)
            r8.f111086i = r0
            java.lang.String r0 = "device_brand_name"
            java.lang.String r0 = r9.getStringExtra(r0)
            r8.f111085h = r0
            java.lang.String r0 = "device_id"
            java.lang.String r0 = r9.getStringExtra(r0)
            r8.f111087j = r0
            java.lang.String r0 = "device_type"
            java.lang.String r0 = r9.getStringExtra(r0)
            r8.f111088n = r0
            java.lang.String r0 = "bind_ticket"
            java.lang.String r0 = r9.getStringExtra(r0)
            r8.f111089o = r0
            java.lang.String r0 = "subscribe_flag"
            r1 = 0
            int r0 = r9.getIntExtra(r0, r1)
            r8.f111090p = r0
            java.lang.String r0 = "device_has_bound"
            boolean r0 = r9.getBooleanExtra(r0, r1)
            r8.f111093s = r0
            java.lang.String r0 = "device_title"
            java.lang.String r0 = r9.getStringExtra(r0)
            r8.f111092r = r0
            java.lang.String r0 = "device_alias"
            java.lang.String r0 = r9.getStringExtra(r0)
            r8.f111091q = r0
            java.lang.String r0 = "device_desc"
            java.lang.String r0 = r9.getStringExtra(r0)
            r8.f111094t = r0
            java.lang.String r0 = "device_icon_url"
            java.lang.String r9 = r9.getStringExtra(r0)
            r8.f111095u = r9
            java.lang.String r9 = r8.f111087j
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r0 = 2
            java.lang.String r2 = "MicroMsg.ExdeviceDeviceProfileUI"
            r3 = 1
            if (r9 != 0) goto L_0x0194
            java.lang.String r9 = r8.f111088n
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x00b0
            goto L_0x0194
        L_0x00b0:
            z71.c r9 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            java.lang.String r4 = r8.f111087j
            java.lang.String r5 = r8.f111088n
            z71.b r9 = r9.mo74330Ow(r4, r5)
            if (r9 == 0) goto L_0x0189
            r8.f111093s = r3
            java.lang.String r4 = r8.f111091q
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x00d0
            java.lang.String r4 = r9.f150113y
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r8.f111091q = r4
        L_0x00d0:
            java.lang.String r4 = r8.f111092r
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x00e0
            java.lang.String r4 = r9.f150085B
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r8.f111092r = r4
        L_0x00e0:
            java.lang.String r4 = r8.f111085h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x00f0
            java.lang.String r4 = r9.field_brandName
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r8.f111085h = r4
        L_0x00f0:
            java.lang.String r4 = r8.f111094t
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0100
            java.lang.String r4 = r9.f150086C
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r8.f111094t = r4
        L_0x0100:
            java.lang.String r4 = r8.f111095u
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0110
            java.lang.String r4 = r9.f150114z
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r8.f111095u = r4
        L_0x0110:
            java.lang.String r4 = r8.f111086i
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0120
            java.lang.String r4 = r9.f150084A
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r8.f111086i = r4
        L_0x0120:
            int r9 = r9.f150089F
            if (r9 != r0) goto L_0x0192
            r8.f111096v = r3
            java.lang.String r9 = r8.f111092r
            r8.f111097w = r9
            z71.c r9 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            java.util.List r9 = r9.mo74335bF()
            java.util.Iterator r9 = r9.iterator()
        L_0x0136:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r9.next()
            z71.b r0 = (z71.C53753b) r0
            java.lang.String r4 = r0.field_deviceType
            java.lang.String r5 = r8.f111088n
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0136
            java.lang.String r4 = r0.f150094K
            if (r4 == 0) goto L_0x0136
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x0136
            java.lang.String r5 = ","
            java.lang.String[] r4 = r4.split(r5)
            r5 = 0
        L_0x015d:
            int r6 = r4.length
            if (r5 >= r6) goto L_0x0136
            r6 = r4[r5]
            java.lang.String r7 = r8.f111087j
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0186
            java.lang.String r6 = r0.f150113y
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0177
            java.lang.String r6 = r0.f150085B
            r8.f111097w = r6
            goto L_0x017b
        L_0x0177:
            java.lang.String r6 = r0.f150113y
            r8.f111097w = r6
        L_0x017b:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = r8.f111097w
            r6[r1] = r7
            java.lang.String r7 = "mGateWayTitle %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r6)
        L_0x0186:
            int r5 = r5 + 1
            goto L_0x015d
        L_0x0189:
            java.lang.String r9 = r8.f111089o
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0192
            goto L_0x01a3
        L_0x0192:
            r1 = 1
            goto L_0x01a3
        L_0x0194:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r0 = r8.f111087j
            r9[r1] = r0
            java.lang.String r0 = r8.f111088n
            r9[r3] = r0
            java.lang.String r0 = "deviceId or deviceType is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r9)
        L_0x01a3:
            if (r1 != 0) goto L_0x01b7
            androidx.appcompat.app.AppCompatActivity r9 = r8.getContext()
            r0 = 2131825265(0x7f111271, float:1.9283381E38)
            android.widget.Toast r9 = p910lj.C76701a.makeText((android.content.Context) r9, (int) r0, (int) r3)
            r9.show()
            r8.finish()
            return
        L_0x01b7:
            r8.mo64323J7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceDeviceProfileUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C86709a0.m107529k().f251779b.mo123470p(537, this);
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str;
        Log.m105919d("MicroMsg.ExdeviceDeviceProfileUI", "onPreferenceTreeClcik.(key : %s)", preference.f121285r);
        if ("bind_device".equals(preference.f121285r)) {
            if (Util.isNullOrNil(this.f111089o)) {
                Log.m105924i("MicroMsg.ExdeviceDeviceProfileUI", "Do unauth bind device.");
                C41173v0 v0Var = new C41173v0(C45288e.m50137h(this.f111083f), this.f111085h, "3", this.f111084g);
                runOnUiThread(new C41342l(this, v0Var));
                C86709a0.m107529k().f251779b.mo123455a(1262, this);
                C86709a0.m107529k().f251779b.mo123460f(v0Var);
            } else {
                Log.m105924i("MicroMsg.ExdeviceDeviceProfileUI", "Do normal bind device.");
                String str2 = this.f111089o;
                int i = this.f111090p;
                C86709a0.m107529k().f251779b.mo123455a(536, this);
                ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = new ExDeviceBindHardDeviceEvent();
                ExDeviceBindHardDeviceEvent.C40057a aVar = exDeviceBindHardDeviceEvent.f107424d;
                aVar.f107426a = str2;
                aVar.f107428c = 1;
                aVar.f107427b = i;
                exDeviceBindHardDeviceEvent.publish();
                this.f111081d = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.cch), true, true, new C41352n(this, exDeviceBindHardDeviceEvent.f107425e.f107430a));
            }
        } else if ("unbind_device".equals(preference.f121285r)) {
            C49697hf2 hf22 = new C49697hf2();
            hf22.f134597e = this.f111087j;
            hf22.f134596d = this.f111088n;
            C53753b Ow = C41166r1.Bx0().mo74330Ow(this.f111087j, this.f111088n);
            if (!(Ow == null || (str = Ow.f150094K) == null || str.length() <= 0)) {
                String[] split = str.split(",");
                for (String jo : split) {
                    C41166r1.Bx0().mo74336jo(jo, this.f111088n);
                }
            }
            C41135i1 i1Var = new C41135i1(hf22, 2);
            runOnUiThread(new C41342l(this, i1Var));
            C86709a0.m107529k().f251779b.mo123455a(537, this);
            C86709a0.m107529k().f251779b.mo123460f(i1Var);
        } else if ("open_device_panel".equals(preference.f121285r)) {
            C41175x.m44617c(getContext(), this.f111086i);
        } else if ("contact_info_biz_go_chatting".equals(preference.f121285r)) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f111085h);
            Intent intent = new Intent();
            intent.putExtra(TPDownloadProxyEnum.USER_DEVICE_ID, this.f111087j);
            intent.putExtra("device_type", this.f111088n);
            intent.putExtra("KIsHardDevice", true);
            intent.putExtra("KHardDeviceBindTicket", this.f111089o);
            if (z1Var != null) {
                if (!z1Var.mo62927s3() || !z1Var.mo62916m3() || ((C48054w) C86312j.m106911c(C48054w.class)).get(z1Var.getUsername()) == null) {
                    intent.putExtra("Contact_User", this.f111085h);
                    intent.putExtra("force_get_contact", true);
                    C88144b.m109791i(getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                } else {
                    intent.putExtra("Chat_User", this.f111085h);
                    intent.putExtra("finish_direct", true);
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent, getContext());
                }
            }
        } else if (!"message_manage".equals(preference.f121285r) && !"connect_setting".equals(preference.f121285r) && !"user_list".equals(preference.f121285r)) {
            return false;
        }
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105919d("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar == null) {
            Log.m105920e("MicroMsg.ExdeviceDeviceProfileUI", "scene is null.");
            return;
        }
        Log.m105919d("MicroMsg.ExdeviceDeviceProfileUI", "type = %s", Integer.valueOf(yVar.getType()));
        if (yVar instanceof C41170u0) {
            runOnUiThread(new C41331i(this));
            C86709a0.m107529k().f251779b.mo123470p(yVar.getType(), this);
            if (i == 0 && i2 == 0) {
                runOnUiThread(new C41337k(this));
                mo64322I7(C41166r1.Bx0().mo74330Ow(this.f111087j, this.f111088n));
                runOnUiThread(new C41255e());
                return;
            }
            Log.m105921e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", Integer.valueOf(i2), Integer.valueOf(i), str, Integer.valueOf(yVar.getType()));
            runOnUiThread(new C41333j(this));
        } else if (yVar instanceof C41173v0) {
            runOnUiThread(new C41331i(this));
            C86709a0.m107529k().f251779b.mo123470p(yVar.getType(), this);
            C53753b kD = C41166r1.Bx0().mo74337kD(C45288e.m50137h(this.f111083f));
            if (i == 0 && i2 == 0 && kD != null) {
                mo64322I7(kD);
                runOnUiThread(new C41256f());
                runOnUiThread(new C41337k(this));
                return;
            }
            Log.m105921e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", Integer.valueOf(i2), Integer.valueOf(i), str, Integer.valueOf(yVar.getType()));
            runOnUiThread(new C41333j(this));
        } else if (yVar instanceof C41137j1) {
            runOnUiThread(new C41331i(this));
            C86709a0.m107529k().f251779b.mo123470p(1263, this);
            if (i == 0 && i2 == 0) {
                this.f111091q = ((C41137j1) yVar).f110820g;
                runOnUiThread(new C41257g());
                C53753b Ow = C41166r1.Bx0().mo74330Ow(this.f111087j, this.f111088n);
                if (Ow == null) {
                    Log.m105925i("MicroMsg.ExdeviceDeviceProfileUI", "hard device info is null.(deviceId:%s, deviceType:%s)", this.f111087j, this.f111088n);
                    return;
                }
                Ow.f150113y = this.f111091q;
                Ow.f150108t = true;
                C41166r1.Bx0().update(Ow, new String[0]);
                return;
            }
            Log.m105921e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", Integer.valueOf(i2), Integer.valueOf(i), str, Integer.valueOf(yVar.getType()));
            C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.cdq), 1).show();
        } else if (yVar instanceof C41135i1) {
            runOnUiThread(new C41331i(this));
            if (i == 0 && i2 == 0) {
                runOnUiThread(new C41258h());
                finish();
                return;
            }
            Log.m105921e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd, unbind failed (%d, %d, %s).(type : %d)", Integer.valueOf(i2), Integer.valueOf(i), str, Integer.valueOf(yVar.getType()));
            runOnUiThread(new C41348m(this));
        }
    }
}
