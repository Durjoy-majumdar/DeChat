package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupLiveShareCardStruct;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import fn3.C75778d;
import gy3.C87412m;
import h81.C32735h;
import i21.C98591h;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import nj3.C76874e0;
import p182kk.C61104a;
import p185kq.C10383h;
import p629ny.C76979h;
import p744wt.C66190c;
import t91.C64208c;
import w40.C65927a;
import y50.C66541q0;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.h3 */
public class C57758h3 extends C74023i {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h3$a */
    public class C57759a implements C65927a {

        /* renamed from: a */
        public final /* synthetic */ long f165313a;

        /* renamed from: b */
        public final /* synthetic */ C74023i.C74026c f165314b;

        /* renamed from: c */
        public final /* synthetic */ C67391b f165315c;

        /* renamed from: d */
        public final /* synthetic */ String f165316d;

        public C57759a(C57758h3 h3Var, long j, C74023i.C74026c cVar, C67391b bVar, String str) {
            this.f165313a = j;
            this.f165314b = cVar;
            this.f165315c = bVar;
            this.f165316d = str;
        }

        /* renamed from: a */
        public void mo82214a(long j, int i) {
            C32735h.C32737c cVar = C32735h.C32737c.clicfg_chat_room_live_card_flashing;
            Class cls = C32735h.class;
            if (this.f165313a != j) {
                return;
            }
            if (i == 1) {
                ((C57771j3) this.f165314b).f165336c.setText(this.f165315c.mo91565f().getResources().getString(C0966R.string.i5w));
                View view = ((C57771j3) this.f165314b).f165337d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = ((C57771j3) this.f165314b).f165338e;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C75778d dVar = C75778d.f222377a;
            String str = this.f165316d;
            C87412m.m108594g(str, "chatName");
            HashSet<Long> hashSet = C75778d.f222378b;
            if (!hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(j));
                GroupLiveShareCardStruct groupLiveShareCardStruct = new GroupLiveShareCardStruct();
                groupLiveShareCardStruct.f156276d = groupLiveShareCardStruct.mo86045b("ChatName", str, true);
                long j2 = 1;
                groupLiveShareCardStruct.f156278f = 1;
                groupLiveShareCardStruct.f156279g = System.currentTimeMillis();
                groupLiveShareCardStruct.f156280h = groupLiveShareCardStruct.mo86045b("LiveIDList", String.valueOf(j), true);
                boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, false);
                Log.m105924i("MicroMsg.LiveExptConfig", "ChatRoomCardFlashingSwitch: " + wf);
                if (!wf) {
                    j2 = 2;
                }
                groupLiveShareCardStruct.f156277e = j2;
                groupLiveShareCardStruct.mo86054n();
            }
            ((C57771j3) this.f165314b).f165336c.setText(this.f165315c.mo91565f().getResources().getString(C0966R.string.i5y));
            boolean wf4 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, false);
            Log.m105924i("MicroMsg.LiveExptConfig", "ChatRoomCardFlashingSwitch: " + wf4);
            if (wf4) {
                View view5 = ((C57771j3) this.f165314b).f165337d;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = ((C57771j3) this.f165314b).f165338e;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view9 = ((C57771j3) this.f165314b).f165337d;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view11 = ((C57771j3) this.f165314b).f165338e;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h3$b */
    public class C57760b implements C65927a {

        /* renamed from: a */
        public final /* synthetic */ C67391b f165317a;

        public C57760b(C67391b bVar) {
            this.f165317a = bVar;
        }

        /* renamed from: a */
        public void mo82214a(long j, int i) {
            if (j == j && i == 0) {
                C75778d dVar = C75778d.f222377a;
                String r = this.f165317a.mo91577r();
                C87412m.m108594g(r, "chatName");
                GroupLiveShareCardStruct groupLiveShareCardStruct = new GroupLiveShareCardStruct();
                groupLiveShareCardStruct.f156276d = groupLiveShareCardStruct.mo86045b("ChatName", r, true);
                long j2 = 2;
                groupLiveShareCardStruct.f156278f = 2;
                groupLiveShareCardStruct.f156279g = System.currentTimeMillis();
                groupLiveShareCardStruct.f156280h = groupLiveShareCardStruct.mo86045b("LiveIDList", String.valueOf(j), true);
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_chat_room_live_card_flashing, false);
                Log.m105924i("MicroMsg.LiveExptConfig", "ChatRoomCardFlashingSwitch: " + wf);
                if (wf) {
                    j2 = 1;
                }
                groupLiveShareCardStruct.f156277e = j2;
                groupLiveShareCardStruct.mo86054n();
            }
        }
    }

    /* renamed from: o0 */
    public static boolean m66624o0(View view, C67391b bVar, C72963f4 f4Var, String str) {
        Class cls = C66190c.class;
        ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null && u.f195582i == 60) {
            if (!WeChatBrands.Business.Entries.SessionGroupLive.checkAvailable(view.getContext())) {
                return true;
            }
            try {
                if (((C66190c) C86312j.m106911c(cls)).mo89931F() || ((C66190c) C86312j.m106911c(cls)).mo89933L5() || (!C61104a.m71651g(bVar.mo91565f()) && !C61104a.m71669y(bVar.mo91565f()) && !C61104a.m71665u(bVar.mo91565f()) && !C61104a.m71649e(bVar.mo91565f()))) {
                    C66541q0 q0Var = (C66541q0) u.mo93555w(C66541q0.class);
                    long parseLong = Long.parseLong(q0Var.f191394b);
                    String str2 = q0Var.f191395c;
                    String str3 = q0Var.f191396d;
                    LiveConfig.C55204b bVar2 = new LiveConfig.C55204b();
                    bVar2.f157091a = 1;
                    bVar2.f157095e = str3;
                    bVar2.f157092b = bVar.mo91577r();
                    bVar2.f157093c = parseLong;
                    bVar2.f157094d = str2;
                    bVar2.f157098h = 2;
                    bVar2.f157096f = str;
                    LiveConfig a = bVar2.mo76374a();
                    if (str == null) {
                        str = bVar.mo91574o().getUsername();
                    }
                    C64208c.f181958h = str;
                    C64208c.f181959i = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ((long) ((int) bVar.mo91574o().f108320R1));
                    ((C66190c) C86312j.m106911c(cls)).mo89934OG().mo90322b(bVar.mo91565f(), a);
                    Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorClickSysMsgEnterLive");
                    C115669n.INSTANCE.mo175913w(1381, 0, 1);
                    ((C66190c) C86312j.m106911c(cls)).mo89932JA(parseLong, bVar.mo91577r(), new C57760b(bVar));
                }
                return true;
            } catch (Exception e) {
                Log.m105929w("MicroMsg.ChattingItemAppMsgShareLiveFrom", "jump to live fail: %s", e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: C */
    public boolean mo82212C() {
        return false;
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6913s2);
        n4Var.setTag(new C57771j3(n4Var, Boolean.TRUE));
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: S */
    public boolean mo82213S() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        ((C74243t8) view.getTag()).mo103252b();
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return m66624o0(view, bVar, f4Var, mo103068y(bVar, f4Var));
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C68070l.C68072b bVar2;
        C74023i.C74026c cVar2 = cVar;
        C67391b bVar3 = bVar;
        if (cVar2 instanceof C57771j3) {
            String content = f4Var.getContent();
            if (content != null) {
                bVar2 = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
            } else {
                Log.m105921e("MicroMsg.ChattingItemAppMsgShareLiveFrom", "amessage, msgid:%s, user:%s", Long.valueOf(f4Var.getMsgId()), str);
                bVar2 = null;
            }
            if (bVar2 != null) {
                ((C57771j3) cVar2).f165335b.mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), bVar2.mo93550m()));
                long parseLong = Long.parseLong(((C66541q0) bVar2.mo93555w(C66541q0.class)).f191394b);
                String r = bVar.mo91577r();
                C57759a aVar = r0;
                C57759a aVar2 = new C57759a(this, parseLong, cVar, bVar, r);
                ((C66190c) C86312j.m106911c(C66190c.class)).mo89932JA(parseLong, r, aVar);
            }
            cVar2.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), cVar2, (String) null));
            cVar2.clickArea.setOnClickListener(mo103099u(bVar3));
            cVar2.clickArea.setOnTouchListener(((C79368l) bVar3.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            cVar2.clickArea.setOnLongClickListener(mo103098p(bVar3));
        }
        Log.m105924i("MicroMsg.ChattingItemAppMsgShareLiveFrom", "filling");
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 855638065;
    }
}
