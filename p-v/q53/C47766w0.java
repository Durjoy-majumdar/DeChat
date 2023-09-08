package q53;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q53.w0 */
public final class C47766w0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinEncashView f128285d;

    public C47766w0(WeCoinEncashView weCoinEncashView) {
        this.f128285d = weCoinEncashView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$initKeyBoardView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f128285d.handleKeyboardTouchEvent(motionEvent);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$initKeyBoardView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
