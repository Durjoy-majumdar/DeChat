package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.os.Bundle;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73953d7;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kb0.C33864j;
import uc0.C52515a;
import uc0.C52517f0;
import uj3.C78208e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l8 */
public class C74101l8 extends C73953d7.C73954a {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.l8$a */
    public class C74102a implements View.OnClickListener {
        public C74102a(C74101l8 l8Var) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.ChattingItemWxaSubscribeSysImpl", "hy: textview clicked");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public void mo103021a(C74023i.C74026c cVar, C78208e eVar, C67391b bVar, C72963f4 f4Var, String str) {
        String r = bVar.mo91577r();
        C73953d7.C73955b bVar2 = (C73953d7.C73955b) cVar;
        Bundle bundle = new Bundle();
        bundle.putString("conv_talker_username", r);
        if (bVar.f193286j instanceof AppBrandServiceChattingUI.AppBrandServiceChattingFmUI) {
            bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 10);
        } else if (bVar.mo91583x()) {
            bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        } else {
            bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, C45628s0.m50738C(r) ? 7 : 1);
        }
        bundle.putLong("msg_id", f4Var.getMsgId());
        bundle.putLong("msg_sever_id", f4Var.mo108774y2());
        bundle.putString("send_msg_username", f4Var.mo108768t());
        CharSequence Zq = ((C33864j) C86312j.m106911c(C33864j.class)).mo59334Zq(f4Var.getContent(), bundle, new WeakReference(bVar.mo91565f()), new WeakReference(bVar2.f217055b));
        if (Zq == null || Zq.length() == 0) {
            View view = bVar2.f217056c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = bVar2.f217056c;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar2.f217055b.mo104279b(Zq);
        }
        C52515a jo = C52517f0.vx0().mo73451jo(r);
        int intValue = ((Integer) C97625j3.m125812b().mo105906u().mo119684e(12311, -2)).intValue();
        if ((jo == null || jo.f146672b == -2) && (jo != null || intValue == -2)) {
            bVar2.f217055b.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.FG_2));
            bVar2.f217055b.setBackground(bVar.mo91565f().getResources().getDrawable(C0966R.C0969drawable.f4746lo));
        } else {
            bVar2.f217055b.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f3245kn));
            bVar2.f217055b.setBackground(bVar.mo91565f().getResources().getDrawable(C0966R.C0969drawable.f4747lp));
        }
        bVar2.f217055b.setOnClickListener(new C74102a(this));
        bVar2.f217055b.invalidate();
    }
}
