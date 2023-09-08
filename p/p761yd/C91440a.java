package p761yd;

import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import p723vf.C118672d;

@Deprecated
/* renamed from: yd.a */
public enum C91440a {
    INSTANCE;

    /* renamed from: a */
    public String mo125374a() {
        ProcessUILifecycleOwner.f235399x.getClass();
        return ProcessUILifecycleOwner.f235397v;
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo125375b() {
        ProcessUILifecycleOwner.f235399x.getClass();
        return ProcessUILifecycleOwner.f235396u;
    }

    /* renamed from: c */
    public void mo125376c(String str) {
        ProcessUILifecycleOwner.f235399x.getClass();
        C118672d.m167353c("Matrix.ProcessLifecycle", "[setCurrentFragmentName] fragmentName: " + str, new Object[0]);
        ProcessUILifecycleOwner.f235398w = str;
        if (str != null) {
            ProcessUILifecycleOwner.f235397v = str;
        } else {
            ProcessUILifecycleOwner.f235397v = "?";
        }
    }
}
