package i41;

import a41.C112756b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import j41.C117298c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k31.C117373a;
import k41.C117389a;
import s31.C118264c;
import u24.C90599h;
import u31.C118568a;
import v31.C118642b;

/* renamed from: i41.b */
public class C117141b implements C117140a {

    /* renamed from: a */
    public List<C117142a> f350968a = new ArrayList();

    /* renamed from: b */
    public Map<String, C117142a> f350969b = new HashMap();

    /* renamed from: c */
    public Map<String, C117142a> f350970c = new HashMap();

    /* renamed from: d */
    public long f350971d;

    /* renamed from: e */
    public C117142a f350972e;

    /* renamed from: i41.b$a */
    public class C117142a {

        /* renamed from: a */
        public long f350973a;

        /* renamed from: b */
        public long f350974b;

        /* renamed from: c */
        public C112756b f350975c;

        public C117142a(C117141b bVar) {
        }

        public String toString() {
            return "DataReportStayInfo{page=" + this.f350975c + ", inTime=" + this.f350973a + ", stayTime=" + this.f350974b + '}';
        }
    }

    /* renamed from: a */
    public void mo181073a(C112756b bVar, long j) {
        Map<String, Object> b;
        if (bVar != null) {
            C117142a aVar = this.f350972e;
            if (aVar == null || !bVar.mo164512a(aVar.f350975c)) {
                Log.m105924i("Amoeba.StandardEventMonitor", "[onBizIn] page : " + bVar);
                C118264c cVar = C117373a.xx0().f351384j;
                if (cVar != null) {
                    cVar.mo183050f(bVar, "biz_in");
                    C118642b f = C118568a.m167239f(bVar, false);
                    int i = f == null ? 0 : f.f355008c;
                    if (i > 0) {
                        if (!(C117373a.xx0().f351384j == null || (b = cVar.mo183046b(cVar.f353469m)) == null || ((HashMap) b).size() <= 0)) {
                            Map map = null;
                            Iterator it = ((ConcurrentHashMap) cVar.f353470n).keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C112756b bVar2 = (C112756b) it.next();
                                if (bVar.mo164512a(bVar2)) {
                                    map = (Map) ((ConcurrentHashMap) cVar.f353470n).get(bVar2);
                                    break;
                                }
                            }
                            if (map == null) {
                                map = new HashMap();
                                ((ConcurrentHashMap) cVar.f353470n).put(bVar, map);
                            }
                            map.putAll(b);
                        }
                        cVar.f353462f = String.format("%s_%d", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
                        cVar.f353469m = bVar;
                        Log.m105924i("Amoeba.PageContext", "[bizIn] bizId : " + cVar.f353462f);
                    }
                }
                C117142a aVar2 = new C117142a(this);
                this.f350972e = aVar2;
                aVar2.f350975c = bVar;
                aVar2.f350973a = j;
                aVar2.f350974b = 0;
                HashMap hashMap = new HashMap();
                hashMap.put("in_type", 1);
                hashMap.put("in_time", Long.valueOf(j));
                long j2 = j;
                C112756b bVar3 = bVar;
                HashMap hashMap2 = hashMap;
                C117373a.xx0().Hx0(j2, "biz_in", bVar3, hashMap2);
                C117298c.m165377a().mo181967b(j2, "biz_in", bVar3, hashMap2);
            }
        }
    }

    /* renamed from: b */
    public void mo181074b(C112756b bVar, long j) {
        C117142a aVar;
        C112756b bVar2;
        if (bVar != null && (aVar = this.f350972e) != null && bVar.mo164512a(aVar.f350975c)) {
            Log.m105924i("Amoeba.StandardEventMonitor", "[onBizOut] page : " + bVar);
            C117142a aVar2 = this.f350972e;
            long j2 = aVar2.f350973a;
            long j3 = (j <= j2 || j2 <= 0) ? 0 : j - j2;
            aVar2.f350974b = j3;
            if (j3 > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("out_type", 1);
                hashMap.put("in_time", Long.valueOf(this.f350972e.f350973a));
                hashMap.put("out_time", Long.valueOf(j));
                hashMap.put("stay_time", Long.valueOf(this.f350972e.f350974b));
                long j4 = j;
                C112756b bVar3 = bVar;
                HashMap hashMap2 = hashMap;
                C117373a.xx0().Hx0(j4, "biz_out", bVar3, hashMap2);
                C117298c.m165377a().mo181967b(j4, "biz_out", bVar3, hashMap2);
            }
            this.f350972e = null;
            C118264c cVar = C117373a.xx0().f351384j;
            if (cVar != null && (bVar2 = cVar.f353469m) != null && bVar2.mo164512a(bVar)) {
                cVar.f353463g = cVar.f353462f;
                cVar.f353462f = null;
                cVar.f353469m = null;
                Log.m105924i("Amoeba.PageContext", "[bizOut] bizId : null");
            }
        }
    }

    /* renamed from: c */
    public void mo181075c(C112756b bVar, long j, boolean z) {
        C112756b bVar2;
        List list;
        if (bVar != null) {
            if (((C117142a) ((HashMap) this.f350970c).get(bVar.f337634b)) == null) {
                Log.m105924i("Amoeba.StandardEventMonitor", "[onPageIn] page : " + bVar + ", isSubPage : " + z);
                C118264c cVar = C117373a.xx0().f351384j;
                if (cVar != null) {
                    if (!z) {
                        cVar.mo183050f(bVar, "page_in");
                        C118642b f = C118568a.m167239f(bVar, true);
                        if (f != null) {
                            f.f355020o = j;
                        }
                        cVar.f353457a = cVar.f353458b;
                        cVar.f353458b = bVar;
                        cVar.f353461e++;
                    } else if (cVar.f353458b != null) {
                        cVar.mo183050f(bVar, "page_in");
                        C118642b f2 = C118568a.m167239f(bVar, true);
                        if (f2 != null) {
                            f2.f355020o = j;
                        }
                        C112756b bVar3 = cVar.f353458b;
                        if (bVar3 != null) {
                            Iterator it = ((ConcurrentHashMap) cVar.f353459c).keySet().iterator();
                            while (true) {
                                bVar2 = null;
                                if (!it.hasNext()) {
                                    list = null;
                                    break;
                                }
                                C112756b bVar4 = (C112756b) it.next();
                                if (bVar3.mo164512a(bVar4)) {
                                    list = (List) ((ConcurrentHashMap) cVar.f353459c).get(bVar4);
                                    break;
                                }
                            }
                            if (list == null) {
                                list = new CopyOnWriteArrayList();
                                ((ConcurrentHashMap) cVar.f353459c).put(bVar3, list);
                            }
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((C112756b) it4.next()).mo164512a(bVar)) {
                                        break;
                                    }
                                } else {
                                    list.add(bVar);
                                    if (C118568a.m167235b(bVar, "page_is_full_subpage").booleanValue()) {
                                        boolean z2 = false;
                                        C118642b f3 = C118568a.m167239f(bVar, false);
                                        if ((f3 == null ? 0 : f3.f355006a) > 0) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            Iterator it5 = ((ConcurrentHashMap) cVar.f353460d).keySet().iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    break;
                                                }
                                                C112756b bVar5 = (C112756b) it5.next();
                                                if (bVar3.mo164512a(bVar5)) {
                                                    bVar2 = bVar5;
                                                    break;
                                                }
                                            }
                                            if (bVar2 != null) {
                                                ((ConcurrentHashMap) cVar.f353460d).put(bVar2, bVar);
                                            } else {
                                                ((ConcurrentHashMap) cVar.f353460d).put(bVar3, bVar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C117142a aVar = new C117142a(this);
                aVar.f350975c = bVar;
                aVar.f350973a = j;
                aVar.f350974b = 0;
                ((HashMap) this.f350970c).put(bVar.f337634b, aVar);
                int size = ((HashMap) this.f350970c).size();
                if (C117389a.m165527a() && size > C117389a.f351436e) {
                    C117389a.f351436e = size;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
                    arrayList.add(String.valueOf(size));
                    C115669n.INSTANCE.mo160137l(24504, arrayList);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("in_type", 1);
                hashMap.put("in_time", Long.valueOf(j));
                long j2 = j;
                C112756b bVar6 = bVar;
                HashMap hashMap2 = hashMap;
                C117373a.xx0().Hx0(j2, "page_in", bVar6, hashMap2);
                C117298c.m165377a().mo181967b(j2, "page_in", bVar6, hashMap2);
            }
        }
    }

    /* renamed from: d */
    public void mo181076d(C112756b bVar, long j, boolean z) {
        C118264c cVar;
        C112756b bVar2;
        C112756b bVar3;
        List list;
        if (bVar != null) {
            C117142a aVar = (C117142a) ((HashMap) this.f350970c).get(bVar.f337634b);
            if (aVar != null) {
                Log.m105924i("Amoeba.StandardEventMonitor", "[onPageOut] page : " + bVar + ", isSubPage : " + z);
                if (!(!z || (cVar = C117373a.xx0().f351384j) == null || (bVar2 = cVar.f353458b) == null)) {
                    Iterator it = ((ConcurrentHashMap) cVar.f353459c).keySet().iterator();
                    while (true) {
                        bVar3 = null;
                        if (!it.hasNext()) {
                            list = null;
                            break;
                        }
                        C112756b bVar4 = (C112756b) it.next();
                        if (bVar2.mo164512a(bVar4)) {
                            list = (List) ((ConcurrentHashMap) cVar.f353459c).get(bVar4);
                            break;
                        }
                    }
                    if (list != null && list.size() > 0) {
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            C112756b bVar5 = (C112756b) it4.next();
                            if (bVar.mo164512a(bVar5)) {
                                bVar3 = bVar5;
                                break;
                            }
                        }
                        if (bVar3 != null) {
                            list.remove(bVar3);
                        }
                    }
                }
                long j2 = aVar.f350973a;
                aVar.f350974b = (j <= j2 || j2 <= 0) ? 0 : j - j2;
                ((HashMap) this.f350970c).remove(bVar.f337634b);
                if (aVar.f350974b > 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("out_type", 1);
                    hashMap.put("in_time", Long.valueOf(aVar.f350973a));
                    hashMap.put("out_time", Long.valueOf(j));
                    hashMap.put("stay_time", Long.valueOf(aVar.f350974b));
                    long j3 = j;
                    C112756b bVar6 = bVar;
                    HashMap hashMap2 = hashMap;
                    C117373a.xx0().Hx0(j3, "page_out", bVar6, hashMap2);
                    C117298c.m165377a().mo181967b(j3, "page_out", bVar6, hashMap2);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo181077e(C112756b bVar, long j) {
        String str;
        if (bVar != null) {
            if (this.f350971d == 0) {
                this.f350971d = j;
            }
            if (((C117142a) ((HashMap) this.f350969b).get(bVar.f337634b)) == null) {
                Log.m105924i("Amoeba.StandardEventMonitor", "[onSessionIn] page : " + bVar);
                C118264c cVar = C117373a.xx0().f351384j;
                if (cVar != null) {
                    cVar.mo183050f(bVar, "session_in");
                    C118642b f = C118568a.m167239f(bVar, true);
                    if (f != null) {
                        f.f355021p = j;
                    }
                    String str2 = cVar.f353464h;
                    C118642b f2 = C118568a.m167239f(bVar, true);
                    if (f2 != null || C90599h.m113511d(str2)) {
                        f2.f355022q = str2;
                    }
                    C118642b f3 = C118568a.m167239f(bVar, false);
                    int i = f3 == null ? 0 : f3.f355006a;
                    if (i <= 0) {
                        Object[] objArr = new Object[2];
                        String str3 = bVar.f337635c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        objArr[0] = str3;
                        objArr[1] = Long.valueOf(j);
                        str = String.format("%s_%d", objArr);
                    } else {
                        str = String.format("%d_%d", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
                    }
                    Log.m105924i("Amoeba.PageContext", "[sessionIn] sessionId : " + str + ", sessionIds count : " + ((CopyOnWriteArrayList) cVar.f353467k).size());
                    if (C117373a.xx0().f351384j != null) {
                        cVar.mo183049e(bVar, cVar.mo183047c(cVar.f353457a));
                    }
                    ((ConcurrentHashMap) cVar.f353466j).put(bVar, str);
                    ((CopyOnWriteArrayList) cVar.f353467k).add(str);
                }
                C117142a aVar = new C117142a(this);
                aVar.f350975c = bVar;
                aVar.f350973a = j;
                aVar.f350974b = 0;
                ((HashMap) this.f350969b).put(bVar.f337634b, aVar);
                ((ArrayList) this.f350968a).add(aVar);
                int size = ((ArrayList) this.f350968a).size();
                if (C117389a.m165527a() && size > C117389a.f351435d) {
                    C117389a.f351435d = size;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                    arrayList.add(String.valueOf(size));
                    C115669n.INSTANCE.mo160137l(24504, arrayList);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("in_type", 1);
                hashMap.put("in_time", Long.valueOf(j));
                long j2 = j;
                C112756b bVar2 = bVar;
                HashMap hashMap2 = hashMap;
                C117373a.xx0().Hx0(j2, "session_in", bVar2, hashMap2);
                C117298c.m165377a().mo181967b(j2, "session_in", bVar2, hashMap2);
            }
        }
    }

    /* renamed from: f */
    public void mo181078f(C112756b bVar, long j) {
        if (bVar != null) {
            C117142a aVar = (C117142a) ((HashMap) this.f350969b).get(bVar.f337634b);
            if (aVar != null) {
                Log.m105924i("Amoeba.StandardEventMonitor", "[onSessionOut] page : " + bVar);
                long j2 = aVar.f350973a;
                aVar.f350974b = (j <= j2 || j2 <= 0) ? 0 : j - j2;
                ((HashMap) this.f350969b).remove(bVar.f337634b);
                ((ArrayList) this.f350968a).remove(aVar);
                if (aVar.f350974b > 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("out_type", 1);
                    hashMap.put("in_time", Long.valueOf(aVar.f350973a));
                    hashMap.put("out_time", Long.valueOf(j));
                    hashMap.put("stay_time", Long.valueOf(aVar.f350974b));
                    long j3 = j;
                    C112756b bVar2 = bVar;
                    HashMap hashMap2 = hashMap;
                    C117373a.xx0().Hx0(j3, "session_out", bVar2, hashMap2);
                    C117298c.m165377a().mo181967b(j3, "session_out", bVar2, hashMap2);
                }
                C118264c cVar = C117373a.xx0().f351384j;
                if (cVar != null) {
                    for (C112756b bVar3 : ((ConcurrentHashMap) cVar.f353466j).keySet()) {
                        if (bVar.mo164512a(bVar3)) {
                            String str = (String) ((ConcurrentHashMap) cVar.f353466j).remove(bVar3);
                            if (!C90599h.m113511d(str)) {
                                ((CopyOnWriteArrayList) cVar.f353467k).remove(str);
                                Log.m105924i("Amoeba.PageContext", "[sessionOut] sessionId : " + str + ", sessionIds count : " + ((CopyOnWriteArrayList) cVar.f353467k).size());
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
}
