package com.tencent.p014mm.chatroom.p015ui;

import a11.C39478b;
import a11.C39479c;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import bl3.C39818r;
import bp3.C104160f;
import bp3.C79758p;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLiveTipsBarEvent;
import com.tencent.p014mm.autogen.events.GetChatRoomInfoDetailEvent;
import com.tencent.p014mm.autogen.events.NotifyChatRoomStatusChangeEvent;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatSpecialAttentionLogStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.DismissedChatroomInfoReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct;
import com.tencent.p014mm.chatroom.p015ui.preference.RoomCardPreference;
import com.tencent.p014mm.chatroom.p015ui.uic.C67995a;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.plugin.newtips.NewTipPreference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dd0.C45322a;
import dd0.C75350g;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45612m0;
import eb0.C45613m2;
import eb0.C45628s0;
import eb0.C75589l0;
import eb0.C75592q0;
import eb0.C75597w2;
import eb0.C75604z3;
import eb0.z3$$g;
import f40.C86709a0;
import f40.C86737h0;
import f62.C31950v0;
import f62.C75700k0;
import g62.C32330n;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kr0.C34010q0;
import l31.C61212e;
import lc3.C10485b;
import nj3.C76879j;
import nj3.C76912y0;
import o31.C11345b;
import ob0.C11385n;
import ob0.C117747y;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p154fy.C87121j;
import p203mi.C34572d0;
import p242ti.C13925a;
import p248ug.C65347o0;
import p249ui.C14193c;
import p249ui.C78163d;
import p253vi.C14872b;
import p253vi.C52916d;
import p253vi.C78416c;
import p253vi.C78417e;
import p275xz.C79012e;
import p446av.C28139e;
import p530fx.C45819c;
import p530fx.C75818e;
import p609mp.C76802a;
import p609mp.C76803c;
import p609mp.C76805e;
import p629ny.C76979h;
import p674ri.C77520a;
import p680ru.C77569h;
import p740wo.C53193b;
import p744wt.C66190c;
import pg3.C35488c;
import pg3.C77084b;
import pg3.C77086f;
import pj3.C47510b;
import pj3.C47511g;
import qo3.C77407n;
import sx2.C48497j;
import tc0.C77885p;
import te3.C49487fy2;
import te3.C49786i20;
import te3.C50904q20;
import te3.C51163rv3;
import te3.C51866wq2;
import vm3.C65764a;
import vm3.C78436b;
import vm3.C78444g;
import wd3.C78565f0;
import xm3.C78870a;
import xm3.C78877c0;
import xm3.C78889f0;
import xm3.C78904i;
import xm3.C78917n;
import xm3.C78928r;
import xm3.C78938y;
import xm3.C78944z;
import yb2.C79062b;
import yl3.C53534a;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI */
public class ChatroomInfoUI extends MMPreference implements C11385n, MStorageEx.IOnStorageChange, MStorage.IOnStorageChange, C45322a, C77520a.C77522b {

    /* renamed from: X */
    public static boolean f194768X;

    /* renamed from: A */
    public boolean f194769A;

    /* renamed from: B */
    public String f194770B;

    /* renamed from: C */
    public boolean f194771C = false;

    /* renamed from: D */
    public int f194772D;

    /* renamed from: E */
    public boolean f194773E;

    /* renamed from: F */
    public boolean f194774F = false;

    /* renamed from: G */
    public C44661m1 f194775G = null;

    /* renamed from: H */
    public boolean f194776H = true;

    /* renamed from: I */
    public boolean f194777I = false;

    /* renamed from: J */
    public boolean f194778J = false;

    /* renamed from: K */
    public boolean f194779K = false;

    /* renamed from: L */
    public boolean f194780L = false;

    /* renamed from: M */
    public boolean f194781M = false;

    /* renamed from: N */
    public boolean f194782N = false;

    /* renamed from: P */
    public boolean f194783P = false;

    /* renamed from: Q */
    public String f194784Q = "";

    /* renamed from: R */
    public String f194785R = null;

    /* renamed from: S */
    public IListener f194786S;

    /* renamed from: T */
    public IListener f194787T;

    /* renamed from: U */
    public C72940a f194788U;

    /* renamed from: V */
    public MTimerHandler f194789V;

    /* renamed from: W */
    public int f194790W;

    /* renamed from: d */
    public ProgressDialog f194791d = null;

    /* renamed from: e */
    public ProgressDialog f194792e = null;

    /* renamed from: f */
    public boolean f194793f = false;

    /* renamed from: g */
    public boolean f194794g = true;

    /* renamed from: h */
    public C47511g f194795h;

    /* renamed from: i */
    public boolean f194796i;

    /* renamed from: j */
    public C72996z1 f194797j;

    /* renamed from: n */
    public MMHandler f194798n = new C67863d(Looper.getMainLooper());

    /* renamed from: o */
    public RoomCardPreference f194799o;

    /* renamed from: p */
    public Preference f194800p;

    /* renamed from: q */
    public Preference f194801q;

    /* renamed from: r */
    public ContactListExpandPreference f194802r;

    /* renamed from: s */
    public CheckBoxPreference f194803s;

    /* renamed from: t */
    public CheckBoxPreference f194804t;

    /* renamed from: u */
    public CheckBoxPreference f194805u;

    /* renamed from: v */
    public CheckBoxPreference f194806v;

    /* renamed from: w */
    public KeyValuePreference f194807w;

    /* renamed from: x */
    public KeyValuePreference f194808x;

    /* renamed from: y */
    public NewTipPreference f194809y;

    /* renamed from: z */
    public SharedPreferences f194810z = null;

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$n */
    public class C1176n implements MenuItem.OnMenuItemClickListener {
        public C1176n() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ChatroomInfoUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$o */
    public class C1177o implements C76805e.C76807b {
        public C1177o(ChatroomInfoUI chatroomInfoUI) {
        }

        /* renamed from: a */
        public boolean mo1069a(ViewGroup viewGroup, View view, int i) {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$p */
    public class C1178p implements View.OnClickListener {
        public C1178p(ChatroomInfoUI chatroomInfoUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/ChatroomInfoUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ChatroomInfoUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$LocalHistoryInfo */
    public static class LocalHistoryInfo implements Parcelable {
        public static final Parcelable.Creator<LocalHistoryInfo> CREATOR = new C40199a();

        /* renamed from: d */
        public String f108055d;

        /* renamed from: e */
        public String f108056e;

        /* renamed from: f */
        public String f108057f;

        /* renamed from: g */
        public int f108058g;

        /* renamed from: h */
        public int f108059h;

        /* renamed from: i */
        public String f108060i;

        /* renamed from: j */
        public String f108061j;

        /* renamed from: n */
        public String f108062n;

        /* renamed from: o */
        public int f108063o;

        /* renamed from: p */
        public int f108064p;

        /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$LocalHistoryInfo$a */
        public class C40199a implements Parcelable.Creator<LocalHistoryInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new LocalHistoryInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new LocalHistoryInfo[i];
            }
        }

        public LocalHistoryInfo() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "LocalHistoryInfo{fileid='" + this.f108055d + '\'' + ", aeskey='" + this.f108056e + '\'' + ", filemd5='" + this.f108057f + '\'' + ", filelength=" + this.f108058g + ", msgsount=" + this.f108059h + ", newFormatFileid='" + this.f108060i + '\'' + ", newFormatAeskey='" + this.f108061j + '\'' + ", newFormatFilemd5='" + this.f108062n + '\'' + ", newFormatFilelength=" + this.f108063o + ", newFormatMsgsount=" + this.f108064p + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f108055d);
            parcel.writeString(this.f108056e);
            parcel.writeString(this.f108057f);
            parcel.writeInt(this.f108058g);
            parcel.writeInt(this.f108059h);
            parcel.writeString(this.f108060i);
            parcel.writeString(this.f108061j);
            parcel.writeString(this.f108062n);
            parcel.writeInt(this.f108063o);
            parcel.writeInt(this.f108064p);
        }

        public LocalHistoryInfo(Parcel parcel) {
            this.f108055d = parcel.readString();
            this.f108056e = parcel.readString();
            this.f108057f = parcel.readString();
            this.f108058g = parcel.readInt();
            this.f108059h = parcel.readInt();
            this.f108060i = parcel.readString();
            this.f108061j = parcel.readString();
            this.f108062n = parcel.readString();
            this.f108063o = parcel.readInt();
            this.f108064p = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$k */
    public class C40200k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f108065d;

        public C40200k(int i) {
            this.f108065d = i;
        }

        public void run() {
            ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
            View v = ((C47510b) chatroomInfoUI.f194795h).mo72518v(this.f108065d, chatroomInfoUI.getListView());
            if (v != null) {
                C53534a.m60078a(ChatroomInfoUI.this.getContext(), v);
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$t */
    public static class C40201t implements C75597w2.C31525a {

        /* renamed from: a */
        public String f108067a;

        /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$t$a */
        public class C40202a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f108068d;

            public C40202a(C40201t tVar, String str) {
                this.f108068d = str;
            }

            public void run() {
                C45613m2 mr = ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
                String str = this.f108068d;
                long currentTimeMillis = System.currentTimeMillis();
                C44662n1 n1Var = (C44662n1) mr;
                n1Var.getClass();
                n1Var.f121089d.execSQL("chatroom", "update chatroom set modifytime = " + currentTimeMillis + " where " + "chatroomname" + " = '" + Util.escapeSqlValue(str) + "'");
            }

            public String toString() {
                return super.toString() + "|getContactCallBack";
            }
        }

        public C40201t(String str) {
            this.f108067a = str;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            if (z && this.f108067a.equals(str)) {
                C86709a0.m107525e().postToWorker(new C40202a(this, str));
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$l */
    public class C55180l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f157001d;

        public C55180l(long j) {
            this.f157001d = j;
        }

        public void run() {
            DismissedChatroomInfoReportStruct dismissedChatroomInfoReportStruct = new DismissedChatroomInfoReportStruct();
            dismissedChatroomInfoReportStruct.f154992e = this.f157001d;
            dismissedChatroomInfoReportStruct.f154991d = dismissedChatroomInfoReportStruct.mo86045b("roomUsername", ChatroomInfoUI.this.f194770B, true);
            dismissedChatroomInfoReportStruct.mo86054n();
            Log.m105924i("MicroMsg.ChatroomInfoUI", "24182 action = " + this.f157001d + ",UserRole = " + 0 + ",mRoomId = " + ChatroomInfoUI.this.f194770B);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$a */
    public class C67859a implements Runnable {

        /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$a$a */
        public class C67860a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ List f194814d;

            public C67860a(List list) {
                this.f194814d = list;
            }

            public void run() {
                ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
                if (chatroomInfoUI.f194772D <= 1) {
                    chatroomInfoUI.f194795h.mo72529n("del_selector_btn", true);
                    ContactListExpandPreference contactListExpandPreference = ChatroomInfoUI.this.f194802r;
                    contactListExpandPreference.mo100304N(true);
                    contactListExpandPreference.mo100305P(false);
                    C76803c cVar = contactListExpandPreference.f211662K;
                    if (cVar != null) {
                        ((C72741a) cVar).f211670g.f230157x = false;
                    }
                } else {
                    ContactListExpandPreference contactListExpandPreference2 = chatroomInfoUI.f194802r;
                    contactListExpandPreference2.mo100304N(true);
                    contactListExpandPreference2.mo100305P(ChatroomInfoUI.this.mo93265a8());
                    C76803c cVar2 = contactListExpandPreference2.f211662K;
                    if (cVar2 != null) {
                        ((C72741a) cVar2).f211670g.f230157x = false;
                    }
                }
                ChatroomInfoUI chatroomInfoUI2 = ChatroomInfoUI.this;
                chatroomInfoUI2.f194802r.mo100301K(chatroomInfoUI2.f194770B, this.f194814d);
                ChatroomInfoUI.this.f194802r.mo100306R(true);
            }
        }

        public C67859a() {
        }

        public void run() {
            ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
            if (chatroomInfoUI.f194775G == null) {
                Log.m105928w("MicroMsg.ChatroomInfoUI", "[updateRoomPref] member == null");
                return;
            }
            chatroomInfoUI.f194785R = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69803Yt(ChatroomInfoUI.this.f194770B);
            List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(ChatroomInfoUI.this.f194770B);
            LinkedList<String> linkedList = new LinkedList<>();
            if (k5 != null) {
                linkedList.addAll(k5);
            }
            ChatroomInfoUI.this.f194772D = linkedList.size();
            LinkedList linkedList2 = new LinkedList();
            for (String str : linkedList) {
                if (ChatroomInfoUI.this.f194775G.mo69793u2(str) || ChatroomInfoUI.this.f194775G.mo69796x2(str)) {
                    linkedList2.add(str);
                }
            }
            if (ChatroomInfoUI.this.f194772D > C78565f0.f230132G + 1) {
                LinkedList linkedList3 = new LinkedList(linkedList.subList(0, C78565f0.f230132G + 1));
                Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!linkedList3.contains(str2)) {
                        linkedList3.add(0, str2);
                    }
                }
                linkedList = linkedList3;
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C67860a(linkedList));
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$b */
    public class C67861b implements Runnable {
        public C67861b() {
        }

        public void run() {
            ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
            boolean Hd = ((C53193b) C86312j.m106911c(C53193b.class)).mo73723Hd(ChatroomInfoUI.this.f194770B);
            chatroomInfoUI.getClass();
            ChatBoxGroupActionStruct chatBoxGroupActionStruct = new ChatBoxGroupActionStruct();
            chatBoxGroupActionStruct.f194151d = chatBoxGroupActionStruct.mo86045b("roomUsername", chatroomInfoUI.f194770B, true);
            chatBoxGroupActionStruct.f194152e = (long) 4;
            chatBoxGroupActionStruct.f194153f = Hd ? 1 : 0;
            chatBoxGroupActionStruct.mo86054n();
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$c */
    public class C67862c implements C35488c {
        public C67862c() {
        }

        /* renamed from: a */
        public void mo10150a(int i, int i2, String str, C77084b bVar) {
            C35488c cVar = (C35488c) bVar;
            ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
            C44661m1 m1Var = chatroomInfoUI.f194775G;
            if (m1Var != null) {
                chatroomInfoUI.f194772D = m1Var.mo69790r2().size();
            }
            if ((!ChatroomInfoUI.this.mo93265a8() && ChatroomInfoUI.this.f194772D >= C78565f0.f230132G) || (ChatroomInfoUI.this.mo93265a8() && ChatroomInfoUI.this.f194772D >= C78565f0.f230132G - 1)) {
                ChatroomInfoUI chatroomInfoUI2 = ChatroomInfoUI.this;
                chatroomInfoUI2.f194795h.mo72529n("see_room_member", chatroomInfoUI2.f194793f);
                ChatroomInfoUI chatroomInfoUI3 = ChatroomInfoUI.this;
                chatroomInfoUI3.f194801q.mo69924H(chatroomInfoUI3.getString(C0966R.string.ii9));
            }
            ChatroomInfoUI.this.mo93270e8();
            ChatroomInfoUI.this.mo93271f8();
            ChatroomInfoUI.this.mo93274j8();
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$d */
    public class C67863d extends MMHandler {
        public C67863d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
            boolean z = ChatroomInfoUI.f194768X;
            chatroomInfoUI.mo93274j8();
            String Yt = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69803Yt(chatroomInfoUI.f194770B);
            String str = chatroomInfoUI.f194785R;
            if (str != null && !str.equals(Yt)) {
                chatroomInfoUI.mo93267c1();
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$e */
    public class C67864e implements DialogInterface.OnClickListener {
        public C67864e(ChatroomInfoUI chatroomInfoUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$f */
    public class C67865f implements DialogInterface.OnClickListener {
        public C67865f(ChatroomInfoUI chatroomInfoUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$g */
    public class C67866g implements DialogInterface.OnClickListener {
        public C67866g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14553, 4, 4, ChatroomInfoUI.this.f194770B);
            ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
            chatroomInfoUI.f194783P = true;
            if (!chatroomInfoUI.f194777I) {
                Intent intent = new Intent();
                intent.putExtra("Chat_User", ChatroomInfoUI.this.f194797j.getUsername());
                intent.addFlags(67108864);
                C88144b.m109801s(ChatroomInfoUI.this, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                return;
            }
            chatroomInfoUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$h */
    public class C67867h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f194820d;

        public C67867h(String str) {
            this.f194820d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14553, 4, 3, ChatroomInfoUI.this.f194770B);
            ChatroomInfoUI.this.mo93266b8();
            ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
            chatroomInfoUI.f194783P = false;
            chatroomInfoUI.mo93257S7(chatroomInfoUI.f194770B, this.f194820d);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$i */
    public class C67868i implements DialogInterface.OnCancelListener {
        public C67868i() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            ChatroomInfoUI.this.f194783P = true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$j */
    public class C67869j extends C77086f {

        /* renamed from: d */
        public final /* synthetic */ String f194823d;

        /* renamed from: e */
        public final /* synthetic */ String f194824e;

        public C67869j(String str, String str2) {
            this.f194823d = str;
            this.f194824e = str2;
        }

        /* renamed from: a */
        public void mo10150a(int i, int i2, String str, C77084b bVar) {
            C77086f fVar = (C77086f) bVar;
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = Util.nullAs(str, "");
            objArr[3] = fVar != null ? Integer.valueOf(fVar.f225171a) : "null";
            Log.m105925i("MicroMsg.ChatroomInfoUI", "deleteChatroomImp errType:%s errCode:%s errMsg:%s ret:%s", objArr);
            if (!C72996z1.m85807K5(ChatroomInfoUI.this.f194770B)) {
                ChatroomInfoUI.this.mo93260V7();
                if (this.f225171a == 0) {
                    ChatroomInfoUI.m80223L7(ChatroomInfoUI.this, this.f194824e);
                } else {
                    ChatroomInfoUI.m80222K7(ChatroomInfoUI.this, fVar);
                }
            } else if (this.f225171a == 0) {
                C49786i20 i202 = new C49786i20();
                C51163rv3 rv32 = new C51163rv3();
                rv32.f141175d = Util.nullAsNil(this.f194823d);
                rv32.f141176e = true;
                i202.f135033d = rv32;
                ChatroomInfoUI.this.f194788U = (C72940a) ((C45819c) C86312j.m106911c(C45819c.class)).mo71193qd(true);
                ((C75818e) ChatroomInfoUI.this.f194788U).mo100870b(new C32330n(7, i202));
                C72940a aVar = ChatroomInfoUI.this.f194788U;
                aVar.f212615d = new C68007x(this);
                aVar.mo100865c();
            } else {
                ChatroomInfoUI.this.mo93260V7();
                ChatroomInfoUI.m80222K7(ChatroomInfoUI.this, fVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$m */
    public class C67870m implements Runnable {
        public C67870m() {
        }

        public void run() {
            ChatroomInfoUI.this.f194775G = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(ChatroomInfoUI.this.f194770B);
            C44661m1 m1Var = ChatroomInfoUI.this.f194775G;
            if (m1Var == null) {
                Log.m105920e("MicroMsg.ChatroomInfoUI", "member is null");
            } else if (Util.isNullOrNil(m1Var.field_roomowner)) {
                Log.m105920e("MicroMsg.ChatroomInfoUI", "roomowner is null");
            } else {
                ChatroomInfoUI.this.f194798n.sendEmptyMessage(0);
                ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
                chatroomInfoUI.f194771C = chatroomInfoUI.f194775G.field_roomowner.equals(C75592q0.m90789s());
                ChatroomInfoUI chatroomInfoUI2 = ChatroomInfoUI.this;
                if (!chatroomInfoUI2.f194793f) {
                    ContactListExpandPreference contactListExpandPreference = chatroomInfoUI2.f194802r;
                    String str = chatroomInfoUI2.f194775G.field_roomowner;
                    C76803c cVar = contactListExpandPreference.f211662K;
                    if (cVar != null) {
                        ((C72741a) cVar).f211670g.f230136C = str;
                    }
                }
            }
        }

        public String toString() {
            return super.toString() + "|onNotifyChange";
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$q */
    public class C67871q implements ContactListExpandPreference.C72740a {
        public C67871q() {
        }

        /* renamed from: a */
        public void mo5953a(ViewGroup viewGroup, View view, int i) {
            ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
            boolean z = ChatroomInfoUI.f194768X;
            chatroomInfoUI.mo93254P7();
        }

        /* renamed from: b */
        public void mo5954b(ViewGroup viewGroup, View view, int i) {
        }

        /* renamed from: c */
        public void mo5955c(ViewGroup viewGroup, View view, int i) {
            ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
            boolean z = ChatroomInfoUI.f194768X;
            chatroomInfoUI.mo93253O7();
        }

        /* renamed from: d */
        public void mo5956d(ViewGroup viewGroup, View view, int i) {
            ContactListExpandPreference contactListExpandPreference = ChatroomInfoUI.this.f194802r;
            if (contactListExpandPreference != null) {
                contactListExpandPreference.mo100300J();
            }
        }

        /* renamed from: e */
        public void mo5957e(ViewGroup viewGroup, View view, int i) {
            C44661m1 m1Var;
            Class cls = C75700k0.class;
            String c = C76802a.m92581c(ChatroomInfoUI.this.f194802r, i);
            String nullAsNil = Util.nullAsNil(C76802a.m92580b(ChatroomInfoUI.this.f194802r, i));
            if (Util.isNullOrNil(nullAsNil)) {
                C86709a0.m107528h();
                C44673z4 Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(cls)).mm0()).mo69630Lo(c);
                if (Lo != null && !Util.isNullOrNil(Lo.field_encryptUsername)) {
                    nullAsNil = Lo.field_conRemark;
                }
            }
            if (!Util.isNullOrNil(c)) {
                Intent intent = new Intent();
                intent.putExtra("Contact_User", c);
                intent.putExtra("Contact_RemarkName", nullAsNil);
                ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
                if (chatroomInfoUI.f194796i && (m1Var = chatroomInfoUI.f194775G) != null) {
                    intent.putExtra("Contact_RoomNickname", m1Var.mo69789q2(c));
                }
                intent.putExtra("Contact_Nick", Util.nullAsNil(C76802a.m92579a(ChatroomInfoUI.this.f194802r, i)));
                intent.putExtra("Contact_RoomMember", true);
                intent.putExtra("room_name", ChatroomInfoUI.this.f194797j.getUsername());
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(c);
                if (z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                    SetLocalQQMobileEvent setLocalQQMobileEvent = new SetLocalQQMobileEvent();
                    SetLocalQQMobileEvent.C1133a aVar = setLocalQQMobileEvent.f9501d;
                    aVar.f9503a = intent;
                    aVar.f9504b = c;
                    setLocalQQMobileEvent.publish();
                }
                if (ChatroomInfoUI.this.f194796i) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(219, 9, 1, true);
                    if (z1Var != null && z1Var.mo62916m3()) {
                        nVar.kvStat(10298, z1Var.getUsername() + "," + 14);
                    }
                    intent.putExtra("Contact_Scene", 14);
                }
                intent.putExtra("Is_RoomOwner", ChatroomInfoUI.this.f194771C);
                intent.putExtra("Contact_ChatRoomId", ChatroomInfoUI.this.f194770B);
                if (C72996z1.m85847r5(ChatroomInfoUI.this.f194770B)) {
                    OpenIMChatRoomLogStruct openIMChatRoomLogStruct = new OpenIMChatRoomLogStruct();
                    openIMChatRoomLogStruct.mo93194s(ChatroomInfoUI.this.f194770B);
                    openIMChatRoomLogStruct.f194303e = 12;
                    openIMChatRoomLogStruct.mo86054n();
                }
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 8);
                C88144b.m109791i(ChatroomInfoUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$r */
    public class C67872r implements z3$$g {

        /* renamed from: d */
        public WeakReference<ChatroomInfoUI> f194828d;

        /* renamed from: e */
        public String f194829e;

        public C67872r(ChatroomInfoUI chatroomInfoUI, ChatroomInfoUI chatroomInfoUI2, String str) {
            this.f194828d = new WeakReference<>(chatroomInfoUI2);
            this.f194829e = str;
        }

        /* renamed from: b */
        public boolean mo24603b() {
            if (this.f194828d.get() != null) {
                return ChatroomInfoUI.f194768X;
            }
            return true;
        }

        /* renamed from: c */
        public void mo24604c() {
            ProgressDialog progressDialog;
            ChatroomInfoUI chatroomInfoUI = this.f194828d.get();
            if (!(chatroomInfoUI == null || (progressDialog = chatroomInfoUI.f194791d) == null)) {
                progressDialog.dismiss();
            }
            ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89078iG(this.f194829e);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ChatroomInfoUI$s */
    public class C67873s implements z3$$g {

        /* renamed from: d */
        public WeakReference<ChatroomInfoUI> f194830d;

        /* renamed from: e */
        public String f194831e;

        public C67873s(ChatroomInfoUI chatroomInfoUI, ChatroomInfoUI chatroomInfoUI2, String str) {
            this.f194830d = new WeakReference<>(chatroomInfoUI2);
            this.f194831e = str;
        }

        /* renamed from: b */
        public boolean mo24603b() {
            ChatroomInfoUI chatroomInfoUI = this.f194830d.get();
            if (chatroomInfoUI != null) {
                return chatroomInfoUI.f194783P;
            }
            return true;
        }

        /* renamed from: c */
        public void mo24604c() {
            ChatroomInfoUI chatroomInfoUI = this.f194830d.get();
            if (chatroomInfoUI != null) {
                ProgressDialog progressDialog = chatroomInfoUI.f194792e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (!Util.isNullOrNil(this.f194831e)) {
                    C76912y0.m92768g(chatroomInfoUI, this.f194831e);
                }
            }
        }
    }

    public ChatroomInfoUI() {
        C40008f fVar = C40008f.f107254d;
        this.f194786S = new IListener<GetChatRoomInfoDetailEvent>(fVar) {
            {
                this.__eventId = 944120930;
            }

            public boolean callback(IEvent iEvent) {
                GetChatRoomInfoDetailEvent getChatRoomInfoDetailEvent = (GetChatRoomInfoDetailEvent) iEvent;
                if (!(getChatRoomInfoDetailEvent instanceof GetChatRoomInfoDetailEvent) || !Util.isEqual(getChatRoomInfoDetailEvent.f78814d.f78815a, ChatroomInfoUI.this.f194770B)) {
                    return false;
                }
                ChatroomInfoUI.this.mo93261W7();
                return false;
            }
        };
        this.f194787T = new IListener<NotifyChatRoomStatusChangeEvent>(fVar) {
            {
                this.__eventId = -692279828;
            }

            public boolean callback(IEvent iEvent) {
                NotifyChatRoomStatusChangeEvent notifyChatRoomStatusChangeEvent = (NotifyChatRoomStatusChangeEvent) iEvent;
                if ((notifyChatRoomStatusChangeEvent instanceof NotifyChatRoomStatusChangeEvent) && Util.isEqual(notifyChatRoomStatusChangeEvent.f193752d.f193753a, ChatroomInfoUI.this.f194770B)) {
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(ChatroomInfoUI.this.f194770B);
                    if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                        Log.m105925i("MicroMsg.ChatroomInfoUI", "Get contact from db return null.(username : %s)", ChatroomInfoUI.this.f194770B);
                    } else {
                        Log.m105924i("MicroMsg.ChatroomInfoUI", "try to refresh footer.");
                        ChatroomInfoUI.this.runOnUiThread(new C67991t(this));
                    }
                }
                return false;
            }
        };
        this.f194788U = null;
        this.f194789V = null;
        this.f194790W = 0;
    }

    /* renamed from: I7 */
    public static void m80220I7(ChatroomInfoUI chatroomInfoUI, boolean z) {
        chatroomInfoUI.getClass();
        C115669n.INSTANCE.mo160131h(14553, 3, 2, chatroomInfoUI.f194770B);
        f194768X = false;
        if (z) {
            chatroomInfoUI.f194791d = C76879j.m92723Q(chatroomInfoUI, chatroomInfoUI.getString(C0966R.string.a3h), chatroomInfoUI.getString(C0966R.string.a4d), true, true, new C67961h(chatroomInfoUI));
        }
        String str = null;
        if (!f194768X) {
            str = ((C79012e) C86312j.m106911c(C79012e.class)).rk0(chatroomInfoUI.f194797j.getUsername());
        }
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(chatroomInfoUI.f194770B, 16);
        if (!Util.isNullOrNil(str)) {
            ProgressDialog progressDialog = chatroomInfoUI.f194791d;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            C76879j.m92718L(chatroomInfoUI, false, chatroomInfoUI.getString(C0966R.string.krb, new Object[]{str}), (String) null, chatroomInfoUI.getString(C0966R.string.fey), chatroomInfoUI.getString(C0966R.string.bfd), new C67965i(chatroomInfoUI), new C67968j(chatroomInfoUI), -1, C0966R.color.f3041d1);
            return;
        }
        C34572d0.m40394e(chatroomInfoUI.f194770B);
        C75604z3.m90836h(chatroomInfoUI.f194797j.getUsername(), new C67872r(chatroomInfoUI, chatroomInfoUI, chatroomInfoUI.f194797j.getUsername()));
    }

    /* renamed from: J7 */
    public static void m80221J7(ChatroomInfoUI chatroomInfoUI) {
        chatroomInfoUI.getClass();
        ((C39478b) C86312j.m106911c(C39478b.class)).mo62077Yv(chatroomInfoUI.f194770B);
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(chatroomInfoUI.f194770B, 15);
        C75589l0.m90738d(chatroomInfoUI.f194770B, (List<String>) null, chatroomInfoUI.getResources().getString(C0966R.string.mtr), false, "", 0);
        ((C119157j) C119157j.f356862d).mo183895z(new C1220w(chatroomInfoUI));
    }

    /* renamed from: K7 */
    public static void m80222K7(ChatroomInfoUI chatroomInfoUI, C77086f fVar) {
        String string = chatroomInfoUI.getString(C0966R.string.f7945x2);
        String str = "";
        if (fVar != null) {
            str = Util.nullAs(fVar.f225172b, str);
            string = Util.nullAs(fVar.f225173c, chatroomInfoUI.getString(C0966R.string.f7945x2));
        }
        C76879j.m92748s(chatroomInfoUI, string, str);
    }

    /* renamed from: L7 */
    public static void m80223L7(ChatroomInfoUI chatroomInfoUI, String str) {
        chatroomInfoUI.getClass();
        Class cls = C75700k0.class;
        Log.m105924i("MicroMsg.ChatroomInfoUI", "doDeleteChatroom");
        C75604z3.m90836h(chatroomInfoUI.f194770B, new C67873s(chatroomInfoUI, chatroomInfoUI, str));
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(chatroomInfoUI.f194770B, 15);
        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f(chatroomInfoUI.f194770B);
        String str2 = chatroomInfoUI.f194770B;
        if (!C45612m0.m50709z(str2)) {
            Log.m105920e("MicroMsg.ChatroomMembersLogic", "deleteWholeChatroom: room:[" + str2 + "]");
        } else {
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni();
            if (Ni.mo69709k3(str2)) {
                Ni.mo69688c(str2);
            } else {
                Log.m105920e("MicroMsg.ChatroomMembersLogic", "deleteWholeChatroom RoomName not exist:[" + str2 + "]");
            }
            ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69807jo(str2);
        }
        ((C66190c) C86312j.m106911c(C66190c.class)).o40().mo55891v5(chatroomInfoUI.f194770B);
        FinderLiveTipsBarEvent finderLiveTipsBarEvent = new FinderLiveTipsBarEvent();
        FinderLiveTipsBarEvent.C28745a aVar = finderLiveTipsBarEvent.f78795d;
        aVar.f78796a = 2;
        aVar.f78797b = chatroomInfoUI.f194770B;
        finderLiveTipsBarEvent.publish();
        Intent intent = new Intent();
        intent.addFlags(67108864);
        String packageName = chatroomInfoUI.getPackageName();
        intent.setComponent(new ComponentName(packageName, MMApplicationContext.getSourcePackageName() + ".ui.LauncherUI"));
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(chatroomInfoUI, aVar2.mo10232b(), "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "doDeleteChatroom", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        chatroomInfoUI.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(chatroomInfoUI, "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "doDeleteChatroom", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        chatroomInfoUI.finish();
    }

    /* renamed from: H7 */
    public final void mo93249H7(String str) {
        int g = this.f194795h.mo72523g(str);
        ListView listView = getListView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(g));
        C117292a.m165358d(listView, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "MatteHighLightItem", "(Ljava/lang/String;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        listView.smoothScrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(listView, "com/tencent/mm/chatroom/ui/ChatroomInfoUI", "MatteHighLightItem", "(Ljava/lang/String;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        new MMHandler().postDelayed(new C40200k(g), 10);
    }

    /* renamed from: M7 */
    public final int mo93250M7(int i) {
        C72996z1 z1Var;
        if (!C74560s1.m89277f() || (z1Var = this.f194797j) == null) {
            return i;
        }
        String username = z1Var.getUsername();
        return (C72996z1.m85843n5(username) || C72996z1.m85844o5(username) || C45628s0.m50735A(username)) ? i | TPMediaCodecProfileLevel.HEVCMainTierLevel62 : i & -16777217;
    }

    /* renamed from: N4 */
    public void mo93251N4() {
        mo93274j8();
        C44661m1 m1Var = this.f194775G;
        if (m1Var != null) {
            this.f194772D = m1Var.mo69790r2().size();
        }
        boolean z = this.f194771C;
        if ((!z && this.f194772D >= C78565f0.f230132G) || (z && this.f194772D >= C78565f0.f230132G - 1)) {
            this.f194795h.mo72529n("see_room_member", this.f194793f);
            this.f194801q.mo69924H(getString(C0966R.string.ii9));
        }
    }

    /* renamed from: N7 */
    public void mo93252N7() {
        Class cls = C77569h.class;
        Class cls2 = C75700k0.class;
        if (this.f194810z == null) {
            this.f194810z = getSharedPreferences(this.f194784Q, 0);
        }
        if (this.f194797j != null) {
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69755a0(this.f194797j.getUsername())) {
                C45628s0.m50803u0(this.f194797j.getUsername(), true);
                ((C77569h) C86312j.m106911c(cls)).mo35230Fx(false, this.f194770B, false);
            } else {
                C45628s0.m50787m0(this.f194797j.getUsername(), true, true);
                ((C77569h) C86312j.m106911c(cls)).mo35230Fx(false, this.f194770B, true);
            }
            this.f194810z.edit().putBoolean("room_placed_to_the_top", ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69755a0(this.f194797j.getUsername())).commit();
            mo93269d8();
        }
    }

    /* renamed from: O7 */
    public final void mo93253O7() {
        Class<C78870a> cls = C78870a.class;
        Class<C78889f0> cls2 = C78889f0.class;
        Class<C78877c0> cls3 = C78877c0.class;
        Class<C65764a> cls4 = C65764a.class;
        Class<C78444g> cls5 = C78444g.class;
        Class<C78904i> cls6 = C78904i.class;
        Class<C14193c> cls7 = C14193c.class;
        String str = ".ui.mvvm.MvvmSelectContactUI";
        Class<C78917n> cls8 = C78917n.class;
        Class<C78928r> cls9 = C78928r.class;
        Class<C78938y> cls10 = C78938y.class;
        if (this.f194796i) {
            boolean z = C72996z1.m85807K5(this.f194770B) && !C45628s0.m50735A(this.f194797j.getUsername());
            C115669n.INSTANCE.idkeyStat(219, 7, 1, true);
            Class<C78870a> cls11 = cls;
            List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(this.f194770B);
            String listToString = Util.listToString(k5, ",");
            if (k5 != null) {
                this.f194772D = k5.size();
            }
            Intent intent = new Intent();
            Class<C78889f0> cls12 = cls2;
            intent.putExtra("titile", getString(C0966R.string.f7496hv));
            intent.putExtra("list_type", 1);
            C74560s1.m89276e();
            intent.putExtra("list_attr", mo93250M7(C74560s1.f219162c));
            intent.putExtra("always_select_contact", listToString);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
            intent.putExtra("KBlockOpenImFav", z);
            intent.putExtra("chatroomName", this.f194770B);
            intent.putExtra("block_contact", Util.setToString(C74560s1.m89274c(), ","));
            if (z) {
                C79062b.m95631b(intent, C67995a.class);
                C79062b.m95631b(intent, C78163d.class);
            } else {
                C79062b.m95631b(intent, cls7);
                C79062b.m95631b(intent, cls6);
            }
            C79062b.m95631b(intent, C78436b.class);
            C79062b.m95631b(intent, cls5);
            C79062b.m95631b(intent, cls4);
            C79062b.m95631b(intent, cls3);
            C79062b.m95631b(intent, cls12);
            C79062b.m95631b(intent, cls11);
            C79062b.m95631b(intent, cls10);
            C79062b.m95631b(intent, C78944z.class);
            C79062b.m95631b(intent, cls9);
            C79062b.m95631b(intent, cls8);
            C88144b.m109802t(this, str, intent, 1);
            return;
        }
        Class<C78889f0> cls13 = cls2;
        Class<C78870a> cls14 = cls;
        C115669n.INSTANCE.kvStat(10170, "1");
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f194770B);
        linkedList.add(C75592q0.m90789s());
        String listToString2 = Util.listToString(linkedList, ",");
        Intent intent2 = new Intent();
        intent2.putExtra("titile", getString(C0966R.string.f7495ht));
        intent2.putExtra("list_type", 0);
        C74560s1.m89276e();
        intent2.putExtra("list_attr", mo93250M7(C74560s1.f219163d));
        intent2.putExtra("always_select_contact", listToString2);
        intent2.putExtra("create_group_recommend", true);
        intent2.putExtra("block_contact", Util.setToString(C74560s1.m89274c(), ","));
        C79062b.m95631b(intent2, cls7);
        C79062b.m95631b(intent2, cls6);
        C79062b.m95631b(intent2, cls5);
        C79062b.m95631b(intent2, cls4);
        C79062b.m95631b(intent2, cls3);
        C79062b.m95631b(intent2, cls13);
        C79062b.m95631b(intent2, cls14);
        C79062b.m95631b(intent2, cls10);
        C79062b.m95631b(intent2, cls9);
        C79062b.m95631b(intent2, cls8);
        C88144b.m109801s(this, str, intent2, (Bundle) null);
    }

    /* renamed from: P7 */
    public final void mo93254P7() {
        C115669n.INSTANCE.idkeyStat(219, 8, 1, true);
        List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(this.f194770B);
        String listToString = Util.listToString(k5, ",");
        this.f194772D = k5.size();
        Intent intent = new Intent();
        intent.putExtra("RoomInfo_Id", this.f194770B);
        intent.putExtra("Is_Chatroom", true);
        intent.putExtra("Chatroom_member_list", listToString);
        intent.putExtra("room_member_count", this.f194772D);
        intent.putExtra("Is_RoomOwner", this.f194771C);
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219162c);
        intent.putExtra("room_name", this.f194797j.getUsername());
        intent.putExtra("room_owner_name", this.f194775G.field_roomowner);
        intent.setClass(this, SelectDelMemberUI.class);
        startActivityForResult(intent, 7);
    }

    /* renamed from: Q7 */
    public void mo93255Q7(Boolean bool) {
        Class cls = C34010q0.class;
        Class cls2 = C39479c.class;
        Class cls3 = C75700k0.class;
        if (this.f194810z == null) {
            this.f194810z = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (bool != null) {
            this.f194810z.edit().putBoolean("room_set_to_conv_box", bool.booleanValue()).apply();
        }
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls3)).mo96094Ku()).mo69771j(this.f194770B);
        if (j == null) {
            j = new C72976h2(this.f194770B);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls3)).mo96094Ku()).mo69751W(j);
        }
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls2)).mo62084mr()).mo69799Lo(this.f194770B);
        String s = C75592q0.m90789s();
        if (Lo != null && !Util.isNullOrNil(s)) {
            if (this.f194810z == null) {
                this.f194810z = getSharedPreferences(getPackageName() + "_preferences", 0);
            }
            if (this.f194810z.getBoolean("room_set_to_conv_box", false)) {
                if (this.f194810z.getBoolean("room_placed_to_the_top", false)) {
                    mo93252N7();
                    j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls3)).mo96094Ku()).mo69771j(this.f194770B);
                    Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls2)).mo62084mr()).mo69799Lo(this.f194770B);
                }
                ((C34010q0) C86312j.m106911c(cls)).Ga0(Lo, j, this.f194770B, s);
                boolean z = ((Integer) C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Chat_ConvBoxGuide_Int, 0)).intValue() == 1;
                boolean z2 = this.f194810z.getBoolean("is_show_conv_box_guide", false);
                if (z || !z2) {
                    String str = this.f194770B;
                    ChatBoxGroupActionStruct chatBoxGroupActionStruct = new ChatBoxGroupActionStruct();
                    chatBoxGroupActionStruct.f194151d = chatBoxGroupActionStruct.mo86045b("roomUsername", str, true);
                    chatBoxGroupActionStruct.f194152e = 2;
                    chatBoxGroupActionStruct.mo86054n();
                    C77407n nVar = new C77407n((Context) this, 1, false);
                    View inflate = View.inflate(this, C0966R.C0971layout.f7096y5, (ViewGroup) null);
                    PAGView pAGView = (PAGView) inflate.findViewById(C0966R.C0970id.bt4);
                    pAGView.setComposition(PAGFile.Load(getAssets(), "conv_box_guide_navigation.pag"));
                    pAGView.setRepeatCount(0);
                    pAGView.play();
                    ((Button) inflate.findViewById(C0966R.C0970id.f357798bt2)).setOnClickListener(new C14872b(nVar));
                    ((TextView) inflate.findViewById(C0966R.C0970id.f357799bt3)).setOnClickListener(new C78416c(nVar, this, str));
                    nVar.f225771i = new C52916d(nVar, inflate);
                    nVar.f225761d = new C78417e(pAGView);
                    nVar.mo107559d(true);
                    nVar.mo107573q();
                    this.f194810z.edit().putBoolean("is_show_conv_box_guide", true).apply();
                }
            } else {
                ((C34010q0) C86312j.m106911c(cls)).mo59403bN(Lo, j, this.f194770B, s);
            }
            mo93269d8();
        }
    }

    /* renamed from: R7 */
    public final void mo93256R7(String str) {
        Class cls = C75700k0.class;
        C34572d0.m40394e(this.f194770B);
        C115669n.INSTANCE.mo160131h(14553, 4, 2, this.f194770B);
        long y2 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Rx0(this.f194770B).mo108774y2();
        C50904q20 q202 = new C50904q20();
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = Util.nullAsNil(this.f194770B);
        rv32.f141176e = true;
        q202.f140097d = rv32;
        q202.f140099f = y2;
        ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(8, q202));
        this.f194783P = false;
        mo93266b8();
        String str2 = null;
        if (!this.f194783P) {
            str2 = ((C79012e) C86312j.m106911c(C79012e.class)).rk0(this.f194797j.getUsername());
        }
        if (!Util.isNullOrNil(str2)) {
            mo93260V7();
            C76879j.m92718L(this, false, getString(C0966R.string.krc, new Object[]{str2}), (String) null, getString(C0966R.string.fey), getString(C0966R.string.i65), new C67866g(), new C67867h(str), -1, C0966R.color.f3041d1);
            return;
        }
        mo93257S7(this.f194770B, str);
    }

    /* renamed from: S7 */
    public void mo93257S7(String str, String str2) {
        Log.m105925i("MicroMsg.ChatroomInfoUI", "delete chatroom %s", str);
        C72940a b = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(str).mo71491b(str, true);
        this.f194788U = b;
        b.f212615d = new C67869j(str, str2);
        b.mo100865c();
    }

    /* renamed from: T7 */
    public final void mo93258T7(boolean z, String str) {
        Class cls = C66190c.class;
        String str2 = this.f194770B;
        if (str2 == null || str2.length() <= 0) {
            Log.m105920e("MicroMsg.ChatroomInfoUI", "quitChatRoom : invalid args");
            return;
        }
        if (z) {
            TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
            talkRoomServerEvent.f154883d.f154886b = true;
            talkRoomServerEvent.publish();
        }
        if (!((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69709k3(this.f194770B)) {
            Log.m105920e("MicroMsg.ChatroomInfoUI", "quitChatRoom : room[" + this.f194770B + "] is not exist");
        } else if (((C66190c) C86312j.m106911c(cls)).mo89931F()) {
            C76879j.m92754y(getContext(), getString(C0966R.string.b4h), (String) null, getString(C0966R.string.f8029zr), new C67865f(this));
        } else {
            if (((C66190c) C86312j.m106911c(cls)).mo89933L5()) {
                ((C66190c) C86312j.m106911c(cls)).ud0(getContext());
            }
            mo93256R7(str);
            ((C28139e) C86312j.m106911c(C28139e.class)).mo55813T5(this.f194770B);
        }
    }

    /* renamed from: U7 */
    public final void mo93259U7(int i, String str) {
        Class cls = C66190c.class;
        if (i != 0) {
            Log.m105918d("MicroMsg.ChatroomInfoUI", "dz[dealQuitChatRoom owner click cancel]");
            return;
        }
        Log.m105918d("MicroMsg.ChatroomInfoUI", "dz[dealQuitChatRoom owner click room_owner_delete_direct]");
        if (((C66190c) C86312j.m106911c(cls)).mo89931F()) {
            C76879j.m92754y(getContext(), getString(C0966R.string.b4h), (String) null, getString(C0966R.string.f8029zr), new C67864e(this));
            return;
        }
        if (((C66190c) C86312j.m106911c(cls)).mo89933L5()) {
            ((C66190c) C86312j.m106911c(cls)).ud0(getContext());
        }
        mo93256R7(str);
        ((C28139e) C86312j.m106911c(C28139e.class)).mo55813T5(this.f194770B);
    }

    /* renamed from: V7 */
    public final void mo93260V7() {
        ProgressDialog progressDialog = this.f194792e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: W7 */
    public final void mo93261W7() {
        Log.m105925i("MicroMsg.ChatroomInfoUI", "[doChatroomDetailCgi] :%s", this.f194770B);
        C72940a o = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(this.f194770B).mo71504o(this.f194770B);
        o.f212613b = new C67862c();
        o.mo100865c();
    }

    /* renamed from: X7 */
    public void mo93262X7(long j) {
        ((C119157j) C119157j.f356862d).mo183875f(new C55180l(j));
    }

    /* renamed from: Y7 */
    public final void mo93263Y7() {
        if (this.f194793f) {
            this.f194795h.mo72529n("room_name", true);
            this.f194795h.mo72529n("room_qr_code", true);
            this.f194795h.mo72529n("manage_room", true);
            this.f194795h.mo72529n("see_room_member", true);
            this.f194795h.mo72529n("room_card", true);
            this.f194795h.mo72529n("room_upgrade_entry", true);
            this.f194795h.mo72529n("chatroom_info_chexboxes", true);
            this.f194795h.mo72529n("room_special_follow_member", true);
            this.f194795h.mo72529n("room_nickname", true);
            this.f194795h.mo72529n("room_openim_about", true);
            this.f194795h.mo72529n("roominfo_contact_anchor_small_category", true);
            this.f194795h.mo72529n("room_clear_chatting_history", true);
            setMMTitle(getString(C0966R.string.i75));
        }
    }

    /* renamed from: Z7 */
    public final boolean mo93264Z7() {
        return !(Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("WeComWatchMemberEntry"), 0) == 1) && C45628s0.m50735A(this.f194770B);
    }

    /* renamed from: a8 */
    public final boolean mo93265a8() {
        C44661m1 m1Var = this.f194775G;
        return m1Var != null && m1Var.mo69797y2();
    }

    /* renamed from: b8 */
    public final void mo93266b8() {
        ProgressDialog progressDialog = this.f194792e;
        if (progressDialog == null) {
            this.f194792e = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, false, new C67868i());
            return;
        }
        progressDialog.show();
    }

    /* renamed from: c1 */
    public void mo93267c1() {
        if (!this.f194793f && this.f194802r != null) {
            if (this.f194796i) {
                mo93272g8();
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(this.f194770B);
                this.f194802r.mo100301K(this.f194770B, linkedList);
            }
            this.f194802r.mo69931v();
        }
        boolean yu = ((C39479c) C86709a0.m107533q(C39479c.class)).mo62087yu(this.f194770B);
        if (!mo93265a8()) {
            this.f194795h.mo72529n("manage_room", true);
            this.f194795h.mo72529n("room_manager_view", !yu);
        } else {
            this.f194795h.mo72529n("room_manager_view", true);
            this.f194795h.mo72529n("manage_room", false);
        }
        if (this.f194793f) {
            this.f194795h.mo72529n("manage_room", true);
        }
        if ((mo93265a8() || this.f194772D < C78565f0.f230132G) && (!mo93265a8() || this.f194772D < C78565f0.f230132G - 1)) {
            this.f194795h.mo72529n("see_room_member", true);
        } else {
            this.f194795h.mo72529n("see_room_member", this.f194793f);
            this.f194801q.mo69924H(getString(C0966R.string.ii9));
        }
        if (C72996z1.m85847r5(this.f194770B)) {
            this.f194795h.mo72529n("room_manager_view", true);
        }
        this.f194795h.notifyDataSetChanged();
    }

    /* renamed from: c8 */
    public final void mo93268c8() {
        if (this.f194810z == null) {
            this.f194810z = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        C72996z1 z1Var = this.f194797j;
        if (z1Var != null) {
            if (this.f194796i) {
                this.f194773E = z1Var.f149512S == 0;
            } else {
                this.f194773E = C45628s0.m50746K(z1Var);
            }
        }
        ((C13925a) C39818r.f106831a.mo62444c(getContext()).mo75002a(C13925a.class)).setValue("is_mute", this.f194773E ? getResources().getString(C0966R.string.bvl) : "");
        if (this.f194773E) {
            setTitleMuteIconVisibility(0);
            if (this.f194803s != null) {
                this.f194810z.edit().putBoolean("room_notify_new_msg", true).commit();
            }
        } else {
            setTitleMuteIconVisibility(8);
            if (this.f194803s != null) {
                this.f194810z.edit().putBoolean("room_notify_new_msg", false).commit();
            }
        }
        mo93273i8(this.f194773E);
        if (this.f194795h.mo72522f("room_set_to_conv_box")) {
            ((C119157j) C119157j.f356862d).mo183875f(new C67861b());
        }
        boolean z = this.f194773E;
        ChatBoxGroupActionStruct chatBoxGroupActionStruct = new ChatBoxGroupActionStruct();
        chatBoxGroupActionStruct.f194151d = chatBoxGroupActionStruct.mo86045b("roomUsername", this.f194770B, true);
        chatBoxGroupActionStruct.f194152e = (long) 12;
        chatBoxGroupActionStruct.f194153f = z ? 1 : 0;
        chatBoxGroupActionStruct.mo86054n();
        this.f194795h.notifyDataSetChanged();
    }

    public C73244a createAdapter(SharedPreferences sharedPreferences) {
        return new C47510b(this, getListView(), sharedPreferences);
    }

    /* renamed from: d8 */
    public final void mo93269d8() {
        if (this.f194810z == null) {
            this.f194810z = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f194810z.getBoolean("room_set_to_conv_box", false)) {
            CheckBoxPreference checkBoxPreference = this.f194806v;
            checkBoxPreference.f24212L = true;
            checkBoxPreference.f24211K = true;
            checkBoxPreference.mo7737P();
            return;
        }
        CheckBoxPreference checkBoxPreference2 = this.f194806v;
        checkBoxPreference2.f24212L = false;
        checkBoxPreference2.mo69932y(true);
        CheckBoxPreference checkBoxPreference3 = this.f194806v;
        checkBoxPreference3.f24211K = false;
        checkBoxPreference3.mo7737P();
    }

    /* renamed from: e8 */
    public final void mo93270e8() {
        Class cls = C76979h.class;
        if (this.f194797j != null && this.f194799o != null) {
            String d = C45612m0.m50687d(this.f194770B);
            boolean z = true;
            if (d == null || d.length() <= 0) {
                this.f194799o.f10255P = false;
            } else {
                RoomCardPreference roomCardPreference = this.f194799o;
                roomCardPreference.f10255P = true;
                roomCardPreference.f10252L = ((C76979h) C86312j.m106911c(cls)).mo107057T1(this, d);
            }
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f194770B);
            this.f194797j = z1Var;
            String nickname = z1Var.getNickname();
            if (Util.isNullOrNil(nickname) || nickname.length() > 50) {
                z = false;
            }
            if (z) {
                String f = this.f194797j.mo62898f();
                RoomCardPreference roomCardPreference2 = this.f194799o;
                C76979h hVar = (C76979h) C86312j.m106911c(cls);
                if (f.length() <= 0) {
                    f = getString(C0966R.string.iyt);
                }
                roomCardPreference2.f10251K = hVar.mo107057T1(this, f);
            } else {
                this.f194799o.f10251K = getString(C0966R.string.i6y);
            }
            this.f194795h.notifyDataSetChanged();
        }
    }

    /* renamed from: f8 */
    public final void mo93271f8() {
        if (this.f194797j != null && this.f194800p != null) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f194770B);
            this.f194797j = z1Var;
            String nickname = z1Var.getNickname();
            if (!Util.isNullOrNil(nickname) && nickname.length() <= 50) {
                String j3 = this.f194797j.mo62909j3();
                Preference preference = this.f194800p;
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                if (j3.length() <= 0) {
                    j3 = getString(C0966R.string.iyt);
                }
                preference.mo7741E(hVar.mo107057T1(this, j3));
                C47511g gVar = this.f194795h;
                if (gVar != null) {
                    gVar.notifyDataSetChanged();
                    return;
                }
                return;
            }
            this.f194800p.mo7741E(getString(C0966R.string.i6y));
        }
    }

    /* renamed from: g8 */
    public final void mo93272g8() {
        if (this.f194793f || this.f194802r == null) {
            return;
        }
        if (this.f194796i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C67859a());
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f194770B);
        this.f194802r.mo100301K(this.f194770B, linkedList);
    }

    public int getResourceId() {
        return C0966R.xml.f8933di;
    }

    /* renamed from: i8 */
    public final void mo93273i8(boolean z) {
        if (!C72996z1.m85807K5(this.f194770B)) {
            this.f194795h.mo72529n("room_special_follow_member", true);
            this.f194795h.mo72529n("room_set_to_conv_box", true);
        } else if (mo93264Z7()) {
            this.f194795h.mo72529n("room_special_follow_member", true);
            this.f194795h.mo72529n("room_set_to_conv_box", true);
        } else {
            if (this.f194793f) {
                this.f194795h.mo72529n("room_special_follow_member", true);
            } else {
                this.f194795h.mo72529n("room_special_follow_member", !z);
            }
            this.f194795h.mo72529n("room_set_to_conv_box", !z);
            if (z && !this.f194781M) {
                this.f194781M = true;
                ChatSpecialAttentionLogStruct chatSpecialAttentionLogStruct = new ChatSpecialAttentionLogStruct();
                chatSpecialAttentionLogStruct.f107866d = 1;
                chatSpecialAttentionLogStruct.f107867e = chatSpecialAttentionLogStruct.mo86045b("roomUsername", this.f194770B, true);
                chatSpecialAttentionLogStruct.mo86054n();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0376  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r20 = this;
            r0 = r20
            com.tencent.mm.chatroom.ui.ChatroomInfoUI$n r1 = new com.tencent.mm.chatroom.ui.ChatroomInfoUI$n
            r1.<init>()
            r0.setBackBtn(r1)
            pj3.g r1 = r20.getPreferenceScreen()
            r0.f194795h = r1
            boolean r1 = r0.f194796i
            r2 = 1
            if (r1 == 0) goto L_0x044f
            int r1 = r0.f194772D
            r3 = 2131835089(0x7f1138d1, float:1.9303307E38)
            r4 = 0
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r0.getString(r3)
            r0.setMMTitle((java.lang.String) r1)
            goto L_0x004e
        L_0x0025:
            com.tencent.mm.storage.m1 r1 = r0.f194775G
            if (r1 == 0) goto L_0x0033
            java.util.List r1 = r1.mo69790r2()
            int r1 = r1.size()
            r0.f194772D = r1
        L_0x0033:
            r1 = 2131830309(0x7f112625, float:1.9293612E38)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r3 = r0.getString(r3)
            r5[r4] = r3
            int r3 = r0.f194772D
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r2] = r3
            java.lang.String r1 = r0.getString(r1, r5)
            r0.setMMTitle((java.lang.String) r1)
        L_0x004e:
            com.tencent.mm.storage.m1 r1 = r0.f194775G
            if (r1 == 0) goto L_0x005f
            java.lang.String r5 = r1.field_roomowner
            java.util.List r1 = r1.mo69790r2()
            int r1 = r1.size()
            r0.f194772D = r1
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r1 == 0) goto L_0x0069
            r0.f194771C = r4
            goto L_0x0073
        L_0x0069:
            java.lang.String r1 = eb0.C75592q0.m90789s()
            boolean r1 = r5.equals(r1)
            r0.f194771C = r1
        L_0x0073:
            java.lang.Class<a11.c> r1 = a11.C39479c.class
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            java.lang.String r6 = "MicroMsg.ChatroomInfoUI"
            java.lang.String r7 = "initBaseChatRoomView()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
            pj3.g r7 = r0.f194795h
            java.lang.String r8 = "roominfo_contact_anchor"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r8)
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference r7 = (com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference) r7
            r0.f194802r = r7
            pj3.g r8 = r0.f194795h
            java.lang.String r9 = r7.f121285r
            r7.mo100302L(r8, r9)
            pj3.g r7 = r0.f194795h
            java.lang.String r8 = "room_name"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r8)
            r0.f194800p = r7
            pj3.g r7 = r0.f194795h
            java.lang.String r9 = "room_card"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r9)
            com.tencent.mm.chatroom.ui.preference.RoomCardPreference r7 = (com.tencent.p014mm.chatroom.p015ui.preference.RoomCardPreference) r7
            r0.f194799o = r7
            pj3.g r7 = r0.f194795h
            java.lang.String r10 = "see_room_member"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r10)
            r0.f194801q = r7
            pj3.g r7 = r0.f194795h
            java.lang.String r11 = "room_special_follow_member"
            r7.mo72519a(r11)
            pj3.g r7 = r0.f194795h
            java.lang.String r11 = "room_notify_new_msg"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r11)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r7 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r7
            r0.f194803s = r7
            pj3.g r7 = r0.f194795h
            java.lang.String r11 = "room_save_to_contact"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r11)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r7 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r7
            r0.f194804t = r7
            pj3.g r7 = r0.f194795h
            java.lang.String r12 = "room_set_to_conv_box"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r12)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r7 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r7
            r0.f194805u = r7
            pj3.g r7 = r0.f194795h
            java.lang.String r13 = "room_placed_to_the_top"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r13)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r7 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r7
            r0.f194806v = r7
            pj3.g r7 = r0.f194795h
            java.lang.String r14 = "room_nickname"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r14)
            com.tencent.mm.ui.base.preference.KeyValuePreference r7 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r7
            r0.f194807w = r7
            pj3.g r7 = r0.f194795h
            java.lang.String r14 = "room_remark"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r14)
            com.tencent.mm.ui.base.preference.KeyValuePreference r7 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r7
            r0.f194808x = r7
            pj3.g r7 = r0.f194795h
            java.lang.String r14 = "manage_room"
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r14)
            com.tencent.mm.plugin.newtips.NewTipPreference r7 = (com.tencent.p014mm.plugin.newtips.NewTipPreference) r7
            r0.f194809y = r7
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference r7 = r0.f194802r
            r7.mo100304N(r2)
            r7.mo100305P(r2)
            mp.c r7 = r7.f211662K
            if (r7 == 0) goto L_0x011e
            com.tencent.mm.pluginsdk.ui.applet.a r7 = (com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a) r7
            wd3.f0 r7 = r7.f211670g
            r7.f230157x = r4
        L_0x011e:
            com.tencent.mm.storage.z1 r7 = r0.f194797j
            if (r7 == 0) goto L_0x0136
            boolean r15 = r0.f194796i
            if (r15 == 0) goto L_0x0130
            int r7 = r7.f149512S
            if (r7 != 0) goto L_0x012c
            r7 = 1
            goto L_0x012d
        L_0x012c:
            r7 = 0
        L_0x012d:
            r0.f194773E = r7
            goto L_0x0136
        L_0x0130:
            boolean r7 = eb0.C45628s0.m50746K(r7)
            r0.f194773E = r7
        L_0x0136:
            boolean r7 = r0.f194773E
            r0.mo93273i8(r7)
            k40.a r7 = f40.C86709a0.m107533q(r1)
            a11.c r7 = (a11.C39479c) r7
            java.lang.String r15 = r0.f194770B
            boolean r7 = r7.mo62087yu(r15)
            boolean r15 = r20.mo93265a8()
            java.lang.String r3 = "room_manager_view"
            if (r15 != 0) goto L_0x015b
            pj3.g r15 = r0.f194795h
            r15.mo72529n(r14, r2)
            pj3.g r15 = r0.f194795h
            r7 = r7 ^ r2
            r15.mo72529n(r3, r7)
            goto L_0x0165
        L_0x015b:
            pj3.g r7 = r0.f194795h
            r7.mo72529n(r3, r2)
            pj3.g r3 = r0.f194795h
            r3.mo72529n(r14, r4)
        L_0x0165:
            boolean r3 = r0.f194793f
            if (r3 == 0) goto L_0x016e
            pj3.g r3 = r0.f194795h
            r3.mo72529n(r14, r2)
        L_0x016e:
            java.lang.String r3 = r0.f194770B
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85807K5(r3)
            if (r3 == 0) goto L_0x01e6
            boolean r3 = eb0.C45612m0.m50704u()
            if (r3 == 0) goto L_0x01e6
            k40.a r3 = f40.C86709a0.m107533q(r1)
            a11.c r3 = (a11.C39479c) r3
            eb0.m2 r3 = r3.mo62084mr()
            java.lang.String r7 = r0.f194770B
            com.tencent.mm.storage.n1 r3 = (com.tencent.p014mm.storage.C44662n1) r3
            com.tencent.mm.storage.m1 r3 = r3.mo69799Lo(r7)
            if (r3 == 0) goto L_0x01e6
            int r3 = r3.field_chatroomStatus
            long r14 = (long) r3
            r16 = 131072(0x20000, double:6.47582E-319)
            long r18 = r14 & r16
            int r3 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x01e6
            r16 = 65536(0x10000, double:3.2379E-319)
            long r14 = r14 & r16
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x01e6
            java.lang.String r3 = "room_upgrade_to_wework"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            java.lang.String r7 = "enter_show"
            boolean r3 = r3.getBoolean(r7, r4)
            if (r3 == 0) goto L_0x01e6
            r0.f194780L = r2
            com.tencent.mm.plugin.newtips.NewTipPreference r3 = r0.f194809y
            pj3.g r7 = r0.f194795h
            r3.getClass()
            java.lang.ref.WeakReference r14 = new java.lang.ref.WeakReference
            r14.<init>(r7)
            r3.f115227P = r14
            java.lang.Class<nv.g> r3 = p626nv.C109759g.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            nv.g r3 = (p626nv.C109759g) r3
            nv.e r3 = r3.V40()
            com.tencent.mm.plugin.newtips.NewTipPreference r7 = r0.f194809y
            com.tencent.mm.plugin.newtips.model.l r3 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r3
            r3.mo175770k(r7)
            com.tencent.mm.plugin.newtips.NewTipPreference r3 = r0.f194809y
            r3.getClass()
            java.lang.Class<nv.f> r7 = p626nv.C47300f.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            nv.f r7 = (p626nv.C47300f) r7
            r7.mo72343o0(r3)
        L_0x01e6:
            com.tencent.mm.storage.m1 r3 = r0.f194775G
            if (r3 == 0) goto L_0x01f8
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference r7 = r0.f194802r
            java.lang.String r3 = r3.field_roomowner
            mp.c r7 = r7.f211662K
            if (r7 == 0) goto L_0x01f8
            com.tencent.mm.pluginsdk.ui.applet.a r7 = (com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a) r7
            wd3.f0 r7 = r7.f211670g
            r7.f230136C = r3
        L_0x01f8:
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference r3 = r0.f194802r
            mp.c r3 = r3.f211662K
            if (r3 == 0) goto L_0x0205
            com.tencent.mm.pluginsdk.ui.applet.a r3 = (com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a) r3
            wd3.f0 r3 = r3.f211670g
            r3.getClass()
        L_0x0205:
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference r3 = r0.f194802r
            mp.c r3 = r3.f211662K
            if (r3 == 0) goto L_0x020f
            com.tencent.mm.pluginsdk.ui.applet.a r3 = (com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a) r3
            r3.f211668e = r4
        L_0x020f:
            pj3.g r3 = r0.f194795h
            r3.mo72529n(r8, r4)
            pj3.g r3 = r0.f194795h
            java.lang.String r7 = "room_qr_code"
            r3.mo72529n(r7, r4)
            pj3.g r3 = r0.f194795h
            java.lang.String r7 = "chatroom_info_chexboxes"
            r3.mo72529n(r7, r2)
            pj3.g r3 = r0.f194795h
            r3.mo72529n(r9, r4)
            pj3.g r3 = r0.f194795h
            java.lang.String r7 = "room_upgrade_entry"
            r3.mo72529n(r7, r2)
            pj3.g r3 = r0.f194795h
            r3.mo72529n(r12, r2)
            boolean r3 = r20.mo93265a8()
            if (r3 != 0) goto L_0x023f
            int r3 = r0.f194772D
            int r7 = wd3.C78565f0.f230132G
            if (r3 >= r7) goto L_0x024c
        L_0x023f:
            boolean r3 = r20.mo93265a8()
            if (r3 == 0) goto L_0x0260
            int r3 = r0.f194772D
            int r7 = wd3.C78565f0.f230132G
            int r7 = r7 - r2
            if (r3 < r7) goto L_0x0260
        L_0x024c:
            pj3.g r3 = r0.f194795h
            boolean r7 = r0.f194793f
            r3.mo72529n(r10, r7)
            com.tencent.mm.ui.base.preference.Preference r3 = r0.f194801q
            r7 = 2131835469(0x7f113a4d, float:1.9304077E38)
            java.lang.String r7 = r0.getString(r7)
            r3.mo69924H(r7)
            goto L_0x0265
        L_0x0260:
            pj3.g r3 = r0.f194795h
            r3.mo72529n(r10, r2)
        L_0x0265:
            java.lang.String r3 = r0.f194770B
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85844o5(r3)
            java.lang.String r7 = "room_openim_about"
            if (r3 != 0) goto L_0x0275
            pj3.g r3 = r0.f194795h
            r3.mo72529n(r7, r2)
            goto L_0x02b4
        L_0x0275:
            pj3.g r3 = r0.f194795h
            java.lang.String r8 = "chatroom_bottom_pc"
            r3.mo72529n(r8, r2)
            pj3.g r3 = r0.f194795h
            r3.mo72529n(r7, r4)
            r3 = 2131835007(0x7f11387f, float:1.930314E38)
            java.lang.String r3 = r0.getString(r3)
            r8 = 2131835008(0x7f113880, float:1.9303142E38)
            java.lang.String r8 = r0.getString(r8)
            int r9 = r3.lastIndexOf(r8)
            if (r9 >= 0) goto L_0x0296
            goto L_0x02b4
        L_0x0296:
            int r8 = r8.length()
            int r8 = r8 + r9
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>(r3)
            com.tencent.mm.chatroom.ui.e0 r3 = new com.tencent.mm.chatroom.ui.e0
            r14 = 0
            r3.<init>(r0, r2, r14)
            r14 = 18
            r10.setSpan(r3, r9, r8, r14)
            pj3.g r3 = r0.f194795h
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r7)
            r3.mo69924H(r10)
        L_0x02b4:
            java.lang.String r3 = "updatePlaceTop()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            android.content.SharedPreferences r3 = r0.f194810z
            java.lang.String r7 = "_preferences"
            if (r3 != 0) goto L_0x02d9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = r20.getPackageName()
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r4)
            r0.f194810z = r3
        L_0x02d9:
            com.tencent.mm.ui.base.preference.CheckBoxPreference r3 = r0.f194806v
            if (r3 == 0) goto L_0x0312
            com.tencent.mm.storage.z1 r3 = r0.f194797j
            if (r3 == 0) goto L_0x0305
            android.content.SharedPreferences r3 = r0.f194810z
            android.content.SharedPreferences$Editor r3 = r3.edit()
            k40.a r8 = f40.C86709a0.m107533q(r5)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.v3 r8 = r8.mo96094Ku()
            com.tencent.mm.storage.z1 r9 = r0.f194797j
            java.lang.String r9 = r9.getUsername()
            com.tencent.mm.storage.i2 r8 = (com.tencent.p014mm.storage.C44660i2) r8
            boolean r8 = r8.mo69755a0(r9)
            android.content.SharedPreferences$Editor r3 = r3.putBoolean(r13, r8)
            r3.commit()
            goto L_0x0312
        L_0x0305:
            android.content.SharedPreferences r3 = r0.f194810z
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.putBoolean(r13, r4)
            r3.commit()
        L_0x0312:
            pj3.g r3 = r0.f194795h
            r3.notifyDataSetChanged()
            java.lang.String r3 = "updateSaveToContact()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            android.content.SharedPreferences r3 = r0.f194810z
            if (r3 != 0) goto L_0x033a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = r20.getPackageName()
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r4)
            r0.f194810z = r3
        L_0x033a:
            com.tencent.mm.ui.base.preference.CheckBoxPreference r3 = r0.f194804t
            if (r3 == 0) goto L_0x0367
            k40.a r3 = f40.C86709a0.m107533q(r5)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            java.lang.String r8 = r0.f194770B
            com.tencent.mm.storage.z1 r3 = r3.get(r8)
            if (r3 != 0) goto L_0x0356
            java.lang.String r3 = "contact == null !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r3)
            goto L_0x036c
        L_0x0356:
            android.content.SharedPreferences r8 = r0.f194810z
            android.content.SharedPreferences$Editor r8 = r8.edit()
            boolean r3 = r3.mo62927s3()
            android.content.SharedPreferences$Editor r3 = r8.putBoolean(r11, r3)
            r3.commit()
        L_0x0367:
            pj3.g r3 = r0.f194795h
            r3.notifyDataSetChanged()
        L_0x036c:
            java.lang.String r3 = "updateDisplayNickname()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            android.content.SharedPreferences r3 = r0.f194810z
            if (r3 != 0) goto L_0x038f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = r20.getPackageName()
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r4)
            r0.f194810z = r3
        L_0x038f:
            k40.a r1 = f40.C86709a0.m107533q(r1)
            a11.c r1 = (a11.C39479c) r1
            eb0.m2 r1 = r1.mo62084mr()
            java.lang.String r3 = r0.f194770B
            com.tencent.mm.storage.n1 r1 = (com.tencent.p014mm.storage.C44662n1) r1
            com.tencent.mm.storage.m1 r1 = r1.mo69799Lo(r3)
            if (r1 != 0) goto L_0x03a9
            java.lang.String r1 = "members == null !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            goto L_0x03d2
        L_0x03a9:
            int r1 = r1.field_isShowname
            if (r1 <= 0) goto L_0x03af
            r1 = 1
            goto L_0x03b0
        L_0x03af:
            r1 = 0
        L_0x03b0:
            r0.f194769A = r1
            pj3.g r1 = r0.f194795h
            java.lang.String r3 = "room_msg_show_username"
            com.tencent.mm.ui.base.preference.Preference r1 = r1.mo72519a(r3)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r1 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r1
            if (r1 == 0) goto L_0x03cd
            android.content.SharedPreferences r1 = r0.f194810z
            android.content.SharedPreferences$Editor r1 = r1.edit()
            boolean r8 = r0.f194769A
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r3, r8)
            r1.commit()
        L_0x03cd:
            pj3.g r1 = r0.f194795h
            r1.notifyDataSetChanged()
        L_0x03d2:
            java.lang.String r1 = "updateConvBox()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            android.content.SharedPreferences r1 = r0.f194810z
            if (r1 != 0) goto L_0x03f5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r20.getPackageName()
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r4)
            r0.f194810z = r1
        L_0x03f5:
            com.tencent.mm.ui.base.preference.CheckBoxPreference r1 = r0.f194805u
            if (r1 == 0) goto L_0x042a
            com.tencent.mm.storage.z1 r1 = r0.f194797j
            if (r1 == 0) goto L_0x0419
            java.lang.Class<wo.b> r1 = p740wo.C53193b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            wo.b r1 = (p740wo.C53193b) r1
            java.lang.String r3 = r0.f194770B
            boolean r1 = r1.mo73723Hd(r3)
            android.content.SharedPreferences r3 = r0.f194810z
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r1 = r3.putBoolean(r12, r1)
            r1.commit()
            goto L_0x0426
        L_0x0419:
            android.content.SharedPreferences r1 = r0.f194810z
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r12, r4)
            r1.commit()
        L_0x0426:
            com.tencent.mm.ui.base.preference.CheckBoxPreference r1 = r0.f194805u
            r1.f24213M = r4
        L_0x042a:
            r20.mo93269d8()
            k40.a r1 = f40.C86709a0.m107533q(r5)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            java.lang.String r3 = r0.f194770B
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.yx0(r3)
            k40.a r1 = f40.C86709a0.m107533q(r5)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            java.lang.String r3 = r0.f194770B
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.yx0(r3)
        L_0x044f:
            pj3.g r1 = r0.f194795h
            java.lang.String r3 = "room_del_quit"
            com.tencent.mm.ui.base.preference.Preference r1 = r1.mo72519a(r3)
            boolean r3 = r1 instanceof com.tencent.p014mm.chatroom.p015ui.RoomButtonPreference
            if (r3 == 0) goto L_0x0484
            r3 = r1
            com.tencent.mm.chatroom.ui.RoomButtonPreference r3 = (com.tencent.p014mm.chatroom.p015ui.RoomButtonPreference) r3
            boolean r4 = r0.f194794g
            r4 = r4 ^ r2
            r3.f194910U = r4
            boolean r4 = r0.f194793f
            if (r4 == 0) goto L_0x0480
            java.lang.String r4 = "delete_group_after_quit_button"
            r3.f194911V = r4
            com.tencent.mm.ui.base.preference.ButtonPreference r1 = (com.tencent.p014mm.p136ui.base.preference.ButtonPreference) r1
            android.content.res.Resources r3 = r20.getResources()
            r4 = 2131835119(0x7f1138ef, float:1.9303368E38)
            java.lang.String r3 = r3.getString(r4)
            r1.f215024P = r3
            r3 = 1
            r0.mo93262X7(r3)
            goto L_0x0484
        L_0x0480:
            java.lang.String r1 = "quit_group_button"
            r3.f194911V = r1
        L_0x0484:
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference r1 = r0.f194802r
            if (r1 == 0) goto L_0x04a9
            com.tencent.mm.chatroom.ui.ChatroomInfoUI$o r3 = new com.tencent.mm.chatroom.ui.ChatroomInfoUI$o
            r3.<init>(r0)
            mp.c r4 = r1.f211662K
            if (r4 == 0) goto L_0x0496
            r5 = r4
            com.tencent.mm.pluginsdk.ui.applet.a r5 = (com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a) r5
            r5.f211671h = r3
        L_0x0496:
            com.tencent.mm.chatroom.ui.ChatroomInfoUI$p r3 = new com.tencent.mm.chatroom.ui.ChatroomInfoUI$p
            r3.<init>(r0)
            if (r4 == 0) goto L_0x04a1
            com.tencent.mm.pluginsdk.ui.applet.a r4 = (com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a) r4
            r4.f211672i = r3
        L_0x04a1:
            com.tencent.mm.chatroom.ui.ChatroomInfoUI$q r3 = new com.tencent.mm.chatroom.ui.ChatroomInfoUI$q
            r3.<init>()
            r1.mo100307S(r3)
        L_0x04a9:
            pj3.g r1 = r0.f194795h
            java.lang.String r3 = "room_clear_chatting_history"
            com.tencent.mm.ui.base.preference.Preference r1 = r1.mo72519a(r3)
            boolean r3 = r1 instanceof com.tencent.p014mm.chatroom.p015ui.RoomClearHistoryPreference
            if (r3 == 0) goto L_0x04bc
            com.tencent.mm.chatroom.ui.RoomClearHistoryPreference r1 = (com.tencent.p014mm.chatroom.p015ui.RoomClearHistoryPreference) r1
            boolean r3 = r0.f194794g
            r2 = r2 ^ r3
            r1.f194914J = r2
        L_0x04bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI.initView():void");
    }

    /* renamed from: j8 */
    public final void mo93274j8() {
        if (this.f194796i) {
            int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(this.f194770B);
            this.f194772D = p1;
            if (p1 == 0) {
                setMMTitle(getString(C0966R.string.i_8));
                return;
            }
            setMMTitle(getString(C0966R.string.eyf, new Object[]{getString(C0966R.string.i_8), Integer.valueOf(this.f194772D)}));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 5) {
                        return;
                    }
                    if (i != 6) {
                        if (i != 7) {
                            if (i == 10 && intent != null && intent.getBooleanExtra("dismiss_chatroom", false)) {
                                finish();
                            }
                        } else if (intent != null && (stringExtra = intent.getStringExtra("Select_Contact")) != null && !stringExtra.equals("")) {
                            C72940a a = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(this.f194770B).mo71490a(this.f194770B, Util.stringsToList(stringExtra.split(",")), 0);
                            a.f212613b = new C68008y(this);
                            a.f212614c = new C68009z(this);
                            a.mo100867d(this, getString(C0966R.string.a3h), getString(C0966R.string.i64), true, true, new C67950a0(this, a));
                        }
                    } else if (i2 == -1) {
                        mo93270e8();
                    }
                } else if (i2 == -1) {
                    String stringExtra2 = intent.getStringExtra("room_name");
                    if (!Util.isNullOrNil(stringExtra2)) {
                        new UpdateSearchIndexAtOnceEvent().publish();
                        this.f194797j.mo62878U2(stringExtra2);
                        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69668Q3(this.f194797j);
                        mo93271f8();
                    }
                }
            } else if (i2 == -1) {
                finish();
            }
        } else if (i2 != -1) {
            ((C31950v0) C86312j.m106911c(C31950v0.class)).mo58434ql(3);
        } else if (intent != null) {
            long longExtra = intent.getLongExtra("select_record_fake_msg_id", 0);
            new C77520a(this, this.f194770B, intent.getStringExtra("Select_Contact"), (LocalHistoryInfo) intent.getParcelableExtra("select_record_msg_info"), longExtra, this);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        ContactListExpandPreference contactListExpandPreference;
        super.onConfigurationChanged(configuration);
        if (!this.f194793f && (contactListExpandPreference = this.f194802r) != null) {
            contactListExpandPreference.mo69931v();
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C39479c.class;
        String stringExtra = getIntent().getStringExtra("RoomInfo_Id");
        this.f194770B = stringExtra;
        this.f194793f = C72996z1.m85820U5(stringExtra) && ((C39479c) C86709a0.m107533q(cls)).mo62086r1(this.f194770B);
        boolean i902 = ((C53193b) C86312j.m106911c(C53193b.class)).i90(this.f194770B);
        Log.m105924i("MicroMsg.ChatroomInfoUI", "isChatroomDismiss = " + this.f194793f + ", inChatRoom = " + i902);
        this.f194793f = this.f194793f || !i902;
        super.onCreate(bundle);
        C86709a0.m107529k().f251779b.mo123455a(480, this);
        this.f194786S.alive();
        this.f194787T.alive();
        C86709a0.m107535s().mo121142i().add(this);
        ((C39479c) C86709a0.m107533q(cls)).mo62084mr().add(this);
        if (C75350g.m90357a() != null) {
            ((C48497j) C75350g.m90357a()).mo73127a(this);
        }
        this.f194797j = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f194770B);
        this.f194776H = true;
        this.f194796i = getIntent().getBooleanExtra("Is_Chatroom", true);
        this.f194777I = getIntent().getBooleanExtra("fromChatting", false);
        this.f194778J = getIntent().getBooleanExtra("isShowSetMuteAnimation", false);
        this.f194784Q = getPackageName() + "_preferences";
        if (this.f194796i) {
            this.f194775G = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f194770B);
        }
        initView();
        if (this.f194796i) {
            C40201t tVar = new C40201t(this.f194770B);
            if (this.f194775G == null) {
                C31519v2.m39436a().mo55988e(this.f194770B, "", tVar);
            } else if (System.currentTimeMillis() - this.f194775G.field_modifytime >= 86400000) {
                C86709a0.m107525e().postToWorker(new C67954e(this, tVar));
            }
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86163dt(this).mo86178qr(this, C11345b.ChatroomInfoUI).y50(this, "chat_name", this.f194770B).y50(this, "is_chat_removed", i902 ? "1" : "2").mo86148No(this, 4, 26501);
    }

    public void onDestroy() {
        ContactListExpandPreference contactListExpandPreference;
        if (!this.f194793f && (contactListExpandPreference = this.f194802r) != null) {
            contactListExpandPreference.getClass();
        }
        if (C75350g.m90357a() != null) {
            ((C48497j) C75350g.m90357a()).mo73127a(this);
        }
        C86709a0.m107535s().mo121142i().remove(this);
        C53534a.m60079b();
        C86709a0.m107529k().f251779b.mo123470p(480, this);
        this.f194786S.dead();
        this.f194787T.dead();
        if (C86709a0.m107522a()) {
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
            ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr().remove(this);
        }
        if (C75350g.m90357a() != null) {
            ((C48497j) C75350g.m90357a()).mo73132f(this);
        }
        MTimerHandler mTimerHandler = this.f194789V;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        super.onDestroy();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            Log.m105919d("MicroMsg.ChatroomInfoUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        onNotifyChange((String) obj, (MStorageEventData) null);
    }

    public void onPause() {
        C44661m1 m1Var;
        super.onPause();
        if (this.f194774F && this.f194796i && (m1Var = this.f194775G) != null) {
            String str = this.f194770B;
            boolean z = this.f194769A;
            C51866wq2 wq22 = C45612m0.f123381a;
            m1Var.field_isShowname = z ? 1 : 0;
            ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr().update(m1Var, new String[0]);
            String s = C75592q0.m90789s();
            ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(str).mo71499j(str, s, z).mo100865c();
            C49487fy2 fy22 = new C49487fy2();
            fy22.f133742d = str;
            fy22.f133743e = s;
            int i = 1;
            fy22.f133744f = 1;
            if (!z) {
                i = 2;
            }
            fy22.f133745g = i;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(49, fy22));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceTreeClick(pj3.C47511g r32, com.tencent.p014mm.p136ui.base.preference.Preference r33) {
        /*
            r31 = this;
            r8 = r31
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            java.lang.Class<fx.c> r1 = p530fx.C45819c.class
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.Class<lc3.b> r3 = lc3.C10485b.class
            java.lang.Class<ru.h> r4 = p680ru.C77569h.class
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            java.lang.Class<wo.b> r6 = p740wo.C53193b.class
            java.lang.Class<com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI> r7 = com.tencent.p014mm.chatroom.p015ui.ModRemarkRoomNameUI.class
            r9 = r33
            java.lang.String r9 = r9.f121285r
            java.lang.String r10 = "room_name"
            boolean r11 = r9.equals(r10)
            r12 = 4
            r13 = 3
            java.lang.String r15 = "Key_Room_Id"
            java.lang.String r14 = "Key_Scenen"
            if (r11 == 0) goto L_0x016a
            com.tencent.mm.storage.m1 r0 = r8.f194775G
            if (r0 == 0) goto L_0x010d
            int r1 = r0.field_chatroomStatus
            java.lang.String r2 = eb0.C75592q0.m90789s()
            boolean r0 = r0.mo69796x2(r2)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0045
        L_0x0036:
            com.tencent.mm.storage.m1 r0 = r8.f194775G
            java.lang.String r2 = eb0.C75592q0.m90789s()
            boolean r0 = r0.mo69793u2(r2)
            if (r0 == 0) goto L_0x0044
            r0 = 2
            goto L_0x0045
        L_0x0044:
            r0 = 3
        L_0x0045:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r1 & r2
            r6 = 2131821556(0x7f1103f4, float:1.9275859E38)
            r9 = 2131834991(0x7f11386f, float:1.9303108E38)
            r10 = 3
            java.lang.String r5 = "ChatName"
            if (r4 != r2) goto L_0x00a2
            r1 = r1 & r12
            if (r1 <= 0) goto L_0x010d
            if (r0 == r13) goto L_0x005c
            goto L_0x010d
        L_0x005c:
            com.tencent.mm.autogen.mmdata.rpt.OnlyAdminModifyTopicReportStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.OnlyAdminModifyTopicReportStruct
            r1.<init>()
            r1.f107999g = r10
            com.tencent.mm.storage.m1 r2 = r8.f194775G
            java.lang.String r2 = r2.field_chatroomname
            r3 = 1
            java.lang.String r2 = r1.mo86045b(r5, r2, r3)
            r1.f107996d = r2
            com.tencent.mm.storage.m1 r2 = r8.f194775G
            int r2 = r2.field_memberCount
            long r2 = (long) r2
            r1.f107998f = r2
            long r2 = (long) r0
            r1.f107997e = r2
            r1.mo86054n()
            r1.mo86056r()
            qo3.a r0 = new qo3.a
            r0.<init>()
            java.lang.String r1 = r8.getString(r9)
            r0.f225660q = r1
            android.content.res.Resources r1 = al3.C0086a.m38a(r31)
            java.lang.String r1 = r1.getString(r6)
            r0.f225663t = r1
            qo3.g r1 = new qo3.g
            r2 = 2131887328(0x7f1204e0, float:1.940926E38)
            r1.<init>(r8, r2)
            r1.mo107525e(r0)
            r1.show()
            goto L_0x010b
        L_0x00a2:
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r2 = "ChatRoomOwnerModTopic"
            java.lang.String r1 = r1.mo107405c(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x00bd
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            goto L_0x00be
        L_0x00bd:
            r1 = 0
        L_0x00be:
            if (r0 != r13) goto L_0x010d
            if (r1 <= 0) goto L_0x010d
            int r2 = r8.f194772D
            if (r1 > r2) goto L_0x010d
            com.tencent.mm.autogen.mmdata.rpt.OnlyAdminModifyTopicReportStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.OnlyAdminModifyTopicReportStruct
            r1.<init>()
            r1.f107999g = r10
            com.tencent.mm.storage.m1 r2 = r8.f194775G
            java.lang.String r2 = r2.field_chatroomname
            r3 = 1
            java.lang.String r2 = r1.mo86045b(r5, r2, r3)
            r1.f107996d = r2
            com.tencent.mm.storage.m1 r2 = r8.f194775G
            int r2 = r2.field_memberCount
            long r2 = (long) r2
            r1.f107998f = r2
            long r2 = (long) r0
            r1.f107997e = r2
            r1.mo86054n()
            r1.mo86056r()
            qo3.a r0 = new qo3.a
            r0.<init>()
            java.lang.String r1 = r8.getString(r9)
            r0.f225660q = r1
            android.content.res.Resources r1 = al3.C0086a.m38a(r31)
            java.lang.String r1 = r1.getString(r6)
            r0.f225663t = r1
            qo3.g r1 = new qo3.g
            r2 = 2131887328(0x7f1204e0, float:1.940926E38)
            r1.<init>(r8, r2)
            r1.mo107525e(r0)
            r1.show()
        L_0x010b:
            r0 = 0
            goto L_0x010e
        L_0x010d:
            r0 = 1
        L_0x010e:
            if (r0 == 0) goto L_0x0b86
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.setClass(r8, r7)
            r1 = 1
            r0.putExtra(r14, r1)
            java.lang.String r1 = r8.f194770B
            r0.putExtra(r15, r1)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/chatroom/ui/ChatroomInfoUI"
            java.lang.String r3 = "onPreferenceTreeClick"
            java.lang.String r4 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r31
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r1 = r9.mo10231a(r0)
            android.content.Intent r1 = (android.content.Intent) r1
            r8.startActivity(r1)
            java.lang.String r1 = "com/tencent/mm/chatroom/ui/ChatroomInfoUI"
            java.lang.String r2 = "onPreferenceTreeClick"
            java.lang.String r3 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r31
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 219(0xdb, double:1.08E-321)
            r12 = 3
            r14 = 1
            r16 = 1
            r9.idkeyStat(r10, r12, r14, r16)
            goto L_0x0b86
        L_0x016a:
            java.lang.String r11 = "room_upgrade_entry"
            boolean r11 = r9.equals(r11)
            java.lang.String r12 = "webview"
            java.lang.String r13 = "showShare"
            r19 = r0
            java.lang.String r0 = "rawUrl"
            r20 = r15
            r15 = 0
            if (r11 == 0) goto L_0x01c5
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r2 = "ChatroomGlobalSwitch"
            java.lang.String r1 = r1.mo107405c(r2)
            r2 = 1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            if (r1 != r2) goto L_0x0197
            r1 = 1
            goto L_0x0198
        L_0x0197:
            r1 = 0
        L_0x0198:
            if (r1 == 0) goto L_0x0b86
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r3 = 2131823382(0x7f110b16, float:1.9279562E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r5 = 0
            r2[r5] = r4
            java.lang.String r2 = r8.getString(r3, r2)
            r1.putExtra(r0, r2)
            java.lang.String r0 = eb0.C75592q0.m90789s()
            java.lang.String r2 = "geta8key_username"
            r1.putExtra(r2, r0)
            r1.putExtra(r13, r5)
            java.lang.String r0 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r8, r12, r0, r1, r15)
            goto L_0x0b86
        L_0x01c5:
            java.lang.String r3 = "room_qr_code"
            boolean r3 = r9.equals(r3)
            java.lang.String r11 = "setting"
            if (r3 == 0) goto L_0x0288
            java.lang.String r0 = r8.f194770B
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r0)
            if (r0 == 0) goto L_0x01e8
            com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct
            r0.<init>()
            java.lang.String r1 = r8.f194770B
            r0.mo93194s(r1)
            r3 = 6
            r0.f194303e = r3
            r0.mo86054n()
        L_0x01e8:
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 219(0xdb, double:1.08E-321)
            r20 = 5
            r22 = 1
            r24 = 1
            r17.idkeyStat(r18, r20, r22, r24)
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_colorful_qrcode_chatroom_newui_disable
            r2 = 0
            int r0 = r0.mo58779Qe(r1, r2)
            r1 = 1
            if (r0 != r1) goto L_0x0207
            r0 = 1
            goto L_0x0208
        L_0x0207:
            r0 = 0
        L_0x0208:
            r0 = r0 ^ r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "canShowNewChatroomUI: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.ColorfulQRConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.lang.String r1 = "from_userName"
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = r8.f194770B
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r0)
            if (r0 == 0) goto L_0x022c
            goto L_0x0277
        L_0x022c:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = r8.f194770B
            r0.putExtra(r1, r2)
            java.lang.String r1 = "com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI"
            r0.setClassName(r8, r1)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/chatroom/ui/ChatroomInfoUI"
            java.lang.String r3 = "showQrCode"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r31
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r1 = r9.mo10231a(r0)
            android.content.Intent r1 = (android.content.Intent) r1
            r8.startActivity(r1)
            java.lang.String r1 = "com/tencent/mm/chatroom/ui/ChatroomInfoUI"
            java.lang.String r2 = "showQrCode"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r31
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0b86
        L_0x0277:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = r8.f194770B
            r0.putExtra(r1, r2)
            java.lang.String r1 = ".ui.setting.SelfQRCodeUI"
            ke3.C88144b.m109791i(r8, r11, r1, r0, r15)
            goto L_0x0b86
        L_0x0288:
            java.lang.String r3 = "room_card"
            boolean r3 = r9.equals(r3)
            java.lang.String r15 = "MicroMsg.ChatroomInfoUI"
            r22 = r12
            java.lang.String r12 = "room_owner_name"
            r23 = r0
            java.lang.String r0 = "RoomInfo_Id"
            r24 = r13
            java.lang.String r13 = "Is_RoomOwner"
            r25 = r2
            java.lang.String r2 = "room_member_count"
            if (r3 == 0) goto L_0x03aa
            com.tencent.mm.storage.m1 r1 = r8.f194775G
            if (r1 != 0) goto L_0x02ad
            java.lang.String r0 = "goToRoomCardUI member == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r0)
            goto L_0x0b86
        L_0x02ad:
            java.lang.String r3 = eb0.C75592q0.m90789s()
            boolean r1 = r1.mo69793u2(r3)
            java.lang.String r3 = r8.f194770B
            java.lang.String r3 = eb0.C45612m0.m50687d(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x02e0
            boolean r3 = r31.mo93265a8()
            if (r3 != 0) goto L_0x02e0
            r0 = 2131834916(0x7f113824, float:1.9302956E38)
            java.lang.String r1 = r8.getString(r0)
            r2 = 0
            r0 = 2131834917(0x7f113825, float:1.9302958E38)
            java.lang.String r3 = r8.getString(r0)
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r31
            nj3.C76879j.m92707A(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0b86
        L_0x02e0:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = r8.f194770B
            r3.putExtra(r0, r4)
            com.tencent.mm.chatroom.ui.preference.RoomCardPreference r0 = r8.f194799o
            java.lang.CharSequence r0 = r0.f10251K
            java.lang.String r0 = r0.toString()
            r3.putExtra(r10, r0)
            di3.d r0 = di3.C86312j.m106911c(r6)
            wo.b r0 = (p740wo.C53193b) r0
            java.lang.String r4 = r8.f194770B
            java.util.List r0 = r0.mo73727k5(r4)
            int r0 = r0.size()
            r8.f194772D = r0
            r3.putExtra(r2, r0)
            k40.a r0 = f40.C86709a0.m107533q(r5)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            com.tencent.mm.storage.m1 r2 = r8.f194775G
            java.lang.String r2 = r2.field_roomowner
            com.tencent.mm.storage.z1 r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0328
            long r4 = r0.f108320R1
            int r2 = (int) r4
            if (r2 <= 0) goto L_0x0328
            java.lang.String r2 = r0.mo73969n2()
            goto L_0x0329
        L_0x0328:
            r2 = 0
        L_0x0329:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 == 0) goto L_0x0342
            com.tencent.mm.storage.m1 r2 = r8.f194775G
            java.lang.String r2 = r2.field_roomowner
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 == 0) goto L_0x033b
            r15 = 0
            goto L_0x0341
        L_0x033b:
            com.tencent.mm.storage.m1 r4 = r8.f194775G
            java.lang.String r15 = r4.mo69789q2(r2)
        L_0x0341:
            r2 = r15
        L_0x0342:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 == 0) goto L_0x0353
            if (r0 == 0) goto L_0x0353
            long r4 = r0.f108320R1
            int r5 = (int) r4
            if (r5 <= 0) goto L_0x0353
            java.lang.String r2 = r0.mo62909j3()
        L_0x0353:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 == 0) goto L_0x035d
            com.tencent.mm.storage.m1 r0 = r8.f194775G
            java.lang.String r2 = r0.field_roomowner
        L_0x035d:
            r3.putExtra(r12, r2)
            java.lang.String r0 = r8.f194770B
            java.lang.String r0 = eb0.C45612m0.m50687d(r0)
            java.lang.String r2 = "room_notice"
            r3.putExtra(r2, r0)
            java.lang.String r0 = r8.f194770B
            java.lang.String r0 = eb0.C45612m0.m50690g(r0)
            java.lang.String r2 = "room_notice_xml"
            r3.putExtra(r2, r0)
            java.lang.String r0 = r8.f194770B
            long r4 = eb0.C45612m0.m50689f(r0)
            java.lang.String r0 = "room_notice_publish_time"
            r3.putExtra(r0, r4)
            java.lang.String r0 = r8.f194770B
            java.lang.String r0 = eb0.C45612m0.m50688e(r0)
            java.lang.String r2 = "room_notice_editor"
            r3.putExtra(r2, r0)
            boolean r0 = r8.f194771C
            r3.putExtra(r13, r0)
            java.lang.String r0 = "Is_RoomManager"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "from_scene"
            r1 = 1
            r3.putExtra(r0, r1)
            java.lang.Class<vh0.b> r0 = vh0.C78415b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            vh0.b r0 = (vh0.C78415b) r0
            r1 = 6
            r0.mo94222eD(r8, r3, r1)
            goto L_0x0b86
        L_0x03aa:
            java.lang.String r3 = "room_set_to_conv_box"
            boolean r3 = r9.equals(r3)
            r26 = r10
            java.lang.String r10 = "roomUsername"
            if (r3 == 0) goto L_0x03e2
            r3 = 0
            r8.mo93255Q7(r3)
            di3.d r0 = di3.C86312j.m106911c(r6)
            wo.b r0 = (p740wo.C53193b) r0
            java.lang.String r1 = r8.f194770B
            boolean r0 = r0.mo73723Hd(r1)
            com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct
            r1.<init>()
            java.lang.String r2 = r8.f194770B
            r3 = 1
            java.lang.String r2 = r1.mo86045b(r10, r2, r3)
            r1.f194151d = r2
            if (r0 == 0) goto L_0x03d9
            r2 = 1
            goto L_0x03db
        L_0x03d9:
            r2 = 0
        L_0x03db:
            r1.f194152e = r2
            r1.mo86054n()
            goto L_0x0b86
        L_0x03e2:
            java.lang.String r3 = "room_notify_new_msg"
            boolean r3 = r9.equals(r3)
            r27 = r2
            r28 = r12
            r29 = r13
            r12 = 10
            if (r3 == 0) goto L_0x0486
            boolean r0 = r8.f194773E
            r3 = 1
            r0 = r0 ^ r3
            r8.f194773E = r0
            boolean r6 = r8.f194796i
            if (r6 == 0) goto L_0x0465
            r0 = r0 ^ r3
            di3.d r1 = di3.C86312j.m106911c(r1)
            fx.c r1 = (p530fx.C45819c) r1
            java.lang.String r3 = r8.f194770B
            og3.c r1 = r1.mo71192mK(r3)
            java.lang.String r3 = r8.f194770B
            com.tencent.mm.roomsdk.model.factory.a r1 = r1.mo71492c(r3, r0)
            r1.mo100865c()
            k40.a r1 = f40.C86709a0.m107533q(r5)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r3 = r8.f194770B
            com.tencent.mm.storage.z1 r1 = r1.get(r3)
            r8.f194797j = r1
            r1.mo62861K3(r0)
            k40.a r0 = f40.C86709a0.m107533q(r5)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.lang.String r1 = r8.f194770B
            com.tencent.mm.storage.z1 r3 = r8.f194797j
            r0.mo69719p3(r1, r3)
            boolean r0 = r8.f194779K
            if (r0 == 0) goto L_0x044c
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 869(0x365, float:1.218E-42)
            boolean r3 = r8.f194773E
            if (r3 == 0) goto L_0x0447
            r2 = 14
            goto L_0x0449
        L_0x0447:
            r2 = 15
        L_0x0449:
            r0.mo175911u(r1, r2)
        L_0x044c:
            com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct
            r0.<init>()
            java.lang.String r1 = r8.f194770B
            r2 = 1
            java.lang.String r1 = r0.mo86045b(r10, r1, r2)
            r0.f194151d = r1
            boolean r1 = r8.f194773E
            if (r1 == 0) goto L_0x0460
            r12 = 11
        L_0x0460:
            r0.f194152e = r12
            r0.mo86054n()
        L_0x0465:
            di3.d r0 = di3.C86312j.m106911c(r4)
            ru.h r0 = (p680ru.C77569h) r0
            java.lang.String r1 = r8.f194770B
            boolean r2 = r8.f194773E
            r0.mo35229Bo(r1, r2)
            r31.mo93268c8()
            boolean r0 = r31.mo93264Z7()
            if (r0 != 0) goto L_0x0b86
            boolean r0 = r8.f194773E
            if (r0 != 0) goto L_0x0b86
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.mo93255Q7(r0)
            goto L_0x0b86
        L_0x0486:
            java.lang.String r3 = "room_save_to_contact"
            boolean r30 = r9.equals(r3)
            if (r30 == 0) goto L_0x052a
            android.content.SharedPreferences r0 = r8.f194810z
            if (r0 != 0) goto L_0x04ae
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r31.getPackageName()
            r0.append(r2)
            java.lang.String r2 = "_preferences"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r2)
            r8.f194810z = r0
        L_0x04ae:
            k40.a r0 = f40.C86709a0.m107533q(r5)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.lang.String r2 = r8.f194770B
            com.tencent.mm.storage.z1 r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0b86
            boolean r2 = r0.mo62927s3()
            android.content.SharedPreferences r5 = r8.f194810z
            android.content.SharedPreferences$Editor r5 = r5.edit()
            r6 = r2 ^ 1
            android.content.SharedPreferences$Editor r3 = r5.putBoolean(r3, r6)
            r3.commit()
            if (r2 == 0) goto L_0x04fe
            r0.mo62935u4()
            di3.d r1 = di3.C86312j.m106911c(r1)
            fx.c r1 = (p530fx.C45819c) r1
            java.lang.String r2 = r8.f194770B
            og3.c r1 = r1.mo71192mK(r2)
            r2 = 0
            r1.mo71493d(r0, r2)
            r0 = 2131835021(0x7f11388d, float:1.9303169E38)
            java.lang.String r0 = r8.getString(r0)
            nj3.C76879j.m92726T(r8, r0)
            di3.d r0 = di3.C86312j.m106911c(r4)
            ru.h r0 = (p680ru.C77569h) r0
            java.lang.String r1 = r8.f194770B
            r0.mo35246zP(r1, r2)
            goto L_0x0523
        L_0x04fe:
            di3.d r1 = di3.C86312j.m106911c(r1)
            fx.c r1 = (p530fx.C45819c) r1
            java.lang.String r2 = r8.f194770B
            og3.c r1 = r1.mo71192mK(r2)
            r2 = 1
            r1.mo71493d(r0, r2)
            r0 = 2131835037(0x7f11389d, float:1.9303201E38)
            java.lang.String r0 = r8.getString(r0)
            nj3.C76879j.m92726T(r8, r0)
            di3.d r0 = di3.C86312j.m106911c(r4)
            ru.h r0 = (p680ru.C77569h) r0
            java.lang.String r1 = r8.f194770B
            r0.mo35246zP(r1, r2)
        L_0x0523:
            pj3.g r0 = r8.f194795h
            r0.notifyDataSetChanged()
            goto L_0x0b86
        L_0x052a:
            java.lang.String r1 = "room_placed_to_the_top"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0537
            r31.mo93252N7()
            goto L_0x0b86
        L_0x0537:
            java.lang.String r1 = "room_nickname"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0558
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.setClass(r8, r7)
            r1 = 3
            r0.putExtra(r14, r1)
            java.lang.String r1 = r8.f194770B
            r3 = r20
            r0.putExtra(r3, r1)
            r1 = 4
            r8.startActivityForResult((android.content.Intent) r0, (int) r1)
            goto L_0x0b86
        L_0x0558:
            r3 = r20
            java.lang.String r1 = "room_msg_show_username"
            boolean r5 = r9.equals(r1)
            if (r5 == 0) goto L_0x0581
            java.lang.String r0 = r8.f194784Q
            r2 = 0
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            boolean r2 = r8.f194769A
            r3 = 1
            r2 = r2 ^ r3
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            r0.commit()
            boolean r0 = r8.f194769A
            r0 = r0 ^ r3
            r8.f194769A = r0
            r8.f194774F = r3
            goto L_0x0b86
        L_0x0581:
            java.lang.String r1 = "room_set_chatting_background"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x05c1
            java.lang.String r0 = r8.f194770B
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r0)
            if (r0 == 0) goto L_0x05a2
            com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct
            r0.<init>()
            java.lang.String r1 = r8.f194770B
            r0.mo93194s(r1)
            r1 = 9
            r0.f194303e = r1
            r0.mo86054n()
        L_0x05a2:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "isApplyToAll"
            r2 = 0
            r0.putExtra(r1, r2)
            com.tencent.mm.storage.z1 r1 = r8.f194797j
            java.lang.String r1 = r1.getUsername()
            java.lang.String r2 = "username"
            r0.putExtra(r2, r1)
            java.lang.String r1 = ".ui.setting.SettingsChattingBackgroundUI"
            r2 = 2
            ke3.C88144b.m109795m(r8, r11, r1, r0, r2)
            goto L_0x0b86
        L_0x05c1:
            java.lang.String r1 = "room_search_chatting_content"
            boolean r1 = r9.equals(r1)
            r5 = 8
            r11 = 5
            r2 = 10
            if (r1 == 0) goto L_0x06b6
            java.lang.String r0 = r8.f194770B
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r0)
            if (r0 == 0) goto L_0x05e7
            com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct
            r0.<init>()
            java.lang.String r1 = r8.f194770B
            r0.mo93194s(r1)
            r3 = 8
            r0.f194303e = r3
            r0.mo86054n()
        L_0x05e7:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r8.f194770B
            java.lang.String r3 = "detail_username"
            r0.putExtra(r3, r1)
            boolean r1 = r8.f194793f
            java.lang.String r3 = "detail_user_dismiss"
            r0.putExtra(r3, r1)
            bp3.p r1 = bp3.C79758p.f233760a
            bp3.f r3 = bp3.C104160f.RepairerConfig_Global_FTSMultiTabSearch_Int
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            int r1 = r1.mo109882e(r3, r4)
            r3 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            if (r1 != r3) goto L_0x0610
            r1 = 1
            goto L_0x0611
        L_0x0610:
            r1 = 0
        L_0x0611:
            di3.d r3 = di3.C86312j.m106911c(r25)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_fts_multi_tab_search_entrance
            boolean r3 = r3.mo58784wf(r9, r4)
            if (r1 != 0) goto L_0x0624
            if (r3 == 0) goto L_0x0622
            goto L_0x0624
        L_0x0622:
            r1 = 0
            goto L_0x0625
        L_0x0624:
            r1 = 1
        L_0x0625:
            if (r1 == 0) goto L_0x062e
            java.lang.String r1 = ".ui.chatting.search.multi.FTSChattingConvMultiTabUI"
            r3 = 0
            ke3.C88144b.m109801s(r8, r1, r0, r3)
            goto L_0x063b
        L_0x062e:
            java.lang.Class<vr.e> r1 = p255vr.C65873e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            vr.e r1 = (p255vr.C65873e) r1
            java.lang.String r3 = ".ui.FTSChattingConvUI"
            r1.mo89915LO(r8, r3, r0)
        L_0x063b:
            com.tencent.mm.storage.m1 r0 = r8.f194775G
            if (r0 == 0) goto L_0x0650
            java.util.List r0 = r0.mo69790r2()
            if (r0 == 0) goto L_0x0650
            com.tencent.mm.storage.m1 r0 = r8.f194775G
            java.util.List r0 = r0.mo69790r2()
            int r0 = r0.size()
            goto L_0x0651
        L_0x0650:
            r0 = 0
        L_0x0651:
            boolean r1 = r8.f194793f
            r3 = 7
            if (r1 == 0) goto L_0x068d
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 11
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r10 = 0
            r9[r10] = r7
            r7 = 1
            r9[r7] = r6
            r7 = 2
            r9[r7] = r6
            r10 = 3
            r9[r10] = r6
            r10 = 4
            r9[r10] = r6
            r9[r11] = r6
            r10 = 6
            r9[r10] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r9[r5] = r0
            r0 = 9
            r9[r0] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r9[r2] = r0
            r0 = 14569(0x38e9, float:2.0416E-41)
            r1.mo160131h(r0, r9)
            goto L_0x0b86
        L_0x068d:
            r1 = 9
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r7
            r4 = 1
            r1[r4] = r6
            r4 = 2
            r1[r4] = r6
            r4 = 3
            r1[r4] = r6
            r4 = 4
            r1[r4] = r6
            r1[r11] = r6
            r4 = 6
            r1[r4] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r3] = r0
            r1[r5] = r7
            r0 = 14569(0x38e9, float:2.0416E-41)
            r2.mo160131h(r0, r1)
            goto L_0x0b86
        L_0x06b6:
            java.lang.String r1 = "room_clear_chatting_history"
            boolean r1 = r9.equals(r1)
            r2 = 26501(0x6785, float:3.7136E-41)
            if (r1 == 0) goto L_0x0725
            java.lang.String r0 = r8.f194770B
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r0)
            if (r0 == 0) goto L_0x06d9
            com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct
            r0.<init>()
            java.lang.String r1 = r8.f194770B
            r0.mo93194s(r1)
            r3 = 11
            r0.f194303e = r3
            r0.mo86054n()
        L_0x06d9:
            r0 = 2131830317(0x7f11262d, float:1.9293628E38)
            java.lang.String r10 = r8.getString(r0)
            androidx.appcompat.app.AppCompatActivity r9 = r31.getContext()
            r0 = 2131821432(0x7f110378, float:1.9275607E38)
            java.lang.String r12 = r8.getString(r0)
            r0 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r13 = r8.getString(r0)
            com.tencent.mm.chatroom.ui.f r14 = new com.tencent.mm.chatroom.ui.f
            r14.<init>(r8)
            r15 = 0
            r16 = 2131100028(0x7f06017c, float:1.7812426E38)
            java.lang.String r11 = ""
            qo3.g r0 = nj3.C76879j.m92708B(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 != 0) goto L_0x0705
            goto L_0x0b86
        L_0x0705:
            android.widget.Button r0 = r0.f225693g
            di3.d r1 = di3.C86312j.m106911c(r19)
            l31.e r1 = (l31.C61212e) r1
            l31.e r1 = r1.se0(r0)
            java.lang.String r3 = "clear_history_room_confirm_button_clear_msg"
            l31.e r1 = r1.o30(r0, r3)
            com.tencent.mm.chatroom.ui.g r3 = new com.tencent.mm.chatroom.ui.g
            r3.<init>(r8)
            l31.e r1 = r1.E60(r0, r3)
            r1.mo86175pO(r0, r5, r2)
            goto L_0x0b86
        L_0x0725:
            java.lang.String r1 = "room_report_it"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x07d7
            boolean r0 = r8.f194793f
            if (r0 == 0) goto L_0x0736
            r0 = 5
            r8.mo93262X7(r0)
        L_0x0736:
            java.lang.String r0 = r8.f194770B
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r0)
            if (r0 == 0) goto L_0x074d
            com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct
            r0.<init>()
            java.lang.String r1 = r8.f194770B
            r0.mo93194s(r1)
            r0.f194303e = r12
            r0.mo86054n()
        L_0x074d:
            java.lang.Class<tt.e> r0 = p244tt.C14088e.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            tt.e r1 = (p244tt.C14088e) r1
            java.lang.String r2 = "wxalited4df4810a40b1d9ddc0cbea44d263fd9"
            boolean r1 = r1.mo13530uu(r2)
            java.lang.String r3 = "k_username"
            if (r1 == 0) goto L_0x079c
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r1 = "appId"
            r11.putString(r1, r2)
            java.lang.String r1 = "query"
            java.lang.String r2 = "{\"scene\":36}"
            r11.putString(r1, r2)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r8.f194770B
            r1.putString(r3, r2)
            java.lang.String r2 = "extraData"
            r11.putBundle(r2, r1)
            java.lang.String r1 = "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            r9 = r0
            tt.e r9 = (p244tt.C14088e) r9
            androidx.appcompat.app.AppCompatActivity r10 = r31.getContext()
            r12 = 1
            r13 = 1
            com.tencent.mm.chatroom.ui.k r14 = new com.tencent.mm.chatroom.ui.k
            r14.<init>(r8)
            r9.mo13510OP(r10, r11, r12, r13, r14)
            goto L_0x07ca
        L_0x079c:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r8.f194770B
            r0.putExtra(r3, r1)
            r1 = r24
            r2 = 0
            r0.putExtra(r1, r2)
            java.lang.String r1 = com.tencent.p014mm.p136ui.C74928u.C45092d.f122306a
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = 36
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r2] = r5
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r2 = r23
            r0.putExtra(r2, r1)
            java.lang.String r1 = ".ui.tools.WebViewUI"
            r2 = r22
            r3 = 0
            ke3.C88144b.m109791i(r8, r2, r1, r0, r3)
        L_0x07ca:
            di3.d r0 = di3.C86312j.m106911c(r4)
            ru.h r0 = (p680ru.C77569h) r0
            java.lang.String r1 = r8.f194770B
            r0.mo35234T9(r1)
            goto L_0x0b86
        L_0x07d7:
            java.lang.String r1 = "room_del_quit"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0928
            boolean r0 = r8.f194793f
            if (r0 == 0) goto L_0x0821
            r0 = 2
            r8.mo93262X7(r0)
            qo3.n r0 = new qo3.n
            r1 = 1
            r0.<init>((android.content.Context) r8, (int) r1, (boolean) r1)
            com.tencent.mm.chatroom.ui.l r1 = new com.tencent.mm.chatroom.ui.l
            r1.<init>(r8)
            r0.f225771i = r1
            r1 = 2131824580(0x7f110fc4, float:1.9281992E38)
            java.lang.String r1 = r8.getString(r1)
            r2 = 17
            r3 = 14
            int r3 = kg3.C76577a.m92151b(r8, r3)
            r0.mo107568m(r1, r2, r3)
            com.tencent.mm.chatroom.ui.m r1 = new com.tencent.mm.chatroom.ui.m
            r1.<init>(r8)
            r0.f225795v = r1
            com.tencent.mm.chatroom.ui.n r1 = new com.tencent.mm.chatroom.ui.n
            r1.<init>(r8)
            r0.f225782p = r1
            com.tencent.mm.chatroom.ui.o r1 = new com.tencent.mm.chatroom.ui.o
            r1.<init>(r8)
            r0.f225761d = r1
            r0.mo107573q()
            goto L_0x0b86
        L_0x0821:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " quit "
            r0.append(r1)
            java.lang.String r1 = r8.f194770B
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            com.tencent.mm.autogen.events.TalkRoomServerEvent r0 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r0.<init>()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$a r1 = r0.f154883d
            r3 = 1
            r1.f154885a = r3
            r0.publish()
            java.lang.String r1 = r8.f194770B
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x085a
            java.lang.String r1 = r8.f194770B
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r0 = r0.f154884e
            java.lang.String r0 = r0.f154887a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x085a
            r0 = 1
            goto L_0x085b
        L_0x085a:
            r0 = 0
        L_0x085b:
            if (r0 == 0) goto L_0x0873
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = " quit talkroom"
            r1.append(r3)
            java.lang.String r3 = r8.f194770B
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)
        L_0x0873:
            androidx.appcompat.app.AppCompatActivity r1 = r31.getContext()
            android.view.LayoutInflater r1 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r1)
            r3 = 2131493584(0x7f0c02d0, float:1.8610652E38)
            r4 = 0
            android.view.View r1 = r1.inflate(r3, r4)
            r3 = 2131301038(0x7f0912ae, float:1.8220123E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.res.Resources r4 = r31.getResources()
            r6 = 2131824590(0x7f110fce, float:1.9282012E38)
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            com.tencent.mm.chatroom.ui.preference.RoomCardPreference r7 = r8.f194799o
            java.lang.CharSequence r7 = r7.f10251K
            java.lang.String r7 = r7.toString()
            r10 = 0
            r9[r10] = r7
            java.lang.String r4 = r4.getString(r6, r9)
            r3.setText(r4)
            r3 = 2131300104(0x7f090f08, float:1.8218228E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            com.tencent.mm.chatroom.ui.p r4 = new com.tencent.mm.chatroom.ui.p
            r4.<init>(r8)
            r3.setOnClickListener(r4)
            boolean r4 = r8.f194794g
            r3.setChecked(r4)
            qo3.e0 r4 = new qo3.e0
            androidx.appcompat.app.AppCompatActivity r6 = r31.getContext()
            r7 = 0
            r9 = 1
            r4.<init>(r6, r9, r7)
            android.content.res.Resources r6 = r31.getResources()
            r7 = 2131823338(0x7f110aea, float:1.9279473E38)
            java.lang.String r6 = r6.getString(r7)
            android.content.res.Resources r7 = r31.getResources()
            r9 = 2131823339(0x7f110aeb, float:1.9279475E38)
            java.lang.String r7 = r7.getString(r9)
            r4.mo140667n(r6, r7)
            android.content.res.Resources r6 = r31.getResources()
            r7 = 2131101252(0x7f060644, float:1.7814908E38)
            int r6 = r6.getColor(r7)
            r4.mo140675u(r6)
            r6 = 2
            r4.mo140668o(r6)
            r4.mo140663j(r1)
            android.widget.Button r1 = r4.f296395u
            di3.d r6 = di3.C86312j.m106911c(r19)
            l31.e r6 = (l31.C61212e) r6
            l31.e r6 = r6.se0(r1)
            java.lang.String r7 = "quit_group_confirm_button"
            l31.e r6 = r6.o30(r1, r7)
            com.tencent.mm.chatroom.ui.q r7 = new com.tencent.mm.chatroom.ui.q
            r7.<init>(r8)
            l31.e r6 = r6.E60(r1, r7)
            r6.mo86175pO(r1, r5, r2)
            com.tencent.mm.chatroom.ui.r r1 = new com.tencent.mm.chatroom.ui.r
            r1.<init>(r8, r4)
            com.tencent.mm.chatroom.ui.s r2 = new com.tencent.mm.chatroom.ui.s
            r2.<init>(r8, r4, r3, r0)
            r4.f296373D = r1
            r4.f296374E = r2
            r4.mo140655A()
            goto L_0x0b86
        L_0x0928:
            java.lang.String r1 = "add_selector_btn"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0935
            r31.mo93253O7()
            goto L_0x0b86
        L_0x0935:
            java.lang.String r1 = "del_selector_btn"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0942
            r31.mo93254P7()
            goto L_0x0b86
        L_0x0942:
            java.lang.String r1 = "see_room_member"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x09e7
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            androidx.appcompat.app.AppCompatActivity r2 = r31.getContext()
            java.lang.Class<com.tencent.mm.chatroom.ui.SeeRoomMemberUI> r3 = com.tencent.p014mm.chatroom.p015ui.SeeRoomMemberUI.class
            r1.setClass(r2, r3)
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.lang.String r3 = "Block_list"
            r1.putExtra(r3, r2)
            di3.d r2 = di3.C86312j.m106911c(r6)
            wo.b r2 = (p740wo.C53193b) r2
            java.lang.String r3 = r8.f194770B
            java.util.List r2 = r2.mo73727k5(r3)
            if (r2 == 0) goto L_0x0975
            int r3 = r2.size()
            r8.f194772D = r3
        L_0x0975:
            java.lang.String r3 = ","
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r2, r3)
            java.lang.String r3 = "Chatroom_member_list"
            r1.putExtra(r3, r2)
            java.lang.String r2 = r8.f194770B
            r1.putExtra(r0, r2)
            com.tencent.mm.storage.m1 r0 = r8.f194775G
            java.lang.String r0 = r0.field_roomowner
            r2 = r28
            r1.putExtra(r2, r0)
            boolean r0 = r8.f194771C
            r2 = r29
            r1.putExtra(r2, r0)
            int r0 = r8.f194772D
            r2 = r27
            r1.putExtra(r2, r0)
            r0 = 2131835043(0x7f1138a3, float:1.9303213E38)
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r2 = "Add_address_titile"
            r1.putExtra(r2, r0)
            boolean r0 = r8.f194796i
            if (r0 == 0) goto L_0x09b3
            java.lang.String r0 = "Contact_Scene"
            r2 = 14
            r1.putExtra(r0, r2)
        L_0x09b3:
            android.widget.ListView r0 = r31.getListView()
            r2 = 0
            android.view.View r0 = r0.getChildAt(r2)
            if (r0 != 0) goto L_0x09c0
            r0 = 0
            goto L_0x09c5
        L_0x09c0:
            int r0 = r0.getTop()
            int r0 = -r0
        L_0x09c5:
            java.lang.String r2 = "offset"
            r1.putExtra(r2, r0)
            android.widget.ListView r0 = r31.getListView()
            int r0 = r0.getFirstVisiblePosition()
            java.lang.String r2 = "first_pos"
            r1.putExtra(r2, r0)
            com.tencent.mm.storage.z1 r0 = r8.f194797j
            java.lang.String r0 = r0.getUsername()
            r2 = r26
            r1.putExtra(r2, r0)
            r8.startActivityForResult((android.content.Intent) r1, (int) r11)
            goto L_0x0b86
        L_0x09e7:
            r2 = r28
            java.lang.String r1 = "manage_room"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0a29
            boolean r1 = r8.f194780L
            if (r1 == 0) goto L_0x0a08
            java.lang.Class<nv.g> r1 = p626nv.C109759g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            nv.g r1 = (p626nv.C109759g) r1
            nv.e r1 = r1.V40()
            r3 = 26
            com.tencent.mm.plugin.newtips.model.l r1 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r1
            r1.mo175762a(r3)
        L_0x0a08:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            java.lang.Class<com.tencent.mm.chatroom.ui.ManageChatroomUI> r4 = com.tencent.p014mm.chatroom.p015ui.ManageChatroomUI.class
            r1.setClass(r3, r4)
            java.lang.String r3 = r8.f194770B
            r1.putExtra(r0, r3)
            com.tencent.mm.storage.m1 r0 = r8.f194775G
            java.lang.String r0 = r0.field_roomowner
            r1.putExtra(r2, r0)
            r0 = 10
            r8.startActivityForResult((android.content.Intent) r1, (int) r0)
            goto L_0x0b86
        L_0x0a29:
            java.lang.String r1 = "chat_room_app_brand"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0a6b
            java.lang.String r0 = r8.f194770B
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85847r5(r0)
            if (r0 == 0) goto L_0x0a4a
            com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct
            r0.<init>()
            java.lang.String r1 = r8.f194770B
            r0.mo93194s(r1)
            r1 = 7
            r0.f194303e = r1
            r0.mo86054n()
        L_0x0a4a:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r8.f194770B
            java.lang.String r2 = "Chat_User"
            r0.putExtra(r2, r1)
            java.lang.String r1 = ".ui.chatting.gallery.AppBrandHistoryListUI"
            r2 = 0
            ke3.C88144b.m109801s(r8, r1, r0, r2)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 219(0xdb, double:1.08E-321)
            r12 = 25
            r14 = 1
            r16 = 1
            r9.idkeyStat(r10, r12, r14, r16)
            goto L_0x0b86
        L_0x0a6b:
            java.lang.String r1 = "room_manager_view"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0ac9
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            java.lang.Class<com.tencent.mm.chatroom.ui.SeeRoomOwnerManagerUI> r4 = com.tencent.p014mm.chatroom.p015ui.SeeRoomOwnerManagerUI.class
            r1.setClass(r3, r4)
            java.lang.String r3 = r8.f194770B
            r1.putExtra(r0, r3)
            com.tencent.mm.storage.m1 r0 = r8.f194775G
            java.lang.String r0 = r0.field_roomowner
            r1.putExtra(r2, r0)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r1)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/chatroom/ui/ChatroomInfoUI"
            java.lang.String r3 = "goToOwnerManageChatroomUI"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r31
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r1 = r9.mo10231a(r0)
            android.content.Intent r1 = (android.content.Intent) r1
            r8.startActivity(r1)
            java.lang.String r1 = "com/tencent/mm/chatroom/ui/ChatroomInfoUI"
            java.lang.String r2 = "goToOwnerManageChatroomUI"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r31
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0b86
        L_0x0ac9:
            java.lang.String r1 = "room_remark"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0b1d
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.setClass(r8, r7)
            r1 = 2
            r0.putExtra(r14, r1)
            java.lang.String r1 = r8.f194770B
            r0.putExtra(r3, r1)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/chatroom/ui/ChatroomInfoUI"
            java.lang.String r3 = "dealModChatroomRemark"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r31
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r1 = r9.mo10231a(r0)
            android.content.Intent r1 = (android.content.Intent) r1
            r8.startActivity(r1)
            java.lang.String r1 = "com/tencent/mm/chatroom/ui/ChatroomInfoUI"
            java.lang.String r2 = "dealModChatroomRemark"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r31
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0b86
        L_0x0b1d:
            java.lang.String r1 = "room_special_follow_member"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0b86
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.Class<com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI> r2 = com.tencent.p014mm.chatroom.p015ui.RoomSpecialFollowMemberManagerUI.class
            r1.setClass(r8, r2)
            r2 = 2
            r1.putExtra(r14, r2)
            java.lang.String r2 = r8.f194770B
            r1.putExtra(r0, r2)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r1)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/chatroom/ui/ChatroomInfoUI"
            java.lang.String r3 = "dealToSpecialFollowMemberUI"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r31
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r1 = r9.mo10231a(r0)
            android.content.Intent r1 = (android.content.Intent) r1
            r8.startActivity(r1)
            java.lang.String r1 = "com/tencent/mm/chatroom/ui/ChatroomInfoUI"
            java.lang.String r2 = "dealToSpecialFollowMemberUI"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r31
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            com.tencent.mm.autogen.mmdata.rpt.ChatSpecialAttentionLogStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.ChatSpecialAttentionLogStruct
            r0.<init>()
            r1 = 2
            r0.f107866d = r1
            java.lang.String r1 = r8.f194770B
            r2 = 1
            java.lang.String r1 = r0.mo86045b(r10, r1, r2)
            r0.f107867e = r1
            r0.mo86054n()
        L_0x0b86:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI.onPreferenceTreeClick(pj3.g, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r10 = this;
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            super.onResume()
            pj3.g r1 = r10.f194795h
            r1.notifyDataSetChanged()
            com.tencent.mm.storage.m1 r1 = r10.f194775G
            r2 = 0
            r3 = 1
            java.lang.String r4 = "MicroMsg.ChatroomInfoUI"
            if (r1 == 0) goto L_0x0052
            aj.a r5 = r1.f121084u1
            boolean r5 = r1.mo69794v2(r5)
            if (r5 == 0) goto L_0x001d
            r1.mo69784l2()
        L_0x001d:
            aj.a r1 = r1.f121084u1
            if (r1 == 0) goto L_0x0052
            com.tencent.mm.storage.m1 r1 = r10.f194775G
            java.lang.String r1 = r1.field_chatroomname
            boolean r1 = eb0.C45612m0.m50708y(r1)
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.tencent.mm.storage.m1 r6 = r10.f194775G
            java.lang.String r7 = r6.field_chatroomname
            r5[r2] = r7
            int r6 = r6.field_chatroomVersion
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r3] = r6
            r6 = 2
            com.tencent.mm.storage.m1 r7 = r10.f194775G
            int r7 = r7.field_oldChatroomVersion
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r6] = r7
            r6 = 3
            com.tencent.mm.storage.m1 r7 = r10.f194775G
            java.lang.String r7 = r7.field_roomowner
            r5[r6] = r7
            java.lang.String r6 = "roomId:%s newVer:%s localVer:%s owner:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            java.lang.String r5 = r10.f194770B
            boolean r5 = eb0.C45612m0.m50707x(r5)
            if (r5 != 0) goto L_0x005d
            if (r1 == 0) goto L_0x0060
        L_0x005d:
            r10.mo93261W7()
        L_0x0060:
            r10.mo93270e8()
            r10.mo93274j8()
            r10.mo93268c8()
            boolean r1 = r10.f194796i
            if (r1 == 0) goto L_0x013f
            r10.mo93271f8()
            com.tencent.mm.storage.z1 r1 = r10.f194797j
            r5 = 5
            java.lang.String r6 = ""
            if (r1 == 0) goto L_0x00df
            java.lang.Class<a11.c> r1 = a11.C39479c.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            a11.c r1 = (a11.C39479c) r1
            eb0.m2 r1 = r1.mo62084mr()
            java.lang.String r7 = r10.f194770B
            com.tencent.mm.storage.n1 r1 = (com.tencent.p014mm.storage.C44662n1) r1
            com.tencent.mm.storage.m1 r1 = r1.mo69799Lo(r7)
            r10.f194775G = r1
            if (r1 != 0) goto L_0x0091
            r1 = r6
            goto L_0x0093
        L_0x0091:
            java.lang.String r1 = r1.field_selfDisplayName
        L_0x0093:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r7 == 0) goto L_0x009d
            java.lang.String r1 = eb0.C75592q0.m90783m()
        L_0x009d:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r7 != 0) goto L_0x00d3
            com.tencent.mm.ui.base.preference.KeyValuePreference r7 = r10.f194807w
            r7.f121244Q = r3
            r7.f121246S = r5
            androidx.appcompat.app.AppCompatActivity r8 = r10.getContext()
            r9 = 2131165663(0x7f0701df, float:1.794555E38)
            int r8 = kg3.C76577a.m92157h(r8, r9)
            r7.f121252Y = r8
            com.tencent.mm.ui.base.preference.KeyValuePreference r7 = r10.f194807w
            di3.d r8 = di3.C86312j.m106911c(r0)
            ny.h r8 = (p629ny.C76979h) r8
            int r9 = r1.length()
            if (r9 > 0) goto L_0x00cb
            r1 = 2131836334(0x7f113dae, float:1.9305832E38)
            java.lang.String r1 = r10.getString(r1)
        L_0x00cb:
            android.text.SpannableString r1 = r8.mo107057T1(r10, r1)
            r7.mo7741E(r1)
            goto L_0x00d8
        L_0x00d3:
            com.tencent.mm.ui.base.preference.KeyValuePreference r1 = r10.f194807w
            r1.mo7741E(r6)
        L_0x00d8:
            pj3.g r1 = r10.f194795h
            if (r1 == 0) goto L_0x00df
            r1.notifyDataSetChanged()
        L_0x00df:
            com.tencent.mm.storage.z1 r1 = r10.f194797j
            if (r1 == 0) goto L_0x013f
            com.tencent.mm.ui.base.preference.KeyValuePreference r1 = r10.f194808x
            if (r1 == 0) goto L_0x013f
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r7 = r10.f194770B
            com.tencent.mm.storage.z1 r1 = r1.get(r7)
            r10.f194797j = r1
            com.tencent.mm.ui.base.preference.KeyValuePreference r1 = r10.f194808x
            r1.f121244Q = r3
            r1.f121246S = r5
            java.lang.String r1 = r10.f194770B
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85844o5(r1)
            if (r1 == 0) goto L_0x0111
            pj3.g r0 = r10.f194795h
            com.tencent.mm.ui.base.preference.KeyValuePreference r1 = r10.f194808x
            r0.mo72526j(r1)
            goto L_0x013f
        L_0x0111:
            com.tencent.mm.storage.z1 r1 = r10.f194797j
            java.lang.String r1 = r1.mo73969n2()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x013a
            com.tencent.mm.storage.z1 r1 = r10.f194797j
            java.lang.String r1 = r1.mo73969n2()
            com.tencent.mm.ui.base.preference.KeyValuePreference r5 = r10.f194808x
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            android.text.SpannableString r0 = r0.mo107057T1(r10, r1)
            r5.mo7741E(r0)
            pj3.g r0 = r10.f194795h
            if (r0 == 0) goto L_0x013f
            r0.notifyDataSetChanged()
            goto L_0x013f
        L_0x013a:
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = r10.f194808x
            r0.mo7741E(r6)
        L_0x013f:
            boolean r0 = r10.f194776H
            if (r0 == 0) goto L_0x0148
            r10.mo93272g8()
            r10.f194776H = r2
        L_0x0148:
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r1 = "need_matte_high_light_item"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r1 = r10.f194782N
            if (r1 != 0) goto L_0x0161
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x015f
            r10.mo93249H7(r0)
        L_0x015f:
            r10.f194782N = r3
        L_0x0161:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x017a
            java.lang.String r1 = "room_notify_new_notice"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017a
            boolean r0 = r10.f194782N
            if (r0 != 0) goto L_0x017a
            java.lang.String r0 = "room_card"
            r10.mo93249H7(r0)
            r10.f194782N = r3
        L_0x017a:
            java.lang.Class<nv.g> r0 = p626nv.C109759g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            nv.g r0 = (p626nv.C109759g) r0
            nv.e r0 = r0.V40()
            r1 = 26
            com.tencent.mm.plugin.newtips.model.l r0 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r0
            r0.mo175772n(r1)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            boolean r1 = r10.f194778J
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "showSetMuteAnimation isShowSetMuteAnimation[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r1, r0)
            boolean r0 = r10.f194778J
            if (r0 != 0) goto L_0x01a1
            goto L_0x01ad
        L_0x01a1:
            r10.f194778J = r2
            com.tencent.mm.chatroom.ui.b0 r0 = new com.tencent.mm.chatroom.ui.b0
            r0.<init>(r10)
            r1 = 50
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r1)
        L_0x01ad:
            r10.mo93263Y7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI.onResume():void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ChatroomInfoUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " type = " + yVar.getType());
        StringBuilder sb = new StringBuilder();
        sb.append("pre is ");
        sb.append(this.f194772D);
        Log.m105918d("MicroMsg.ChatroomInfoUI", sb.toString());
        this.f194772D = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(this.f194770B);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("now is ");
        sb4.append(this.f194772D);
        Log.m105918d("MicroMsg.ChatroomInfoUI", sb4.toString());
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C13925a.class);
    }

    /* renamed from: y1 */
    public void mo69890y1(String str, String str2, String str3) {
        ContactListExpandPreference contactListExpandPreference;
        if (!this.f194793f && str.equals(this.f194770B) && (contactListExpandPreference = this.f194802r) != null) {
            contactListExpandPreference.mo69931v();
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (!Util.isNullOrNil(str)) {
            if (!C72996z1.m85820U5(str)) {
                Log.m105918d("MicroMsg.ChatroomInfoUI", "event:" + str + " cancel");
                return;
            }
            Log.m105918d("MicroMsg.ChatroomInfoUI", "event:" + str);
            if (this.f194796i && str.equals(this.f194770B)) {
                C86709a0.m107525e().postToWorker(new C67870m());
            }
            mo93267c1();
        }
    }
}
