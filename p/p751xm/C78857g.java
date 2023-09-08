package p751xm;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.modelimage.C92837k0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72922q;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tmassistantsdk.downloadservice.Downloads;
import di3.C86301e;
import eb0.C31543z5;
import ei3.C86522b;
import gy3.C87412m;
import kg3.C76577a;
import p763ym.C79140q;
import z04.C112551y;

@C86522b
/* renamed from: xm.g */
public class C78857g extends C86301e implements C79140q {
    /* renamed from: EZ */
    public boolean mo108875EZ(String str) {
        MultiProcessMMKV multiProcessMMKV = C72922q.f212537a;
        C87412m.m108594g(str, "key");
        try {
            MultiProcessMMKV multiProcessMMKV2 = C72922q.f212537a;
            long j = multiProcessMMKV2 != null ? multiProcessMMKV2.getLong(str, 0) : 0;
            boolean z = true;
            if (j > 0) {
                if (C31543z5.m39453c() - j <= ((long) Downloads.MAX_RETYR_AFTER)) {
                    z = false;
                }
            }
            Log.m105924i("MicroMsg.BizHalfScreenChattingUtil", "isAutoGenerateQuote : " + z);
            return z;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BizHalfScreenChattingUtil", e, "isAutoGenerateQuote", new Object[0]);
            return false;
        }
    }

    public void I50(String str, String str2) {
        C72922q.m85519b(str, str2);
    }

    /* renamed from: K2 */
    public int mo108877K2() {
        MultiProcessMMKV multiProcessMMKV = C72922q.f212537a;
        return C76577a.m92151b(MMApplicationContext.getContext(), 80);
    }

    /* renamed from: Ql */
    public long mo108878Ql(String str) {
        MultiProcessMMKV multiProcessMMKV = C72922q.f212537a;
        C87412m.m108594g(str, "articleIdentity");
        try {
            String str2 = "late" + C72922q.f212538b;
            MultiProcessMMKV multiProcessMMKV2 = C72922q.f212537a;
            long j = multiProcessMMKV2 != null ? multiProcessMMKV2.getLong(str2, 0) : 0;
            if (j == 0) {
                Log.m105924i("MicroMsg.BizHalfScreenChattingUtil", "getMsgFoldTime latestTime == 0 fold all msg  articleIdentity:" + str);
            } else {
                long a = C31543z5.m39451a();
                if (a - j > ((long) Downloads.MAX_RETYR_AFTER)) {
                    Log.m105924i("MicroMsg.BizHalfScreenChattingUtil", "getMsgFoldTime fold all msg  articleIdentity:" + str);
                } else {
                    String str3 = "early" + C72922q.f212538b;
                    MultiProcessMMKV multiProcessMMKV3 = C72922q.f212537a;
                    long j2 = (a - (multiProcessMMKV3 != null ? multiProcessMMKV3.getLong(str3, 0) : 0)) + ((long) 100);
                    Log.m105924i("MicroMsg.BizHalfScreenChattingUtil", "getMsgFoldTime  articleIdentity:" + str + "  result:" + j2);
                    return j2;
                }
            }
            return 10;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BizHalfScreenChattingUtil", e, "getMsgFoldTime", new Object[0]);
            return 0;
        }
    }

    public void Vf0() {
        C72922q.m85518a();
    }

    public Bitmap hp0(long j) {
        String str;
        MultiProcessMMKV multiProcessMMKV = C72922q.f212537a;
        String valueOf = String.valueOf(j);
        String str2 = "";
        C87412m.m108594g(valueOf, "key");
        try {
            MultiProcessMMKV multiProcessMMKV2 = C72922q.f212537a;
            if (multiProcessMMKV2 == null || (str = multiProcessMMKV2.getString(valueOf, str2)) == null) {
                str = str2;
            }
            Log.m105924i("MicroMsg.BizHalfScreenChattingUtil", "getBizArticleQuoteThumbPath  k:" + valueOf + "  v:" + str);
            str2 = str;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BizHalfScreenChattingUtil", e, "getBizArticleQuoteThumbPath", new Object[0]);
        }
        if (C112551y.m153811k(str2)) {
            return null;
        }
        Bitmap xx02 = C92837k0.Bx0().xx0(str2);
        if (xx02 == null) {
            return xx02;
        }
        try {
            int orientationInDegree = Exif.fromFile(str2).getOrientationInDegree();
            if (orientationInDegree < 0) {
                orientationInDegree = 0;
            }
            return BitmapUtil.rotate(xx02, (float) orientationInDegree);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.BizHalfScreenChattingUtil", th, "unexpected exception.", new Object[0]);
            return xx02;
        }
    }

    public void reset() {
        C72922q.m85519b("", "");
    }

    /* renamed from: tR */
    public void mo108882tR(String str, String str2) {
        SharedPreferences.Editor putString;
        MultiProcessMMKV multiProcessMMKV = C72922q.f212537a;
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "imagePath");
        try {
            MultiProcessMMKV multiProcessMMKV2 = C72922q.f212537a;
            if (!(multiProcessMMKV2 == null || (putString = multiProcessMMKV2.putString(str, str2)) == null)) {
                putString.apply();
            }
            Log.m105924i("MicroMsg.BizHalfScreenChattingUtil", "saveBizArticleQuoteThumbPath  k:" + str + "  v:" + str2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BizHalfScreenChattingUtil", e, "saveBizArticleQuoteThumbPath", new Object[0]);
        }
    }
}
