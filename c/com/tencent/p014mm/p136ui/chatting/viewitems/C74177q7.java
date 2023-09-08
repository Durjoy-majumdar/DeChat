package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bp3.C104160f;
import bp3.C79758p;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.ExtVoiceTransformTextClickEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.NewVoiceTransTipsReportStruct;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.base.AnimImageView;
import com.tencent.p014mm.p136ui.chatting.AutoPlay;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.TextPreviewUI;
import com.tencent.p014mm.p136ui.chatting.component.VoiceComponent;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import fn3.C24479c;
import h81.C32735h;
import i21.C98591h;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kd0.C76546u;
import kd0.C76551y;
import kd0.C76552z;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C88990b;
import p492dn.C75415t;
import p680ru.C77569h;
import rb0.C48009v0;
import te3.C101801kd0;
import te3.C101835rd0;
import uj3.C78208e;
import vd3.C78404m;
import xi3.C78844a;
import zj3.C79345d;
import zj3.C79347d1;
import zj3.C79350e1;
import zj3.C79357g;
import zj3.C79362h1;
import zj3.C79368l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.q7 */
public class C74177q7 {

    /* renamed from: a */
    public static final MultiProcessMMKV f217736a = MultiProcessMMKV.getSingleMMKV("voice_continue_play_info");

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$a */
    public class C74178a implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$b */
    public class C74179b implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$c */
    public static final class C74180c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f217737v;

        /* renamed from: w */
        public View.OnClickListener f217738w;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$c$a */
        public class C74181a implements NeatTextView.C75245c {

            /* renamed from: d */
            public final /* synthetic */ String f217739d;

            /* renamed from: e */
            public final /* synthetic */ C67391b f217740e;

            /* renamed from: f */
            public final /* synthetic */ C72963f4 f217741f;

            public C74181a(C74180c cVar, String str, C67391b bVar, C72963f4 f4Var) {
                this.f217739d = str;
                this.f217740e = bVar;
                this.f217741f = f4Var;
            }

            /* renamed from: b */
            public boolean mo103047b(View view, MotionEvent motionEvent) {
                C74190e.m88412a(MMApplicationContext.getContext(), this.f217739d, this.f217740e);
                C72963f4 f4Var = this.f217741f;
                MultiProcessMMKV multiProcessMMKV = C74177q7.f217736a;
                ExtVoiceTransformTextClickEvent extVoiceTransformTextClickEvent = new ExtVoiceTransformTextClickEvent();
                ExtVoiceTransformTextClickEvent.C67688a aVar = extVoiceTransformTextClickEvent.f193576d;
                aVar.f193578b = 3;
                aVar.f193579c = 1;
                aVar.f193577a = f4Var.mo108765s2();
                extVoiceTransformTextClickEvent.publish();
                return true;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$c$b */
        public class C74182b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C74190e f217742d;

            /* renamed from: e */
            public final /* synthetic */ C67391b f217743e;

            /* renamed from: f */
            public final /* synthetic */ C72963f4 f217744f;

            /* renamed from: g */
            public final /* synthetic */ C79347d1 f217745g;

            public C74182b(C74180c cVar, C74190e eVar, C67391b bVar, C72963f4 f4Var, C79347d1 d1Var) {
                this.f217742d = eVar;
                this.f217743e = bVar;
                this.f217744f = f4Var;
                this.f217745g = d1Var;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.ChattingItemVoice", "voice fast trans text click");
                C74177q7.m88381c(this.f217742d.getAdapterPosition(), this.f217743e, this.f217744f, this.f217745g, true);
                C72963f4 f4Var = this.f217744f;
                if (f4Var == null) {
                    Log.m105924i("MicroMsg.ChattingItemVoice", "msgInfo is null???");
                } else {
                    C74180c.m88388p0(2, f4Var.getMsgId());
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$c$c */
        public class C74183c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C67391b f217746d;

            /* renamed from: e */
            public final /* synthetic */ C72963f4 f217747e;

            public C74183c(C74180c cVar, C67391b bVar, C72963f4 f4Var) {
                this.f217746d = bVar;
                this.f217747e = f4Var;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C74177q7.m88380b(this.f217746d, this.f217747e);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$c$d */
        public class C74184d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C67391b f217748d;

            public C74184d(C74180c cVar, C67391b bVar) {
                this.f217748d = bVar;
            }

            public void run() {
                this.f217748d.mo91540A();
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$c$e */
        public class C74185e implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C67391b f217749d;

            public C74185e(C67391b bVar) {
                this.f217749d = bVar;
            }

            public void run() {
                this.f217749d.mo91540A();
            }
        }

        /* renamed from: o0 */
        public static boolean m88387o0(View view, C67391b bVar, C72963f4 f4Var, C74243t8 t8Var, MsgQuoteItem msgQuoteItem) {
            Class cls = C79347d1.class;
            Class cls2 = C79362h1.class;
            if (f4Var.getStatus() == 5) {
                Log.m105925i("MicroMsg.ChattingItemVoice", "onItemClick msg(%s) fail", Long.valueOf(f4Var.getMsgId()));
                return true;
            }
            if (f4Var.mo101013q3()) {
                ((C79362h1) bVar.f193278b.mo102812a(cls2)).mo102320D1(f4Var.getMsgId(), view);
                if (((C79362h1) bVar.f193278b.mo102812a(cls2)).mo102326W0(f4Var.getMsgId())) {
                    Log.m105924i("MicroMsg.ChattingItemVoice", "onItemClick: voice msg show download animation");
                    return true;
                }
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(f4Var.getMsgId());
                if (b002.mo101013q3()) {
                    ((C79362h1) bVar.f193278b.mo102812a(cls2)).mo102323I3(b002.getMsgId());
                    C76546u.xx0().mo107480e();
                    ((C119157j) C119157j.f356862d).mo183895z(new C74185e(bVar));
                    Log.m105925i("MicroMsg.ChattingItemVoice", "onItemClick voice msg(%s) no finish download!", Long.valueOf(f4Var.getMsgId()));
                    return true;
                }
            }
            if (t8Var == null) {
                Log.m105925i("MicroMsg.ChattingItemVoice", "onItemClick tag(%s) is null", Long.valueOf(f4Var.getMsgId()));
                return true;
            }
            ((C79362h1) bVar.f193278b.mo102812a(cls2)).mo102321F(f4Var.getMsgId());
            ((C79362h1) bVar.f193278b.mo102812a(cls2)).mo102324M1();
            ((C77569h) C86312j.m106911c(C77569h.class)).mo35247zz(t8Var.f212238a);
            C74177q7.m88383e(bVar, t8Var, msgQuoteItem);
            ((C79347d1) bVar.f193278b.mo102812a(cls)).mo102300r3(2);
            ((C79350e1) bVar.f193278b.mo102812a(C79350e1.class)).mo102304Q3();
            C74023i.m87882c0(bVar, f4Var);
            if (((C79347d1) bVar.f193278b.mo102812a(cls)).mo102290a2(f4Var)) {
                m88388p0(4, f4Var.getMsgId());
            }
            return true;
        }

        /* renamed from: p0 */
        public static void m88388p0(int i, long j) {
            Object obj = VoiceComponent.f215712F;
            NewVoiceTransTipsReportStruct newVoiceTransTipsReportStruct = new NewVoiceTransTipsReportStruct();
            newVoiceTransTipsReportStruct.f194300d = i;
            newVoiceTransTipsReportStruct.f194301e = newVoiceTransTipsReportStruct.mo86045b("VoiceID", j + "", true);
            Log.m105919d("MicroMsg.ChattingItemVoice", "%s", newVoiceTransTipsReportStruct.mo1006q());
            newVoiceTransTipsReportStruct.mo86054n();
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6916s5);
            C74190e eVar = new C74190e();
            eVar.mo103224b(n4Var, true, false);
            n4Var.setTag(eVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            Class cls = C79362h1.class;
            C79347d1 d1Var = (C79347d1) bVar.f193278b.mo102812a(C79347d1.class);
            int itemId = menuItem.getItemId();
            if (itemId == 100) {
                ((C79362h1) bVar.f193278b.mo102812a(cls)).mo102335g4(f4Var);
                ((C79362h1) bVar.f193278b.mo102812a(cls)).mo102327W2();
            } else if (itemId != 103) {
                switch (itemId) {
                    case 119:
                        ((C79362h1) bVar.f193278b.mo102812a(cls)).mo102339v2(true);
                        return true;
                    case 120:
                        ((C79362h1) bVar.f193278b.mo102812a(cls)).mo102339v2(false);
                        return true;
                    case 121:
                        if (!WeChatBrands.Business.Entries.SessionSpeech2TextSnd.checkAvailable(bVar.mo91565f())) {
                            return true;
                        }
                        if (f4Var == null) {
                            Log.m105924i("MicroMsg.ChattingItemVoice", "msgInfo is null???");
                        } else {
                            m88388p0(3, f4Var.getMsgId());
                        }
                        C74177q7.m88381c(menuItem.getGroupId(), bVar, f4Var, d1Var, true);
                        return true;
                    default:
                        switch (itemId) {
                            case 141:
                                String M4 = d1Var.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2());
                                if (!Util.isNullOrNil(M4)) {
                                    ClipboardHelper.setText(M4);
                                }
                                C74177q7.m88382d(8, f4Var);
                                break;
                            case TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /*142*/:
                                Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
                                String M42 = d1Var.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2());
                                if (f4Var.mo100988a4()) {
                                    intent.putExtra("Retr_Msg_content", M42);
                                    intent.putExtra("Retr_Msg_Type", 6);
                                } else {
                                    intent.putExtra("Retr_Msg_content", M42);
                                    intent.putExtra("Retr_Msg_Type", 4);
                                }
                                C9556a aVar = new C9556a();
                                aVar.mo10233c(intent);
                                C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                                C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                C74177q7.m88382d(9, f4Var);
                                break;
                            case TPOptionalID.f349338xc9bdf6cd /*143*/:
                                String M43 = d1Var.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2());
                                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                                C96787m0.m124258l(doFavoriteEvent, M43, 1);
                                DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                                aVar2.f264685j = bVar.f193286j;
                                aVar2.f264688m = 43;
                                C101801kd0 kd02 = aVar2.f264676a;
                                if (kd02 != null) {
                                    C101835rd0 rd02 = kd02.f298616d;
                                    if (rd02 != null) {
                                        rd02.mo141275k(f4Var.mo108768t());
                                        rd02.mo141279o(C75592q0.m90789s());
                                        doFavoriteEvent.publish();
                                    }
                                } else {
                                    Log.m105920e("MicroMsg.ChattingItemVoice", "alvinluo transform text fav failed");
                                }
                                C74177q7.m88382d(10, f4Var);
                                break;
                        }
                }
            } else {
                ((C79362h1) bVar.f193278b.mo102812a(cls)).mo102334g(f4Var);
            }
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            long j;
            int i;
            C76874e0 e0Var2 = e0Var;
            Class cls = C79347d1.class;
            if (C97625j3.m125812b().mo105883I()) {
                ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
                int b = cVar.mo103252b();
                int i2 = cVar.f216964T;
                boolean z = false;
                if (i2 == 1) {
                    String content = f4Var.getContent();
                    try {
                        if (content.endsWith("\n")) {
                            content = content.substring(0, content.length() - 1);
                        }
                        String[] split = content.split(XVFSFile.PATH_SEPARATOR);
                        int i3 = (split.length != 4 || !C72996z1.m85811N4(split[0])) ? 0 : 1;
                        if (split.length > i3) {
                            String str = split[i3];
                        }
                        int i4 = i3 + 1;
                        j = split.length > i4 ? Util.getLong(split[i4], 0) : 0;
                        int i5 = i3 + 2;
                        if (split.length > i5) {
                            split[i5].equals("1");
                        }
                    } catch (Exception unused) {
                        Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
                        j = 0;
                    }
                    if (!((j == 0 && f4Var.mo108769t2() == 0) || (f4Var.getStatus() == 1 && f4Var.mo108769t2() == 1))) {
                        Boolean bool = (Boolean) C97625j3.m125812b().mo105906u().mo119684e(26, (Object) null);
                        if (bool == null) {
                            bool = Boolean.FALSE;
                        }
                        if (bool.booleanValue()) {
                            e0Var.mo107136c(b, 120, 0, view.getContext().getString(C0966R.string.b57), C0966R.raw.icons_filled_volume_up);
                        } else {
                            e0Var.mo107136c(b, 119, 0, view.getContext().getString(C0966R.string.b56), C0966R.raw.icons_filled_ear);
                        }
                        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(f4Var.mo108768t());
                        boolean z2 = !C72996z1.m85793A5(f4Var.mo108768t()) && !C45628s0.m50812z(f4Var.mo108768t()) && z1Var != null && !z1Var.mo62916m3();
                        C88144b.m109788f("favorite");
                        e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                        if (z2) {
                            if ((C48009v0.Fx0().mo72759TO(2) > 0) && !this.f217737v.mo91584y()) {
                                e0Var2.add(b, 114, 0, (CharSequence) view.getContext().getString(C0966R.string.b9w));
                            }
                        }
                        C79347d1 d1Var = (C79347d1) this.f217737v.f193278b.mo102812a(cls);
                        boolean a = C74177q7.m88379a(f4Var, this.f217737v);
                        int i6 = C0966R.string.b_n;
                        if (a) {
                            if (!Util.isNullOrNil(d1Var.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2()))) {
                                i6 = -1;
                            }
                            i = i6;
                        } else {
                            i = d1Var.mo102282C4(f4Var.getMsgId()) ? -1 : C0966R.string.b_n;
                        }
                        if (C45628s0.m50738C(f4Var.mo108768t()) && LocaleUtil.isChineseAppLang() && i != -1) {
                            e0Var.mo107136c(b, 121, 0, view.getContext().getString(i), C0966R.raw.icons_filled_transfer_text);
                            z = true;
                        }
                        if (!this.f217737v.mo91584y()) {
                            e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_3), C0966R.raw.icons_filled_delete);
                        }
                        if (!z && LocaleUtil.isChineseAppLang() && i != -1) {
                            e0Var.mo107136c(b, 121, 0, view.getContext().getString(i), C0966R.raw.icons_filled_transfer_text);
                        }
                    }
                    return true;
                }
                C72963f4 f4Var2 = f4Var;
                if (i2 == 2) {
                    C79347d1 d1Var2 = (C79347d1) this.f217737v.f193278b.mo102812a(cls);
                    if (d1Var2.mo102299h5(f4Var.getMsgId()) == ChattingItemTranslate.C73918e.Transforming) {
                        e0Var2.add(b, 121, 0, (int) C0966R.string.b_j);
                    } else {
                        if (!Util.isNullOrNil(d1Var2.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2()))) {
                            e0Var.mo107136c(b, 141, 0, view.getContext().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                            int i7 = b;
                            e0Var.mo107136c(i7, TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                            C88144b.m109788f("favorite");
                            e0Var.mo107136c(i7, TPOptionalID.f349338xc9bdf6cd, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                        }
                        e0Var.mo107136c(b, 121, 0, view.getContext().getString(C0966R.string.b_l), C0966R.raw.icons_filled_eyes_off);
                    }
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            C67391b bVar2 = bVar;
            Class cls = C75700k0.class;
            if (f4Var.getStatus() == 5) {
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(f4Var.getMsgId());
                b002.mo108743W2(b002.f230723F | 8192);
                String str = null;
                String content = b002.getContent();
                long j = 0;
                try {
                    if (content.endsWith("\n")) {
                        content = content.substring(0, content.length() - 1);
                    }
                    String[] split = content.split(XVFSFile.PATH_SEPARATOR);
                    int i = (split.length != 4 || !C72996z1.m85811N4(split[0])) ? 0 : 1;
                    if (split.length > i) {
                        str = split[i];
                    }
                    int i2 = i + 1;
                    long j2 = split.length > i2 ? Util.getLong(split[i2], 0) : 0;
                    int i3 = i + 2;
                    if (split.length > i3) {
                        split[i3].equals("1");
                    }
                    j = j2;
                } catch (Exception unused) {
                    if (0 == 0) {
                        str = "";
                    }
                    Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
                }
                b002.mo108732L2(str + XVFSFile.PATH_SEPARATOR + j + XVFSFile.PATH_SEPARATOR + 0 + XVFSFile.PATH_SEPARATOR + "\n");
                b002.mo100991d(3);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(f4Var.getMsgId(), b002);
                C76551y Lo = C76546u.yx0().mo106781Lo(f4Var.mo108774y2());
                if (Lo.f224057h == 0) {
                    Lo.f224058i = 5;
                } else {
                    Lo.f224058i = 6;
                }
                Lo.f224060k = System.currentTimeMillis() / 1000;
                Lo.f224071v = 1;
                Lo.f224050a = 1048896;
                C76552z.m92088z(Lo);
                ((C79362h1) bVar2.f193278b.mo102812a(C79362h1.class)).mo102323I3(f4Var.getMsgId());
                C76546u.xx0().mo107480e();
                ((C119157j) C119157j.f356862d).mo183895z(new C74184d(this, bVar2));
                Log.m105925i("MicroMsg.ChattingItemVoice", "onStateBtnClick voice msg(%s) re-download!", Long.valueOf(f4Var.getMsgId()));
                return;
            }
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            m88387o0(view, bVar, f4Var, (C74243t8) view.getTag(), (MsgQuoteItem) null);
            return true;
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            return C72963f4.C72966d.f212702a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0191  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x01b2  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x01cd  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x022b  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0233  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0267 A[Catch:{ Exception -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0283 A[Catch:{ Exception -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0285 A[Catch:{ Exception -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0289 A[Catch:{ Exception -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0290 A[Catch:{ Exception -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0297 A[Catch:{ Exception -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x029c A[Catch:{ Exception -> 0x02a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x02b0  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x02b9  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x033e  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x034d  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r25, ck3.C67391b r26, com.tencent.p014mm.storage.C72963f4 r27, java.lang.String r28) {
            /*
                r24 = this;
                r9 = r24
                r10 = r26
                r11 = r27
                java.lang.Class<zj3.h1> r12 = zj3.C79362h1.class
                r9.f217737v = r10
                r13 = r25
                com.tencent.mm.ui.chatting.viewitems.q7$e r13 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.C74190e) r13
                com.tencent.mm.ui.base.AnimImageView r0 = r13.f217760e
                r14 = 1
                r0.setFromVoice(r14)
                com.tencent.mm.ui.base.AnimImageView r0 = r13.f217760e
                boolean r1 = r26.mo91583x()
                r0.setFromGroup(r1)
                java.lang.Class<zj3.l> r0 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r1 = r10.f193278b
                xi.d r0 = r1.mo102812a(r0)
                r15 = r0
                zj3.l r15 = (zj3.C79368l) r15
                r5 = 1
                long r0 = r27.getMsgId()
                boolean r6 = r9.mo103080N(r15, r0)
                com.tencent.mm.ui.chatting.viewitems.i$e r7 = r9.mo103098p(r10)
                r0 = r24
                r1 = r13
                r2 = r27
                r3 = r13
                r4 = r26
                r8 = r24
                com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.C74190e.m88414d(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$e r0 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73918e.NoTransform
                java.lang.Class<zj3.d1> r1 = zj3.C79347d1.class
                com.tencent.mm.ui.chatting.manager.a r2 = r10.f193278b
                xi.d r1 = r2.mo102812a(r1)
                r8 = r1
                zj3.d1 r8 = (zj3.C79347d1) r8
                boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.m88379a(r11, r10)
                r7 = 0
                if (r1 == 0) goto L_0x006e
                long r1 = r27.getMsgId()
                java.lang.String r3 = r27.mo108765s2()
                java.lang.String r1 = r8.mo102286M4(r1, r3)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 != 0) goto L_0x006b
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$e r2 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73918e.Transformed
                goto L_0x006c
            L_0x006b:
                r2 = r0
            L_0x006c:
                r5 = r1
                goto L_0x008f
            L_0x006e:
                long r1 = r27.getMsgId()
                boolean r1 = r8.mo102282C4(r1)
                if (r1 == 0) goto L_0x008d
                long r1 = r27.getMsgId()
                java.lang.String r3 = r27.mo108765s2()
                java.lang.String r1 = r8.mo102286M4(r1, r3)
                long r2 = r27.getMsgId()
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$e r2 = r8.mo102299h5(r2)
                goto L_0x006c
            L_0x008d:
                r2 = r0
                r5 = r7
            L_0x008f:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                r4 = 8
                if (r1 == 0) goto L_0x00a8
                if (r2 == r0) goto L_0x009a
                goto L_0x00a8
            L_0x009a:
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r13.f217762g
                if (r0 == 0) goto L_0x00a1
                r0.setVisibility(r4)
            L_0x00a1:
                r15 = r7
                r28 = r12
                r6 = 0
                r12 = 2
                goto L_0x01c7
            L_0x00a8:
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r13.f217762g
                if (r0 != 0) goto L_0x00ca
                android.view.ViewStub r0 = r13.f217761f
                android.view.View r0 = r0.inflate()
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = (com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate) r0
                r13.f217762g = r0
                int r1 = r13.f217757b
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r4 = 5
                int r3 = kg3.C76577a.m92151b(r3, r4)
                int r1 = r1 - r3
                r0.setMinimumWidth(r1)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r13.f217762g
                r0.mo102992b()
            L_0x00ca:
                java.lang.Class<ny.h> r0 = p629ny.C76979h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                r16 = r0
                ny.h r16 = (p629ny.C76979h) r16
                android.widget.TextView r0 = r13.f217766k
                android.content.Context r17 = r0.getContext()
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r13.f217762g
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.getContentView()
                float r0 = r0.getTextSize()
                int r0 = (int) r0
                r20 = 1
                r21 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = ""
                r1.append(r3)
                long r3 = r27.mo108774y2()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = eb0.C86493v0.m107223a(r1)
                eb0.v0 r3 = eb0.C86493v0.m107224d()
                eb0.v0$c r3 = r3.mo120947c(r1, r14)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "msg_"
                r4.append(r6)
                r23 = r15
                long r14 = r27.mo108774y2()
                r4.append(r14)
                java.lang.String r4 = r4.toString()
                java.lang.String r6 = "prePublishId"
                r3.mo120962i(r6, r4)
                ck3.b r4 = r9.f217737v
                java.lang.String r4 = r9.mo103068y(r4, r11)
                java.lang.String r6 = "preUsername"
                r3.mo120962i(r6, r4)
                ck3.b r4 = r9.f217737v
                java.lang.String r4 = r9.mo103102x(r4, r11)
                java.lang.String r6 = "preChatName"
                r3.mo120962i(r6, r4)
                r18 = r5
                r19 = r0
                r22 = r1
                android.text.SpannableString r14 = r16.mo107078or(r17, r18, r19, r20, r21, r22)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r13.f217762g
                long r3 = r27.getMsgId()
                boolean r3 = r8.mo102283E2(r3)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$d r4 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73917d.Voice
                long r15 = r27.getMsgId()
                r1 = r14
                r6 = 0
                r25 = r5
                r28 = r12
                r12 = 2
                r5 = r15
                r15 = r7
                r7 = r26
                r0.mo102994d(r1, r2, r3, r4, r5, r7)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r14)
                if (r0 != 0) goto L_0x017b
                long r0 = r27.getMsgId()
                boolean r0 = r8.mo102283E2(r0)
                if (r0 == 0) goto L_0x017b
                long r0 = r27.getMsgId()
                r8.mo102285J1(r0)
            L_0x017b:
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c r0 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c
                boolean r1 = r26.mo91583x()
                r0.<init>(r11, r1, r13, r15)
                r0.f216964T = r12
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r1 = r13.f217762g
                r1.setTag(r0)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r13.f217762g
                android.view.View$OnClickListener r1 = r9.f217738w
                if (r1 != 0) goto L_0x0198
                com.tencent.mm.ui.chatting.viewitems.s7 r1 = new com.tencent.mm.ui.chatting.viewitems.s7
                r1.<init>(r9)
                r9.f217738w = r1
            L_0x0198:
                android.view.View$OnClickListener r1 = r9.f217738w
                r0.setOnClickListener(r1)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r13.f217762g
                com.tencent.mm.ui.chatting.viewitems.i$e r1 = r9.mo103098p(r10)
                r0.setOnLongClickListener(r1)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r13.f217762g
                r6 = 0
                r0.setVisibility(r6)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r25)
                if (r0 != 0) goto L_0x01c7
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r13.f217762g
                com.tencent.mm.ui.chatting.h2 r1 = r23.mo108189Z4()
                r0.setOnTouchListener(r1)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r13.f217762g
                com.tencent.mm.ui.chatting.viewitems.q7$c$a r1 = new com.tencent.mm.ui.chatting.viewitems.q7$c$a
                r7 = r25
                r1.<init>(r9, r7, r10, r11)
                r0.setOnDoubleClickListener(r1)
            L_0x01c7:
                boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r0 != 0) goto L_0x01eb
                java.lang.Class<zj3.d> r0 = zj3.C79345d.class
                com.tencent.mm.ui.chatting.manager.a r1 = r10.f193278b
                xi.d r0 = r1.mo102812a(r0)
                zj3.d r0 = (zj3.C79345d) r0
                boolean r0 = r0.mo70144G5()
                if (r0 == 0) goto L_0x01eb
                android.widget.TextView r0 = r13.f217775t
                r1 = 2131235445(0x7f081275, float:1.8087084E38)
                r0.setBackgroundResource(r1)
                android.widget.TextView r0 = r13.f217777v
                r0.setBackgroundResource(r1)
                goto L_0x01f8
            L_0x01eb:
                android.widget.TextView r0 = r13.f217775t
                r1 = 2131235442(0x7f081272, float:1.8087078E38)
                r0.setBackgroundResource(r1)
                android.widget.TextView r0 = r13.f217777v
                r0.setBackgroundResource(r1)
            L_0x01f8:
                android.widget.TextView r0 = r13.f217775t
                android.app.Activity r1 = r26.mo91565f()
                r2 = 2131165307(0x7f07007b, float:1.7944827E38)
                int r1 = kg3.C76577a.m92155f(r1, r2)
                float r1 = (float) r1
                r0.setTextSize(r6, r1)
                android.widget.TextView r0 = r13.f217777v
                android.app.Activity r1 = r26.mo91565f()
                int r1 = kg3.C76577a.m92155f(r1, r2)
                float r1 = (float) r1
                r0.setTextSize(r6, r1)
                com.tencent.mm.ui.chatting.manager.a r0 = r10.f193278b
                r7 = r28
                xi.d r0 = r0.mo102812a(r7)
                zj3.h1 r0 = (zj3.C79362h1) r0
                long r1 = r27.getMsgId()
                boolean r0 = r0.mo102338t4(r1)
                if (r0 != 0) goto L_0x0233
                android.widget.RelativeLayout r0 = r13.f217774s
                r14 = 8
                r0.setVisibility(r14)
                goto L_0x023a
            L_0x0233:
                r14 = 8
                android.widget.RelativeLayout r0 = r13.f217774s
                r0.setVisibility(r6)
            L_0x023a:
                android.widget.RelativeLayout r5 = r13.f217774s
                com.tencent.mm.ui.chatting.viewitems.q7$c$b r4 = new com.tencent.mm.ui.chatting.viewitems.q7$c$b
                r0 = r4
                r1 = r24
                r2 = r13
                r3 = r26
                r15 = r4
                r4 = r27
                r14 = r5
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r14.setOnClickListener(r15)
                android.widget.RelativeLayout r0 = r13.f217776u
                com.tencent.mm.ui.chatting.viewitems.q7$c$c r1 = new com.tencent.mm.ui.chatting.viewitems.q7$c$c
                r1.<init>(r9, r10, r11)
                r0.setOnClickListener(r1)
                java.lang.String r0 = r27.getContent()
                r1 = 0
                java.lang.String r3 = "\n"
                boolean r3 = r0.endsWith(r3)     // Catch:{ Exception -> 0x02a4 }
                if (r3 == 0) goto L_0x0271
                int r3 = r0.length()     // Catch:{ Exception -> 0x02a4 }
                r4 = 1
                int r3 = r3 - r4
                java.lang.String r0 = r0.substring(r6, r3)     // Catch:{ Exception -> 0x02a4 }
            L_0x0271:
                java.lang.String r3 = ":"
                java.lang.String[] r0 = r0.split(r3)     // Catch:{ Exception -> 0x02a4 }
                int r3 = r0.length     // Catch:{ Exception -> 0x02a4 }
                r4 = 4
                if (r3 != r4) goto L_0x0285
                r3 = r0[r6]     // Catch:{ Exception -> 0x02a4 }
                boolean r3 = com.tencent.p014mm.storage.C72996z1.m85811N4(r3)     // Catch:{ Exception -> 0x02a4 }
                if (r3 == 0) goto L_0x0285
                r3 = 1
                goto L_0x0286
            L_0x0285:
                r3 = 0
            L_0x0286:
                int r4 = r0.length     // Catch:{ Exception -> 0x02a4 }
                if (r4 <= r3) goto L_0x028b
                r4 = r0[r3]     // Catch:{ Exception -> 0x02a4 }
            L_0x028b:
                int r4 = r0.length     // Catch:{ Exception -> 0x02a4 }
                int r5 = r3 + 1
                if (r4 <= r5) goto L_0x0297
                r4 = r0[r5]     // Catch:{ Exception -> 0x02a4 }
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r1)     // Catch:{ Exception -> 0x02a4 }
                goto L_0x0298
            L_0x0297:
                r4 = r1
            L_0x0298:
                int r8 = r0.length     // Catch:{ Exception -> 0x02a4 }
                int r3 = r3 + r12
                if (r8 <= r3) goto L_0x02ac
                r0 = r0[r3]     // Catch:{ Exception -> 0x02a4 }
                java.lang.String r3 = "1"
                r0.equals(r3)     // Catch:{ Exception -> 0x02a4 }
                goto L_0x02ac
            L_0x02a4:
                java.lang.String r0 = "MicroMsg.VoiceContent"
                java.lang.String r3 = "VoiceContent parse failed."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
                r4 = r1
            L_0x02ac:
                int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r0 != 0) goto L_0x02b9
                android.widget.ImageView r0 = r13.stateIV
                r1 = 8
                r0.setVisibility(r1)
                goto L_0x0333
            L_0x02b9:
                com.tencent.mm.ui.chatting.manager.a r0 = r10.f193278b
                xi.d r0 = r0.mo102812a(r7)
                zj3.h1 r0 = (zj3.C79362h1) r0
                com.tencent.mm.ui.chatting.AutoPlay r0 = r0.mo102325W()
                if (r0 == 0) goto L_0x02d1
                long r0 = r0.f215195h
                long r2 = r27.getMsgId()
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 == 0) goto L_0x02d7
            L_0x02d1:
                boolean r0 = kd0.C76552z.m92079q(r27)
                if (r0 == 0) goto L_0x02d9
            L_0x02d7:
                r3 = 1
                goto L_0x02da
            L_0x02d9:
                r3 = 0
            L_0x02da:
                android.widget.ImageView r0 = r13.stateIV
                if (r3 == 0) goto L_0x02e1
                r1 = 8
                goto L_0x02e2
            L_0x02e1:
                r1 = 0
            L_0x02e2:
                r0.setVisibility(r1)
                java.lang.Class<dn.t> r0 = p492dn.C75415t.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                dn.t r0 = (p492dn.C75415t) r0
                float r0 = r0.F30(r4)
                int r0 = (int) r0
                if (r3 != 0) goto L_0x0312
                android.widget.TextView r1 = r13.f217759d
                android.app.Activity r2 = r26.mo91565f()
                r3 = 2131838466(0x7f114602, float:1.9310156E38)
                java.lang.String r2 = r2.getString(r3)
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                java.lang.String r0 = java.lang.String.format(r2, r3)
                r1.setContentDescription(r0)
                goto L_0x0333
            L_0x0312:
                java.lang.Class<zj3.g> r1 = zj3.C79357g.class
                com.tencent.mm.ui.chatting.manager.a r2 = r10.f193278b
                xi.d r1 = r2.mo102812a(r1)
                zj3.g r1 = (zj3.C79357g) r1
                java.lang.String r2 = r26.mo91577r()
                java.lang.CharSequence r1 = r1.getDisplayName(r2)
                xi3.a r2 = xi3.C78844a.C15689b.f42385a
                android.widget.TextView r3 = r13.f217759d
                if (r1 != 0) goto L_0x032c
                r7 = 0
                goto L_0x0330
            L_0x032c:
                java.lang.String r7 = r1.toString()
            L_0x0330:
                r2.mo108836a(r3, r0, r7)
            L_0x0333:
                java.lang.String r0 = r11.f230722E
                if (r0 == 0) goto L_0x034d
                int r1 = r0.length()
                if (r1 != 0) goto L_0x033e
                goto L_0x034d
            L_0x033e:
                android.widget.TextView r1 = r13.f217769n
                r1.setVisibility(r6)
                android.widget.TextView r1 = r13.f217769n
                com.tencent.mm.ui.chatting.viewitems.t8 r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8.m88488a(r0)
                r9.mo103073G(r10, r1, r0)
                goto L_0x0354
            L_0x034d:
                android.widget.TextView r0 = r13.f217769n
                r1 = 8
                r0.setVisibility(r1)
            L_0x0354:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.C74180c.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 34;
        }

        /* renamed from: n0 */
        public boolean mo103045n0(C67391b bVar) {
            return bVar.mo91583x();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$d */
    public static final class C74186d extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f217750v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$d$a */
        public class C74187a implements NeatTextView.C75245c {

            /* renamed from: d */
            public final /* synthetic */ String f217751d;

            /* renamed from: e */
            public final /* synthetic */ C67391b f217752e;

            /* renamed from: f */
            public final /* synthetic */ C72963f4 f217753f;

            public C74187a(C74186d dVar, String str, C67391b bVar, C72963f4 f4Var) {
                this.f217751d = str;
                this.f217752e = bVar;
                this.f217753f = f4Var;
            }

            /* renamed from: b */
            public boolean mo103047b(View view, MotionEvent motionEvent) {
                C74190e.m88412a(MMApplicationContext.getContext(), this.f217751d, this.f217752e);
                C72963f4 f4Var = this.f217753f;
                MultiProcessMMKV multiProcessMMKV = C74177q7.f217736a;
                ExtVoiceTransformTextClickEvent extVoiceTransformTextClickEvent = new ExtVoiceTransformTextClickEvent();
                ExtVoiceTransformTextClickEvent.C67688a aVar = extVoiceTransformTextClickEvent.f193576d;
                aVar.f193578b = 3;
                aVar.f193579c = 1;
                aVar.f193577a = f4Var.mo108765s2();
                extVoiceTransformTextClickEvent.publish();
                return true;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$d$b */
        public class C74188b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C67391b f217754d;

            /* renamed from: e */
            public final /* synthetic */ C72963f4 f217755e;

            public C74188b(C74186d dVar, C67391b bVar, C72963f4 f4Var) {
                this.f217754d = bVar;
                this.f217755e = f4Var;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C74177q7.m88380b(this.f217754d, this.f217755e);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$d$c */
        public class C74189c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C67391b f217756d;

            public C74189c(C67391b bVar) {
                this.f217756d = bVar;
            }

            public void run() {
                this.f217756d.mo91540A();
            }
        }

        /* renamed from: o0 */
        public static boolean m88400o0(View view, C67391b bVar, C72963f4 f4Var, C74243t8 t8Var, MsgQuoteItem msgQuoteItem) {
            Class cls = C79362h1.class;
            if (f4Var.getStatus() == 5) {
                Log.m105925i("MicroMsg.ChattingItemVoice", "onItemClick msg(%s) fail", Long.valueOf(f4Var.getMsgId()));
                return true;
            }
            if (f4Var.mo101013q3()) {
                ((C79362h1) bVar.f193278b.mo102812a(cls)).mo102320D1(f4Var.getMsgId(), view);
                if (((C79362h1) bVar.f193278b.mo102812a(cls)).mo102326W0(f4Var.getMsgId())) {
                    Log.m105924i("MicroMsg.ChattingItemVoice", "onCreateContextMenu: voice msg show download animation");
                    return true;
                }
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(f4Var.getMsgId());
                if (b002.mo101013q3()) {
                    ((C79362h1) bVar.f193278b.mo102812a(cls)).mo102323I3(b002.getMsgId());
                    C76546u.xx0().mo107480e();
                    ((C119157j) C119157j.f356862d).mo183895z(new C74189c(bVar));
                    Log.m105925i("MicroMsg.ChattingItemVoice", "onItemClick voice msg(%s) no finish download!", Long.valueOf(f4Var.getMsgId()));
                    return true;
                }
            }
            if (t8Var == null) {
                Log.m105925i("MicroMsg.ChattingItemVoice", "onItemClick tag(%s) is null", Long.valueOf(f4Var.getMsgId()));
                return true;
            }
            ((C79362h1) bVar.f193278b.mo102812a(cls)).mo102324M1();
            ((C77569h) C86312j.m106911c(C77569h.class)).mo35247zz(t8Var.f212238a);
            C74177q7.m88383e(bVar, t8Var, (MsgQuoteItem) null);
            ((C79347d1) bVar.f193278b.mo102812a(C79347d1.class)).mo102300r3(2);
            ((C79350e1) bVar.f193278b.mo102812a(C79350e1.class)).mo102304Q3();
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            return true;
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6965tk);
            C74190e eVar = new C74190e();
            eVar.mo103224b(n4Var, false, false);
            n4Var.setTag(eVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            Class cls = C79362h1.class;
            C79347d1 d1Var = (C79347d1) bVar2.f193278b.mo102812a(C79347d1.class);
            int itemId = menuItem.getItemId();
            if (itemId != 103) {
                switch (itemId) {
                    case 119:
                        ((C79362h1) bVar2.f193278b.mo102812a(cls)).mo102339v2(true);
                        return true;
                    case 120:
                        ((C79362h1) bVar2.f193278b.mo102812a(cls)).mo102339v2(false);
                        return true;
                    case 121:
                        if (!WeChatBrands.Business.Entries.SessionSpeech2TextSnd.checkAvailable(bVar.mo91565f())) {
                            return true;
                        }
                        C74177q7.m88381c(menuItem.getGroupId(), bVar, f4Var2, d1Var, false);
                        return true;
                    default:
                        switch (itemId) {
                            case 141:
                                String M4 = d1Var.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2());
                                if (!Util.isNullOrNil(M4)) {
                                    ClipboardHelper.setText(M4);
                                }
                                C74177q7.m88382d(8, f4Var2);
                                return true;
                            case TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /*142*/:
                                Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
                                String M42 = d1Var.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2());
                                if (f4Var.mo100988a4()) {
                                    intent.putExtra("Retr_Msg_content", M42);
                                    intent.putExtra("Retr_Msg_Type", 6);
                                } else {
                                    intent.putExtra("Retr_Msg_content", M42);
                                    intent.putExtra("Retr_Msg_Type", 4);
                                }
                                C9556a aVar = new C9556a();
                                aVar.mo10233c(intent);
                                C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                                C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                C74177q7.m88382d(9, f4Var2);
                                return true;
                            case TPOptionalID.f349338xc9bdf6cd /*143*/:
                                String M43 = d1Var.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2());
                                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                                C96787m0.m124258l(doFavoriteEvent, M43, 1);
                                DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                                aVar2.f264685j = bVar2.f193286j;
                                aVar2.f264688m = 43;
                                C101801kd0 kd02 = aVar2.f264676a;
                                if (kd02 != null) {
                                    C101835rd0 rd02 = kd02.f298616d;
                                    if (rd02 != null) {
                                        rd02.mo141275k(C75592q0.m90789s());
                                        rd02.mo141279o(f4Var.mo108768t());
                                        doFavoriteEvent.publish();
                                    }
                                } else {
                                    Log.m105920e("MicroMsg.ChattingItemVoice", "alvinluo transform text fav failed");
                                }
                                C74177q7.m88382d(10, f4Var2);
                                return true;
                        }
                }
            } else {
                ((C79362h1) bVar2.f193278b.mo102812a(cls)).mo102334g(f4Var2);
            }
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            long j;
            long j2;
            int i;
            C72963f4 f4Var2 = f4Var;
            Class cls = C79347d1.class;
            if (C97625j3.m125812b().mo105883I()) {
                ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
                int b = cVar.mo103252b();
                int i2 = cVar.f216964T;
                boolean z = false;
                if (i2 == 1) {
                    String content = f4Var.getContent();
                    try {
                        if (content.endsWith("\n")) {
                            content = content.substring(0, content.length() - 1);
                        }
                        String[] split = content.split(XVFSFile.PATH_SEPARATOR);
                        int i3 = (split.length != 4 || !C72996z1.m85811N4(split[0])) ? 0 : 1;
                        if (split.length > i3) {
                            String str = split[i3];
                        }
                        int i4 = i3 + 1;
                        long j3 = split.length > i4 ? Util.getLong(split[i4], 0) : 0;
                        int i5 = i3 + 2;
                        if (split.length > i5) {
                            split[i5].equals("1");
                        }
                        j = j3;
                    } catch (Exception unused) {
                        Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
                        j = 0;
                    }
                    if ((j == 0 && f4Var.mo108769t2() == 0) || (f4Var.getStatus() == 1 && f4Var.mo108769t2() == 1)) {
                        j2 = 0;
                    } else {
                        if (((C79362h1) this.f217750v.f193278b.mo102812a(C79362h1.class)).mo102322H5()) {
                            j2 = 0;
                            e0Var.mo107136c(b, 120, 0, view.getContext().getString(C0966R.string.b57), C0966R.raw.icons_filled_volume_up);
                        } else {
                            j2 = 0;
                            e0Var.mo107136c(b, 119, 0, view.getContext().getString(C0966R.string.b56), C0966R.raw.icons_filled_ear);
                        }
                    }
                    if (f4Var.getStatus() == 5) {
                        e0Var.mo107136c(b, 103, 0, view.getContext().getString(C0966R.string.f360269bb2), C0966R.raw.icons_filled_refresh);
                    }
                    C88144b.m109788f("favorite");
                    e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                    if (!f4Var.mo100967F3() && f4Var.mo100995g4() && ((f4Var.mo101000j3() || f4Var2.f230728K == 1) && mo103083Q(f4Var2, this.f217750v) && mo103081O(f4Var.mo108768t()))) {
                        e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                    }
                    C79347d1 d1Var = (C79347d1) this.f217750v.f193278b.mo102812a(cls);
                    boolean a = C74177q7.m88379a(f4Var2, this.f217750v);
                    int i6 = C0966R.string.b_n;
                    if (a) {
                        if (!Util.isNullOrNil(d1Var.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2()))) {
                            i6 = -1;
                        }
                        i = i6;
                    } else {
                        i = d1Var.mo102282C4(f4Var.getMsgId()) ? -1 : C0966R.string.b_n;
                    }
                    if (C45628s0.m50738C(f4Var.mo108768t()) && LocaleUtil.isChineseAppLang() && i != -1) {
                        e0Var.mo107136c(b, 121, 0, view.getContext().getString(i), C0966R.raw.icons_filled_transfer_text);
                        z = true;
                    }
                    if (!(j == j2 && f4Var.mo108769t2() == 0) && (!(f4Var.getStatus() == 1 && f4Var.mo108769t2() == 1) && !this.f217750v.mo91584y())) {
                        e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_3), C0966R.raw.icons_filled_delete);
                    }
                    if (!z && LocaleUtil.isChineseAppLang() && i != -1) {
                        e0Var.mo107136c(b, 121, 0, view.getContext().getString(i), C0966R.raw.icons_filled_transfer_text);
                    }
                    return true;
                } else if (i2 == 2) {
                    C79347d1 d1Var2 = (C79347d1) this.f217750v.f193278b.mo102812a(cls);
                    if (d1Var2.mo102299h5(f4Var.getMsgId()) == ChattingItemTranslate.C73918e.Transforming) {
                        e0Var.add(b, 121, 0, (int) C0966R.string.b_j);
                    } else {
                        C76874e0 e0Var2 = e0Var;
                        if (!Util.isNullOrNil(d1Var2.mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2()))) {
                            C76874e0 e0Var3 = e0Var;
                            int i7 = b;
                            e0Var3.mo107136c(i7, 141, 0, view.getContext().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                            e0Var3.mo107136c(i7, TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                            C88144b.m109788f("favorite");
                            e0Var.mo107136c(b, TPOptionalID.f349338xc9bdf6cd, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                        }
                        e0Var.mo107136c(b, 121, 0, view.getContext().getString(C0966R.string.b_l), C0966R.raw.icons_filled_eyes_off);
                    }
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            ((C79362h1) bVar.f193278b.mo102812a(C79362h1.class)).mo102334g(f4Var);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            m88400o0(view, bVar, f4Var, (C74243t8) view.getTag(), (MsgQuoteItem) null);
            return true;
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            return C72963f4.C72966d.f212702a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x01cf  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0212  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0276  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r25, ck3.C67391b r26, com.tencent.p014mm.storage.C72963f4 r27, java.lang.String r28) {
            /*
                r24 = this;
                r9 = r24
                r10 = r26
                r11 = r27
                r9.f217750v = r10
                r12 = r25
                com.tencent.mm.ui.chatting.viewitems.q7$e r12 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.C74190e) r12
                com.tencent.mm.ui.base.AnimImageView r0 = r12.f217760e
                r13 = 0
                r0.setFromVoice(r13)
                com.tencent.mm.ui.base.AnimImageView r0 = r12.f217760e
                boolean r1 = r26.mo91583x()
                r0.setFromGroup(r1)
                java.lang.Class<zj3.l> r0 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r1 = r10.f193278b
                xi.d r0 = r1.mo102812a(r0)
                r14 = r0
                zj3.l r14 = (zj3.C79368l) r14
                r5 = 0
                long r0 = r27.getMsgId()
                boolean r6 = r9.mo103080N(r14, r0)
                com.tencent.mm.ui.chatting.viewitems.i$e r7 = r9.mo103098p(r10)
                r0 = r24
                r1 = r12
                r2 = r27
                r3 = r12
                r4 = r26
                r8 = r24
                com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.C74190e.m88414d(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.Class<zj3.d1> r0 = zj3.C79347d1.class
                com.tencent.mm.ui.chatting.manager.a r1 = r10.f193278b
                xi.d r0 = r1.mo102812a(r0)
                r8 = r0
                zj3.d1 r8 = (zj3.C79347d1) r8
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$e r0 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73918e.NoTransform
                boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.m88379a(r11, r10)
                r15 = 0
                if (r1 == 0) goto L_0x006c
                long r1 = r27.getMsgId()
                java.lang.String r3 = r27.mo108765s2()
                java.lang.String r1 = r8.mo102286M4(r1, r3)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 != 0) goto L_0x0069
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$e r2 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73918e.Transformed
                goto L_0x006a
            L_0x0069:
                r2 = r0
            L_0x006a:
                r7 = r1
                goto L_0x008d
            L_0x006c:
                long r1 = r27.getMsgId()
                boolean r1 = r8.mo102282C4(r1)
                if (r1 == 0) goto L_0x008b
                long r1 = r27.getMsgId()
                java.lang.String r3 = r27.mo108765s2()
                java.lang.String r1 = r8.mo102286M4(r1, r3)
                long r2 = r27.getMsgId()
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$e r2 = r8.mo102299h5(r2)
                goto L_0x006a
            L_0x008b:
                r2 = r0
                r7 = r15
            L_0x008d:
                android.widget.TextView r1 = r12.f217771p
                if (r1 == 0) goto L_0x00a3
                android.widget.TextView r3 = r12.f217759d
                java.lang.Object r3 = r3.getTag()
                r1.setTag(r3)
                android.widget.TextView r1 = r12.f217771p
                com.tencent.mm.ui.chatting.viewitems.i$e r3 = r9.mo103098p(r10)
                r1.setOnLongClickListener(r3)
            L_0x00a3:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                r6 = 5
                r4 = 1
                r3 = 8
                if (r1 == 0) goto L_0x00bc
                if (r2 == r0) goto L_0x00b0
                goto L_0x00bc
            L_0x00b0:
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217762g
                if (r0 == 0) goto L_0x00b7
                r0.setVisibility(r3)
            L_0x00b7:
                r23 = r14
                r14 = 2
                goto L_0x01c9
            L_0x00bc:
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217762g
                if (r0 != 0) goto L_0x00dd
                android.view.ViewStub r0 = r12.f217761f
                android.view.View r0 = r0.inflate()
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = (com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate) r0
                r12.f217762g = r0
                int r1 = r12.f217757b
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r3 = kg3.C76577a.m92151b(r3, r6)
                int r1 = r1 - r3
                r0.setMinimumWidth(r1)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217762g
                r0.mo102992b()
            L_0x00dd:
                java.lang.Class<ny.h> r0 = p629ny.C76979h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                r16 = r0
                ny.h r16 = (p629ny.C76979h) r16
                android.widget.TextView r0 = r12.f217766k
                android.content.Context r17 = r0.getContext()
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217762g
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r0.getContentView()
                float r0 = r0.getTextSize()
                int r0 = (int) r0
                r20 = 1
                r21 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = ""
                r1.append(r3)
                long r5 = r27.mo108774y2()
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = eb0.C86493v0.m107223a(r1)
                eb0.v0 r3 = eb0.C86493v0.m107224d()
                eb0.v0$c r3 = r3.mo120947c(r1, r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "msg_"
                r5.append(r6)
                r23 = r14
                long r13 = r27.mo108774y2()
                r5.append(r13)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "prePublishId"
                r3.mo120962i(r6, r5)
                ck3.b r5 = r9.f217750v
                java.lang.String r5 = r9.mo103068y(r5, r11)
                java.lang.String r6 = "preUsername"
                r3.mo120962i(r6, r5)
                ck3.b r5 = r9.f217750v
                java.lang.String r5 = r9.mo103102x(r5, r11)
                java.lang.String r6 = "preChatName"
                r3.mo120962i(r6, r5)
                r18 = r7
                r19 = r0
                r22 = r1
                android.text.SpannableString r13 = r16.mo107078or(r17, r18, r19, r20, r21, r22)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217762g
                long r5 = r27.getMsgId()
                boolean r3 = r8.mo102283E2(r5)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$d r5 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73917d.Voice
                long r16 = r27.getMsgId()
                r1 = r13
                r14 = 8
                r6 = 1
                r4 = r5
                r14 = 2
                r5 = r16
                r28 = r7
                r7 = r26
                r0.mo102994d(r1, r2, r3, r4, r5, r7)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r13)
                if (r0 != 0) goto L_0x018f
                long r0 = r27.getMsgId()
                boolean r0 = r8.mo102283E2(r0)
                if (r0 == 0) goto L_0x018f
                long r0 = r27.getMsgId()
                r8.mo102285J1(r0)
            L_0x018f:
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c r0 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c
                boolean r1 = r26.mo91583x()
                r0.<init>(r11, r1, r12, r15)
                r0.f216964T = r14
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r1 = r12.f217762g
                r1.setTag(r0)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217762g
                com.tencent.mm.ui.chatting.viewitems.i$e r1 = r9.mo103098p(r10)
                r0.setOnLongClickListener(r1)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217762g
                r1 = 0
                r0.setVisibility(r1)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r28)
                if (r0 != 0) goto L_0x01c9
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217762g
                com.tencent.mm.ui.chatting.h2 r1 = r23.mo108189Z4()
                r0.setOnTouchListener(r1)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate r0 = r12.f217762g
                com.tencent.mm.ui.chatting.viewitems.q7$d$a r1 = new com.tencent.mm.ui.chatting.viewitems.q7$d$a
                r15 = r28
                r1.<init>(r9, r15, r10, r11)
                r0.setOnDoubleClickListener(r1)
            L_0x01c9:
                boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r0 != 0) goto L_0x01e8
                java.lang.Class<zj3.d> r0 = zj3.C79345d.class
                com.tencent.mm.ui.chatting.manager.a r1 = r10.f193278b
                xi.d r0 = r1.mo102812a(r0)
                zj3.d r0 = (zj3.C79345d) r0
                boolean r0 = r0.mo70144G5()
                if (r0 == 0) goto L_0x01e8
                android.widget.TextView r0 = r12.f217777v
                r1 = 2131235445(0x7f081275, float:1.8087084E38)
                r0.setBackgroundResource(r1)
                goto L_0x01f0
            L_0x01e8:
                android.widget.TextView r0 = r12.f217777v
                r1 = 2131235442(0x7f081272, float:1.8087078E38)
                r0.setBackgroundResource(r1)
            L_0x01f0:
                android.widget.TextView r0 = r12.f217777v
                android.app.Activity r1 = r26.mo91565f()
                r2 = 2131165307(0x7f07007b, float:1.7944827E38)
                int r1 = kg3.C76577a.m92155f(r1, r2)
                float r1 = (float) r1
                r2 = 0
                r0.setTextSize(r2, r1)
                android.widget.RelativeLayout r0 = r12.f217776u
                com.tencent.mm.ui.chatting.viewitems.q7$d$b r1 = new com.tencent.mm.ui.chatting.viewitems.q7$d$b
                r1.<init>(r9, r10, r11)
                r0.setOnClickListener(r1)
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r0 == 0) goto L_0x0276
                android.widget.ProgressBar r0 = r12.f217770o
                r1 = 8
                if (r0 == 0) goto L_0x021b
                r0.setVisibility(r1)
            L_0x021b:
                android.widget.ImageView r0 = r12.f217772q
                if (r0 == 0) goto L_0x0222
                r0.setVisibility(r1)
            L_0x0222:
                int r0 = r27.getStatus()
                r1 = 1
                if (r0 == r1) goto L_0x026b
                int r0 = r27.getStatus()
                r2 = 5
                if (r0 != r2) goto L_0x0231
                goto L_0x026b
            L_0x0231:
                android.widget.TextView r0 = r12.f217771p
                r1 = 2131231724(0x7f0803ec, float:1.8079537E38)
                r0.setBackgroundResource(r1)
                android.widget.ImageView r0 = r12.f217772q
                if (r0 == 0) goto L_0x028b
                long r0 = r27.getMsgId()
                r2 = r23
                boolean r0 = r9.mo103080N(r2, r0)
                if (r0 == 0) goto L_0x028b
                boolean r0 = r11.f212665D1
                if (r0 == 0) goto L_0x0264
                android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
                r1 = 1056964608(0x3f000000, float:0.5)
                r2 = 1065353216(0x3f800000, float:1.0)
                r0.<init>(r1, r2)
                r1 = 300(0x12c, double:1.48E-321)
                r0.setDuration(r1)
                android.widget.TextView r1 = r12.f217771p
                r1.startAnimation(r0)
                r0 = 0
                r11.f212665D1 = r0
                goto L_0x0265
            L_0x0264:
                r0 = 0
            L_0x0265:
                android.widget.ImageView r1 = r12.f217772q
                r1.setVisibility(r0)
                goto L_0x028b
            L_0x026b:
                android.widget.TextView r0 = r12.f217771p
                r2 = 2131231725(0x7f0803ed, float:1.807954E38)
                r0.setBackgroundResource(r2)
                r11.f212665D1 = r1
                goto L_0x028b
            L_0x0276:
                android.widget.ProgressBar r0 = r12.f217770o
                if (r0 == 0) goto L_0x028b
                r1 = 0
                r0.setVisibility(r1)
                int r0 = r27.getStatus()
                if (r0 < r14) goto L_0x028b
                android.widget.ProgressBar r0 = r12.f217770o
                r1 = 8
                r0.setVisibility(r1)
            L_0x028b:
                java.lang.String r3 = r26.mo91573n()
                boolean r4 = r26.mo91583x()
                r0 = r24
                r1 = r12
                r2 = r27
                r5 = r26
                r6 = r24
                r0.mo103087e0(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.C74186d.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 34;
        }

        /* renamed from: l0 */
        public boolean mo103033l0() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q7$e */
    public static final class C74190e extends C74023i.C74026c {

        /* renamed from: b */
        public int f217757b;

        /* renamed from: c */
        public TextView f217758c;

        /* renamed from: d */
        public TextView f217759d;

        /* renamed from: e */
        public AnimImageView f217760e;

        /* renamed from: f */
        public ViewStub f217761f;

        /* renamed from: g */
        public ChattingItemTranslate f217762g;

        /* renamed from: h */
        public FrameLayout f217763h;

        /* renamed from: i */
        public FrameLayout f217764i;

        /* renamed from: j */
        public ImageView f217765j;

        /* renamed from: k */
        public TextView f217766k;

        /* renamed from: l */
        public ProgressBar f217767l;

        /* renamed from: m */
        public AnimImageView f217768m;

        /* renamed from: n */
        public TextView f217769n;

        /* renamed from: o */
        public ProgressBar f217770o;

        /* renamed from: p */
        public TextView f217771p;

        /* renamed from: q */
        public ImageView f217772q;

        /* renamed from: r */
        public ImageView f217773r;

        /* renamed from: s */
        public RelativeLayout f217774s;

        /* renamed from: t */
        public TextView f217775t;

        /* renamed from: u */
        public RelativeLayout f217776u;

        /* renamed from: v */
        public TextView f217777v;

        /* renamed from: w */
        public Animation f217778w;

        /* renamed from: a */
        public static void m88412a(Context context, CharSequence charSequence, C67391b bVar) {
            Intent intent = new Intent(context, TextPreviewUI.class);
            intent.putExtra("key_chat_text", charSequence);
            if (bVar != null) {
                intent.putExtra("is_group_chat", bVar.mo91583x());
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$VoiceItemHolder", "goPreviewText", "(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$VoiceItemHolder", "goPreviewText", "(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111199h(context);
        }

        /* renamed from: c */
        public static int m88413c(int i) {
            int i2;
            if (i <= 2) {
                return 80;
            }
            if (i < 10) {
                i2 = i - 2;
            } else if (i >= 60) {
                return 204;
            } else {
                i2 = (i / 10) + 7;
            }
            return (i2 * 9) + 80;
        }

        /* renamed from: d */
        public static void m88414d(C74023i iVar, C74190e eVar, C72963f4 f4Var, C78208e eVar2, C67391b bVar, boolean z, boolean z2, View.OnLongClickListener onLongClickListener, C73774p2 p2Var) {
            long j;
            long j2;
            int i;
            float f;
            int i2;
            C74023i iVar2 = iVar;
            C74190e eVar3 = eVar;
            C72963f4 f4Var2 = f4Var;
            C67391b bVar2 = bVar;
            Class cls = C79362h1.class;
            if (eVar3 != null) {
                String content = f4Var.getContent();
                try {
                    if (content.endsWith("\n")) {
                        content = content.substring(0, content.length() - 1);
                    }
                    String[] split = content.split(XVFSFile.PATH_SEPARATOR);
                    int i3 = (split.length != 4 || !C72996z1.m85811N4(split[0])) ? 0 : 1;
                    if (split.length > i3) {
                        String str = split[i3];
                    }
                    int i4 = i3 + 1;
                    long j3 = split.length > i4 ? Util.getLong(split[i4], 0) : 0;
                    int i5 = i3 + 2;
                    if (split.length > i5) {
                        split[i5].equals("1");
                    }
                    j = j3;
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
                    j = 0;
                }
                float F30 = ((C75415t) C86312j.m106911c(C75415t.class)).F30(j);
                AutoPlay W = ((C79362h1) bVar2.f193278b.mo102812a(cls)).mo102325W();
                if (W == null || f4Var.getMsgId() != W.f215195h) {
                    eVar3.f217760e.setVisibility(8);
                    eVar3.f217760e.mo101602c();
                } else {
                    eVar3.f217760e.setVisibility(0);
                    eVar3.f217760e.mo101601b();
                }
                long f2 = C74177q7.m88384f(f4Var.getMsgId(), j, false, bVar.mo91577r());
                if (f2 > 0) {
                    Log.m105924i("MicroMsg.ChattingItemVoice", "[voice interrupt] set continue play visible " + f4Var.getMsgId());
                    eVar3.f217776u.setVisibility(0);
                    C24479c.m30627a(bVar.mo91584y(), bVar.mo91583x() ^ true, 1, f4Var.getMsgId() + "", j, 0, f2);
                } else {
                    eVar3.f217776u.setVisibility(8);
                }
                if (((C79362h1) bVar2.f193278b.mo102812a(cls)).mo102326W0(f4Var.getMsgId())) {
                    Log.m105918d("MicroMsg.ChattingItemVoice", "startDownloadAnim");
                    ProgressBar progressBar = eVar3.f217767l;
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                        TextView textView = eVar3.f217759d;
                        if (textView != null) {
                            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                    }
                } else {
                    Log.m105918d("MicroMsg.ChattingItemVoice", "stopDownloadAnim");
                    ProgressBar progressBar2 = eVar3.f217767l;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(8);
                        TextView textView2 = eVar3.f217759d;
                        if (textView2 != null) {
                            if (z) {
                                textView2.setCompoundDrawablesWithIntrinsicBounds(C74942w4.m89785b(textView2.getContext(), C0966R.attr.f2698eb), (Drawable) null, (Drawable) null, (Drawable) null);
                            } else {
                                textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, textView2.getContext().getResources().getDrawable(C0966R.raw.chatto_voice_playing), (Drawable) null);
                            }
                        }
                    }
                }
                if (f4Var.mo108769t2() != 0) {
                    f = F30;
                    j2 = j;
                    i = 8;
                } else if (f4Var.getStatus() == 5) {
                    i = 8;
                    f = F30;
                    j2 = j;
                    m88415e(eVar, 8, 0, true, z2, f4Var.mo101004m3());
                    eVar3.f217768m.mo101602c();
                    eVar3.f217768m.setVisibility(8);
                    eVar3.f217766k.setVisibility(0);
                    int i6 = (int) f;
                    int b = C76577a.m92151b(bVar.mo91565f(), m88413c(i6));
                    eVar3.f217757b = b;
                    eVar3.f217759d.setWidth(b);
                    eVar3.f217766k.setText(bVar.mo91572m().getString(C0966R.string.f0i, new Object[]{Integer.valueOf(i6)}));
                    eVar3.f217760e.setWidth(C76577a.m92151b(bVar.mo91565f(), m88413c(i6)));
                    ImageView imageView = eVar3.f217773r;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        eVar3.f217773r.setTag(new C74243t8(f4Var2, bVar.mo91583x(), eVar3, ""));
                        ImageView imageView2 = eVar3.f217773r;
                        if (iVar2.f217208r == null) {
                            iVar2.f217208r = new C74080k(iVar2, bVar2, p2Var);
                        }
                        imageView2.setOnClickListener(iVar2.f217208r);
                    }
                } else {
                    f = F30;
                    j2 = j;
                    i = 8;
                    if (j2 == 0) {
                        m88415e(eVar, 8, 0, true, z2, f4Var.mo101004m3());
                        eVar3.f217768m.mo101602c();
                        eVar3.f217768m.setVisibility(8);
                        eVar3.stateIV.setVisibility(8);
                        int i7 = (int) 0.0f;
                        int b2 = C76577a.m92151b(bVar.mo91565f(), m88413c(i7));
                        eVar3.f217757b = b2;
                        eVar3.f217759d.setWidth(b2);
                        eVar3.f217766k.setText(bVar.mo91572m().getString(C0966R.string.f0i, new Object[]{Integer.valueOf(i7)}));
                        eVar3.f217760e.setWidth(C76577a.m92151b(bVar.mo91565f(), m88413c(i7)));
                        ImageView imageView3 = eVar3.f217773r;
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                        f = 0.0f;
                    } else if (j2 == -1) {
                        m88415e(eVar, 8, 0, true, z2, f4Var.mo101004m3());
                        eVar3.f217768m.mo101602c();
                        eVar3.f217768m.setVisibility(8);
                        eVar3.f217757b = 80;
                        eVar3.f217759d.setWidth(80);
                        eVar3.f217766k.setVisibility(8);
                        eVar3.f217760e.setWidth(C76577a.m92151b(bVar.mo91565f(), m88413c((int) f)));
                        ImageView imageView4 = eVar3.f217773r;
                        if (imageView4 != null) {
                            imageView4.setVisibility(8);
                        }
                    } else {
                        m88415e(eVar, 8, 0, true, z2, f4Var.mo101004m3());
                        eVar3.f217768m.mo101602c();
                        eVar3.f217768m.setVisibility(8);
                        eVar3.f217766k.setVisibility(0);
                        int i8 = (int) f;
                        int b3 = C76577a.m92151b(bVar.mo91565f(), m88413c(i8));
                        eVar3.f217757b = b3;
                        eVar3.f217759d.setWidth(b3);
                        eVar3.f217766k.setText(bVar.mo91572m().getString(C0966R.string.f0i, new Object[]{Integer.valueOf(i8)}));
                        eVar3.f217760e.setWidth(C76577a.m92151b(bVar.mo91565f(), m88413c(i8)));
                        ImageView imageView5 = eVar3.f217773r;
                        if (imageView5 != null) {
                            imageView5.setVisibility(8);
                        }
                    }
                }
                if (1 == f4Var.mo108769t2()) {
                    if (f4Var.getStatus() == 1) {
                        m88415e(eVar, 0, 8, false, z2, f4Var.mo101004m3());
                        eVar3.f217764i.setVisibility(i);
                        eVar.mo103225f();
                    } else if (f4Var.getStatus() == 5) {
                        m88415e(eVar, 8, 0, false, z2, f4Var.mo101004m3());
                        eVar3.f217764i.setVisibility(i);
                        eVar3.f217766k.setVisibility(0);
                        eVar.mo103225f();
                        if (j2 == 0) {
                            f = 0.0f;
                        }
                        int i9 = (int) f;
                        int b4 = C76577a.m92151b(bVar.mo91565f(), m88413c(i9));
                        eVar3.f217757b = b4;
                        eVar3.f217759d.setWidth(b4);
                        eVar3.f217766k.setText(bVar.mo91572m().getString(C0966R.string.f0i, new Object[]{Integer.valueOf(i9)}));
                        eVar3.f217760e.setWidth(C76577a.m92151b(bVar.mo91565f(), m88413c(i9)));
                    } else if (j2 == -1) {
                        m88415e(eVar, 8, 0, false, z2, f4Var.mo101004m3());
                        eVar3.f217759d.setWidth(80);
                        eVar3.f217757b = 80;
                        eVar3.f217766k.setVisibility(i);
                        eVar3.f217764i.setVisibility(i);
                        eVar3.f217760e.setWidth(C76577a.m92151b(bVar.mo91565f(), m88413c((int) f)));
                        eVar.mo103225f();
                    } else if (f4Var.getStatus() == 7) {
                        m88415e(eVar, 8, 8, false, z2, f4Var.mo101004m3());
                        eVar3.f217766k.setVisibility(i);
                        eVar3.f217764i.setVisibility(0);
                        eVar.mo103225f();
                        if (eVar3.f217765j != null) {
                            Animation loadAnimation = AnimationUtils.loadAnimation(eVar3.convertView.getContext(), C0966R.C0968anim.f2539fx);
                            eVar3.f217778w = loadAnimation;
                            eVar3.f217765j.startAnimation(loadAnimation);
                        }
                    } else {
                        m88415e(eVar, 8, 0, false, z2, f4Var.mo101004m3());
                        eVar3.f217764i.setVisibility(i);
                        eVar3.f217766k.setVisibility(0);
                        eVar.mo103225f();
                        if (j2 == 0) {
                            f = 0.0f;
                        }
                        int i15 = (int) f;
                        int b5 = C76577a.m92151b(bVar.mo91565f(), m88413c(i15));
                        eVar3.f217757b = b5;
                        eVar3.f217759d.setWidth(b5);
                        eVar3.f217766k.setText(bVar.mo91572m().getString(C0966R.string.f0i, new Object[]{Integer.valueOf(i15)}));
                        eVar3.f217760e.setWidth(C76577a.m92151b(bVar.mo91565f(), m88413c(i15)));
                    }
                }
                C78404m O1 = ((C79345d) bVar2.f193278b.mo102812a(C79345d.class)).mo70145O1();
                if (O1 != null) {
                    if (O1.f229739f) {
                        eVar3.f217766k.setShadowLayer(2.0f, 1.2f, 1.2f, O1.f229740g);
                        i2 = 0;
                    } else {
                        i2 = 0;
                        eVar3.f217766k.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    }
                    if (O1.f229741h) {
                        eVar3.f217766k.setBackgroundResource(C0966R.C0969drawable.f357131bf2);
                    } else {
                        eVar3.f217766k.setBackgroundColor(i2);
                    }
                }
                eVar3.f217759d.setTag(new ChattingItemTranslate.C73916c(f4Var2, bVar.mo91583x(), eVar3, (String) null));
                eVar3.f217759d.setOnClickListener(eVar3.chattingItem.mo103099u(bVar2));
                eVar3.f217759d.setOnLongClickListener(onLongClickListener);
                eVar3.f217759d.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                if ((f4Var2.f230723F & 1) == 1) {
                    eVar3.f217758c.setVisibility(0);
                    if (f4Var.mo108769t2() == 0) {
                        eVar3.f217760e.setBackgroundResource(C0966R.C0969drawable.f4752lx);
                    } else {
                        eVar3.f217771p.setBackgroundResource(C0966R.C0969drawable.f4814nn);
                        eVar3.f217760e.setBackgroundResource(C0966R.C0969drawable.f4814nn);
                    }
                } else {
                    eVar3.f217758c.setVisibility(i);
                    if (f4Var.mo108769t2() == 0) {
                        eVar3.f217760e.setBackgroundResource(C0966R.C0969drawable.f4750ls);
                    } else {
                        eVar3.f217771p.setBackgroundResource(C0966R.C0969drawable.f4811nk);
                        eVar3.f217760e.setBackgroundResource(C0966R.C0969drawable.f4811nk);
                    }
                }
                if (z) {
                    bVar.mo91577r();
                } else {
                    bVar.mo91573n();
                }
                CharSequence displayName = ((C79357g) bVar2.f193278b.mo102812a(C79357g.class)).getDisplayName(bVar.mo91577r());
                C78844a.C15689b.f42385a.mo108836a(eVar3.f217759d, (int) f, displayName == null ? null : displayName.toString());
                eVar3.f217766k.setContentDescription(" ");
            }
        }

        /* renamed from: e */
        public static void m88415e(C74190e eVar, int i, int i2, boolean z, boolean z2, boolean z3) {
            eVar.stateIV.setVisibility(i2);
            eVar.f217766k.setVisibility(i2);
            eVar.f217763h.setVisibility(i2);
            if (z) {
                eVar.f217768m.setVisibility(i);
                eVar.f217769n.setVisibility(i2);
                return;
            }
            TextView textView = eVar.f217771p;
            if (textView != null) {
                textView.setVisibility(i);
            }
        }

        /* renamed from: b */
        public C74023i.C74026c mo103224b(View view, boolean z, boolean z2) {
            super.create(view);
            this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            this.f217759d = (TextView) view.findViewById(C0966R.C0970id.b9m);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
            this.f217766k = (TextView) view.findViewById(C0966R.C0970id.b4b);
            this.f217763h = (FrameLayout) view.findViewById(C0966R.C0970id.b9n);
            this.f217767l = (ProgressBar) view.findViewById(C0966R.C0970id.b9j);
            this.f217761f = (ViewStub) view.findViewById(C0966R.C0970id.f359418ku0);
            this.f217758c = (TextView) view.findViewById(C0966R.C0970id.b9k);
            AnimImageView animImageView = (AnimImageView) view.findViewById(C0966R.C0970id.b9i);
            this.f217760e = animImageView;
            animImageView.setType(1);
            this.f217776u = (RelativeLayout) view.findViewById(C0966R.C0970id.lx_);
            this.f217777v = (TextView) view.findViewById(C0966R.C0970id.lx9);
            if (z) {
                this.f217760e.setFromVoice(true);
                this.f217760e.setFromGroup(z2);
                this.f217769n = (TextView) view.findViewById(C0966R.C0970id.b2v);
                AnimImageView animImageView2 = (AnimImageView) view.findViewById(C0966R.C0970id.b9l);
                this.f217768m = animImageView2;
                animImageView2.setFromVoice(true);
                this.f217768m.setFromGroup(z2);
                this.f217768m.setType(0);
                this.f217773r = (ImageView) view.findViewById(C0966R.C0970id.b5e);
                this.f217774s = (RelativeLayout) view.findViewById(C0966R.C0970id.b5g);
                this.f217775t = (TextView) view.findViewById(C0966R.C0970id.b5f);
            } else {
                this.f217764i = (FrameLayout) view.findViewById(C0966R.C0970id.b9u);
                this.f217765j = (ImageView) view.findViewById(C0966R.C0970id.b9v);
                this.f217770o = (ProgressBar) view.findViewById(C0966R.C0970id.b9w);
                this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
                this.f217771p = (TextView) view.findViewById(C0966R.C0970id.b9x);
                this.f217760e.setFromVoice(false);
                this.f217760e.setFromGroup(z2);
                this.f217772q = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            }
            return this;
        }

        /* renamed from: f */
        public final void mo103225f() {
            Animation animation = this.f217778w;
            if (animation != null) {
                animation.cancel();
                this.f217778w = null;
            }
        }

        public View getMainContainerView() {
            return this.f217763h;
        }
    }

    static {
        ViewConfiguration.getDoubleTapTimeout();
    }

    /* renamed from: a */
    public static boolean m88379a(C72963f4 f4Var, C67391b bVar) {
        return ((C79347d1) bVar.f193278b.mo102812a(C79347d1.class)).mo102284H4(f4Var.getMsgId());
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m88380b(ck3.C67391b r20, com.tencent.p014mm.storage.C72963f4 r21) {
        /*
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = r20.mo91577r()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.ChattingItemVoice"
            java.lang.String r4 = "[voice interrupt] from voice continue play click talker: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            java.lang.Class<zj3.h1> r1 = zj3.C79362h1.class
            r4 = r20
            com.tencent.mm.ui.chatting.manager.a r5 = r4.f193278b
            xi.d r1 = r5.mo102812a(r1)
            zj3.h1 r1 = (zj3.C79362h1) r1
            com.tencent.mm.ui.chatting.AutoPlay r1 = r1.mo102325W()
            if (r1 != 0) goto L_0x0025
            goto L_0x013d
        L_0x0025:
            java.lang.String r5 = r21.getContent()
            r6 = 0
            java.lang.String r8 = "\n"
            boolean r8 = r5.endsWith(r8)     // Catch:{ Exception -> 0x0071 }
            if (r8 == 0) goto L_0x003c
            int r8 = r5.length()     // Catch:{ Exception -> 0x0071 }
            int r8 = r8 - r0
            java.lang.String r5 = r5.substring(r3, r8)     // Catch:{ Exception -> 0x0071 }
        L_0x003c:
            java.lang.String r8 = ":"
            java.lang.String[] r5 = r5.split(r8)     // Catch:{ Exception -> 0x0071 }
            int r8 = r5.length     // Catch:{ Exception -> 0x0071 }
            r9 = 4
            if (r8 != r9) goto L_0x0050
            r8 = r5[r3]     // Catch:{ Exception -> 0x0071 }
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85811N4(r8)     // Catch:{ Exception -> 0x0071 }
            if (r8 == 0) goto L_0x0050
            r8 = 1
            goto L_0x0051
        L_0x0050:
            r8 = 0
        L_0x0051:
            int r9 = r5.length     // Catch:{ Exception -> 0x0071 }
            if (r9 <= r8) goto L_0x0056
            r9 = r5[r8]     // Catch:{ Exception -> 0x0071 }
        L_0x0056:
            int r9 = r5.length     // Catch:{ Exception -> 0x0071 }
            int r10 = r8 + 1
            if (r9 <= r10) goto L_0x0062
            r9 = r5[r10]     // Catch:{ Exception -> 0x0071 }
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r6)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0063
        L_0x0062:
            r9 = r6
        L_0x0063:
            int r11 = r5.length     // Catch:{ Exception -> 0x0071 }
            int r8 = r8 + 2
            if (r11 <= r8) goto L_0x006f
            r5 = r5[r8]     // Catch:{ Exception -> 0x0071 }
            java.lang.String r8 = "1"
            r5.equals(r8)     // Catch:{ Exception -> 0x0071 }
        L_0x006f:
            r15 = r9
            goto L_0x0079
        L_0x0071:
            java.lang.String r5 = "MicroMsg.VoiceContent"
            java.lang.String r8 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            r15 = r6
        L_0x0079:
            long r9 = r21.getMsgId()
            r13 = 1
            java.lang.String r14 = r20.mo91577r()
            r11 = r15
            long r18 = m88384f(r9, r11, r13, r14)
            r8 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x010d
            int r5 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r5 >= 0) goto L_0x010d
            long r8 = r18 - r8
            ob0.p r5 = r1.f215194g
            ph.a r5 = (p371ph.C21967a) r5
            boolean r5 = r5.mo35058b()
            if (r5 == 0) goto L_0x00bb
            ob0.p r5 = r1.f215194g
            ph.a r5 = (p371ph.C21967a) r5
            boolean r5 = r5.mo35057a()
            if (r5 != 0) goto L_0x00bb
            long r10 = r1.f215195h
            r12 = -1
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x00b8
            long r12 = r21.getMsgId()
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x00b8
            goto L_0x00bb
        L_0x00b8:
            r5 = r21
            goto L_0x00c6
        L_0x00bb:
            r1.mo102005h()
            r5 = r21
            r1.mo102003f(r5)
            r1.mo102009l()
        L_0x00c6:
            ob0.p r1 = r1.f215194g
            if (r1 == 0) goto L_0x00d4
            ph.a r1 = (p371ph.C21967a) r1
            qh.d r1 = r1.f62200a
            if (r1 == 0) goto L_0x00d4
            boolean r3 = r1.seek(r8)
        L_0x00d4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "[voice interrupt] interrupt seek to: "
            r1.append(r10)
            r1.append(r8)
            java.lang.String r8 = " result: "
            r1.append(r8)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r3 == 0) goto L_0x0114
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = f217736a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "current_interrupt_msg_id-"
            r2.append(r3)
            java.lang.String r3 = r20.mo91577r()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.putLong(r2, r6)
            goto L_0x0114
        L_0x010d:
            r5 = r21
            java.lang.String r1 = "[voice interrupt] record pts out of range"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
        L_0x0114:
            boolean r9 = r20.mo91584y()
            boolean r1 = r20.mo91583x()
            r10 = r1 ^ 1
            r11 = 2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r21.getMsgId()
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r13 = r0.toString()
            r0 = 0
            r14 = r15
            r16 = r0
            fn3.C24479c.m30627a(r9, r10, r11, r13, r14, r16, r18)
        L_0x013d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.m88380b(ck3.b, com.tencent.mm.storage.f4):void");
    }

    /* renamed from: c */
    public static boolean m88381c(int i, C67391b bVar, C72963f4 f4Var, C79347d1 d1Var, boolean z) {
        if (!m88386h(bVar, f4Var, C0966R.string.b55) && !m88385g(bVar, f4Var, C0966R.string.f360246b53)) {
            ThreadPool.post(new C74169p7(bVar, f4Var), "voice_transform_text_report");
            if (d1Var.mo102293c4()) {
                C76879j.m92749t(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.ke_), "", new C74198r7(z, f4Var, d1Var, i));
            } else {
                if (z) {
                    C76552z.m92082t(f4Var);
                }
                d1Var.mo102287Y4(f4Var, true, i, 0);
            }
            ((C77569h) C86312j.m106911c(C77569h.class)).mo35240lH(f4Var);
        }
        return true;
    }

    /* renamed from: d */
    public static void m88382d(int i, C72963f4 f4Var) {
        Log.m105925i("MicroMsg.ChattingItemVoice", "alvinluo reportTransformTextLongClick type: %d, msgId: %d", Integer.valueOf(i), Long.valueOf(f4Var.getMsgId()));
        ExtVoiceTransformTextClickEvent extVoiceTransformTextClickEvent = new ExtVoiceTransformTextClickEvent();
        ExtVoiceTransformTextClickEvent.C67688a aVar = extVoiceTransformTextClickEvent.f193576d;
        aVar.f193578b = 2;
        aVar.f193579c = i;
        aVar.f193577a = f4Var.mo108765s2();
        extVoiceTransformTextClickEvent.publish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0266 A[Catch:{ Exception -> 0x0286 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026d A[Catch:{ Exception -> 0x0286 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0276 A[Catch:{ Exception -> 0x0286 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027d A[Catch:{ Exception -> 0x0286 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m88383e(ck3.C67391b r30, com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8 r31, com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem r32) {
        /*
            r0 = r30
            r1 = r31
            r2 = r32
            java.lang.Class<zj3.h1> r3 = zj3.C79362h1.class
            if (r1 == 0) goto L_0x0324
            com.tencent.mm.storage.f4 r4 = r1.f212238a
            if (r4 == 0) goto L_0x0324
            android.app.Activity r5 = r30.mo91565f()
            com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent r6 = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent
            r6.<init>()
            r6.publish()
            com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent$a r7 = r6.f194014d
            boolean r8 = r7.f194017c
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x0037
            boolean r7 = r7.f194015a
            java.lang.String r7 = p182kk.C61104a.m71643C(r5, r7)
            r8 = 2131821556(0x7f1103f4, float:1.9275859E38)
            java.lang.String r8 = r5.getString(r8)
            kk.c r10 = new kk.c
            r10.<init>()
            nj3.C76879j.m92754y(r5, r9, r7, r8, r10)
        L_0x0037:
            com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent$a r5 = r6.f194014d
            boolean r5 = r5.f194017c
            java.lang.String r6 = "1"
            r7 = 4
            java.lang.String r8 = ":"
            java.lang.String r10 = "VoiceContent parse failed."
            java.lang.String r11 = "MicroMsg.VoiceContent"
            java.lang.String r12 = "\n"
            r13 = 0
            r14 = 0
            r15 = 1
            if (r5 != 0) goto L_0x0122
            android.app.Activity r5 = r30.mo91565f()
            boolean r5 = p182kk.C61104a.m71661q(r5, r15)
            if (r5 != 0) goto L_0x0122
            android.app.Activity r5 = r30.mo91565f()
            boolean r5 = p182kk.C61104a.m71664t(r5, r15)
            if (r5 != 0) goto L_0x0122
            android.app.Activity r5 = r30.mo91565f()
            boolean r5 = p182kk.C61104a.m71657m(r5, r15, r13)
            if (r5 != 0) goto L_0x0122
            android.app.Activity r5 = r30.mo91565f()
            boolean r5 = p182kk.C61104a.m71658n(r5, r15)
            if (r5 != 0) goto L_0x0122
            android.app.Activity r5 = r30.mo91565f()
            boolean r5 = p182kk.C61104a.m71665u(r5)
            if (r5 != 0) goto L_0x0122
            android.app.Activity r5 = r30.mo91565f()
            boolean r5 = p182kk.C61104a.m71649e(r5)
            if (r5 == 0) goto L_0x0089
            goto L_0x0122
        L_0x0089:
            eb0.c r5 = eb0.C97625j3.m125812b()
            boolean r5 = r5.mo105883I()
            if (r5 != 0) goto L_0x00a2
            android.app.Activity r2 = r30.mo91565f()
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r4 = r0.f193286j
            android.view.View r4 = r4.getContentView()
            nj3.C76912y0.m92771j(r2, r4)
            goto L_0x012b
        L_0x00a2:
            java.lang.String r5 = r4.getContent()
            boolean r16 = r5.endsWith(r12)     // Catch:{ Exception -> 0x00e8 }
            if (r16 == 0) goto L_0x00b6
            int r16 = r5.length()     // Catch:{ Exception -> 0x00e8 }
            int r13 = r16 + -1
            java.lang.String r5 = r5.substring(r14, r13)     // Catch:{ Exception -> 0x00e8 }
        L_0x00b6:
            java.lang.String[] r5 = r5.split(r8)     // Catch:{ Exception -> 0x00e8 }
            int r13 = r5.length     // Catch:{ Exception -> 0x00e8 }
            if (r13 != r7) goto L_0x00c7
            r13 = r5[r14]     // Catch:{ Exception -> 0x00e8 }
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85811N4(r13)     // Catch:{ Exception -> 0x00e8 }
            if (r13 == 0) goto L_0x00c7
            r13 = 1
            goto L_0x00c8
        L_0x00c7:
            r13 = 0
        L_0x00c8:
            int r7 = r5.length     // Catch:{ Exception -> 0x00e8 }
            if (r7 <= r13) goto L_0x00cd
            r7 = r5[r13]     // Catch:{ Exception -> 0x00e8 }
        L_0x00cd:
            int r7 = r5.length     // Catch:{ Exception -> 0x00e8 }
            int r15 = r13 + 1
            if (r7 <= r15) goto L_0x00db
            r7 = r5[r15]     // Catch:{ Exception -> 0x00e8 }
            r14 = 0
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r14)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00dd
        L_0x00db:
            r17 = 0
        L_0x00dd:
            int r7 = r5.length     // Catch:{ Exception -> 0x00e8 }
            int r13 = r13 + 2
            if (r7 <= r13) goto L_0x00ed
            r5 = r5[r13]     // Catch:{ Exception -> 0x00e8 }
            r5.equals(r6)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00ed
        L_0x00e8:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r10)
            r17 = 0
        L_0x00ed:
            java.lang.String r4 = r4.getContent()
            boolean r4 = sf0.C77702q0.m93719b(r4)
            if (r4 != 0) goto L_0x0100
            r4 = 0
            int r7 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x00fe
            goto L_0x0100
        L_0x00fe:
            r14 = 1
            goto L_0x012b
        L_0x0100:
            android.app.Activity r4 = r30.mo91565f()
            r5 = 2131823621(0x7f110c05, float:1.9280047E38)
            r7 = 0
            android.widget.Toast r4 = p910lj.C76701a.makeText((android.content.Context) r4, (int) r5, (int) r7)
            r4.show()
            if (r2 == 0) goto L_0x012a
            r17 = 5
            long r4 = r2.f201544e
            int r2 = r2.f201543d
            long r13 = (long) r2
            r23 = 0
            r19 = r4
            r21 = r13
            w72.C22877b.m26854a(r17, r19, r21, r23)
            goto L_0x012a
        L_0x0122:
            java.lang.String r2 = "MicroMsg.ChattingItemVoice"
            java.lang.String r4 = "voip is running, not play voice"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r4)
        L_0x012a:
            r14 = 0
        L_0x012b:
            if (r14 == 0) goto L_0x0324
            com.tencent.mm.storage.f4 r2 = r1.f212238a
            java.lang.String r2 = r2.getContent()
            boolean r4 = r2.endsWith(r12)     // Catch:{ Exception -> 0x0178 }
            if (r4 == 0) goto L_0x0144
            int r4 = r2.length()     // Catch:{ Exception -> 0x0178 }
            r5 = 1
            int r4 = r4 - r5
            r5 = 0
            java.lang.String r2 = r2.substring(r5, r4)     // Catch:{ Exception -> 0x0178 }
        L_0x0144:
            java.lang.String[] r2 = r2.split(r8)     // Catch:{ Exception -> 0x0178 }
            int r4 = r2.length     // Catch:{ Exception -> 0x0178 }
            r5 = 4
            if (r4 != r5) goto L_0x0157
            r4 = 0
            r5 = r2[r4]     // Catch:{ Exception -> 0x0178 }
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85811N4(r5)     // Catch:{ Exception -> 0x0178 }
            if (r4 == 0) goto L_0x0157
            r4 = 1
            goto L_0x0158
        L_0x0157:
            r4 = 0
        L_0x0158:
            int r5 = r2.length     // Catch:{ Exception -> 0x0178 }
            if (r5 <= r4) goto L_0x015d
            r5 = r2[r4]     // Catch:{ Exception -> 0x0178 }
        L_0x015d:
            int r5 = r2.length     // Catch:{ Exception -> 0x0178 }
            int r7 = r4 + 1
            if (r5 <= r7) goto L_0x016b
            r5 = r2[r7]     // Catch:{ Exception -> 0x0178 }
            r13 = 0
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r13)     // Catch:{ Exception -> 0x0178 }
            goto L_0x016d
        L_0x016b:
            r17 = 0
        L_0x016d:
            int r5 = r2.length     // Catch:{ Exception -> 0x0178 }
            int r4 = r4 + 2
            if (r5 <= r4) goto L_0x017d
            r2 = r2[r4]     // Catch:{ Exception -> 0x0178 }
            r2.equals(r6)     // Catch:{ Exception -> 0x0178 }
            goto L_0x017d
        L_0x0178:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r10)
            r17 = 0
        L_0x017d:
            com.tencent.mm.ui.chatting.manager.a r2 = r0.f193278b
            xi.d r2 = r2.mo102812a(r3)
            zj3.h1 r2 = (zj3.C79362h1) r2
            com.tencent.mm.ui.chatting.AutoPlay r2 = r2.mo102325W()
            com.tencent.mm.storage.f4 r4 = r1.f212238a
            long r19 = r4.getMsgId()
            r23 = 1
            java.lang.String r24 = r30.mo91577r()
            r21 = r17
            long r28 = m88384f(r19, r21, r23, r24)
            r4 = 0
            int r7 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x01ca
            boolean r19 = r30.mo91584y()
            boolean r4 = r30.mo91583x()
            r5 = 1
            r20 = r4 ^ 1
            r21 = 3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.tencent.mm.storage.f4 r5 = r1.f212238a
            long r13 = r5.getMsgId()
            r4.append(r13)
            r4.append(r9)
            java.lang.String r23 = r4.toString()
            r26 = 0
            r24 = r17
            fn3.C24479c.m30627a(r19, r20, r21, r23, r24, r26, r28)
        L_0x01ca:
            java.lang.Class<zj3.l> r4 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r5 = r0.f193278b
            xi.d r4 = r5.mo102812a(r4)
            if (r4 == 0) goto L_0x0324
            if (r2 == 0) goto L_0x0324
            com.tencent.mm.storage.f4 r4 = r1.f212238a
            com.tencent.mm.ui.chatting.manager.a r5 = r0.f193278b
            xi.d r3 = r5.mo102812a(r3)
            zj3.h1 r3 = (zj3.C79362h1) r3
            com.tencent.mm.ui.chatting.AutoPlay r3 = r3.mo102325W()
            long r13 = r3.f215195h
            long r17 = r4.getMsgId()
            int r3 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x01ef
            goto L_0x0229
        L_0x01ef:
            java.lang.Class<zj3.d1> r3 = zj3.C79347d1.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r3)
            zj3.d1 r0 = (zj3.C79347d1) r0
            long r13 = r4.getMsgId()
            boolean r3 = r0.mo102284H4(r13)
            if (r3 == 0) goto L_0x0205
            r0 = 7
            goto L_0x0212
        L_0x0205:
            long r13 = r4.getMsgId()
            boolean r0 = r0.mo102282C4(r13)
            if (r0 == 0) goto L_0x0211
            r0 = 6
            goto L_0x0212
        L_0x0211:
            r0 = 0
        L_0x0212:
            if (r0 == 0) goto L_0x0229
            com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent r3 = new com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent
            r3.<init>()
            com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent$a r5 = r3.f193576d
            r7 = 1
            r5.f193578b = r7
            r5.f193579c = r0
            java.lang.String r0 = r4.mo108765s2()
            r5.f193577a = r0
            r3.publish()
        L_0x0229:
            int r0 = r31.mo103252b()
            com.tencent.mm.storage.f4 r1 = r1.f212238a
            if (r1 == 0) goto L_0x0324
            boolean r3 = r1.mo100995g4()
            if (r3 != 0) goto L_0x0239
            goto L_0x0324
        L_0x0239:
            java.lang.String r3 = r1.getContent()
            boolean r4 = r3.endsWith(r12)     // Catch:{ Exception -> 0x0286 }
            if (r4 == 0) goto L_0x024e
            int r4 = r3.length()     // Catch:{ Exception -> 0x0286 }
            r5 = 1
            int r4 = r4 - r5
            r5 = 0
            java.lang.String r3 = r3.substring(r5, r4)     // Catch:{ Exception -> 0x0286 }
        L_0x024e:
            java.lang.String[] r3 = r3.split(r8)     // Catch:{ Exception -> 0x0286 }
            int r4 = r3.length     // Catch:{ Exception -> 0x0286 }
            r5 = 4
            if (r4 != r5) goto L_0x0261
            r4 = 0
            r5 = r3[r4]     // Catch:{ Exception -> 0x0286 }
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85811N4(r5)     // Catch:{ Exception -> 0x0286 }
            if (r5 == 0) goto L_0x0262
            r14 = 1
            goto L_0x0263
        L_0x0261:
            r4 = 0
        L_0x0262:
            r14 = 0
        L_0x0263:
            int r4 = r3.length     // Catch:{ Exception -> 0x0286 }
            if (r4 <= r14) goto L_0x0268
            r4 = r3[r14]     // Catch:{ Exception -> 0x0286 }
        L_0x0268:
            int r4 = r3.length     // Catch:{ Exception -> 0x0286 }
            int r5 = r14 + 1
            if (r4 <= r5) goto L_0x0276
            r4 = r3[r5]     // Catch:{ Exception -> 0x0286 }
            r7 = 0
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r7)     // Catch:{ Exception -> 0x0286 }
            goto L_0x0278
        L_0x0276:
            r4 = 0
        L_0x0278:
            int r7 = r3.length     // Catch:{ Exception -> 0x0286 }
            int r14 = r14 + 2
            if (r7 <= r14) goto L_0x0282
            r3 = r3[r14]     // Catch:{ Exception -> 0x0286 }
            r3.equals(r6)     // Catch:{ Exception -> 0x0286 }
        L_0x0282:
            r14 = r4
            r3 = 0
            goto L_0x028d
        L_0x0286:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r10)
            r3 = 0
            r14 = 0
        L_0x028d:
            int r5 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0297
            int r3 = r1.mo108769t2()
            if (r3 == 0) goto L_0x0324
        L_0x0297:
            int r3 = r1.getStatus()
            r4 = 1
            if (r3 != r4) goto L_0x02a6
            int r3 = r1.mo108769t2()
            if (r3 != r4) goto L_0x02a6
            goto L_0x0324
        L_0x02a6:
            int r3 = r1.mo108769t2()
            if (r3 != 0) goto L_0x02b3
            r3 = -1
            int r5 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x02b3
            goto L_0x0324
        L_0x02b3:
            r2.mo102005h()
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            r4 = 4115(0x1013, float:5.766E-42)
            r5 = 0
            java.lang.Object r3 = r3.mo119684e(r4, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x02cf
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x02f2
        L_0x02cf:
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r3.mo119676J(r4, r5)
            ck3.b r6 = r2.f215196i
            r7 = 2131756018(0x7f1003f2, float:1.9142932E38)
            r8 = 2131099737(0x7f060059, float:1.7811836E38)
            android.content.Context r3 = r2.f215197j
            r4 = 2131823592(0x7f110be8, float:1.9279988E38)
            java.lang.String r9 = r3.getString(r4)
            r10 = 4000(0xfa0, double:1.9763E-320)
            r6.mo91555P(r7, r8, r9, r10)
        L_0x02f2:
            ob0.p r3 = r2.f215194g
            ph.a r3 = (p371ph.C21967a) r3
            boolean r3 = r3.mo35058b()
            if (r3 == 0) goto L_0x030d
            long r3 = r1.getMsgId()
            long r5 = r2.f215195h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x030d
            r3 = 1
            r2.f215185B = r3
            r2.mo102016s(r3)
            goto L_0x0324
        L_0x030d:
            r3 = 1
            r2.mo102003f(r1)
            int r4 = r1.mo108769t2()
            if (r4 != 0) goto L_0x0321
            boolean r1 = kd0.C76552z.m92079q(r1)
            if (r1 != 0) goto L_0x0321
            int r0 = r0 + r3
            r2.mo102002e(r0)
        L_0x0321:
            r2.mo102009l()
        L_0x0324:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.m88383e(ck3.b, com.tencent.mm.ui.chatting.viewitems.t8, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem):void");
    }

    /* renamed from: f */
    public static long m88384f(long j, long j2, boolean z, String str) {
        long j3 = j;
        String str2 = str;
        Class cls = C32735h.class;
        MultiProcessMMKV multiProcessMMKV = f217736a;
        String string = multiProcessMMKV.getString(j3 + "", "0,0");
        boolean z2 = false;
        if (multiProcessMMKV.getLong("current_interrupt_msg_id-" + str2, 0) != j3) {
            Log.m105925i("MicroMsg.ChattingItemVoice", "[voice interrupt] %d current voice isn't the latest interrupt one %s", Long.valueOf(j), str2);
            return 0;
        } else if (string == null) {
            return -1;
        } else {
            String[] split = string.split(",");
            if (split.length != 2) {
                Log.m105924i("MicroMsg.ChattingItemVoice", "[voice interrupt] interrupt info format error");
                return -1;
            }
            try {
                long parseLong = Long.parseLong(split[1]);
                long currentTimeMillis = System.currentTimeMillis() - parseLong;
                int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Chat_VoiceContinuePlayTimeout_Int, -1);
                long j4 = parseLong;
                if (currentTimeMillis <= ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_chatting_voice_continue_play_timeout, 86400) * 1000) {
                    if (e <= -1 || currentTimeMillis <= ((long) e) * 60 * 1000) {
                        long parseLong2 = Long.parseLong(split[0]);
                        if (2000 >= parseLong2 || 2000 + parseLong2 >= j2) {
                            multiProcessMMKV.remove(j3 + "");
                            Log.m105924i("MicroMsg.ChattingItemVoice", "[voice interrupt] pts out of limit");
                            return -1;
                        }
                        Log.m105924i("MicroMsg.ChattingItemVoice", "[voice interrupt] get interrupt time " + parseLong2);
                        if (z) {
                            multiProcessMMKV.remove(j3 + "");
                            Log.m105924i("MicroMsg.ChattingItemVoice", "[voice interrupt] return pts and remove info " + parseLong2);
                        }
                        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_chatting_voice_continue_play, -1) == 1) {
                            z2 = true;
                        }
                        Log.m105924i("MicroMsg.ChattingItemVoice", "[voice interrupt] disable flag");
                        if (z2) {
                            return -1;
                        }
                        return parseLong2;
                    }
                }
                multiProcessMMKV.remove(j3 + "");
                Log.m105924i("MicroMsg.ChattingItemVoice", "[voice interrupt] interrupt info expired, record timestamp: " + j4);
                return -1;
            } catch (NumberFormatException unused) {
                Log.m105920e("MicroMsg.ChattingItemVoice", "[voice interrupt] parse data error str: " + string);
            }
        }
    }

    /* renamed from: g */
    public static boolean m88385g(C67391b bVar, C72963f4 f4Var, int i) {
        if (f4Var == null || !f4Var.mo100995g4() || f4Var.mo108769t2() == 1 || f4Var.getStatus() != 5) {
            return false;
        }
        Log.m105924i("MicroMsg.ChattingItemVoice", "handleDownloadFailVoiceMsg show alert!");
        C76879j.m92754y(bVar.mo91565f(), bVar.mo91565f().getString(i), "", bVar.mo91565f().getString(C0966R.string.lkg), new C74179b());
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88386h(ck3.C67391b r6, com.tencent.p014mm.storage.C72963f4 r7, int r8) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7.mo101013q3()
            if (r1 == 0) goto L_0x0072
            java.lang.Class<zj3.h1> r1 = zj3.C79362h1.class
            com.tencent.mm.ui.chatting.manager.a r2 = r6.f193278b
            xi.d r1 = r2.mo102812a(r1)
            zj3.h1 r1 = (zj3.C79362h1) r1
            long r2 = r7.getMsgId()
            boolean r1 = r1.mo102326W0(r2)
            r2 = 1
            java.lang.String r3 = "MicroMsg.ChattingItemVoice"
            if (r1 == 0) goto L_0x0028
            java.lang.String r7 = "onCreateContextMenu: voice msg is downloading.(1)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
        L_0x0026:
            r0 = 1
            goto L_0x004a
        L_0x0028:
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            long r4 = r7.getMsgId()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r7 = r1.b00(r4)
            boolean r7 = r7.mo101013q3()
            if (r7 == 0) goto L_0x004a
            java.lang.String r7 = "onCreateContextMenu: voice msg is downloading.(2)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            goto L_0x0026
        L_0x004a:
            if (r0 == 0) goto L_0x0072
            java.lang.String r7 = "handleNoFinishDownloadVoiceMsg show alert!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            android.app.Activity r7 = r6.mo91565f()
            android.app.Activity r1 = r6.mo91565f()
            java.lang.String r8 = r1.getString(r8)
            android.app.Activity r6 = r6.mo91565f()
            r1 = 2131840199(0x7f114cc7, float:1.9313671E38)
            java.lang.String r6 = r6.getString(r1)
            com.tencent.mm.ui.chatting.viewitems.q7$a r1 = new com.tencent.mm.ui.chatting.viewitems.q7$a
            r1.<init>()
            java.lang.String r2 = ""
            nj3.C76879j.m92754y(r7, r8, r2, r6, r1)
        L_0x0072:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.m88386h(ck3.b, com.tencent.mm.storage.f4, int):boolean");
    }
}
