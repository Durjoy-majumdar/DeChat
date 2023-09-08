package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import ky2.C10432i;
import ly2.C10685q;
import te3.C51018qv3;
import te3.of4;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct */
public class SettingsTeenModeMainBizAcct extends MMActivity {

    /* renamed from: d */
    public WeImageView f21510d;

    /* renamed from: e */
    public WeImageView f21511e;

    /* renamed from: f */
    public WeImageView f21512f;

    /* renamed from: g */
    public LinearLayout f21513g;

    /* renamed from: h */
    public int f21514h = 0;

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct$a */
    public class C5599a implements View.OnClickListener {
        public C5599a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct = SettingsTeenModeMainBizAcct.this;
            settingsTeenModeMainBizAcct.f21514h = 1;
            settingsTeenModeMainBizAcct.mo6625H7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct$b */
    public class C5600b implements View.OnClickListener {
        public C5600b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct = SettingsTeenModeMainBizAcct.this;
            settingsTeenModeMainBizAcct.f21514h = 0;
            settingsTeenModeMainBizAcct.mo6625H7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct$c */
    public class C5601c implements View.OnClickListener {
        public C5601c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct = SettingsTeenModeMainBizAcct.this;
            settingsTeenModeMainBizAcct.f21514h = 2;
            settingsTeenModeMainBizAcct.mo6625H7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct$d */
    public class C5602d implements View.OnClickListener {
        public C5602d(SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("intent_service_type", 251658241);
            C88144b.m109791i(view.getContext(), "brandservice", ".ui.BrandServiceIndexUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct$e */
    public class C5603e implements MenuItem.OnMenuItemClickListener {
        public C5603e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsTeenModeMainBizAcct.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo6625H7() {
        TextView textView = (TextView) findViewById(C0966R.C0970id.kgj);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.kgn);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.kgl);
        textView.setContentDescription(getString(C0966R.string.jxm));
        textView2.setContentDescription(getString(C0966R.string.f361438jx0));
        textView3.setContentDescription(getString(C0966R.string.jxo));
        this.f21510d.setVisibility(8);
        this.f21511e.setVisibility(8);
        this.f21512f.setVisibility(8);
        this.f21513g.setVisibility(4);
        int i = this.f21514h;
        if (i == 0) {
            this.f21511e.setVisibility(0);
            this.f21513g.setVisibility(0);
            textView2.setContentDescription(getString(C0966R.string.jwz) + getString(C0966R.string.f361438jx0));
        } else if (i == 1) {
            this.f21510d.setVisibility(0);
            textView.setContentDescription(getString(C0966R.string.jwz) + getString(C0966R.string.jxm));
        } else if (i == 2) {
            this.f21512f.setVisibility(0);
            textView3.setContentDescription(getString(C0966R.string.jwz) + getString(C0966R.string.jxo));
        }
        Log.m105919d("MicroMsg.SettingsTeenModeMainBizAcct", "doSaveConfig: %s", Integer.valueOf(this.f21514h));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_BIZ_ACCT_RANGE_INT_SYNC, Integer.valueOf(this.f21514h));
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359976by3;
    }

    public final void init() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        this.f21510d = (WeImageView) findViewById(C0966R.C0970id.kgi);
        this.f21511e = (WeImageView) findViewById(C0966R.C0970id.kgm);
        this.f21512f = (WeImageView) findViewById(C0966R.C0970id.kgk);
        this.f21513g = (LinearLayout) findViewById(C0966R.C0970id.ck9);
        this.f21514h = ((C10432i) C86312j.m106911c(C10432i.class)).mo10751fd();
        mo6625H7();
        ((View) this.f21510d.getParent()).setOnClickListener(new C5599a());
        ((View) this.f21511e.getParent()).setOnClickListener(new C5600b());
        ((View) this.f21512f.getParent()).setOnClickListener(new C5601c());
        this.f21513g.setOnClickListener(new C5602d(this));
        setBackBtn(new C5603e());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    public void onDestroy() {
        Class cls = C10685q.class;
        Log.m105919d("MicroMsg.SettingsTeenModeMainBizAcct", "doOplog: %s", Integer.valueOf(this.f21514h));
        of4 of4 = new of4();
        of4.f139147d = this.f21514h;
        if (((C10685q) C86312j.m106911c(cls)).f32106f != null) {
            C51018qv3 qv32 = new C51018qv3();
            of4.f139148e = qv32;
            qv32.mo73350k(((C10685q) C86312j.m106911c(cls)).f32106f.getBytes());
        }
        of4.f139149f = ((C10685q) C86312j.m106911c(cls)).f32107g;
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).x90().mo71315mc(new C32330n(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, of4));
        ((C10432i) C86312j.m106911c(C10432i.class)).I40();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }
}
