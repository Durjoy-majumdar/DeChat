package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI */
public class WalletSelectProfessionUI extends MMPreference {
    private static final String TAG = "MicroMsg.WalletSelectProfessionUI";
    public Profession[] mProfessions = null;
    private C47511g screen;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI$a */
    public class C72309a implements MenuItem.OnMenuItemClickListener {
        public C72309a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletSelectProfessionUI.this.setResult(0);
            WalletSelectProfessionUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f361612l90);
        this.screen = getPreferenceScreen();
        PreferenceTitleCategory preferenceTitleCategory = new PreferenceTitleCategory(getContext(), (AttributeSet) null);
        preferenceTitleCategory.mo69924H(getString(C0966R.string.l8z));
        preferenceTitleCategory.mo26273A("title_category");
        this.screen.mo72527k(preferenceTitleCategory);
        Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("key_profession_list");
        if (parcelableArrayExtra != null && parcelableArrayExtra.length > 0) {
            this.mProfessions = new Profession[parcelableArrayExtra.length];
            int i = 0;
            while (true) {
                Profession[] professionArr = this.mProfessions;
                if (i >= professionArr.length) {
                    break;
                }
                professionArr[i] = (Profession) parcelableArrayExtra[i];
                i++;
            }
        }
        Profession[] professionArr2 = this.mProfessions;
        if (professionArr2 != null) {
            int i2 = 0;
            for (Profession profession : professionArr2) {
                if (profession != null && !Util.isNullOrNil(profession.f209290d)) {
                    Preference preference = new Preference(getContext());
                    preference.mo69924H(profession.f209290d);
                    preference.mo26273A("index_" + i2);
                    this.screen.mo72527k(preference);
                }
                i2++;
            }
        }
        setBackBtn(new C72309a());
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference.f121285r.startsWith("index_")) {
            String[] split = preference.f121285r.split("_");
            if (split.length == 2) {
                Profession profession = this.mProfessions[Util.getInt(split[1], 0)];
                Intent intent = new Intent();
                intent.putExtra("key_select_profession", profession);
                setResult(-1, intent);
            } else {
                Log.m105929w(TAG, "error key: %s, %s", preference.f121285r, preference.mo69928s());
                setResult(0);
            }
            finish();
        }
        return true;
    }
}
