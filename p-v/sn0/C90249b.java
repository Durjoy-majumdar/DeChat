package sn0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: sn0.b */
public class C90249b {

    /* renamed from: sn0.b$a */
    public class C90250a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final /* synthetic */ String f259064a;

        /* renamed from: b */
        public final /* synthetic */ String f259065b;

        public C90250a(String str, String str2) {
            this.f259064a = str;
            this.f259065b = str2;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (!Util.isNullOrNil(this.f259064a)) {
                accessibilityNodeInfo.setContentDescription(this.f259064a);
            }
            if (Util.isNullOrNil(this.f259065b) || !this.f259065b.equalsIgnoreCase("button")) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.setClassName(TextView.class.getName());
                return;
            }
            accessibilityNodeInfo.setClickable(true);
            accessibilityNodeInfo.setClassName(Button.class.getName());
        }
    }

    /* renamed from: a */
    public static void m112984a(View view, JSONObject jSONObject) {
        if (view != null && jSONObject != null && jSONObject.has("accessibility") && jSONObject.optBoolean("accessibility", false)) {
            view.setAccessibilityDelegate(new C90250a(jSONObject.optString("ariaLabel", ""), jSONObject.optString("ariaRole", "")));
        }
    }
}
