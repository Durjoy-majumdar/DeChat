package p962eg;

import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import e42.C86431j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import java.util.HashSet;
import p142dg.C7327a;

/* renamed from: eg.a */
public final class C86515a extends C7327a<C86515a> {

    /* renamed from: a */
    public final Collection<C86431j<C86515a>> f251356a;

    public C86515a(Collection<? extends C86431j<C86515a>> collection) {
        C87412m.m108594g(collection, "jsApiSet");
        this.f251356a = collection;
    }

    /* renamed from: b */
    public void mo5788b() {
        Log.m105924i("MicroMsg.MagicAdvertisePublicService", "onMainScriptInjected");
    }

    /* renamed from: i */
    public void mo5789i(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        Log.m105920e("MicroMsg.MagicAdvertisePublicService", "onJSException envId:" + str + ",msg:" + str2);
    }

    public void onCreated() {
        Log.m105924i("MicroMsg.MagicAdvertisePublicService", "onCreated");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.MagicAdvertisePublicService", "onDestroy");
    }

    /* renamed from: s */
    public MBBuildConfig<C86515a> mo5793s() {
        Log.m105924i("MicroMsg.MagicAdvertisePublicService", "onProvideConfig");
        MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        mBBuildConfig.f248378q = this;
        mBBuildConfig.f248372h = WeChatEnvironment.hasDebugger();
        mBBuildConfig.f248373i = false;
        mBBuildConfig.mo118367a(this.f251356a);
        return mBBuildConfig;
    }
}
