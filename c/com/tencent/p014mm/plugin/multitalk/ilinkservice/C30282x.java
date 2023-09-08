package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.x */
public enum C30282x {
    INSTANCE;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.x$a */
    public class C30283a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ String f81785d;

        public C30283a(C30282x xVar, String str) {
            this.f81785d = str;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Log.m105925i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: %s invokeAsync result: %s", this.f81785d, ((Bundle) obj).toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.x$b */
    public static class C30284b implements C80883e<Bundle, Bundle> {

        /* renamed from: d */
        public static String f81786d;

        /* renamed from: e */
        public static final C29060q f81787e = null;

        /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.x$b$a */
        public class C30285a extends C29060q.C29061a {

            /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.x$b$a$a */
            public class C30286a implements C1256g<Bundle> {

                /* renamed from: d */
                public final /* synthetic */ String f81788d;

                public C30286a(C30285a aVar, String str) {
                    this.f81788d = str;
                }

                /* renamed from: a */
                public void mo894a(Object obj) {
                    Log.m105925i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: %s invokeAsync result: %s", this.f81788d, ((Bundle) obj).toString());
                }
            }

            public void onNetworkChange(int i) {
                String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
                String processName = MMApplicationContext.getProcessName();
                Log.m105925i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: %s on network changed: %d, changed to %s, %s", processName, Integer.valueOf(i), formatedNetType, C30284b.f81786d);
                Bundle bundle = new Bundle();
                bundle.putString("from_process", processName);
                bundle.putInt("newState", i);
                C80907o.m98781d(C30284b.f81786d, bundle, C30287b.class, new C30286a(this, processName));
            }
        }

        /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.x$b$b */
        public static class C30287b implements C80883e<Bundle, Bundle> {
            private C30287b() {
            }

            public void invoke(Object obj, C1256g gVar) {
                int i = ((Bundle) obj).getInt("newState", 0);
                String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
                Log.m105925i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: %s on network changed: %d (%s)", MMApplicationContext.getProcessName(), Integer.valueOf(i), formatedNetType);
                if ("NON_NETWORK".equals(formatedNetType)) {
                    C105724z.f314340D1.mo150608r(0);
                } else if ("2G".equals(formatedNetType)) {
                    C105724z.f314340D1.mo150608r(1);
                } else if ("3G".equals(formatedNetType)) {
                    C105724z.f314340D1.mo150608r(3);
                } else if ("WIFI".equals(formatedNetType)) {
                    C105724z.f314340D1.mo150608r(4);
                } else if ("4G".equals(formatedNetType)) {
                    C105724z.f314340D1.mo150608r(5);
                } else if ("5G".equals(formatedNetType)) {
                    C105724z.f314340D1.mo150608r(5);
                }
                if (gVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("err_code", 0);
                    bundle.putString("err_desc", "success");
                    gVar.mo894a(bundle);
                }
            }
        }

        static {
            f81787e = new C30285a();
        }

        private C30284b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            String str;
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("from_process", "");
            f81786d = string;
            int i = -1;
            if (Util.isNullOrNil(string) || !f81786d.startsWith("com.tencent.mm")) {
                str = "invalid package name " + f81786d;
            } else {
                int i2 = bundle.getInt("opcode", -1);
                if (i2 == 0) {
                    C86709a0.m107529k().mo121126a(f81787e);
                } else if (i2 == 1) {
                    C86709a0.m107529k().mo121129d(f81787e);
                } else {
                    i = -2;
                    str = "not valid op code";
                }
                i = 0;
                str = "success";
            }
            if (gVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("err_code", i);
                bundle2.putString("err_desc", str);
                gVar.mo894a(bundle2);
            }
        }
    }

    /* renamed from: a */
    public final void mo57266a(int i) {
        String processName = MMApplicationContext.getProcessName();
        Log.m105925i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: %s operate network change: %d", processName, Integer.valueOf(i));
        Bundle bundle = new Bundle();
        bundle.putString("from_process", processName);
        bundle.putInt("opcode", i);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C30284b.class, new C30283a(this, processName));
    }
}
