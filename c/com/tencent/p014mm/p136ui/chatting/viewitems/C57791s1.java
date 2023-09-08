package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
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
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import ht1.C60161e;
import ht1.C60200t1;
import j20.C117292a;
import k20.C9556a;
import nj3.C76874e0;
import p1081gi.C98121d;
import p629ny.C76979h;
import pl1.C11978e0;
import pl1.C62368t0;
import up1.C27696y;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.s1 */
public class C57791s1 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s1$a */
    public static class C57792a extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f165380b;

        /* renamed from: c */
        public TextView f165381c;

        /* renamed from: d */
        public ImageView f165382d;

        /* renamed from: e */
        public TextView f165383e;

        /* renamed from: f */
        public ImageView f165384f;

        /* renamed from: a */
        public C57792a mo82224a(View view, boolean z) {
            super.create(view);
            this.f165380b = (ImageView) view.findViewById(C0966R.C0970id.d79);
            this.f165381c = (TextView) view.findViewById(C0966R.C0970id.e3x);
            this.f165382d = (ImageView) view.findViewById(C0966R.C0970id.f358083da2);
            this.f165383e = (TextView) view.findViewById(C0966R.C0970id.f358084da3);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            if (!(!((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF())) {
                this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
                this.maskView = view.findViewById(C0966R.C0970id.b7h);
            }
            if (z) {
                this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
                this.f165384f = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            }
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s1$b */
    public static class C57793b extends C74023i {

        /* renamed from: v */
        public C67391b f165385v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6892rf);
            C57792a aVar = new C57792a();
            aVar.mo82224a(n4Var, false);
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
            C57791s1.m66741a(bVar.mo91565f(), f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            e0Var.mo107136c(0, 111, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C57791s1.m66742b(bVar, f4Var);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            Class cls = C62368t0.class;
            this.f165385v = bVar;
            C57792a aVar = (C57792a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C60161e eVar = (C60161e) u.mo93555w(C60161e.class);
                if (eVar != null) {
                    C11978e0 e0Var = C11978e0.f34938a;
                    e0Var.mo11849a().mo85957c(((C62368t0) C86312j.m106911c(cls)).mo87412UE(eVar.f171703d, C27696y.THUMB_IMAGE), aVar.f165380b, e0Var.mo11851c(C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT));
                    aVar.f165381c.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), eVar.f171704e));
                    int i = eVar.f171706g;
                    if (i > 0) {
                        aVar.f165382d.setVisibility(0);
                        if (i != 1) {
                            if (i == 2) {
                                aVar.f165382d.setImageResource(C0966R.raw.icons_filled_star_identify_enterprise);
                            } else if (i == 100) {
                                aVar.f165382d.setVisibility(8);
                            }
                        } else if (!eVar.f171707h.isEmpty()) {
                            e0Var.mo11850b().mo85957c(((C62368t0) C86312j.m106911c(cls)).mo87412UE(eVar.f171707h, C27696y.RAW_IMAGE), aVar.f165382d, e0Var.mo11851c(C11978e0.C11979a.COMMON));
                        } else {
                            aVar.f165382d.setImageDrawable(C74933u4.m89768e(bVar.mo91565f(), C0966R.raw.icons_filled_star_identify, bVar.mo91572m().getColor(C0966R.color.f2960ag)));
                        }
                    } else {
                        aVar.f165382d.setVisibility(8);
                    }
                    if (i != 1 || Util.isNullOrNil(eVar.f171705f)) {
                        aVar.f165383e.setVisibility(8);
                    } else {
                        aVar.f165383e.setVisibility(0);
                        aVar.f165383e.setText(eVar.f171705f);
                    }
                }
                aVar.clickArea.setOnClickListener(mo103099u(bVar));
                aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
                aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                aVar.clickArea.setTag(new C74243t8(f4Var, this.f165385v.mo91583x(), aVar, (String) null));
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 771751985;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s1$c */
    public static class C57794c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f165386v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6942sw);
            C57792a aVar = new C57792a();
            aVar.mo82224a(n4Var, true);
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
            C57791s1.m66741a(bVar.mo91565f(), f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            if (f4Var != null) {
                if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f165386v) && mo103081O(f4Var.mo108768t()) && !this.f165386v.mo91580u()) {
                    e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                }
                e0Var.mo107136c(b, 111, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
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
            C57791s1.m66742b(bVar, f4Var);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C67391b bVar2 = bVar;
            Class cls = C62368t0.class;
            Class cls2 = C79368l.class;
            this.f165386v = bVar2;
            C57792a aVar = (C57792a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            boolean z = false;
            if (u != null) {
                C60161e eVar = (C60161e) u.mo93555w(C60161e.class);
                if (eVar != null) {
                    C11978e0 e0Var = C11978e0.f34938a;
                    e0Var.mo11849a().mo85957c(((C62368t0) C86312j.m106911c(cls)).mo87412UE(eVar.f171703d, C27696y.THUMB_IMAGE), aVar.f165380b, e0Var.mo11851c(C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT));
                    aVar.f165381c.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), eVar.f171704e));
                    int i = eVar.f171706g;
                    if (i > 0) {
                        aVar.f165382d.setVisibility(0);
                        if (i != 1) {
                            if (i == 2) {
                                aVar.f165382d.setImageResource(C0966R.raw.icons_filled_star_identify_enterprise);
                            } else if (i == 100) {
                                aVar.f165382d.setVisibility(8);
                            }
                        } else if (!eVar.f171707h.isEmpty()) {
                            e0Var.mo11850b().mo85957c(((C62368t0) C86312j.m106911c(cls)).mo87412UE(eVar.f171707h, C27696y.RAW_IMAGE), aVar.f165382d, e0Var.mo11851c(C11978e0.C11979a.COMMON));
                        } else {
                            aVar.f165382d.setImageDrawable(C74933u4.m89768e(bVar.mo91565f(), C0966R.raw.icons_filled_star_identify, bVar.mo91572m().getColor(C0966R.color.f2960ag)));
                        }
                    } else {
                        aVar.f165382d.setVisibility(8);
                    }
                    if (i != 1 || Util.isNullOrNil(eVar.f171705f)) {
                        aVar.f165383e.setVisibility(8);
                    } else {
                        aVar.f165383e.setVisibility(0);
                        aVar.f165383e.setText(eVar.f171705f);
                    }
                }
                aVar.clickArea.setOnClickListener(mo103099u(bVar2));
                aVar.clickArea.setOnLongClickListener(mo103098p(bVar2));
                aVar.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(cls2)).mo108189Z4());
                aVar.clickArea.setTag(new C74243t8(f4Var, this.f165386v.mo91583x(), aVar, (String) null));
            } else {
                C72963f4 f4Var2 = f4Var;
            }
            if (C74023i.m87878T()) {
                mo103093i0(aVar, false, true);
                if (f4Var.getStatus() != 2 || !mo103080N((C79368l) bVar2.f193278b.mo102812a(cls2), f4Var.getMsgId())) {
                    ImageView imageView = aVar.f165384f;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ImageView imageView2 = aVar.f165384f;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                }
            } else {
                ImageView imageView3 = aVar.f165384f;
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
            return z && i == 771751985;
        }
    }

    /* renamed from: a */
    public static void m66741a(Activity activity, C72963f4 f4Var) {
        C68070l.C68072b u;
        if (!Util.isNullOrNil(f4Var.getContent()) && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
            Intent intent = new Intent(activity, MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            intent.putExtra("Retr_Msg_Type", 20);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderNameCard", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderNameCard", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: b */
    public static void m66742b(C67391b bVar, C72963f4 f4Var) {
        C60161e eVar;
        Class cls = C60200t1.class;
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null && (eVar = (C60161e) u.mo93555w(C60161e.class)) != null && !Util.isNullOrNil(eVar.f171702c)) {
            Intent intent = new Intent();
            int i = 2;
            if (C72996z1.m85820U5(f4Var.mo108768t())) {
                intent.putExtra("key_finder_teen_mode_scene", 2);
                intent.putExtra("report_scene", 2);
            } else {
                intent.putExtra("key_finder_teen_mode_scene", 1);
                intent.putExtra("report_scene", 1);
            }
            C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
            if (C72996z1.m85820U5(f4Var.mo108768t())) {
                i = 3;
            }
            t1Var.mo76842e7(i, 3, 32, intent);
            intent.putExtra("key_enter_profile_type", 4);
            intent.putExtra("key_entrance_type", 0);
            intent.putExtra("key_from_comment_scene", 11);
            intent.putExtra("from_user", f4Var.mo108768t());
            intent.putExtra("key_from_user_name", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83796n6(f4Var));
            intent.putExtra("key_ec_source", eVar.f171708i);
            intent.putExtra("finder_username", eVar.f171702c);
            intent.putExtra("key_to_user_name", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83756C5(f4Var));
            intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
            intent.putExtra("key_finder_teen_mode_check", true);
            intent.putExtra("key_finder_teen_mode_user_name", eVar.f171704e);
            intent.putExtra("key_finder_teen_mode_user_id", eVar.f171702c);
            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(bVar.mo91565f(), intent);
        }
    }
}
