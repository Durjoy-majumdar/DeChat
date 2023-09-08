package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ChangeTabbarToEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI */
public class SnsSettingIntroduceUI extends MMActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f116630e = 0;

    /* renamed from: d */
    public Intent f116631d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI$a */
    public class C43091a implements View.OnClickListener {
        public C43091a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingIntroduceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI$1");
            C115669n.INSTANCE.mo160131h(14090, 3);
            SnsSettingIntroduceUI snsSettingIntroduceUI = SnsSettingIntroduceUI.this;
            int i = SnsSettingIntroduceUI.f116630e;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
            Intent intent = snsSettingIntroduceUI.f116631d;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
            C88144b.m109791i(snsSettingIntroduceUI, "sns", ".ui.SnsTimeLineUI", intent, (Bundle) null);
            SnsSettingIntroduceUI.this.finish();
            SnsSettingIntroduceUI.this.overridePendingTransition(0, 0);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingIntroduceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI$b */
    public class C43092b implements View.OnClickListener {
        public C43092b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingIntroduceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI$2");
            ChangeTabbarToEvent changeTabbarToEvent = new ChangeTabbarToEvent();
            changeTabbarToEvent.f107395d.f107396a = 3;
            changeTabbarToEvent.publish();
            C88144b.m109791i(SnsSettingIntroduceUI.this.getContext(), "setting", ".ui.setting.SettingsUI", new Intent(), (Bundle) null);
            Intent intent = new Intent();
            intent.putExtra("enter_scene", 1);
            C88144b.m109791i(SnsSettingIntroduceUI.this.getContext(), "setting", ".ui.setting.SettingsPrivacyUI", intent, (Bundle) null);
            C115669n.INSTANCE.mo160131h(14090, 2);
            SnsSettingIntroduceUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingIntroduceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
        return C0966R.C0971layout.c46;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        hideTitleView();
        this.f116631d = getIntent();
        ((Button) findViewById(C0966R.C0970id.f357484a32)).setOnClickListener(new C43091a());
        C115669n.INSTANCE.mo160131h(14090, 1);
        ((Button) findViewById(C0966R.C0970id.ept)).setOnClickListener(new C43092b());
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
        if (i == 4 && keyEvent.getAction() == 0) {
            finish();
            C115669n.INSTANCE.mo160131h(14090, 3);
            SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
            return true;
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI");
        return onKeyDown;
    }
}
