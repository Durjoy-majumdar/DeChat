package wf1;

import a11.C39479c;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.Intent;
import android.view.View;
import bl3.C54492n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C8477a0;
import j20.C117292a;
import java.util.ArrayList;
import p740wo.C53193b;
import qo3.C101218e0;

/* renamed from: wf1.c */
public final class C15169c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f41309d;

    /* renamed from: e */
    public final /* synthetic */ C15162a f41310e;

    /* renamed from: f */
    public final /* synthetic */ Intent f41311f;

    /* renamed from: g */
    public final /* synthetic */ C101218e0 f41312g;

    public C15169c(C8477a0 a0Var, C15162a aVar, Intent intent, C101218e0 e0Var) {
        this.f41309d = a0Var;
        this.f41310e = aVar;
        this.f41311f = intent;
        this.f41312g = e0Var;
    }

    public final void onClick(View view) {
        Class cls = C54108o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = 1;
        this.f41309d.f27482d = true;
        C15191k.f41360a.mo14127b("room_live_start", "153");
        C54067f0.C0063l0 l0Var = C54067f0.C0063l0.CHAT_ROOM_LIVE;
        ((C54108o) C86312j.m106911c(cls)).getClass();
        C54067f0 f0Var = C54108o.f151869h;
        f0Var.getClass();
        f0Var.f151460h0 = l0Var;
        String str = this.f41310e.f41298d;
        if (!(str == null || str.length() == 0)) {
            int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str);
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
            String s = C75592q0.m90789s();
            if (Lo != null) {
                boolean x2 = Lo.mo69796x2(s);
                boolean u2 = Lo.mo69793u2(s);
                if (!x2) {
                    if (u2) {
                        i = 2;
                    }
                }
                ((C54108o) C86312j.m106911c(cls)).getClass();
                f0Var.mo74751a("roomid", str);
                f0Var.mo74751a("roomrole", String.valueOf(i));
                f0Var.mo74751a("roomcount", String.valueOf(p1));
            }
            i = 3;
            ((C54108o) C86312j.m106911c(cls)).getClass();
            f0Var.mo74751a("roomid", str);
            f0Var.mo74751a("roomrole", String.valueOf(i));
            f0Var.mo74751a("roomcount", String.valueOf(p1));
        }
        this.f41311f.putExtra("KEY_PARAMS_SOURCE_TYPE", l0Var);
        Log.m105924i(C54492n.TAG, "goLive fromChatRoomId:" + this.f41310e.f41298d);
        this.f41311f.putExtra("KEY_PARAMS_FROM_CHATROOM_ID", this.f41310e.f41298d);
        this.f41312g.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
