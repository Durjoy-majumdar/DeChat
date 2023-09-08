package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1054vg.C90801g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.l */
public enum C1902l {
    INSTANCE;
    

    /* renamed from: d */
    public Map<Long, C1904b> f11751d;

    /* renamed from: e */
    public Map<String, C1904b> f11752e;

    /* renamed from: f */
    public C40952u f11753f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.l$a */
    public class C1903a implements C40952u {
        public C1903a() {
        }

        /* renamed from: B */
        public void mo1796B(long j, String str, long j2, long j3) {
        }

        /* renamed from: D */
        public void mo1797D(long j) {
            if (((ConcurrentHashMap) C1902l.this.f11751d).containsKey(Long.valueOf(j))) {
                C1904b bVar = (C1904b) ((ConcurrentHashMap) C1902l.this.f11751d).get(Long.valueOf(j));
                if (((ConcurrentHashMap) C1902l.this.f11752e).containsKey(bVar.f11755a)) {
                    ((ConcurrentHashMap) C1902l.this.f11752e).remove(bVar.f11755a);
                }
                ((ConcurrentHashMap) C1902l.this.f11751d).remove(Long.valueOf(j));
            }
        }

        /* renamed from: O */
        public void mo1798O(long j) {
        }

        /* renamed from: Q */
        public void mo1799Q(long j, String str) {
        }

        /* renamed from: S */
        public void mo1800S(long j) {
        }

        /* renamed from: d */
        public void mo1801d(long j, int i, boolean z) {
            if (((ConcurrentHashMap) C1902l.this.f11751d).containsKey(Long.valueOf(j))) {
                Log.m105921e("MicroMsg.SRDownloadFile", "down fail, id:%d errCode:%d", Long.valueOf(j), Integer.valueOf(i));
                C1904b bVar = (C1904b) ((ConcurrentHashMap) C1902l.this.f11751d).get(Long.valueOf(j));
                if (((ConcurrentHashMap) C1902l.this.f11752e).containsKey(bVar.f11755a)) {
                    ((ConcurrentHashMap) C1902l.this.f11752e).remove(bVar.f11755a);
                }
                ((ConcurrentHashMap) C1902l.this.f11751d).remove(Long.valueOf(j));
                C1899a aVar = bVar.f11757c;
                if (aVar != null) {
                    aVar.mo1794a(1);
                }
            }
        }

        /* renamed from: f0 */
        public void mo1802f0(long j, String str) {
            Log.m105925i("MicroMsg.SRDownloadFile", "onTaskStarted id:%s savedFilePath:%s", Long.valueOf(j), str);
        }

        /* renamed from: q */
        public void mo1803q(long j, String str, boolean z) {
            if (((ConcurrentHashMap) C1902l.this.f11751d).containsKey(Long.valueOf(j))) {
                C1904b bVar = (C1904b) ((ConcurrentHashMap) C1902l.this.f11751d).get(Long.valueOf(j));
                if (((ConcurrentHashMap) C1902l.this.f11752e).containsKey(bVar.f11755a)) {
                    ((ConcurrentHashMap) C1902l.this.f11752e).remove(bVar.f11755a);
                }
                if (Util.isNullOrNil(str)) {
                    ((ConcurrentHashMap) C1902l.this.f11751d).remove(Long.valueOf(j));
                    C1899a aVar = bVar.f11757c;
                    if (aVar != null) {
                        aVar.mo1794a(1);
                    }
                } else if (!bVar.f11756b.equals(C90801g.m113874b(str))) {
                    Log.m105920e("MicroMsg.SRDownloadFile", "MD5 error!");
                    ((ConcurrentHashMap) C1902l.this.f11751d).remove(Long.valueOf(j));
                    C1899a aVar2 = bVar.f11757c;
                    if (aVar2 != null) {
                        aVar2.mo1794a(2);
                    }
                } else {
                    ((ConcurrentHashMap) C1902l.this.f11751d).remove(Long.valueOf(j));
                    String e = C112760b.m154227e();
                    Log.m105925i("MicroMsg.SRDownloadFile", "download success, path:%s", str);
                    Uri n = C116299g2.m163858n(e);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                        if (l2.mo177810a()) {
                            l2.f348991a.mo119937g(l2.f348992b);
                        }
                    }
                    try {
                        if (C86013q1.m106436R(C86013q1.m106448i(str, false), e) < 0) {
                            Log.m105920e("MicroMsg.SRDownloadFile", "unzip error!");
                            C1899a aVar3 = bVar.f11757c;
                            if (aVar3 != null) {
                                aVar3.mo1794a(3);
                                return;
                            }
                            return;
                        }
                        C1899a aVar4 = bVar.f11757c;
                        if (aVar4 != null) {
                            aVar4.mo1795b(0);
                        }
                        Log.m105920e("MicroMsg.SRDownloadFile", "download Success");
                    } catch (Exception e2) {
                        C1899a aVar5 = bVar.f11757c;
                        if (aVar5 != null) {
                            aVar5.mo1794a(4);
                        }
                        Log.printErrStackTrace("MicroMsg.SRDownloadFile", e2, "", new Object[0]);
                        Log.m105924i("MicroMsg.SRDownloadFile", "download Fail, in exception");
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.l$b */
    public class C1904b {

        /* renamed from: a */
        public String f11755a;

        /* renamed from: b */
        public String f11756b;

        /* renamed from: c */
        public C1899a f11757c;

        public C1904b(C1902l lVar, String str, String str2, C1899a aVar) {
            this.f11755a = str;
            this.f11756b = str2;
            this.f11757c = aVar;
        }
    }
}
