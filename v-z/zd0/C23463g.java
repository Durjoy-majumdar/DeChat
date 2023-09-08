package zd0;

import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.p017ui.BizSubscribeMsgManagerUI;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import vd0.C22735a;

/* renamed from: zd0.g */
public final class C23463g implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ BizSubscribeMsgManagerUI f67300a;

    public C23463g(BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI) {
        this.f67300a = bizSubscribeMsgManagerUI;
    }

    public final void onStatusChange(boolean z) {
        Object[] objArr = new Object[1];
        MMSwitchBtn mMSwitchBtn = this.f67300a.f49060h;
        objArr[0] = mMSwitchBtn != null ? Boolean.valueOf(mMSwitchBtn.f220433y) : null;
        Log.m105925i("MicroMsg.BizSubscribeMsgManagerUI", "alvinluo SubscribeMsg onSwitchChanged %s", objArr);
        BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI = this.f67300a;
        C22735a aVar = bizSubscribeMsgManagerUI.f49061i;
        if (aVar != null) {
            MMSwitchBtn mMSwitchBtn2 = bizSubscribeMsgManagerUI.f49060h;
            aVar.mo35610b(mMSwitchBtn2 != null ? mMSwitchBtn2.f220433y : false);
        }
        BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI2 = this.f67300a;
        MMSwitchBtn mMSwitchBtn3 = bizSubscribeMsgManagerUI2.f49060h;
        if (mMSwitchBtn3 != null && mMSwitchBtn3.f220433y) {
            bizSubscribeMsgManagerUI2.mo21973H7(true);
            LinearLayout linearLayout = this.f67300a.f49063n;
            if (linearLayout != null) {
                linearLayout.setContentDescription(this.f67300a.getResources().getString(C0966R.string.ao8) + ',' + this.f67300a.getResources().getString(C0966R.string.ao6));
                return;
            }
            C87412m.m108603p("ll");
            throw null;
        }
        bizSubscribeMsgManagerUI2.mo21973H7(false);
        LinearLayout linearLayout2 = this.f67300a.f49063n;
        if (linearLayout2 != null) {
            linearLayout2.setContentDescription(this.f67300a.getResources().getString(C0966R.string.ao8) + ',' + this.f67300a.getResources().getString(C0966R.string.f360188ao3));
            return;
        }
        C87412m.m108603p("ll");
        throw null;
    }
}
