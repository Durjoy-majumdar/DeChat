package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderShareCloseEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.view.ViewAnimHelper;
import di3.C86312j;
import ht1.C60165e4;
import ht1.C60181l;
import ht1.C60186m4;
import ht1.C60188n4;
import ht1.C60200t1;
import ht1.C76243a5;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import p1081gi.C98121d;
import te3.C49712hj1;
import te3.C64350ew2;
import te3.C64378fw2;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgMegaVideo */
public class ChattingItemAppMsgMegaVideo {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgMegaVideo$ShareCloseListener */
    public static class ShareCloseListener extends IListener<FinderShareCloseEvent> {

        /* renamed from: d */
        public WeakReference<View> f24357d;

        /* renamed from: e */
        public long f24358e;

        public ShareCloseListener() {
            super(C40008f.f107254d);
            this.__eventId = -493502581;
        }

        public boolean callback(IEvent iEvent) {
            View view;
            dead();
            ((FinderShareCloseEvent) iEvent).f9247d.getClass();
            if (0 == this.f24358e && (view = this.f24357d.get()) != null) {
                view.animate().cancel();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMegaVideo$ShareCloseListener", "callback", "(Lcom/tencent/mm/autogen/events/FinderShareCloseEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMegaVideo$ShareCloseListener", "callback", "(Lcom/tencent/mm/autogen/events/FinderShareCloseEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.animate().alpha(1.0f).setStartDelay(240).setDuration(400).start();
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m66555a(ChattingItemAppMsgMegaVideo$$b chattingItemAppMsgMegaVideo$$b, List list) {
        C64350ew2 ew22 = (C64350ew2) list.get(0);
        int i = chattingItemAppMsgMegaVideo$$b.f165255k;
        int i2 = (int) ((ew22.f183042g * ((float) i)) / ew22.f183041f);
        double d = (double) i2;
        double d2 = (double) i;
        double d3 = 1.3333333730697632d * d2;
        if (d > d3) {
            i = (int) d3;
        } else if (d >= d2 * 1.0d) {
            i = i2;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) chattingItemAppMsgMegaVideo$$b.f165248d.getLayoutParams();
        layoutParams.height = i;
        chattingItemAppMsgMegaVideo$$b.f165248d.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public static void m66556b(Activity activity, C72963f4 f4Var) {
        C68070l.C68072b u;
        if (!Util.isNullOrNil(f4Var.getContent()) && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
            Intent intent = new Intent(activity, MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            intent.putExtra("Retr_Msg_Type", 26);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMegaVideo", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMegaVideo", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: c */
    public static void m66557c(View view, C67391b bVar, C60181l lVar, Intent intent, boolean z, boolean z2) {
        C60181l lVar2 = lVar;
        Intent intent2 = intent;
        Class cls = C60200t1.class;
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.b6k);
        LinkedList<C64350ew2> linkedList = lVar2.f171715b.f183247j;
        Activity f = bVar.mo91565f();
        boolean z3 = false;
        if (!(imageView == null || linkedList.isEmpty() || linkedList.get(0).f183041f == 0.0f || linkedList.get(0).f183042g == 0.0f)) {
            intent2.putExtra("key_view_info", ViewAnimHelper.m90033b(imageView, f.getWindow().getDecorView()));
            intent2.putExtra("key_image_url", Util.isNullOrNil(linkedList.get(0).f183043h) ? linkedList.get(0).f183043h : linkedList.get(0).f183040e);
            intent2.putExtra("key_image_height_radio", (double) ((C76243a5) C86312j.m106911c(C76243a5.class)).Sl0(linkedList));
            intent2.putExtra("key_image_height", linkedList.get(0).f183042g);
            intent2.putExtra("key_image_width", linkedList.get(0).f183041f);
            if (z) {
                intent2.putExtra("key_nine_patch_id", C0966R.C0969drawable.byv);
            } else {
                intent2.putExtra("key_nine_patch_id", C0966R.C0969drawable.byj);
            }
            if (intent2.getIntExtra("business_type", 0) == 0) {
                z3 = true;
            }
            View view2 = (View) view.getParent();
            if (view2 != null && (view2.getTag() instanceof Long)) {
                Long l = (Long) view2.getTag();
                intent2.putExtra("key_animate_id", l.longValue());
                ShareCloseListener shareCloseListener = new ShareCloseListener();
                shareCloseListener.f24358e = l.longValue();
                shareCloseListener.f24357d = new WeakReference<>(view2);
                shareCloseListener.alive();
            }
        }
        intent2.putExtra("KEY_AUTHORIZATION_CONTENT", C68070l.C68072b.m80420s(((C60186m4) C86312j.m106911c(C60186m4.class)).mo85189yN(lVar2.f171715b), (String) null, (C98121d) null));
        C60188n4 n4Var = (C60188n4) C86312j.m106911c(C60188n4.class);
        int i = 3;
        if (!n4Var.mo75337Fv() || !n4Var.k90()) {
            C67391b bVar2 = bVar;
            C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
            if (!z2) {
                i = 2;
            }
            t1Var.mo76842e7(i, 2, 25, intent2);
            ((C60200t1) C86312j.m106911c(cls)).mo76864nr(bVar.mo91565f(), intent2);
        } else {
            C60200t1 t1Var2 = (C60200t1) C86312j.m106911c(cls);
            if (!z2) {
                i = 2;
            }
            t1Var2.mo76842e7(i, 2, 20, intent2);
            intent2.putExtra("KEY_FINDER_POST_FINISH_JUMP_HOT_TAB", true);
            C49712hj1 dj = ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85166dj(bVar.mo91565f());
            long P = C61926c.m72671P(lVar2.f171715b.f183241d);
            C64378fw2 fw22 = lVar2.f171715b;
            n4Var.mo75340cJ(P, fw22.f183248n, 4, dj, fw22.f183242e, bVar.mo91565f(), new ChattingItemAppMsgMegaVideo$$a(intent2, bVar));
        }
        if (z3) {
            f.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        }
    }
}
