package com.tencent.p014mm.plugin.voip.p475ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import y33.C112390a;

/* renamed from: com.tencent.mm.plugin.voip.ui.b0 */
public final class C106440b0 implements View.OnClickListener {

    /* renamed from: d */
    public C112390a f317965d;

    /* renamed from: e */
    public VoIPFuncIconLayout f317966e;

    /* renamed from: f */
    public VoIPFuncIconLayout f317967f;

    /* renamed from: g */
    public VoIPFuncIconLayout f317968g;

    /* renamed from: h */
    public VoIPFuncIconLayout f317969h;

    /* renamed from: i */
    public VoIPFuncIconLayout f317970i;

    /* renamed from: j */
    public View f317971j;

    public C106440b0(C112390a aVar) {
        C87412m.m108594g(aVar, "statusManager");
        this.f317965d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPMainBtnControl", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null) {
            int id = view.getId();
            C112390a.C112392b bVar = id == C0966R.C0970id.ld5 ? C112390a.C112392b.REJECT_BTN_CLICK : id == C0966R.C0970id.lcp ? C112390a.C112392b.HANGUP_BTN_CLICK : id == C0966R.C0970id.lc9 ? C112390a.C112392b.CANCEL_INVITE_CLICK : id == C0966R.C0970id.lc5 ? C112390a.C112392b.ACCEPT_BTN_CLICK : id == C0966R.C0970id.lc6 ? C112390a.C112392b.SWITCH_TO_VOICE_BTN_CLICK : C112390a.C112392b.UNKOWN;
            Log.m105924i("MicroMg.VoIPMainBtnControl", "click  " + bVar.name() + " invite button");
            C112390a.C112391a.m153348a(this.f317965d, bVar, (Bundle) null, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPMainBtnControl", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
