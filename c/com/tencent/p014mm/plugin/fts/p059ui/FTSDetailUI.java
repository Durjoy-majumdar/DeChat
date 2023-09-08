package com.tencent.p014mm.plugin.fts.p059ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.UpdateFtsSearchDataEvent;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.List;
import kv1.C99260q;
import pv1.C22019b;

/* renamed from: com.tencent.mm.plugin.fts.ui.FTSDetailUI */
public class FTSDetailUI extends FTSBaseUI {

    /* renamed from: o */
    public int f52811o;

    /* renamed from: p */
    public int f52812p;

    /* renamed from: q */
    public IListener<UpdateFtsSearchDataEvent> f52813q = new IListener<UpdateFtsSearchDataEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1317958916;
        }

        public boolean callback(IEvent iEvent) {
            if (((UpdateFtsSearchDataEvent) iEvent) == null) {
                return false;
            }
            FTSDetailUI.this.mo23745Q7();
            Log.m105924i("MicroMsg.FTS.FTSDetailUI", "UpdateFtsSearchDataEvent");
            return false;
        }
    };

    /* renamed from: r */
    public C18885y f52814r;

    /* renamed from: H7 */
    public C18852m mo23744H7(C18854q qVar) {
        if (this.f52814r == null) {
            this.f52814r = new C18885y(qVar, this.f52812p, this.f52811o);
        }
        return this.f52814r;
    }

    /* renamed from: J7 */
    public String mo23781J7() {
        String d = C93938f0.m118696d(this.f52812p);
        return d == null ? getString(C0966R.string.a2p) : d;
    }

    /* renamed from: K7 */
    public void mo23782K7() {
        this.f52812p = getIntent().getIntExtra("detail_type", 0);
        this.f52811o = getIntent().getIntExtra("Search_Scene", 0);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.asz;
    }

    /* renamed from: o6 */
    public void mo23749o6(View view, C22019b bVar, boolean z) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C93829e) ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta()).mo128779g();
        String stringExtra = getIntent().getStringExtra("detail_query");
        this.f52756j = stringExtra;
        this.f52754h.getFtsEditText().mo70356l(stringExtra, (List<FTSSearchView.C6996f>) null);
        Log.m105925i("MicroMsg.FTS.FTSDetailUI", "onCreate query=%s, searchType=%d, kvScene=%d", this.f52756j, Integer.valueOf(this.f52812p), Integer.valueOf(this.f52811o));
        mo23745Q7();
        this.f52754h.getFtsEditText().mo70338f();
        this.f52813q.alive();
    }

    public void onDestroy() {
        this.f52814r.mo23815g();
        this.f52813q.dead();
        ((C93829e) ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta()).mo128781i();
        super.onDestroy();
    }
}
