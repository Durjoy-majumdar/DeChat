package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import yq3.C79145c;

/* renamed from: com.tencent.mm.plugin.aa.ui.z0 */
public class C68358z0 extends C79145c {

    /* renamed from: a */
    public final /* synthetic */ LaunchAAUI f196399a;

    public C68358z0(LaunchAAUI launchAAUI) {
        this.f196399a = launchAAUI;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        String string = this.f196399a.getString(C0966R.string.g4x);
        LaunchAAUI launchAAUI = this.f196399a;
        if (launchAAUI.f196137h != 2 && launchAAUI.f196139i == 4) {
            string = launchAAUI.getString(C0966R.string.g4p);
        }
        accessibilityNodeInfo.setContentDescription(String.format("%s,%s,%s", new Object[]{string, this.f196399a.getString(C0966R.string.g4j), this.f196399a.getString(C0966R.string.g4n)}));
    }
}
