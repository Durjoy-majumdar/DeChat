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
import d62.C7241k;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import uc0.C52515a;
import uc0.C52517f0;
import uj3.C78208e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.f7 */
public class C73987f7 extends C73953d7.C73954a {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.f7$a */
    public class C73988a implements View.OnClickListener {
        public C73988a(C73987f7 f7Var) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemSysMsgTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.ChattingItemNewXmlSysImpl", "hy: textview clicked");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSysMsgTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
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
        bundle.putString("local_session", bVar.f193291o);
        CharSequence TV = ((C7241k) C86312j.m106911c(C7241k.class)).mo8408TV(f4Var.getMsgId(), f4Var.getContent(), bundle, new WeakReference(bVar.mo91565f()), new WeakReference(bVar2.f217055b));
        if (TV == null || TV.length() == 0) {
            View view = bVar2.f217056c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemSysMsgTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSysMsgTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = bVar2.f217056c;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemSysMsgTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSysMsgTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar2.f217055b.mo104279b(TV);
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
        bVar2.f217055b.setOnClickListener(new C73988a(this));
        bVar2.f217055b.invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo103022b(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r11, uj3.C78208e r12, ck3.C67391b r13, com.tencent.p014mm.storage.C72963f4 r14, java.lang.String r15) {
        /*
            r10 = this;
            com.tencent.mm.ui.chatting.viewitems.d7$b r11 = (com.tencent.p014mm.p136ui.chatting.viewitems.C73953d7.C73955b) r11
            android.view.View r12 = r11.f217057d
            r15 = 1
            r0 = 0
            if (r12 == 0) goto L_0x0053
            int r12 = r14.f230723F
            r1 = 262144(0x40000, float:3.67342E-40)
            r12 = r12 & r1
            if (r12 == 0) goto L_0x0011
            r12 = 1
            goto L_0x0012
        L_0x0011:
            r12 = 0
        L_0x0012:
            r1 = 2131835564(0x7f113aac, float:1.930427E38)
            if (r12 == 0) goto L_0x0030
            java.lang.String r12 = r14.mo101008o3()
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            android.app.Activity r13 = r13.mo91565f()
            android.content.res.Resources r13 = r13.getResources()
            java.lang.Object[] r14 = new java.lang.Object[r15]
            r14[r0] = r12
            java.lang.String r12 = r13.getString(r1, r14)
            goto L_0x0055
        L_0x0030:
            java.lang.String r12 = r14.mo108764r2()
            boolean r12 = qm2.C77369b.m93266f(r12)
            if (r12 == 0) goto L_0x0053
            java.lang.String r12 = r14.mo101008o3()
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            android.app.Activity r13 = r13.mo91565f()
            android.content.res.Resources r13 = r13.getResources()
            java.lang.Object[] r14 = new java.lang.Object[r15]
            r14[r0] = r12
            java.lang.String r12 = r13.getString(r1, r14)
            goto L_0x0056
        L_0x0053:
            java.lang.String r12 = ""
        L_0x0055:
            r15 = 0
        L_0x0056:
            android.view.View r13 = r11.f217057d
            r14 = 8
            if (r13 == 0) goto L_0x00eb
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x00ab
            android.view.View r13 = r11.f217057d
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r9.mo10233c(r1)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemSysMsgTemplate"
            java.lang.String r4 = "fillingExtraParts"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r13
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r9.mo10231a(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r13.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemSysMsgTemplate"
            java.lang.String r3 = "fillingExtraParts"
            java.lang.String r4 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r13
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            android.widget.TextView r13 = r11.f217058e
            if (r13 == 0) goto L_0x00eb
            r13.setText(r12)
            goto L_0x00eb
        L_0x00ab:
            android.view.View r12 = r11.f217057d
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r13.mo10233c(r1)
            java.lang.Object[] r2 = r13.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemSysMsgTemplate"
            java.lang.String r4 = "fillingExtraParts"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r12
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r13 = r13.mo10231a(r0)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12.setVisibility(r13)
            java.lang.String r2 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemSysMsgTemplate"
            java.lang.String r3 = "fillingExtraParts"
            java.lang.String r4 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x00eb:
            android.widget.ProgressBar r11 = r11.uploadingPB
            if (r11 == 0) goto L_0x00f8
            if (r15 == 0) goto L_0x00f5
            r11.setVisibility(r0)
            goto L_0x00f8
        L_0x00f5:
            r11.setVisibility(r14)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C73987f7.mo103022b(com.tencent.mm.ui.chatting.viewitems.i$c, uj3.e, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
    }
}
