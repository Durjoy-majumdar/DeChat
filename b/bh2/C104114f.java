package bh2;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m80.C109537f;
import o80.C109993a;
import rx3.C13598b0;

/* renamed from: bh2.f */
public final class C104114f extends C109537f {

    /* renamed from: A */
    public final boolean f308035A;

    /* renamed from: B */
    public final C32227p<C104114f, Boolean, C13598b0> f308036B;

    /* renamed from: C */
    public final C104136w f308037C;

    /* renamed from: D */
    public C104110c f308038D;

    /* renamed from: E */
    public long f308039E;

    /* renamed from: F */
    public long f308040F;

    /* renamed from: G */
    public boolean f308041G;

    /* renamed from: H */
    public C32226l<? super Long, Bitmap> f308042H;

    /* renamed from: I */
    public C32227p<? super Boolean, ? super Buffer, C13598b0> f308043I;

    /* renamed from: J */
    public ByteBuffer f308044J;

    /* renamed from: K */
    public ImageReader f308045K;

    /* renamed from: x */
    public ArrayList<String> f308046x;

    /* renamed from: y */
    public final int f308047y;

    /* renamed from: z */
    public final int f308048z;

    /* renamed from: bh2.f$a */
    public static final class C104115a implements ImageReader.OnImageAvailableListener {

        /* renamed from: d */
        public final /* synthetic */ C104114f f308049d;

        public C104115a(C104114f fVar) {
            this.f308049d = fVar;
        }

        public void onImageAvailable(ImageReader imageReader) {
            int i;
            C87412m.m108591d(imageReader);
            Image acquireNextImage = imageReader.acquireNextImage();
            Image.Plane[] planes = acquireNextImage.getPlanes();
            int width = acquireNextImage.getWidth();
            int height = acquireNextImage.getHeight();
            int rowStride = planes[0].getRowStride() - (planes[0].getPixelStride() * width);
            ByteBuffer buffer = planes[0].getBuffer();
            C87412m.m108593f(buffer, "planes[0].buffer");
            long currentTicks = Util.currentTicks();
            C104114f fVar = this.f308049d;
            int i2 = fVar.f308047y;
            if (i2 > 0 && (i = fVar.f308048z) > 0 && fVar.f308044J == null) {
                fVar.f308044J = ByteBuffer.allocateDirect(i2 * i * 4);
            }
            ByteBuffer byteBuffer = this.f308049d.f308044J;
            C87412m.m108591d(byteBuffer);
            byteBuffer.clear();
            ByteBuffer byteBuffer2 = this.f308049d.f308044J;
            C87412m.m108591d(byteBuffer2);
            byteBuffer2.order(buffer.order());
            int i3 = 0;
            for (int i4 = 0; i4 < height; i4++) {
                int i5 = (i4 * rowStride) + i3;
                int i6 = width * 4;
                buffer.limit(i5 + i6);
                buffer.position(i5);
                ByteBuffer byteBuffer3 = this.f308049d.f308044J;
                C87412m.m108591d(byteBuffer3);
                byteBuffer3.put(buffer);
                i3 += i6;
            }
            Log.m105924i("MicroMsg.MediaCodecFakeDecoder", "copyToByteArray cost: " + Util.ticksToNow(currentTicks));
            acquireNextImage.close();
            C104114f fVar2 = this.f308049d;
            C32227p<? super Boolean, ? super Buffer, C13598b0> pVar = fVar2.f308043I;
            if (pVar != null) {
                pVar.invoke(Boolean.TRUE, fVar2.f308044J);
            }
        }
    }

    /* renamed from: bh2.f$b */
    public static final class C104116b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C104114f f308050d;

        public C104116b(C104114f fVar) {
            this.f308050d = fVar;
        }

        public final void run() {
            C104114f fVar = this.f308050d;
            C32227p<C104114f, Boolean, C13598b0> pVar = fVar.f308036B;
            if (pVar != null) {
                pVar.invoke(fVar, Boolean.TRUE);
            }
        }
    }

    /* renamed from: bh2.f$c */
    public static final class C104117c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C104114f f308051d;

        public C104117c(C104114f fVar) {
            this.f308051d = fVar;
        }

        public final void run() {
            C104114f fVar = this.f308051d;
            fVar.f308037C.mo145778a(fVar.f308046x);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104114f(ArrayList<String> arrayList, long j, long j2, C109993a aVar, Surface surface, int i, int i2, boolean z, int i3, C32227p<? super C104114f, ? super Boolean, C13598b0> pVar) {
        super(j, j2, aVar, surface, i3, false);
        int i4 = i;
        int i5 = i2;
        boolean z2 = z;
        C87412m.m108594g(arrayList, "imageList");
        this.f308046x = arrayList;
        this.f308047y = i4;
        this.f308048z = i5;
        this.f308035A = z2;
        this.f308036B = pVar;
        C104136w wVar = new C104136w();
        this.f308037C = wVar;
        long j3 = 1000 / ((long) 15);
        this.f308040F = j3;
        wVar.f308127d = j3;
        if (this.f327870d == null && z2) {
            ImageReader newInstance = ImageReader.newInstance(i4, i5, 1, 3);
            this.f308045K = newInstance;
            C87412m.m108591d(newInstance);
            newInstance.setOnImageAvailableListener(new C104115a(this), (Handler) null);
            ImageReader imageReader = this.f308045K;
            C87412m.m108591d(imageReader);
            this.f327870d = imageReader.getSurface();
        }
        this.f308038D = new C104110c(this.f327870d, wVar);
        wVar.f308124a = i4;
        wVar.f308125b = i5;
        if (z2) {
            Log.m105925i("MicroMsg.MediaCodecFakeDecoder", "init useX264Encoder width:%s, height:%s", Integer.valueOf(i), Integer.valueOf(i2));
            if (i4 > 0 && i5 > 0 && this.f308044J == null) {
                this.f308044J = ByteBuffer.allocateDirect(i4 * i5 * 4);
            }
            this.f308038D.getClass();
        }
        this.f308038D.mo145763b();
        this.f308038D.mo145762a(new C104116b(this));
    }

    /* renamed from: c */
    public void mo145767c() {
        super.mo145767c();
        C104110c cVar = this.f308038D;
        MMHandler mMHandler = cVar.f308031f;
        if (mMHandler == null) {
            Log.m105924i("MicroMsg.Story.GLThread", "stop but handler is null");
            return;
        }
        mMHandler.removeCallbacksAndMessages((Object) null);
        cVar.f308031f.post(new C104113e(cVar));
    }

    /* renamed from: d */
    public void mo145768d(boolean z) {
        Log.m105918d("MicroMsg.MediaCodecFakeDecoder", "setPauseDecoder " + z);
        if (!z) {
            Log.m105924i("MicroMsg.MediaCodecFakeDecoder", "requestRender");
            if (!this.f308041G) {
                this.f308038D.mo145762a(new C104118g(this));
            }
        }
    }

    /* renamed from: e */
    public void mo145769e() {
        this.f308038D.mo145762a(new C104117c(this));
        Log.m105924i("MicroMsg.MediaCodecFakeDecoder", "requestRender");
        if (!this.f308041G) {
            this.f308038D.mo145762a(new C104118g(this));
        }
    }
}
