package bo1;

import co1.C55048e;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import rx3.C13598b0;
import te3.C51974xh1;

/* renamed from: bo1.g */
public final class C0344g {

    /* renamed from: a */
    public static final C0344g f929a = new C0344g();

    /* renamed from: a */
    public final C51974xh1 mo385a(C51974xh1 xh12) {
        if (xh12 != null) {
            return xh12;
        }
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_LAST_PRELOAD_INFO_STRING_SYNC, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        byte[] decodeHexString = Util.decodeHexString((String) f);
        StringBuilder sb = new StringBuilder();
        sb.append("[buildPreloadInfo] buffer isEmpty? ");
        C87412m.m108593f(decodeHexString, "buffer");
        boolean z = true;
        sb.append(decodeHexString.length == 0);
        Log.m105924i("Finder.PreloadTransform", sb.toString());
        if (decodeHexString.length != 0) {
            z = false;
        }
        if (z) {
            return new C51974xh1();
        }
        C51974xh1 xh13 = new C51974xh1();
        xh13.parseFrom(decodeHexString);
        return xh13;
    }

    /* renamed from: b */
    public final void mo386b(C51974xh1 xh12, List<? extends FinderObject> list, int i) {
        String str;
        C87412m.m108594g(list, "list");
        StringBuilder sb = new StringBuilder();
        sb.append("[transform] info=");
        if (xh12 != null) {
            str = "[preloadId=" + xh12.f144649d + " hotFeed=" + xh12.f144651f.size() + ']';
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(" list=");
        sb.append(list.size());
        sb.append(" source=");
        sb.append(i);
        Log.m105924i("Finder.PreloadTransform", sb.toString());
        C55048e Hx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0();
        C51974xh1 a = mo385a(xh12);
        HashMap hashMap = new HashMap();
        for (FinderObject finderObject : list) {
            FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
            boolean z = false;
            if (finderObjectDesc != null && finderObjectDesc.mediaType == 4) {
                z = true;
            }
            if (z) {
                hashMap.put(Long.valueOf(finderObject.f164794id), finderObject);
            }
        }
        C13598b0 b0Var = C13598b0.f38549a;
        Hx0.mo76108e(a, hashMap);
    }
}
