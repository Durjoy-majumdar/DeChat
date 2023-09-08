package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.BindWordingContent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import hg0.C76186t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p214om.C11502f;
import p286zl.C79396l;
import tc0.C77885p;
import te3.C64266br1;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI */
public class BindMobileStatusUI extends MMWizardActivity {

    /* renamed from: z */
    public static final /* synthetic */ int f196436z = 0;

    /* renamed from: e */
    public ImageView f196437e;

    /* renamed from: f */
    public TextView f196438f;

    /* renamed from: g */
    public TextView f196439g;

    /* renamed from: h */
    public Button f196440h;

    /* renamed from: i */
    public ImageView f196441i;

    /* renamed from: j */
    public ImageView f196442j;

    /* renamed from: n */
    public Boolean f196443n;

    /* renamed from: o */
    public Boolean f196444o;

    /* renamed from: p */
    public RelativeLayout f196445p;

    /* renamed from: q */
    public RelativeLayout f196446q;

    /* renamed from: r */
    public int f196447r;

    /* renamed from: s */
    public BindWordingContent f196448s;

    /* renamed from: t */
    public int f196449t;

    /* renamed from: u */
    public boolean f196450u;

    /* renamed from: v */
    public boolean f196451v;

    /* renamed from: w */
    public SharedPreferences f196452w;

    /* renamed from: x */
    public HashMap<Integer, Integer> f196453x = new HashMap<>();

    /* renamed from: y */
    public SparseArray<String> f196454y = new SparseArray<>(3);

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI$a */
    public class C68372a implements MenuItem.OnMenuItemClickListener {
        public C68372a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindMobileStatusUI bindMobileStatusUI = BindMobileStatusUI.this;
            int i = BindMobileStatusUI.f196436z;
            bindMobileStatusUI.mo7681K7(1);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI$b */
    public class C68373b implements View.OnClickListener {
        public C68373b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindMobileStatusUI bindMobileStatusUI = BindMobileStatusUI.this;
            bindMobileStatusUI.f196443n = Boolean.valueOf(!bindMobileStatusUI.f196443n.booleanValue());
            if (BindMobileStatusUI.this.f196443n.booleanValue()) {
                BindMobileStatusUI.this.f196441i.setImageResource(C0966R.raw.checkbox_selected);
            } else {
                BindMobileStatusUI.this.f196441i.setImageResource(C0966R.C0969drawable.f4823ny);
            }
            BindMobileStatusUI bindMobileStatusUI2 = BindMobileStatusUI.this;
            bindMobileStatusUI2.mo93918O7(!bindMobileStatusUI2.f196443n.booleanValue(), 512, 8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI$c */
    public class C68374c implements View.OnClickListener {
        public C68374c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindMobileStatusUI bindMobileStatusUI = BindMobileStatusUI.this;
            bindMobileStatusUI.f196444o = Boolean.valueOf(!bindMobileStatusUI.f196444o.booleanValue());
            if (BindMobileStatusUI.this.f196444o.booleanValue()) {
                BindMobileStatusUI.this.f196442j.setImageResource(C0966R.raw.checkbox_selected);
            } else {
                BindMobileStatusUI.this.f196442j.setImageResource(C0966R.C0969drawable.f4823ny);
            }
            BindMobileStatusUI bindMobileStatusUI2 = BindMobileStatusUI.this;
            bindMobileStatusUI2.mo93918O7(!bindMobileStatusUI2.f196444o.booleanValue(), 256, 7);
            if (!BindMobileStatusUI.this.f196444o.booleanValue()) {
                BindMobileStatusUI.this.mo93918O7(false, 2097152, 32);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI$d */
    public class C68375d implements View.OnClickListener {
        public C68375d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindMobileStatusUI bindMobileStatusUI = BindMobileStatusUI.this;
            int i = BindMobileStatusUI.f196436z;
            bindMobileStatusUI.mo7681K7(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public BindMobileStatusUI() {
        Boolean bool = Boolean.TRUE;
        this.f196443n = bool;
        this.f196444o = bool;
    }

    /* renamed from: N7 */
    public static void m80724N7(Context context, boolean z, boolean z2) {
        Class cls = C75700k0.class;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        sharedPreferences.edit().putBoolean("settings_find_me_by_mobile", z ^ true).commit();
        sharedPreferences.edit().putBoolean("settings_recommend_mobilefriends_to_me", z2 ^ true).commit();
        int q = C75592q0.m90787q();
        int i = z ? q | 512 : q & -513;
        C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(z2 ? i | 256 : i & -257));
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 8;
        int i2 = 2;
        br12.f182325e = z2 ? 1 : 2;
        ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(23, br12));
        C64266br1 br13 = new C64266br1();
        br13.f182324d = 7;
        if (z) {
            i2 = 1;
        }
        br12.f182325e = i2;
        ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(23, br13));
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
    }

    /* renamed from: O7 */
    public final boolean mo93918O7(boolean z, int i, int i2) {
        Log.m105918d("MicroMsg.BindMobileStatusUI", "switch change : open = " + z + " item value = " + i + " functionId = " + i2);
        if (z) {
            this.f196447r = i | this.f196447r;
        } else {
            this.f196447r = (~i) & this.f196447r;
        }
        this.f196453x.put(Integer.valueOf(i2), Integer.valueOf(z ? 1 : 2));
        String str = this.f196454y.get(i2);
        if (!(this.f196452w == null || str == null || str.length() <= 0)) {
            Boolean valueOf = Boolean.valueOf(z);
            if (i2 == 8 || i2 == 7) {
                valueOf = Boolean.valueOf(!z);
            }
            this.f196452w.edit().putBoolean(str, valueOf.booleanValue()).commit();
        }
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6568ij;
    }

    public void initView() {
        this.f196437e = (ImageView) findViewById(C0966R.C0970id.a9l);
        this.f196439g = (TextView) findViewById(C0966R.C0970id.a9j);
        this.f196438f = (TextView) findViewById(C0966R.C0970id.a9i);
        this.f196440h = (Button) findViewById(C0966R.C0970id.a9k);
        this.f196441i = (ImageView) findViewById(C0966R.C0970id.a_8);
        this.f196442j = (ImageView) findViewById(C0966R.C0970id.a_7);
        this.f196445p = (RelativeLayout) findViewById(C0966R.C0970id.a9f);
        this.f196446q = (RelativeLayout) findViewById(C0966R.C0970id.a9g);
        int i = this.f196449t;
        if (i == 0) {
            this.f196445p.setVisibility(8);
            this.f196446q.setVisibility(8);
            mo93918O7(!this.f196450u, 512, 8);
            mo93918O7(!this.f196451v, 256, 7);
        } else if (i == 1) {
            this.f196445p.setVisibility(0);
            this.f196445p.setBackgroundResource(C0966R.C0969drawable.f4560g2);
            this.f196446q.setVisibility(8);
        }
        BindWordingContent bindWordingContent = this.f196448s;
        if (bindWordingContent != null && bindWordingContent.f195811f.intValue() == 2) {
            this.f196438f.setVisibility(8);
        }
        this.f196440h.setVisibility(8);
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C68372a());
        if (C76186t.m91534b() == C79396l.SUCC || C76186t.m91534b() == C79396l.SUCC_UNLOAD) {
            this.f196437e.setImageResource(C0966R.C0969drawable.bdz);
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
            if (str == null || str.equals("")) {
                String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(4097, (Object) null);
            }
        } else {
            this.f196437e.setImageResource(C0966R.C0969drawable.bdw);
            this.f196438f.setVisibility(8);
            this.f196439g.setText(getString(C0966R.string.aji));
        }
        this.f196441i.setOnClickListener(new C68373b());
        this.f196442j.setOnClickListener(new C68374c());
        this.f196440h.setOnClickListener(new C68375d());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f196452w = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.f196447r = C75592q0.m90787q();
        this.f196454y.put(8, "settings_find_me_by_mobile");
        this.f196454y.put(7, "settings_recommend_mobilefriends_to_me");
        this.f196454y.put(32, "settings_autoadd_mobilefriends");
        mo93918O7(false, 512, 8);
        mo93918O7(false, 256, 7);
        setMMTitle((int) C0966R.string.akp);
        this.f196448s = (BindWordingContent) getIntent().getParcelableExtra("kstyle_bind_wording");
        this.f196449t = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
        this.f196450u = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
        this.f196451v = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo7681K7(1);
        return true;
    }

    public void onPause() {
        C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(this.f196447r));
        for (Map.Entry next : this.f196453x.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            C64266br1 br12 = new C64266br1();
            br12.f182324d = intValue;
            br12.f182325e = intValue2;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
            Log.m105918d("MicroMsg.BindMobileStatusUI", "switch  " + intValue + " " + intValue2);
        }
        this.f196453x.clear();
        super.onPause();
    }
}
