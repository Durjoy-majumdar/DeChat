package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.plugin.C67651f;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.TextPreviewUI;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.thumbplayer.api.TPOptionalID;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import jm2.C46562a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76891l0;
import nj3.C88990b;
import te3.C101801kd0;
import te3.C101835rd0;
import u72.C78135c;
import u73.C101982p;
import u73.C14134p0;
import uk3.C78222a;
import uo3.C78253a;
import w72.C78521a;
import ww0.C78732i;
import x72.C38459a;
import x72.C38460b;
import xo3.C78950d;
import zj3.C79348e;
import zj3.C79350e1;
import zj3.C79374o0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.t2 */
public class C74220t2 extends C74023i implements NeatTextView.C75245c, C73774p2 {

    /* renamed from: v */
    public C67391b f217890v;

    /* renamed from: w */
    public CharSequence f217891w;

    /* renamed from: x */
    public C74298x2 f217892x;

    /* renamed from: y */
    public int f217893y = -1;

    /* renamed from: z */
    public int f217894z = -1;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t2$a */
    public class C74221a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C74193r2 f217895d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f217896e;

        public C74221a(C74193r2 r2Var, C67391b bVar) {
            this.f217895d = r2Var;
            this.f217896e = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                long longValue = ((Long) this.f217895d.f217787b.getTag(C0966R.C0970id.f357682b73)).longValue();
                MsgQuoteItem msgQuoteItem = (MsgQuoteItem) this.f217895d.f217788c.getTag();
                if (msgQuoteItem != null) {
                    Log.m105925i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV click msgId:%s  referfromscene:%s", Long.valueOf(longValue), Integer.valueOf(msgQuoteItem.f201551o));
                } else {
                    Log.m105925i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV click msgId:%s  msgQuoteItem == null", Long.valueOf(longValue));
                }
                C67391b bVar = this.f217896e;
                C74220t2 t2Var = C74220t2.this;
                C74287w2.m88623c(bVar, t2Var, view, longValue, msgQuoteItem, t2Var.f217197d);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV click Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t2$b */
    public class C74222b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C74193r2 f217898d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f217899e;

        /* renamed from: f */
        public final /* synthetic */ C72963f4 f217900f;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.t2$b$a */
        public class C74223a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ View f217902d;

            /* renamed from: e */
            public final /* synthetic */ long f217903e;

            /* renamed from: f */
            public final /* synthetic */ MsgQuoteItem f217904f;

            public C74223a(View view, long j, MsgQuoteItem msgQuoteItem) {
                this.f217902d = view;
                this.f217903e = j;
                this.f217904f = msgQuoteItem;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C74222b bVar = C74222b.this;
                C67391b bVar2 = bVar.f217899e;
                C74220t2 t2Var = C74220t2.this;
                C74287w2.m88624d(bVar2, t2Var, bVar.f217900f, this.f217902d, this.f217903e, this.f217904f, t2Var.f217197d);
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C74222b(C74193r2 r2Var, C67391b bVar, C72963f4 f4Var) {
            this.f217898d = r2Var;
            this.f217899e = bVar;
            this.f217900f = f4Var;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            try {
                long longValue = ((Long) this.f217898d.f217787b.getTag(C0966R.C0970id.f357682b73)).longValue();
                int i = C78521a.f230007a;
                if (!(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_msg_quote_fourth_stage_switch, 1) == 1)) {
                    Log.m105925i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV long click disable:%s", Long.valueOf(longValue));
                    C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
                MsgQuoteItem msgQuoteItem = (MsgQuoteItem) this.f217898d.f217788c.getTag();
                Log.m105925i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV long click msgId:%s  referfromscene:%s", Long.valueOf(longValue), Integer.valueOf(msgQuoteItem.f201551o));
                if (msgQuoteItem.f201551o == 1) {
                    Log.m105925i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV msgQuoteItem.referfromscene == 1, long click disable:%s", Long.valueOf(longValue));
                    C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
                ((C79374o0) this.f217899e.f193278b.mo102812a(C79374o0.class)).mo102668h1(view, new C74223a(view, longValue, msgQuoteItem));
                C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV long click Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t2$c */
    public class C74224c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C74193r2 f217906d;

        public C74224c(C74220t2 t2Var, C74193r2 r2Var) {
            this.f217906d = r2Var;
        }

        public void run() {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f217906d.clickArea.getLayoutParams();
            layoutParams.height = this.f217906d.f217801p.getHeight();
            layoutParams.width = this.f217906d.f217801p.getWidth();
            this.f217906d.clickArea.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t2$d */
    public class C74225d implements PopupWindow.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C67391b f217907d;

        /* renamed from: e */
        public final /* synthetic */ C74193r2 f217908e;

        public C74225d(C67391b bVar, C74193r2 r2Var) {
            this.f217907d = bVar;
            this.f217908e = r2Var;
        }

        public void onDismiss() {
            this.f217907d.mo91545F(true);
            C78253a aVar = this.f217908e.f217795j;
            C67391b bVar = this.f217907d;
            C74220t2 t2Var = C74220t2.this;
            C74023i.m87879U(aVar, bVar, t2Var.f217894z, t2Var.f217893y, 49);
            C74220t2 t2Var2 = C74220t2.this;
            t2Var2.f217894z = -1;
            t2Var2.f217893y = -1;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t2$e */
    public class C74226e implements C76891l0 {

        /* renamed from: a */
        public final /* synthetic */ Context f217910a;

        /* renamed from: b */
        public final /* synthetic */ C74193r2 f217911b;

        /* renamed from: c */
        public final /* synthetic */ C67391b f217912c;

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f217913d;

        public C74226e(Context context, C74193r2 r2Var, C67391b bVar, C72963f4 f4Var) {
            this.f217910a = context;
            this.f217911b = r2Var;
            this.f217912c = bVar;
            this.f217913d = f4Var;
        }

        /* renamed from: a */
        public void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            e0Var.clear();
            C76874e0 e0Var2 = e0Var;
            e0Var2.mo107136c(0, 0, 0, this.f217910a.getResources().getString(C0966R.string.f7936wt), C0966R.raw.icons_filled_copy);
            e0Var2.mo107136c(0, 1, 0, this.f217910a.getResources().getString(C0966R.string.gs4), C0966R.raw.icons_filled_allselect);
            e0Var2.mo107136c(0, 2, 0, this.f217910a.getResources().getString(C0966R.string.f361028gs2), C0966R.raw.icons_filled_share);
            e0Var2.mo107136c(0, 3, 0, this.f217910a.getResources().getString(C0966R.string.cmx), C0966R.raw.icons_filled_favorites);
            e0Var2.mo107136c(0, 4, 0, this.f217910a.getResources().getString(C0966R.string.b_i), C0966R.raw.icons_filled_search_logo);
            String Lp0 = ((C78732i) C86312j.m106911c(C78732i.class)).Lp0(C74220t2.this.f217891w.toString());
            if (!Util.isNullOrNil(Lp0)) {
                C74220t2 t2Var = C74220t2.this;
                C78253a aVar = this.f217911b.f217795j;
                C67391b bVar = this.f217912c;
                t2Var.getClass();
                aVar.f229235K = new C74070j(t2Var, bVar, Lp0);
            }
            if (Util.isNullOrNil(Lp0)) {
                this.f217911b.f217795j.f229235K = null;
            }
            C74220t2.this.mo103071D(this.f217912c, this.f217913d, 1, !Util.isNullOrNil(Lp0), C74220t2.this.f217891w.toString(), true, "65_" + C31543z5.m39453c(), 3);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t2$f */
    public class C74227f implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C74193r2 f217915d;

        /* renamed from: e */
        public final /* synthetic */ Context f217916e;

        /* renamed from: f */
        public final /* synthetic */ C67391b f217917f;

        /* renamed from: g */
        public final /* synthetic */ C72963f4 f217918g;

        public C74227f(C74193r2 r2Var, Context context, C67391b bVar, C72963f4 f4Var) {
            this.f217915d = r2Var;
            this.f217916e = context;
            this.f217917f = bVar;
            this.f217918g = f4Var;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C101835rd0 rd02;
            C74243t8 t8Var;
            C74220t2 t2Var = C74220t2.this;
            t2Var.f217894z = i;
            t2Var.f217893y = menuItem.getItemId();
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                Context context = MMApplicationContext.getContext();
                CharSequence charSequence = C74220t2.this.f217891w;
                ClipboardHelper.setText(context, charSequence, charSequence);
                C78950d dVar = this.f217915d.f217796k;
                if (dVar != null) {
                    dVar.mo108922f();
                    C78950d dVar2 = this.f217915d.f217796k;
                    dVar2.f231828C = true;
                    dVar2.f231829D = true;
                    dVar2.mo108921e();
                }
                C74059i7.m88003h(this.f217916e);
            } else if (itemId == 1) {
                C78950d dVar3 = this.f217915d.f217796k;
                if (dVar3 != null) {
                    C78950d.C78963m mVar = dVar3.f231845g;
                    if (mVar != null) {
                        mVar.mo103119d();
                    }
                    C78950d dVar4 = this.f217915d.f217796k;
                    dVar4.f231828C = true;
                    dVar4.mo108921e();
                    C74193r2 r2Var = this.f217915d;
                    r2Var.f217796k.mo108923g(0, r2Var.f217787b.mo154968a().length());
                    this.f217915d.f217796k.mo108924h();
                    this.f217915d.f217796k.mo108927k();
                    C78950d.C78963m mVar2 = this.f217915d.f217796k.f231845g;
                    if (mVar2 != null) {
                        mVar2.mo103120e();
                    }
                }
            } else if (itemId == 2) {
                Intent intent = new Intent(this.f217916e, MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_content", C74220t2.this.f217891w);
                intent.putExtra("Retr_Msg_Type", 4);
                Context context2 = this.f217916e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context3 = context2;
                C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$6", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$6", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (itemId == 3) {
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                C96787m0.m124258l(doFavoriteEvent, C74220t2.this.f217891w.toString(), 1);
                DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                aVar2.f264685j = C74220t2.this.f217890v.f193286j;
                aVar2.f264688m = 43;
                C101801kd0 kd02 = aVar2.f264676a;
                if (!(kd02 == null || (rd02 = kd02.f298616d) == null || (t8Var = (C74243t8) this.f217915d.f217787b.getTag()) == null)) {
                    rd02.mo141275k(t8Var.f212238a.mo108768t());
                    rd02.mo141279o(C75592q0.m90789s());
                    doFavoriteEvent.publish();
                }
                C78950d dVar5 = this.f217915d.f217796k;
                if (dVar5 != null) {
                    dVar5.mo108922f();
                    C78950d dVar6 = this.f217915d.f217796k;
                    dVar6.f231828C = true;
                    dVar6.f231829D = true;
                    dVar6.mo108921e();
                }
            } else if (itemId == 4) {
                String str = "65_" + C31543z5.m39453c();
                String charSequence2 = C74220t2.this.f217891w.toString();
                C74220t2.this.mo103071D(this.f217917f, this.f217918g, 2, !Util.isNullOrNil(((C78732i) C86312j.m106911c(C78732i.class)).Lp0(charSequence2)), charSequence2, true, str, 3);
                C14134p0 p0Var = new C14134p0();
                p0Var.f39544a = this.f217916e;
                p0Var.f39545b = 65;
                p0Var.f39547d = charSequence2;
                p0Var.f39548e = str;
                p0Var.f39549f = true;
                p0Var.f39552i = false;
                ((C101982p) C86312j.m106911c(C101982p.class)).mo6877X6(p0Var);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t2$g */
    public class C74228g implements C78950d.C78961k {
        public C74228g() {
        }

        /* renamed from: a */
        public void mo102127a(CharSequence charSequence) {
            C74220t2.this.f217891w = charSequence;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t2$h */
    public class C74229h extends C78950d.C78963m {

        /* renamed from: a */
        public final /* synthetic */ C74193r2 f217921a;

        public C74229h(C74220t2 t2Var, C74193r2 r2Var) {
            this.f217921a = r2Var;
        }

        /* renamed from: a */
        public void mo103116a() {
            this.f217921a.f217796k.mo108922f();
            C78950d dVar = this.f217921a.f217796k;
            dVar.f231828C = true;
            dVar.f231829D = true;
            dVar.mo108921e();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t2$i */
    public class C74230i implements MMNeat7extView.C74954d {

        /* renamed from: a */
        public final /* synthetic */ C74193r2 f217922a;

        public C74230i(C74220t2 t2Var, C74193r2 r2Var) {
            this.f217922a = r2Var;
        }

        /* renamed from: a */
        public void mo103126a(CharSequence charSequence, TextView.BufferType bufferType) {
            if (((Boolean) this.f217922a.f217787b.getTag(C0966R.C0970id.f357681b72)).booleanValue()) {
                C78222a.m94508a().getClass();
                C78222a.C78223a.TEXT_CALLBACK.mo108242a(charSequence, bufferType, ((Long) this.f217922a.f217787b.getTag(C0966R.C0970id.f357682b73)).longValue());
            }
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6950t5);
        C74193r2 r2Var = new C74193r2();
        r2Var.mo103226a(n4Var, false);
        n4Var.setTag(r2Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return true;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        int t;
        int t2;
        Class cls = C79348e.class;
        Class cls2 = C79350e1.class;
        Class<MsgRetransmitUI> cls3 = MsgRetransmitUI.class;
        int itemId = menuItem.getItemId();
        if (itemId != 102) {
            if (itemId == 103) {
                mo103241o0(f4Var);
            } else if (itemId == 111) {
                Intent intent = new Intent(bVar.mo91565f(), cls3);
                intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
                intent.putExtra("Retr_Msg_Type", 2);
                intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            } else if (itemId == 152) {
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
                        Intent intent2 = new Intent(bVar.mo91565f(), cls3);
                        String G22 = f4Var.mo108727G2();
                        if (bVar.mo91583x() && !((C79348e) bVar.f193278b.mo102812a(cls)).mo70071q1() && (t = C75604z3.m90848t(G22)) != -1) {
                            G22 = G22.substring(t + 1).trim();
                        }
                        if (f4Var.mo100988a4()) {
                            intent2.putExtra("Retr_Msg_content", G22);
                            intent2.putExtra("Retr_Msg_Type", 6);
                        } else {
                            intent2.putExtra("Retr_Msg_content", G22);
                            intent2.putExtra("Retr_Msg_Type", 4);
                        }
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent2);
                        C117292a.m165358d(bVar, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        bVar.mo91556Q((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
                            Log.m105920e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", " transform text fav failed");
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
        }
        String str = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91582w(), f4Var.getContent(), f4Var.mo108769t2()), (String) null).f195570f;
        ClipboardHelper.setText(str);
        C46562a aVar4 = C46562a.INSTANCE;
        aVar4.F80(1, f4Var.mo108774y2() + "", Util.getUTF8ByteLength(str));
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        int i;
        C72963f4 f4Var2 = f4Var;
        String str = f4Var2.f230724G;
        boolean z = str != null && str.contains("announcement@all");
        ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
        int b = cVar.mo103252b();
        int i2 = cVar.f216964T;
        if (i2 == 1) {
            if (!C75569c4.m90687t(f4Var)) {
                C76874e0 e0Var2 = e0Var;
                int i3 = b;
                i = 2;
                e0Var2.mo107136c(i3, 102, 0, this.f217890v.mo91572m().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                e0Var2.mo107136c(i3, 111, 0, this.f217890v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            } else {
                i = 2;
            }
            if (f4Var.getStatus() == 5) {
                e0Var.mo107136c(b, 103, 0, view.getContext().getString(C0966R.string.f360269bb2), C0966R.raw.icons_filled_refresh);
            }
            C88144b.m109788f("favorite");
            e0Var.mo107136c(b, 116, 0, this.f217890v.mo91572m().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            if (!z && !f4Var.mo100967F3() && ((f4Var.getStatus() == i || f4Var2.f230728K == 1) && mo103083Q(f4Var2, this.f217890v) && mo103081O(f4Var.mo108768t()) && !this.f217890v.mo91580u())) {
                e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
            }
            if (C67651f.m79887a() && (!f4Var.mo101015s3() || !f4Var.mo101006n3())) {
                e0Var.mo107136c(b, 124, 0, view.getContext().getString(C0966R.string.b_m), C0966R.raw.icons_filled_translate);
            }
            if (!this.f217890v.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, this.f217890v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            }
        } else if (i2 == 2) {
            Log.m105920e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "翻译消息右键菜单");
            C76874e0 e0Var3 = e0Var;
            int i4 = b;
            e0Var3.mo107136c(i4, 141, 0, view.getContext().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
            e0Var3.mo107136c(i4, TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            C88144b.m109788f("favorite");
            e0Var.mo107136c(b, TPOptionalID.f349338xc9bdf6cd, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            if (C67651f.m79887a() && f4Var.mo101015s3() && f4Var.mo101006n3()) {
                C76874e0 e0Var4 = e0Var;
                int i5 = b;
                e0Var4.mo107136c(i5, 124, 0, view.getContext().getString(C0966R.string.b_k), C0966R.raw.icons_filled_eyes_off);
                e0Var4.mo107136c(i5, 152, 0, view.getContext().getString(C0966R.string.ml5), C0966R.raw.icons_filled_feedback_error);
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
        mo103241o0(f4Var);
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: b */
    public boolean mo103047b(View view, MotionEvent motionEvent) {
        C74243t8 t8Var;
        CharSequence a = ((MMNeat7extView) view).mo154968a();
        Intent intent = new Intent(view.getContext(), TextPreviewUI.class);
        intent.addFlags(67108864);
        intent.putExtra("key_chat_text", a);
        if ((view.getTag() instanceof C74243t8) && (t8Var = (C74243t8) view.getTag()) != null) {
            intent.putExtra("Chat_Msg_Id", t8Var.f212238a.getMsgId());
        }
        C67391b bVar = this.f217890v;
        if (bVar != null) {
            intent.putExtra("is_group_chat", bVar.mo91583x());
        }
        Context context = view.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C88990b.m111199h(view.getContext());
        return true;
    }

    /* renamed from: d */
    public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
        return new C74277v2(f4Var, context, iVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x054e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0601  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x04dc  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r31, ck3.C67391b r32, com.tencent.p014mm.storage.C72963f4 r33, java.lang.String r34) {
        /*
            r30 = this;
            r8 = r30
            r0 = r31
            r7 = r32
            r9 = r33
            java.lang.Class<zj3.l> r10 = zj3.C79368l.class
            java.lang.Class<ny.h> r11 = p629ny.C76979h.class
            r12 = r0
            com.tencent.mm.ui.chatting.viewitems.r2 r12 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74193r2) r12
            r8.f217890v = r7
            java.lang.Class<zj3.n> r1 = zj3.C79371n.class
            com.tencent.mm.ui.chatting.manager.a r2 = r7.f193278b
            xi.d r1 = r2.mo102812a(r1)
            zj3.n r1 = (zj3.C79371n) r1
            r1.mo102406W4(r9)
            android.view.View r0 = r0.convertView
            com.tencent.p014mm.p136ui.chatting.component.C19729d.m21411h6(r7, r0, r9)
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r12.f217787b
            long r1 = r33.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2131299336(0x7f090c08, float:1.821667E38)
            r0.setTag(r2, r1)
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r12.f217787b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2 = 2131299335(0x7f090c07, float:1.8216668E38)
            r0.setTag(r2, r1)
            boolean r0 = lg3.C76695c.m92341b()
            if (r0 == 0) goto L_0x004e
            boolean r0 = lg3.C76695c.m92343d()
            if (r0 == 0) goto L_0x004e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.tencent.p014mm.p136ui.chatting.viewitems.C74193r2.m88426b(r9, r12, r7, r0)
        L_0x004e:
            java.lang.String r0 = r33.getContent()
            r13 = 0
            if (r0 == 0) goto L_0x0096
            java.lang.String r1 = r33.mo108775z2()
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r1)
            if (r1 != 0) goto L_0x0097
            java.lang.String r2 = "<refermsg>"
            int r2 = r0.indexOf(r2)
            java.lang.String r3 = "</refermsg>"
            int r3 = r0.indexOf(r3)
            if (r2 < 0) goto L_0x0097
            if (r3 < r2) goto L_0x0097
            java.lang.String r1 = r0.substring(r2, r3)
            java.lang.String r2 = "<displayname>"
            int r2 = r1.indexOf(r2)
            java.lang.String r3 = "</displayname>"
            int r3 = r1.indexOf(r3)
            int r2 = r2 + 13
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r1)
            java.lang.String r1 = r0.replace(r1, r2)
            java.lang.String r2 = r33.mo108775z2()
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r2)
            goto L_0x0097
        L_0x0096:
            r1 = r13
        L_0x0097:
            if (r1 == 0) goto L_0x067b
            int r2 = r1.f195582i
            r3 = 57
            if (r2 != r3) goto L_0x067b
            r14 = 0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x00bc }
            if (r2 == 0) goto L_0x00a7
            goto L_0x00c6
        L_0x00a7:
            java.lang.String r2 = "msg"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r2, r13)     // Catch:{ Exception -> 0x00bc }
            if (r0 == 0) goto L_0x00c6
            java.lang.String r2 = ".msg.appmsg.referfromscene"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00bc }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)     // Catch:{ Exception -> 0x00bc }
            goto L_0x00c7
        L_0x00bc:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r3 = "MicroMsg.MsgInfo"
            java.lang.String r4 = "parseReferFromSceneByXml"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            r9.f212669H1 = r0
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r2 = r1.f195641w2
            if (r2 == 0) goto L_0x00cf
            r2.f201551o = r0
        L_0x00cf:
            boolean r0 = r32.mo91583x()
            java.lang.String r2 = r33.mo108768t()
            int r2 = kb0.C76528a.m92004a(r2)
            android.os.Bundle r20 = de3.C45331f0.m50242a(r0, r2)
            di3.d r0 = di3.C86312j.m106911c(r11)
            r15 = r0
            ny.h r15 = (p629ny.C76979h) r15
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r12.f217787b
            android.content.Context r16 = r0.getContext()
            java.lang.String r0 = r1.f195570f
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r12.f217787b
            float r2 = r2.getTextSize()
            int r2 = (int) r2
            r19 = 1
            ny.e r21 = p629ny.C76979h.f224926w0
            r17 = r0
            r18 = r2
            android.text.SpannableString r0 = r15.N70(r16, r17, r18, r19, r20, r21)
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r12.f217787b
            android.widget.TextView$BufferType r3 = android.widget.TextView.BufferType.SPANNABLE
            r2.mo104280c(r0, r3, r13)
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r12.f217787b
            r15 = 1
            r0.setClickable(r15)
            android.app.Activity r0 = r32.mo91565f()
            android.widget.TextView r2 = r12.f217788c
            float r2 = r2.getTextSize()
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r3 = r1.f195641w2
            android.util.Pair r0 = w72.C78521a.m94855g(r0, r2, r9, r3)
            android.widget.TextView r2 = r12.f217788c
            di3.d r3 = di3.C86312j.m106911c(r11)
            ny.h r3 = (p629ny.C76979h) r3
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r12.f217787b
            android.content.Context r4 = r4.getContext()
            java.lang.Object r5 = r0.second
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            android.text.SpannableString r3 = r3.mo107057T1(r4, r5)
            r2.setText(r3)
            android.widget.TextView r2 = r12.f217788c
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r3 = r1.f195641w2
            r2.setTag(r3)
            com.tencent.mm.ui.chatting.manager.a r2 = r7.f193278b
            xi.d r2 = r2.mo102812a(r10)
            zj3.l r2 = (zj3.C79368l) r2
            boolean r2 = r2.mo108213v1()
            uc0.b r3 = uc0.C52517f0.vx0()
            java.lang.String r4 = r32.mo91577r()
            uc0.a r3 = r3.mo73451jo(r4)
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            r5 = 12311(0x3017, float:1.7251E-41)
            r6 = -2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            java.lang.Object r4 = r4.mo119684e(r5, r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 2131100380(0x7f0602dc, float:1.781314E38)
            if (r3 == 0) goto L_0x0178
            int r15 = r3.f146672b
            if (r15 != r6) goto L_0x017c
        L_0x0178:
            if (r3 != 0) goto L_0x01b5
            if (r4 == r6) goto L_0x01b5
        L_0x017c:
            if (r2 == 0) goto L_0x0198
            android.widget.TextView r2 = r12.f217788c
            android.app.Activity r3 = r32.mo91565f()
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            android.view.View r2 = r12.f217801p
            r3 = 2131234116(0x7f080d44, float:1.8084389E38)
            r2.setBackgroundResource(r3)
            goto L_0x01ed
        L_0x0198:
            android.widget.TextView r2 = r12.f217788c
            android.app.Activity r3 = r32.mo91565f()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131101251(0x7f060643, float:1.7814906E38)
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
            android.view.View r2 = r12.f217801p
            r3 = 2131234115(0x7f080d43, float:1.8084387E38)
            r2.setBackgroundResource(r3)
            goto L_0x01ed
        L_0x01b5:
            if (r2 == 0) goto L_0x01d4
            android.widget.TextView r2 = r12.f217788c
            android.app.Activity r3 = r32.mo91565f()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099665(0x7f060011, float:1.781169E38)
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
            android.view.View r2 = r12.f217801p
            r3 = 2131234114(0x7f080d42, float:1.8084385E38)
            r2.setBackgroundResource(r3)
            goto L_0x01ed
        L_0x01d4:
            android.widget.TextView r2 = r12.f217788c
            android.app.Activity r3 = r32.mo91565f()
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            android.view.View r2 = r12.f217801p
            r3 = 2131234113(0x7f080d41, float:1.8084383E38)
            r2.setBackgroundResource(r3)
        L_0x01ed:
            long r2 = r33.getMsgId()
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r4 = r1.f195641w2
            java.lang.String r5 = "handleQuoteMsgFillingTo"
            com.tencent.mm.storage.f4 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74287w2.m88622b(r7, r2, r4, r5)
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r1 = r1.f195641w2
            com.tencent.mm.storage.f4 r19 = com.tencent.p014mm.p136ui.chatting.viewitems.C74287w2.m88621a(r2, r1)
            int r1 = w72.C78521a.m94858j(r19)
            r2 = -1
            r3 = 15
            r4 = 10
            r5 = 2131165371(0x7f0700bb, float:1.7944957E38)
            java.lang.String r6 = ""
            if (r1 == r2) goto L_0x02df
            android.widget.ImageView r2 = r12.f217790e
            r2.setVisibility(r14)
            bl3.r r2 = bl3.C39818r.f106831a
            android.app.Activity r13 = r32.mo91565f()
            bl3.r$a r13 = r2.mo62443b(r13)
            java.lang.Class<xi3.i> r15 = xi3.C15702i.class
            androidx.lifecycle.i0 r13 = r13.mo75002a(r15)
            xi3.i r13 = (xi3.C15702i) r13
            java.lang.String r15 = "quote_img"
            r13.setValue(r15, r6)
            android.app.Activity r13 = r32.mo91565f()
            bl3.r$a r2 = r2.mo62443b(r13)
            java.lang.Class<xi3.e> r13 = xi3.C15692e.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r13)
            xi3.e r2 = (xi3.C15692e) r2
            r2.setValue(r15, r6)
            android.app.Activity r2 = r32.mo91565f()
            r13 = 240(0xf0, float:3.36E-43)
            int r2 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r2, r13)
            float r2 = (float) r2
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r13 = kg3.C76577a.m92165p(r13)
            float r2 = r2 / r13
            int r2 = (int) r2
            android.widget.TextView r13 = r12.f217788c
            r13.setMaxWidth(r2)
            android.widget.TextView r2 = r12.f217788c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r2.removeRule(r3)
            r2.addRule(r4)
            android.app.Activity r3 = r32.mo91565f()
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r3, r5)
            r2.topMargin = r3
            r2.rightMargin = r14
            android.widget.TextView r3 = r12.f217788c
            r4 = 48
            r3.setGravity(r4)
            android.widget.TextView r3 = r12.f217788c
            r3.setIncludeFontPadding(r14)
            android.widget.TextView r3 = r12.f217788c
            r3.setLayoutParams(r2)
            android.widget.FrameLayout r2 = r12.f217792g
            r2.setVisibility(r14)
            r2 = 2
            if (r1 != r2) goto L_0x0293
            android.widget.ImageView r3 = r12.f217791f
            r3.setVisibility(r14)
            r4 = 8
            goto L_0x029a
        L_0x0293:
            android.widget.ImageView r3 = r12.f217791f
            r4 = 8
            r3.setVisibility(r4)
        L_0x029a:
            r3 = 11
            if (r1 != r3) goto L_0x02ab
            com.tencent.mm.plugin.album.view.ChattingAlbumContainer r1 = r12.f217802q
            if (r1 == 0) goto L_0x02a5
            r1.setVisibility(r14)
        L_0x02a5:
            android.widget.ImageView r1 = r12.f217790e
            r1.setVisibility(r4)
            goto L_0x02b7
        L_0x02ab:
            com.tencent.mm.plugin.album.view.ChattingAlbumContainer r1 = r12.f217802q
            if (r1 == 0) goto L_0x02b2
            r1.setVisibility(r4)
        L_0x02b2:
            android.widget.ImageView r1 = r12.f217790e
            r1.setVisibility(r14)
        L_0x02b7:
            android.widget.ImageView r1 = r12.f217790e
            r3 = 0
            r1.setImageBitmap(r3)
            android.app.Activity r15 = r32.mo91565f()
            android.widget.ImageView r1 = r12.f217790e
            android.widget.ImageView r3 = r12.f217791f
            com.tencent.mm.plugin.album.view.ChattingAlbumContainer r4 = r12.f217802q
            r20 = 0
            r13 = 2
            r16 = r1
            r17 = r3
            r18 = r4
            boolean r1 = w72.C78521a.m94860l(r15, r16, r17, r18, r19, r20)
            if (r1 != 0) goto L_0x033c
            android.widget.ImageView r1 = r12.f217790e
            r2 = 2131756129(0x7f100461, float:1.9143157E38)
            r1.setImageResource(r2)
            goto L_0x033c
        L_0x02df:
            r13 = 2
            android.app.Activity r1 = r32.mo91565f()
            r2 = 259(0x103, float:3.63E-43)
            int r1 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r1, r2)
            float r1 = (float) r1
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r2 = kg3.C76577a.m92165p(r2)
            float r1 = r1 / r2
            int r1 = (int) r1
            android.widget.TextView r2 = r12.f217788c
            r2.setMaxWidth(r1)
            android.widget.TextView r1 = r12.f217788c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            android.app.Activity r2 = r32.mo91565f()
            int r2 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r2, r5)
            r1.rightMargin = r2
            android.app.Activity r2 = r32.mo91565f()
            r5 = 2131165278(0x7f07005e, float:1.7944769E38)
            int r2 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r2, r5)
            r1.topMargin = r2
            r1.removeRule(r4)
            r1.addRule(r3)
            android.widget.TextView r2 = r12.f217788c
            r3 = 19
            r2.setGravity(r3)
            android.widget.TextView r2 = r12.f217788c
            r2.setLayoutParams(r1)
            android.widget.FrameLayout r1 = r12.f217792g
            r2 = 8
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r12.f217790e
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r12.f217791f
            r1.setVisibility(r2)
        L_0x033c:
            java.lang.Object r1 = r0.first
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x03ab
            android.widget.TextView r0 = r12.f217788c
            r0.setVisibility(r14)
            android.view.View r0 = r12.clickArea
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r1.mo10233c(r2)
            java.lang.Object[] r23 = r1.mo10232b()
            java.lang.String r24 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo"
            java.lang.String r25 = "filling"
            java.lang.String r26 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r0
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r23 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo"
            java.lang.String r24 = "filling"
            java.lang.String r25 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            android.view.View r0 = r12.clickArea
            com.tencent.mm.ui.chatting.viewitems.t2$a r1 = new com.tencent.mm.ui.chatting.viewitems.t2$a
            r1.<init>(r12, r7)
            r0.setOnClickListener(r1)
            android.view.View r0 = r12.clickArea
            com.tencent.mm.ui.chatting.viewitems.t2$b r1 = new com.tencent.mm.ui.chatting.viewitems.t2$b
            r1.<init>(r12, r7, r9)
            r0.setOnLongClickListener(r1)
            android.widget.TextView r0 = r12.f217788c
            com.tencent.mm.ui.chatting.viewitems.t2$c r1 = new com.tencent.mm.ui.chatting.viewitems.t2$c
            r1.<init>(r8, r12)
            r0.post(r1)
            goto L_0x040a
        L_0x03ab:
            java.lang.Object r0 = r0.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r0)
            if (r0 == 0) goto L_0x03bd
            android.widget.TextView r0 = r12.f217788c
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x03bf
        L_0x03bd:
            r1 = 8
        L_0x03bf:
            android.widget.ImageView r0 = r12.f217790e
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r12.f217791f
            r0.setVisibility(r1)
            android.view.View r0 = r12.clickArea
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r3)
            java.lang.Object[] r23 = r2.mo10232b()
            java.lang.String r24 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo"
            java.lang.String r25 = "filling"
            java.lang.String r26 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r0
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r1 = r2.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r23 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo"
            java.lang.String r24 = "filling"
            java.lang.String r25 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
        L_0x040a:
            boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
            if (r0 == 0) goto L_0x0415
            r0 = 1
            r8.mo103093i0(r12, r14, r0)
            goto L_0x0422
        L_0x0415:
            r0 = 1
            int r1 = r33.getStatus()
            if (r1 >= r13) goto L_0x041e
            r1 = 1
            goto L_0x041f
        L_0x041e:
            r1 = 0
        L_0x041f:
            r8.mo103093i0(r12, r1, r0)
        L_0x0422:
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c r0 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c
            boolean r1 = r32.mo91583x()
            r2 = 0
            r0.<init>(r9, r1, r12, r2)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r12.f217787b
            android.content.Context r15 = r1.getContext()
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r12.f217787b
            r2 = 2131314870(0x7f0948b6, float:1.8248177E38)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1.setTag(r2, r3)
            uo3.a r1 = r12.f217795j
            if (r1 != 0) goto L_0x0473
            uo3.a r5 = new uo3.a
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r12.f217787b
            r5.<init>(r15, r1)
            r12.f217795j = r5
            com.tencent.mm.ui.chatting.viewitems.t2$d r1 = new com.tencent.mm.ui.chatting.viewitems.t2$d
            r1.<init>(r7, r12)
            r5.f229227C = r1
            r1 = 1
            r5.f229257z = r1
            com.tencent.mm.ui.chatting.viewitems.t2$e r4 = new com.tencent.mm.ui.chatting.viewitems.t2$e
            r1 = r4
            r2 = r30
            r3 = r15
            r14 = r4
            r4 = r12
            r13 = r5
            r5 = r32
            r18 = r10
            r10 = r6
            r6 = r33
            r1.<init>(r3, r4, r5, r6)
            r13.f229253v = r14
            com.tencent.mm.ui.chatting.viewitems.t2$f r14 = new com.tencent.mm.ui.chatting.viewitems.t2$f
            r1 = r14
            r3 = r12
            r4 = r15
            r1.<init>(r3, r4, r5, r6)
            r13.f229251t = r14
            goto L_0x0476
        L_0x0473:
            r18 = r10
            r10 = r6
        L_0x0476:
            com.tencent.mm.ui.chatting.viewitems.i$e r1 = r8.mo103098p(r7)
            com.tencent.mm.ui.chatting.viewitems.i$e r2 = r8.mo103098p(r7)
            xo3.d$m r25 = r8.mo103100v(r2)
            xo3.d r2 = r12.f217796k
            if (r2 == 0) goto L_0x0489
            r2.mo108918b()
        L_0x0489:
            r2 = 2
            int[] r3 = new int[r2]
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r12.f217787b
            if (r2 == 0) goto L_0x04a7
            r2.getLocationInWindow(r3)
            r2 = 0
            r3 = r3[r2]
            if (r3 != 0) goto L_0x04a5
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r12.f217787b
            r3.getGlobalVisibleRect(r2)
            int r2 = r2.left
            goto L_0x04a8
        L_0x04a5:
            r2 = r3
            goto L_0x04a8
        L_0x04a7:
            r2 = 0
        L_0x04a8:
            xo3.d$h r3 = new xo3.d$h
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r12.f217787b
            uo3.a r5 = r12.f217795j
            com.tencent.mm.ui.chatting.viewitems.x2 r6 = r8.f217892x
            if (r6 != 0) goto L_0x04bb
            com.tencent.mm.ui.chatting.viewitems.x2 r6 = new com.tencent.mm.ui.chatting.viewitems.x2
            ck3.b r13 = r8.f217890v
            r6.<init>(r13)
            r8.f217892x = r6
        L_0x04bb:
            com.tencent.mm.ui.chatting.viewitems.x2 r6 = r8.f217892x
            de3.o r13 = r12.f217797l
            r22 = r3
            r23 = r4
            r24 = r5
            r26 = r6
            r27 = r13
            r22.<init>(r23, r24, r25, r26, r27)
            r4 = 2131100299(0x7f06028b, float:1.7812976E38)
            r3.f231878g = r4
            r4 = 18
            r3.f231879h = r4
            r4 = 2131100297(0x7f060289, float:1.7812971E38)
            r3.f231877f = r4
            if (r2 == 0) goto L_0x04ec
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r12.f217787b
            android.content.Context r4 = r4.getContext()
            r5 = 2131165307(0x7f07007b, float:1.7944827E38)
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r4, r5)
            int r2 = r2 + r4
            r3.f231880i = r2
        L_0x04ec:
            xo3.d r2 = new xo3.d
            r2.<init>(r3)
            r12.f217796k = r2
            com.tencent.mm.ui.chatting.viewitems.u2 r3 = new com.tencent.mm.ui.chatting.viewitems.u2
            r3.<init>(r2)
            com.tencent.mm.ui.chatting.viewitems.t2$g r4 = new com.tencent.mm.ui.chatting.viewitems.t2$g
            r4.<init>()
            r2.f231842d = r4
            com.tencent.mm.ui.chatting.viewitems.t2$h r4 = new com.tencent.mm.ui.chatting.viewitems.t2$h
            r4.<init>(r8, r12)
            r1.f217229n = r4
            r2.f231837L = r3
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r12.f217787b
            r1.setOnDoubleClickListener(r8)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r12.f217787b
            r1.setTag(r0)
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r12.f217787b
            com.tencent.mm.ui.chatting.viewitems.t2$i r1 = new com.tencent.mm.ui.chatting.viewitems.t2$i
            r1.<init>(r8, r12)
            r0.setTextListener(r1)
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$e r0 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73918e.NoTransform
            boolean r1 = com.tencent.p014mm.app.plugin.C67651f.m79887a()
            if (r1 == 0) goto L_0x0546
            boolean r1 = r33.mo101015s3()
            if (r1 == 0) goto L_0x0536
            boolean r1 = r33.mo101006n3()
            if (r1 == 0) goto L_0x0536
            java.lang.String r1 = r33.mo108727G2()
            r3 = r1
            goto L_0x0537
        L_0x0536:
            r3 = 0
        L_0x0537:
            java.lang.Class<zj3.e1> r1 = zj3.C79350e1.class
            com.tencent.mm.ui.chatting.manager.a r2 = r7.f193278b
            xi.d r1 = r2.mo102812a(r1)
            zj3.e1 r1 = (zj3.C79350e1) r1
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$e r1 = r1.mo102314n4(r9)
            goto L_0x0548
        L_0x0546:
            r1 = r0
            r3 = 0
        L_0x0548:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 == 0) goto L_0x055c
            if (r1 == r0) goto L_0x0551
            goto L_0x055c
        L_0x0551:
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217800o
            if (r0 == 0) goto L_0x0667
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0667
        L_0x055c:
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217800o
            if (r0 != 0) goto L_0x056f
            android.view.ViewStub r0 = r12.f217799n
            if (r0 == 0) goto L_0x056f
            android.view.View r0 = r0.inflate()
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = (com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate) r0
            r12.f217800o = r0
            r0.mo102992b()
        L_0x056f:
            di3.d r0 = di3.C86312j.m106911c(r11)
            r22 = r0
            ny.h r22 = (p629ny.C76979h) r22
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r12.f217787b
            android.content.Context r23 = r0.getContext()
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r12.f217787b
            float r0 = r0.getTextSize()
            int r0 = (int) r0
            r26 = 1
            r27 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            long r4 = r33.mo108774y2()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = eb0.C86493v0.m107223a(r2)
            eb0.v0 r4 = eb0.C86493v0.m107224d()
            r5 = 1
            eb0.v0$c r4 = r4.mo120947c(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "msg_"
            r5.append(r6)
            long r10 = r33.mo108774y2()
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "prePublishId"
            r4.mo120962i(r6, r5)
            ck3.b r5 = r8.f217890v
            java.lang.String r5 = r8.mo103068y(r5, r9)
            java.lang.String r6 = "preUsername"
            r4.mo120962i(r6, r5)
            ck3.b r5 = r8.f217890v
            java.lang.String r5 = r8.mo103102x(r5, r9)
            java.lang.String r6 = "preChatName"
            r4.mo120962i(r6, r5)
            r24 = r3
            r25 = r0
            r28 = r2
            android.text.SpannableString r0 = r22.mo107078or(r23, r24, r25, r26, r27, r28)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r0
            java.lang.String r4 = "MicroMsg.ChattingItemAppMsgMsgQuoteTo"
            java.lang.String r5 = "spannableString：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r2)
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r2 = r12.f217800o
            r2.mo102993c(r0, r1)
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217800o
            java.lang.String r1 = r33.mo108726F2()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x060d
            android.content.res.Resources r1 = r32.mo91572m()
            r2 = 2131837996(0x7f11442c, float:1.9309203E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0611
        L_0x060d:
            java.lang.String r1 = r33.mo108726F2()
        L_0x0611:
            r0.setBrandWording(r1)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 != 0) goto L_0x0667
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c r0 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c
            boolean r1 = r32.mo91583x()
            r2 = 0
            r0.<init>(r9, r1, r12, r2)
            r1 = 2
            r0.f216964T = r1
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r1 = r12.f217800o
            r1.setTag(r0)
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217800o
            com.tencent.mm.ui.chatting.viewitems.x2 r1 = r8.f217892x
            if (r1 != 0) goto L_0x063b
            com.tencent.mm.ui.chatting.viewitems.x2 r1 = new com.tencent.mm.ui.chatting.viewitems.x2
            ck3.b r2 = r8.f217890v
            r1.<init>(r2)
            r8.f217892x = r1
        L_0x063b:
            com.tencent.mm.ui.chatting.viewitems.x2 r1 = r8.f217892x
            r0.setOnClickListener(r1)
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217800o
            r0.setOnDoubleClickListener(r8)
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217800o
            com.tencent.mm.ui.chatting.manager.a r1 = r7.f193278b
            r2 = r18
            xi.d r1 = r1.mo102812a(r2)
            zj3.l r1 = (zj3.C79368l) r1
            com.tencent.mm.ui.chatting.h2 r1 = r1.mo108189Z4()
            r0.setOnTouchListener(r1)
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217800o
            com.tencent.mm.ui.chatting.viewitems.i$e r1 = r8.mo103098p(r7)
            r0.setOnLongClickListener(r1)
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217800o
            r1 = 0
            r0.setVisibility(r1)
        L_0x0667:
            java.lang.String r4 = r32.mo91573n()
            boolean r5 = r32.mo91583x()
            r1 = r30
            r2 = r12
            r3 = r33
            r6 = r32
            r7 = r30
            r1.mo103087e0(r2, r3, r4, r5, r6, r7)
        L_0x067b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74220t2.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return z && i == 822083633;
    }

    /* renamed from: o0 */
    public final void mo103241o0(C72963f4 f4Var) {
        boolean z;
        Class cls = C78135c.class;
        if (f4Var.mo100987Z3()) {
            C38460b jo = ((C78135c) C86312j.m106911c(cls)).vs0().mo61672jo(f4Var.getMsgId());
            Pair<Integer, Long> w = C72695v.m85081w(f4Var);
            if (w != null) {
                if (jo != null) {
                    jo.field_msgId = ((Long) w.second).longValue();
                    C38459a vs02 = ((C78135c) C86312j.m106911c(cls)).vs0();
                    vs02.getClass();
                    z = vs02.update(jo.systemRowid, jo);
                } else {
                    Log.m105920e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "resendQuoteMsg() msgQute is null!");
                    z = false;
                }
                Log.m105925i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "resendQuoteMsg result:%s msgId:%s result:%s", w.first, w.second, Boolean.valueOf(z));
            }
            C75604z3.m90834f(f4Var.getMsgId());
            this.f217890v.mo91541B(true);
        }
    }
}
