package b80;

import android.graphics.Bitmap;
import android.hardware.Camera;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import h80.C108171a;
import kotlin.Result;
import wx3.C15601d;

/* renamed from: b80.j */
public final class C104056j implements Camera.PictureCallback {

    /* renamed from: a */
    public final /* synthetic */ C104043f f307762a;

    /* renamed from: b */
    public final /* synthetic */ int f307763b;

    /* renamed from: c */
    public final /* synthetic */ int f307764c;

    /* renamed from: d */
    public final /* synthetic */ int f307765d;

    /* renamed from: e */
    public final /* synthetic */ long f307766e;

    /* renamed from: f */
    public final /* synthetic */ C15601d<Bitmap> f307767f;

    public C104056j(C104043f fVar, int i, int i2, int i3, long j, C15601d<? super Bitmap> dVar) {
        this.f307762a = fVar;
        this.f307763b = i;
        this.f307764c = i2;
        this.f307765d = i3;
        this.f307766e = j;
        this.f307767f = dVar;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr);
        C104043f fVar = this.f307762a;
        Bitmap f = fVar.mo143104f(this.f307763b, this.f307764c, this.f307765d, decodeByteArray, !fVar.mo143099B());
        long currentTimeMillis = System.currentTimeMillis() - this.f307766e;
        Log.m105924i("MicroMsg.Camera.Camera1Impl", "takePicture return >> " + currentTimeMillis);
        C108171a aVar = C108171a.f323903a;
        CameraReportStruct a = aVar.mo158577a(this.f307762a.f304625d);
        if (a != null) {
            a.f310081X = (long) 1;
        }
        CameraReportStruct a2 = aVar.mo158577a(this.f307762a.f304625d);
        if (a2 != null) {
            a2.f310102u = currentTimeMillis;
        }
        this.f307767f.resumeWith(Result.m168114constructorimpl(f));
    }
}
