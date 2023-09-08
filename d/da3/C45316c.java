package da3;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewInputFooter;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: da3.c */
public class C45316c implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ WebViewInputFooter f122770d;

    public C45316c(WebViewInputFooter webViewInputFooter) {
        this.f122770d = webViewInputFooter;
    }

    public void afterTextChanged(Editable editable) {
        if (this.f122770d.f119990o.getText() != null) {
            this.f122770d.f119990o.requestFocus();
            boolean z = editable.length() > 0 && editable.toString().trim().length() > 0;
            WebViewInputFooter webViewInputFooter = this.f122770d;
            Animation loadAnimation = AnimationUtils.loadAnimation(webViewInputFooter.getContext(), C0966R.C0968anim.f2456di);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(webViewInputFooter.getContext(), C0966R.C0968anim.f2461dn);
            loadAnimation.setDuration(150);
            loadAnimation2.setDuration(150);
            View view = webViewInputFooter.f119988j;
            if (view != null && webViewInputFooter.f119989n != null) {
                if (z) {
                    if (view.getVisibility() != 8 && webViewInputFooter.f119988j.getVisibility() != 4) {
                        webViewInputFooter.f119989n.startAnimation(loadAnimation);
                        View view2 = webViewInputFooter.f119989n;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        webViewInputFooter.f119988j.startAnimation(loadAnimation2);
                        View view4 = webViewInputFooter.f119988j;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(8);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        return;
                    }
                } else if (view.getVisibility() != 0 && webViewInputFooter.f119988j.getVisibility() != 0) {
                    webViewInputFooter.f119988j.startAnimation(loadAnimation);
                    View view6 = webViewInputFooter.f119988j;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    webViewInputFooter.f119989n.startAnimation(loadAnimation2);
                    View view8 = webViewInputFooter.f119989n;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(8);
                    View view9 = view8;
                    C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    return;
                }
                webViewInputFooter.f119989n.getParent().requestLayout();
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
