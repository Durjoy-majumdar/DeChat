package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.debugger.C29488o;
import com.tencent.p014mm.plugin.appbrand.debugger.C81732f;
import com.tencent.p014mm.plugin.appbrand.debugger.C81734g;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C86497v5;
import f40.C86709a0;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import ob0.C35136m;
import p910lj.C76701a;
import sf0.C48374j0;
import te3.u45;
import te3.zq4;
import wi0.C90992p;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.d3 */
public final class C29199d3 implements C86497v5.C31521b {

    /* renamed from: d */
    public static final Map<String, C29201d> f79843d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d3$a */
    public class C29200a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f79844d;

        public C29200a(C29199d3 d3Var, String str) {
            this.f79844d = str;
        }

        public void run() {
            C29201d dVar;
            String str = this.f79844d;
            C81161g2.requireAccountInitializedOnDemand();
            if (C81161g2.f238471g == null) {
                Log.m105920e("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "parseAndDownload, but storage not ready");
                return;
            }
            Map<String, String> parseXml = XmlParser.parseXml(str, "sysmsg", (String) null);
            if (parseXml == null || parseXml.size() <= 0) {
                Log.m105920e("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "parseImpl, parse failed");
                return;
            }
            String str2 = parseXml.get(".sysmsg.$type");
            Log.m105925i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "parseImpl, type = %s", str2);
            if (!Util.isNullOrNil(str2) && (dVar = C29199d3.f79843d.get(str2)) != null) {
                dVar.mo56511b(str, parseXml);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d3$d */
    public interface C29201d {
        /* renamed from: b */
        void mo56511b(String str, Map<String, String> map);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d3$b */
    public static final class C29202b implements C29201d {

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d3$b$a */
        public class C29203a implements C90992p.C90998f {

            /* renamed from: a */
            public final /* synthetic */ String f79845a;

            /* renamed from: b */
            public final /* synthetic */ int f79846b;

            public C29203a(C29202b bVar, String str, int i) {
                this.f79845a = str;
                this.f79846b = i;
            }

            /* renamed from: a */
            public void mo56512a(String str) {
                MMToClientEvent mMToClientEvent;
                Log.m105925i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "CommonConfigManager.getConfig config:%s", str);
                String str2 = this.f79845a;
                int i = this.f79846b;
                HashMap<String, MMToClientEvent> hashMap = C81964j.f240365a;
                Log.m105925i("MicroMsg.MMToClientEventCenter", "notify appId:%s, type:%d, config:%s", str2, Integer.valueOf(i), str);
                HashMap<String, MMToClientEvent> hashMap2 = C81964j.f240365a;
                synchronized (hashMap2) {
                    mMToClientEvent = hashMap2.get(str2);
                }
                if (mMToClientEvent != null) {
                    synchronized (mMToClientEvent) {
                        mMToClientEvent.f240341f = 3;
                        mMToClientEvent.f240342g = str2;
                        mMToClientEvent.f240343h = i;
                        mMToClientEvent.f240344i = str;
                        mMToClientEvent.mo114394b();
                    }
                    return;
                }
                Log.m105920e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
            }
        }

        public C29202b(C29200a aVar) {
        }

        /* renamed from: b */
        public void mo56511b(String str, Map<String, String> map) {
            if (map.get(".sysmsg.mmbizwxaconfig") != null) {
                int i = Util.getInt(map.get(".sysmsg.mmbizwxaconfig.command"), -1);
                int i2 = Util.getInt(map.get(".sysmsg.mmbizwxaconfig.type"), 0);
                String str2 = map.get(".sysmsg.mmbizwxaconfig.appid");
                int i3 = Util.getInt(map.get(".sysmsg.mmbizwxaconfig.configversion"), 0);
                Log.m105925i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle common config, command = %d, type = %d, appid = %s, configversion = %d", Integer.valueOf(i), Integer.valueOf(i2), str2, Integer.valueOf(i3));
                LinkedList linkedList = new LinkedList();
                zq4 zq4 = new zq4();
                zq4.f186838e = i3;
                zq4.f186837d = i2;
                linkedList.add(zq4);
                C90992p.m114160b(str2, linkedList, false);
                C90992p.m114159a(str2, i2, i, new C29203a(this, str2, i2), true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d3$c */
    public static final class C29204c implements C29201d {

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d3$c$a */
        public class C29205a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f79847d;

            /* renamed from: e */
            public final /* synthetic */ int f79848e;

            /* renamed from: f */
            public final /* synthetic */ String f79849f;

            public C29205a(C29204c cVar, String str, int i, String str2) {
                this.f79847d = str;
                this.f79848e = i;
                this.f79849f = str2;
            }

            public void run() {
                AppBrandProcessesManager.m103869I().mo111407t(this.f79847d, this.f79848e);
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.f7809s7, new Object[]{Util.nullAs(this.f79849f, this.f79847d)}), 1).show();
            }
        }

        static {
            WeChatHosts.domainString(C0966R.string.fm5);
        }

        public C29204c(C29200a aVar) {
        }

        /* renamed from: a */
        public final boolean mo56513a(String str, Map<String, String> map) {
            WxaAttributes mL;
            String str2 = str;
            Map<String, String> map2 = map;
            Log.m105919d("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "optDebugInfo, prefix = %s", str2);
            if (map2.get(str2) == null) {
                return false;
            }
            String str3 = map2.get(str2 + ".AppID");
            String str4 = map2.get(str2 + ".UserName");
            int i = Util.getInt(map2.get(str2 + ".Type"), 1);
            String str5 = map2.get(str2 + ".URL");
            long j = Util.getLong(map2.get(str2 + ".StartTime"), Util.nowSecond());
            long j2 = Util.getLong(map2.get(str2 + ".EndTime"), j + 7200);
            String str6 = map2.get(str2 + ".MD5");
            if (999 == i) {
                C81236c1.vx0().wx0("xml", str5, str6, j, j2);
                return true;
            }
            C81161g2.requireAccountInitializedOnDemand();
            int i2 = i;
            boolean j3 = C81161g2.f238471g.mo113526j(str3, i, str5, str6, j, j2);
            Log.m105925i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle debug notify, appId = %s, username = %s, debugType = %d, url = %s, start = %d, end = %d, md5 = %s, updated = %b", str3, str4, Integer.valueOf(i2), str5, Long.valueOf(j), Long.valueOf(j2), str6, Boolean.valueOf(j3));
            if (j3) {
                C81662k.m100197p(str4);
                String str7 = null;
                if (!Util.isNullOrNil(str3) && (mL = C81161g2.Cx0().mo114011mL(str3, "nickname")) != null) {
                    str7 = mL.field_nickname;
                }
                MMHandlerThread.postToMainThread(new C29205a(this, str3, i2, str7));
                C81161g2.requireAccountInitializedOnDemand();
                C81161g2.f238473i.mo56645jo(str4, i2, 2, false, false, 0, 0, (String) null);
            }
            return true;
        }

        /* renamed from: b */
        public void mo56511b(String str, Map<String, String> map) {
            mo56513a(".sysmsg.AppBrandNotify.DebugInfoList.DebugInfo", map);
            int i = 0;
            do {
                i++;
            } while (mo56513a(".sysmsg.AppBrandNotify.DebugInfoList.DebugInfo" + i, map));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d3$e */
    public static final class C29206e implements C29201d {
        public C29206e(C29200a aVar) {
        }

        /* renamed from: b */
        public void mo56511b(String str, Map<String, String> map) {
            if (map.get(".sysmsg.AppPublicLibraryNotify") != null) {
                int i = Util.getInt(map.get(".sysmsg.AppPublicLibraryNotify.Version"), 0);
                String str2 = map.get(".sysmsg.AppPublicLibraryNotify.MD5");
                String str3 = map.get(".sysmsg.AppPublicLibraryNotify.URL");
                int i2 = Util.getInt(map.get(".sysmsg.AppPublicLibraryNotify.ForceUpdate"), 0);
                if (Util.isNullOrNil(str3) || Util.isNullOrNil(str2) || i <= 0) {
                    Log.m105925i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle library notify, invalid params: url = %s, md5 = %s, version = %d", str3, str2, Integer.valueOf(i));
                    return;
                }
                Log.m105925i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle library notify, version = %d, md5 = %s, url = %s, forceUpdate = %d", Integer.valueOf(i), str2, str3, Integer.valueOf(i2));
                u45 u45 = new u45();
                u45.f259844f = i;
                u45.f259843e = str2;
                u45.f259842d = str3;
                u45.f259846h = i2;
                C81285k2.m99658b(-1, u45, k2$$b.NewXml, (Runnable) null);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("AppBrandNotify", new C29204c((C29200a) null));
        hashMap.put("AppPublicLibraryNotify", new C29206e((C29200a) null));
        hashMap.put("mmbizwxaconfig", new C29202b((C29200a) null));
        hashMap.put("ForceOpenAppNotify", new C81734g());
        hashMap.put("AppBrandForceKill", new C81732f());
        if (DebuggerShell.f239772d) {
            hashMap.put("AppBrandTestUpdateWxaUsageListNotify", new C29488o());
        }
        f79843d = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        if (C86709a0.m107522a()) {
            String g = C48374j0.m53718g(aVar.f94242a.f227631h);
            if (Util.isNullOrNil(g)) {
                Log.m105928w("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "msg content is null");
                return;
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C29200a(this, g), "MicroMsg.AppBrand.WxaPkgPushingXmlHandler");
        }
    }
}
