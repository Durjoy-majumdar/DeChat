package up1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;
import nj3.C76912y0;
import qo3.C47883u;

/* renamed from: up1.g */
public final class C14341g implements C47883u {

    /* renamed from: a */
    public static final C14341g f39888a = new C14341g();

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        if (z) {
            if (str == null) {
                str = "";
            }
            try {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76761Ha(context, (Intent) null, str, (C60216z4.C8821a<Integer>) null);
            } catch (Exception e) {
                Context context2 = MMApplicationContext.getContext();
                C76912y0.makeText(context2, (CharSequence) "报错了：" + e.getMessage(), 0).show();
            }
        }
    }
}
