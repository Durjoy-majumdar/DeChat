package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.o */
public class C72918o {

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.o$b */
    public static class C72920b {

        /* renamed from: a */
        public List<String> f212535a = new ArrayList();

        public C72920b(C72919a aVar) {
        }

        /* renamed from: a */
        public void mo100831a(String str) {
            this.f212535a = new ArrayList();
            if (str != null && str.length() != 0) {
                for (String add : str.split(";")) {
                    this.f212535a.add(add);
                }
            }
        }

        /* renamed from: b */
        public String mo100832b() {
            List<String> list = this.f212535a;
            if (list == null || list.size() == 0) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (String append : this.f212535a) {
                stringBuffer.append(append);
                stringBuffer.append(";");
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: a */
    public static void m85513a() {
        C86709a0.m107535s().mo121142i().mo119676J(69121, "");
    }

    /* renamed from: b */
    public static boolean m85514b(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppNewIconUtil", "markNew fail, appId is empty");
            return false;
        }
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i == null) {
            Log.m105920e("MicroMsg.AppNewIconUtil", "markNew fail, cfgStg is null");
            return false;
        }
        C72920b bVar = new C72920b((C72919a) null);
        bVar.mo100831a((String) i.mo119684e(69121, (Object) null));
        if (!((ArrayList) bVar.f212535a).contains(str)) {
            ((ArrayList) bVar.f212535a).add(str);
        }
        i.mo119676J(69121, bVar.mo100832b());
        return true;
    }

    /* renamed from: c */
    public static boolean m85515c(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppNewIconUtil", "unmarkNew fail, appId is empty");
            return false;
        }
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i == null) {
            Log.m105920e("MicroMsg.AppNewIconUtil", "unmarkNew fail, cfgStg is null");
            return false;
        }
        C72920b bVar = new C72920b((C72919a) null);
        bVar.mo100831a((String) i.mo119684e(69121, (Object) null));
        if (((ArrayList) bVar.f212535a).contains(str)) {
            ((ArrayList) bVar.f212535a).remove(str);
        }
        i.mo119676J(69121, bVar.mo100832b());
        return true;
    }
}
