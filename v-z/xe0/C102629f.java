package xe0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import k14.C99088c;
import org.libpag.PAGView;
import rx3.C13605o;

/* renamed from: xe0.f */
public final class C102629f {

    /* renamed from: a */
    public final String f302220a = "Micro.PagTargetDispatcher";

    /* renamed from: b */
    public final ConcurrentHashMap<Integer, C13605o<String, WeakReference<PAGView>, String>> f302221b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public final LinkedHashMap<Integer, C99088c> f302222c = new LinkedHashMap<>();

    /* renamed from: a */
    public final void mo142285a(String str, int i, String str2) {
        C87412m.m108594g(str, "path");
        Log.m105924i(this.f302220a, "[unregister] tag = " + str2 + ", path:" + str);
        C13605o<String, WeakReference<PAGView>, String> oVar = this.f302221b.get(Integer.valueOf(i));
        C13605o oVar2 = oVar;
        if (!C87412m.m108589b(oVar2 != null ? (String) oVar2.f38557d : null, str)) {
            oVar = null;
        }
        if (oVar != null) {
            Log.m105924i(this.f302220a, "[unregister] tag = " + str2 + ", path:" + str + ", founded");
            C13605o remove = this.f302221b.remove(Integer.valueOf(i));
        }
    }
}
