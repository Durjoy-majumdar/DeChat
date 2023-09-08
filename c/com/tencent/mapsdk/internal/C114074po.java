package com.tencent.mapsdk.internal;

import android.util.Log;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp;
import com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp;
import com.tencent.mapsdk.internal.C113783gr;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.po */
public final class C114074po {

    /* renamed from: a */
    private static final String f341337a = "UTF-8";

    /* renamed from: b */
    private WeakReference<C114078pq> f341338b;

    /* renamed from: c */
    private List<FileUpdateReq> f341339c;

    /* renamed from: d */
    private String f341340d;

    /* renamed from: e */
    private String f341341e;

    /* renamed from: f */
    private String f341342f;

    /* renamed from: g */
    private int f341343g;

    /* renamed from: b */
    private FileUpdateReq m158850b(String str) {
        List<FileUpdateReq> list = this.f341339c;
        if (list != null && !list.isEmpty()) {
            for (FileUpdateReq next : this.f341339c) {
                if (C40002he.m42806a(next.sName, str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp> mo172660a(java.lang.String r6, java.lang.String r7, java.lang.String r8, com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq r9, com.tencent.mapsdk.internal.C114078pq r10) {
        /*
            r5 = this;
            java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq> r0 = r9.vItems
            r5.f341339c = r0
            r5.f341340d = r6
            r5.f341341e = r7
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r10)
            r5.f341338b = r6
            r5.f341342f = r8
            java.util.List r6 = r5.m158848a((com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq) r9)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "rspList = "
            java.lang.String r7 = r8.concat(r7)
            java.lang.String r8 = "net"
            com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r8, (java.lang.String) r7)
            r7 = 0
            if (r6 == 0) goto L_0x0112
            boolean r9 = r6.isEmpty()
            if (r9 == 0) goto L_0x002f
            goto L_0x0112
        L_0x002f:
            int r9 = r6.size()
            r5.f341343g = r9
            java.util.Iterator r9 = r6.iterator()
        L_0x0039:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x010c
            java.lang.Object r10 = r9.next()
            com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp r10 = (com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp) r10
            r0 = -1
            r1 = 1
            if (r10 == 0) goto L_0x00cf
            int r2 = r10.iRet
            if (r2 == 0) goto L_0x004f
            goto L_0x00cf
        L_0x004f:
            java.lang.String r2 = r10.sName
            r2.getClass()
            int r3 = r2.hashCode()
            r4 = 0
            switch(r3) {
                case -1319508241: goto L_0x00ac;
                case -1091367180: goto L_0x00a1;
                case -503063473: goto L_0x0096;
                case 178735484: goto L_0x008b;
                case 204802075: goto L_0x0080;
                case 451944782: goto L_0x0075;
                case 1366209438: goto L_0x006a;
                case 1864531656: goto L_0x005f;
                default: goto L_0x005c;
            }
        L_0x005c:
            r2 = -1
            goto L_0x00b6
        L_0x005f:
            java.lang.String r3 = "indoorpoi_icon_3d_night"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0068
            goto L_0x005c
        L_0x0068:
            r2 = 7
            goto L_0x00b6
        L_0x006a:
            java.lang.String r3 = "mapconfig"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0073
            goto L_0x005c
        L_0x0073:
            r2 = 6
            goto L_0x00b6
        L_0x0075:
            java.lang.String r3 = "poi_icon"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x007e
            goto L_0x005c
        L_0x007e:
            r2 = 5
            goto L_0x00b6
        L_0x0080:
            java.lang.String r3 = "indoormap_style"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0089
            goto L_0x005c
        L_0x0089:
            r2 = 4
            goto L_0x00b6
        L_0x008b:
            java.lang.String r3 = "map_icon"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0094
            goto L_0x005c
        L_0x0094:
            r2 = 3
            goto L_0x00b6
        L_0x0096:
            java.lang.String r3 = "escalator_night"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x009f
            goto L_0x005c
        L_0x009f:
            r2 = 2
            goto L_0x00b6
        L_0x00a1:
            java.lang.String r3 = "indoormap_style_night"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00aa
            goto L_0x005c
        L_0x00aa:
            r2 = 1
            goto L_0x00b6
        L_0x00ac:
            java.lang.String r3 = "indoorpoi_icon_3d"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00b5
            goto L_0x005c
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            switch(r2) {
                case 0: goto L_0x00c8;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00c8;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00c8;
                case 7: goto L_0x00c8;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x00cf
        L_0x00ba:
            java.lang.String r2 = r5.f341340d
            com.tencent.mapsdk.internal.gr$c r2 = r5.m158845a((com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp) r10, (java.lang.String) r2, (boolean) r1)
            goto L_0x00d0
        L_0x00c1:
            java.lang.String r2 = r5.f341341e
            com.tencent.mapsdk.internal.gr$c r2 = r5.m158845a((com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp) r10, (java.lang.String) r2, (boolean) r1)
            goto L_0x00d0
        L_0x00c8:
            java.lang.String r2 = r5.f341340d
            com.tencent.mapsdk.internal.gr$c r2 = r5.m158845a((com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp) r10, (java.lang.String) r2, (boolean) r4)
            goto L_0x00d0
        L_0x00cf:
            r2 = r7
        L_0x00d0:
            if (r2 == 0) goto L_0x0105
            java.lang.String r6 = r2.f340411a
            com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq r6 = r5.m158850b(r6)
            if (r6 == 0) goto L_0x00df
            int r6 = r6.iVersion
            r2.f340415e = r6
            goto L_0x00e1
        L_0x00df:
            r2.f340415e = r0
        L_0x00e1:
            long r0 = java.lang.System.currentTimeMillis()
            r2.f340412b = r0
            r5.m158849a((com.tencent.mapsdk.internal.C113783gr.C113786c) r2)
            java.lang.String r6 = java.lang.String.valueOf(r10)
            java.lang.String r9 = "fileUpdateRsp = "
            java.lang.String r6 = r9.concat(r6)
            com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r8, (java.lang.String) r6)
            java.lang.String r6 = java.lang.String.valueOf(r2)
            java.lang.String r9 = "failUpdate = "
            java.lang.String r6 = r9.concat(r6)
            com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r8, (java.lang.String) r6)
            return r7
        L_0x0105:
            int r10 = r5.f341343g
            int r10 = r10 - r1
            r5.f341343g = r10
            goto L_0x0039
        L_0x010c:
            int r8 = r5.f341343g
            if (r8 == 0) goto L_0x0111
            return r7
        L_0x0111:
            return r6
        L_0x0112:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114074po.mo172660a(java.lang.String, java.lang.String, java.lang.String, com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq, com.tencent.mapsdk.internal.pq):java.util.List");
    }

    /* renamed from: a */
    private List<FileUpdateRsp> m158848a(CSFileUpdateReq cSFileUpdateReq) {
        try {
            NetResponse configFileUpdate = ((C113611cx) ((C113629dl) C113601cl.m156511a(C113629dl.class)).mo171932h()).configFileUpdate(C113798hb.m157092i(), C113798hb.m157085d(), C113798hb.m157095l(), C113798hb.m157090g(), this.f341342f, cSFileUpdateReq.toByteArray("UTF-8"));
            if (configFileUpdate != null) {
                byte[] bArr = configFileUpdate.data;
                if (bArr != null) {
                    C113953m mVar = new C113953m(bArr);
                    mVar.mo172380a("UTF-8");
                    SCFileUpdateRsp sCFileUpdateRsp = new SCFileUpdateRsp();
                    sCFileUpdateRsp.readFrom(mVar);
                    C113889km.m157550c("net", "scrsp.iRet = " + sCFileUpdateRsp.iRet);
                    if (sCFileUpdateRsp.iRet == 0) {
                        return sCFileUpdateRsp.vItems;
                    }
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder("rsp = ");
            sb.append(configFileUpdate != null ? Integer.valueOf(configFileUpdate.statusCode) : "null");
            C113889km.m157550c("net", sb.toString());
            return null;
        } catch (Exception e) {
            C113889km.m157549c(Log.getStackTraceString(e));
            return null;
        }
    }

    /* renamed from: a */
    private C113783gr.C113786c m158844a(FileUpdateRsp fileUpdateRsp) {
        if (fileUpdateRsp == null || fileUpdateRsp.iRet != 0) {
            return null;
        }
        String str = fileUpdateRsp.sName;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1319508241:
                if (str.equals(C0938ej.f2159n)) {
                    c = 0;
                    break;
                }
                break;
            case -1091367180:
                if (str.equals(C0938ej.f2158m)) {
                    c = 1;
                    break;
                }
                break;
            case -503063473:
                if (str.equals(C0938ej.f2161p)) {
                    c = 2;
                    break;
                }
                break;
            case 178735484:
                if (str.equals(C0938ej.f2155j)) {
                    c = 3;
                    break;
                }
                break;
            case 204802075:
                if (str.equals(C0938ej.f2157l)) {
                    c = 4;
                    break;
                }
                break;
            case 451944782:
                if (str.equals("poi_icon")) {
                    c = 5;
                    break;
                }
                break;
            case 1366209438:
                if (str.equals(C0938ej.f2154i)) {
                    c = 6;
                    break;
                }
                break;
            case 1864531656:
                if (str.equals(C0938ej.f2160o)) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
                return m158845a(fileUpdateRsp, this.f341340d, false);
            case 3:
                return m158845a(fileUpdateRsp, this.f341341e, true);
            case 5:
                return m158845a(fileUpdateRsp, this.f341340d, true);
            default:
                return null;
        }
    }

    /* renamed from: a */
    private C113783gr.C113786c m158845a(FileUpdateRsp fileUpdateRsp, String str, boolean z) {
        if (fileUpdateRsp.iFileUpdated != 1) {
            return null;
        }
        String str2 = fileUpdateRsp.sName;
        if (str2.equals(C0938ej.f2154i)) {
            str2 = C0938ej.f2146a;
        } else if (str2.equals(C0938ej.f2157l)) {
            str2 = C0938ej.f2147b;
        } else if (str2.equals(C0938ej.f2158m)) {
            str2 = C0938ej.f2148c;
        } else if (str2.equals(C0938ej.f2159n)) {
            str2 = C0938ej.f2150e;
        } else if (str2.equals(C0938ej.f2160o)) {
            str2 = C0938ej.f2151f;
        } else if (str2.equals(C0938ej.f2161p)) {
            str2 = C0938ej.f2153h;
        }
        File file = new File(str + str2);
        C113783gr.C113786c a = m158846a(str2, fileUpdateRsp.sUpdateUrl, file);
        C113889km.m157550c("net", "fileUpdateRsp.sName = " + fileUpdateRsp.sName);
        if (a != null) {
            a.f340411a = fileUpdateRsp.sName;
            return a;
        }
        try {
            String a2 = C113903kv.m157738a(file);
            C113889km.m157550c("net", "fileMd5 = ".concat(String.valueOf(a2)));
            if (!fileUpdateRsp.sMd5.equals(a2)) {
                C113783gr.C113786c cVar = new C113783gr.C113786c();
                cVar.f340411a = fileUpdateRsp.sName;
                cVar.f340413c = fileUpdateRsp.sMd5;
                cVar.f340414d = a2;
                C113889km.m157550c("net", "error md5 1");
                return cVar;
            }
            if (z) {
                try {
                    C80344ki.m97848b(file, file.getParent());
                    file.delete();
                } catch (Throwable th) {
                    C113889km.m157549c(th.getMessage());
                    C113783gr.C113786c cVar2 = new C113783gr.C113786c();
                    cVar2.f340411a = fileUpdateRsp.sName;
                    C113889km.m157550c("net", "error unzip");
                    return cVar2;
                }
            }
            WeakReference<C114078pq> weakReference = this.f341338b;
            if (!(weakReference == null || weakReference.get() == null)) {
                this.f341338b.get().f341348a = true;
            }
            return null;
        } catch (Exception e) {
            C113889km.m157549c(e.getMessage());
            C113783gr.C113786c cVar3 = new C113783gr.C113786c();
            cVar3.f340411a = fileUpdateRsp.sName;
            C113889km.m157550c("net", "error md5 2 " + e.getMessage());
            return cVar3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.tencent.mapsdk.internal.C113783gr.C113786c m158846a(java.lang.String r10, java.lang.String r11, java.io.File r12) {
        /*
            java.lang.String r0 = "]结束"
            java.lang.String r1 = "下载["
            java.lang.String r2 = "netError"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "开始下载["
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r4 = "]:"
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "TC"
            com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r4, (java.lang.String) r3)
            com.tencent.mapsdk.internal.C113896kq.m157653a((java.lang.String) r4, (java.lang.String) r11)
            r3 = 0
            r5 = 200(0xc8, float:2.8E-43)
            com.tencent.map.tools.net.NetManager r6 = com.tencent.map.tools.net.NetManager.getInstance()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.tencent.map.tools.net.NetRequest$NetRequestBuilder r6 = r6.builder()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.tencent.map.tools.net.NetRequest$NetRequestBuilder r6 = r6.url(r11)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.tencent.map.tools.net.NetResponse r6 = r6.doStream()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            int r5 = r6.statusCode     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            java.io.InputStream r7 = r6.dataStream     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            boolean r8 = r12.exists()     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            if (r8 != 0) goto L_0x004f
            java.io.File r8 = r12.getParentFile()     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            if (r8 == 0) goto L_0x004c
            r8.mkdirs()     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
        L_0x004c:
            r12.createNewFile()     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
        L_0x004f:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            r9 = 0
            r8.<init>(r12, r9)     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            com.tencent.mapsdk.internal.C113886kg.m157513a((java.io.InputStream) r7, (java.io.OutputStream) r8)     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r7)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r8)
            java.io.InputStream r12 = r6.dataStream
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            com.tencent.mapsdk.internal.C113896kq.m157656a((java.lang.String) r4, (java.lang.String) r11, (java.lang.String) r2, (java.lang.Object) r12)
            com.tencent.mapsdk.internal.C113896kq.m157676f(r4, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r1)
            r11.append(r10)
            r11.append(r0)
            java.lang.String r10 = r11.toString()
            com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r4, (java.lang.String) r10)
            return r3
        L_0x0080:
            r12 = move-exception
            goto L_0x0086
        L_0x0082:
            r12 = move-exception
            goto L_0x008a
        L_0x0084:
            r12 = move-exception
            r8 = r3
        L_0x0086:
            r3 = r7
            goto L_0x00db
        L_0x0088:
            r12 = move-exception
            r8 = r3
        L_0x008a:
            r3 = r7
            goto L_0x0099
        L_0x008c:
            r12 = move-exception
            r8 = r3
            goto L_0x00db
        L_0x008f:
            r12 = move-exception
            r8 = r3
            goto L_0x0099
        L_0x0092:
            r12 = move-exception
            r6 = r3
            r8 = r6
            goto L_0x00db
        L_0x0096:
            r12 = move-exception
            r6 = r3
            r8 = r6
        L_0x0099:
            java.lang.String r7 = android.util.Log.getStackTraceString(r12)     // Catch:{ all -> 0x00da }
            com.tencent.mapsdk.internal.C113889km.m157549c(r7)     // Catch:{ all -> 0x00da }
            com.tencent.mapsdk.internal.gr$c r7 = new com.tencent.mapsdk.internal.gr$c     // Catch:{ all -> 0x00da }
            r7.<init>()     // Catch:{ all -> 0x00da }
            r7.f340416f = r5     // Catch:{ all -> 0x00da }
            java.lang.String r9 = "error"
            java.lang.String r12 = android.util.Log.getStackTraceString(r12)     // Catch:{ all -> 0x00da }
            com.tencent.mapsdk.internal.C113896kq.m157656a((java.lang.String) r4, (java.lang.String) r11, (java.lang.String) r9, (java.lang.Object) r12)     // Catch:{ all -> 0x00da }
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r3)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r8)
            if (r6 == 0) goto L_0x00bd
            java.io.InputStream r12 = r6.dataStream
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r12)
        L_0x00bd:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            com.tencent.mapsdk.internal.C113896kq.m157656a((java.lang.String) r4, (java.lang.String) r11, (java.lang.String) r2, (java.lang.Object) r12)
            com.tencent.mapsdk.internal.C113896kq.m157676f(r4, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r1)
            r11.append(r10)
            r11.append(r0)
            java.lang.String r10 = r11.toString()
            com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r4, (java.lang.String) r10)
            return r7
        L_0x00da:
            r12 = move-exception
        L_0x00db:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r3)
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r8)
            if (r6 == 0) goto L_0x00e8
            java.io.InputStream r3 = r6.dataStream
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r3)
        L_0x00e8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            com.tencent.mapsdk.internal.C113896kq.m157656a((java.lang.String) r4, (java.lang.String) r11, (java.lang.String) r2, (java.lang.Object) r3)
            com.tencent.mapsdk.internal.C113896kq.m157676f(r4, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r1)
            r11.append(r10)
            r11.append(r0)
            java.lang.String r10 = r11.toString()
            com.tencent.mapsdk.internal.C113889km.m157550c((java.lang.String) r4, (java.lang.String) r10)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114074po.m158846a(java.lang.String, java.lang.String, java.io.File):com.tencent.mapsdk.internal.gr$c");
    }

    /* renamed from: a */
    private static String m158847a(String str) {
        if (str.equals(C0938ej.f2154i)) {
            return C0938ej.f2146a;
        }
        if (str.equals(C0938ej.f2157l)) {
            return C0938ej.f2147b;
        }
        if (str.equals(C0938ej.f2158m)) {
            return C0938ej.f2148c;
        }
        if (str.equals(C0938ej.f2159n)) {
            return C0938ej.f2150e;
        }
        if (str.equals(C0938ej.f2160o)) {
            return C0938ej.f2151f;
        }
        return str.equals(C0938ej.f2161p) ? C0938ej.f2153h : str;
    }

    /* renamed from: a */
    private void m158849a(C113783gr.C113786c cVar) {
        C114078pq pqVar;
        WeakReference[] weakReferenceArr;
        C113540bh bhVar;
        WeakReference<C114078pq> weakReference = this.f341338b;
        if (weakReference != null && (pqVar = weakReference.get()) != null) {
            List list = C114078pq.f341347e.get(pqVar.mo172662a());
            if (list == null) {
                weakReferenceArr = null;
            } else {
                weakReferenceArr = (WeakReference[]) list.toArray(new WeakReference[list.size()]);
            }
            if (weakReferenceArr != null) {
                for (WeakReference weakReference2 : weakReferenceArr) {
                    if (!(weakReference2 == null || (bhVar = (C113540bh) weakReference2.get()) == null || bhVar.f339763b == null || bhVar.f339763b.f342647aD == null)) {
                        C113792gv gvVar = bhVar.f339763b.f342647aD.f339861d;
                        if (gvVar != null) {
                            cVar.f340412b -= gvVar.mo172171r();
                            gvVar.mo172154a().mo172144a(cVar);
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
