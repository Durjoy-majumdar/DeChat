package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.TextButtonPreference;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactUI */
public class UnfamiliarContactUI extends MMPreference {

    /* renamed from: d */
    public boolean f20964d;

    /* renamed from: e */
    public boolean f20965e;

    /* renamed from: f */
    public boolean f20966f;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactUI$a */
    public class C5334a implements MenuItem.OnMenuItemClickListener {
        public C5334a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            UnfamiliarContactUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8970cr;
    }

    public void initView() {
        super.initView();
        setMMTitle((int) C0966R.string.j1h);
        setBackBtn(new C5334a());
        ((CheckPreference) getPreferenceScreen().mo72519a("settings_half_year_not_chat")).f24231Q = 0;
        ((CheckPreference) getPreferenceScreen().mo72519a("settings_has_not_same_chatroom")).f24231Q = 0;
        ((CheckPreference) getPreferenceScreen().mo72519a("settings_half_year_not_response")).f24231Q = 0;
        ((TextButtonPreference) getPreferenceScreen().mo72519a("settings_next_step")).mo69932y(false);
        getPreferenceScreen().notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference instanceof CheckPreference) {
            CheckPreference checkPreference = (CheckPreference) preference;
            if (preference.f121285r.equals("settings_half_year_not_chat")) {
                boolean z = this.f20964d;
                checkPreference.f24225J = !z;
                this.f20964d = !z;
            } else if (preference.f121285r.equals("settings_has_not_same_chatroom")) {
                boolean z2 = this.f20966f;
                checkPreference.f24225J = !z2;
                this.f20966f = !z2;
            } else if (preference.f121285r.equals("settings_half_year_not_response")) {
                boolean z3 = this.f20965e;
                checkPreference.f24225J = !z3;
                this.f20965e = !z3;
            }
            ((TextButtonPreference) gVar.mo72519a("settings_next_step")).mo69932y(this.f20964d || this.f20966f || this.f20965e);
        } else if (preference.f121285r.equals("settings_next_step")) {
            Intent intent = new Intent(this, UnfamiliarContactDetailUI.class);
            intent.putExtra("half_year_not_chat", this.f20964d);
            intent.putExtra("half_year_not_response", this.f20965e);
            intent.putExtra("has_not_same_chatroom", this.f20966f);
            startActivityForResult(intent, 291);
        }
        gVar.notifyDataSetChanged();
        return true;
    }
}
