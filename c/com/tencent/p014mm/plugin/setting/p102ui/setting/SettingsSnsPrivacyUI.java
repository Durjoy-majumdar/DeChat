package com.tencent.p014mm.plugin.setting.p102ui.setting;

import al3.C0086a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import ht1.C60200t1;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import jr2.C99019x;
import k20.C9556a;
import ke3.C88144b;
import os2.C100399d0;
import pj3.C47510b;
import pj3.C47511g;
import qo3.C77389a;
import qo3.C77398g;
import tc0.C77885p;
import te3.C64266br1;
import te3.a94;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI */
public class SettingsSnsPrivacyUI extends MMPreference {

    /* renamed from: u */
    public static final /* synthetic */ int f205797u = 0;

    /* renamed from: d */
    public C47511g f205798d;

    /* renamed from: e */
    public int f205799e;

    /* renamed from: f */
    public long f205800f;

    /* renamed from: g */
    public long f205801g;

    /* renamed from: h */
    public HashMap<Integer, Integer> f205802h = new HashMap<>();

    /* renamed from: i */
    public String f205803i = "";

    /* renamed from: j */
    public boolean f205804j = false;

    /* renamed from: n */
    public boolean f205805n = false;

    /* renamed from: o */
    public boolean f205806o = false;

    /* renamed from: p */
    public boolean f205807p = false;

    /* renamed from: q */
    public boolean f205808q = false;

    /* renamed from: r */
    public boolean f205809r = true;

    /* renamed from: s */
    public boolean f205810s = false;

    /* renamed from: t */
    public int f205811t = 0;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI$a */
    public class C71087a implements MenuItem.OnMenuItemClickListener {
        public C71087a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsSnsPrivacyUI.this.hideVKB();
            SettingsSnsPrivacyUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo97774H7(LinearLayout linearLayout, int i, int i2, boolean z, View.OnClickListener onClickListener) {
        TextView textView = (TextView) View.inflate(getContext(), C0966R.C0971layout.bpg, (ViewGroup) null);
        textView.setText(i);
        textView.setTag(Integer.valueOf(i2));
        linearLayout.addView(textView);
        textView.setOnClickListener(onClickListener);
        if (z) {
            textView.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_on, 0, 0, 0);
            textView.setContentDescription(textView.getText() + textView.getContext().getString(C0966R.string.f7398f7));
            return;
        }
        textView.setContentDescription(textView.getText() + textView.getContext().getString(C0966R.string.f7400f9));
    }

    /* renamed from: I7 */
    public final void mo97775I7() {
        CheckBoxPreference checkBoxPreference;
        a94 a94 = new a94();
        if (C99019x.m128971c() != null) {
            a94 = ((C100399d0) C99019x.m128971c()).mo139779SE(this.f205803i);
        }
        if (a94 == null) {
            Log.m105920e("MicroMsg.SettingsSnsPrivacyUI", "userinfo is null");
            return;
        }
        int i = a94.f130395g;
        int i2 = a94.f130396h;
        if (this.f205809r && (checkBoxPreference = (CheckBoxPreference) this.f205798d.mo72519a("timeline_stranger_show")) != null) {
            checkBoxPreference.f121290w = false;
            boolean z = (i & 1) > 0;
            this.f205804j = z;
            if (!z) {
                checkBoxPreference.mo6805K(true);
            } else {
                checkBoxPreference.mo6805K(false);
            }
        }
        IconPreference iconPreference = (IconPreference) this.f205798d.mo72519a("timeline_recent_show_select");
        if (iconPreference != null) {
            iconPreference.f121290w = false;
            boolean z2 = i2 == 4320 && (i & 4096) > 0;
            this.f205805n = z2;
            boolean z3 = i2 == 72 && (i & 4096) > 0;
            this.f205806o = z3;
            boolean z4 = i2 == 720 && (i & 4096) > 0;
            this.f205808q = z4;
            this.f205807p = (i & 2048) > 0;
            if (z2) {
                iconPreference.mo7740D(C0966R.string.bmi);
            } else if (z3) {
                iconPreference.mo7740D(C0966R.string.bmk);
            } else if (z4) {
                iconPreference.mo7740D(C0966R.string.bmj);
            } else {
                iconPreference.mo7740D(C0966R.string.bmh);
            }
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
            int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_RECENT_RED_DOT_DID_SHOW_ID_INT, 0)).intValue();
            Log.m105925i("MicroMsg.SettingsSnsPrivacyUI", "willShowRecentRedCodeId  %d, currentRecentRedCodeId %d", Integer.valueOf(intValue), Integer.valueOf(intValue2));
            if (intValue > intValue2) {
                iconPreference.mo96250V(0);
            } else {
                iconPreference.mo96250V(8);
            }
        }
        this.f205798d.notifyDataSetChanged();
    }

    public C73244a createAdapter(SharedPreferences sharedPreferences) {
        return new C47510b(this, getListView(), sharedPreferences);
    }

    public int getResourceId() {
        return C0966R.xml.f8943bz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0088, code lost:
        if (r0 == false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r7 = this;
            r0 = 2131835909(0x7f113c05, float:1.930497E38)
            r7.setMMTitle((int) r0)
            com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI$a r0 = new com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI$a
            r0.<init>()
            r7.setBackBtn(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init function status: "
            r0.append(r1)
            int r1 = r7.f205799e
            java.lang.String r1 = java.lang.Integer.toBinaryString(r1)
            r0.append(r1)
            java.lang.String r1 = "extStatus: "
            r0.append(r1)
            long r1 = r7.f205800f
            java.lang.String r1 = java.lang.Long.toBinaryString(r1)
            r0.append(r1)
            java.lang.String r1 = " FinderSetting: "
            r0.append(r1)
            long r1 = r7.f205801g
            java.lang.String r1 = java.lang.Long.toBinaryString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.SettingsSnsPrivacyUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r3 = 335873(0x52001, float:4.70658E-40)
            java.lang.Object r0 = r0.mo119684e(r3, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x008a
            jr2.t r0 = jr2.C99019x.m128974f()
            os2.m0 r0 = (os2.C11766m0) r0
            r0.getClass()
            java.lang.String r4 = "isSnsTagExits"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            android.database.Cursor r0 = r0.mo11653Yt()
            if (r0 == 0) goto L_0x007f
            int r6 = r0.getCount()
            r0.close()
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r6 <= 0) goto L_0x0084
            r0 = 1
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r0 != 0) goto L_0x0091
        L_0x008a:
            pj3.g r0 = r7.f205798d
            java.lang.String r4 = "edit_timeline_group"
            r0.mo72529n(r4, r2)
        L_0x0091:
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r4 = "ForbidSnsStranger"
            int r0 = r0.mo107404b(r4, r3)
            if (r0 != 0) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r7.f205809r = r0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4[r3] = r0
            java.lang.String r0 = "showStranger:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r4)
            boolean r0 = r7.f205809r
            java.lang.String r1 = "timeline_stranger_show"
            if (r0 == 0) goto L_0x00c5
            pj3.g r0 = r7.f205798d
            r0.mo72529n(r1, r3)
            goto L_0x00ca
        L_0x00c5:
            pj3.g r0 = r7.f205798d
            r0.mo72529n(r1, r2)
        L_0x00ca:
            pj3.g r0 = r7.f205798d
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsSnsPrivacyUI.initView():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f205798d = getPreferenceScreen();
        this.f205799e = C75592q0.m90787q();
        this.f205800f = C75592q0.m90781k();
        this.f205801g = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8927f();
        this.f205803i = C75592q0.m90789s();
        this.f205811t = getIntent().getIntExtra("enter_scene", 0);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(this.f205799e));
        C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(this.f205800f));
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8928g(this.f205801g);
        for (Map.Entry next : this.f205802h.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            C64266br1 br12 = new C64266br1();
            br12.f182324d = intValue;
            br12.f182325e = intValue2;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
            Log.m105918d("MicroMsg.SettingsSnsPrivacyUI", "switch  " + intValue + " " + intValue2);
        }
        this.f205802h.clear();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.SettingsSnsPrivacyUI", str + " item has been clicked!");
        getDefaultSharedPreferences();
        if (str.equals("timline_outside_permiss")) {
            Intent intent = new Intent();
            intent.putExtra("k_sns_tag_id", 4);
            intent.putExtra("k_sns_from_settings_about_sns", 1);
            intent.addFlags(268435456);
            intent.setClassName(this, "com.tencent.mm.ui.contact.privacy.SnsTagDetailUI");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("edit_timeline_group")) {
            C88144b.m109789g(this, "sns", ".ui.SnsTagPartlyUI");
        } else if (str.equals("timeline_black_permiss")) {
            Intent intent2 = new Intent();
            intent2.putExtra("k_sns_tag_id", 5);
            intent2.putExtra("k_sns_from_settings_about_sns", 2);
            intent2.putExtra("k_tag_detail_sns_block_scene", 8);
            intent2.addFlags(268435456);
            intent2.setClassName(this, "com.tencent.mm.ui.contact.privacy.SnsTagDetailUI");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("timeline_stranger_show")) {
            this.f205804j = !this.f205804j;
            if (C99019x.m128971c() != null) {
                ((C100399d0) C99019x.m128971c()).mo139793vP(this.f205803i, this.f205804j);
            }
            if (C99019x.m128971c() != null) {
                a94 bD = ((C100399d0) C99019x.m128971c()).mo139783bD(this.f205803i, this.f205804j);
                ((C100399d0) C99019x.m128971c()).mo139792uP(this.f205803i, bD);
                if (bD == null) {
                    Log.m105920e("MicroMsg.SettingsSnsPrivacyUI", "userinfo in null !");
                    return false;
                }
                Log.m105918d("MicroMsg.SettingsSnsPrivacyUI", "dancy userinfo " + bD.toString());
                ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(51, bD));
            }
        } else if (str.equals("timeline_recent_show_select")) {
            a94 a94 = new a94();
            if (C99019x.m128971c() != null) {
                a94 = ((C100399d0) C99019x.m128971c()).mo139779SE(this.f205803i);
            }
            if (a94 == null) {
                Log.m105920e("MicroMsg.SettingsSnsPrivacyUI", "userinfo is null");
            } else {
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_RECENT_RED_DOT_DID_SHOW_ID_INT;
                if (intValue > ((Integer) i.mo119685f(aVar3, 0)).intValue()) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar3, Integer.valueOf(intValue));
                    mo97775I7();
                }
                AppCompatActivity context = getContext();
                C77389a aVar4 = new C77389a();
                aVar4.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
                aVar4.f225644a = C0086a.m38a(context).getString(C0966R.string.bmg);
                View inflate = View.inflate(getContext(), C0966R.C0971layout.bbz, (ViewGroup) null);
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.kbc);
                C71144h3 h3Var = new C71144h3(this, linearLayout);
                LinearLayout linearLayout2 = linearLayout;
                C71144h3 h3Var2 = h3Var;
                mo97774H7(linearLayout2, C0966R.string.bmi, 1, this.f205805n, h3Var2);
                mo97774H7(linearLayout2, C0966R.string.bmj, 3, this.f205808q, h3Var2);
                mo97774H7(linearLayout2, C0966R.string.bmk, 0, this.f205806o, h3Var2);
                mo97774H7(linearLayout, C0966R.string.bmh, 2, !this.f205805n && !this.f205806o && !this.f205808q, h3Var);
                aVar4.f225627J = inflate;
                C77398g gVar2 = new C77398g(context, C0966R.style.a66);
                gVar2.mo107525e(aVar4);
                linearLayout.setTag(gVar2);
                gVar2.show();
                addDialog(gVar2);
            }
        }
        return false;
    }

    public void onResume() {
        super.onResume();
        this.f205799e = C75592q0.m90787q();
        this.f205800f = C75592q0.m90781k();
        this.f205801g = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8927f();
        mo97775I7();
        if (!this.f205810s) {
            String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
            if (!Util.isNullOrNil(stringExtra)) {
                int g = this.f205798d.mo72523g(stringExtra);
                setSelection(g - 3);
                new MMHandler().postDelayed(new C42988g3(this, g), 10);
            }
            this.f205810s = true;
        }
    }
}
