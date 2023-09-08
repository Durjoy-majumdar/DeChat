package com.tencent.p014mm.plugin.ilink.net_change;

import android.os.Bundle;
import c12.C16834e;
import com.tencent.ilink.Context;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;
import gy3.C87412m;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.ilink.net_change.d */
public final class C30132d implements C30128a {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ilink/net_change/d$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "b", "plugin-ilink_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.ilink.net_change.d$a */
    public static final class C30133a implements C80883e<Bundle, Bundle> {

        /* renamed from: d */
        public static final CopyOnWriteArraySet<String> f81466d = new CopyOnWriteArraySet<>();

        /* renamed from: e */
        public static final C29060q f81467e = new C30134a();

        /* renamed from: com.tencent.mm.plugin.ilink.net_change.d$a$a */
        public static final class C30134a extends C29060q.C29061a {
            public void onNetworkChange(int i) {
                Log.m105924i("MicroMsg.NetworkChangeSubProcessImpl", "onNetworkChange() called with: st = " + i);
                for (String str : C30133a.f81466d) {
                    C87412m.m108593f(str, LocaleUtil.ITALIAN);
                    String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
                    String processName = MMApplicationContext.getProcessName();
                    Log.m105925i("MicroMsg.NetworkChangeSubProcessImpl", "hy: %s on network changed: %d, changed to %s, %s", processName, Integer.valueOf(i), formatedNetType, str);
                    Bundle bundle = new Bundle();
                    bundle.putString("from_process", processName);
                    bundle.putInt("newState", i);
                    C80907o.m98781d(str, bundle, C30135b.class, new C30131c(processName));
                }
            }
        }

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ilink/net_change/d$a$b;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-ilink_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.plugin.ilink.net_change.d$a$b */
        public static final class C30135b implements C80883e<Bundle, Bundle> {
            public void invoke(Object obj, C1256g gVar) {
                Bundle bundle = (Bundle) obj;
                C87412m.m108594g(bundle, "data");
                C87412m.m108594g(gVar, "callback");
                if (!C16834e.f45478b) {
                    Log.m105928w("MicroMsg.NetworkChangeSubProcessImpl", "ilink not initialized, just return");
                    return;
                }
                int i = bundle.getInt("newState", 0);
                Context.getInstance().networkChanged();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("err_code", 0);
                bundle2.putString("err_desc", "success");
                gVar.mo894a(bundle2);
                Log.m105924i("MicroMsg.NetworkChangeSubProcessImpl", "invoke: IPCInvokeAsyncTask_OnNetworkChange " + i);
            }
        }

        public void invoke(Object obj, C1256g gVar) {
            String str;
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "data");
            C87412m.m108594g(gVar, "callback");
            String string = bundle.getString("from_process", "");
            int i = -1;
            if (!Util.isNullOrNil(string)) {
                C87412m.m108593f(string, "fromProcessName");
                if (C112551y.m153819s(string, "com.tencent.mm", false)) {
                    int i2 = bundle.getInt("opcode", -1);
                    if (i2 == 0) {
                        f81466d.add(string);
                        C86709a0.m107529k().mo121126a(f81467e);
                    } else if (i2 != 1) {
                        i = -2;
                        str = "not valid op code";
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("err_code", i);
                        bundle2.putString("err_desc", str);
                        gVar.mo894a(bundle2);
                    } else {
                        C86709a0.m107529k().mo121129d(f81467e);
                        f81466d.remove(string);
                    }
                    str = "success";
                    i = 0;
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt("err_code", i);
                    bundle22.putString("err_desc", str);
                    gVar.mo894a(bundle22);
                }
            }
            str = "invalid package name " + string;
            Bundle bundle222 = new Bundle();
            bundle222.putInt("err_code", i);
            bundle222.putString("err_desc", str);
            gVar.mo894a(bundle222);
        }
    }

    /* renamed from: a */
    public void mo57166a() {
        Log.m105924i("MicroMsg.NetworkChangeSubProcessImpl", "startListen: ");
        String processName = MMApplicationContext.getProcessName();
        Log.m105925i("MicroMsg.NetworkChangeSubProcessImpl", "hy: %s operate network change: %d", processName, 0);
        Bundle bundle = new Bundle();
        bundle.putString("from_process", processName);
        bundle.putInt("opcode", 0);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C30133a.class, new C30136e(processName));
    }
}
