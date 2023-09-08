package fh1;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.HashMap;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: fh1.p1 */
public final class C8077p1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public static final C8077p1<_Ret, _Var> f26858a = new C8077p1<>();

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        if (!(i == 0 && cVar.f256794b == 0)) {
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            Log.m105921e("Finder.LivePromoteBannerController", "ljd do CgiFinderLiveDislikeBanner fail errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(cVar.f256794b), cVar.f256795c);
        }
        return C13598b0.f38549a;
    }
}
