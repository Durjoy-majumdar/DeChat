package com.tencent.p014mm.plugin.game.chatroom.view;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.C54258u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bx1.C39855j;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChatRoomJoinOrQuitEvent;
import com.tencent.p014mm.autogen.events.GamePBCacheEvent;
import com.tencent.p014mm.autogen.events.GetChatRoomMsgEvent;
import com.tencent.p014mm.autogen.events.ShowMultiTaskEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BanAction;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomRecInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Color;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ContentBlock;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetFirstEnterInfoRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.HalfScreen;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.plugin.game.autogen.chatroom.LocalMyChatRoom;
import com.tencent.p014mm.plugin.game.autogen.chatroom.WeappJumpInfo;
import com.tencent.p014mm.plugin.game.chatroom.view.C41811n;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import cx1.C45219a;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import p702ts.C78085c;
import pe3.C47465a;
import py1.C47621l3;
import py1.C47637n5;
import py1.C47713z2;
import qo3.C101218e0;
import yw1.C53601h;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView */
public class ChatRoomListView extends MRecyclerView implements C11385n {

    /* renamed from: S1 */
    public static final /* synthetic */ int f112392S1 = 0;

    /* renamed from: C1 */
    public Context f112393C1;

    /* renamed from: D1 */
    public C41755e f112394D1;

    /* renamed from: E1 */
    public Lbs f112395E1;

    /* renamed from: F1 */
    public ChatRoomFooterView f112396F1;

    /* renamed from: G1 */
    public int f112397G1;

    /* renamed from: H1 */
    public long f112398H1;

    /* renamed from: I1 */
    public long f112399I1;

    /* renamed from: J1 */
    public List<BanAction> f112400J1 = new LinkedList();

    /* renamed from: K1 */
    public JumpInfo f112401K1;

    /* renamed from: L1 */
    public GetCanJoinChatroomResponse f112402L1;

    /* renamed from: M1 */
    public LocalMyChatRoom f112403M1;

    /* renamed from: N1 */
    public boolean f112404N1 = false;

    /* renamed from: O1 */
    public IListener f112405O1;

    /* renamed from: P1 */
    public IListener f112406P1;

    /* renamed from: Q1 */
    public IListener f112407Q1;

    /* renamed from: R1 */
    public C92411b.C92412a f112408R1;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$a */
    public class C41750a implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$a$a */
        public class C41751a implements Runnable {
            public C41751a() {
            }

            public void run() {
                ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(ChatRoomListView.this.f112408R1);
            }
        }

        public C41750a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            Log.m105925i("MicroMsg.ChatRoomListView", "getLocation isOK:%b, longitude:%f, latitude:%f", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2));
            new MMHandler(Looper.getMainLooper()).post(new C41751a());
            if (z) {
                ChatRoomListView.this.f112395E1 = new Lbs();
                Lbs lbs = ChatRoomListView.this.f112395E1;
                lbs.longitude = f;
                lbs.latitude = f2;
            }
            ChatRoomListView chatRoomListView = ChatRoomListView.this;
            chatRoomListView.f112396F1.setLbsInfo(chatRoomListView.f112395E1);
            C86709a0.m107524d().mo123460f(new C39855j(ChatRoomListView.this.f112395E1));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$b */
    public class C41752b implements Runnable {
        public C41752b() {
        }

        public void run() {
            ChatRoomListView chatRoomListView = ChatRoomListView.this;
            chatRoomListView.f112397G1 = chatRoomListView.f112396F1.getHeight();
            int height = ChatRoomListView.this.getHeight();
            int computeVerticalScrollExtent = ChatRoomListView.this.computeVerticalScrollExtent();
            int computeVerticalScrollRange = ChatRoomListView.this.computeVerticalScrollRange();
            Log.m105925i("MicroMsg.ChatRoomListView", "mMinFooterHeight:%d, listViewHeight:%d, extentHeight:%d, rangeHeight:%d", Integer.valueOf(ChatRoomListView.this.f112397G1), Integer.valueOf(height), Integer.valueOf(computeVerticalScrollExtent), Integer.valueOf(computeVerticalScrollRange));
            ChatRoomListView chatRoomListView2 = ChatRoomListView.this;
            int i = ((computeVerticalScrollExtent - computeVerticalScrollRange) - chatRoomListView2.f112397G1) / 2;
            if (i > 0) {
                ChatRoomFooterView chatRoomFooterView = chatRoomListView2.f112396F1;
                View view = chatRoomFooterView.f112368n;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "extendEmptyLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "extendEmptyLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) chatRoomFooterView.f112368n.getLayoutParams();
                layoutParams.topMargin += i;
                layoutParams.bottomMargin += i;
                chatRoomFooterView.f112368n.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$c */
    public class C41753c implements l0$$e {
        public C41753c() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            GetFirstEnterInfoResponse getFirstEnterInfoResponse;
            Log.m105925i("MicroMsg.ChatRoomListView", "showFirstGuidance, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (!((Activity) ChatRoomListView.this.f112393C1).isFinishing() && !((Activity) ChatRoomListView.this.f112393C1).isDestroyed() && i == 0 && i2 == 0 && (getFirstEnterInfoResponse = (GetFirstEnterInfoResponse) cVar.f127056b.f127083a) != null) {
                JumpInfo jumpInfo = getFirstEnterInfoResponse.enter_jump_info;
                if (jumpInfo != null) {
                    C53601h.m60129h(ChatRoomListView.this.f112393C1, jumpInfo);
                    ChatRoomListView.this.mo65469E1(2);
                } else if (!Util.isNullOrNil((List) getFirstEnterInfoResponse.content_list)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Iterator<ContentBlock> it = getFirstEnterInfoResponse.content_list.iterator();
                    int i3 = 0;
                    while (true) {
                        String str2 = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        ContentBlock next = it.next();
                        if (!Util.isNullOrNil(next.content)) {
                            Color color = next.color;
                            if (color != null) {
                                str2 = C85875k4.m106211z() ? color.dark_color : color.light_color;
                            }
                            Integer m = C53601h.m60134m(Util.nullAsNil(str2));
                            if (m == null) {
                                m = Integer.valueOf(ChatRoomListView.this.f112393C1.getResources().getColor(C0966R.color.FG_2));
                            }
                            spannableStringBuilder.append(next.content);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(m.intValue()), i3, next.content.length() + i3, 33);
                            i3 = spannableStringBuilder.length();
                        }
                    }
                    if (spannableStringBuilder.length() == 0) {
                        return 0;
                    }
                    ChatRoomListView chatRoomListView = ChatRoomListView.this;
                    C101218e0 e0Var = new C101218e0(chatRoomListView.getContext(), 2, 0, true);
                    e0Var.mo140677w(chatRoomListView.getResources().getString(C0966R.string.f7u));
                    e0Var.mo140676v(1);
                    e0Var.f296375F = new C41807l(chatRoomListView, e0Var);
                    View inflate = LayoutInflater.from(chatRoomListView.getContext()).inflate(C0966R.C0971layout.avd, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.b0d);
                    ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.b0e);
                    if (C85875k4.m106211z()) {
                        imageView.setImageResource(C0966R.C0969drawable.bg8);
                    } else {
                        imageView.setImageResource(C0966R.C0969drawable.bg_);
                    }
                    textView.setText(spannableStringBuilder);
                    e0Var.mo140663j(inflate);
                    e0Var.mo140655A();
                    chatRoomListView.mo65469E1(1);
                }
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$d */
    public class C41754d extends C54248l.C54250b {

        /* renamed from: a */
        public List<C45219a> f112416a;

        /* renamed from: b */
        public List<C45219a> f112417b;

        public C41754d(ChatRoomListView chatRoomListView, List<C45219a> list, List<C45219a> list2) {
            this.f112416a = list;
            this.f112417b = list2;
        }

        /* renamed from: a */
        public boolean mo11465a(int i, int i2) {
            return false;
        }

        /* renamed from: b */
        public boolean mo11466b(int i, int i2) {
            ChatroomData b = C41811n.m45333b(this.f112416a.get(i));
            ChatroomData b2 = C41811n.m45333b(this.f112417b.get(i2));
            return (b == null || b2 == null || !Util.nullAsNil(b.chatroom_name).equals(b2.chatroom_name)) ? false : true;
        }

        /* renamed from: d */
        public int mo11468d() {
            return this.f112417b.size();
        }

        /* renamed from: e */
        public int mo11469e() {
            return this.f112416a.size();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$e */
    public class C41755e extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public List<C45219a> f112418d = new CopyOnWriteArrayList();

        /* renamed from: e */
        public C45219a f112419e;

        /* renamed from: f */
        public C45219a f112420f;

        /* renamed from: g */
        public boolean f112421g;

        /* renamed from: h */
        public List<String> f112422h;

        /* renamed from: i */
        public Map<Object, C41811n.C41817e.C41823f> f112423i;

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$e$a */
        public class C41756a implements C54258u {
            public C41756a() {
            }

            /* renamed from: a */
            public void mo2860a(int i, int i2) {
                Log.m105918d("MicroMsg.ChatRoomListView", "onRemoved");
                C41755e.this.notifyItemRangeRemoved(i, i2);
            }

            /* renamed from: b */
            public void mo2861b(int i, int i2) {
                Log.m105918d("MicroMsg.ChatRoomListView", "onInserted");
                C41755e.this.notifyItemRangeInserted(i, i2);
            }

            /* renamed from: c */
            public void mo2862c(int i, int i2, Object obj) {
                C41755e.this.notifyItemRangeChanged(i, i2);
            }

            /* renamed from: d */
            public void mo2863d(int i, int i2) {
                Log.m105919d("MicroMsg.ChatRoomListView", "onMoved, fromPosition:%d, toPosition:%d", Integer.valueOf(i), Integer.valueOf(i2));
                C41755e.this.notifyItemMoved(i, i2);
            }
        }

        public C41755e() {
            this.f112419e = new C45219a(1, (C47465a) null, false, ChatRoomListView.this.f112393C1.getString(C0966R.string.fas));
            this.f112420f = new C45219a(3, (C47465a) null, false, ChatRoomListView.this.f112393C1.getString(C0966R.string.fbg));
            this.f112421g = false;
            this.f112422h = new ArrayList();
            this.f112423i = new HashMap();
        }

        /* renamed from: F4 */
        public final ChatroomData mo65473F4(int i) {
            C45219a aVar;
            if (i >= ((CopyOnWriteArrayList) this.f112418d).size() || i < 0 || (aVar = (C45219a) ((CopyOnWriteArrayList) this.f112418d).get(i)) == null) {
                return null;
            }
            return C41811n.m45333b(aVar);
        }

        /* renamed from: G4 */
        public void mo65474G4() {
            if (ChatRoomListView.this.f112401K1 != null) {
                int indexOf = ((CopyOnWriteArrayList) this.f112418d).indexOf(this.f112419e);
                int indexOf2 = ((CopyOnWriteArrayList) this.f112418d).indexOf(this.f112420f);
                if (indexOf >= 0) {
                    C45219a aVar = this.f112419e;
                    ChatRoomListView chatRoomListView = ChatRoomListView.this;
                    aVar.f122542e = chatRoomListView.f112401K1;
                    C45219a aVar2 = this.f112420f;
                    aVar2.f122542e = null;
                    aVar2.f122541d = chatRoomListView.f112393C1.getString(C0966R.string.fbg);
                } else {
                    this.f112419e.f122542e = null;
                    C45219a aVar3 = this.f112420f;
                    ChatRoomListView chatRoomListView2 = ChatRoomListView.this;
                    aVar3.f122542e = chatRoomListView2.f112401K1;
                    aVar3.f122541d = chatRoomListView2.f112393C1.getString(C0966R.string.fb_);
                }
                if (indexOf >= 0) {
                    notifyItemChanged(indexOf);
                }
                if (indexOf2 >= 0) {
                    notifyItemChanged(indexOf2);
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|22|23|24) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00a1 */
        /* renamed from: O4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo65475O4(java.util.List<com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomInfo> r25) {
            /*
                r24 = this;
                r1 = r24
                monitor-enter(r24)
                if (r25 == 0) goto L_0x00dd
                java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x00da }
                r0.<init>()     // Catch:{ all -> 0x00da }
                java.util.List<cx1.a> r2 = r1.f112418d     // Catch:{ all -> 0x00da }
                r0.addAll(r2)     // Catch:{ all -> 0x00da }
                java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ all -> 0x00da }
                r2.<init>()     // Catch:{ all -> 0x00da }
                java.util.Iterator r3 = r25.iterator()     // Catch:{ all -> 0x00da }
            L_0x0018:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00da }
                if (r4 == 0) goto L_0x002e
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00da }
                com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo r4 = (com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomInfo) r4     // Catch:{ all -> 0x00da }
                cx1.a r5 = new cx1.a     // Catch:{ all -> 0x00da }
                r6 = 2
                r5.<init>(r6, r4)     // Catch:{ all -> 0x00da }
                r2.add(r5)     // Catch:{ all -> 0x00da }
                goto L_0x0018
            L_0x002e:
                java.util.List<cx1.a> r3 = r1.f112418d     // Catch:{ all -> 0x00da }
                cx1.a r4 = r1.f112419e     // Catch:{ all -> 0x00da }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00da }
                int r3 = r3.indexOf(r4)     // Catch:{ all -> 0x00da }
                java.util.List<cx1.a> r4 = r1.f112418d     // Catch:{ all -> 0x00da }
                cx1.a r5 = r1.f112420f     // Catch:{ all -> 0x00da }
                java.util.concurrent.CopyOnWriteArrayList r4 = (java.util.concurrent.CopyOnWriteArrayList) r4     // Catch:{ all -> 0x00da }
                int r4 = r4.indexOf(r5)     // Catch:{ all -> 0x00da }
                if (r4 >= 0) goto L_0x004c
                java.util.List<cx1.a> r4 = r1.f112418d     // Catch:{ all -> 0x00da }
                java.util.concurrent.CopyOnWriteArrayList r4 = (java.util.concurrent.CopyOnWriteArrayList) r4     // Catch:{ all -> 0x00da }
                int r4 = r4.size()     // Catch:{ all -> 0x00da }
            L_0x004c:
                int r5 = r25.size()     // Catch:{ all -> 0x00da }
                r6 = 0
                r7 = 1
                if (r5 != 0) goto L_0x0064
                java.util.List<cx1.a> r2 = r1.f112418d     // Catch:{ all -> 0x00da }
                java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2     // Catch:{ all -> 0x00da }
                java.util.List r2 = r2.subList(r6, r4)     // Catch:{ all -> 0x00da }
                java.util.List<cx1.a> r3 = r1.f112418d     // Catch:{ all -> 0x00da }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00da }
                r3.removeAll(r2)     // Catch:{ all -> 0x00da }
                goto L_0x00c1
            L_0x0064:
                if (r3 >= 0) goto L_0x0077
                java.util.List<cx1.a> r3 = r1.f112418d     // Catch:{ all -> 0x00da }
                cx1.a r4 = r1.f112419e     // Catch:{ all -> 0x00da }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00da }
                r3.add(r6, r4)     // Catch:{ all -> 0x00da }
                java.util.List<cx1.a> r3 = r1.f112418d     // Catch:{ all -> 0x00da }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00da }
                r3.addAll(r7, r2)     // Catch:{ all -> 0x00da }
                goto L_0x008d
            L_0x0077:
                java.util.List<cx1.a> r3 = r1.f112418d     // Catch:{ all -> 0x00da }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00da }
                java.util.List r3 = r3.subList(r7, r4)     // Catch:{ all -> 0x00da }
                java.util.List<cx1.a> r4 = r1.f112418d     // Catch:{ all -> 0x00da }
                java.util.concurrent.CopyOnWriteArrayList r4 = (java.util.concurrent.CopyOnWriteArrayList) r4     // Catch:{ all -> 0x00da }
                r4.removeAll(r3)     // Catch:{ all -> 0x00da }
                java.util.List<cx1.a> r3 = r1.f112418d     // Catch:{ all -> 0x00da }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00da }
                r3.addAll(r7, r2)     // Catch:{ all -> 0x00da }
            L_0x008d:
                boolean r3 = r1.f112421g     // Catch:{ all -> 0x00da }
                if (r3 != 0) goto L_0x00c1
                r1.f112421g = r7     // Catch:{ all -> 0x00da }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x00da }
                r3.<init>()     // Catch:{ all -> 0x00da }
                java.lang.String r4 = "GroupNum"
                int r2 = r2.size()     // Catch:{ JSONException -> 0x00a1 }
                r3.put(r4, r2)     // Catch:{ JSONException -> 0x00a1 }
            L_0x00a1:
                com.tencent.mm.game.report.d$a r8 = com.tencent.p014mm.game.report.C40308d.f108375a     // Catch:{ all -> 0x00da }
                r9 = 1001(0x3e9, double:4.946E-321)
                r11 = 0
                r15 = 0
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.this     // Catch:{ all -> 0x00da }
                long r4 = r2.f112399I1     // Catch:{ all -> 0x00da }
                long r13 = r2.f112398H1     // Catch:{ all -> 0x00da }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                java.lang.String r23 = r3.toString()     // Catch:{ all -> 0x00da }
                r19 = r13
                r2 = 1
                r13 = r2
                r17 = r4
                r8.mo62999k(r9, r11, r13, r15, r17, r19, r21, r22, r23)     // Catch:{ all -> 0x00da }
            L_0x00c1:
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$d r2 = new com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$d     // Catch:{ all -> 0x00da }
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.this     // Catch:{ all -> 0x00da }
                java.util.List<cx1.a> r4 = r1.f112418d     // Catch:{ all -> 0x00da }
                r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x00da }
                androidx.recyclerview.widget.l$c r0 = androidx.recyclerview.widget.C54248l.m60949a(r2, r7)     // Catch:{ all -> 0x00da }
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$e$a r2 = new com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$e$a     // Catch:{ all -> 0x00da }
                r2.<init>()     // Catch:{ all -> 0x00da }
                r0.mo75045a(r2)     // Catch:{ all -> 0x00da }
                r24.mo65474G4()     // Catch:{ all -> 0x00da }
                goto L_0x00dd
            L_0x00da:
                r0 = move-exception
                monitor-exit(r24)
                throw r0
            L_0x00dd:
                monitor-exit(r24)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.C41755e.mo65475O4(java.util.List):void");
        }

        /* renamed from: g5 */
        public synchronized void mo65476g5(List<ChatroomRecInfo> list) {
            synchronized (this) {
                int indexOf = ((CopyOnWriteArrayList) this.f112418d).indexOf(this.f112420f);
                if (indexOf >= 0) {
                    List<C45219a> list2 = this.f112418d;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list2;
                    ((CopyOnWriteArrayList) list2).removeAll(copyOnWriteArrayList.subList(indexOf, ((CopyOnWriteArrayList) list2).size()));
                }
                ChatRoomListView chatRoomListView = ChatRoomListView.this;
                chatRoomListView.mo63441z1(chatRoomListView.f112396F1);
                ((CopyOnWriteArrayList) this.f112418d).add(this.f112420f);
                mo65474G4();
                boolean z = true;
                if (!Util.isNullOrNil((List) list)) {
                    LinkedList linkedList = new LinkedList();
                    for (ChatroomRecInfo aVar : list) {
                        linkedList.add(new C45219a(4, aVar));
                    }
                    if (linkedList.size() == 0) {
                        z = false;
                    }
                    ((CopyOnWriteArrayList) this.f112418d).addAll(linkedList);
                    notifyDataSetChanged();
                } else {
                    z = false;
                }
                if (z) {
                    ChatRoomListView.this.f112396F1.mo65457a();
                    C40308d.C40309a aVar2 = C40308d.f108375a;
                    ChatRoomListView chatRoomListView2 = ChatRoomListView.this;
                    aVar2.mo62999k(1002, 0, 1, 0, chatRoomListView2.f112399I1, chatRoomListView2.f112398H1, "", "", "");
                } else {
                    View view = ChatRoomListView.this.f112396F1.f112368n;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ChatRoomListView chatRoomListView3 = ChatRoomListView.this;
                chatRoomListView3.addFooterView(chatRoomListView3.f112396F1);
            }
        }

        public int getItemCount() {
            return ((CopyOnWriteArrayList) this.f112418d).size();
        }

        public int getItemViewType(int i) {
            return ((C45219a) ((CopyOnWriteArrayList) this.f112418d).get(i)).f122538a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00db  */
        /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r45, int r46) {
            /*
                r44 = this;
                r0 = r44
                r1 = r45
                r2 = r46
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData r3 = r0.mo65473F4(r2)
                r4 = 4
                r5 = 2
                if (r3 != 0) goto L_0x0013
            L_0x0011:
                r10 = 0
                goto L_0x0037
            L_0x0013:
                int r3 = r0.getItemViewType(r2)
                if (r3 != r5) goto L_0x0024
                java.util.List<cx1.a> r3 = r0.f112418d
                cx1.a r7 = r0.f112419e
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3
                int r3 = r3.indexOf(r7)
                goto L_0x0034
            L_0x0024:
                int r3 = r0.getItemViewType(r2)
                if (r3 != r4) goto L_0x0011
                java.util.List<cx1.a> r3 = r0.f112418d
                cx1.a r7 = r0.f112420f
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3
                int r3 = r3.indexOf(r7)
            L_0x0034:
                int r3 = r2 - r3
                r10 = r3
            L_0x0037:
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData r3 = r0.mo65473F4(r2)
                int r7 = r0.getItemViewType(r2)
                if (r3 == 0) goto L_0x00b1
                java.util.List<java.lang.String> r8 = r0.f112422h
                java.lang.String r9 = r3.chatroom_name
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                boolean r8 = r8.contains(r9)
                if (r8 == 0) goto L_0x004e
                goto L_0x00b1
            L_0x004e:
                java.util.List<java.lang.String> r8 = r0.f112422h
                java.lang.String r9 = r3.chatroom_name
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                r8.add(r9)
                org.json.JSONObject r8 = new org.json.JSONObject
                r8.<init>()
                java.lang.String r9 = "reportStr"
                java.lang.String r11 = r3.report_str     // Catch:{ Exception -> 0x0064 }
                r8.put(r9, r11)     // Catch:{ Exception -> 0x0064 }
                goto L_0x0065
            L_0x0064:
            L_0x0065:
                if (r7 != r5) goto L_0x008b
                com.tencent.mm.game.report.d$a r12 = com.tencent.p014mm.game.report.C40308d.f108375a
                long r4 = (long) r10
                r17 = 1
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r7 = com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.this
                long r13 = r7.f112399I1
                long r6 = r7.f112398H1
                java.lang.String r9 = r3.appid
                java.lang.String r3 = r3.chatroom_name
                java.lang.String r27 = r8.toString()
                r19 = 0
                r21 = r13
                r13 = 1001(0x3e9, double:4.946E-321)
                r15 = r4
                r23 = r6
                r25 = r9
                r26 = r3
                r12.mo62999k(r13, r15, r17, r19, r21, r23, r25, r26, r27)
                goto L_0x00b1
            L_0x008b:
                if (r7 != r4) goto L_0x00b1
                com.tencent.mm.game.report.d$a r28 = com.tencent.p014mm.game.report.C40308d.f108375a
                r29 = 1002(0x3ea, double:4.95E-321)
                long r4 = (long) r10
                r33 = 1
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r6 = com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.this
                long r11 = r6.f112399I1
                long r6 = r6.f112398H1
                java.lang.String r9 = r3.appid
                java.lang.String r3 = r3.chatroom_name
                java.lang.String r43 = r8.toString()
                r35 = 0
                r31 = r4
                r37 = r11
                r39 = r6
                r41 = r9
                r42 = r3
                r28.mo62999k(r29, r31, r33, r35, r37, r39, r41, r42, r43)
            L_0x00b1:
                boolean r3 = r1 instanceof com.tencent.p014mm.plugin.game.chatroom.view.C41811n.C41817e
                if (r3 == 0) goto L_0x00bc
                r3 = r1
                com.tencent.mm.plugin.game.chatroom.view.n$e r3 = (com.tencent.p014mm.plugin.game.chatroom.view.C41811n.C41817e) r3
                java.util.Map<java.lang.Object, com.tencent.mm.plugin.game.chatroom.view.n$e$f> r4 = r0.f112423i
                r3.f112704S = r4
            L_0x00bc:
                r7 = r1
                com.tencent.mm.plugin.game.chatroom.view.n$b r7 = (com.tencent.p014mm.plugin.game.chatroom.view.C41811n.C41813b) r7
                java.util.List<cx1.a> r3 = r0.f112418d
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3
                java.lang.Object r2 = r3.get(r2)
                r8 = r2
                cx1.a r8 = (cx1.C45219a) r8
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.this
                com.tencent.mm.plugin.game.autogen.chatroom.Lbs r9 = r2.f112395E1
                long r11 = r2.f112399I1
                long r13 = r2.f112398H1
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> r15 = r2.f112400J1
                r7.mo65603y(r8, r9, r10, r11, r13, r15)
                boolean r2 = r1 instanceof com.tencent.p014mm.plugin.game.chatroom.view.C41811n.C41824f
                if (r2 == 0) goto L_0x0220
                com.tencent.mm.plugin.game.chatroom.view.n$f r1 = (com.tencent.p014mm.plugin.game.chatroom.view.C41811n.C41824f) r1
                jx1.a r2 = jx1.C46577a.f125473d
                com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice r2 = jx1.C46577a.f125477h
                boolean r3 = r1.f112734M
                if (r3 == 0) goto L_0x00e7
                goto L_0x0220
            L_0x00e7:
                android.view.View r3 = r1.f112726E
                r4 = 8
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r12.mo10233c(r4)
                java.lang.Object[] r5 = r12.mo10232b()
                java.lang.String r6 = "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH"
                java.lang.String r7 = "setPermissionNotice"
                java.lang.String r8 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomNotice;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                r4 = r3
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                r4 = 0
                java.lang.Object r5 = r12.mo10231a(r4)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r4 = r5.intValue()
                r3.setVisibility(r4)
                java.lang.String r5 = "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH"
                java.lang.String r6 = "setPermissionNotice"
                java.lang.String r7 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomNotice;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r4 = r3
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
                boolean r3 = r1.f112733L
                if (r3 == 0) goto L_0x0220
                if (r2 == 0) goto L_0x0220
                java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> r3 = r2.content_list
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
                if (r3 != 0) goto L_0x0220
                com.tencent.mm.plugin.game.autogen.chatroom.Color r3 = r2.bg_color
                if (r3 == 0) goto L_0x0220
                boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r3 == 0) goto L_0x0148
                com.tencent.mm.plugin.game.autogen.chatroom.Color r3 = r2.bg_color
                java.lang.String r3 = r3.dark_color
                goto L_0x014c
            L_0x0148:
                com.tencent.mm.plugin.game.autogen.chatroom.Color r3 = r2.bg_color
                java.lang.String r3 = r3.light_color
            L_0x014c:
                java.lang.Integer r3 = yw1.C53601h.m60134m(r3)
                if (r3 != 0) goto L_0x0154
                goto L_0x0220
            L_0x0154:
                android.view.View r4 = r1.f112726E
                android.graphics.drawable.Drawable r4 = r4.getBackground()
                android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
                if (r4 != 0) goto L_0x0160
                goto L_0x0220
            L_0x0160:
                int r3 = r3.intValue()
                r4.setColor(r3)
                android.view.View r3 = r1.f112726E
                k20.a r4 = new k20.a
                r4.<init>()
                r5 = 0
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r4.mo10233c(r6)
                java.lang.Object[] r6 = r4.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH"
                java.lang.String r8 = "setPermissionNotice"
                java.lang.String r9 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomNotice;)V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r5 = r3
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                r12 = 0
                java.lang.Object r4 = r4.mo10231a(r12)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r6 = "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH"
                java.lang.String r7 = "setPermissionNotice"
                java.lang.String r8 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomNotice;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
                r3.<init>()
                java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> r2 = r2.content_list
                java.util.Iterator r2 = r2.iterator()
                r6 = 0
            L_0x01b3:
                boolean r4 = r2.hasNext()
                r5 = 1
                if (r4 == 0) goto L_0x0219
                java.lang.Object r4 = r2.next()
                com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock r4 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ContentBlock) r4
                java.lang.String r7 = r4.content
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 == 0) goto L_0x01c9
                goto L_0x01b3
            L_0x01c9:
                com.tencent.mm.plugin.game.autogen.chatroom.Color r7 = r4.color
                r8 = 0
                if (r7 != 0) goto L_0x01d0
                r7 = r8
                goto L_0x01db
            L_0x01d0:
                boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r9 == 0) goto L_0x01d9
                java.lang.String r7 = r7.dark_color
                goto L_0x01db
            L_0x01d9:
                java.lang.String r7 = r7.light_color
            L_0x01db:
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
                java.lang.Integer r7 = yw1.C53601h.m60134m(r7)
                if (r7 != 0) goto L_0x01e6
                goto L_0x01b3
            L_0x01e6:
                java.lang.String r9 = r4.content
                r3.append(r9)
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r9 = r4.jump_info
                r10 = 33
                if (r9 != 0) goto L_0x0205
                android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
                int r7 = r7.intValue()
                r5.<init>(r7)
                java.lang.String r4 = r4.content
                int r4 = r4.length()
                int r4 = r4 + r6
                r3.setSpan(r5, r6, r4, r10)
                goto L_0x0214
            L_0x0205:
                com.tencent.mm.plugin.game.chatroom.view.p r7 = new com.tencent.mm.plugin.game.chatroom.view.p
                r7.<init>(r1, r5, r8, r4)
                java.lang.String r4 = r4.content
                int r4 = r4.length()
                int r4 = r4 + r6
                r3.setSpan(r7, r6, r4, r10)
            L_0x0214:
                int r6 = r3.length()
                goto L_0x01b3
            L_0x0219:
                r1.f112734M = r5
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r1.f112727F
                r1.mo104279b(r3)
            L_0x0220:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.C41755e.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C16631z zVar;
            if (i != 1) {
                if (i == 2) {
                    zVar = new C41811n.C41814c(LayoutInflater.from(ChatRoomListView.this.f112393C1).inflate(C0966R.C0971layout.bjp, viewGroup, false));
                } else if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    zVar = new C41811n.C41817e(LayoutInflater.from(ChatRoomListView.this.f112393C1).inflate(C0966R.C0971layout.bqc, viewGroup, false));
                }
                return zVar;
            }
            zVar = new C41811n.C41824f(LayoutInflater.from(ChatRoomListView.this.f112393C1).inflate(C0966R.C0971layout.f6803oz, viewGroup, false));
            return zVar;
        }
    }

    public ChatRoomListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C40008f fVar = C40008f.f107254d;
        this.f112405O1 = new IListener<GetChatRoomMsgEvent>(fVar) {
            {
                this.__eventId = -2093822894;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r2) {
                /*
                    r1 = this;
                    com.tencent.mm.autogen.events.GetChatRoomMsgEvent r2 = (com.tencent.p014mm.autogen.events.GetChatRoomMsgEvent) r2
                    monitor-enter(r1)
                    com.tencent.mm.autogen.events.GetChatRoomMsgEvent$a r2 = r2.f107584d     // Catch:{ all -> 0x001d }
                    byte[] r2 = r2.f107585a     // Catch:{ all -> 0x001d }
                    com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom r0 = new com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom     // Catch:{ all -> 0x001d }
                    r0.<init>()     // Catch:{ all -> 0x001d }
                    r0.parseFrom(r2)     // Catch:{ IOException -> 0x000f }
                L_0x000f:
                    com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.this     // Catch:{ all -> 0x001d }
                    r2.f112403M1 = r0     // Catch:{ all -> 0x001d }
                    com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$e r2 = r2.f112394D1     // Catch:{ all -> 0x001d }
                    java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> r0 = r0.my_chatroom_info_list     // Catch:{ all -> 0x001d }
                    r2.mo65475O4(r0)     // Catch:{ all -> 0x001d }
                    monitor-exit(r1)
                    r2 = 0
                    return r2
                L_0x001d:
                    r2 = move-exception
                    monitor-exit(r1)
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.C417471.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f112406P1 = new IListener<ChatRoomJoinOrQuitEvent>(fVar) {
            {
                this.__eventId = 841969243;
            }

            public boolean callback(IEvent iEvent) {
                ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent = (ChatRoomJoinOrQuitEvent) iEvent;
                int i = chatRoomJoinOrQuitEvent.f107400d.f107401a;
                ((C119157j) C119157j.f356862d).mo183895z(new C41803j(this, chatRoomJoinOrQuitEvent));
                return false;
            }
        };
        this.f112407Q1 = new IListener<ShowMultiTaskEvent>(fVar) {
            {
                this.__eventId = -722797207;
            }

            public boolean callback(IEvent iEvent) {
                ShowMultiTaskEvent showMultiTaskEvent = (ShowMultiTaskEvent) iEvent;
                C119179t tVar = C119157j.f356862d;
                C41805k kVar = new C41805k(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(kVar, 1000, false);
                return false;
            }
        };
        this.f112408R1 = new C41750a();
        mo65468D1(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        return;
     */
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo65466B1(com.tencent.p014mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse r20, boolean r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            monitor-enter(r19)
            if (r0 != 0) goto L_0x0009
            monitor-exit(r19)
            return
        L_0x0009:
            java.lang.String r2 = "MicroMsg.ChatRoomListView"
            java.lang.String r3 = "attachRecommendData, useCache:%b"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x007e }
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r21)     // Catch:{ all -> 0x007e }
            r4[r5] = r6     // Catch:{ all -> 0x007e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)     // Catch:{ all -> 0x007e }
            boolean r2 = r0.show_entrance     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x003d
            java.lang.String r0 = "MicroMsg.ChatRoomListView"
            java.lang.String r2 = "show_entrance: false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x007e }
            jx1.a r0 = jx1.C46577a.f125473d     // Catch:{ all -> 0x007e }
            r0.mo71882b()     // Catch:{ all -> 0x007e }
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$e r0 = r1.f112394D1     // Catch:{ all -> 0x007e }
            java.util.List<cx1.a> r2 = r0.f112418d     // Catch:{ all -> 0x007e }
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2     // Catch:{ all -> 0x007e }
            r2.clear()     // Catch:{ all -> 0x007e }
            r0.notifyDataSetChanged()     // Catch:{ all -> 0x007e }
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView r0 = r1.f112396F1     // Catch:{ all -> 0x007e }
            r1.mo63441z1(r0)     // Catch:{ all -> 0x007e }
            monitor-exit(r19)
            return
        L_0x003d:
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r2 = r0.create_jump_info     // Catch:{ all -> 0x007e }
            r1.f112401K1 = r2     // Catch:{ all -> 0x007e }
            com.tencent.mm.game.report.d$a r3 = com.tencent.p014mm.game.report.C40308d.f108375a     // Catch:{ all -> 0x007e }
            r4 = 1003(0x3eb, double:4.955E-321)
            r6 = 2
            r8 = 1
            r10 = 0
            long r12 = r1.f112399I1     // Catch:{ all -> 0x007e }
            long r14 = r1.f112398H1     // Catch:{ all -> 0x007e }
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            r3.mo62999k(r4, r6, r8, r10, r12, r14, r16, r17, r18)     // Catch:{ all -> 0x007e }
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$e r2 = r1.f112394D1     // Catch:{ all -> 0x007e }
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo> r3 = r0.chatroom_info_list     // Catch:{ all -> 0x007e }
            r2.mo65476g5(r3)     // Catch:{ all -> 0x007e }
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> r2 = r0.ban_action_list     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x007c
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> r2 = r1.f112400J1     // Catch:{ all -> 0x007e }
            java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch:{ all -> 0x007e }
            r2.clear()     // Catch:{ all -> 0x007e }
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> r2 = r1.f112400J1     // Catch:{ all -> 0x007e }
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> r3 = r0.ban_action_list     // Catch:{ all -> 0x007e }
            java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch:{ all -> 0x007e }
            r2.addAll(r3)     // Catch:{ all -> 0x007e }
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView r2 = r1.f112396F1     // Catch:{ all -> 0x007e }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail r3 = r0.find_more_chatroom_jump_info     // Catch:{ all -> 0x007e }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail r0 = r0.chatroom_rank_jump_info     // Catch:{ all -> 0x007e }
            r2.mo65459c(r3, r0)     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r19)
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.mo65466B1(com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse, boolean):void");
    }

    /* renamed from: C1 */
    public void mo65467C1() {
        if (!this.f112404N1) {
            this.f112404N1 = true;
            if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_FIRST_ENTER_INT, 0)) <= 0) {
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getfirstenterinfo";
                bVar.f127069d = 5139;
                bVar.f127070e = 0;
                bVar.f127071f = 0;
                GetFirstEnterInfoRequest getFirstEnterInfoRequest = new GetFirstEnterInfoRequest();
                Lbs lbs = this.f112395E1;
                if (lbs != null) {
                    getFirstEnterInfoRequest.lbs_info = lbs;
                }
                bVar.f127066a = getFirstEnterInfoRequest;
                bVar.f127067b = new GetFirstEnterInfoResponse();
                C89144l0.m111429e(bVar.mo72403a(), new C41753c(), false);
            }
        }
    }

    /* renamed from: D1 */
    public final void mo65468D1(Context context) {
        this.f112393C1 = context;
        Activity activity = (Activity) context;
        this.f112398H1 = activity.getIntent().getLongExtra("game_report_sourceid", 0);
        this.f112399I1 = activity.getIntent().getLongExtra("game_report_ssid", 0);
        if (activity.getIntent().getBooleanExtra("game_from_chatroom_detail", false)) {
            mo65470F1();
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.mo16974W(1);
        setLayoutManager(linearLayoutManager);
        setItemAnimator((RecyclerView.C16616j) null);
        C41755e eVar = new C41755e();
        this.f112394D1 = eVar;
        setAdapter(eVar);
        this.f112396F1 = new ChatRoomFooterView(this.f112393C1);
        Log.m105925i("MicroMsg.ChatRoomListView", "one min footer height:%d", Integer.valueOf(this.f112397G1));
        this.f112396F1.post(new C41752b());
    }

    /* renamed from: E1 */
    public final void mo65469E1(int i) {
        C40308d.f108375a.mo62999k(1004, 0, 1, (long) i, this.f112399I1, this.f112398H1, "", "", "");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_FIRST_ENTER_INT, 1);
    }

    /* renamed from: F1 */
    public final void mo65470F1() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_MULTI_TASK_EDU_INT;
        int nullAsNil = Util.nullAsNil((Integer) i.mo119685f(aVar, 0));
        Activity activity = (Activity) this.f112393C1;
        if (nullAsNil <= 0 && !activity.isFinishing() && !activity.isDestroyed() && C41853c.m45368b() != null && C41853c.m45368b().f128044e != null && C41853c.m45368b().f128044e.f128117e != null) {
            C47621l3 l3Var = C41853c.m45368b().f128044e.f128117e;
            C47637n5 n5Var = l3Var.f127857f;
            C47713z2 z2Var = l3Var.f127858g;
            JumpInfo jumpInfo = new JumpInfo();
            jumpInfo.jump_url = l3Var.f127856e;
            jumpInfo.jump_type = l3Var.f127855d;
            if (n5Var != null) {
                WeappJumpInfo weappJumpInfo = new WeappJumpInfo();
                weappJumpInfo.appid = n5Var.f127893d;
                weappJumpInfo.path = n5Var.f127894e;
                jumpInfo.weapp_jump_info = weappJumpInfo;
            }
            if (z2Var != null) {
                HalfScreen halfScreen = new HalfScreen();
                halfScreen.screen_height_dp = z2Var.f128182e;
                halfScreen.screen_height_percent = z2Var.f128183f;
                halfScreen.type = z2Var.f128181d;
                jumpInfo.half_screen = halfScreen;
            }
            C53601h.m60129h(this.f112393C1, jumpInfo);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C86709a0.m107524d().mo123455a(4631, this);
        this.f112406P1.alive();
        this.f112405O1.alive();
        this.f112407Q1.alive();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C86709a0.m107524d().mo123470p(4631, this);
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this.f112408R1);
        this.f112406P1.dead();
        this.f112405O1.dead();
        this.f112407Q1.dead();
        C41811n.m45332a();
        if (this.f112402L1 != null) {
            GamePBCacheEvent gamePBCacheEvent = new GamePBCacheEvent();
            GamePBCacheEvent.C40109a aVar = gamePBCacheEvent.f107561d;
            aVar.f107562a = 2;
            aVar.f107563b = "cache_chatroom_recommend";
            try {
                aVar.f107564c = this.f112402L1.toByteArray();
            } catch (IOException unused) {
            }
            gamePBCacheEvent.publish();
        }
        if (this.f112403M1 != null) {
            GamePBCacheEvent gamePBCacheEvent2 = new GamePBCacheEvent();
            GamePBCacheEvent.C40109a aVar2 = gamePBCacheEvent2.f107561d;
            aVar2.f107562a = 2;
            aVar2.f107563b = "cache_my_chatroom";
            try {
                aVar2.f107564c = this.f112403M1.toByteArray();
            } catch (IOException unused2) {
            }
            gamePBCacheEvent2.publish();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 4631 && i == 0 && i2 == 0) {
            GetCanJoinChatroomResponse getCanJoinChatroomResponse = (GetCanJoinChatroomResponse) ((C39855j) yVar).f106886e.f127056b.f127083a;
            this.f112402L1 = getCanJoinChatroomResponse;
            mo65466B1(getCanJoinChatroomResponse, false);
        }
    }

    public ChatRoomListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C40008f fVar = C40008f.f107254d;
        this.f112405O1 = new IListener<GetChatRoomMsgEvent>(fVar) {
            {
                this.__eventId = -2093822894;
            }

            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r2) {
                /*
                    r1 = this;
                    com.tencent.mm.autogen.events.GetChatRoomMsgEvent r2 = (com.tencent.p014mm.autogen.events.GetChatRoomMsgEvent) r2
                    monitor-enter(r1)
                    com.tencent.mm.autogen.events.GetChatRoomMsgEvent$a r2 = r2.f107584d     // Catch:{ all -> 0x001d }
                    byte[] r2 = r2.f107585a     // Catch:{ all -> 0x001d }
                    com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom r0 = new com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom     // Catch:{ all -> 0x001d }
                    r0.<init>()     // Catch:{ all -> 0x001d }
                    r0.parseFrom(r2)     // Catch:{ IOException -> 0x000f }
                L_0x000f:
                    com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.this     // Catch:{ all -> 0x001d }
                    r2.f112403M1 = r0     // Catch:{ all -> 0x001d }
                    com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$e r2 = r2.f112394D1     // Catch:{ all -> 0x001d }
                    java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> r0 = r0.my_chatroom_info_list     // Catch:{ all -> 0x001d }
                    r2.mo65475O4(r0)     // Catch:{ all -> 0x001d }
                    monitor-exit(r1)
                    r2 = 0
                    return r2
                L_0x001d:
                    r2 = move-exception
                    monitor-exit(r1)
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView.C417471.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f112406P1 = new IListener<ChatRoomJoinOrQuitEvent>(fVar) {
            {
                this.__eventId = 841969243;
            }

            public boolean callback(IEvent iEvent) {
                ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent = (ChatRoomJoinOrQuitEvent) iEvent;
                int i = chatRoomJoinOrQuitEvent.f107400d.f107401a;
                ((C119157j) C119157j.f356862d).mo183895z(new C41803j(this, chatRoomJoinOrQuitEvent));
                return false;
            }
        };
        this.f112407Q1 = new IListener<ShowMultiTaskEvent>(fVar) {
            {
                this.__eventId = -722797207;
            }

            public boolean callback(IEvent iEvent) {
                ShowMultiTaskEvent showMultiTaskEvent = (ShowMultiTaskEvent) iEvent;
                C119179t tVar = C119157j.f356862d;
                C41805k kVar = new C41805k(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(kVar, 1000, false);
                return false;
            }
        };
        this.f112408R1 = new C41750a();
        mo65468D1(context);
    }
}
