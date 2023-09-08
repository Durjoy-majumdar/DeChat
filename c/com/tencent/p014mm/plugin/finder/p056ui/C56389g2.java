package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C58245c;
import gy3.C87412m;
import qo1.C63295m;

/* renamed from: com.tencent.mm.plugin.finder.ui.g2 */
public final class C56389g2 implements C58245c {

    /* renamed from: a */
    public final /* synthetic */ Intent f161218a;

    /* renamed from: b */
    public final /* synthetic */ FinderPostRouterUI f161219b;

    public C56389g2(Intent intent, FinderPostRouterUI finderPostRouterUI) {
        this.f161218a = intent;
        this.f161219b = finderPostRouterUI;
    }

    /* renamed from: a */
    public void mo79148a(Activity activity, int i, Intent intent) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(intent, "intent");
        Log.m105924i("Finder.FinderPostRouterUI", "start template post, enter album");
        intent.putExtras(this.f161218a);
        intent.putExtra("key_finder_context_id", this.f161219b.f161077s);
        intent.putExtra("key_finder_session_id", this.f161219b.f161078t);
        intent.putExtra("key_finder_post_id", this.f161219b.f161076r);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", this.f161219b.f161081w);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", this.f161219b.f161079u);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", this.f161219b.f161080v);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", this.f161219b.f161082x);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", this.f161219b.f161083y);
        intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", this.f161219b.f161084z);
        C63295m.f179622a.mo88198i(activity, intent, 3, true, i);
    }
}
