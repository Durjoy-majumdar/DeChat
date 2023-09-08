package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.component.C73521l0;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import i21.C98591h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C76912y0;
import p158gt.C98201k;
import p763ym.C79138l;
import p763ym.C79139p;
import zj3.C79368l;
import zj3.C79371n;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.j2 */
public final class C74071j2 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.j2$a */
    public static class C74072a extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f217382b;

        /* renamed from: c */
        public TextView f217383c;

        /* renamed from: d */
        public TextView f217384d;

        /* renamed from: e */
        public View f217385e;

        /* renamed from: f */
        public TextView f217386f;

        /* renamed from: g */
        public ImageView f217387g;

        /* renamed from: h */
        public ImageView f217388h;

        /* renamed from: a */
        public C74072a mo103147a(View view, boolean z) {
            super.create(view);
            this.f217382b = (ImageView) view.findViewById(C0966R.C0970id.b3j);
            this.f217383c = (TextView) view.findViewById(C0966R.C0970id.b3g);
            this.f217384d = (TextView) view.findViewById(C0966R.C0970id.b39);
            this.f217385e = view.findViewById(C0966R.C0970id.b3_);
            this.f217386f = (TextView) view.findViewById(C0966R.C0970id.b2v);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            this.f217387g = (ImageView) view.findViewById(C0966R.C0970id.b3b);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            this.f217388h = (ImageView) view.findViewById(C0966R.C0970id.b4e);
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.j2$b */
    public static final class C74073b extends C74023i {

        /* renamed from: v */
        public C67391b f217389v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6897rl);
            C74072a aVar = new C74072a();
            aVar.mo103147a(n4Var, true);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            String str;
            C72683d qq;
            String content = f4Var.getContent();
            String str2 = null;
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, (String) null) : null;
            int itemId = menuItem.getItemId();
            if (itemId == 111) {
                if (!(u == null || (str = u.f195606o) == null || str.length() <= 0 || (qq = C72709y1.vx0().mo100154qq(u.f195606o)) == null)) {
                    str2 = qq.field_fileFullPath;
                }
                if (f4Var.mo100972K3() || C73521l0.m86925b(f4Var, str2)) {
                    Log.m105924i("MicroMsg.ChattingItemAppMsgFromImg", "img is expired or clean!!!");
                    C76879j.m92749t(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.fqr), bVar.mo91565f().getString(C0966R.string.a3h), new j2$b$$c(this));
                    return false;
                }
                new MMHandler().post(new j2$b$$d(this, f4Var));
                C6789c.m7088a(f4Var, bVar.mo91565f(), new j2$b$$a(bVar, str2, f4Var));
                return false;
            } else if (itemId != 131) {
                return false;
            } else {
                C74071j2.m88053a(bVar, menuItem, f4Var);
                return false;
            }
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            Class cls = C79138l.class;
            if (!(view == null || f4Var == null)) {
                int b = ((C74243t8) view.getTag()).mo103252b();
                C72695v.m85071m(C75604z3.m90840l(this.f217389v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
                if (((C79138l) C86312j.m106911c(cls)).E10(((C79138l) C86312j.m106911c(cls)).mo73990GW(C68070l.C68072b.m80422u(C75604z3.m90840l(this.f217389v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null).f195562d, false)) && !C75569c4.m90687t(f4Var)) {
                    e0Var.mo107136c(b, 111, 0, this.f217389v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, 116, 0, this.f217389v.mo91572m().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if (f4Var.getStatus() != 5) {
                    MenuItem c = e0Var.mo107136c(b, 131, 0, view.getContext().getString(C0966R.string.b8g), C0966R.raw.icons_filled_pencil);
                    int[] iArr = new int[2];
                    int width = view.getWidth();
                    int height = view.getHeight();
                    view.getLocationInWindow(iArr);
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
                if (C75569c4.m90690w(f4Var)) {
                    e0Var.clear();
                }
                if (!this.f217389v.mo91584y()) {
                    e0Var.mo107136c(b, 100, 0, this.f217389v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                }
            }
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            int i;
            int i2;
            int i3;
            int[] iArr;
            int i4;
            int i5;
            View view2 = view;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(bVar.mo91565f(), bVar2.f193286j.getContentView());
                return true;
            }
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String l = C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2());
            C68070l.C68072b u = l != null ? C68070l.C68072b.m80422u(l, (String) null) : null;
            if (u == null) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgFromImg", "content is null");
                return true;
            }
            int[] iArr2 = new int[2];
            if (view2 != null) {
                view2.getLocationInWindow(iArr2);
                int width = view.getWidth();
                i = view.getHeight();
                i2 = width;
            } else {
                i2 = 0;
                i = 0;
            }
            C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(u.f195562d);
            if (appInfo == null || !appInfo.mo69359k()) {
                i5 = i2;
                i3 = i;
                iArr = iArr2;
                i4 = 0;
            } else {
                i5 = i2;
                i3 = i;
                i4 = 0;
                iArr = iArr2;
                mo103094j(bVar, u, mo103097o(bVar2, f4Var2), appInfo, f4Var.mo108774y2(), bVar.mo91577r());
            }
            String str = u.f195606o;
            if (str == null || str.length() <= 0) {
                String str2 = u.f195586j;
                if (str2 != null && str2.length() > 0) {
                    String K3 = ((C79139p) C86312j.m106911c(C79139p.class)).mo108862K3(u.f195586j, StateEvent.Name.MESSAGE);
                    PackageInfo w = mo103101w(bVar.mo91565f(), u.f195562d);
                    mo103070B(bVar, K3, K3, w == null ? null : w.versionName, w == null ? 0 : w.versionCode, u.f195562d, false, f4Var.getMsgId(), f4Var.mo108774y2(), f4Var, u);
                }
            } else {
                C72683d qq = C72709y1.vx0().mo100154qq(u.f195606o);
                if (qq != null && qq.mo100146l2()) {
                    String str3 = qq.field_fileFullPath;
                    if (!C86013q1.m106450k(str3)) {
                        Object[] objArr = new Object[3];
                        objArr[i4] = str3;
                        objArr[1] = Long.valueOf(f4Var.getMsgId());
                        objArr[2] = Long.valueOf(f4Var.mo108774y2());
                        Log.m105925i("MicroMsg.ChattingItemAppMsgFromImg", "Img not exist, bigImgPath: %s, msgId: %d, msgSvrId: %d", objArr);
                        Intent intent = new Intent();
                        intent.setClassName(bVar.mo91565f(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
                        intent.putExtra("clean_view_type", 1);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        bVar2.mo91556Q((Intent) aVar.mo10231a(i4));
                        C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return true;
                    } else if (str3 == null || str3.equals("") || !C86013q1.m106450k(str3)) {
                        Log.m105918d("MicroMsg.ChattingItemAppMsgFromImg", "showImg : imgPath is null");
                    } else {
                        long msgId = f4Var.getMsgId();
                        long y2 = f4Var.mo108774y2();
                        String t = f4Var.mo108768t();
                        Log.m105924i("MicroMsg.ChattingItemAppMsgFromImg", "[ImageGalleryUI] enter");
                        Intent intent2 = new Intent(this.f217389v.mo91565f(), ImageGalleryUI.class);
                        intent2.putExtra("img_gallery_msg_id", msgId);
                        intent2.putExtra("img_gallery_talker", t);
                        intent2.putExtra("img_gallery_left", iArr[i4]);
                        intent2.putExtra("img_gallery_top", iArr[1]);
                        intent2.putExtra("img_gallery_width", i5);
                        intent2.putExtra("img_gallery_height", i3);
                        String r = this.f217389v.mo91577r();
                        String y = mo103068y(this.f217389v, f4Var2);
                        Bundle bundle = new Bundle();
                        if (this.f217389v.mo91583x()) {
                            bundle.putInt("stat_scene", 2);
                        } else {
                            bundle.putInt("stat_scene", C45628s0.m50738C(r) ? 7 : 1);
                        }
                        bundle.putString("stat_msg_id", "msg_" + Long.toString(y2));
                        bundle.putString("stat_chat_talker_username", r);
                        bundle.putString("stat_send_msg_user", y);
                        intent2.putExtra("_stat_obj", bundle);
                        C67391b bVar3 = this.f217389v;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent2);
                        C67391b bVar4 = bVar3;
                        C117292a.m165358d(bVar4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "showImg", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        bVar3.mo91556Q((Intent) aVar2.mo10231a(i4));
                        C117292a.m165359e(bVar4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "showImg", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                } else if (f4Var.mo108769t2() == 0) {
                    long msgId2 = f4Var.getMsgId();
                    Intent intent3 = new Intent();
                    intent3.setClassName(this.f217389v.mo91565f(), "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
                    intent3.putExtra("app_msg_id", msgId2);
                    C67391b bVar5 = this.f217389v;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent3);
                    C117292a.m165358d(bVar5, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "doGetMsgImg", "(J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    bVar5.mo91556Q((Intent) aVar3.mo10231a(i4));
                    C117292a.m165359e(bVar5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "doGetMsgImg", "(J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            int i;
            int i2;
            String str2;
            int indexOf;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            Class cls = C79138l.class;
            C74072a aVar = (C74072a) cVar;
            this.f217389v = bVar2;
            ((C79371n) bVar2.f193278b.mo102812a(C79371n.class)).mo102406W4(f4Var2);
            String content = f4Var.getContent();
            if (bVar.mo91583x() && (indexOf = f4Var.getContent().indexOf(58)) != -1) {
                content = f4Var.getContent().substring(indexOf + 1);
            }
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C44561j UV = ((C79138l) C86312j.m106911c(cls)).mo74003UV(u.f195562d, u.f195480E);
                if (UV != null) {
                    mo103095k(bVar2, u, f4Var2);
                }
                String str3 = (UV == null || (str2 = UV.field_appName) == null || str2.trim().length() <= 0) ? u.f195484F : UV.field_appName;
                String str4 = u.f195562d;
                if (str4 == null || str4.length() <= 0 || !mo103084W(str3)) {
                    i = 8;
                    aVar.f217383c.setVisibility(8);
                } else {
                    aVar.f217383c.setText(((C79138l) C86312j.m106911c(cls)).mo74019xG(bVar.mo91565f(), UV, str3));
                    aVar.f217383c.setVisibility(0);
                    if (UV == null || !UV.mo69359k()) {
                        i = 8;
                        mo103076J(bVar2, aVar.f217383c, u.f195562d);
                    } else {
                        i = 8;
                        mo103074H(bVar, aVar.f217383c, f4Var, u, UV.field_packageName, f4Var.mo108774y2());
                    }
                    mo103079M(bVar2, aVar.f217383c, u.f195562d);
                }
                String str5 = u.f195642x;
                if (str5 == null || str5.length() == 0) {
                    i2 = 0;
                    aVar.f217386f.setVisibility(i);
                } else {
                    i2 = 0;
                    aVar.f217386f.setVisibility(0);
                    mo103073G(bVar2, aVar.f217386f, C74243t8.m88488a(u.f195642x));
                }
                if (u.f195582i == 2) {
                    aVar.f217382b.setVisibility(i2);
                    C72683d qq = C72709y1.vx0().mo100154qq(u.f195606o);
                    String s2 = f4Var.mo108765s2();
                    Boolean bool = Boolean.FALSE;
                    if (qq != null) {
                        s2 = qq.field_fileFullPath;
                        bool = Boolean.TRUE;
                    }
                    if (!((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).Cx0(aVar.f217382b, s2, bool.booleanValue(), C76577a.m92156g(bVar.mo91565f()), u.f195515O, u.f195512N, true, C0966R.C0969drawable.by8, aVar.f217388h, C0966R.C0969drawable.f4730l9, 1, true, (View) null)) {
                        if (this.f217197d) {
                            aVar.f217382b.setImageResource(C0966R.raw.chatfrom_bg_pic);
                        } else {
                            aVar.f217382b.setImageBitmap(BitmapFactory.decodeResource(bVar.mo91572m(), C0966R.C0969drawable.f4730l9));
                        }
                        aVar.f217382b.post(new j2$b$$b(this, aVar));
                    }
                }
                if (bVar.mo91583x()) {
                    aVar.f217387g.setVisibility(i);
                } else if (((C79138l) C86312j.m106911c(cls)).mo73991JL(UV)) {
                    aVar.f217387g.setVisibility(i2);
                    aVar.f217386f.setVisibility(i);
                    ImageView imageView = aVar.f217387g;
                    C74243t8 t8Var = new C74243t8();
                    t8Var.f217989w = u;
                    t8Var.f212238a = f4Var2;
                    mo103072F(bVar2, imageView, t8Var);
                } else {
                    aVar.f217387g.setVisibility(i);
                }
            }
            aVar.clickArea.setTag(new C74243t8(f4Var2, bVar.mo91583x(), aVar, (String) null));
            aVar.clickArea.setOnClickListener(mo103099u(bVar2));
            if (this.f217197d) {
                aVar.clickArea.setOnLongClickListener(mo103098p(bVar2));
                aVar.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 268435505;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.j2$c */
    public static class C74074c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f217390v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.j2$c$a */
        public class C74075a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C74072a f217391d;

            public C74075a(C74074c cVar, C74072a aVar) {
                this.f217391d = aVar;
            }

            public void run() {
                this.f217391d.f217382b.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                this.f217391d.f217388h.setLayoutParams(new FrameLayout.LayoutParams(this.f217391d.f217382b.getWidth(), this.f217391d.f217382b.getHeight()));
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6947t2);
            C74072a aVar = new C74072a();
            aVar.mo103147a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            String str;
            C72683d qq;
            String content = f4Var.getContent();
            String str2 = null;
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, (String) null) : null;
            int itemId = menuItem.getItemId();
            if (itemId == 111) {
                if (!(u == null || (str = u.f195606o) == null || str.length() <= 0 || (qq = C72709y1.vx0().mo100154qq(u.f195606o)) == null)) {
                    str2 = qq.field_fileFullPath;
                }
                Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_content", f4Var.getContent());
                intent.putExtra("Retr_File_Name", str2);
                intent.putExtra("Retr_Msg_Type", 16);
                intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            } else if (itemId != 131) {
                return false;
            } else {
                C74071j2.m88053a(bVar, menuItem, f4Var);
                return false;
            }
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            Class cls = C79138l.class;
            if (view == null) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgToImg", "[onCreateContextMenu] v is null");
                return false;
            }
            C74243t8 t8Var = (C74243t8) view.getTag();
            if (t8Var == null) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgToImg", "[onCreateContextMenu] tag is null");
                return false;
            }
            int b = t8Var.mo103252b();
            f4Var.getClass();
            C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(this.f217390v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
            if (u != null) {
                if (((C79138l) C86312j.m106911c(cls)).E10(((C79138l) C86312j.m106911c(cls)).mo73990GW(u.f195562d, false)) && !C75569c4.m90687t(f4Var)) {
                    e0Var.mo107136c(b, 111, 0, this.f217390v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
            }
            C88144b.m109788f("favorite");
            e0Var.mo107136c(b, 116, 0, this.f217390v.mo91572m().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            if (f4Var.getStatus() != 5) {
                MenuItem c = e0Var.mo107136c(b, 131, 0, view.getContext().getString(C0966R.string.b8g), C0966R.raw.icons_filled_pencil);
                int[] iArr = new int[2];
                int width = view.getWidth();
                int height = view.getHeight();
                view.getLocationInWindow(iArr);
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
            if (!f4Var.mo100967F3() && f4Var.mo100961A3() && ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f217390v) && mo103081O(f4Var.mo108768t()))) {
                e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
            }
            if (!this.f217390v.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, this.f217390v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
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
            int i;
            int i2;
            int i3;
            View view2 = view;
            C67391b bVar2 = bVar;
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(bVar.mo91565f(), bVar2.f193286j.getContentView());
                return true;
            } else if (view2 == null) {
                return true;
            } else {
                C74243t8 t8Var = (C74243t8) view.getTag();
                String content = f4Var.getContent();
                C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, (String) null) : null;
                if (u == null) {
                    Log.m105920e("MicroMsg.ChattingItemAppMsgToImg", "content is null");
                    return true;
                }
                int[] iArr = new int[2];
                view2.getLocationInWindow(iArr);
                int width = view.getWidth();
                int height = view.getHeight();
                C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(u.f195562d, false);
                if (GW != null) {
                    i3 = height;
                    i2 = 0;
                    i = width;
                    mo103094j(bVar, u, C75592q0.m90789s(), GW, f4Var.mo108774y2(), bVar.mo91577r());
                } else {
                    i3 = height;
                    i = width;
                    i2 = 0;
                }
                String str = u.f195606o;
                if (str == null || str.length() <= 0) {
                    C72963f4 f4Var2 = f4Var;
                    String str2 = u.f195586j;
                    if (str2 != null && str2.length() > 0) {
                        String K3 = ((C79139p) C86312j.m106911c(C79139p.class)).mo108862K3(u.f195586j, StateEvent.Name.MESSAGE);
                        PackageInfo w = mo103101w(bVar.mo91565f(), u.f195562d);
                        mo103070B(bVar, K3, K3, w == null ? null : w.versionName, w == null ? 0 : w.versionCode, u.f195562d, false, f4Var.getMsgId(), f4Var.mo108774y2(), f4Var, u);
                        return false;
                    }
                } else {
                    C72683d qq = C72709y1.vx0().mo100154qq(u.f195606o);
                    if (qq != null) {
                        if (!C97625j3.m125812b().mo105883I()) {
                            C76912y0.m92771j(bVar.mo91565f(), bVar2.f193286j.getContentView());
                        } else if (f4Var.mo108769t2() == 1) {
                            String str3 = qq.field_fileFullPath;
                            if (!C86013q1.m106450k(str3)) {
                                C72963f4 f4Var3 = f4Var;
                                Object[] objArr = new Object[3];
                                objArr[i2] = str3;
                                objArr[1] = Long.valueOf(f4Var.getMsgId());
                                objArr[2] = Long.valueOf(f4Var.mo108774y2());
                                Log.m105925i("MicroMsg.ChattingItemAppMsgToImg", "onItemClick::bigImgPath: %s, msgId: %d, msgSvrId: %d", objArr);
                                Intent intent = new Intent();
                                intent.setClassName(bVar.mo91565f(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
                                intent.putExtra("clean_view_type", 1);
                                C9556a aVar = new C9556a();
                                aVar.mo10233c(intent);
                                C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                bVar2.mo91556Q((Intent) aVar.mo10231a(i2));
                                C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            } else if (str3 == null || str3.equals("") || !C86013q1.m106450k(str3)) {
                                Log.m105918d("MicroMsg.ChattingItemAppMsgToImg", "showImg : imgPath is null");
                            } else {
                                long msgId = f4Var.getMsgId();
                                long y2 = f4Var.mo108774y2();
                                String t = f4Var.mo108768t();
                                Log.m105924i("MicroMsg.ChattingItemAppMsgToImg", "[ImageGalleryUI] enter");
                                Intent intent2 = new Intent(this.f217390v.mo91565f(), ImageGalleryUI.class);
                                intent2.putExtra("img_gallery_msg_id", msgId);
                                intent2.putExtra("img_gallery_talker", t);
                                intent2.putExtra("img_gallery_left", iArr[i2]);
                                intent2.putExtra("img_gallery_top", iArr[1]);
                                intent2.putExtra("img_gallery_width", i);
                                intent2.putExtra("img_gallery_height", i3);
                                String r = this.f217390v.mo91577r();
                                String y = mo103068y(this.f217390v, f4Var);
                                Bundle bundle = new Bundle();
                                if (this.f217390v.mo91583x()) {
                                    bundle.putInt("stat_scene", 2);
                                } else {
                                    bundle.putInt("stat_scene", C45628s0.m50738C(r) ? 7 : 1);
                                }
                                bundle.putString("stat_msg_id", "msg_" + Long.toString(y2));
                                bundle.putString("stat_chat_talker_username", r);
                                bundle.putString("stat_send_msg_user", y);
                                intent2.putExtra("_stat_obj", bundle);
                                C67391b bVar3 = this.f217390v;
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(intent2);
                                C67391b bVar4 = bVar3;
                                C117292a.m165358d(bVar4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "showImg", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                bVar3.mo91556Q((Intent) aVar2.mo10231a(i2));
                                C117292a.m165359e(bVar4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "showImg", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            int i;
            String str2;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            Class cls = C79138l.class;
            C74072a aVar = (C74072a) cVar;
            this.f217390v = bVar2;
            ((C79371n) bVar2.f193278b.mo102812a(C79371n.class)).mo102406W4(f4Var2);
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C44561j UV = ((C79138l) C86312j.m106911c(cls)).mo74003UV(u.f195562d, u.f195480E);
                String str3 = (UV == null || (str2 = UV.field_appName) == null || str2.trim().length() <= 0) ? u.f195484F : UV.field_appName;
                String str4 = u.f195562d;
                if (str4 == null || str4.length() <= 0 || !mo103084W(str3)) {
                    i = 0;
                    aVar.f217383c.setVisibility(8);
                } else {
                    aVar.f217383c.setText(((C79138l) C86312j.m106911c(cls)).mo74019xG(bVar.mo91565f(), UV, str3));
                    aVar.f217383c.setVisibility(0);
                    if (UV == null || !UV.mo69359k()) {
                        i = 0;
                        mo103076J(bVar2, aVar.f217383c, u.f195562d);
                    } else {
                        i = 0;
                        mo103074H(bVar, aVar.f217383c, f4Var, u, UV.field_packageName, f4Var.mo108774y2());
                    }
                    mo103079M(bVar2, aVar.f217383c, u.f195562d);
                }
                if (u.f195582i == 2) {
                    aVar.f217382b.setVisibility(i);
                    C72683d qq = C72709y1.vx0().mo100154qq(u.f195606o);
                    String s2 = f4Var.mo108765s2();
                    Boolean bool = Boolean.FALSE;
                    if (qq != null) {
                        s2 = qq.field_fileFullPath;
                        bool = Boolean.TRUE;
                    }
                    if (!((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).Cx0(aVar.f217382b, s2, bool.booleanValue(), C76577a.m92156g(bVar.mo91565f()), u.f195521Q, u.f195518P, true, C0966R.C0969drawable.by8, aVar.f217388h, C0966R.C0969drawable.f4730l9, 0, true, (View) null)) {
                        if (this.f217197d) {
                            aVar.f217382b.setImageResource(C0966R.raw.chatfrom_bg_pic);
                        } else {
                            aVar.f217382b.setImageBitmap(BitmapFactory.decodeResource(bVar.mo91572m(), C0966R.C0969drawable.f4730l9));
                        }
                        aVar.f217382b.post(new C74075a(this, aVar));
                    }
                }
            } else {
                i = 0;
            }
            aVar.clickArea.setTag(new C74243t8(f4Var2, bVar.mo91583x(), aVar, (String) null));
            aVar.clickArea.setOnClickListener(mo103099u(bVar2));
            if (this.f217197d) {
                aVar.clickArea.setOnLongClickListener(mo103098p(bVar2));
                aVar.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            }
            int m = C72695v.m85071m(content);
            if (m == -1 || m >= 100 || u.f195594l <= 0 || f4Var.getStatus() == 5) {
                View view = aVar.f217385e;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(i)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                aVar.f217382b.setAlpha(255);
                aVar.f217382b.setBackgroundDrawable((Drawable) null);
            } else {
                View view2 = aVar.f217385e;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(Integer.valueOf(i));
                View view3 = view2;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar3.mo10231a(i)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = aVar.f217384d;
                textView.setText("" + m + "%");
                aVar.f217382b.setAlpha(64);
                aVar.f217382b.setBackgroundResource(C0966R.C0969drawable.f357342bl2);
            }
            mo103087e0(aVar, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 268435505;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88053a(ck3.C67391b r23, android.view.MenuItem r24, com.tencent.p014mm.storage.C72963f4 r25) {
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
            java.lang.String r1 = "MicroMsg.ChattingItemAppMsgImg"
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74071j2.m88053a(ck3.b, android.view.MenuItem, com.tencent.mm.storage.f4):boolean");
    }
}
