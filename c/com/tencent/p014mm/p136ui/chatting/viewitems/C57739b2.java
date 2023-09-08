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
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import ht1.C60178k;
import ht1.C60200t1;
import j20.C117292a;
import java.io.IOException;
import k20.C9556a;
import k60.C99101e;
import ke3.C88144b;
import n60.C100075f;
import nj3.C76874e0;
import p1081gi.C98121d;
import p629ny.C76979h;
import te3.C64311db1;
import te3.C64609ok1;
import te3.C64730tk1;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b2 */
public class C57739b2 {

    /* renamed from: a */
    public static C100075f f165264a;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.b2$a */
    public static class C57740a extends C74023i.C74026c {

        /* renamed from: b */
        public TextView f165265b;

        /* renamed from: c */
        public ImageView f165266c;

        /* renamed from: d */
        public TextView f165267d;

        /* renamed from: e */
        public ImageView f165268e;

        /* renamed from: a */
        public C57740a mo82205a(View view, boolean z) {
            super.create(view);
            this.f165265b = (TextView) view.findViewById(C0966R.C0970id.b6m);
            this.f165266c = (ImageView) view.findViewById(C0966R.C0970id.b6o);
            this.f165267d = (TextView) view.findViewById(C0966R.C0970id.b6n);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            if (!(!((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF())) {
                this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
                this.maskView = view.findViewById(C0966R.C0970id.b7h);
            }
            if (z) {
                this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
                this.f165268e = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            }
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.b2$b */
    public static class C57741b extends C74023i {

        /* renamed from: v */
        public C67391b f165269v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6894ri);
            C57740a aVar = new C57740a();
            aVar.mo82205a(n4Var, false);
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
            C57739b2.m66576a(bVar.mo91565f(), f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            boolean z = !((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
            if (f4Var != null) {
                C88144b.m109788f("favorite");
                if (!z) {
                    e0Var.mo107136c(b, 111, 0, this.f165269v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
            }
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            String content = f4Var.getContent();
            C64730tk1 c = C57739b2.m66578c(content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null);
            if (c == null) {
                return false;
            }
            C57739b2.m66577b(bVar.mo91565f(), f4Var, c);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f165269v = bVar;
            C57740a aVar = (C57740a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C64730tk1 c = C57739b2.m66578c(u);
                if (c != null) {
                    aVar.f165265b.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), c.f185604e == 1 ? MMApplicationContext.getContext().getString(C0966R.string.esl, new Object[]{c.f185603d}) : c.f185603d));
                    C99101e eVar = C99101e.f290570a;
                    C99101e.f290571b.mo85957c(c.f185605f, aVar.f165266c, C57739b2.f165264a);
                    aVar.f165267d.setText(c.f185606g);
                }
                View view = aVar.clickArea;
                if (view != null) {
                    view.setOnClickListener(mo103099u(bVar));
                    aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
                    aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                    aVar.clickArea.setTag(new C74243t8(f4Var, this.f165269v.mo91583x(), aVar, (String) null));
                }
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if (!z) {
                return i == 838860849 || i == 1006633009;
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.b2$c */
    public static class C57742c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f165270v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6944sz);
            C57740a aVar = new C57740a();
            aVar.mo82205a(n4Var, true);
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
            C57739b2.m66576a(bVar.mo91565f(), f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            boolean z = !((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
            if (f4Var != null && !z) {
                e0Var.mo107136c(b, 111, 0, this.f165270v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                C88144b.m109788f("favorite");
                if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f165270v) && mo103081O(f4Var.mo108768t()) && !this.f165270v.mo91580u()) {
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
            C64730tk1 c = C57739b2.m66578c(content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null);
            if (c == null) {
                return false;
            }
            C57739b2.m66577b(bVar.mo91565f(), f4Var, c);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            Class cls = C79368l.class;
            this.f165270v = bVar;
            C57740a aVar = (C57740a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            boolean z = false;
            if (u != null) {
                C64730tk1 c = C57739b2.m66578c(u);
                if (c != null) {
                    aVar.f165265b.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), c.f185604e == 1 ? MMApplicationContext.getContext().getString(C0966R.string.esl, new Object[]{c.f185603d}) : c.f185603d));
                    C99101e eVar = C99101e.f290570a;
                    C99101e.f290571b.mo85957c(c.f185605f, aVar.f165266c, C57739b2.f165264a);
                    aVar.f165267d.setText(c.f185606g);
                }
                View view = aVar.clickArea;
                if (view != null) {
                    view.setOnClickListener(mo103099u(bVar));
                    aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
                    aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(cls)).mo108189Z4());
                    aVar.clickArea.setTag(new C74243t8(f4Var, this.f165270v.mo91583x(), aVar, (String) null));
                }
            }
            if (C74023i.m87878T()) {
                mo103093i0(aVar, false, true);
                if (f4Var.getStatus() != 2 || !mo103080N((C79368l) bVar.f193278b.mo102812a(cls), f4Var.getMsgId())) {
                    ImageView imageView = aVar.f165268e;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ImageView imageView2 = aVar.f165268e;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                }
            } else {
                ImageView imageView3 = aVar.f165268e;
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
            if (z) {
                return i == 838860849 || i == 1006633009;
            }
            return false;
        }
    }

    static {
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        f165264a = aVar.mo139398a();
    }

    /* renamed from: a */
    public static void m66576a(Activity activity, C72963f4 f4Var) {
        C68070l.C68072b u;
        if (!Util.isNullOrNil(f4Var.getContent()) && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
            int i = 21;
            if (m66578c(u).f185604e == 4) {
                i = 25;
            }
            Intent intent = new Intent(activity, MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            intent.putExtra("Retr_Msg_Type", i);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderTopic", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderTopic", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: b */
    public static void m66577b(Context context, C72963f4 f4Var, C64730tk1 tk12) {
        Class cls = C60200t1.class;
        Intent intent = new Intent();
        intent.putExtra("key_topic_title", tk12.f185603d);
        intent.putExtra("key_topic_type", tk12.f185604e);
        if (tk12.f185604e == 4) {
            intent.putExtra("KEY_FOLLOW_ID", tk12.f185608i);
        }
        C64311db1 db12 = new C64311db1();
        C64609ok1 ok12 = tk12.f185607h;
        db12.f182666i = ok12.f184668d;
        db12.f182661d = ok12.f184669e;
        db12.f182662e = ok12.f184670f;
        try {
            intent.putExtra("key_topic_poi_location", db12.toByteArray());
        } catch (IOException unused) {
            Log.m105920e("Finder.ChattingItemAppMsgFinderTopic", "location toByteArray exception");
        }
        intent.putExtra("key_from_user", f4Var.mo108768t());
        intent.putExtra("key_report_scene", C72996z1.m85820U5(f4Var.mo108768t()) ? 2 : 1);
        intent.putExtra("KEY_TAB_TYPE", 6);
        if (C72996z1.m85820U5(f4Var.mo108768t())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", "");
        intent.putExtra("key_finder_teen_mode_user_id", "");
        int i = tk12.f185604e;
        int i2 = 22;
        if (i != 1) {
            if (i == 2) {
                i2 = 26;
            } else if (i == 4) {
                i2 = 49;
            }
        }
        intent.putExtra("key_entrance_type", 0);
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(C72996z1.m85820U5(f4Var.mo108768t()) ? 3 : 2, 2, i2, intent);
        ((C60200t1) C86312j.m106911c(cls)).yt0(context, intent);
    }

    /* renamed from: c */
    public static C64730tk1 m66578c(C68070l.C68072b bVar) {
        C60178k kVar = (C60178k) bVar.mo93555w(C60178k.class);
        if (kVar != null) {
            return kVar.f171714b;
        }
        return null;
    }
}
