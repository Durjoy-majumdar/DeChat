package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

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

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t */
public enum C29812t {
    INSTANCE;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t$a */
    public class C29813a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ String f80826d;

        public C29813a(C29812t tVar, String str) {
            this.f80826d = str;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Log.m105925i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: %s invokeAsync result: %s", this.f80826d, ((Bundle) obj).toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t$b */
    public static class C29814b implements C80883e<Bundle, Bundle> {

        /* renamed from: d */
        public static String f80827d;

        /* renamed from: e */
        public static final C29060q f80828e = null;

        /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t$b$a */
        public class C29815a extends C29060q.C29061a {

            /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t$b$a$a */
            public class C29816a implements C1256g<Bundle> {

                /* renamed from: d */
                public final /* synthetic */ String f80829d;

                public C29816a(C29815a aVar, String str) {
                    this.f80829d = str;
                }

                /* renamed from: a */
                public void mo894a(Object obj) {
                    Log.m105925i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: %s invokeAsync result: %s", this.f80829d, ((Bundle) obj).toString());
                }
            }

            public void onNetworkChange(int i) {
                String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
                String processName = MMApplicationContext.getProcessName();
                Log.m105925i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: %s on network changed: %d, changed to %s, %s", processName, Integer.valueOf(i), formatedNetType, C29814b.f80827d);
                Bundle bundle = new Bundle();
                bundle.putString("from_process", processName);
                bundle.putInt("newState", i);
                C80907o.m98781d(C29814b.f80827d, bundle, C29817b.class, new C29816a(this, processName));
            }
        }

        /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t$b$b */
        public static class C29817b implements C80883e<Bundle, Bundle> {
            private C29817b() {
            }

            public void invoke(Object obj, C1256g gVar) {
                int i = ((Bundle) obj).getInt("newState", 0);
                String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
                Log.m105925i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: %s on network changed: %d (%s)", MMApplicationContext.getProcessName(), Integer.valueOf(i), formatedNetType);
                if ("NON_NETWORK".equals(formatedNetType)) {
                    C105181w.INSTANCE.getClass();
                    C105172s.f312297c.OnNetworkChange(0, (byte[]) null);
                } else if ("2G".equals(formatedNetType)) {
                    C105181w.INSTANCE.getClass();
                    C105172s.f312297c.OnNetworkChange(1, (byte[]) null);
                } else if ("3G".equals(formatedNetType)) {
                    C105181w.INSTANCE.getClass();
                    C105172s.f312297c.OnNetworkChange(3, (byte[]) null);
                } else if ("WIFI".equals(formatedNetType)) {
                    C105181w.INSTANCE.getClass();
                    C105172s.f312297c.OnNetworkChange(4, (byte[]) null);
                } else if ("4G".equals(formatedNetType)) {
                    C105181w.INSTANCE.getClass();
                    C105172s.f312297c.OnNetworkChange(5, (byte[]) null);
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
            f80828e = new C29815a();
        }

        private C29814b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            String str;
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("from_process", "");
            f80827d = string;
            int i = -1;
            if (Util.isNullOrNil(string) || !f80827d.startsWith("com.tencent.mm")) {
                str = "invalid package name " + f80827d;
            } else {
                int i2 = bundle.getInt("opcode", -1);
                if (i2 == 0) {
                    C86709a0.m107529k().mo121126a(f80828e);
                } else if (i2 == 1) {
                    C86709a0.m107529k().mo121129d(f80828e);
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
    public final void mo56930a(int i) {
        String processName = MMApplicationContext.getProcessName();
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: %s operate network change: %d", processName, Integer.valueOf(i));
        Bundle bundle = new Bundle();
        bundle.putString("from_process", processName);
        bundle.putInt("opcode", i);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C29814b.class, new C29813a(this, processName));
    }
}
