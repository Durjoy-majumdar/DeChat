package z72;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import pe3.C89349b;

/* renamed from: z72.f */
public class C102979f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f303902d;

    /* renamed from: e */
    public final /* synthetic */ C102978c f303903e;

    /* renamed from: f */
    public final /* synthetic */ String f303904f;

    /* renamed from: g */
    public final /* synthetic */ int f303905g;

    public C102979f(long j, C102978c cVar, String str, int i) {
        this.f303902d = j;
        this.f303903e = cVar;
        this.f303904f = str;
        this.f303905g = i;
    }

    public void run() {
        byte[] bArr;
        Class cls = C32735h.class;
        Log.m105925i("MicroMsg.NetSceneMultiMediaReport", "do report, id:%d", Long.valueOf(this.f303902d));
        if (this.f303903e.f303883e == 1) {
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(this.f303904f);
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multi_media_report_filter_limit, 2048);
            int i = imageOptions.outWidth;
            int i2 = imageOptions.outHeight;
            if (i * i2 <= Qe * Qe || i * i2 <= C85875k4.m106180f() * C85875k4.m106182g()) {
                C102978c cVar = this.f303903e;
                cVar.f303892q = imageOptions.outWidth;
                cVar.f303893r = imageOptions.outHeight;
                bArr = C102980g.f303906f.checkImage(BitmapUtil.decodeFile(C86013q1.m106448i(this.f303904f, false), (BitmapFactory.Options) null));
            } else {
                Log.m105929w("MicroMsg.NetSceneMultiMediaReport", "image too large (%d * %d)", Integer.valueOf(imageOptions.outWidth), Integer.valueOf(imageOptions.outHeight));
                bArr = new byte[0];
            }
        } else {
            try {
                String[] split = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_multi_media_report_video_sample, "0,0.5,1.0").split(",");
                int length = split.length;
                float[] fArr = new float[length];
                for (int i3 = 0; i3 < split.length; i3++) {
                    fArr[i3] = Util.getFloat(split[i3], 0.0f);
                }
                String i4 = C86013q1.m106448i(this.f303904f, false);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(i4);
                long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                Bitmap[] bitmapArr = new Bitmap[length];
                for (int i5 = 0; i5 < length; i5++) {
                    bitmapArr[i5] = mediaMetadataRetriever.getFrameAtTime((long) (((float) ((parseLong - 1) * 1000)) * fArr[i5]), 2);
                }
                mediaMetadataRetriever.release();
                bArr = C102980g.f303906f.checkVideo(bitmapArr);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.NetSceneMultiMediaReport", e, String.format("error %s", new Object[]{this.f303904f}), new Object[0]);
                bArr = new byte[0];
            }
        }
        Log.m105925i("MicroMsg.NetSceneMultiMediaReport", "gogcv check result:%s, path:%s", new String(bArr), this.f303904f);
        this.f303903e.f303880B = new C89349b(bArr);
        C86709a0.m107524d().mo123460f(new C102980g(this.f303903e, this.f303905g, this.f303902d, (C102979f) null));
    }
}
