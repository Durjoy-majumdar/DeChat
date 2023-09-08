package p384tk;

import android.graphics.Bitmap;
import android.os.Process;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.plugin.gif.MMGIFJNI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import gy3.C87412m;
import java.io.InputStream;

/* renamed from: tk.f */
public final class C22541f implements C101900d {

    /* renamed from: a */
    public final String f64843a = "MicroMsg.GIF.MMGIFDecoder";

    /* renamed from: b */
    public int f64844b;

    /* renamed from: c */
    public long f64845c;

    /* renamed from: d */
    public final int[] f64846d;

    /* renamed from: e */
    public int f64847e;

    /* renamed from: f */
    public int f64848f;

    /* renamed from: g */
    public Bitmap f64849g;

    /* renamed from: h */
    public final C101899c f64850h;

    public C22541f(byte[] bArr) {
        C87412m.m108594g(bArr, ByteRange.BYTES_UNIT);
        int[] iArr = new int[6];
        this.f64846d = iArr;
        this.f64847e = -1;
        this.f64844b = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcGifEnable(), C40318k.m43492a().getHcGifDelay(), C40318k.m43492a().getHcGifCPU(), C40318k.m43492a().getHcGifIO(), C40318k.m43492a().getHcGifThr() ? Process.myTid() : 0, C40318k.m43492a().getHcGifTimeout(), 602, C40318k.m43492a().getHcGifAction(), "MicroMsg.GIF.MMGIFDecoder");
        this.f64845c = MMGIFJNI.openByByteArray(bArr, iArr);
        int i = iArr[0];
        if (i > 1024 || iArr[1] > 1024) {
            Log.m105929w("MicroMsg.GIF.MMGIFDecoder", "emoji width or height over size. Width:%d Height:%d", Integer.valueOf(i), Integer.valueOf(iArr[1]));
            C115669n.INSTANCE.idkeyStat(401, 2, 1, false);
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        C87412m.m108593f(createBitmap, "createBitmap(frameWidth(… Bitmap.Config.ARGB_8888)");
        this.f64849g = createBitmap;
        this.f64850h = new C101899c(iArr[2]);
    }

    /* renamed from: a */
    public int mo35630a() {
        return this.f64846d[1];
    }

    /* renamed from: b */
    public void mo35631b() {
        MMGIFJNI.drawFrameBitmap(this.f64845c, this.f64849g, this.f64846d);
        int[] iArr = this.f64846d;
        this.f64847e = iArr[5];
        this.f64848f = iArr[4];
        String str = this.f64843a;
        Log.m105918d(str, "drawFrameBitmap: decode frame " + this.f64847e + ", " + this.f64848f);
    }

    /* renamed from: c */
    public int mo35632c() {
        return this.f64846d[0];
    }

    /* renamed from: d */
    public int mo35633d() {
        int[] iArr = this.f64846d;
        if (iArr[2] == 1) {
            return Integer.MAX_VALUE;
        }
        return iArr[4];
    }

    public void destroy() {
        if (this.f64844b != 0) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcGifEnable() || C40318k.m43492a().getHcGifFrameEnable(), this.f64844b);
            this.f64844b = 0;
        }
        long j = this.f64845c;
        this.f64845c = 0;
        MMGIFJNI.recycle(j);
    }

    /* renamed from: e */
    public int mo35635e() {
        return this.f64846d[2];
    }

    public Bitmap getFrame() {
        return this.f64849g;
    }

    public void seekTo(long j) {
        if (this.f64848f <= 0) {
            mo35631b();
        }
        int i = (int) j;
        int a = this.f64850h.mo141396a(i);
        int i2 = this.f64846d[2];
        for (int i3 = 0; i3 < i2 && a < 0; i3++) {
            mo35631b();
            this.f64850h.mo141397b(this.f64847e, this.f64848f);
            a = this.f64850h.mo141396a(i);
        }
        int i4 = a - this.f64847e;
        int i5 = this.f64846d[2];
        int i6 = (i4 + i5) % i5;
        String str = this.f64843a;
        Log.m105918d(str, "seekTo: " + j + ", " + this.f64847e + ", " + i6 + ", " + mo35633d() + ", " + this.f64846d[2] + 65292 + this.f64850h.f300059c);
        for (int i7 = 0; i7 < i6; i7++) {
            mo35631b();
        }
    }

    public C22541f(InputStream inputStream) {
        C87412m.m108594g(inputStream, "stream");
        int[] iArr = new int[6];
        this.f64846d = iArr;
        this.f64847e = -1;
        this.f64844b = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcGifEnable(), C40318k.m43492a().getHcGifDelay(), C40318k.m43492a().getHcGifCPU(), C40318k.m43492a().getHcGifIO(), C40318k.m43492a().getHcGifThr() ? Process.myTid() : 0, C40318k.m43492a().getHcGifTimeout(), 602, C40318k.m43492a().getHcGifAction(), "MicroMsg.GIF.MMGIFDecoder");
        this.f64845c = MMGIFJNI.openByInputStrem(inputStream, iArr);
        int i = iArr[0];
        if (i > 1024 || iArr[1] > 1024) {
            Log.m105929w("MicroMsg.GIF.MMGIFDecoder", "emoji width or height over size. Width:%d Height:%d", Integer.valueOf(i), Integer.valueOf(iArr[1]));
            C115669n.INSTANCE.idkeyStat(401, 2, 1, false);
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        C87412m.m108593f(createBitmap, "createBitmap(frameWidth(… Bitmap.Config.ARGB_8888)");
        this.f64849g = createBitmap;
        this.f64850h = new C101899c(iArr[2]);
    }
}
