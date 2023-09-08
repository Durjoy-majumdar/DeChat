package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.view.View;
import com.tencent.p014mm.C0966R;
import u73.C22613h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSWebViewUI */
public class FTSWebViewUI extends FTSBaseWebViewUI {
    /* renamed from: V8 */
    public void mo68262V8() {
        if (this.f118940v3 == 21) {
            C22613h1.m26480f(19);
        }
        super.mo68262V8();
    }

    /* renamed from: a9 */
    public void mo63385a9() {
        super.mo63385a9();
        C22613h1.m26475a(this.f118940v3, 1, this.f119059J2);
        if (this.f118940v3 == 21) {
            C22613h1.m26480f(17);
        }
    }

    /* renamed from: aa */
    public String mo63386aa() {
        return getString(C0966R.string.a2p);
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.f118940v3 == 21) {
            C22613h1.m26480f(19);
        }
    }

    public void onClickCancelBtn(View view) {
        super.onClickCancelBtn(view);
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        C22613h1.m26489o();
        C22613h1.m26483i();
        if (this.f118940v3 == 21) {
            C22613h1.m26480f(18);
        }
    }

    public void onPause() {
        super.onPause();
        C22613h1.m26488n();
    }

    public void onResume() {
        super.onResume();
        C22613h1.m26487m();
    }
}
