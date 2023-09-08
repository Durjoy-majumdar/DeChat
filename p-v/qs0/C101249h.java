package qs0;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: qs0.h */
public final class C101249h implements C98124g.C98125a, C98127h.C98128a {

    /* renamed from: d */
    public static final C101249h f296467d = new C101249h();

    /* renamed from: e */
    public static final ReentrantLock f296468e = new ReentrantLock();

    /* renamed from: f */
    public static final HashMap<String, C101250a> f296469f = new HashMap<>();

    /* renamed from: g */
    public static final HashMap<String, HashSet<Integer>> f296470g = new HashMap<>();

    /* renamed from: h */
    public static final ReentrantLock f296471h = new ReentrantLock();

    /* renamed from: i */
    public static final HashMap<String, Boolean> f296472i = new HashMap<>();

    /* renamed from: j */
    public static final HashMap<String, HashSet<WeakReference<C32226l<Boolean, C13598b0>>>> f296473j = new HashMap<>();

    /* renamed from: n */
    public static final ReentrantLock f296474n = new ReentrantLock();

    /* renamed from: o */
    public static final HashMap<String, HashSet<WeakReference<C32227p<Long, Long, C13598b0>>>> f296475o = new HashMap<>();

    /* renamed from: qs0.h$a */
    public static final class C101250a {

        /* renamed from: a */
        public long f296476a;

        /* renamed from: b */
        public long f296477b;

        public C101250a(String str, String str2, String str3, long j, long j2, int i, C8480h hVar) {
            j = (i & 8) != 0 ? 0 : j;
            j2 = (i & 16) != 0 ? 0 : j2;
            C87412m.m108594g(str, "srcUrl");
            C87412m.m108594g(str2, "downloadId");
            C87412m.m108594g(str3, "cachePath");
            this.f296476a = j;
            this.f296477b = j2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo140722a(Object obj, String str, String str2, String str3, long j, long j2) {
        String str4;
        String str5;
        int i;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        long j3 = j;
        long j4 = j2;
        C87412m.m108594g(obj, "caller");
        C87412m.m108594g(str6, "srcUrl");
        C87412m.m108594g(str7, "downloadId");
        C87412m.m108594g(str8, "cachePath");
        ReentrantLock reentrantLock = f296468e;
        reentrantLock.lock();
        try {
            HashMap<String, C101250a> hashMap = f296469f;
            C101250a aVar = hashMap.get(str7);
            reentrantLock.unlock();
            if (aVar == null) {
                C101250a aVar2 = r1;
                HashMap<String, C101250a> hashMap2 = hashMap;
                C101250a aVar3 = new C101250a(str, str2, str3, 0, 0, 24, (C8480h) null);
                str4 = "MicroMsg.AppBrand.ThumbCdnDownloadManager";
                Log.m105924i(str4, "startDownload, addDownloadTask");
                C101241a aVar4 = C101241a.f296445d;
                C98127h hVar = new C98127h();
                hVar.f287705p0 = str6;
                hVar.field_mediaId = str7;
                hVar.field_fullpath = str8;
                hVar.f287689V = 1;
                C101249h hVar2 = f296467d;
                hVar.f287662f = hVar2;
                hVar.f287704f1 = hVar2;
                hVar.f287660d = "task_AppbrandCdnService_2";
                hVar.f287655L = 4;
                str5 = "MicroMsg.AppBrandCdnService";
                Log.m105924i(str5, "addDownloadTask, mediaId: " + hVar.field_mediaId);
                ConcurrentHashMap<String, C98127h> concurrentHashMap = C101241a.f296446e;
                if (concurrentHashMap.putIfAbsent(hVar.field_mediaId, hVar) == null) {
                    CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
                    c2CDownloadRequest.fileKey = hVar.field_mediaId;
                    c2CDownloadRequest.url = hVar.f287705p0;
                    c2CDownloadRequest.referer = hVar.f287706x0;
                    c2CDownloadRequest.setSavePath(hVar.field_fullpath);
                    c2CDownloadRequest.fileType = CdnLogic.kMediaTypeAdVideo;
                    c2CDownloadRequest.concurrentCount = 10;
                    c2CDownloadRequest.preloadRatio = hVar.field_preloadRatio;
                    c2CDownloadRequest.preloadMinSize = hVar.f287671r;
                    c2CDownloadRequest.customHeader = "User-Agent:" + MMApplicationContext.getApplicationId() + "\r\nAccept-Encoding:identity\nContent-Type:\r\n";
                    i = CdnLogic.startHttpVideoStreamingDownload(c2CDownloadRequest, aVar4, aVar4, hVar.f287689V);
                    Log.m105924i(str5, "addDownloadTask, startHttpVideoStreamingDownload, result: " + i);
                    if (i != 0) {
                        concurrentHashMap.remove(hVar.field_mediaId);
                    }
                } else {
                    i = 0;
                }
                if (i != 0) {
                    Log.m105928w(str4, "startDownload, addDownloadTask fail");
                    ReentrantLock reentrantLock2 = f296471h;
                    reentrantLock2.lock();
                    try {
                        f296472i.put(str7, Boolean.FALSE);
                        HashSet hashSet = f296473j.get(str7);
                        Set<WeakReference> D0 = hashSet != null ? C110818d0.m150904D0(hashSet) : null;
                        if (D0 != null) {
                            for (WeakReference weakReference : D0) {
                                C32226l lVar = (C32226l) weakReference.get();
                                if (lVar != null) {
                                    lVar.invoke(Boolean.FALSE);
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                        reentrantLock2.unlock();
                    }
                } else {
                    reentrantLock.lock();
                    try {
                        hashMap2.put(str7, aVar2);
                        HashMap<String, HashSet<Integer>> hashMap3 = f296470g;
                        HashSet<Integer> hashSet2 = hashMap3.get(str7);
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet<>();
                            hashMap3.put(str7, hashSet2);
                        }
                        hashSet2.add(Integer.valueOf(obj.hashCode()));
                        C13598b0 b0Var = C13598b0.f38549a;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            } else {
                str4 = "MicroMsg.AppBrand.ThumbCdnDownloadManager";
                str5 = "MicroMsg.AppBrandCdnService";
            }
            C101241a aVar5 = C101241a.f296445d;
            StringBuilder sb = new StringBuilder();
            sb.append("requestVideoData, mediaId: ");
            sb.append(str7);
            sb.append(", offset: ");
            sb.append(j3);
            sb.append(", length: ");
            long j5 = j2;
            sb.append(j5);
            sb.append(", durationMs: ");
            sb.append(0);
            Log.m105924i(str5, sb.toString());
            if (CdnLogic.requestVideoData(str2, j, j2, 0) == 0) {
                Log.m105924i(str4, "startDownload, requestVideoData, downloadId: " + str7 + ", offset: " + j3 + ", length: " + j5);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo140723b(Object obj, String str) {
        C87412m.m108594g(obj, "caller");
        C87412m.m108594g(str, "downloadId");
        ReentrantLock reentrantLock = f296468e;
        reentrantLock.lock();
        try {
            if (f296469f.get(str) != null) {
                HashSet hashSet = f296470g.get(str);
                boolean z = false;
                if (hashSet != null && true == hashSet.remove(Integer.valueOf(obj.hashCode()))) {
                    z = true;
                }
                if (!z) {
                    reentrantLock.unlock();
                } else if (!hashSet.isEmpty()) {
                    Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "stopDownload, callersSet is not empty");
                    reentrantLock.unlock();
                } else {
                    C13598b0 b0Var = C13598b0.f38549a;
                    reentrantLock.unlock();
                    if (C101241a.f296445d.mo140713a(str) != 0) {
                        Log.m105928w("MicroMsg.AppBrand.ThumbCdnDownloadManager", "stopDownload, cancelDownloadTask fail");
                    }
                    ReentrantLock reentrantLock2 = f296471h;
                    reentrantLock2.lock();
                    try {
                        f296472i.remove(str);
                        HashSet<WeakReference> hashSet2 = f296473j.get(str);
                        if (hashSet2 != null) {
                            for (WeakReference weakReference : hashSet2) {
                                C32226l lVar = (C32226l) weakReference.get();
                                if (lVar != null) {
                                    lVar.invoke(Boolean.FALSE);
                                }
                            }
                        }
                        ReentrantLock reentrantLock3 = f296468e;
                        reentrantLock3.lock();
                        try {
                            f296470g.remove(str);
                            C101250a remove = f296469f.remove(str);
                        } finally {
                            reentrantLock3.unlock();
                        }
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public void mo17917e(String str, long j, long j2) {
        HashSet<WeakReference> hashSet;
        if (str != null) {
            ReentrantLock reentrantLock = f296471h;
            reentrantLock.lock();
            try {
                f296472i.put(str, Boolean.TRUE);
                HashSet hashSet2 = f296473j.get(str);
                Set<WeakReference> D0 = hashSet2 != null ? C110818d0.m150904D0(hashSet2) : null;
                if (D0 != null) {
                    for (WeakReference weakReference : D0) {
                        C32226l lVar = (C32226l) weakReference.get();
                        if (lVar != null) {
                            lVar.invoke(Boolean.TRUE);
                        }
                    }
                }
                ReentrantLock reentrantLock2 = f296474n;
                reentrantLock2.lock();
                if (j >= j2) {
                    try {
                        hashSet = f296475o.remove(str);
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                } else {
                    hashSet = f296475o.get(str);
                }
                reentrantLock2.unlock();
                if (hashSet != null) {
                    for (WeakReference weakReference2 : hashSet) {
                        C32227p pVar = (C32227p) weakReference2.get();
                        if (pVar != null) {
                            pVar.invoke(Long.valueOf(j), Long.valueOf(j2));
                        }
                    }
                }
                ReentrantLock reentrantLock3 = f296468e;
                reentrantLock3.lock();
                try {
                    C101250a aVar = f296469f.get(str);
                    if (aVar == null) {
                        Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onProgress, taskInfo is null");
                        return;
                    }
                    aVar.f296476a = j;
                    aVar.f296477b = j2;
                    C13598b0 b0Var = C13598b0.f38549a;
                    reentrantLock3.unlock();
                } finally {
                    reentrantLock3.unlock();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: g */
    public void mo17918g(String str, int i, C98121d dVar) {
        Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onFinish, mediaId: " + str + ", ret: " + i);
        if (str != null && dVar != null) {
            boolean z = i == 0;
            ReentrantLock reentrantLock = f296471h;
            reentrantLock.lock();
            try {
                f296472i.put(str, Boolean.valueOf(z));
                HashSet remove = f296473j.remove(str);
                Set<WeakReference> D0 = remove != null ? C110818d0.m150904D0(remove) : null;
                if (D0 != null) {
                    for (WeakReference weakReference : D0) {
                        C32226l lVar = (C32226l) weakReference.get();
                        if (lVar != null) {
                            lVar.invoke(Boolean.valueOf(z));
                        }
                    }
                }
                long j = dVar.field_fileLength;
                if (z) {
                    ReentrantLock reentrantLock2 = f296474n;
                    reentrantLock2.lock();
                    try {
                        HashSet<WeakReference> remove2 = f296475o.remove(str);
                        if (remove2 != null) {
                            for (WeakReference weakReference2 : remove2) {
                                C32227p pVar = (C32227p) weakReference2.get();
                                if (pVar != null) {
                                    pVar.invoke(Long.valueOf(j), Long.valueOf(j));
                                }
                            }
                        }
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
                if (C101241a.f296445d.mo140713a(str) != 0) {
                    Log.m105928w("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onFinish, cancelDownloadTask fail");
                }
                ReentrantLock reentrantLock3 = f296468e;
                reentrantLock3.lock();
                try {
                    f296470g.remove(str);
                    C101250a remove3 = f296469f.remove(str);
                } finally {
                    reentrantLock3.unlock();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C87412m.m108594g(str, "mediaId");
        Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "callback, mediaId: " + str + ", startRet: " + i);
        if (i == 0) {
            return 0;
        }
        ReentrantLock reentrantLock = f296471h;
        reentrantLock.lock();
        try {
            f296472i.put(str, Boolean.FALSE);
            HashSet<WeakReference> hashSet = f296473j.get(str);
            if (hashSet == null) {
                return 0;
            }
            for (WeakReference weakReference : hashSet) {
                C32226l lVar = (C32226l) weakReference.get();
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
            }
            return 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "getCdnAuthInfo, mediaId: " + str);
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "decodePrepareResponse, mediaId: " + str);
        return new byte[0];
    }

    public void onDataAvailable(String str, long j, long j2) {
        Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onDataAvailable, mediaId: " + str + ", offset: " + j + ", length: " + j2);
        if (str != null) {
            ReentrantLock reentrantLock = f296471h;
            reentrantLock.lock();
            try {
                f296472i.put(str, Boolean.TRUE);
                HashSet hashSet = f296473j.get(str);
                Set<WeakReference> D0 = hashSet != null ? C110818d0.m150904D0(hashSet) : null;
                if (D0 != null) {
                    for (WeakReference weakReference : D0) {
                        C32226l lVar = (C32226l) weakReference.get();
                        if (lVar != null) {
                            lVar.invoke(Boolean.TRUE);
                        }
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public void onM3U8Ready(String str, String str2) {
        Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onMoovReady, mediaId: " + str + ", m3u8: " + str2);
    }

    public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        C87412m.m108594g(videoInfo, "info");
        Log.m105924i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onMoovReady, mediaId: " + str + ", offset: " + j + ", length: " + j2);
        if (str != null) {
            ReentrantLock reentrantLock = f296471h;
            reentrantLock.lock();
            try {
                f296472i.put(str, Boolean.TRUE);
                HashSet hashSet = f296473j.get(str);
                Set<WeakReference> D0 = hashSet != null ? C110818d0.m150904D0(hashSet) : null;
                if (D0 != null) {
                    for (WeakReference weakReference : D0) {
                        C32226l lVar = (C32226l) weakReference.get();
                        if (lVar != null) {
                            lVar.invoke(Boolean.TRUE);
                        }
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
