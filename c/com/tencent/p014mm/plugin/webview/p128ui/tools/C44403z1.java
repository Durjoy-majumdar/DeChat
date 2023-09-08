package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Looper;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import ba3.C39751b;
import ba3.C39752c;
import ba3.C39753d;
import ca3.C39935f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.KeyboardLinearLayout;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewRedesignInputFooter;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.z1 */
public class C44403z1 implements KeyboardLinearLayout.C44683b {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f120347a;

    public C44403z1(WebViewUI webViewUI) {
        this.f120347a = webViewUI;
    }

    /* renamed from: a */
    public void mo67991a(int i) {
        MMEditText mMEditText;
        int i2 = i;
        WebViewUI webViewUI = this.f120347a;
        if (!webViewUI.f118497V0 || !webViewUI.isPaused()) {
            Log.m105924i("MicroMsg.WebViewUI", "onKeyBoardStateChange, state = " + i2);
            WebViewUI webViewUI2 = this.f120347a;
            WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = webViewUI2.f118572w;
            C43522y yVar = webViewUI2.f118513b1;
            boolean z = true;
            if (yVar == null) {
                Log.m105924i("MicroMsg.WebViewUI", "keyboard dispatchKeyboardStateChange controller == null");
            } else if (!yVar.f117596v0.contains(Integer.valueOf(yVar.f117578m0))) {
                Log.m105924i("MicroMsg.WebViewUI", "keyboard dispatchKeyboardStateChange hasCurrentPageFinished");
            } else if (i2 == -3) {
                webViewUI2.f118501W1.post(new C43832a2(webViewUI2, webViewKeyboardLinearLayout.getKeyBoardHeight(), webViewUI2.f118460F.getInputContainerHeight()));
            } else if (!webViewUI2.isPaused()) {
                ChatFooterPanel chatFooterPanel = webViewUI2.f118460F.f120002h;
                if (!(chatFooterPanel == null || chatFooterPanel.getVisibility() == 8)) {
                    webViewUI2.f118501W1.post(new C43835b2(webViewUI2, webViewUI2.f118460F.getSmilePanelHeight(), webViewUI2.f118460F.getInputContainerHeight()));
                } else {
                    Log.m105924i("MicroMsg.WebViewUI", "keyboard hide dispatchKeyboardStateChange");
                    WebViewRedesignInputFooter webViewRedesignInputFooter = webViewUI2.f118460F;
                    webViewRedesignInputFooter.getClass();
                    Log.m105924i("MicroMsg.WebViewInputFooter", "hideInputFooterOnly");
                    View view = webViewRedesignInputFooter.f120000f;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideInputFooterOnly", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideInputFooterOnly", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    webViewRedesignInputFooter.setVisibility(8);
                    String obj = (webViewRedesignInputFooter.f120013v == null || (mMEditText = webViewRedesignInputFooter.f120006o) == null) ? "" : mMEditText.getText().toString();
                    webViewRedesignInputFooter.f120001g = 0;
                    webViewRedesignInputFooter.mo68995c(true);
                    webViewRedesignInputFooter.mo68997e();
                    WebViewRedesignInputFooter.C44292h hVar = webViewRedesignInputFooter.f119998d;
                    if (hVar != null) {
                        ((WebViewUI$$g) hVar).mo68333a(obj);
                    }
                }
            }
            if (i2 == -3) {
                this.f120347a.f118459E1.mo68013k().f118101t = 1;
                int keyBoardHeight = this.f120347a.f118572w.getKeyBoardHeight();
                if (keyBoardHeight > 0) {
                    WebViewUI.m47806H7(this.f120347a, keyBoardHeight);
                    this.f120347a.f118460F.mo68998f(keyBoardHeight, true);
                }
                WebViewUI webViewUI3 = this.f120347a;
                C39935f fVar = webViewUI3.f118503X0;
                fVar.getClass();
                C39753d dVar = fVar.f107072g;
                if (dVar != null) {
                    if (dVar.f106652b != null) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C39751b(dVar, webViewUI3));
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            } else {
                Log.m105924i("MicroMsg.WebViewUI", "keyboard kbListener onKeyBoardStateChange");
                WebViewUI.m47806H7(this.f120347a, 0);
                WebViewUI webViewUI4 = this.f120347a;
                C39753d dVar2 = webViewUI4.f118503X0.f107072g;
                if (dVar2 != null) {
                    if ((dVar2.f106652b != null) && dVar2.f106661k) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C39752c(dVar2, webViewUI4));
                    }
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
            }
            WebViewUI webViewUI5 = this.f120347a;
            WebViewKeyboardLinearLayout webViewKeyboardLinearLayout2 = webViewUI5.f118572w;
            if (i2 == -3 && webViewUI5.f118551p0 != null) {
                if ((webViewUI5.f118491T0.mo70859b().f121046d & 1) <= 0) {
                    z = false;
                }
                Log.m105918d("MicroMsg.GeneralControlWrapper", "needShowInputAlertTips, ret = " + z);
                if (z && webViewUI5.f118551p0.getVisibility() != 0 && !webViewUI5.f118464H.isShown()) {
                    if (webViewUI5.f118576x0 == null) {
                        webViewUI5.f118576x0 = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C43846c2(webViewUI5), false);
                    }
                    webViewUI5.f118576x0.startTimer(4000);
                    View view3 = webViewUI5.f118551p0;
                    ((ImageView) view3.findViewById(C0966R.C0970id.fpe)).setImageResource(C0966R.raw.net_warn_icon);
                    TextView textView = (TextView) view3.findViewById(C0966R.C0970id.fpf);
                    textView.setTextSize(14.0f);
                    textView.setText(C0966R.string.llh);
                    ((ImageButton) view3.findViewById(C0966R.C0970id.fpd)).setOnClickListener(new C43849d2(webViewUI5));
                    View view4 = webViewUI5.f118551p0;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "onKeyBoardStateChange", "(Lcom/tencent/mm/plugin/webview/ui/tools/WebViewKeyboardLinearLayout;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "onKeyBoardStateChange", "(Lcom/tencent/mm/plugin/webview/ui/tools/WebViewKeyboardLinearLayout;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C115669n.INSTANCE.kvStat(13125, webViewUI5.mo6901n0());
                }
            }
            this.f120347a.f118585z2 = i2;
            return;
        }
        Log.m105928w("MicroMsg.WebViewUI", "onKeyBoardStateChange, is isPaused, state = " + i2);
    }
}
