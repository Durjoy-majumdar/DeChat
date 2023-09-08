package com.tencent.p014mm.plugin.teenmode.p111ui;

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
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76633z0;
import ky2.C10432i;
import ly2.C10685q;
import te3.C51018qv3;
import te3.nf4;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram */
public class SettingsTeenModeMainMiniProgram extends MMActivity {

    /* renamed from: d */
    public WeImageView f21527d;

    /* renamed from: e */
    public WeImageView f21528e;

    /* renamed from: f */
    public WeImageView f21529f;

    /* renamed from: g */
    public LinearLayout f21530g;

    /* renamed from: h */
    public int f21531h = 0;

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram$a */
    public class C5608a implements View.OnClickListener {
        public C5608a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsTeenModeMainMiniProgram settingsTeenModeMainMiniProgram = SettingsTeenModeMainMiniProgram.this;
            settingsTeenModeMainMiniProgram.f21531h = 1;
            settingsTeenModeMainMiniProgram.mo6636H7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram$b */
    public class C5609b implements View.OnClickListener {
        public C5609b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsTeenModeMainMiniProgram settingsTeenModeMainMiniProgram = SettingsTeenModeMainMiniProgram.this;
            settingsTeenModeMainMiniProgram.f21531h = 0;
            settingsTeenModeMainMiniProgram.mo6636H7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram$c */
    public class C5610c implements View.OnClickListener {
        public C5610c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsTeenModeMainMiniProgram settingsTeenModeMainMiniProgram = SettingsTeenModeMainMiniProgram.this;
            settingsTeenModeMainMiniProgram.f21531h = 2;
            settingsTeenModeMainMiniProgram.mo6636H7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram$d */
    public class C5611d implements View.OnClickListener {
        public C5611d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C76633z0) C86312j.m106911c(C76633z0.class)).Be0(SettingsTeenModeMainMiniProgram.this.getContext(), 5);
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainMiniProgram$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram$e */
    public class C5612e implements MenuItem.OnMenuItemClickListener {
        public C5612e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsTeenModeMainMiniProgram.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo6636H7() {
        TextView textView = (TextView) findViewById(C0966R.C0970id.kgj);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.kgn);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.kgl);
        textView.setContentDescription(getString(C0966R.string.jxm));
        textView2.setContentDescription(getString(C0966R.string.jwv));
        textView3.setContentDescription(getString(C0966R.string.jww));
        this.f21527d.setVisibility(8);
        this.f21528e.setVisibility(8);
        this.f21529f.setVisibility(8);
        this.f21530g.setVisibility(4);
        int i = this.f21531h;
        if (i == 0) {
            this.f21528e.setVisibility(0);
            this.f21530g.setVisibility(0);
            textView2.setContentDescription(getString(C0966R.string.jwz) + getString(C0966R.string.jwv));
        } else if (i == 1) {
            this.f21527d.setVisibility(0);
            textView.setContentDescription(getString(C0966R.string.jwz) + getString(C0966R.string.jxm));
        } else if (i == 2) {
            this.f21529f.setVisibility(0);
            textView3.setContentDescription(getString(C0966R.string.jwz) + getString(C0966R.string.jww));
        }
        Log.m105919d("MicroMsg.SettingsTeenModeMainMiniProgram", "doSaveConfig: %s", Integer.valueOf(this.f21531h));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_MINI_PROGRAM_RANGE_INT_SYNC, Integer.valueOf(this.f21531h));
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.by5;
    }

    public final void init() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        this.f21527d = (WeImageView) findViewById(C0966R.C0970id.kgi);
        this.f21528e = (WeImageView) findViewById(C0966R.C0970id.kgm);
        this.f21529f = (WeImageView) findViewById(C0966R.C0970id.kgk);
        this.f21530g = (LinearLayout) findViewById(C0966R.C0970id.ck9);
        this.f21531h = ((C10432i) C86312j.m106911c(C10432i.class)).Oh0();
        mo6636H7();
        ((View) this.f21527d.getParent()).setOnClickListener(new C5608a());
        ((View) this.f21528e.getParent()).setOnClickListener(new C5609b());
        ((View) this.f21529f.getParent()).setOnClickListener(new C5610c());
        this.f21530g.setOnClickListener(new C5611d());
        setBackBtn(new C5612e());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    public void onDestroy() {
        Class cls = C10685q.class;
        Log.m105919d("MicroMsg.SettingsTeenModeMainMiniProgram", "doOPLog: %s", Integer.valueOf(this.f21531h));
        nf4 nf4 = new nf4();
        nf4.f138585d = this.f21531h;
        if (((C10685q) C86312j.m106911c(cls)).f32106f != null) {
            C51018qv3 qv32 = new C51018qv3();
            nf4.f138586e = qv32;
            qv32.mo73350k(((C10685q) C86312j.m106911c(cls)).f32106f.getBytes());
        }
        nf4.f138587f = ((C10685q) C86312j.m106911c(cls)).f32107g;
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).x90().mo71315mc(new C32330n(225, nf4));
        ((C10432i) C86312j.m106911c(C10432i.class)).I40();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }
}
