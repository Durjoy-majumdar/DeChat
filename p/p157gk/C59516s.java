package p157gk;

import a14.C0000n0;
import android.graphics.Bitmap;
import android.util.Pair;
import fy3.C32227p;
import java.nio.Buffer;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$getBufferFormPath$2", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: gk.s */
public final class C59516s extends C91594j implements C32227p<C0000n0, C15601d<? super Pair<Buffer, Bitmap>>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f170097d;

    /* renamed from: e */
    public final /* synthetic */ boolean f170098e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59516s(String str, boolean z, C15601d<? super C59516s> dVar) {
        super(2, dVar);
        this.f170097d = str;
        this.f170098e = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59516s(this.f170097d, this.f170098e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59516s) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r13.append(r0)
            java.lang.String r0 = ", buffer start"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "MicroMsg.ImageQuerySDKCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
            java.lang.String r13 = r12.f170097d
            int r13 = r13.length()
            r1 = 0
            r2 = 1
            if (r13 != 0) goto L_0x002d
            r13 = 1
            goto L_0x002e
        L_0x002d:
            r13 = 0
        L_0x002e:
            java.lang.String r3 = "getBufferFormPath >> "
            r4 = 0
            if (r13 != 0) goto L_0x01ce
            java.lang.String r13 = r12.f170097d
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r13 != 0) goto L_0x003d
            goto L_0x01ce
        L_0x003d:
            boolean r13 = r12.f170098e
            r5 = 20971520(0x1400000, float:3.526483E-38)
            java.lang.String r6 = "MicroMsg.ImageQueryUtil"
            java.lang.String r7 = "imgPath"
            if (r13 == 0) goto L_0x00d3
            java.lang.String r13 = r12.f170097d
            gy3.C87412m.m108594g(r13, r7)
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r7.inJustDecodeBounds = r2
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r13, r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getSampleBitmapToIdentify >> outWidth: "
            r8.append(r9)
            int r9 = r7.outWidth
            r8.append(r9)
            java.lang.String r9 = ", outHeight:"
            r8.append(r9)
            int r9 = r7.outHeight
            r8.append(r9)
            java.lang.String r9 = ", targetWidth: "
            r8.append(r9)
            r9 = 960(0x3c0, float:1.345E-42)
            r8.append(r9)
            java.lang.String r10 = ", targetHeight: "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            int r8 = r7.outWidth
            if (r8 > r9) goto L_0x0093
            int r10 = r7.outHeight
            if (r10 > r9) goto L_0x0093
            r9 = r8
            goto L_0x0095
        L_0x0093:
            r10 = 960(0x3c0, float:1.345E-42)
        L_0x0095:
            int r11 = r7.outHeight
            int r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.calculateInSampleSize(r8, r11, r9, r10)
            r7.inSampleSize = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getSampleBitmapToIdentify >> "
            r8.append(r9)
            int r9 = r7.inSampleSize
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            int r8 = r7.outWidth
            int r9 = r7.outHeight
            int r8 = r8 * r9
            int r8 = r8 * 4
            int r9 = r7.inSampleSize
            int r8 = r8 / r9
            if (r8 <= r5) goto L_0x00cc
            java.lang.String r13 = "getSampleBitmapToIdentify >> sample size is to large"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r13)
            if (r2 == 0) goto L_0x00ca
            r2.recycle()
        L_0x00ca:
            r13 = r4
            goto L_0x011e
        L_0x00cc:
            r7.inJustDecodeBounds = r1
            android.graphics.Bitmap r13 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r13, r7)
            goto L_0x011e
        L_0x00d3:
            java.lang.String r13 = r12.f170097d
            gy3.C87412m.m108594g(r13, r7)
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r7.inJustDecodeBounds = r2
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r13, r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getLocateBitmap >> outWidth: "
            r8.append(r9)
            int r9 = r7.outWidth
            r8.append(r9)
            java.lang.String r9 = ", outHeight: "
            r8.append(r9)
            int r9 = r7.outHeight
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            int r8 = r7.outWidth
            int r9 = r7.outHeight
            int r8 = r8 * r9
            int r8 = r8 * 4
            if (r8 <= r5) goto L_0x0118
            java.lang.String r13 = "getLocateBitmap >> size is to large"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r13)
            if (r2 == 0) goto L_0x00ca
            r2.recycle()
            goto L_0x00ca
        L_0x0118:
            r7.inJustDecodeBounds = r1
            android.graphics.Bitmap r13 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r13, r7)
        L_0x011e:
            if (r13 != 0) goto L_0x013f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.String r1 = r12.f170097d
            r13.append(r1)
            java.lang.String r1 = " is decode error"
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r13)
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r4, r4)
            return r13
        L_0x013f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            int r3 = r13.getWidth()
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            int r3 = r13.getHeight()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            int r2 = r13.getByteCount()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r13.copyPixelsToBuffer(r2)
            byte[] r2 = r2.array()
            int r3 = r2.length
            int r3 = r3 / 4
            int r4 = r3 * 3
            byte[] r5 = new byte[r4]
            my3.j r1 = my3.C61595o.m72301i(r1, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x017f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01a5
            r3 = r1
            sx3.l0 r3 = (sx3.C36904l0) r3
            int r3 = r3.mo59695a()
            int r6 = r3 * 3
            int r3 = r3 * 4
            byte r7 = r2[r3]
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r3 + 1
            byte r8 = r2[r8]
            r5[r7] = r8
            int r6 = r6 + 2
            int r3 = r3 + 2
            byte r3 = r2[r3]
            r5[r6] = r3
            goto L_0x017f
        L_0x01a5:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r4)
            r1.put(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ", buffer stop"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r13)
            return r0
        L_0x01ce:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.String r1 = r12.f170097d
            r13.append(r1)
            java.lang.String r1 = " is error"
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r13)
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r4, r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p157gk.C59516s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
