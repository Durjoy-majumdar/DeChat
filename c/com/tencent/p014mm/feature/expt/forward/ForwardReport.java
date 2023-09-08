package com.tencent.p014mm.feature.expt.forward;

import android.os.Looper;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ForwardUpdateMsgIdEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60151b;
import ht1.C60166f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l31.C61212e;
import p185kq.C10383h;
import te3.C64623p81;
import te3.C64682rk1;

/* renamed from: com.tencent.mm.feature.expt.forward.ForwardReport */
public final class ForwardReport {

    /* renamed from: a */
    public static final C92685a f266735a = new C92685a((C8480h) null);

    /* renamed from: b */
    public static final ConcurrentHashMap<Long, C92685a.C92687b> f266736b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<String, Long> f266737c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final MMHandler f266738d = new MMHandler(Looper.getMainLooper());

    /* renamed from: e */
    public static final IListener<ForwardUpdateMsgIdEvent> f266739e = new ForwardReport$Companion$updateMsgIdListener$1(C40008f.f107254d);

    /* renamed from: com.tencent.mm.feature.expt.forward.ForwardReport$a */
    public static final class C92685a {

        /* renamed from: com.tencent.mm.feature.expt.forward.ForwardReport$a$a */
        public static final class C92686a implements Runnable {

            /* renamed from: d */
            public long f266740d;

            /* renamed from: e */
            public String f266741e;

            /* renamed from: f */
            public long f266742f;

            public C92686a(long j, String str, long j2) {
                C87412m.m108594g(str, "toUserName");
                this.f266742f = j2;
                this.f266740d = j;
                this.f266741e = str;
            }

            public void run() {
                String str = this.f266741e;
                if (str != null) {
                    ForwardReport.f266735a.mo126747d(this.f266740d, this.f266742f, str, false);
                }
                ForwardReport.f266735a.mo126744a();
            }
        }

        /* renamed from: com.tencent.mm.feature.expt.forward.ForwardReport$a$b */
        public static final class C92687b {

            /* renamed from: a */
            public final long f266743a;

            /* renamed from: b */
            public final String f266744b;

            /* renamed from: c */
            public final Map<String, Object> f266745c;

            /* renamed from: d */
            public final Map<String, Object> f266746d;

            public C92687b(long j, String str, Map<String, Object> map, Map<String, Object> map2) {
                C87412m.m108594g(str, "sdkEventId");
                C87412m.m108594g(map, "eventPublicParams");
                C87412m.m108594g(map2, "eventUdfParams");
                this.f266743a = j;
                this.f266744b = str;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.f266745c = linkedHashMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                this.f266746d = linkedHashMap2;
                linkedHashMap.putAll(map);
                linkedHashMap2.putAll(map2);
            }

            /* renamed from: a */
            public final void mo126749a(Map<String, Object> map) {
                C87412m.m108594g(map, "info");
                this.f266746d.putAll(map);
                this.f266745c.put("udf_kv", this.f266746d);
            }
        }

        public C92685a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo126744a() {
            ArrayList<Number> arrayList = new ArrayList<>();
            boolean z = true;
            for (Map.Entry next : ForwardReport.f266736b.entrySet()) {
                long longValue = ((Number) next.getKey()).longValue();
                C92687b bVar = (C92687b) next.getValue();
                Iterator<Map.Entry<String, Long>> it = ForwardReport.f266737c.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry next2 = it.next();
                        String str = (String) next2.getKey();
                        if (((Number) next2.getValue()).longValue() == longValue) {
                            z = false;
                            break;
                        }
                    } else if (z) {
                        arrayList.add(Long.valueOf(longValue));
                    }
                }
            }
            for (Number longValue2 : arrayList) {
                ForwardReport.f266736b.remove(Long.valueOf(longValue2.longValue()));
            }
        }

        /* renamed from: b */
        public final Map<String, Object> mo126745b(C72963f4 f4Var, boolean z, String str) {
            int i;
            C60166f fVar;
            String str2;
            String str3;
            int i2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str4 = "";
            String str5 = null;
            int i3 = -1;
            if (f4Var != null) {
                C92685a aVar = ForwardReport.f266735a;
                String content = f4Var.getContent();
                i = 2;
                if (content != null) {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(content), (String) null);
                    if (u == null || (i2 = u.f195582i) == 0) {
                        if (f4Var.mo100993e4()) {
                            i3 = 1;
                        } else if (f4Var.mo100994f4()) {
                            i3 = 3;
                        } else if (f4Var.mo100979R3()) {
                            i3 = 2;
                        }
                    } else if (i2 != 0) {
                        if (i2 == 5) {
                            i3 = 7;
                        } else if (i2 == 19) {
                            i3 = 8;
                        } else if (i2 == 24) {
                            i3 = 4;
                        } else if (i2 == 51) {
                            i3 = 5;
                        } else if (i2 == 63) {
                            i3 = 6;
                        }
                    }
                }
                if (!(C72996z1.m85820U5(str) || C72996z1.m85847r5(str))) {
                    i = 1;
                }
                String content2 = f4Var.getContent();
                if (content2 != null) {
                    if (i3 == 6) {
                        C60151b bVar = (C60151b) C68070l.C68072b.m80422u(Util.processXml(content2), (String) null).mo93555w(C60151b.class);
                        if (bVar != null) {
                            C64623p81 p812 = bVar.f171698b;
                            if (p812 == null || (str5 = p812.f184780f) == null) {
                                str5 = str4;
                            }
                            if (!(p812 == null || (str3 = p812.f184778d) == null)) {
                                str4 = str3;
                            }
                            linkedHashMap.put("forward_message_type", Integer.valueOf(i3));
                            linkedHashMap.put("forward_to_type", Integer.valueOf(i));
                            linkedHashMap.put("forward_to_usr", str);
                            linkedHashMap.put("feed_id", str5);
                            linkedHashMap.put("liveid", str4);
                            linkedHashMap.put("forward_result", Integer.valueOf(z ? 1 : 0));
                            return linkedHashMap;
                        }
                    } else if (i3 == 5 && (fVar = (C60166f) C68070l.C68072b.m80422u(Util.processXml(content2), (String) null).mo93555w(C60166f.class)) != null) {
                        C64682rk1 rk12 = fVar.f171710b;
                        if (!(rk12 == null || (str2 = rk12.f185183d) == null)) {
                            str4 = str2;
                        }
                        str5 = str4;
                        str4 = null;
                        linkedHashMap.put("forward_message_type", Integer.valueOf(i3));
                        linkedHashMap.put("forward_to_type", Integer.valueOf(i));
                        linkedHashMap.put("forward_to_usr", str);
                        linkedHashMap.put("feed_id", str5);
                        linkedHashMap.put("liveid", str4);
                        linkedHashMap.put("forward_result", Integer.valueOf(z ? 1 : 0));
                        return linkedHashMap;
                    }
                }
            } else {
                str = str4;
                i = -1;
            }
            str4 = null;
            linkedHashMap.put("forward_message_type", Integer.valueOf(i3));
            linkedHashMap.put("forward_to_type", Integer.valueOf(i));
            linkedHashMap.put("forward_to_usr", str);
            linkedHashMap.put("feed_id", str5);
            linkedHashMap.put("liveid", str4);
            linkedHashMap.put("forward_result", Integer.valueOf(z ? 1 : 0));
            return linkedHashMap;
        }

        /* renamed from: c */
        public final Map<String, Object> mo126746c(boolean z, long j) {
            Class cls = C10383h.class;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("key_forwardTime", Long.valueOf(j));
            linkedHashMap.put("if_finder_liunei_data", Integer.valueOf(z ? 1 : 0));
            String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
            String str = "";
            if (S0 == null) {
                S0 = str;
            }
            linkedHashMap.put("finder_tab_context_id", S0);
            String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            if (E == null) {
                E = str;
            }
            linkedHashMap.put("finder_context_id", E);
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb != null) {
                str = Wb;
            }
            linkedHashMap.put("behaviour_session_id", str);
            return linkedHashMap;
        }

        /* renamed from: d */
        public final void mo126747d(long j, long j2, String str, boolean z) {
            Class cls = C61212e.class;
            C87412m.m108594g(str, "toUser");
            String str2 = j + str;
            if (j == -1) {
                str2 = str;
            }
            if (j2 != -1) {
                j = j2;
            }
            C72963f4 f4Var = null;
            if (j != -1) {
                f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
            }
            if (f4Var != null) {
                boolean z2 = true;
                if (!z && f4Var.getStatus() != 2) {
                    z2 = false;
                }
                ConcurrentHashMap<String, Long> concurrentHashMap = ForwardReport.f266737c;
                if (concurrentHashMap.containsKey(str2)) {
                    C92687b bVar = ForwardReport.f266736b.get(concurrentHashMap.get(str2));
                    if (bVar != null) {
                        bVar.mo126749a(ForwardReport.f266735a.mo126745b(f4Var, z2, str));
                        ((C61212e) C86312j.m106911c(cls)).oh0(bVar.f266743a, bVar.f266744b, bVar.f266745c, 27921, false);
                    }
                } else if (concurrentHashMap.containsKey(str)) {
                    C92687b bVar2 = ForwardReport.f266736b.get(concurrentHashMap.get(str));
                    if (bVar2 != null) {
                        bVar2.mo126749a(ForwardReport.f266735a.mo126745b(f4Var, z2, str));
                        ((C61212e) C86312j.m106911c(cls)).oh0(bVar2.f266743a, bVar2.f266744b, bVar2.f266745c, 27921, false);
                    }
                    str2 = str;
                }
                str = str2;
                str2 = str;
            }
            ConcurrentHashMap<String, Long> concurrentHashMap2 = ForwardReport.f266737c;
            if (concurrentHashMap2.containsKey(str2)) {
                concurrentHashMap2.remove(str2);
            }
        }
    }
}
