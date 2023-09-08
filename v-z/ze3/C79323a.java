package ze3;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qbar.QbarNative;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import java.util.Arrays;

/* renamed from: ze3.a */
public class C79323a {
    /* renamed from: a */
    public static Bitmap m96020a(Context context, Bitmap bitmap, byte[] bArr, int[] iArr, double d) {
        int width = bitmap.getWidth();
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 197.0f);
        if (fromDPToPix < width) {
            fromDPToPix = width;
        }
        int i = iArr[0];
        int i2 = (int) (((double) i) * d);
        int i3 = i2 * 2;
        int i4 = fromDPToPix / (i + i3);
        if (i4 == 0) {
            i4 = 1;
        }
        int i5 = i2 * i4;
        int i6 = (i + i3) * i4;
        int i7 = (iArr[1] * i4) + (i4 * 2 * i2);
        int i8 = i6 < width ? width : i6;
        int i9 = i7 < width ? width : i7;
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        int[] iArr2 = new int[(i8 * i9)];
        int i15 = (i8 - width) / 2;
        int i16 = i15;
        int i17 = 0;
        while (i16 < i8 - i15 && i17 < width) {
            int i18 = i15;
            int i19 = 0;
            while (i18 < i9 - i15 && i19 < width) {
                iArr2[(i16 * i8) + i18] = bitmap.getPixel(i19, i17);
                i18++;
                i19++;
            }
            Bitmap bitmap2 = bitmap;
            i16++;
            i17++;
        }
        for (int i25 = 0; i25 < iArr[1]; i25++) {
            int i26 = 0;
            while (true) {
                int i27 = iArr[0];
                if (i26 >= i27) {
                    break;
                }
                if (bArr[(i27 * i25) + i26] == 1) {
                    for (int i28 = 0; i28 < i4; i28++) {
                        for (int i29 = 0; i29 < i4; i29++) {
                            int i35 = (((i25 * i4) + i5 + i28) * i8) + (i26 * i4) + i5 + i29;
                            if (iArr2[i35] == 0) {
                                iArr2[i35] = -16777216;
                            }
                        }
                    }
                } else {
                    for (int i36 = 0; i36 < i4; i36++) {
                        for (int i37 = 0; i37 < i4; i37++) {
                            int i38 = (((i25 * i4) + i5 + i36) * i8) + (i26 * i4) + i5 + i37;
                            if (iArr2[i38] == 0) {
                                iArr2[i38] = -1;
                            }
                        }
                    }
                }
                i26++;
            }
        }
        createBitmap.setPixels(iArr2, 0, i8, 0, 0, i8, i9);
        return createBitmap;
    }

    /* renamed from: b */
    public static Bitmap m96021b(Context context, String str, int i, int i2, double d) {
        int i3;
        int i4;
        int i5 = i;
        byte[] bArr = new byte[CodecError.DEQUEUEINPUTBUFFER_ILLEGAL];
        int[] iArr = new int[2];
        int Encode = QbarNative.Encode(bArr, iArr, str, i, i2, "UTF-8", -1);
        int i6 = 0;
        if (Encode == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i7 = displayMetrics.widthPixels;
            int i8 = displayMetrics.heightPixels;
            if (i7 >= i8) {
                i7 = i8;
            }
            int i9 = (int) (((double) i7) * 0.8d);
            int i15 = iArr[0];
            int i16 = (int) (((double) i15) * d);
            if (i5 == 12) {
                i4 = i9 / ((i16 * 2) + i15);
                if (i4 == 0) {
                    i4 = 1;
                }
                i3 = i4;
            } else if (i5 == 5) {
                int i17 = i9 / ((i16 * 2) + i15);
                if (i17 == 0) {
                    i17 = 1;
                }
                i3 = (i15 * i4) / iArr[1];
            } else {
                i4 = 0;
                i3 = 0;
            }
            int i18 = i16 * i4;
            int i19 = (i15 + (i16 * 2)) * i4;
            int i25 = (iArr[1] * i3) + (i4 * 2 * i16);
            Bitmap createBitmap = Bitmap.createBitmap(i19, i25, Bitmap.Config.ARGB_8888);
            int[] iArr2 = new int[(i19 * i25)];
            Arrays.fill(iArr2, -1);
            int i26 = 0;
            while (i26 < iArr[1]) {
                int i27 = 0;
                while (true) {
                    int i28 = iArr[i6];
                    if (i27 >= i28) {
                        break;
                    }
                    if (bArr[(i28 * i26) + i27] == 1) {
                        int i29 = 0;
                        while (i29 < i3) {
                            while (i6 < i4) {
                                iArr2[(((i26 * i3) + i18 + i29) * i19) + (i27 * i4) + i18 + i6] = -16777216;
                                i6++;
                            }
                            i29++;
                            i6 = 0;
                        }
                    } else {
                        for (int i35 = 0; i35 < i3; i35++) {
                            for (int i36 = 0; i36 < i4; i36++) {
                                iArr2[(((i26 * i3) + i18 + i35) * i19) + (i27 * i4) + i18 + i36] = -1;
                            }
                        }
                    }
                    i27++;
                    i6 = 0;
                }
                i26++;
                i6 = 0;
            }
            createBitmap.setPixels(iArr2, 0, i19, 0, 0, i19, i25);
            Log.m105925i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", createBitmap);
            return createBitmap;
        }
        Log.m105925i("MicroMsg.QRCodeBitmapFactory", "result %d %s", Integer.valueOf(Encode), Util.getStack().toString());
        return null;
    }
}
