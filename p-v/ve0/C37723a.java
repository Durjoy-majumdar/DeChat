package ve0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import he0.C46021h;
import ie0.C46232y;
import yc3.C38992a;

/* renamed from: ve0.a */
public final class C37723a implements C38992a {
    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        Class cls = C46021h.class;
        boolean z = false;
        if (strArr != null && C87412m.m108589b("//im", strArr[0]) && C87412m.m108589b("clearContact", strArr[1])) {
            ((C46021h) C86312j.m106911c(cls)).t40();
            return true;
        } else if (strArr != null && C87412m.m108589b("//im", strArr[0]) && C87412m.m108589b("testCard", strArr[1])) {
            C46021h hVar = (C46021h) C86312j.m106911c(cls);
            if (Util.safeParseInt(strArr[2]) == 1) {
                z = true;
            }
            hVar.mo71466xy(str, z);
            return true;
        } else if (strArr == null || !C87412m.m108589b("//im", strArr[0]) || !C87412m.m108589b("confirm", strArr[1])) {
            return false;
        } else {
            int i = Util.getInt(strArr[2], 3);
            C46232y yVar = C46232y.f124619d;
            Log.m105919d("MicroMsg.OpenIMKefuGetContactService", "alvinluo setDebugConfirmType: %s", Integer.valueOf(i));
            C46232y.f124620e = Integer.valueOf(i);
            return true;
        }
    }
}
