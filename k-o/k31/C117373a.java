package k31;

import a41.C112755a;
import a41.C112756b;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.view.View;
import androidx.fragment.app.Fragment;
import ao3.C113067b;
import b41.C113143a;
import b41.C113144b;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.datareport.monitor.adapter.page.PageEventMonitor;
import com.tencent.p014mm.plugin.datareport.sample.SampleUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import d41.C116570a;
import di3.C86301e;
import di3.C86312j;
import e41.C116692a;
import eb0.C116724d4;
import ei3.C86522b;
import f40.C86709a0;
import f41.C116800a;
import g41.C116920a;
import h41.C117067b;
import h41.b$$c;
import h41.b$$i;
import h81.C20928j;
import h81.C32735h;
import i20.C21043a;
import i41.C117141b;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C9556a;
import l31.C61212e;
import l41.C117460a;
import m41.C117534a;
import m41.C117535e;
import m41.C117536f;
import ma1.C117543a;
import n31.C117600a;
import n31.C117602d;
import n31.C61612b;
import o31.C11345b;
import o31.C76986a;
import p31.C117921a;
import p31.C117924b;
import r31.C118218a;
import r31.C118219b;
import s31.C118260a;
import s31.C118263b;
import s31.C118264c;
import u24.C90599h;
import u31.C118568a;
import u31.C118569b;
import v31.C118641a;
import v31.C118642b;
import v31.C118643c;
import w31.C118724b;
import x31.C118825b;
import y31.C118914a;
import y31.C118915b;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: k31.a */
public class C117373a extends C86301e implements C61212e {

    /* renamed from: p */
    public static Integer f351377p;

    /* renamed from: d */
    public Boolean f351378d = Boolean.TRUE;

    /* renamed from: e */
    public Boolean f351379e = null;

    /* renamed from: f */
    public C118260a f351380f;

    /* renamed from: g */
    public Map<String, Object> f351381g = new HashMap();

    /* renamed from: h */
    public Map<String, List<C117924b>> f351382h = new ConcurrentHashMap();

    /* renamed from: i */
    public List<C117600a> f351383i = new ArrayList();

    /* renamed from: j */
    public C118264c f351384j = new C118264c();

    /* renamed from: n */
    public int f351385n = 0;

    /* renamed from: o */
    public Map<String, Integer> f351386o = new HashMap();

    public static int wx0() {
        if (f351377p == null) {
            f351377p = Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_data_report_dynamic_params_storage_type, 0));
        }
        return f351377p.intValue();
    }

    public static C117373a xx0() {
        return (C117373a) C86312j.m106911c(C117373a.class);
    }

    public long Ax0(Object obj, String str) {
        C118641a d;
        Object obj2;
        C118642b f;
        Object obj3;
        C118643c g;
        Object obj4;
        if (obj == null || C90599h.m113511d(str)) {
            return 0;
        }
        Object zx02 = zx0(obj);
        if (zx02 != null) {
            obj = zx02;
        }
        if (C117534a.m165789l(obj)) {
            C118724b bVar = C118568a.f354847a;
            if (!C90599h.m113511d(str) && (g = C118568a.m167240g(obj, false)) != null && (obj4 = ((ConcurrentHashMap) g.f355031i).get(str)) != null && (obj4 instanceof Long)) {
                return ((Long) obj4).longValue();
            }
            return 0;
        } else if (C117534a.m165788k(obj)) {
            C118724b bVar2 = C118568a.f354847a;
            if (!C90599h.m113511d(str) && (f = C118568a.m167239f(obj, false)) != null && (obj3 = ((ConcurrentHashMap) f.f355017l).get(str)) != null && (obj3 instanceof Long)) {
                return ((Long) obj3).longValue();
            }
            return 0;
        } else if (C117534a.m165785h(obj)) {
            C118724b bVar3 = C118568a.f354847a;
            if (!C90599h.m113511d(str) && (d = C118568a.m167237d(obj, false)) != null && (obj2 = ((ConcurrentHashMap) d.f355004e).get(str)) != null && (obj2 instanceof Long)) {
                return ((Long) obj2).longValue();
            }
            return 0;
        } else if (!C117534a.m165786i()) {
            Log.m105920e("Amoeba.DataReportService", "[getReportInterval] param target is not a right type, please cheak!!!");
            return 0;
        } else {
            throw new RuntimeException("[getReportInterval] param target is " + obj + ", type of target is error, please cheak !!!");
        }
    }

    public int Bx0(Object obj) {
        int i = 0;
        if (obj == null) {
            return 0;
        }
        if (C117534a.m165789l(obj)) {
            return C118568a.m167242i(obj);
        }
        if (C117534a.m165788k(obj)) {
            C118642b f = C118568a.m167239f(obj, false);
            if (f != null) {
                for (Integer intValue : ((ConcurrentHashMap) f.f355016k).keySet()) {
                    i |= intValue.intValue();
                }
            }
            return i;
        } else if (C117534a.m165785h(obj)) {
            C118641a d = C118568a.m167237d(obj, false);
            if (d != null) {
                for (Integer intValue2 : ((ConcurrentHashMap) d.f355003d).keySet()) {
                    i |= intValue2.intValue();
                }
            }
            return i;
        } else {
            C118643c b = C118569b.m167247b(obj, false);
            if (b != null) {
                for (Integer intValue3 : ((ConcurrentHashMap) b.f355030h).keySet()) {
                    i |= intValue3.intValue();
                }
            } else {
                C118642b a = C118569b.m167246a(obj, false);
                if (a != null) {
                    for (Integer intValue4 : ((ConcurrentHashMap) a.f355016k).keySet()) {
                        i |= intValue4.intValue();
                    }
                }
            }
            return i;
        }
    }

    /* renamed from: CH */
    public C61212e mo86131CH(Object obj) {
        if (obj != null && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165788k(obj)) {
                C118264c cVar = this.f351384j;
                C112756b bVar = new C112756b(obj);
                Iterator it = ((ConcurrentHashMap) cVar.f353468l).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C112756b bVar2 = (C112756b) it.next();
                    if (bVar.mo164512a(bVar2)) {
                        Map map = (Map) ((ConcurrentHashMap) cVar.f353468l).get(bVar2);
                        if (map != null && map.size() > 0) {
                            map.clear();
                        }
                    }
                }
            } else {
                Log.m105920e("Amoeba.DataReportService", "[resetSessionParams] target is not a page!!!");
                return this;
            }
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<p31.C117924b> Cx0(java.lang.Object r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = m41.C117534a.m165789l(r10)
            java.lang.String r2 = "Amoeba.DataReportService"
            r3 = 0
            if (r1 == 0) goto L_0x005a
            w31.b r1 = u31.C118568a.f354847a
            boolean r1 = u24.C90599h.m113511d(r11)
            if (r1 == 0) goto L_0x0018
        L_0x0015:
            r5 = r0
            goto L_0x0109
        L_0x0018:
            v31.c r1 = u31.C118568a.m167240g(r10, r3)
            if (r1 != 0) goto L_0x001f
            goto L_0x0015
        L_0x001f:
            int r4 = m41.C117535e.m165796g(r11)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r6 = r1.f355030h
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0034:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0109
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = r7 & r4
            if (r8 == 0) goto L_0x0034
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r8 = r1.f355030h
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            java.lang.Object r7 = r8.get(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            r5.addAll(r7)
            goto L_0x0034
        L_0x005a:
            boolean r1 = m41.C117534a.m165788k(r10)
            if (r1 == 0) goto L_0x00aa
            w31.b r1 = u31.C118568a.f354847a
            boolean r1 = u24.C90599h.m113511d(r11)
            if (r1 == 0) goto L_0x0069
            goto L_0x0015
        L_0x0069:
            v31.b r1 = u31.C118568a.m167239f(r10, r3)
            if (r1 == 0) goto L_0x0015
            int r4 = m41.C117535e.m165795f(r11)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r6 = r1.f355016k
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0084:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0109
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = r7 & r4
            if (r8 == 0) goto L_0x0084
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r8 = r1.f355016k
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            java.lang.Object r7 = r8.get(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            r5.addAll(r7)
            goto L_0x0084
        L_0x00aa:
            boolean r1 = m41.C117534a.m165785h(r10)
            if (r1 == 0) goto L_0x00fc
            w31.b r1 = u31.C118568a.f354847a
            boolean r1 = u24.C90599h.m113511d(r11)
            if (r1 == 0) goto L_0x00ba
            goto L_0x0015
        L_0x00ba:
            v31.a r1 = u31.C118568a.m167237d(r10, r3)
            if (r1 == 0) goto L_0x0015
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r5 = r1.f355003d
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x00d1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00fa
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r7 = m41.C117535e.m165794e(r11)
            r7 = r7 & r6
            if (r7 == 0) goto L_0x00d1
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r7 = r1.f355003d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
            java.lang.Object r6 = r7.get(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            r4.addAll(r6)
            goto L_0x00d1
        L_0x00fa:
            r5 = r4
            goto L_0x0109
        L_0x00fc:
            boolean r1 = m41.C117534a.m165786i()
            if (r1 != 0) goto L_0x01d8
            java.lang.String r1 = "[getReportRouteRules] param target is not a right type, please cheak!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            goto L_0x0015
        L_0x0109:
            boolean r1 = u24.C90599h.m113511d(r11)
            if (r1 != 0) goto L_0x01d7
            if (r5 == 0) goto L_0x01d7
            int r1 = r5.size()
            if (r1 > 0) goto L_0x0119
            goto L_0x01d7
        L_0x0119:
            boolean r1 = m41.C117534a.m165789l(r10)
            if (r1 == 0) goto L_0x0128
            v31.c r1 = u31.C118568a.m167240g(r10, r3)
            if (r1 == 0) goto L_0x0183
            java.util.List<q31.a> r0 = r1.f355028f
            goto L_0x0183
        L_0x0128:
            boolean r1 = m41.C117534a.m165788k(r10)
            if (r1 == 0) goto L_0x0175
            v31.b r1 = u31.C118568a.m167239f(r10, r3)
            if (r1 == 0) goto L_0x0183
            xx0()
            int r3 = wx0()
            if (r3 != 0) goto L_0x0168
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.List<java.lang.ref.WeakReference<q31.a>> r1 = r1.f355013h
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x014a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0183
            java.lang.Object r3 = r1.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L_0x014a
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L_0x014a
            java.lang.Object r3 = r3.get()
            q31.a r3 = (q31.C118148a) r3
            r0.add(r3)
            goto L_0x014a
        L_0x0168:
            xx0()
            int r3 = wx0()
            r4 = 1
            if (r3 != r4) goto L_0x0183
            java.util.List<q31.a> r0 = r1.f355014i
            goto L_0x0183
        L_0x0175:
            boolean r1 = m41.C117534a.m165785h(r10)
            if (r1 == 0) goto L_0x0183
            v31.a r1 = u31.C118568a.m167237d(r10, r3)
            if (r1 == 0) goto L_0x0183
            java.util.List<q31.a> r0 = r1.f355002c
        L_0x0183:
            if (r0 != 0) goto L_0x0186
            goto L_0x01d7
        L_0x0186:
            java.util.Iterator r1 = r5.iterator()
        L_0x018a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01d7
            java.lang.Object r3 = r1.next()
            p31.b r3 = (p31.C117924b) r3
            java.util.Iterator r4 = r0.iterator()
        L_0x019a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x018a
            java.lang.Object r6 = r4.next()
            q31.a r6 = (q31.C118148a) r6
            if (r3 == 0) goto L_0x019a
            int r7 = r3.f352463a
            boolean r6 = r6.mo36a(r10, r11, r7)
            if (r6 == 0) goto L_0x019a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "[filterReportRouteRule] break report, target : "
            r4.append(r6)
            r4.append(r10)
            java.lang.String r6 = ", eventId : "
            r4.append(r6)
            r4.append(r11)
            java.lang.String r6 = ", routeRule : "
            r4.append(r6)
            int r3 = r3.f352463a
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            goto L_0x018a
        L_0x01d7:
            return r5
        L_0x01d8:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[getReportRouteRules] param target is "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = ", type of target is error, please cheak !!!"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k31.C117373a.Cx0(java.lang.Object, java.lang.String):java.util.List");
    }

    public final void Dx0(long j, C112755a aVar, List<C117924b> list) {
        HashMap hashMap;
        if (aVar != null && list != null && list.size() > 0) {
            Log.m105924i("Amoeba.DataReportService", "[handleReportData] reportData : " + aVar + ", routeRules : " + list);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            synchronized (this.f351381g) {
                for (String str : ((HashMap) this.f351381g).keySet()) {
                    hashMap3.put(str, ((HashMap) this.f351381g).get(str));
                }
            }
            if (hashMap3.size() > 0) {
                hashMap2.putAll(hashMap3);
            }
            HashMap hashMap4 = new HashMap();
            vx0(aVar.f337630a, hashMap4);
            this.f351384j.f353465i = aVar.f337630a;
            Map<String, Object> map = aVar.f337631b;
            if (map != null && ((HashMap) map).size() > 0) {
                hashMap4.putAll(map);
            }
            int i = 0;
            if (this.f351380f.f353452b != null) {
                Log.m105918d("Amoeba.DefaultDynamicPublicParamsProvider", "[setDynamicPublicParams]");
                Context context = MMApplicationContext.getContext();
                hashMap2.put(TPDownloadProxyEnum.USER_NETWORK_TYPE, Integer.valueOf(NetStatusUtil.isConnected(context) ? NetStatusUtil.isWifi(context) ? 1 : NetStatusUtil.is2G(context) ? 2 : NetStatusUtil.is3G(context) ? 3 : NetStatusUtil.is4G(context) ? 4 : 0 : -1));
                hashMap2.put("mode_flag", Integer.valueOf(C117534a.m165781d()));
                String str2 = aVar.f337630a;
                if (!C90599h.m113511d(str2)) {
                    Log.m105918d("Amoeba.DefaultDynamicPublicParamsProvider", "[setDynamicPublicEventParams] eventId : " + str2);
                }
            }
            String str3 = aVar.f337630a;
            if (!C90599h.m113511d(str3)) {
                hashMap2.put("report_seq", Integer.valueOf(this.f351385n));
                this.f351385n++;
                if (((HashMap) this.f351386o).containsKey(str3)) {
                    i = ((Integer) ((HashMap) this.f351386o).get(str3)).intValue();
                }
                hashMap2.put("event_seq", Integer.valueOf(i));
                ((HashMap) this.f351386o).put(str3, Integer.valueOf(i + 1));
            }
            if (this.f351380f.f353453c != null) {
                if (C90599h.m113511d(aVar.f337630a)) {
                    hashMap = null;
                } else {
                    HashMap hashMap5 = new HashMap();
                    if (hashMap2.size() > 0) {
                        hashMap5.putAll(hashMap2);
                    }
                    if (hashMap4.size() > 0) {
                        hashMap5.put("udf_kv", hashMap4);
                    }
                    hashMap = hashMap5;
                }
                if (hashMap != null && hashMap.size() > 0) {
                    for (C117924b next : list) {
                        if (next.f352463a > 0) {
                            synchronized (this.f351383i) {
                                Iterator it = ((ArrayList) this.f351383i).iterator();
                                while (it.hasNext()) {
                                    if (((C117600a) it.next()).mo182170a(j, aVar.f337630a, hashMap, next)) {
                                        break;
                                    }
                                }
                            }
                        }
                        C61612b bVar = next.f352465c;
                        if (bVar != null) {
                            bVar.mo77120a(j, aVar.f337630a, hashMap);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l31.C61212e E60(java.lang.Object r6, q31.C118148a r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x012a
            if (r7 == 0) goto L_0x012a
            boolean r0 = r5.Ex0()
            if (r0 != 0) goto L_0x000c
            goto L_0x012a
        L_0x000c:
            boolean r0 = m41.C117534a.m165788k(r6)
            r1 = 1
            if (r0 != 0) goto L_0x0039
            boolean r0 = m41.C117534a.m165789l(r6)
            if (r0 != 0) goto L_0x0039
            boolean r0 = m41.C117534a.m165785h(r6)
            if (r0 != 0) goto L_0x0039
            v31.c r0 = u31.C118569b.m167247b(r6, r1)
            if (r0 == 0) goto L_0x002c
            java.util.List<q31.a> r0 = r0.f355028f
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.add(r7)
        L_0x002c:
            v31.b r0 = u31.C118569b.m167246a(r6, r1)
            if (r0 == 0) goto L_0x0039
            java.util.List<q31.a> r0 = r0.f355014i
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.add(r7)
        L_0x0039:
            java.lang.Object r0 = r5.zx0(r6)
            if (r0 == 0) goto L_0x0040
            r6 = r0
        L_0x0040:
            boolean r0 = m41.C117534a.m165789l(r6)
            if (r0 == 0) goto L_0x0055
            v31.c r6 = u31.C118568a.m167240g(r6, r1)
            if (r6 == 0) goto L_0x012a
            java.util.List<q31.a> r6 = r6.f355028f
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6
            r6.add(r7)
            goto L_0x012a
        L_0x0055:
            boolean r0 = m41.C117534a.m165788k(r6)
            if (r0 == 0) goto L_0x0116
            v31.b r0 = u31.C118568a.m167239f(r6, r1)
            if (r0 == 0) goto L_0x0087
            xx0()
            int r2 = wx0()
            if (r2 != 0) goto L_0x0077
            java.util.List<java.lang.ref.WeakReference<q31.a>> r0 = r0.f355013h
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r7)
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.add(r1)
            goto L_0x0087
        L_0x0077:
            xx0()
            int r2 = wx0()
            if (r2 != r1) goto L_0x0087
            java.util.List<q31.a> r0 = r0.f355014i
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.add(r7)
        L_0x0087:
            int r0 = wx0()
            if (r0 != 0) goto L_0x012a
            java.lang.String r0 = "Amoeba.DataReportService"
            r1 = 0
            boolean r2 = r6 instanceof com.tencent.p014mm.hellhoundlib.activities.HellActivity     // Catch:{ Exception -> 0x00f7 }
            r3 = 2131310724(0x7f093884, float:1.8239768E38)
            if (r2 == 0) goto L_0x00b7
            r2 = r6
            com.tencent.mm.hellhoundlib.activities.HellActivity r2 = (com.tencent.p014mm.hellhoundlib.activities.HellActivity) r2     // Catch:{ Exception -> 0x00f7 }
            java.lang.Object r2 = r2.getHellTag(r3)     // Catch:{ Exception -> 0x00f7 }
            if (r2 == 0) goto L_0x00a7
            boolean r4 = r2 instanceof java.util.List     // Catch:{ Exception -> 0x00f7 }
            if (r4 == 0) goto L_0x00a7
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x00f7 }
            r1 = r2
        L_0x00a7:
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00f7 }
            r2.<init>()     // Catch:{ Exception -> 0x00f7 }
            com.tencent.mm.hellhoundlib.activities.HellActivity r6 = (com.tencent.p014mm.hellhoundlib.activities.HellActivity) r6     // Catch:{ Exception -> 0x00b5 }
            r6.setHellTag(r3, r2)     // Catch:{ Exception -> 0x00b5 }
        L_0x00b3:
            r1 = r2
            goto L_0x0110
        L_0x00b5:
            r6 = move-exception
            goto L_0x00d8
        L_0x00b7:
            boolean r2 = r6 instanceof com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment     // Catch:{ Exception -> 0x00f7 }
            if (r2 == 0) goto L_0x00da
            r2 = r6
            com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment r2 = (com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment) r2     // Catch:{ Exception -> 0x00f7 }
            java.lang.Object r2 = r2.getHellTag(r3)     // Catch:{ Exception -> 0x00f7 }
            if (r2 == 0) goto L_0x00cb
            boolean r4 = r2 instanceof java.util.List     // Catch:{ Exception -> 0x00f7 }
            if (r4 == 0) goto L_0x00cb
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x00f7 }
            r1 = r2
        L_0x00cb:
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00f7 }
            r2.<init>()     // Catch:{ Exception -> 0x00f7 }
            com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment r6 = (com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment) r6     // Catch:{ Exception -> 0x00b5 }
            r6.setHellTag(r3, r2)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00b3
        L_0x00d8:
            r1 = r2
            goto L_0x00f8
        L_0x00da:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f7 }
            r2.<init>()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r3 = "[getPageDynamicParamsList] can not get dynamicParamsList : "
            r2.append(r3)     // Catch:{ Exception -> 0x00f7 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r6 = r6.getSimpleName()     // Catch:{ Exception -> 0x00f7 }
            r2.append(r6)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x00f7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0110
        L_0x00f7:
            r6 = move-exception
        L_0x00f8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[getPageDynamicParamsList] throw Exception : "
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
        L_0x0110:
            if (r1 == 0) goto L_0x012a
            r1.add(r7)
            goto L_0x012a
        L_0x0116:
            boolean r0 = m41.C117534a.m165785h(r6)
            if (r0 == 0) goto L_0x012a
            v31.a r6 = u31.C118568a.m167237d(r6, r1)
            if (r6 != 0) goto L_0x0123
            goto L_0x012a
        L_0x0123:
            java.util.List<q31.a> r6 = r6.f355002c
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6
            r6.add(r7)
        L_0x012a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k31.C117373a.E60(java.lang.Object, q31.a):l31.e");
    }

    /* renamed from: EI */
    public Map<String, Object> mo86133EI(Object obj, String str) {
        Map<String, Map<String, Object>> map;
        Map<String, Map<String, Object>> map2;
        Map<String, Map<String, Object>> map3;
        if (obj == null || C90599h.m113511d(str)) {
            return null;
        }
        Object zx02 = zx0(obj);
        if (zx02 != null) {
            obj = zx02;
        }
        if (C117534a.m165789l(obj)) {
            C118643c g = C118568a.m167240g(obj, false);
            if (g == null || (map3 = g.f355026d) == null) {
                return null;
            }
            return (Map) ((ConcurrentHashMap) map3).get(str);
        } else if (C117534a.m165788k(obj)) {
            C118642b f = C118568a.m167239f(obj, false);
            if (f == null || (map2 = f.f355012g) == null) {
                return null;
            }
            return (Map) ((ConcurrentHashMap) map2).get(str);
        } else if (C117534a.m165785h(obj)) {
            C118641a d = C118568a.m167237d(obj, false);
            if (d == null || (map = d.f355001b) == null) {
                return null;
            }
            return (Map) ((ConcurrentHashMap) map).get(str);
        } else if (!C117534a.m165786i()) {
            Log.m105920e("Amoeba.DataReportService", "[getEventParams] param target is not a right type, please cheak!!!");
            return null;
        } else {
            throw new RuntimeException("[getEventParams] param target is " + obj + ", type of target is error, please cheak !!!");
        }
    }

    /* renamed from: Ei */
    public void mo86134Ei(C117602d dVar) {
        if (dVar != null && Ex0()) {
            Log.m105924i("Amoeba.DataReportService", "[obtainLastClickViewInfo]");
            C117536f.m165800b(new a$$c(this, dVar));
        }
    }

    public boolean Ex0() {
        if (!this.f351378d.booleanValue()) {
            return false;
        }
        if (this.f351379e == null) {
            this.f351379e = Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_data_report_cloud_switch, true));
            Log.m105924i("Amoeba.DataReportService", "[isOpenSwitch] cloudSwitch : " + this.f351379e);
        }
        return this.f351379e.booleanValue();
    }

    /* renamed from: F4 */
    public void mo86135F4(Fragment fragment) {
        if (fragment != null && Ex0()) {
            C116800a.f350124d.mo180780k(fragment, false);
        }
    }

    /* renamed from: FZ */
    public C61212e mo86136FZ(Object obj, String str) {
        C118642b f;
        C118642b a;
        if (obj != null && !C90599h.m113511d(str) && Ex0()) {
            if (!C117534a.m165788k(obj)) {
                Map<Object, C118642b> map = C118569b.f354849a;
                if (!C90599h.m113511d(str) && (a = C118569b.m167246a(obj, true)) != null) {
                    a.f355007b = str;
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165788k(obj) && (f = C118568a.m167239f(obj, true)) != null && !C90599h.m113511d(str)) {
                f.f355007b = str;
            }
        }
        return this;
    }

    public C61212e Fb0(Object obj, String str) {
        if (obj != null && !C90599h.m113511d(str) && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (!C117534a.m165788k(obj)) {
                Log.m105920e("Amoeba.DataReportService", "[removeNextSessionParam] target is not a page!!!");
                return this;
            }
            C118264c cVar = this.f351384j;
            C112756b bVar = new C112756b(obj);
            cVar.getClass();
            if (!C90599h.m113511d(str)) {
                Iterator it = ((ConcurrentHashMap) cVar.f353472p).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C112756b bVar2 = (C112756b) it.next();
                    if (bVar.mo164512a(bVar2)) {
                        ((ConcurrentHashMap) cVar.f353472p).remove(bVar2);
                        break;
                    }
                }
            }
        }
        return this;
    }

    public void Fx0(long j, String str, Map<String, Object> map) {
        if (Ex0()) {
            C117921a.C117923b a = C117921a.m166309a();
            a.f352459b = str;
            a.mo182705b(map);
            a.mo182706c((List) ((ConcurrentHashMap) this.f351382h).get(str));
            Gx0(j, a.mo182704a());
        }
    }

    /* renamed from: Fz */
    public C61212e mo86138Fz(View view, View view2) {
        if (!(view == null || view2 == null || !Ex0())) {
            if (!C117534a.m165789l(view)) {
                Log.m105920e("Amoeba.DataReportService", "[setViewLogicParent] target is not a view!!!");
                return this;
            }
            C118643c g = C118568a.m167240g(view, true);
            if (g != null) {
                g.f355027e = new WeakReference<>(view2);
            }
        }
        return this;
    }

    public void Gx0(long j, C117921a aVar) {
        if (aVar != null && Ex0()) {
            Log.m105924i("Amoeba.DataReportService", "[reportStandardEvent] eventData : " + aVar);
            C112755a aVar2 = new C112755a();
            String str = aVar.f352454b;
            aVar2.f337630a = str;
            if (C90599h.m113509b(str, "cgi_req") || C90599h.m113509b(aVar.f352454b, "cgi_resp")) {
                C118915b bVar = this.f351380f.f353453c;
                if (bVar != null) {
                    aVar2.mo164511a(((C118914a) bVar).mo183599a((List<C118218a>) null, C118219b.m166774a(aVar.f352454b, C118219b.m166776c(this.f351384j.f353458b)), aVar.f352455c, true));
                }
            } else {
                aVar2.mo164511a(aVar.f352455c);
            }
            Dx0(j, aVar2, aVar.f352456d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Hx0(long r9, java.lang.String r11, java.lang.Object r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            r8 = this;
            boolean r0 = r8.Ex0()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = m41.C117534a.m165788k(r12)
            if (r0 != 0) goto L_0x000e
            goto L_0x00c8
        L_0x000e:
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L_0x0015
            w31.b r2 = u31.C118568a.f354847a
            goto L_0x0023
        L_0x0015:
            v31.b r2 = u31.C118568a.m167239f(r12, r1)
            if (r2 != 0) goto L_0x001d
            r2 = 0
            goto L_0x001f
        L_0x001d:
            int r2 = r2.f355006a
        L_0x001f:
            if (r2 <= 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 == 0) goto L_0x00c8
            k31.a r2 = xx0()
            int r2 = r2.Bx0(r12)
            boolean r3 = u24.C90599h.m113511d(r11)
            if (r3 == 0) goto L_0x0035
            goto L_0x007b
        L_0x0035:
            java.lang.String r3 = "session_in"
            boolean r3 = u24.C90599h.m113509b(r11, r3)
            if (r3 != 0) goto L_0x0069
            java.lang.String r3 = "session_out"
            boolean r3 = u24.C90599h.m113509b(r11, r3)
            if (r3 != 0) goto L_0x0069
            java.lang.String r3 = "page_in"
            boolean r3 = u24.C90599h.m113509b(r11, r3)
            if (r3 != 0) goto L_0x0069
            java.lang.String r3 = "page_out"
            boolean r3 = u24.C90599h.m113509b(r11, r3)
            if (r3 != 0) goto L_0x0069
            java.lang.String r3 = "biz_in"
            boolean r3 = u24.C90599h.m113509b(r11, r3)
            if (r3 != 0) goto L_0x0069
            java.lang.String r3 = "biz_out"
            boolean r3 = u24.C90599h.m113509b(r11, r3)
            if (r3 == 0) goto L_0x007b
        L_0x0069:
            r3 = r2 & 1
            if (r3 == 0) goto L_0x006e
            goto L_0x007b
        L_0x006e:
            r3 = r2 & 2
            if (r3 == 0) goto L_0x0073
            goto L_0x007a
        L_0x0073:
            int r3 = m41.C117535e.m165795f(r11)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            if (r0 == 0) goto L_0x007e
            goto L_0x00c8
        L_0x007e:
            long r2 = java.lang.System.currentTimeMillis()
            k31.a r0 = xx0()
            long r4 = r0.yx0(r12, r11)
            k31.a r0 = xx0()
            long r6 = r0.Ax0(r12, r11)
            long r4 = r2 - r4
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0099
            return
        L_0x0099:
            k31.a r0 = xx0()
            r0.Jx0(r12, r11, r2)
            p31.a$b r0 = p31.C117921a.m166309a()
            r0.f352458a = r12
            r0.f352459b = r11
            s31.a r2 = r8.f351380f
            y31.b r2 = r2.f353453c
            r3 = 0
            r31.a r4 = r31.C118219b.m166774a(r11, r12)
            y31.a r2 = (y31.C118914a) r2
            java.util.Map r13 = r2.mo183599a(r3, r4, r13, r1)
            r0.mo182705b(r13)
            java.util.List r11 = r8.Cx0(r12, r11)
            r0.mo182706c(r11)
            p31.a r11 = r0.mo182704a()
            r8.Gx0(r9, r11)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k31.C117373a.Hx0(long, java.lang.String, java.lang.Object, java.util.Map):void");
    }

    public C61212e I20(Object obj, Map<String, Object> map) {
        if (obj != null && map != null && map.size() > 0 && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (!C117534a.m165788k(obj)) {
                Log.m105920e("Amoeba.DataReportService", "[setNextSessionParams] target is not a page!!!");
                return this;
            }
            C118264c cVar = this.f351384j;
            C112756b bVar = new C112756b(obj);
            cVar.getClass();
            if (map.size() > 0) {
                Map map2 = null;
                Iterator it = ((ConcurrentHashMap) cVar.f353472p).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C112756b bVar2 = (C112756b) it.next();
                    if (bVar.mo164512a(bVar2)) {
                        map2 = (Map) ((ConcurrentHashMap) cVar.f353472p).get(bVar2);
                        break;
                    }
                }
                if (map2 == null) {
                    map2 = new HashMap();
                    ((ConcurrentHashMap) cVar.f353472p).put(bVar, map2);
                }
                map2.putAll(map);
            }
        }
        return this;
    }

    public void Ix0(long j, String str, Map<String, Object> map, List<C117924b> list) {
        if (Ex0()) {
            C117921a.C117923b a = C117921a.m166309a();
            a.f352459b = str;
            a.mo182705b(map);
            a.mo182706c(list);
            Gx0(j, a.mo182704a());
        }
    }

    public void Jx0(Object obj, String str, long j) {
        int i;
        C118641a d;
        C118642b f;
        C118643c g;
        if (obj != null && j >= 0) {
            if (C117534a.m165789l(obj)) {
                C118724b bVar = C118568a.f354847a;
                if (!C90599h.m113511d(str) && i >= 0 && (g = C118568a.m167240g(obj, true)) != null) {
                    ((ConcurrentHashMap) g.f355032j).put(str, Long.valueOf(j));
                }
            } else if (C117534a.m165788k(obj)) {
                C118724b bVar2 = C118568a.f354847a;
                if (!C90599h.m113511d(str) && i >= 0 && (f = C118568a.m167239f(obj, true)) != null) {
                    ((ConcurrentHashMap) f.f355018m).put(str, Long.valueOf(j));
                }
            } else if (C117534a.m165785h(obj)) {
                C118724b bVar3 = C118568a.f354847a;
                if (!C90599h.m113511d(str) && i >= 0 && (d = C118568a.m167237d(obj, true)) != null) {
                    ((ConcurrentHashMap) d.f355005f).put(str, Long.valueOf(j));
                }
            } else if (!C117534a.m165786i()) {
                Log.m105920e("Amoeba.DataReportService", "[setLastReportTime] param target is not a right type, please cheak!!!");
            } else {
                throw new RuntimeException("[setLastReportTime] param target is " + obj + ", type of target is error, please cheak !!!");
            }
        }
    }

    public C61212e K70(Object obj, String str) {
        if (obj != null && !C90599h.m113511d(str) && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (!C117534a.m165788k(obj)) {
                Log.m105920e("Amoeba.DataReportService", "[removeNextBizParam] target is not a page!!!");
                return this;
            }
            C118264c cVar = this.f351384j;
            C112756b bVar = new C112756b(obj);
            cVar.getClass();
            if (!C90599h.m113511d(str)) {
                Iterator it = ((ConcurrentHashMap) cVar.f353471o).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C112756b bVar2 = (C112756b) it.next();
                    if (bVar.mo164512a(bVar2)) {
                        ((ConcurrentHashMap) cVar.f353471o).remove(bVar2);
                        break;
                    }
                }
            }
        }
        return this;
    }

    public C61212e Kx0(Object obj, String str, Object obj2) {
        C118641a d;
        if (obj != null && !C90599h.m113511d(str) && obj2 != null && Ex0()) {
            if (!C117534a.m165788k(obj) && !C117534a.m165789l(obj) && !C117534a.m165785h(obj)) {
                Map<Object, C118642b> map = C118569b.f354849a;
                if (!C90599h.m113511d(str) && !C90599h.m113511d(str)) {
                    C118643c b = C118569b.m167247b(obj, true);
                    if (b != null) {
                        ((ConcurrentHashMap) b.f355025c).put(str, obj2);
                    }
                    C118642b a = C118569b.m167246a(obj, true);
                    if (a != null) {
                        ((ConcurrentHashMap) a.f355009d).put(str, obj2);
                    }
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165789l(obj)) {
                C118643c g = C118568a.m167240g(obj, true);
                if (g != null && !C90599h.m113511d(str)) {
                    ((ConcurrentHashMap) g.f355025c).put(str, obj2);
                }
            } else if (C117534a.m165788k(obj)) {
                C118642b f = C118568a.m167239f(obj, true);
                if (f != null && !C90599h.m113511d(str)) {
                    ((ConcurrentHashMap) f.f355009d).put(str, obj2);
                }
            } else if (C117534a.m165785h(obj)) {
                C118724b bVar = C118568a.f354847a;
                if (!C90599h.m113511d(str) && (d = C118568a.m167237d(obj, true)) != null) {
                    ((ConcurrentHashMap) d.f355000a).put(str, obj2);
                }
            }
        }
        return this;
    }

    /* renamed from: Ky */
    public C61212e mo86141Ky(Object obj, double d) {
        int i;
        int i2;
        C118643c b;
        if (obj != null && d > 0.0d && d <= 1.0d && Ex0()) {
            if (!C117534a.m165789l(obj)) {
                Map<Object, C118642b> map = C118569b.f354849a;
                if (i > 0 && i2 <= 0 && (b = C118569b.m167247b(obj, true)) != null) {
                    ((ConcurrentHashMap) b.f355029g).put("view_exp_min_rate", Double.valueOf(d));
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165789l(obj)) {
                C118825b.m167530b(C118568a.m167240g(obj, true), "view_exp_min_rate", Double.valueOf(d));
            }
        }
        return this;
    }

    public Map<String, Object> Lg0(Object obj) {
        if (obj == null) {
            return null;
        }
        Object zx02 = zx0(obj);
        if (zx02 != null) {
            obj = zx02;
        }
        if (C117534a.m165788k(obj)) {
            return this.f351384j.mo183046b(new C112756b(obj));
        }
        Log.m105920e("Amoeba.DataReportService", "[getNextBizParams] target is not a page!!!");
        return null;
    }

    public C61212e Lx0(String str, Object obj) {
        if (C90599h.m113511d(str) || obj == null || !Ex0()) {
            return this;
        }
        synchronized (this.f351381g) {
            ((HashMap) this.f351381g).put(str, obj);
        }
        return this;
    }

    /* renamed from: M0 */
    public void mo86143M0(Fragment fragment) {
        if (fragment != null && Ex0()) {
            C116800a aVar = C116800a.f350124d;
            if (C116800a.f350133p) {
                ConcurrentHashMap<Integer, C116800a.C116802b> concurrentHashMap = C116800a.f350127g;
                C116800a.C116802b bVar = concurrentHashMap.get(Integer.valueOf(fragment.hashCode()));
                if (bVar == null) {
                    bVar = new C116800a.C116802b(new WeakReference(fragment), true);
                    concurrentHashMap.put(Integer.valueOf(fragment.hashCode()), bVar);
                }
                bVar.f350153l = true;
                ArrayList arrayList = new ArrayList();
                for (Fragment parentFragment = fragment.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                    arrayList.add(parentFragment);
                }
                if (!arrayList.isEmpty()) {
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        aVar.mo180783n((Fragment) arrayList.get(size));
                    }
                }
                aVar.mo180784o(fragment, false);
                aVar.mo180783n(fragment);
                aVar.mo180772c(fragment);
            }
        }
    }

    /* renamed from: M8 */
    public C61212e mo86144M8(Object obj, Map<String, Object> map) {
        if (obj != null && map != null && map.size() > 0 && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (!C117534a.m165788k(obj)) {
                Log.m105920e("Amoeba.DataReportService", "[setNextBizParams] target is not a page!!!");
                return this;
            }
            C118264c cVar = this.f351384j;
            C112756b bVar = new C112756b(obj);
            cVar.getClass();
            if (map.size() > 0) {
                Map map2 = null;
                Iterator it = ((ConcurrentHashMap) cVar.f353471o).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C112756b bVar2 = (C112756b) it.next();
                    if (bVar.mo164512a(bVar2)) {
                        map2 = (Map) ((ConcurrentHashMap) cVar.f353471o).get(bVar2);
                        break;
                    }
                }
                if (map2 == null) {
                    map2 = new HashMap();
                    ((ConcurrentHashMap) cVar.f353471o).put(bVar, map2);
                }
                map2.putAll(map);
            }
        }
        return this;
    }

    public C61212e Mn0(Object obj, int i, int i2) {
        if (obj != null && Ex0()) {
            mo86188yI(obj, i, i2, false);
        }
        return this;
    }

    /* renamed from: Mp */
    public C61212e mo86146Mp(Object obj, Map<String, Object> map) {
        C118641a d;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        if (obj != null && map != null && map.size() > 0 && Ex0()) {
            if (!C117534a.m165788k(obj) && !C117534a.m165789l(obj) && !C117534a.m165785h(obj)) {
                Map<Object, C118642b> map2 = C118569b.f354849a;
                if (map.size() > 0) {
                    C118643c b = C118569b.m167247b(obj, true);
                    if (b != null) {
                        for (String next : map.keySet()) {
                            if (!C90599h.m113511d(next) && (obj5 = map.get(next)) != null) {
                                ((ConcurrentHashMap) b.f355025c).put(next, obj5);
                            }
                        }
                    }
                    C118642b a = C118569b.m167246a(obj, true);
                    if (a != null) {
                        for (String next2 : map.keySet()) {
                            if (!C90599h.m113511d(next2) && (obj4 = map.get(next2)) != null) {
                                ((ConcurrentHashMap) a.f355009d).put(next2, obj4);
                            }
                        }
                    }
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165789l(obj)) {
                C118643c g = C118568a.m167240g(obj, true);
                if (g != null && map.size() > 0) {
                    for (String next3 : map.keySet()) {
                        if (!C90599h.m113511d(next3) && (obj3 = map.get(next3)) != null) {
                            ((ConcurrentHashMap) g.f355025c).put(next3, obj3);
                        }
                    }
                }
            } else if (C117534a.m165788k(obj)) {
                C118642b f = C118568a.m167239f(obj, true);
                if (f != null && map.size() > 0) {
                    for (String next4 : map.keySet()) {
                        if (!C90599h.m113511d(next4) && (obj2 = map.get(next4)) != null) {
                            ((ConcurrentHashMap) f.f355009d).put(next4, obj2);
                        }
                    }
                }
            } else if (C117534a.m165785h(obj)) {
                C118724b bVar = C118568a.f354847a;
                if (map.size() > 0 && (d = C118568a.m167237d(obj, true)) != null) {
                    ((ConcurrentHashMap) d.f355000a).putAll(map);
                }
            }
        }
        return this;
    }

    public C61212e Nl0(Object obj, String str) {
        C118641a d;
        if (obj != null && !C90599h.m113511d(str) && Ex0()) {
            if (!C117534a.m165788k(obj) && !C117534a.m165789l(obj) && !C117534a.m165785h(obj)) {
                Map<Object, C118642b> map = C118569b.f354849a;
                if (!C90599h.m113511d(str)) {
                    C118643c b = C118569b.m167247b(obj, false);
                    if (b != null) {
                        ((ConcurrentHashMap) b.f355025c).remove(str);
                    }
                    C118642b a = C118569b.m167246a(obj, false);
                    if (a != null) {
                        ((ConcurrentHashMap) a.f355009d).remove(str);
                    }
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165789l(obj)) {
                C118643c g = C118568a.m167240g(obj, false);
                if (g != null && !C90599h.m113511d(str)) {
                    ((ConcurrentHashMap) g.f355025c).remove(str);
                }
            } else if (C117534a.m165788k(obj)) {
                C118642b f = C118568a.m167239f(obj, false);
                if (f != null && !C90599h.m113511d(str)) {
                    ((ConcurrentHashMap) f.f355009d).remove(str);
                }
            } else if (C117534a.m165785h(obj)) {
                C118724b bVar = C118568a.f354847a;
                if (!C90599h.m113511d(str) && (d = C118568a.m167237d(obj, false)) != null) {
                    ((ConcurrentHashMap) d.f355000a).remove(str);
                }
            }
        }
        return this;
    }

    /* renamed from: No */
    public C61212e mo86148No(Object obj, int i, int i2) {
        return Mn0(obj, i, i2);
    }

    /* renamed from: PM */
    public C61212e mo86149PM(Object obj, Map<String, Object> map) {
        mo86146Mp(obj, map);
        return this;
    }

    /* renamed from: RW */
    public void mo86150RW(Fragment fragment, boolean z) {
        if (fragment != null && Ex0()) {
            C116800a.f350124d.mo180780k(fragment, z);
        }
    }

    public C61212e U60(Object obj, String str, Object obj2) {
        if (obj != null && !C90599h.m113511d(str) && obj2 != null && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (!C117534a.m165788k(obj)) {
                Log.m105920e("Amoeba.DataReportService", "[setNextSessionParam] target is not a page!!!");
                return this;
            }
            C118264c cVar = this.f351384j;
            C112756b bVar = new C112756b(obj);
            cVar.getClass();
            if (!C90599h.m113511d(str)) {
                Map map = null;
                Iterator it = ((ConcurrentHashMap) cVar.f353472p).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C112756b bVar2 = (C112756b) it.next();
                    if (bVar.mo164512a(bVar2)) {
                        map = (Map) ((ConcurrentHashMap) cVar.f353472p).get(bVar2);
                        break;
                    }
                }
                if (map == null) {
                    map = new HashMap();
                    ((ConcurrentHashMap) cVar.f353472p).put(bVar, map);
                }
                map.put(str, obj2);
            }
        }
        return this;
    }

    /* renamed from: UM */
    public C61212e mo86152UM(Object obj, String str, Object obj2) {
        if (obj != null && !C90599h.m113511d(str) && obj2 != null && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (!C117534a.m165788k(obj)) {
                Log.m105920e("Amoeba.DataReportService", "[setNextBizParam] target is not a page!!!");
                return this;
            }
            C118264c cVar = this.f351384j;
            C112756b bVar = new C112756b(obj);
            cVar.getClass();
            if (!C90599h.m113511d(str)) {
                Map map = null;
                Iterator it = ((ConcurrentHashMap) cVar.f353471o).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C112756b bVar2 = (C112756b) it.next();
                    if (bVar.mo164512a(bVar2)) {
                        map = (Map) ((ConcurrentHashMap) cVar.f353471o).get(bVar2);
                        break;
                    }
                }
                if (map == null) {
                    map = new HashMap();
                    ((ConcurrentHashMap) cVar.f353471o).put(bVar, map);
                }
                map.put(str, obj2);
            }
        }
        return this;
    }

    /* renamed from: W7 */
    public void mo86153W7(String str, Object obj, Map<String, Object> map, int i) {
        if (Ex0()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i));
            if (Ex0()) {
                mo86167i6(str, obj, map, arrayList, false, true);
            }
        }
    }

    /* renamed from: XC */
    public C61212e mo86154XC(Object obj) {
        if (obj != null && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165788k(obj)) {
                C118264c cVar = this.f351384j;
                C112756b bVar = new C112756b(obj);
                Iterator it = ((ConcurrentHashMap) cVar.f353472p).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C112756b bVar2 = (C112756b) it.next();
                    if (bVar.mo164512a(bVar2)) {
                        Map map = (Map) ((ConcurrentHashMap) cVar.f353472p).get(bVar2);
                        if (map != null && map.size() > 0) {
                            map.clear();
                        }
                    }
                }
            } else {
                Log.m105920e("Amoeba.DataReportService", "[resetNextSessionParams] target is not a page!!!");
                return this;
            }
        }
        return this;
    }

    /* renamed from: XH */
    public C61212e mo86155XH(Object obj, String str, String str2, Object obj2) {
        Map<String, Map<String, Object>> map;
        Map<String, Map<String, Object>> map2;
        Map<String, Map<String, Object>> map3;
        if (obj == null || C90599h.m113511d(str) || C90599h.m113511d(str2) || obj2 == null || !Ex0()) {
            return this;
        }
        Object zx02 = zx0(obj);
        if (zx02 != null) {
            obj = zx02;
        }
        if (C117534a.m165789l(obj)) {
            C118643c g = C118568a.m167240g(obj, true);
            if (g == null || (map3 = g.f355026d) == null) {
                return this;
            }
            Map map4 = (Map) ((ConcurrentHashMap) map3).get(str);
            if (map4 == null) {
                map4 = new ConcurrentHashMap();
                ((ConcurrentHashMap) g.f355026d).put(str, map4);
            }
            map4.put(str2, obj2);
        } else if (C117534a.m165788k(obj)) {
            C118642b f = C118568a.m167239f(obj, true);
            if (f == null || (map2 = f.f355012g) == null) {
                return this;
            }
            Map map5 = (Map) ((ConcurrentHashMap) map2).get(str);
            if (map5 == null) {
                map5 = new ConcurrentHashMap();
                ((ConcurrentHashMap) f.f355012g).put(str, map5);
            }
            map5.put(str2, obj2);
        } else if (C117534a.m165785h(obj)) {
            C118641a d = C118568a.m167237d(obj, true);
            if (d == null || (map = d.f355001b) == null) {
                return this;
            }
            Map map6 = (Map) ((ConcurrentHashMap) map).get(str);
            if (map6 == null) {
                map6 = new ConcurrentHashMap();
                ((ConcurrentHashMap) d.f355001b).put(str, map6);
            }
            map6.put(str2, obj2);
        } else if (!C117534a.m165786i()) {
            Log.m105920e("Amoeba.DataReportService", "[setEventParam] param target is not a right type, please cheak!!!");
        } else {
            throw new RuntimeException("[setEventParam] param target is " + obj + ", type of target is error, please cheak !!!");
        }
        return this;
    }

    public C61212e Yt0(Object obj, Map<String, Object> map) {
        if (obj != null && map != null && map.size() > 0 && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (!C117534a.m165788k(obj)) {
                Log.m105920e("Amoeba.DataReportService", "[setSessionParams] target is not a page!!!");
                return this;
            }
            this.f351384j.mo183049e(new C112756b(obj), map);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075 A[LOOP:1: B:17:0x0075->B:20:0x0089, LOOP_START] */
    /* renamed from: Z5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86157Z5(long r10, java.lang.String r12, java.util.Map<java.lang.String, java.lang.Object> r13, java.util.List<java.lang.Integer> r14, boolean r15) {
        /*
            r9 = this;
            boolean r0 = u24.C90599h.m113511d(r12)
            if (r0 != 0) goto L_0x0090
            if (r13 == 0) goto L_0x0090
            if (r14 == 0) goto L_0x0090
            int r0 = r14.size()
            if (r0 <= 0) goto L_0x0090
            boolean r0 = r9.Ex0()
            if (r0 != 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.lang.String r0 = "Amoeba.DataReportService"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[routeEvent] eventId : "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = ", params : "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = ", routeRules : "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = ", isRtReport : "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.Iterator r14 = r14.iterator()
        L_0x004a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r14.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            if (r1 > 0) goto L_0x005d
            goto L_0x004a
        L_0x005d:
            p31.b r1 = new p31.b
            r1.<init>()
            int r0 = r0.intValue()
            r1.f352463a = r0
            r1.f352464b = r15
            java.util.List<n31.a> r0 = r9.f351383i
            monitor-enter(r0)
            java.util.List<n31.a> r2 = r9.f351383i     // Catch:{ all -> 0x008d }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x008d }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x008d }
        L_0x0075:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x008d }
            n31.a r2 = (n31.C117600a) r2     // Catch:{ all -> 0x008d }
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r1
            boolean r2 = r2.mo182170a(r3, r5, r6, r7)     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0075
        L_0x008b:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            goto L_0x004a
        L_0x008d:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r10
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k31.C117373a.mo86157Z5(long, java.lang.String, java.util.Map, java.util.List, boolean):void");
    }

    public void Z50(String str, C117602d dVar) {
        if (!C90599h.m113511d(str) && dVar != null && Ex0()) {
            Log.m105924i("Amoeba.DataReportService", "[obtainCurPageInfo]");
            C117536f.m165800b(new a$$b(this, str, dVar));
        }
    }

    /* renamed from: cA */
    public C61212e mo86159cA(Object obj, String str, String str2) {
        Map<String, Map<String, Object>> map;
        Map map2;
        Map<String, Map<String, Object>> map3;
        Map map4;
        Map<String, Map<String, Object>> map5;
        Map map6;
        if (obj == null || C90599h.m113511d(str) || C90599h.m113511d(str2) || !Ex0()) {
            return this;
        }
        Object zx02 = zx0(obj);
        if (zx02 != null) {
            obj = zx02;
        }
        if (C117534a.m165789l(obj)) {
            C118643c g = C118568a.m167240g(obj, false);
            if (!(g == null || (map5 = g.f355026d) == null || (map6 = (Map) ((ConcurrentHashMap) map5).get(str)) == null)) {
                map6.remove(str2);
            }
        } else if (C117534a.m165788k(obj)) {
            C118642b f = C118568a.m167239f(obj, false);
            if (!(f == null || (map3 = f.f355012g) == null || (map4 = (Map) ((ConcurrentHashMap) map3).get(str)) == null)) {
                map4.remove(str2);
            }
        } else if (C117534a.m165785h(obj)) {
            C118641a d = C118568a.m167237d(obj, false);
            if (!(d == null || (map = d.f355001b) == null || (map2 = (Map) ((ConcurrentHashMap) map).get(str)) == null)) {
                map2.remove(str2);
            }
        } else if (!C117534a.m165786i()) {
            Log.m105920e("Amoeba.DataReportService", "[removeEventParam] param target is not a right type, please cheak!!!");
        } else {
            throw new RuntimeException("[removeEventParam] param target is " + obj + ", type of target is error, please cheak !!!");
        }
        return this;
    }

    /* renamed from: cK */
    public void mo86160cK(Runnable runnable) {
        if (runnable != null && Ex0()) {
            C117536f.m165800b(runnable);
        }
    }

    /* renamed from: cQ */
    public void mo86161cQ(Context context, Intent intent) {
        if (context != null && intent != null) {
            intent.setClass(context, SampleUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/datareport/DataReportService", "showReportSDKSampleUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/datareport/DataReportService", "showReportSDKSampleUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: dW */
    public C61212e mo86162dW(Object obj, long j) {
        int i;
        C118643c b;
        if (obj != null && j > 0 && Ex0()) {
            if (!C117534a.m165789l(obj)) {
                Map<Object, C118642b> map = C118569b.f354849a;
                if (i > 0 && (b = C118569b.m167247b(obj, true)) != null) {
                    ((ConcurrentHashMap) b.f355029g).put("view_exp_min_time", Long.valueOf(j));
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165789l(obj)) {
                C118825b.m167530b(C118568a.m167240g(obj, true), "view_exp_min_time", Long.valueOf(j));
            }
        }
        return this;
    }

    /* renamed from: dt */
    public C61212e mo86163dt(Object obj) {
        mo86177qW(obj);
        return this;
    }

    public C61212e ea0(Object obj, String str, Object obj2) {
        if (obj != null && !C90599h.m113511d(str) && obj2 != null && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (!C117534a.m165788k(obj)) {
                Log.m105920e("Amoeba.DataReportService", "[setSessionParam] target is not a page!!!");
                return this;
            }
            C118264c cVar = this.f351384j;
            C112756b bVar = new C112756b(obj);
            cVar.getClass();
            if (!C90599h.m113511d(str)) {
                Map map = null;
                Iterator it = ((ConcurrentHashMap) cVar.f353468l).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C112756b bVar2 = (C112756b) it.next();
                    if (bVar.mo164512a(bVar2)) {
                        map = (Map) ((ConcurrentHashMap) cVar.f353468l).get(bVar2);
                        break;
                    }
                }
                if (map == null) {
                    map = new HashMap();
                    ((ConcurrentHashMap) cVar.f353468l).put(bVar, map);
                }
                map.put(str, obj2);
            }
        }
        return this;
    }

    /* renamed from: fW */
    public C61212e mo86165fW(View view, String str) {
        if (view != null && !C90599h.m113511d(str) && Ex0()) {
            if (!C117534a.m165789l(view)) {
                Log.m105920e("Amoeba.DataReportService", "[setViewUniqueId] target is not a view!!!");
                return this;
            }
            C113144b bVar = C113143a.m154802a().f338555e;
            if (bVar != null && (bVar instanceof C116920a)) {
                C116920a aVar = (C116920a) bVar;
                if (!C90599h.m113511d(str)) {
                    View view2 = null;
                    Iterator<View> it = aVar.f350352f.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        View next = it.next();
                        if (C90599h.m113509b(str, aVar.f350352f.get(next))) {
                            view2 = next;
                            break;
                        }
                    }
                    if (view2 == null || view2 == view) {
                        aVar.f350352f.put(view, str);
                    } else {
                        aVar.f350353g.add(view);
                        aVar.f350354h.add(view2);
                        Long l = aVar.f350351e.get(view2);
                        if (l != null) {
                            aVar.f350353g.mo182402h(view2);
                            aVar.f350351e.put(view, l);
                        }
                    }
                }
            }
            C118643c g = C118568a.m167240g(view, true);
            if (g != null) {
                g.f355024b = str;
            }
        }
        return this;
    }

    /* renamed from: fz */
    public C61212e mo86166fz(Object obj, String str, Map<String, Object> map) {
        Map<String, Map<String, Object>> map2;
        Map<String, Map<String, Object>> map3;
        Map<String, Map<String, Object>> map4;
        if (obj == null || C90599h.m113511d(str) || map == null || map.size() <= 0 || !Ex0()) {
            return this;
        }
        Object zx02 = zx0(obj);
        if (zx02 != null) {
            obj = zx02;
        }
        if (C117534a.m165789l(obj)) {
            C118643c g = C118568a.m167240g(obj, true);
            if (g == null || (map4 = g.f355026d) == null) {
                return this;
            }
            Map map5 = (Map) ((ConcurrentHashMap) map4).get(str);
            if (map5 == null) {
                map5 = new ConcurrentHashMap();
                ((ConcurrentHashMap) g.f355026d).put(str, map5);
            }
            map5.putAll(map);
        } else if (C117534a.m165788k(obj)) {
            C118642b f = C118568a.m167239f(obj, true);
            if (f == null || (map3 = f.f355012g) == null) {
                return this;
            }
            Map map6 = (Map) ((ConcurrentHashMap) map3).get(str);
            if (map6 == null) {
                map6 = new ConcurrentHashMap();
                ((ConcurrentHashMap) f.f355012g).put(str, map6);
            }
            map6.putAll(map);
        } else if (C117534a.m165785h(obj)) {
            C118641a d = C118568a.m167237d(obj, true);
            if (d == null || (map2 = d.f355001b) == null) {
                return this;
            }
            Map map7 = (Map) ((ConcurrentHashMap) map2).get(str);
            if (map7 == null) {
                map7 = new ConcurrentHashMap();
                ((ConcurrentHashMap) d.f355001b).put(str, map7);
            }
            map7.putAll(map);
        } else if (!C117534a.m165786i()) {
            Log.m105920e("Amoeba.DataReportService", "[setEventParams] param target is not a right type, please cheak!!!");
        } else {
            throw new RuntimeException("[setEventParams] param target is " + obj + ", type of target is error, please cheak !!!");
        }
        return this;
    }

    /* renamed from: i6 */
    public void mo86167i6(String str, Object obj, Map<String, Object> map, List<Integer> list, boolean z, boolean z2) {
        Map<String, Object> map2 = map;
        if (Ex0()) {
            ArrayList arrayList = new ArrayList();
            for (Integer intValue : list) {
                C117924b bVar = new C117924b();
                bVar.f352463a = intValue.intValue();
                bVar.f352464b = z;
                arrayList.add(bVar);
            }
            C117921a.C117923b a = C117921a.m166309a();
            a.f352458a = obj;
            a.f352459b = str;
            a.mo182705b(map2 != null ? new HashMap(map) : null);
            a.mo182706c(arrayList);
            a.f352462e = z2;
            C117921a a2 = a.mo182704a();
            if (!C90599h.m113511d(a2.f352454b) && Ex0()) {
                Log.m105924i("Amoeba.DataReportService", "[reportCustomEvent] eventData : " + a2);
                Object obj2 = a2.f352453a;
                Object zx02 = zx0(obj2);
                if (zx02 != null) {
                    obj2 = zx02;
                }
                long currentTimeMillis = System.currentTimeMillis();
                List<C118218a> b = C118219b.m166775b(a2.f352454b, obj2);
                C112756b c = C117534a.m165780c(obj2);
                boolean k = C117534a.m165788k(obj2);
                List<C117924b> list2 = a2.f352456d;
                C117536f.m165800b(new a$$a(this, a2, c, b, k, currentTimeMillis, list2 == null ? Cx0(obj2, a2.f352454b) : list2));
            }
        }
    }

    /* renamed from: ix */
    public void mo86168ix(String str, Map<String, Object> map, int i) {
        if (Ex0()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i));
            if (Ex0() && Ex0()) {
                mo86167i6(str, (Object) null, map, arrayList, false, true);
            }
        }
    }

    public int ka0(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (!C117534a.m165788k(obj)) {
            C118642b a = C118569b.m167246a(obj, false);
            if (a == null) {
                return 0;
            }
            return a.f355006a;
        }
        C118642b f = C118568a.m167239f(obj, false);
        if (f == null) {
            return 0;
        }
        return f.f355006a;
    }

    public C61212e kq0(Object obj) {
        if (obj != null && Ex0()) {
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165788k(obj)) {
                C118264c cVar = this.f351384j;
                C112756b bVar = new C112756b(obj);
                Iterator it = ((ConcurrentHashMap) cVar.f353471o).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C112756b bVar2 = (C112756b) it.next();
                    if (bVar.mo164512a(bVar2)) {
                        Map map = (Map) ((ConcurrentHashMap) cVar.f353471o).get(bVar2);
                        if (map != null && map.size() > 0) {
                            map.clear();
                        }
                    }
                }
            } else {
                Log.m105920e("Amoeba.DataReportService", "[resetNextBizParams] target is not a page!!!");
                return this;
            }
        }
        return this;
    }

    public C61212e o30(Object obj, String str) {
        C118643c g;
        C118643c b;
        if (obj != null && !C90599h.m113511d(str) && Ex0()) {
            if (!C117534a.m165789l(obj)) {
                Map<Object, C118642b> map = C118569b.f354849a;
                if (!C90599h.m113511d(str) && (b = C118569b.m167247b(obj, true)) != null) {
                    b.f355023a = str;
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165789l(obj) && (g = C118568a.m167240g(obj, true)) != null) {
                g.f355023a = str;
            }
        }
        return this;
    }

    /* renamed from: oE */
    public C61212e mo86172oE(Object obj, boolean z) {
        if (obj != null && Ex0()) {
            if (!C117534a.m165788k(obj)) {
                Log.m105920e("Amoeba.DataReportService", "[setPageIsFullSubPage] target is not a page!!!");
                return this;
            }
            Boolean valueOf = Boolean.valueOf(z);
            C118642b f = C118568a.m167239f(obj, true);
            if (f != null && !C90599h.m113511d("page_is_full_subpage")) {
                ((ConcurrentHashMap) f.f355015j).put("page_is_full_subpage", valueOf);
            }
        }
        return this;
    }

    /* renamed from: oM */
    public C61212e mo86173oM(Object obj) {
        C118641a d;
        if (obj != null && Ex0()) {
            if (!C117534a.m165788k(obj) && !C117534a.m165789l(obj) && !C117534a.m165785h(obj)) {
                C118643c b = C118569b.m167247b(obj, false);
                if (b != null) {
                    ((ConcurrentHashMap) b.f355025c).clear();
                }
                C118642b a = C118569b.m167246a(obj, false);
                if (a != null) {
                    ((ConcurrentHashMap) a.f355009d).clear();
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165789l(obj)) {
                C118643c g = C118568a.m167240g(obj, false);
                if (g != null) {
                    ((ConcurrentHashMap) g.f355025c).clear();
                }
            } else if (C117534a.m165788k(obj)) {
                C118642b f = C118568a.m167239f(obj, false);
                if (f != null) {
                    ((ConcurrentHashMap) f.f355009d).clear();
                }
            } else if (C117534a.m165785h(obj) && (d = C118568a.m167237d(obj, false)) != null) {
                ((ConcurrentHashMap) d.f355000a).clear();
            }
        }
        return this;
    }

    public void oh0(long j, String str, Map<String, Object> map, int i, boolean z) {
        if (!C90599h.m113511d(str) && map != null && i > 0 && Ex0()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i));
            mo86157Z5(j, str, map, arrayList, z);
        }
    }

    public void onCreate(Context context) {
        if (Ex0()) {
            C113143a a = C113143a.m154802a();
            C117141b bVar = new C117141b();
            C113144b bVar2 = a.f338554d;
            if (bVar2 != null) {
                ((PageEventMonitor) bVar2).f345795g = bVar;
            }
            C113144b bVar3 = a.f338555e;
            if (bVar3 != null) {
                ((C116920a) bVar3).f350350d = bVar;
            }
            C113144b bVar4 = a.f338556f;
            if (bVar4 != null) {
                ((C116692a) bVar4).f349957d = bVar;
            }
            C113143a a2 = C113143a.m154802a();
            Class cls = C20928j.class;
            C113144b bVar5 = a2.f338554d;
            if (bVar5 != null) {
                PageEventMonitor pageEventMonitor = (PageEventMonitor) bVar5;
                Log.m105924i("Amoeba.PageEventMonitor", "[startMonitor]");
                C20928j jVar = (C20928j) C86709a0.m107533q(cls);
                if (jVar != null) {
                    jVar.mo31999WI(pageEventMonitor);
                }
                C116800a aVar = C116800a.f350124d;
                ArrayList<Application.ActivityLifecycleCallbacks> arrayList = C113067b.f338453e;
                synchronized (arrayList) {
                    arrayList.add(aVar);
                }
                C116800a.f350133p = true;
                C21043a.m23197h().f59537a = C116800a.f350135r;
                C21043a.m23197h().mo32758l(C116800a.f350130j, C116800a.f350136s);
                if (!C116800a.f350125e.contains(pageEventMonitor)) {
                    C116800a.f350125e.add(pageEventMonitor);
                }
                C116570a aVar2 = C116570a.f349583d;
                Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
                if (applicationContext != null && (applicationContext instanceof Application)) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(aVar2);
                }
                C116570a.f349588i.alive();
                C20928j jVar2 = (C20928j) C86709a0.m107533q(cls);
                if (jVar2 != null) {
                    jVar2.mo31999WI(aVar2);
                }
                C116570a.f349584e = C117543a.Cx0().mo58779Qe(C32735h.C32738b.clicfg_data_report_app_event_monitor_type, 2);
                if (C116570a.f349586g.size() == 0 && C116570a.f349584e == 0 && xx0().Ex0()) {
                    aVar2.mo180553G(System.currentTimeMillis());
                }
                ((ArrayList) C116570a.f349587h).add(pageEventMonitor);
                Context applicationContext2 = MMApplicationContext.getContext().getApplicationContext();
                if (applicationContext2 != null && (applicationContext2 instanceof Application)) {
                    ((Application) applicationContext2).registerActivityLifecycleCallbacks(pageEventMonitor);
                }
                pageEventMonitor.f345801p.alive();
            }
            C113144b bVar6 = a2.f338555e;
            if (bVar6 != null) {
                C116920a aVar3 = (C116920a) bVar6;
                Log.m105924i("Amoeba.ViewEventMonitor", "[startMonitor]");
                C20928j jVar3 = (C20928j) C86709a0.m107533q(cls);
                if (jVar3 != null) {
                    jVar3.mo31999WI(aVar3);
                }
                C117067b wx02 = C117067b.wx0();
                wx02.getClass();
                C21043a.m23197h().mo32756j(C117067b.f350751A, wx02.f350772y);
                C21043a.m23197h().mo32758l(C117067b.f350752B, wx02.f350773z);
                ((ArrayList) C117067b.wx0().f350766s).add(aVar3);
            }
            C113144b bVar7 = a2.f338556f;
            if (bVar7 != null) {
                C116692a aVar4 = (C116692a) bVar7;
                Log.m105924i("MultiEventMonitor", "[startMonitor]");
                List<C116724d4.C116725a> list = C116724d4.f350033a;
                synchronized (list) {
                    ((ArrayList) list).add(aVar4);
                }
            }
            C118260a.C118262b bVar8 = new C118260a.C118262b((C118260a.C118261a) null);
            ((ArrayList) bVar8.f353454a).add(new C117460a());
            bVar8.f353455b = new C118263b();
            bVar8.f353456c = new C118914a();
            C118260a aVar5 = new C118260a(bVar8, (C118260a.C118261a) null);
            this.f351380f = aVar5;
            List<C117600a> list2 = aVar5.f353451a;
            if (list2 != null && ((ArrayList) list2).size() > 0) {
                synchronized (this.f351383i) {
                    ((ArrayList) this.f351383i).addAll(list2);
                }
            }
            Lx0("sdk_version", "3.0.0");
            Lx0("process_id", Integer.valueOf(Process.myPid()));
            Lx0("process_name", C86709a0.m107531m().mo58407a().f124988a);
        }
    }

    /* renamed from: pO */
    public C61212e mo86175pO(Object obj, int i, int i2) {
        return Mn0(obj, i, i2);
    }

    /* renamed from: qF */
    public C61212e mo86176qF(Object obj, String str, Object obj2) {
        Kx0(obj, str, obj2);
        return this;
    }

    /* renamed from: qW */
    public C61212e mo86177qW(Object obj) {
        C118641a d;
        if (obj != null && Ex0()) {
            if (!C117534a.m165788k(obj) && !C117534a.m165789l(obj) && !C117534a.m165785h(obj)) {
                C118643c b = C118569b.m167247b(obj, false);
                if (b != null) {
                    b.mo183368a();
                }
                C118642b a = C118569b.m167246a(obj, false);
                if (a != null) {
                    a.mo183366a();
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165789l(obj)) {
                C118643c g = C118568a.m167240g(obj, false);
                if (g != null) {
                    g.mo183368a();
                }
                if (obj instanceof View) {
                    C117067b wx02 = C117067b.wx0();
                    wx02.getClass();
                    C117536f.m165801c(new b$$c(wx02, (View) obj));
                }
            } else if (C117534a.m165788k(obj)) {
                C118642b f = C118568a.m167239f(obj, false);
                if (f != null) {
                    f.mo183366a();
                }
            } else if (C117534a.m165785h(obj) && (d = C118568a.m167237d(obj, false)) != null) {
                ((ConcurrentHashMap) d.f355000a).clear();
                ((ConcurrentHashMap) d.f355001b).clear();
                ((CopyOnWriteArrayList) d.f355002c).clear();
                ((ConcurrentHashMap) d.f355003d).clear();
                ((ConcurrentHashMap) d.f355004e).clear();
                ((ConcurrentHashMap) d.f355005f).clear();
            }
        }
        return this;
    }

    /* renamed from: qr */
    public C61212e mo86178qr(Object obj, C11345b bVar) {
        C118642b a;
        if (!(obj == null || bVar == null || !Ex0())) {
            if (!C117534a.m165788k(obj)) {
                int i = bVar.f33438d;
                Map<Object, C118642b> map = C118569b.f354849a;
                if (i > 0 && (a = C118569b.m167246a(obj, true)) != null) {
                    a.f355006a = i;
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165788k(obj)) {
                int i2 = bVar.f33438d;
                C118642b f = C118568a.m167239f(obj, true);
                if (f != null && i2 > 0) {
                    f.f355006a = i2;
                }
            }
        }
        return this;
    }

    /* renamed from: qs */
    public C61212e mo86179qs(Object obj, C76986a aVar) {
        C118642b a;
        if (!(obj == null || aVar == null || !Ex0())) {
            if (!C117534a.m165788k(obj)) {
                int i = aVar.f224975d;
                Map<Object, C118642b> map = C118569b.f354849a;
                if (i > 0 && (a = C118569b.m167246a(obj, true)) != null) {
                    a.f355008c = i;
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165788k(obj)) {
                int i2 = aVar.f224975d;
                C118642b f = C118568a.m167239f(obj, true);
                if (f != null && i2 > 0) {
                    f.f355008c = i2;
                }
            }
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l31.C61212e r80(java.lang.Object r8, int r9, n31.C61612b r10) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0264
            if (r10 == 0) goto L_0x0264
            boolean r0 = r7.Ex0()
            if (r0 != 0) goto L_0x000c
            goto L_0x0264
        L_0x000c:
            java.lang.Object r0 = r7.zx0(r8)
            if (r0 == 0) goto L_0x0013
            r8 = r0
        L_0x0013:
            boolean r0 = m41.C117534a.m165789l(r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00c9
            v31.c r0 = u31.C118568a.m167240g(r8, r2)
            if (r0 == 0) goto L_0x0087
            java.util.List r9 = m41.C117535e.m165793d(r9)
            if (r9 == 0) goto L_0x0087
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r3 = r9.size()
            if (r3 <= 0) goto L_0x0087
            java.util.Iterator r9 = r9.iterator()
        L_0x0033:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r9.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r4 = r0.f355030h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0063
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r5 = r0.f355030h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            r5.put(r3, r4)
        L_0x0063:
            java.util.Iterator r3 = r4.iterator()
        L_0x0067:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r3.next()
            p31.b r5 = (p31.C117924b) r5
            n31.b r5 = r5.f352465c
            if (r5 != r10) goto L_0x0067
            r3 = 1
            goto L_0x007a
        L_0x0079:
            r3 = 0
        L_0x007a:
            if (r3 != 0) goto L_0x0033
            p31.b r3 = new p31.b
            r3.<init>()
            r3.f352465c = r10
            r4.add(r3)
            goto L_0x0033
        L_0x0087:
            int r9 = u31.C118568a.m167242i(r8)
            java.util.List r9 = m41.C117535e.m165792c(r9)
            if (r9 == 0) goto L_0x00b2
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x00b2
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto L_0x0247
            h41.b r9 = h41.C117067b.wx0()
            android.view.View r8 = (android.view.View) r8
            r9.getClass()
            h41.b$$i r10 = new h41.b$$i
            r10.<init>(r9, r8)
            r8 = 251(0xfb, double:1.24E-321)
            m41.C117536f.m165802d(r10, r8)
            goto L_0x0247
        L_0x00b2:
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto L_0x0247
            h41.b r9 = h41.C117067b.wx0()
            android.view.View r8 = (android.view.View) r8
            r9.getClass()
            h41.b$$c r10 = new h41.b$$c
            r10.<init>(r9, r8)
            m41.C117536f.m165801c(r10)
            goto L_0x0247
        L_0x00c9:
            boolean r0 = m41.C117534a.m165788k(r8)
            java.lang.String r3 = "Amoeba.DataReportService"
            if (r0 == 0) goto L_0x01cb
            v31.b r0 = u31.C118568a.m167239f(r8, r2)
            if (r0 == 0) goto L_0x013d
            java.util.List r9 = m41.C117535e.m165791b(r9)
            if (r9 == 0) goto L_0x013d
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r4 = r9.size()
            if (r4 <= 0) goto L_0x013d
            java.util.Iterator r9 = r9.iterator()
        L_0x00e9:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x013d
            java.lang.Object r4 = r9.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r5 = r0.f355016k
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r5 = r5.get(r6)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0119
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r6 = r0.f355016k
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            r6.put(r4, r5)
        L_0x0119:
            java.util.Iterator r4 = r5.iterator()
        L_0x011d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x012f
            java.lang.Object r6 = r4.next()
            p31.b r6 = (p31.C117924b) r6
            n31.b r6 = r6.f352465c
            if (r6 != r10) goto L_0x011d
            r4 = 1
            goto L_0x0130
        L_0x012f:
            r4 = 0
        L_0x0130:
            if (r4 != 0) goto L_0x00e9
            p31.b r4 = new p31.b
            r4.<init>()
            r4.f352465c = r10
            r5.add(r4)
            goto L_0x00e9
        L_0x013d:
            int r9 = wx0()
            if (r9 != 0) goto L_0x0247
            r9 = 0
            boolean r0 = r8 instanceof com.tencent.p014mm.hellhoundlib.activities.HellActivity     // Catch:{ Exception -> 0x01ab }
            r1 = 2131310725(0x7f093885, float:1.823977E38)
            if (r0 == 0) goto L_0x016b
            r0 = r8
            com.tencent.mm.hellhoundlib.activities.HellActivity r0 = (com.tencent.p014mm.hellhoundlib.activities.HellActivity) r0     // Catch:{ Exception -> 0x01ab }
            java.lang.Object r0 = r0.getHellTag(r1)     // Catch:{ Exception -> 0x01ab }
            if (r0 == 0) goto L_0x015b
            boolean r2 = r0 instanceof java.util.List     // Catch:{ Exception -> 0x01ab }
            if (r2 == 0) goto L_0x015b
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x01ab }
            r9 = r0
        L_0x015b:
            if (r9 != 0) goto L_0x01c4
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x01ab }
            r0.<init>()     // Catch:{ Exception -> 0x01ab }
            com.tencent.mm.hellhoundlib.activities.HellActivity r8 = (com.tencent.p014mm.hellhoundlib.activities.HellActivity) r8     // Catch:{ Exception -> 0x0169 }
            r8.setHellTag(r1, r0)     // Catch:{ Exception -> 0x0169 }
        L_0x0167:
            r9 = r0
            goto L_0x01c4
        L_0x0169:
            r8 = move-exception
            goto L_0x018c
        L_0x016b:
            boolean r0 = r8 instanceof com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment     // Catch:{ Exception -> 0x01ab }
            if (r0 == 0) goto L_0x018e
            r0 = r8
            com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment r0 = (com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment) r0     // Catch:{ Exception -> 0x01ab }
            java.lang.Object r0 = r0.getHellTag(r1)     // Catch:{ Exception -> 0x01ab }
            if (r0 == 0) goto L_0x017f
            boolean r2 = r0 instanceof java.util.List     // Catch:{ Exception -> 0x01ab }
            if (r2 == 0) goto L_0x017f
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x01ab }
            r9 = r0
        L_0x017f:
            if (r9 != 0) goto L_0x01c4
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x01ab }
            r0.<init>()     // Catch:{ Exception -> 0x01ab }
            com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment r8 = (com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment) r8     // Catch:{ Exception -> 0x0169 }
            r8.setHellTag(r1, r0)     // Catch:{ Exception -> 0x0169 }
            goto L_0x0167
        L_0x018c:
            r9 = r0
            goto L_0x01ac
        L_0x018e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab }
            r0.<init>()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r1 = "[getPageEventCallback] can not get dynamicParamsList : "
            r0.append(r1)     // Catch:{ Exception -> 0x01ab }
            java.lang.Class r8 = r8.getClass()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r8 = r8.getSimpleName()     // Catch:{ Exception -> 0x01ab }
            r0.append(r8)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r8 = r0.toString()     // Catch:{ Exception -> 0x01ab }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r8)     // Catch:{ Exception -> 0x01ab }
            goto L_0x01c4
        L_0x01ab:
            r8 = move-exception
        L_0x01ac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[getPageEventCallback] throw Exception : "
            r0.append(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r8)
        L_0x01c4:
            if (r9 == 0) goto L_0x0247
            r9.add(r10)
            goto L_0x0247
        L_0x01cb:
            boolean r0 = m41.C117534a.m165785h(r8)
            if (r0 == 0) goto L_0x023c
            v31.a r8 = u31.C118568a.m167237d(r8, r2)
            if (r8 != 0) goto L_0x01d8
            goto L_0x0247
        L_0x01d8:
            java.util.List r9 = m41.C117535e.m165790a(r9)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0247
            java.util.Iterator r9 = r9.iterator()
        L_0x01e8:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0247
            java.lang.Object r0 = r9.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r3 = r8.f355003d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0218
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Map<java.lang.Integer, java.util.List<p31.b>> r4 = r8.f355003d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            r4.put(r0, r3)
        L_0x0218:
            java.util.Iterator r0 = r3.iterator()
        L_0x021c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x022e
            java.lang.Object r4 = r0.next()
            p31.b r4 = (p31.C117924b) r4
            n31.b r4 = r4.f352465c
            if (r4 != r10) goto L_0x021c
            r0 = 1
            goto L_0x022f
        L_0x022e:
            r0 = 0
        L_0x022f:
            if (r0 != 0) goto L_0x01e8
            p31.b r0 = new p31.b
            r0.<init>()
            r0.f352465c = r10
            r3.add(r0)
            goto L_0x01e8
        L_0x023c:
            boolean r9 = m41.C117534a.m165786i()
            if (r9 != 0) goto L_0x0248
            java.lang.String r8 = "[setEventCallback] param target is not a right type, please cheak!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r8)
        L_0x0247:
            return r7
        L_0x0248:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "[setEventCallback] param target is "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = ", type of target is error, please cheak !!!"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x0264:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k31.C117373a.r80(java.lang.Object, int, n31.b):l31.e");
    }

    public Map<String, Object> rf0(Object obj) {
        if (obj == null) {
            return null;
        }
        Object zx02 = zx0(obj);
        if (zx02 != null) {
            obj = zx02;
        }
        if (C117534a.m165788k(obj)) {
            return this.f351384j.mo183047c(new C112756b(obj));
        }
        Log.m105920e("Amoeba.DataReportService", "[getNextSessionParams] target is not a page!!!");
        return null;
    }

    public C61212e se0(Object obj) {
        mo86177qW(obj);
        return this;
    }

    public C61212e u70(Object obj, Map<String, Object> map) {
        mo86146Mp(obj, map);
        return this;
    }

    /* renamed from: uZ */
    public void mo86184uZ(Object obj, String str, Map<String, Object> map, int i, int i2) {
        o30(obj, str);
        mo86146Mp(obj, map);
        Mn0(obj, i, i2);
    }

    /* renamed from: us */
    public Map<String, Object> mo86185us(Object obj) {
        Map<String, Object> map;
        if (obj == null) {
            return null;
        }
        if (C117534a.m165789l(obj)) {
            C118643c g = C118568a.m167240g(obj, false);
            if (g == null || (map = g.f355025c) == null) {
                return null;
            }
            return map;
        } else if (C117534a.m165788k(obj)) {
            C118642b f = C118568a.m167239f(obj, false);
            if (f == null) {
                return null;
            }
            return f.f355009d;
        } else if (C117534a.m165785h(obj)) {
            C118641a d = C118568a.m167237d(obj, false);
            if (d == null) {
                return null;
            }
            return d.f355000a;
        } else {
            C118643c b = C118569b.m167247b(obj, false);
            if (b != null) {
                return b.f355025c;
            }
            C118642b a = C118569b.m167246a(obj, false);
            if (a != null) {
                return a.f355009d;
            }
            return null;
        }
    }

    /* renamed from: vx */
    public C61212e mo86186vx(Object obj, boolean z) {
        if (obj != null && Ex0()) {
            if (!C117534a.m165788k(obj)) {
                Log.m105920e("Amoeba.DataReportService", "[setPageIsFilterFlag] target is not a page!!!");
                return this;
            }
            Boolean valueOf = Boolean.valueOf(z);
            C118642b f = C118568a.m167239f(obj, true);
            if (f != null && !C90599h.m113511d("page_is_filter")) {
                ((ConcurrentHashMap) f.f355015j).put("page_is_filter", valueOf);
            }
        }
        return this;
    }

    public void vx0(String str, Map<String, Object> map) {
        String str2;
        if (!C90599h.m113511d(str) && map != null) {
            C118264c cVar = this.f351384j;
            cVar.getClass();
            HashMap hashMap = new HashMap();
            Iterator it = ((ConcurrentHashMap) cVar.f353470n).keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C112756b bVar = (C112756b) it.next();
                if (bVar.mo164512a(cVar.f353469m)) {
                    Map map2 = (Map) ((ConcurrentHashMap) cVar.f353470n).get(bVar);
                    if (map2 != null && map2.size() > 0) {
                        hashMap.putAll(map2);
                    }
                }
            }
            if (hashMap.size() > 0) {
                map.putAll(hashMap);
            }
            C118264c cVar2 = this.f351384j;
            cVar2.getClass();
            HashMap hashMap2 = new HashMap();
            for (C112756b bVar2 : ((ConcurrentHashMap) cVar2.f353466j).keySet()) {
                Iterator it4 = ((ConcurrentHashMap) cVar2.f353468l).keySet().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    C112756b bVar3 = (C112756b) it4.next();
                    if (bVar3.mo164512a(bVar2)) {
                        Map map3 = (Map) ((ConcurrentHashMap) cVar2.f353468l).get(bVar3);
                        if (map3 != null && map3.size() > 0) {
                            hashMap2.putAll(map3);
                        }
                    }
                }
            }
            if (hashMap2.size() > 0) {
                map.putAll(hashMap2);
            }
            C118264c cVar3 = this.f351384j;
            cVar3.getClass();
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(cVar3.f353467k);
                ArrayList arrayList2 = new ArrayList();
                str2 = "";
                if (arrayList.size() > 0) {
                    arrayList2.add((String) arrayList.get(0));
                } else {
                    arrayList2.add(str2);
                }
                if (arrayList.size() > 1) {
                    arrayList2.add((String) arrayList.get(1));
                } else {
                    arrayList2.add(str2);
                }
                if (arrayList.size() > 2) {
                    arrayList2.add((String) arrayList.get(arrayList.size() - 3));
                } else {
                    arrayList2.add(str2);
                }
                if (arrayList.size() > 1) {
                    arrayList2.add((String) arrayList.get(arrayList.size() - 2));
                } else {
                    arrayList2.add(str2);
                }
                if (arrayList.size() > 0) {
                    arrayList2.add((String) arrayList.get(arrayList.size() - 1));
                } else {
                    arrayList2.add(str2);
                }
                StringBuilder sb = new StringBuilder();
                if (arrayList2.size() > 0) {
                    for (int i = 0; i < arrayList2.size(); i++) {
                        sb.append((String) arrayList2.get(i));
                        if (i != arrayList2.size() - 1) {
                            sb.append("&");
                        }
                    }
                }
                if (!C90599h.m113509b(sb.toString(), "&&&&")) {
                    str2 = sb.toString();
                }
            } catch (Exception unused) {
                str2 = null;
            }
            if (!C90599h.m113511d(str2)) {
                map.put("session_id", str2);
            }
            String str3 = this.f351384j.f353464h;
            if (!C90599h.m113511d(str3)) {
                map.put("last_click_view_id", str3);
            }
            String str4 = this.f351384j.f353465i;
            if (!C90599h.m113511d(str4)) {
                map.put("last_report_event_id", str4);
            }
            String str5 = this.f351384j.f353462f;
            if (!C90599h.m113511d(str5)) {
                map.put("biz_id", str5);
            }
            String str6 = this.f351384j.f353463g;
            if (!C90599h.m113511d(str6)) {
                map.put("last_biz_id", str6);
            }
        }
    }

    public C61212e y50(Object obj, String str, Object obj2) {
        Kx0(obj, str, obj2);
        return this;
    }

    /* renamed from: yI */
    public C61212e mo86188yI(Object obj, int i, int i2, boolean z) {
        C118641a d;
        boolean z2;
        List<Integer> d2;
        boolean z3;
        List<Integer> b;
        boolean z4;
        List<Integer> d3;
        boolean z5;
        if (obj != null && Ex0()) {
            if (!C117534a.m165788k(obj) && !C117534a.m165789l(obj) && !C117534a.m165785h(obj)) {
                C118643c b2 = C118569b.m167247b(obj, true);
                if (!(b2 == null || (d3 = C117535e.m165793d(i)) == null)) {
                    ArrayList arrayList = (ArrayList) d3;
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            List list = (List) ((ConcurrentHashMap) b2.f355030h).get(Integer.valueOf(intValue));
                            if (list == null) {
                                list = new ArrayList();
                                ((ConcurrentHashMap) b2.f355030h).put(Integer.valueOf(intValue), list);
                            }
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z5 = false;
                                    break;
                                }
                                C117924b bVar = (C117924b) it4.next();
                                if (bVar.f352463a == i2 && bVar.f352464b == z) {
                                    z5 = true;
                                    break;
                                }
                            }
                            if (!z5) {
                                C117924b bVar2 = new C117924b();
                                bVar2.f352463a = i2;
                                bVar2.f352464b = z;
                                list.add(bVar2);
                            }
                        }
                    }
                }
                C118642b a = C118569b.m167246a(obj, true);
                if (!(a == null || (b = C117535e.m165791b(i)) == null)) {
                    ArrayList arrayList2 = (ArrayList) b;
                    if (arrayList2.size() > 0) {
                        Iterator it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            int intValue2 = ((Integer) it5.next()).intValue();
                            List list2 = (List) ((ConcurrentHashMap) a.f355016k).get(Integer.valueOf(intValue2));
                            if (list2 == null) {
                                list2 = new ArrayList();
                                ((ConcurrentHashMap) a.f355016k).put(Integer.valueOf(intValue2), list2);
                            }
                            Iterator it6 = list2.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    z4 = false;
                                    break;
                                }
                                C117924b bVar3 = (C117924b) it6.next();
                                if (bVar3.f352463a == i2 && bVar3.f352464b == z) {
                                    z4 = true;
                                    break;
                                }
                            }
                            if (!z4) {
                                C117924b bVar4 = new C117924b();
                                bVar4.f352463a = i2;
                                bVar4.f352464b = z;
                                list2.add(bVar4);
                            }
                        }
                    }
                }
            }
            Object zx02 = zx0(obj);
            if (zx02 != null) {
                obj = zx02;
            }
            if (C117534a.m165789l(obj)) {
                C118643c g = C118568a.m167240g(obj, true);
                if (!(g == null || (d2 = C117535e.m165793d(i)) == null)) {
                    ArrayList arrayList3 = (ArrayList) d2;
                    if (arrayList3.size() > 0) {
                        Iterator it7 = arrayList3.iterator();
                        while (it7.hasNext()) {
                            int intValue3 = ((Integer) it7.next()).intValue();
                            List list3 = (List) ((ConcurrentHashMap) g.f355030h).get(Integer.valueOf(intValue3));
                            if (list3 == null) {
                                list3 = new ArrayList();
                                ((ConcurrentHashMap) g.f355030h).put(Integer.valueOf(intValue3), list3);
                            }
                            Iterator it8 = list3.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    z3 = false;
                                    break;
                                }
                                C117924b bVar5 = (C117924b) it8.next();
                                if (bVar5.f352463a == i2 && bVar5.f352464b == z) {
                                    z3 = true;
                                    break;
                                }
                            }
                            if (!z3) {
                                C117924b bVar6 = new C117924b();
                                bVar6.f352463a = i2;
                                bVar6.f352464b = z;
                                list3.add(bVar6);
                            }
                        }
                    }
                }
                List<Integer> c = C117535e.m165792c(C118568a.m167242i(obj));
                if (c == null || ((ArrayList) c).size() <= 0) {
                    if (obj instanceof View) {
                        C117067b wx02 = C117067b.wx0();
                        wx02.getClass();
                        C117536f.m165801c(new b$$c(wx02, (View) obj));
                    }
                } else if (obj instanceof View) {
                    C117067b wx03 = C117067b.wx0();
                    wx03.getClass();
                    C117536f.m165802d(new b$$i(wx03, (View) obj), 251);
                }
            } else if (C117534a.m165788k(obj)) {
                C118568a.m167244k(obj, i, i2, z);
            } else if (C117534a.m165785h(obj) && (d = C118568a.m167237d(obj, true)) != null) {
                ArrayList arrayList4 = (ArrayList) C117535e.m165790a(i);
                if (arrayList4.size() > 0) {
                    Iterator it9 = arrayList4.iterator();
                    while (it9.hasNext()) {
                        int intValue4 = ((Integer) it9.next()).intValue();
                        List list4 = (List) ((ConcurrentHashMap) d.f355003d).get(Integer.valueOf(intValue4));
                        if (list4 == null) {
                            list4 = new ArrayList();
                            ((ConcurrentHashMap) d.f355003d).put(Integer.valueOf(intValue4), list4);
                        }
                        Iterator it10 = list4.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                z2 = false;
                                break;
                            }
                            C117924b bVar7 = (C117924b) it10.next();
                            if (bVar7.f352463a == i2 && bVar7.f352464b == z) {
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            C117924b bVar8 = new C117924b();
                            bVar8.f352463a = i2;
                            bVar8.f352464b = z;
                            list4.add(bVar8);
                        }
                    }
                }
            }
        }
        return this;
    }

    public long yx0(Object obj, String str) {
        C118641a d;
        Object obj2;
        C118642b f;
        Object obj3;
        C118643c g;
        Object obj4;
        if (obj == null || C90599h.m113511d(str)) {
            return 0;
        }
        if (C117534a.m165789l(obj)) {
            C118724b bVar = C118568a.f354847a;
            if (!C90599h.m113511d(str) && (g = C118568a.m167240g(obj, false)) != null && (obj4 = ((ConcurrentHashMap) g.f355032j).get(str)) != null && (obj4 instanceof Long)) {
                return ((Long) obj4).longValue();
            }
            return 0;
        } else if (C117534a.m165788k(obj)) {
            C118724b bVar2 = C118568a.f354847a;
            if (!C90599h.m113511d(str) && (f = C118568a.m167239f(obj, false)) != null && (obj3 = ((ConcurrentHashMap) f.f355018m).get(str)) != null && (obj3 instanceof Long)) {
                return ((Long) obj3).longValue();
            }
            return 0;
        } else if (C117534a.m165785h(obj)) {
            C118724b bVar3 = C118568a.f354847a;
            if (!C90599h.m113511d(str) && (d = C118568a.m167237d(obj, false)) != null && (obj2 = ((ConcurrentHashMap) d.f355005f).get(str)) != null && (obj2 instanceof Long)) {
                return ((Long) obj2).longValue();
            }
            return 0;
        } else if (!C117534a.m165786i()) {
            Log.m105920e("Amoeba.DataReportService", "[getLastReportTime] param target is not a right type, please cheak!!!");
            return 0;
        } else {
            throw new RuntimeException("[getLastReportTime] param target is " + obj + ", type of target is error, please cheak !!!");
        }
    }

    public Object zx0(Object obj) {
        WeakReference weakReference;
        if (obj == null || (weakReference = (WeakReference) ((WeakHashMap) C118569b.f354851c).get(obj)) == null || weakReference.get() == null) {
            return null;
        }
        return weakReference.get();
    }
}
