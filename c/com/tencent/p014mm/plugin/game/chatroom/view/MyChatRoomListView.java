package com.tencent.p014mm.plugin.game.chatroom.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChatRoomJoinOrQuitEvent;
import com.tencent.p014mm.autogen.events.GamePBCacheEvent;
import com.tencent.p014mm.autogen.events.GetChatRoomMsgEvent;
import com.tencent.p014mm.autogen.events.ShowMultiTaskEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BanAction;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
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
import cx1.C45222d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ob0.C47350c;
import ob0.C89144l0;
import org.json.JSONObject;
import p702ts.C78085c;
import pe3.C47465a;
import py1.C47621l3;
import py1.C47637n5;
import py1.C47713z2;
import v10.C52735e;
import yw1.C53601h;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView */
public class MyChatRoomListView extends MRecyclerView {

    /* renamed from: P1 */
    public static final /* synthetic */ int f112591P1 = 0;

    /* renamed from: C1 */
    public Context f112592C1;

    /* renamed from: D1 */
    public C41784c f112593D1;

    /* renamed from: E1 */
    public Lbs f112594E1;

    /* renamed from: F1 */
    public long f112595F1;

    /* renamed from: G1 */
    public long f112596G1;

    /* renamed from: H1 */
    public List<BanAction> f112597H1 = new LinkedList();

    /* renamed from: I1 */
    public LocalMyChatRoom f112598I1;

    /* renamed from: J1 */
    public boolean f112599J1 = false;

    /* renamed from: K1 */
    public boolean f112600K1 = false;

    /* renamed from: L1 */
    public IListener f112601L1;

    /* renamed from: M1 */
    public IListener f112602M1;

    /* renamed from: N1 */
    public IListener f112603N1;

    /* renamed from: O1 */
    public C92411b.C92412a f112604O1;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView$a */
    public class C41781a implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView$a$a */
        public class C41782a implements Runnable {
            public C41782a() {
            }

            public void run() {
                ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(MyChatRoomListView.this.f112604O1);
            }
        }

        public C41781a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            Log.m105925i("MicroMsg.ChatRoomListView", "getLocation isOK:%b, longitude:%f, latitude:%f", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2));
            new MMHandler(Looper.getMainLooper()).post(new C41782a());
            if (z) {
                MyChatRoomListView.this.f112594E1 = new Lbs();
                Lbs lbs = MyChatRoomListView.this.f112594E1;
                lbs.longitude = f;
                lbs.latitude = f2;
            }
            MyChatRoomListView myChatRoomListView = MyChatRoomListView.this;
            int i2 = MyChatRoomListView.f112591P1;
            myChatRoomListView.getClass();
            if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_FIRST_ENTER_INT, 0)) <= 0) {
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getfirstenterinfo";
                bVar.f127069d = 5139;
                bVar.f127070e = 0;
                bVar.f127071f = 0;
                GetFirstEnterInfoRequest getFirstEnterInfoRequest = new GetFirstEnterInfoRequest();
                Lbs lbs2 = myChatRoomListView.f112594E1;
                if (lbs2 != null) {
                    getFirstEnterInfoRequest.lbs_info = lbs2;
                }
                bVar.f127066a = getFirstEnterInfoRequest;
                bVar.f127067b = new GetFirstEnterInfoResponse();
                C89144l0.m111429e(bVar.mo72403a(), new C41843v0(myChatRoomListView), false);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView$b */
    public class C41783b extends RecyclerView.C0130p {
        public C41783b() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/MyChatRoomListView$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            MyChatRoomListView myChatRoomListView = MyChatRoomListView.this;
            if (myChatRoomListView.f112593D1.f112617j) {
                myChatRoomListView.getClass();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/MyChatRoomListView$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/MyChatRoomListView$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/MyChatRoomListView$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView$c */
    public class C41784c extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public List<C45219a> f112611d = new CopyOnWriteArrayList();

        /* renamed from: e */
        public C45219a f112612e;

        /* renamed from: f */
        public C45219a f112613f;

        /* renamed from: g */
        public boolean f112614g;

        /* renamed from: h */
        public List<String> f112615h;

        /* renamed from: i */
        public List<C45219a> f112616i;

        /* renamed from: j */
        public boolean f112617j;

        /* renamed from: n */
        public boolean f112618n;

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView$c$a */
        public class C41785a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f112620d;

            /* renamed from: e */
            public final /* synthetic */ RecyclerView.C16631z f112621e;

            /* renamed from: f */
            public final /* synthetic */ C45222d f112622f;

            public C41785a(int i, RecyclerView.C16631z zVar, C45222d dVar) {
                this.f112620d = i;
                this.f112621e = zVar;
                this.f112622f = dVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/MyChatRoomListView$MyChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (this.f112620d == 4) {
                    C41784c.this.mo65569G4(true);
                    ((C41811n.C41816d) this.f112621e).mo65605z(true, this.f112622f.f122554c);
                } else {
                    C41784c.this.mo65569G4(false);
                    ((C41811n.C41816d) this.f112621e).mo65605z(false, this.f112622f.f122554c);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/MyChatRoomListView$MyChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C41784c(boolean z) {
            this.f112612e = new C45219a(1, (C47465a) null, false, MyChatRoomListView.this.f112592C1.getString(C0966R.string.fas));
            this.f112613f = new C45219a(5, (C47465a) null, false, (String) null, (JumpInfo) null, new C45222d(true, false, false));
            this.f112614g = false;
            this.f112615h = new ArrayList();
            this.f112616i = new CopyOnWriteArrayList();
            this.f112617j = false;
            this.f112618n = z;
            Log.m105924i("MicroMsg.ChatRoomListView", "MyChatroomAdapter enableCollapse = " + z);
        }

        /* renamed from: F4 */
        public final ChatroomData mo65568F4(int i) {
            C45219a aVar;
            if (i >= ((CopyOnWriteArrayList) this.f112611d).size() || i < 0 || (aVar = (C45219a) ((CopyOnWriteArrayList) this.f112611d).get(i)) == null) {
                return null;
            }
            return C41811n.m45333b(aVar);
        }

        /* renamed from: G4 */
        public void mo65569G4(boolean z) {
            ((CopyOnWriteArrayList) this.f112611d).clear();
            ((CopyOnWriteArrayList) this.f112611d).add(this.f112612e);
            this.f112617j = z;
            if (z) {
                this.f112613f.f122543f.f122553b = true;
                ((CopyOnWriteArrayList) this.f112611d).addAll(this.f112616i);
                notifyItemRangeInserted(4, ((CopyOnWriteArrayList) this.f112616i).size() - 3);
                MyChatRoomListView.this.getClass();
            } else {
                ((CopyOnWriteArrayList) this.f112611d).addAll(((CopyOnWriteArrayList) this.f112616i).subList(0, 3));
                this.f112613f.f122543f.f122553b = false;
                RecyclerView.C16631z I0 = MyChatRoomListView.this.mo17023I0(3);
                if (I0 != null) {
                    I0.f44854d.getGlobalVisibleRect(new Rect());
                }
                MyChatRoomListView.this.getClass();
                notifyItemRangeRemoved(4, ((CopyOnWriteArrayList) this.f112616i).size() - 3);
            }
            ((CopyOnWriteArrayList) this.f112611d).add(this.f112613f);
            notifyItemChanged(((CopyOnWriteArrayList) this.f112611d).size() - 1);
        }

        /* renamed from: O4 */
        public void mo65570O4() {
            MyChatRoomListView.this.getClass();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:28|29|30|31|32|33) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00b9 */
        /* renamed from: g5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo65571g5(java.util.List<com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomInfo> r21) {
            /*
                r20 = this;
                r1 = r20
                r0 = r21
                monitor-enter(r20)
                if (r0 == 0) goto L_0x00dc
                java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ all -> 0x00d9 }
                r2.<init>()     // Catch:{ all -> 0x00d9 }
                java.util.Iterator r3 = r21.iterator()     // Catch:{ all -> 0x00d9 }
            L_0x0010:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00d9 }
                if (r4 == 0) goto L_0x0026
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00d9 }
                com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo r4 = (com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomInfo) r4     // Catch:{ all -> 0x00d9 }
                cx1.a r5 = new cx1.a     // Catch:{ all -> 0x00d9 }
                r6 = 2
                r5.<init>(r6, r4)     // Catch:{ all -> 0x00d9 }
                r2.add(r5)     // Catch:{ all -> 0x00d9 }
                goto L_0x0010
            L_0x0026:
                r20.mo65570O4()     // Catch:{ all -> 0x00d9 }
                java.util.List<cx1.a> r3 = r1.f112611d     // Catch:{ all -> 0x00d9 }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00d9 }
                r3.clear()     // Catch:{ all -> 0x00d9 }
                int r3 = r21.size()     // Catch:{ all -> 0x00d9 }
                if (r3 == 0) goto L_0x00d5
                java.util.List<cx1.a> r3 = r1.f112611d     // Catch:{ all -> 0x00d9 }
                cx1.a r4 = r1.f112612e     // Catch:{ all -> 0x00d9 }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00d9 }
                r5 = 0
                r3.add(r5, r4)     // Catch:{ all -> 0x00d9 }
                java.util.List<cx1.a> r3 = r1.f112616i     // Catch:{ all -> 0x00d9 }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00d9 }
                r3.clear()     // Catch:{ all -> 0x00d9 }
                java.util.List<cx1.a> r3 = r1.f112616i     // Catch:{ all -> 0x00d9 }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00d9 }
                r3.addAll(r2)     // Catch:{ all -> 0x00d9 }
                int r3 = r21.size()     // Catch:{ all -> 0x00d9 }
                r4 = 3
                r6 = 1
                if (r3 <= r4) goto L_0x009e
                boolean r3 = r1.f112618n     // Catch:{ all -> 0x00d9 }
                if (r3 == 0) goto L_0x009e
                cx1.a r3 = r1.f112613f     // Catch:{ all -> 0x00d9 }
                cx1.d r3 = r3.f122543f     // Catch:{ all -> 0x00d9 }
                boolean r3 = r3.f122553b     // Catch:{ all -> 0x00d9 }
                if (r3 == 0) goto L_0x006a
                java.util.List<cx1.a> r0 = r1.f112611d     // Catch:{ all -> 0x00d9 }
                java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch:{ all -> 0x00d9 }
                r0.addAll(r6, r2)     // Catch:{ all -> 0x00d9 }
                goto L_0x0094
            L_0x006a:
                java.util.List<cx1.a> r3 = r1.f112611d     // Catch:{ all -> 0x00d9 }
                java.util.List r5 = r2.subList(r5, r4)     // Catch:{ all -> 0x00d9 }
                java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch:{ all -> 0x00d9 }
                r3.addAll(r6, r5)     // Catch:{ all -> 0x00d9 }
                r7 = 0
                r9 = r7
            L_0x0078:
                int r3 = r21.size()     // Catch:{ all -> 0x00d9 }
                if (r4 >= r3) goto L_0x008a
                java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x00d9 }
                com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo r3 = (com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomInfo) r3     // Catch:{ all -> 0x00d9 }
                long r11 = r3.unread_msg_count     // Catch:{ all -> 0x00d9 }
                long r9 = r9 + r11
                int r4 = r4 + 1
                goto L_0x0078
            L_0x008a:
                int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r0 <= 0) goto L_0x0094
                cx1.a r0 = r1.f112613f     // Catch:{ all -> 0x00d9 }
                cx1.d r0 = r0.f122543f     // Catch:{ all -> 0x00d9 }
                r0.f122554c = r6     // Catch:{ all -> 0x00d9 }
            L_0x0094:
                java.util.List<cx1.a> r0 = r1.f112611d     // Catch:{ all -> 0x00d9 }
                cx1.a r3 = r1.f112613f     // Catch:{ all -> 0x00d9 }
                java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch:{ all -> 0x00d9 }
                r0.add(r3)     // Catch:{ all -> 0x00d9 }
                goto L_0x00a5
            L_0x009e:
                java.util.List<cx1.a> r0 = r1.f112611d     // Catch:{ all -> 0x00d9 }
                java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch:{ all -> 0x00d9 }
                r0.addAll(r2)     // Catch:{ all -> 0x00d9 }
            L_0x00a5:
                boolean r0 = r1.f112614g     // Catch:{ all -> 0x00d9 }
                if (r0 != 0) goto L_0x00d5
                r1.f112614g = r6     // Catch:{ all -> 0x00d9 }
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00d9 }
                r0.<init>()     // Catch:{ all -> 0x00d9 }
                java.lang.String r3 = "GroupNum"
                int r2 = r2.size()     // Catch:{ JSONException -> 0x00b9 }
                r0.put(r3, r2)     // Catch:{ JSONException -> 0x00b9 }
            L_0x00b9:
                com.tencent.mm.game.report.d$a r4 = com.tencent.p014mm.game.report.C40308d.f108375a     // Catch:{ all -> 0x00d9 }
                r5 = 1001(0x3e9, double:4.946E-321)
                r7 = 0
                r9 = 1
                r11 = 0
                com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.MyChatRoomListView.this     // Catch:{ all -> 0x00d9 }
                long r13 = r2.f112596G1     // Catch:{ all -> 0x00d9 }
                long r2 = r2.f112595F1     // Catch:{ all -> 0x00d9 }
                java.lang.String r17 = ""
                java.lang.String r18 = ""
                java.lang.String r19 = r0.toString()     // Catch:{ all -> 0x00d9 }
                r15 = r2
                r4.mo62999k(r5, r7, r9, r11, r13, r15, r17, r18, r19)     // Catch:{ all -> 0x00d9 }
            L_0x00d5:
                r20.notifyDataSetChanged()     // Catch:{ all -> 0x00d9 }
                goto L_0x00dc
            L_0x00d9:
                r0 = move-exception
                monitor-exit(r20)
                throw r0
            L_0x00dc:
                monitor-exit(r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.MyChatRoomListView.C41784c.mo65571g5(java.util.List):void");
        }

        public int getItemCount() {
            return ((CopyOnWriteArrayList) this.f112611d).size();
        }

        public int getItemViewType(int i) {
            return ((C45219a) ((CopyOnWriteArrayList) this.f112611d).get(i)).f122538a;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2;
            RecyclerView.C16631z zVar2 = zVar;
            int i3 = i;
            if (zVar2 != null) {
                if (mo65568F4(i3) != null && getItemViewType(i3) == 2) {
                    i2 = i3 - ((CopyOnWriteArrayList) this.f112611d).indexOf(this.f112612e);
                } else {
                    i2 = 0;
                }
                ChatroomData F4 = mo65568F4(i3);
                int itemViewType = getItemViewType(i3);
                if (F4 != null) {
                    if (!((ArrayList) this.f112615h).contains(F4.chatroom_name)) {
                        ((ArrayList) this.f112615h).add(F4.chatroom_name);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("reportStr", F4.report_str);
                        } catch (Exception unused) {
                        }
                        if (itemViewType == 2) {
                            MyChatRoomListView myChatRoomListView = MyChatRoomListView.this;
                            C40308d.f108375a.mo62999k(1001, (long) i2, 1, 0, myChatRoomListView.f112596G1, myChatRoomListView.f112595F1, F4.appid, F4.chatroom_name, jSONObject.toString());
                        } else if (itemViewType == 4) {
                            MyChatRoomListView myChatRoomListView2 = MyChatRoomListView.this;
                            C40308d.f108375a.mo62999k(1002, (long) i2, 1, 0, myChatRoomListView2.f112596G1, myChatRoomListView2.f112595F1, F4.appid, F4.chatroom_name, jSONObject.toString());
                        }
                    }
                }
                MyChatRoomListView myChatRoomListView3 = MyChatRoomListView.this;
                ((C41811n.C41813b) zVar2).mo65603y((C45219a) ((CopyOnWriteArrayList) this.f112611d).get(i3), myChatRoomListView3.f112594E1, i2, myChatRoomListView3.f112596G1, myChatRoomListView3.f112595F1, myChatRoomListView3.f112597H1);
                if (zVar2 instanceof C41811n.C41816d) {
                    C45222d dVar = ((C45219a) ((CopyOnWriteArrayList) this.f112611d).get(i3)).f122543f;
                    ((C41811n.C41816d) zVar2).mo65605z(dVar.f122553b, dVar.f122554c);
                    zVar2.f44854d.setOnClickListener(new C41785a(i3, zVar2, dVar));
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C16631z zVar;
            if (i != 1) {
                if (i == 2) {
                    zVar = new C41811n.C41814c(LayoutInflater.from(MyChatRoomListView.this.f112592C1).inflate(C0966R.C0971layout.bjp, viewGroup, false));
                } else if (i != 3) {
                    if (i != 5) {
                        return null;
                    }
                    zVar = new C41811n.C41816d(LayoutInflater.from(MyChatRoomListView.this.f112592C1).inflate(C0966R.C0971layout.cpj, viewGroup, false));
                }
                return zVar;
            }
            zVar = new C41811n.C41824f(LayoutInflater.from(MyChatRoomListView.this.f112592C1).inflate(C0966R.C0971layout.f6803oz, viewGroup, false));
            return zVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView$d */
    public interface C41786d {
        /* renamed from: a */
        void mo65573a();

        /* renamed from: b */
        void mo65574b();

        /* renamed from: c */
        void mo65575c(boolean z);

        /* renamed from: d */
        void mo65576d(String str);
    }

    public MyChatRoomListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C40008f fVar = C40008f.f107254d;
        this.f112601L1 = new IListener<GetChatRoomMsgEvent>(fVar) {
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
                    com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.MyChatRoomListView.this     // Catch:{ all -> 0x001d }
                    r2.f112598I1 = r0     // Catch:{ all -> 0x001d }
                    com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView$c r2 = r2.f112593D1     // Catch:{ all -> 0x001d }
                    java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> r0 = r0.my_chatroom_info_list     // Catch:{ all -> 0x001d }
                    r2.mo65571g5(r0)     // Catch:{ all -> 0x001d }
                    monitor-exit(r1)
                    r2 = 0
                    return r2
                L_0x001d:
                    r2 = move-exception
                    monitor-exit(r1)
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.MyChatRoomListView.C417781.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f112602M1 = new IListener<ChatRoomJoinOrQuitEvent>(fVar) {
            {
                this.__eventId = 841969243;
            }

            public boolean callback(IEvent iEvent) {
                ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent = (ChatRoomJoinOrQuitEvent) iEvent;
                int i = chatRoomJoinOrQuitEvent.f107400d.f107401a;
                if (i == 1) {
                    MyChatRoomListView.this.getClass();
                    return false;
                } else if (i != 2) {
                    return false;
                } else {
                    ((C119157j) C119157j.f356862d).mo183895z(new C41840t0(this, chatRoomJoinOrQuitEvent));
                    return false;
                }
            }
        };
        this.f112603N1 = new IListener<ShowMultiTaskEvent>(fVar) {
            {
                this.__eventId = -722797207;
            }

            public boolean callback(IEvent iEvent) {
                ShowMultiTaskEvent showMultiTaskEvent = (ShowMultiTaskEvent) iEvent;
                C119179t tVar = C119157j.f356862d;
                C41841u0 u0Var = new C41841u0(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(u0Var, 1000, false);
                return false;
            }
        };
        this.f112604O1 = new C41781a();
        mo65563B1(context);
    }

    /* renamed from: B1 */
    public final void mo65563B1(Context context) {
        this.f112592C1 = context;
        Activity activity = (Activity) context;
        this.f112595F1 = activity.getIntent().getLongExtra("game_report_sourceid", 0);
        this.f112596G1 = activity.getIntent().getLongExtra("game_report_ssid", 0);
        this.f112599J1 = activity.getIntent().getBooleanExtra("game_from_chatroom_detail", false);
        this.f112600K1 = !C87412m.m108589b(((C52735e) C86312j.m106911c(C52735e.class)).C50(C32735h.C32737c.clicfg_game_center_exp_group_list_fold_android, "0"), "0");
        if (this.f112599J1) {
            mo65565D1();
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.mo16974W(1);
        setLayoutManager(linearLayoutManager);
        setItemAnimator(new C69011u());
        C41784c cVar = new C41784c(this.f112600K1);
        this.f112593D1 = cVar;
        setAdapter(cVar);
        mo17043c(new C41783b());
    }

    /* renamed from: C1 */
    public final void mo65564C1(int i) {
        C40308d.f108375a.mo62999k(1004, 0, 1, (long) i, this.f112596G1, this.f112595F1, "", "", "");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_FIRST_ENTER_INT, 1);
    }

    /* renamed from: D1 */
    public final void mo65565D1() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_MULTI_TASK_EDU_INT;
        int nullAsNil = Util.nullAsNil((Integer) i.mo119685f(aVar, 0));
        Activity activity = (Activity) this.f112592C1;
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
            C53601h.m60129h(this.f112592C1, jumpInfo);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f112602M1.alive();
        this.f112601L1.alive();
        this.f112603N1.alive();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this.f112604O1);
        this.f112602M1.dead();
        this.f112601L1.dead();
        this.f112603N1.dead();
        C41811n.m45332a();
        if (this.f112598I1 != null) {
            GamePBCacheEvent gamePBCacheEvent = new GamePBCacheEvent();
            GamePBCacheEvent.C40109a aVar = gamePBCacheEvent.f107561d;
            aVar.f107562a = 2;
            aVar.f107563b = "cache_my_chatroom";
            try {
                aVar.f107564c = this.f112598I1.toByteArray();
            } catch (IOException unused) {
            }
            gamePBCacheEvent.publish();
        }
    }

    public void setMyChatroomListener(C41786d dVar) {
    }

    public MyChatRoomListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C40008f fVar = C40008f.f107254d;
        this.f112601L1 = new IListener<GetChatRoomMsgEvent>(fVar) {
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
                    com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView r2 = com.tencent.p014mm.plugin.game.chatroom.view.MyChatRoomListView.this     // Catch:{ all -> 0x001d }
                    r2.f112598I1 = r0     // Catch:{ all -> 0x001d }
                    com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView$c r2 = r2.f112593D1     // Catch:{ all -> 0x001d }
                    java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> r0 = r0.my_chatroom_info_list     // Catch:{ all -> 0x001d }
                    r2.mo65571g5(r0)     // Catch:{ all -> 0x001d }
                    monitor-exit(r1)
                    r2 = 0
                    return r2
                L_0x001d:
                    r2 = move-exception
                    monitor-exit(r1)
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.MyChatRoomListView.C417781.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f112602M1 = new IListener<ChatRoomJoinOrQuitEvent>(fVar) {
            {
                this.__eventId = 841969243;
            }

            public boolean callback(IEvent iEvent) {
                ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent = (ChatRoomJoinOrQuitEvent) iEvent;
                int i = chatRoomJoinOrQuitEvent.f107400d.f107401a;
                if (i == 1) {
                    MyChatRoomListView.this.getClass();
                    return false;
                } else if (i != 2) {
                    return false;
                } else {
                    ((C119157j) C119157j.f356862d).mo183895z(new C41840t0(this, chatRoomJoinOrQuitEvent));
                    return false;
                }
            }
        };
        this.f112603N1 = new IListener<ShowMultiTaskEvent>(fVar) {
            {
                this.__eventId = -722797207;
            }

            public boolean callback(IEvent iEvent) {
                ShowMultiTaskEvent showMultiTaskEvent = (ShowMultiTaskEvent) iEvent;
                C119179t tVar = C119157j.f356862d;
                C41841u0 u0Var = new C41841u0(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(u0Var, 1000, false);
                return false;
            }
        };
        this.f112604O1 = new C41781a();
        mo65563B1(context);
    }
}
