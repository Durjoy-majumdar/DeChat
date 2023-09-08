package yn1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import lc3.C10485b;
import ot1.C11767a;
import up1.C37521f;

/* renamed from: yn1.a */
public final class C16055a {

    /* renamed from: a */
    public static final C16055a f43185a = new C16055a();

    /* renamed from: a */
    public final boolean mo14671a() {
        boolean z = false;
        if (!C86709a0.m107522a()) {
            Log.m105928w("Finder.EntrancePermission", "account not Ready!" + Util.getStack());
            return false;
        }
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99121A1.mo60266n().intValue();
        if (intValue != 0) {
            Log.m105924i("Finder.EntrancePermission", "[hasFinderEntrancePermission] debugConfig=" + intValue);
            return intValue == 1;
        }
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderTimelineEntry", 100);
        boolean z2 = b != 0;
        if (C11767a.f34453a.mo11660b("entrance") == 2) {
            z = true;
        }
        Log.m105924i("Finder.EntrancePermission", "[hasFinderEntrancePermission] hasPermission=" + z2 + " serverConfig=" + b + " isSpam=" + z);
        return z2;
    }
}
