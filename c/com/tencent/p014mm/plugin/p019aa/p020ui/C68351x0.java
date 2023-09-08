package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import yq3.C79145c;

/* renamed from: com.tencent.mm.plugin.aa.ui.x0 */
public class C68351x0 extends C79145c {

    /* renamed from: a */
    public final /* synthetic */ LaunchAAUI f196382a;

    public C68351x0(LaunchAAUI launchAAUI) {
        this.f196382a = launchAAUI;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        String string = this.f196382a.getString(C0966R.string.g4x);
        LaunchAAUI launchAAUI = this.f196382a;
        if (launchAAUI.f196137h != 2 && launchAAUI.f196139i == 5) {
            string = launchAAUI.getString(C0966R.string.g4p);
        }
        accessibilityNodeInfo.setContentDescription(String.format("%s,%s,%s", new Object[]{string, this.f196382a.getString(C0966R.string.g4i), this.f196382a.getString(C0966R.string.g4m)}));
    }
}
