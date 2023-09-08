package com.tencent.p014mm.plugin.fts.p059ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import java.util.ArrayList;
import java.util.List;
import kv1.C99251g;

/* renamed from: com.tencent.mm.plugin.fts.ui.FTSConvMessageUI */
public class FTSConvMessageUI extends FTSBaseUI {

    /* renamed from: o */
    public String f52798o;

    /* renamed from: p */
    public String f52799p;

    /* renamed from: q */
    public int f52800q;

    /* renamed from: r */
    public C18859w f52801r;

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSConvMessageUI$b */
    public class C18833b implements FTSSearchView.C6996f {

        /* renamed from: d */
        public String f52802d;

        public C18833b(FTSConvMessageUI fTSConvMessageUI, C18832a aVar) {
        }

        /* renamed from: SE */
        public String mo8025SE() {
            return this.f52802d;
        }

        public int compareTo(Object obj) {
            return 0;
        }
    }

    /* renamed from: H7 */
    public C18852m mo23744H7(C18854q qVar) {
        if (this.f52801r == null) {
            this.f52801r = new C18859w(qVar, this.f52798o, this.f52800q);
        }
        return this.f52801r;
    }

    /* renamed from: J7 */
    public String mo23781J7() {
        return getString(C0966R.string.ii5);
    }

    /* renamed from: K7 */
    public void mo23782K7() {
        this.f52798o = getIntent().getStringExtra("key_conv");
        this.f52799p = getIntent().getStringExtra("key_query");
        this.f52800q = getIntent().getIntExtra("Search_Scene", 0);
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        super.mo3001b3(str2, str2, list, mVar);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.asu;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18833b bVar = new C18833b(this, (C18832a) null);
        bVar.f52802d = C99251g.m129283d(this.f52798o);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        String str = this.f52799p;
        this.f52756j = str;
        this.f52754h.getFtsEditText().mo70356l(str, arrayList);
        mo23745Q7();
    }

    public void onDestroy() {
        this.f52801r.mo23815g();
        super.onDestroy();
    }

    /* renamed from: y */
    public boolean mo3009y() {
        return false;
    }
}
