package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.pq */
public final class C114078pq {

    /* renamed from: e */
    public static volatile Map<String, List<WeakReference<C113540bh>>> f341347e = new HashMap();

    /* renamed from: a */
    public volatile boolean f341348a = false;

    /* renamed from: b */
    public String f341349b;

    /* renamed from: c */
    public C113955mh f341350c;

    /* renamed from: d */
    public C113959ml f341351d;

    /* renamed from: f */
    public WeakReference<C113540bh> f341352f;

    /* renamed from: g */
    public String f341353g;

    /* renamed from: h */
    public String f341354h;

    /* renamed from: i */
    public String f341355i;

    /* renamed from: j */
    public String f341356j;

    /* renamed from: k */
    public String f341357k;

    /* renamed from: com.tencent.mapsdk.internal.pq$a */
    public static class C114079a implements Runnable {

        /* renamed from: a */
        private final WeakReference<C114078pq> f341358a;

        /* renamed from: b */
        private final String f341359b;

        /* renamed from: c */
        private final C113735fr f341360c;

        public C114079a(C114078pq pqVar, String str, C113735fr frVar) {
            this.f341358a = new WeakReference<>(pqVar);
            this.f341359b = str;
            this.f341360c = frVar;
        }

        public final void run() {
            WeakReference<C114078pq> weakReference = this.f341358a;
            if (weakReference != null && weakReference.get() != null) {
                C114078pq pqVar = this.f341358a.get();
                String str = this.f341359b;
                C113735fr frVar = this.f341360c;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new FileUpdateReq(C0938ej.f2154i, pqVar.f341350c.mo172397b(C0939el.f2171a), pqVar.f341350c.mo172391a(C0939el.f2190t)));
                arrayList.add(new FileUpdateReq("poi_icon", pqVar.f341350c.mo172397b(C0939el.f2173c), pqVar.f341350c.mo172391a(C0939el.f2191u)));
                arrayList.add(new FileUpdateReq(C0938ej.f2155j, pqVar.f341350c.mo172397b(C0939el.f2174d), pqVar.f341350c.mo172391a(C0939el.f2192v)));
                arrayList.add(new FileUpdateReq(C0938ej.f2161p, pqVar.f341350c.mo172397b("escalator_night_version"), pqVar.f341350c.mo172391a("escalator_night_md5")));
                if (frVar != null && frVar.mo172096a()) {
                    arrayList.add(new FileUpdateReq(C0938ej.f2157l, pqVar.f341350c.mo172397b("indoormap_style_version"), pqVar.f341350c.mo172391a("indoormap_style_md5")));
                    arrayList.add(new FileUpdateReq(C0938ej.f2158m, pqVar.f341350c.mo172397b("indoormap_style_night_version"), pqVar.f341350c.mo172391a("indoormap_style_night_md5")));
                    arrayList.add(new FileUpdateReq(C0938ej.f2159n, pqVar.f341350c.mo172397b(C0939el.f2189s), pqVar.f341350c.mo172391a(C0939el.f2195y)));
                    arrayList.add(new FileUpdateReq(C0938ej.f2160o, pqVar.f341350c.mo172397b("indoorpoi_icon_3d_night_version"), pqVar.f341350c.mo172391a("indoorpoi_icon_3d_night_md5")));
                }
                String a = pqVar.mo172662a();
                CSFileUpdateReq cSFileUpdateReq = new CSFileUpdateReq(arrayList, a, C113798hb.m157096m(), (String) null, pqVar.f341349b, str);
                pqVar.f341354h = pqVar.f341351d.mo172402a(pqVar.f341353g);
                pqVar.f341355i = pqVar.f341351d.mo172404b(pqVar.f341353g);
                pqVar.f341356j = pqVar.f341351d.mo172406c(pqVar.f341353g) + "config/";
                pqVar.f341357k = pqVar.f341351d.mo172406c(pqVar.f341353g) + "assets/";
                C113886kg.m157518a(pqVar.f341356j);
                C113886kg.m157518a(pqVar.f341357k);
                List<FileUpdateRsp> a2 = new C114074po().mo172660a(pqVar.f341351d.mo172406c(pqVar.f341353g) + "config/", pqVar.f341351d.mo172406c(pqVar.f341353g) + "assets/", a, cSFileUpdateReq, pqVar);
                if (a2 != null) {
                    if (pqVar.f341348a) {
                        if (!pqVar.m158864a(pqVar.f341356j, pqVar.f341354h) || !pqVar.m158864a(pqVar.f341357k, pqVar.f341355i)) {
                            pqVar.f341348a = false;
                            C114078pq.m158860a(pqVar, false);
                            return;
                        }
                        for (int i = 0; i < a2.size(); i++) {
                            C114078pq.m158859a(pqVar, a2.get(i));
                        }
                    }
                    C114078pq.m158860a(pqVar, true);
                    return;
                }
                pqVar.f341348a = false;
                C114078pq.m158860a(pqVar, false);
            }
        }
    }

    public C114078pq(Context context, C113540bh bhVar, String str) {
        this.f341351d = C113959ml.m157965a(context, (TencentMapOptions) null);
        this.f341349b = "";
        if (!(bhVar == null || bhVar.f339763b == null || bhVar.f339763b.f339878e_ == null)) {
            this.f341349b = ((VectorMap) bhVar.f339763b.f339878e_).mo173498x();
        }
        this.f341352f = new WeakReference<>(bhVar);
        this.f341353g = str;
        C113955mh a = C113957mj.m157958a(context, str);
        this.f341350c = a;
        if (a != null) {
            a.mo172396a(new String[]{"mapPoiIconIndoorVersion", "poiIconIndoorMd5"});
        }
    }

    /* renamed from: b */
    private void m158867b() {
        C113955mh mhVar = this.f341350c;
        if (mhVar != null) {
            mhVar.mo172396a(new String[]{"mapPoiIconIndoorVersion", "poiIconIndoorMd5"});
        }
    }

    /* renamed from: c */
    private WeakReference<C113540bh>[] m158869c() {
        List list = f341347e.get(mo172662a());
        if (list == null) {
            return null;
        }
        return (WeakReference[]) list.toArray(new WeakReference[list.size()]);
    }

    /* renamed from: a */
    private void m158861a(String str, C113735fr frVar) {
        String a = mo172662a();
        if (f341347e.containsKey(a)) {
            mo172663a(a, this.f341352f);
            return;
        }
        mo172663a(a, this.f341352f);
        C113896kq.m157663b(C0950kp.f2276V);
        C113865kb.m157402b(new C114079a(this, str, frVar));
    }

    /* renamed from: b */
    private List<FileUpdateRsp> m158866b(String str, C113735fr frVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FileUpdateReq(C0938ej.f2154i, this.f341350c.mo172397b(C0939el.f2171a), this.f341350c.mo172391a(C0939el.f2190t)));
        arrayList.add(new FileUpdateReq("poi_icon", this.f341350c.mo172397b(C0939el.f2173c), this.f341350c.mo172391a(C0939el.f2191u)));
        arrayList.add(new FileUpdateReq(C0938ej.f2155j, this.f341350c.mo172397b(C0939el.f2174d), this.f341350c.mo172391a(C0939el.f2192v)));
        arrayList.add(new FileUpdateReq(C0938ej.f2161p, this.f341350c.mo172397b("escalator_night_version"), this.f341350c.mo172391a("escalator_night_md5")));
        if (frVar != null && frVar.mo172096a()) {
            arrayList.add(new FileUpdateReq(C0938ej.f2157l, this.f341350c.mo172397b("indoormap_style_version"), this.f341350c.mo172391a("indoormap_style_md5")));
            arrayList.add(new FileUpdateReq(C0938ej.f2158m, this.f341350c.mo172397b("indoormap_style_night_version"), this.f341350c.mo172391a("indoormap_style_night_md5")));
            arrayList.add(new FileUpdateReq(C0938ej.f2159n, this.f341350c.mo172397b(C0939el.f2189s), this.f341350c.mo172391a(C0939el.f2195y)));
            arrayList.add(new FileUpdateReq(C0938ej.f2160o, this.f341350c.mo172397b("indoorpoi_icon_3d_night_version"), this.f341350c.mo172391a("indoorpoi_icon_3d_night_md5")));
        }
        String a = mo172662a();
        CSFileUpdateReq cSFileUpdateReq = new CSFileUpdateReq(arrayList, a, C113798hb.m157096m(), (String) null, this.f341349b, str);
        this.f341354h = this.f341351d.mo172402a(this.f341353g);
        this.f341355i = this.f341351d.mo172404b(this.f341353g);
        this.f341356j = this.f341351d.mo172406c(this.f341353g) + "config/";
        this.f341357k = this.f341351d.mo172406c(this.f341353g) + "assets/";
        C113886kg.m157518a(this.f341356j);
        C113886kg.m157518a(this.f341357k);
        return new C114074po().mo172660a(this.f341351d.mo172406c(this.f341353g) + "config/", this.f341351d.mo172406c(this.f341353g) + "assets/", a, cSFileUpdateReq, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m158864a(String str, String str2) {
        C113540bh bhVar;
        boolean a;
        WeakReference<C113540bh> weakReference = this.f341352f;
        if (!(weakReference == null || (bhVar = weakReference.get()) == null || bhVar.f339763b == null || bhVar.f339763b.f339878e_ == null)) {
            VectorMap vectorMap = (VectorMap) bhVar.f339763b.f339878e_;
            File file = new File(str);
            if (!file.exists() || !file.isDirectory()) {
                C113889km.m157549c("Config temp dir not exists:".concat(String.valueOf(str)));
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return false;
                }
                FileInputStream fileInputStream = null;
                boolean z = true;
                for (File file2 : listFiles) {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file2);
                        try {
                            int length = (int) file2.length();
                            byte[] bArr = new byte[length];
                            fileInputStream2.read(bArr, 0, length);
                            if (str2.equals(this.f341354h)) {
                                String name = file2.getName();
                                C114371w wVar = vectorMap.f342909o.f340910r;
                                if (wVar != null) {
                                    C114009oc ocVar = wVar.f342829b;
                                    if (ocVar != null) {
                                        a = C114371w.m160593a(new File(ocVar.mo172566c()), name, bArr, wVar.f342831d);
                                        z &= a;
                                        C113886kg.m157515a((Closeable) fileInputStream2);
                                        fileInputStream = fileInputStream2;
                                    }
                                }
                            } else {
                                if (str2.equals(this.f341355i)) {
                                    String name2 = file2.getName();
                                    C114371w wVar2 = vectorMap.f342909o.f340910r;
                                    if (wVar2 != null) {
                                        C114009oc ocVar2 = wVar2.f342829b;
                                        if (ocVar2 != null) {
                                            a = C114371w.m160593a(new File(ocVar2.mo172568e()), name2, bArr, wVar2.f342832e);
                                            z &= a;
                                        }
                                    }
                                }
                                C113886kg.m157515a((Closeable) fileInputStream2);
                                fileInputStream = fileInputStream2;
                            }
                            a = false;
                            z &= a;
                            C113886kg.m157515a((Closeable) fileInputStream2);
                            fileInputStream = fileInputStream2;
                        } catch (FileNotFoundException | IOException unused) {
                            fileInputStream = fileInputStream2;
                            C113886kg.m157515a((Closeable) fileInputStream);
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            C113886kg.m157515a((Closeable) fileInputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException | IOException unused2) {
                        C113886kg.m157515a((Closeable) fileInputStream);
                    } catch (Throwable th4) {
                        th = th4;
                        C113886kg.m157515a((Closeable) fileInputStream);
                        throw th;
                    }
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m158862a(boolean z) {
        C113540bh bhVar;
        C114322sx sxVar;
        M m;
        C113961mq mqVar;
        C114128qw a;
        this.f341350c.mo172394a(C0939el.f2172b, System.currentTimeMillis());
        C113886kg.m157524c(this.f341356j);
        C113886kg.m157524c(this.f341357k);
        long currentTimeMillis = System.currentTimeMillis();
        if (!z) {
            currentTimeMillis = 0;
        }
        List list = f341347e.get(mo172662a());
        if (list != null) {
            int size = list.size();
            WeakReference[] weakReferenceArr = (WeakReference[]) list.toArray(new WeakReference[size]);
            for (int i = 0; i < size; i++) {
                WeakReference weakReference = weakReferenceArr[i];
                if (!(weakReference == null || (bhVar = (C113540bh) weakReference.get()) == null || (sxVar = bhVar.f339763b) == null || (m = sxVar.f339878e_) == null)) {
                    VectorMap vectorMap = (VectorMap) m;
                    C113792gv gvVar = sxVar.f342647aD.f339861d;
                    if (this.f341348a) {
                        C114371w wVar = vectorMap.f342909o.f340910r;
                        if (wVar != null) {
                            wVar.mo173082c();
                        }
                        C114129qx qxVar = bhVar.f339766e;
                        if (!(qxVar == null || (mqVar = (C113961mq) sxVar.f339876d_) == null || (a = qxVar.mo172746a(qxVar.f341620f)) == null)) {
                            mqVar.f340901i.mo171224b(a.f341611a);
                        }
                        vectorMap.f342909o.f340914v = true;
                        C113961mq mqVar2 = sxVar.f342647aD;
                        if (mqVar2 != null) {
                            mqVar2.mo172416H();
                        }
                        sxVar.f342651aH = true;
                        if (gvVar != null) {
                            gvVar.mo172154a().mo172145a(false, currentTimeMillis);
                            gvVar.mo172154a().mo172146b(z, currentTimeMillis);
                        }
                    } else if (!z && gvVar != null) {
                        gvVar.mo172154a().mo172146b(z, currentTimeMillis);
                    }
                    vectorMap.f342908n = true;
                }
            }
            f341347e.clear();
            C113957mj.m157960b();
            C113896kq.m157671d(C0950kp.f2276V);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r0.equals(com.tencent.mapsdk.internal.C0938ej.f2158m) == false) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m158858a(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp r5) {
        /*
            r4 = this;
            int r0 = r5.iFileUpdated
            r1 = 1
            if (r0 == r1) goto L_0x0006
            return
        L_0x0006:
            java.lang.String r0 = r5.sName
            r0.getClass()
            r2 = -1
            int r3 = r0.hashCode()
            switch(r3) {
                case -1319508241: goto L_0x0060;
                case -1091367180: goto L_0x0057;
                case -503063473: goto L_0x004c;
                case 178735484: goto L_0x0041;
                case 204802075: goto L_0x0036;
                case 451944782: goto L_0x002b;
                case 1366209438: goto L_0x0020;
                case 1864531656: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            r1 = -1
            goto L_0x006a
        L_0x0015:
            java.lang.String r1 = "indoorpoi_icon_3d_night"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            goto L_0x0013
        L_0x001e:
            r1 = 7
            goto L_0x006a
        L_0x0020:
            java.lang.String r1 = "mapconfig"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0029
            goto L_0x0013
        L_0x0029:
            r1 = 6
            goto L_0x006a
        L_0x002b:
            java.lang.String r1 = "poi_icon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0034
            goto L_0x0013
        L_0x0034:
            r1 = 5
            goto L_0x006a
        L_0x0036:
            java.lang.String r1 = "indoormap_style"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003f
            goto L_0x0013
        L_0x003f:
            r1 = 4
            goto L_0x006a
        L_0x0041:
            java.lang.String r1 = "map_icon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004a
            goto L_0x0013
        L_0x004a:
            r1 = 3
            goto L_0x006a
        L_0x004c:
            java.lang.String r1 = "escalator_night"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0055
            goto L_0x0013
        L_0x0055:
            r1 = 2
            goto L_0x006a
        L_0x0057:
            java.lang.String r3 = "indoormap_style_night"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x006a
            goto L_0x0013
        L_0x0060:
            java.lang.String r1 = "indoorpoi_icon_3d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            goto L_0x0013
        L_0x0069:
            r1 = 0
        L_0x006a:
            switch(r1) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x00e0;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00a7;
                case 5: goto L_0x0094;
                case 6: goto L_0x0081;
                case 7: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0080
        L_0x006e:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "indoorpoi_icon_3d_night_version"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r1 = "indoorpoi_icon_3d_night_md5"
            r0.mo172395a((java.lang.String) r1, (java.lang.String) r5)
        L_0x0080:
            return
        L_0x0081:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "mapConfigVersion"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r1 = "mapConfigZipMd5"
            r0.mo172395a((java.lang.String) r1, (java.lang.String) r5)
            return
        L_0x0094:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "poiIconVersion"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r1 = "mapPoiIconZipMd5"
            r0.mo172395a((java.lang.String) r1, (java.lang.String) r5)
            return
        L_0x00a7:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "indoormap_style_version"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r1 = "indoormap_style_md5"
            r0.mo172395a((java.lang.String) r1, (java.lang.String) r5)
            return
        L_0x00ba:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "mapIconVersion"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r1 = "mapIconZipMd5"
            r0.mo172395a((java.lang.String) r1, (java.lang.String) r5)
            return
        L_0x00cd:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "escalator_night_version"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r1 = "escalator_night_md5"
            r0.mo172395a((java.lang.String) r1, (java.lang.String) r5)
            return
        L_0x00e0:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "indoormap_style_night_version"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r1 = "indoormap_style_night_md5"
            r0.mo172395a((java.lang.String) r1, (java.lang.String) r5)
            return
        L_0x00f3:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "mapPoiIcon3dIndoorVersion"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r1 = "poiIcon3dIndoorMd5"
            r0.mo172395a((java.lang.String) r1, (java.lang.String) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114078pq.m158858a(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp):void");
    }

    /* renamed from: a */
    public final String mo172662a() {
        String str = this.f341353g;
        return C40002he.m42805a(str) ? C113798hb.m157068a() : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo172663a(java.lang.String r2, java.lang.ref.WeakReference<com.tencent.mapsdk.internal.C113540bh> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bh>>> r0 = f341347e     // Catch:{ all -> 0x0027 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0018
            java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bh>>> r0 = f341347e     // Catch:{ all -> 0x0027 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0027 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0016
            r2.add(r3)     // Catch:{ all -> 0x0027 }
        L_0x0016:
            monitor-exit(r1)
            return
        L_0x0018:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0027 }
            r0.<init>()     // Catch:{ all -> 0x0027 }
            r0.add(r3)     // Catch:{ all -> 0x0027 }
            java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bh>>> r3 = f341347e     // Catch:{ all -> 0x0027 }
            r3.put(r2, r0)     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)
            return
        L_0x0027:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114078pq.mo172663a(java.lang.String, java.lang.ref.WeakReference):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m158860a(C114078pq pqVar, boolean z) {
        C113540bh bhVar;
        C114322sx sxVar;
        M m;
        C113961mq mqVar;
        C114128qw a;
        pqVar.f341350c.mo172394a(C0939el.f2172b, System.currentTimeMillis());
        C113886kg.m157524c(pqVar.f341356j);
        C113886kg.m157524c(pqVar.f341357k);
        long currentTimeMillis = System.currentTimeMillis();
        if (!z) {
            currentTimeMillis = 0;
        }
        List list = f341347e.get(pqVar.mo172662a());
        if (list != null) {
            int size = list.size();
            WeakReference[] weakReferenceArr = (WeakReference[]) list.toArray(new WeakReference[size]);
            for (int i = 0; i < size; i++) {
                WeakReference weakReference = weakReferenceArr[i];
                if (!(weakReference == null || (bhVar = (C113540bh) weakReference.get()) == null || (sxVar = bhVar.f339763b) == null || (m = sxVar.f339878e_) == null)) {
                    VectorMap vectorMap = (VectorMap) m;
                    C113792gv gvVar = sxVar.f342647aD.f339861d;
                    if (pqVar.f341348a) {
                        C114371w wVar = vectorMap.f342909o.f340910r;
                        if (wVar != null) {
                            wVar.mo173082c();
                        }
                        C114129qx qxVar = bhVar.f339766e;
                        if (!(qxVar == null || (mqVar = (C113961mq) sxVar.f339876d_) == null || (a = qxVar.mo172746a(qxVar.f341620f)) == null)) {
                            mqVar.f340901i.mo171224b(a.f341611a);
                        }
                        vectorMap.f342909o.f340914v = true;
                        C113961mq mqVar2 = sxVar.f342647aD;
                        if (mqVar2 != null) {
                            mqVar2.mo172416H();
                        }
                        sxVar.f342651aH = true;
                        if (gvVar != null) {
                            gvVar.mo172154a().mo172145a(false, currentTimeMillis);
                            gvVar.mo172154a().mo172146b(z, currentTimeMillis);
                        }
                    } else if (!z && gvVar != null) {
                        gvVar.mo172154a().mo172146b(z, currentTimeMillis);
                    }
                    vectorMap.f342908n = true;
                }
            }
            f341347e.clear();
            C113957mj.m157960b();
            C113896kq.m157671d(C0950kp.f2276V);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r0.equals(com.tencent.mapsdk.internal.C0938ej.f2158m) == false) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m158859a(com.tencent.mapsdk.internal.C114078pq r4, com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp r5) {
        /*
            int r0 = r5.iFileUpdated
            r1 = 1
            if (r0 != r1) goto L_0x0106
            java.lang.String r0 = r5.sName
            r0.getClass()
            r2 = -1
            int r3 = r0.hashCode()
            switch(r3) {
                case -1319508241: goto L_0x005f;
                case -1091367180: goto L_0x0056;
                case -503063473: goto L_0x004b;
                case 178735484: goto L_0x0040;
                case 204802075: goto L_0x0035;
                case 451944782: goto L_0x002a;
                case 1366209438: goto L_0x001f;
                case 1864531656: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            r1 = -1
            goto L_0x0069
        L_0x0014:
            java.lang.String r1 = "indoorpoi_icon_3d_night"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            r1 = 7
            goto L_0x0069
        L_0x001f:
            java.lang.String r1 = "mapconfig"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            goto L_0x0012
        L_0x0028:
            r1 = 6
            goto L_0x0069
        L_0x002a:
            java.lang.String r1 = "poi_icon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0033
            goto L_0x0012
        L_0x0033:
            r1 = 5
            goto L_0x0069
        L_0x0035:
            java.lang.String r1 = "indoormap_style"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003e
            goto L_0x0012
        L_0x003e:
            r1 = 4
            goto L_0x0069
        L_0x0040:
            java.lang.String r1 = "map_icon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0049
            goto L_0x0012
        L_0x0049:
            r1 = 3
            goto L_0x0069
        L_0x004b:
            java.lang.String r1 = "escalator_night"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0054
            goto L_0x0012
        L_0x0054:
            r1 = 2
            goto L_0x0069
        L_0x0056:
            java.lang.String r3 = "indoormap_style_night"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0069
            goto L_0x0012
        L_0x005f:
            java.lang.String r1 = "indoorpoi_icon_3d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0068
            goto L_0x0012
        L_0x0068:
            r1 = 0
        L_0x0069:
            switch(r1) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00a8;
                case 5: goto L_0x0095;
                case 6: goto L_0x0082;
                case 7: goto L_0x006e;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0106
        L_0x006e:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "indoorpoi_icon_3d_night_version"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r4 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r0 = "indoorpoi_icon_3d_night_md5"
            r4.mo172395a((java.lang.String) r0, (java.lang.String) r5)
            goto L_0x0106
        L_0x0082:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "mapConfigVersion"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r4 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r0 = "mapConfigZipMd5"
            r4.mo172395a((java.lang.String) r0, (java.lang.String) r5)
            return
        L_0x0095:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "poiIconVersion"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r4 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r0 = "mapPoiIconZipMd5"
            r4.mo172395a((java.lang.String) r0, (java.lang.String) r5)
            return
        L_0x00a8:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "indoormap_style_version"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r4 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r0 = "indoormap_style_md5"
            r4.mo172395a((java.lang.String) r0, (java.lang.String) r5)
            return
        L_0x00bb:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "mapIconVersion"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r4 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r0 = "mapIconZipMd5"
            r4.mo172395a((java.lang.String) r0, (java.lang.String) r5)
            return
        L_0x00ce:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "escalator_night_version"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r4 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r0 = "escalator_night_md5"
            r4.mo172395a((java.lang.String) r0, (java.lang.String) r5)
            return
        L_0x00e1:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "indoormap_style_night_version"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r4 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r0 = "indoormap_style_night_md5"
            r4.mo172395a((java.lang.String) r0, (java.lang.String) r5)
            return
        L_0x00f4:
            com.tencent.mapsdk.internal.mh r0 = r4.f341350c
            int r1 = r5.iVersion
            java.lang.String r2 = "mapPoiIcon3dIndoorVersion"
            r0.mo172393a((java.lang.String) r2, (int) r1)
            com.tencent.mapsdk.internal.mh r4 = r4.f341350c
            java.lang.String r5 = r5.sMd5
            java.lang.String r0 = "poiIcon3dIndoorMd5"
            r4.mo172395a((java.lang.String) r0, (java.lang.String) r5)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114078pq.m158859a(com.tencent.mapsdk.internal.pq, com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp):void");
    }
}
