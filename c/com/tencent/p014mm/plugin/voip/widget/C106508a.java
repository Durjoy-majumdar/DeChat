package com.tencent.p014mm.plugin.voip.widget;

import com.tencent.p014mm.plugin.voip.p475ui.C106448g;
import com.tencent.p014mm.plugin.voip.widget.NewVideoTalkingSmallView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.voip.widget.a */
public class C106508a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewVideoTalkingSmallView.C1065062 f318207d;

    public C106508a(NewVideoTalkingSmallView.C1065062 r1) {
        this.f318207d = r1;
    }

    public void run() {
        WeakReference<C106448g> weakReference = NewVideoTalkingSmallView.this.f318161f;
        if (weakReference != null && weakReference.get() != null) {
            Log.m105925i("MicroMsg.Voip.NewVideoTalkingSmallView", "summerkick LogoutEvent ret[%b, %b, %b]", Boolean.valueOf(NewVideoTalkingSmallView.this.f318161f.get().mo152482o()), Boolean.valueOf(NewVideoTalkingSmallView.this.f318161f.get().mo152430J()), Boolean.valueOf(NewVideoTalkingSmallView.this.f318161f.get().mo152484p()));
        }
    }
}
