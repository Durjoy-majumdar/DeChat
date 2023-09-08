package o80;

import android.media.MediaFormat;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import java.nio.ByteBuffer;
import p914oj.C110052b;
import p914oj.C89231c;
import z04.C112550d0;

/* renamed from: o80.a */
public final class C109993a {

    /* renamed from: a */
    public final String f329154a;

    /* renamed from: b */
    public final C110052b f329155b;

    /* renamed from: c */
    public int f329156c = -1;

    /* renamed from: d */
    public int f329157d = -1;

    /* renamed from: e */
    public MediaFormat f329158e;

    /* renamed from: f */
    public MediaFormat f329159f;

    /* renamed from: g */
    public int f329160g;

    /* renamed from: h */
    public boolean f329161h;

    /* renamed from: i */
    public int f329162i;

    /* renamed from: j */
    public long f329163j;

    /* renamed from: k */
    public boolean f329164k;

    /* renamed from: l */
    public boolean f329165l;

    public C109993a(String str) {
        int integer;
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        this.f329154a = str;
        C110052b bVar = new C110052b();
        this.f329155b = bVar;
        try {
            bVar.mo161392k(str);
            int d = bVar.mo161385d();
            Log.m105924i("MicroMsg.MediaExtractorWrapper", "trackCount :" + d + " filePath :" + str);
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < d; i++) {
                MediaFormat e = this.f329155b.mo161386e(i);
                C87412m.m108593f(e, "mediaExtractor.getTrackFormat(track)");
                String string = e.getString("mime");
                C87412m.m108591d(string);
                if (C112550d0.m153801u(string, "video", false)) {
                    sparseArray.put(i, e);
                } else if (C112550d0.m153801u(string, "audio", false)) {
                    sparseArray2.put(i, e);
                }
            }
            Log.m105924i("MicroMsg.MediaExtractorWrapper", "video track count:" + sparseArray.size() + ", audio track count:" + sparseArray2.size());
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(0);
                this.f329157d = keyAt;
                this.f329159f = (MediaFormat) sparseArray2.get(keyAt);
            }
            if (sparseArray.size() > 0) {
                int i2 = Integer.MAX_VALUE;
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int keyAt2 = sparseArray.keyAt(i3);
                    MediaFormat mediaFormat = (MediaFormat) sparseArray.get(keyAt2);
                    if (mediaFormat.containsKey("frame-rate") && (integer = mediaFormat.getInteger("frame-rate")) < i2) {
                        this.f329156c = keyAt2;
                        this.f329158e = mediaFormat;
                        i2 = integer;
                    }
                }
                if (this.f329156c < 0) {
                    int keyAt3 = sparseArray.keyAt(0);
                    this.f329156c = keyAt3;
                    this.f329158e = (MediaFormat) sparseArray.get(keyAt3);
                }
            }
            Log.m105924i("MicroMsg.MediaExtractorWrapper", "audio track index:" + this.f329157d + ", format:" + this.f329159f);
            Log.m105924i("MicroMsg.MediaExtractorWrapper", "video track index: " + this.f329156c + ", format:" + this.f329158e);
            int i4 = this.f329156c;
            if (i4 >= 0) {
                this.f329155b.mo161390i(i4);
                this.f329161h = true;
            }
            C89231c cVar = new C89231c();
            cVar.setDataSource(this.f329154a);
            this.f329160g = Integer.parseInt(cVar.extractMetadata(20));
            cVar.release();
            Log.m105918d("MicroMsg.MediaExtractorWrapper", "current info :" + this);
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.MediaExtractorWrapper", e2, "", new Object[0]);
            this.f329164k = true;
        }
    }

    /* renamed from: d */
    public static boolean m149513d(C109993a aVar, ByteBuffer byteBuffer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        aVar.getClass();
        C87412m.m108594g(byteBuffer, "byteBuffer");
        try {
            if (aVar.f329165l) {
                Log.m105920e("MicroMsg.MediaExtractorWrapper", "readNextSampleData already release");
                return false;
            }
            aVar.f329162i = aVar.f329155b.mo161387f(byteBuffer, i);
            aVar.f329163j = aVar.f329155b.mo161383b();
            aVar.f329155b.mo161382a();
            return aVar.f329155b.mo161384c() == (aVar.f329161h ? aVar.f329156c : aVar.f329157d);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaExtractorWrapper", e, "readNextSampleData", new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public final String mo161324a() {
        MediaFormat mediaFormat = this.f329159f;
        if (mediaFormat != null) {
            return mediaFormat.getString("mime");
        }
        return null;
    }

    /* renamed from: b */
    public final long mo161325b() {
        try {
            return this.f329163j;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaExtractorWrapper", e, "getSampleTime error", new Object[0]);
            return -1;
        }
    }

    /* renamed from: c */
    public final String mo161326c() {
        MediaFormat mediaFormat = this.f329158e;
        if (mediaFormat != null) {
            return mediaFormat.getString("mime");
        }
        return null;
    }

    /* renamed from: e */
    public final void mo161327e() {
        this.f329155b.mo161388g();
        this.f329165l = true;
    }

    /* renamed from: f */
    public final void mo161328f(long j) {
        if (!this.f329165l) {
            this.f329155b.mo161389h(j, 0);
        } else {
            Log.m105920e("MicroMsg.MediaExtractorWrapper", "seek error, mediaExtractor already release!");
        }
    }

    /* renamed from: g */
    public final void mo161329g() {
        try {
            int i = this.f329156c;
            if (i >= 0) {
                this.f329155b.f329324a.unselectTrack(i);
            }
            int i2 = this.f329157d;
            if (i2 >= 0) {
                this.f329161h = false;
                this.f329155b.mo161390i(i2);
                this.f329162i = 0;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaExtractorWrapper", e, "selectAudio error", new Object[0]);
        }
    }

    /* renamed from: h */
    public final void mo161330h() {
        try {
            int i = this.f329157d;
            if (i >= 0) {
                this.f329155b.f329324a.unselectTrack(i);
            }
            int i2 = this.f329156c;
            if (i2 >= 0) {
                this.f329161h = true;
                this.f329155b.mo161390i(i2);
                this.f329162i = 0;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaExtractorWrapper", e, "selectVideo error", new Object[0]);
        }
    }

    public String toString() {
        return "MediaExtractorWrapper(filePath='" + this.f329154a + "', mediaExtractor=" + this.f329155b + ", videoTrackIndex=" + this.f329156c + ", audioTrackIndex=" + this.f329157d + ", videoTrackFormat=" + this.f329158e + ", audioTrackForamt=" + this.f329159f + ", videoBitrate=" + this.f329160g + ", selectVideo=" + this.f329161h + ", sampleSize=" + this.f329162i + ", hasError=" + this.f329164k + ", isRelease=" + this.f329165l + ')';
    }
}
