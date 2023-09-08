package p294b7;

import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.wcdb.FileUtils;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.util.WXWebReporter;
import dl0.C86342c;

/* renamed from: b7.j */
public final class C16746j {

    /* renamed from: h */
    public static final String[] f45250h = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* renamed from: i */
    public static final int[] f45251i = {44100, 48000, 32000};

    /* renamed from: j */
    public static final int[] f45252j = {32, 64, 96, 128, 160, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256, 288, C0947jz.f2205e, JsApiNFCStartHCE.CTRL_INDEX, 384, v2helper.EMethodEhanceHeadsetEC, FileUtils.S_IRWXU};

    /* renamed from: k */
    public static final int[] f45253k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256};

    /* renamed from: l */
    public static final int[] f45254l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256, C0947jz.f2205e, 384};

    /* renamed from: m */
    public static final int[] f45255m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256, C0947jz.f2205e};

    /* renamed from: n */
    public static final int[] f45256n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a */
    public int f45257a;

    /* renamed from: b */
    public String f45258b;

    /* renamed from: c */
    public int f45259c;

    /* renamed from: d */
    public int f45260d;

    /* renamed from: e */
    public int f45261e;

    /* renamed from: f */
    public int f45262f;

    /* renamed from: g */
    public int f45263g;

    /* renamed from: a */
    public static int m16334a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f45251i[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f45252j[i4 - 1] : f45253k[i4 - 1]) * 12000) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f45254l[i4 - 1] : f45255m[i4 - 1] : f45256n[i4 - 1];
        int i9 = 144000;
        if (i2 == 3) {
            return ((i8 * 144000) / i6) + i7;
        }
        if (i3 == 1) {
            i9 = 72000;
        }
        return ((i9 * i8) / i6) + i7;
    }

    /* renamed from: b */
    public static boolean m16335b(int i, C16746j jVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = f45251i[i5];
        int i15 = 2;
        if (i2 == 2) {
            i9 /= 2;
        } else if (i2 == 0) {
            i9 /= 4;
        }
        int i16 = (i >>> 9) & 1;
        int i17 = C86342c.CTRL_INDEX;
        if (i3 == 3) {
            i8 = i2 == 3 ? f45252j[i4 - 1] : f45253k[i4 - 1];
            i6 = (((i8 * 12000) / i9) + i16) * 4;
            i7 = 384;
        } else {
            int i18 = 144000;
            if (i2 == 3) {
                i8 = i3 == 2 ? f45254l[i4 - 1] : f45255m[i4 - 1];
                i6 = i16 + ((144000 * i8) / i9);
                i7 = C86342c.CTRL_INDEX;
            } else {
                i8 = f45256n[i4 - 1];
                if (i3 == 1) {
                    i17 = 576;
                }
                if (i3 == 1) {
                    i18 = 72000;
                }
                int i19 = i17;
                i6 = i16 + ((i18 * i8) / i9);
                i7 = i19;
            }
        }
        String str = f45250h[3 - i3];
        if (((i >> 6) & 3) == 3) {
            i15 = 1;
        }
        jVar.f45257a = i2;
        jVar.f45258b = str;
        jVar.f45259c = i6;
        jVar.f45260d = i9;
        jVar.f45261e = i15;
        jVar.f45262f = i8 * 1000;
        jVar.f45263g = i7;
        return true;
    }
}
