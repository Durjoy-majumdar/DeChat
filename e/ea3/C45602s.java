package ea3;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.json.JSONObject;
import u24.C90598g;
import wc3.C53143h0;

/* renamed from: ea3.s */
public final class C45602s implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ String f123332d;

    /* renamed from: e */
    public final /* synthetic */ C45604u f123333e;

    /* renamed from: f */
    public final /* synthetic */ C32224a f123334f;

    public C45602s(String str, C45604u uVar, C32224a aVar) {
        this.f123332d = str;
        this.f123333e = uVar;
        this.f123334f = aVar;
    }

    public boolean queueIdle() {
        Looper.myQueue().removeIdleHandler(this);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C87412m.m108593f(this.f123332d, "s");
            String str = this.f123332d;
            String substring = str.substring(1, str.length() - 1);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            JSONObject jSONObject = new JSONObject(C90598g.m113505d(substring));
            Iterator<String> keys = jSONObject.keys();
            C87412m.m108593f(keys, "keys()");
            while (keys.hasNext()) {
                JSONObject optJSONObject = jSONObject.optJSONObject(keys.next());
                Iterator<String> keys2 = optJSONObject.keys();
                C87412m.m108593f(keys2, "keys()");
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    Log.m105927v("MicroMsg.WebViewPerformanceHelper", "fetchDocumentTime key: %s, value: %s", next, Long.valueOf(optJSONObject.optLong(next)));
                    this.f123333e.mo73829a(next, optJSONObject.optLong(next));
                }
            }
            this.f123334f.invoke();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebViewPerformanceHelper", e, "fetchDocumentTime exception", new Object[0]);
        }
        C45604u uVar = this.f123333e;
        ConcurrentLinkedDeque<C53143h0.C53144a> concurrentLinkedDeque = uVar.f148279b;
        if (concurrentLinkedDeque != null && !concurrentLinkedDeque.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<C53143h0.C53144a> it = uVar.f148279b.iterator();
            while (it.hasNext()) {
                C53143h0.C53144a next2 = it.next();
                sb.append("[");
                sb.append(next2.f148281a);
                sb.append(": ");
                sb.append(next2.f148282b);
                if (next2.f148282b > uVar.f123355v) {
                    sb.append(", ");
                    sb.append(next2.f148282b - uVar.f123355v);
                }
                if (!Util.isNullOrNil(next2.f148283c)) {
                    sb.append(", ");
                    sb.append(next2.f148283c);
                }
                sb.append("] ");
            }
            Log.m105925i("MicroMsg.WebViewPerformanceHelper", "WebView-Trace#" + uVar.f123354u + ", webViewPerformance: %s", sb.toString());
            uVar.f148279b.clear();
        }
        Log.m105927v("MicroMsg.WebViewPerformanceHelper", "onReceiveValue cost %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return false;
    }
}
