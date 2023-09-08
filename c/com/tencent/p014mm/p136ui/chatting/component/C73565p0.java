package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C73762n1;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C76879j;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.component.p0 */
public class C73565p0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73655y0 f216072d;

    /* renamed from: com.tencent.mm.ui.chatting.component.p0$a */
    public class C73566a implements DialogInterface.OnClickListener {
        public C73566a(C73565p0 p0Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.p0$b */
    public class C73567b implements DialogInterface.OnClickListener {
        public C73567b(C73565p0 p0Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.p0$c */
    public class C73568c implements DialogInterface.OnClickListener {
        public C73568c(C73565p0 p0Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.p0$d */
    public class C73569d implements DialogInterface.OnClickListener {
        public C73569d(C73565p0 p0Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public C73565p0(C73655y0 y0Var) {
        this.f216072d = y0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79368l lVar = (C79368l) this.f216072d.f215752d.f193278b.mo102812a(C79368l.class);
        if (lVar == null || lVar.mo108181M5() == 0) {
            Log.m105928w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        List<C72963f4> n0 = this.f216072d.mo102683n0();
        if (C74343y0.m88779w(n0)) {
            C76879j.m92754y(this.f216072d.f215752d.mo91565f(), this.f216072d.f215752d.mo91565f().getString(C0966R.string.buu), "", this.f216072d.f215752d.mo91565f().getString(C0966R.string.f7263q), new C73566a(this));
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (C74343y0.m88780x(n0)) {
            C76879j.m92754y(this.f216072d.f215752d.mo91565f(), this.f216072d.f215752d.mo91565f().getString(C0966R.string.buv), "", this.f216072d.f215752d.mo91565f().getString(C0966R.string.f7263q), new C73567b(this));
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (C74343y0.m88778v(n0)) {
            C76879j.m92754y(this.f216072d.f215752d.mo91565f(), this.f216072d.f215752d.mo91565f().getString(C0966R.string.lro), "", this.f216072d.f215752d.mo91565f().getString(C0966R.string.f7263q), new C73568c(this));
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (C74343y0.m88781y(n0)) {
            C76879j.m92750u(this.f216072d.f215752d.mo91565f(), this.f216072d.f215752d.mo91565f().getString(C0966R.string.buw), "", new C73569d(this), (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            C73655y0 y0Var = this.f216072d;
            if (C73762n1.m87367a(y0Var.f215752d, n0, y0Var.f216263h)) {
                this.f216072d.mo102686y3();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
