package com.tencent.p014mm.plugin.subapp.p109ui.openapi;

import android.database.Cursor;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import java.util.ArrayList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import pj3.C47511g;
import zw2.C53829g;
import zw2.C53830h;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI */
public class ServiceAppUI extends MMPreference implements C11385n {

    /* renamed from: d */
    public C47511g f116815d;

    /* renamed from: e */
    public ServicePreference f116816e;

    /* renamed from: f */
    public ServicePreference f116817f;

    /* renamed from: g */
    public PreferenceTitleCategory f116818g;

    /* renamed from: h */
    public PreferenceTitleCategory f116819h;

    /* renamed from: i */
    public List<C44561j> f116820i = new ArrayList();

    /* renamed from: j */
    public List<C44561j> f116821j = new ArrayList();

    /* renamed from: n */
    public AdapterView.OnItemClickListener f116822n;

    /* renamed from: o */
    public AdapterView.OnItemClickListener f116823o;

    /* renamed from: p */
    public String f116824p;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI$a */
    public class C43179a implements MenuItem.OnMenuItemClickListener {
        public C43179a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ServiceAppUI.this.finish();
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        r2 = ((com.tencent.p014mm.storage.C44662n1) eb0.C97625j3.m125812b().mo105902q()).mo69799Lo(r11.f116824p);
     */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m46744H7(com.tencent.p014mm.plugin.subapp.p109ui.openapi.ServiceAppUI r11, com.tencent.p014mm.pluginsdk.model.app.C44561j r12) {
        /*
            r11.getClass()
            if (r12 != 0) goto L_0x000e
            java.lang.String r11 = "MicroMsg.ServiceAppUI"
            java.lang.String r12 = "app is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
            goto L_0x0129
        L_0x000e:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 10923(0x2aab, float:1.5306E-41)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = r12.field_appId
            r5 = 1
            r2[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r6 = 2
            r2[r6] = r3
            java.lang.String r3 = r11.f116824p
            r7 = 3
            r2[r7] = r3
            r0.mo160131h(r1, r2)
            int r0 = r12.f149251R0
            r1 = 0
            if (r0 != r6) goto L_0x00de
            java.lang.String r0 = r12.f149249Q0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r0 = r11.getSharedPreferences(r0, r4)
            androidx.appcompat.app.AppCompatActivity r2 = r11.getContext()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.loadApplicationLanguage(r0, r2)
            java.lang.String r2 = "language_default"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L_0x0065
            java.util.Locale r2 = java.util.Locale.getDefault()
            if (r2 == 0) goto L_0x0065
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toString()
        L_0x0065:
            java.lang.String r2 = r11.f116824p
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r2 == 0) goto L_0x0088
            eb0.c r2 = eb0.C97625j3.m125812b()
            eb0.m2 r2 = r2.mo105902q()
            java.lang.String r3 = r11.f116824p
            com.tencent.mm.storage.n1 r2 = (com.tencent.p014mm.storage.C44662n1) r2
            com.tencent.mm.storage.m1 r2 = r2.mo69799Lo(r3)
            if (r2 == 0) goto L_0x0088
            java.util.List r2 = r2.mo69790r2()
            int r2 = r2.size()
            goto L_0x0089
        L_0x0088:
            r2 = 1
        L_0x0089:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r9 = r12.field_appId
            java.lang.String r10 = "jsapi_args_appid"
            r8.putString(r10, r9)
            java.lang.String r9 = "isFromService"
            r8.putBoolean(r9, r5)
            java.lang.String r9 = r11.f116824p
            java.lang.String r10 = "sendAppMsgToUserName"
            r8.putString(r10, r9)
            java.lang.String r9 = "jsapiargs"
            r3.putExtra(r9, r8)
            java.lang.String r8 = "forceHideShare"
            r3.putExtra(r8, r5)
            java.lang.String r8 = "show_bottom"
            r3.putExtra(r8, r4)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r12 = r12.f149249Q0
            r7[r4] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r7[r5] = r12
            r7[r6] = r0
            java.lang.String r12 = "%s&wxchatmembers=%s&lang=%s"
            java.lang.String r12 = java.lang.String.format(r12, r7)
            java.lang.String r0 = "rawUrl"
            r3.putExtra(r0, r12)
            androidx.appcompat.app.AppCompatActivity r12 = r11.getContext()
            java.lang.String r0 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r12, r0, r2, r3, r1)
            r11.finish()
            goto L_0x0129
        L_0x00de:
            int r0 = r12.f149251R0
            if (r0 != r7) goto L_0x0104
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r12.field_packageName
            java.lang.String r2 = "service_app_package_name"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r12.field_openId
            java.lang.String r2 = "service_app_openid"
            r0.putExtra(r2, r1)
            java.lang.String r12 = r12.field_appId
            java.lang.String r1 = "service_app_appid"
            r0.putExtra(r1, r12)
            r12 = -1
            r11.setResult(r12, r0)
            r11.finish()
            goto L_0x0129
        L_0x0104:
            if (r0 != r5) goto L_0x0129
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            androidx.appcompat.app.AppCompatActivity r2 = r11.getContext()
            java.lang.String r12 = r12.f149249Q0
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.getClass()
            wc3.f0 r0 = wc3.C15134f0.C15135a.m14248a()
            com.tencent.mm.app.plugin.e r0 = (com.tencent.p014mm.app.plugin.C40030e) r0
            r0.mo62719c(r2, r12, r5, r1)
            r11.finish()
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.p109ui.openapi.ServiceAppUI.m46744H7(com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI, com.tencent.mm.pluginsdk.model.app.j):void");
    }

    public int getResourceId() {
        return C0966R.xml.f8940bw;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f361265im3);
        this.f116824p = getIntent().getStringExtra("service_app_talker_user");
        setBackBtn(new C43179a());
        ((ArrayList) this.f116820i).clear();
        ((ArrayList) this.f116821j).clear();
        Cursor ir = C72996z1.m85820U5(this.f116824p) ? C72709y1.yx0().mo69374ir(0, 2) : C45628s0.m50738C(this.f116824p) ? C72709y1.yx0().mo69374ir(0, 4) : C72709y1.yx0().mo69374ir(0, 1);
        if (ir != null) {
            if (ir.moveToFirst()) {
                do {
                    C44561j jVar = new C44561j();
                    jVar.convertFrom(ir);
                    int i = jVar.field_serviceAppType;
                    if (i == 1) {
                        ((ArrayList) this.f116820i).add(jVar);
                    } else if (i == 2) {
                        ((ArrayList) this.f116821j).add(jVar);
                    }
                } while (ir.moveToNext());
            }
            ir.close();
        }
        Log.m105925i("MicroMsg.ServiceAppUI", "initAppList: wxServiceList size %s, bizServiceList size %s", Integer.valueOf(((ArrayList) this.f116820i).size()), Integer.valueOf(((ArrayList) this.f116821j).size()));
        if (this.f116822n == null) {
            this.f116822n = new C53829g(this);
        }
        if (this.f116823o == null) {
            this.f116823o = new C53830h(this);
        }
        C47511g preferenceScreen = getPreferenceScreen();
        this.f116815d = preferenceScreen;
        preferenceScreen.removeAll();
        if (((ArrayList) this.f116820i).size() > 0) {
            ServicePreference servicePreference = new ServicePreference(this, (AttributeSet) null);
            this.f116816e = servicePreference;
            servicePreference.f116828L = this.f116820i;
            AdapterView.OnItemClickListener onItemClickListener = this.f116822n;
            if (onItemClickListener != null) {
                servicePreference.f116829M = onItemClickListener;
            }
            if (this.f116818g == null) {
                PreferenceTitleCategory preferenceTitleCategory = new PreferenceTitleCategory(this, (AttributeSet) null);
                this.f116818g = preferenceTitleCategory;
                preferenceTitleCategory.mo69923G(C0966R.string.lmy);
            }
            this.f116815d.mo72527k(this.f116818g);
            this.f116815d.mo72527k(this.f116816e);
        }
        if (((ArrayList) this.f116821j).size() > 0) {
            ServicePreference servicePreference2 = new ServicePreference(this, (AttributeSet) null);
            this.f116817f = servicePreference2;
            servicePreference2.f116828L = this.f116821j;
            AdapterView.OnItemClickListener onItemClickListener2 = this.f116823o;
            if (onItemClickListener2 != null) {
                servicePreference2.f116829M = onItemClickListener2;
            }
            if (this.f116819h == null) {
                PreferenceTitleCategory preferenceTitleCategory2 = new PreferenceTitleCategory(this, (AttributeSet) null);
                this.f116819h = preferenceTitleCategory2;
                preferenceTitleCategory2.mo69923G(C0966R.string.any);
            }
            this.f116815d.mo72527k(this.f116819h);
            this.f116815d.mo72527k(this.f116817f);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onPause() {
        super.onPause();
        ServicePreference servicePreference = this.f116816e;
        if (!(servicePreference == null || servicePreference.f116827K == null)) {
            C72709y1.yx0().remove(servicePreference.f116827K);
        }
        ServicePreference servicePreference2 = this.f116817f;
        if (servicePreference2 != null && servicePreference2.f116827K != null) {
            C72709y1.yx0().remove(servicePreference2.f116827K);
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        return false;
    }

    public void onResume() {
        super.onResume();
        initView();
        ServicePreference servicePreference = this.f116816e;
        if (!(servicePreference == null || servicePreference.f116827K == null)) {
            C72709y1.yx0().add(servicePreference.f116827K);
        }
        ServicePreference servicePreference2 = this.f116817f;
        if (servicePreference2 != null && servicePreference2.f116827K != null) {
            C72709y1.yx0().add(servicePreference2.f116827K);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.ServiceAppUI", "onSceneEnd, errType = " + i + ", errCode = " + i2);
        if (i != 0 || i2 != 0) {
            Log.m105920e("MicroMsg.ServiceAppUI", "onSceneEnd, errType = " + i + ", errCode = " + i2);
        }
    }
}
