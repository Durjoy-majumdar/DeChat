package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import bl3.C39818r;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import ht1.C60165e4;
import ht1.C60181l;
import ht1.C60188n4;
import ht1.C60200t1;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76874e0;
import o40.C61926c;
import p151er.C75651n;
import p629ny.C76979h;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import te3.C49712hj1;
import te3.C64350ew2;
import te3.C64378fw2;
import up1.C27696y;
import zj3.C79368l;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgMegaVideo$$d */
public class ChattingItemAppMsgMegaVideo$$d extends C74023i implements C73774p2 {

    /* renamed from: v */
    public C67391b f165261v;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgMegaVideo$$d$a */
    public class C57737a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C67391b f165262a;

        /* renamed from: b */
        public final /* synthetic */ C60181l f165263b;

        public C57737a(ChattingItemAppMsgMegaVideo$$d chattingItemAppMsgMegaVideo$$d, C67391b bVar, C60181l lVar) {
            this.f165262a = bVar;
            this.f165263b = lVar;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            if (z) {
                C49712hj1 dj = ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85166dj(this.f165262a.mo91565f());
                long P = C61926c.m72671P(this.f165263b.f171715b.f183241d);
                C64378fw2 fw22 = this.f165263b.f171715b;
                ((C60188n4) C86312j.m106911c(C60188n4.class)).mo75339Ki(P, fw22.f183248n, 4, dj, (Context) null, true, fw22.f183242e);
            }
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view == null || view.getTag() == null) {
            view = new C6807n4(layoutInflater, ((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1 ? C0966R.C0971layout.cxs : C0966R.C0971layout.f6939sr);
            ChattingItemAppMsgMegaVideo$$b chattingItemAppMsgMegaVideo$$b = new ChattingItemAppMsgMegaVideo$$b();
            chattingItemAppMsgMegaVideo$$b.mo82203a(view, true);
            view.setTag(chattingItemAppMsgMegaVideo$$b);
        }
        return view;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return true;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        if (menuItem.getItemId() != 111) {
            return false;
        }
        ChattingItemAppMsgMegaVideo.m66556b(bVar.mo91565f(), f4Var);
        return true;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        int b = ((C74243t8) view.getTag()).mo103252b();
        boolean z = !((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
        if (f4Var != null && !z) {
            e0Var.mo107136c(b, 111, 0, this.f165261v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            C88144b.m109788f("favorite");
            if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f165261v) && mo103081O(f4Var.mo108768t()) && !this.f165261v.mo91580u()) {
                e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
        if (f4Var.mo101020w3()) {
            C72695v.m85081w(f4Var);
            C75604z3.m90834f(f4Var.getMsgId());
            bVar.mo91541B(true);
        }
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        C60181l lVar;
        Class cls = C60200t1.class;
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u == null || (lVar = (C60181l) u.mo93555w(C60181l.class)) == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("feed_object_id", C61926c.m72671P(lVar.f171715b.f183241d));
        intent.putExtra("feed_object_nonceId", lVar.f171715b.f183248n);
        intent.putExtra("business_type", 1);
        intent.putExtra("finder_user_name", lVar.f171715b.f183242e);
        if (C72996z1.m85820U5(f4Var.mo108768t())) {
            intent.putExtra("report_scene", 2);
            intent.putExtra("key_finder_teen_mode_scene", 2);
        } else {
            intent.putExtra("report_scene", 1);
            intent.putExtra("key_finder_teen_mode_scene", 1);
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", lVar.f171715b.f183243f);
        intent.putExtra("key_finder_teen_mode_user_id", lVar.f171715b.f183242e);
        intent.putExtra("from_user", f4Var.mo108768t());
        intent.putExtra("key_from_user_name", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83796n6(f4Var));
        intent.putExtra("key_to_user_name", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83756C5(f4Var));
        intent.putExtra("tab_type", 6);
        ChattingItemAppMsgMegaVideo.m66557c(view, bVar, lVar, intent, true, C72996z1.m85820U5(f4Var.mo108768t()));
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C67391b bVar2 = bVar;
        C11978e0.C11979a aVar = C11978e0.C11979a.COMMON;
        Class cls = C76979h.class;
        Class cls2 = C11990s0.class;
        Class cls3 = C79368l.class;
        Class cls4 = C60200t1.class;
        this.f165261v = bVar2;
        ChattingItemAppMsgMegaVideo$$b chattingItemAppMsgMegaVideo$$b = (ChattingItemAppMsgMegaVideo$$b) cVar;
        chattingItemAppMsgMegaVideo$$b.f165256l.animate().cancel();
        chattingItemAppMsgMegaVideo$$b.f165256l.setTag(Long.valueOf(System.currentTimeMillis()));
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        boolean z = false;
        if (u != null) {
            C60181l lVar = (C60181l) u.mo93555w(C60181l.class);
            if (lVar != null) {
                C23564m.m28138h(chattingItemAppMsgMegaVideo$$b.convertView, new C57737a(this, bVar2, lVar));
                ((C11990s0) C39818r.f106831a.mo62446e(cls4).mo62447c(cls2)).mo11872i2().mo85957c(((C62368t0) C86312j.m106911c(C62368t0.class)).mo87412UE(lVar.f171715b.f183244g, C27696y.THUMB_IMAGE), chattingItemAppMsgMegaVideo$$b.f165246b, ((C11990s0) C39818r.f106831a.mo62446e(cls4).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT));
                chattingItemAppMsgMegaVideo$$b.f165247c.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), lVar.f171715b.f183243f));
                LinkedList<C64350ew2> linkedList = lVar.f171715b.f183247j;
                if (!linkedList.isEmpty()) {
                    if (!Util.isNullOrNil(linkedList.get(0).f183043h)) {
                        ((C60200t1) C86312j.m106911c(cls4)).mo76741Cm(linkedList.get(0).f183043h, chattingItemAppMsgMegaVideo$$b.f165248d, aVar);
                    } else {
                        ((C60200t1) C86312j.m106911c(cls4)).mo76741Cm(linkedList.get(0).f183040e, chattingItemAppMsgMegaVideo$$b.f165248d, aVar);
                    }
                    ChattingItemAppMsgMegaVideo.m66555a(chattingItemAppMsgMegaVideo$$b, linkedList);
                }
                if (!Util.isNullOrNil(lVar.f171715b.f183245h)) {
                    chattingItemAppMsgMegaVideo$$b.f165249e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), lVar.f171715b.f183245h));
                    chattingItemAppMsgMegaVideo$$b.f165249e.setVisibility(8);
                } else {
                    chattingItemAppMsgMegaVideo$$b.f165249e.setVisibility(8);
                }
                chattingItemAppMsgMegaVideo$$b.f165248d.setVisibility(0);
                chattingItemAppMsgMegaVideo$$b.f165250f.setVisibility(8);
                chattingItemAppMsgMegaVideo$$b.f165252h.setVisibility(0);
                chattingItemAppMsgMegaVideo$$b.f165254j.setVisibility(8);
                if (((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1) {
                    View view = chattingItemAppMsgMegaVideo$$b.f165257m;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMegaVideo$ChattingItemAppMsgMegaVideoTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMegaVideo$ChattingItemAppMsgMegaVideoTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view3 = chattingItemAppMsgMegaVideo$$b.f165257m;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMegaVideo$ChattingItemAppMsgMegaVideoTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMegaVideo$ChattingItemAppMsgMegaVideoTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C85875k4.m106189j0(chattingItemAppMsgMegaVideo$$b.f165247c.getPaint(), 0.8f);
                }
            }
            chattingItemAppMsgMegaVideo$$b.clickArea.setOnClickListener(mo103099u(bVar2));
            chattingItemAppMsgMegaVideo$$b.clickArea.setOnLongClickListener(mo103098p(bVar2));
            chattingItemAppMsgMegaVideo$$b.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(cls3)).mo108189Z4());
            chattingItemAppMsgMegaVideo$$b.clickArea.setTag(new C74243t8(f4Var, this.f165261v.mo91583x(), chattingItemAppMsgMegaVideo$$b, (String) null));
        } else {
            C72963f4 f4Var2 = f4Var;
        }
        if (C74023i.m87878T()) {
            ProgressBar progressBar = chattingItemAppMsgMegaVideo$$b.uploadingPB;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (f4Var.getStatus() != 2 || !mo103080N((C79368l) bVar2.f193278b.mo102812a(cls3), f4Var.getMsgId())) {
                ImageView imageView = chattingItemAppMsgMegaVideo$$b.f165253i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                ImageView imageView2 = chattingItemAppMsgMegaVideo$$b.f165253i;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            }
        } else {
            ProgressBar progressBar2 = chattingItemAppMsgMegaVideo$$b.uploadingPB;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            ImageView imageView3 = chattingItemAppMsgMegaVideo$$b.f165253i;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            if (f4Var.getStatus() < 2) {
                z = true;
            }
            mo103093i0(chattingItemAppMsgMegaVideo$$b, z, true);
        }
        mo103087e0(chattingItemAppMsgMegaVideo$$b, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return z && i == 1023410225;
    }
}
