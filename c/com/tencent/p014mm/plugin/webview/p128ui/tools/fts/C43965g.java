package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.text.TextUtils;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import t83.C13851h1;
import t83.C48590l;
import t83.C48594m0;
import u73.C14136q0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.g */
public class C43965g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f119098d;

    /* renamed from: e */
    public final /* synthetic */ FTSBaseWebViewUI f119099e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.g$a */
    public class C43966a implements Runnable {
        public C43966a() {
        }

        public void run() {
            C43965g.this.f119099e.f118935q3.getFtsEditText().mo70357m(C43965g.this.f119099e.f118935q3.getFtsEditText().getRecommendSearchHint(), (List<FTSSearchView.C6996f>) null, FTSEditTextView.C45052m.SetText, false);
            C43965g.this.f119099e.f118935q3.getFtsEditText().mo70335c();
            C43965g.this.f119099e.f118935q3.getFtsEditText().mo70339g();
        }
    }

    public C43965g(FTSBaseWebViewUI fTSBaseWebViewUI, int i) {
        this.f119099e = fTSBaseWebViewUI;
        this.f119098d = i;
    }

    public void run() {
        int i;
        if (this.f119099e.f118508Z != null) {
            JSONObject jSONObject = new JSONObject();
            String da = this.f119099e.mo68491da();
            if (Util.isNullOrNil(da)) {
                da = this.f119099e.f118935q3.getFtsEditText().getRecommendSearchHint();
                ((C119157j) C119157j.f356862d).mo183895z(new C43966a());
                i = 1;
            } else {
                i = 0;
            }
            if (!Util.isNullOrNil(da)) {
                try {
                    jSONObject.put(SearchIntents.EXTRA_QUERY, da);
                    jSONObject.put("custom", this.f119099e.mo68489ba());
                    jSONObject.put("tagList", this.f119099e.mo68490ca());
                    jSONObject.put("isBackButtonClick", this.f119098d);
                    jSONObject.put("type", this.f119099e.f118938t3);
                    jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f119099e.f118940v3);
                    jSONObject.put("isHomePage", 0);
                    jSONObject.put("fromRecommendSearchQuery", i);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.WebSearch.FTSBaseWebViewUI", e, "", new Object[0]);
                }
                C48590l lVar = this.f119099e.f118508Z;
                MMHandlerThread.postToMainThread(new C48594m0(lVar, C13851h1.C13852a.m13144d("onSearchInputConfirm", jSONObject, lVar.f130011p, lVar.f130012q)));
                if (!TextUtils.isEmpty(this.f119099e.mo68489ba())) {
                    FTSBaseWebViewUI fTSBaseWebViewUI = this.f119099e;
                    C14136q0.m13476h(fTSBaseWebViewUI.f118940v3, fTSBaseWebViewUI.f119059J2, fTSBaseWebViewUI.f119060K2, fTSBaseWebViewUI.f118883b3 == 0, fTSBaseWebViewUI.mo68489ba(), this.f119099e.f118938t3);
                }
            }
        }
    }
}
