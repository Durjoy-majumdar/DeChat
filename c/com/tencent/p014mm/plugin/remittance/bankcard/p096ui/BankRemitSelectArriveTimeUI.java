package com.tencent.p014mm.plugin.remittance.bankcard.p096ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.remittance.bankcard.model.EnterTimeParcel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI */
public class BankRemitSelectArriveTimeUI extends MMPreference {

    /* renamed from: d */
    public C47511g f115937d;

    /* renamed from: e */
    public List<EnterTimeParcel> f115938e;

    /* renamed from: f */
    public List<Preference> f115939f;

    /* renamed from: g */
    public int f115940g;

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI$b */
    public static class C5046b extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI$b$a */
        public class C5047a implements C32226l<View, String> {
            public C5047a() {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                View findViewById = view.findViewById(C0966R.C0970id.gv7);
                TextView textView = (TextView) view.findViewById(16908310);
                TextView textView2 = (TextView) view.findViewById(16908304);
                StringBuilder sb = new StringBuilder();
                if (!(textView == null || textView.getText() == null)) {
                    sb.append(textView.getText());
                }
                if (!(textView2 == null || textView2.getText() == null)) {
                    sb.append(textView2.getText());
                }
                if (!(findViewById == null || findViewById.getTag() == null)) {
                    if (findViewById.getTag().equals("radio_on")) {
                        sb.append(",");
                        sb.append(C5046b.this.getString(C0966R.string.fxm));
                    }
                    if (findViewById.getTag().equals("radio_off")) {
                        sb.append(",");
                        sb.append(C5046b.this.getString(C0966R.string.f361558ks2));
                    }
                }
                sb.append(C5046b.this.getString(C0966R.string.au6));
                return sb.toString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI$b$b */
        public class C5048b implements C32226l<View, String> {
            public C5048b(C5046b bVar) {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                StringBuilder sb = new StringBuilder();
                if (view != null && (view instanceof TextView)) {
                    TextView textView = (TextView) view;
                    if (textView.getText() != null) {
                        sb.append(textView.getText());
                    }
                }
                return sb.toString();
            }
        }

        public C5046b(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f6556i8);
            root.view(C0966R.C0970id.brz).disableChildren().desc((C32226l<? super View, String>) new C5047a());
            root.view(16908310).desc((C32226l<? super View, String>) new C5048b(this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI$a */
    public class C42813a implements MenuItem.OnMenuItemClickListener {
        public C42813a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BankRemitSelectArriveTimeUI.this.finish();
            return false;
        }
    }

    public int getResourceId() {
        return C0966R.C0971layout.f6557i9;
    }

    public void initView() {
        this.f115937d = getPreferenceScreen();
        List<EnterTimeParcel> list = this.f115938e;
        if (list != null && list.size() > 0) {
            this.f115939f = new ArrayList();
            for (int i = 0; i < this.f115938e.size(); i++) {
                EnterTimeParcel enterTimeParcel = this.f115938e.get(i);
                Log.m105919d("MicroMsg.BankRemitSelectArriveTimeUI", "enter scene: %d", Integer.valueOf(enterTimeParcel.f115906d));
                Preference preference = new Preference(this);
                preference.f121271G = C0966R.C0971layout.f6556i8;
                preference.f121290w = false;
                preference.mo26273A("" + enterTimeParcel.f115906d);
                preference.mo69924H(enterTimeParcel.f115907e);
                if (enterTimeParcel.f115906d == this.f115940g) {
                    preference.f121272H = C0966R.C0971layout.beu;
                } else {
                    preference.f121272H = C0966R.C0971layout.bev;
                }
                if (enterTimeParcel.f115909g == 0) {
                    if (!Util.isNullOrNil(enterTimeParcel.f115908f)) {
                        preference.mo7741E(enterTimeParcel.f115908f);
                    }
                    preference.mo69932y(false);
                }
                preference.mo69925c().putParcelable("arrive_time", enterTimeParcel);
                this.f115937d.mo72527k(preference);
                this.f115939f.add(preference);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().mo91112w(new ColorDrawable(getResources().getColor(C0966R.color.f3117ft)));
        View j = getSupportActionBar().mo91099j();
        if (j != null) {
            View findViewById = j.findViewById(C0966R.C0970id.c7p);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(C0966R.color.f3131gg));
            }
            View findViewById2 = j.findViewById(16908308);
            if (findViewById2 != null && (findViewById2 instanceof TextView)) {
                ((TextView) findViewById2).setTextColor(getResources().getColor(C0966R.color.a7f));
            }
        }
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(C0966R.color.f3117ft));
        BankRemitBaseUI.m46480H7(this);
        getContentView().setFitsSystemWindows(true);
        setMMTitle((int) C0966R.string.f360163ai3);
        this.f115938e = getIntent().getParcelableArrayListExtra("key_arrive_time_parcel_list");
        this.f115940g = getIntent().getIntExtra("key_select_arrive_time", -1);
        initView();
        findViewById(16908298).setBackgroundColor(getResources().getColor(C0966R.color.f3117ft));
        setBackBtn(new C42813a(), C0966R.raw.actionbar_icon_dark_back);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Iterator it = ((ArrayList) this.f115939f).iterator();
        while (it.hasNext()) {
            Preference preference2 = (Preference) it.next();
            if (preference2 == preference) {
                preference2.f121272H = C0966R.C0971layout.beu;
            } else {
                preference2.f121272H = C0966R.C0971layout.bev;
            }
        }
        this.f115937d.notifyDataSetChanged();
        EnterTimeParcel enterTimeParcel = (EnterTimeParcel) preference.mo69925c().getParcelable("arrive_time");
        if (enterTimeParcel == null) {
            Log.m105924i("MicroMsg.BankRemitSelectArriveTimeUI", "is header");
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("key_enter_time_scene", enterTimeParcel.f115906d);
        setResult(-1, intent);
        finish();
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5046b.class);
    }
}
