package com.tencent.p014mm.p136ui.chatting.component.biz;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import ob0.C47350c;
import ob0.C89132b;
import qo3.C89779i0;
import te3.fo4;
import te3.go4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.component.biz.i */
public class C44810i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LauncherUI f121608d;

    /* renamed from: e */
    public final /* synthetic */ List f121609e;

    /* renamed from: f */
    public final /* synthetic */ C73446n f121610f;

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.i$a */
    public class C44811a implements C87581a<Void, C89132b.C89134c<go4>> {

        /* renamed from: a */
        public final /* synthetic */ C89779i0 f121611a;

        public C44811a(C89779i0 i0Var) {
            this.f121611a = i0Var;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.ChattingUI.BizComponent", "request usebizmuteflag from server errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            if (i == 0 || i2 == 0) {
                ((C119157j) C119157j.f356862d).mo183885p(new C73441g(this), "process_biz_mute_contact");
                return null;
            }
            C75592q0.m90770R(false);
            ((C119157j) C119157j.f356862d).mo183895z(new C73443h(this));
            return null;
        }
    }

    public C44810i(BizComponent bizComponent, LauncherUI launcherUI, List list, C73446n nVar) {
        this.f121608d = launcherUI;
        this.f121609e = list;
        this.f121610f = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/biz/BizComponent$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C89779i0 e = C89779i0.m112248e(view.getContext(), view.getContext().getString(C0966R.string.m2r), false, 0, (DialogInterface.OnCancelListener) null);
        e.show();
        fo4 fo4 = new fo4();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 7386;
        bVar.f127068c = "/cgi-bin/micromsg-bin/usebizmuteflag";
        bVar.f127066a = fo4;
        bVar.f127067b = new go4();
        C47350c a = bVar.mo72403a();
        C89132b bVar2 = new C89132b();
        bVar2.mo123453j(a);
        bVar2.f256791h = true;
        bVar2.mo9225i().mo11397F(this.f121608d).mo123062e(new C44811a(e));
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/biz/BizComponent$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
