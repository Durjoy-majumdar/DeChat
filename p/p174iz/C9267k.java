package p174iz;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$j;
import di3.C86312j;
import ke3.C88144b;
import ky2.C10432i;

/* renamed from: iz.k */
public class C9267k implements MMFragmentActivity$$j, C88144b.C9615g {
    /* renamed from: d */
    public boolean mo7676d(Context context, String str, Intent intent) {
        Class cls = C10432i.class;
        if ((!str.endsWith(".TopStoryHomeUI") && !str.endsWith(".TopStoryHomeAffinityUI")) || !((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            return false;
        }
        ((C10432i) C86312j.m106911c(cls)).mo10755m4(context);
        return true;
    }
}
