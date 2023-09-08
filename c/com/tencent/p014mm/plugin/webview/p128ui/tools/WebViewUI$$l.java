package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$l */
public class WebViewUI$$l implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118645d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$l$a */
    public class C6151a implements Animation.AnimationListener {
        public C6151a() {
        }

        public void onAnimationEnd(Animation animation) {
            View view = WebViewUI$$l.this.f118645d.f118569v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$26$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$26$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public WebViewUI$$l(WebViewUI webViewUI) {
        this.f118645d = webViewUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$26", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        WebViewUI webViewUI = this.f118645d;
        C43522y yVar = webViewUI.f118513b1;
        if (yVar != null) {
            yVar.f117700n1.f117767a = true;
        }
        View view2 = webViewUI.f118569v;
        if (view2 != null && view2.getVisibility() == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f118645d, C0966R.C0968anim.f2412cf);
            loadAnimation.setAnimationListener(new C6151a());
            this.f118645d.f118569v.startAnimation(loadAnimation);
            View view3 = this.f118645d.f118569v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$26", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$26", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            if (!view.hasFocus()) {
                view.requestFocus();
            }
            if (motionEvent.getAction() == 0) {
                this.f118645d.f118451B1 = (int) motionEvent.getX();
                this.f118645d.f118454C1 = (int) motionEvent.getY();
                WebViewUI webViewUI2 = this.f118645d;
                C43522y yVar2 = webViewUI2.f118513b1;
                if (yVar2 != null) {
                    int i = webViewUI2.f118451B1;
                    int i2 = webViewUI2.f118454C1;
                    C43522y.C43556y yVar3 = yVar2.f117700n1;
                    Point point = yVar3.f117769c;
                    if (point == null) {
                        yVar3.f117769c = new Point(i, i2);
                    } else {
                        point.x = i;
                        point.y = i2;
                    }
                    yVar2.f117700n1.f117770d = System.currentTimeMillis();
                }
            }
        }
        if (this.f118645d.f118523f == null) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$26", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 5 || motionEvent.getAction() == 5 || motionEvent.getAction() == 261 || motionEvent.getAction() == 517) {
            if (motionEvent.getPointerCount() > 1) {
                this.f118645d.f118523f.getSettings().setBuiltInZoomControls(true);
                this.f118645d.f118523f.getSettings().setSupportZoom(true);
            } else {
                this.f118645d.f118523f.getSettings().setBuiltInZoomControls(false);
                this.f118645d.f118523f.getSettings().setSupportZoom(false);
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$26", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
