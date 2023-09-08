package com.tencent.p014mm.plugin.scanner.p101ui.widget;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductMaskDecorView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.a */
public final class C106133a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f316114d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f316115e;

    /* renamed from: f */
    public final /* synthetic */ ScanProductMaskDecorView.C106127b f316116f;

    /* renamed from: g */
    public final /* synthetic */ int f316117g;

    /* renamed from: h */
    public final /* synthetic */ ImageView f316118h;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.a$a */
    public static final class C106134a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f316119d;

        /* renamed from: e */
        public final /* synthetic */ int f316120e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f316121f;

        public C106134a(Bitmap bitmap, int i, ImageView imageView) {
            this.f316119d = bitmap;
            this.f316120e = i;
            this.f316121f = imageView;
        }

        public final void run() {
            Bitmap bitmap = this.f316119d;
            if (bitmap != null && !bitmap.isRecycled()) {
                HashMap<String, Bitmap> hashMap = ScanProductMaskDecorView.f316085n;
                String valueOf = String.valueOf(this.f316120e);
                Bitmap bitmap2 = this.f316119d;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    ScanProductMaskDecorView.f316085n.put(valueOf, bitmap2);
                }
                if (C87412m.m108589b(this.f316121f.getTag(), Integer.valueOf(this.f316120e))) {
                    this.f316121f.setImageBitmap(this.f316119d);
                }
            }
        }
    }

    public C106133a(int i, byte[] bArr, ScanProductMaskDecorView.C106127b bVar, int i2, ImageView imageView) {
        this.f316114d = i;
        this.f316115e = bArr;
        this.f316116f = bVar;
        this.f316117g = i2;
        this.f316118h = imageView;
    }

    public final void run() {
        Bitmap bitmap;
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f316114d;
        Integer num = null;
        if (i == 1 || i == 3) {
            byte[] bArr = this.f316115e;
            int i2 = this.f316116f.f316098h;
            bitmap = BitmapUtil.decodeByteArray(bArr, i2 * 2, i2 * 2);
        } else if (i == 2) {
            byte[] bArr2 = this.f316115e;
            int i3 = this.f316116f.f316098h;
            bitmap = BitmapUtil.decodeByteArray(bArr2, i3, i3);
        } else {
            bitmap = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        String str = "loadBitmap decode cost: " + (currentTimeMillis2 - currentTimeMillis) + ", bm.size: %s, imageEncodeType: %s";
        Object[] objArr = new Object[2];
        if (bitmap != null) {
            num = Integer.valueOf(bitmap.getAllocationByteCount());
        }
        objArr[0] = num;
        objArr[1] = Integer.valueOf(this.f316114d);
        Log.m105927v("MicroMsg.ScanProductMaskDecorView", str, objArr);
        ((C119157j) C119157j.f356862d).mo183895z(new C106134a(bitmap, this.f316117g, this.f316118h));
    }
}
