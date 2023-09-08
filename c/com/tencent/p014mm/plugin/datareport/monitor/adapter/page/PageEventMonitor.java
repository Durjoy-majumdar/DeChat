package com.tencent.p014mm.plugin.datareport.monitor.adapter.page;

import a41.C112756b;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import b41.C113144b;
import c41.C79932a;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FixVasLogicEvent;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.p136ui.vas.launcher.VASLauncher;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import d41.C116570a;
import f41.C116800a;
import gy3.C87412m;
import h41.C117067b;
import h41.b$$b;
import h41.b$$g;
import h41.b$$j;
import h41.b$$q;
import i41.C117140a;
import i41.C117141b;
import j41.C117298c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k31.C117373a;
import m31.C117521b;
import m41.C117534a;
import m41.C117536f;
import n31.C117601c;
import n41.C117607a;
import op3.C117877b;
import op3.C117882j;
import p41.C117985b;
import s31.C118264c;
import t31.C118361a;
import u31.C118568a;
import v31.C118642b;

/* renamed from: com.tencent.mm.plugin.datareport.monitor.adapter.page.PageEventMonitor */
public class PageEventMonitor extends C79932a implements C113144b, C117601c, C116570a.C116571a {

    /* renamed from: d */
    public MultiProcessMMKV f345792d = MultiProcessMMKV.getMMKV("mmkv_key_page_event_monitor");

    /* renamed from: e */
    public C115379a f345793e = new C115379a();

    /* renamed from: f */
    public boolean f345794f = false;

    /* renamed from: g */
    public C117140a f345795g;

    /* renamed from: h */
    public List<C117877b<C112756b, Integer>> f345796h = new ArrayList();

    /* renamed from: i */
    public C112756b f345797i = null;

    /* renamed from: j */
    public int f345798j = 0;

    /* renamed from: n */
    public C117985b<C112756b> f345799n = new C117985b<>();

    /* renamed from: o */
    public MMHandler f345800o = C117536f.m165803e(new PageEventMonitor$$b(this));

    /* renamed from: p */
    public IListener<FixVasLogicEvent> f345801p = new IListener<FixVasLogicEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1510902591;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r9 = r9.f343557d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean callback(com.tencent.p014mm.sdk.event.IEvent r9) {
            /*
                r8 = this;
                com.tencent.mm.autogen.events.FixVasLogicEvent r9 = (com.tencent.p014mm.autogen.events.FixVasLogicEvent) r9
                r0 = 0
                if (r9 == 0) goto L_0x0075
                com.tencent.mm.autogen.events.FixVasLogicEvent$a r9 = r9.f343557d
                androidx.fragment.app.Fragment r1 = r9.f343558a
                if (r1 == 0) goto L_0x0075
                com.tencent.mm.plugin.datareport.monitor.adapter.page.PageEventMonitor r2 = com.tencent.p014mm.plugin.datareport.monitor.adapter.page.PageEventMonitor.this
                java.lang.String r3 = "fix_vas_logic_event"
                boolean r9 = r9.f343559b
                r2.getClass()
                boolean r4 = r1 instanceof com.tencent.p014mm.p136ui.vas.VASCommonFragment
                if (r4 != 0) goto L_0x001b
                if (r9 != 0) goto L_0x001b
                goto L_0x0075
            L_0x001b:
                androidx.fragment.app.FragmentActivity r9 = r1.getActivity()
                if (r9 != 0) goto L_0x0022
                goto L_0x0075
            L_0x0022:
                boolean r4 = r9 instanceof com.tencent.p014mm.p136ui.vas.VASCommonActivity
                if (r4 == 0) goto L_0x0027
                goto L_0x0075
            L_0x0027:
                com.tencent.mm.sdk.platformtools.LruCache<java.lang.Integer, java.lang.Integer> r4 = r2.f345802q
                int r5 = r9.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                boolean r4 = r4.check(r5)
                if (r4 == 0) goto L_0x0038
                goto L_0x0075
            L_0x0038:
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a r4 = r2.f345793e
                a41.b r4 = r4.mo175202a()
                r5 = 5
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r0] = r3
                r6 = 1
                r5[r6] = r1
                r1 = 2
                r5[r1] = r9
                r1 = 3
                int r7 = r9.hashCode()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r5[r1] = r7
                r1 = 4
                r5[r1] = r4
                java.lang.String r1 = "Amoeba.PageEventMonitor"
                java.lang.String r7 = "[%s] fix vas logic fragment[%s] activity [%s %d] lastPage[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r5)
                if (r4 == 0) goto L_0x0072
                int r4 = r4.f337633a
                int r5 = r9.hashCode()
                if (r4 != r5) goto L_0x0072
                java.lang.Object[] r9 = new java.lang.Object[r6]
                r9[r0] = r3
                java.lang.String r2 = "[%s] fix vas logic activity is same activity"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r9)
                goto L_0x0075
            L_0x0072:
                r2.mo175189M(r9)
            L_0x0075:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.datareport.monitor.adapter.page.PageEventMonitor.C1153781.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    };

    /* renamed from: q */
    public LruCache<Integer, Integer> f345802q = new LruCache<>(10);

    /* renamed from: F */
    public void mo175186F(long j) {
        if (C117373a.xx0().Ex0()) {
            Log.m105920e("Amoeba.PageEventMonitor", "[onAppOut]");
            Message obtainMessage = this.f345800o.obtainMessage(1002);
            obtainMessage.obj = Long.valueOf(System.currentTimeMillis());
            this.f345800o.sendMessage(obtainMessage);
            C117067b wx02 = C117067b.wx0();
            wx02.getClass();
            C117536f.m165799a(new b$$q(wx02));
        }
    }

    /* renamed from: F4 */
    public void mo175187F4(Fragment fragment) {
        C112756b bVar;
        if (fragment != null && C117373a.xx0().Ex0()) {
            if (fragment instanceof VASCommonFragment) {
                bVar = new C112756b(((VASCommonFragment) fragment).f348642o);
                bVar.f337638f = C117534a.m165787j(fragment);
            } else {
                bVar = new C112756b(fragment);
            }
            Log.m105925i("Amoeba.PageEventMonitor", "[onFragmentPause] page [%s] ", bVar);
            if (bVar.f337638f) {
                C117067b wx02 = C117067b.wx0();
                wx02.getClass();
                if (!C118361a.m166983a().mo183164b(new C112756b(fragment))) {
                    wx02.f350761n.mo182402h(fragment);
                    Log.m105924i("Amoeba.ViewExposeMonitor", "[subPageOut] subPage : " + fragment);
                }
                C117536f.m165799a(new b$$j(wx02));
            }
            Message obtainMessage = this.f345800o.obtainMessage(1005);
            obtainMessage.obj = C117882j.m166285d(bVar, 1, Long.valueOf(System.currentTimeMillis()));
            this.f345800o.sendMessage(obtainMessage);
        }
    }

    /* renamed from: G */
    public void mo175188G(long j) {
        if (C117373a.xx0().Ex0()) {
            Log.m105920e("Amoeba.PageEventMonitor", "[onAppIn]");
            Message obtainMessage = this.f345800o.obtainMessage(1001);
            obtainMessage.obj = Long.valueOf(System.currentTimeMillis());
            this.f345800o.sendMessage(obtainMessage);
            C117067b wx02 = C117067b.wx0();
            wx02.getClass();
            C117536f.m165801c(new b$$b(wx02));
        }
    }

    /* renamed from: M */
    public final void mo175189M(Activity activity) {
        Fragment fragment;
        if (activity != null && C117373a.xx0().Ex0()) {
            C116800a aVar = C116800a.f350124d;
            if (C116800a.f350133p) {
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it = C116800a.f350129i.iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    C116800a.C116802b bVar = C116800a.f350127g.get(it.next());
                    if (!(bVar == null || (fragment = bVar.f350142a.get()) == null || C116800a.f350124d.mo180775f(fragment) || fragment.getContext() == null)) {
                        Context context = fragment.getContext();
                        if (context != null) {
                            i = context.hashCode();
                        }
                        if (i != activity.hashCode()) {
                            bVar.f350147f = true;
                            arrayList.add(fragment);
                        }
                    }
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    C116800a.f350124d.mo180779j((Fragment) it4.next(), false);
                }
                arrayList.clear();
                aVar.mo180782m(activity, false);
            }
            C112756b bVar2 = new C112756b(activity);
            Log.m105924i("Amoeba.PageEventMonitor", "[activityResumed] page : " + bVar2);
            C117067b.wx0().yx0(activity);
            Message obtainMessage = this.f345800o.obtainMessage(1003);
            obtainMessage.obj = C117882j.m166284c(bVar2, Long.valueOf(System.currentTimeMillis()));
            this.f345800o.sendMessage(obtainMessage);
            this.f345799n.mo182750a(activity, bVar2, new PageEventMonitor$$a(this, bVar2));
        }
    }

    /* renamed from: M0 */
    public void mo175190M0(Fragment fragment) {
        C112756b bVar;
        if (fragment != null && C117373a.xx0().Ex0()) {
            C117607a.m165876a(fragment);
            if (fragment instanceof VASCommonFragment) {
                bVar = new C112756b(((VASCommonFragment) fragment).f348642o);
                bVar.f337638f = C117534a.m165787j(fragment);
            } else {
                bVar = new C112756b(fragment);
            }
            Object[] objArr = new Object[2];
            objArr[0] = bVar;
            FragmentActivity activity = fragment.getActivity();
            objArr[1] = Boolean.valueOf((activity != null && (activity instanceof VASLauncher)) ? ((VASLauncher) activity).f348665h : false);
            Log.m105925i("Amoeba.PageEventMonitor", "[onFragmentResume] page [%s], isInVasNow[%b] ", objArr);
            if (bVar.f337638f) {
                C117067b wx02 = C117067b.wx0();
                wx02.getClass();
                if (!C118361a.m166983a().mo183164b(new C112756b(fragment))) {
                    wx02.f350761n.add(fragment);
                    Log.m105924i("Amoeba.ViewExposeMonitor", "[subPageIn] subPage : " + fragment);
                }
                C117536f.m165799a(new b$$g(wx02));
            } else {
                C117067b.wx0().yx0(fragment);
            }
            Message obtainMessage = this.f345800o.obtainMessage(1005);
            obtainMessage.obj = C117882j.m166285d(bVar, 0, Long.valueOf(System.currentTimeMillis()));
            this.f345800o.sendMessage(obtainMessage);
            this.f345799n.mo182750a(fragment, bVar, new PageEventMonitor$$c(this, bVar));
        }
    }

    /* renamed from: N */
    public final void mo175191N(long j) {
        String str;
        long j2;
        String str2;
        C112756b bVar;
        C112756b bVar2;
        long j3 = j;
        if (this.f345795g != null && !this.f345794f) {
            this.f345794f = true;
            Log.m105924i("Amoeba.PageEventMonitor", "[appBackToFront] time : " + j3);
            C117141b bVar3 = (C117141b) this.f345795g;
            bVar3.getClass();
            Log.m105925i("Amoeba.StandardEventMonitor", "[onAppIn] time : %d", Long.valueOf(j));
            if (MMApplicationContext.isMainProcess()) {
                HashMap hashMap = new HashMap();
                hashMap.put("in_time", Long.valueOf(j));
                C117373a.xx0().Fx0(j3, "app_in", hashMap);
                C117298c.m165377a().mo181967b(j, "app_in", (Object) null, hashMap);
                bVar3.f350971d = j3;
            }
            C117141b.C117142a aVar = bVar3.f350972e;
            if (aVar != null) {
                aVar.f350973a = j3;
                aVar.f350974b = 0;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("in_type", 0);
                hashMap2.put("in_time", Long.valueOf(j));
                str = "Amoeba.PageEventMonitor";
                j2 = 0;
                HashMap hashMap3 = hashMap2;
                C117373a.xx0().Hx0(j, "biz_in", bVar3.f350972e.f350975c, hashMap3);
                C117298c.m165377a().mo181967b(j, "biz_in", bVar3.f350972e.f350975c, hashMap3);
            } else {
                str = "Amoeba.PageEventMonitor";
                j2 = 0;
            }
            Iterator it = ((ArrayList) bVar3.f350968a).iterator();
            while (it.hasNext()) {
                C117141b.C117142a aVar2 = (C117141b.C117142a) it.next();
                aVar2.f350973a = j3;
                aVar2.f350974b = j2;
                HashMap hashMap4 = new HashMap();
                hashMap4.put("in_type", 0);
                hashMap4.put("in_time", Long.valueOf(j));
                C117373a xx02 = C117373a.xx0();
                long j4 = j;
                C112756b bVar4 = aVar2.f350975c;
                C117141b.C117142a aVar3 = aVar2;
                HashMap hashMap5 = hashMap4;
                xx02.Hx0(j4, "session_in", bVar4, hashMap5);
                C117298c.m165377a().mo181967b(j4, "session_in", aVar3.f350975c, hashMap5);
            }
            C118264c cVar = C117373a.xx0().f351384j;
            if (!(cVar == null || (bVar = cVar.f353458b) == null)) {
                C117141b.C117142a aVar4 = (C117141b.C117142a) ((HashMap) bVar3.f350970c).get(bVar.f337634b);
                if (aVar4 != null) {
                    aVar4.f350973a = j3;
                    aVar4.f350974b = j2;
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put("in_type", 0);
                    hashMap6.put("in_time", Long.valueOf(j));
                    long j5 = j;
                    bVar2 = bVar;
                    HashMap hashMap7 = hashMap6;
                    C117373a.xx0().Hx0(j5, "page_in", aVar4.f350975c, hashMap7);
                    C117298c.m165377a().mo181967b(j5, "page_in", aVar4.f350975c, hashMap7);
                } else {
                    bVar2 = bVar;
                }
                List<C112756b> d = cVar.mo183048d(bVar2);
                if (d != null) {
                    ArrayList arrayList = (ArrayList) d;
                    if (arrayList.size() > 0) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            C117141b.C117142a aVar5 = (C117141b.C117142a) ((HashMap) bVar3.f350970c).get(((C112756b) it4.next()).f337634b);
                            if (aVar5 != null) {
                                aVar5.f350973a = j3;
                                aVar5.f350974b = 0;
                                HashMap hashMap8 = new HashMap();
                                hashMap8.put("in_type", 0);
                                hashMap8.put("in_time", Long.valueOf(j));
                                long j6 = j;
                                HashMap hashMap9 = hashMap8;
                                C117373a.xx0().Hx0(j6, "page_in", aVar5.f350975c, hashMap9);
                                C117298c.m165377a().mo181967b(j6, "page_in", aVar5.f350975c, hashMap9);
                            }
                        }
                    }
                }
            }
            Iterator it5 = ((ArrayList) this.f345796h).iterator();
            while (it5.hasNext()) {
                C117877b bVar5 = (C117877b) it5.next();
                C112756b bVar6 = (C112756b) bVar5.mo182596a(0);
                if (bVar6 != null) {
                    int intValue = ((Integer) bVar5.mo182596a(1)).intValue();
                    if (intValue == 0) {
                        mo175196S(bVar6);
                        ((C117141b) this.f345795g).mo181075c(bVar6, j3, true);
                    } else if (intValue == 1) {
                        ((C117141b) this.f345795g).mo181076d(bVar6, j3, true);
                    } else if (intValue == 2) {
                        mo175199V(bVar6, j3);
                    }
                    Object[] objArr = {Integer.valueOf(intValue), bVar6};
                    str2 = str;
                    Log.m105925i(str2, "[appBackToFront] replenish, eventType : %d, page : %s", objArr);
                } else {
                    str2 = str;
                }
                str = str2;
            }
            ((ArrayList) this.f345796h).clear();
        }
    }

    /* renamed from: O */
    public final void mo175192O(long j) {
        String str;
        long j2;
        long j3;
        C112756b bVar;
        C112756b bVar2;
        String str2;
        long j4 = j;
        if (this.f345795g != null && this.f345794f) {
            this.f345794f = false;
            Log.m105924i("Amoeba.PageEventMonitor", "[appFrontToBack] time : " + j4);
            long j5 = 0;
            long j6 = this.f345792d.getLong("mmkv_key_op_in_time", 0);
            if (j6 > 0 && MMApplicationContext.isMainProcess()) {
                C112756b a = this.f345793e.mo175202a();
                if (a != null) {
                    ((C117141b) this.f345795g).mo181076d(a, j6, false);
                }
                this.f345792d.putBoolean("mmkv_key_is_handle_mp_last_page", true);
            }
            C117141b bVar3 = (C117141b) this.f345795g;
            bVar3.getClass();
            Log.m105925i("Amoeba.StandardEventMonitor", "[onAppOut] time : %d", Long.valueOf(j));
            C118264c cVar = C117373a.xx0().f351384j;
            String str3 = "in_time";
            if (cVar == null || (bVar = cVar.f353458b) == null) {
                str = str3;
            } else {
                List<C112756b> d = cVar.mo183048d(bVar);
                if (d != null) {
                    ArrayList arrayList = (ArrayList) d;
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C117141b.C117142a aVar = (C117141b.C117142a) ((HashMap) bVar3.f350970c).get(((C112756b) it.next()).f337634b);
                            if (aVar != null) {
                                long j7 = aVar.f350973a;
                                long j8 = (j4 <= j7 || j7 <= j5) ? j5 : j4 - j7;
                                aVar.f350974b = j8;
                                if (j8 > j5) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("out_type", 0);
                                    hashMap.put(str3, Long.valueOf(aVar.f350973a));
                                    hashMap.put("out_time", Long.valueOf(j));
                                    hashMap.put("stay_time", Long.valueOf(aVar.f350974b));
                                    HashMap hashMap2 = hashMap;
                                    long j9 = j;
                                    bVar2 = bVar;
                                    str2 = str3;
                                    HashMap hashMap3 = hashMap2;
                                    C117373a.xx0().Hx0(j9, "page_out", aVar.f350975c, hashMap3);
                                    C117298c.m165377a().mo181967b(j9, "page_out", aVar.f350975c, hashMap3);
                                    str3 = str2;
                                    bVar = bVar2;
                                    j5 = 0;
                                }
                            }
                            bVar2 = bVar;
                            str2 = str3;
                            str3 = str2;
                            bVar = bVar2;
                            j5 = 0;
                        }
                    }
                }
                str = str3;
                C117141b.C117142a aVar2 = (C117141b.C117142a) ((HashMap) bVar3.f350970c).get(bVar.f337634b);
                if (aVar2 != null) {
                    long j15 = aVar2.f350973a;
                    long j16 = (j4 <= j15 || j15 <= 0) ? 0 : j4 - j15;
                    aVar2.f350974b = j16;
                    if (j16 > 0) {
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("out_type", 0);
                        hashMap4.put(str, Long.valueOf(aVar2.f350973a));
                        hashMap4.put("out_time", Long.valueOf(j));
                        hashMap4.put("stay_time", Long.valueOf(aVar2.f350974b));
                        long j17 = j;
                        HashMap hashMap5 = hashMap4;
                        C117373a.xx0().Hx0(j17, "page_out", aVar2.f350975c, hashMap5);
                        C117298c.m165377a().mo181967b(j17, "page_out", aVar2.f350975c, hashMap5);
                    }
                }
            }
            Iterator it4 = ((ArrayList) bVar3.f350968a).iterator();
            while (it4.hasNext()) {
                C117141b.C117142a aVar3 = (C117141b.C117142a) it4.next();
                long j18 = aVar3.f350973a;
                long j19 = (j4 <= j18 || j18 <= 0) ? 0 : j4 - j18;
                aVar3.f350974b = j19;
                if (j19 > 0) {
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put("out_type", 0);
                    hashMap6.put(str, Long.valueOf(aVar3.f350973a));
                    hashMap6.put("out_time", Long.valueOf(j));
                    hashMap6.put("stay_time", Long.valueOf(aVar3.f350974b));
                    long j25 = j;
                    HashMap hashMap7 = hashMap6;
                    C117373a.xx0().Hx0(j25, "session_out", aVar3.f350975c, hashMap6);
                    C117298c.m165377a().mo181967b(j25, "session_out", aVar3.f350975c, hashMap6);
                }
            }
            C117141b.C117142a aVar4 = bVar3.f350972e;
            if (aVar4 != null) {
                long j26 = aVar4.f350973a;
                long j27 = (j4 <= j26 || j26 <= 0) ? 0 : j4 - j26;
                aVar4.f350974b = j27;
                if (j27 > 0) {
                    HashMap hashMap8 = new HashMap();
                    hashMap8.put("out_type", 0);
                    hashMap8.put(str, Long.valueOf(bVar3.f350972e.f350973a));
                    hashMap8.put("out_time", Long.valueOf(j));
                    hashMap8.put("stay_time", Long.valueOf(bVar3.f350972e.f350974b));
                    HashMap hashMap9 = hashMap8;
                    C117373a.xx0().Hx0(j, "biz_out", bVar3.f350972e.f350975c, hashMap9);
                    C117298c.m165377a().mo181967b(j, "biz_out", bVar3.f350972e.f350975c, hashMap9);
                }
            }
            if (MMApplicationContext.isMainProcess()) {
                HashMap hashMap10 = new HashMap();
                hashMap10.put(str, Long.valueOf(bVar3.f350971d));
                hashMap10.put("out_time", Long.valueOf(j));
                long j28 = bVar3.f350971d;
                if (j4 > j28) {
                    j3 = 0;
                    if (j28 > 0) {
                        j2 = j4 - j28;
                        hashMap10.put("stay_time", Long.valueOf(j2));
                        C117373a.xx0().Fx0(j4, "app_out", hashMap10);
                        C117298c.m165377a().mo181967b(j, "app_out", (Object) null, hashMap10);
                    }
                } else {
                    j3 = 0;
                }
                j2 = j3;
                hashMap10.put("stay_time", Long.valueOf(j2));
                C117373a.xx0().Fx0(j4, "app_out", hashMap10);
                C117298c.m165377a().mo181967b(j, "app_out", (Object) null, hashMap10);
            }
        }
    }

    /* renamed from: P */
    public final void mo175193P(C112756b bVar, long j) {
        if (bVar != null) {
            int i = 0;
            C118642b f = C118568a.m167239f(bVar, false);
            if (f != null) {
                i = f.f355008c;
            }
            if (i > 0) {
                int i2 = this.f345798j;
                if (i2 == 0) {
                    ((C117141b) this.f345795g).mo181073a(bVar, j);
                    this.f345798j = i;
                    this.f345797i = bVar;
                } else if (i != i2) {
                    ((C117141b) this.f345795g).mo181074b(this.f345797i, j);
                    ((C117141b) this.f345795g).mo181073a(bVar, j);
                    this.f345798j = i;
                    this.f345797i = bVar;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175194Q(a41.C112756b r5, long r6) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            a41.b r0 = r4.f345797i
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.mo164512a(r5)
            if (r0 == 0) goto L_0x0079
            i41.a r0 = r4.f345795g
            i41.b r0 = (i41.C117141b) r0
            r0.mo181074b(r5, r6)
            com.tencent.mm.plugin.datareport.monitor.adapter.page.a r5 = r4.f345793e
            java.util.Stack<a41.b> r0 = r5.f345809a
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L_0x0021
            r0 = r1
            goto L_0x003f
        L_0x0021:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Stack<a41.b> r2 = r5.f345809a
            int r2 = r2.size()
        L_0x002c:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x003f
            java.util.Stack<a41.b> r3 = r5.f345809a
            java.lang.Object r3 = r3.get(r2)
            a41.b r3 = (a41.C112756b) r3
            if (r3 != 0) goto L_0x003b
            goto L_0x002c
        L_0x003b:
            r0.add(r3)
            goto L_0x002c
        L_0x003f:
            r5 = 0
            if (r0 == 0) goto L_0x0065
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0065
            java.util.Iterator r0 = r0.iterator()
        L_0x004c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r0.next()
            a41.b r2 = (a41.C112756b) r2
            v31.b r3 = u31.C118568a.m167239f(r2, r5)
            if (r3 != 0) goto L_0x0060
            r3 = 0
            goto L_0x0062
        L_0x0060:
            int r3 = r3.f355008c
        L_0x0062:
            if (r3 <= 0) goto L_0x004c
            goto L_0x0067
        L_0x0065:
            r2 = r1
            r3 = 0
        L_0x0067:
            if (r2 == 0) goto L_0x0075
            i41.a r5 = r4.f345795g
            i41.b r5 = (i41.C117141b) r5
            r5.mo181073a(r2, r6)
            r4.f345798j = r3
            r4.f345797i = r2
            goto L_0x0079
        L_0x0075:
            r4.f345798j = r5
            r4.f345797i = r1
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.datareport.monitor.adapter.page.PageEventMonitor.mo175194Q(a41.b, long):void");
    }

    /* renamed from: R */
    public final void mo175195R(C112756b bVar) {
        if (bVar != null) {
            Message obtainMessage = this.f345800o.obtainMessage(1006);
            obtainMessage.obj = bVar;
            this.f345800o.sendMessageDelayed(obtainMessage, 3000);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: t31.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175196S(a41.C112756b r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            v31.b r1 = u31.C118568a.m167239f(r7, r0)
            r2 = 0
            if (r1 != 0) goto L_0x000d
            r1 = r2
            goto L_0x000f
        L_0x000d:
            java.lang.String r1 = r1.f355007b
        L_0x000f:
            boolean r1 = u24.C90599h.m113511d(r1)
            r3 = 1
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = r7.f337635c
            v31.b r4 = u31.C118568a.m167239f(r7, r3)
            if (r4 == 0) goto L_0x0027
            boolean r5 = u24.C90599h.m113511d(r1)
            if (r5 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r4.f355007b = r1
        L_0x0027:
            t31.a r1 = t31.C118361a.m166983a()
            java.lang.String r4 = r7.f337635c
            boolean r5 = u24.C90599h.m113511d(r4)
            if (r5 == 0) goto L_0x0037
            r1.getClass()
            goto L_0x0042
        L_0x0037:
            java.util.Map<java.lang.String, t31.b> r1 = r1.f353762a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r4)
            r2 = r1
            t31.b r2 = (t31.C118362b) r2
        L_0x0042:
            if (r2 == 0) goto L_0x0065
            int r1 = r2.f353764a
            v31.b r4 = u31.C118568a.m167239f(r7, r3)
            if (r4 == 0) goto L_0x0051
            if (r1 > 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r4.f355006a = r1
        L_0x0051:
            int r1 = r2.f353765b
            v31.b r3 = u31.C118568a.m167239f(r7, r3)
            if (r3 == 0) goto L_0x005e
            if (r1 > 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r3.f355008c = r1
        L_0x005e:
            int r1 = r2.f353767d
            int r2 = r2.f353768e
            u31.C118568a.m167244k(r7, r1, r2, r0)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.datareport.monitor.adapter.page.PageEventMonitor.mo175196S(a41.b):void");
    }

    /* renamed from: T */
    public final void mo175197T(int i, C112756b bVar, long j) {
        if (bVar != null && this.f345795g != null && C117373a.xx0().Ex0()) {
            Log.m105924i("Amoeba.PageEventMonitor", "[fragmentEvent] eventType " + i + ", page : " + bVar);
            if (!bVar.f337638f) {
                if (i == 0) {
                    mo175199V(bVar, j);
                }
            } else if (C118361a.m166983a().mo183164b(bVar)) {
            } else {
                if (this.f345794f) {
                    if (i == 0) {
                        mo175196S(bVar);
                        ((C117141b) this.f345795g).mo181075c(bVar, j, true);
                    } else if (i == 1) {
                        ((C117141b) this.f345795g).mo181076d(bVar, j, true);
                    }
                } else if (i == 0) {
                    ((ArrayList) this.f345796h).add(C117882j.m166284c(bVar, 0));
                } else if (i == 1) {
                    ((ArrayList) this.f345796h).add(C117882j.m166284c(bVar, 1));
                }
            }
        }
    }

    /* renamed from: U */
    public final void mo175198U(C112756b bVar, long j) {
        if (bVar != null && this.f345795g != null && this.f345793e.f345809a.size() == 1 && !MMApplicationContext.isMainProcess()) {
            C115379a aVar = this.f345793e;
            C112756b bVar2 = aVar.f345809a.size() <= 0 ? null : aVar.f345809a.get(0);
            if (bVar2 != null && bVar2.mo164512a(bVar)) {
                Log.m105925i("Amoeba.PageEventMonitor", "[nonMainProcessPagePause] page : %s", bVar);
                if (this.f345792d.getLong("mmkv_key_op_out_time", 0) <= 0) {
                    this.f345792d.putLong("mmkv_key_op_out_time", j);
                }
                C112756b pop = this.f345793e.f345809a.pop();
                ((C117141b) this.f345795g).mo181076d(bVar2, j, false);
                ((C117141b) this.f345795g).mo181078f(bVar2, j);
                mo175194Q(bVar2, j);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0208 A[EDGE_INSN: B:108:0x0208->B:92:0x0208 ?: BREAK  
    EDGE_INSN: B:109:0x0208->B:92:0x0208 ?: BREAK  ] */
    /* renamed from: V */
    public final void mo175199V(a41.C112756b r18, long r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            if (r1 == 0) goto L_0x024c
            i41.a r4 = r0.f345795g
            if (r4 != 0) goto L_0x000e
            goto L_0x024c
        L_0x000e:
            t31.a r4 = t31.C118361a.m166983a()
            boolean r4 = r4.mo183164b(r1)
            if (r4 == 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.String r4 = "page_is_filter"
            java.lang.Boolean r4 = u31.C118568a.m167235b(r1, r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0027
            return
        L_0x0027:
            boolean r4 = r0.f345794f
            java.lang.String r5 = "Amoeba.PageEventMonitor"
            r6 = 2
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L_0x0049
            java.util.List<op3.b<a41.b, java.lang.Integer>> r2 = r0.f345796h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            op3.b r3 = op3.C117882j.m166284c(r1, r3)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r3)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r7] = r1
            java.lang.String r1 = "[pageResume] now is background, page : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r2)
            return
        L_0x0049:
            com.tencent.mm.plugin.datareport.monitor.adapter.page.a r4 = r0.f345793e
            a41.b r4 = r4.mo175202a()
            if (r4 == 0) goto L_0x0063
            boolean r9 = r4.mo164512a(r1)
            if (r9 == 0) goto L_0x0063
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r7] = r1
            r2[r8] = r4
            java.lang.String r1 = "[pageResume] same page, page : %s, lastPage : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r2)
            return
        L_0x0063:
            r17.mo175196S(r18)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            java.lang.String r10 = "mmkv_key_op_in_time"
            r11 = 0
            if (r9 == 0) goto L_0x00c0
            java.lang.String r9 = "mmkv_key_op_out_time"
            java.lang.String r13 = "mmkv_key_is_handle_mp_last_page"
            if (r4 == 0) goto L_0x00b0
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r14 = r0.f345792d
            long r14 = r14.getLong(r10, r11)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r0.f345792d
            boolean r8 = r8.getBoolean(r13, r7)
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 <= 0) goto L_0x008f
            if (r8 != 0) goto L_0x008f
            i41.a r8 = r0.f345795g
            i41.b r8 = (i41.C117141b) r8
            r8.mo181076d(r4, r14, r7)
        L_0x008f:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r0.f345792d
            r8.putBoolean(r13, r7)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r0.f345792d
            r8.putLong(r10, r11)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r0.f345792d
            long r13 = r8.getLong(r9, r11)
            int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x00aa
            i41.a r8 = r0.f345795g
            i41.b r8 = (i41.C117141b) r8
            r8.mo181075c(r4, r13, r7)
        L_0x00aa:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r0.f345792d
            r8.putLong(r9, r11)
            goto L_0x00cf
        L_0x00b0:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r0.f345792d
            r8.putBoolean(r13, r7)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r0.f345792d
            r8.putLong(r10, r11)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r0.f345792d
            r8.putLong(r9, r11)
            goto L_0x00cf
        L_0x00c0:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r0.f345792d
            long r8 = r8.getLong(r10, r11)
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x00cf
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r0.f345792d
            r8.putLong(r10, r2)
        L_0x00cf:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r7] = r1
            java.lang.Long r8 = java.lang.Long.valueOf(r19)
            r9 = 1
            r6[r9] = r8
            java.lang.String r8 = "[pageResume] page : %s, time : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r6)
            if (r4 == 0) goto L_0x0104
            i41.a r5 = r0.f345795g
            i41.b r5 = (i41.C117141b) r5
            r5.mo181076d(r4, r2, r7)
            boolean r5 = r1.f337639g
            if (r5 == 0) goto L_0x0104
            boolean r5 = r4.f337639g
            if (r5 == 0) goto L_0x0104
            com.tencent.mm.plugin.datareport.monitor.adapter.page.a r5 = r0.f345793e
            java.util.Stack<a41.b> r5 = r5.f345809a
            java.lang.Object r5 = r5.pop()
            a41.b r5 = (a41.C112756b) r5
            i41.a r5 = r0.f345795g
            i41.b r5 = (i41.C117141b) r5
            r5.mo181078f(r4, r2)
            r0.mo175194Q(r4, r2)
        L_0x0104:
            com.tencent.mm.plugin.datareport.monitor.adapter.page.a r4 = r0.f345793e
            java.util.Stack<a41.b> r5 = r4.f345809a
            int r5 = r5.size()
            if (r5 > 0) goto L_0x010f
            goto L_0x012f
        L_0x010f:
            java.util.Stack<a41.b> r5 = r4.f345809a
            int r5 = r5.size()
            r6 = 1
            int r5 = r5 - r6
        L_0x0117:
            if (r5 < 0) goto L_0x012f
            java.util.Stack<a41.b> r8 = r4.f345809a
            java.lang.Object r8 = r8.get(r5)
            a41.b r8 = (a41.C112756b) r8
            if (r8 != 0) goto L_0x0124
            goto L_0x012c
        L_0x0124:
            boolean r8 = r8.mo164512a(r1)
            if (r8 == 0) goto L_0x012c
            r8 = 1
            goto L_0x0130
        L_0x012c:
            int r5 = r5 + -1
            goto L_0x0117
        L_0x012f:
            r8 = 0
        L_0x0130:
            boolean r4 = r1.f337639g
            com.tencent.mm.plugin.datareport.monitor.adapter.page.a r5 = r0.f345793e
            java.util.Stack<a41.b> r6 = r5.f345809a
            int r6 = r6.size()
            r9 = 0
            if (r6 > 0) goto L_0x013f
            r5 = r9
            goto L_0x0147
        L_0x013f:
            java.util.Stack<a41.b> r5 = r5.f345809a
            java.lang.Object r5 = r5.get(r7)
            a41.b r5 = (a41.C112756b) r5
        L_0x0147:
            if (r4 == 0) goto L_0x01b0
            if (r8 == 0) goto L_0x0151
            boolean r4 = r1.mo164512a(r5)
            if (r4 != 0) goto L_0x01b0
        L_0x0151:
            com.tencent.mm.plugin.datareport.monitor.adapter.page.a r4 = r0.f345793e
            java.util.Stack<a41.b> r5 = r4.f345809a
            int r5 = r5.size()
            if (r5 > 0) goto L_0x015c
            goto L_0x0175
        L_0x015c:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0161:
            java.util.Stack<a41.b> r5 = r4.f345809a
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0175
            java.util.Stack<a41.b> r5 = r4.f345809a
            java.lang.Object r5 = r5.pop()
            a41.b r5 = (a41.C112756b) r5
            r9.add(r5)
            goto L_0x0161
        L_0x0175:
            if (r9 == 0) goto L_0x0198
            int r4 = r9.size()
            if (r4 <= 0) goto L_0x0198
            java.util.Iterator r4 = r9.iterator()
        L_0x0181:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0198
            java.lang.Object r5 = r4.next()
            a41.b r5 = (a41.C112756b) r5
            i41.a r6 = r0.f345795g
            i41.b r6 = (i41.C117141b) r6
            r6.mo181078f(r5, r2)
            r0.mo175194Q(r5, r2)
            goto L_0x0181
        L_0x0198:
            r17.mo175193P(r18, r19)
            i41.a r4 = r0.f345795g
            i41.b r4 = (i41.C117141b) r4
            r4.mo181077e(r1, r2)
            i41.a r4 = r0.f345795g
            i41.b r4 = (i41.C117141b) r4
            r4.mo181075c(r1, r2, r7)
            com.tencent.mm.plugin.datareport.monitor.adapter.page.a r2 = r0.f345793e
            r2.mo175203b(r1)
            goto L_0x024c
        L_0x01b0:
            if (r8 == 0) goto L_0x0236
            com.tencent.mm.plugin.datareport.monitor.adapter.page.a r4 = r0.f345793e
            java.util.Stack<a41.b> r5 = r4.f345809a
            int r5 = r5.size()
            if (r5 > 0) goto L_0x01be
            r10 = r0
            goto L_0x020b
        L_0x01be:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Stack<a41.b> r6 = r4.f345809a
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x01d9
            java.util.Stack<a41.b> r6 = r4.f345809a
            java.lang.Object r6 = r6.peek()
            a41.b r6 = (a41.C112756b) r6
            r10 = r0
            r8 = r5
            r5 = r4
            r3 = r2
            r2 = r1
            goto L_0x01e1
        L_0x01d9:
            r8 = r0
            r6 = r5
            r5 = r4
            r3 = r2
            r2 = r1
        L_0x01de:
            r10 = r8
            r8 = r6
            r6 = r9
        L_0x01e1:
            if (r6 == 0) goto L_0x0208
            boolean r6 = r6.mo164512a(r1)
            if (r6 != 0) goto L_0x0208
            java.util.Stack<a41.b> r6 = r5.f345809a
            java.lang.Object r6 = r6.pop()
            a41.b r6 = (a41.C112756b) r6
            r8.add(r6)
            java.util.Stack<a41.b> r6 = r5.f345809a
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0205
            java.util.Stack<a41.b> r6 = r5.f345809a
            java.lang.Object r6 = r6.peek()
            a41.b r6 = (a41.C112756b) r6
            goto L_0x01e1
        L_0x0205:
            r6 = r8
            r8 = r10
            goto L_0x01de
        L_0x0208:
            r1 = r2
            r2 = r3
            r9 = r8
        L_0x020b:
            if (r9 == 0) goto L_0x022e
            int r4 = r9.size()
            if (r4 <= 0) goto L_0x022e
            java.util.Iterator r4 = r9.iterator()
        L_0x0217:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x022e
            java.lang.Object r5 = r4.next()
            a41.b r5 = (a41.C112756b) r5
            i41.a r6 = r10.f345795g
            i41.b r6 = (i41.C117141b) r6
            r6.mo181078f(r5, r2)
            r10.mo175194Q(r5, r2)
            goto L_0x0217
        L_0x022e:
            i41.a r4 = r10.f345795g
            i41.b r4 = (i41.C117141b) r4
            r4.mo181075c(r1, r2, r7)
            goto L_0x024c
        L_0x0236:
            r17.mo175193P(r18, r19)
            i41.a r4 = r0.f345795g
            i41.b r4 = (i41.C117141b) r4
            r4.mo181077e(r1, r2)
            i41.a r4 = r0.f345795g
            i41.b r4 = (i41.C117141b) r4
            r4.mo181075c(r1, r2, r7)
            com.tencent.mm.plugin.datareport.monitor.adapter.page.a r2 = r0.f345793e
            r2.mo175203b(r1)
        L_0x024c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.datareport.monitor.adapter.page.PageEventMonitor.mo175199V(a41.b, long):void");
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Log.m105924i("Amoeba.PageEventMonitor", "[onActivityCreated] activity : " + activity);
        C87412m.m108594g(activity, "ui");
        try {
            C117521b bVar = (C117521b) activity.getClass().getAnnotation(C117521b.class);
            if (bVar != null) {
                int scene = bVar.scene();
                C115669n nVar = C115669n.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append(scene);
                sb.append(',');
                sb.append(Util.nowMilliSecond());
                nVar.kvStat(13312, sb.toString());
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AnnotationReportParser", "[onCreate] throw Exception : " + e.getMessage());
        }
    }

    public void onActivityDestroyed(Activity activity) {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        Log.m105924i("Amoeba.PageEventMonitor", "[onActivityDestroyed] activity : " + activity);
        System.currentTimeMillis();
        if (activity != null && C117373a.xx0().Ex0()) {
            C112756b bVar = new C112756b(activity);
            Log.m105924i("Amoeba.PageEventMonitor", "[activityDestroy] page : " + bVar);
            mo175195R(bVar);
            if ((activity instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager()) != null && (fragments = supportFragmentManager.getFragments()) != null && fragments.size() > 0) {
                for (Fragment bVar2 : fragments) {
                    C112756b bVar3 = new C112756b(bVar2);
                    Log.m105924i("Amoeba.PageEventMonitor", "[activityDestroy] subPage : " + bVar3);
                    mo175195R(bVar3);
                }
            }
            this.f345802q.put(Integer.valueOf(bVar.f337633a), 0);
        }
    }

    public void onActivityPaused(Activity activity) {
        Log.m105924i("Amoeba.PageEventMonitor", "[onActivityPaused] activity : " + activity);
        long currentTimeMillis = System.currentTimeMillis();
        if (activity != null && C117373a.xx0().Ex0()) {
            C112756b bVar = new C112756b(activity);
            Log.m105924i("Amoeba.PageEventMonitor", "[activityPaused] page : " + bVar);
            Message obtainMessage = this.f345800o.obtainMessage(1004);
            obtainMessage.obj = C117882j.m166284c(bVar, Long.valueOf(currentTimeMillis));
            this.f345800o.sendMessage(obtainMessage);
        }
    }

    public void onActivityResumed(Activity activity) {
        Window window;
        Log.m105924i("Amoeba.PageEventMonitor", "[onActivityResumed] activity : " + activity);
        C117607a.m165876a(activity);
        mo175189M(activity);
        C117373a.xx0().getClass();
        if (activity != null && (window = activity.getWindow()) != null) {
            new WeakReference(window);
        }
    }
}
