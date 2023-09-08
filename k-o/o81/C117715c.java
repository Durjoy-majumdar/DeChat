package o81;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import j81.C87906e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oa1.C117731d;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;
import te3.C118421b70;
import te3.C64225a70;
import te3.C64276c70;
import u24.C90599h;
import u81.C118606c;
import v81.C118667b;
import v81.C118668c;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: o81.c */
public class C117715c extends C86301e {

    /* renamed from: d */
    public Map<String, C118667b> f352040d;

    /* renamed from: e */
    public Map<String, C118668c> f352041e;

    /* renamed from: f */
    public Map<String, List<C118667b>> f352042f;

    /* renamed from: g */
    public MMHandler f352043g;

    /* renamed from: h */
    public C117711a f352044h;

    /* renamed from: i */
    public final C117725n f352045i = new C117716a(this);

    /* renamed from: o81.c$a */
    public class C117716a implements C117725n {
        public C117716a(C117715c cVar) {
        }

        /* renamed from: a */
        public void mo182424a(C118667b bVar) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C117726o.class);
            C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar2.hasNext()) {
                C38174i iVar = (C38174i) bVar2.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C117726o) ((C15510f) iVar.get())).mo182286GA(bVar);
                }
            }
        }

        /* renamed from: b */
        public void mo182425b(C118667b bVar) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C117726o.class);
            C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar2.hasNext()) {
                C38174i iVar = (C38174i) bVar2.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C117726o) ((C15510f) iVar.get())).qo0(bVar);
                }
            }
        }

        /* renamed from: c */
        public void mo182426c(C118667b bVar) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C117726o.class);
            C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar2.hasNext()) {
                C38174i iVar = (C38174i) bVar2.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C117726o) ((C15510f) iVar.get())).mo182287SY(bVar);
                }
            }
        }

        /* renamed from: d */
        public void mo182427d(C118668c cVar) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C117726o.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C117726o) ((C15510f) iVar.get())).mo182289ZV(cVar);
                }
            }
        }

        /* renamed from: e */
        public void mo182428e(C118668c cVar) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C117726o.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C117726o) ((C15510f) iVar.get())).mo182288Tn(cVar);
                }
            }
        }

        /* renamed from: f */
        public void mo182429f(C118668c cVar) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C117726o.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C117726o) ((C15510f) iVar.get())).mo182290bS(cVar);
                }
            }
        }
    }

    /* renamed from: o81.c$b */
    public class C117717b implements Comparator<C118667b> {
        public C117717b(C117715c cVar) {
        }

        public int compare(Object obj, Object obj2) {
            int i = (Util.getLong(((C118667b) obj).f355080a, 0) > Util.getLong(((C118667b) obj2).f355080a, 0) ? 1 : (Util.getLong(((C118667b) obj).f355080a, 0) == Util.getLong(((C118667b) obj2).f355080a, 0) ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void vx0(o81.C117715c r7) {
        /*
            java.lang.String r0 = "EdgeComputingConfigService"
            java.util.Map<java.lang.String, v81.b> r7 = r7.f352040d
            if (r7 == 0) goto L_0x009c
            java.util.HashMap r7 = (java.util.HashMap) r7
            int r1 = r7.size()
            if (r1 > 0) goto L_0x0010
            goto L_0x009c
        L_0x0010:
            te3.a70 r1 = new te3.a70
            r1.<init>()
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x001d:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x009d
            java.lang.Object r2 = r7.next()
            v81.b r2 = (v81.C118667b) r2
            java.lang.String r3 = r2.f355080a
            boolean r3 = u24.C90599h.m113511d(r3)
            if (r3 == 0) goto L_0x0032
            goto L_0x001d
        L_0x0032:
            te3.z60 r3 = new te3.z60
            r3.<init>()
            java.lang.String r4 = r2.f355080a
            r3.f354616d = r4
            int r4 = r2.f355081b
            r3.f354617e = r4
            int r4 = r2.f355082c
            r3.f354618f = r4
            int r4 = r2.f355083d
            r3.f354619g = r4
            int r4 = r2.f355085f
            r3.f354621i = r4
            int r4 = r2.f355089j
            r3.f354628s = r4
            int r4 = r2.f355086g
            r3.f354626q = r4
            int r4 = r2.f355087h
            r3.f354625p = r4
            int r4 = r2.f355088i
            r3.f354622j = r4
            java.lang.String r4 = r2.f355090k
            r3.f354623n = r4
            java.lang.String r4 = r2.f355091l
            r3.f354629t = r4
            java.lang.String r4 = r2.f355093n
            r3.f354627r = r4
            java.lang.String r4 = r2.f355092m
            r3.f354624o = r4
            java.util.List<v81.a> r2 = r2.f355084e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0073:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0096
            java.lang.Object r4 = r2.next()
            v81.a r4 = (v81.C118666a) r4
            te3.u60 r5 = new te3.u60
            r5.<init>()
            int r6 = r4.f355077a
            r5.f185718d = r6
            java.lang.String r6 = r4.f355079c
            r5.f185720f = r6
            int r4 = r4.f355078b
            r5.f185719e = r4
            java.util.LinkedList<te3.u60> r4 = r3.f354620h
            r4.add(r5)
            goto L_0x0073
        L_0x0096:
            java.util.LinkedList<te3.z60> r2 = r1.f182037d
            r2.add(r3)
            goto L_0x001d
        L_0x009c:
            r1 = 0
        L_0x009d:
            if (r1 == 0) goto L_0x00dd
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = j81.C87906e.m109411e()
            if (r7 == 0) goto L_0x00dd
            java.lang.String r2 = "mmkv_key_script_config_container"
            byte[] r1 = r1.toByteArray()     // Catch:{ IOException -> 0x00c4 }
            boolean r7 = r7.encode((java.lang.String) r2, (byte[]) r1)     // Catch:{ IOException -> 0x00c4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c4 }
            r1.<init>()     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r2 = "[EdgeComputingConfigService] mSessionPageConfigChangeEvent encode mmkvEncode : "
            r1.append(r2)     // Catch:{ IOException -> 0x00c4 }
            r1.append(r7)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r7 = r1.toString()     // Catch:{ IOException -> 0x00c4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00dd
        L_0x00c4:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[EdgeComputingConfigService] mSessionPageConfigChangeEvent encode throw IOException : "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o81.C117715c.vx0(o81.c):void");
    }

    public static C117715c wx0() {
        return (C117715c) C86312j.m106911c(C117715c.class);
    }

    public final void Ax0() {
        C64276c70 c702;
        MultiProcessMMKV e;
        Map<String, C118668c> map = this.f352041e;
        if (map == null || map.size() <= 0) {
            c702 = null;
        } else {
            c702 = new C64276c70();
            for (C118668c next : map.values()) {
                if (!C90599h.m113511d(next.f355094a)) {
                    C118421b70 b702 = new C118421b70();
                    b702.f353912d = next.f355094a;
                    b702.f353913e = next.f355095b;
                    b702.f353914f = next.f355096c;
                    b702.f353919n = next.f355097d;
                    b702.f353917i = next.f355101h;
                    b702.f353915g = next.f355098e;
                    b702.f353918j = next.f355099f;
                    b702.f353916h = next.f355100g;
                    c702.f182425d.add(b702);
                }
            }
        }
        if (c702 != null && (e = C87906e.m109411e()) != null) {
            try {
                boolean encode = e.encode("mmkv_key_sql_config_container", c702.toByteArray());
                Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionEdgeSqlChangeEvent encode mmkvEncode : " + encode);
            } catch (IOException e2) {
                Log.m105920e("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionEdgeSqlChangeEvent encode throw IOException : " + e2.getMessage());
            }
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] onAccountInitialized, uin : " + C117731d.m166007c().mo182446h());
        this.f352040d = new HashMap();
        this.f352041e = new HashMap();
        this.f352042f = new HashMap();
        yx0();
        zx0();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] onAccountRåelease, uin : " + C117731d.m166007c().mo182446h());
        this.f352040d = new HashMap();
        this.f352041e = new HashMap();
        this.f352042f = new HashMap();
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        this.f352040d = new HashMap();
        this.f352041e = new HashMap();
        this.f352042f = new HashMap();
        this.f352043g = new MMHandler("EdgeComputingConfigService#mParseConfigHandler");
        this.f352044h = new C117711a();
        yx0();
        zx0();
    }

    public List<C118667b> xx0() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f352040d) {
            for (C118667b add : this.f352040d.values()) {
                arrayList.add(add);
            }
        }
        Collections.sort(arrayList, new C117717b(this));
        return arrayList;
    }

    public final void yx0() {
        Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig, uin : " + C117731d.m166007c().mo182446h());
        MultiProcessMMKV e = C87906e.m109411e();
        if (e != null) {
            byte[] decodeBytes = e.decodeBytes("mmkv_key_script_config_container");
            if (decodeBytes != null && decodeBytes.length > 0) {
                C64225a70 a702 = new C64225a70();
                try {
                    a702.parseFrom(decodeBytes);
                    Map<String, C118667b> b = C118606c.m167292b(a702);
                    if (b != null) {
                        for (C118667b bVar : ((HashMap) b).values()) {
                            Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig, scriptConfigModel configID : " + bVar.f355080a);
                        }
                        this.f352040d = b;
                    }
                } catch (Exception e2) {
                    Log.m105920e("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig parse script config throw Exception : " + e2.getMessage());
                }
            }
            byte[] decodeBytes2 = e.decodeBytes("mmkv_key_sql_config_container");
            if (decodeBytes2 != null && decodeBytes2.length > 0) {
                C64276c70 c702 = new C64276c70();
                try {
                    c702.parseFrom(decodeBytes2);
                    Map<String, C118668c> c = C118606c.m167293c(c702);
                    if (c != null) {
                        for (C118668c cVar : ((HashMap) c).values()) {
                            Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig, sqlConfigModel configID : " + cVar.f355094a);
                        }
                        this.f352041e = c;
                    }
                } catch (Exception e3) {
                    Log.m105920e("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig parse sql config throw Exception : " + e3.getMessage());
                }
            }
        }
    }

    public final void zx0() {
        int i;
        HashMap hashMap = new HashMap();
        for (C118667b next : this.f352040d.values()) {
            if (next.f355081b == 1 && (i = next.f355082c) > 0) {
                List list = (List) hashMap.get(String.valueOf(i));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(String.valueOf(next.f355082c), list);
                }
                list.add(next);
            }
        }
        this.f352042f = hashMap;
    }
}
