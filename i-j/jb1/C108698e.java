package jb1;

import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import di3.C86312j;

/* renamed from: jb1.e */
public class C108698e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[] f325530d;

    /* renamed from: e */
    public final /* synthetic */ C108680a f325531e;

    public C108698e(C108680a aVar, byte[] bArr) {
        this.f325531e = aVar;
        this.f325530d = bArr;
    }

    public void run() {
        byte[] bArr = this.f325530d;
        C108680a aVar = this.f325531e;
        ((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).mirrorCameraData(bArr, aVar.f325478j, aVar.f325479k, false);
        if (this.f325531e.f325469a.getFrameDataCallback() != null) {
            this.f325531e.f325469a.getFrameDataCallback().mo157927f(this.f325530d);
        }
    }
}
