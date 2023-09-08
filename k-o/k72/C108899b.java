package k72;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.modelvideoh265toh264.C92862f;
import com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eu3.C58834h;
import eu3.C97749e;
import g72.C107755a;
import j72.C98921l;
import java.io.IOException;
import java.nio.ByteBuffer;
import k72.C108908g;
import p914oj.C110052b;

/* renamed from: k72.b */
public class C108899b extends C107755a {

    /* renamed from: b */
    public C108898a f326172b;

    /* renamed from: c */
    public C108908g f326173c;

    /* renamed from: d */
    public String f326174d;

    /* renamed from: e */
    public String f326175e;

    /* renamed from: f */
    public int f326176f;

    /* renamed from: g */
    public int f326177g;

    /* renamed from: h */
    public int f326178h;

    /* renamed from: i */
    public int f326179i;

    /* renamed from: j */
    public int f326180j;

    /* renamed from: k */
    public int f326181k;

    /* renamed from: l */
    public int f326182l = -1;

    /* renamed from: m */
    public int f326183m;

    /* renamed from: n */
    public long f326184n = -1;

    /* renamed from: o */
    public long f326185o = -1;

    /* renamed from: p */
    public int f326186p = -1;

    /* renamed from: q */
    public int f326187q;

    /* renamed from: r */
    public int f326188r;

    /* renamed from: s */
    public C110052b f326189s;

    /* renamed from: t */
    public Point f326190t = null;

    /* renamed from: u */
    public int f326191u;

    /* renamed from: v */
    public HandlerThread f326192v;

    /* renamed from: w */
    public C108902c f326193w;

    /* renamed from: x */
    public Bitmap f326194x;

    /* renamed from: y */
    public byte[] f326195y = null;

    /* renamed from: k72.b$a */
    public class C108900a implements C108913i {
        public C108900a() {
        }

        /* renamed from: a */
        public void mo160036a(byte[] bArr, boolean z, long j) {
            C108899b bVar = C108899b.this;
            if (bVar.f326192v == null) {
                int i = C58834h.f168432b;
                bVar.f326192v = C97749e.m126093a("remuxer_encode", -2);
                C108899b.this.f326192v.start();
                C108899b bVar2 = C108899b.this;
                C108899b bVar3 = C108899b.this;
                bVar2.f326193w = new C108902c(bVar3.f326192v.getLooper());
            }
            if (C108899b.this.f326193w != null) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                byte[] n = bArr != null ? C98921l.f289964d.mo126905m(Integer.valueOf(bArr.length)) : null;
                if (n != null) {
                    System.arraycopy(bArr, 0, n, 0, n.length);
                }
                obtain.obj = n;
                obtain.arg1 = z ? 1 : 0;
                obtain.arg2 = (int) j;
                C108899b.this.f326193w.sendMessage(obtain);
            }
        }
    }

    /* renamed from: k72.b$b */
    public class C108901b implements C108908g.C108909a {
        public C108901b(C108899b bVar) {
        }
    }

    /* renamed from: k72.b$c */
    public class C108902c extends MMHandler {
        public C108902c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            long j;
            Message message2 = message;
            if (message2.what == 1) {
                byte[] bArr = (byte[]) message2.obj;
                boolean z = message2.arg1 == 1;
                long j2 = (long) message2.arg2;
                C108899b bVar = C108899b.this;
                if (bVar.f326173c != null) {
                    if (bVar.f326190t == null) {
                        bVar.f326190t = bVar.f326172b.mo160031c();
                    }
                    C108899b.this.getClass();
                    C108899b bVar2 = C108899b.this;
                    Bitmap bitmap = bVar2.f326194x;
                    if (bitmap != null) {
                        if (bVar2.f326195y == null) {
                            int i = bVar2.f326181k;
                            if (i == 90 || i == 270) {
                                bVar2.f326194x = BitmapUtil.rotate(bitmap, (float) (360 - i));
                            } else if (i == 180) {
                                bVar2.f326194x = BitmapUtil.rotate(bitmap, 180.0f);
                            }
                            C108899b bVar3 = C108899b.this;
                            Bitmap bitmap2 = bVar3.f326194x;
                            Point point = bVar3.f326190t;
                            bVar3.f326194x = Bitmap.createScaledBitmap(bitmap2, point.x, point.y, true);
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(C108899b.this.f326194x.getRowBytes() * C108899b.this.f326194x.getHeight());
                            allocateDirect.position(0);
                            C108899b.this.f326194x.copyPixelsToBuffer(allocateDirect);
                            allocateDirect.position(0);
                            C108899b.this.f326195y = new byte[allocateDirect.remaining()];
                            allocateDirect.get(C108899b.this.f326195y);
                        }
                        C108899b bVar4 = C108899b.this;
                        byte[] bArr2 = bVar4.f326195y;
                        Point point2 = bVar4.f326190t;
                        SightVideoJNI.blendYuvFrame(bArr, bArr2, point2.x, point2.y);
                    }
                    C108899b bVar5 = C108899b.this;
                    C108908g gVar = bVar5.f326173c;
                    Point point3 = bVar5.f326190t;
                    int i2 = point3.x;
                    int i3 = point3.y;
                    if (z || bArr == null) {
                        gVar.mo160044d(gVar.f326264w, true, j2);
                    } else {
                        boolean z2 = (i2 == gVar.f326246e && i3 == gVar.f326247f) ? false : true;
                        Log.m105919d("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData, needScale: %s, srcSize: [%s, %s], targetSize: [%s, %s], pts: %s", Boolean.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(gVar.f326246e), Integer.valueOf(gVar.f326247f), Long.valueOf(j2));
                        if (gVar.f326264w == null) {
                            gVar.f326264w = new byte[(((gVar.f326246e * gVar.f326247f) * 3) >> 1)];
                        }
                        if (gVar.f326248g != 19 || z2) {
                            j = j2;
                            MP4MuxerJNI.yuv420pTo420XXAndScaleLock(bArr, 2, gVar.f326264w, gVar.f326265x, i2, i3, i2, i3, gVar.f326246e, gVar.f326247f);
                        } else {
                            System.arraycopy(bArr, 0, gVar.f326264w, 0, bArr.length);
                            j = j2;
                        }
                        gVar.f326250i++;
                        gVar.mo160044d(gVar.f326264w, false, j);
                    }
                    C98921l.f289964d.mo138260o(bArr);
                }
            }
        }
    }

    public C108899b(String str, String str2, int i, int i2, int i3, int i4) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || i <= 0 || i2 <= 0) {
            Log.m105921e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4));
            return;
        }
        this.f326174d = str;
        this.f326175e = str2;
        this.f326178h = i;
        this.f326179i = i2;
        this.f326180j = i3;
        this.f326186p = i4;
        this.f326181k = SightVideoJNI.getMp4RotateVFS(str);
        C94554a c = C94555d.m119567c(str, true);
        if (c != null) {
            this.f326176f = c.f273445c;
            this.f326177g = c.f273446d;
            this.f326182l = c.f273443a;
            this.f326183m = c.f273447e;
        }
        this.f326184n = 0;
        this.f326185o = (long) this.f326182l;
        Log.m105925i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", str, str2, Integer.valueOf(this.f326176f), Integer.valueOf(this.f326177g), Integer.valueOf(this.f326181k), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public int mo158181a() {
        return 1;
    }

    /* renamed from: b */
    public int mo158182b() {
        int i;
        int i2;
        int round = Math.round(((float) this.f326182l) / 1000.0f);
        long j = this.f326184n;
        if (j >= 0) {
            long j2 = this.f326185o;
            if (j2 >= 0) {
                round = Math.round(((float) (j2 - j)) / 1000.0f) + 1;
            }
        }
        this.f326191u = MP4MuxerJNI.initDataBufLock(round);
        if (C92862f.m117175h(this.f326174d)) {
            Log.m105924i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "ish265, create mediacodec decoder");
            this.f326172b = new C108907f();
        } else {
            this.f326172b = new C108905d();
        }
        int i3 = this.f326182l;
        if (i3 > 0) {
            i = this.f326172b.mo160034f(this.f326174d, 0, (long) i3, this.f326183m);
        } else {
            long j3 = this.f326184n;
            if (j3 >= 0) {
                long j4 = this.f326185o;
                if (j4 >= 0) {
                    i = this.f326172b.mo160034f(this.f326174d, j3, j4, this.f326183m);
                }
            }
            Log.m105921e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "remux time error, videoDuration: %s, remuxStartTime: %s, remuxEndTime: %s", Integer.valueOf(i3), Long.valueOf(this.f326184n), Long.valueOf(this.f326185o));
            MP4MuxerJNI.releaseDataBufLock(this.f326191u);
            return -1;
        }
        Log.m105925i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "decoder init ret: %s", Integer.valueOf(i));
        if (i < 0) {
            MP4MuxerJNI.releaseDataBufLock(this.f326191u);
            return -1;
        }
        int i4 = this.f326186p;
        if (i4 > 0 && i4 < (i2 = this.f326183m)) {
            this.f326172b.mo160029a((int) Math.ceil((double) (((float) i2) / ((float) i4))));
        }
        int i5 = this.f326186p;
        this.f326173c = new C108908g(this.f326176f, this.f326177g, this.f326178h, this.f326179i, this.f326180j, 1, i5 > 0 ? Math.min(i5, this.f326183m) : this.f326183m);
        this.f326172b.mo160032d(new C108900a());
        C108908g gVar = this.f326173c;
        gVar.f326243b = new C108901b(this);
        try {
            gVar.mo160042b(this.f326191u);
            C108908g gVar2 = this.f326173c;
            gVar2.getClass();
            Log.m105924i("MicroMsg.MMSightRemuxMediaCodecEncoder", "Start");
            gVar2.f326259r = true;
            this.f326172b.mo160033e();
            this.f326192v.quitSafely();
            this.f326192v.join();
            this.f326193w = null;
            mo160035d();
            String str = this.f326175e;
            if (this.f326181k > 0) {
                str = str + "tempRotate.mp4";
            }
            long j5 = (long) this.f326182l;
            if (j5 <= 0) {
                j5 = this.f326185o - this.f326184n;
            }
            int muxingLock = MP4MuxerJNI.muxingLock(this.f326191u, this.f326187q, 1024, 2, this.f326188r, str, (((float) this.f326173c.f326249h) * 1000.0f) / ((float) j5), (byte[]) null, 0);
            Log.m105925i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "muxing ret: %s", Integer.valueOf(muxingLock));
            int i6 = this.f326181k;
            if (i6 > 0) {
                SightVideoJNI.tagRotateVideoVFS(str, this.f326175e, i6);
                C86013q1.m106447h(str);
            }
            MP4MuxerJNI.releaseDataBufLock(this.f326191u);
            C98921l.f289964d.mo126892c();
            return muxingLock;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMSightFFMpegMediaCodecRemuxer", e, "decode error: %s", e.getMessage());
            return -1;
        }
    }

    /* renamed from: c */
    public void mo158183c(Bitmap bitmap) {
        if (bitmap != null) {
            this.f326194x = bitmap;
        }
    }

    /* renamed from: d */
    public final void mo160035d() {
        C110052b bVar = new C110052b();
        this.f326189s = bVar;
        try {
            bVar.mo161392k(this.f326174d);
            int i = -1;
            MediaFormat mediaFormat = null;
            String str = null;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f326189s.mo161385d()) {
                    break;
                }
                MediaFormat e = this.f326189s.mo161386e(i2);
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
                this.f326188r = mediaFormat.getInteger("channel-count");
                this.f326187q = mediaFormat.getInteger("sample-rate");
                this.f326189s.mo161390i(i);
                long j = this.f326184n;
                if (j > 0) {
                    this.f326189s.mo161389h(j * 1000, 0);
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaFormat.getInteger("max-input-size"));
                while (true) {
                    allocateDirect.clear();
                    int f = this.f326189s.mo161387f(allocateDirect, 0);
                    Log.m105919d("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "sampleSize: %d", Integer.valueOf(f));
                    if (f <= 0) {
                        Log.m105925i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "muxAudio size = %d. Saw eos.", Integer.valueOf(f));
                        return;
                    } else if (this.f326189s.mo161383b() < this.f326185o * 1000) {
                        if (this.f326189s.mo161384c() != i) {
                            Log.m105920e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "track index not match! break");
                            return;
                        }
                        allocateDirect.position(0);
                        MP4MuxerJNI.writeAACDataLock(this.f326191u, allocateDirect, f);
                        this.f326189s.mo161382a();
                    } else {
                        return;
                    }
                }
            }
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.MMSightFFMpegMediaCodecRemuxer", e2, "muxAudio create extractor failed: %s", e2.getMessage());
        }
    }

    public C108899b(String str, String str2, int i, int i2, int i3, int i4, long j, long j2) {
        String str3 = str;
        String str4 = str2;
        int i5 = i;
        int i6 = i2;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || i5 <= 0 || i6 <= 0) {
            int i7 = i4;
            Log.m105921e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4));
            return;
        }
        this.f326174d = str3;
        this.f326175e = str4;
        this.f326178h = i5;
        this.f326179i = i6;
        this.f326180j = i3;
        this.f326186p = i4;
        this.f326181k = SightVideoJNI.getMp4RotateVFS(str);
        C94554a c = C94555d.m119567c(str3, true);
        if (c != null) {
            this.f326176f = c.f273445c;
            this.f326177g = c.f273446d;
            this.f326183m = c.f273447e;
        }
        this.f326184n = j;
        this.f326185o = j2;
        Log.m105925i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", str3, str4, Integer.valueOf(this.f326176f), Integer.valueOf(this.f326177g), Integer.valueOf(this.f326181k), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(j2));
    }
}
