package p645pj;

import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pj.f */
public class C77093f {

    /* renamed from: a */
    public HashMap<String, String> f225187a = new HashMap<>();

    /* renamed from: b */
    public volatile boolean f225188b = false;

    /* renamed from: a */
    public final void mo107403a(Map<String, String> map, boolean z) {
        String str;
        if (map != null) {
            if (!z) {
                this.f225187a.clear();
            }
            int i = 0;
            while (i < 10000) {
                String str2 = "";
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(".sysmsg.dynacfg_split.Item");
                    sb.append(i == 0 ? str2 : Integer.valueOf(i));
                    str = sb.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(".sysmsg.dynacfg.Item");
                    sb4.append(i == 0 ? str2 : Integer.valueOf(i));
                    str = sb4.toString();
                }
                String str3 = str + ".$key";
                String str4 = map.get(str);
                String str5 = map.get(str3);
                if (str5 == null || Util.isNullOrNil(str5.trim())) {
                    break;
                }
                HashMap<String, String> hashMap = this.f225187a;
                String trim = str5.trim();
                if (str4 != null) {
                    str2 = str4;
                }
                hashMap.put(trim, str2);
                Log.m105919d("MicroMsg.DynamicConfig", "put %s %s", str5.trim(), str4);
                i++;
            }
            Log.m105919d("MicroMsg.DynamicConfig", "All dynamicConfig:%s", this.f225187a.toString());
        }
    }

    /* renamed from: b */
    public int mo107404b(String str, int i) {
        try {
            return Integer.parseInt(mo107405c(str));
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.DynamicConfig", "parseInt failed, val:%s, defVal:%d", str, Integer.valueOf(i));
            return i;
        }
    }

    /* renamed from: c */
    public synchronized String mo107405c(String str) {
        if (!this.f225188b) {
            Log.m105920e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
            mo107407e();
        }
        Log.m105919d("MicroMsg.DynamicConfig", "get configs.get(config) %s %s", str.trim(), this.f225187a.get(str));
        return this.f225187a.get(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String mo107406d(kf3.C61081c r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r3.mo86003h()     // Catch:{ all -> 0x003a }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0027
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r0.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "Repairer Need SetDynamicConfigKey "
            r0.append(r1)     // Catch:{ all -> 0x003a }
            java.lang.String r1 = r3.mo54531a()     // Catch:{ all -> 0x003a }
            r0.append(r1)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x003a }
            junit.framework.Assert.fail(r0)     // Catch:{ all -> 0x003a }
        L_0x0027:
            java.lang.String r0 = r3.mo86003h()     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r2.mo107405c(r0)     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
            java.lang.Object r3 = r3.mo54534g()     // Catch:{ all -> 0x003a }
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r2)
            return r0
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p645pj.C77093f.mo107406d(kf3.c):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo107407e() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f225188b     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            f40.C86709a0.m107528h()     // Catch:{ all -> 0x0060 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005e
            f40.C86709a0.m107528h()     // Catch:{ all -> 0x0060 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0060 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005e
            f40.C86709a0.m107528h()     // Catch:{ all -> 0x0060 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0060 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ all -> 0x0060 }
            r1 = 278529(0x44001, float:3.90302E-40)
            r2 = 0
            java.lang.Object r0 = r0.mo119684e(r1, r2)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0060 }
            r1 = 0
            java.lang.String r3 = "sysmsg"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r3, r2)     // Catch:{ all -> 0x0060 }
            r4.mo107403a(r0, r1)     // Catch:{ all -> 0x0060 }
            f40.C86709a0.m107528h()     // Catch:{ all -> 0x0060 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0060 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ all -> 0x0060 }
            r1 = 278530(0x44002, float:3.90304E-40)
            java.lang.Object r0 = r0.mo119684e(r1, r2)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0060 }
            r1 = 1
            java.lang.String r3 = "sysmsg"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r3, r2)     // Catch:{ all -> 0x0060 }
            r4.mo107403a(r0, r1)     // Catch:{ all -> 0x0060 }
            r4.f225188b = r1     // Catch:{ all -> 0x0060 }
        L_0x005e:
            monitor-exit(r4)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p645pj.C77093f.mo107407e():void");
    }

    @Deprecated
    /* renamed from: f */
    public synchronized void mo107408f(String str, String str2) {
        if (!(str == null || str2 == null)) {
            Log.m105919d("MicroMsg.DynamicConfig", "put configs.put(key,value) %s %s", str.trim(), str2);
            this.f225187a.put(str, str2);
        }
    }

    /* renamed from: g */
    public synchronized void mo107409g(String str, Map<String, String> map, boolean z) {
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.DynamicConfig", "update dynacfg. increment:%b, md5:%s", Boolean.valueOf(z), C86013q1.m106456q(str));
            if (z) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(278530, str);
            } else {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(278529, str);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(278530, "");
            }
            if (map != null) {
                mo107403a(map, z);
            } else {
                mo107403a(XmlParser.parseXml(str, "sysmsg", (String) null), z);
            }
            new DynamicConfigUpdatedEvent().publish();
        }
    }
}
