package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.tools.C106757l0;
import com.tencent.p014mm.plugin.fts.p059ui.C18852m;
import com.tencent.p014mm.plugin.fts.p059ui.widget.C18880f;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebView;
import di3.C86312j;
import java.util.List;
import kv1.C99251g;
import nj3.C88989a;
import s00.C90110f;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI */
public abstract class FTSBaseVoiceSearchUI extends MMSecDataActivity implements C106742j1.C106756o, C18854q, C18852m.C18853a {

    /* renamed from: d */
    public C18880f f52761d;

    /* renamed from: e */
    public ListView f52762e;

    /* renamed from: f */
    public C18852m f52763f;

    /* renamed from: g */
    public boolean f52764g = false;

    /* renamed from: h */
    public boolean f52765h = true;

    /* renamed from: i */
    public String f52766i;

    /* renamed from: j */
    public boolean f52767j;

    /* renamed from: n */
    public MMHandler f52768n = new C18826a();

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI$a */
    public class C18826a extends MMHandler {
        public C18826a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1 && !Util.isNullOrNil(FTSBaseVoiceSearchUI.this.f52766i)) {
                FTSBaseVoiceSearchUI.this.mo23770R7();
            }
        }
    }

    /* renamed from: E2 */
    public void mo23760E2(int i, boolean z) {
        Log.m105925i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onEnd resultCount=%d | isFinished=%b", Integer.valueOf(i), Boolean.valueOf(z));
        if (z) {
            mo23766N7();
            if (i > 0) {
                mo23765M7();
            } else {
                mo23768P7();
            }
        } else if (i > 0) {
            mo23765M7();
            mo23767O7();
        } else {
            mo23769Q7();
            mo23766N7();
        }
        if (this.f52764g) {
            this.f52764g = false;
            this.f52762e.setSelection(0);
        }
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        Log.m105918d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onQuitSearch");
        finish();
    }

    /* renamed from: H7 */
    public abstract C18852m mo23761H7(C18854q qVar);

    /* renamed from: I7 */
    public List<View> mo23762I7() {
        return null;
    }

    /* renamed from: J7 */
    public String mo23793J7() {
        String str = this.f52766i;
        return str == null ? "" : str;
    }

    /* renamed from: K7 */
    public void mo23763K7() {
    }

    /* renamed from: L7 */
    public void mo23764L7() {
        this.f52762e.setVisibility(8);
    }

    /* renamed from: M7 */
    public void mo23765M7() {
        this.f52762e.setVisibility(0);
    }

    /* renamed from: N7 */
    public void mo23766N7() {
    }

    /* renamed from: O7 */
    public void mo23767O7() {
    }

    /* renamed from: P7 */
    public void mo23768P7() {
        this.f52762e.setVisibility(8);
    }

    /* renamed from: Q7 */
    public void mo23769Q7() {
        this.f52762e.setVisibility(8);
    }

    /* renamed from: R7 */
    public void mo23770R7() {
        this.f52764g = true;
        C18852m mVar = this.f52763f;
        String str = this.f52766i;
        mVar.mo23834o();
        mVar.f52859i = System.currentTimeMillis();
        mVar.f52858h = str;
        Log.m105925i("MicroMsg.FTS.FTSBaseAdapter", "start search query=%s", str);
        mVar.mo23813f();
        mo23769Q7();
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        Log.m105919d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onSearchKeyDown %s", str);
        hideVKB();
        C18880f fVar = this.f52761d;
        if (fVar != null) {
            fVar.mo153849a();
        }
        return false;
    }

    /* renamed from: S7 */
    public void mo23771S7() {
        this.f52768n.removeMessages(1);
        this.f52764g = false;
        this.f52763f.mo23834o();
        mo23764L7();
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public ListView getListView() {
        return this.f52762e;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
        Log.m105918d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onEnterSearch");
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        Log.m105927v("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onSearchChange %s", str);
        if (Util.isNullOrNil(str)) {
            C106757l0 l0Var = this.f52761d.f319121i;
            if (!(l0Var != null ? l0Var.mo153789a() : false)) {
                C106757l0 l0Var2 = this.f52761d.f319121i;
                if (l0Var2 != null) {
                    l0Var2.mo153791c();
                }
                showVKB();
            }
            mo23764L7();
        }
        String o = C99251g.m129294o(str);
        if (Util.isNullOrNil(this.f52766i) || !this.f52766i.equals(o)) {
            this.f52766i = o;
            if (!Util.isNullOrNil(o)) {
                this.f52768n.removeMessages(1);
                this.f52768n.sendEmptyMessageDelayed(1, 300);
                return;
            }
            mo23771S7();
            return;
        }
        Log.m105925i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "Same query %s %s", this.f52766i, o);
    }

    /* renamed from: l5 */
    public void mo1325l5() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        showMMLogo();
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        mo23763K7();
        WebView.WebViewKind webViewKind = WebView.sDefaultWebViewKind;
        ((C90110f) C86312j.m106911c(C90110f.class)).po0(webViewKind, new C18855r(this));
        Log.m105925i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "Start To Load WebView %s", webViewKind.name());
        C18880f fVar = new C18880f(this);
        this.f52761d = fVar;
        fVar.f319122j = this;
        fVar.f52937s = C93938f0.m118697e();
        this.f52762e = (ListView) findViewById(C0966R.C0970id.j6x);
        List<View> I7 = mo23762I7();
        if (I7 != null && I7.size() > 0) {
            Log.m105925i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "searchResultLV addFooterView %d", Integer.valueOf(I7.size()));
            for (View addFooterView : I7) {
                this.f52762e.addFooterView(addFooterView);
            }
        }
        C18852m H7 = mo23761H7(this);
        this.f52763f = H7;
        H7.f52860j = this;
        this.f52762e.setAdapter(H7);
        this.f52762e.setOnScrollListener(this.f52763f);
        this.f52762e.setOnItemClickListener(this.f52763f);
        this.f52762e.setOnTouchListener(new C68991s(this));
        setBackBtn(new C18856t(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f52761d.mo23882j(this, menu);
        if (!this.f52767j) {
            this.f52761d.mo153851c(true);
            this.f52767j = true;
        }
        return true;
    }

    public void onDestroy() {
        this.f52768n.removeMessages(1);
        this.f52763f.mo23815g();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f52761d.mo153849a();
        this.f52763f.getClass();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        this.f52761d.mo153858m(this, menu);
        return true;
    }

    /* renamed from: y4 */
    public void mo1326y4() {
    }
}
