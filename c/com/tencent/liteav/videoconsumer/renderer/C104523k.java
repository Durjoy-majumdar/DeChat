package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Matrix;
import android.view.TextureView;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.k */
final /* synthetic */ class C104523k implements Runnable {

    /* renamed from: a */
    private final C17383i f309812a;

    /* renamed from: b */
    private final C17370a f309813b;

    /* renamed from: c */
    private final ByteBuffer f309814c;

    /* renamed from: d */
    private final int f309815d;

    /* renamed from: e */
    private final int f309816e;

    /* renamed from: f */
    private final TakeSnapshotListener f309817f;

    public C104523k(C17383i iVar, C17370a aVar, ByteBuffer byteBuffer, int i, int i2, TakeSnapshotListener takeSnapshotListener) {
        this.f309812a = iVar;
        this.f309813b = aVar;
        this.f309814c = byteBuffer;
        this.f309815d = i;
        this.f309816e = i2;
        this.f309817f = takeSnapshotListener;
    }

    public final void run() {
        C17383i iVar = this.f309812a;
        C17370a aVar = this.f309813b;
        ByteBuffer byteBuffer = this.f309814c;
        int i = this.f309815d;
        int i2 = this.f309816e;
        TakeSnapshotListener takeSnapshotListener = this.f309817f;
        TextureView d = aVar.mo20456d();
        iVar.f47130d.mo19369a(new C104524o(iVar, byteBuffer, i, i2, d == null ? null : d.getTransform(new Matrix()), takeSnapshotListener));
    }
}
