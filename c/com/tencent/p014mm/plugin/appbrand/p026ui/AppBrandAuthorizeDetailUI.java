package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI */
public class AppBrandAuthorizeDetailUI extends MMPreference {

    /* renamed from: r */
    public static int[] f345375r = {0, 1, 2};

    /* renamed from: d */
    public int f345376d;

    /* renamed from: e */
    public boolean f345377e = false;

    /* renamed from: f */
    public C47511g f345378f;

    /* renamed from: g */
    public Preference f345379g;

    /* renamed from: h */
    public AppBrandAuthPreference f345380h;

    /* renamed from: i */
    public AppBrandAuthPreference f345381i;

    /* renamed from: j */
    public AppBrandAuthPreference f345382j;

    /* renamed from: n */
    public boolean f345383n;

    /* renamed from: o */
    public C92411b f345384o;

    /* renamed from: p */
    public String f345385p = "";

    /* renamed from: q */
    public C92411b.C92412a f345386q = new AppBrandAuthorizeDetailUI$$d(this);

    /* renamed from: H7 */
    public final void mo175025H7() {
        if (this.f345383n && this.f345379g != null) {
            this.f345379g.mo69924H(((this.f345376d == 0) || Util.isNullOrNil(this.f345385p)) ? getIntent().getStringExtra("key_desc") : String.format(getIntent().getStringExtra("key_desc_oversea"), new Object[]{this.f345385p}));
            this.f345378f.notifyDataSetChanged();
        }
    }

    /* renamed from: I7 */
    public final void mo175026I7() {
        if (this.f345377e) {
            Log.m105925i("MicroMsg.AppBrandAuthorizeDetailUI", "setResData, has changed, state:%s", Integer.valueOf(this.f345376d));
            Intent intent = new Intent();
            intent.putExtra("key_result_state", this.f345376d);
            setResult(-1, intent);
            return;
        }
        setResult(0, (Intent) null);
    }

    public int getResourceId() {
        return C0966R.xml.f8855e;
    }

    public void onBackPressed() {
        mo175026I7();
        super.onBackPressed();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = 1
            r11.fixStatusbar(r0)
            super.onCreate(r12)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r1 = "key_desc_oversea_for_location"
            r2 = 0
            boolean r12 = r12.getBooleanExtra(r1, r2)
            r11.f345383n = r12
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r1[r2] = r12
            java.lang.String r12 = "MicroMsg.AppBrandAuthorizeDetailUI"
            java.lang.String r3 = "initLocationForOverseaUser isOverseaUserForLocation:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r1)
            boolean r1 = r11.f345383n
            if (r1 == 0) goto L_0x0048
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r12)
            java.lang.String r1 = "KEY_ADDRESS"
            java.lang.String r3 = ""
            java.lang.String r12 = r12.getString(r1, r3)
            r11.f345385p = r12
            java.lang.Class<ts.c> r12 = p702ts.C78085c.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ts.c r12 = (p702ts.C78085c) r12
            cc0.b r12 = r12.mo108056ms()
            r11.f345384o = r12
            cc0.b$a r1 = r11.f345386q
            r12.mo126409c(r1, r0, r2)
        L_0x0048:
            com.tencent.mm.plugin.appbrand.ui.e r12 = new com.tencent.mm.plugin.appbrand.ui.e
            r12.<init>(r11)
            r11.setBackBtn(r12)
            android.content.Intent r12 = r11.getIntent()
            if (r12 == 0) goto L_0x0072
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r1 = "key_title"
            java.lang.String r12 = r12.getStringExtra(r1)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0072
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r12 = r12.getStringExtra(r1)
            r11.setMMTitle((java.lang.String) r12)
            goto L_0x0078
        L_0x0072:
            r12 = 2131821009(0x7f1101d1, float:1.927475E38)
            r11.setMMTitle((int) r12)
        L_0x0078:
            pj3.g r12 = r11.getPreferenceScreen()
            r11.f345378f = r12
            r12.removeAll()
            android.content.Intent r12 = r11.getIntent()
            r1 = 0
            if (r12 == 0) goto L_0x0093
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r3 = "key_override_authorize_usage_desc"
            java.lang.String r12 = r12.getStringExtra(r3)
            goto L_0x0094
        L_0x0093:
            r12 = r1
        L_0x0094:
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            if (r3 != 0) goto L_0x009c
        L_0x009a:
            r1 = r12
            goto L_0x00d7
        L_0x009c:
            android.content.Intent r12 = r11.getIntent()
            if (r12 != 0) goto L_0x00a3
            goto L_0x00d7
        L_0x00a3:
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r3 = "key_desc"
            java.lang.String r12 = r12.getStringExtra(r3)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x00d7
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r12 = r12.getStringExtra(r3)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r3 = "key_has_prefix"
            boolean r1 = r1.getBooleanExtra(r3, r0)
            if (r1 == 0) goto L_0x009a
            r1 = 2131821013(0x7f1101d5, float:1.9274757E38)
            java.lang.String r1 = r11.getString(r1)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r2] = r12
            java.lang.String r12 = java.lang.String.format(r1, r3)
            goto L_0x009a
        L_0x00d7:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r12 != 0) goto L_0x00f3
            com.tencent.mm.ui.base.preference.Preference r12 = new com.tencent.mm.ui.base.preference.Preference
            r12.<init>(r11)
            r11.f345379g = r12
            r12.mo69924H(r1)
            com.tencent.mm.ui.base.preference.Preference r12 = r11.f345379g
            r1 = 2131493116(0x7f0c00fc, float:1.8609703E38)
            r12.f121271G = r1
            pj3.g r1 = r11.f345378f
            r1.mo72527k(r12)
        L_0x00f3:
            com.tencent.mm.plugin.appbrand.utils.a2 r12 = new com.tencent.mm.plugin.appbrand.utils.a2
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$a r1 = new com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$a
            r1.<init>(r11)
            r12.<init>(r1)
            com.tencent.mm.plugin.appbrand.utils.a2 r1 = new com.tencent.mm.plugin.appbrand.utils.a2
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$b r3 = new com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$b
            r3.<init>(r11)
            r1.<init>(r3)
            com.tencent.mm.plugin.appbrand.utils.a2 r3 = new com.tencent.mm.plugin.appbrand.utils.a2
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$c r4 = new com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$c
            r4.<init>(r11)
            r3.<init>(r4)
            r4 = 3
            com.tencent.mm.plugin.appbrand.utils.a2[] r5 = new com.tencent.p014mm.plugin.appbrand.utils.C115299a2[r4]
            r5[r2] = r12
            r5[r0] = r1
            r6 = 2
            r5[r6] = r3
            android.content.Intent r7 = r11.getIntent()
            if (r7 == 0) goto L_0x0130
            android.content.Intent r7 = r11.getIntent()
            java.lang.String r8 = "key_override_authorize_option_order"
            int[] r7 = r7.getIntArrayExtra(r8)
            if (r7 != 0) goto L_0x0132
            int[] r7 = f345375r
            goto L_0x0132
        L_0x0130:
            int[] r7 = f345375r
        L_0x0132:
            int r8 = r7.length
            r9 = 0
        L_0x0134:
            if (r9 >= r8) goto L_0x014d
            r10 = r7[r9]
            if (r10 == 0) goto L_0x0147
            if (r10 == r0) goto L_0x0143
            if (r10 == r6) goto L_0x013f
            goto L_0x014a
        L_0x013f:
            r3.run()
            goto L_0x014a
        L_0x0143:
            r1.run()
            goto L_0x014a
        L_0x0147:
            r12.run()
        L_0x014a:
            int r9 = r9 + 1
            goto L_0x0134
        L_0x014d:
            r12 = 0
        L_0x014e:
            if (r12 >= r4) goto L_0x015c
            r1 = r5[r12]
            boolean r3 = r1.f345509e
            if (r3 != 0) goto L_0x0159
            r1.run()
        L_0x0159:
            int r12 = r12 + 1
            goto L_0x014e
        L_0x015c:
            android.content.Intent r12 = r11.getIntent()
            if (r12 == 0) goto L_0x0178
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r1 = "key_state"
            boolean r12 = r12.hasExtra(r1)
            if (r12 == 0) goto L_0x0178
            android.content.Intent r12 = r11.getIntent()
            int r12 = r12.getIntExtra(r1, r2)
            r11.f345376d = r12
        L_0x0178:
            int r12 = r11.f345376d
            if (r12 == r0) goto L_0x018c
            if (r12 == r6) goto L_0x0184
            com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference r12 = r11.f345380h
            r12.mo1534I(r0)
            goto L_0x0191
        L_0x0184:
            com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference r12 = r11.f345382j
            if (r12 == 0) goto L_0x0191
            r12.mo1534I(r0)
            goto L_0x0191
        L_0x018c:
            com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference r12 = r11.f345381i
            r12.mo1534I(r0)
        L_0x0191:
            r11.mo175025H7()
            pj3.g r12 = r11.f345378f
            r12.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeDetailUI.onCreate(android.os.Bundle):void");
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Log.m105925i("MicroMsg.AppBrandAuthorizeDetailUI", "onPreferenceTreeClick, key:%s", preference.f121285r);
        if (preference instanceof AppBrandAuthPreference) {
            this.f345377e = true;
            if (preference.f121285r.equalsIgnoreCase("both")) {
                this.f345376d = 2;
                this.f345380h.mo1534I(false);
                this.f345381i.mo1534I(false);
                AppBrandAuthPreference appBrandAuthPreference = this.f345382j;
                if (appBrandAuthPreference != null) {
                    appBrandAuthPreference.mo1534I(true);
                }
            } else if (preference.f121285r.equalsIgnoreCase("foreground")) {
                this.f345376d = 1;
                this.f345381i.mo1534I(true);
                this.f345380h.mo1534I(false);
                AppBrandAuthPreference appBrandAuthPreference2 = this.f345382j;
                if (appBrandAuthPreference2 != null) {
                    appBrandAuthPreference2.mo1534I(false);
                }
            } else {
                this.f345376d = 0;
                this.f345380h.mo1534I(true);
                this.f345381i.mo1534I(false);
                AppBrandAuthPreference appBrandAuthPreference3 = this.f345382j;
                if (appBrandAuthPreference3 != null) {
                    appBrandAuthPreference3.mo1534I(false);
                }
            }
            mo175025H7();
            this.f345378f.notifyDataSetChanged();
        }
        return false;
    }
}
