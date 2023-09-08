package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bl3.C39818r;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderShareCloseEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.NinePatchCropImageView;
import di3.C86312j;
import eb0.C75604z3;
import ee1.C31570b;
import ht1.C60165e4;
import ht1.C60166f;
import ht1.C60168f2;
import ht1.C60186m4;
import ht1.C60188n4;
import ht1.C60200t1;
import ht1.C60216z4;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76874e0;
import o40.C61926c;
import p1081gi.C98121d;
import p151er.C75651n;
import p629ny.C76979h;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import te3.C64628pk1;
import up1.C27696y;
import zj3.C79368l;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderFeed */
public class ChattingItemAppMsgFinderFeed {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderFeed$ShareCloseListener */
    public static class ShareCloseListener extends IListener<FinderShareCloseEvent> {
        public ShareCloseListener() {
            super(C40008f.f107254d);
            this.__eventId = -493502581;
        }

        public boolean callback(IEvent iEvent) {
            dead();
            ((FinderShareCloseEvent) iEvent).f9247d.getClass();
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderFeed$a */
    public static class C57720a extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f165197b;

        /* renamed from: c */
        public TextView f165198c;

        /* renamed from: d */
        public ImageView f165199d;

        /* renamed from: e */
        public TextView f165200e;

        /* renamed from: f */
        public TextView f165201f;

        /* renamed from: g */
        public ImageView f165202g;

        /* renamed from: h */
        public ImageView f165203h;

        /* renamed from: i */
        public ImageView f165204i;

        /* renamed from: j */
        public ImageIndicatorView f165205j;

        /* renamed from: k */
        public int f165206k;

        /* renamed from: l */
        public View f165207l;

        /* renamed from: m */
        public ImageView f165208m;

        /* renamed from: n */
        public LinearLayout f165209n;

        /* renamed from: o */
        public View f165210o;

        /* renamed from: a */
        public C57720a mo82133a(View view, boolean z) {
            Class cls = C75651n.class;
            super.create(view);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.b47);
            Context context = view.getContext();
            C74783i3.C6978a a = C74783i3.m89537a(context);
            int min = Math.min(a.f24704a, a.f24705b);
            boolean z2 = false;
            boolean z3 = ((C75651n) C86312j.m106911c(cls)).ld0() == 1;
            if (((C75651n) C86312j.m106911c(cls)).mo55944dw() == 1) {
                z2 = true;
            }
            float dimension = z3 ? context.getResources().getDimension(C0966R.dimen.f3743cv) : context.getResources().getDimension(C0966R.dimen.f3723cd);
            this.f165206k = z2 ? C76577a.m92151b(view.getContext(), 169) : (int) ((((float) min) - dimension) / 2.0f);
            Log.m105924i("ChattingItemAppMsgFinderFeed", "real widthPixels:" + min + " ,dp:" + dimension + " , width:" + this.f165206k);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.width = this.f165206k;
            linearLayout.setLayoutParams(layoutParams);
            this.f165197b = (ImageView) view.findViewById(C0966R.C0970id.b6_);
            this.f165198c = (TextView) view.findViewById(C0966R.C0970id.b6g);
            this.f165199d = (ImageView) view.findViewById(C0966R.C0970id.b6k);
            this.f165200e = (TextView) view.findViewById(C0966R.C0970id.ln4);
            this.f165201f = (TextView) view.findViewById(C0966R.C0970id.b6j);
            this.f165202g = (ImageView) view.findViewById(C0966R.C0970id.b6c);
            this.f165203h = (ImageView) view.findViewById(C0966R.C0970id.b6f);
            this.f165205j = (ImageIndicatorView) view.findViewById(C0966R.C0970id.b6e);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            this.f165207l = view.findViewById(C0966R.C0970id.b3p);
            this.f165208m = (ImageView) view.findViewById(C0966R.C0970id.b69);
            this.f165209n = (LinearLayout) view.findViewById(C0966R.C0970id.c2c);
            this.f165210o = view.findViewById(C0966R.C0970id.jhz);
            if (!(!((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF())) {
                this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
                this.maskView = view.findViewById(C0966R.C0970id.b7h);
            }
            ProgressBar progressBar = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            this.uploadingPB = progressBar;
            if (z) {
                this.f165204i = (ImageView) view.findViewById(C0966R.C0970id.b8x);
                ImageView imageView = this.f165199d;
                if (imageView instanceof NinePatchCropImageView) {
                    ((NinePatchCropImageView) imageView).setNinePatchId(C0966R.C0969drawable.byy);
                }
            } else {
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                ImageView imageView2 = this.f165199d;
                if (imageView2 instanceof NinePatchCropImageView) {
                    ((NinePatchCropImageView) imageView2).setNinePatchId(C0966R.C0969drawable.bym);
                }
            }
            ImageIndicatorView imageIndicatorView = this.f165205j;
            imageIndicatorView.f21262i = C0966R.color.BW_100_Alpha_0_3;
            imageIndicatorView.f21261h = C0966R.color.f2975b6;
            ImageView imageView3 = this.f165202g;
            imageView3.setImageDrawable(C74933u4.m89768e(imageView3.getContext(), z3 ? C0966R.raw.icons_filled_channel : C0966R.raw.icons_outlined_finder_icon, C76577a.m92153d(this.f165202g.getContext(), C0966R.color.f2960ag)));
            return this;
        }

        public View getMainContainerView() {
            return this.f165207l;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderFeed$b */
    public static class C57721b extends C74023i {

        /* renamed from: v */
        public C67391b f165211v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderFeed$b$a */
        public class C57722a extends C23555k.C23562d {

            /* renamed from: a */
            public final /* synthetic */ C67391b f165212a;

            /* renamed from: b */
            public final /* synthetic */ C60166f f165213b;

            /* renamed from: c */
            public final /* synthetic */ String f165214c;

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f165215d;

            public C57722a(C57721b bVar, C67391b bVar2, C60166f fVar, String str, C72963f4 f4Var) {
                this.f165212a = bVar2;
                this.f165213b = fVar;
                this.f165214c = str;
                this.f165215d = f4Var;
            }

            /* renamed from: a */
            public long mo52a(View view) {
                return this.f165215d.getMsgId() + ((long) view.hashCode());
            }

            /* renamed from: b */
            public void mo53b(View view, long j, long j2, boolean z) {
                if (z) {
                    ((C60188n4) C86312j.m106911c(C60188n4.class)).mo75339Ki(C61926c.m72671P(this.f165213b.f171710b.f185183d), this.f165213b.f171710b.f185191o, 4, ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85166dj(this.f165212a.mo91565f()), (Context) null, false, (String) null);
                    String str = this.f165214c;
                    boolean U5 = C72996z1.m85820U5(this.f165215d.mo108768t());
                    if (U5) {
                        str = str + "-" + this.f165215d.mo108768t();
                    }
                    ((C60168f2) C86312j.m106911c(C60168f2.class)).mo8598I6(U5 ? 2 : 1, 1, str, this.f165213b.f171710b.f185183d);
                }
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view == null || view.getTag() == null) {
                view = new C6807n4(layoutInflater, ((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1 ? C0966R.C0971layout.cxp : C0966R.C0971layout.f6889ra);
                C57720a aVar = new C57720a();
                aVar.mo82133a(view, false);
                view.setTag(aVar);
            }
            return view;
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
            if (!WeChatBrands.Business.Entries.SessionChannels.checkAvailable(bVar.mo91565f())) {
                return true;
            }
            ChattingItemAppMsgFinderFeed.m66487b(bVar.mo91565f(), f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            boolean z = !((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
            if (f4Var != null) {
                C88144b.m109788f("favorite");
                if (!z) {
                    C76874e0 e0Var2 = e0Var;
                    int i = b;
                    e0Var2.mo107136c(i, 111, 0, this.f165211v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                    e0Var2.mo107136c(i, 116, 0, this.f165211v.mo91572m().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                }
            }
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C60166f fVar;
            Class cls = C60200t1.class;
            if (!WeChatBrands.Business.Entries.SessionChannels.checkAvailable(view.getContext())) {
                return true;
            }
            String content = f4Var.getContent();
            C68070l.C68072b bVar2 = null;
            if (content != null) {
                bVar2 = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
            }
            if (!(bVar2 == null || (fVar = (C60166f) bVar2.mo93555w(C60166f.class)) == null)) {
                Intent intent = new Intent();
                intent.putExtra("feed_object_id", C61926c.m72671P(fVar.f171710b.f185183d));
                intent.putExtra("feed_object_nonceId", fVar.f171710b.f185191o);
                intent.putExtra("business_type", 0);
                intent.putExtra("finder_user_name", fVar.f171710b.f185184e);
                if (C72996z1.m85820U5(f4Var.mo108768t())) {
                    intent.putExtra("report_scene", 2);
                } else {
                    intent.putExtra("report_scene", 1);
                }
                intent.putExtra("from_user", f4Var.mo108768t());
                intent.putExtra("key_from_user_name", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83796n6(f4Var));
                intent.putExtra("key_ec_source", fVar.f171710b.f185182E);
                intent.putExtra("key_to_user_name", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83756C5(f4Var));
                intent.putExtra("tab_type", 6);
                if (((C60200t1) C86312j.m106911c(cls)).mo76743DB()) {
                    ((C60200t1) C86312j.m106911c(cls)).mo76842e7(26, 2, 162, intent);
                    ((C60200t1) C86312j.m106911c(cls)).mo76844fK(bVar.mo91565f(), intent);
                } else {
                    ChattingItemAppMsgFinderFeed.m66488c(view, bVar, fVar, intent, false, C72996z1.m85820U5(f4Var.mo108768t()));
                }
            }
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C67391b bVar2 = bVar;
            Class cls = C76979h.class;
            Class cls2 = C11990s0.class;
            Class cls3 = C60200t1.class;
            this.f165211v = bVar2;
            C57720a aVar = (C57720a) cVar;
            aVar.f165207l.animate().cancel();
            aVar.f165207l.setTag(Long.valueOf(System.currentTimeMillis()));
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C60166f fVar = (C60166f) u.mo93555w(C60166f.class);
                if (fVar != null) {
                    boolean z = ((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1;
                    C57722a aVar2 = r0;
                    View view = aVar.convertView;
                    C57722a aVar3 = new C57722a(this, bVar, fVar, str, f4Var);
                    C23564m.m28138h(view, aVar2);
                    ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11872i2().mo85957c(((C62368t0) C86312j.m106911c(C62368t0.class)).mo87412UE(fVar.mo85178f(), C27696y.THUMB_IMAGE), aVar.f165197b, ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT));
                    aVar.f165198c.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), ((C60200t1) C86312j.m106911c(cls3)).mo76861l7().mo83768O5(fVar.mo85179g())));
                    C60216z4 l7 = ((C60200t1) C86312j.m106911c(cls3)).mo76861l7();
                    ImageView imageView = aVar.f165208m;
                    l7.mo83761H5(imageView, aVar.f165198c, fVar.f171710b, (int) imageView.getResources().getDimension(C0966R.dimen.f3736cp));
                    LinkedList<C64628pk1> linkedList = fVar.f171710b.f185190n;
                    if (!linkedList.isEmpty()) {
                        C64628pk1 pk12 = linkedList.get(0);
                        String str2 = pk12.f184832j;
                        String str3 = pk12.f184834o;
                        String str4 = (str3 == null || str3.isEmpty()) ? pk12.f184828f : pk12.f184834o;
                        ImageView imageView2 = aVar.f165199d;
                        C11978e0.C11979a aVar4 = C11978e0.C11979a.COMMON;
                        ((C60200t1) C86312j.m106911c(cls3)).mo76741Cm(str4, imageView2, aVar4);
                        if (!Util.isNullOrNil(str2)) {
                            ((C60200t1) C86312j.m106911c(cls3)).mo76741Cm(str2, (ImageView) null, aVar4);
                        }
                        ChattingItemAppMsgFinderFeed.m66486a(aVar, linkedList);
                    }
                    if (fVar.f171710b.f185188i == 1) {
                        aVar.f165200e.setVisibility(8);
                        aVar.f165199d.setVisibility(8);
                        aVar.f165201f.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), fVar.f171710b.f185187h));
                        aVar.f165201f.setVisibility(0);
                    } else {
                        aVar.f165200e.setVisibility(8);
                        aVar.f165199d.setVisibility(0);
                        aVar.f165201f.setVisibility(8);
                        int i = fVar.f171710b.f185188i;
                        if (i == 4 || i == 6) {
                            aVar.f165203h.setVisibility(0);
                            aVar.f165205j.setVisibility(8);
                        } else if (i == 2) {
                            aVar.f165203h.setVisibility(8);
                            aVar.f165205j.setVisibility(0);
                            aVar.f165205j.f21258e = linkedList.size();
                        } else {
                            aVar.f165203h.setVisibility(8);
                        }
                    }
                    if (z) {
                        View view2 = aVar.f165210o;
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar5.mo10233c(8);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View view4 = aVar.f165210o;
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar6.mo10233c(0);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C85875k4.m106189j0(aVar.f165198c.getPaint(), 0.8f);
                    }
                    if (aVar.f165209n != null) {
                        ((C60200t1) C86312j.m106911c(cls3)).mo76861l7().mo83777X5(aVar.f165209n, C0966R.C0969drawable.f357203a53, z ? C0966R.C0969drawable.f357202cj3 : C0966R.C0969drawable.f357201a52);
                    }
                }
                aVar.clickArea.setOnClickListener(mo103099u(bVar2));
                aVar.clickArea.setOnLongClickListener(mo103098p(bVar2));
                aVar.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                aVar.clickArea.setTag(new C74243t8(f4Var, this.f165211v.mo91583x(), aVar, (String) null));
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 754974769;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderFeed$c */
    public static class C57723c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f165216v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderFeed$c$a */
        public class C57724a extends C23555k.C23562d {

            /* renamed from: a */
            public final /* synthetic */ C67391b f165217a;

            /* renamed from: b */
            public final /* synthetic */ C60166f f165218b;

            /* renamed from: c */
            public final /* synthetic */ String f165219c;

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f165220d;

            public C57724a(C57723c cVar, C67391b bVar, C60166f fVar, String str, C72963f4 f4Var) {
                this.f165217a = bVar;
                this.f165218b = fVar;
                this.f165219c = str;
                this.f165220d = f4Var;
            }

            /* renamed from: a */
            public long mo52a(View view) {
                return this.f165220d.getMsgId() + ((long) view.hashCode());
            }

            /* renamed from: b */
            public void mo53b(View view, long j, long j2, boolean z) {
                if (z) {
                    ((C60188n4) C86312j.m106911c(C60188n4.class)).mo75339Ki(C61926c.m72671P(this.f165218b.f171710b.f185183d), this.f165218b.f171710b.f185191o, 4, ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85166dj(this.f165217a.mo91565f()), (Context) null, false, (String) null);
                    String str = this.f165219c;
                    boolean U5 = C72996z1.m85820U5(this.f165220d.mo108768t());
                    if (U5) {
                        str = str + "-" + this.f165220d.mo108768t();
                    }
                    ((C60168f2) C86312j.m106911c(C60168f2.class)).mo8598I6(U5 ? 2 : 1, 1, str, this.f165218b.f171710b.f185183d);
                }
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view == null || view.getTag() == null) {
                view = new C6807n4(layoutInflater, ((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1 ? C0966R.C0971layout.cxs : C0966R.C0971layout.f6939sr);
                C57720a aVar = new C57720a();
                aVar.mo82133a(view, true);
                view.setTag(aVar);
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
            ChattingItemAppMsgFinderFeed.m66487b(bVar.mo91565f(), f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            boolean z = !((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
            if (f4Var != null && !z) {
                e0Var.mo107136c(b, 111, 0, this.f165216v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, 116, 0, this.f165216v.mo91572m().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f165216v) && mo103081O(f4Var.mo108768t()) && !this.f165216v.mo91580u()) {
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
            C60166f fVar;
            Class cls = C60200t1.class;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (!(u == null || (fVar = (C60166f) u.mo93555w(C60166f.class)) == null)) {
                Intent intent = new Intent();
                intent.putExtra("feed_object_id", C61926c.m72671P(fVar.f171710b.f185183d));
                intent.putExtra("feed_object_nonceId", fVar.f171710b.f185191o);
                intent.putExtra("business_type", 0);
                intent.putExtra("finder_user_name", fVar.f171710b.f185184e);
                if (C72996z1.m85820U5(f4Var.mo108768t())) {
                    intent.putExtra("report_scene", 2);
                } else {
                    intent.putExtra("report_scene", 1);
                }
                intent.putExtra("from_user", f4Var.mo108768t());
                intent.putExtra("key_from_user_name", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83796n6(f4Var));
                intent.putExtra("key_ec_source", fVar.f171710b.f185182E);
                intent.putExtra("key_to_user_name", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83756C5(f4Var));
                intent.putExtra("tab_type", 6);
                if (((C60200t1) C86312j.m106911c(cls)).mo76743DB()) {
                    ((C60200t1) C86312j.m106911c(cls)).mo76842e7(26, 2, 162, intent);
                    ((C60200t1) C86312j.m106911c(cls)).mo76844fK(bVar.mo91565f(), intent);
                } else {
                    ChattingItemAppMsgFinderFeed.m66488c(view, bVar, fVar, intent, true, C72996z1.m85820U5(f4Var.mo108768t()));
                }
            }
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            int i;
            int i2;
            C67391b bVar2 = bVar;
            Class cls = C76979h.class;
            Class cls2 = C11990s0.class;
            Class cls3 = C79368l.class;
            Class cls4 = C60200t1.class;
            this.f165216v = bVar2;
            C57720a aVar = (C57720a) cVar;
            aVar.f165207l.animate().cancel();
            aVar.f165207l.setTag(Long.valueOf(System.currentTimeMillis()));
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C60166f fVar = (C60166f) u.mo93555w(C60166f.class);
                C57724a aVar2 = r0;
                View view = aVar.convertView;
                C57724a aVar3 = new C57724a(this, bVar, fVar, str, f4Var);
                C23564m.m28138h(view, aVar2);
                C60166f fVar2 = fVar;
                if (fVar2 != null) {
                    boolean z = ((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1;
                    ((C11990s0) C39818r.f106831a.mo62446e(cls4).mo62447c(cls2)).mo11872i2().mo85957c(((C62368t0) C86312j.m106911c(C62368t0.class)).mo87412UE(fVar2.mo85178f(), C27696y.THUMB_IMAGE), aVar.f165197b, ((C11990s0) C39818r.f106831a.mo62446e(cls4).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT));
                    aVar.f165198c.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), ((C60200t1) C86312j.m106911c(cls4)).mo76861l7().mo83768O5(fVar2.mo85179g())));
                    C60216z4 l7 = ((C60200t1) C86312j.m106911c(cls4)).mo76861l7();
                    ImageView imageView = aVar.f165208m;
                    l7.mo83761H5(imageView, aVar.f165198c, fVar2.f171710b, (int) imageView.getResources().getDimension(C0966R.dimen.f3736cp));
                    LinkedList<C64628pk1> linkedList = fVar2.f171710b.f185190n;
                    if (!linkedList.isEmpty()) {
                        i2 = 0;
                        C64628pk1 pk12 = linkedList.get(0);
                        String str2 = pk12.f184832j;
                        String str3 = pk12.f184834o;
                        String str4 = (str3 == null || str3.isEmpty()) ? pk12.f184828f : pk12.f184834o;
                        ImageView imageView2 = aVar.f165199d;
                        C11978e0.C11979a aVar4 = C11978e0.C11979a.COMMON;
                        ((C60200t1) C86312j.m106911c(cls4)).mo76741Cm(str4, imageView2, aVar4);
                        if (!Util.isNullOrNil(str2)) {
                            ((C60200t1) C86312j.m106911c(cls4)).mo76741Cm(str2, (ImageView) null, aVar4);
                        }
                        ChattingItemAppMsgFinderFeed.m66486a(aVar, linkedList);
                    } else {
                        i2 = 0;
                    }
                    if (fVar2.f171710b.f185188i == 1) {
                        i = 8;
                        aVar.f165200e.setVisibility(8);
                        aVar.f165199d.setVisibility(8);
                        aVar.f165201f.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), fVar2.f171710b.f185187h));
                        aVar.f165201f.setVisibility(i2);
                    } else {
                        i = 8;
                        aVar.f165200e.setVisibility(8);
                        aVar.f165199d.setVisibility(i2);
                        aVar.f165201f.setVisibility(8);
                        int i3 = fVar2.f171710b.f185188i;
                        if (i3 == 4 || i3 == 6) {
                            aVar.f165203h.setVisibility(i2);
                            aVar.f165205j.setVisibility(8);
                        } else if (i3 == 2) {
                            aVar.f165203h.setVisibility(8);
                            aVar.f165205j.setVisibility(i2);
                            aVar.f165205j.f21258e = linkedList.size();
                        } else {
                            aVar.f165203h.setVisibility(8);
                        }
                    }
                    if (z) {
                        View view2 = aVar.f165210o;
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar5.mo10233c(Integer.valueOf(i));
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar5.mo10231a(i2)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View view4 = aVar.f165210o;
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar6.mo10233c(Integer.valueOf(i2));
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar6.mo10231a(i2)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed$ChattingItemAppMsgFinderFeedTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C85875k4.m106189j0(aVar.f165198c.getPaint(), 0.8f);
                    }
                    if (aVar.f165209n != null) {
                        ((C60200t1) C86312j.m106911c(cls4)).mo76861l7().mo83777X5(aVar.f165209n, C0966R.C0969drawable.f357203a53, z ? C0966R.C0969drawable.f357202cj3 : C0966R.C0969drawable.f357201a52);
                    }
                } else {
                    i2 = 0;
                    i = 8;
                }
                aVar.clickArea.setOnClickListener(mo103099u(bVar2));
                aVar.clickArea.setOnLongClickListener(mo103098p(bVar2));
                aVar.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(cls3)).mo108189Z4());
                aVar.clickArea.setTag(new C74243t8(f4Var, this.f165216v.mo91583x(), aVar, (String) null));
            } else {
                C72963f4 f4Var2 = f4Var;
                i2 = 0;
                i = 8;
            }
            if (C74023i.m87878T()) {
                ProgressBar progressBar = aVar.uploadingPB;
                if (progressBar != null) {
                    progressBar.setVisibility(i);
                }
                if (f4Var.getStatus() != 2 || !mo103080N((C79368l) bVar2.f193278b.mo102812a(cls3), f4Var.getMsgId())) {
                    ImageView imageView3 = aVar.f165204i;
                    if (imageView3 != null) {
                        imageView3.setVisibility(i);
                    }
                } else {
                    ImageView imageView4 = aVar.f165204i;
                    if (imageView4 != null) {
                        imageView4.setVisibility(i2);
                    }
                }
            } else {
                ImageView imageView5 = aVar.f165204i;
                if (imageView5 != null) {
                    imageView5.setVisibility(i);
                }
                mo103093i0(aVar, f4Var.getStatus() < 2, true);
            }
            mo103087e0(aVar, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 754974769;
        }
    }

    /* renamed from: a */
    public static void m66486a(C57720a aVar, List list) {
        C64628pk1 pk12 = (C64628pk1) list.get(0);
        int i = aVar.f165206k;
        float f = (float) i;
        int i2 = (int) ((f * 4.0f) / 3.0f);
        if (i > ((int) ((pk12.f184830h * f) / pk12.f184829g))) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar.f165199d.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i;
            ViewGroup.LayoutParams layoutParams2 = aVar.clickArea.getLayoutParams();
            layoutParams2.width = i2;
            layoutParams2.height = i;
            aVar.f165199d.setLayoutParams(layoutParams);
            aVar.clickArea.setLayoutParams(layoutParams2);
            return;
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) aVar.f165199d.getLayoutParams();
        layoutParams3.width = i;
        layoutParams3.height = i2;
        ViewGroup.LayoutParams layoutParams4 = aVar.clickArea.getLayoutParams();
        layoutParams4.width = i;
        layoutParams4.height = i2;
        aVar.f165199d.setLayoutParams(layoutParams3);
        aVar.clickArea.setLayoutParams(layoutParams4);
    }

    /* renamed from: b */
    public static void m66487b(Activity activity, C72963f4 f4Var) {
        C68070l.C68072b u;
        if (!Util.isNullOrNil(f4Var.getContent()) && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
            Intent intent = new Intent(activity, MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            intent.putExtra("Retr_Msg_Type", 18);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: c */
    public static void m66488c(View view, C67391b bVar, C60166f fVar, Intent intent, boolean z, boolean z2) {
        Class cls = C60200t1.class;
        bVar.mo91565f();
        intent.putExtra("KEY_AUTHORIZATION_CONTENT", C68070l.C68072b.m80420s(((C60186m4) C86312j.m106911c(C60186m4.class)).mo85185DC(fVar.f171710b), (String) null, (C98121d) null));
        intent.putExtra("KEY_FINDER_FORWARD_SOURCE", fVar.f171710b.f185180C);
        if (z2) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
        }
        intent.putExtra("key_finder_teen_mode_check", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5());
        intent.putExtra("key_finder_teen_mode_user_name", fVar.mo85179g());
        intent.putExtra("key_finder_teen_mode_user_id", fVar.f171710b.f185184e);
        intent.putExtra("KEY_INTENT_ENTER_ITEM_ID", C61926c.m72671P(fVar.f171710b.f185183d));
        ((C31570b) C86312j.m106911c(C31570b.class)).mo8445ge(intent, view, 280);
        C60188n4 n4Var = (C60188n4) C86312j.m106911c(C60188n4.class);
        int i = 3;
        if (!n4Var.mo75337Fv() || !n4Var.k90()) {
            C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
            if (!z2) {
                i = 2;
            }
            t1Var.mo76842e7(i, 2, 25, intent);
            ((C60200t1) C86312j.m106911c(cls)).mo76864nr(bVar.mo91565f(), intent);
            return;
        }
        C60200t1 t1Var2 = (C60200t1) C86312j.m106911c(cls);
        if (!z2) {
            i = 2;
        }
        t1Var2.mo76842e7(i, 2, 20, intent);
        intent.putExtra("KEY_FINDER_POST_FINISH_JUMP_HOT_TAB", true);
        intent.putExtra("KEY_OBJECT_ID", C61926c.m72671P(fVar.f171710b.f185183d));
        intent.putExtra("KEY_OBJECT_NONCE_ID", fVar.f171710b.f185191o);
        intent.putExtra("FROM_SCENE_KEY", 6);
        ((C60200t1) C86312j.m106911c(cls)).Hm0(bVar.mo91565f(), intent);
    }
}
