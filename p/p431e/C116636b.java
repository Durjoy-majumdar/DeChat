package p431e;

import android.content.Context;
import android.content.Intent;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p385u2.C111105a;
import p431e.C116634a;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C36903g0;
import sx3.C90363p0;
import sx3.C90364q0;

/* renamed from: e.b */
public final class C116636b extends C116634a<String[], Map<String, Boolean>> {
    /* renamed from: a */
    public Intent mo105808a(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C87412m.m108593f(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    /* renamed from: b */
    public C116634a.C116635a mo180636b(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(strArr, "input");
        boolean z = true;
        if (strArr.length == 0) {
            return new C116634a.C116635a(C36903g0.f97931d);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(C111105a.m151499a(context, strArr[i]) == 0)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            return null;
        }
        int a = C90363p0.m113142a(strArr.length);
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (String put : strArr) {
            linkedHashMap.put(put, Boolean.TRUE);
        }
        return new C116634a.C116635a(linkedHashMap);
    }

    /* renamed from: c */
    public Object mo105809c(int i, Intent intent) {
        if (i != -1) {
            return C36903g0.f97931d;
        }
        if (intent == null) {
            return C36903g0.f97931d;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C36903g0.f97931d;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return C90364q0.m113152k(C110818d0.m150908F0(C110823p.m151010z(stringArrayExtra), arrayList));
    }
}
