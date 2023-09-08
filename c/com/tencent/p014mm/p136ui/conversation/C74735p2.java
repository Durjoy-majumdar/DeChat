package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OmitAllFailNormalMsgEvent;
import com.tencent.p014mm.autogen.events.ResendAllFailNormalMsgEvent;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.conversation.p2 */
public class C74735p2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74739q2 f219769d;

    /* renamed from: com.tencent.mm.ui.conversation.p2$a */
    public class C74736a implements DialogInterface.OnClickListener {
        public C74736a(C74735p2 p2Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new ResendAllFailNormalMsgEvent().publish();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p2$b */
    public class C74737b implements DialogInterface.OnClickListener {
        public C74737b(C74735p2 p2Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new OmitAllFailNormalMsgEvent().publish();
        }
    }

    public C74735p2(C74739q2 q2Var) {
        this.f219769d = q2Var;
    }

    public void run() {
        Activity activity = this.f219769d.f219773d;
        C76879j.m92707A(activity, activity.getString(C0966R.string.hbk), "", this.f219769d.f219773d.getString(C0966R.string.hbl), this.f219769d.f219773d.getString(C0966R.string.f7926wf), new C74736a(this), new C74737b(this));
    }
}
