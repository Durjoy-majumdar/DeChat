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
import bp3.C79758p;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import ht1.C60174h;
import ht1.C60200t1;
import ht1.C98522w3;
import j20.C117292a;
import java.io.IOException;
import k20.C9556a;
import k60.C99101e;
import ke3.C88144b;
import n60.C100075f;
import nj3.C76874e0;
import oa1.C117731d;
import p1081gi.C98121d;
import p629ny.C76979h;
import te3.C64711sk1;
import te3.m74;
import tf3.C101877q;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.x1 */
public class C57801x1 {

    /* renamed from: a */
    public static C100075f f165394a;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.x1$a */
    public static class C57802a extends C74023i.C74026c {

        /* renamed from: b */
        public TextView f165395b;

        /* renamed from: c */
        public ImageView f165396c;

        /* renamed from: d */
        public TextView f165397d;

        /* renamed from: e */
        public ImageView f165398e;

        /* renamed from: a */
        public C57802a mo82230a(View view, boolean z) {
            super.create(view);
            this.f165395b = (TextView) view.findViewById(C0966R.C0970id.b6m);
            this.f165396c = (ImageView) view.findViewById(C0966R.C0970id.b6i);
            this.f165397d = (TextView) view.findViewById(C0966R.C0970id.b6h);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            if (!(!((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF())) {
                this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
                this.maskView = view.findViewById(C0966R.C0970id.b7h);
            }
            if (z) {
                this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
                this.f165398e = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            }
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.x1$b */
    public static class C57803b extends C74023i {

        /* renamed from: v */
        public C67391b f165399v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6893rg);
            C57802a aVar = new C57802a();
            aVar.mo82230a(n4Var, false);
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
            C57801x1.m66789b(bVar.mo91565f(), f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            if (f4Var == null) {
                return true;
            }
            C88144b.m109788f("favorite");
            e0Var.mo107136c(b, 111, 0, this.f165399v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            String content = f4Var.getContent();
            C64711sk1 a = C57801x1.m66788a(content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null);
            if (a == null) {
                return false;
            }
            C57801x1.m66790c(bVar.mo91565f(), f4Var, a);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f165399v = bVar;
            C57802a aVar = (C57802a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C64711sk1 a = C57801x1.m66788a(u);
                if (a != null) {
                    aVar.f165395b.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), a.f185424f));
                    aVar.f165397d.setText(a.f185429n);
                    if (!Util.isNullOrNil(a.f185427i)) {
                        C99101e eVar = C99101e.f290570a;
                        C99101e.f290571b.mo85957c(a.f185427i, aVar.f165396c, C57801x1.f165394a);
                    } else {
                        aVar.f165396c.setImageResource(C0966R.raw.icons_outlined_location);
                    }
                }
                View view = aVar.clickArea;
                if (view != null) {
                    view.setOnClickListener(mo103099u(bVar));
                    aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
                    aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                    aVar.clickArea.setTag(new C74243t8(f4Var, this.f165399v.mo91583x(), aVar, (String) null));
                }
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 1057030193;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.x1$c */
    public static class C57804c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f165400v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6943sx);
            C57802a aVar = new C57802a();
            aVar.mo82230a(n4Var, true);
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
            C57801x1.m66789b(bVar.mo91565f(), f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            if (f4Var != null) {
                e0Var.mo107136c(b, 111, 0, this.f165400v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                C88144b.m109788f("favorite");
                if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f165400v) && mo103081O(f4Var.mo108768t()) && !this.f165400v.mo91580u()) {
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
            C64711sk1 a = C57801x1.m66788a(content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null);
            if (a == null) {
                return false;
            }
            C57801x1.m66790c(bVar.mo91565f(), f4Var, a);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            Class cls = C79368l.class;
            this.f165400v = bVar;
            C57802a aVar = (C57802a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C64711sk1 a = C57801x1.m66788a(u);
                if (a != null) {
                    aVar.f165395b.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), a.f185424f));
                    aVar.f165397d.setText(a.f185429n);
                    if (!Util.isNullOrNil(a.f185427i)) {
                        C99101e eVar = C99101e.f290570a;
                        C99101e.f290571b.mo85957c(a.f185427i, aVar.f165396c, C57801x1.f165394a);
                    } else {
                        aVar.f165396c.setImageResource(C0966R.raw.icons_outlined_location);
                    }
                }
                View view = aVar.clickArea;
                if (view != null) {
                    view.setOnClickListener(mo103099u(bVar));
                    aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
                    aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(cls)).mo108189Z4());
                    aVar.clickArea.setTag(new C74243t8(f4Var, this.f165400v.mo91583x(), aVar, (String) null));
                }
            }
            boolean z = false;
            if (C74023i.m87878T()) {
                mo103093i0(aVar, false, true);
                if (f4Var.getStatus() != 2 || !mo103080N((C79368l) bVar.f193278b.mo102812a(cls), f4Var.getMsgId())) {
                    ImageView imageView = aVar.f165398e;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ImageView imageView2 = aVar.f165398e;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                }
            } else {
                ImageView imageView3 = aVar.f165398e;
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
            return z && i == 1057030193;
        }
    }

    static {
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        f165394a = aVar.mo139398a();
    }

    /* renamed from: a */
    public static C64711sk1 m66788a(C68070l.C68072b bVar) {
        C60174h hVar = (C60174h) bVar.mo93555w(C60174h.class);
        if (hVar != null) {
            return hVar.f171711b;
        }
        return null;
    }

    /* renamed from: b */
    public static void m66789b(Activity activity, C72963f4 f4Var) {
        C68070l.C68072b u;
        if (!Util.isNullOrNil(f4Var.getContent()) && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
            Intent intent = new Intent(activity, MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            intent.putExtra("Retr_Msg_Type", 28);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderPoi", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderPoi", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: c */
    public static void m66790c(Context context, C72963f4 f4Var, C64711sk1 sk12) {
        String str;
        Class cls = C60200t1.class;
        if (context != null) {
            Intent intent = new Intent();
            m74 m74 = new m74();
            m74.f184224i = sk12.f185428j;
            m74.f184219d = Util.safeParseFloat(sk12.f185423e);
            m74.f184220e = Util.safeParseFloat(sk12.f185422d);
            m74.f184222g = sk12.f185424f;
            m74.f184226n = sk12.f185427i;
            m74.f184223h = sk12.f185426h;
            m74.f184227o = Util.safeParseInt(sk12.f185425g);
            m74.f184225j = Util.safeParseInt(sk12.f185429n);
            try {
                intent.putExtra("key_location", m74.toByteArray());
            } catch (IOException unused) {
                Log.m105920e("Finder.ChattingItemAppMsgFinderPoi", "location toByteArray exception");
            }
            intent.putExtra("key_from_type", C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS);
            int i = 2;
            boolean z = true;
            if (C72996z1.m85820U5(f4Var.mo108768t())) {
                intent.putExtra("key_finder_teen_mode_scene", 2);
            } else {
                intent.putExtra("key_finder_teen_mode_scene", 1);
            }
            intent.putExtra("key_entrance_type", 0);
            C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
            if (C72996z1.m85820U5(f4Var.mo108768t())) {
                i = 3;
            }
            t1Var.mo76842e7(i, 11, 81, intent);
            C115669n.INSTANCE.mo175912v(((C98522w3) C86312j.m106911c(C98522w3.class)).mo3991CD(), 2);
            C101877q qVar = new C101877q();
            if (!(C117731d.m166007c().mo182440a(qVar) == 1 || C79758p.f233760a.mo109883f(qVar) == 1)) {
                z = false;
            }
            if (!z || ((str = m74.f184224i) != null && str.startsWith("foursquare_"))) {
                ((C60200t1) C86312j.m106911c(cls)).mo76816Uj(context, intent);
            } else {
                ((C60200t1) C86312j.m106911c(cls)).mo76828Xw(context, intent, m74);
            }
        }
    }
}
