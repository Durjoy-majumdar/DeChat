package u93;

import android.net.Uri;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import t83.C48574a1;

/* renamed from: u93.h */
public final class C52496h {

    /* renamed from: a */
    public final String f146648a;

    /* renamed from: b */
    public BaseWebSearchWebView f146649b;

    /* renamed from: c */
    public C48574a1 f146650c;

    /* renamed from: d */
    public C52480c f146651d;

    /* renamed from: e */
    public AtomicBoolean f146652e = new AtomicBoolean(false);

    public C52496h(String str) {
        C87412m.m108594g(str, "url");
        this.f146648a = str;
        Uri parse = Uri.parse(str);
        try {
            String queryParameter = parse.getQueryParameter(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (queryParameter != null) {
                Integer.parseInt(queryParameter);
            }
        } catch (Exception unused) {
        }
        parse.getQueryParameter("sessionId");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C52496h) && C87412m.m108589b(this.f146648a, ((C52496h) obj).f146648a);
    }

    public int hashCode() {
        return this.f146648a.hashCode();
    }

    public String toString() {
        return "WebSearchPreloadObj(url=" + this.f146648a + ')';
    }
}
