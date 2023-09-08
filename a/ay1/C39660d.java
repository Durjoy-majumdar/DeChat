package ay1;

import android.content.res.Configuration;
import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.tinker.entry.ApplicationLike;
import g40.C87133d;
import ky1.C46803a;

/* renamed from: ay1.d */
public class C39660d implements C87133d {
    /* renamed from: gV */
    public void mo62227gV(ApplicationLike applicationLike, int i) {
    }

    /* renamed from: kY */
    public void mo62228kY(ApplicationLike applicationLike) {
    }

    public void qs0(ApplicationLike applicationLike, Configuration configuration) {
        C46803a d;
        if (C85875k4.m106149F() && C85875k4.m106146C() && (d = C46803a.m52100d()) != null) {
            d.f125931g.mo73781f(String.format("if (SystemInfo == 'undefined' || SystemInfo.isDarkMode == 'undefined) {return;} SystemInfo.isDarkMode=%b; console.log(SystemInfo.isDarkMode);", new Object[]{Boolean.valueOf(C85875k4.m106211z())}), (ValueCallback<String>) null);
        }
    }

    /* renamed from: zA */
    public void mo62230zA(ApplicationLike applicationLike) {
    }
}
