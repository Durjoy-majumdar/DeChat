package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import yq3.C79145c;

/* renamed from: com.tencent.mm.plugin.aa.ui.u0 */
public class C68344u0 extends C79145c {

    /* renamed from: a */
    public final /* synthetic */ LaunchAAUI f196367a;

    public C68344u0(LaunchAAUI launchAAUI) {
        this.f196367a = launchAAUI;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        String string = this.f196367a.getString(C0966R.string.g4x);
        LaunchAAUI launchAAUI = this.f196367a;
        if (launchAAUI.f196137h == 2) {
            string = launchAAUI.getString(C0966R.string.g4p);
        }
        accessibilityNodeInfo.setContentDescription(String.format("%s,%s,%s", new Object[]{string, this.f196367a.getString(C0966R.string.g4h), this.f196367a.getString(C0966R.string.g4l)}));
    }
}
