package qz1;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.gif.MMWXGFJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: qz1.i */
public class C101333i {
    /* renamed from: a */
    public static Bitmap m132961a(byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            return null;
        }
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        long nativeInitWxAMDecoder = MMWXGFJNI.nativeInitWxAMDecoder();
        if (nativeInitWxAMDecoder == 0) {
            Log.m105928w("MicroMsg.GIF.MMWXGFUtil", "Cpan init wxam decoder failed.");
        }
        int nativeDecodeBufferHeader = MMWXGFJNI.nativeDecodeBufferHeader(nativeInitWxAMDecoder, bArr, bArr.length);
        if (nativeDecodeBufferHeader != 0) {
            Log.m105929w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF decode buffer header failed. result:%d", Integer.valueOf(nativeDecodeBufferHeader));
        }
        int nativeGetOption = MMWXGFJNI.nativeGetOption(nativeInitWxAMDecoder, bArr, bArr.length, iArr);
        if (nativeGetOption != 0) {
            Log.m105929w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF get option failed. result:%d", Integer.valueOf(nativeGetOption));
        }
        int i = iArr[1];
        int i2 = iArr[2];
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        MMWXGFJNI.nativeDecodeBufferFrame(nativeInitWxAMDecoder, (byte[]) null, 0, createBitmap, iArr2);
        MMWXGFJNI.nativeUninit(nativeInitWxAMDecoder);
        return createBitmap;
    }
}
