package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.MovingImageButton;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import nj3.C88989a;
import we0.C53156a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.TransparentWebViewUI */
public class TransparentWebViewUI extends GameWebViewUI {
    /* renamed from: S7 */
    public boolean mo63702S7() {
        return false;
    }

    public void initView() {
        MovingImageButton movingImageButton;
        super.initView();
        C44125o1 o1Var = this.f118531h2;
        o1Var.getClass();
        boolean isMainland = WeChatBrands.AppInfo.current().isMainland();
        boolean z = true;
        o1Var.f119541q = true;
        C44125o1 o1Var2 = this.f118531h2;
        o1Var2.f119529e = false;
        o1Var2.mo68760e(true);
        this.f118531h2.mo68762g(0);
        if (getIntent() == null || !getIntent().hasExtra("show_full_screen") || !getIntent().getBooleanExtra("show_full_screen", false)) {
            z = false;
        }
        if (z && (movingImageButton = this.f118583z) != null) {
            movingImageButton.setCanMove(false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = this.f118447A;
        if (i == 1001) {
            this.f118447A = 0;
            C53156a aVar = this.f118456D;
            if (aVar != null) {
                aVar.enable();
            }
        } else if (i == 1002) {
            this.f118447A = 1;
            C53156a aVar2 = this.f118456D;
            if (aVar2 != null) {
                aVar2.enable();
            }
        }
    }

    /* renamed from: z8 */
    public void mo68187z8() {
        setBackGroundColorResource(0);
        getContentView().setBackgroundResource(0);
        this.f118523f.setBackgroundResource(17170445);
        this.f118523f.setBackgroundColor(0);
        findViewById(C0966R.C0970id.lmr).setBackgroundResource(17170445);
        findViewById(C0966R.C0970id.iwf).setBackgroundResource(17170445);
    }
}
