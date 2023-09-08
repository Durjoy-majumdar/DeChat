package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.modelstat.C68144a;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.C73309a2;
import com.tencent.p014mm.p136ui.chatting.C73745l4;
import com.tencent.p014mm.p136ui.chatting.C73764n3;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import ht1.C60205t5;
import ht1.C60212v5;
import i21.C98591h;
import ic0.C108455d;
import j20.C117292a;
import java.io.IOException;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76874e0;
import nj3.C76879j;
import p158gt.C98201k;
import p182kk.C61104a;
import p640ox.C77049b;
import p652pu.C100910b;
import p680ru.C77569h;
import p763ym.C79138l;
import p823sg.C90193h;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import rb0.C48009v0;
import te3.C64719t23;
import te3.C64793w23;
import uj3.C78208e;
import za2.C102984b;
import zj3.C79352f0;
import zj3.C79368l;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.y2 */
public final class C74310y2 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.y2$a */
    public class C57806a implements C88144b.C76564c {

        /* renamed from: a */
        public final /* synthetic */ C72963f4 f165403a;

        /* renamed from: b */
        public final /* synthetic */ C74023i f165404b;

        public C57806a(C72963f4 f4Var, C74023i iVar) {
            this.f165403a = f4Var;
            this.f165404b = iVar;
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            if (i == 2000 && i2 == -1) {
                String listToString = Util.listToString(intent.getStringArrayListExtra("SendMsgUsernames"), ";");
                C60205t5 t5Var = C60205t5.f171719a;
                C72963f4 f4Var = this.f165403a;
                this.f165404b.getClass();
                t5Var.mo85202a(f4Var, false, true, listToString);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.y2$b */
    public static class C74311b extends C74023i {

        /* renamed from: v */
        public C67391b f218288v;

        /* renamed from: w */
        public String f218289w = "";

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6901rp);
            C74313d dVar = new C74313d();
            dVar.mo103291a(n4Var, true);
            n4Var.setTag(dVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C74310y2.m88649d(this, menuItem, bVar, f4Var);
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C74310y2.m88650e(this, this.f218288v, e0Var, view, contextMenuInfo, f4Var, true);
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return C74310y2.m88646a(this, bVar, f4Var);
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f218288v = bVar;
            C74313d.m88666b(this, (C74313d) cVar, f4Var, true, cVar, bVar, str);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 1040187441;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.y2$c */
    public static class C74312c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f218290v;

        /* renamed from: w */
        public String f218291w = "";

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6951t6);
            C74313d dVar = new C74313d();
            dVar.mo103291a(n4Var, false);
            n4Var.setTag(dVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C74310y2.m88649d(this, menuItem, bVar, f4Var);
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C74310y2.m88650e(this, this.f218290v, e0Var, view, contextMenuInfo, f4Var, false);
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            f4Var.unsetOmittedFailResend();
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
            ((C79352f0) bVar.f193278b.mo102812a(C79352f0.class)).mo102435d(f4Var);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return C74310y2.m88646a(this, bVar, f4Var);
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f218290v = bVar;
            C74313d dVar = (C74313d) cVar;
            C74313d.m88666b(this, dVar, f4Var, false, cVar, bVar, str);
            if (C74023i.m87878T()) {
                if (f4Var.getStatus() == 2) {
                    if (mo103080N((C79368l) bVar.f193278b.mo102812a(C79368l.class), f4Var.getMsgId())) {
                        ImageView imageView = dVar.f218293c;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                    }
                }
                ImageView imageView2 = dVar.f218293c;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            }
            mo103087e0(dVar, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 1040187441;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.y2$d */
    public static class C74313d extends C74023i.C74026c {

        /* renamed from: b */
        public RelativeLayout f218292b;

        /* renamed from: c */
        public ImageView f218293c;

        /* renamed from: d */
        public TextView f218294d;

        /* renamed from: e */
        public TextView f218295e;

        /* renamed from: f */
        public TextView f218296f;

        /* renamed from: g */
        public WeImageView f218297g;

        /* renamed from: h */
        public ImageView f218298h;

        /* renamed from: i */
        public LinearLayout f218299i;

        /* renamed from: j */
        public MMRoundCornerImageView f218300j;

        /* renamed from: k */
        public TextView f218301k;

        /* renamed from: l */
        public View f218302l;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.y2$d$a */
        public class C57807a implements C108455d {

            /* renamed from: a */
            public final /* synthetic */ C67391b f165405a;

            /* renamed from: b */
            public final /* synthetic */ boolean f165406b;

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.y2$d$a$a */
            public class C57808a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ ImageView f165407d;

                /* renamed from: e */
                public final /* synthetic */ String f165408e;

                /* renamed from: f */
                public final /* synthetic */ Bitmap f165409f;

                /* renamed from: g */
                public final /* synthetic */ RelativeLayout f165410g;

                /* renamed from: h */
                public final /* synthetic */ String f165411h;

                /* renamed from: i */
                public final /* synthetic */ Bitmap f165412i;

                public C57808a(ImageView imageView, String str, Bitmap bitmap, RelativeLayout relativeLayout, String str2, Bitmap bitmap2) {
                    this.f165407d = imageView;
                    this.f165408e = str;
                    this.f165409f = bitmap;
                    this.f165410g = relativeLayout;
                    this.f165411h = str2;
                    this.f165412i = bitmap2;
                }

                public void run() {
                    if (this.f165407d.getTag() != null && this.f165407d.getTag().equals(this.f165408e)) {
                        Log.m105925i("MicroMsg.MusicItemHolder", "setImageBitmap %s %s %s ", Integer.valueOf(this.f165407d.hashCode()), this.f165407d.getTag(), this.f165408e);
                        this.f165407d.setImageBitmap(this.f165409f);
                    }
                    if (this.f165410g.getTag() != null && this.f165410g.getTag().equals(this.f165411h)) {
                        this.f165410g.setBackground(new BitmapDrawable(C57807a.this.f165405a.mo91565f().getResources(), this.f165412i));
                    }
                }
            }

            public C57807a(C67391b bVar, boolean z) {
                this.f165405a = bVar;
                this.f165406b = z;
            }

            /* renamed from: a */
            public void mo26263a(boolean z, Object... objArr) {
                ImageView imageView = objArr[0];
                String str = objArr[1];
                RelativeLayout relativeLayout = objArr[2];
                String str2 = objArr[3];
                Bitmap bitmapNative = BitmapUtil.getBitmapNative(objArr[4], imageView.getWidth(), imageView.getHeight());
                Bitmap b = C74310y2.m88647b(this.f165405a.mo91565f(), bitmapNative, relativeLayout.getHeight(), relativeLayout.getWidth(), this.f165406b);
                C20828a.m22825b().mo32526o(str, bitmapNative);
                C20828a.m22825b().mo32526o(str2, b);
                ((C119157j) C119157j.f356862d).mo183895z(new C57808a(imageView, str, bitmapNative, relativeLayout, str2, b));
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.y2$d$b */
        public class C57809b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f165414d;

            /* renamed from: e */
            public final /* synthetic */ C67391b f165415e;

            /* renamed from: f */
            public final /* synthetic */ RelativeLayout f165416f;

            /* renamed from: g */
            public final /* synthetic */ boolean f165417g;

            /* renamed from: h */
            public final /* synthetic */ String f165418h;

            /* renamed from: i */
            public final /* synthetic */ String f165419i;

            /* renamed from: j */
            public final /* synthetic */ ImageView f165420j;

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.y2$d$b$a */
            public class C57810a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Bitmap f165421d;

                /* renamed from: e */
                public final /* synthetic */ Bitmap f165422e;

                public C57810a(Bitmap bitmap, Bitmap bitmap2) {
                    this.f165421d = bitmap;
                    this.f165422e = bitmap2;
                }

                public void run() {
                    Bitmap bitmap;
                    Bitmap bitmap2;
                    if (C57809b.this.f165420j.getTag() != null && C57809b.this.f165420j.getTag().equals(C57809b.this.f165418h) && (bitmap2 = this.f165421d) != null && !bitmap2.isRecycled()) {
                        C57809b.this.f165420j.setImageBitmap(this.f165421d);
                    }
                    if (C57809b.this.f165416f.getTag() != null && C57809b.this.f165416f.getTag().equals(C57809b.this.f165419i) && (bitmap = this.f165422e) != null && !bitmap.isRecycled()) {
                        C57809b.this.f165416f.setBackground(new BitmapDrawable(C57809b.this.f165415e.mo91565f().getResources(), this.f165422e));
                    }
                }
            }

            public C57809b(C72963f4 f4Var, C67391b bVar, RelativeLayout relativeLayout, boolean z, String str, String str2, ImageView imageView) {
                this.f165414d = f4Var;
                this.f165415e = bVar;
                this.f165416f = relativeLayout;
                this.f165417g = z;
                this.f165418h = str;
                this.f165419i = str2;
                this.f165420j = imageView;
            }

            public void run() {
                Bitmap jo = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127188jo(this.f165414d.mo108765s2(), C76577a.m92156g(this.f165415e.mo91565f()), false);
                Bitmap b = C74310y2.m88647b(this.f165415e.mo91565f(), jo, this.f165416f.getHeight(), this.f165416f.getWidth(), this.f165417g);
                C20828a.m22825b().mo32526o(this.f165418h, jo);
                C20828a.m22825b().mo32526o(this.f165419i, b);
                ((C119157j) C119157j.f356862d).mo183895z(new C57810a(jo, b));
            }
        }

        /* renamed from: b */
        public static void m88666b(C74023i iVar, C74313d dVar, C72963f4 f4Var, boolean z, C78208e eVar, C67391b bVar, String str) {
            String str2;
            Class<C79368l> cls;
            C72916m mVar;
            String str3;
            int indexOf;
            C74023i iVar2 = iVar;
            C74313d dVar2 = dVar;
            boolean z2 = z;
            C67391b bVar2 = bVar;
            Class<C79368l> cls2 = C79368l.class;
            Class cls3 = C79138l.class;
            if (dVar2 != null) {
                String content = f4Var.getContent();
                if (bVar.mo91583x() && (indexOf = f4Var.getContent().indexOf(58)) != -1) {
                    content = f4Var.getContent().substring(indexOf + 1);
                }
                C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
                dVar2.f218294d.setMaxLines(2);
                dVar2.f218295e.setMaxLines(1);
                dVar2.f218296f.setMaxLines(1);
                String str4 = "";
                dVar2.f218295e.setText(str4);
                dVar2.f218298h.setImageDrawable(bVar.mo91565f().getResources().getDrawable(C0966R.C0969drawable.aiu));
                if (C85875k4.m106211z()) {
                    dVar2.f218298h.setImageDrawable(bVar.mo91565f().getResources().getDrawable(C0966R.C0969drawable.ait));
                }
                if (u == null) {
                    Log.m105920e("MicroMsg.MusicItemHolder", "null == content");
                    return;
                }
                if (z2) {
                    dVar2.f218292b.setBackgroundResource(C0966R.C0969drawable.f4751lt);
                } else {
                    dVar2.f218292b.setBackgroundResource(C0966R.C0969drawable.f4813nm);
                }
                int i = u.f195582i;
                if (3 == i || 76 == i) {
                    C72916m mVar2 = (C72916m) u.mo93555w(C72916m.class);
                    dVar2.f218294d.setText(u.mo93550m());
                    if (mVar2 == null || Util.isNullOrNil(mVar2.f212525h)) {
                        dVar2.f218295e.setText(u.mo93548k());
                    } else {
                        dVar2.f218295e.setText(mVar2.f212525h);
                    }
                    dVar2.f218294d.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.FG_0));
                    dVar2.f218295e.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f3552xi));
                    if (!Util.isNullOrNil(dVar2.f218295e.getText())) {
                        dVar2.f218295e.setVisibility(0);
                    } else {
                        dVar2.f218295e.setText(str4);
                        dVar2.f218295e.setVisibility(8);
                    }
                    C44561j UV = ((C79138l) C86312j.m106911c(cls3)).mo74003UV(u.f195562d, u.f195480E);
                    String str5 = (UV == null || (str3 = UV.field_appName) == null || str3.trim().length() <= 0) ? u.f195484F : UV.field_appName;
                    boolean equalsIgnoreCase = "wx122a2d4c4b5f211e".equalsIgnoreCase(u.f195562d);
                    String str6 = u.f195562d;
                    if (str6 == null || str6.length() <= 0 || !iVar2.mo103084W(str5) || equalsIgnoreCase) {
                        dVar2.f218299i.setVisibility(8);
                    } else {
                        String xG = ((C79138l) C86312j.m106911c(cls3)).mo74019xG(bVar.mo91565f(), UV, str5);
                        String str7 = mVar2.f212534q;
                        if ((str7 == null || !"wx485a97c844086dc9".equals(str7)) && !"wx485a97c844086dc9".equals(u.f195562d)) {
                            View view = dVar2.f218302l;
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder", "parseMusic", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder", "parseMusic", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            View view3 = dVar2.f218302l;
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder", "parseMusic", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder", "parseMusic", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            xG = "摇一摇";
                        }
                        dVar2.f218301k.setText(xG);
                        dVar2.f218301k.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        String str8 = mVar2.f212534q;
                        if (str8 == null || str8.length() <= 0) {
                            iVar2.mo103076J(bVar2, dVar2.f218301k, u.f195562d);
                            iVar2.mo103078L(bVar2, dVar2.f218300j, u.f195562d);
                        } else {
                            iVar2.mo103076J(bVar2, dVar2.f218301k, mVar2.f212534q);
                            iVar2.mo103078L(bVar2, dVar2.f218300j, mVar2.f212534q);
                        }
                        dVar2.f218299i.setVisibility(0);
                    }
                    dVar2.f218299i.setBackgroundResource(C0966R.C0969drawable.f4792n2);
                    if (mVar2 != null) {
                        str2 = mVar2.f212523f;
                        String str9 = mVar2.f212524g;
                        if (!Util.isNullOrNil(str9)) {
                            dVar2.f218294d.setMaxLines(1);
                            ((ViewGroup.MarginLayoutParams) dVar2.f218294d.getLayoutParams()).topMargin = C76577a.m92151b(bVar.mo91565f(), 8);
                            ((ViewGroup.MarginLayoutParams) dVar2.f218295e.getLayoutParams()).topMargin = C76577a.m92151b(bVar.mo91565f(), 4);
                            View findViewById = dVar2.f218292b.findViewById(C0966R.C0970id.hqn);
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar3.mo10233c(0);
                            View view5 = findViewById;
                            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder", "parseMusic", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder", "parseMusic", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            dVar2.f218296f.setText(str9 + bVar.mo91565f().getString(C0966R.string.h2w));
                            dVar2.f218296f.setVisibility(0);
                        } else {
                            ((ViewGroup.MarginLayoutParams) dVar2.f218294d.getLayoutParams()).topMargin = 0;
                            ((ViewGroup.MarginLayoutParams) dVar2.f218295e.getLayoutParams()).topMargin = C76577a.m92151b(bVar.mo91565f(), 6);
                            View findViewById2 = dVar2.f218292b.findViewById(C0966R.C0970id.hqn);
                            C9556a aVar4 = new C9556a();
                            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                            aVar4.mo10233c(8);
                            View view6 = findViewById2;
                            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder", "parseMusic", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder", "parseMusic", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMusic$MusicItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            dVar2.f218296f.setText(str4);
                            dVar2.f218296f.setVisibility(8);
                        }
                    } else {
                        str2 = str4;
                    }
                    String str10 = "from";
                    if (!Util.isNullOrNil(str2)) {
                        String f = C90193h.m112878f(str2.getBytes());
                        String str11 = f + "_cover";
                        Object[] objArr = new Object[2];
                        objArr[0] = f;
                        if (!z2) {
                            str10 = "to";
                        }
                        objArr[1] = str10;
                        String format = String.format("%s_bg_%s", objArr);
                        Bitmap e = C20828a.m22825b().mo32516e(str11);
                        Bitmap e2 = C20828a.m22825b().mo32516e(format);
                        dVar2.f218298h.setTag(str11);
                        Log.m105925i("MicroMsg.MusicItemHolder", "updateTag %s %s %s %s %s", Integer.valueOf(dVar2.f218298h.hashCode()), dVar2.f218298h.getTag(), str11, Long.valueOf(f4Var.getMsgId()), str2);
                        dVar2.f218292b.setTag(format);
                        if (e != null && !e.isRecycled()) {
                            dVar2.f218298h.setImageBitmap(e);
                        }
                        if (e2 == null || e2.isRecycled()) {
                            dVar2.f218292b.setBackground((Drawable) null);
                        } else {
                            dVar2.f218292b.setBackground(new BitmapDrawable(bVar.mo91565f().getResources(), e2));
                        }
                        str4 = C102984b.m136167d(f, false);
                        if (e == null || e2 == null) {
                            C20937c.C20939b bVar3 = new C20937c.C20939b();
                            bVar3.f59346b = true;
                            bVar3.f59345a = true;
                            bVar3.f59350f = str4;
                            bVar3.f59368x = new Object[]{dVar2.f218298h, str11, dVar2.f218292b, format, str4};
                            C20828a.m22825b().mo32515d(str2, bVar3.mo32666a(), new C57807a(bVar2, z2));
                        }
                        mVar = mVar2;
                        cls = cls2;
                    } else if (u.mo93553p() || !C97625j3.m125812b().mo105883I()) {
                        mVar = mVar2;
                        cls = cls2;
                        dVar2.f218298h.setImageBitmap(BitmapFactory.decodeResource(bVar.mo91572m(), C0966R.C0969drawable.bir));
                    } else {
                        if (!C74244u.C74247d.m88512b(f4Var.mo108765s2())) {
                            str4 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).h30(f4Var.mo108765s2());
                        }
                        String str12 = str4;
                        if (!Util.isNullOrNil(str12)) {
                            String f2 = C90193h.m112878f(str12.getBytes());
                            String str13 = f2 + "_cover";
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = f2;
                            if (!z2) {
                                str10 = "to";
                            }
                            objArr2[1] = str10;
                            String format2 = String.format("%s_bg_%s", objArr2);
                            dVar2.f218298h.setTag(str13);
                            dVar2.f218292b.setTag(format2);
                            Bitmap e3 = C20828a.m22825b().mo32516e(str13);
                            Bitmap e4 = C20828a.m22825b().mo32516e(format2);
                            if (e3 != null && !e3.isRecycled()) {
                                Log.m105924i("MicroMsg.MusicItemHolder", "coverBm (local) is valid, use cache, key:" + str13);
                                dVar2.f218298h.setImageBitmap(e3);
                            }
                            if (e4 != null && !e4.isRecycled()) {
                                Log.m105924i("MicroMsg.MusicItemHolder", "bgBm (local) is valid, use bg cache, key:" + format2);
                                dVar2.f218292b.setBackground(new BitmapDrawable(bVar.mo91565f().getResources(), e4));
                            }
                            if (e3 == null || e4 == null) {
                                ImageView imageView = dVar2.f218298h;
                                RelativeLayout relativeLayout = dVar2.f218292b;
                                C119179t tVar = C119157j.f356862d;
                                cls = cls2;
                                C57809b bVar4 = r2;
                                String str14 = str13;
                                mVar = mVar2;
                                C57809b bVar5 = new C57809b(f4Var, bVar, relativeLayout, z, str14, format2, imageView);
                                ((C119157j) tVar).mo183875f(bVar4);
                                str4 = str12;
                            }
                        }
                        mVar = mVar2;
                        cls = cls2;
                        str4 = str12;
                    }
                    if ((f4Var.getMsgId() + "_msg").equals(dVar2.playingMsgId)) {
                        dVar2.f218297g.setImageResource(C0966R.raw.icons_outlined_pause2);
                        dVar2.f218297g.setContentDescription(MMApplicationContext.getString(C0966R.string.jhg));
                    } else {
                        dVar2.f218297g.setImageResource(C0966R.raw.icons_outlined_play2);
                        dVar2.f218297g.setContentDescription(MMApplicationContext.getString(C0966R.string.f361384jg1));
                    }
                    dVar2.f218297g.setIconColor(bVar.mo91565f().getResources().getColor(C0966R.color.f3133gi));
                    if (z2) {
                        ((C74311b) iVar2).f218289w = str4;
                    } else {
                        ((C74312c) iVar2).f218291w = str4;
                    }
                    C74244u.C74254i iVar3 = new C74244u.C74254i();
                    iVar3.f218013b = f4Var.getMsgId();
                    iVar3.f218015d = f4Var.getContent();
                    iVar3.f218014c = f4Var.mo108765s2();
                    C64719t23 b = C60212v5.m70423b(u, mVar);
                    iVar3.f218017f = b;
                    if (b != null) {
                        b.f185472t = str4;
                    }
                    iVar3.f218018g = 1;
                    iVar3.f218019h = f4Var.mo108768t();
                    dVar2.f218297g.setTag(iVar3);
                    Class<C79368l> cls4 = cls;
                    dVar2.f218297g.setOnClickListener(((C79368l) bVar2.f193278b.mo102812a(cls4)).mo108210s2());
                    dVar2.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), dVar2, (String) null));
                    dVar2.clickArea.setOnClickListener(iVar2.mo103099u(bVar2));
                    dVar2.clickArea.setOnLongClickListener(iVar2.mo103098p(bVar2));
                    dVar2.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(cls4)).mo108189Z4());
                }
            }
        }

        /* renamed from: a */
        public C74023i.C74026c mo103291a(View view, boolean z) {
            super.create(view);
            this.clickArea = view.findViewById(C0966R.C0970id.b7r);
            this.f218292b = (RelativeLayout) view.findViewById(C0966R.C0970id.b7s);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            this.f218295e = (TextView) view.findViewById(C0966R.C0970id.b7x);
            this.f218294d = (TextView) view.findViewById(C0966R.C0970id.b7y);
            this.f218296f = (TextView) view.findViewById(C0966R.C0970id.b7v);
            this.f218297g = (WeImageView) view.findViewById(C0966R.C0970id.b7u);
            this.f218298h = (ImageView) view.findViewById(C0966R.C0970id.b7t);
            ((RoundCornerRelativeLayout) view.findViewById(C0966R.C0970id.b7w)).setRadius((float) C74942w4.m89784a(view.getContext(), 4));
            this.f218299i = (LinearLayout) view.findViewById(C0966R.C0970id.b7z);
            this.f218300j = (MMRoundCornerImageView) view.findViewById(C0966R.C0970id.f357684b80);
            this.f218300j.setRadius(C74942w4.m89784a(view.getContext(), 2));
            this.f218301k = (TextView) view.findViewById(C0966R.C0970id.f357685b81);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            this.f218302l = view.findViewById(C0966R.C0970id.f6145yj);
            if (!z) {
                this.f218293c = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            }
            this.f218294d.setTextSize(1, 15.0f);
            this.f218295e.setTextSize(1, 12.0f);
            return this;
        }
    }

    /* renamed from: a */
    public static boolean m88646a(C74023i iVar, C67391b bVar, C72963f4 f4Var) {
        C68144a.m80547c(f4Var, C68144a.C68145a.Click);
        ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
        if (f4Var.getContent() == null) {
            return false;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
        C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(u.f195562d, false);
        String o = iVar.mo103097o(bVar, f4Var);
        if (GW != null) {
            iVar.mo103094j(bVar, u, o, GW, f4Var.mo108774y2(), bVar.mo91577r());
        }
        C115669n.INSTANCE.mo160131h(13043, 2, u.f195574g, u.f195562d);
        C74023i.m87882c0(bVar, f4Var);
        m88648c(u, bVar.mo91565f(), iVar instanceof C74311b ? ((C74311b) iVar).f218289w : iVar instanceof C74312c ? ((C74312c) iVar).f218291w : "", f4Var);
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(3:2|3|4)(1:7)|(1:9)(1:10)|11|(1:13)(1:14)|15|16|(2:17|18)|19|20|25|26|27|36) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:28|29|30|31|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x008d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00bb */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x00bb=Splitter:B:31:0x00bb, B:25:0x008d=Splitter:B:25:0x008d} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m88647b(android.content.Context r16, android.graphics.Bitmap r17, int r18, int r19, boolean r20) {
        /*
            r0 = r16
            java.lang.String r1 = "RSInvalidStateException ${ex.message}"
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r4 = 0
            java.lang.String r5 = "MicroMsg.ChattingItemAppMsgMusic"
            if (r18 != 0) goto L_0x0017
            r6 = 88
            int r6 = kg3.C76577a.m92151b(r0, r6)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0019
        L_0x0014:
            r0 = move-exception
            goto L_0x00bf
        L_0x0017:
            r6 = r18
        L_0x0019:
            if (r19 != 0) goto L_0x0022
            r7 = 280(0x118, float:3.92E-43)
            int r7 = kg3.C76577a.m92151b(r0, r7)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0024
        L_0x0022:
            r7 = r19
        L_0x0024:
            int r8 = r17.getHeight()     // Catch:{ Exception -> 0x0014 }
            int r12 = r17.getWidth()     // Catch:{ Exception -> 0x0014 }
            float r9 = (float) r8     // Catch:{ Exception -> 0x0014 }
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 * r10
            float r6 = (float) r6     // Catch:{ Exception -> 0x0014 }
            float r6 = r6 * r10
            float r7 = (float) r7     // Catch:{ Exception -> 0x0014 }
            float r7 = r6 / r7
            float r9 = r9 * r7
            int r13 = (int) r9     // Catch:{ Exception -> 0x0014 }
            boolean r7 = r17.isRecycled()     // Catch:{ Exception -> 0x0014 }
            if (r7 == 0) goto L_0x0051
            android.content.res.Resources r0 = r16.getResources()     // Catch:{ Exception -> 0x0014 }
            r7 = 2131100293(0x7f060285, float:1.7812963E38)
            int r0 = r0.getColor(r7)     // Catch:{ Exception -> 0x0014 }
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r0, r12, r13)     // Catch:{ Exception -> 0x0014 }
            r9 = r0
            goto L_0x0053
        L_0x0051:
            r9 = r17
        L_0x0053:
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ Exception -> 0x0014 }
            r14.<init>()     // Catch:{ Exception -> 0x0014 }
            float r0 = (float) r13     // Catch:{ Exception -> 0x0014 }
            float r6 = r6 / r0
            r0 = 1048576000(0x3e800000, float:0.25)
            float r6 = r6 * r0
            float r6 = r6 * r0
            r14.postScale(r6, r6)     // Catch:{ Exception -> 0x0014 }
            r10 = 0
            int r8 = r8 - r13
            r0 = 2
            int r11 = r8 / 2
            r15 = 0
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0014 }
            tj3.i r7 = new tj3.i     // Catch:{ Exception -> 0x0014 }
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0014 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0014 }
            r8 = 1106247680(0x41f00000, float:30.0)
            r7.mo162692b(r6, r8)     // Catch:{ all -> 0x007f }
        L_0x007b:
            r7.destroy()     // Catch:{ RSInvalidStateException -> 0x008d }
            goto L_0x0090
        L_0x007f:
            java.lang.String r6 = "setBlurBitmap error:${err.message}"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)     // Catch:{ all -> 0x00b6 }
            r6 = 30
            r8 = r17
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.fastblur(r8, r6)     // Catch:{ all -> 0x00b6 }
            goto L_0x007b
        L_0x008d:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)     // Catch:{ Exception -> 0x0014 }
        L_0x0090:
            com.tencent.mm.plugin.comm.g r1 = com.tencent.p014mm.plugin.comm.C55593g.f158270a     // Catch:{ Exception -> 0x0014 }
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106211z()     // Catch:{ Exception -> 0x0014 }
            r1.mo77113a(r7, r6)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r1 = "getBgContentBm,from:%b, cost:%d"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0014 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r20)     // Catch:{ Exception -> 0x0014 }
            r0[r4] = r7     // Catch:{ Exception -> 0x0014 }
            r7 = 1
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)     // Catch:{ Exception -> 0x0014 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0014 }
            r0[r7] = r2     // Catch:{ Exception -> 0x0014 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ Exception -> 0x0014 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x0014 }
            goto L_0x00c7
        L_0x00b6:
            r0 = move-exception
            r7.destroy()     // Catch:{ RSInvalidStateException -> 0x00bb }
            goto L_0x00be
        L_0x00bb:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)     // Catch:{ Exception -> 0x0014 }
        L_0x00be:
            throw r0     // Catch:{ Exception -> 0x0014 }
        L_0x00bf:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "getBgContentBm"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r1)
            r6 = 0
        L_0x00c7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74310y2.m88647b(android.content.Context, android.graphics.Bitmap, int, int, boolean):android.graphics.Bitmap");
    }

    /* renamed from: c */
    public static boolean m88648c(C68070l.C68072b bVar, Context context, String str, C72963f4 f4Var) {
        C68070l.C68072b bVar2 = bVar;
        Context context2 = context;
        String str2 = str;
        Class cls = C72916m.class;
        Log.m105925i("MicroMsg.ChattingItemAppMsgMusic", "handleMusicVideoClick, content:%s", bVar2.f195495H2);
        if (C61104a.m71657m(context2, true, (Bundle) null) || C61104a.m71664t(context2, true)) {
            return false;
        }
        Log.m105925i("MicroMsg.ChattingItemAppMsgMusic", "handleMusicVideoClick, doPlayMusic, musicCoverPath:%s", str2);
        Intent intent = new Intent();
        intent.putExtra("key_scene", 6);
        C72916m mVar = (C72916m) bVar.mo93555w(cls);
        if (mVar != null) {
            intent.putExtra("key_mv_song_name", bVar2.f195570f);
            intent.putExtra("key_mv_song_lyric", mVar.f212520c);
            intent.putExtra("key_mv_album_cover_url", mVar.f212519b);
            intent.putExtra("key_mv_feed_id", mVar.f212521d);
            intent.putExtra("key_mv_nonce_id", mVar.f212522e);
            intent.putExtra("key_mv_cover_url", mVar.f212523f);
            intent.putExtra("key_mv_poster", mVar.f212524g);
            intent.putExtra("key_mv_singer_name", !Util.isNullOrNil(mVar.f212525h) ? mVar.f212525h : bVar2.f195574g);
            intent.putExtra("key_mv_album_name", mVar.f212526i);
            intent.putExtra("key_mv_music_genre", mVar.f212527j);
            intent.putExtra("key_mv_issue_date", mVar.f212528k);
            intent.putExtra("key_mv_music_duration", mVar.f212531n);
            intent.putExtra("key_mv_identification", mVar.f212529l);
            intent.putExtra("key_mv_extra_info", mVar.f212530m);
            intent.putExtra("key_mv_thumb_path", str2);
            intent.putExtra("key_mv_music_operation_url", mVar.f212532o);
            intent.putExtra("key_mv_song_mid", mVar.f212533p);
            if (Util.isNullOrNil(str) && !Util.isNullOrNil(mVar.f212523f)) {
                str2 = C102984b.m136167d(C90193h.m112878f(mVar.f212523f.getBytes()) + "_cover", false);
            }
        }
        intent.setFlags(268435456);
        String format = String.format("%d_msg", new Object[]{Long.valueOf(f4Var.getMsgId())});
        if (C73309a2.m86450c(format)) {
            C72963f4 f4Var2 = f4Var;
        } else {
            C115669n.INSTANCE.kvStat(10090, "0,1");
            C72916m mVar2 = (C72916m) bVar.mo93555w(cls);
            C64719t23 b = mVar2 != null ? C60212v5.m70423b(bVar, mVar2) : null;
            if (b != null) {
                b.f185472t = str2;
            }
            C101106m If = ((C100910b) C86312j.m106911c(C100910b.class)).mo139945If(bVar, 0, format, f4Var.mo108765s2(), C97625j3.m125812b().mo105891f(), f4Var.mo108765s2(), C62602o.m73561a(format, b));
            Log.m105919d("MicroMsg.ChattingItemHelper", "doPlayMusic, songName:%s, singer:%s, wrapper.songWebUrl:%s, wifiUrl:%s", If.f295962g, If.f295963h, If.f295968p, If.f295966n);
            C101093a.m132488j(If);
            ((C77569h) C86312j.m106911c(C77569h.class)).mo35232L7(f4Var, true, bVar2.f195582i);
        }
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).mo72357nb(context2, "MusicMvMainUI", 7, C64793w23.class);
        w232.f186033d = 2;
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        w232.f186034e = uuid;
        w232.f186035f = 84;
        w232.f186036g = f4Var.mo108768t();
        try {
            intent.putExtra("key_mv_report_data", w232.toByteArray());
        } catch (IOException unused) {
        }
        C88144b.m109791i(context2, "mv", ".ui.MusicMvMainUI", intent, (Bundle) null);
        return true;
    }

    /* renamed from: d */
    public static boolean m88649d(C74023i iVar, MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        int itemId = menuItem.getItemId();
        if (itemId != 111) {
            if (itemId != 114) {
                return false;
            }
            C73745l4.m87341b(f4Var, C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f(), 512);
            return false;
        } else if (!C73764n3.m87369a(f4Var)) {
            C76879j.m92754y(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.cm7), "", bVar.mo91565f().getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
            return false;
        } else {
            C74244u.C74247d.m88515e(bVar, f4Var, iVar.mo103068y(bVar, f4Var), 2000, new C57806a(f4Var, iVar));
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m88650e(C74023i iVar, C67391b bVar, C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var, boolean z) {
        C68070l.C68072b u;
        C74023i iVar2 = iVar;
        C72963f4 f4Var2 = f4Var;
        Class cls = C79138l.class;
        int b = ((C74243t8) view.getTag()).mo103252b();
        if (f4Var.getContent() == null || (u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null)) == null) {
            return true;
        }
        int i = u.f195582i;
        if (3 == i || 76 == i) {
            C44561j GW = ((C79138l) C86312j.m106911c(cls)).mo73990GW(u.f195562d, false);
            if (((C79138l) C86312j.m106911c(cls)).E10(GW) && !C74343y0.m88768l(f4Var) && !C74343y0.m88767k(f4Var) && f4Var.getStatus() != 1) {
                e0Var.mo107136c(b, 111, 0, bVar.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            if (z || !(f4Var.getStatus() == 2 || f4Var2.f230728K == 1)) {
                C67391b bVar2 = bVar;
            } else {
                C67391b bVar3 = bVar;
                if (iVar.mo103083Q(f4Var2, bVar) && iVar.mo103081O(f4Var.mo108768t()) && !bVar.mo91580u()) {
                    e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                }
            }
            if (!(C48009v0.Fx0().mo72759TO(512) > 0) || bVar.mo91584y()) {
                C76874e0 e0Var2 = e0Var;
            } else {
                e0Var.add(b, 114, 0, (CharSequence) view.getContext().getString(C0966R.string.b9w));
            }
            C88144b.m109788f("favorite");
            if (GW == null || !GW.mo69359k()) {
                e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            }
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = f4Var.getMsgId();
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                e0Var.mo107136c(b, 129, 0, view.getContext().getString(C0966R.string.b_8), C0966R.raw.icons_filled_open);
            }
            if (!bVar.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, bVar.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            }
            return true;
        }
        Log.m105920e("MicroMsg.ChattingItemAppMsgMusic", "onCreateContextMenu(from), not music type, but enter here.");
        return true;
    }
}
