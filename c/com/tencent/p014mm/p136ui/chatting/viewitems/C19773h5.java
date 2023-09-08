package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.h5 */
public class C19773h5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChattingItemDyeingTemplate f56236d;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h5$a */
    public class C19774a implements DialogInterface.OnCancelListener {
        public C19774a(C19773h5 h5Var) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    public C19773h5(ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f56236d = chattingItemDyeingTemplate;
    }

    public void run() {
        ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f56236d;
        if (chattingItemDyeingTemplate.f216865Z == null) {
            chattingItemDyeingTemplate.f216865Z = C76879j.m92722P(chattingItemDyeingTemplate.f216867v.mo91565f(), this.f56236d.f216867v.mo91565f().getString(C0966R.string.a3h), 3, this.f56236d.f216867v.mo91565f().getString(C0966R.string.hd_), true, false, new C19774a(this));
        }
        this.f56236d.f216865Z.show();
    }
}
