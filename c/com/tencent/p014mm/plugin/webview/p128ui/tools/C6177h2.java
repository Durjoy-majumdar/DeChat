package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.h2 */
public class C6177h2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f22647d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.h2$a */
    public class C6178a implements Animation.AnimationListener {
        public C6178a() {
        }

        public void onAnimationEnd(Animation animation) {
            View view = C6177h2.this.f22647d.f118569v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$47$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$47$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public C6177h2(WebViewUI webViewUI) {
        this.f22647d = webViewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$47", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f22647d, C0966R.C0968anim.f2412cf);
        loadAnimation.setAnimationListener(new C6178a());
        this.f22647d.f118569v.startAnimation(loadAnimation);
        View view2 = this.f22647d.f118569v;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$47", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$47", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$47", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
