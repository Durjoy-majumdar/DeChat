package com.tencent.p014mm.plugin.sns.p106ui;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinishSendNotInterestSnsEvent;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import pj3.C47511g;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsNotInterestUI */
public class SnsNotInterestUI extends MMPreference implements C11385n {

    /* renamed from: v */
    public static final String[] f278349v = {"sns_expose_reason_not_fav", "sns_expose_reason_too_freq", "sns_expose_reason_too_many_same_content", "sns_expose_reason_marketing", "sns_expose_reason_content_sexy", "sns_expose_reason_rumour", "sns_expose_reason_other"};

    /* renamed from: w */
    public static final int[] f278350w = {1, 2, 4, 8, 16, 32, 64};

    /* renamed from: x */
    public static final int[] f278351x = {C0966R.string.jc5, C0966R.string.jc_, C0966R.string.jca, C0966R.string.jc4, C0966R.string.f361373jc3, C0966R.string.jc8, C0966R.string.jc6};

    /* renamed from: d */
    public HashMap<String, Boolean> f278352d = new HashMap<>(7);

    /* renamed from: e */
    public HashMap<Integer, Boolean> f278353e = new HashMap<>(7);

    /* renamed from: f */
    public HashMap<String, Integer> f278354f = new HashMap<>(7);

    /* renamed from: g */
    public TextView f278355g;

    /* renamed from: h */
    public EditText f278356h;

    /* renamed from: i */
    public ListView f278357i;

    /* renamed from: j */
    public LinearLayout f278358j;

    /* renamed from: n */
    public C47511g f278359n;

    /* renamed from: o */
    public int f278360o;

    /* renamed from: p */
    public int f278361p;

    /* renamed from: q */
    public long f278362q;

    /* renamed from: r */
    public boolean f278363r = false;

    /* renamed from: s */
    public boolean f278364s = false;

    /* renamed from: t */
    public C89779i0 f278365t = null;

    /* renamed from: u */
    public C94877g0 f278366u = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$a */
    public class C95591a implements MenuItem.OnMenuItemClickListener {
        public C95591a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$1");
            SnsNotInterestUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$1");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$b */
    public class C95592b implements View.OnClickListener {
        public C95592b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsNotInterestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$2");
            SnsNotInterestUI snsNotInterestUI = SnsNotInterestUI.this;
            String[] strArr = SnsNotInterestUI.f278349v;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            LinearLayout linearLayout = snsNotInterestUI.f278358j;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            linearLayout.requestFocus();
            SnsNotInterestUI.this.hideVKB();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsNotInterestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$c */
    public class C95593c implements MenuItem.OnMenuItemClickListener {
        public C95593c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$3");
            SnsNotInterestUI snsNotInterestUI = SnsNotInterestUI.this;
            String[] strArr = SnsNotInterestUI.f278349v;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            snsNotInterestUI.getClass();
            SnsMethodCalculate.markStartTimeMs("sendNotInterest", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            snsNotInterestUI.f278361p = 0;
            for (Integer intValue : snsNotInterestUI.f278353e.keySet()) {
                int intValue2 = intValue.intValue();
                if (snsNotInterestUI.f278353e.get(Integer.valueOf(intValue2)).booleanValue()) {
                    int i = snsNotInterestUI.f278361p;
                    if (i == 0) {
                        snsNotInterestUI.f278361p = intValue2;
                    } else {
                        snsNotInterestUI.f278361p = intValue2 | i;
                    }
                }
            }
            if (!(snsNotInterestUI.f278362q == 0 || snsNotInterestUI.f278360o == 0)) {
                snsNotInterestUI.f278365t = C76879j.m92723Q(snsNotInterestUI.getContext(), snsNotInterestUI.getString(C0966R.string.a3h), snsNotInterestUI.getString(C0966R.string.a4d), true, true, new C95750c5(snsNotInterestUI));
                Log.m105919d("MicroMsg.SnsNotInterestUI", "start send not inteset, snsId:%d, scene:%d, type:%d, isNeedSupplement:%b", Long.valueOf(snsNotInterestUI.f278362q), Integer.valueOf(snsNotInterestUI.f278360o), Integer.valueOf(snsNotInterestUI.f278361p), Boolean.valueOf(snsNotInterestUI.f278364s));
                snsNotInterestUI.f278366u = new C94877g0(snsNotInterestUI.f278362q, snsNotInterestUI.f278360o, snsNotInterestUI.f278361p, snsNotInterestUI.f278364s ? snsNotInterestUI.f278356h.getText().toString() : null);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(snsNotInterestUI.f278366u);
            }
            SnsMethodCalculate.markEndTimeMs("sendNotInterest", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$3");
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo132865H7() {
        SnsMethodCalculate.markStartTimeMs("resetOptionMaps", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        String[] strArr = f278349v;
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            this.f278352d.put(strArr[i2], Boolean.FALSE);
        }
        int[] iArr = f278350w;
        for (int i3 = 0; i3 < 7; i3++) {
            this.f278353e.put(Integer.valueOf(iArr[i3]), Boolean.FALSE);
        }
        while (true) {
            int[] iArr2 = f278350w;
            if (i < 7) {
                this.f278354f.put(f278349v[i], Integer.valueOf(iArr2[i]));
                i++;
            } else {
                SnsMethodCalculate.markEndTimeMs("resetOptionMaps", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
                return;
            }
        }
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        return C0966R.C0971layout.c2x;
    }

    public int getResourceId() {
        SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        return -1;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        super.initView();
        setMMTitle((int) C0966R.string.jcd);
        setBackBtn(new C95591a());
        this.f278355g = (TextView) findViewById(C0966R.C0970id.jt5);
        this.f278356h = (EditText) findViewById(C0966R.C0970id.jt6);
        this.f278357i = (ListView) findViewById(16908298);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.cn9);
        this.f278358j = linearLayout;
        linearLayout.setOnClickListener(new C95592b());
        this.f278356h.setVisibility(8);
        this.f278355g.setVisibility(8);
        this.f278359n = getPreferenceScreen();
        SnsMethodCalculate.markStartTimeMs("initPref", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        C47511g gVar = this.f278359n;
        if (gVar == null) {
            Log.m105920e("MicroMsg.SnsNotInterestUI", "initPref error, PreferenceScreen is null!");
            SnsMethodCalculate.markEndTimeMs("initPref", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        } else {
            if (gVar.mo72519a("sns_expose_desc") == null) {
                PreferenceTitleCategory preferenceTitleCategory = new PreferenceTitleCategory(this, (AttributeSet) null);
                preferenceTitleCategory.mo69923G(C0966R.string.f361371jc1);
                preferenceTitleCategory.mo26273A("sns_expose_desc");
                this.f278359n.mo72527k(preferenceTitleCategory);
            }
            int i = 0;
            while (true) {
                String[] strArr = f278349v;
                if (i >= 7) {
                    break;
                }
                String str = strArr[i];
                int i2 = f278351x[i];
                if (this.f278359n.mo72519a(str) == null) {
                    Preference preference = new Preference(this);
                    preference.mo69923G(i2);
                    preference.mo26273A(str);
                    preference.f121271G = C0966R.C0971layout.bcy;
                    preference.f121272H = C0966R.C0971layout.bd7;
                    this.f278359n.mo72527k(preference);
                }
                i++;
            }
            SnsMethodCalculate.markEndTimeMs("initPref", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        }
        addTextOptionMenu(0, getString(C0966R.string.anw), new C95593c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        enableOptionMenu(0, false);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    public void onCreate(Bundle bundle) {
        String userName;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        super.onCreate(bundle);
        this.f278360o = getIntent().getIntExtra("sns_info_not_interest_scene", 0);
        long longExtra = getIntent().getLongExtra("sns_info_svr_id", 0);
        this.f278362q = longExtra;
        if (!(longExtra == 0 || (userName = C94866e1.Yx0().mo139806SE(this.f278362q).getUserName()) == null)) {
            C86709a0.m107528h();
            int i = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(userName).f149500H;
            if (i == 2) {
                f278351x[1] = C0966R.string.jc9;
            } else if (i == 1) {
                f278351x[1] = C0966R.string.jc_;
            }
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(218, this);
        mo132865H7();
        initView();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        super.onDestroy();
        mo132865H7();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(218, this);
        FinishSendNotInterestSnsEvent finishSendNotInterestSnsEvent = new FinishSendNotInterestSnsEvent();
        FinishSendNotInterestSnsEvent.C92518a aVar = finishSendNotInterestSnsEvent.f264869d;
        aVar.f264870a = this.f278363r;
        aVar.f264871b = this.f278362q;
        finishSendNotInterestSnsEvent.publish();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        if (preference == null) {
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            return false;
        }
        String str = preference.f121285r;
        if (this.f278352d.containsKey(str)) {
            boolean booleanValue = this.f278352d.get(str).booleanValue();
            if (booleanValue) {
                preference.f121272H = C0966R.C0971layout.bd7;
            } else {
                preference.f121272H = C0966R.C0971layout.bd6;
            }
            gVar.notifyDataSetChanged();
            boolean z2 = !booleanValue;
            this.f278352d.put(str, Boolean.valueOf(z2));
            int intValue = this.f278354f.get(str).intValue();
            this.f278353e.put(Integer.valueOf(intValue), Boolean.valueOf(z2));
            Log.m105919d("MicroMsg.SnsNotInterestUI", "click: %s, notInterestType: %d, isCheck: %b", str, Integer.valueOf(intValue), Boolean.valueOf(z2));
            SnsMethodCalculate.markStartTimeMs("isSomethingCheck", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            Iterator<Boolean> it = this.f278352d.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().booleanValue()) {
                        SnsMethodCalculate.markEndTimeMs("isSomethingCheck", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
                        z = true;
                        break;
                    }
                } else {
                    SnsMethodCalculate.markEndTimeMs("isSomethingCheck", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
                    z = false;
                    break;
                }
            }
            if (z) {
                enableOptionMenu(0, true);
            } else {
                enableOptionMenu(0, false);
            }
            if (z2 && str.equals("sns_expose_reason_other")) {
                this.f278356h.setVisibility(0);
                this.f278355g.setVisibility(0);
                this.f278356h.requestFocus();
                this.f278364s = true;
                showVKB();
            } else if (!this.f278352d.get("sns_expose_reason_other").booleanValue()) {
                this.f278356h.setVisibility(8);
                this.f278355g.setVisibility(8);
                this.f278357i.requestFocus();
                this.f278364s = false;
                hideVKB();
            } else {
                this.f278357i.requestFocus();
                hideVKB();
            }
            SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        return false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        Log.m105919d("MicroMsg.SnsNotInterestUI", "onSceneEnd, errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (yVar.getType() == 218) {
            this.f278365t.dismiss();
            this.f278365t = null;
            if (((C94877g0) yVar).mo131050m1() == 9) {
                if (i == 0 && i2 == 0) {
                    this.f278363r = true;
                    Toast.makeText(this, C0966R.string.jcc, 1).show();
                    finish();
                } else {
                    this.f278363r = false;
                    Toast.makeText(this, C0966R.string.f361372jc2, 1).show();
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
    }
}
