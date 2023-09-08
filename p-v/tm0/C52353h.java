package tm0;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: tm0.h */
public final class C52353h extends C82268c {
    private static final int CTRL_INDEX = 851;
    private static final String NAME = "checkIsOpenAccessibility";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Context context = fVar.getContext();
        Boolean bool = null;
        if (context == null) {
            Log.m105928w("MicroMsg.AppBrand.Accessibility.ViewAccessibilityHelper", "isTalkBackAccessibilityEnabled, context is null");
        } else {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager == null) {
                Log.m105928w("MicroMsg.AppBrand.Accessibility.ViewAccessibilityHelper", "isTalkBackAccessibilityEnabled, accessibilityManager is null");
            } else if (!accessibilityManager.isTouchExplorationEnabled()) {
                Log.m105924i("MicroMsg.AppBrand.Accessibility.ViewAccessibilityHelper", "isTalkBackAccessibilityEnabled, isTalkBackAccessibilityEnabled: false");
                bool = Boolean.FALSE;
            } else {
                bool = Boolean.TRUE;
            }
        }
        if (bool == null) {
            fVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WeChatBrands.Business.GROUP_OPEN, bool);
        fVar.mo109647a(i, mo115112m("ok", hashMap));
    }
}
