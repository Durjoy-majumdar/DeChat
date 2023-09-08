package p401y6;

import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo;
import com.tencent.soter.core.biometric.FaceManager;
import com.tencent.wcdb.FileUtils;
import com.tencent.xweb.util.WXWebReporter;
import sl0.C90220f;

/* renamed from: y6.a */
public final class C23224a {

    /* renamed from: a */
    public static final int[] f66665a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f66666b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f66667c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f66668d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f66669e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, 256, C0947jz.f2205e, 384, FileUtils.S_IRWXU, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f66670f = {69, 87, 104, 121, 139, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE, 208, 243, 278, C90220f.C90222b.CTRL_INDEX, 417, 487, JsApiGetLabInfo.CTRL_INDEX, 696, 835, 975, FaceManager.FACE_ACQUIRED_RIGHT, 1253, 1393};

    /* renamed from: a */
    public static int m27627a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f66666b;
        if (i >= 3 || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f66670f;
        if (i3 >= 19) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f66669e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
