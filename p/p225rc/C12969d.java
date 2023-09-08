package p225rc;

import android.os.Looper;
import android.webkit.URLUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32224a;
import gy3.C87412m;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: rc.d */
public final class C12969d {

    /* renamed from: rc.d$a */
    public static final class C12970a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f36994d;

        public C12970a(C32224a aVar) {
            this.f36994d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f36994d.invoke();
        }
    }

    /* renamed from: a */
    public static final String m12407a(JSONObject jSONObject, String str) {
        C87412m.m108594g(jSONObject, "<this>");
        C87412m.m108594g(str, "name");
        Object opt = jSONObject.opt(str);
        return opt instanceof String ? (String) opt : "";
    }

    /* renamed from: b */
    public static final boolean m12408b(String str, String str2, boolean z) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "prefix");
        if (C112551y.m153811k(str2)) {
            return false;
        }
        if (!z) {
            if (URLUtil.isHttpUrl(str)) {
                str = str.substring(7);
                C87412m.m108593f(str, "this as java.lang.String).substring(startIndex)");
            } else if (URLUtil.isHttpsUrl(str)) {
                str = str.substring(8);
                C87412m.m108593f(str, "this as java.lang.String).substring(startIndex)");
            }
        }
        return C89925n.m112490c(str, str2);
    }

    /* renamed from: c */
    public static boolean m12409c(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "prefix");
        if (!z) {
            if (URLUtil.isHttpUrl(str)) {
                str = str.substring(7);
                C87412m.m108593f(str, "this as java.lang.String).substring(startIndex)");
            } else if (URLUtil.isHttpsUrl(str)) {
                str = str.substring(8);
                C87412m.m108593f(str, "this as java.lang.String).substring(startIndex)");
            }
        }
        return C89925n.m112490c(str, str2);
    }

    /* renamed from: d */
    public static final void m12410d(long j, C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        MMHandlerThread.postToMainThreadDelayed(new C12970a(aVar), j);
    }

    /* renamed from: e */
    public static final void m12411e(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        if (C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
        } else {
            MMHandlerThread.postToMainThread(new C12970a(aVar));
        }
    }
}
