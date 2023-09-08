package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.setting.p102ui.setting.permission.SettingCameraPermissionUI;
import com.tencent.p014mm.plugin.setting.p102ui.setting.permission.SettingContactPermissionUI;
import com.tencent.p014mm.plugin.setting.p102ui.setting.permission.SettingLocationPermissionUI;
import com.tencent.p014mm.plugin.setting.p102ui.setting.permission.SettingMicrophonePermissionUI;
import com.tencent.p014mm.plugin.setting.p102ui.setting.permission.SettingOverlayPermissionUI;
import com.tencent.p014mm.plugin.setting.p102ui.setting.permission.SettingSportPermissionUI;
import com.tencent.p014mm.plugin.setting.p102ui.setting.permission.SettingStoragePermissionUI;
import di3.C86312j;
import gy3.C8477a0;
import gy3.C87412m;
import in3.C87771d;
import in3.C87773e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import p156gj.C87203t;
import p447aw.C103918d;
import rx3.C13604l;
import sx3.C64197v;
import sx3.C90364q0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lin3/d$b;", "mStatusBarHeightCallback", "Lin3/d$b;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI */
public final class SettingsSystemPermissionUI extends MMActivity {

    /* renamed from: d */
    public final List<Integer> f20928d = C64197v.m75537f(Integer.valueOf(C0966R.C0970id.lxv), Integer.valueOf(C0966R.C0970id.lxw), Integer.valueOf(C0966R.C0970id.lxx), Integer.valueOf(C0966R.C0970id.lxy), Integer.valueOf(C0966R.C0970id.lxz), Integer.valueOf(C0966R.C0970id.f357846ly0), Integer.valueOf(C0966R.C0970id.f357847ly1));

    /* renamed from: e */
    public final List<Integer> f20929e = C64197v.m75537f(Integer.valueOf(C0966R.C0970id.bix), Integer.valueOf(C0966R.C0970id.biy), Integer.valueOf(C0966R.C0970id.f357465bj0), Integer.valueOf(C0966R.C0970id.f357466bj1), Integer.valueOf(C0966R.C0970id.blx), Integer.valueOf(C0966R.C0970id.c7j), Integer.valueOf(C0966R.C0970id.dyr));

    /* renamed from: f */
    public View f20930f;
    private C87771d.C46280b mStatusBarHeightCallback;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI$a */
    public static final class C5312a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsSystemPermissionUI f20931d;

        public C5312a(SettingsSystemPermissionUI settingsSystemPermissionUI) {
            this.f20931d = settingsSystemPermissionUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsSystemPermissionUI settingsSystemPermissionUI = this.f20931d;
            Intent intent = new Intent(this.f20931d.getContext(), SettingMicrophonePermissionUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsSystemPermissionUI settingsSystemPermissionUI2 = settingsSystemPermissionUI;
            C117292a.m165358d(settingsSystemPermissionUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSystemPermissionUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsSystemPermissionUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI$b */
    public static final class C5313b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsSystemPermissionUI f20932d;

        public C5313b(SettingsSystemPermissionUI settingsSystemPermissionUI) {
            this.f20932d = settingsSystemPermissionUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsSystemPermissionUI settingsSystemPermissionUI = this.f20932d;
            Intent intent = new Intent(this.f20932d.getContext(), SettingSportPermissionUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsSystemPermissionUI settingsSystemPermissionUI2 = settingsSystemPermissionUI;
            C117292a.m165358d(settingsSystemPermissionUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSystemPermissionUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsSystemPermissionUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI$c */
    public static final class C5314c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsSystemPermissionUI f20933d;

        public C5314c(SettingsSystemPermissionUI settingsSystemPermissionUI) {
            this.f20933d = settingsSystemPermissionUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsSystemPermissionUI settingsSystemPermissionUI = this.f20933d;
            Intent intent = new Intent(this.f20933d.getContext(), SettingOverlayPermissionUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsSystemPermissionUI settingsSystemPermissionUI2 = settingsSystemPermissionUI;
            C117292a.m165358d(settingsSystemPermissionUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSystemPermissionUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsSystemPermissionUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI$d */
    public static final class C5315d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsSystemPermissionUI f20934d;

        public C5315d(SettingsSystemPermissionUI settingsSystemPermissionUI) {
            this.f20934d = settingsSystemPermissionUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsSystemPermissionUI settingsSystemPermissionUI = this.f20934d;
            Intent intent = new Intent(this.f20934d.getContext(), SettingLocationPermissionUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsSystemPermissionUI settingsSystemPermissionUI2 = settingsSystemPermissionUI;
            C117292a.m165358d(settingsSystemPermissionUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSystemPermissionUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsSystemPermissionUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI$e */
    public static final class C5316e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsSystemPermissionUI f20935d;

        public C5316e(SettingsSystemPermissionUI settingsSystemPermissionUI) {
            this.f20935d = settingsSystemPermissionUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsSystemPermissionUI settingsSystemPermissionUI = this.f20935d;
            Intent intent = new Intent(this.f20935d.getContext(), SettingStoragePermissionUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsSystemPermissionUI settingsSystemPermissionUI2 = settingsSystemPermissionUI;
            C117292a.m165358d(settingsSystemPermissionUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSystemPermissionUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsSystemPermissionUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI$f */
    public static final class C5317f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsSystemPermissionUI f20936d;

        public C5317f(SettingsSystemPermissionUI settingsSystemPermissionUI) {
            this.f20936d = settingsSystemPermissionUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsSystemPermissionUI settingsSystemPermissionUI = this.f20936d;
            Intent intent = new Intent(this.f20936d.getContext(), SettingContactPermissionUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsSystemPermissionUI settingsSystemPermissionUI2 = settingsSystemPermissionUI;
            C117292a.m165358d(settingsSystemPermissionUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSystemPermissionUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsSystemPermissionUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI$g */
    public static final class C5318g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsSystemPermissionUI f20937d;

        public C5318g(SettingsSystemPermissionUI settingsSystemPermissionUI) {
            this.f20937d = settingsSystemPermissionUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsSystemPermissionUI settingsSystemPermissionUI = this.f20937d;
            Intent intent = new Intent(this.f20937d.getContext(), SettingCameraPermissionUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsSystemPermissionUI settingsSystemPermissionUI2 = settingsSystemPermissionUI;
            C117292a.m165358d(settingsSystemPermissionUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSystemPermissionUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsSystemPermissionUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI$h */
    public static final class C5319h implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsSystemPermissionUI f20938d;

        public C5319h(SettingsSystemPermissionUI settingsSystemPermissionUI) {
            this.f20938d = settingsSystemPermissionUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20938d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI$i */
    public static final class C5320i implements View.OnScrollChangeListener {

        /* renamed from: a */
        public final /* synthetic */ SettingsSystemPermissionUI f20939a;

        /* renamed from: b */
        public final /* synthetic */ C8477a0 f20940b;

        public C5320i(SettingsSystemPermissionUI settingsSystemPermissionUI, C8477a0 a0Var) {
            this.f20939a = settingsSystemPermissionUI;
            this.f20940b = a0Var;
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (view.getScrollY() > C76577a.m92151b(this.f20939a.getContext(), 80)) {
                if (this.f20940b.f27482d) {
                    this.f20939a.setMMTitle((int) C0966R.string.ixb);
                    SettingsSystemPermissionUI settingsSystemPermissionUI = this.f20939a;
                    settingsSystemPermissionUI.setActionbarColor(settingsSystemPermissionUI.getResources().getColor(C0966R.color.f2929c));
                    this.f20939a.supportLightStatusBar();
                    this.f20940b.f27482d = false;
                }
            } else if (!this.f20940b.f27482d) {
                this.f20939a.setMMTitle("");
                SettingsSystemPermissionUI settingsSystemPermissionUI2 = this.f20939a;
                settingsSystemPermissionUI2.setActionbarColor(settingsSystemPermissionUI2.getResources().getColor(C0966R.color.f2929c));
                SettingsSystemPermissionUI settingsSystemPermissionUI3 = this.f20939a;
                settingsSystemPermissionUI3.setActionbarElementColor(settingsSystemPermissionUI3.getContext().getResources().getColor(C0966R.color.FG_0));
                this.f20939a.supportLightStatusBar();
                this.f20940b.f27482d = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI$j */
    public static final class C5321j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsSystemPermissionUI f20941d;

        public C5321j(SettingsSystemPermissionUI settingsSystemPermissionUI) {
            this.f20941d = settingsSystemPermissionUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f20941d.getContext());
            UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new UserPrivacySettingClientReportStruct();
            userPrivacySettingClientReportStruct.f10079d = 101;
            userPrivacySettingClientReportStruct.mo86054n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359973by0;
    }

    public void initView() {
        boolean z;
        boolean z2;
        Class cls = C113177k.class;
        Class cls2 = C103918d.class;
        super.initView();
        View findViewById = findViewById(C0966R.C0970id.huc);
        View findViewById2 = findViewById(C0966R.C0970id.hu8);
        View findViewById3 = findViewById(C0966R.C0970id.huh);
        View findViewById4 = findViewById(C0966R.C0970id.hue);
        View findViewById5 = findViewById(C0966R.C0970id.hug);
        View findViewById6 = findViewById(C0966R.C0970id.hu6);
        View findViewById7 = findViewById(C0966R.C0970id.huf);
        boolean z3 = false;
        for (Map.Entry entry : ((LinkedHashMap) C90364q0.m113148g(new C13604l("android.permission.ACCESS_FINE_LOCATION", findViewById), new C13604l("android.permission.READ_CONTACTS", findViewById2), new C13604l("android.permission.READ_EXTERNAL_STORAGE", findViewById3), new C13604l("android.permission.RECORD_AUDIO", findViewById4), new C13604l("android.permission.ACTIVITY_RECOGNITION", findViewById5), new C13604l("android.permission.CAMERA", findViewById6))).entrySet()) {
            View view = (View) entry.getValue();
            if (((C103918d) C86312j.m106911c(cls2)).Gd0(getContext(), (String) entry.getKey())) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                z3 = true;
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (((C103918d) C86312j.m106911c(cls2)).mo125787w8(getContext())) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view4 = findViewById7;
            z2 = true;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z = true;
        } else {
            z2 = true;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view5 = findViewById7;
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z = z3;
        }
        if (z) {
            View findViewById8 = findViewById(C0966R.C0970id.eqo);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view6 = findViewById8;
            C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById9 = findViewById(C0966R.C0970id.hgl);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view7 = findViewById9;
            C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById10 = findViewById(C0966R.C0970id.eqo);
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(8);
            View view8 = findViewById10;
            C117292a.m165358d(view8, aVar7.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById10.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById11 = findViewById(C0966R.C0970id.hgl);
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(0);
            View view9 = findViewById11;
            C117292a.m165358d(view9, aVar8.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new UserPrivacySettingClientReportStruct();
        userPrivacySettingClientReportStruct.f10079d = 102;
        userPrivacySettingClientReportStruct.f10084i = userPrivacySettingClientReportStruct.mo86045b("DeviceID", C87203t.m108266b(), z2);
        userPrivacySettingClientReportStruct.f10085j = userPrivacySettingClientReportStruct.mo86045b("CurrentPrivacyFullStatus", ((C113177k) C86312j.m106911c(cls)).y60(), z2);
        userPrivacySettingClientReportStruct.mo86054n();
        if (((C113177k) C86312j.m106911c(cls)).vf0()) {
            for (Number intValue : this.f20928d) {
                View findViewById12 = findViewById(intValue.intValue());
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar9.mo10233c(0);
                C117292a.m165358d(findViewById12, aVar9.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById12.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById12, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            for (Number intValue2 : this.f20929e) {
                View findViewById13 = findViewById(intValue2.intValue());
                C9556a aVar10 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar10.mo10233c(8);
                C117292a.m165358d(findViewById13, aVar10.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById13.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById13, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return;
        }
        for (Number intValue3 : this.f20928d) {
            View findViewById14 = findViewById(intValue3.intValue());
            C9556a aVar11 = new C9556a();
            ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
            aVar11.mo10233c(8);
            View view10 = findViewById14;
            C117292a.m165358d(view10, aVar11.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById14.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        for (Number intValue4 : this.f20929e) {
            View findViewById15 = findViewById(intValue4.intValue());
            C9556a aVar12 = new C9556a();
            ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
            aVar12.mo10233c(0);
            View view11 = findViewById15;
            C117292a.m165358d(view11, aVar12.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById15.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        findViewById(C0966R.C0970id.m7s).setOnClickListener(new C5315d(this));
        findViewById(C0966R.C0970id.huh).setOnClickListener(new C5316e(this));
        findViewById2.setOnClickListener(new C5317f(this));
        findViewById6.setOnClickListener(new C5318g(this));
        findViewById4.setOnClickListener(new C5312a(this));
        findViewById5.setOnClickListener(new C5313b(this));
        findViewById7.setOnClickListener(new C5314c(this));
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        customfixStatusbar(true);
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.f5383do);
        this.f20930f = findViewById;
        if (findViewById != null && C87771d.f254121g) {
            C87771d b = C87771d.m109203b(this);
            C5372l3 l3Var = new C5372l3(this);
            this.mStatusBarHeightCallback = l3Var;
            b.mo122180d(l3Var);
            getWindow().getDecorView().requestApplyInsets();
            C87773e.m109211d(getWindow());
        }
        setNavigationbarColor(getResources().getColor(C0966R.color.f2929c));
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        setActionbarElementColor(getContext().getResources().getColor(C0966R.color.FG_0));
        setBackBtn(new C5319h(this));
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.knx)).getPaint(), 0.8f);
        supportLightStatusBar();
        C8477a0 a0Var = new C8477a0();
        a0Var.f27482d = true;
        View findViewById2 = findViewById(C0966R.C0970id.eqo);
        C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.ScrollView");
        ((ScrollView) findViewById2).setOnScrollChangeListener(new C5320i(this, a0Var));
        Integer[] numArr = {Integer.valueOf(C0966R.C0970id.eqi), Integer.valueOf(C0966R.C0970id.eqj)};
        for (int i = 0; i < 2; i++) {
            TextView textView = (TextView) findViewById(numArr[i].intValue());
            if (textView != null) {
                textView.setOnClickListener(new C5321j(this));
            }
        }
    }

    public void onResume() {
        super.onResume();
        initView();
    }
}
