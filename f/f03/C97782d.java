package f03;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k34.C117388a;

/* renamed from: f03.d */
public final class C97782d extends C117388a {

    /* renamed from: d */
    public C97787h f286864d;

    /* renamed from: e */
    public final AtomicInteger f286865e = new AtomicInteger(0);

    /* renamed from: f */
    public final String f286866f;

    /* renamed from: g */
    public final ConcurrentHashMap<String, C97787h> f286867g;

    public C97782d(C97787h hVar) {
        C87412m.m108594g(hVar, "downloader");
        this.f286864d = hVar;
        String str = "MicroMsg.DownloaderTPAssetResourceLoader@" + hashCode();
        this.f286866f = str;
        ConcurrentHashMap<String, C97787h> concurrentHashMap = new ConcurrentHashMap<>();
        this.f286867g = concurrentHashMap;
        String mediaId = this.f286864d.getMediaId();
        C87412m.m108591d(mediaId);
        concurrentHashMap.put(mediaId, this.f286864d);
        Log.m105924i(str, "<init>, downloader=" + this.f286864d.hashCode());
    }

    public String getContentType(int i, String str) {
        String str2 = this.f286866f;
        Log.m105924i(str2, "getContentType: fileId=" + i + ", fileKey=" + str);
        return MimeTypes.VIDEO_MP4;
    }

    public String getDataFilePath(int i, String str) {
        C97787h hVar = this.f286867g.get(str);
        if (hVar == null) {
            String str2 = this.f286866f;
            Log.m105928w(str2, "getDataFilePath: fileId=" + i + ", fileKey=" + str + " return for downloader.");
            return "";
        }
        String str3 = this.f286866f;
        Log.m105924i(str3, "getDataFilePath: fileId=" + i + ", fileKey=" + str);
        String i2 = C86013q1.m106448i(hVar.mo134538j(), false);
        return i2 == null ? "" : i2;
    }

    public long getDataTotalSize(int i, String str) {
        C97787h hVar = this.f286867g.get(str);
        if (hVar == null) {
            String str2 = this.f286866f;
            Log.m105928w(str2, "getDataTotalSize: fileId=" + i + ", fileKey=" + str + " return for downloader.");
            return 0;
        }
        String str3 = this.f286866f;
        Log.m105924i(str3, "getDataTotalSize: fileId=" + i + ", fileKey=" + str + ", length=" + hVar.mo134528a() + ", downloader=" + hVar.hashCode());
        return hVar.mo134528a();
    }

    public int onReadData(int i, String str, long j, long j2) {
        C87412m.m108594g(str, "fileKey");
        C97787h hVar = this.f286867g.get(str);
        if (hVar == null) {
            String str2 = this.f286866f;
            Log.m105928w(str2, "onReadData: fileId=" + i + ", fileKey=" + str + " return for downloader.");
            return 0;
        }
        long i2 = hVar.mo134537i(j, j2);
        String str3 = this.f286866f;
        Log.m105924i(str3, "onReadData: fileId=" + i + ", fileKey=" + str + ", checkAvailable(" + j + ", " + j2 + ")=" + i2);
        if (i2 >= j2) {
            return (int) j2;
        }
        hVar.mo134536h(j, j2);
        return (int) i2;
    }

    public int onStartReadData(int i, String str, long j, long j2) {
        C87412m.m108594g(str, "fileKey");
        String str2 = this.f286866f;
        Log.m105924i(str2, "onStartReadData: fileId=" + i + ", fileKey=" + str + ", " + j + '-' + j2 + ", path=" + this.f286864d.mo134538j());
        return this.f286865e.incrementAndGet();
    }

    public int onStopReadData(int i, String str, int i2) {
        String str2 = this.f286866f;
        Log.m105924i(str2, "onStopReadData: fileId=" + i + ", fileKey=" + str + ", requestId=" + i2);
        return this.f286865e.get();
    }
}
