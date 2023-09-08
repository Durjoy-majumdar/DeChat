package com.tencent.p014mm.plugin.fts.p059ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import kv1.C99251g;
import kv1.C99260q;

/* renamed from: com.tencent.mm.plugin.fts.ui.FTSConvTalkerMessageUI */
public class FTSConvTalkerMessageUI extends FTSBaseUI {

    /* renamed from: o */
    public String f52803o;

    /* renamed from: p */
    public String f52804p;

    /* renamed from: q */
    public String f52805q;

    /* renamed from: r */
    public String f52806r;

    /* renamed from: s */
    public int f52807s;

    /* renamed from: t */
    public int f52808t;

    /* renamed from: u */
    public C18884x f52809u;

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSConvTalkerMessageUI$b */
    public class C18835b implements FTSSearchView.C6996f {

        /* renamed from: d */
        public String f52810d;

        public C18835b(FTSConvTalkerMessageUI fTSConvTalkerMessageUI, C18834a aVar) {
        }

        /* renamed from: SE */
        public String mo8025SE() {
            return this.f52810d;
        }

        public int compareTo(Object obj) {
            return 0;
        }
    }

    /* renamed from: H7 */
    public C18852m mo23744H7(C18854q qVar) {
        if (this.f52809u == null) {
            this.f52809u = new C18884x(this, this.f52805q, this.f52803o, this.f52804p, this.f52808t, this.f52807s);
        }
        return this.f52809u;
    }

    /* renamed from: K7 */
    public void mo23782K7() {
        this.f52804p = getIntent().getStringExtra("key_conv");
        this.f52805q = getIntent().getStringExtra("key_talker");
        this.f52806r = getIntent().getStringExtra("key_query");
        this.f52803o = getIntent().getStringExtra("key_talker_query");
        this.f52807s = getIntent().getIntExtra("detail_type", 1);
        this.f52808t = getIntent().getIntExtra("Search_Scene", 0);
        Log.m105925i("MicroMsg.FTS.FTSConvTalkerMessageUI", "initSearchData query=%s talker=%s conversation=%s showType=%d", this.f52806r, this.f52805q, this.f52804p, Integer.valueOf(this.f52807s));
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        super.mo3001b3(str2, str2, list, mVar);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ats;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C93829e) ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta()).mo128779g();
        C18835b bVar = new C18835b(this, (C18834a) null);
        bVar.f52810d = this.f52803o;
        C18835b bVar2 = new C18835b(this, (C18834a) null);
        bVar2.f52810d = ">";
        C18835b bVar3 = new C18835b(this, (C18834a) null);
        bVar3.f52810d = C99251g.m129283d(this.f52804p);
        ArrayList arrayList = new ArrayList();
        if (this.f52807s == 2) {
            arrayList.add(bVar);
            arrayList.add(bVar2);
            arrayList.add(bVar3);
        } else {
            arrayList.add(bVar3);
            arrayList.add(bVar2);
            arrayList.add(bVar);
        }
        String str = this.f52806r;
        this.f52756j = str;
        this.f52754h.getFtsEditText().mo70356l(str, arrayList);
        mo23745Q7();
    }
}
