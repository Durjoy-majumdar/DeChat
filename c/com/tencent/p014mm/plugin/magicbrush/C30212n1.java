package com.tencent.p014mm.plugin.magicbrush;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import j52.C87879c;
import kotlin.Metadata;
import org.json.JSONObject;
import p416qd.C89590b;
import q20.C89449a;
import q52.C89477p;
import rx3.C13598b0;
import z04.C112551y;
import zt3.C119157j;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.n1 */
public final class C30212n1 extends C86301e implements C30196h0 {

    /* renamed from: com.tencent.mm.plugin.magicbrush.n1$b */
    public static final class C30213b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f81648d;

        /* renamed from: com.tencent.mm.plugin.magicbrush.n1$b$a */
        public static final class C30214a<T> implements C1256g {

            /* renamed from: d */
            public static final C30214a<T> f81649d = new C30214a<>();

            /* renamed from: a */
            public void mo894a(Object obj) {
                IPCVoid iPCVoid = (IPCVoid) obj;
                Log.m105924i("MagicBrushPreloadFeatureService", "preload MB2.0 env done");
            }
        }

        public C30213b(String str) {
            this.f81648d = str;
        }

        public final void run() {
            Context context = MMApplicationContext.getContext();
            String str = WeChatProcess.PROCESS_APPBRAND1;
            int i = 1;
            if (Util.isProcessRunning(context, str)) {
                Log.m105924i("MagicBrushPreloadFeatureService", "no need to preload");
                C87879c.f254379e.Ov0("PreloadMBIsAlive", 1, this.f81648d);
                return;
            }
            Log.m105924i("MagicBrushPreloadFeatureService", "start preload MB2.0 env for " + this.f81648d);
            C87879c.f254379e.Ov0("PreloadMBStart", 1, this.f81648d);
            Bundle bundle = new Bundle();
            if (!AppUIForegroundOwner.INSTANCE.isForeground()) {
                i = 2;
            }
            bundle.putInt("appStatus", i);
            bundle.putLong("processStartTime", Util.currentTicks());
            bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f81648d);
            C80907o.m98781d(str, bundle, C30215a.class, C30214a.f81649d);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/n1$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "mb-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.magicbrush.n1$a */
    public static final class C30215a implements C80883e<Bundle, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "data");
            C87412m.m108594g(gVar, "callback");
            boolean z = false;
            int i = bundle.getInt("appStatus", 0);
            long j = bundle.getLong("processStartTime", 0);
            String string = bundle.getString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "");
            if (!(i == 0 || j == 0)) {
                C87412m.m108593f(string, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                if (!(string.length() == 0)) {
                    long ticksToNow = Util.ticksToNow(j);
                    Log.m105924i("MagicBrushPreloadFeatureService", "preload scene " + string + " cost " + ticksToNow + " with appStatus " + i);
                    C87879c cVar = C87879c.f254379e;
                    int i2 = (int) ticksToNow;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, string);
                    jSONObject.put("appStatus", i);
                    C13598b0 b0Var = C13598b0.f38549a;
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
                    cVar.Ov0("PreloadMBDone", i2, C112551y.m153815o(jSONObject2, ',', ';', false, 4, (Object) null));
                    Log.m105924i("MBServerUtil", "start load so");
                    C89590b.m112029c(new C89477p());
                    C89590b.m112027a();
                    C89590b.m112028b("wxa-runtime-binding");
                    C89590b.m112028b("gamelog_delegate");
                    Log.m105924i("MBServerUtil", "load so done");
                    Log.m105924i("MagicBrushPreloadFeatureService", "preload done, mark preload scene");
                    synchronized (C85282s0.f248436a) {
                        if (C85282s0.f248439d.length() == 0) {
                            z = true;
                        }
                        if (z) {
                            C85282s0.f248439d = string;
                        }
                    }
                    return;
                }
            }
            Log.m105924i("MagicBrushPreloadFeatureService", "preload mb error");
        }
    }

    /* renamed from: iB */
    public synchronized void mo57219iB(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        Log.m105924i("MagicBrushPreloadFeatureService", "try to preload MB 2.0 env for " + str);
        ((C119157j) C119157j.f356862d).mo183884o(new C30213b(str));
    }
}
