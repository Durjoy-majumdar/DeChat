package p692sz;

import android.app.Activity;
import android.os.Build;
import com.tencent.p014mm.plugin.vlog.model.C19412t;
import com.tencent.p014mm.plugin.vlog.model.C30520u;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import o40.C61926c;
import p707tz.C37315g;

@C86522b
/* renamed from: sz.e */
public class C36913e extends C86301e implements C37315g {
    /* renamed from: aA */
    public String mo60894aA() {
        return C30520u.f82231b;
    }

    public void dd0(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!C30520u.f82230a) {
            C30520u.f82230a = true;
            if (Build.VERSION.SDK_INT >= 24) {
                C61926c.m72656A((String) null, new C19412t(activity));
            }
        }
    }
}
