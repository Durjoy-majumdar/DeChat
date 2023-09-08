package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import ht1.C60158d;
import ht1.C60159d2;
import ht1.C60162e2;
import ht1.C60200t1;
import ht1.C76243a5;
import j20.C117292a;
import java.io.IOException;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import n60.C100075f;
import nj3.C76874e0;
import p1081gi.C98121d;
import p629ny.C76979h;
import te3.C64581nk1;
import te3.C64689rq2;
import vr2.C102236a0;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.k1 */
public class C57772k1 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.k1$a */
    public static class C57773a extends C74023i.C74026c {

        /* renamed from: b */
        public TextView f165339b;

        /* renamed from: c */
        public C60162e2 f165340c;

        /* renamed from: d */
        public ImageView f165341d;

        /* renamed from: a */
        public C57773a mo82217a(View view, boolean z) {
            super.create(view);
            this.f165339b = (TextView) view.findViewById(C0966R.C0970id.b6m);
            C60162e2 e2Var = (C60162e2) view.findViewById(C0966R.C0970id.cy8);
            this.f165340c = e2Var;
            e2Var.setItemViewWidth(C76577a.m92151b(view.getContext(), 98));
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            if (!(!((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF())) {
                this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
                this.maskView = view.findViewById(C0966R.C0970id.b7h);
            }
            if (z) {
                this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
                this.f165341d = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            }
            return this;
        }

        public View getMainContainerView() {
            return (View) this.f165340c;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.k1$b */
    public static class C57774b extends C74023i {

        /* renamed from: v */
        public C67391b f165342v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.k1$b$a */
        public class C57775a implements C60159d2.C60160a {

            /* renamed from: a */
            public final /* synthetic */ C72963f4 f165343a;

            /* renamed from: b */
            public final /* synthetic */ C64581nk1 f165344b;

            public C57775a(C57774b bVar, C72963f4 f4Var, C64581nk1 nk12) {
                this.f165343a = f4Var;
                this.f165344b = nk12;
            }

            /* renamed from: a */
            public void mo77197a(int i, View view) {
                C57772k1.m66682b(view.getContext(), this.f165343a, this.f165344b);
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6887r9);
            C57773a aVar = new C57773a();
            aVar.mo82217a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (menuItem.getItemId() != 111) {
                return false;
            }
            C57772k1.m66683c(bVar.mo91565f(), f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            boolean z = !((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
            if (f4Var != null) {
                C88144b.m109788f("favorite");
                if (!z) {
                    e0Var.mo107136c(b, 111, 0, this.f165342v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
            }
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            String content = f4Var.getContent();
            C64581nk1 a = C57772k1.m66681a(content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null);
            if (a == null) {
                return false;
            }
            C57772k1.m66682b(bVar.mo91565f(), f4Var, a);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f165342v = bVar;
            C57773a aVar = (C57773a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C64581nk1 a = C57772k1.m66681a(u);
                if (a != null) {
                    aVar.f165339b.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), a.f184476e));
                    LinkedList linkedList = new LinkedList();
                    int i = 0;
                    while (i < a.f184478g.size() && i < 4) {
                        C64689rq2 rq22 = new C64689rq2();
                        rq22.f185266d = a.f184478g.get(i);
                        String str2 = a.f184479h.get(i);
                        rq22.f185286y = str2;
                        rq22.f185288z = str2;
                        rq22.f185267e = rq22.f185266d;
                        linkedList.add(rq22);
                        i++;
                    }
                    C60162e2.C60163a<C60162e2.C60164b> gc = ((C76243a5) C86312j.m106911c(C76243a5.class)).mo13238gc(linkedList, false);
                    aVar.f165340c.setAdapter(gc);
                    ((C60159d2) gc).mo85131a(new C57775a(this, f4Var, a));
                }
                View view = aVar.clickArea;
                if (view != null) {
                    view.setOnClickListener(mo103099u(bVar));
                    aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
                    aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                    aVar.clickArea.setTag(new C74243t8(f4Var, this.f165342v.mo91583x(), aVar, (String) null));
                }
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 956301361;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.k1$c */
    public static class C57776c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f165345v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.k1$c$a */
        public class C57777a implements C60159d2.C60160a {

            /* renamed from: a */
            public final /* synthetic */ C72963f4 f165346a;

            /* renamed from: b */
            public final /* synthetic */ C64581nk1 f165347b;

            public C57777a(C57776c cVar, C72963f4 f4Var, C64581nk1 nk12) {
                this.f165346a = f4Var;
                this.f165347b = nk12;
            }

            /* renamed from: a */
            public void mo77197a(int i, View view) {
                C57772k1.m66682b(view.getContext(), this.f165346a, this.f165347b);
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6937sp);
            C57773a aVar = new C57773a();
            aVar.mo82217a(n4Var, true);
            n4Var.setTag(aVar);
            return n4Var;
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
            C57772k1.m66683c(bVar.mo91565f(), f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            boolean z = !((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
            if (f4Var != null && !z) {
                e0Var.mo107136c(b, 111, 0, this.f165345v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                C88144b.m109788f("favorite");
                if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f165345v) && mo103081O(f4Var.mo108768t()) && !this.f165345v.mo91580u()) {
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
            String content = f4Var.getContent();
            C64581nk1 a = C57772k1.m66681a(content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null);
            if (a == null) {
                return false;
            }
            C57772k1.m66682b(bVar.mo91565f(), f4Var, a);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            Class cls = C79368l.class;
            this.f165345v = bVar;
            C57773a aVar = (C57773a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            boolean z = false;
            if (u != null) {
                C64581nk1 a = C57772k1.m66681a(u);
                if (a != null) {
                    aVar.f165339b.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), a.f184476e));
                    LinkedList linkedList = new LinkedList();
                    int i = 0;
                    while (i < a.f184478g.size() && i < 4) {
                        C64689rq2 rq22 = new C64689rq2();
                        rq22.f185266d = a.f184478g.get(i);
                        String str2 = a.f184479h.get(i);
                        rq22.f185286y = str2;
                        rq22.f185288z = str2;
                        rq22.f185267e = rq22.f185266d;
                        linkedList.add(rq22);
                        i++;
                    }
                    C60162e2.C60163a<C60162e2.C60164b> gc = ((C76243a5) C86312j.m106911c(C76243a5.class)).mo13238gc(linkedList, false);
                    aVar.f165340c.setAdapter(gc);
                    ((C60159d2) gc).mo85131a(new C57777a(this, f4Var, a));
                }
                View view = aVar.clickArea;
                if (view != null) {
                    view.setOnClickListener(mo103099u(bVar));
                    aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
                    aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(cls)).mo108189Z4());
                    aVar.clickArea.setTag(new C74243t8(f4Var, this.f165345v.mo91583x(), aVar, (String) null));
                }
            }
            if (C74023i.m87878T()) {
                mo103093i0(aVar, false, true);
                if (f4Var.getStatus() != 2 || !mo103080N((C79368l) bVar.f193278b.mo102812a(cls), f4Var.getMsgId())) {
                    ImageView imageView = aVar.f165341d;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ImageView imageView2 = aVar.f165341d;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                }
            } else {
                ImageView imageView3 = aVar.f165341d;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                if (f4Var.getStatus() < 2) {
                    z = true;
                }
                mo103093i0(aVar, z, true);
            }
            mo103087e0(aVar, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 956301361;
        }
    }

    static {
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        aVar.mo139398a();
    }

    /* renamed from: a */
    public static C64581nk1 m66681a(C68070l.C68072b bVar) {
        C60158d dVar = (C60158d) bVar.mo93555w(C60158d.class);
        if (dVar != null) {
            return dVar.f171700b;
        }
        return null;
    }

    /* renamed from: b */
    public static void m66682b(Context context, C72963f4 f4Var, C64581nk1 nk12) {
        Intent intent = new Intent();
        intent.putExtra("TITLE_WORDING", nk12.f184476e);
        int i = 1;
        intent.putExtra("AUTO_REFRESH", true);
        try {
            intent.putExtra("FINDER_SHARE_ALBUM", nk12.toByteArray());
        } catch (IOException unused) {
        }
        intent.putExtra("GET_REL_SCENE", 14);
        intent.putExtra("STREAM_CARD_BUFFER", nk12.f184480i.mo123703f());
        intent.putExtra("COMMENT_SCENE", 51);
        intent.putExtra("CARD_ID", C102236a0.m134706B0(nk12.f184475d));
        intent.putExtra("SHARED_USERNAME", f4Var.mo108768t());
        if (C72996z1.m85820U5(f4Var.mo108768t())) {
            i = 2;
        }
        intent.putExtra("FROM_SHARE_SCENE", i);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).dk0(context, intent);
    }

    /* renamed from: c */
    public static void m66683c(Activity activity, C72963f4 f4Var) {
        C68070l.C68072b u;
        if (!Util.isNullOrNil(f4Var.getContent()) && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
            Intent intent = new Intent(activity, MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            intent.putExtra("Retr_Msg_Type", 22);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderAlbum", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderAlbum", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
