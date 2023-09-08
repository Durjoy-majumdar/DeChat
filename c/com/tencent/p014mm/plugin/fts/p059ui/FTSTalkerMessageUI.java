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
import kv1.C99260q;

/* renamed from: com.tencent.mm.plugin.fts.ui.FTSTalkerMessageUI */
public class FTSTalkerMessageUI extends FTSBaseUI {

    /* renamed from: o */
    public String f52825o;

    /* renamed from: p */
    public String f52826p;

    /* renamed from: q */
    public int f52827q;

    /* renamed from: r */
    public C18845d0 f52828r;

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSTalkerMessageUI$b */
    public class C18840b implements FTSSearchView.C6996f {

        /* renamed from: d */
        public String f52829d;

        public C18840b(FTSTalkerMessageUI fTSTalkerMessageUI, C18839a aVar) {
        }

        /* renamed from: SE */
        public String mo8025SE() {
            return this.f52829d;
        }

        public int compareTo(Object obj) {
            return 0;
        }
    }

    /* renamed from: H7 */
    public C18852m mo23744H7(C18854q qVar) {
        if (this.f52828r == null) {
            this.f52828r = new C18845d0(this, this.f52825o, this.f52827q);
        }
        return this.f52828r;
    }

    /* renamed from: K7 */
    public void mo23782K7() {
        this.f52825o = getIntent().getStringExtra("key_talker_query");
        this.f52826p = getIntent().getStringExtra("key_query");
        this.f52827q = getIntent().getIntExtra("Search_Scene", 0);
        Log.m105925i("MicroMsg.FTS.FTSTalkerMessageUI", "initSearchData query=%s talkerQuery=%s", this.f52826p, this.f52825o);
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
        C18840b bVar = new C18840b(this, (C18839a) null);
        bVar.f52829d = this.f52825o;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        String str = this.f52826p;
        this.f52756j = str;
        this.f52754h.getFtsEditText().mo70356l(str, arrayList);
        mo23745Q7();
    }

    public void onDestroy() {
        this.f52828r.mo23815g();
        ((C93829e) ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta()).mo128780h();
        super.onDestroy();
    }
}
