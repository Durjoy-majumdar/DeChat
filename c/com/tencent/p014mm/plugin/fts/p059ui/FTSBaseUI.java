package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.fts.p059ui.C18852m;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kv1.C99251g;
import kv1.C99254i;
import pv1.C22019b;

/* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseUI */
public abstract class FTSBaseUI extends MMSecDataActivity implements C18854q, FTSSearchView.C6995e, FTSEditTextView.C45051l, C18852m.C18853a {

    /* renamed from: d */
    public ListView f52750d;

    /* renamed from: e */
    public C18852m f52751e;

    /* renamed from: f */
    public TextView f52752f;

    /* renamed from: g */
    public boolean f52753g = false;

    /* renamed from: h */
    public FTSSearchView f52754h;

    /* renamed from: i */
    public String f52755i = null;

    /* renamed from: j */
    public String f52756j = "";

    /* renamed from: n */
    public MMHandler f52757n = new C18825c();

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseUI$a */
    public class C18823a implements View.OnTouchListener {
        public C18823a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSBaseUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            FTSBaseUI.this.f52754h.getFtsEditText().mo70335c();
            FTSBaseUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/fts/ui/FTSBaseUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseUI$b */
    public class C18824b implements MenuItem.OnMenuItemClickListener {
        public C18824b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FTSBaseUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseUI$c */
    public class C18825c extends MMHandler {
        public C18825c() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1 && !Util.isNullOrNil(FTSBaseUI.this.f52756j)) {
                FTSBaseUI.this.mo23745Q7();
            }
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: E2 */
    public void mo23760E2(int i, boolean z) {
        Log.m105925i("MicroMsg.FTS.FTSBaseUI", "onEnd resultCount=%d | isFinished=%b", Integer.valueOf(i), Boolean.valueOf(z));
        if (z) {
            if (i > 0) {
                mo23784N7();
            } else {
                mo23785O7();
            }
        } else if (i > 0) {
            mo23784N7();
        } else {
            mo23786P7();
        }
        if (this.f52753g) {
            this.f52753g = false;
            this.f52750d.setSelection(0);
        }
    }

    /* renamed from: H7 */
    public abstract C18852m mo23744H7(C18854q qVar);

    /* renamed from: I7 */
    public void mo23780I7(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f52756j = str;
            this.f52757n.removeMessages(1);
            this.f52757n.sendEmptyMessageDelayed(1, 300);
            return;
        }
        mo23746R7();
    }

    /* renamed from: J7 */
    public String mo23781J7() {
        String str = this.f52755i;
        return str != null ? str : getString(C0966R.string.a2p);
    }

    /* renamed from: K7 */
    public void mo23782K7() {
    }

    /* renamed from: L7 */
    public void mo23753L7() {
        FTSSearchView fTSSearchView = new FTSSearchView((Context) this, false);
        this.f52754h = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        this.f52754h.getFtsEditText().setHint(mo23781J7());
        this.f52754h.getFtsEditText().mo70338f();
        this.f52754h.getFtsEditText().setFtsEditTextListener(this);
        this.f52754h.getFtsEditText().setCanDeleteTag(false);
        getSupportActionBar().mo91114y(this.f52754h);
        this.f52750d = (ListView) findViewById(C0966R.C0970id.j6x);
        if (getFooterView() != null) {
            Log.m105924i("MicroMsg.FTS.FTSBaseUI", "searchResultLV addFooterView");
            this.f52750d.addFooterView(getFooterView());
        }
        C18852m H7 = mo23744H7(this);
        this.f52751e = H7;
        H7.f52860j = this;
        this.f52750d.setAdapter(H7);
        this.f52750d.setOnScrollListener(this.f52751e);
        this.f52750d.setOnItemClickListener(this.f52751e);
        this.f52750d.setOnTouchListener(new C18823a());
        this.f52752f = (TextView) findViewById(C0966R.C0970id.hgt);
        setBackBtn(new C18824b());
    }

    /* renamed from: M7 */
    public void mo23783M7() {
        this.f52752f.setVisibility(8);
        this.f52750d.setVisibility(8);
    }

    /* renamed from: N7 */
    public void mo23784N7() {
        this.f52752f.setVisibility(8);
        this.f52750d.setVisibility(0);
    }

    /* renamed from: O7 */
    public void mo23785O7() {
        this.f52752f.setVisibility(0);
        this.f52752f.setText(C99254i.m129316m(getString(C0966R.string.igo), getString(C0966R.string.ign), this.f52756j));
        this.f52750d.setVisibility(8);
    }

    /* renamed from: P7 */
    public void mo23786P7() {
        this.f52752f.setVisibility(8);
        this.f52750d.setVisibility(8);
    }

    /* renamed from: Q7 */
    public void mo23745Q7() {
        C18852m mVar = this.f52751e;
        if (mVar != null) {
            this.f52753g = true;
            String str = this.f52756j;
            mVar.mo23834o();
            mVar.f52859i = System.currentTimeMillis();
            mVar.f52858h = str;
            Log.m105925i("MicroMsg.FTS.FTSBaseAdapter", "start search query=%s", str);
            mVar.mo23813f();
            mo23786P7();
        }
    }

    /* renamed from: R7 */
    public void mo23746R7() {
        this.f52756j = "";
        this.f52757n.removeMessages(1);
        this.f52753g = false;
        this.f52751e.mo23834o();
        this.f52754h.getFtsEditText().setHint(mo23781J7());
        mo23783M7();
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        if (mVar == FTSEditTextView.C45052m.UserInput) {
            String o = C99251g.m129294o(str);
            if (Util.isNullOrNil(this.f52756j) || !this.f52756j.equals(o)) {
                mo23780I7(o);
                return;
            }
            Log.m105925i("MicroMsg.FTS.FTSBaseUI", "Same query %s %s", this.f52756j, o);
        }
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public View getFooterView() {
        return null;
    }

    public ListView getListView() {
        return this.f52750d;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    /* renamed from: o6 */
    public void mo23749o6(View view, C22019b bVar, boolean z) {
    }

    public void onClickBackBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(View view) {
    }

    public void onClickClearTextBtn(View view) {
        mo23746R7();
        if (this.f52754h.getFtsEditText().mo70354j()) {
            showVKB();
        } else {
            this.f52754h.getFtsEditText().mo70355k();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        showMMLogo();
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2927a));
        mo23782K7();
        mo23753L7();
    }

    public void onDestroy() {
        this.f52757n.removeMessages(1);
        this.f52751e.mo23815g();
        super.onDestroy();
    }

    /* renamed from: y */
    public boolean mo3009y() {
        hideVKB();
        this.f52754h.getFtsEditText().mo70335c();
        return false;
    }
}
