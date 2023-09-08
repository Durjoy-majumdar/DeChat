package bh3;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117293c;
import java.util.HashMap;
import java.util.List;

/* renamed from: bh3.n */
public final class C104145n implements C117293c {

    /* renamed from: a */
    public static final C104145n f308139a = new C104145n();

    /* renamed from: a */
    public final Object mo109570a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        HashMap<String, List<Pair<String, String>>> hashMap = C104147p.f308141a;
        Log.m105924i("MicrophoneHooker", "HookMicroPhone");
        PermissionSwitchCheckUtil permissionSwitchCheckUtil = PermissionSwitchCheckUtil.f347926a;
        if (!permissionSwitchCheckUtil.mo176849f()) {
            C87412m.m108593f(str4, "methodName");
            if (PermissionSwitchCheckUtil.m163124b(permissionSwitchCheckUtil, str4, (C32226l) null, 2, (Object) null)) {
                return null;
            }
        }
        obj.getClass().getMethod(str4, new Class[0]).invoke(obj, new Object[0]);
        return null;
    }
}
