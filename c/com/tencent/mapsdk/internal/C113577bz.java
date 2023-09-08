package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.sdk.comps.offlinemap.OfflineItem;
import com.tencent.map.sdk.comps.offlinemap.OfflineItemController;
import com.tencent.map.sdk.comps.offlinemap.OfflineStatus;
import com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/* renamed from: com.tencent.mapsdk.internal.bz */
final class C113577bz implements OfflineItemController {

    /* renamed from: a */
    public OfflineStatusChangedListener f339908a;

    /* renamed from: b */
    public C113581a f339909b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C113955mh f339910c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C113584ca f339911d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final OfflineItem f339912e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f339913f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final File f339914g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final File f339915h;

    /* renamed from: i */
    private final File f339916i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f339917j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C113934lj f339918k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C113582b f339919l = new C113582b(this, (byte) 0);

    /* renamed from: m */
    private boolean f339920m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C113565bo f339921n;

    /* renamed from: com.tencent.mapsdk.internal.bz$a */
    public interface C113581a {
        /* renamed from: a */
        void mo171880a(OfflineItem offlineItem, int i);

        /* renamed from: a */
        void mo171881a(OfflineItem offlineItem, boolean z);

        /* renamed from: b */
        void mo171882b(OfflineItem offlineItem, boolean z);
    }

    /* renamed from: com.tencent.mapsdk.internal.bz$b */
    public class C113582b extends C113940ll implements C113933li {

        /* renamed from: c */
        private C113939lk f339926c;

        /* renamed from: d */
        private File f339927d;

        private C113582b() {
        }

        /* renamed from: a */
        public final void mo171884a(String str) {
            String e = C113577bz.this.f339913f;
            this.f339927d = new File(e, this.f340817b + ".tmp");
            C113889km.m157550c(C0949kl.f2251u, "开始下载:[" + this.f339927d + "]");
            if (C113577bz.this.f339908a != null) {
                C113577bz.this.f339908a.onStatusChanged(C113577bz.this.f339912e, OfflineStatus.START);
            }
        }

        /* renamed from: b */
        public final void mo171886b(String str) {
            if (this.f339927d != null) {
                C113889km.m157553d(C0949kl.f2251u, "取消下载:[" + this.f339927d + "]");
                C113884kf.m157500b(this.f339927d);
            }
            if (C113577bz.this.f339908a != null) {
                C113577bz.this.f339908a.onStatusChanged(C113577bz.this.f339912e, OfflineStatus.CANCEL);
            }
        }

        /* renamed from: c */
        public final void mo171887c(String str) {
            File file = this.f339927d;
            if (file != null && file.exists()) {
                C113889km.m157550c(C0949kl.f2251u, "完成下载:[" + this.f339927d + "]");
                C113889km.m157550c(C0949kl.f2251u, "创建城市缓存文件:[" + C113577bz.this.f339915h + "]");
                C113884kf.m157500b(C113577bz.this.f339915h);
                C113884kf.m157490a(this.f339927d, C113577bz.this.f339914g);
                C113577bz.this.m156388a();
                if (!C113577bz.this.f339915h.exists()) {
                    C113889km.m157553d(C0949kl.f2251u, "缓存文件创建失败！");
                    return;
                }
                C113889km.m157550c(C0949kl.f2251u, "解压成功:[" + C113577bz.this.f339915h + "]");
                C113584ca h = C113577bz.this.f339911d;
                C113955mh i = C113577bz.this.f339910c;
                if (i != null) {
                    i.mo172395a(h.f339935c + "-md5", h.f339934b);
                    i.mo172393a(h.f339935c + "-version", h.f339937e);
                }
                C113889km.m157550c(C0949kl.f2251u, "保持城市缓存信息:[" + h + "]");
                C113577bz.this.f339918k.mo172362b((C113933li) C113577bz.this.f339919l);
                if (C113577bz.this.f339909b != null) {
                    C113577bz.this.f339909b.mo171880a(C113577bz.this.f339912e, 100);
                    C113577bz.this.f339909b.mo171882b(C113577bz.this.f339912e, false);
                }
                if (C113577bz.this.f339908a != null) {
                    C113577bz.this.f339908a.onStatusChanged(C113577bz.this.f339912e, OfflineStatus.COMPLETED);
                }
            }
        }

        /* renamed from: d */
        public final void mo171888d(String str) {
            if (this.f339927d != null) {
                C113889km.m157553d(C0949kl.f2251u, "缓存文件下载失败！");
                C113884kf.m157500b(this.f339927d);
            }
            if (C113577bz.this.f339908a != null) {
                C113577bz.this.f339908a.onStatusChanged(C113577bz.this.f339912e, OfflineStatus.ERROR);
            }
        }

        public /* synthetic */ C113582b(C113577bz bzVar, byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo171885a(String str, byte[] bArr) {
            File file;
            if (!TextUtils.isEmpty(str) && str.equals(C113577bz.this.f339917j) && bArr != null) {
                if (this.f339926c == C113939lk.RUNNING && (file = this.f339927d) != null) {
                    int length = (int) ((file.length() * 100) / ((long) C113577bz.this.f339911d.f339936d));
                    if (C113577bz.this.f339909b != null) {
                        C113577bz.this.f339909b.mo171880a(C113577bz.this.f339912e, length);
                    }
                    C113889km.m157550c(C0949kl.f2251u, "缓存文件下载中:：length: " + this.f339927d.length() + "：" + length + "%");
                    C113884kf.m157499b(this.f339927d, bArr);
                }
                if (C113577bz.this.f339908a != null) {
                    C113577bz.this.f339908a.onStatusChanged(C113577bz.this.f339912e, OfflineStatus.DOWNLOADING);
                }
            }
        }

        /* renamed from: a */
        public final void mo171883a(C113939lk lkVar) {
            C113889km.m157550c(C0949kl.f2251u, "下载状态：".concat(String.valueOf(lkVar)));
            this.f339926c = lkVar;
        }
    }

    public C113577bz(C113565bo boVar, String str, OfflineItem offlineItem, C113584ca caVar, C113955mh mhVar, OfflineStatusChangedListener offlineStatusChangedListener) {
        this.f339921n = boVar;
        this.f339910c = mhVar;
        this.f339912e = offlineItem;
        this.f339911d = caVar;
        this.f339908a = offlineStatusChangedListener;
        C113934lj ljVar = new C113934lj();
        this.f339918k = ljVar;
        ljVar.f340794b = C113802hg.m157155d();
        this.f339913f = str;
        this.f339914g = new File(str, caVar.f339935c + ".zip");
        this.f339915h = new File(str, caVar.mo171904a());
        this.f339916i = new File(C113959ml.m157965a(boVar.getContext(), (TencentMapOptions) null).mo172407d(), caVar.mo171904a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean checkInvalidate() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.tencent.mapsdk.internal.ca r0 = r7.f339911d     // Catch:{ all -> 0x00b8 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00ac
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r3.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = r0.f339933a     // Catch:{ all -> 0x00b8 }
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = java.io.File.separator     // Catch:{ all -> 0x00b8 }
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = r0.f339935c     // Catch:{ all -> 0x00b8 }
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            int r4 = r0.f339937e     // Catch:{ all -> 0x00b8 }
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = ".zip"
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b8 }
            r7.f339917j = r3     // Catch:{ all -> 0x00b8 }
            com.tencent.mapsdk.internal.mh r3 = r7.f339910c     // Catch:{ all -> 0x00b8 }
            if (r3 == 0) goto L_0x006e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r4.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = r0.f339935c     // Catch:{ all -> 0x00b8 }
            r4.append(r5)     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = "-md5"
            r4.append(r5)     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = r3.mo172391a((java.lang.String) r4)     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r5.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r6 = r0.f339935c     // Catch:{ all -> 0x00b8 }
            r5.append(r6)     // Catch:{ all -> 0x00b8 }
            java.lang.String r6 = "-version"
            r5.append(r6)     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00b8 }
            r6 = -1
            int r3 = r3.mo172398b((java.lang.String) r5, (int) r6)     // Catch:{ all -> 0x00b8 }
            int r5 = r0.f339937e     // Catch:{ all -> 0x00b8 }
            if (r5 != r3) goto L_0x006c
            if (r4 == 0) goto L_0x006e
            java.lang.String r0 = r0.f339934b     // Catch:{ all -> 0x00b8 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x006e
        L_0x006c:
            r0 = 1
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            java.lang.String r3 = "OM"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = "检查是否需要更新:["
            r4.<init>(r5)     // Catch:{ all -> 0x00b8 }
            r4.append(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = "]"
            r4.append(r5)     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00b8 }
            com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x00aa
            boolean r3 = r7.f339920m     // Catch:{ all -> 0x00b8 }
            if (r3 != 0) goto L_0x00aa
            java.io.File r3 = r7.f339915h     // Catch:{ all -> 0x00b8 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00b8 }
            if (r3 != 0) goto L_0x00aa
            java.io.File r0 = r7.f339914g     // Catch:{ all -> 0x00b8 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00ad
            r7.m156388a()     // Catch:{ all -> 0x00b8 }
            java.io.File r0 = r7.f339915h     // Catch:{ all -> 0x00b8 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00aa:
            r1 = r0
            goto L_0x00ad
        L_0x00ac:
            r1 = 0
        L_0x00ad:
            com.tencent.mapsdk.internal.bz$a r0 = r7.f339909b     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00b6
            com.tencent.map.sdk.comps.offlinemap.OfflineItem r2 = r7.f339912e     // Catch:{ all -> 0x00b8 }
            r0.mo171882b(r2, r1)     // Catch:{ all -> 0x00b8 }
        L_0x00b6:
            monitor-exit(r7)
            return r1
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113577bz.checkInvalidate():boolean");
    }

    public final boolean close() {
        return mo171877b(this.f339921n);
    }

    public final boolean open() {
        return mo171876a(this.f339921n);
    }

    public final boolean removeCache() {
        boolean b = C113884kf.m157500b(this.f339914g);
        C113889km.m157550c(C0949kl.f2251u, "删除[" + this.f339911d.f339935c + "]离线缓存");
        return b;
    }

    public final void startDownload() {
        if (this.f339921n == null) {
            OfflineStatusChangedListener offlineStatusChangedListener = this.f339908a;
            if (offlineStatusChangedListener != null) {
                offlineStatusChangedListener.onStatusChanged(this.f339912e, OfflineStatus.ERROR);
            }
        } else if (this.f339914g.exists()) {
            C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
                /* renamed from: a */
                private Boolean m156407a() {
                    C113577bz bzVar = C113577bz.this;
                    return Boolean.valueOf(bzVar.mo171876a(bzVar.f339921n));
                }

                public final /* synthetic */ Object call() {
                    C113577bz bzVar = C113577bz.this;
                    return Boolean.valueOf(bzVar.mo171876a(bzVar.f339921n));
                }
            }).mo172278a(new C113865kb.C113868a<Boolean>() {
                /* renamed from: a */
                private void m156406a(Boolean bool) {
                    if (!bool.booleanValue()) {
                        C113577bz.this.startDownload();
                    } else if (C113577bz.this.f339908a != null) {
                        C113577bz.this.f339908a.onStatusChanged(C113577bz.this.f339912e, OfflineStatus.COMPLETED);
                    }
                }

                public final /* synthetic */ void callback(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        C113577bz.this.startDownload();
                    } else if (C113577bz.this.f339908a != null) {
                        C113577bz.this.f339908a.onStatusChanged(C113577bz.this.f339912e, OfflineStatus.COMPLETED);
                    }
                }
            });
        } else if (!checkInvalidate() || TextUtils.isEmpty(this.f339917j)) {
            OfflineStatusChangedListener offlineStatusChangedListener2 = this.f339908a;
            if (offlineStatusChangedListener2 != null) {
                offlineStatusChangedListener2.onStatusChanged(this.f339912e, OfflineStatus.ERROR);
            }
        } else {
            if (this.f339908a != null) {
                this.f339918k.mo172357a((C113933li) this.f339919l);
            }
            C113889km.m157550c(C0949kl.f2251u, "请求下载:[" + this.f339917j + "]");
            this.f339918k.mo172359a(this.f339917j, this.f339919l);
            OfflineStatusChangedListener offlineStatusChangedListener3 = this.f339908a;
            if (offlineStatusChangedListener3 != null) {
                offlineStatusChangedListener3.onStatusChanged(this.f339912e, OfflineStatus.READY);
            }
        }
    }

    public final void stopDownload() {
        if (!TextUtils.isEmpty(this.f339917j)) {
            C113889km.m157550c(C0949kl.f2251u, "停止下载:[" + this.f339917j + "]");
            this.f339918k.mo172363b(this.f339917j);
        }
    }

    /* renamed from: a */
    private void m156389a(OfflineStatusChangedListener offlineStatusChangedListener) {
        this.f339908a = offlineStatusChangedListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo171877b(com.tencent.mapsdk.internal.C113565bo r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.io.File r0 = r3.f339916i     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0059 }
            r1 = 0
            if (r0 == 0) goto L_0x0057
            if (r4 != 0) goto L_0x000d
            goto L_0x0057
        L_0x000d:
            com.tencent.mapsdk.internal.bt r4 = r4.mo171786A()     // Catch:{ all -> 0x0059 }
            r4.mo171854d()     // Catch:{ all -> 0x0059 }
            java.io.File r0 = r3.f339916i     // Catch:{ all -> 0x0059 }
            java.io.File r2 = r3.f339915h     // Catch:{ all -> 0x0059 }
            com.tencent.mapsdk.internal.C113884kf.m157490a((java.io.File) r0, (java.io.File) r2)     // Catch:{ all -> 0x0059 }
            r4.mo171855e()     // Catch:{ all -> 0x0059 }
            r4.mo171856f()     // Catch:{ all -> 0x0059 }
            com.tencent.mapsdk.internal.bz$a r4 = r3.f339909b     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x002a
            com.tencent.map.sdk.comps.offlinemap.OfflineItem r0 = r3.f339912e     // Catch:{ all -> 0x0059 }
            r4.mo171881a((com.tencent.map.sdk.comps.offlinemap.OfflineItem) r0, (boolean) r1)     // Catch:{ all -> 0x0059 }
        L_0x002a:
            com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener r4 = r3.f339908a     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0035
            com.tencent.map.sdk.comps.offlinemap.OfflineItem r0 = r3.f339912e     // Catch:{ all -> 0x0059 }
            com.tencent.map.sdk.comps.offlinemap.OfflineStatus r2 = com.tencent.map.sdk.comps.offlinemap.OfflineStatus.CLOSE     // Catch:{ all -> 0x0059 }
            r4.onStatusChanged(r0, r2)     // Catch:{ all -> 0x0059 }
        L_0x0035:
            r3.f339920m = r1     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = "OM"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "关闭["
            r0.<init>(r1)     // Catch:{ all -> 0x0059 }
            com.tencent.mapsdk.internal.ca r1 = r3.f339911d     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = r1.f339935c     // Catch:{ all -> 0x0059 }
            r0.append(r1)     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "]离线"
            r0.append(r1)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0059 }
            com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0059 }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x0057:
            monitor-exit(r3)
            return r1
        L_0x0059:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113577bz.mo171877b(com.tencent.mapsdk.internal.bo):boolean");
    }

    /* renamed from: a */
    private void m156390a(C113581a aVar) {
        this.f339909b = aVar;
    }

    /* renamed from: a */
    public final synchronized boolean mo171876a(C113565bo boVar) {
        if (boVar == null) {
            return false;
        }
        m156388a();
        if (!this.f339915h.exists()) {
            return false;
        }
        C113571bt A = boVar.mo171786A();
        A.mo171854d();
        C113884kf.m157490a(this.f339915h, this.f339916i);
        A.mo171855e();
        A.mo171856f();
        this.f339920m = true;
        C113581a aVar = this.f339909b;
        if (aVar != null) {
            aVar.mo171881a(this.f339912e, true);
        }
        OfflineStatusChangedListener offlineStatusChangedListener = this.f339908a;
        if (offlineStatusChangedListener != null) {
            offlineStatusChangedListener.onStatusChanged(this.f339912e, OfflineStatus.OPEN);
        }
        C113889km.m157550c(C0949kl.f2251u, "开启[" + this.f339911d.f339935c + "]离线");
        return true;
    }

    /* renamed from: b */
    private void m156392b() {
        this.f339909b = null;
        this.f339908a = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m156388a() {
        if (this.f339914g.exists()) {
            try {
                C113889km.m157550c(C0949kl.f2251u, "开始缓存文件校验...");
                String a = C113903kv.m157738a(this.f339914g);
                C113889km.m157550c(C0949kl.f2251u, "结束缓存文件校验...");
                if (!this.f339911d.f339934b.equals(a)) {
                    C113889km.m157553d(C0949kl.f2251u, "缓存文件MD5不一致！");
                    C113884kf.m157500b(this.f339914g);
                    return;
                }
                C113884kf.m157500b(this.f339915h);
                C80344ki.m97841a(this.f339914g, this.f339915h.getParent(), (FilenameFilter) new FilenameFilter() {
                    public final boolean accept(File file, String str) {
                        return C113577bz.this.f339915h.getName().equals(str);
                    }
                });
            } catch (IOException unused) {
            }
        }
    }
}
