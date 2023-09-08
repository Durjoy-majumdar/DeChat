package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.plugin.C67651f;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SolitaireMsgFoldClickStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.chatting.C73309a2;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.TextPreviewUI;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.thumbplayer.api.TPOptionalID;
import de3.C107029o;
import de3.C45331f0;
import de3.C75355a0;
import de3.C75359b0;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C86493v0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jm2.C46562a;
import k20.C9556a;
import kb0.C76528a;
import ke3.C88144b;
import mk3.C76773b;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76891l0;
import nj3.C88990b;
import p629ny.C76976e;
import p629ny.C76979h;
import p763ym.C79138l;
import sz1.C77815b;
import te3.C101801kd0;
import te3.C101835rd0;
import te3.C64428hr2;
import te3.C64452ir2;
import uk3.C78222a;
import uo3.C78253a;
import wd3.C53155r0;
import wz1.C78747b;
import wz1.C78757e;
import xo3.C78950d;
import xo3.C78967g;
import xz1.C79013a;
import zj3.C79348e;
import zj3.C79350e1;
import zj3.C79368l;
import zj3.C79371n;
import zj3.C79393z;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i2 */
public final class C74038i2 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$a */
    public class C74039a extends C75359b0 {

        /* renamed from: d */
        public final /* synthetic */ C67391b f217250d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f217251e;

        /* renamed from: f */
        public final /* synthetic */ MMNeat7extView f217252f;

        /* renamed from: g */
        public final /* synthetic */ CharSequence f217253g;

        /* renamed from: h */
        public final /* synthetic */ C64428hr2 f217254h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74039a(int i, C53155r0 r0Var, C67391b bVar, C72963f4 f4Var, MMNeat7extView mMNeat7extView, CharSequence charSequence, C64428hr2 hr22) {
            super(i, r0Var);
            this.f217250d = bVar;
            this.f217251e = f4Var;
            this.f217252f = mMNeat7extView;
            this.f217253g = charSequence;
            this.f217254h = hr22;
        }

        public void onClick(View view) {
            Class cls = C79393z.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.ChattingItemAppMsgGroupSolitatire", "fold click");
            if (!((C79393z) this.f217250d.f193278b.mo102812a(cls)).mo102454a5(this.f217251e)) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgGroupSolitatire", "not fold");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (view != null) {
                view.setTag(C0966R.C0970id.b8s, Long.valueOf(System.currentTimeMillis()));
            }
            this.f217252f.mo104280c(this.f217253g, TextView.BufferType.SPANNABLE, (Boolean) null);
            ((C79393z) this.f217250d.f193278b.mo102812a(cls)).mo102455e2(((Long) this.f217252f.getTag(C0966R.C0970id.f357682b73)).longValue());
            C78757e wx02 = ((C77815b) C86312j.m106911c(C77815b.class)).wx0();
            String r = this.f217250d.mo91577r();
            C64428hr2 hr22 = this.f217254h;
            wx02.getClass();
            SolitaireMsgFoldClickStruct solitaireMsgFoldClickStruct = new SolitaireMsgFoldClickStruct();
            solitaireMsgFoldClickStruct.f194454d = solitaireMsgFoldClickStruct.mo86045b("ChatName", r, true);
            solitaireMsgFoldClickStruct.f194455e = hr22.f183549i;
            solitaireMsgFoldClickStruct.f194456f = solitaireMsgFoldClickStruct.mo86045b("Identifier", hr22.f183550j, true);
            solitaireMsgFoldClickStruct.f194457g = (long) hr22.f183545e.size();
            solitaireMsgFoldClickStruct.f194458h = (long) hr22.f183548h;
            solitaireMsgFoldClickStruct.mo86054n();
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$b */
    public static final class C74040b extends C74023i.C74026c {

        /* renamed from: b */
        public MMNeat7extView f217255b;

        /* renamed from: c */
        public TextView f217256c;

        /* renamed from: d */
        public TextView f217257d;

        /* renamed from: e */
        public C78253a f217258e;

        /* renamed from: f */
        public C78950d f217259f;

        /* renamed from: g */
        public C107029o f217260g;

        /* renamed from: h */
        public View f217261h;

        /* renamed from: i */
        public ViewStub f217262i;

        /* renamed from: j */
        public ChattingItemTranslate f217263j;

        /* renamed from: a */
        public C74040b mo103123a(View view, boolean z) {
            super.create(view);
            this.f217255b = (MMNeat7extView) view.findViewById(C0966R.C0970id.b4b);
            this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.b8v);
            this.f217256c = (TextView) view.findViewById(C0966R.C0970id.b3g);
            this.f217257d = (TextView) view.findViewById(C0966R.C0970id.b2v);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            this.f217261h = view.findViewById(C0966R.C0970id.b4_);
            this.f217262i = (ViewStub) view.findViewById(C0966R.C0970id.f359418ku0);
            this.f217260g = new C107029o(this.f217255b, new C75355a0(this.f217255b.getContext()));
            return this;
        }

        public View getMainContainerView() {
            return this.f217255b;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$c */
    public static class C74041c extends C74023i implements NeatTextView.C75245c {

        /* renamed from: v */
        public C67391b f217264v;

        /* renamed from: w */
        public CharSequence f217265w;

        /* renamed from: x */
        public C74058f f217266x;

        /* renamed from: y */
        public int f217267y = -1;

        /* renamed from: z */
        public int f217268z = -1;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$c$a */
        public class C74042a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f217269d;

            /* renamed from: e */
            public final /* synthetic */ C67391b f217270e;

            public C74042a(C74041c cVar, C72963f4 f4Var, C67391b bVar) {
                this.f217269d = f4Var;
                this.f217270e = bVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105925i("MicroMsg.ChattingItemAppMsgGroupSolitatireFrom", "sourceTV click msgId:%s", Long.valueOf(this.f217269d.getMsgId()));
                C73309a2.m86449b(this.f217270e, this.f217269d.getMsgId(), 1);
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$c$b */
        public class C74043b implements PopupWindow.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ C67391b f217271d;

            /* renamed from: e */
            public final /* synthetic */ C74040b f217272e;

            public C74043b(C67391b bVar, C74040b bVar2) {
                this.f217271d = bVar;
                this.f217272e = bVar2;
            }

            public void onDismiss() {
                this.f217271d.mo91545F(true);
                C78253a aVar = this.f217272e.f217258e;
                C67391b bVar = this.f217271d;
                C74041c cVar = C74041c.this;
                C74023i.m87879U(aVar, bVar, cVar.f217268z, cVar.f217267y, 49);
                C74041c cVar2 = C74041c.this;
                cVar2.f217268z = -1;
                cVar2.f217267y = -1;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$c$c */
        public class C74044c implements C76891l0 {

            /* renamed from: a */
            public final /* synthetic */ Context f217274a;

            /* renamed from: b */
            public final /* synthetic */ C74040b f217275b;

            public C74044c(C74041c cVar, Context context, C74040b bVar) {
                this.f217274a = context;
                this.f217275b = bVar;
            }

            /* renamed from: a */
            public void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                e0Var.clear();
                e0Var.mo107136c(0, 0, 0, this.f217274a.getResources().getString(C0966R.string.f7936wt), C0966R.raw.icons_filled_copy);
                CharSequence a = this.f217275b.f217255b.mo154968a();
                C74243t8 t8Var = (C74243t8) this.f217275b.f217255b.getTag();
                int h = t8Var != null ? C75569c4.m90675h(t8Var.f212238a) : 0;
                if (h <= 0 || h >= a.length()) {
                    e0Var.mo107136c(0, 1, 0, this.f217274a.getResources().getString(C0966R.string.gs4), C0966R.raw.icons_filled_allselect);
                }
                e0Var.mo107136c(0, 2, 0, this.f217274a.getResources().getString(C0966R.string.f361028gs2), C0966R.raw.icons_filled_share);
                e0Var.mo107136c(0, 3, 0, this.f217274a.getResources().getString(C0966R.string.cmx), C0966R.raw.icons_filled_favorites);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$c$d */
        public class C74045d implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C74040b f217276d;

            /* renamed from: e */
            public final /* synthetic */ Context f217277e;

            public C74045d(C74040b bVar, Context context) {
                this.f217276d = bVar;
                this.f217277e = context;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C101835rd0 rd02;
                C74243t8 t8Var;
                C74041c cVar = C74041c.this;
                cVar.f217268z = i;
                cVar.f217267y = menuItem.getItemId();
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    Context context = MMApplicationContext.getContext();
                    CharSequence charSequence = C74041c.this.f217265w;
                    ClipboardHelper.setText(context, charSequence, charSequence);
                    C78950d dVar = this.f217276d.f217259f;
                    if (dVar != null) {
                        dVar.mo108922f();
                        C78950d dVar2 = this.f217276d.f217259f;
                        dVar2.f231828C = true;
                        dVar2.f231829D = true;
                        dVar2.mo108921e();
                    }
                    C74059i7.m88003h(this.f217277e);
                } else if (itemId == 1) {
                    C78950d dVar3 = this.f217276d.f217259f;
                    if (dVar3 != null) {
                        C78950d.C78963m mVar = dVar3.f231845g;
                        if (mVar != null) {
                            mVar.mo103119d();
                        }
                        C78950d dVar4 = this.f217276d.f217259f;
                        dVar4.f231828C = true;
                        dVar4.mo108921e();
                        C74040b bVar = this.f217276d;
                        bVar.f217259f.mo108923g(0, bVar.f217255b.mo154968a().length());
                        this.f217276d.f217259f.mo108924h();
                        this.f217276d.f217259f.mo108927k();
                        C78950d.C78963m mVar2 = this.f217276d.f217259f.f231845g;
                        if (mVar2 != null) {
                            mVar2.mo103120e();
                        }
                    }
                } else if (itemId == 2) {
                    C74243t8 t8Var2 = (C74243t8) this.f217276d.f217255b.getTag();
                    if (t8Var2 != null) {
                        Context context2 = this.f217277e;
                        C6789c.m7088a(t8Var2.f212238a, context2, new i2$c$d$$a(this, context2));
                    }
                } else if (itemId == 3) {
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C96787m0.m124258l(doFavoriteEvent, C74041c.this.f217265w.toString(), 1);
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264685j = C74041c.this.f217264v.f193286j;
                    aVar.f264688m = 43;
                    C101801kd0 kd02 = aVar.f264676a;
                    if (!(kd02 == null || (rd02 = kd02.f298616d) == null || (t8Var = (C74243t8) this.f217276d.f217255b.getTag()) == null)) {
                        rd02.mo141275k(t8Var.f212238a.mo108768t());
                        rd02.mo141279o(C75592q0.m90789s());
                        doFavoriteEvent.publish();
                    }
                    C78950d dVar5 = this.f217276d.f217259f;
                    if (dVar5 != null) {
                        dVar5.mo108922f();
                        C78950d dVar6 = this.f217276d.f217259f;
                        dVar6.f231828C = true;
                        dVar6.f231829D = true;
                        dVar6.mo108921e();
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$c$e */
        public class C74046e implements C78950d.C78961k {
            public C74046e() {
            }

            /* renamed from: a */
            public void mo102127a(CharSequence charSequence) {
                C74041c.this.f217265w = charSequence;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$c$f */
        public class C74047f extends C78950d.C78963m {

            /* renamed from: a */
            public final /* synthetic */ C74040b f217280a;

            public C74047f(C74041c cVar, C74040b bVar) {
                this.f217280a = bVar;
            }

            /* renamed from: a */
            public void mo103116a() {
                this.f217280a.f217259f.mo108922f();
                C78950d dVar = this.f217280a.f217259f;
                dVar.f231828C = true;
                dVar.f231829D = true;
                dVar.mo108921e();
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$c$g */
        public class C74048g implements MMNeat7extView.C74954d {

            /* renamed from: a */
            public final /* synthetic */ C74040b f217281a;

            public C74048g(C74041c cVar, C74040b bVar) {
                this.f217281a = bVar;
            }

            /* renamed from: a */
            public void mo103126a(CharSequence charSequence, TextView.BufferType bufferType) {
                if (((Boolean) this.f217281a.f217255b.getTag(C0966R.C0970id.f357681b72)).booleanValue()) {
                    C78222a.m94508a().getClass();
                    C78222a.C78223a.TEXT_CALLBACK.mo108242a(charSequence, bufferType, ((Long) this.f217281a.f217255b.getTag(C0966R.C0970id.f357682b73)).longValue());
                }
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6896rk);
            C74040b bVar = new C74040b();
            bVar.mo103123a(n4Var, true);
            n4Var.setTag(bVar);
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
                if (itemId == 124 || itemId == 125) {
                    ((C79350e1) bVar.f193278b.mo102812a(cls2)).mo102305S2(menuItem, f4Var);
                } else if (itemId == 151) {
                    C73309a2.m86449b(bVar, f4Var.getMsgId(), 2);
                    return false;
                } else if (itemId != 152) {
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
                            C117292a.m165358d(bVar, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            bVar.mo91556Q((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
                                Log.m105920e("MicroMsg.ChattingItemAppMsgGroupSolitatireFrom", " transform text fav failed");
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
                } else {
                    ((C79350e1) bVar.f193278b.mo102812a(cls2)).mo102311d5(f4Var);
                }
                return false;
            } else {
                Intent intent2 = new Intent(bVar.mo91565f(), cls3);
                intent2.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
                intent2.putExtra("Retr_Msg_Type", 2);
                intent2.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(intent2);
                C117292a.m165358d(bVar, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bVar.mo91556Q((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            String str = f4Var.f230724G;
            if (str != null) {
                boolean contains = str.contains("announcement@all");
            }
            ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
            int b = cVar.mo103252b();
            int i = cVar.f216964T;
            if (i == 1) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgGroupSolitatireFrom", "接龙消息右键菜单");
                if (C78747b.m95095G(f4Var)) {
                    e0Var.mo107136c(b, 151, 0, this.f217264v.mo91572m().getString(C0966R.string.ffj), C0966R.raw.icons_filled_continued_form);
                }
                if (!C75569c4.m90687t(f4Var)) {
                    C76874e0 e0Var2 = e0Var;
                    int i2 = b;
                    e0Var2.mo107136c(i2, 102, 0, this.f217264v.mo91572m().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                    e0Var2.mo107136c(i2, 111, 0, this.f217264v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, 116, 0, this.f217264v.mo91572m().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if (C67651f.m79887a() && (!f4Var.mo101015s3() || !f4Var.mo101006n3())) {
                    e0Var.mo107136c(b, 124, 0, view.getContext().getString(C0966R.string.b_m), C0966R.raw.icons_filled_translate);
                }
                if (!this.f217264v.mo91584y()) {
                    e0Var.mo107136c(b, 100, 0, this.f217264v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                }
                if (C75569c4.m90690w(f4Var)) {
                    e0Var.clear();
                    if (!this.f217264v.mo91584y()) {
                        e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                    }
                }
            } else if (i == 2) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgGroupSolitatireFrom", "翻译消息右键菜单");
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
            if (C74038i2.m87963a(view)) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgGroupSolitatireFrom", "onDoubleTap solitaire fold double click");
                return true;
            }
            Intent intent = new Intent(view.getContext(), TextPreviewUI.class);
            intent.addFlags(67108864);
            C74243t8 t8Var = (C74243t8) view.getTag();
            if (t8Var != null) {
                CharSequence a = ((MMNeat7extView) view).mo154968a();
                intent.putExtra("Chat_Msg_Id", t8Var.f212238a.getMsgId());
                intent.putExtra("key_chat_text", a);
                C67391b bVar = this.f217264v;
                if (bVar != null) {
                    intent.putExtra("is_group_chat", bVar.mo91583x());
                }
                Context context = view.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C88990b.m111199h(view.getContext());
            }
            return true;
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            return new C74059i7.C74062c(f4Var);
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            String str2;
            ChattingItemTranslate.C73918e eVar;
            ViewStub viewStub;
            int i;
            String str3;
            int indexOf;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            String str4 = str;
            Class cls = C76979h.class;
            Class cls2 = C79138l.class;
            this.f217264v = bVar2;
            ((C79371n) bVar2.f193278b.mo102812a(C79371n.class)).mo102406W4(f4Var2);
            C74040b bVar3 = (C74040b) cVar;
            bVar3.f217255b.setTag(C0966R.C0970id.f357682b73, Long.valueOf(f4Var.getMsgId()));
            MMNeat7extView mMNeat7extView = bVar3.f217255b;
            Boolean bool = Boolean.TRUE;
            mMNeat7extView.setTag(C0966R.C0970id.f357681b72, bool);
            String content = f4Var.getContent();
            if (bVar.mo91583x() && (indexOf = f4Var.getContent().indexOf(58)) != -1) {
                content = f4Var.getContent().substring(indexOf + 1);
            }
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null && u.f195582i == 53) {
                C44561j appInfo = ((C79138l) C86312j.m106911c(cls2)).getAppInfo(u.f195562d);
                String str5 = (appInfo == null || (str3 = appInfo.field_appName) == null || str3.trim().length() <= 0) ? u.f195484F : appInfo.field_appName;
                String str6 = u.f195562d;
                if (str6 == null || str6.length() <= 0 || !mo103084W(str5)) {
                    bVar3.f217256c.setVisibility(8);
                } else {
                    bVar3.f217256c.setText(bVar.mo91572m().getString(C0966R.string.bby, new Object[]{((C79138l) C86312j.m106911c(cls2)).mo74019xG(bVar.mo91565f(), appInfo, str5)}));
                    bVar3.f217256c.setVisibility(0);
                    mo103076J(bVar2, bVar3.f217256c, u.f195562d);
                    mo103079M(bVar2, bVar3.f217256c, u.f195562d);
                }
                if (C78747b.m95095G(f4Var)) {
                    bVar3.f217256c.setText(bVar.mo91572m().getString(C0966R.string.ffo));
                    bVar3.f217256c.setVisibility(0);
                    bVar3.f217256c.setOnClickListener(new C74042a(this, f4Var2, bVar2));
                }
                String str7 = u.f195642x;
                if (str7 == null || str7.length() <= 0) {
                    bVar3.f217257d.setVisibility(8);
                } else {
                    mo103073G(bVar2, bVar3.f217257d, C74243t8.m88488a(u.f195642x));
                    bVar3.f217257d.setVisibility(0);
                }
                C76773b.f224572a.mo107028a(bVar3.f217255b, f4Var2, bVar.mo91583x(), str4);
                Bundle f = C74059i7.m88001f(f4Var2, bVar2, str4);
                C45331f0.C45333b bVar4 = C45331f0.C45333b.GROUP_CHATTING;
                bVar4.mo70880b(f, C76528a.m92004a(f4Var.mo108768t()));
                Context context = bVar3.f217255b.getContext();
                String str8 = u.f195570f;
                C76976e eVar2 = C76979h.f224926w0;
                C74038i2.m87964b(bVar3.f217255b.getContext(), bVar, u.f195570f, ((C76979h) C86312j.m106911c(cls)).N70(context, str8, (int) bVar3.f217255b.getTextSize(), 1, f, eVar2), bVar3.f217255b, f4Var, 1);
                bVar3.f217255b.setClickable(true);
                ChattingItemTranslate.C73916c cVar2 = new ChattingItemTranslate.C73916c(f4Var2, bVar.mo91583x(), bVar3, (String) null);
                Context context2 = bVar3.f217255b.getContext();
                bVar3.f217255b.setTag(C0966R.C0970id.ke5, bool);
                if (bVar3.f217258e == null) {
                    C78253a aVar = new C78253a(context2, bVar3.f217255b);
                    bVar3.f217258e = aVar;
                    aVar.f229227C = new C74043b(bVar2, bVar3);
                    aVar.f229257z = true;
                    aVar.f229253v = new C74044c(this, context2, bVar3);
                    aVar.f229251t = new C74045d(bVar3, context2);
                }
                if (!C75569c4.m90690w(f4Var)) {
                    int h = C75569c4.m90675h(f4Var);
                    if (h <= 0 || h >= C78967g.m95477j(bVar3.f217255b).length()) {
                        h = 0;
                    }
                    C74023i.C74027e p = mo103098p(bVar2);
                    C78950d.C78963m v = mo103100v(p);
                    C78950d dVar = bVar3.f217259f;
                    if (dVar != null) {
                        dVar.mo108918b();
                    }
                    int[] iArr = new int[2];
                    MMNeat7extView mMNeat7extView2 = bVar3.f217255b;
                    if (mMNeat7extView2 != null) {
                        mMNeat7extView2.getLocationInWindow(iArr);
                        i = iArr[0];
                        if (i == 0) {
                            Rect rect = new Rect();
                            bVar3.f217255b.getGlobalVisibleRect(rect);
                            i = rect.left;
                        }
                    } else {
                        i = 0;
                    }
                    MMNeat7extView mMNeat7extView3 = bVar3.f217255b;
                    C78253a aVar2 = bVar3.f217258e;
                    if (this.f217266x == null) {
                        this.f217266x = new C74058f(this.f217264v);
                    }
                    C78950d.C78958h hVar = new C78950d.C78958h(mMNeat7extView3, aVar2, v, this.f217266x, bVar3.f217260g);
                    hVar.f231878g = C0966R.color.aak;
                    hVar.f231879h = 18;
                    hVar.f231877f = C0966R.color.f3274lt;
                    if (i != 0) {
                        hVar.f231880i = i + C74942w4.m89786c(bVar3.f217255b.getContext(), C0966R.dimen.f3736cp);
                    }
                    C78950d dVar2 = new C78950d(hVar);
                    bVar3.f217259f = dVar2;
                    C74057e eVar3 = new C74057e(dVar2);
                    dVar2.f231842d = new C74046e();
                    p.f217229n = new C74047f(this, bVar3);
                    dVar2.f231858t = h;
                    dVar2.f231837L = eVar3;
                } else {
                    bVar3.f217255b.setTag(C0966R.C0970id.ke5, Boolean.FALSE);
                    bVar3.f217255b.setOnTouchListener(bVar3.f217260g);
                    bVar3.f217255b.setOnLongClickListener(mo103098p(bVar2));
                    MMNeat7extView mMNeat7extView4 = bVar3.f217255b;
                    if (this.f217266x == null) {
                        this.f217266x = new C74058f(this.f217264v);
                    }
                    mMNeat7extView4.setOnClickListener(this.f217266x);
                }
                bVar3.f217255b.setOnDoubleClickListener(this);
                bVar3.f217255b.setTag(cVar2);
                bVar3.f217255b.setTextListener(new C74048g(this, bVar3));
                bVar3.f217255b.setMaxLines(Integer.MAX_VALUE);
                ChattingItemTranslate.C73918e eVar4 = ChattingItemTranslate.C73918e.NoTransform;
                if (C67651f.m79887a()) {
                    str2 = (!f4Var.mo101015s3() || !f4Var.mo101006n3()) ? null : f4Var.mo108727G2();
                    eVar = ((C79350e1) bVar2.f193278b.mo102812a(C79350e1.class)).mo102314n4(f4Var2);
                } else {
                    eVar = eVar4;
                    str2 = null;
                }
                if (!Util.isNullOrNil(str2) || eVar != eVar4) {
                    if (bVar3.f217263j == null && (viewStub = bVar3.f217262i) != null) {
                        ChattingItemTranslate chattingItemTranslate = (ChattingItemTranslate) viewStub.inflate();
                        bVar3.f217263j = chattingItemTranslate;
                        chattingItemTranslate.mo102992b();
                    }
                    Bundle a = bVar4.mo70879a(C76528a.m92004a(f4Var.mo108768t()));
                    Context context3 = bVar3.f217255b.getContext();
                    String a2 = C86493v0.m107223a("" + f4Var.mo108774y2());
                    C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a2, true);
                    c.mo120962i("prePublishId", "msg_" + f4Var.mo108774y2());
                    c.mo120962i("preUsername", mo103068y(this.f217264v, f4Var2));
                    c.mo120962i("preChatName", mo103102x(this.f217264v, f4Var2));
                    SpannableString d902 = ((C76979h) C86312j.m106911c(cls)).d90(context3, str2, (int) bVar3.f217255b.getTextSize(), 1, a, a2, 0, eVar2);
                    Log.m105921e("MicroMsg.ChattingItemAppMsgGroupSolitatireFrom", "spannableString：%s", d902);
                    bVar3.f217263j.mo102993c(d902, eVar);
                    bVar3.f217263j.setBrandWording(Util.isNullOrNil(f4Var.mo108726F2()) ? bVar.mo91572m().getString(C0966R.string.k2b) : f4Var.mo108726F2());
                    if (!Util.isNullOrNil(str2)) {
                        ChattingItemTranslate.C73916c cVar3 = new ChattingItemTranslate.C73916c(f4Var2, bVar.mo91583x(), bVar3, (String) null);
                        cVar3.f216964T = 2;
                        bVar3.f217263j.setTag(cVar3);
                        ChattingItemTranslate chattingItemTranslate2 = bVar3.f217263j;
                        if (this.f217266x == null) {
                            this.f217266x = new C74058f(this.f217264v);
                        }
                        chattingItemTranslate2.setOnClickListener(this.f217266x);
                        bVar3.f217263j.setOnDoubleClickListener(this);
                        bVar3.f217263j.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                        bVar3.f217263j.setOnLongClickListener(mo103098p(bVar2));
                        bVar3.f217263j.setVisibility(0);
                        return;
                    }
                    return;
                }
                ChattingItemTranslate chattingItemTranslate3 = bVar3.f217263j;
                if (chattingItemTranslate3 != null) {
                    chattingItemTranslate3.setVisibility(8);
                }
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 805306417;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$d */
    public static class C74049d extends C74023i implements NeatTextView.C75245c, C73774p2 {

        /* renamed from: v */
        public C67391b f217282v;

        /* renamed from: w */
        public CharSequence f217283w;

        /* renamed from: x */
        public C74058f f217284x;

        /* renamed from: y */
        public int f217285y = -1;

        /* renamed from: z */
        public int f217286z = -1;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$d$a */
        public class C74050a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f217287d;

            /* renamed from: e */
            public final /* synthetic */ C67391b f217288e;

            public C74050a(C74049d dVar, C72963f4 f4Var, C67391b bVar) {
                this.f217287d = f4Var;
                this.f217288e = bVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105925i("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "sourceTV click msgId:%s", Long.valueOf(this.f217287d.getMsgId()));
                C73309a2.m86449b(this.f217288e, this.f217287d.getMsgId(), 1);
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$d$b */
        public class C74051b implements PopupWindow.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ C67391b f217289d;

            /* renamed from: e */
            public final /* synthetic */ C74040b f217290e;

            public C74051b(C67391b bVar, C74040b bVar2) {
                this.f217289d = bVar;
                this.f217290e = bVar2;
            }

            public void onDismiss() {
                this.f217289d.mo91545F(true);
                C78253a aVar = this.f217290e.f217258e;
                C67391b bVar = this.f217289d;
                C74049d dVar = C74049d.this;
                C74023i.m87879U(aVar, bVar, dVar.f217286z, dVar.f217285y, 49);
                C74049d dVar2 = C74049d.this;
                dVar2.f217286z = -1;
                dVar2.f217285y = -1;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$d$c */
        public class C74052c implements C76891l0 {

            /* renamed from: a */
            public final /* synthetic */ Context f217292a;

            public C74052c(C74049d dVar, Context context) {
                this.f217292a = context;
            }

            /* renamed from: a */
            public void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                e0Var.clear();
                C76874e0 e0Var2 = e0Var;
                e0Var2.mo107136c(0, 0, 0, this.f217292a.getResources().getString(C0966R.string.f7936wt), C0966R.raw.icons_filled_copy);
                e0Var2.mo107136c(0, 1, 0, this.f217292a.getResources().getString(C0966R.string.gs4), C0966R.raw.icons_filled_allselect);
                e0Var2.mo107136c(0, 2, 0, this.f217292a.getResources().getString(C0966R.string.f361028gs2), C0966R.raw.icons_filled_share);
                e0Var2.mo107136c(0, 3, 0, this.f217292a.getResources().getString(C0966R.string.cmx), C0966R.raw.icons_filled_favorites);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$d$d */
        public class C74053d implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C74040b f217293d;

            /* renamed from: e */
            public final /* synthetic */ Context f217294e;

            public C74053d(C74040b bVar, Context context) {
                this.f217293d = bVar;
                this.f217294e = context;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C101835rd0 rd02;
                C74243t8 t8Var;
                C74049d.this.f217285y = menuItem.getItemId();
                C74049d.this.f217286z = i;
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    Context context = MMApplicationContext.getContext();
                    CharSequence charSequence = C74049d.this.f217283w;
                    ClipboardHelper.setText(context, charSequence, charSequence);
                    C78950d dVar = this.f217293d.f217259f;
                    if (dVar != null) {
                        dVar.mo108922f();
                        C78950d dVar2 = this.f217293d.f217259f;
                        dVar2.f231828C = true;
                        dVar2.f231829D = true;
                        dVar2.mo108921e();
                    }
                    C74059i7.m88003h(this.f217294e);
                } else if (itemId == 1) {
                    C78950d dVar3 = this.f217293d.f217259f;
                    if (dVar3 != null) {
                        C78950d.C78963m mVar = dVar3.f231845g;
                        if (mVar != null) {
                            mVar.mo103119d();
                        }
                        C78950d dVar4 = this.f217293d.f217259f;
                        dVar4.f231828C = true;
                        dVar4.mo108921e();
                        C74040b bVar = this.f217293d;
                        bVar.f217259f.mo108923g(0, bVar.f217255b.mo154968a().length());
                        this.f217293d.f217259f.mo108924h();
                        this.f217293d.f217259f.mo108927k();
                        C78950d.C78963m mVar2 = this.f217293d.f217259f.f231845g;
                        if (mVar2 != null) {
                            mVar2.mo103120e();
                        }
                    }
                } else if (itemId == 2) {
                    Intent intent = new Intent(this.f217294e, MsgRetransmitUI.class);
                    intent.putExtra("Retr_Msg_content", C74049d.this.f217283w);
                    intent.putExtra("Retr_Msg_Type", 4);
                    Context context2 = this.f217294e;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context3 = context2;
                    C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (itemId == 3) {
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C96787m0.m124258l(doFavoriteEvent, C74049d.this.f217283w.toString(), 1);
                    DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                    aVar2.f264685j = C74049d.this.f217282v.f193286j;
                    aVar2.f264688m = 43;
                    C101801kd0 kd02 = aVar2.f264676a;
                    if (!(kd02 == null || (rd02 = kd02.f298616d) == null || (t8Var = (C74243t8) this.f217293d.f217255b.getTag()) == null)) {
                        rd02.mo141275k(t8Var.f212238a.mo108768t());
                        rd02.mo141279o(C75592q0.m90789s());
                        doFavoriteEvent.publish();
                    }
                    C78950d dVar5 = this.f217293d.f217259f;
                    if (dVar5 != null) {
                        dVar5.mo108922f();
                        C78950d dVar6 = this.f217293d.f217259f;
                        dVar6.f231828C = true;
                        dVar6.f231829D = true;
                        dVar6.mo108921e();
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$d$e */
        public class C74054e implements C78950d.C78961k {
            public C74054e() {
            }

            /* renamed from: a */
            public void mo102127a(CharSequence charSequence) {
                C74049d.this.f217283w = charSequence;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$d$f */
        public class C74055f extends C78950d.C78963m {

            /* renamed from: a */
            public final /* synthetic */ C74040b f217297a;

            public C74055f(C74049d dVar, C74040b bVar) {
                this.f217297a = bVar;
            }

            /* renamed from: a */
            public void mo103116a() {
                this.f217297a.f217259f.mo108922f();
                C78950d dVar = this.f217297a.f217259f;
                dVar.f231828C = true;
                dVar.f231829D = true;
                dVar.mo108921e();
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$d$g */
        public class C74056g implements MMNeat7extView.C74954d {

            /* renamed from: a */
            public final /* synthetic */ C74040b f217298a;

            public C74056g(C74049d dVar, C74040b bVar) {
                this.f217298a = bVar;
            }

            /* renamed from: a */
            public void mo103126a(CharSequence charSequence, TextView.BufferType bufferType) {
                if (((Boolean) this.f217298a.f217255b.getTag(C0966R.C0970id.f357681b72)).booleanValue()) {
                    C78222a.m94508a().getClass();
                    C78222a.C78223a.TEXT_CALLBACK.mo108242a(charSequence, bufferType, ((Long) this.f217298a.f217255b.getTag(C0966R.C0970id.f357682b73)).longValue());
                }
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6946t1);
            C74040b bVar = new C74040b();
            bVar.mo103123a(n4Var, true);
            n4Var.setTag(bVar);
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
                    mo103127o0(f4Var);
                } else if (itemId == 111) {
                    Intent intent = new Intent(bVar.mo91565f(), cls3);
                    intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
                    intent.putExtra("Retr_Msg_Type", 2);
                    intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    bVar.mo91556Q((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return false;
                } else if (itemId == 124 || itemId == 125) {
                    ((C79350e1) bVar.f193278b.mo102812a(cls2)).mo102305S2(menuItem, f4Var);
                } else if (itemId == 151) {
                    C73309a2.m86449b(bVar, f4Var.getMsgId(), 2);
                    return false;
                } else if (itemId != 152) {
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
                            C117292a.m165358d(bVar, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            bVar.mo91556Q((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
                                Log.m105920e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", " transform text fav failed");
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
                } else {
                    ((C79350e1) bVar.f193278b.mo102812a(cls2)).mo102311d5(f4Var);
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
            int i2;
            C72963f4 f4Var2 = f4Var;
            String str = f4Var2.f230724G;
            boolean z = str != null && str.contains("announcement@all");
            ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
            int b = cVar.mo103252b();
            int i3 = cVar.f216964T;
            if (i3 == 1) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "接龙消息右键菜单");
                if (C78747b.m95095G(f4Var)) {
                    i = 2;
                    String string = this.f217282v.mo91572m().getString(C0966R.string.ffj);
                    i2 = C0966R.string.b9x;
                    e0Var.mo107136c(b, 151, 0, string, C0966R.raw.icons_filled_continued_form);
                } else {
                    i2 = C0966R.string.b9x;
                    i = 2;
                }
                if (!C75569c4.m90687t(f4Var)) {
                    C76874e0 e0Var2 = e0Var;
                    int i4 = b;
                    e0Var2.mo107136c(i4, 102, 0, this.f217282v.mo91572m().getString(i2), C0966R.raw.icons_filled_copy);
                    e0Var2.mo107136c(i4, 111, 0, this.f217282v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
                if (f4Var.getStatus() == 5) {
                    e0Var.mo107136c(b, 103, 0, view.getContext().getString(C0966R.string.f360269bb2), C0966R.raw.icons_filled_refresh);
                }
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, 116, 0, this.f217282v.mo91572m().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if (!z && !f4Var.mo100967F3() && ((f4Var.getStatus() == i || f4Var2.f230728K == 1) && mo103083Q(f4Var2, this.f217282v) && mo103081O(f4Var.mo108768t()) && !this.f217282v.mo91580u())) {
                    e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                }
                if (C67651f.m79887a() && (!f4Var.mo101015s3() || !f4Var.mo101006n3())) {
                    e0Var.mo107136c(b, 124, 0, view.getContext().getString(C0966R.string.b_m), C0966R.raw.icons_filled_translate);
                }
                if (this.f217282v.mo91584y()) {
                    return true;
                }
                e0Var.mo107136c(b, 100, 0, this.f217282v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                return true;
            } else if (i3 != 2) {
                return true;
            } else {
                Log.m105920e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "翻译消息右键菜单");
                C76874e0 e0Var3 = e0Var;
                int i5 = b;
                e0Var3.mo107136c(i5, 141, 0, view.getContext().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                e0Var3.mo107136c(i5, TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, TPOptionalID.f349338xc9bdf6cd, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if (C67651f.m79887a() && f4Var.mo101015s3() && f4Var.mo101006n3()) {
                    C76874e0 e0Var4 = e0Var;
                    int i6 = b;
                    e0Var4.mo107136c(i6, 124, 0, view.getContext().getString(C0966R.string.b_k), C0966R.raw.icons_filled_eyes_off);
                    e0Var4.mo107136c(i6, 152, 0, view.getContext().getString(C0966R.string.ml5), C0966R.raw.icons_filled_feedback_error);
                }
                return false;
            }
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            mo103127o0(f4Var);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: b */
        public boolean mo103047b(View view, MotionEvent motionEvent) {
            C74243t8 t8Var;
            if (C74038i2.m87963a(view)) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "onDoubleTap solitaire fold double click");
                return true;
            }
            CharSequence a = ((MMNeat7extView) view).mo154968a();
            Intent intent = new Intent(view.getContext(), TextPreviewUI.class);
            intent.addFlags(67108864);
            intent.putExtra("key_chat_text", a);
            if ((view.getTag() instanceof C74243t8) && (t8Var = (C74243t8) view.getTag()) != null) {
                intent.putExtra("Chat_Msg_Id", t8Var.f212238a.getMsgId());
            }
            C67391b bVar = this.f217282v;
            if (bVar != null) {
                intent.putExtra("is_group_chat", bVar.mo91583x());
            }
            Context context = view.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111199h(view.getContext());
            return true;
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            return new C74059i7.C74062c(f4Var);
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            int i;
            String str2;
            ChattingItemTranslate.C73918e eVar;
            ViewStub viewStub;
            String str3;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            String str4 = str;
            Class cls = C79138l.class;
            Class cls2 = C76979h.class;
            C74040b bVar3 = (C74040b) cVar;
            this.f217282v = bVar2;
            ((C79371n) bVar2.f193278b.mo102812a(C79371n.class)).mo102406W4(f4Var2);
            bVar3.f217255b.setTag(C0966R.C0970id.f357682b73, Long.valueOf(f4Var.getMsgId()));
            MMNeat7extView mMNeat7extView = bVar3.f217255b;
            Boolean bool = Boolean.TRUE;
            mMNeat7extView.setTag(C0966R.C0970id.f357681b72, bool);
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            C76773b.f224572a.mo107028a(bVar3.f217255b, f4Var2, bVar.mo91583x(), str4);
            Bundle f = C74059i7.m88001f(f4Var2, bVar2, str4);
            C45331f0.C45333b bVar4 = C45331f0.C45333b.GROUP_CHATTING;
            bVar4.mo70880b(f, C76528a.m92004a(f4Var.mo108768t()));
            if (u != null && u.f195582i == 53) {
                Context context = bVar3.f217255b.getContext();
                String str5 = u.f195570f;
                C76976e eVar2 = C76979h.f224926w0;
                C45331f0.C45333b bVar5 = bVar4;
                C74038i2.m87964b(bVar3.f217255b.getContext(), bVar, u.f195570f, ((C76979h) C86312j.m106911c(cls2)).N70(context, str5, (int) bVar3.f217255b.getTextSize(), 4, f, eVar2), bVar3.f217255b, f4Var, 4);
                bVar3.f217255b.setClickable(true);
                C44561j appInfo = ((C79138l) C86312j.m106911c(cls)).getAppInfo(u.f195562d);
                String str6 = (appInfo == null || (str3 = appInfo.field_appName) == null || str3.trim().length() <= 0) ? u.f195484F : appInfo.field_appName;
                String str7 = u.f195562d;
                if (str7 == null || str7.length() <= 0 || !mo103084W(str6)) {
                    bVar3.f217256c.setVisibility(8);
                } else {
                    bVar3.f217256c.setText(bVar.mo91572m().getString(C0966R.string.bby, new Object[]{((C79138l) C86312j.m106911c(cls)).mo74019xG(bVar.mo91565f(), appInfo, str6)}));
                    bVar3.f217256c.setVisibility(0);
                    mo103076J(bVar2, bVar3.f217256c, u.f195562d);
                    mo103079M(bVar2, bVar3.f217256c, u.f195562d);
                }
                if (C78747b.m95095G(f4Var)) {
                    bVar3.f217256c.setText(bVar.mo91572m().getString(C0966R.string.ffo));
                    bVar3.f217256c.setVisibility(0);
                    bVar3.f217256c.setOnClickListener(new C74050a(this, f4Var2, bVar2));
                }
                if (C74023i.m87878T()) {
                    mo103093i0(bVar3, false, true);
                } else {
                    mo103093i0(bVar3, f4Var.getStatus() < 2, true);
                }
                ChattingItemTranslate.C73916c cVar2 = new ChattingItemTranslate.C73916c(f4Var2, bVar.mo91583x(), bVar3, (String) null);
                Context context2 = bVar3.f217255b.getContext();
                bVar3.f217255b.setTag(C0966R.C0970id.ke5, bool);
                if (bVar3.f217258e == null) {
                    C78253a aVar = new C78253a(context2, bVar3.f217255b);
                    bVar3.f217258e = aVar;
                    aVar.f229227C = new C74051b(bVar2, bVar3);
                    aVar.f229257z = true;
                    aVar.f229253v = new C74052c(this, context2);
                    aVar.f229251t = new C74053d(bVar3, context2);
                }
                C74023i.C74027e p = mo103098p(bVar2);
                C78950d.C78963m v = mo103100v(mo103098p(bVar2));
                C78950d dVar = bVar3.f217259f;
                if (dVar != null) {
                    dVar.mo108918b();
                }
                int[] iArr = new int[2];
                MMNeat7extView mMNeat7extView2 = bVar3.f217255b;
                if (mMNeat7extView2 != null) {
                    mMNeat7extView2.getLocationInWindow(iArr);
                    i = iArr[0];
                    if (i == 0) {
                        Rect rect = new Rect();
                        bVar3.f217255b.getGlobalVisibleRect(rect);
                        i = rect.left;
                    }
                } else {
                    i = 0;
                }
                MMNeat7extView mMNeat7extView3 = bVar3.f217255b;
                C78253a aVar2 = bVar3.f217258e;
                if (this.f217284x == null) {
                    this.f217284x = new C74058f(this.f217282v);
                }
                C78950d.C78958h hVar = new C78950d.C78958h(mMNeat7extView3, aVar2, v, this.f217284x, bVar3.f217260g);
                hVar.f231878g = C0966R.color.f3231k4;
                hVar.f231879h = 18;
                hVar.f231877f = C0966R.color.f3229k2;
                if (i != 0) {
                    hVar.f231880i = i + C74942w4.m89786c(bVar3.f217255b.getContext(), C0966R.dimen.f3723cd);
                }
                C78950d dVar2 = new C78950d(hVar);
                bVar3.f217259f = dVar2;
                C74057e eVar3 = new C74057e(dVar2);
                dVar2.f231842d = new C74054e();
                p.f217229n = new C74055f(this, bVar3);
                dVar2.f231837L = eVar3;
                bVar3.f217255b.setOnDoubleClickListener(this);
                bVar3.f217255b.setTag(cVar2);
                bVar3.f217255b.setTextListener(new C74056g(this, bVar3));
                ChattingItemTranslate.C73918e eVar4 = ChattingItemTranslate.C73918e.NoTransform;
                if (C67651f.m79887a()) {
                    str2 = (!f4Var.mo101015s3() || !f4Var.mo101006n3()) ? null : f4Var.mo108727G2();
                    eVar = ((C79350e1) bVar2.f193278b.mo102812a(C79350e1.class)).mo102314n4(f4Var2);
                } else {
                    eVar = eVar4;
                    str2 = null;
                }
                if (!Util.isNullOrNil(str2) || eVar != eVar4) {
                    if (bVar3.f217263j == null && (viewStub = bVar3.f217262i) != null) {
                        ChattingItemTranslate chattingItemTranslate = (ChattingItemTranslate) viewStub.inflate();
                        bVar3.f217263j = chattingItemTranslate;
                        chattingItemTranslate.mo102992b();
                    }
                    Bundle a = bVar5.mo70879a(C76528a.m92004a(f4Var.mo108768t()));
                    Context context3 = bVar3.f217255b.getContext();
                    String a2 = C86493v0.m107223a("" + f4Var.mo108774y2());
                    C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a2, true);
                    c.mo120962i("prePublishId", "msg_" + f4Var.mo108774y2());
                    c.mo120962i("preUsername", mo103068y(this.f217282v, f4Var2));
                    c.mo120962i("preChatName", mo103102x(this.f217282v, f4Var2));
                    SpannableString d902 = ((C76979h) C86312j.m106911c(cls2)).d90(context3, str2, (int) bVar3.f217255b.getTextSize(), 1, a, a2, 0, eVar2);
                    Log.m105921e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "spannableString：%s", d902);
                    bVar3.f217263j.mo102993c(d902, eVar);
                    bVar3.f217263j.setBrandWording(Util.isNullOrNil(f4Var.mo108726F2()) ? bVar.mo91572m().getString(C0966R.string.k2b) : f4Var.mo108726F2());
                    if (!Util.isNullOrNil(str2)) {
                        ChattingItemTranslate.C73916c cVar3 = new ChattingItemTranslate.C73916c(f4Var2, bVar.mo91583x(), bVar3, (String) null);
                        cVar3.f216964T = 2;
                        bVar3.f217263j.setTag(cVar3);
                        ChattingItemTranslate chattingItemTranslate2 = bVar3.f217263j;
                        if (this.f217284x == null) {
                            this.f217284x = new C74058f(this.f217282v);
                        }
                        chattingItemTranslate2.setOnClickListener(this.f217284x);
                        bVar3.f217263j.setOnDoubleClickListener(this);
                        bVar3.f217263j.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                        bVar3.f217263j.setOnLongClickListener(mo103098p(bVar2));
                        bVar3.f217263j.setVisibility(0);
                    }
                } else {
                    ChattingItemTranslate chattingItemTranslate3 = bVar3.f217263j;
                    if (chattingItemTranslate3 != null) {
                        chattingItemTranslate3.setVisibility(8);
                    }
                }
                mo103087e0(bVar3, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 805306417;
        }

        /* renamed from: o0 */
        public final void mo103127o0(C72963f4 f4Var) {
            Class cls = C77815b.class;
            if (f4Var.mo100977P3()) {
                C79013a Ow = ((C77815b) C86312j.m106911c(cls)).xx0().mo108980Ow(f4Var.mo108768t(), f4Var.f230737U, true);
                if (Ow != null && Util.isEqual(Ow.field_firstMsgId, f4Var.getMsgId())) {
                    Ow.field_firstMsgId = 0;
                    ((C77815b) C86312j.m106911c(cls)).xx0().mo108984kD(Ow, true);
                }
                Pair<Integer, Long> w = C72695v.m85081w(f4Var);
                if (w != null) {
                    C78757e wx02 = ((C77815b) C86312j.m106911c(cls)).wx0();
                    long msgId = f4Var.getMsgId();
                    long longValue = ((Long) w.second).longValue();
                    Pair remove = wx02.f230477a.remove(Long.valueOf(msgId));
                    Boolean remove2 = wx02.f230478b.remove(Long.valueOf(msgId));
                    if (remove != null) {
                        wx02.f230477a.put(Long.valueOf(longValue), remove);
                        wx02.f230478b.put(Long.valueOf(longValue), remove2);
                    }
                }
                C75604z3.m90834f(f4Var.getMsgId());
                this.f217282v.mo91541B(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$e */
    public static class C74057e implements C78950d.C78962l {

        /* renamed from: a */
        public C78950d f217299a;

        public C74057e(C78950d dVar) {
            this.f217299a = dVar;
        }

        /* renamed from: a */
        public void mo103130a() {
            Log.m105918d("OnTouchOutside", "touchOutside");
            this.f217299a.mo108922f();
            C78950d dVar = this.f217299a;
            dVar.f231829D = true;
            dVar.mo108919c();
            C78950d dVar2 = this.f217299a;
            dVar2.f231828C = true;
            dVar2.mo108920d();
            C78950d.C78963m mVar = this.f217299a.f231845g;
            if (mVar != null) {
                mVar.mo103116a();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$f */
    public static class C74058f extends C73684f2 {
        public C74058f(C67391b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
            C74243t8 t8Var = (C74243t8) view.getTag();
            if (f4Var.mo100988a4()) {
                if (this.f216339d != null) {
                    Intent intent = new Intent();
                    intent.addFlags(67108864);
                    intent.putExtra("enter_from_scene", 3);
                    C88144b.m109791i(this.f216339d.mo91565f(), "shake", ".ui.ShakeReportUI", intent, (Bundle) null);
                }
            } else if (f4Var.mo100993e4() && (view instanceof MMTextView)) {
                C78222a a = C78222a.m94508a();
                CharSequence text = ((MMTextView) view).getText();
                C72963f4 f4Var2 = t8Var.f212238a;
                a.getClass();
                C78222a.m94509b(text, f4Var2, 1);
            }
        }
    }

    /* renamed from: a */
    public static boolean m87963a(View view) {
        if (!(view == null || view.getTag(C0966R.C0970id.b8s) == null)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() - ((Long) view.getTag(C0966R.C0970id.b8s)).longValue();
                return currentTimeMillis > 0 && currentTimeMillis < 500;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingItemAppMsgGroupSolitatire", "checkSolitaireFoldDoubleClick Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m87964b(Context context, C67391b bVar, String str, CharSequence charSequence, MMNeat7extView mMNeat7extView, C72963f4 f4Var, int i) {
        CharSequence charSequence2;
        C67391b bVar2 = bVar;
        String str2 = str;
        MMNeat7extView mMNeat7extView2 = mMNeat7extView;
        C72963f4 f4Var2 = f4Var;
        Class cls = C76979h.class;
        if (((C79393z) bVar2.f193278b.mo102812a(C79393z.class)).mo102454a5(f4Var2)) {
            C64428hr2 A2 = f4Var.mo108722A2();
            StringBuilder sb = new StringBuilder();
            LinkedList<C64452ir2> linkedList = A2.f183544d;
            if (linkedList != null) {
                Iterator<C64452ir2> it = linkedList.iterator();
                while (it.hasNext()) {
                    C64452ir2 next = it.next();
                    sb.append(Util.nullAs(Util.nullAs(next.f183729d, ""), ""));
                    sb.append(str2.substring(next.f183730e, next.f183731f));
                }
            }
            if (!Util.isNullOrNil(sb.toString())) {
                sb.append("\n");
            }
            if (!Util.isNullOrNil(sb.toString()) && A2.f183547g == 1) {
                sb.append("\n");
            }
            C76773b.f224572a.mo107028a(mMNeat7extView2, f4Var2, bVar.mo91583x(), bVar.mo91573n());
            Bundle f = C74059i7.m88001f(f4Var2, bVar2, bVar.mo91573n());
            C45331f0.C45333b.GROUP_CHATTING.mo70880b(f, C76528a.m92004a(f4Var.mo108768t()));
            Context context2 = context;
            SpannableString N70 = ((C76979h) C86312j.m106911c(cls)).N70(context2, sb, (int) mMNeat7extView.getTextSize(), i, f, C76979h.f224926w0);
            String string = context2.getString(C0966R.string.ffh);
            C74039a aVar = r0;
            SpannableString spannableString = new SpannableString(string);
            Bundle bundle = f;
            String str3 = "";
            C74039a aVar2 = new C74039a(i, (C53155r0) null, bVar, f4Var, mMNeat7extView, charSequence, A2);
            spannableString.setSpan(aVar, 0, string.length(), 33);
            StringBuilder sb4 = new StringBuilder();
            String str4 = "\n";
            sb4.append(str4);
            LinkedList<C64452ir2> linkedList2 = A2.f183545e;
            if (linkedList2 != null) {
                Iterator<C64452ir2> it4 = linkedList2.iterator();
                while (it4.hasNext()) {
                    C64452ir2 next2 = it4.next();
                    sb4.append(Util.nullAs(next2.f183729d, str3));
                    sb4.append(str2.substring(next2.f183730e, next2.f183731f));
                    sb4.append(str4);
                }
            }
            if (A2.f183546f != null) {
                sb4.append(str4);
                sb4.append(Util.nullAs(A2.f183546f.f183729d, str3));
                C64452ir2 ir22 = A2.f183546f;
                sb4.append(str2.substring(ir22.f183730e, ir22.f183731f));
            }
            charSequence2 = TextUtils.concat(new CharSequence[]{TextUtils.concat(new CharSequence[]{N70, spannableString}), ((C76979h) C86312j.m106911c(cls)).N70(context, sb4, (int) mMNeat7extView.getTextSize(), i, bundle, C76979h.f224926w0)});
        } else {
            charSequence2 = charSequence;
        }
        Boolean bool = null;
        C72963f4 f4Var3 = f4Var;
        if (f4Var3 != null) {
            C72963f4.C72966d dVar = f4Var3.f212670y1;
            if (dVar instanceof C74059i7.C74062c) {
                bool = ((C74059i7.C74062c) dVar).f217312b;
            }
        }
        mMNeat7extView.mo104280c(charSequence2, TextView.BufferType.SPANNABLE, bool);
    }
}
