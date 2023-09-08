package sx2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C97625j3;

/* renamed from: sx2.p */
public class C13797p {
    static {
        int i = C110815a.f331537a;
    }

    /* renamed from: a */
    public static String m13101a(Context context, String str) {
        C72996z1 z1Var;
        if (!Util.isNullOrNil(str) && (z1Var = C97625j3.m125812b().mo105907v().get(str)) != null) {
            return C72996z1.m85820U5(str) ? Util.isNullOrNil(z1Var.getNickname()) ? context.getString(C0966R.string.jtq) : z1Var.mo62909j3() : ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str);
        }
        return null;
    }
}
