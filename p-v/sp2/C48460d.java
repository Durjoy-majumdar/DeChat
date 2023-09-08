package sp2;

import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p196ln.C76706g;
import p196ln.C76708i;

/* renamed from: sp2.d */
public final class C48460d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f129665d;

    public C48460d(String str) {
        this.f129665d = str;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$tryPreloadResource$1");
        Log.m105924i("AdPullRequestHelper", "checkUpdate avatar:" + this.f129665d);
        ((C76708i) C86312j.m106911c(C76708i.class)).mo106823Jc(this.f129665d);
        ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93575b(this.f129665d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$tryPreloadResource$1");
    }
}
