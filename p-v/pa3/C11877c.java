package pa3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import c00.C0405n;
import c00.C0406o;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Map;
import ke3.C88144b;
import na3.C117620h;
import u73.C101987v0;
import u73.C14135q;
import u73.C22613h1;

/* renamed from: pa3.c */
public class C11877c implements C117620h {

    /* renamed from: pa3.c$a */
    public class C11878a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f34717d;

        /* renamed from: e */
        public final /* synthetic */ Activity f34718e;

        public C11878a(C11877c cVar, String str, Activity activity) {
            this.f34717d = str;
            this.f34718e = activity;
        }

        public void run() {
            Class cls = C0405n.class;
            Intent O20 = ((C0405n) C86312j.m106911c(cls)).O20();
            O20.putExtra("ftsbizscene", 21);
            O20.putExtra("ftsQuery", this.f34717d);
            O20.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f34717d);
            O20.putExtra("isWebwx", this.f34717d);
            O20.putExtra("ftscaneditable", false);
            Map<String, String> hn = ((C0405n) C86312j.m106911c(cls)).mo280hn(21, false, 2);
            hn.put(SearchIntents.EXTRA_QUERY, this.f34717d);
            hn.put("sceneActionType", String.valueOf(2));
            O20.putExtra("rawUrl", C101987v0.m134270d(hn, 1));
            OnSearchSearchBoxCtrlInfoChangedEvent onSearchSearchBoxCtrlInfoChangedEvent = new OnSearchSearchBoxCtrlInfoChangedEvent();
            onSearchSearchBoxCtrlInfoChangedEvent.f264957d.f264958a = 0;
            onSearchSearchBoxCtrlInfoChangedEvent.publish();
            C88144b.m109791i(this.f34718e, "webview", ".ui.tools.fts.FTSWebViewUI", O20, (Bundle) null);
            C22613h1.m26476b(21, this.f34717d);
        }
    }

    /* renamed from: Is */
    public String mo11753Is(String str) {
        String optString = ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverRecommendEntry").optString("wording");
        return Util.isNullOrNil(optString) ? MMApplicationContext.getContext().getString(C0966R.string.cwb) : optString;
    }

    public void dh0(Activity activity, String str) {
        if (!C43471q.m46984h(0)) {
            Log.m105920e("MicroMsg.FTS.LookOneLookOpener", "fts h5 template not avail");
            return;
        }
        String optString = ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverRecommendEntry").optString("wording");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.FTS.LookOneLookOpener", "empty query");
        } else {
            ((C14135q) C86312j.m106911c(C14135q.class)).mo13549kN(MMApplicationContext.getContext(), new C11878a(this, optString, activity));
        }
    }

    public String nl0(String str) {
        return ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverRecommendEntry").optString("labIcon");
    }
}
