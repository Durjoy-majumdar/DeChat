package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceSmallCategory;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.plugin.card.widget.CardTextPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C20483c;
import hz0.C21034b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import pj3.C47511g;
import te3.C22498fy;
import wz0.C22945n;
import wz0.C53246b;

/* renamed from: com.tencent.mm.plugin.card.ui.CardDetailPreference */
public class CardDetailPreference extends MMPreference {

    /* renamed from: d */
    public List<C21034b> f51723d = new ArrayList();

    /* renamed from: e */
    public C20483c f51724e;

    /* renamed from: f */
    public C47511g f51725f;

    /* renamed from: g */
    public TextView f51726g;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailPreference$a */
    public class C18560a implements MenuItem.OnMenuItemClickListener {
        public C18560a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardDetailPreference.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo23339H7() {
        this.f51725f.mo72527k(new PreferenceSmallCategory(this, (AttributeSet) null));
    }

    public View getFooterView() {
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.c5g, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.jym);
        this.f51726g = textView;
        textView.setVisibility(8);
        return inflate;
    }

    public int getResourceId() {
        return C0966R.xml.f8862o;
    }

    public void initView() {
        TextView textView;
        C20483c cVar = (C20483c) getIntent().getParcelableExtra("key_card_info_data");
        this.f51724e = cVar;
        if (cVar == null || cVar.mo23264L0() == null || this.f51724e.mo23263J0() == null) {
            Log.m105920e("MicroMsg.CardDetailPreference", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
            finish();
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f51724e.mo23264L0().f64156y)) {
            sb.append(this.f51724e.mo23264L0().f64156y);
        }
        sb.append(getString(C0966R.string.awt));
        setMMTitle(sb.toString());
        setBackBtn(new C18560a());
        this.f51725f = getPreferenceScreen();
        ((ArrayList) this.f51723d).clear();
        if (this.f51724e.mo23263J0().f63946h != null && this.f51724e.mo23263J0().f63946h.size() > 0) {
            ((ArrayList) this.f51723d).addAll(C22945n.m27003c(this.f51724e.mo23263J0().f63946h));
        }
        if (this.f51724e.mo23263J0().f63947i != null && this.f51724e.mo23263J0().f63947i.size() > 0) {
            ArrayList arrayList = (ArrayList) C22945n.m27003c(this.f51724e.mo23263J0().f63947i);
            ((C21034b) arrayList.get(0)).f59502u = true;
            ((ArrayList) this.f51723d).addAll(arrayList);
        }
        mo23339H7();
        if (!(this.f51724e.mo23264L0().f64150t == null || this.f51724e.mo23264L0().f64150t == null)) {
            for (int i = 0; i < this.f51724e.mo23264L0().f64150t.size(); i++) {
                C22498fy fyVar = this.f51724e.mo23264L0().f64150t.get(i);
                if (!TextUtils.isEmpty(fyVar.f63885e)) {
                    CardTextPreference cardTextPreference = new CardTextPreference(this);
                    cardTextPreference.f121271G = C0966R.C0971layout.bcy;
                    cardTextPreference.mo69924H(fyVar.f63885e);
                    cardTextPreference.mo2063I(false);
                    cardTextPreference.f12160M = false;
                    String str = fyVar.f63884d;
                    PreferenceTitleCategory preferenceTitleCategory = new PreferenceTitleCategory(this, (AttributeSet) null);
                    if (TextUtils.isEmpty(str)) {
                        preferenceTitleCategory.mo69924H(" ");
                    } else {
                        preferenceTitleCategory.mo69924H(str);
                    }
                    this.f51725f.mo72527k(preferenceTitleCategory);
                    this.f51725f.mo72527k(cardTextPreference);
                }
            }
            mo23339H7();
        }
        for (int i2 = 0; i2 < ((ArrayList) this.f51723d).size(); i2++) {
            C21034b bVar = (C21034b) ((ArrayList) this.f51723d).get(i2);
            Preference preference = new Preference(this);
            preference.f121271G = C0966R.C0971layout.bcy;
            preference.mo26273A(bVar.f64746d);
            preference.mo69924H(bVar.f64746d);
            if (!TextUtils.isEmpty(bVar.f64747e)) {
                preference.mo7741E(bVar.f64747e);
            }
            if (bVar.f59502u) {
                mo23339H7();
            }
            this.f51725f.mo72527k(preference);
        }
        if (!TextUtils.isEmpty(this.f51724e.mo23264L0().f64151u)) {
            CardTextPreference cardTextPreference2 = new CardTextPreference(this);
            cardTextPreference2.f121271G = C0966R.C0971layout.bcy;
            cardTextPreference2.mo69924H(getString(C0966R.string.b08));
            cardTextPreference2.mo26273A("key_pic_detail");
            cardTextPreference2.mo2063I(false);
            cardTextPreference2.f12160M = false;
            mo23339H7();
            this.f51725f.mo72527k(cardTextPreference2);
        }
        if (!TextUtils.isEmpty(this.f51724e.mo23264L0().f64148r)) {
            mo23339H7();
            CardTextPreference cardTextPreference3 = new CardTextPreference(this);
            cardTextPreference3.f121271G = C0966R.C0971layout.bcy;
            cardTextPreference3.mo26273A("card_phone");
            cardTextPreference3.mo69923G(C0966R.string.azk);
            cardTextPreference3.mo7741E(this.f51724e.mo23264L0().f64148r);
            int color = getResources().getColor(C0966R.color.a1d);
            cardTextPreference3.f12158K = color;
            TextView textView2 = cardTextPreference3.f12157J;
            if (!(textView2 == null || color == 0)) {
                textView2.setTextColor(color);
            }
            this.f51725f.mo72527k(cardTextPreference3);
            PreferenceTitleCategory preferenceTitleCategory2 = new PreferenceTitleCategory(this, (AttributeSet) null);
            if (TextUtils.isEmpty("")) {
                preferenceTitleCategory2.mo69924H(" ");
            } else {
                preferenceTitleCategory2.mo69924H("");
            }
            this.f51725f.mo72527k(preferenceTitleCategory2);
        }
        if (this.f51724e.mo23264L0() != null && !TextUtils.isEmpty(this.f51724e.mo23264L0().f64153w) && (textView = this.f51726g) != null) {
            textView.setText(this.f51724e.mo23264L0().f64153w);
            this.f51726g.setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference.f121285r.equals("card_phone")) {
            String str = this.f51724e.mo23264L0().f64148r;
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setFlags(268435456);
            intent.setData(Uri.parse("tel:" + str));
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/card/util/CardActivityHelper", "doDial", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/card/util/CardActivityHelper", "doDial", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (preference.f121285r.equals("key_pic_detail")) {
            C53246b.m59678j(this, this.f51724e.mo23264L0().f64151u, 0);
        } else {
            for (int i = 0; i < ((ArrayList) this.f51723d).size(); i++) {
                C21034b bVar = (C21034b) ((ArrayList) this.f51723d).get(i);
                String str2 = bVar.f64746d;
                if (str2 != null && str2.equals(preference.f121285r) && !TextUtils.isEmpty(bVar.f64749g)) {
                    if (C53246b.m59672d(this.f51724e.getCardId(), bVar.f64754o, bVar.f64755p, 1028, 0)) {
                        return false;
                    }
                    C53246b.m59678j(this, bVar.f64749g, 1);
                }
            }
        }
        return false;
    }
}
