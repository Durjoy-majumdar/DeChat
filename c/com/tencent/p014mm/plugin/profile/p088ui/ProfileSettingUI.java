package com.tencent.p014mm.plugin.profile.p088ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import df2.C75381g;
import eb0.C97625j3;
import f40.C86709a0;
import md3.C47001b;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.profile.ui.ProfileSettingUI */
public class ProfileSettingUI extends MMPreference implements MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public C72996z1 f20223d;

    /* renamed from: e */
    public C75381g f20224e;

    /* renamed from: com.tencent.mm.plugin.profile.ui.ProfileSettingUI$a */
    public class C4951a implements MenuItem.OnMenuItemClickListener {
        public C4951a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ProfileSettingUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8929bm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ae, code lost:
        if ("3552365301".equals(r7.f20223d.mo73980x2()) != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        if (r7.f20223d.mo62927s3() != false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r7 = this;
            pj3.g r0 = r7.getPreferenceScreen()
            java.lang.String r1 = "setting_remark"
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r1)
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            java.lang.String r2 = r2.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85816S4(r2)
            r3 = 1
            if (r2 != 0) goto L_0x0047
            com.tencent.mm.storage.z1 r1 = r7.f20223d
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85843n5(r1)
            if (r1 == 0) goto L_0x002b
            r1 = 2131824438(0x7f110f36, float:1.9281704E38)
            r0.mo69923G(r1)
            goto L_0x0031
        L_0x002b:
            r1 = 2131824211(0x7f110e53, float:1.9281243E38)
            r0.mo69923G(r1)
        L_0x0031:
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            java.lang.String r2 = r2.mo73969n2()
            android.text.SpannableString r1 = r1.mo107057T1(r7, r2)
            r0.mo7741E(r1)
            goto L_0x004e
        L_0x0047:
            pj3.g r0 = r7.getPreferenceScreen()
            r0.mo72529n(r1, r3)
        L_0x004e:
            pj3.g r0 = r7.getPreferenceScreen()
            java.lang.String r1 = "setting_permission"
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r1)
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            boolean r2 = r2.mo62927s3()
            r4 = 0
            if (r2 != 0) goto L_0x0070
            android.content.Intent r2 = r7.getIntent()
            java.lang.String r5 = "User_Verify"
            boolean r2 = r2.getBooleanExtra(r5, r4)
            if (r2 == 0) goto L_0x0070
            r2 = 1
            goto L_0x0071
        L_0x0070:
            r2 = 0
        L_0x0071:
            java.lang.String r5 = "3552365301"
            if (r2 != 0) goto L_0x00cd
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            java.lang.String r2 = r2.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x00b0
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r6 = "SnsWxWorkPermissionEntrance"
            int r2 = r2.mo107404b(r6, r4)
            if (r2 != r3) goto L_0x0096
            r4 = 1
        L_0x0096:
            if (r4 == 0) goto L_0x00c5
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            java.lang.String r2 = r2.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x00c5
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            java.lang.String r2 = r2.mo73980x2()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00c5
        L_0x00b0:
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            java.lang.String r2 = r2.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85816S4(r2)
            if (r2 != 0) goto L_0x00c5
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            boolean r2 = r2.mo62927s3()
            if (r2 == 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            pj3.g r0 = r7.getPreferenceScreen()
            r0.mo72529n(r1, r3)
            goto L_0x00e6
        L_0x00cd:
            com.tencent.mm.storage.z1 r1 = r7.f20223d
            java.lang.String r1 = r1.mo73980x2()
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00e0
            r1 = 2131824229(0x7f110e65, float:1.928128E38)
            r0.mo69923G(r1)
            goto L_0x00e6
        L_0x00e0:
            r1 = 2131833967(0x7f11346f, float:1.9301031E38)
            r0.mo69923G(r1)
        L_0x00e6:
            pj3.g r0 = r7.getPreferenceScreen()
            java.lang.String r1 = "setting_send_card"
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r1)
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            boolean r2 = r2.mo62927s3()
            r4 = 2
            if (r2 == 0) goto L_0x011c
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            java.lang.String r2 = r2.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85816S4(r2)
            if (r2 != 0) goto L_0x011c
            r1 = 2131824302(0x7f110eae, float:1.9281428E38)
            com.tencent.mm.storage.z1 r2 = r7.f20223d
            int r2 = r2.f149500H
            if (r2 != r3) goto L_0x0113
            r1 = 2131824300(0x7f110eac, float:1.9281424E38)
            goto L_0x0118
        L_0x0113:
            if (r2 != r4) goto L_0x0118
            r1 = 2131824301(0x7f110ead, float:1.9281426E38)
        L_0x0118:
            r0.mo69923G(r1)
            goto L_0x0123
        L_0x011c:
            pj3.g r0 = r7.getPreferenceScreen()
            r0.mo72529n(r1, r3)
        L_0x0123:
            com.tencent.mm.storage.z1 r0 = r7.f20223d
            boolean r0 = r0.mo62927s3()
            java.lang.String r1 = "setting_star"
            if (r0 == 0) goto L_0x014f
            com.tencent.mm.storage.z1 r0 = r7.f20223d
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85816S4(r0)
            if (r0 == 0) goto L_0x013b
            goto L_0x014f
        L_0x013b:
            pj3.g r0 = r7.getPreferenceScreen()
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r1)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r0 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r0
            com.tencent.mm.storage.z1 r1 = r7.f20223d
            boolean r1 = r1.mo62934u3()
            r0.mo6805K(r1)
            goto L_0x0156
        L_0x014f:
            pj3.g r0 = r7.getPreferenceScreen()
            r0.mo72529n(r1, r3)
        L_0x0156:
            com.tencent.mm.storage.z1 r0 = r7.f20223d
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85816S4(r0)
            java.lang.String r1 = "setting_blacklist"
            if (r0 == 0) goto L_0x016d
            pj3.g r0 = r7.getPreferenceScreen()
            r0.mo72529n(r1, r3)
            goto L_0x0180
        L_0x016d:
            pj3.g r0 = r7.getPreferenceScreen()
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r1)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r0 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r0
            com.tencent.mm.storage.z1 r1 = r7.f20223d
            boolean r1 = r1.mo62920o3()
            r0.mo6805K(r1)
        L_0x0180:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.add(r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            com.tencent.mm.storage.z1 r1 = r7.f20223d
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85816S4(r1)
            if (r1 != 0) goto L_0x01e1
            com.tencent.mm.storage.z1 r1 = r7.f20223d
            boolean r1 = r1.mo62927s3()
            if (r1 != 0) goto L_0x01eb
            df2.g r1 = r7.f20224e
            int r1 = r1.f221635f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01eb
        L_0x01e1:
            pj3.g r0 = r7.getPreferenceScreen()
            java.lang.String r1 = "setting_report"
            r0.mo72529n(r1, r3)
        L_0x01eb:
            com.tencent.mm.storage.z1 r0 = r7.f20223d
            boolean r0 = r0.mo62927s3()
            if (r0 != 0) goto L_0x01fd
            pj3.g r0 = r7.getPreferenceScreen()
            java.lang.String r1 = "setting_shortcut"
            r0.mo72529n(r1, r3)
        L_0x01fd:
            com.tencent.mm.storage.z1 r0 = r7.f20223d
            boolean r0 = r0.mo62927s3()
            if (r0 == 0) goto L_0x0211
            com.tencent.mm.storage.z1 r0 = r7.f20223d
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85816S4(r0)
            if (r0 == 0) goto L_0x021b
        L_0x0211:
            pj3.g r0 = r7.getPreferenceScreen()
            java.lang.String r1 = "setting_delete"
            r0.mo72529n(r1, r3)
        L_0x021b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.ProfileSettingUI.initView():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String nullAsNil = Util.nullAsNil(getIntent().getStringExtra("Contact_User"));
        if (Util.isNullOrNil(nullAsNil)) {
            Log.m105921e("MicroMsg.ProfileSettingUI", "username is null %s", nullAsNil);
            finish();
            return;
        }
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(nullAsNil);
        this.f20223d = z1Var;
        this.f20224e = new C75381g(this, z1Var);
        setMMTitle((int) C0966R.string.ho5);
        setBackBtn(new C4951a());
        initView();
        C97625j3.m125812b().mo105907v().add(this);
    }

    public void onDestroy() {
        C75381g gVar = this.f20224e;
        gVar.getClass();
        ((C47001b) C86709a0.m107533q(C47001b.class)).mo71279fN(gVar);
        C97625j3.m125812b().mo105907v().remove(this);
        super.onDestroy();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (this.f20223d.getUsername().equals(str)) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                this.f20223d = z1Var;
                if (z1Var != null) {
                    this.f20224e.f221634e = z1Var;
                    initView();
                    getPreferenceScreen().notifyDataSetChanged();
                }
            }
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.ProfileSettingUI", str + " item has been clicked!");
        if (str.equals("setting_remark")) {
            this.f20224e.mo105726j(1);
            return true;
        } else if (str.equals("setting_permission")) {
            this.f20224e.mo105726j(3);
            return true;
        } else if (str.equals("setting_send_card")) {
            this.f20224e.mo105726j(4);
            return true;
        } else if (str.equals("setting_shortcut")) {
            this.f20224e.mo105726j(7);
            return true;
        } else if (str.equals("setting_star")) {
            this.f20224e.mo105726j(2);
            return true;
        } else if (str.equals("setting_blacklist")) {
            this.f20224e.mo105726j(5);
            return true;
        } else if (str.equals("setting_report")) {
            this.f20224e.mo105726j(9);
            return true;
        } else if (!str.equals("setting_delete")) {
            return false;
        } else {
            this.f20224e.mo105726j(6);
            return true;
        }
    }
}
