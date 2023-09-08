package com.tencent.p014mm.plugin.game.luggage;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import ky1.C46803a;
import ky1.C46812f;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.game.luggage.p */
public class C30093p extends C86301e {

    /* renamed from: d */
    public C29060q f81391d = new C30094a(this);

    /* renamed from: com.tencent.mm.plugin.game.luggage.p$a */
    public class C30094a extends C29060q.C29061a {

        /* renamed from: d */
        public final byte[] f81392d = new byte[0];

        public C30094a(C30093p pVar) {
        }

        public void onNetworkChange(int i) {
            synchronized (this.f81392d) {
                if (C46803a.m52100d() != null) {
                    C46803a d = C46803a.m52100d();
                    d.getClass();
                    String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
                    d.f125930f.mo72031a(new C46812f(d, formatedNetType));
                    d.f125931g.mo73781f(String.format("if (SystemInfo == 'undefined' || SystemInfo.networkType == 'undefined) {return;} SystemInfo.networkType=\"%s\"; console.log(SystemInfo.networkType);", new Object[]{formatedNetType}), (ValueCallback<String>) null);
                }
            }
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C86709a0.m107529k().mo121126a(this.f81391d);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C86709a0.m107529k().mo121129d(this.f81391d);
    }
}
