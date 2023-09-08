package wi0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82604q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import te3.C50495n5;
import te3.C51158ru1;
import te3.C51299su1;
import te3.C51448tu1;
import te3.zq4;

/* renamed from: wi0.p */
public class C90992p {

    /* renamed from: wi0.p$a */
    public class C90993a implements C90997e {

        /* renamed from: a */
        public final /* synthetic */ String f261079a;

        public C90993a(String str) {
            this.f261079a = str;
        }

        /* renamed from: a */
        public void mo125062a(int i, int i2, String str, C47350c cVar) {
            if (i == 0 && i2 == 0) {
                C51448tu1 tu12 = (C51448tu1) cVar.f127056b.f127083a;
                LinkedList<C50495n5> linkedList = tu12.f142416d;
                if (linkedList == null || linkedList.size() == 0) {
                    Log.m105920e("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, AppConfigList is empty");
                    return;
                }
                Log.m105925i("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer appConfigList.size:%d", Integer.valueOf(tu12.f142416d.size()));
                Iterator<C50495n5> it = tu12.f142416d.iterator();
                while (it.hasNext()) {
                    C50495n5 next = it.next();
                    Log.m105925i("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, the config is %s, the configVersion is %d", next.f138411g, Integer.valueOf(next.f138410f));
                    if (!Util.isNullOrNil(next.f138411g)) {
                        C90996d.m114167c(this.f261079a, next.f138409e, next.f138410f);
                        C90996d.m114168d(this.f261079a, next.f138409e, next.f138410f);
                        String str2 = this.f261079a;
                        int i3 = next.f138409e;
                        String str3 = next.f138411g;
                        if (C81161g2.m99451h1() != null) {
                            C81161g2.m99451h1().mo61552B9(String.format("%s_%s_config", new Object[]{str2, Integer.valueOf(i3)}), str3);
                        }
                    }
                }
                return;
            }
            Log.m105921e("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    /* renamed from: wi0.p$b */
    public class C90994b implements C90997e {

        /* renamed from: a */
        public final /* synthetic */ C90998f f261080a;

        /* renamed from: b */
        public final /* synthetic */ String f261081b;

        public C90994b(C90998f fVar, String str) {
            this.f261080a = fVar;
            this.f261081b = str;
        }

        /* renamed from: a */
        public void mo125062a(int i, int i2, String str, C47350c cVar) {
            if (i == 0 && i2 == 0) {
                C51448tu1 tu12 = (C51448tu1) cVar.f127056b.f127083a;
                LinkedList<C50495n5> linkedList = tu12.f142416d;
                if (linkedList == null || linkedList.size() == 0) {
                    Log.m105920e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, AppConfigList is empty");
                    C90998f fVar = this.f261080a;
                    if (fVar != null) {
                        fVar.mo56512a("");
                        return;
                    }
                    return;
                }
                C50495n5 n5Var = tu12.f142416d.get(0);
                Log.m105925i("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, the config is %s, the configVersion is %d", n5Var.f138411g, Integer.valueOf(n5Var.f138410f));
                if (!Util.isNullOrNil(n5Var.f138411g)) {
                    C90996d.m114167c(this.f261081b, n5Var.f138409e, n5Var.f138410f);
                    C90996d.m114168d(this.f261081b, n5Var.f138409e, n5Var.f138410f);
                    String str2 = this.f261081b;
                    int i3 = n5Var.f138409e;
                    String str3 = n5Var.f138411g;
                    if (C81161g2.m99451h1() != null) {
                        C81161g2.m99451h1().mo61552B9(String.format("%s_%s_config", new Object[]{str2, Integer.valueOf(i3)}), str3);
                    }
                    C90998f fVar2 = this.f261080a;
                    if (fVar2 != null) {
                        fVar2.mo56512a(n5Var.f138411g);
                        return;
                    }
                    return;
                }
                C90998f fVar3 = this.f261080a;
                if (fVar3 != null) {
                    fVar3.mo56512a("");
                    return;
                }
                return;
            }
            Log.m105921e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C90998f fVar4 = this.f261080a;
            if (fVar4 != null) {
                fVar4.mo56512a("");
            }
        }
    }

    /* renamed from: wi0.p$c */
    public class C90995c implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C90997e f261082d;

        public C90995c(C90997e eVar) {
            this.f261082d = eVar;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C90997e eVar = this.f261082d;
            if (eVar == null) {
                return 0;
            }
            eVar.mo125062a(i, i2, str, cVar);
            return 0;
        }
    }

    /* renamed from: wi0.p$d */
    public static class C90996d {
        /* renamed from: a */
        public static String m114165a(String str) {
            return String.format("%s#NotifyMessageStatus", new Object[]{str});
        }

        /* renamed from: b */
        public static String m114166b(String str, int i) {
            if (C81161g2.m99451h1() == null) {
                return "";
            }
            return C81161g2.m99451h1().mo61553Lo(String.format("%s_%s_config", new Object[]{str, Integer.valueOf(i)}), "");
        }

        /* renamed from: c */
        public static void m114167c(String str, int i, int i2) {
            if (C81161g2.m99451h1() != null) {
                C38158d h1 = C81161g2.m99451h1();
                String format = String.format("%s_%s_local_version", new Object[]{str, Integer.valueOf(i)});
                h1.mo61552B9(format, i2 + "");
            }
        }

        /* renamed from: d */
        public static void m114168d(String str, int i, int i2) {
            if (C81161g2.m99451h1() != null) {
                C38158d h1 = C81161g2.m99451h1();
                String format = String.format("%s_%s_server_version", new Object[]{str, Integer.valueOf(i)});
                h1.mo61552B9(format, i2 + "");
            }
        }
    }

    /* renamed from: wi0.p$e */
    public interface C90997e {
        /* renamed from: a */
        void mo125062a(int i, int i2, String str, C47350c cVar);
    }

    /* renamed from: wi0.p$f */
    public interface C90998f {
        /* renamed from: a */
        void mo56512a(String str);
    }

    /* renamed from: a */
    public static String m114159a(String str, int i, int i2, C90998f fVar, boolean z) {
        if (C81161g2.m99451h1() == null) {
            return "";
        }
        int i3 = C81161g2.m99451h1() == null ? 0 : Util.getInt(C81161g2.m99451h1().mo61553Lo(String.format("%s_%s_local_version", new Object[]{str, Integer.valueOf(i)}), "0"), 0);
        int i4 = C81161g2.m99451h1() == null ? 0 : Util.getInt(C81161g2.m99451h1().mo61553Lo(String.format("%s_%s_server_version", new Object[]{str, Integer.valueOf(i)}), "0"), 0);
        String b = C90996d.m114166b(str, i);
        boolean z2 = i4 != 0 && (Util.isNullOrNil(b) || i4 > i3);
        Log.m105925i("MicroMsg.CommonConfigManager", "getConfig the server_version is %d ,the local_version is %d", Integer.valueOf(i4), Integer.valueOf(i3));
        Log.m105925i("MicroMsg.CommonConfigManager", "the config is \n %s \n isShouldSyncFromServer:%b", b, Boolean.valueOf(z2));
        if (z2) {
            if (z) {
                C90994b bVar = new C90994b(fVar, str);
                LinkedList linkedList = new LinkedList();
                C51158ru1 ru12 = new C51158ru1();
                ru12.f141151d = str;
                ru12.f141152e = i;
                ru12.f141153f = i4;
                ru12.f141154g = i2;
                linkedList.add(ru12);
                m114161c(linkedList, bVar);
            }
        } else if (fVar != null) {
            fVar.mo56512a(b);
        }
        return b;
    }

    /* renamed from: b */
    public static void m114160b(String str, LinkedList<zq4> linkedList, boolean z) {
        int i;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.CommonConfigManager", "setVersion, app_id is null");
        } else if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.CommonConfigManager", "setVersion, versionItems is empty");
        } else {
            LinkedList linkedList2 = new LinkedList();
            Iterator<zq4> it = linkedList.iterator();
            while (it.hasNext()) {
                zq4 next = it.next();
                Log.m105919d("MicroMsg.CommonConfigManager", "versionItem.version:%d,version.type:%d", Integer.valueOf(next.f186838e), Integer.valueOf(next.f186837d));
                int i2 = next.f186837d;
                if (C81161g2.m99451h1() == null) {
                    i = 0;
                } else {
                    i = Util.getInt(C81161g2.m99451h1().mo61553Lo(String.format("%s_%s_local_version", new Object[]{str, Integer.valueOf(i2)}), "0"), 0);
                }
                int i3 = next.f186838e;
                C90996d.m114168d(str, next.f186837d, i3);
                if (i3 != 0) {
                    if (i3 > i) {
                        int i4 = next.f186837d;
                        int i5 = next.f186838e;
                        C51158ru1 ru12 = new C51158ru1();
                        ru12.f141151d = str;
                        ru12.f141152e = i4;
                        ru12.f141153f = i5;
                        linkedList2.add(ru12);
                    } else if (i3 != i) {
                        Log.m105925i("MicroMsg.CommonConfigManager", "local_version:%d, server_version:%d", Integer.valueOf(i), Integer.valueOf(i3));
                        if (Util.isNullOrNil(C90996d.m114166b(str, next.f186837d))) {
                            int i6 = next.f186837d;
                            int i7 = next.f186838e;
                            C51158ru1 ru13 = new C51158ru1();
                            ru13.f141151d = str;
                            ru13.f141152e = i6;
                            ru13.f141153f = i7;
                            linkedList2.add(ru13);
                        }
                    } else if (Util.isNullOrNil(C90996d.m114166b(str, next.f186837d))) {
                        int i8 = next.f186837d;
                        int i9 = next.f186838e;
                        C51158ru1 ru14 = new C51158ru1();
                        ru14.f141151d = str;
                        ru14.f141152e = i8;
                        ru14.f141153f = i9;
                        linkedList2.add(ru14);
                    }
                }
            }
            Log.m105925i("MicroMsg.CommonConfigManager", "setVersion appid:%s,versionItems.size:%d,getAppConfigItems.size:%d", str, Integer.valueOf(linkedList.size()), Integer.valueOf(linkedList2.size()));
            if (z && linkedList2.size() != 0) {
                Log.m105919d("MicroMsg.CommonConfigManager", "setVersion appid:%s, need sync from server", str);
                m114161c(linkedList2, new C90993a(str));
            }
        }
    }

    /* renamed from: c */
    public static void m114161c(LinkedList<C51158ru1> linkedList, C90997e eVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = C82604q.CTRL_INDEX;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxausrevent/getappconfig";
        bVar.f127067b = new C51448tu1();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C51299su1 su12 = new C51299su1();
        su12.f141759d = linkedList;
        bVar.f127066a = su12;
        C89144l0.m111429e(bVar.mo72403a(), new C90995c(eVar), true);
    }
}
