package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceCategory;
import com.tencent.p014mm.plugin.account.p024ui.LanguagePreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import ob0.C11385n;
import ob0.C117747y;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifySelectUI */
public class RegByMobileVoiceVerifySelectUI extends MMPreference implements C11385n {

    /* renamed from: d */
    public C47511g f196722d;

    /* renamed from: e */
    public LanguagePreference.C68448a[] f196723e;

    /* renamed from: f */
    public String f196724f;

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifySelectUI$a */
    public class C68472a implements MenuItem.OnMenuItemClickListener {
        public C68472a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RegByMobileVoiceVerifySelectUI.this.hideVKB();
            RegByMobileVoiceVerifySelectUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static LanguagePreference.C68448a[] m80763H7() {
        String[] split = MMApplicationContext.getContext().getString(C0966R.string.alg).trim().split(",");
        LanguagePreference.C68448a[] aVarArr = new LanguagePreference.C68448a[split.length];
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].trim().split(XVFSFile.PATH_SEPARATOR);
            aVarArr[i] = new LanguagePreference.C68448a(split2[1], split2[2], split2[0], false);
        }
        return aVarArr;
    }

    public int getResourceId() {
        return C0966R.C0971layout.f6576is;
    }

    public void initView() {
        hideVKB();
        this.f196724f = getIntent().getExtras().getString("voice_verify_code");
        setMMTitle((int) C0966R.string.alm);
        setBackBtn(new C68472a());
        LanguagePreference.C68448a[] H7 = m80763H7();
        this.f196723e = H7;
        if (H7.length > 0) {
            this.f196722d.removeAll();
            this.f196722d.mo72527k(new PreferenceCategory(this, (AttributeSet) null));
            for (LanguagePreference.C68448a aVar : this.f196723e) {
                if (aVar.f196669b.equalsIgnoreCase(this.f196724f)) {
                    aVar.f196670c = true;
                }
                LanguagePreference languagePreference = new LanguagePreference(this, (AttributeSet) null);
                if (Util.isNullOrNil(aVar.f196669b)) {
                    Log.m105920e("MicroMsg.LanguagePreference", "setInfo info error");
                } else {
                    languagePreference.f196667J = aVar;
                    languagePreference.mo26273A(aVar.f196669b);
                }
                languagePreference.mo26273A(aVar.f196669b);
                this.f196722d.mo72527k(languagePreference);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f196722d = getPreferenceScreen();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        LanguagePreference.C68448a aVar;
        if (!(preference instanceof LanguagePreference) || (aVar = ((LanguagePreference) preference).f196667J) == null) {
            return false;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("voice_verify_language", aVar.f196668a);
        bundle.putString("voice_verify_code", aVar.f196669b);
        intent.putExtras(bundle);
        setResult(0, intent);
        finish();
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }
}
