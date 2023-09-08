package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.a1 */
public class C44621a1 {
    /* renamed from: a */
    public static void m49068a(Bundle bundle, BaseResp baseResp, String str) {
        baseResp.toBundle(bundle);
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = str;
        args.bundle = bundle;
        C72688j0.m85024j(args);
        C72688j0.m85021g(bundle);
        C72688j0.m85022h(bundle);
        MMessageActV2.send(MMApplicationContext.getContext(), args);
    }
}
