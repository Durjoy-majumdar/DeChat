package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72963f4;
import java.lang.ref.WeakReference;
import wd3.C22906q;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.h4 */
public class C19772h4 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f56234a;

    /* renamed from: b */
    public final /* synthetic */ C72963f4 f56235b;

    public C19772h4(C19762b4 b4Var, WeakReference weakReference, C72963f4 f4Var) {
        this.f56234a = weakReference;
        this.f56235b = f4Var;
    }

    public void onFinish() {
        C19783t3 t3Var = (C19783t3) this.f56234a.get();
        if (t3Var != null) {
            t3Var.f56267i.f56259c.setVisibility(0);
            if ((this.f56235b.getMsgId() + "_" + 0 + "_msg").equals(t3Var.playingMsgId)) {
                t3Var.f56267i.f56291f.setImageResource(C0966R.C0969drawable.f4770mf);
            } else {
                t3Var.f56267i.f56291f.setImageResource(C0966R.C0969drawable.f4771mg);
            }
        }
    }

    public void onStart() {
    }
}
