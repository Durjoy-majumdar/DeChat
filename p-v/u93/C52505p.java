package u93;

import android.content.MutableContextWrapper;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import gy3.C87412m;
import js0.C46574u;
import p224ra.C89909e;

/* renamed from: u93.p */
public final class C52505p extends BaseWebSearchWebView {
    public C52505p(MutableContextWrapper mutableContextWrapper) {
        super(mutableContextWrapper);
    }

    public String getUserAgentString() {
        String a = C46574u.m51897a(getContext(), getSettings().getUserAgentString(), (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class));
        C87412m.m108593f(a, "appendUserAgent(\n       …va)\n                    )");
        return a;
    }
}
