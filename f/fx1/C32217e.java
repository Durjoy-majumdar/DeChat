package fx1;

import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.app.C80617t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f40.C86718e;
import yw1.C53591c;

/* renamed from: fx1.e */
public class C32217e extends C114661d0.C28676a implements C80617t0.C80621d {
    /* renamed from: J0 */
    public void mo58534J0(String str) {
    }

    /* renamed from: h2 */
    public void mo58535h2(String str) {
        Log.m105925i("GameChatroomProcListener", "procForegroundDelegate, onProcessForeground(%s)", str);
        if (C53591c.f150601c == null) {
            C53591c.f150601c = str;
        }
    }

    public void onAppBackground(String str) {
        Log.m105925i("GameChatroomProcListener", "appForegroundListener, onAppBackground(%s)", str);
        C53591c.f150601c = null;
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            C86718e.m107551r();
        }
    }

    public void onAppForeground(String str) {
        Log.m105925i("GameChatroomProcListener", "appForegroundListener, onAppForeground(%s)", str);
        C53591c.f150601c = str;
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            C86718e.m107551r();
        }
    }
}
