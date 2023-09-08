package h21;

import android.view.View;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import te3.C49139df2;

/* renamed from: h21.h1 */
public class C117027h1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C49139df2 f350685d;

    /* renamed from: e */
    public final /* synthetic */ WalletCollectQrCodeUI f350686e;

    public C117027h1(WalletCollectQrCodeUI walletCollectQrCodeUI, C49139df2 df22) {
        this.f350686e = walletCollectQrCodeUI;
        this.f350685d = df22;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WalletCollectQrCodeUI.m162109N7(this.f350686e, this.f350685d.f132290g);
        C12925w wVar = this.f350686e.f345679J;
        if (wVar != null && wVar.mo12466f()) {
            this.f350686e.f345679J.mo5085n();
            this.f350686e.f345679J = null;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
