package ye3;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import p244tt.C14088e;
import xe3.C15674c;

/* renamed from: ye3.c */
public final class C15988c implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ Bundle f43035a;

    public C15988c(Bundle bundle) {
        this.f43035a = bundle;
    }

    /* renamed from: a */
    public void mo1717a() {
        ChangeQQLoginTypeManager changeQQLoginTypeManager = ChangeQQLoginTypeManager.f24095a;
        Bundle bundle = this.f43035a;
        C87412m.m108594g(bundle, "bundle");
        C80907o.m98781d(WeChatProcess.PROCESS_PUSH, bundle, C15674c.class, C15989d.f43036d);
        Log.m105925i("MicroMsg.ChangeQQLoginTypeManager", "startLiteApp success: appid=%s  page=%s", this.f43035a.getString("appId", ""), this.f43035a.getString("page", ""));
    }

    /* renamed from: b */
    public void mo1718b() {
        ChangeQQLoginTypeManager changeQQLoginTypeManager = ChangeQQLoginTypeManager.f24095a;
        C80907o.m98781d(WeChatProcess.PROCESS_PUSH, null, C15674c.class, C15986a.f43033d);
        Log.m105921e("MicroMsg.ChangeQQLoginTypeManager", "startLiteApp fail: appid=%s  page=%s", this.f43035a.getString("appId", ""), this.f43035a.getString("page", ""));
    }
}
