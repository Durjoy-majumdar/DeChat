package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.AbsListView;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import java.util.HashSet;
import jr2.C99019x;
import kv1.C99251g;
import kv1.C99260q;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C23121h;
import zv1.C23591a;

/* renamed from: com.tencent.mm.plugin.fts.ui.y */
public class C18885y extends C18852m implements C21891f.C21893b {

    /* renamed from: n */
    public int f52943n;

    /* renamed from: o */
    public int f52944o;

    /* renamed from: p */
    public C21891f f52945p;

    /* renamed from: q */
    public C23591a f52946q;

    /* renamed from: r */
    public MMHandler f52947r = new MMHandler(Looper.getMainLooper());

    /* renamed from: s */
    public boolean f52948s;

    /* renamed from: t */
    public boolean f52949t;

    /* renamed from: u */
    public MMHandler f52950u = new C18886a(Looper.getMainLooper());

    /* renamed from: v */
    public boolean f52951v;

    /* renamed from: com.tencent.mm.plugin.fts.ui.y$a */
    public class C18886a extends MMHandler {
        public C18886a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                Log.m105918d("MicroMsg.FTS.FTSDetailAdapter", "ImageEngine attach is true");
                C18885y yVar = C18885y.this;
                if (!yVar.f52949t && yVar.f52857g > 0) {
                    ((C93829e) ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta()).mo128779g();
                    ((C94901o) C99019x.m128972d()).mo131118g0();
                    C18885y.this.notifyDataSetChanged();
                }
            }
        }
    }

    public C18885y(C18854q qVar, int i, int i2) {
        super(qVar);
        int i3;
        this.f52944o = i;
        Context h = mo23829h();
        if (i == -23) {
            i3 = 8224;
        } else if (i == -15) {
            i3 = 4240;
        } else if (i != -13) {
            switch (i) {
                case -7:
                    i3 = 4208;
                    break;
                case -6:
                    i3 = 4160;
                    break;
                case -5:
                    i3 = 4144;
                    break;
                case -4:
                    i3 = 4112;
                    break;
                case -3:
                    i3 = 4128;
                    break;
                case -2:
                    i3 = 4176;
                    break;
                case -1:
                    i3 = 4192;
                    break;
                default:
                    i3 = -1;
                    break;
            }
        } else {
            i3 = 4224;
        }
        Log.m105925i("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | uiLogicType=%d", Integer.valueOf(i3), Integer.valueOf(i3));
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(i3));
        this.f52945p = ((C99260q) C86312j.m106911c(C99260q.class)).Wh0(hashSet, h, this, i2).get(0);
        this.f52946q = new C23591a();
        this.f52943n = i2;
    }

    /* renamed from: a */
    public void mo23811a(C21891f fVar, String str, boolean z) {
        str.equals(this.f52858h);
        mo23833n(fVar.mo17721d(0));
        notifyDataSetChanged();
        mo23831k(this.f52857g, true);
        this.f52946q.f67691a = System.currentTimeMillis();
        C23591a aVar = this.f52946q;
        aVar.getClass();
        for (C21891f.C21892a aVar2 : ((C18842a) fVar).f52840j) {
            aVar.f67692b += aVar2.f61909f.size();
        }
    }

    /* renamed from: b */
    public void mo23822b() {
        super.mo23822b();
        C23591a aVar = this.f52946q;
        aVar.f67691a = 0;
        aVar.f67692b = 0;
        aVar.f67693c = 0;
        this.f52945p.mo17727l();
        this.f52945p.mo17722e();
        this.f52950u.removeMessages(1);
    }

    /* renamed from: d */
    public C22019b mo23812d(int i) {
        C22019b f = this.f52945p.mo17723f(i);
        if (f != null) {
            f.f62331i = i;
            f.f62328f = 2;
        }
        return f;
    }

    /* renamed from: f */
    public void mo23813f() {
        this.f52948s = false;
        this.f52946q.f67693c = C99251g.m129286g(this.f52943n);
        this.f52945p.mo17725h(this.f52858h, this.f52947r, new HashSet(), 0);
    }

    /* renamed from: g */
    public void mo23815g() {
        if (!this.f52948s) {
            this.f52948s = true;
            if (!this.f52951v) {
                C18843b0.m19722i(this.f52858h, false, this.f52945p.mo17724g(), this.f52944o);
            }
        }
        C23591a aVar = this.f52946q;
        aVar.f67691a = 0;
        aVar.f67692b = 0;
        aVar.f67693c = 0;
        super.mo23815g();
    }

    /* renamed from: j */
    public boolean mo23814j(View view, C22019b bVar, boolean z) {
        this.f52945p.mo17718b(view, bVar, z);
        if (bVar.f62337o) {
            Log.m105919d("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | searchScene=%d | kvPosition=%d | kvSubPosition=%d | kvSearchId=%s | kvDocId=%d", Integer.valueOf(bVar.f62329g), Integer.valueOf(bVar.f62330h), Integer.valueOf(bVar.f62331i), Integer.valueOf(bVar.f62332j), bVar.f62333k, 0L);
            if (!this.f52948s) {
                C18843b0.m19722i(this.f52858h, true, this.f52945p.mo17724g(), bVar.f62329g);
                this.f52948s = true;
            }
            C18843b0.m19716c(bVar, this.f52946q);
        } else if (bVar instanceof C23121h) {
            this.f52951v = true;
            C18843b0.m19716c(bVar, this.f52946q);
        }
        return false;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        Class cls = C99260q.class;
        super.onScrollStateChanged(absListView, i);
        if (i == 2) {
            this.f52949t = true;
            ((C93829e) ((C99260q) C86312j.m106911c(cls)).mo128746Ta()).mo128780h();
            ((C94901o) C99019x.m128972d()).mo131082B();
            Log.m105918d("MicroMsg.FTS.FTSDetailAdapter", "ImageEngine attach is false");
            return;
        }
        this.f52949t = false;
        if (!((C93829e) ((C99260q) C86312j.m106911c(cls)).mo128746Ta()).f270801c) {
            this.f52950u.removeMessages(1);
            this.f52950u.sendEmptyMessageDelayed(1, 200);
        }
    }
}
