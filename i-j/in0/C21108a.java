package in0;

import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: in0.a */
public abstract class C21108a implements C87761e {

    /* renamed from: a */
    public int f59681a = 0;

    /* renamed from: b */
    public volatile boolean f59682b;

    /* renamed from: c */
    public d$$i f59683c;

    /* renamed from: d */
    public d$$g f59684d;

    /* renamed from: e */
    public d$$j f59685e;

    /* renamed from: f */
    public d$$d f59686f;

    /* renamed from: g */
    public d$$k f59687g;

    /* renamed from: h */
    public d$$c f59688h;

    /* renamed from: i */
    public d$$l f59689i;

    /* renamed from: j */
    public d$$f f59690j;

    /* renamed from: k */
    public d$$h f59691k;

    /* renamed from: l */
    public final Set<d$$j> f59692l = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: m */
    public final Set<d$$k> f59693m = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: n */
    public final Set<d$$d> f59694n = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r0.mo17992a(java.lang.Boolean.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = r2.f59691k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0 == null) goto L_?;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32882A(boolean r3) {
        /*
            r2 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.BaseMediaPlayer"
            java.lang.String r1 = "notifyOnHitPreloadChange"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            monitor-enter(r2)
            boolean r0 = r2.f59682b     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x000e:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            in0.d$$h r0 = r2.f59691k
            if (r0 == 0) goto L_0x001a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.mo17992a(r3)
        L_0x001a:
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: in0.C21108a.mo32882A(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0.mo17984a(r6, r7, r8) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = r6.f59683c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0 == null) goto L_?;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo32883B(int r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.BaseMediaPlayer"
            java.lang.String r1 = "notifyOnInfo, what:%d, extra:%d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5 = 1
            r2[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            monitor-enter(r6)
            boolean r0 = r6.f59682b     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            return r4
        L_0x001f:
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            in0.d$$i r0 = r6.f59683c
            if (r0 == 0) goto L_0x002b
            boolean r7 = r0.mo17984a(r6, r7, r8)
            if (r7 == 0) goto L_0x002b
            r4 = 1
        L_0x002b:
            return r4
        L_0x002c:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: in0.C21108a.mo32883B(int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r0.mo17986a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = r2.f59692l.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r0.hasNext() == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r0.next().mo17986a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = r2.f59685e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32884C() {
        /*
            r2 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.BaseMediaPlayer"
            java.lang.String r1 = "notifyOnPrepared"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            monitor-enter(r2)
            boolean r0 = r2.f59682b     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return
        L_0x000e:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            in0.d$$j r0 = r2.f59685e
            if (r0 == 0) goto L_0x0016
            r0.mo17986a(r2)
        L_0x0016:
            java.util.Set<in0.d$$j> r0 = r2.f59692l
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()
            in0.d$$j r1 = (in0.d$$j) r1
            r1.mo17986a(r2)
            goto L_0x001c
        L_0x002c:
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in0.C21108a.mo32884C():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r0.mo17988a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = r2.f59693m.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r0.hasNext() == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r0.next().mo17988a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = r2.f59687g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22527D() {
        /*
            r2 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.BaseMediaPlayer"
            java.lang.String r1 = "notifyOnSeekComplete"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            monitor-enter(r2)
            boolean r0 = r2.f59682b     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return
        L_0x000e:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            in0.d$$k r0 = r2.f59687g
            if (r0 == 0) goto L_0x0016
            r0.mo17988a(r2)
        L_0x0016:
            java.util.Set<in0.d$$k> r0 = r2.f59693m
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()
            in0.d$$k r1 = (in0.d$$k) r1
            r1.mo17988a(r2)
            goto L_0x001c
        L_0x002c:
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in0.C21108a.mo22527D():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r0.mo17989a(r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = r5.f59689i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0 == null) goto L_?;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32885E(int r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.BaseMediaPlayer"
            java.lang.String r1 = "notifyOnVideoSizeChanged, width:%d, height:%d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = 1
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            monitor-enter(r5)
            boolean r0 = r5.f59682b     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r5)     // Catch:{ all -> 0x0028 }
            return
        L_0x001f:
            monitor-exit(r5)     // Catch:{ all -> 0x0028 }
            in0.d$$l r0 = r5.f59689i
            if (r0 == 0) goto L_0x0027
            r0.mo17989a(r5, r6, r7)
        L_0x0027:
            return
        L_0x0028:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0028 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: in0.C21108a.mo32885E(int, int):void");
    }

    /* renamed from: c */
    public void mo22576c(d$$d d__d) {
        this.f59686f = d__d;
    }

    /* renamed from: e */
    public void mo22535e(double d) {
        mo32891z(-1010, -1010);
    }

    /* renamed from: f */
    public void mo32886f(d$$k d__k) {
        this.f59693m.add(d__k);
    }

    /* renamed from: g */
    public void mo22577g(String str, String str2, int i) {
        mo22534d(str, str2);
    }

    public int getState() {
        return this.f59681a;
    }

    /* renamed from: h */
    public void mo22541h(String str, int i) {
        setDataSource(str);
    }

    /* renamed from: i */
    public void mo22579i(d$$i d__i) {
        this.f59683c = d__i;
    }

    /* renamed from: j */
    public void mo32887j(d$$j d__j) {
        this.f59692l.add(d__j);
    }

    /* renamed from: k */
    public void mo32888k(d$$d d__d) {
        this.f59694n.add(d__d);
    }

    /* renamed from: m */
    public void mo22580m(String str, String str2, d$$e d__e) {
        mo22534d(str, str2);
        if (d__e != null) {
            ((AbstractVideoTextureView.C18007f) d__e).mo22447a();
        }
    }

    /* renamed from: n */
    public void mo22581n(d$$f d__f) {
        this.f59690j = d__f;
    }

    /* renamed from: p */
    public void mo22582p(d$$h d__h) {
        this.f59691k = d__h;
    }

    /* renamed from: q */
    public void mo22583q(d$$g d__g) {
        this.f59684d = d__g;
    }

    /* renamed from: r */
    public void mo22547r(String str, String str2, String str3, boolean z) {
        mo32891z(-1010, -1010);
    }

    public void release() {
        this.f59682b = true;
    }

    /* renamed from: s */
    public void mo22584s(d$$c d__c) {
        this.f59688h = d__c;
    }

    /* renamed from: t */
    public void mo22585t(d$$l d__l) {
        this.f59689i = d__l;
    }

    /* renamed from: u */
    public void mo22586u(d$$j d__j) {
        this.f59685e = d__j;
    }

    /* renamed from: v */
    public void mo22587v(d$$k d__k) {
        this.f59687g = d__k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0008, code lost:
        r0 = r1.f59688h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0.mo17990a(r1, r2);
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22556w(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f59682b     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            return
        L_0x0007:
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            in0.d$$c r0 = r1.f59688h
            if (r0 == 0) goto L_0x000f
            r0.mo17990a(r1, r2)
        L_0x000f:
            return
        L_0x0010:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: in0.C21108a.mo22556w(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r0.mo17987a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = r2.f59694n.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r0.hasNext() == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r0.next().mo17987a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = r2.f59686f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32889x() {
        /*
            r2 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.BaseMediaPlayer"
            java.lang.String r1 = "notifyOnCompletion"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            monitor-enter(r2)
            boolean r0 = r2.f59682b     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return
        L_0x000e:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            in0.d$$d r0 = r2.f59686f
            if (r0 == 0) goto L_0x0016
            r0.mo17987a(r2)
        L_0x0016:
            java.util.Set<in0.d$$d> r0 = r2.f59694n
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()
            in0.d$$d r1 = (in0.d$$d) r1
            r1.mo17987a(r2)
            goto L_0x001c
        L_0x002c:
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in0.C21108a.mo32889x():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0.mo17991a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r0 = r4.f59690j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 == null) goto L_?;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32890y(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.BaseMediaPlayer"
            java.lang.String r1 = "notifyOnDownStreamChanged, selectIndex:%s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            monitor-enter(r4)
            boolean r0 = r4.f59682b     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            return
        L_0x0014:
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            in0.d$$f r0 = r4.f59690j
            if (r0 == 0) goto L_0x001c
            r0.mo17991a(r5)
        L_0x001c:
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: in0.C21108a.mo32890y(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0.mo17985a(r6, r7, r8) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = r6.f59684d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0 == null) goto L_?;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo32891z(int r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.BaseMediaPlayer"
            java.lang.String r1 = "notifyOnError, what:%d, extra:%d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5 = 1
            r2[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            monitor-enter(r6)
            boolean r0 = r6.f59682b     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            return r4
        L_0x001f:
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            in0.d$$g r0 = r6.f59684d
            if (r0 == 0) goto L_0x002b
            boolean r7 = r0.mo17985a(r6, r7, r8)
            if (r7 == 0) goto L_0x002b
            r4 = 1
        L_0x002b:
            return r4
        L_0x002c:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: in0.C21108a.mo32891z(int, int):boolean");
    }
}
