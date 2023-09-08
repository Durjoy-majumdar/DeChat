package a71;

import ac3.C91992q0;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import sx3.C110823p;
import th3.C101893b;
import yc3.C38992a;

/* renamed from: a71.h */
public final class C91976h implements C38992a {
    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        C87412m.m108594g(strArr, "args");
        C87412m.m108594g(str, "username");
        Log.m105924i("MicroMsg.EmojiCaptureCommand", "processCommand: " + C110823p.m150987M(strArr, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        if (strArr.length <= 1 || !C87412m.m108589b(strArr[1], "sticker") || strArr.length <= 2) {
            return false;
        }
        String str2 = strArr[2];
        if (C87412m.m108589b(str2, "clean")) {
            C101893b bVar = C101893b.f300042a;
            C101893b.f300047f.f138692d.clear();
            bVar.mo141390b();
            return true;
        } else if (!C87412m.m108589b(str2, TPMediaCompositionHelper.XML_TAG_ASSERT)) {
            return true;
        } else {
            C91992q0.f263331a.mo125828b();
            return true;
        }
    }
}
