package com.tencent.mapsdk.internal;

import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.tencent.map.tools.EncryptAesUtils;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Response;
import com.tencent.mapsdk.internal.C114139rf;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent;
import java.io.File;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.tencent.mapsdk.internal.rg */
public final class C114141rg implements C114016om {

    /* renamed from: a */
    public static final String f341661a = "d8ab2f7b7a7536a71894084e1c812fd0";

    /* renamed from: b */
    public static final IvParameterSpec f341662b = new IvParameterSpec("c0ab1f54he78k36d".getBytes());

    /* renamed from: c */
    public static int f341663c = 0;

    /* renamed from: d */
    public static int f341664d = 1;

    /* renamed from: e */
    public static int f341665e = 2;

    /* renamed from: f */
    public volatile boolean f341666f;

    /* renamed from: g */
    public volatile boolean f341667g;

    /* renamed from: h */
    public volatile boolean f341668h;

    /* renamed from: i */
    public C114139rf f341669i;

    /* renamed from: j */
    public final C114142a f341670j = new C114142a();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C113961mq f341671k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final SparseArray<C114137rd> f341672l = new SparseArray<>(32);

    /* renamed from: m */
    private String f341673m;

    /* renamed from: n */
    private C113636ds f341674n;

    /* renamed from: com.tencent.mapsdk.internal.rg$a */
    public class C114142a extends Thread {

        /* renamed from: b */
        private static final int f341675b = 60000;

        public C114142a() {
            setName("tms-traffic");
            boolean unused = C114141rg.this.f341667g = false;
            boolean unused2 = C114141rg.this.f341668h = false;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0127 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
            L_0x0000:
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                boolean r0 = r0.f341668h
                if (r0 != 0) goto L_0x012c
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                boolean r0 = r0.f341666f
                if (r0 == 0) goto L_0x012c
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                boolean r0 = r0.f341667g
                if (r0 != 0) goto L_0x0119
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                com.tencent.mapsdk.internal.mq r0 = r0.f341671k
                r1 = 1
                if (r0 != 0) goto L_0x0027
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                boolean unused = r0.f341668h = r1
                goto L_0x0000
            L_0x0027:
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                com.tencent.mapsdk.internal.mq r0 = r0.f341671k
                com.tencent.mapsdk.internal.v r0 = r0.f340912t
                float r0 = r0.mo173058a()
                int r0 = (int) r0
                com.tencent.mapsdk.internal.rg r2 = com.tencent.mapsdk.internal.C114141rg.this
                com.tencent.mapsdk.internal.mq r2 = r2.f341671k
                com.tencent.mapsdk.internal.es r2 = r2.f340906n
                com.tencent.tencentmap.mapsdk.maps.model.LatLng[] r2 = r2.mo172031a()
                com.tencent.mapsdk.internal.rg r3 = com.tencent.mapsdk.internal.C114141rg.this
                android.util.SparseArray r3 = r3.f341672l
                java.lang.Object r3 = r3.get(r0)
                com.tencent.mapsdk.internal.rd r3 = (com.tencent.mapsdk.internal.C114137rd) r3
                r4 = 0
                r5 = 0
                r6 = 60000(0xea60, double:2.9644E-319)
                if (r3 == 0) goto L_0x008c
                java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> r8 = r3.f341652c
                if (r8 == 0) goto L_0x008c
                long r8 = android.os.SystemClock.elapsedRealtime()
                long r10 = r3.f341650a
                long r8 = r8 - r10
                int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r10 > 0) goto L_0x008c
                com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds r8 = r3.f341651b
                r9 = r2[r5]
                boolean r8 = r8.contains((com.tencent.tencentmap.mapsdk.maps.model.LatLng) r9)
                if (r8 == 0) goto L_0x008c
                com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds r8 = r3.f341651b
                r9 = r2[r1]
                boolean r8 = r8.contains((com.tencent.tencentmap.mapsdk.maps.model.LatLng) r9)
                if (r8 == 0) goto L_0x008c
                com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds r8 = r3.f341651b
                r9 = 2
                r9 = r2[r9]
                boolean r8 = r8.contains((com.tencent.tencentmap.mapsdk.maps.model.LatLng) r9)
                if (r8 == 0) goto L_0x008c
                com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds r8 = r3.f341651b
                r9 = 3
                r2 = r2[r9]
                boolean r2 = r8.contains((com.tencent.tencentmap.mapsdk.maps.model.LatLng) r2)
                if (r2 != 0) goto L_0x0092
            L_0x008c:
                com.tencent.mapsdk.internal.rg r2 = com.tencent.mapsdk.internal.C114141rg.this
                com.tencent.mapsdk.internal.rd r4 = com.tencent.mapsdk.internal.C114141rg.m159296a((com.tencent.mapsdk.internal.C114141rg) r2, (int) r0)
            L_0x0092:
                if (r4 == 0) goto L_0x0098
                java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> r2 = r4.f341652c
                if (r2 != 0) goto L_0x0099
            L_0x0098:
                r4 = r3
            L_0x0099:
                com.tencent.mapsdk.internal.rg r2 = com.tencent.mapsdk.internal.C114141rg.this
                android.util.SparseArray r2 = r2.f341672l
                r2.put(r0, r4)
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                if (r4 == 0) goto L_0x0108
                java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> r2 = r4.f341652c
                if (r2 != 0) goto L_0x00ab
                goto L_0x0108
            L_0x00ab:
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x00b7
                com.tencent.mapsdk.internal.rf r0 = r0.f341669i
                r0.mo172769a()
                goto L_0x0108
            L_0x00b7:
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                if (r3 == 0) goto L_0x0108
                java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> r8 = r3.f341652c
                if (r8 == 0) goto L_0x0108
                boolean r8 = r8.isEmpty()
                if (r8 != 0) goto L_0x0108
                java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> r3 = r3.f341652c
                java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> r8 = r4.f341652c
                java.util.Iterator r3 = r3.iterator()
            L_0x00d0:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L_0x0103
                java.lang.Object r9 = r3.next()
                com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail r9 = (com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail) r9
                java.util.Iterator r10 = r8.iterator()
            L_0x00e0:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x00fc
                java.lang.Object r11 = r10.next()
                com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail r11 = (com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail) r11
                com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic r11 = r11.basic
                java.lang.String r11 = r11.eventid
                com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic r12 = r9.basic
                java.lang.String r12 = r12.eventid
                boolean r11 = r11.equals(r12)
                if (r11 == 0) goto L_0x00e0
                r10 = 1
                goto L_0x00fd
            L_0x00fc:
                r10 = 0
            L_0x00fd:
                if (r10 != 0) goto L_0x00d0
                r2.add(r9)
                goto L_0x00d0
            L_0x0103:
                com.tencent.mapsdk.internal.rf r0 = r0.f341669i
                r0.mo172772b(r2)
            L_0x0108:
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                r0.mo172774a((com.tencent.mapsdk.internal.C114137rd) r4)
                monitor-enter(r13)
                r13.wait(r6)     // Catch:{ InterruptedException -> 0x0114 }
                goto L_0x0114
            L_0x0112:
                r0 = move-exception
                goto L_0x0117
            L_0x0114:
                monitor-exit(r13)     // Catch:{ all -> 0x0112 }
                goto L_0x0000
            L_0x0117:
                monitor-exit(r13)     // Catch:{ all -> 0x0112 }
                throw r0
            L_0x0119:
                java.lang.String r0 = "TTE"
                java.lang.String r1 = "traffic event tobe paused!"
                com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r0, (java.lang.String) r1)
                monitor-enter(r13)
                r13.wait()     // Catch:{ InterruptedException -> 0x0127 }
                goto L_0x0127
            L_0x0125:
                r0 = move-exception
                goto L_0x012a
            L_0x0127:
                monitor-exit(r13)     // Catch:{ all -> 0x0125 }
                goto L_0x0000
            L_0x012a:
                monitor-exit(r13)     // Catch:{ all -> 0x0125 }
                throw r0
            L_0x012c:
                java.lang.String r0 = "TTE"
                java.lang.String r1 = "traffic event tobe destroyed!"
                com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r0, (java.lang.String) r1)
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                com.tencent.mapsdk.internal.rf r0 = r0.f341669i
                if (r0 == 0) goto L_0x014d
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                com.tencent.mapsdk.internal.rf r0 = r0.f341669i
                r0.mo172771b()
                com.tencent.mapsdk.internal.rg r0 = com.tencent.mapsdk.internal.C114141rg.this
                android.util.SparseArray r0 = r0.f341672l
                r0.clear()
            L_0x014d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114141rg.C114142a.run():void");
        }
    }

    public C114141rg(C113961mq mqVar) {
        this.f341671k = mqVar;
        mqVar.mo172435a((C114016om) this);
        this.f341669i = new C114139rf(this.f341671k.f340903k);
        C113959ml a = C113959ml.m157965a(mqVar.getContext(), (TencentMapOptions) null);
        C113886kg.m157518a(a.f340851d);
        this.f341673m = a.f340851d;
        this.f341674n = (C113636ds) C113601cl.m156511a(C113636ds.class);
    }

    /* renamed from: h */
    public final void mo172578h() {
    }

    /* renamed from: i */
    public final void mo172579i() {
        synchronized (this.f341670j) {
            this.f341670j.notifyAll();
        }
    }

    /* renamed from: b */
    private void m159304b() {
        this.f341667g = true;
    }

    /* renamed from: c */
    private void m159306c() {
        this.f341668h = true;
        this.f341666f = false;
        synchronized (this.f341670j) {
            this.f341670j.notifyAll();
        }
    }

    /* renamed from: a */
    private void m159300a(boolean z) {
        this.f341666f = z;
        if (z) {
            try {
                synchronized (this.f341670j) {
                    this.f341670j.start();
                }
            } catch (Exception unused) {
            }
        } else {
            this.f341666f = false;
            synchronized (this.f341670j) {
                this.f341670j.notifyAll();
            }
        }
    }

    /* renamed from: b */
    private C114137rd m159303b(int i) {
        byte[] bArr;
        C113961mq mqVar = this.f341671k;
        if (mqVar != null && (mqVar.mo172414F() == null || !this.f341671k.mo172414F().f339862e)) {
            C113889km.m157550c(C0949kl.f2243m, "traffic event tobe fetch data from net!");
            C113961mq mqVar2 = this.f341671k;
            Rect rect = mqVar2.f340907o;
            LatLng a = mqVar2.f340906n.mo172028a(new PointF((float) (rect.width() * -2), (float) (rect.height() * 3)));
            LatLng a2 = this.f341671k.f340906n.mo172028a(new PointF((float) (rect.width() * 3), (float) (rect.height() * -2)));
            LatLng a3 = C113883ke.m157466a(this.f341671k.f340912t.f342794m);
            NetResponse mapTrafficEvent = ((C113619de) this.f341674n.mo171932h()).mapTrafficEvent(URLEncoder.encode(EncryptAesUtils.encryptAes256Base64("lblat=" + a.latitude + "&lblon=" + a.longitude + "&rtlat=" + a2.latitude + "&rtlon=" + a2.longitude + "&zoom=" + i + "&suid=" + C113798hb.m157085d() + "&version=" + C113798hb.m157096m() + "&nt=" + C113798hb.m157090g() + "&location=" + a3.latitude + "," + a3.longitude, f341661a, f341662b)));
            if (mapTrafficEvent == null || (bArr = mapTrafficEvent.data) == null) {
                StringBuilder sb = new StringBuilder("rsp = ");
                sb.append(mapTrafficEvent != null ? Integer.valueOf(mapTrafficEvent.statusCode) : "null");
                C113889km.m157550c("net", sb.toString());
            } else {
                C113953m mVar = new C113953m(bArr);
                mVar.mo172380a("UTF-8");
                Response response = new Response();
                response.readFrom(mVar);
                if (response.error != 0 || response.detail == null) {
                    return null;
                }
                return new C114137rd(new LatLngBounds.Builder().include(a).include(a2).build(), response.detail);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m159297a() {
        this.f341667g = false;
        synchronized (this.f341670j) {
            this.f341670j.notifyAll();
        }
    }

    /* renamed from: a */
    private C114137rd m159295a(int i, LatLng latLng, LatLng latLng2, LatLng latLng3) {
        byte[] bArr;
        NetResponse mapTrafficEvent = ((C113619de) this.f341674n.mo171932h()).mapTrafficEvent(URLEncoder.encode(EncryptAesUtils.encryptAes256Base64("lblat=" + latLng.latitude + "&lblon=" + latLng.longitude + "&rtlat=" + latLng2.latitude + "&rtlon=" + latLng2.longitude + "&zoom=" + i + "&suid=" + C113798hb.m157085d() + "&version=" + C113798hb.m157096m() + "&nt=" + C113798hb.m157090g() + "&location=" + latLng3.latitude + "," + latLng3.longitude, f341661a, f341662b)));
        if (mapTrafficEvent == null || (bArr = mapTrafficEvent.data) == null) {
            StringBuilder sb = new StringBuilder("rsp = ");
            sb.append(mapTrafficEvent != null ? Integer.valueOf(mapTrafficEvent.statusCode) : "null");
            C113889km.m157550c("net", sb.toString());
            return null;
        }
        C113953m mVar = new C113953m(bArr);
        mVar.mo172380a("UTF-8");
        Response response = new Response();
        response.readFrom(mVar);
        if (response.error != 0 || response.detail == null) {
            return null;
        }
        return new C114137rd(new LatLngBounds.Builder().include(latLng).include(latLng2).build(), response.detail);
    }

    /* renamed from: a */
    private void m159298a(C114137rd rdVar, C114137rd rdVar2) {
        List<Detail> list;
        List<Detail> list2;
        if (rdVar2 != null && (list = rdVar2.f341652c) != null) {
            if (list.isEmpty()) {
                this.f341669i.mo172769a();
                return;
            }
            LinkedList linkedList = new LinkedList();
            if (rdVar != null && (list2 = rdVar.f341652c) != null && !list2.isEmpty()) {
                List<Detail> list3 = rdVar.f341652c;
                List<Detail> list4 = rdVar2.f341652c;
                for (Detail next : list3) {
                    boolean z = false;
                    Iterator<Detail> it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().basic.eventid.equals(next.basic.eventid)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!z) {
                        linkedList.add(next);
                    }
                }
                this.f341669i.mo172772b(linkedList);
            }
        }
    }

    /* renamed from: a */
    public final void mo172774a(C114137rd rdVar) {
        List<Detail> list;
        int i;
        byte[] bArr;
        byte[] bArr2;
        C113792gv gvVar;
        if (rdVar != null && (list = rdVar.f341652c) != null && !list.isEmpty()) {
            C113961mq mqVar = this.f341671k;
            if (!(mqVar == null || (gvVar = mqVar.f339861d) == null)) {
                gvVar.mo172159f().f340425a++;
            }
            for (Detail detail : rdVar.f341652c) {
                String str = detail.basic.icon_normal;
                int lastIndexOf = str.lastIndexOf("/");
                if (lastIndexOf != -1 && (i = lastIndexOf + 1) <= str.length()) {
                    String substring = str.substring(i);
                    if (C104548ha.f309920b.mo147862a(substring) == null) {
                        File file = new File(this.f341673m, substring);
                        if (!file.exists()) {
                            NetResponse doGet = NetManager.getInstance().builder().url(str).doGet();
                            if (!(doGet == null || (bArr2 = doGet.data) == null)) {
                                C113884kf.m157491a(file, bArr2);
                                bArr = doGet.data;
                            }
                        } else {
                            bArr = C113884kf.m157503c(file);
                        }
                        if (bArr != null && bArr.length > 0) {
                            C104548ha.f309920b.mo147863a(substring, BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                        }
                    }
                }
            }
            this.f341669i.mo172770a(rdVar.f341652c);
        }
    }

    /* renamed from: a */
    private void m159299a(List<Detail> list) {
        int i;
        byte[] bArr;
        byte[] bArr2;
        for (Detail detail : list) {
            String str = detail.basic.icon_normal;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1 && (i = lastIndexOf + 1) <= str.length()) {
                String substring = str.substring(i);
                if (C104548ha.f309920b.mo147862a(substring) == null) {
                    File file = new File(this.f341673m, substring);
                    if (!file.exists()) {
                        NetResponse doGet = NetManager.getInstance().builder().url(str).doGet();
                        if (!(doGet == null || (bArr2 = doGet.data) == null)) {
                            C113884kf.m157491a(file, bArr2);
                            bArr = doGet.data;
                        }
                    } else {
                        bArr = C113884kf.m157503c(file);
                    }
                    if (bArr != null && bArr.length > 0) {
                        C104548ha.f309920b.mo147863a(substring, BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final TrafficEvent mo172773a(int i) {
        C114139rf rfVar = this.f341669i;
        if (rfVar == null) {
            return null;
        }
        for (String str : rfVar.f341657a.keySet()) {
            C114139rf.C114140a aVar = this.f341669i.f341657a.get(str);
            if (aVar != null && aVar.f341659a.mo172502a() == i) {
                return new C114138re(aVar.f341660b);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ C114137rd m159296a(C114141rg rgVar, int i) {
        byte[] bArr;
        C113961mq mqVar = rgVar.f341671k;
        if (mqVar != null && (mqVar.mo172414F() == null || !rgVar.f341671k.mo172414F().f339862e)) {
            C113889km.m157550c(C0949kl.f2243m, "traffic event tobe fetch data from net!");
            C113961mq mqVar2 = rgVar.f341671k;
            Rect rect = mqVar2.f340907o;
            LatLng a = mqVar2.f340906n.mo172028a(new PointF((float) (rect.width() * -2), (float) (rect.height() * 3)));
            LatLng a2 = rgVar.f341671k.f340906n.mo172028a(new PointF((float) (rect.width() * 3), (float) (rect.height() * -2)));
            LatLng a3 = C113883ke.m157466a(rgVar.f341671k.f340912t.f342794m);
            NetResponse mapTrafficEvent = ((C113619de) rgVar.f341674n.mo171932h()).mapTrafficEvent(URLEncoder.encode(EncryptAesUtils.encryptAes256Base64("lblat=" + a.latitude + "&lblon=" + a.longitude + "&rtlat=" + a2.latitude + "&rtlon=" + a2.longitude + "&zoom=" + i + "&suid=" + C113798hb.m157085d() + "&version=" + C113798hb.m157096m() + "&nt=" + C113798hb.m157090g() + "&location=" + a3.latitude + "," + a3.longitude, f341661a, f341662b)));
            if (mapTrafficEvent == null || (bArr = mapTrafficEvent.data) == null) {
                StringBuilder sb = new StringBuilder("rsp = ");
                sb.append(mapTrafficEvent != null ? Integer.valueOf(mapTrafficEvent.statusCode) : "null");
                C113889km.m157550c("net", sb.toString());
            } else {
                C113953m mVar = new C113953m(bArr);
                mVar.mo172380a("UTF-8");
                Response response = new Response();
                response.readFrom(mVar);
                if (response.error != 0 || response.detail == null) {
                    return null;
                }
                return new C114137rd(new LatLngBounds.Builder().include(a).include(a2).build(), response.detail);
            }
        }
        return null;
    }
}
