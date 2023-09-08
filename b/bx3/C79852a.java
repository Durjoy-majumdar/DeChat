package bx3;

import android.content.Context;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import gx3.C87404a;
import gx3.C87406c;
import gx3.C87407d;
import iv3.C87821a;
import java.util.Map;
import jv3.C88033a;

/* renamed from: bx3.a */
public class C79852a implements C79853b {
    /* renamed from: a */
    public boolean mo109447a() {
        Context a = C87406c.m108581a();
        C87821a c = C87821a.m109275c(a);
        if (!C87404a.m108578a(a)) {
            ShareTinkerLog.m106533v("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, not connect to internet", new Object[0]);
            return false;
        } else if (C88033a.m109601b(a)) {
            ShareTinkerLog.m106533v("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, tinker service is running", new Object[0]);
            return false;
        } else if (!c.f254235h) {
            ShareTinkerLog.m106533v("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, only request on the main process", new Object[0]);
            return false;
        } else {
            int i = C87407d.f253294a;
            return true;
        }
    }

    /* renamed from: b */
    public void mo109448b(Map<String, String> map) {
    }

    /* renamed from: c */
    public void mo109449c() {
    }
}
