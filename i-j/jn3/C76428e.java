package jn3;

import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import di3.C86312j;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import l31.C61212e;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;

/* renamed from: jn3.e */
public final class C76428e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatTipsBarGroup f223753d;

    /* renamed from: e */
    public final /* synthetic */ C39969i f223754e;

    public C76428e(ChatTipsBarGroup chatTipsBarGroup, C39969i iVar) {
        this.f223753d = chatTipsBarGroup;
        this.f223754e = iVar;
    }

    public final void run() {
        ChatTipsBarGroup chatTipsBarGroup = this.f223753d;
        C39969i iVar = this.f223754e;
        C87412m.m108593f(iVar, "talkerInfo");
        int i = ChatTipsBarGroup.f219952v;
        chatTipsBarGroup.getClass();
        Class cls = C61212e.class;
        ((C61212e) C86312j.m106911c(cls)).o30(chatTipsBarGroup, "group_msg_set_top_list");
        WeakReference<C67391b> weakReference = chatTipsBarGroup.f219964r;
        if (!(weakReference == null || weakReference.get() == null)) {
            ((C61212e) C86312j.m106911c(cls)).mo86149PM(chatTipsBarGroup, C90364q0.m113149h(C90363p0.m113143b(new C13604l("group_bar_list_length", Integer.valueOf(chatTipsBarGroup.f219963q.size()))), C46564f.m51893a(iVar)));
        }
        ChatTipsBarGroup chatTipsBarGroup2 = this.f223753d;
        if (chatTipsBarGroup2.f219962p.f219973a == ChatTipsBarGroup.C74824c.MODE_FOLD) {
            chatTipsBarGroup2.setListViewPaddingTop(chatTipsBarGroup2.f219953d.getHeight());
        }
    }
}
