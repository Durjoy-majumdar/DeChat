package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.b */
public class C43959b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f119086d;

    /* renamed from: e */
    public final /* synthetic */ View f119087e;

    /* renamed from: f */
    public final /* synthetic */ BaseSOSWebViewUI f119088f;

    public C43959b(BaseSOSWebViewUI baseSOSWebViewUI, int i, View view) {
        this.f119088f = baseSOSWebViewUI;
        this.f119086d = i;
        this.f119087e = view;
    }

    public void run() {
        int i = this.f119086d;
        int measuredWidth = (i == 0 || i == 4) ? this.f119087e.getMeasuredWidth() : 0;
        int width = (this.f119088f.f118812u3.getVoiceImageButton() == null || this.f119088f.f118812u3.getVoiceImageButton().getVisibility() != 0) ? 0 : this.f119088f.f118812u3.getVoiceImageButton().getWidth() + 0;
        Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "setCancelTextViewCallback, width = %s, commonRightBtnWidth = %s.", Integer.valueOf(this.f119087e.getWidth()), Integer.valueOf(width));
        View view = this.f119088f.f118809r3;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.rightMargin = width + measuredWidth;
            layoutParams.leftMargin = Math.max(this.f119088f.f118817z3.getRight() - ((int) this.f119088f.getResources().getDimension(C0966R.dimen.f3743cv)), (int) this.f119088f.getResources().getDimension(C0966R.dimen.f3736cp));
            layoutParams.width = -1;
            this.f119088f.f118809r3.setLayoutParams(layoutParams);
        }
        View view2 = this.f119088f.f118810s3;
        if (view2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams2.rightMargin = measuredWidth;
            layoutParams2.leftMargin = this.f119088f.f118817z3.getRight() - ((int) this.f119088f.getResources().getDimension(C0966R.dimen.f3743cv));
            layoutParams2.width = -1;
            this.f119088f.f118810s3.setLayoutParams(layoutParams2);
        }
    }
}
