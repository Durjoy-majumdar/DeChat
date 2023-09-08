package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.SpannableString;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl3.C39818r;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.plugin.C67651f;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.chatting.TextPreviewUI;
import com.tencent.p014mm.p136ui.chatting.component.C19729d;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.album.view.ChattingAlbumContainer;
import com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.thumbplayer.api.TPOptionalID;
import de3.C45331f0;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C86493v0;
import eb0.C97625j3;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import jm2.C46562a;
import k20.C60958c;
import k20.C9556a;
import kb0.C76528a;
import ke3.C88144b;
import kg3.C76577a;
import lg3.C76695c;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76891l0;
import nj3.C88990b;
import p629ny.C76979h;
import te3.C101801kd0;
import te3.C101835rd0;
import u73.C101982p;
import u73.C14134p0;
import uc0.C52515a;
import uc0.C52517f0;
import uk3.C78222a;
import uo3.C78253a;
import w72.C78521a;
import ww0.C78732i;
import xi3.C15692e;
import xi3.C15702i;
import xo3.C78950d;
import xo3.C78967g;
import zj3.C79348e;
import zj3.C79350e1;
import zj3.C79368l;
import zj3.C79371n;
import zj3.C79374o0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.s2 */
public class C74202s2 extends C74023i implements NeatTextView.C75245c {

    /* renamed from: v */
    public C67391b f217823v;

    /* renamed from: w */
    public CharSequence f217824w;

    /* renamed from: x */
    public C74298x2 f217825x;

    /* renamed from: y */
    public int f217826y = -1;

    /* renamed from: z */
    public int f217827z = -1;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$a */
    public class C74203a implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C74193r2 f217828d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f217829e;

        /* renamed from: f */
        public final /* synthetic */ C72963f4 f217830f;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$a$a */
        public class C74204a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ View f217832d;

            /* renamed from: e */
            public final /* synthetic */ long f217833e;

            /* renamed from: f */
            public final /* synthetic */ MsgQuoteItem f217834f;

            public C74204a(View view, long j, MsgQuoteItem msgQuoteItem) {
                this.f217832d = view;
                this.f217833e = j;
                this.f217834f = msgQuoteItem;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C74203a aVar = C74203a.this;
                C67391b bVar = aVar.f217829e;
                C74202s2 s2Var = C74202s2.this;
                C74287w2.m88624d(bVar, s2Var, aVar.f217830f, this.f217832d, this.f217833e, this.f217834f, s2Var.f217197d);
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C74203a(C74193r2 r2Var, C67391b bVar, C72963f4 f4Var) {
            this.f217828d = r2Var;
            this.f217829e = bVar;
            this.f217830f = f4Var;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            try {
                long longValue = ((Long) this.f217828d.f217787b.getTag(C0966R.C0970id.f357682b73)).longValue();
                int i = C78521a.f230007a;
                if (!(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_msg_quote_fourth_stage_switch, 1) == 1)) {
                    Log.m105925i("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV long click disable:%s", Long.valueOf(longValue));
                    C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
                Log.m105925i("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV long click msgId:%s", Long.valueOf(longValue));
                ((C79374o0) this.f217829e.f193278b.mo102812a(C79374o0.class)).mo102668h1(view, new C74204a(view, longValue, (MsgQuoteItem) this.f217828d.f217788c.getTag()));
                C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV long click Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$b */
    public class C74205b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C74193r2 f217836d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f217837e;

        public C74205b(C74193r2 r2Var, C67391b bVar) {
            this.f217836d = r2Var;
            this.f217837e = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                long longValue = ((Long) this.f217836d.f217787b.getTag(C0966R.C0970id.f357682b73)).longValue();
                Log.m105925i("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV click msgId:%s", Long.valueOf(longValue));
                C67391b bVar = this.f217837e;
                C74202s2 s2Var = C74202s2.this;
                C74287w2.m88623c(bVar, s2Var, view, longValue, (MsgQuoteItem) this.f217836d.f217788c.getTag(), s2Var.f217197d);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV click Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$c */
    public class C74206c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C74193r2 f217839d;

        public C74206c(C74202s2 s2Var, C74193r2 r2Var) {
            this.f217839d = r2Var;
        }

        public void run() {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f217839d.clickArea.getLayoutParams();
            layoutParams.height = this.f217839d.f217801p.getHeight();
            layoutParams.width = this.f217839d.f217801p.getWidth();
            this.f217839d.clickArea.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$d */
    public class C74207d implements PopupWindow.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C67391b f217840d;

        /* renamed from: e */
        public final /* synthetic */ C74193r2 f217841e;

        public C74207d(C67391b bVar, C74193r2 r2Var) {
            this.f217840d = bVar;
            this.f217841e = r2Var;
        }

        public void onDismiss() {
            this.f217840d.mo91545F(true);
            C78253a aVar = this.f217841e.f217795j;
            C67391b bVar = this.f217840d;
            C74202s2 s2Var = C74202s2.this;
            C74023i.m87879U(aVar, bVar, s2Var.f217827z, s2Var.f217826y, 49);
            C74202s2 s2Var2 = C74202s2.this;
            s2Var2.f217827z = -1;
            s2Var2.f217826y = -1;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$e */
    public class C74208e implements C76891l0 {

        /* renamed from: a */
        public final /* synthetic */ Context f217843a;

        /* renamed from: b */
        public final /* synthetic */ C74193r2 f217844b;

        /* renamed from: c */
        public final /* synthetic */ C67391b f217845c;

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f217846d;

        public C74208e(Context context, C74193r2 r2Var, C67391b bVar, C72963f4 f4Var) {
            this.f217843a = context;
            this.f217844b = r2Var;
            this.f217845c = bVar;
            this.f217846d = f4Var;
        }

        /* renamed from: a */
        public void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            e0Var.clear();
            e0Var.mo107136c(0, 0, 0, this.f217843a.getResources().getString(C0966R.string.f7936wt), C0966R.raw.icons_filled_copy);
            CharSequence a = this.f217844b.f217787b.mo154968a();
            C74243t8 t8Var = (C74243t8) this.f217844b.f217787b.getTag();
            int h = t8Var != null ? C75569c4.m90675h(t8Var.f212238a) : 0;
            if (h <= 0 || h >= a.length()) {
                e0Var.mo107136c(0, 1, 0, this.f217843a.getResources().getString(C0966R.string.gs4), C0966R.raw.icons_filled_allselect);
            }
            e0Var.mo107136c(0, 2, 0, this.f217843a.getResources().getString(C0966R.string.f361028gs2), C0966R.raw.icons_filled_share);
            e0Var.mo107136c(0, 3, 0, this.f217843a.getResources().getString(C0966R.string.cmx), C0966R.raw.icons_filled_favorites);
            e0Var.mo107136c(0, 4, 0, this.f217843a.getResources().getString(C0966R.string.b_i), C0966R.raw.icons_filled_search_logo);
            String Lp0 = ((C78732i) C86312j.m106911c(C78732i.class)).Lp0(C74202s2.this.f217824w.toString());
            if (!Util.isNullOrNil(Lp0)) {
                C74202s2 s2Var = C74202s2.this;
                C78253a aVar = this.f217844b.f217795j;
                C67391b bVar = this.f217845c;
                s2Var.getClass();
                aVar.f229235K = new C74070j(s2Var, bVar, Lp0);
            }
            if (Util.isNullOrNil(Lp0)) {
                this.f217844b.f217795j.f229235K = null;
            }
            C74202s2.this.mo103071D(this.f217845c, this.f217846d, 1, !Util.isNullOrNil(Lp0), C74202s2.this.f217824w.toString(), true, "65_" + C31543z5.m39453c(), 3);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$f */
    public class C74209f implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C74193r2 f217848d;

        /* renamed from: e */
        public final /* synthetic */ Context f217849e;

        /* renamed from: f */
        public final /* synthetic */ C67391b f217850f;

        /* renamed from: g */
        public final /* synthetic */ C72963f4 f217851g;

        public C74209f(C74193r2 r2Var, Context context, C67391b bVar, C72963f4 f4Var) {
            this.f217848d = r2Var;
            this.f217849e = context;
            this.f217850f = bVar;
            this.f217851g = f4Var;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C101835rd0 rd02;
            C74243t8 t8Var;
            C74202s2 s2Var = C74202s2.this;
            s2Var.f217827z = i;
            s2Var.f217826y = menuItem.getItemId();
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                Context context = MMApplicationContext.getContext();
                CharSequence charSequence = C74202s2.this.f217824w;
                ClipboardHelper.setText(context, charSequence, charSequence);
                C78950d dVar = this.f217848d.f217796k;
                if (dVar != null) {
                    dVar.mo108922f();
                    C78950d dVar2 = this.f217848d.f217796k;
                    dVar2.f231828C = true;
                    dVar2.f231829D = true;
                    dVar2.mo108921e();
                }
                C74059i7.m88003h(this.f217849e);
            } else if (itemId == 1) {
                C78950d dVar3 = this.f217848d.f217796k;
                if (dVar3 != null) {
                    C78950d.C78963m mVar = dVar3.f231845g;
                    if (mVar != null) {
                        mVar.mo103119d();
                    }
                    C78950d dVar4 = this.f217848d.f217796k;
                    dVar4.f231828C = true;
                    dVar4.mo108921e();
                    C74193r2 r2Var = this.f217848d;
                    r2Var.f217796k.mo108923g(0, r2Var.f217787b.mo154968a().length());
                    this.f217848d.f217796k.mo108924h();
                    this.f217848d.f217796k.mo108927k();
                    C78950d.C78963m mVar2 = this.f217848d.f217796k.f231845g;
                    if (mVar2 != null) {
                        mVar2.mo103120e();
                    }
                }
            } else if (itemId == 2) {
                C74243t8 t8Var2 = (C74243t8) this.f217848d.f217787b.getTag();
                if (t8Var2 != null) {
                    Context context2 = this.f217849e;
                    C6789c.m7088a(t8Var2.f212238a, context2, new s2$f$$a(this, context2));
                }
            } else if (itemId == 3) {
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                C96787m0.m124258l(doFavoriteEvent, C74202s2.this.f217824w.toString(), 1);
                DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                aVar.f264685j = C74202s2.this.f217823v.f193286j;
                aVar.f264688m = 43;
                C101801kd0 kd02 = aVar.f264676a;
                if (!(kd02 == null || (rd02 = kd02.f298616d) == null || (t8Var = (C74243t8) this.f217848d.f217787b.getTag()) == null)) {
                    rd02.mo141275k(t8Var.f212238a.mo108768t());
                    rd02.mo141279o(C75592q0.m90789s());
                    doFavoriteEvent.publish();
                }
                C78950d dVar5 = this.f217848d.f217796k;
                if (dVar5 != null) {
                    dVar5.mo108922f();
                    C78950d dVar6 = this.f217848d.f217796k;
                    dVar6.f231828C = true;
                    dVar6.f231829D = true;
                    dVar6.mo108921e();
                }
            } else if (itemId == 4) {
                String str = "65_" + C31543z5.m39453c();
                String charSequence2 = C74202s2.this.f217824w.toString();
                C74202s2.this.mo103071D(this.f217850f, this.f217851g, 2, !Util.isNullOrNil(((C78732i) C86312j.m106911c(C78732i.class)).Lp0(charSequence2)), charSequence2, true, str, 3);
                C14134p0 p0Var = new C14134p0();
                p0Var.f39544a = this.f217849e;
                p0Var.f39545b = 65;
                p0Var.f39547d = charSequence2;
                p0Var.f39548e = str;
                p0Var.f39549f = true;
                p0Var.f39552i = false;
                ((C101982p) C86312j.m106911c(C101982p.class)).mo6877X6(p0Var);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$g */
    public class C74210g implements C78950d.C78961k {
        public C74210g() {
        }

        /* renamed from: a */
        public void mo102127a(CharSequence charSequence) {
            C74202s2.this.f217824w = charSequence;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$h */
    public class C74211h extends C78950d.C78963m {

        /* renamed from: a */
        public final /* synthetic */ C74193r2 f217854a;

        public C74211h(C74202s2 s2Var, C74193r2 r2Var) {
            this.f217854a = r2Var;
        }

        /* renamed from: a */
        public void mo103116a() {
            this.f217854a.f217796k.mo108922f();
            C78950d dVar = this.f217854a.f217796k;
            dVar.f231828C = true;
            dVar.f231829D = true;
            dVar.mo108921e();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$i */
    public class C74212i implements MMNeat7extView.C74954d {

        /* renamed from: a */
        public final /* synthetic */ C74193r2 f217855a;

        public C74212i(C74202s2 s2Var, C74193r2 r2Var) {
            this.f217855a = r2Var;
        }

        /* renamed from: a */
        public void mo103126a(CharSequence charSequence, TextView.BufferType bufferType) {
            if (((Boolean) this.f217855a.f217787b.getTag(C0966R.C0970id.f357681b72)).booleanValue()) {
                C78222a.m94508a().getClass();
                C78222a.C78223a.TEXT_CALLBACK.mo108242a(charSequence, bufferType, ((Long) this.f217855a.f217787b.getTag(C0966R.C0970id.f357682b73)).longValue());
            }
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6900ro);
        C74193r2 r2Var = new C74193r2();
        r2Var.mo103226a(n4Var, true);
        n4Var.setTag(r2Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        int t;
        int t2;
        Class cls = C79348e.class;
        Class cls2 = C79350e1.class;
        Class<MsgRetransmitUI> cls3 = MsgRetransmitUI.class;
        int itemId = menuItem.getItemId();
        if (itemId == 102) {
            String str = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91582w(), f4Var.getContent(), f4Var.mo108769t2()), (String) null).f195570f;
            ClipboardHelper.setText(str);
            C46562a aVar = C46562a.INSTANCE;
            aVar.F80(1, f4Var.mo108774y2() + "", Util.getUTF8ByteLength(str));
            return false;
        } else if (itemId != 111) {
            if (itemId == 152) {
                ((C79350e1) bVar.f193278b.mo102812a(cls2)).mo102311d5(f4Var);
            } else if (itemId == 124 || itemId == 125) {
                ((C79350e1) bVar.f193278b.mo102812a(cls2)).mo102305S2(menuItem, f4Var);
            } else {
                switch (itemId) {
                    case 141:
                        String G2 = f4Var.mo108727G2();
                        if (!Util.isNullOrNil(G2)) {
                            ClipboardHelper.setText(G2);
                        }
                        C76879j.m92726T(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.f7938wv));
                        return true;
                    case TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /*142*/:
                        Intent intent = new Intent(bVar.mo91565f(), cls3);
                        String G22 = f4Var.mo108727G2();
                        if (bVar.mo91583x() && !((C79348e) bVar.f193278b.mo102812a(cls)).mo70071q1() && (t = C75604z3.m90848t(G22)) != -1) {
                            G22 = G22.substring(t + 1).trim();
                        }
                        if (f4Var.mo100988a4()) {
                            intent.putExtra("Retr_Msg_content", G22);
                            intent.putExtra("Retr_Msg_Type", 6);
                        } else {
                            intent.putExtra("Retr_Msg_content", G22);
                            intent.putExtra("Retr_Msg_Type", 4);
                        }
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent);
                        C117292a.m165358d(bVar, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        bVar.mo91556Q((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return true;
                    case TPOptionalID.f349338xc9bdf6cd /*143*/:
                        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                        String G23 = f4Var.mo108727G2();
                        if (bVar.mo91583x() && !((C79348e) bVar.f193278b.mo102812a(cls)).mo70071q1() && (t2 = C75604z3.m90848t(G23)) != -1) {
                            G23 = G23.substring(t2 + 1).trim();
                        }
                        C96787m0.m124258l(doFavoriteEvent, G23, 1);
                        DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
                        aVar3.f264685j = bVar.f193286j;
                        aVar3.f264688m = 43;
                        C101801kd0 kd02 = aVar3.f264676a;
                        if (kd02 == null) {
                            Log.m105920e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", " transform text fav failed");
                            break;
                        } else {
                            C101835rd0 rd02 = kd02.f298616d;
                            if (rd02 != null) {
                                rd02.mo141275k(f4Var.mo108768t());
                                rd02.mo141279o(C75592q0.m90789s());
                                doFavoriteEvent.publish();
                                return true;
                            }
                        }
                        break;
                    default:
                        return false;
                }
            }
            return false;
        } else {
            Intent intent2 = new Intent(bVar.mo91565f(), cls3);
            intent2.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
            intent2.putExtra("Retr_Msg_Type", 2);
            intent2.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(intent2);
            C117292a.m165358d(bVar, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar.mo91556Q((Intent) aVar4.mo10231a(0));
            C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
        int b = cVar.mo103252b();
        int i = cVar.f216964T;
        if (i == 1) {
            if (!C75569c4.m90687t(f4Var)) {
                C76874e0 e0Var2 = e0Var;
                int i2 = b;
                e0Var2.mo107136c(i2, 102, 0, this.f217823v.mo91572m().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                e0Var2.mo107136c(i2, 111, 0, this.f217823v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            C88144b.m109788f("favorite");
            e0Var.mo107136c(b, 116, 0, this.f217823v.mo91572m().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            if (C67651f.m79887a() && (!f4Var.mo101015s3() || !f4Var.mo101006n3())) {
                e0Var.mo107136c(b, 124, 0, view.getContext().getString(C0966R.string.b_m), C0966R.raw.icons_filled_translate);
            }
            if (!this.f217823v.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, this.f217823v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            }
            if (C75569c4.m90690w(f4Var)) {
                e0Var.clear();
                if (!this.f217823v.mo91584y()) {
                    e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                }
            }
        } else if (i == 2) {
            Log.m105920e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "翻译消息右键菜单");
            C76874e0 e0Var3 = e0Var;
            int i3 = b;
            e0Var3.mo107136c(i3, 141, 0, view.getContext().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
            e0Var3.mo107136c(i3, TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            C88144b.m109788f("favorite");
            e0Var.mo107136c(b, TPOptionalID.f349338xc9bdf6cd, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            if (!C67651f.m79887a() || !f4Var.mo101015s3() || !f4Var.mo101006n3()) {
                return false;
            }
            C76874e0 e0Var4 = e0Var;
            int i4 = b;
            e0Var4.mo107136c(i4, 124, 0, view.getContext().getString(C0966R.string.b_k), C0966R.raw.icons_filled_eyes_off);
            e0Var4.mo107136c(i4, 152, 0, view.getContext().getString(C0966R.string.ml5), C0966R.raw.icons_filled_feedback_error);
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: b */
    public boolean mo103047b(View view, MotionEvent motionEvent) {
        Intent intent = new Intent(view.getContext(), TextPreviewUI.class);
        intent.addFlags(67108864);
        C74243t8 t8Var = (C74243t8) view.getTag();
        if (t8Var == null) {
            return true;
        }
        CharSequence a = ((MMNeat7extView) view).mo154968a();
        intent.putExtra("Chat_Msg_Id", t8Var.f212238a.getMsgId());
        intent.putExtra("key_chat_text", a);
        C67391b bVar = this.f217823v;
        if (bVar != null) {
            intent.putExtra("is_group_chat", bVar.mo91583x());
        }
        Context context = view.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C88990b.m111199h(view.getContext());
        return true;
    }

    /* renamed from: d */
    public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
        return new C74277v2(f4Var, context, iVar);
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        int i;
        int i2;
        Class cls;
        int i3;
        String str2;
        ChattingItemTranslate.C73918e eVar;
        ViewStub viewStub;
        int i4;
        int i5;
        int indexOf;
        C74023i.C74026c cVar2 = cVar;
        C67391b bVar2 = bVar;
        C72963f4 f4Var2 = f4Var;
        Class cls2 = C79368l.class;
        Class cls3 = C76979h.class;
        this.f217823v = bVar2;
        ((C79371n) bVar2.f193278b.mo102812a(C79371n.class)).mo102406W4(f4Var2);
        C19729d.m21411h6(bVar2, cVar2.convertView, f4Var2);
        C74193r2 r2Var = (C74193r2) cVar2;
        r2Var.f217787b.setTag(C0966R.C0970id.f357682b73, Long.valueOf(f4Var.getMsgId()));
        MMNeat7extView mMNeat7extView = r2Var.f217787b;
        Boolean bool = Boolean.TRUE;
        mMNeat7extView.setTag(C0966R.C0970id.f357681b72, bool);
        if (C76695c.m92341b() && C76695c.m92343d()) {
            C74193r2.m88426b(f4Var2, r2Var, bVar2, bool);
        }
        String content = f4Var.getContent();
        if (bVar.mo91583x() && (indexOf = f4Var.getContent().indexOf(58)) != -1) {
            content = f4Var.getContent().substring(indexOf + 1);
        }
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null && u.f195582i == 57) {
            Pair<Boolean, CharSequence> g = C78521a.m94855g(bVar.mo91565f(), r2Var.f217788c.getTextSize(), f4Var2, u.f195641w2);
            r2Var.f217788c.setText(((C76979h) C86312j.m106911c(cls3)).mo107057T1(r2Var.f217787b.getContext(), (CharSequence) g.second));
            r2Var.f217788c.setTag(u.f195641w2);
            boolean v1 = ((C79368l) bVar2.f193278b.mo102812a(cls2)).mo108213v1();
            C52515a jo = C52517f0.vx0().mo73451jo(bVar.mo91577r());
            int intValue = ((Integer) C97625j3.m125812b().mo105906u().mo119684e(12311, -2)).intValue();
            if ((jo == null || jo.f146672b == -2) && (jo != null || intValue == -2)) {
                if (v1) {
                    r2Var.f217788c.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
                    r2Var.f217801p.setBackgroundResource(C0966R.C0969drawable.ahi);
                } else {
                    r2Var.f217788c.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f3287m_));
                    r2Var.f217801p.setBackgroundResource(C0966R.C0969drawable.ahh);
                }
            } else if (v1) {
                r2Var.f217788c.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f3287m_));
                r2Var.f217801p.setBackgroundResource(C0966R.C0969drawable.ahk);
            } else {
                r2Var.f217788c.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.a7e));
                r2Var.f217801p.setBackgroundResource(C0966R.C0969drawable.ahj);
            }
            C72963f4 a = C74287w2.m88621a(C74287w2.m88622b(bVar2, f4Var.getMsgId(), u.f195641w2, "handleQuoteMsgFillingFrom"), u.f195641w2);
            int j = C78521a.m94858j(a);
            if (j != -1) {
                r2Var.f217790e.setVisibility(0);
                C39818r rVar = C39818r.f106831a;
                ((C15702i) rVar.mo62443b(bVar.mo91565f()).mo75002a(C15702i.class)).setValue("quote_img", bVar.mo91565f().getResources().getString(C0966R.string.b8k));
                ((C15692e) rVar.mo62443b(bVar.mo91565f()).mo75002a(C15692e.class)).setValue("quote_img", bVar.mo91565f().getResources().getString(C0966R.string.b8k));
                r2Var.f217788c.setMaxWidth((int) (((float) C74942w4.m89784a(bVar.mo91565f(), 240)) / C76577a.m92165p(MMApplicationContext.getContext())));
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) r2Var.f217788c.getLayoutParams();
                layoutParams.removeRule(15);
                layoutParams.addRule(10);
                layoutParams.topMargin = C74942w4.m89786c(bVar.mo91565f(), C0966R.dimen.f3766df);
                layoutParams.rightMargin = 0;
                r2Var.f217788c.setGravity(48);
                r2Var.f217788c.setIncludeFontPadding(false);
                r2Var.f217788c.setLayoutParams(layoutParams);
                r2Var.f217792g.setVisibility(0);
                if (j == 2) {
                    r2Var.f217791f.setVisibility(0);
                    i5 = 8;
                } else {
                    i5 = 8;
                    r2Var.f217791f.setVisibility(8);
                }
                if (j == 11) {
                    ChattingAlbumContainer chattingAlbumContainer = r2Var.f217802q;
                    if (chattingAlbumContainer != null) {
                        chattingAlbumContainer.setVisibility(0);
                    }
                    r2Var.f217790e.setVisibility(i5);
                } else {
                    ChattingAlbumContainer chattingAlbumContainer2 = r2Var.f217802q;
                    if (chattingAlbumContainer2 != null) {
                        chattingAlbumContainer2.setVisibility(i5);
                    }
                    r2Var.f217790e.setVisibility(0);
                }
                r2Var.f217790e.setImageBitmap((Bitmap) null);
                if (!C78521a.m94860l(bVar.mo91565f(), r2Var.f217790e, r2Var.f217791f, r2Var.f217802q, a, true)) {
                    r2Var.f217790e.setImageResource(C0966R.raw.icons_filled_pic_error1);
                }
                i2 = 0;
                i = 8;
            } else {
                i2 = 0;
                r2Var.f217788c.setMaxWidth((int) (((float) C74942w4.m89784a(bVar.mo91565f(), TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION)) / C76577a.m92165p(MMApplicationContext.getContext())));
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) r2Var.f217788c.getLayoutParams();
                layoutParams2.rightMargin = C74942w4.m89786c(bVar.mo91565f(), C0966R.dimen.f3766df);
                layoutParams2.topMargin = C74942w4.m89786c(bVar.mo91565f(), C0966R.dimen.f3700bt);
                layoutParams2.removeRule(10);
                layoutParams2.addRule(15);
                r2Var.f217788c.setGravity(19);
                r2Var.f217788c.setLayoutParams(layoutParams2);
                i = 8;
                r2Var.f217792g.setVisibility(8);
                r2Var.f217790e.setVisibility(8);
                r2Var.f217791f.setVisibility(8);
                ChattingAlbumContainer chattingAlbumContainer3 = r2Var.f217802q;
                if (chattingAlbumContainer3 != null) {
                    chattingAlbumContainer3.setVisibility(8);
                }
            }
            if (((Boolean) g.first).booleanValue()) {
                r2Var.f217788c.setVisibility(i2);
                View view = r2Var.clickArea;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(i2)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r2Var.clickArea.setOnLongClickListener(new C74203a(r2Var, bVar2, f4Var2));
                r2Var.clickArea.setOnClickListener(new C74205b(r2Var, bVar2));
                r2Var.f217788c.post(new C74206c(this, r2Var));
            } else {
                if (Util.isNullOrNil((CharSequence) g.second)) {
                    r2Var.f217788c.setVisibility(i);
                }
                View view3 = r2Var.clickArea;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i));
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(i2)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            r2Var.f217789d.setVisibility(i);
            r2Var.f217787b.setClickable(true);
            r2Var.f217787b.mo104280c(((C76979h) C86312j.m106911c(cls3)).N70(r2Var.f217787b.getContext(), u.f195570f, (int) r2Var.f217787b.getTextSize(), 1, C45331f0.m50242a(bVar.mo91583x(), C76528a.m92004a(f4Var.mo108768t())), C76979h.f224926w0), TextView.BufferType.SPANNABLE, (Boolean) null);
            ChattingItemTranslate.C73916c cVar3 = new ChattingItemTranslate.C73916c(f4Var2, bVar.mo91583x(), r2Var, (String) null);
            Context context = r2Var.f217787b.getContext();
            r2Var.f217787b.setTag(C0966R.C0970id.ke5, bool);
            if (r2Var.f217795j == null) {
                C78253a aVar3 = new C78253a(context, r2Var.f217787b);
                r2Var.f217795j = aVar3;
                aVar3.f229227C = new C74207d(bVar2, r2Var);
                aVar3.f229257z = true;
                C74208e eVar2 = r0;
                C78253a aVar4 = aVar3;
                cls = cls2;
                i3 = 2;
                C67391b bVar3 = bVar;
                C72963f4 f4Var3 = f4Var;
                C74208e eVar3 = new C74208e(context, r2Var, bVar3, f4Var3);
                aVar4.f229253v = eVar2;
                aVar4.f229251t = new C74209f(r2Var, context, bVar3, f4Var3);
            } else {
                cls = cls2;
                i3 = 2;
            }
            if (C75569c4.m90690w(f4Var) || C75569c4.m90687t(f4Var)) {
                r2Var.f217787b.setTag(C0966R.C0970id.ke5, Boolean.FALSE);
                r2Var.f217787b.setOnTouchListener(r2Var.f217797l);
                r2Var.f217787b.setOnLongClickListener(mo103098p(bVar2));
                MMNeat7extView mMNeat7extView2 = r2Var.f217787b;
                if (this.f217825x == null) {
                    this.f217825x = new C74298x2(this.f217823v);
                }
                mMNeat7extView2.setOnClickListener(this.f217825x);
            } else {
                int h = C75569c4.m90675h(f4Var);
                if (h <= 0 || h >= C78967g.m95477j(r2Var.f217787b).length()) {
                    h = 0;
                }
                C74023i.C74027e p = mo103098p(bVar2);
                C78950d.C78963m v = mo103100v(p);
                C78950d dVar = r2Var.f217796k;
                if (dVar != null) {
                    dVar.mo108918b();
                }
                int[] iArr = new int[i3];
                MMNeat7extView mMNeat7extView3 = r2Var.f217787b;
                if (mMNeat7extView3 != null) {
                    mMNeat7extView3.getLocationInWindow(iArr);
                    i4 = iArr[0];
                    if (i4 == 0) {
                        Rect rect = new Rect();
                        r2Var.f217787b.getGlobalVisibleRect(rect);
                        i4 = rect.left;
                    }
                } else {
                    i4 = 0;
                }
                MMNeat7extView mMNeat7extView4 = r2Var.f217787b;
                C78253a aVar5 = r2Var.f217795j;
                if (this.f217825x == null) {
                    this.f217825x = new C74298x2(this.f217823v);
                }
                C78950d.C78958h hVar = new C78950d.C78958h(mMNeat7extView4, aVar5, v, this.f217825x, r2Var.f217797l);
                hVar.f231878g = C0966R.color.aak;
                hVar.f231879h = 18;
                hVar.f231877f = C0966R.color.f3274lt;
                if (i4 != 0) {
                    hVar.f231880i = i4 + C74942w4.m89786c(r2Var.f217787b.getContext(), C0966R.dimen.f3736cp);
                }
                C78950d dVar2 = new C78950d(hVar);
                r2Var.f217796k = dVar2;
                C74263u2 u2Var = new C74263u2(dVar2);
                dVar2.f231842d = new C74210g();
                p.f217229n = new C74211h(this, r2Var);
                dVar2.f231858t = h;
                dVar2.f231837L = u2Var;
            }
            r2Var.f217787b.setOnDoubleClickListener(this);
            r2Var.f217787b.setTag(cVar3);
            r2Var.f217787b.setTextListener(new C74212i(this, r2Var));
            r2Var.f217787b.setMaxLines(Integer.MAX_VALUE);
            ChattingItemTranslate.C73918e eVar4 = ChattingItemTranslate.C73918e.NoTransform;
            if (C67651f.m79887a()) {
                str2 = (!f4Var.mo101015s3() || !f4Var.mo101006n3()) ? null : f4Var.mo108727G2();
                eVar = ((C79350e1) bVar2.f193278b.mo102812a(C79350e1.class)).mo102314n4(f4Var2);
            } else {
                eVar = eVar4;
                str2 = null;
            }
            if (!Util.isNullOrNil(str2) || eVar != eVar4) {
                if (r2Var.f217800o == null && (viewStub = r2Var.f217799n) != null) {
                    ChattingItemTranslate chattingItemTranslate = (ChattingItemTranslate) viewStub.inflate();
                    r2Var.f217800o = chattingItemTranslate;
                    chattingItemTranslate.mo102992b();
                }
                Context context2 = r2Var.f217787b.getContext();
                String a2 = C86493v0.m107223a("" + f4Var.mo108774y2());
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a2, true);
                c.mo120962i("prePublishId", "msg_" + f4Var.mo108774y2());
                c.mo120962i("preUsername", mo103068y(this.f217823v, f4Var2));
                c.mo120962i("preChatName", mo103102x(this.f217823v, f4Var2));
                SpannableString or = ((C76979h) C86312j.m106911c(cls3)).mo107078or(context2, str2, (int) r2Var.f217787b.getTextSize(), 1, (Object) null, a2);
                Log.m105921e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "spannableString：%s", or);
                r2Var.f217800o.mo102993c(or, eVar);
                r2Var.f217800o.setBrandWording(Util.isNullOrNil(f4Var.mo108726F2()) ? bVar.mo91572m().getString(C0966R.string.k2b) : f4Var.mo108726F2());
                if (!Util.isNullOrNil(str2)) {
                    ChattingItemTranslate.C73916c cVar4 = new ChattingItemTranslate.C73916c(f4Var2, bVar.mo91583x(), r2Var, (String) null);
                    cVar4.f216964T = i3;
                    r2Var.f217800o.setTag(cVar4);
                    ChattingItemTranslate chattingItemTranslate2 = r2Var.f217800o;
                    if (this.f217825x == null) {
                        this.f217825x = new C74298x2(this.f217823v);
                    }
                    chattingItemTranslate2.setOnClickListener(this.f217825x);
                    r2Var.f217800o.setOnDoubleClickListener(this);
                    r2Var.f217800o.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(cls)).mo108189Z4());
                    r2Var.f217800o.setOnLongClickListener(mo103098p(bVar2));
                    r2Var.f217800o.setVisibility(0);
                    return;
                }
                return;
            }
            ChattingItemTranslate chattingItemTranslate3 = r2Var.f217800o;
            if (chattingItemTranslate3 != null) {
                chattingItemTranslate3.setVisibility(8);
            }
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 822083633;
    }
}
