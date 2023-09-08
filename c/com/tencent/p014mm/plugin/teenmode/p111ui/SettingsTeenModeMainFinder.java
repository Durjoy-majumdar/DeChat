package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderTeenModeChangeEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import ky2.C10432i;
import ly2.C10685q;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C51018qv3;
import te3.pf4;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder */
public class SettingsTeenModeMainFinder extends MMActivity {

    /* renamed from: d */
    public WeImageView f21519d;

    /* renamed from: e */
    public WeImageView f21520e;

    /* renamed from: f */
    public LinearLayout f21521f;

    /* renamed from: g */
    public int f21522g = 2;

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder$a */
    public class C5604a implements View.OnClickListener {
        public C5604a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsTeenModeMainFinder settingsTeenModeMainFinder = SettingsTeenModeMainFinder.this;
            settingsTeenModeMainFinder.f21522g = 1;
            settingsTeenModeMainFinder.mo6631K7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder$b */
    public class C5605b implements View.OnClickListener {
        public C5605b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsTeenModeMainFinder settingsTeenModeMainFinder = SettingsTeenModeMainFinder.this;
            settingsTeenModeMainFinder.f21522g = 2;
            settingsTeenModeMainFinder.mo6631K7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder$c */
    public class C5606c implements View.OnClickListener {
        public C5606c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("from_teen_mode_setting_page", true);
            C88144b.m109791i(SettingsTeenModeMainFinder.this, "finder", ".ui.FinderFollowListUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder$d */
    public class C5607d implements MenuItem.OnMenuItemClickListener {
        public C5607d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsTeenModeMainFinder.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: H7 */
    public static String m5448H7() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.me4);
        String J7 = m5450J7(C32735h.C32737c.clicfg_finder_teenmode_main_range_all, string);
        return Util.isNullOrNil(J7) ? string : J7;
    }

    /* renamed from: I7 */
    public static String m5449I7() {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.jxo);
        String J7 = m5450J7(C32735h.C32737c.clicfg_finder_teenmode_range_none_tv, string);
        return Util.isNullOrNil(J7) ? string : J7;
    }

    /* renamed from: J7 */
    public static String m5450J7(C32735h.C32737c cVar, String str) {
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        try {
            JSONObject jSONObject = new JSONObject(((C32735h) C86312j.m106911c(C32735h.class)).Y60(cVar, ""));
            if (jSONObject.has(currentLanguage)) {
                str = jSONObject.getString(currentLanguage);
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.SettingsTeenModeMainFinder", e, "", new Object[0]);
        }
        Log.m105925i("MicroMsg.SettingsTeenModeMainFinder", "[getServerConfigTitle] title=%s", str);
        return str;
    }

    /* renamed from: K7 */
    public final void mo6631K7() {
        TextView textView = (TextView) findViewById(C0966R.C0970id.kgj);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.kgl);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.f358290e82);
        textView.setContentDescription(m5448H7());
        textView.setText(m5448H7());
        textView2.setContentDescription(getString(C0966R.string.jxo));
        textView2.setText(m5449I7());
        this.f21519d.setVisibility(8);
        this.f21520e.setVisibility(8);
        this.f21521f.setVisibility(4);
        int i = this.f21522g;
        if (i == 1) {
            this.f21519d.setVisibility(0);
            textView3.setContentDescription(MMApplicationContext.getContext().getResources().getString(C0966R.string.f361440jx3));
            textView3.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.f361440jx3));
            textView.setContentDescription(getString(C0966R.string.jwz) + m5448H7());
        } else if (i == 2) {
            this.f21520e.setVisibility(0);
            textView3.setContentDescription(MMApplicationContext.getContext().getResources().getString(C0966R.string.f361439jx2));
            textView3.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.f361439jx2));
            textView2.setContentDescription(getString(C0966R.string.jwz) + m5449I7());
        }
        Log.m105919d("MicroMsg.SettingsTeenModeMainFinder", "doSaveConfig: %s", Integer.valueOf(this.f21522g));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, Integer.valueOf(this.f21522g));
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.by4;
    }

    public final void init() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        this.f21519d = (WeImageView) findViewById(C0966R.C0970id.kgi);
        this.f21520e = (WeImageView) findViewById(C0966R.C0970id.kgk);
        this.f21521f = (LinearLayout) findViewById(C0966R.C0970id.ck9);
        this.f21522g = ((C10432i) C86312j.m106911c(C10432i.class)).mo10740Mn();
        mo6631K7();
        ((View) this.f21519d.getParent()).setOnClickListener(new C5604a());
        ((View) this.f21520e.getParent()).setOnClickListener(new C5605b());
        this.f21521f.setOnClickListener(new C5606c());
        setBackBtn(new C5607d());
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    public void onDestroy() {
        Class cls = C10685q.class;
        Log.m105919d("MicroMsg.SettingsTeenModeMainFinder", "doLog: %s", Integer.valueOf(this.f21522g));
        pf4 pf4 = new pf4();
        pf4.f139744d = this.f21522g;
        if (((C10685q) C86312j.m106911c(cls)).f32106f != null) {
            C51018qv3 qv32 = new C51018qv3();
            pf4.f139745e = qv32;
            qv32.mo73350k(((C10685q) C86312j.m106911c(cls)).f32106f.getBytes());
        }
        pf4.f139746f = ((C10685q) C86312j.m106911c(cls)).f32107g;
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).x90().mo71315mc(new C32330n(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB, pf4));
        ((C10432i) C86312j.m106911c(C10432i.class)).I40();
        new FinderTeenModeChangeEvent().publish();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }
}
