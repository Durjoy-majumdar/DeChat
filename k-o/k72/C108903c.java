package k72;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaFormat;
import com.tencent.p014mm.modelvideoh265toh264.C92862f;
import com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.p014mm.plugin.sight.base.C85457c;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import g72.C107755a;
import j72.C98921l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Future;
import k72.C108910h;
import p914oj.C110052b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: k72.c */
public class C108903c extends C107755a {

    /* renamed from: b */
    public C108898a f326198b;

    /* renamed from: c */
    public C108910h f326199c;

    /* renamed from: d */
    public String f326200d;

    /* renamed from: e */
    public String f326201e;

    /* renamed from: f */
    public int f326202f;

    /* renamed from: g */
    public int f326203g;

    /* renamed from: h */
    public int f326204h;

    /* renamed from: i */
    public int f326205i;

    /* renamed from: j */
    public int f326206j;

    /* renamed from: k */
    public int f326207k;

    /* renamed from: l */
    public int f326208l = -1;

    /* renamed from: m */
    public int f326209m;

    /* renamed from: n */
    public long f326210n = -1;

    /* renamed from: o */
    public long f326211o = -1;

    /* renamed from: p */
    public int f326212p = -1;

    /* renamed from: q */
    public int f326213q;

    /* renamed from: r */
    public int f326214r;

    /* renamed from: s */
    public int f326215s;

    /* renamed from: t */
    public int f326216t;

    /* renamed from: u */
    public C110052b f326217u;

    /* renamed from: v */
    public Point f326218v = null;

    /* renamed from: w */
    public int f326219w;

    /* renamed from: x */
    public Bitmap f326220x;

    /* renamed from: y */
    public byte[] f326221y = null;

    /* renamed from: k72.c$a */
    public class C108904a implements C108913i {
        public C108904a() {
        }

        /* renamed from: a */
        public void mo160036a(byte[] bArr, boolean z, long j) {
            C108910h hVar;
            C108910h.C108912b bVar;
            byte[] bArr2 = bArr;
            C108903c cVar = C108903c.this;
            if (cVar.f326218v == null) {
                cVar.f326218v = cVar.f326198b.mo160031c();
            }
            C108903c.this.getClass();
            C108903c cVar2 = C108903c.this;
            Bitmap bitmap = cVar2.f326220x;
            if (bitmap != null) {
                if (cVar2.f326221y == null) {
                    int i = cVar2.f326207k;
                    if (i == 90 || i == 270) {
                        cVar2.f326220x = BitmapUtil.rotate(bitmap, (float) (360 - i));
                    } else if (i == 180) {
                        cVar2.f326220x = BitmapUtil.rotate(bitmap, 180.0f);
                    }
                    C108903c cVar3 = C108903c.this;
                    Bitmap bitmap2 = cVar3.f326220x;
                    Point point = cVar3.f326218v;
                    cVar3.f326220x = Bitmap.createScaledBitmap(bitmap2, point.x, point.y, true);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(C108903c.this.f326220x.getRowBytes() * C108903c.this.f326220x.getHeight());
                    allocateDirect.position(0);
                    C108903c.this.f326220x.copyPixelsToBuffer(allocateDirect);
                    allocateDirect.position(0);
                    C108903c.this.f326221y = new byte[allocateDirect.remaining()];
                    allocateDirect.get(C108903c.this.f326221y);
                }
                C108903c cVar4 = C108903c.this;
                byte[] bArr3 = cVar4.f326221y;
                Point point2 = cVar4.f326218v;
                SightVideoJNI.blendYuvFrame(bArr, bArr3, point2.x, point2.y);
            }
            C108903c cVar5 = C108903c.this;
            C108910h hVar2 = cVar5.f326199c;
            if (hVar2 != null) {
                Point point3 = cVar5.f326218v;
                int i2 = point3.x;
                int i3 = point3.y;
                int b = cVar5.f326198b.mo160030b();
                if (bArr2 != null) {
                    Log.m105919d("MicroMsg.MMSightRemuxX264Encoder", "writeData, needScale: %s, srcSize: [%s, %s], targetSize: [%s, %s], pts: %s", Boolean.valueOf((i2 == hVar2.f326269d && i3 == hVar2.f326270e) ? false : true), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(hVar2.f326269d), Integer.valueOf(hVar2.f326270e), Long.valueOf(j));
                    MP4MuxerJNI.writeYuvDataForSegmentLock(bArr, i2, i3, hVar2.f326269d, hVar2.f326270e, b, hVar2.f326267b, hVar2.f326268c);
                    hVar2.f326271f++;
                } else {
                    hVar2.getClass();
                }
            }
            C98921l.f289964d.mo138260o(bArr);
            if (z && (hVar = C108903c.this.f326199c) != null && (bVar = hVar.f326266a) != null) {
                bVar.f326274g = true;
            }
        }
    }

    public C108903c(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6) {
        String str3 = str;
        String str4 = str2;
        int i7 = i;
        int i8 = i2;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || i7 <= 0 || i8 <= 0) {
            int i9 = i4;
            Log.m105921e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4));
            return;
        }
        this.f326200d = str3;
        this.f326201e = str4;
        this.f326204h = i7;
        this.f326205i = i8;
        this.f326206j = i3;
        this.f326212p = i4;
        this.f326215s = i5;
        this.f326216t = i6;
        this.f326207k = SightVideoJNI.getMp4RotateVFS(str);
        C94554a c = C94555d.m119567c(str3, true);
        if (c != null) {
            this.f326202f = c.f273445c;
            this.f326203g = c.f273446d;
            this.f326208l = c.f273443a;
            this.f326209m = c.f273447e;
        }
        this.f326210n = 0;
        this.f326211o = (long) this.f326208l;
        Log.m105925i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", str3, str4, Integer.valueOf(this.f326202f), Integer.valueOf(this.f326203g), Integer.valueOf(this.f326207k), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public int mo158181a() {
        return 3;
    }

    /* renamed from: b */
    public int mo158182b() {
        int i;
        int i2;
        int round = Math.round(((float) this.f326208l) / 1000.0f);
        long j = this.f326210n;
        if (j >= 0) {
            long j2 = this.f326211o;
            if (j2 >= 0) {
                round = Math.round(((float) (j2 - j)) / 1000.0f) + 1;
            }
        }
        this.f326219w = MP4MuxerJNI.initDataBufLock(round);
        if (C92862f.m117175h(this.f326200d)) {
            Log.m105924i("MicroMsg.MMSightFFMpegX264Remuxer", "ish265, create mediacodec decoder");
            this.f326198b = new C108907f();
        } else {
            this.f326198b = new C108905d();
        }
        int i3 = this.f326208l;
        if (i3 > 0) {
            i = this.f326198b.mo160034f(this.f326200d, 0, (long) i3, this.f326209m);
        } else {
            long j3 = this.f326210n;
            if (j3 >= 0) {
                long j4 = this.f326211o;
                if (j4 >= 0) {
                    i = this.f326198b.mo160034f(this.f326200d, j3, j4, this.f326209m);
                }
            }
            Log.m105921e("MicroMsg.MMSightFFMpegX264Remuxer", "remux time error, videoDuration: %s, remuxStartTime: %s, remuxEndTime: %s", Integer.valueOf(i3), Long.valueOf(this.f326210n), Long.valueOf(this.f326211o));
            MP4MuxerJNI.releaseDataBufLock(this.f326219w);
            return -1;
        }
        Log.m105925i("MicroMsg.MMSightFFMpegX264Remuxer", "decoder init ret: %s", Integer.valueOf(i));
        if (i < 0) {
            MP4MuxerJNI.releaseDataBufLock(this.f326219w);
            return -1;
        }
        int i4 = this.f326212p;
        if (i4 > 0 && i4 < (i2 = this.f326209m)) {
            this.f326198b.mo160029a((int) Math.ceil((double) (((float) i2) / ((float) i4))));
        }
        int i5 = this.f326212p;
        int min = i5 > 0 ? Math.min(i5, this.f326209m) : this.f326209m;
        this.f326198b.mo160032d(new C108904a());
        int i6 = this.f326202f;
        int i7 = this.f326203g;
        int i8 = this.f326204h;
        int i9 = this.f326205i;
        int i15 = this.f326206j;
        int i16 = C85457c.f249057b;
        int i17 = this.f326215s;
        int i18 = this.f326216t;
        int i19 = i17;
        int i25 = i15;
        C108910h hVar = r9;
        C108910h hVar2 = new C108910h(i6, i7, i8, i9, i25, min, 2, i16, i19, i18);
        this.f326199c = hVar;
        hVar.f326271f = 0;
        MP4MuxerJNI.initH264EncoderLock(i8, i9, (float) min, i25, i16, 8, 2, 23.0f, i19, i18);
        hVar.f326266a = new C108910h.C108912b(hVar, (C108910h.C108911a) null);
        C119179t tVar = C119157j.f356862d;
        C108910h.C108912b bVar = new C108910h.C108912b(hVar, (C108910h.C108911a) null);
        hVar.f326266a = bVar;
        ((C119157j) tVar).mo183884o(bVar);
        Log.m105924i("MicroMsg.MMSightRemuxX264Encoder", "initAndStartEncoder");
        try {
            this.f326198b.mo160033e();
            C108910h.C108912b bVar2 = this.f326199c.f326266a;
            if (bVar2 != null) {
                bVar2.f326274g = true;
                try {
                    Future future = bVar2.f255969d;
                    if (future != null && !future.isCancelled()) {
                        bVar2.f255969d.get();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MMSightRemuxX264Encoder", e, "waitEncoderFinish, join error: %s", e.getMessage());
                }
            }
            mo160037d();
            String str = this.f326201e;
            if (this.f326207k > 0) {
                str = str + "tempRotate.mp4";
            }
            long j5 = (long) this.f326208l;
            if (j5 <= 0) {
                j5 = this.f326211o - this.f326210n;
            }
            int muxingForX264Lock = MP4MuxerJNI.muxingForX264Lock(this.f326213q, 1024, 2, this.f326214r, str, (((float) this.f326199c.f326271f) * 1000.0f) / ((float) j5), (int) j5, (byte[]) null, 0);
            Log.m105925i("MicroMsg.MMSightFFMpegX264Remuxer", "muxing ret: %s", Integer.valueOf(muxingForX264Lock));
            int i26 = this.f326207k;
            if (i26 > 0) {
                SightVideoJNI.tagRotateVideoVFS(str, this.f326201e, i26);
                C86013q1.m106447h(str);
            }
            MP4MuxerJNI.releaseDataBufLock(this.f326219w);
            C98921l.f289964d.mo126892c();
            return muxingForX264Lock;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.MMSightFFMpegX264Remuxer", e2, "decode error: %s", e2.getMessage());
            return -1;
        }
    }

    /* renamed from: c */
    public void mo158183c(Bitmap bitmap) {
        if (bitmap != null) {
            this.f326220x = bitmap;
        }
    }

    /* renamed from: d */
    public final void mo160037d() {
        C110052b bVar = new C110052b();
        this.f326217u = bVar;
        try {
            bVar.mo161392k(this.f326200d);
            int i = -1;
            MediaFormat mediaFormat = null;
            String str = null;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f326217u.mo161385d()) {
                    break;
                }
                MediaFormat e = this.f326217u.mo161386e(i2);
                String string = e.getString("mime");
                if (string.startsWith("audio/")) {
                    i = i2;
                    mediaFormat = e;
                    str = string;
                    break;
                }
                i2++;
                str = string;
            }
            if (i >= 0 && mediaFormat != null && !Util.isNullOrNil(str)) {
                this.f326214r = mediaFormat.getInteger("channel-count");
                this.f326213q = mediaFormat.getInteger("sample-rate");
                this.f326217u.mo161390i(i);
                long j = this.f326210n;
                if (j > 0) {
                    this.f326217u.mo161389h(j * 1000, 0);
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaFormat.getInteger("max-input-size"));
                while (true) {
                    allocateDirect.clear();
                    int f = this.f326217u.mo161387f(allocateDirect, 0);
                    Log.m105919d("MicroMsg.MMSightFFMpegX264Remuxer", "sampleSize: %d", Integer.valueOf(f));
                    if (f <= 0) {
                        Log.m105925i("MicroMsg.MMSightFFMpegX264Remuxer", "muxAudio size = %d. Saw eos.", Integer.valueOf(f));
                        return;
                    } else if (this.f326217u.mo161383b() < this.f326211o * 1000) {
                        if (this.f326217u.mo161384c() != i) {
                            Log.m105920e("MicroMsg.MMSightFFMpegX264Remuxer", "track index not match! break");
                            return;
                        }
                        allocateDirect.position(0);
                        MP4MuxerJNI.writeAACDataLock(this.f326219w, allocateDirect, f);
                        this.f326217u.mo161382a();
                    } else {
                        return;
                    }
                }
            }
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.MMSightFFMpegX264Remuxer", e2, "muxAudio create extractor failed: %s", e2.getMessage());
        }
    }

    public C108903c(String str, String str2, int i, int i2, int i3, int i4, long j, long j2, int i5, int i6) {
        String str3 = str;
        String str4 = str2;
        int i7 = i;
        int i8 = i2;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || i7 <= 0 || i8 <= 0) {
            int i9 = i4;
            Log.m105921e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4));
            return;
        }
        this.f326200d = str3;
        this.f326201e = str4;
        this.f326204h = i7;
        this.f326205i = i8;
        this.f326206j = i3;
        this.f326212p = i4;
        this.f326215s = i5;
        this.f326216t = i6;
        this.f326207k = SightVideoJNI.getMp4RotateVFS(str);
        C94554a c = C94555d.m119567c(str3, true);
        if (c != null) {
            this.f326202f = c.f273445c;
            this.f326203g = c.f273446d;
            this.f326209m = c.f273447e;
        }
        this.f326210n = j;
        this.f326211o = j2;
        Log.m105925i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", str3, str4, Integer.valueOf(this.f326202f), Integer.valueOf(this.f326203g), Integer.valueOf(this.f326207k), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(j2));
    }
}
