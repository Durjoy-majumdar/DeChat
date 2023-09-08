package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import e30.C75539a;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C86493v0;
import eb0.C97625j3;
import fk3.C59136a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76874e0;
import nj3.C76875f0;
import oa1.C117731d;
import p158gt.C98201k;
import p248ug.C52558c;
import p680ru.C77569h;
import p763ym.C79138l;
import pf3.C35480i;
import rb0.C47984k;
import sw1.C48477m;
import t30.C77841g;
import t30.C77842h;
import uj3.C78208e;
import zj3.C79348e;
import zj3.C79368l;
import zj3.C79371n;
import zj3.C79384u0;
import zj3.C79386v0;
import zp3.C23555k;
import zp3.C23564m;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.o6 */
public final class C74152o6 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.o6$a */
    public static class C74153a extends C74023i {

        /* renamed from: v */
        public C67391b f217669v;

        /* renamed from: w */
        public C74157c f217670w;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.o6$a$a */
        public class C74154a extends C23555k.C23562d {

            /* renamed from: a */
            public final /* synthetic */ C72963f4 f217671a;

            public C74154a(C74153a aVar, C72963f4 f4Var) {
                this.f217671a = f4Var;
            }

            /* renamed from: b */
            public void mo53b(View view, long j, long j2, boolean z) {
                if (!C72996z1.m85807K5(this.f217671a.mo108768t())) {
                    C75539a.m90581a(true, this.f217671a.mo108774y2(), this.f217671a.mo108768t(), this.f217671a.mo108765s2());
                }
            }
        }

        /* renamed from: o0 */
        public static void m88300o0(Context context, C74023i.C74026c cVar, C72963f4 f4Var, boolean z) {
            C74023i.C74026c cVar2 = cVar;
            C72963f4 f4Var2 = f4Var;
            if (true == z && (cVar2 instanceof C74158d)) {
                C74158d dVar = (C74158d) cVar2;
                ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).Bx0(dVar.f217679b, f4Var.mo108765s2(), C76577a.m92156g(context), f4Var2.f230725H, f4Var2.f230726I, true, C0966R.C0969drawable.by8, dVar.f217681d, C0966R.C0969drawable.beb, 1, true, (View) null);
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6912s1);
            C74158d dVar = new C74158d();
            dVar.mo103208a(n4Var, true);
            n4Var.setTag(dVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (100 == menuItem.getItemId()) {
                C74152o6.m88298b(f4Var, this, bVar);
                return false;
            } else if (131 == menuItem.getItemId()) {
                C74152o6.m88299c(bVar, menuItem, f4Var);
                return false;
            } else {
                ((C79386v0) bVar.f193278b.mo102812a(C79386v0.class)).mo102594u(menuItem, f4Var);
                return false;
            }
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            Class cls = C98201k.class;
            if (!(!C97625j3.m125812b().mo105883I() || view == null || f4Var == null)) {
                int b = ((C74243t8) view.getTag()).mo103252b();
                C92836k kVar = null;
                if (f4Var.getMsgId() > 0) {
                    kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(f4Var.mo108768t(), f4Var.getMsgId());
                }
                if ((kVar == null || kVar.f267374a <= 0) && f4Var.mo108774y2() > 0) {
                    kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
                }
                C92836k kVar2 = kVar;
                if (!C75569c4.m90688u(f4Var) && !C75569c4.m90687t(f4Var)) {
                    e0Var.mo107136c(b, 110, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
                if (C47984k.m53330d() && !this.f217669v.mo91584y()) {
                    e0Var.add(b, 114, 0, (CharSequence) view.getContext().getString(C0966R.string.b9w));
                }
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if (!(kVar2 == null || kVar2.f267388o == -1)) {
                    MenuItem c = e0Var.mo107136c(b, 131, 0, view.getContext().getString(C0966R.string.b8g), C0966R.raw.icons_filled_pencil);
                    int[] iArr = new int[2];
                    int width = view.getWidth();
                    int height = view.getHeight();
                    view.getLocationOnScreen(iArr);
                    Intent intent = new Intent();
                    intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
                    ((C76875f0) c).f224731z = intent;
                }
                ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = f4Var.getMsgId();
                exDeviceHaveBindNetworkDeviceEvent.publish();
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                    e0Var.mo107136c(b, 129, 0, view.getContext().getString(C0966R.string.b_8), C0966R.raw.icons_filled_open);
                }
                if (!this.f217669v.mo91584y()) {
                    e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_0), C0966R.raw.icons_filled_delete);
                }
                if (C75569c4.m90690w(f4Var) || C75569c4.m90689v(f4Var) || C75569c4.m90662H(f4Var)) {
                    e0Var.clear();
                    if (!this.f217669v.mo91584y()) {
                        e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_0), C0966R.raw.icons_filled_delete);
                    }
                }
                if (C75569c4.m90663I(f4Var)) {
                    SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new SpamMediaToEmojiOPStruct();
                    spamMediaToEmojiOPStruct.f194459d = f4Var.mo108774y2();
                    spamMediaToEmojiOPStruct.f194460e = (long) f4Var.getType();
                    spamMediaToEmojiOPStruct.f194461f = (long) C75569c4.m90678k(f4Var);
                    spamMediaToEmojiOPStruct.f194462g = 3;
                    spamMediaToEmojiOPStruct.mo86054n();
                }
            }
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C74023i.C74026c cVar2 = cVar;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            this.f217669v = bVar2;
            ((C79371n) bVar2.f193278b.mo102812a(C79371n.class)).mo102409q3(f4Var2);
            C74158d dVar = (C74158d) cVar2;
            float f = !C75569c4.m90663I(f4Var) ? 1.0f : C75569c4.f222001d;
            if (f != 1.0f) {
                SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new SpamMediaToEmojiOPStruct();
                spamMediaToEmojiOPStruct.f194459d = f4Var.mo108774y2();
                spamMediaToEmojiOPStruct.f194460e = (long) f4Var.getType();
                spamMediaToEmojiOPStruct.f194461f = (long) C75569c4.m90678k(f4Var);
                spamMediaToEmojiOPStruct.f194462g = 1;
                spamMediaToEmojiOPStruct.mo86054n();
                Log.m105925i("MicroMsg.ChattingItemImgFrom", "img need scale:%s, %s", Long.valueOf(f4Var.getMsgId()), Float.valueOf(f));
            }
            boolean Bx0 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).Bx0(dVar.f217679b, f4Var.mo108765s2(), C76577a.m92156g(bVar.mo91565f()) * f, f4Var2.f230725H, f4Var2.f230726I, true, C0966R.C0969drawable.by8, dVar.f217681d, C0966R.C0969drawable.f4730l9, 1, true, (View) null);
            View view = dVar.f217682e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ChattingItemImgFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ChattingItemImgFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo103093i0(dVar, false, false);
            if (!Bx0) {
                dVar.f217679b.setImageBitmap(BitmapFactory.decodeResource(bVar.mo91572m(), C0966R.C0969drawable.f4730l9));
            }
            String str2 = null;
            if (bVar.mo91583x()) {
                str2 = f4Var.mo108768t();
            }
            dVar.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), (C78208e) dVar, str, str2));
            View view3 = dVar.clickArea;
            if (this.f217670w == null) {
                this.f217670w = new C74157c(this.f217669v, this, true);
            }
            this.f217670w.f217676g = 0;
            if (C75569c4.m90663I(f4Var)) {
                this.f217670w.f217676g = 2;
            }
            view3.setOnClickListener(this.f217670w);
            dVar.clickArea.setOnLongClickListener(mo103098p(bVar2));
            dVar.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            dVar.f217679b.setContentDescription(bVar.mo91572m().getString(C0966R.string.b8k));
            C74152o6.m88297a(f4Var2, this, bVar2, dVar);
            C23564m.m28138h(cVar2.convertView, new C74154a(this, f4Var2));
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if (!z) {
                return i == 39 || i == 3 || i == 23 || i == 13 || i == 33;
            }
            return false;
        }

        /* renamed from: n0 */
        public boolean mo103045n0(C67391b bVar) {
            return bVar.mo91583x();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.o6$b */
    public static class C74155b extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f217672v;

        /* renamed from: w */
        public C74157c f217673w;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.o6$b$a */
        public class C74156a extends C23555k.C23562d {

            /* renamed from: a */
            public final /* synthetic */ C72963f4 f217674a;

            public C74156a(C74155b bVar, C72963f4 f4Var) {
                this.f217674a = f4Var;
            }

            /* renamed from: b */
            public void mo53b(View view, long j, long j2, boolean z) {
                if (!C72996z1.m85807K5(this.f217674a.mo108768t())) {
                    C75539a.m90581a(false, this.f217674a.mo108774y2(), this.f217674a.mo108768t(), ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(this.f217674a.mo108765s2(), true));
                }
            }
        }

        /* renamed from: o0 */
        public static void m88310o0(C74023i.C74026c cVar, int i, int i2) {
            int i3 = i2 > 0 ? i >= i2 ? 100 : (int) ((((long) i) * 100) / ((long) i2)) : 0;
            if (cVar == null) {
                Log.m105920e("MicroMsg.ChattingItemImgTo", "[updateImgUploadProgress] tag is null");
                return;
            }
            C74158d dVar = (C74158d) cVar;
            if (i3 < 100 || dVar.f217680c.getVisibility() == 0) {
                TextView textView = dVar.f217680c;
                textView.setText("" + i3 + "%");
                if (C74023i.m87878T()) {
                    C74023i.m87884j0(dVar, false, false);
                } else {
                    C74023i.m87884j0(dVar, true, false);
                }
                dVar.f217680c.setVisibility(0);
                View view = dVar.f217682e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ChattingItemImgTo", "updateImgUploadProgress", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ChattingItemImgTo", "updateImgUploadProgress", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: p0 */
        public static void m88311p0(C74023i.C74026c cVar, boolean z) {
            if (z && (cVar instanceof C74158d)) {
                C74158d dVar = (C74158d) cVar;
                C74023i.m87884j0(dVar, false, false);
                dVar.f217680c.setVisibility(4);
                View view = dVar.f217682e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ChattingItemImgTo", "updateImgUploadStatus", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ChattingItemImgTo", "updateImgUploadStatus", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6961tg);
            C74158d dVar = new C74158d();
            dVar.mo103208a(n4Var, false);
            n4Var.setTag(dVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (100 == menuItem.getItemId()) {
                C74152o6.m88298b(f4Var, this, bVar);
                return false;
            } else if (131 == menuItem.getItemId()) {
                C74152o6.m88299c(bVar, menuItem, f4Var);
                return false;
            } else if (123 == menuItem.getItemId()) {
                C59136a.f169139a.mo84347b(f4Var, 1);
                return false;
            } else {
                ((C79386v0) bVar.f193278b.mo102812a(C79386v0.class)).mo102594u(menuItem, f4Var);
                return false;
            }
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            Class cls = C98201k.class;
            if (C97625j3.m125812b().mo105883I() && view != null) {
                int b = ((C74243t8) view.getTag()).mo103252b();
                C92836k kVar = null;
                if (f4Var.getMsgId() > 0) {
                    kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(f4Var.mo108768t(), f4Var.getMsgId());
                }
                if ((kVar == null || kVar.f267374a <= 0) && f4Var.mo108774y2() > 0) {
                    kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
                }
                if (kVar != null && kVar.mo127145p() && kVar.f267377d == 0) {
                    kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127173TO(kVar.f267390q);
                }
                C92836k kVar2 = kVar;
                if (!C75569c4.m90688u(f4Var) && !C75569c4.m90687t(f4Var)) {
                    e0Var.mo107136c(b, 110, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
                if (f4Var.getStatus() == 5) {
                    e0Var.mo107136c(b, 103, 0, view.getContext().getString(C0966R.string.f360269bb2), C0966R.raw.icons_filled_refresh);
                }
                if (C47984k.m53330d() && !this.f217672v.mo91584y()) {
                    e0Var.add(b, 114, 0, (CharSequence) view.getContext().getString(C0966R.string.b9w));
                }
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if (kVar2.f267388o != -1) {
                    MenuItem c = e0Var.mo107136c(b, 131, 0, view.getContext().getString(C0966R.string.b8g), C0966R.raw.icons_filled_pencil);
                    int[] iArr = new int[2];
                    int width = view.getWidth();
                    int height = view.getHeight();
                    view.getLocationOnScreen(iArr);
                    Intent intent = new Intent();
                    intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
                    ((C76875f0) c).f224731z = intent;
                }
                ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = f4Var.getMsgId();
                exDeviceHaveBindNetworkDeviceEvent.publish();
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                    e0Var.mo107136c(b, 129, 0, view.getContext().getString(C0966R.string.b_8), C0966R.raw.icons_filled_open);
                }
                if (!f4Var.mo100967F3() && f4Var.mo100979R3() && ((f4Var.mo101000j3() || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f217672v) && mo103081O(f4Var.mo108768t()) && !this.f217672v.mo91580u())) {
                    e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                }
                if (!this.f217672v.mo91584y()) {
                    if (!f4Var.mo100967F3() && f4Var.mo100979R3() && ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f217672v) && mo103081O(f4Var.mo108768t()) && !this.f217672v.mo91580u())) {
                        e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                    }
                    e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_0), C0966R.raw.icons_filled_delete);
                }
                if (C75569c4.m90690w(f4Var) || C75569c4.m90689v(f4Var) || C75569c4.m90662H(f4Var)) {
                    e0Var.clear();
                    if (!this.f217672v.mo91584y()) {
                        e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_0), C0966R.raw.icons_filled_delete);
                    }
                }
                if (C75569c4.m90663I(f4Var)) {
                    SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new SpamMediaToEmojiOPStruct();
                    spamMediaToEmojiOPStruct.f194459d = f4Var.mo108774y2();
                    spamMediaToEmojiOPStruct.f194460e = (long) f4Var.getType();
                    spamMediaToEmojiOPStruct.f194461f = (long) C75569c4.m90678k(f4Var);
                    spamMediaToEmojiOPStruct.f194462g = 3;
                    spamMediaToEmojiOPStruct.mo86054n();
                }
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            f4Var.unsetOmittedFailResend();
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
            ((C79386v0) bVar.f193278b.mo102812a(C79386v0.class)).mo102592d(f4Var);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x017e  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0182  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x024c  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x024e  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x029a  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x029d  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x02a5  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x02a8  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0301  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x030c  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0317  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0353  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r31, ck3.C67391b r32, com.tencent.p014mm.storage.C72963f4 r33, java.lang.String r34) {
            /*
                r30 = this;
                r8 = r30
                r9 = r31
                r10 = r32
                r11 = r33
                java.lang.Class<zj3.l> r0 = zj3.C79368l.class
                java.lang.Class<gt.k> r1 = p158gt.C98201k.class
                r8.f217672v = r10
                r12 = r9
                com.tencent.mm.ui.chatting.viewitems.o6$d r12 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6.C74158d) r12
                com.tencent.mm.modelimage.i0 r2 = com.tencent.p014mm.modelimage.C68118i0.m80524a()
                long r3 = r33.getMsgId()
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$e> r2 = r2.f195776c
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                boolean r2 = r2.containsKey(r3)
                di3.d r3 = di3.C86312j.m106911c(r1)
                gt.k r3 = (p158gt.C98201k) r3
                gt.m r3 = r3.mo137277xi()
                com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
                com.tencent.mm.modelimage.k r3 = r3.mo127198uP(r11)
                if (r3 == 0) goto L_0x006f
                if (r2 != 0) goto L_0x006f
                com.tencent.mm.modelimage.i0 r6 = com.tencent.p014mm.modelimage.C68118i0.m80524a()
                long r13 = r3.f267374a
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$d> r6 = r6.f195774a
                java.lang.Long r7 = java.lang.Long.valueOf(r13)
                boolean r6 = r6.containsKey(r7)
                if (r6 == 0) goto L_0x006a
                com.tencent.mm.modelimage.i0 r6 = com.tencent.p014mm.modelimage.C68118i0.m80524a()
                long r13 = r3.f267374a
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$d> r6 = r6.f195774a
                java.lang.Long r7 = java.lang.Long.valueOf(r13)
                java.lang.Object r6 = r6.get(r7)
                com.tencent.mm.modelimage.i0$d r6 = (com.tencent.p014mm.modelimage.C68118i0.C68122d) r6
                long r13 = r6.f195782a
                int r7 = (int) r13
                long r13 = r6.f195783b
                int r6 = (int) r13
                if (r7 != 0) goto L_0x0064
                goto L_0x0068
            L_0x0064:
                if (r6 != r7) goto L_0x006f
                if (r7 == 0) goto L_0x006f
            L_0x0068:
                r6 = 1
                goto L_0x0070
            L_0x006a:
                boolean r6 = com.tencent.p014mm.modelimage.C68126l.m80527a(r3)
                goto L_0x0070
            L_0x006f:
                r6 = 0
            L_0x0070:
                boolean r7 = eb0.C75569c4.m90663I(r33)
                r13 = 1065353216(0x3f800000, float:1.0)
                if (r7 != 0) goto L_0x007b
                r7 = 1065353216(0x3f800000, float:1.0)
                goto L_0x007d
            L_0x007b:
                float r7 = eb0.C75569c4.f222001d
            L_0x007d:
                java.lang.String r14 = "MicroMsg.ChattingItemImgTo"
                r15 = 2
                int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r13 == 0) goto L_0x00bd
                com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct r13 = new com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct
                r13.<init>()
                long r4 = r33.mo108774y2()
                r13.f194459d = r4
                int r4 = r33.getType()
                long r4 = (long) r4
                r13.f194460e = r4
                int r4 = eb0.C75569c4.m90678k(r33)
                long r4 = (long) r4
                r13.f194461f = r4
                r4 = 1
                r13.f194462g = r4
                r13.mo86054n()
                java.lang.Object[] r4 = new java.lang.Object[r15]
                long r16 = r33.getMsgId()
                java.lang.Long r5 = java.lang.Long.valueOf(r16)
                r13 = 0
                r4[r13] = r5
                java.lang.Float r5 = java.lang.Float.valueOf(r7)
                r13 = 1
                r4[r13] = r5
                java.lang.String r5 = "img need scale:%s, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r5, r4)
            L_0x00bd:
                di3.d r1 = di3.C86312j.m106911c(r1)
                gt.k r1 = (p158gt.C98201k) r1
                gt.m r1 = r1.mo137277xi()
                android.widget.ImageView r4 = r12.f217679b
                java.lang.String r18 = r33.mo108765s2()
                android.app.Activity r5 = r32.mo91565f()
                float r5 = kg3.C76577a.m92156g(r5)
                float r19 = r5 * r7
                int r5 = r11.f230725H
                int r7 = r11.f230726I
                r22 = 1
                r23 = 2131231570(0x7f080352, float:1.8079225E38)
                android.widget.ImageView r13 = r12.f217681d
                r25 = 2131231565(0x7f08034d, float:1.8079215E38)
                r26 = 0
                r27 = 1
                if (r6 == 0) goto L_0x00f0
                r16 = 0
                r28 = r16
                goto L_0x00f4
            L_0x00f0:
                android.view.View r15 = r12.f217682e
                r28 = r15
            L_0x00f4:
                r16 = r1
                com.tencent.mm.modelimage.m r16 = (com.tencent.p014mm.modelimage.C92839m) r16
                r17 = r4
                r20 = r5
                r21 = r7
                r24 = r13
                boolean r1 = r16.Bx0(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                if (r1 != 0) goto L_0x0116
                android.widget.ImageView r1 = r12.f217679b
                android.app.Activity r4 = r32.mo91565f()
                r5 = 2131231565(0x7f08034d, float:1.8079215E38)
                android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r4, r5)
                r1.setImageDrawable(r4)
            L_0x0116:
                r1 = 8
                if (r3 != 0) goto L_0x016f
                if (r2 == 0) goto L_0x011d
                goto L_0x016f
            L_0x011d:
                java.lang.String r2 = "filling finished"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
                android.view.View r2 = r12.f217682e
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
                r3.mo10233c(r4)
                java.lang.Object[] r17 = r3.mo10232b()
                java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ChattingItemImgTo"
                java.lang.String r19 = "filling"
                java.lang.String r20 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r2
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                r4 = 0
                java.lang.Object r3 = r3.mo10231a(r4)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ChattingItemImgTo"
                java.lang.String r18 = "filling"
                java.lang.String r19 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                r2 = 0
                r8.mo103093i0(r12, r2, r2)
                android.widget.TextView r2 = r12.f217680c
                r2.setVisibility(r1)
                goto L_0x02e9
            L_0x016f:
                r4 = 5
                if (r6 != 0) goto L_0x017b
                int r5 = r33.getStatus()
                if (r5 != r4) goto L_0x0179
                goto L_0x017b
            L_0x0179:
                r5 = 0
                goto L_0x017c
            L_0x017b:
                r5 = 1
            L_0x017c:
                if (r2 == 0) goto L_0x0182
                java.lang.String r13 = "0%"
                goto L_0x0247
            L_0x0182:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r15 = ""
                r13.append(r15)
                if (r3 != 0) goto L_0x0190
                goto L_0x023a
            L_0x0190:
                int r1 = r3.f267377d
                int r4 = r3.f267376c
                com.tencent.mm.modelimage.i0 r15 = com.tencent.p014mm.modelimage.C68118i0.m80524a()
                long r7 = r3.f267374a
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$d> r15 = r15.f195774a
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                boolean r7 = r15.containsKey(r7)
                if (r7 == 0) goto L_0x01c3
                com.tencent.mm.modelimage.i0 r1 = com.tencent.p014mm.modelimage.C68118i0.m80524a()
                long r7 = r3.f267374a
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$d> r1 = r1.f195774a
                java.lang.Long r4 = java.lang.Long.valueOf(r7)
                java.lang.Object r1 = r1.get(r4)
                com.tencent.mm.modelimage.i0$d r1 = (com.tencent.p014mm.modelimage.C68118i0.C68122d) r1
                long r7 = r1.f195782a
                int r4 = (int) r7
                long r7 = r1.f195783b
                int r1 = (int) r7
                r29 = r4
                r4 = r1
                r1 = r29
            L_0x01c3:
                boolean r7 = r3.mo127145p()
                if (r7 == 0) goto L_0x020b
                com.tencent.mm.modelimage.m r1 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
                int r4 = r3.f267390q
                com.tencent.mm.modelimage.k r1 = r1.mo127173TO(r4)
                com.tencent.mm.modelimage.i0 r4 = com.tencent.p014mm.modelimage.C68118i0.m80524a()
                int r7 = r3.f267390q
                long r7 = (long) r7
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$d> r4 = r4.f195774a
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                boolean r4 = r4.containsKey(r7)
                if (r4 == 0) goto L_0x0200
                com.tencent.mm.modelimage.i0 r1 = com.tencent.p014mm.modelimage.C68118i0.m80524a()
                int r4 = r3.f267390q
                long r7 = (long) r4
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$d> r1 = r1.f195774a
                java.lang.Long r4 = java.lang.Long.valueOf(r7)
                java.lang.Object r1 = r1.get(r4)
                com.tencent.mm.modelimage.i0$d r1 = (com.tencent.p014mm.modelimage.C68118i0.C68122d) r1
                long r7 = r1.f195782a
                int r4 = (int) r7
                long r7 = r1.f195783b
                int r1 = (int) r7
                goto L_0x0204
            L_0x0200:
                int r4 = r1.f267377d
                int r1 = r1.f267376c
            L_0x0204:
                r7 = 3
                r29 = r4
                r4 = r1
                r1 = r29
                goto L_0x020c
            L_0x020b:
                r7 = 3
            L_0x020c:
                java.lang.Object[] r8 = new java.lang.Object[r7]
                long r9 = r3.f267374a
                java.lang.Long r7 = java.lang.Long.valueOf(r9)
                r9 = 0
                r8[r9] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                r9 = 1
                r8[r9] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                r9 = 2
                r8[r9] = r7
                java.lang.String r7 = "MicroMsg.ImgInfoLogic"
                java.lang.String r9 = "getUploadPercentage, %s, %s, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r8)
                if (r1 <= 0) goto L_0x023a
                if (r4 < r1) goto L_0x0233
                r1 = 100
                goto L_0x023b
            L_0x0233:
                r7 = 100
                int r4 = r4 * 100
                int r1 = r4 / r1
                goto L_0x023b
            L_0x023a:
                r1 = 0
            L_0x023b:
                r13.append(r1)
                java.lang.String r1 = "%"
                r13.append(r1)
                java.lang.String r13 = r13.toString()
            L_0x0247:
                r1 = 7
                java.lang.Object[] r1 = new java.lang.Object[r1]
                if (r3 == 0) goto L_0x024e
                r3 = 1
                goto L_0x024f
            L_0x024e:
                r3 = 0
            L_0x024f:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r4 = 0
                r1[r4] = r3
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
                r3 = 2
                r1[r3] = r2
                int r2 = r33.getStatus()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 3
                r1[r3] = r2
                r2 = 4
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
                r1[r2] = r3
                r2 = 5
                r1[r2] = r13
                r2 = 6
                long r3 = r33.getMsgId()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "filling ii:%s tempMsg:%s isUploadCompleted:%s msgStatus:%s hideMask:%s percentStr:%s id:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r1)
                android.widget.TextView r1 = r12.f217680c
                r1.setText(r13)
                r1 = r5 ^ 1
                r2 = 0
                r8 = r30
                r8.mo103093i0(r12, r1, r2)
                android.widget.TextView r1 = r12.f217680c
                if (r5 == 0) goto L_0x029d
                r2 = 8
                goto L_0x029e
            L_0x029d:
                r2 = 0
            L_0x029e:
                r1.setVisibility(r2)
                android.view.View r1 = r12.f217682e
                if (r5 == 0) goto L_0x02a8
                r2 = 8
                goto L_0x02a9
            L_0x02a8:
                r2 = 0
            L_0x02a9:
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.mo10233c(r2)
                java.lang.Object[] r18 = r3.mo10232b()
                java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ChattingItemImgTo"
                java.lang.String r20 = "filling"
                java.lang.String r21 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                r17 = r1
                j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
                r2 = 0
                java.lang.Object r3 = r3.mo10231a(r2)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r2 = r3.intValue()
                r1.setVisibility(r2)
                java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ChattingItemImgTo"
                java.lang.String r19 = "filling"
                java.lang.String r20 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            L_0x02e9:
                android.view.View r1 = r12.clickArea
                com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r3 = r32.mo91583x()
                java.lang.String r4 = r33.mo108768t()
                r2.<init>(r11, r3, r12, r4)
                r1.setTag(r2)
                android.view.View r1 = r12.clickArea
                com.tencent.mm.ui.chatting.viewitems.o6$c r2 = r8.f217673w
                if (r2 != 0) goto L_0x030c
                com.tencent.mm.ui.chatting.viewitems.o6$c r2 = new com.tencent.mm.ui.chatting.viewitems.o6$c
                ck3.b r3 = r8.f217672v
                r4 = 0
                r2.<init>(r3, r8, r4)
                r8.f217673w = r2
                goto L_0x030d
            L_0x030c:
                r4 = 0
            L_0x030d:
                com.tencent.mm.ui.chatting.viewitems.o6$c r2 = r8.f217673w
                r2.f217676g = r4
                boolean r2 = eb0.C75569c4.m90663I(r33)
                if (r2 == 0) goto L_0x031c
                com.tencent.mm.ui.chatting.viewitems.o6$c r2 = r8.f217673w
                r3 = 2
                r2.f217676g = r3
            L_0x031c:
                com.tencent.mm.ui.chatting.viewitems.o6$c r2 = r8.f217673w
                r1.setOnClickListener(r2)
                android.view.View r1 = r12.clickArea
                r9 = r32
                com.tencent.mm.ui.chatting.manager.a r2 = r9.f193278b
                xi.d r2 = r2.mo102812a(r0)
                zj3.l r2 = (zj3.C79368l) r2
                com.tencent.mm.ui.chatting.h2 r2 = r2.mo108189Z4()
                r1.setOnTouchListener(r2)
                android.view.View r1 = r12.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r2 = r8.mo103098p(r9)
                r1.setOnLongClickListener(r2)
                android.widget.ImageView r1 = r12.f217679b
                android.content.res.Resources r2 = r32.mo91572m()
                r3 = 2131823488(0x7f110b80, float:1.9279777E38)
                java.lang.String r2 = r2.getString(r3)
                r1.setContentDescription(r2)
                boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r1 == 0) goto L_0x03a7
                r1 = 0
                r8.mo103093i0(r12, r1, r1)
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                long r4 = r33.getMsgId()
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                r3[r1] = r2
                int r1 = r33.getStatus()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r3[r2] = r1
                java.lang.String r1 = "MicroMsg.ContactInfoUI"
                java.lang.String r2 = "[oneliang]%s,%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r3)
                boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r1 == 0) goto L_0x03a7
                int r1 = r33.getStatus()
                r2 = 2
                if (r1 != r2) goto L_0x039e
                com.tencent.mm.ui.chatting.manager.a r1 = r9.f193278b
                xi.d r0 = r1.mo102812a(r0)
                zj3.l r0 = (zj3.C79368l) r0
                long r1 = r33.getMsgId()
                boolean r0 = r8.mo103080N(r0, r1)
                if (r0 == 0) goto L_0x039e
                android.widget.ImageView r0 = r12.f217683f
                if (r0 == 0) goto L_0x03a7
                r1 = 0
                r0.setVisibility(r1)
                goto L_0x03a7
            L_0x039e:
                android.widget.ImageView r0 = r12.f217683f
                if (r0 == 0) goto L_0x03a7
                r1 = 8
                r0.setVisibility(r1)
            L_0x03a7:
                java.lang.String r3 = r32.mo91573n()
                r4 = 0
                boolean r5 = r32.mo91583x()
                r0 = r30
                r1 = r12
                r2 = r33
                r6 = r32
                r7 = r30
                r0.mo103088f0(r1, r2, r3, r4, r5, r6, r7)
                com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6.m88297a(r11, r8, r9, r12)
                r0 = r31
                android.view.View r0 = r0.convertView
                com.tencent.mm.ui.chatting.viewitems.o6$b$a r1 = new com.tencent.mm.ui.chatting.viewitems.o6$b$a
                r1.<init>(r8, r11)
                zp3.C23564m.m28138h(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6.C74155b.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if (z) {
                return i == 3 || i == 23 || i == 13 || i == 39 || i == 33;
            }
            return false;
        }

        /* renamed from: l0 */
        public boolean mo103033l0() {
            return C117731d.m166007c().mo182440a(new C35480i()) == 1;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.o6$d */
    public static class C74158d extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f217679b;

        /* renamed from: c */
        public TextView f217680c;

        /* renamed from: d */
        public ImageView f217681d;

        /* renamed from: e */
        public View f217682e;

        /* renamed from: f */
        public ImageView f217683f;

        /* renamed from: g */
        public TextView f217684g;

        /* renamed from: h */
        public LinearLayout f217685h;

        /* renamed from: a */
        public C74023i.C74026c mo103208a(View view, boolean z) {
            super.create(view);
            this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
            this.f217679b = (ImageView) view.findViewById(C0966R.C0970id.b4c);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            this.f217682e = view.findViewById(C0966R.C0970id.l16);
            this.f217685h = (LinearLayout) view.findViewById(C0966R.C0970id.o5g);
            if (z) {
                this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
                this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.c_q);
            } else {
                this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
                this.f217680c = (TextView) view.findViewById(C0966R.C0970id.l15);
                this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
                this.f217683f = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            }
            this.f217681d = (ImageView) view.findViewById(C0966R.C0970id.b4e);
            this.f217684g = (TextView) view.findViewById(C0966R.C0970id.b3g);
            return this;
        }

        public View getMainContainerView() {
            return this.f217679b;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0097, code lost:
        r2 = r1.field_appName;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m88297a(com.tencent.p014mm.storage.C72963f4 r14, com.tencent.p014mm.p136ui.chatting.viewitems.C74023i r15, ck3.C67391b r16, com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6.C74158d r17) {
        /*
            r8 = r15
            r9 = r16
            r10 = r17
            java.lang.Class<ym.l> r0 = p763ym.C79138l.class
            java.lang.String r1 = com.tencent.p014mm.modelimage.C1300x.m1391b(r14)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r3 = 0
            r4 = 8
            if (r2 != 0) goto L_0x0069
            com.tencent.mm.pluginsdk.ui.chat.x1$$b r0 = new com.tencent.mm.pluginsdk.ui.chat.x1$$b
            r0.<init>()
            r0.f212264a = r1
            boolean r2 = r16.mo91582w()
            r0.f212265b = r2
            android.widget.LinearLayout r2 = r10.f217685h
            r15.mo103075I(r9, r2, r0)
            android.widget.LinearLayout r0 = r10.f217685h
            r0.setVisibility(r3)
            android.widget.TextView r0 = r10.f217684g
            r0.setVisibility(r4)
            long r2 = r14.getMsgId()
            boolean r0 = r16.mo91582w()
            mk3.a r4 = mk3.C21506a.f60891e
            r4.getClass()
            rx3.g r4 = mk3.C21506a.f60892f
            r5 = r4
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.util.HashSet r5 = (java.util.HashSet) r5
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0054
            goto L_0x00fa
        L_0x0054:
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.util.HashSet r4 = (java.util.HashSet) r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.add(r2)
            r2 = 1
            mk3.C21506a.m24351Y5(r2, r0, r1)
            goto L_0x00fa
        L_0x0069:
            android.widget.LinearLayout r1 = r10.f217685h
            r1.setVisibility(r4)
            r1 = 2
            java.lang.String r2 = r14.getContent()
            com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80423v(r1, r2)
            if (r5 == 0) goto L_0x00f5
            java.lang.String r1 = r5.f195562d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00f5
            java.lang.String r11 = r5.f195562d
            di3.d r1 = di3.C86312j.m106911c(r0)
            ym.l r1 = (p763ym.C79138l) r1
            int r2 = r5.f195480E
            com.tencent.mm.pluginsdk.model.app.j r1 = r1.mo74003UV(r11, r2)
            r6 = r14
            if (r1 == 0) goto L_0x0095
            r15.mo103095k(r9, r5, r14)
        L_0x0095:
            if (r1 == 0) goto L_0x00a9
            java.lang.String r2 = r1.field_appName
            if (r2 == 0) goto L_0x00a9
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 > 0) goto L_0x00a6
            goto L_0x00a9
        L_0x00a6:
            java.lang.String r2 = r1.field_appName
            goto L_0x00ab
        L_0x00a9:
            java.lang.String r2 = r5.f195484F
        L_0x00ab:
            boolean r7 = r15.mo103084W(r2)
            if (r7 == 0) goto L_0x00ef
            android.widget.TextView r4 = r10.f217684g
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.l r0 = (p763ym.C79138l) r0
            android.app.Activity r7 = r16.mo91565f()
            java.lang.String r0 = r0.mo74019xG(r7, r1, r2)
            r4.setText(r0)
            android.widget.TextView r0 = r10.f217684g
            r0.setVisibility(r3)
            if (r1 == 0) goto L_0x00e4
            boolean r0 = r1.mo69359k()
            if (r0 == 0) goto L_0x00e4
            android.widget.TextView r2 = r10.f217684g
            java.lang.String r7 = r1.field_packageName
            long r12 = r14.mo108774y2()
            r0 = r15
            r1 = r16
            r3 = r14
            r4 = r5
            r5 = r7
            r6 = r12
            r0.mo103074H(r1, r2, r3, r4, r5, r6)
            goto L_0x00e9
        L_0x00e4:
            android.widget.TextView r0 = r10.f217684g
            r15.mo103076J(r9, r0, r11)
        L_0x00e9:
            android.widget.TextView r0 = r10.f217684g
            r15.mo103079M(r9, r0, r11)
            goto L_0x00fa
        L_0x00ef:
            android.widget.TextView r0 = r10.f217684g
            r0.setVisibility(r4)
            goto L_0x00fa
        L_0x00f5:
            android.widget.TextView r0 = r10.f217684g
            r0.setVisibility(r4)
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6.m88297a(com.tencent.mm.storage.f4, com.tencent.mm.ui.chatting.viewitems.i, ck3.b, com.tencent.mm.ui.chatting.viewitems.o6$d):void");
    }

    /* renamed from: b */
    public static void m88298b(C72963f4 f4Var, C74023i iVar, C67391b bVar) {
        C44561j GW;
        C68070l.C68072b v = C68070l.C68072b.m80423v(2, f4Var.getContent());
        if (v != null && !Util.isNullOrNil(v.f195562d) && (GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(v.f195562d, false)) != null && GW.mo69359k()) {
            iVar.getClass();
            C48477m a = C48477m.C13789a.m13091a();
            if (a != null) {
                a.Rw0(bVar.mo91565f(), v.f195562d, GW.field_packageName, iVar.mo103097o(bVar, f4Var), v.f195582i, v.f195536V, bVar.mo91583x() ? 2 : 1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88299c(ck3.C67391b r23, android.view.MenuItem r24, com.tencent.p014mm.storage.C72963f4 r25) {
        /*
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            int r1 = r24.getItemId()
            r2 = 131(0x83, float:1.84E-43)
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x000f
            r3 = 0
            goto L_0x011e
        L_0x000f:
            java.lang.String r1 = "MicroMsg.ChattingItemImg"
            java.lang.String r2 = "long click go to photo eidt"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.content.Intent r2 = r24.getIntent()
            if (r2 != 0) goto L_0x0023
            java.lang.String r0 = "[LONGCLICK_MENU_PHOTO_EDIT] intent is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x011e
        L_0x0023:
            java.lang.String r5 = "img_gallery_width"
            int r20 = r2.getIntExtra(r5, r4)
            java.lang.String r5 = "img_gallery_height"
            int r21 = r2.getIntExtra(r5, r4)
            r5 = 2
            int[] r8 = new int[r5]
            java.lang.String r6 = "img_gallery_left"
            int r6 = r2.getIntExtra(r6, r4)
            r8[r4] = r6
            java.lang.String r6 = "img_gallery_top"
            int r2 = r2.getIntExtra(r6, r4)
            r8[r3] = r2
            boolean r2 = r23.mo91582w()
            if (r2 != 0) goto L_0x005d
            java.lang.Class<zj3.e> r2 = zj3.C79348e.class
            r6 = r23
            com.tencent.mm.ui.chatting.manager.a r7 = r6.f193278b
            xi.d r2 = r7.mo102812a(r2)
            zj3.e r2 = (zj3.C79348e) r2
            boolean r2 = r2.mo70075s4()
            if (r2 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r2 = 0
            goto L_0x0060
        L_0x005d:
            r6 = r23
        L_0x005f:
            r2 = 1
        L_0x0060:
            r7 = 0
            if (r2 == 0) goto L_0x006a
            java.lang.String r2 = r25.mo108768t()
            r18 = r2
            goto L_0x006c
        L_0x006a:
            r18 = r7
        L_0x006c:
            long r9 = r25.getMsgId()
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x008e
            di3.d r2 = di3.C86312j.m106911c(r0)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r7 = r25.mo108768t()
            long r9 = r25.getMsgId()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            com.tencent.mm.modelimage.k r7 = r2.mo127200vP(r7, r9)
        L_0x008e:
            if (r7 == 0) goto L_0x0096
            long r9 = r7.f267374a
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x00b6
        L_0x0096:
            long r9 = r25.mo108774y2()
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b6
            di3.d r2 = di3.C86312j.m106911c(r0)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r7 = r25.mo108768t()
            long r9 = r25.mo108774y2()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            com.tencent.mm.modelimage.k r7 = r2.mo127168NQ(r7, r9)
        L_0x00b6:
            java.lang.String r2 = ""
            if (r7 != 0) goto L_0x00bc
            r0 = r2
            goto L_0x00ce
        L_0x00bc:
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r9 = r7.f267378e
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.mo127174TY(r9, r2, r2, r3)
        L_0x00ce:
            if (r7 == 0) goto L_0x010d
            int r2 = r7.f267388o
            r7 = -1
            if (r2 == r7) goto L_0x010d
            int r2 = r25.getStatus()
            r7 = 5
            if (r2 == r7) goto L_0x010d
            java.lang.Object[] r2 = new java.lang.Object[r5]
            long r9 = r25.getMsgId()
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r2[r4] = r5
            r2[r3] = r0
            java.lang.String r4 = "[LONGCLICK_MENU_PHOTO_EDIT] msgId:%s imgFullPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r2)
            long r9 = r25.getMsgId()
            long r11 = r25.mo108774y2()
            java.lang.String r13 = r25.mo108768t()
            r14 = 0
            r15 = 0
            r16 = 0
            r22 = 1
            r6 = r23
            r7 = r25
            r1 = r8
            r8 = r0
            r19 = r1
            com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6.C74157c.m88323e(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22)
            goto L_0x011e
        L_0x010d:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            long r5 = r25.getMsgId()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0[r4] = r2
            java.lang.String r2 = "raw img not get successfully ,msgId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
        L_0x011e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6.m88299c(ck3.b, android.view.MenuItem, com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.o6$c */
    public static class C74157c extends C73684f2 {

        /* renamed from: f */
        public C74023i f217675f;

        /* renamed from: g */
        public int f217676g;

        /* renamed from: h */
        public boolean f217677h;

        /* renamed from: i */
        public boolean f217678i;

        public C74157c(C67391b bVar, C74023i iVar, boolean z) {
            super(bVar);
            this.f217676g = 0;
            this.f217677h = false;
            this.f217675f = iVar;
            this.f217678i = z;
        }

        /* renamed from: d */
        public static String m88322d(long j, String str, String str2) {
            String a = C86493v0.m107223a("" + j);
            boolean z = true;
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
            c.mo120962i("preUsername", str);
            c.mo120962i("preChatName", str2);
            C52558c b = C47984k.m53328b(str2);
            if (b == null || (!b.mo73506x2() && !b.mo73507y2())) {
                z = false;
            }
            c.mo120962i("Contact_Sub_Scene", Integer.valueOf((z || C72996z1.m85804J4(str2)) ? 5 : 3));
            c.mo120962i("Contact_Scene_Note", str2);
            return a;
        }

        /* renamed from: e */
        public static void m88323e(C67391b bVar, C72963f4 f4Var, String str, long j, long j2, String str2, int i, boolean z, long j3, String str3, int[] iArr, int i2, int i3, boolean z2) {
            m88324f(bVar, f4Var, str, j, j2, str2, i, z, j3, str3, iArr, i2, i3, z2, 0);
        }

        /* renamed from: f */
        public static void m88324f(C67391b bVar, C72963f4 f4Var, String str, long j, long j2, String str2, int i, boolean z, long j3, String str3, int[] iArr, int i2, int i3, boolean z2, int i4) {
            m88325g(bVar, f4Var, str, j, j2, str2, i, z, j3, str3, iArr, i2, i3, z2, i4, false);
        }

        /* renamed from: g */
        public static void m88325g(C67391b bVar, C72963f4 f4Var, String str, long j, long j2, String str2, int i, boolean z, long j3, String str3, int[] iArr, int i2, int i3, boolean z2, int i4, boolean z3) {
            C67391b bVar2 = bVar;
            long j4 = j2;
            int i5 = i4;
            Class cls = C79348e.class;
            Log.m105924i("MicroMsg.DesignerClickListener", "[ImageGalleryUI] showImgGallery");
            Intent intent = new Intent(bVar.mo91565f(), ImageGalleryUI.class);
            long j5 = j;
            intent.putExtra("img_gallery_msg_id", j);
            intent.putExtra("img_gallery_msg_svr_id", j4);
            intent.putExtra("show_search_chat_content_result", ((C79384u0) bVar2.f193278b.mo102812a(C79384u0.class)).mo102513x2());
            intent.putExtra("key_is_biz_chat", ((C79348e) bVar2.f193278b.mo102812a(cls)).mo70071q1());
            intent.putExtra("key_biz_chat_id", ((C79348e) bVar2.f193278b.mo102812a(cls)).mo70068i4());
            String str4 = str2;
            intent.putExtra("img_gallery_talker", str4);
            intent.putExtra("img_gallery_chatroom_name", str3);
            intent.putExtra("img_gallery_left", iArr[0]);
            int i6 = 1;
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", i2);
            intent.putExtra("img_gallery_height", i3);
            intent.putExtra("img_gallery_enter_from_chatting_ui", true);
            intent.putExtra("img_gallery_enter_PhotoEditUI", z2);
            intent.putExtra("msg_type", i5);
            if (z3) {
                intent.putExtra("img_preview_only", true);
            }
            if (i5 == 1) {
                intent.putExtra("show_enter_grid", false);
            }
            intent.putExtra("img_gallery_enter_from_appbrand_service_chatting_ui", C72996z1.m85804J4(str2));
            String r = bVar.mo91577r();
            if (f4Var.mo108769t2() == 1) {
                str4 = bVar.mo91573n();
            }
            Bundle bundle = new Bundle();
            if (bVar.mo91582w()) {
                bundle.putInt("stat_scene", 2);
            } else {
                if (C45628s0.m50738C(r)) {
                    i6 = 7;
                }
                bundle.putInt("stat_scene", i6);
            }
            bundle.putString("stat_msg_id", "msg_" + Long.toString(j2));
            bundle.putString("stat_chat_talker_username", r);
            bundle.putString("stat_send_msg_user", str4);
            intent.putExtra("_stat_obj", bundle);
            intent.putExtra("img_gallery_session_id", m88322d(j4, str4, r));
            BaseChattingUIFragment baseChattingUIFragment = bVar2.f193286j;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            BaseChattingUIFragment baseChattingUIFragment2 = baseChattingUIFragment;
            C117292a.m165358d(baseChattingUIFragment2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ImageClickListener", "showImgGallery", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;JJLjava/lang/String;IZJLjava/lang/String;[IIIZIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            baseChattingUIFragment.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ImageClickListener", "showImgGallery", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;JJLjava/lang/String;IZJLjava/lang/String;[IIIZIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar2.f193286j.overridePendingTransition(0, 0);
        }

        /* renamed from: a */
        public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
            C44561j GW;
            C74243t8 t8Var = (C74243t8) view.getTag();
            ((C77569h) C86312j.m106911c(C77569h.class)).mo35247zz(t8Var.f212238a);
            mo103206b(t8Var, view);
            C68070l.C68072b v = C68070l.C68072b.m80423v(2, f4Var.getContent());
            if (!(v == null || Util.isNullOrNil(v.f195562d) || this.f217675f == null || (GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(v.f195562d, false)) == null)) {
                C74023i iVar = this.f217675f;
                this.f217675f.mo103094j(bVar, v, iVar instanceof C74153a ? iVar.mo103097o(bVar, f4Var) : C75592q0.m90789s(), GW, f4Var.mo108774y2(), bVar.mo91577r());
            }
            C74023i.m87882c0(bVar, f4Var);
            if (!C72996z1.m85807K5(f4Var.mo108768t())) {
                boolean z = this.f217678i;
                long y2 = f4Var.mo108774y2();
                String t = f4Var.mo108768t();
                C75539a.C75540a aVar = C75539a.f221936f;
                if (aVar != null) {
                    ((C119157j) C119157j.f356862d).mo183885p(new C77841g((C77842h) aVar, y2, z, t), "KaraEvent");
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x01e9  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0211  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo103206b(com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8 r33, android.view.View r34) {
            /*
                r32 = this;
                r12 = r32
                r0 = r33
                r1 = r34
                java.lang.Class<gt.l> r2 = p158gt.C76053l.class
                java.lang.Class<gt.k> r3 = p158gt.C98201k.class
                com.tencent.mm.storage.f4 r14 = r0.f212238a
                com.tencent.mm.modelstat.a$a r4 = com.tencent.p014mm.modelstat.C68144a.C68145a.Click
                com.tencent.p014mm.modelstat.C68144a.m80547c(r14, r4)
                r4 = 2
                int[] r8 = new int[r4]
                if (r1 == 0) goto L_0x0030
                boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
                if (r6 == 0) goto L_0x0020
                r1.getLocationOnScreen(r8)
                goto L_0x0023
            L_0x0020:
                r1.getLocationInWindow(r8)
            L_0x0023:
                int r6 = r34.getWidth()
                int r1 = r34.getHeight()
                r28 = r1
                r27 = r6
                goto L_0x0034
            L_0x0030:
                r27 = 0
                r28 = 0
            L_0x0034:
                int r1 = r14.mo108769t2()
                r6 = 0
                r9 = 1
                if (r1 != r9) goto L_0x0074
                di3.d r1 = di3.C86312j.m106911c(r3)
                gt.k r1 = (p158gt.C98201k) r1
                gt.m r1 = r1.mo137277xi()
                java.lang.String r10 = r14.mo108768t()
                long r4 = r14.getMsgId()
                com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
                com.tencent.mm.modelimage.k r1 = r1.mo127200vP(r10, r4)
                long r4 = r1.f267374a
                int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r10 != 0) goto L_0x008c
                di3.d r1 = di3.C86312j.m106911c(r3)
                gt.k r1 = (p158gt.C98201k) r1
                gt.m r1 = r1.mo137277xi()
                java.lang.String r4 = r14.mo108768t()
                long r9 = r14.mo108774y2()
                com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
                com.tencent.mm.modelimage.k r1 = r1.mo127168NQ(r4, r9)
                goto L_0x008c
            L_0x0074:
                di3.d r1 = di3.C86312j.m106911c(r3)
                gt.k r1 = (p158gt.C98201k) r1
                gt.m r1 = r1.mo137277xi()
                java.lang.String r4 = r14.mo108768t()
                long r9 = r14.mo108774y2()
                com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
                com.tencent.mm.modelimage.k r1 = r1.mo127168NQ(r4, r9)
            L_0x008c:
                java.lang.String r4 = r14.getContent()
                r5 = 0
                java.lang.String r9 = "msg"
                java.util.Map r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r4, r9, r5)
                if (r4 == 0) goto L_0x00a8
                java.lang.String r5 = ".msg.img.$hdlength"
                java.lang.Object r5 = r4.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r6)
                r23 = r9
                goto L_0x00aa
            L_0x00a8:
                r23 = r6
            L_0x00aa:
                java.lang.String r4 = com.tencent.p014mm.modelimage.C1300x.m1392c(r4)
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r5 != 0) goto L_0x00be
                ck3.b r5 = r12.f216339d
                boolean r5 = r5.mo91582w()
                r9 = 2
                mk3.C21506a.m24351Y5(r9, r5, r4)
            L_0x00be:
                eb0.c r4 = eb0.C97625j3.m125812b()
                boolean r4 = r4.mo105883I()
                if (r4 != 0) goto L_0x00db
                ck3.b r0 = r12.f216339d
                android.app.Activity r0 = r0.mo91565f()
                ck3.b r1 = r12.f216339d
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
                android.view.View r1 = r1.getContentView()
                nj3.C76912y0.m92771j(r0, r1)
                goto L_0x02ae
            L_0x00db:
                int r4 = r14.mo108769t2()
                java.lang.String r5 = ""
                r9 = 1
                if (r4 != r9) goto L_0x0182
                di3.d r2 = di3.C86312j.m106911c(r2)
                gt.l r2 = (p158gt.C76053l) r2
                java.lang.String r2 = r2.mo106262y8(r1)
                di3.d r4 = di3.C86312j.m106911c(r3)
                gt.k r4 = (p158gt.C98201k) r4
                gt.m r4 = r4.mo137277xi()
                com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
                java.lang.String r15 = r4.mo127174TY(r2, r5, r5, r9)
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r15)
                if (r2 == 0) goto L_0x012b
                boolean r21 = r1.mo127145p()
                ck3.b r13 = r12.f216339d
                long r2 = r1.f267387n
                long r4 = r1.f267375b
                java.lang.String r6 = r0.f217968b
                r20 = r6
                boolean r22 = r1.mo127145p()
                java.lang.String r0 = r0.f217971e
                r25 = r0
                r29 = 0
                int r0 = r12.f217676g
                r30 = r0
                r16 = r2
                r18 = r4
                r26 = r8
                m88324f(r13, r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30)
                goto L_0x02ae
            L_0x012b:
                java.lang.String r2 = r1.f267378e
                di3.d r3 = di3.C86312j.m106911c(r3)
                gt.k r3 = (p158gt.C98201k) r3
                gt.m r3 = r3.mo137277xi()
                com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
                r4 = 1
                java.lang.String r15 = r3.mo127174TY(r2, r5, r5, r4)
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r15)
                if (r2 == 0) goto L_0x0169
                ck3.b r13 = r12.f216339d
                long r2 = r1.f267387n
                long r4 = r1.f267375b
                java.lang.String r6 = r0.f217968b
                r20 = r6
                r21 = 0
                boolean r22 = r1.mo127145p()
                java.lang.String r0 = r0.f217971e
                r25 = r0
                r29 = 0
                int r0 = r12.f217676g
                r30 = r0
                r16 = r2
                r18 = r4
                r26 = r8
                m88324f(r13, r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30)
                goto L_0x02ae
            L_0x0169:
                long r1 = r14.getMsgId()
                long r3 = r14.mo108774y2()
                java.lang.String r5 = r0.f217968b
                r6 = 0
                java.lang.String r7 = r0.f217971e
                r11 = 0
                r0 = r32
                r9 = r27
                r10 = r28
                r0.mo103207c(r1, r3, r5, r6, r7, r8, r9, r10, r11)
                goto L_0x02ae
            L_0x0182:
                boolean r11 = r12.f217677h
                boolean r4 = r1.mo127146q()
                java.lang.String r9 = "retry downloadImg, %d"
                java.lang.String r10 = "MicroMsg.DesignerClickListener"
                if (r4 == 0) goto L_0x026a
                java.lang.String r4 = r1.f267378e
                boolean r15 = r1.mo127145p()
                if (r15 == 0) goto L_0x01ce
                di3.d r2 = di3.C86312j.m106911c(r2)
                gt.l r2 = (p158gt.C76053l) r2
                com.tencent.mm.modelimage.k r2 = r2.mo106261jD(r1)
                if (r2 == 0) goto L_0x01ce
                r16 = r14
                long r13 = r2.f267374a
                int r17 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r17 <= 0) goto L_0x01d0
                boolean r6 = r2.mo127146q()
                if (r6 == 0) goto L_0x01d0
                di3.d r6 = di3.C86312j.m106911c(r3)
                gt.k r6 = (p158gt.C98201k) r6
                gt.m r6 = r6.mo137277xi()
                java.lang.String r7 = r2.f267378e
                com.tencent.mm.modelimage.m r6 = (com.tencent.p014mm.modelimage.C92839m) r6
                r13 = 1
                java.lang.String r6 = r6.mo127174TY(r7, r5, r5, r13)
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
                if (r6 == 0) goto L_0x01d0
                java.lang.String r4 = r2.f267378e
                r21 = 1
                goto L_0x01d2
            L_0x01ce:
                r16 = r14
            L_0x01d0:
                r21 = 0
            L_0x01d2:
                di3.d r2 = di3.C86312j.m106911c(r3)
                gt.k r2 = (p158gt.C98201k) r2
                gt.m r2 = r2.mo137277xi()
                com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
                r6 = 1
                java.lang.String r2 = r2.mo127174TY(r4, r5, r5, r6)
                boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
                if (r4 == 0) goto L_0x0211
                ck3.b r13 = r12.f216339d
                long r3 = r1.f267387n
                long r5 = r1.f267375b
                java.lang.String r7 = r0.f217968b
                r20 = r7
                boolean r22 = r1.mo127145p()
                java.lang.String r0 = r0.f217971e
                r25 = r0
                r29 = 0
                int r0 = r12.f217676g
                r30 = r0
                r14 = r16
                r15 = r2
                r16 = r3
                r18 = r5
                r26 = r8
                r31 = r11
                m88325g(r13, r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31)
                goto L_0x02ae
            L_0x0211:
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                long r4 = r1.f267374a
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r5 = 0
                r2[r5] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "SERVERID://"
                r2.append(r4)
                long r6 = r16.mo108774y2()
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                r1.mo127147r(r2)
                r1.mo127129F(r5)
                r1.mo127127D(r5)
                di3.d r2 = di3.C86312j.m106911c(r3)
                gt.k r2 = (p158gt.C98201k) r2
                gt.m r2 = r2.mo137277xi()
                long r3 = r1.f267374a
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
                r2.Dx0(r3, r1)
                long r1 = r16.getMsgId()
                long r3 = r16.mo108774y2()
                java.lang.String r5 = r0.f217968b
                r6 = 0
                java.lang.String r7 = r0.f217971e
                r0 = r32
                r9 = r27
                r10 = r28
                r0.mo103207c(r1, r3, r5, r6, r7, r8, r9, r10, r11)
                goto L_0x02ae
            L_0x026a:
                r16 = r14
                int r2 = r1.f267388o
                r4 = -1
                if (r2 != r4) goto L_0x0298
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                long r4 = r1.f267374a
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r5 = 0
                r2[r5] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r2)
                r1.mo127127D(r5)
                di3.d r2 = di3.C86312j.m106911c(r3)
                gt.k r2 = (p158gt.C98201k) r2
                gt.m r2 = r2.mo137277xi()
                long r3 = r1.f267374a
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
                r2.Dx0(r3, r1)
            L_0x0298:
                long r1 = r16.getMsgId()
                long r3 = r16.mo108774y2()
                java.lang.String r5 = r0.f217968b
                r6 = 0
                java.lang.String r7 = r0.f217971e
                r0 = r32
                r9 = r27
                r10 = r28
                r0.mo103207c(r1, r3, r5, r6, r7, r8, r9, r10, r11)
            L_0x02ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6.C74157c.mo103206b(com.tencent.mm.ui.chatting.viewitems.t8, android.view.View):void");
        }

        /* renamed from: c */
        public final void mo103207c(long j, long j2, String str, int i, String str2, int[] iArr, int i2, int i3, boolean z) {
            Class cls = C79348e.class;
            Log.m105924i("MicroMsg.DesignerClickListener", "[ImageGalleryUI] doGetMsgImg");
            Intent intent = new Intent(this.f216339d.mo91565f(), ImageGalleryUI.class);
            intent.putExtra("img_gallery_msg_id", j);
            intent.putExtra("show_search_chat_content_result", ((C79384u0) this.f216339d.f193278b.mo102812a(C79384u0.class)).mo102513x2());
            intent.putExtra("img_gallery_msg_svr_id", j2);
            intent.putExtra("key_is_biz_chat", ((C79348e) this.f216339d.f193278b.mo102812a(cls)).mo70071q1());
            intent.putExtra("key_biz_chat_id", ((C79348e) this.f216339d.f193278b.mo102812a(cls)).mo70068i4());
            intent.putExtra("img_gallery_talker", str);
            intent.putExtra("img_gallery_chatroom_name", str2);
            intent.putExtra("img_gallery_left", iArr[0]);
            int i4 = 1;
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", i2);
            intent.putExtra("img_gallery_height", i3);
            intent.putExtra("img_gallery_enter_from_chatting_ui", true);
            intent.putExtra("msg_type", this.f217676g);
            if (this.f217676g == 1) {
                intent.putExtra("show_enter_grid", false);
            }
            if (z) {
                intent.putExtra("img_preview_only", true);
            }
            intent.putExtra("img_gallery_enter_from_appbrand_service_chatting_ui", C72996z1.m85804J4(str));
            String r = this.f216339d.mo91577r();
            Bundle bundle = new Bundle();
            if (this.f216339d.mo91583x()) {
                bundle.putInt("stat_scene", 2);
            } else {
                if (C45628s0.m50738C(r)) {
                    i4 = 7;
                }
                bundle.putInt("stat_scene", i4);
            }
            bundle.putString("stat_msg_id", "msg_" + Long.toString(j2));
            bundle.putString("stat_chat_talker_username", r);
            bundle.putString("stat_send_msg_user", str);
            intent.putExtra("_stat_obj", bundle);
            intent.putExtra("img_gallery_session_id", m88322d(j2, str, r));
            C67391b bVar = this.f216339d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C67391b bVar2 = bVar;
            C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ImageClickListener", "doGetMsgImg", "(JJLjava/lang/String;ILjava/lang/String;[IIIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar.mo91556Q((Intent) aVar.mo10231a(0));
            C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemImg$ImageClickListener", "doGetMsgImg", "(JJLjava/lang/String;ILjava/lang/String;[IIIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f216339d.f193286j.overridePendingTransition(0, 0);
        }

        public C74157c(C67391b bVar, C74023i iVar, int i, C72963f4 f4Var, View view, boolean z) {
            super(bVar);
            this.f217675f = iVar;
            this.f217676g = i;
            this.f217677h = z;
            if (i == 1) {
                ((C77569h) C86312j.m106911c(C77569h.class)).mo35247zz(f4Var);
                boolean x = this.f216339d.mo91583x();
                int i2 = C78208e.f229158a;
                mo103206b(new C74243t8(f4Var, x, C78208e.C78209a.f229159a, f4Var.mo108768t(), false), view);
            }
        }
    }
}
