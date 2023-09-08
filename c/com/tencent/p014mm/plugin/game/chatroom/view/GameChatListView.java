package com.tencent.p014mm.plugin.game.chatroom.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax1.C39641d;
import ax1.C39645h;
import bx1.C39850e;
import bx1.C39862p;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CancelTickleMsgEvent;
import com.tencent.p014mm.autogen.events.GamePBCacheEvent;
import com.tencent.p014mm.autogen.events.JumpTargetEvent;
import com.tencent.p014mm.autogen.events.NotifyNewMsgEvent;
import com.tencent.p014mm.autogen.events.TickleSomeoneMsgEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Channel;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomJumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgText;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.LocalCacheChatMsg;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgOptions;
import com.tencent.p014mm.plugin.game.autogen.chatroom.NoticeMsg;
import com.tencent.p014mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TopicInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gy3.C87412m;
import ix1.C46337n;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import yw1.C53591c;
import yw1.C53600g;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView */
public class GameChatListView extends MRecyclerView implements C11385n, C39645h {

    /* renamed from: C1 */
    public C41771f f112506C1;

    /* renamed from: D1 */
    public Context f112507D1;

    /* renamed from: E1 */
    public long f112508E1;

    /* renamed from: F1 */
    public long f112509F1;

    /* renamed from: G1 */
    public int f112510G1 = 1;

    /* renamed from: H1 */
    public Map<String, C53591c.C53598g> f112511H1 = new HashMap();

    /* renamed from: I1 */
    public String f112512I1;

    /* renamed from: J1 */
    public int f112513J1;

    /* renamed from: K1 */
    public List<Channel> f112514K1;

    /* renamed from: L1 */
    public JumpInfo f112515L1;

    /* renamed from: M1 */
    public ChatroomJumpInfo f112516M1;

    /* renamed from: N1 */
    public String f112517N1;

    /* renamed from: O1 */
    public C39641d f112518O1;

    /* renamed from: P1 */
    public boolean f112519P1 = true;

    /* renamed from: Q1 */
    public long f112520Q1 = 0;

    /* renamed from: R1 */
    public long f112521R1 = 0;

    /* renamed from: S1 */
    public View f112522S1;

    /* renamed from: T1 */
    public TextView f112523T1;

    /* renamed from: U1 */
    public ImageView f112524U1;

    /* renamed from: V1 */
    public View f112525V1;

    /* renamed from: W1 */
    public TextView f112526W1;

    /* renamed from: X1 */
    public LinearLayoutManager f112527X1;

    /* renamed from: Y1 */
    public C41773g f112528Y1;

    /* renamed from: Z1 */
    public boolean f112529Z1 = true;

    /* renamed from: a2 */
    public boolean f112530a2 = true;

    /* renamed from: b2 */
    public Map<Long, List<ChatroomMsgPack>> f112531b2 = new ConcurrentHashMap();

    /* renamed from: c2 */
    public List<ChatroomMsgPack> f112532c2 = new CopyOnWriteArrayList();

    /* renamed from: d2 */
    public boolean f112533d2 = true;

    /* renamed from: e2 */
    public List<C41774h> f112534e2 = new LinkedList();

    /* renamed from: f2 */
    public String f112535f2;

    /* renamed from: g2 */
    public long f112536g2 = -1;

    /* renamed from: h2 */
    public long f112537h2 = 0;

    /* renamed from: i2 */
    public boolean f112538i2;

    /* renamed from: j2 */
    public long f112539j2;

    /* renamed from: k2 */
    public IListener f112540k2;

    /* renamed from: l2 */
    public IListener f112541l2;

    /* renamed from: m2 */
    public IListener f112542m2;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView$a */
    public class C41766a implements C41773g {
        public C41766a() {
        }

        /* renamed from: a */
        public void mo65543a(C41771f fVar) {
            GameChatListView.this.f112529Z1 = false;
            long j = fVar.f112557e.size() > 0 ? fVar.f112557e.get(0).seq : 0;
            Log.m105925i("GameChatRoom.GameChatListView", "onTopLoadMore topSeq:%d", Long.valueOf(j));
            GameChatListView gameChatListView = GameChatListView.this;
            C86709a0.m107524d().mo123460f(new C39850e(gameChatListView.f112512I1, 0, j, 1, 0, gameChatListView.f112513J1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView$b */
    public class C41767b implements Runnable {
        public C41767b() {
        }

        public void run() {
            if (GameChatListView.this.f112522S1.getTag() != null) {
                View view = GameChatListView.this.f112522S1;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                GameChatListView.this.f112522S1.setTag((Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView$c */
    public class C41768c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f112548d;

        public C41768c(int i) {
            this.f112548d = i;
        }

        public void run() {
            View findViewByPosition = GameChatListView.this.f112527X1.findViewByPosition(this.f112548d);
            if (findViewByPosition != null) {
                int measuredHeight = GameChatListView.this.getMeasuredHeight() - findViewByPosition.getMeasuredHeight();
                LinearLayoutManager linearLayoutManager = GameChatListView.this.f112527X1;
                int i = this.f112548d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(measuredHeight));
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$7", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$7", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView$d */
    public class C41769d extends RecyclerView.C0130p {

        /* renamed from: d */
        public int f112550d = 0;

        /* renamed from: e */
        public int f112551e = 0;

        public C41769d() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            long j;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                GameChatListView gameChatListView = GameChatListView.this;
                if (gameChatListView.f112528Y1 != null) {
                    boolean z = false;
                    int i2 = 1;
                    if (gameChatListView.f112530a2 && this.f112551e == gameChatListView.f112506C1.getItemCount() - 1) {
                        GameChatListView gameChatListView2 = GameChatListView.this;
                        C41773g gVar = gameChatListView2.f112528Y1;
                        C41771f fVar = gameChatListView2.f112506C1;
                        C41766a aVar = (C41766a) gVar;
                        GameChatListView.this.f112530a2 = false;
                        if (fVar.f112557e.size() > 0) {
                            List<ChatroomMsgPack> list = fVar.f112557e;
                            j = list.get(list.size() - 1).seq;
                        } else {
                            j = 0;
                        }
                        long j2 = j;
                        Log.m105925i("GameChatRoom.GameChatListView", "onBottomLoadMore, bottomSeq:%d", Long.valueOf(j2));
                        GameChatListView gameChatListView3 = GameChatListView.this;
                        C86709a0.m107524d().mo123460f(new C39850e(gameChatListView3.f112512I1, j2, 0, 2, 0, gameChatListView3.f112513J1));
                    }
                    GameChatListView gameChatListView4 = GameChatListView.this;
                    if (gameChatListView4.f112513J1 == 1) {
                        z = true;
                    }
                    if (gameChatListView4.f112529Z1) {
                        int i3 = this.f112550d;
                        if (!z) {
                            i2 = 50;
                        }
                        if (i3 < i2) {
                            ((C41766a) gameChatListView4.f112528Y1).mo65543a(gameChatListView4.f112506C1);
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f112550d = linearLayoutManager.mo16957C();
            this.f112551e = linearLayoutManager.mo16959E();
            int childCount = linearLayoutManager.getChildCount();
            if (childCount + this.f112550d >= linearLayoutManager.getItemCount()) {
                GameChatListView gameChatListView = GameChatListView.this;
                gameChatListView.f112519P1 = true;
                gameChatListView.f112506C1.mo65547O4(1, false, true);
            } else {
                GameChatListView.this.f112519P1 = false;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView$e */
    public class C41770e extends C54248l.C54250b {

        /* renamed from: a */
        public List<ChatroomMsgPack> f112553a;

        /* renamed from: b */
        public List<ChatroomMsgPack> f112554b;

        /* renamed from: c */
        public Set<Long> f112555c;

        public C41770e(GameChatListView gameChatListView, List<ChatroomMsgPack> list, List<ChatroomMsgPack> list2, List<Long> list3) {
            HashSet hashSet = new HashSet();
            this.f112555c = hashSet;
            this.f112553a = list;
            this.f112554b = list2;
            if (list3 != null) {
                hashSet.addAll(list3);
            }
        }

        /* renamed from: a */
        public boolean mo11465a(int i, int i2) {
            ChatroomMsgPack chatroomMsgPack = this.f112553a.get(i);
            ChatroomMsgPack chatroomMsgPack2 = this.f112554b.get(i2);
            MsgOptions msgOptions = chatroomMsgPack.msg_options;
            if (!((msgOptions == null || msgOptions.cli_local_data == null) ? false : true)) {
                MsgOptions msgOptions2 = chatroomMsgPack2.msg_options;
                if (!((msgOptions2 == null || msgOptions2.cli_local_data == null) ? false : true)) {
                    if (!((HashSet) this.f112555c).contains(Long.valueOf(chatroomMsgPack.seq))) {
                        if (!((HashSet) this.f112555c).contains(Long.valueOf(chatroomMsgPack2.seq))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo11466b(int i, int i2) {
            return this.f112553a.get(i).seq == this.f112554b.get(i2).seq;
        }

        /* renamed from: d */
        public int mo11468d() {
            return this.f112554b.size();
        }

        /* renamed from: e */
        public int mo11469e() {
            return this.f112553a.size();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f */
    public class C41771f extends RecyclerView.C16613e<C46337n> {

        /* renamed from: d */
        public int f112556d = 0;

        /* renamed from: e */
        public List<ChatroomMsgPack> f112557e = new LinkedList();

        /* renamed from: f */
        public List<ChatroomMsgPack> f112558f = new LinkedList();

        /* renamed from: g */
        public Map<String, ChatroomMsgPack> f112559g = new ConcurrentHashMap();

        /* renamed from: h */
        public Map<String, C53591c.C53595d> f112560h = new ConcurrentHashMap();

        /* renamed from: i */
        public Set<C46337n> f112561i = new HashSet();

        /* renamed from: j */
        public C53591c.C53593b f112562j = new C53591c.C53593b();

        /* renamed from: n */
        public Set<Long> f112563n = new HashSet();

        /* renamed from: o */
        public List<Long> f112564o = new ArrayList();

        /* renamed from: p */
        public boolean f112565p = false;

        /* renamed from: q */
        public long f112566q = -1;

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f$a */
        public class C41772a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f112568d;

            /* renamed from: e */
            public final /* synthetic */ boolean f112569e;

            /* renamed from: f */
            public final /* synthetic */ boolean f112570f;

            public C41772a(int i, boolean z, boolean z2) {
                this.f112568d = i;
                this.f112569e = z;
                this.f112570f = z2;
            }

            public void run() {
                long j = this.f112568d == 1 ? GameChatListView.this.f112520Q1 : GameChatListView.this.f112537h2;
                if (j > 0) {
                    int i = 0;
                    if (GameChatListView.this.f112532c2.size() <= 0) {
                        if (C41771f.this.f112557e.size() > 0) {
                            int size = C41771f.this.f112557e.size() - 1;
                            while (size >= 0 && C41771f.this.f112557e.get(size).seq > j) {
                                C41771f fVar = C41771f.this;
                                if (C41771f.m45294F4(fVar, fVar.f112557e.get(size))) {
                                    break;
                                }
                                i++;
                                size--;
                            }
                        } else {
                            return;
                        }
                    } else {
                        int size2 = GameChatListView.this.f112532c2.size() - 1;
                        while (size2 >= 0 && GameChatListView.this.f112532c2.get(size2).seq > j) {
                            C41771f fVar2 = C41771f.this;
                            if (C41771f.m45294F4(fVar2, GameChatListView.this.f112532c2.get(size2))) {
                                break;
                            }
                            i++;
                            size2--;
                        }
                    }
                    if (this.f112569e) {
                        NotifyNewMsgEvent notifyNewMsgEvent = new NotifyNewMsgEvent();
                        notifyNewMsgEvent.f107669d.f107670a = i;
                        notifyNewMsgEvent.publish();
                    }
                    if (this.f112570f) {
                        GameChatListView.m45279D1(GameChatListView.this, i);
                    }
                }
            }
        }

        public C41771f() {
        }

        /* renamed from: F4 */
        public static boolean m45294F4(C41771f fVar, ChatroomMsgPack chatroomMsgPack) {
            if (chatroomMsgPack != null) {
                return GameChatListView.this.f112518O1 != null && Util.nullAsNil(chatroomMsgPack.from_username).equals(Util.nullAsNil(GameChatListView.this.f112518O1.getUserName()));
            }
            fVar.getClass();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
            return;
         */
        /* renamed from: G4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m45295G4(com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.C41771f r16, java.util.List r17, int r18, long r19, java.util.List r21) {
            /*
                r1 = r16
                r0 = r18
                r2 = r19
                monitor-enter(r16)
                r4 = 4
                r5 = 1
                r6 = 0
                if (r0 != r4) goto L_0x0031
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r17)     // Catch:{ all -> 0x0328 }
                if (r7 == 0) goto L_0x0013
                goto L_0x002b
            L_0x0013:
                java.util.Iterator r7 = r17.iterator()     // Catch:{ all -> 0x0328 }
            L_0x0017:
                boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0328 }
                if (r8 == 0) goto L_0x002b
                java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r8 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r8     // Catch:{ all -> 0x0328 }
                long r8 = r8.seq     // Catch:{ all -> 0x0328 }
                int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r10 != 0) goto L_0x0017
                r7 = 1
                goto L_0x002c
            L_0x002b:
                r7 = 0
            L_0x002c:
                if (r7 != 0) goto L_0x0031
                r1.mo65546N5(r2)     // Catch:{ all -> 0x0328 }
            L_0x0031:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r17)     // Catch:{ all -> 0x0328 }
                r3 = 2
                if (r2 == 0) goto L_0x0072
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r21)     // Catch:{ all -> 0x0328 }
                if (r2 == 0) goto L_0x0072
                if (r0 != r5) goto L_0x004d
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                int r2 = r0.f112513J1     // Catch:{ all -> 0x0328 }
                if (r2 != r5) goto L_0x0047
                goto L_0x0048
            L_0x0047:
                r5 = 0
            L_0x0048:
                if (r5 != 0) goto L_0x006f
                r0.f112529Z1 = r6     // Catch:{ all -> 0x0328 }
                goto L_0x006f
            L_0x004d:
                if (r0 != r3) goto L_0x0068
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                int r2 = r0.f112513J1     // Catch:{ all -> 0x0328 }
                if (r2 != r5) goto L_0x0056
                goto L_0x0057
            L_0x0056:
                r5 = 0
            L_0x0057:
                if (r5 != 0) goto L_0x005b
                r0.f112530a2 = r6     // Catch:{ all -> 0x0328 }
            L_0x005b:
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r0.f112532c2     // Catch:{ all -> 0x0328 }
                r0.clear()     // Catch:{ all -> 0x0328 }
                java.lang.String r0 = "GameChatRoom.GameChatListView"
                java.lang.String r2 = "clear msg list cache 1"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0328 }
                goto L_0x006f
            L_0x0068:
                if (r0 != r4) goto L_0x006f
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.m45278C1(r0)     // Catch:{ all -> 0x0328 }
            L_0x006f:
                monitor-exit(r16)
                goto L_0x0327
            L_0x0072:
                if (r17 != 0) goto L_0x007a
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0328 }
                r2.<init>()     // Catch:{ all -> 0x0328 }
                goto L_0x007c
            L_0x007a:
                r2 = r17
            L_0x007c:
                if (r21 != 0) goto L_0x0084
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0328 }
                r7.<init>()     // Catch:{ all -> 0x0328 }
                goto L_0x0086
            L_0x0084:
                r7 = r21
            L_0x0086:
                java.lang.String r8 = "GameChatRoom.GameChatListView"
                java.lang.String r9 = "add chatItem list size:%d, dataFromType:%d"
                java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x0328 }
                int r11 = r2.size()     // Catch:{ all -> 0x0328 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0328 }
                r10[r6] = r11     // Catch:{ all -> 0x0328 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0328 }
                r10[r5] = r11     // Catch:{ all -> 0x0328 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r10)     // Catch:{ all -> 0x0328 }
                java.lang.String r8 = "GameChatRoom.GameChatListView"
                java.lang.String r9 = "new list:%s"
                java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0328 }
                java.lang.String r11 = r1.mo65553w5(r2)     // Catch:{ all -> 0x0328 }
                r10[r6] = r11     // Catch:{ all -> 0x0328 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r10)     // Catch:{ all -> 0x0328 }
                java.lang.String r8 = "GameChatRoom.GameChatListView"
                java.lang.String r9 = "before list:%s"
                java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r11 = r1.f112557e     // Catch:{ all -> 0x0328 }
                java.lang.String r11 = r1.mo65553w5(r11)     // Catch:{ all -> 0x0328 }
                r10[r6] = r11     // Catch:{ all -> 0x0328 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r10)     // Catch:{ all -> 0x0328 }
                java.util.LinkedList r8 = new java.util.LinkedList     // Catch:{ all -> 0x0328 }
                r8.<init>()     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r9 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r8.addAll(r9)     // Catch:{ all -> 0x0328 }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0328 }
                r1.f112556d = r6     // Catch:{ all -> 0x0328 }
                r11 = 3
                r12 = 0
                r14 = -1
                switch(r0) {
                    case 1: goto L_0x0225;
                    case 2: goto L_0x021f;
                    case 3: goto L_0x01c4;
                    case 4: goto L_0x0160;
                    case 5: goto L_0x011c;
                    case 6: goto L_0x00d7;
                    case 7: goto L_0x00e9;
                    case 8: goto L_0x00da;
                    default: goto L_0x00d7;
                }
            L_0x00d7:
                monitor-exit(r16)
                goto L_0x0327
            L_0x00da:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r12 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                r12.f112529Z1 = r6     // Catch:{ all -> 0x0328 }
                r12.f112530a2 = r6     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r12 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r12.addAll(r2)     // Catch:{ all -> 0x0328 }
                r1.f112556d = r11     // Catch:{ all -> 0x0328 }
                goto L_0x022a
            L_0x00e9:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                r3.f112529Z1 = r5     // Catch:{ all -> 0x0328 }
                r3.f112530a2 = r5     // Catch:{ all -> 0x0328 }
                yw1.c$b r3 = r1.f112562j     // Catch:{ all -> 0x0328 }
                r3.f150606a = r14     // Catch:{ all -> 0x0328 }
                r3.f150607b = r12     // Catch:{ all -> 0x0328 }
                r3.f150608c = r14     // Catch:{ all -> 0x0328 }
                r3.f150609d = r12     // Catch:{ all -> 0x0328 }
                java.util.Set<java.lang.Long> r3 = r1.f112563n     // Catch:{ all -> 0x0328 }
                java.util.HashSet r3 = (java.util.HashSet) r3     // Catch:{ all -> 0x0328 }
                r3.clear()     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r3.clear()     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r3.addAll(r2)     // Catch:{ all -> 0x0328 }
                r1.f112556d = r11     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r2 = r2.f112532c2     // Catch:{ all -> 0x0328 }
                r2.clear()     // Catch:{ all -> 0x0328 }
                java.lang.String r2 = "GameChatRoom.GameChatListView"
                java.lang.String r3 = "clear msg list cache 3"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x0328 }
                goto L_0x022a
            L_0x011c:
                r12 = 9223372036854765807(0x7fffffffffffd8ef, double:NaN)
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                int r3 = r3.size()     // Catch:{ all -> 0x0328 }
                if (r3 <= 0) goto L_0x0138
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                int r12 = r3.size()     // Catch:{ all -> 0x0328 }
                int r12 = r12 - r5
                java.lang.Object r3 = r3.get(r12)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r3 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r3     // Catch:{ all -> 0x0328 }
                long r12 = r3.seq     // Catch:{ all -> 0x0328 }
            L_0x0138:
                r3 = 0
            L_0x0139:
                int r14 = r2.size()     // Catch:{ all -> 0x0328 }
                if (r3 >= r14) goto L_0x0157
                java.lang.Object r14 = r2.get(r3)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r14 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r14     // Catch:{ all -> 0x0328 }
                r14.seq = r12     // Catch:{ all -> 0x0328 }
                r2.set(r3, r14)     // Catch:{ all -> 0x0328 }
                java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r15 = r1.f112559g     // Catch:{ all -> 0x0328 }
                java.lang.String r4 = r14.cli_msg_id     // Catch:{ all -> 0x0328 }
                java.util.concurrent.ConcurrentHashMap r15 = (java.util.concurrent.ConcurrentHashMap) r15     // Catch:{ all -> 0x0328 }
                r15.put(r4, r14)     // Catch:{ all -> 0x0328 }
                int r3 = r3 + 1
                r4 = 4
                goto L_0x0139
            L_0x0157:
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r3.addAll(r2)     // Catch:{ all -> 0x0328 }
                r1.f112556d = r11     // Catch:{ all -> 0x0328 }
                goto L_0x022a
            L_0x0160:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                r3.f112529Z1 = r5     // Catch:{ all -> 0x0328 }
                r3.f112530a2 = r5     // Catch:{ all -> 0x0328 }
                yw1.c$b r3 = r1.f112562j     // Catch:{ all -> 0x0328 }
                r3.f150606a = r14     // Catch:{ all -> 0x0328 }
                r3.f150607b = r12     // Catch:{ all -> 0x0328 }
                r3.f150608c = r14     // Catch:{ all -> 0x0328 }
                r3.f150609d = r12     // Catch:{ all -> 0x0328 }
                java.util.Set<java.lang.Long> r3 = r1.f112563n     // Catch:{ all -> 0x0328 }
                java.util.HashSet r3 = (java.util.HashSet) r3     // Catch:{ all -> 0x0328 }
                r3.clear()     // Catch:{ all -> 0x0328 }
                r8.clear()     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r3.f112532c2     // Catch:{ all -> 0x0328 }
                int r3 = r3.size()     // Catch:{ all -> 0x0328 }
                if (r3 != 0) goto L_0x018d
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r3.f112532c2     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r4 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r3.addAll(r4)     // Catch:{ all -> 0x0328 }
            L_0x018d:
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r3.clear()     // Catch:{ all -> 0x0328 }
                java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112559g     // Catch:{ all -> 0x0328 }
                java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch:{ all -> 0x0328 }
                r3.clear()     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r3.addAll(r2)     // Catch:{ all -> 0x0328 }
                r1.f112556d = r5     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.m45278C1(r2)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView$g r3 = r2.f112528Y1     // Catch:{ all -> 0x0328 }
                if (r3 == 0) goto L_0x01b2
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r2 = r2.f112506C1     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView$a r3 = (com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.C41766a) r3     // Catch:{ all -> 0x0328 }
                r3.mo65543a(r2)     // Catch:{ all -> 0x0328 }
            L_0x01b2:
                zt3.t r2 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.p0 r3 = new com.tencent.mm.plugin.game.chatroom.view.p0     // Catch:{ all -> 0x0328 }
                r3.<init>(r1)     // Catch:{ all -> 0x0328 }
                zt3.j r2 = (zt3.C119157j) r2     // Catch:{ all -> 0x0328 }
                r2.getClass()     // Catch:{ all -> 0x0328 }
                r11 = 2000(0x7d0, double:9.88E-321)
                r2.mo183892w(r3, r11, r6)     // Catch:{ all -> 0x0328 }
                goto L_0x022a
            L_0x01c4:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                boolean r3 = r3.f112533d2     // Catch:{ all -> 0x0328 }
                if (r3 == 0) goto L_0x01cf
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r3.clear()     // Catch:{ all -> 0x0328 }
            L_0x01cf:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r3.f112532c2     // Catch:{ all -> 0x0328 }
                int r3 = r3.size()     // Catch:{ all -> 0x0328 }
                if (r3 != 0) goto L_0x01e8
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r3.addAll(r2)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                boolean r2 = r2.f112519P1     // Catch:{ all -> 0x0328 }
                if (r2 == 0) goto L_0x020e
                r2 = 4
                r1.f112556d = r2     // Catch:{ all -> 0x0328 }
                goto L_0x020e
            L_0x01e8:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r3.f112532c2     // Catch:{ all -> 0x0328 }
                r3.addAll(r2)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r2.f112532c2     // Catch:{ all -> 0x0328 }
                java.util.TreeSet r4 = new java.util.TreeSet     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.l0 r12 = new com.tencent.mm.plugin.game.chatroom.view.l0     // Catch:{ all -> 0x0328 }
                r12.<init>(r1)     // Catch:{ all -> 0x0328 }
                r4.<init>(r12)     // Catch:{ all -> 0x0328 }
                r4.addAll(r3)     // Catch:{ all -> 0x0328 }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0328 }
                r3.<init>(r4)     // Catch:{ all -> 0x0328 }
                r2.f112532c2 = r3     // Catch:{ all -> 0x0328 }
                java.lang.String r2 = "GameChatRoom.GameChatListView"
                java.lang.String r3 = "add new msg to cache"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)     // Catch:{ all -> 0x0328 }
            L_0x020e:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                boolean r3 = r2.f112533d2     // Catch:{ all -> 0x0328 }
                if (r3 == 0) goto L_0x022a
                com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.m45278C1(r2)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                r2.f112533d2 = r6     // Catch:{ all -> 0x0328 }
                r1.f112556d = r11     // Catch:{ all -> 0x0328 }
                r2 = 1
                goto L_0x022b
            L_0x021f:
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r3.addAll(r2)     // Catch:{ all -> 0x0328 }
                goto L_0x022a
            L_0x0225:
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r3.addAll(r6, r2)     // Catch:{ all -> 0x0328 }
            L_0x022a:
                r2 = 0
            L_0x022b:
                r3 = 8
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r1.mo65554y5(r3, r7)     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                java.util.TreeSet r4 = new java.util.TreeSet     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.k0 r11 = new com.tencent.mm.plugin.game.chatroom.view.k0     // Catch:{ all -> 0x0328 }
                r11.<init>(r1)     // Catch:{ all -> 0x0328 }
                r4.<init>(r11)     // Catch:{ all -> 0x0328 }
                r4.addAll(r3)     // Catch:{ all -> 0x0328 }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0328 }
                r3.<init>(r4)     // Catch:{ all -> 0x0328 }
                r1.f112557e = r3     // Catch:{ all -> 0x0328 }
                r4 = 4
                if (r0 == r4) goto L_0x028d
                int r3 = r3.size()     // Catch:{ all -> 0x0328 }
                if (r3 <= 0) goto L_0x028d
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r3.f112532c2     // Catch:{ all -> 0x0328 }
                int r3 = r3.size()     // Catch:{ all -> 0x0328 }
                if (r3 <= 0) goto L_0x028d
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                int r4 = r3.size()     // Catch:{ all -> 0x0328 }
                int r4 = r4 - r5
                java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r3 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r3     // Catch:{ all -> 0x0328 }
                long r3 = r3.seq     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r11 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r11 = r11.f112532c2     // Catch:{ all -> 0x0328 }
                int r12 = r11.size()     // Catch:{ all -> 0x0328 }
                int r12 = r12 - r5
                java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r11 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r11     // Catch:{ all -> 0x0328 }
                long r11 = r11.seq     // Catch:{ all -> 0x0328 }
                int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r13 < 0) goto L_0x028d
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r3.f112532c2     // Catch:{ all -> 0x0328 }
                r3.clear()     // Catch:{ all -> 0x0328 }
                java.lang.String r3 = "GameChatRoom.GameChatListView"
                java.lang.String r4 = "clear msg list cache 2"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ all -> 0x0328 }
            L_0x028d:
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112557e     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r4 = r1.f112558f     // Catch:{ all -> 0x0328 }
                r3.removeAll(r4)     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r1.f112558f     // Catch:{ all -> 0x0328 }
                java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch:{ all -> 0x0328 }
                r3.clear()     // Catch:{ all -> 0x0328 }
                java.lang.String r3 = "GameChatRoom.GameChatListView"
                java.lang.String r4 = "after list:%s"
                java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r12 = r1.f112557e     // Catch:{ all -> 0x0328 }
                java.lang.String r12 = r1.mo65553w5(r12)     // Catch:{ all -> 0x0328 }
                r11[r6] = r12     // Catch:{ all -> 0x0328 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r11)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                int r3 = r3.f112513J1     // Catch:{ all -> 0x0328 }
                if (r3 != r5) goto L_0x02b4
                r3 = 1
                goto L_0x02b5
            L_0x02b4:
                r3 = 0
            L_0x02b5:
                if (r3 != 0) goto L_0x02da
                if (r2 == 0) goto L_0x02da
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r2 = r1.f112557e     // Catch:{ all -> 0x0328 }
                int r2 = r2.size()     // Catch:{ all -> 0x0328 }
                if (r2 <= 0) goto L_0x02da
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r2 = r1.f112557e     // Catch:{ all -> 0x0328 }
                int r3 = r2.size()     // Catch:{ all -> 0x0328 }
                int r3 = r3 - r5
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r2 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r2     // Catch:{ all -> 0x0328 }
                long r2 = r2.seq     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r4 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                long r11 = r4.f112521R1     // Catch:{ all -> 0x0328 }
                int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r4 >= 0) goto L_0x02da
                r1.f112565p = r5     // Catch:{ all -> 0x0328 }
            L_0x02da:
                boolean r2 = r1.f112565p     // Catch:{ all -> 0x0328 }
                if (r2 == 0) goto L_0x02e4
                long r2 = r16.mo65552u5()     // Catch:{ all -> 0x0328 }
                r1.f112566q = r2     // Catch:{ all -> 0x0328 }
            L_0x02e4:
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r2 = r1.f112557e     // Catch:{ all -> 0x0328 }
                java.util.List r2 = r1.mo65548O5(r7, r2)     // Catch:{ all -> 0x0328 }
                r3 = 4
                if (r0 != r3) goto L_0x02f1
                r16.notifyDataSetChanged()     // Catch:{ all -> 0x0328 }
                goto L_0x0306
            L_0x02f1:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView$e r0 = new com.tencent.mm.plugin.game.chatroom.view.GameChatListView$e     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this     // Catch:{ all -> 0x0328 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r4 = r1.f112557e     // Catch:{ all -> 0x0328 }
                r0.<init>(r3, r8, r4, r2)     // Catch:{ all -> 0x0328 }
                androidx.recyclerview.widget.l$c r0 = androidx.recyclerview.widget.C54248l.m60949a(r0, r5)     // Catch:{ all -> 0x0328 }
                com.tencent.mm.plugin.game.chatroom.view.m0 r2 = new com.tencent.mm.plugin.game.chatroom.view.m0     // Catch:{ all -> 0x0328 }
                r2.<init>(r1)     // Catch:{ all -> 0x0328 }
                r0.mo75045a(r2)     // Catch:{ all -> 0x0328 }
            L_0x0306:
                int r0 = r1.f112556d     // Catch:{ all -> 0x0328 }
                r1.mo65551g5(r0)     // Catch:{ all -> 0x0328 }
                r1.mo65547O4(r5, r6, r5)     // Catch:{ all -> 0x0328 }
                r0 = 2
                r1.mo65547O4(r0, r5, r6)     // Catch:{ all -> 0x0328 }
                java.lang.String r0 = "GameChatRoom.GameChatListView"
                java.lang.String r2 = "add msg to list cost time:%d"
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0328 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0328 }
                long r4 = r4 - r9
                java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0328 }
                r3[r6] = r4     // Catch:{ all -> 0x0328 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r3)     // Catch:{ all -> 0x0328 }
                monitor-exit(r16)
            L_0x0327:
                return
            L_0x0328:
                r0 = move-exception
                monitor-exit(r16)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.C41771f.m45295G4(com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f, java.util.List, int, long, java.util.List):void");
        }

        /* renamed from: N5 */
        public final void mo65546N5(long j) {
            for (C41774h next : GameChatListView.this.f112534e2) {
                if (next.f112572a.seq == j) {
                    next.f112573b = true;
                    return;
                }
            }
        }

        /* renamed from: O4 */
        public final void mo65547O4(int i, boolean z, boolean z2) {
            if (GameChatListView.this.f112513J1 == 0) {
                C119179t tVar = C119157j.f356862d;
                C41772a aVar = new C41772a(i, z, z2);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, 200, false);
            }
        }

        /* renamed from: O5 */
        public final List<Long> mo65548O5(List<ChatroomMsgPack> list, List<ChatroomMsgPack> list2) {
            MsgOptions msgOptions;
            ArrayList arrayList = new ArrayList();
            if (!Util.isNullOrNil((List) list) && !Util.isNullOrNil((List) list2)) {
                for (ChatroomMsgPack next : list) {
                    for (ChatroomMsgPack next2 : list2) {
                        if (next.seq == next2.seq && ((msgOptions = next2.msg_options) == null || msgOptions.cli_local_data == null)) {
                            list2.set(list2.indexOf(next2), next);
                            arrayList.add(Long.valueOf(next.seq));
                        }
                    }
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
            return;
         */
        /* renamed from: P5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo65549P5(java.lang.String r11, int r12) {
            /*
                r10 = this;
                monitor-enter(r10)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ all -> 0x0075 }
                if (r0 != 0) goto L_0x0073
                java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r10.f112559g     // Catch:{ all -> 0x0075 }
                java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0075 }
                boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x0075 }
                if (r0 != 0) goto L_0x0012
                goto L_0x0073
            L_0x0012:
                java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r10.f112559g     // Catch:{ all -> 0x0075 }
                java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0075 }
                java.lang.Object r11 = r0.get(r11)     // Catch:{ all -> 0x0075 }
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r11 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r11     // Catch:{ all -> 0x0075 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r10.f112557e     // Catch:{ all -> 0x0075 }
                int r0 = r0.indexOf(r11)     // Catch:{ all -> 0x0075 }
                if (r0 < 0) goto L_0x0071
                com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r1 = r11.msg_options     // Catch:{ all -> 0x0075 }
                if (r1 == 0) goto L_0x0071
                pe3.b r1 = r1.cli_local_data     // Catch:{ all -> 0x0075 }
                if (r1 == 0) goto L_0x0071
                byte[] r1 = r1.mo123703f()     // Catch:{ all -> 0x0075 }
                long r1 = p823sg.C90196p.m112886c(r1)     // Catch:{ all -> 0x0075 }
                q90.j<java.lang.String, android.graphics.Bitmap> r3 = yw1.C53601h.f150629a     // Catch:{ all -> 0x0075 }
                r3 = 4
                long r1 = r1 >> r3
                r4 = -1
                long r1 = r1 & r4
                int r2 = (int) r1     // Catch:{ all -> 0x0075 }
                com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r1 = r11.msg_options     // Catch:{ all -> 0x0075 }
                pe3.b r4 = new pe3.b     // Catch:{ all -> 0x0075 }
                int r2 = r2 << r3
                r12 = r12 | r2
                long r2 = (long) r12     // Catch:{ all -> 0x0075 }
                r12 = 8
                byte[] r5 = new byte[r12]     // Catch:{ all -> 0x0075 }
                r6 = 0
                r7 = 0
            L_0x0049:
                if (r7 >= r12) goto L_0x0056
                int r8 = r7 * 8
                long r8 = r2 >> r8
                int r9 = (int) r8     // Catch:{ all -> 0x0075 }
                byte r8 = (byte) r9     // Catch:{ all -> 0x0075 }
                r5[r7] = r8     // Catch:{ all -> 0x0075 }
                int r7 = r7 + 1
                goto L_0x0049
            L_0x0056:
                byte[] r2 = new byte[r12]     // Catch:{ all -> 0x0075 }
                r3 = 0
            L_0x0059:
                if (r3 >= r12) goto L_0x0064
                int r7 = 7 - r3
                byte r7 = r5[r7]     // Catch:{ all -> 0x0075 }
                r2[r3] = r7     // Catch:{ all -> 0x0075 }
                int r3 = r3 + 1
                goto L_0x0059
            L_0x0064:
                r4.<init>(r2, r6, r12)     // Catch:{ all -> 0x0075 }
                r1.cli_local_data = r4     // Catch:{ all -> 0x0075 }
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r12 = r10.f112557e     // Catch:{ all -> 0x0075 }
                r12.set(r0, r11)     // Catch:{ all -> 0x0075 }
                r10.notifyItemChanged(r0)     // Catch:{ all -> 0x0075 }
            L_0x0071:
                monitor-exit(r10)
                return
            L_0x0073:
                monitor-exit(r10)
                return
            L_0x0075:
                r11 = move-exception
                monitor-exit(r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.C41771f.mo65549P5(java.lang.String, int):void");
        }

        /* renamed from: Q5 */
        public void mo65550Q5() {
            MsgContent msgContent;
            ChatroomMsgText chatroomMsgText;
            Log.m105925i("GameChatRoom.GameChatListView", "updateUserStateInViewScope size:%d", Integer.valueOf(((HashSet) this.f112561i).size()));
            Iterator it = ((HashSet) this.f112561i).iterator();
            while (it.hasNext()) {
                C46337n nVar = (C46337n) it.next();
                ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
                if (!(chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgText = msgContent.chatroom_text) == null)) {
                    Log.m105919d("GameChatRoom.GameChatListView", "updateUserStateInViewScope content:%s", chatroomMsgText.content);
                }
                Map<String, C53591c.C53598g> map = GameChatListView.this.f112511H1;
                if (map != null) {
                    ((HashMap) nVar.f124870a1).clear();
                    ((HashMap) nVar.f124870a1).putAll(map);
                }
                nVar.f124872c1 = GameChatListView.this.f112517N1;
                nVar.mo71738P();
            }
        }

        /* renamed from: g5 */
        public final void mo65551g5(int i) {
            int i2 = i;
            if (i2 == 1) {
                GameChatListView gameChatListView = GameChatListView.this;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(gameChatListView, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                gameChatListView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(gameChatListView, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            } else if (i2 == 2) {
                GameChatListView gameChatListView2 = GameChatListView.this;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                GameChatListView gameChatListView3 = gameChatListView2;
                C117292a.m165358d(gameChatListView3, aVar2.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                gameChatListView2.mo17149t1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(gameChatListView3, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else if (i2 != 3) {
                if (i2 == 4 && GameChatListView.this.f112506C1.getItemCount() > 0) {
                    GameChatListView gameChatListView4 = GameChatListView.this;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(Integer.valueOf(gameChatListView4.f112506C1.getItemCount() - 1));
                    GameChatListView gameChatListView5 = gameChatListView4;
                    C117292a.m165358d(gameChatListView5, aVar3.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    gameChatListView4.mo17149t1(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(gameChatListView5, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
            } else if (GameChatListView.this.f112506C1.getItemCount() > 0) {
                GameChatListView gameChatListView6 = GameChatListView.this;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(Integer.valueOf(gameChatListView6.f112506C1.getItemCount() - 1));
                GameChatListView gameChatListView7 = gameChatListView6;
                C117292a.m165358d(gameChatListView7, aVar4.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                gameChatListView6.mo17115r1(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(gameChatListView7, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }

        public int getItemCount() {
            return this.f112557e.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            ChatroomMsgPack chatroomMsgPack = this.f112557e.get(i);
            return C53600g.m60120a(chatroomMsgPack.msg_type, chatroomMsgPack.msg_sub_type);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x011f, code lost:
            r7 = r7.chatroom_text;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x033d, code lost:
            r1 = (android.widget.RelativeLayout.LayoutParams) r2.f124854S.getLayoutParams();
            r1.addRule(3, com.tencent.p014mm.C0966R.C0970id.l2e);
            r1.removeRule(5);
            r2.f124854S.setLayoutParams(r1);
            r2.f124856T.setVisibility(8);
            r2.f124862W.setVisibility(0);
            r2.f124843I.post(new ix1.C46317e0(r2));
            r1 = (android.widget.FrameLayout.LayoutParams) r2.f124862W.getLayoutParams();
            r1.bottomMargin = 0;
            r2.f124862W.setLayoutParams(r1);
            r1 = r2.f124862W;
         */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0212  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x023c  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x027e  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x02c9  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x02e4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r35, int r36) {
            /*
                r34 = this;
                r0 = r34
                r1 = r36
                r2 = r35
                ix1.n r2 = (ix1.C46337n) r2
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r3 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                ax1.d r4 = r3.f112518O1
                java.lang.String r5 = r3.f112512I1
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r6 = r3.f112515L1
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo r3 = r3.f112516M1
                r2.f124861V0 = r4
                r2.f124869Z0 = r5
                r2.f124863W0 = r6
                r2.f124865X0 = r3
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r3 = r0.f112557e
                java.lang.Object r3 = r3.get(r1)
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r3 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r3
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x0595
                long r6 = r3.seq
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r8 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                long r9 = r8.f112520Q1
                int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x0038
                r8.f112520Q1 = r6
                boolean r9 = r8.f112538i2
                if (r9 == 0) goto L_0x0038
                r8.f112537h2 = r6
            L_0x0038:
                int r6 = r8.f112513J1
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Channel> r7 = r8.f112514K1
                r2.f124874e1 = r6
                r2.f124873d1 = r7
                java.util.Map<java.lang.String, yw1.c$g> r6 = r8.f112511H1
                if (r6 == 0) goto L_0x0052
                java.util.Map<java.lang.String, yw1.c$g> r7 = r2.f124870a1
                java.util.HashMap r7 = (java.util.HashMap) r7
                r7.clear()
                java.util.Map<java.lang.String, yw1.c$g> r7 = r2.f124870a1
                java.util.HashMap r7 = (java.util.HashMap) r7
                r7.putAll(r6)
            L_0x0052:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r6 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                java.lang.String r7 = r6.f112517N1
                r2.f124872c1 = r7
                long r7 = r0.f112566q
                r2.f124871b1 = r7
                long r7 = r6.f112539j2
                r2.f124875f1 = r7
                java.util.List<com.tencent.mm.plugin.game.chatroom.view.GameChatListView$h> r6 = r6.f112534e2
                java.util.Iterator r6 = r6.iterator()
            L_0x0066:
                boolean r7 = r6.hasNext()
                java.lang.String r8 = "GameChatRoom.GameChatListView"
                if (r7 == 0) goto L_0x009e
                java.lang.Object r7 = r6.next()
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView$h r7 = (com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.C41774h) r7
                com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg r9 = r7.f112572a
                long r9 = r9.seq
                long r11 = r3.seq
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 != 0) goto L_0x0066
                boolean r11 = r7.f112573b
                if (r11 != 0) goto L_0x0066
                r0.mo65546N5(r9)
                com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg r7 = r7.f112572a
                boolean r9 = r7.highlight
                if (r9 == 0) goto L_0x0066
                long r6 = r7.seq
                r2.f124867Y0 = r6
                java.lang.Object[] r9 = new java.lang.Object[r5]
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r9[r4] = r6
                java.lang.String r6 = "noticeMsgSeq:%d highlight"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r9)
                r6 = 1
                goto L_0x009f
            L_0x009e:
                r6 = 0
            L_0x009f:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r7 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                android.view.View r7 = r7.f112525V1
                r9 = 0
                r10 = 8
                if (r7 == 0) goto L_0x011b
                java.lang.Object r7 = r7.getTag()
                boolean r7 = r7 instanceof java.lang.Long
                if (r7 == 0) goto L_0x011b
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r7 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                android.view.View r7 = r7.f112525V1
                java.lang.Object r7 = r7.getTag()
                java.lang.Long r7 = (java.lang.Long) r7
                long r11 = r7.longValue()
                long r13 = r3.seq
                int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r7 != 0) goto L_0x011b
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r7 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                android.view.View r7 = r7.f112525V1
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
                java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
                r15.mo10233c(r11)
                java.lang.Object[] r12 = r15.mo10232b()
                java.lang.String r13 = "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter"
                java.lang.String r14 = "onBindViewHolder"
                java.lang.String r16 = "(Lcom/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH;I)V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                r11 = r7
                r10 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r19
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                java.lang.Object r10 = r10.mo10231a(r4)
                java.lang.Integer r10 = (java.lang.Integer) r10
                int r10 = r10.intValue()
                r7.setVisibility(r10)
                java.lang.String r12 = "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter"
                java.lang.String r13 = "onBindViewHolder"
                java.lang.String r14 = "(Lcom/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH;I)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r7 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                android.view.View r7 = r7.f112525V1
                r7.setTag(r9)
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r7 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.m45278C1(r7)
            L_0x011b:
                com.tencent.mm.plugin.game.autogen.chatroom.MsgContent r7 = r3.msg_content
                if (r7 == 0) goto L_0x0126
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText r7 = r7.chatroom_text
                if (r7 == 0) goto L_0x0126
                java.lang.String r7 = r7.content
                goto L_0x0128
            L_0x0126:
                java.lang.String r7 = ""
            L_0x0128:
                r10 = 2
                java.lang.Object[] r11 = new java.lang.Object[r10]
                long r12 = r3.seq
                java.lang.Long r12 = java.lang.Long.valueOf(r12)
                r11[r4] = r12
                r11[r5] = r7
                java.lang.String r7 = "onBindViewHolder seq:%d, content:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r7, r11)
                long r7 = java.lang.System.currentTimeMillis()
                r11 = 1000(0x3e8, double:4.94E-321)
                long r7 = r7 / r11
                int r1 = r1 - r5
                if (r1 < 0) goto L_0x014e
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r7 = r0.f112557e
                java.lang.Object r1 = r7.get(r1)
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r1
                long r7 = r1.send_time
            L_0x014e:
                yw1.c$b r1 = r0.f112562j
                java.util.Set<java.lang.Long> r13 = r0.f112563n
                java.lang.Class<ax1.c> r14 = ax1.C39639c.class
                java.lang.String r15 = r3.from_username
                boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r15 == 0) goto L_0x0160
                r17 = r6
                goto L_0x0529
            L_0x0160:
                long r9 = r1.f150606a
                r17 = -1
                int r19 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
                if (r19 != 0) goto L_0x017a
                long r9 = r1.f150608c
                int r19 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
                if (r19 != 0) goto L_0x017a
                long r9 = r3.seq
                r1.f150608c = r9
                r1.f150606a = r9
                long r9 = r3.send_time
                r1.f150609d = r9
                r1.f150607b = r9
            L_0x017a:
                long r9 = r3.seq
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                java.util.HashSet r13 = (java.util.HashSet) r13
                boolean r9 = r13.contains(r9)
                if (r9 == 0) goto L_0x019f
                android.widget.TextView r7 = r2.f124835A
                r7.setVisibility(r4)
                android.widget.TextView r7 = r2.f124835A
                android.content.Context r8 = r2.f124838D
                long r9 = r3.send_time
                long r9 = r9 * r11
                java.lang.CharSequence r8 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r8, r9, r4)
                r7.setText(r8)
                r17 = r6
                goto L_0x020c
            L_0x019f:
                long r9 = r3.send_time
                long r9 = r9 - r7
                r7 = 300(0x12c, double:1.48E-321)
                int r17 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r17 <= 0) goto L_0x01be
                android.widget.TextView r7 = r2.f124835A
                r7.setVisibility(r4)
                android.widget.TextView r7 = r2.f124835A
                android.content.Context r8 = r2.f124838D
                long r9 = r3.send_time
                long r9 = r9 * r11
                java.lang.CharSequence r8 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r8, r9, r4)
                r7.setText(r8)
                r7 = 1
                goto L_0x01c6
            L_0x01be:
                android.widget.TextView r7 = r2.f124835A
                r8 = 8
                r7.setVisibility(r8)
                r7 = 0
            L_0x01c6:
                if (r7 != 0) goto L_0x020e
                long r8 = r3.seq
                r17 = r6
                long r5 = r1.f150608c
                r18 = 1200(0x4b0, double:5.93E-321)
                int r20 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r20 <= 0) goto L_0x01df
                long r5 = r3.send_time
                long r10 = r1.f150609d
                long r5 = r5 - r10
                int r10 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
                if (r10 < 0) goto L_0x01df
                r10 = 1
                goto L_0x01e0
            L_0x01df:
                r10 = 0
            L_0x01e0:
                long r5 = r1.f150606a
                int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r11 >= 0) goto L_0x01f1
                long r5 = r1.f150607b
                long r8 = r3.send_time
                long r5 = r5 - r8
                int r8 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
                if (r8 < 0) goto L_0x01f1
                r5 = 1
                goto L_0x01f2
            L_0x01f1:
                r5 = 0
            L_0x01f2:
                if (r10 != 0) goto L_0x01f6
                if (r5 == 0) goto L_0x0210
            L_0x01f6:
                android.widget.TextView r5 = r2.f124835A
                r5.setVisibility(r4)
                android.widget.TextView r5 = r2.f124835A
                android.content.Context r6 = r2.f124838D
                long r7 = r3.send_time
                r9 = 1000(0x3e8, double:4.94E-321)
                long r7 = r7 * r9
                java.lang.CharSequence r6 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r6, r7, r4)
                r5.setText(r6)
            L_0x020c:
                r7 = 1
                goto L_0x0210
            L_0x020e:
                r17 = r6
            L_0x0210:
                if (r7 == 0) goto L_0x0234
                long r5 = r3.seq
                long r7 = r1.f150608c
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 <= 0) goto L_0x0221
                r1.f150608c = r5
                long r7 = r3.send_time
                r1.f150609d = r7
                goto L_0x022d
            L_0x0221:
                long r7 = r1.f150606a
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L_0x022d
                r1.f150606a = r5
                long r7 = r3.send_time
                r1.f150607b = r7
            L_0x022d:
                java.lang.Long r1 = java.lang.Long.valueOf(r5)
                r13.add(r1)
            L_0x0234:
                long r5 = r3.seq
                long r7 = r2.f124871b1
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 != 0) goto L_0x027e
                android.view.View r1 = r2.f124879z
                k20.a r13 = new k20.a
                r13.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r13.mo10233c(r5)
                java.lang.Object[] r6 = r13.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH"
                java.lang.String r8 = "onBindData"
                java.lang.String r9 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomMsgPack;JLcom/tencent/mm/plugin/game/chatroom/ConstantsChatRoom$InsertTimeBean;Ljava/util/Set;)V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r5 = r1
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r5 = r13.mo10231a(r4)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r1.setVisibility(r5)
                java.lang.String r6 = "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH"
                java.lang.String r7 = "onBindData"
                java.lang.String r8 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomMsgPack;JLcom/tencent/mm/plugin/game/chatroom/ConstantsChatRoom$InsertTimeBean;Ljava/util/Set;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                r5 = r1
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x02c1
            L_0x027e:
                android.view.View r1 = r2.f124879z
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r6 = 8
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r5.mo10233c(r7)
                java.lang.Object[] r19 = r5.mo10232b()
                java.lang.String r20 = "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH"
                java.lang.String r21 = "onBindData"
                java.lang.String r22 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomMsgPack;JLcom/tencent/mm/plugin/game/chatroom/ConstantsChatRoom$InsertTimeBean;Ljava/util/Set;)V"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r1
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                java.lang.Object r5 = r5.mo10231a(r4)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r1.setVisibility(r5)
                java.lang.String r19 = "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH"
                java.lang.String r20 = "onBindData"
                java.lang.String r21 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomMsgPack;JLcom/tencent/mm/plugin/game/chatroom/ConstantsChatRoom$InsertTimeBean;Ljava/util/Set;)V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            L_0x02c1:
                r2.f124841G = r3
                int r1 = r2.f124837C
                r5 = 3
                r6 = 1
                if (r1 == r6) goto L_0x02e4
                r6 = 2
                if (r1 == r6) goto L_0x02d0
                if (r1 == r5) goto L_0x02d0
                goto L_0x0529
            L_0x02d0:
                di3.d r1 = di3.C86312j.m106911c(r14)
                ax1.c r1 = (ax1.C39639c) r1
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r5 = r2.f124841G
                java.lang.String r5 = r5.from_username
                ix1.o r6 = new ix1.o
                r6.<init>(r2)
                r1.lx0(r5, r6)
                goto L_0x0529
            L_0x02e4:
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r1 = r2.f124863W0
                android.widget.ImageView r6 = r2.f124844J
                java.lang.String r7 = r3.from_username
                tl3.C78039a.m94189a(r6, r7)
                android.view.GestureDetector r6 = new android.view.GestureDetector
                android.content.Context r7 = r2.f124838D
                ix1.y r8 = new ix1.y
                r8.<init>(r2, r1)
                r6.<init>(r7, r8)
                android.widget.ImageView r1 = r2.f124844J
                ix1.z r7 = new ix1.z
                r7.<init>(r2, r6)
                r1.setOnTouchListener(r7)
                android.widget.ImageView r1 = r2.f124844J
                ix1.a0 r6 = new ix1.a0
                r6.<init>(r2)
                r1.setOnLongClickListener(r6)
                r2.mo71738P()
                di3.d r1 = di3.C86312j.m106911c(r14)
                ax1.c r1 = (ax1.C39639c) r1
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r6 = r2.f124841G
                java.lang.String r6 = r6.from_username
                ix1.b0 r7 = new ix1.b0
                r7.<init>(r2)
                r1.lx0(r6, r7)
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r2.f124841G
                int r6 = r1.msg_type
                int r1 = r1.msg_sub_type
                int r1 = yw1.C53600g.m60120a(r6, r1)
                r6 = 16
                r7 = 2131316031(0x7f094d3f, float:1.8250532E38)
                r8 = 5
                if (r1 == 0) goto L_0x03ca
                switch(r1) {
                    case 10000: goto L_0x03ca;
                    case 10001: goto L_0x033d;
                    case 10002: goto L_0x03ca;
                    default: goto L_0x0337;
                }
            L_0x0337:
                switch(r1) {
                    case 10005: goto L_0x03ca;
                    case 10006: goto L_0x03ca;
                    case 10007: goto L_0x0379;
                    case 10008: goto L_0x0379;
                    case 10009: goto L_0x03ca;
                    case 10010: goto L_0x033d;
                    default: goto L_0x033a;
                }
            L_0x033a:
                r1 = 0
                goto L_0x0407
            L_0x033d:
                android.view.ViewGroup r1 = r2.f124854S
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
                r1.addRule(r5, r7)
                r1.removeRule(r8)
                android.view.ViewGroup r6 = r2.f124854S
                r6.setLayoutParams(r1)
                android.view.ViewGroup r1 = r2.f124856T
                r6 = 8
                r1.setVisibility(r6)
                android.view.ViewGroup r1 = r2.f124862W
                r1.setVisibility(r4)
                android.view.View r1 = r2.f124843I
                ix1.e0 r6 = new ix1.e0
                r6.<init>(r2)
                r1.post(r6)
                android.view.ViewGroup r1 = r2.f124862W
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
                r1.bottomMargin = r4
                android.view.ViewGroup r6 = r2.f124862W
                r6.setLayoutParams(r1)
                android.view.ViewGroup r1 = r2.f124862W
                goto L_0x0407
            L_0x0379:
                android.view.ViewGroup r1 = r2.f124854S
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
                r1.addRule(r5, r7)
                r1.removeRule(r8)
                android.content.Context r7 = r2.f124838D
                int r7 = kg3.C76577a.m92151b(r7, r6)
                r1.leftMargin = r7
                android.content.Context r7 = r2.f124838D
                int r6 = kg3.C76577a.m92151b(r7, r6)
                r1.rightMargin = r6
                android.view.ViewGroup r6 = r2.f124854S
                r6.setLayoutParams(r1)
                android.view.ViewGroup r1 = r2.f124856T
                r6 = 8
                r1.setVisibility(r6)
                android.view.ViewGroup r1 = r2.f124862W
                r1.setVisibility(r4)
                android.view.View r1 = r2.f124843I
                ix1.p r7 = new ix1.p
                r7.<init>(r2)
                r1.post(r7)
                android.view.ViewGroup r1 = r2.f124862W
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
                android.content.Context r7 = r2.f124838D
                int r7 = kg3.C76577a.m92151b(r7, r6)
                r1.bottomMargin = r7
                android.view.ViewGroup r6 = r2.f124862W
                r6.setLayoutParams(r1)
                android.view.ViewGroup r1 = r2.f124862W
                goto L_0x0407
            L_0x03ca:
                android.view.ViewGroup r1 = r2.f124854S
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
                r9 = 2131316017(0x7f094d31, float:1.8250504E38)
                r1.addRule(r5, r9)
                r1.addRule(r8, r9)
                android.content.Context r8 = r2.f124838D
                int r6 = kg3.C76577a.m92151b(r8, r6)
                r1.rightMargin = r6
                android.view.ViewGroup r6 = r2.f124854S
                r6.setLayoutParams(r1)
                android.view.ViewGroup r1 = r2.f124856T
                r1.setVisibility(r4)
                android.view.ViewGroup r1 = r2.f124862W
                r6 = 8
                r1.setVisibility(r6)
                android.view.View r1 = r2.f124843I
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
                r6 = 6
                r1.addRule(r6, r7)
                android.view.View r6 = r2.f124843I
                r6.setLayoutParams(r1)
                android.view.ViewGroup r1 = r2.f124856T
            L_0x0407:
                android.view.View r6 = r2.mo71706F(r1)
                if (r1 == 0) goto L_0x0425
                if (r6 == 0) goto L_0x0425
                r1.removeAllViews()
                r1.addView(r6)
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r2.f124841G
                r2.mo71705B(r1)
                ix1.c0 r1 = new ix1.c0
                r1.<init>(r2)
                r6.setOnClickListener(r1)
                r2.mo71737O(r6)
            L_0x0425:
                android.widget.ProgressBar r1 = r2.f124864X
                r6 = 8
                r1.setVisibility(r6)
                android.widget.ImageView r1 = r2.f124866Y
                r1.setVisibility(r6)
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r2.f124841G
                com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r1 = r1.msg_options
                if (r1 == 0) goto L_0x0460
                pe3.b r1 = r1.cli_local_data
                if (r1 == 0) goto L_0x0460
                byte[] r1 = r1.mo123703f()
                long r6 = p823sg.C90196p.m112886c(r1)
                q90.j<java.lang.String, android.graphics.Bitmap> r1 = yw1.C53601h.f150629a
                r8 = 15
                long r6 = r6 & r8
                int r1 = (int) r6
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r6 = r2.f124841G
                int r6 = r6.msg_type
                if (r6 == r5) goto L_0x0460
                r5 = 1
                if (r1 != r5) goto L_0x0458
                android.widget.ProgressBar r1 = r2.f124864X
                r1.setVisibility(r4)
                goto L_0x0460
            L_0x0458:
                r5 = 2
                if (r1 != r5) goto L_0x0460
                android.widget.ImageView r1 = r2.f124866Y
                r1.setVisibility(r4)
            L_0x0460:
                android.widget.ImageView r1 = r2.f124866Y
                ix1.d0 r5 = new ix1.d0
                r5.<init>(r2)
                r1.setOnClickListener(r5)
                android.view.ViewGroup r1 = r2.f124858U
                if (r1 == 0) goto L_0x04eb
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r2.f124841G
                if (r1 == 0) goto L_0x047d
                com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r5 = r1.msg_options
                if (r5 == 0) goto L_0x047d
                com.tencent.mm.plugin.game.autogen.chatroom.MsgChannelInfo r5 = r5.msg_channel_info
                if (r5 == 0) goto L_0x047d
                boolean r5 = r5.show_channel_info
                goto L_0x047e
            L_0x047d:
                r5 = 0
            L_0x047e:
                if (r5 == 0) goto L_0x04e4
                if (r1 == 0) goto L_0x04e4
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Channel> r1 = r2.f124873d1
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                if (r1 != 0) goto L_0x04e4
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Channel> r1 = r2.f124873d1
                java.util.Iterator r1 = r1.iterator()
            L_0x0490:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x04a5
                java.lang.Object r5 = r1.next()
                com.tencent.mm.plugin.game.autogen.chatroom.Channel r5 = (com.tencent.p014mm.plugin.game.autogen.chatroom.Channel) r5
                int r6 = r5.channel_id
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r7 = r2.f124841G
                int r7 = r7.channel_id
                if (r6 != r7) goto L_0x0490
                goto L_0x04a6
            L_0x04a5:
                r5 = 0
            L_0x04a6:
                if (r5 == 0) goto L_0x04dc
                java.lang.String r1 = r5.name
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x04dc
                int r1 = r5.channel_id
                if (r1 != 0) goto L_0x04b6
                r1 = 1
                goto L_0x04b7
            L_0x04b6:
                r1 = 0
            L_0x04b7:
                if (r1 == 0) goto L_0x04ba
                goto L_0x04dc
            L_0x04ba:
                android.view.ViewGroup r1 = r2.f124858U
                r1.setVisibility(r4)
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r2.f124860V
                int r6 = r5.channel_id
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r1.setTag(r6)
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r2.f124860V
                ix1.q r6 = new ix1.q
                r6.<init>(r2)
                r1.setOnClickListener(r6)
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r2.f124860V
                java.lang.String r5 = r5.name
                r1.mo104279b(r5)
                goto L_0x04eb
            L_0x04dc:
                android.view.ViewGroup r1 = r2.f124858U
                r5 = 8
                r1.setVisibility(r5)
                goto L_0x04eb
            L_0x04e4:
                r5 = 8
                android.view.ViewGroup r1 = r2.f124858U
                r1.setVisibility(r5)
            L_0x04eb:
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r2.f124841G
                com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r1 = r1.msg_options
                if (r1 != 0) goto L_0x04f3
                r1 = 0
                goto L_0x04f5
            L_0x04f3:
                com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo r1 = r1.vote_info
            L_0x04f5:
                r2.mo71739z(r1)
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r2.f124841G
                com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r5 = r1.msg_options
                if (r5 != 0) goto L_0x0505
                long r5 = r1.seq
                r1 = 0
                r2.mo71730C(r1, r5, r4)
                goto L_0x0529
            L_0x0505:
                com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo r5 = r5.topic_info
                long r6 = r1.seq
                ax1.d r8 = r2.f124861V0
                if (r8 == 0) goto L_0x0525
                java.lang.String r1 = r1.from_username
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                ax1.d r8 = r2.f124861V0
                java.lang.String r8 = r8.getUserName()
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
                boolean r1 = r1.equals(r8)
                if (r1 == 0) goto L_0x0525
                r1 = 1
                goto L_0x0526
            L_0x0525:
                r1 = 0
            L_0x0526:
                r2.mo71730C(r5, r6, r1)
            L_0x0529:
                java.util.Map<java.lang.String, yw1.c$d> r1 = r0.f112560h
                java.lang.String r5 = r3.cli_msg_id
                java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
                java.lang.Object r1 = r1.get(r5)
                yw1.c$d r1 = (yw1.C53591c.C53595d) r1
                android.widget.ImageView r5 = r2.f124866Y
                if (r5 == 0) goto L_0x053c
                r5.setTag(r1)
            L_0x053c:
                java.util.List<java.lang.Long> r1 = r0.f112564o
                long r5 = r3.seq
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                boolean r1 = r1.contains(r5)
                if (r1 != 0) goto L_0x0593
                java.util.List<java.lang.Long> r1 = r0.f112564o
                long r5 = r3.seq
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                r1.add(r5)
                c30.g r1 = new c30.g
                r1.<init>()
                java.lang.String r5 = "lightup"
                android.view.ViewGroup r6 = r2.f124868Z     // Catch:{ f -> 0x056e }
                if (r6 == 0) goto L_0x056b
                int r6 = r6.getVisibility()     // Catch:{ f -> 0x056e }
                if (r6 != 0) goto L_0x056b
                r4 = 1
            L_0x056b:
                r1.mo145966q(r5, r4)     // Catch:{ f -> 0x056e }
            L_0x056e:
                com.tencent.mm.game.report.d$a r18 = com.tencent.p014mm.game.report.C40308d.f108375a
                r19 = 1
                r21 = 1
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r4 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                long r5 = r4.f112509F1
                long r7 = r4.f112508E1
                long r11 = r3.seq
                java.lang.String r3 = r3.from_username
                r30 = 0
                int r4 = r4.f112513J1
                java.lang.String r33 = r1.toString()
                r23 = r5
                r25 = r7
                r27 = r11
                r29 = r3
                r32 = r4
                r18.mo62998h(r19, r21, r23, r25, r27, r29, r30, r32, r33)
            L_0x0593:
                r4 = r17
            L_0x0595:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r1 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
                int r3 = r1.mo16957C()
                int r1 = r1.mo16959E()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
            L_0x05aa:
                if (r3 > r1) goto L_0x05c4
                if (r3 < 0) goto L_0x05c1
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r6 = r0.f112557e
                int r6 = r6.size()
                if (r3 >= r6) goto L_0x05c1
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r6 = r0.f112557e
                java.lang.Object r6 = r6.get(r3)
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r6 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r6
                r5.add(r6)
            L_0x05c1:
                int r3 = r3 + 1
                goto L_0x05aa
            L_0x05c4:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
                if (r1 != 0) goto L_0x061d
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r1 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                java.util.List<com.tencent.mm.plugin.game.chatroom.view.GameChatListView$h> r1 = r1.f112534e2
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                if (r1 == 0) goto L_0x05d5
                goto L_0x061d
            L_0x05d5:
                r6 = 0
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.util.Iterator r1 = r5.iterator()
            L_0x05e0:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x05f9
                java.lang.Object r3 = r1.next()
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r3 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r3
                long r11 = r3.seq
                int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r3 <= 0) goto L_0x05f3
                r6 = r11
            L_0x05f3:
                int r3 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r3 >= 0) goto L_0x05e0
                r8 = r11
                goto L_0x05e0
            L_0x05f9:
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r1 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                java.util.List<com.tencent.mm.plugin.game.chatroom.view.GameChatListView$h> r1 = r1.f112534e2
                java.util.Iterator r1 = r1.iterator()
            L_0x0601:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x061d
                java.lang.Object r3 = r1.next()
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView$h r3 = (com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.C41774h) r3
                com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg r5 = r3.f112572a
                long r11 = r5.seq
                int r5 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r5 < 0) goto L_0x0601
                int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r5 > 0) goto L_0x0601
                r5 = 1
                r3.f112573b = r5
                goto L_0x0601
            L_0x061d:
                if (r4 == 0) goto L_0x0623
                r2.mo71733H()
                goto L_0x0632
            L_0x0623:
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r2.f124841G
                if (r1 == 0) goto L_0x062f
                long r3 = r1.seq
                long r5 = r2.f124867Y0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x0632
            L_0x062f:
                r2.mo71736N()
            L_0x0632:
                java.util.Set<ix1.n> r1 = r0.f112561i
                java.util.HashSet r1 = (java.util.HashSet) r1
                r1.add(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.C41771f.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C16631z onCreateViewHolder(android.view.ViewGroup r8, int r9) {
            /*
                r7 = this;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                android.content.Context r0 = r0.f112507D1
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 2131495782(0x7f0c0b66, float:1.861511E38)
                r2 = 0
                android.view.View r8 = r0.inflate(r1, r8, r2)
                java.lang.String r0 = "GameChatRoom.GameChatItemVH"
                java.util.Map<java.lang.Integer, java.lang.Class<? extends ix1.n>> r1 = yw1.C53600g.f150628a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
                java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
                java.lang.Object r1 = r1.get(r3)
                java.lang.Class r1 = (java.lang.Class) r1
                if (r1 != 0) goto L_0x0028
                ix1.n r0 = new ix1.n
                r0.<init>(r8, r9)
                goto L_0x0089
            L_0x0028:
                r3 = 2
                r4 = 1
                java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                java.lang.Class<android.view.View> r6 = android.view.View.class
                r5[r2] = r6     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                r5[r4] = r6     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r5)     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                r1.setAccessible(r4)     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                r3[r2] = r8     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                r3[r4] = r5     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                java.lang.Object r1 = r1.newInstance(r3)     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                ix1.n r1 = (ix1.C46337n) r1     // Catch:{ NoSuchMethodException -> 0x007a, IllegalAccessException -> 0x006b, InstantiationException -> 0x005c, InvocationTargetException -> 0x004d }
                r0 = r1
                goto L_0x0089
            L_0x004d:
                r1 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getMessage()
                r3[r2] = r1
                java.lang.String r1 = "err_4:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r3)
                goto L_0x0088
            L_0x005c:
                r1 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getMessage()
                r3[r2] = r1
                java.lang.String r1 = "err_3:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r3)
                goto L_0x0088
            L_0x006b:
                r1 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getMessage()
                r3[r2] = r1
                java.lang.String r1 = "err_2:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r3)
                goto L_0x0088
            L_0x007a:
                r1 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r4]
                java.lang.String r1 = r1.getMessage()
                r3[r2] = r1
                java.lang.String r1 = "err_1:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r3)
            L_0x0088:
                r0 = 0
            L_0x0089:
                if (r0 != 0) goto L_0x0090
                ix1.n r0 = new ix1.n
                r0.<init>(r8, r9)
            L_0x0090:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.C41771f.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$z");
        }

        public void onViewRecycled(RecyclerView.C16631z zVar) {
            C46337n nVar = (C46337n) zVar;
            ((HashSet) this.f112561i).remove(nVar);
            super.onViewRecycled(nVar);
        }

        /* renamed from: u5 */
        public final long mo65552u5() {
            long j = this.f112566q;
            if (j != -1) {
                return j;
            }
            for (int size = this.f112557e.size() - 1; size >= 1; size--) {
                if (this.f112557e.get(size).seq > GameChatListView.this.f112521R1 && this.f112557e.get(size - 1).seq <= GameChatListView.this.f112521R1) {
                    return this.f112557e.get(size).seq;
                }
            }
            return this.f112566q;
        }

        /* renamed from: w5 */
        public final String mo65553w5(List<ChatroomMsgPack> list) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            for (ChatroomMsgPack chatroomMsgPack : list) {
                stringBuffer.append(chatroomMsgPack.seq);
                stringBuffer.append(",");
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        }

        /* renamed from: y5 */
        public final void mo65554y5(List<ChatroomMsgPack> list, List<ChatroomMsgPack> list2) {
            boolean z = true;
            if (GameChatListView.this.f112513J1 != 1) {
                z = false;
            }
            if (z) {
                long j = 0;
                long j2 = MAlarmHandler.NEXT_FIRE_INTERVAL;
                for (int i = 0; i < list.size(); i++) {
                    long j3 = list.get(i).seq;
                    if (j3 > j) {
                        j = j3;
                    }
                    if (j3 < j2) {
                        j2 = j3;
                    }
                }
                for (ChatroomMsgPack next : list2) {
                    int i2 = next.channel_id;
                    GameChatListView gameChatListView = GameChatListView.this;
                    if (i2 != gameChatListView.f112513J1) {
                        Iterator<ChatroomMsgPack> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (next.seq == it.next().seq) {
                                    it.remove();
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        if (!gameChatListView.f112519P1 && list.size() != 0) {
                            long j4 = next.seq;
                            if (j4 >= j2) {
                                if (j4 > j) {
                                }
                            }
                        }
                        list.add(next);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView$g */
    public interface C41773g {
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView$h */
    public static class C41774h {

        /* renamed from: a */
        public NoticeMsg f112572a;

        /* renamed from: b */
        public boolean f112573b = false;
    }

    public GameChatListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C40008f fVar = C40008f.f107254d;
        this.f112540k2 = new IListener<NotifyNewMsgEvent>(fVar) {
            {
                this.__eventId = -175316448;
            }

            public boolean callback(IEvent iEvent) {
                NotifyNewMsgEvent notifyNewMsgEvent = (NotifyNewMsgEvent) iEvent;
                GameChatListView gameChatListView = GameChatListView.this;
                if (!(gameChatListView.f112513J1 == 0)) {
                    GameChatListView.m45279D1(gameChatListView, notifyNewMsgEvent.f107669d.f107670a);
                }
                return false;
            }
        };
        this.f112541l2 = new IListener<CancelTickleMsgEvent>(fVar) {
            {
                this.__eventId = 2055016665;
            }

            public boolean callback(IEvent iEvent) {
                CancelTickleMsgEvent cancelTickleMsgEvent = (CancelTickleMsgEvent) iEvent;
                C41771f fVar = GameChatListView.this.f112506C1;
                if (fVar == null) {
                    return false;
                }
                long j = cancelTickleMsgEvent.f107393d.f107394a;
                Iterator<ChatroomMsgPack> it = fVar.f112557e.iterator();
                int i = -1;
                while (it.hasNext()) {
                    ChatroomMsgPack next = it.next();
                    if (next.seq == j) {
                        i = fVar.f112557e.indexOf(next);
                        it.remove();
                    }
                }
                if (i == -1) {
                    return false;
                }
                fVar.notifyItemRemoved(i);
                return false;
            }
        };
        this.f112542m2 = new IListener<TickleSomeoneMsgEvent>(fVar) {
            {
                this.__eventId = -688779323;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ix1.n} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r11) {
                /*
                    r10 = this;
                    com.tencent.mm.autogen.events.TickleSomeoneMsgEvent r11 = (com.tencent.p014mm.autogen.events.TickleSomeoneMsgEvent) r11
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r0.f112506C1
                    if (r0 == 0) goto L_0x008c
                    com.tencent.mm.autogen.events.TickleSomeoneMsgEvent$a r0 = r11.f107788d
                    java.lang.String r0 = r0.f107789a
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    if (r0 != 0) goto L_0x008c
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r0.f112506C1
                    com.tencent.mm.autogen.events.TickleSomeoneMsgEvent$a r11 = r11.f107788d
                    java.lang.String r11 = r11.f107789a
                    java.util.Set<ix1.n> r0 = r0.f112561i
                    java.util.HashMap<rx3.l<java.lang.String, java.lang.String>, java.lang.Long> r1 = ix1.C46326i0.f124817a
                    java.lang.String r1 = "boundViewHolders"
                    gy3.C87412m.m108594g(r0, r1)
                    java.lang.String r1 = "userName"
                    gy3.C87412m.m108594g(r11, r1)
                    java.util.HashSet r0 = (java.util.HashSet) r0
                    java.util.Iterator r0 = r0.iterator()
                    boolean r1 = r0.hasNext()
                    if (r1 != 0) goto L_0x0036
                    r11 = 0
                    goto L_0x007b
                L_0x0036:
                    java.lang.Object r1 = r0.next()
                    boolean r2 = r0.hasNext()
                    if (r2 != 0) goto L_0x0042
                L_0x0040:
                    r11 = r1
                    goto L_0x007b
                L_0x0042:
                    r2 = r1
                    ix1.n r2 = (ix1.C46337n) r2
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r3 = r2.f124841G
                    java.lang.String r3 = r3.from_username
                    boolean r3 = gy3.C87412m.m108589b(r3, r11)
                    r4 = 0
                    if (r3 == 0) goto L_0x0056
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r2 = r2.f124841G
                    long r2 = r2.seq
                    goto L_0x0057
                L_0x0056:
                    r2 = r4
                L_0x0057:
                    java.lang.Object r6 = r0.next()
                    r7 = r6
                    ix1.n r7 = (ix1.C46337n) r7
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r8 = r7.f124841G
                    java.lang.String r8 = r8.from_username
                    boolean r8 = gy3.C87412m.m108589b(r8, r11)
                    if (r8 == 0) goto L_0x006d
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r7 = r7.f124841G
                    long r7 = r7.seq
                    goto L_0x006e
                L_0x006d:
                    r7 = r4
                L_0x006e:
                    int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                    if (r9 >= 0) goto L_0x0074
                    r1 = r6
                    r2 = r7
                L_0x0074:
                    boolean r6 = r0.hasNext()
                    if (r6 != 0) goto L_0x0057
                    goto L_0x0040
                L_0x007b:
                    ix1.n r11 = (ix1.C46337n) r11
                    if (r11 == 0) goto L_0x008c
                    java.lang.String r0 = r11.f124869Z0
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r11.f124841G
                    java.lang.String r1 = r1.from_username
                    boolean r0 = ix1.C46326i0.m51633b(r0, r1)
                    r11.mo71731E(r0)
                L_0x008c:
                    r11 = 0
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.C417653.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        mo65531G1(context);
    }

    /* renamed from: C1 */
    public static void m45278C1(GameChatListView gameChatListView) {
        gameChatListView.getClass();
        C119179t tVar = C119157j.f356862d;
        C41804j0 j0Var = new C41804j0(gameChatListView);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(j0Var, 1000, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* renamed from: D1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45279D1(com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView r27, int r28) {
        /*
            r1 = r27
            r0 = r28
            monitor-enter(r27)
            android.view.View r2 = r1.f112522S1     // Catch:{ all -> 0x0102 }
            if (r2 == 0) goto L_0x0100
            java.lang.Object r2 = r2.getTag()     // Catch:{ all -> 0x0102 }
            if (r2 == 0) goto L_0x0011
            goto L_0x0100
        L_0x0011:
            r2 = 8
            r3 = 0
            if (r0 <= 0) goto L_0x00bd
            android.view.View r4 = r1.f112522S1     // Catch:{ all -> 0x0102 }
            int r4 = r4.getVisibility()     // Catch:{ all -> 0x0102 }
            if (r4 != r2) goto L_0x0035
            com.tencent.mm.game.report.d$a r5 = com.tencent.p014mm.game.report.C40308d.f108375a     // Catch:{ all -> 0x0102 }
            r6 = 14
            r8 = 1
            long r10 = r1.f112509F1     // Catch:{ all -> 0x0102 }
            long r12 = r1.f112508E1     // Catch:{ all -> 0x0102 }
            r14 = 0
            java.lang.String r16 = ""
            r17 = 0
            int r2 = r1.f112513J1     // Catch:{ all -> 0x0102 }
            r19 = r2
            r5.mo62997g(r6, r8, r10, r12, r14, r16, r17, r19)     // Catch:{ all -> 0x0102 }
        L_0x0035:
            android.view.View r2 = r1.f112522S1     // Catch:{ all -> 0x0102 }
            k20.a r4 = new k20.a     // Catch:{ all -> 0x0102 }
            r4.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a     // Catch:{ all -> 0x0102 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0102 }
            r4.mo10233c(r5)     // Catch:{ all -> 0x0102 }
            java.lang.Object[] r20 = r4.mo10232b()     // Catch:{ all -> 0x0102 }
            java.lang.String r21 = "com/tencent/mm/plugin/game/chatroom/view/GameChatListView"
            java.lang.String r22 = "refreshNewMsgTips"
            java.lang.String r23 = "(I)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r2
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0102 }
            java.lang.Object r4 = r4.mo10231a(r3)     // Catch:{ all -> 0x0102 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0102 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0102 }
            r2.setVisibility(r4)     // Catch:{ all -> 0x0102 }
            java.lang.String r20 = "com/tencent/mm/plugin/game/chatroom/view/GameChatListView"
            java.lang.String r21 = "refreshNewMsgTips"
            java.lang.String r22 = "(I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r19 = r2
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0102 }
            int r2 = r1.f112513J1     // Catch:{ all -> 0x0102 }
            r4 = 1
            if (r2 != 0) goto L_0x007f
            r2 = 1
            goto L_0x0080
        L_0x007f:
            r2 = 0
        L_0x0080:
            if (r2 != 0) goto L_0x008b
            android.widget.ImageView r2 = r1.f112524U1     // Catch:{ all -> 0x0102 }
            r5 = 2131756134(0x7f100466, float:1.9143167E38)
            r2.setImageResource(r5)     // Catch:{ all -> 0x0102 }
            goto L_0x0093
        L_0x008b:
            android.widget.ImageView r2 = r1.f112524U1     // Catch:{ all -> 0x0102 }
            r5 = 2131755806(0x7f10031e, float:1.9142502E38)
            r2.setImageResource(r5)     // Catch:{ all -> 0x0102 }
        L_0x0093:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r2) goto L_0x00a6
            android.widget.TextView r0 = r1.f112523T1     // Catch:{ all -> 0x0102 }
            android.content.Context r2 = r1.f112507D1     // Catch:{ all -> 0x0102 }
            r3 = 2131830862(0x7f11284e, float:1.9294733E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ all -> 0x0102 }
            r0.setText(r2)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x00a6:
            android.widget.TextView r2 = r1.f112523T1     // Catch:{ all -> 0x0102 }
            android.content.Context r5 = r1.f112507D1     // Catch:{ all -> 0x0102 }
            r6 = 2131830886(0x7f112866, float:1.9294782E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0102 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0102 }
            r4[r3] = r0     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = r5.getString(r6, r4)     // Catch:{ all -> 0x0102 }
            r2.setText(r0)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x00bd:
            android.view.View r0 = r1.f112522S1     // Catch:{ all -> 0x0102 }
            k20.a r12 = new k20.a     // Catch:{ all -> 0x0102 }
            r12.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a     // Catch:{ all -> 0x0102 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0102 }
            r12.mo10233c(r2)     // Catch:{ all -> 0x0102 }
            java.lang.Object[] r5 = r12.mo10232b()     // Catch:{ all -> 0x0102 }
            java.lang.String r6 = "com/tencent/mm/plugin/game/chatroom/view/GameChatListView"
            java.lang.String r7 = "refreshNewMsgTips"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r0
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0102 }
            java.lang.Object r2 = r12.mo10231a(r3)     // Catch:{ all -> 0x0102 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0102 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0102 }
            r0.setVisibility(r2)     // Catch:{ all -> 0x0102 }
            java.lang.String r4 = "com/tencent/mm/plugin/game/chatroom/view/GameChatListView"
            java.lang.String r5 = "refreshNewMsgTips"
            java.lang.String r6 = "(I)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0102 }
        L_0x00fe:
            monitor-exit(r27)
            goto L_0x0101
        L_0x0100:
            monitor-exit(r27)
        L_0x0101:
            return
        L_0x0102:
            r0 = move-exception
            monitor-exit(r27)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.m45279D1(com.tencent.mm.plugin.game.chatroom.view.GameChatListView, int):void");
    }

    /* access modifiers changed from: private */
    public void setNoticeTag(C41774h hVar) {
        boolean z;
        C41774h hVar2 = hVar;
        if (hVar2 != null) {
            Log.m105925i("GameChatRoom.GameChatListView", "setNoticeTag, Seq:%d, text:%s", Long.valueOf(hVar2.f112572a.seq), hVar2.f112572a.notice_text);
            View view = this.f112525V1;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "setNoticeTag", "(Lcom/tencent/mm/plugin/game/chatroom/view/GameChatListView$NoticeMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "setNoticeTag", "(Lcom/tencent/mm/plugin/game/chatroom/view/GameChatListView$NoticeMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f112526W1.setText(hVar2.f112572a.notice_text);
                C40308d.f108375a.mo62997g(2, 1, this.f112509F1, this.f112508E1, hVar2.f112572a.seq, "", 0, this.f112513J1);
                this.f112525V1.setTag(Long.valueOf(hVar2.f112572a.seq));
                ((ConcurrentHashMap) this.f112531b2).clear();
                C41771f fVar = this.f112506C1;
                long j = hVar2.f112572a.seq;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) GameChatListView.this.getLayoutManager();
                int C = linearLayoutManager.mo16957C();
                int E = linearLayoutManager.mo16959E();
                Log.m105925i("GameChatRoom.GameChatListView", "notifyAtEvent, atSeq:%d, firstVisibleItem:%d, lastVisibleItem:%d", Long.valueOf(j), Integer.valueOf(C), Integer.valueOf(E));
                while (true) {
                    if (C <= E) {
                        if (C >= 0 && C < fVar.f112557e.size() && fVar.f112557e.get(C).seq == j) {
                            fVar.notifyItemChanged(C);
                            z = true;
                            break;
                        }
                        C++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    long j2 = hVar2.f112572a.seq - 2;
                    Log.m105925i("GameChatRoom.GameChatListView", "pre fetch at page, seq:%d", Long.valueOf(j2));
                    C86709a0.m107524d().mo123460f(new C39850e(this.f112512I1, j2, 0, 6, hVar2.f112572a.seq, this.f112513J1));
                }
            }
        }
    }

    /* renamed from: E1 */
    public final void mo65529E1(List<ChatroomMsgPack> list, int i, List<ChatroomMsgPack> list2) {
        if (list != null) {
            C41771f.m45295G4(this.f112506C1, list, i, 0, list2);
        }
    }

    /* renamed from: F1 */
    public synchronized void mo65530F1(List<ChatroomMsgPack> list, List<NoticeMsg> list2, long j, List<ChatroomMsgPack> list3) {
        if (this.f112533d2) {
            this.f112529Z1 = true;
            this.f112530a2 = true;
            this.f112519P1 = true;
            this.f112520Q1 = 0;
            this.f112537h2 = 0;
            this.f112521R1 = j;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("noticeMsgList:[");
            if (!Util.isNullOrNil((List) list2)) {
                for (NoticeMsg next : list2) {
                    C41774h hVar = new C41774h();
                    hVar.f112572a = next;
                    ((LinkedList) this.f112534e2).add(hVar);
                    stringBuffer.append("(seq:" + next.seq + ", text:" + next.notice_text + ", highlight:" + next.highlight + ") ");
                }
            }
            stringBuffer.append("]");
            Log.m105925i("GameChatRoom.GameChatListView", "lastReceiveSeq:%d, %s", Long.valueOf(this.f112521R1), stringBuffer.toString());
            JumpTargetEvent jumpTargetEvent = new JumpTargetEvent();
            jumpTargetEvent.f107621d.f107622a = true;
            jumpTargetEvent.publish();
        }
        this.f112506C1.mo65548O5(list3, this.f112532c2);
        for (Map.Entry entry : ((ConcurrentHashMap) this.f112531b2).entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            List list4 = (List) entry.getValue();
            this.f112506C1.mo65548O5(list3, list4);
            ((ConcurrentHashMap) this.f112531b2).put(Long.valueOf(longValue), list4);
        }
        mo65529E1(list, 3, list3);
    }

    /* renamed from: G1 */
    public final void mo65531G1(Context context) {
        this.f112507D1 = context;
        Activity activity = (Activity) context;
        this.f112508E1 = activity.getIntent().getLongExtra("game_report_sourceid", 0);
        this.f112509F1 = activity.getIntent().getLongExtra("game_report_ssid", 0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.f112527X1 = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        setItemAnimator((RecyclerView.C16616j) null);
        C41771f fVar = new C41771f();
        this.f112506C1 = fVar;
        fVar.setHasStableIds(true);
        setAdapter(this.f112506C1);
        mo17043c(new C41769d());
        this.f112528Y1 = new C41766a();
    }

    /* renamed from: H1 */
    public void mo65532H1(long j, boolean z) {
        if (j < 0) {
            this.f112522S1.setTag((Object) null);
            this.f112522S1.performClick();
            return;
        }
        if (z) {
            this.f112536g2 = j;
        }
        List list = (List) ((ConcurrentHashMap) this.f112531b2).get(Long.valueOf(j));
        if (!Util.isNullOrNil(list)) {
            Log.m105925i("GameChatRoom.GameChatListView", "locatePosition, use prefetch msg, seq:%d", Long.valueOf(j));
            if (list != null) {
                C41771f.m45295G4(this.f112506C1, list, 4, j, (List) null);
                return;
            }
            return;
        }
        Log.m105925i("GameChatRoom.GameChatListView", "locatePosition, request msg, seq:%d", Long.valueOf(j));
        C86709a0.m107524d().mo123460f(new C39850e(this.f112512I1, j - 2, 0, 4, j, this.f112513J1));
    }

    /* renamed from: I1 */
    public void mo65533I1() {
        int C = this.f112527X1.mo16957C();
        int E = this.f112527X1.mo16959E();
        int itemCount = this.f112506C1.getItemCount() - 1;
        if (itemCount < C || itemCount > E) {
            LinearLayoutManager linearLayoutManager = this.f112527X1;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(Integer.valueOf(itemCount));
            C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "scrollToBottom", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "scrollToBottom", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        post(new C41768c(itemCount));
    }

    /* renamed from: J */
    public void mo62213J(Map<String, C53591c.C53598g> map) {
        if (map != null) {
            ((HashMap) this.f112511H1).clear();
            ((HashMap) this.f112511H1).putAll(map);
            this.f112506C1.mo65550Q5();
        }
    }

    /* renamed from: J1 */
    public void mo65534J1(int i, List<Channel> list) {
        String str;
        this.f112513J1 = i;
        if (i == 0) {
            str = "";
        } else {
            str = "#" + this.f112513J1;
        }
        this.f112535f2 = str;
        this.f112514K1 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r2 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        return;
     */
    /* renamed from: K1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo65535K1(com.tencent.p014mm.autogen.events.NewUserNoticeEvent r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            if (r12 != 0) goto L_0x0057
            android.view.View r12 = r11.f112522S1     // Catch:{ all -> 0x00e1 }
            java.lang.Object r12 = r12.getTag()     // Catch:{ all -> 0x00e1 }
            if (r12 == 0) goto L_0x0055
            android.view.View r12 = r11.f112522S1     // Catch:{ all -> 0x00e1 }
            r1 = 8
            k20.a r9 = new k20.a     // Catch:{ all -> 0x00e1 }
            r9.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a     // Catch:{ all -> 0x00e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00e1 }
            r9.mo10233c(r1)     // Catch:{ all -> 0x00e1 }
            java.lang.Object[] r2 = r9.mo10232b()     // Catch:{ all -> 0x00e1 }
            java.lang.String r3 = "com/tencent/mm/plugin/game/chatroom/view/GameChatListView"
            java.lang.String r4 = "showNewUserSpeakBubble"
            java.lang.String r5 = "(Lcom/tencent/mm/autogen/events/NewUserNoticeEvent;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r12
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00e1 }
            java.lang.Object r0 = r9.mo10231a(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00e1 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00e1 }
            r12.setVisibility(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = "com/tencent/mm/plugin/game/chatroom/view/GameChatListView"
            java.lang.String r3 = "showNewUserSpeakBubble"
            java.lang.String r4 = "(Lcom/tencent/mm/autogen/events/NewUserNoticeEvent;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r12
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00e1 }
            android.view.View r12 = r11.f112522S1     // Catch:{ all -> 0x00e1 }
            r0 = 0
            r12.setTag(r0)     // Catch:{ all -> 0x00e1 }
        L_0x0055:
            monitor-exit(r11)
            return
        L_0x0057:
            int r1 = r11.f112513J1     // Catch:{ all -> 0x00e1 }
            r2 = 1
            if (r1 != 0) goto L_0x005e
            r3 = 1
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            if (r3 != 0) goto L_0x0068
            r3 = 2
            if (r1 != r3) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            if (r2 == 0) goto L_0x00df
        L_0x0068:
            com.tencent.mm.autogen.events.NewUserNoticeEvent$a r1 = r12.f107660d     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = r1.f107662b     // Catch:{ all -> 0x00e1 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ all -> 0x00e1 }
            if (r1 != 0) goto L_0x00df
            android.view.View r1 = r11.f112522S1     // Catch:{ all -> 0x00e1 }
            k20.a r10 = new k20.a     // Catch:{ all -> 0x00e1 }
            r10.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a     // Catch:{ all -> 0x00e1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00e1 }
            r10.mo10233c(r2)     // Catch:{ all -> 0x00e1 }
            java.lang.Object[] r3 = r10.mo10232b()     // Catch:{ all -> 0x00e1 }
            java.lang.String r4 = "com/tencent/mm/plugin/game/chatroom/view/GameChatListView"
            java.lang.String r5 = "showNewUserSpeakBubble"
            java.lang.String r6 = "(Lcom/tencent/mm/autogen/events/NewUserNoticeEvent;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00e1 }
            java.lang.Object r0 = r10.mo10231a(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00e1 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00e1 }
            r1.setVisibility(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r3 = "com/tencent/mm/plugin/game/chatroom/view/GameChatListView"
            java.lang.String r4 = "showNewUserSpeakBubble"
            java.lang.String r5 = "(Lcom/tencent/mm/autogen/events/NewUserNoticeEvent;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r1
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00e1 }
            android.view.View r0 = r11.f112522S1     // Catch:{ all -> 0x00e1 }
            com.tencent.mm.autogen.events.NewUserNoticeEvent$a r1 = r12.f107660d     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = r1.f107663c     // Catch:{ all -> 0x00e1 }
            r0.setTag(r1)     // Catch:{ all -> 0x00e1 }
            android.view.View r0 = r11.f112522S1     // Catch:{ all -> 0x00e1 }
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$b r1 = new com.tencent.mm.plugin.game.chatroom.view.GameChatListView$b     // Catch:{ all -> 0x00e1 }
            r1.<init>()     // Catch:{ all -> 0x00e1 }
            com.tencent.mm.autogen.events.NewUserNoticeEvent$a r2 = r12.f107660d     // Catch:{ all -> 0x00e1 }
            long r2 = r2.f107664d     // Catch:{ all -> 0x00e1 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.postDelayed(r1, r2)     // Catch:{ all -> 0x00e1 }
            android.widget.TextView r0 = r11.f112523T1     // Catch:{ all -> 0x00e1 }
            com.tencent.mm.autogen.events.NewUserNoticeEvent$a r12 = r12.f107660d     // Catch:{ all -> 0x00e1 }
            java.lang.String r12 = r12.f107662b     // Catch:{ all -> 0x00e1 }
            r0.setText(r12)     // Catch:{ all -> 0x00e1 }
            android.widget.ImageView r12 = r11.f112524U1     // Catch:{ all -> 0x00e1 }
            r0 = 2131756204(0x7f1004ac, float:1.9143309E38)
            r12.setImageResource(r0)     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            monitor-exit(r11)
            return
        L_0x00e1:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.mo65535K1(com.tencent.mm.autogen.events.NewUserNoticeEvent):void");
    }

    /* renamed from: W */
    public void mo62214W(int i) {
    }

    public void getFirstPageData() {
        int i = this.f112513J1;
        if (!(i == 0)) {
            C86709a0.m107524d().mo123460f(new C39850e(this.f112512I1, 0, MAlarmHandler.NEXT_FIRE_INTERVAL, 3, 0, i));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C86709a0.m107524d().mo123455a(4562, this);
        C86709a0.m107524d().mo123455a(4565, this);
        this.f112540k2.alive();
        this.f112541l2.alive();
        this.f112542m2.alive();
    }

    public void onDetachedFromWindow() {
        List<ChatroomMsgPack> list;
        super.onDetachedFromWindow();
        C86709a0.m107524d().mo123470p(4562, this);
        C86709a0.m107524d().mo123470p(4565, this);
        this.f112540k2.dead();
        this.f112541l2.dead();
        this.f112542m2.dead();
        List<ChatroomMsgPack> list2 = this.f112506C1.f112557e;
        if (this.f112518O1 != null && !Util.isNullOrNil(this.f112512I1)) {
            if (!Util.isNullOrNil((List) list2)) {
                int i = 0;
                int size = list2.size();
                if (list2.size() > 20) {
                    i = list2.size() - 20;
                }
                list = list2.subList(i, size);
            } else {
                list = new LinkedList<>();
            }
            LocalCacheChatMsg localCacheChatMsg = new LocalCacheChatMsg();
            localCacheChatMsg.chatroom_msg_list.addAll(list);
            localCacheChatMsg.host_user_name = this.f112518O1.getUserName();
            GamePBCacheEvent gamePBCacheEvent = new GamePBCacheEvent();
            GamePBCacheEvent.C40109a aVar = gamePBCacheEvent.f107561d;
            aVar.f107562a = 2;
            aVar.f107563b = "cache_game_chat_msg#" + this.f112512I1 + this.f112535f2;
            try {
                gamePBCacheEvent.f107561d.f107564c = localCacheChatMsg.toByteArray();
            } catch (IOException unused) {
            }
            gamePBCacheEvent.publish();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int type = yVar.getType();
        if (type == 4562) {
            C39850e eVar = (C39850e) yVar;
            Log.m105925i("GameChatRoom.GameChatListView", "GetGameChatRoomMsg callback, localChannelId:%d, requestChannelId:%d", Integer.valueOf(this.f112513J1), Integer.valueOf(((GetChatroomMsgRequest) eVar.f106872e.f127055a.f127080a).channel_id));
            int i3 = this.f112513J1;
            C47350c cVar = eVar.f106872e;
            if (i3 == ((GetChatroomMsgRequest) cVar.f127055a.f127080a).channel_id) {
                int i4 = eVar.f106873f;
                if (i4 == 1) {
                    this.f112529Z1 = true;
                } else if (i4 == 2) {
                    this.f112530a2 = true;
                }
                if (i == 0 && i2 == 0) {
                    GetChatroomMsgResponse getChatroomMsgResponse = (GetChatroomMsgResponse) cVar.f127056b.f127083a;
                    if (i4 == 6) {
                        if (!Util.isNullOrNil((List) getChatroomMsgResponse.msg_pack_list)) {
                            ((ConcurrentHashMap) this.f112531b2).put(Long.valueOf(eVar.f106874g), getChatroomMsgResponse.msg_pack_list);
                        }
                    } else if (i4 == 4) {
                        LinkedList<ChatroomMsgPack> linkedList = getChatroomMsgResponse.msg_pack_list;
                        long j = eVar.f106874g;
                        if (linkedList != null) {
                            C41771f.m45295G4(this.f112506C1, linkedList, i4, j, (List) null);
                        }
                    } else {
                        mo65529E1(getChatroomMsgResponse.msg_pack_list, i4, (List<ChatroomMsgPack>) null);
                    }
                }
            }
        } else if (type == 4565 && i == 0 && i2 == 0) {
            C39862p pVar = (C39862p) yVar;
            Object value = pVar.f106909g.getValue();
            C87412m.m108593f(value, "<get-commReqResp>(...)");
            C47465a aVar = ((C47350c) value).f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse");
            C41771f fVar = this.f112506C1;
            long j2 = pVar.f106907e;
            TopicInfo topicInfo = ((PublishChatroomMsgResponse) aVar).topic_info;
            fVar.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C41828o0(fVar, j2, topicInfo));
            Iterator it = ((HashSet) fVar.f112561i).iterator();
            while (it.hasNext()) {
                C46337n nVar = (C46337n) it.next();
                ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
                if (chatroomMsgPack != null && chatroomMsgPack.seq == j2) {
                    nVar.mo71730C(topicInfo, j2, true);
                }
            }
        }
    }

    public void setChatRoomInfo(String str) {
        this.f112512I1 = str;
        C40308d.f108375a.mo62994d(1304, this.f112509F1, this.f112508E1);
    }

    public void setChatRoomJumpInfo(ChatroomJumpInfo chatroomJumpInfo) {
        this.f112516M1 = chatroomJumpInfo;
    }

    public void setHostContact(C39641d dVar) {
        this.f112518O1 = dVar;
    }

    public void setJumpFirstSeq(long j) {
        this.f112539j2 = j;
        C41771f fVar = this.f112506C1;
        if (fVar != null) {
            Iterator it = ((HashSet) fVar.f112561i).iterator();
            while (it.hasNext()) {
                ((C46337n) it.next()).f124875f1 = GameChatListView.this.f112539j2;
            }
        }
    }

    public void setPreloadInfo(JumpInfo jumpInfo) {
        this.f112515L1 = jumpInfo;
    }

    public void setPremadeCardInfo(String str) {
        this.f112517N1 = str;
        this.f112506C1.mo65550Q5();
    }

    public GameChatListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C40008f fVar = C40008f.f107254d;
        this.f112540k2 = new IListener<NotifyNewMsgEvent>(fVar) {
            {
                this.__eventId = -175316448;
            }

            public boolean callback(IEvent iEvent) {
                NotifyNewMsgEvent notifyNewMsgEvent = (NotifyNewMsgEvent) iEvent;
                GameChatListView gameChatListView = GameChatListView.this;
                if (!(gameChatListView.f112513J1 == 0)) {
                    GameChatListView.m45279D1(gameChatListView, notifyNewMsgEvent.f107669d.f107670a);
                }
                return false;
            }
        };
        this.f112541l2 = new IListener<CancelTickleMsgEvent>(fVar) {
            {
                this.__eventId = 2055016665;
            }

            public boolean callback(IEvent iEvent) {
                CancelTickleMsgEvent cancelTickleMsgEvent = (CancelTickleMsgEvent) iEvent;
                C41771f fVar = GameChatListView.this.f112506C1;
                if (fVar == null) {
                    return false;
                }
                long j = cancelTickleMsgEvent.f107393d.f107394a;
                Iterator<ChatroomMsgPack> it = fVar.f112557e.iterator();
                int i = -1;
                while (it.hasNext()) {
                    ChatroomMsgPack next = it.next();
                    if (next.seq == j) {
                        i = fVar.f112557e.indexOf(next);
                        it.remove();
                    }
                }
                if (i == -1) {
                    return false;
                }
                fVar.notifyItemRemoved(i);
                return false;
            }
        };
        this.f112542m2 = new IListener<TickleSomeoneMsgEvent>(fVar) {
            {
                this.__eventId = -688779323;
            }

            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r11) {
                /*
                    r10 = this;
                    com.tencent.mm.autogen.events.TickleSomeoneMsgEvent r11 = (com.tencent.p014mm.autogen.events.TickleSomeoneMsgEvent) r11
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r0.f112506C1
                    if (r0 == 0) goto L_0x008c
                    com.tencent.mm.autogen.events.TickleSomeoneMsgEvent$a r0 = r11.f107788d
                    java.lang.String r0 = r0.f107789a
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    if (r0 != 0) goto L_0x008c
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r0.f112506C1
                    com.tencent.mm.autogen.events.TickleSomeoneMsgEvent$a r11 = r11.f107788d
                    java.lang.String r11 = r11.f107789a
                    java.util.Set<ix1.n> r0 = r0.f112561i
                    java.util.HashMap<rx3.l<java.lang.String, java.lang.String>, java.lang.Long> r1 = ix1.C46326i0.f124817a
                    java.lang.String r1 = "boundViewHolders"
                    gy3.C87412m.m108594g(r0, r1)
                    java.lang.String r1 = "userName"
                    gy3.C87412m.m108594g(r11, r1)
                    java.util.HashSet r0 = (java.util.HashSet) r0
                    java.util.Iterator r0 = r0.iterator()
                    boolean r1 = r0.hasNext()
                    if (r1 != 0) goto L_0x0036
                    r11 = 0
                    goto L_0x007b
                L_0x0036:
                    java.lang.Object r1 = r0.next()
                    boolean r2 = r0.hasNext()
                    if (r2 != 0) goto L_0x0042
                L_0x0040:
                    r11 = r1
                    goto L_0x007b
                L_0x0042:
                    r2 = r1
                    ix1.n r2 = (ix1.C46337n) r2
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r3 = r2.f124841G
                    java.lang.String r3 = r3.from_username
                    boolean r3 = gy3.C87412m.m108589b(r3, r11)
                    r4 = 0
                    if (r3 == 0) goto L_0x0056
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r2 = r2.f124841G
                    long r2 = r2.seq
                    goto L_0x0057
                L_0x0056:
                    r2 = r4
                L_0x0057:
                    java.lang.Object r6 = r0.next()
                    r7 = r6
                    ix1.n r7 = (ix1.C46337n) r7
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r8 = r7.f124841G
                    java.lang.String r8 = r8.from_username
                    boolean r8 = gy3.C87412m.m108589b(r8, r11)
                    if (r8 == 0) goto L_0x006d
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r7 = r7.f124841G
                    long r7 = r7.seq
                    goto L_0x006e
                L_0x006d:
                    r7 = r4
                L_0x006e:
                    int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                    if (r9 >= 0) goto L_0x0074
                    r1 = r6
                    r2 = r7
                L_0x0074:
                    boolean r6 = r0.hasNext()
                    if (r6 != 0) goto L_0x0057
                    goto L_0x0040
                L_0x007b:
                    ix1.n r11 = (ix1.C46337n) r11
                    if (r11 == 0) goto L_0x008c
                    java.lang.String r0 = r11.f124869Z0
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r11.f124841G
                    java.lang.String r1 = r1.from_username
                    boolean r0 = ix1.C46326i0.m51633b(r0, r1)
                    r11.mo71731E(r0)
                L_0x008c:
                    r11 = 0
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.C417653.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        mo65531G1(context);
    }
}
