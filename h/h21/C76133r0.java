package h21;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeSettingUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: h21.r0 */
public class C76133r0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ WalletCollectQrCodeSettingUI f223048d;

    public C76133r0(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f223048d = walletCollectQrCodeSettingUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeSettingUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f223048d.handleKeyboardTouchEvent(motionEvent);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeSettingUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
