package on2;

import android.content.Context;
import android.content.Intent;
import di3.C86312j;
import ke3.C88144b;
import ky2.C10432i;

/* renamed from: on2.l */
public class C11585l implements C88144b.C9615g {
    /* renamed from: d */
    public boolean mo2009d(Context context, String str, Intent intent) {
        Class cls = C10432i.class;
        if (!str.startsWith("shake") || !str.endsWith(".ShakeReportUI") || !((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            return false;
        }
        ((C10432i) C86312j.m106911c(cls)).mo10755m4(context);
        return true;
    }
}
