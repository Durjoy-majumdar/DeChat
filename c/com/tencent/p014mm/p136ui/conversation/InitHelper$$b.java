package com.tencent.p014mm.p136ui.conversation;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.conversation.InitHelper$$b */
public class InitHelper$$b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ InitHelper f219457d;

    /* renamed from: com.tencent.mm.ui.conversation.InitHelper$$b$a */
    public class C74649a implements Runnable {
        public C74649a(InitHelper$$b initHelper$$b) {
        }

        public void run() {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            i.mo119676J(89, 2);
            i.mo119681a(true);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.InitHelper$$b$b */
    public class C74650b implements DialogInterface.OnClickListener {
        public C74650b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            InitHelper$$b.this.f219457d.mo103805b();
        }
    }

    public InitHelper$$b(InitHelper initHelper) {
        this.f219457d = initHelper;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C86709a0.m107525e().postToWorker(new C74649a(this));
        this.f219457d.f219440e.dismiss();
        C76879j.m92744o(this.f219457d.f219447o, C0966R.string.bwz, C0966R.string.a3h, false, new C74650b());
    }
}
