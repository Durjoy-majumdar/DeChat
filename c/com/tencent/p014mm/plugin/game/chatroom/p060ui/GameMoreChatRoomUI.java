package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bx1.C39853h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChatRoomJoinOrQuitEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BanAction;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomRecInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.plugin.game.chatroom.view.C41811n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cx1.C45219a;
import cx1.C45222d;
import f40.C86709a0;
import gy3.C8480h;
import in3.C46279a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameMoreChatRoomUI */
public class GameMoreChatRoomUI extends ChatRoomBaseUI implements C11385n {

    /* renamed from: t */
    public static final /* synthetic */ int f112273t = 0;

    /* renamed from: g */
    public Context f112274g;

    /* renamed from: h */
    public LoadMoreRecyclerView f112275h;

    /* renamed from: i */
    public C41720c f112276i;

    /* renamed from: j */
    public String f112277j;

    /* renamed from: n */
    public Lbs f112278n;

    /* renamed from: o */
    public long f112279o;

    /* renamed from: p */
    public long f112280p;

    /* renamed from: q */
    public List<BanAction> f112281q = new LinkedList();

    /* renamed from: r */
    public boolean f112282r = false;

    /* renamed from: s */
    public IListener f112283s = new IListener<ChatRoomJoinOrQuitEvent>(C40008f.f107254d) {
        {
            this.__eventId = 841969243;
        }

        public boolean callback(IEvent iEvent) {
            ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent = (ChatRoomJoinOrQuitEvent) iEvent;
            int i = chatRoomJoinOrQuitEvent.f107400d.f107401a;
            ((C119157j) C119157j.f356862d).mo183895z(new C41724f(this, chatRoomJoinOrQuitEvent));
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameMoreChatRoomUI$a */
    public class C41718a implements MenuItem.OnMenuItemClickListener {
        public C41718a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameMoreChatRoomUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameMoreChatRoomUI$b */
    public class C41719b implements LoadMoreRecyclerView.C40579c {
        public C41719b() {
        }

        /* renamed from: a */
        public void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
            GameMoreChatRoomUI gameMoreChatRoomUI = GameMoreChatRoomUI.this;
            int i = GameMoreChatRoomUI.f112273t;
            gameMoreChatRoomUI.mo65438L7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameMoreChatRoomUI$c */
    public class C41720c extends RecyclerView.C16613e<C41811n.C41817e> {

        /* renamed from: d */
        public List<C45219a> f112287d = new LinkedList();

        /* renamed from: e */
        public List<String> f112288e = new ArrayList();

        /* renamed from: f */
        public boolean f112289f = false;

        public C41720c() {
        }

        public int getItemCount() {
            return ((LinkedList) this.f112287d).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C45219a aVar;
            ChatroomData b;
            int i2 = i;
            C41811n.C41817e eVar = (C41811n.C41817e) zVar;
            if (eVar != null) {
                if (i2 < ((LinkedList) this.f112287d).size() && i2 >= 0 && (aVar = (C45219a) ((LinkedList) this.f112287d).get(i2)) != null && (b = C41811n.m45333b(aVar)) != null) {
                    if (!((ArrayList) this.f112288e).contains(b.chatroom_name)) {
                        ((ArrayList) this.f112288e).add(b.chatroom_name);
                        GameMoreChatRoomUI gameMoreChatRoomUI = GameMoreChatRoomUI.this;
                        C40308d.f108375a.mo63002n(1102, (long) (i2 + 1), 1, 0, gameMoreChatRoomUI.f112279o, gameMoreChatRoomUI.f112280p, b.appid, b.chatroom_name, "");
                    }
                }
                GameMoreChatRoomUI gameMoreChatRoomUI2 = GameMoreChatRoomUI.this;
                eVar.mo65603y((C45219a) ((LinkedList) this.f112287d).get(i2), gameMoreChatRoomUI2.f112278n, i2 + 1, gameMoreChatRoomUI2.f112279o, gameMoreChatRoomUI2.f112280p, gameMoreChatRoomUI2.f112281q);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C41811n.C41817e(LayoutInflater.from(GameMoreChatRoomUI.this.f112274g).inflate(C0966R.C0971layout.bqc, viewGroup, false));
        }
    }

    /* renamed from: H7 */
    public long mo65401H7() {
        return 11;
    }

    /* renamed from: I7 */
    public long mo65402I7() {
        return this.f112280p;
    }

    /* renamed from: J7 */
    public long mo65403J7() {
        return this.f112279o;
    }

    /* renamed from: K7 */
    public long mo65404K7() {
        return 1199;
    }

    /* renamed from: L7 */
    public final synchronized void mo65438L7() {
        if (this.f112282r) {
            Log.m105924i("GameChatRoom.GameMoreChatRoomUI", "cgi is running");
            return;
        }
        this.f112282r = true;
        C86709a0.m107524d().mo123460f(new C39853h(this.f112277j, this.f112278n, 10));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.axg;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f112274g = this;
        this.f112280p = getIntent().getLongExtra("game_report_sourceid", 0);
        this.f112279o = getIntent().getLongExtra("game_report_ssid", 0);
        C46279a.m51577a(getContentView(), getResources().getColor(C0966R.color.al6), !C74933u4.m89770g(getResources().getColor(C0966R.color.al6)));
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setNavigationbarColor(getResources().getColor(C0966R.color.al6));
        setMMTitle((int) C0966R.string.cxi);
        setBackBtn(new C41718a());
        LoadMoreRecyclerView loadMoreRecyclerView = (LoadMoreRecyclerView) findViewById(C0966R.C0970id.b0h);
        this.f112275h = loadMoreRecyclerView;
        loadMoreRecyclerView.setOnLoadingStateChangedListener(new C41719b());
        C41720c cVar = new C41720c();
        this.f112276i = cVar;
        this.f112275h.setAdapter(cVar);
        this.f112275h.setItemAnimator((RecyclerView.C16616j) null);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("chat_room_lbs");
        if (byteArrayExtra != null) {
            Lbs lbs = new Lbs();
            this.f112278n = lbs;
            try {
                lbs.parseFrom(byteArrayExtra);
            } catch (IOException unused) {
            }
        }
        C86709a0.m107524d().mo123455a(5048, this);
        this.f112275h.setLoadingView((int) C0966R.C0971layout.bgm);
        this.f112275h.mo63430I(true);
        mo65438L7();
        C40308d.f108375a.mo63001m(0, 0, 1, 0, this.f112279o, this.f112280p, "", "", "");
        this.f112283s.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(5048, this);
        this.f112283s.dead();
        C41811n.m45332a();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        GetMoreChatroomResponse getMoreChatroomResponse;
        if (yVar.getType() == 5048) {
            this.f112282r = false;
            if (i == 0 && i2 == 0) {
                GetMoreChatroomResponse getMoreChatroomResponse2 = (GetMoreChatroomResponse) ((C39853h) yVar).f106881e.f127056b.f127083a;
                C41720c cVar = this.f112276i;
                LinkedList<ChatroomRecInfo> linkedList = getMoreChatroomResponse2.chatroom_info_list;
                LinkedList linkedList2 = new LinkedList();
                for (ChatroomRecInfo aVar : linkedList) {
                    linkedList2.add(new C45219a(4, aVar, true, (String) null, (JumpInfo) null, (C45222d) null, 56, (C8480h) null));
                }
                cVar.getClass();
                if (!Util.isNullOrNil((List) linkedList2)) {
                    if (!cVar.f112289f) {
                        cVar.f112289f = true;
                        C40308d.C40309a aVar2 = C40308d.f108375a;
                        GameMoreChatRoomUI gameMoreChatRoomUI = GameMoreChatRoomUI.this;
                        getMoreChatroomResponse = getMoreChatroomResponse2;
                        aVar2.mo63001m(1102, 0, 1, 0, gameMoreChatRoomUI.f112279o, gameMoreChatRoomUI.f112280p, "", "", "");
                    } else {
                        getMoreChatroomResponse = getMoreChatroomResponse2;
                    }
                    ((LinkedList) cVar.f112287d).addAll(linkedList2);
                    cVar.notifyDataSetChanged();
                } else {
                    getMoreChatroomResponse = getMoreChatroomResponse2;
                }
                GetMoreChatroomResponse getMoreChatroomResponse3 = getMoreChatroomResponse;
                this.f112277j = getMoreChatroomResponse3.chatroom_filter;
                if (!getMoreChatroomResponse3.has_next) {
                    this.f112275h.mo63430I(false);
                }
                ((LinkedList) this.f112281q).clear();
                LinkedList<BanAction> linkedList3 = getMoreChatroomResponse3.ban_action_list;
                if (linkedList3 != null) {
                    ((LinkedList) this.f112281q).addAll(linkedList3);
                }
            }
        }
    }
}
