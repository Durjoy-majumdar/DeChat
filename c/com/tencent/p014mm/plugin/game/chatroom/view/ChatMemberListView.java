package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax1.C39639c;
import ax1.C39645h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ChatRoomAtFunctionEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomUserData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Color;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.OnlineUser;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Slot;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TextInfo;
import com.tencent.p014mm.plugin.game.luggage.C41985r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import o40.C61937h;
import org.json.JSONException;
import org.json.JSONObject;
import tl3.C78039a;
import uy1.C52645f;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView */
public class ChatMemberListView extends MRecyclerView {

    /* renamed from: C1 */
    public Context f112326C1;

    /* renamed from: D1 */
    public long f112327D1;

    /* renamed from: E1 */
    public long f112328E1;

    /* renamed from: F1 */
    public C41737c f112329F1;

    /* renamed from: G1 */
    public C41835s f112330G1;

    /* renamed from: H1 */
    public Set<String> f112331H1 = new HashSet();

    /* renamed from: I1 */
    public Map<String, C41740d> f112332I1 = new HashMap();

    /* renamed from: J1 */
    public JumpInfo f112333J1;

    /* renamed from: K1 */
    public String f112334K1;

    /* renamed from: L1 */
    public JumpInfo f112335L1;

    /* renamed from: M1 */
    public Slot f112336M1 = new Slot();

    /* renamed from: N1 */
    public C39645h f112337N1;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView$b */
    public class C41736b extends C54248l.C54250b {

        /* renamed from: a */
        public List<Slot> f112338a;

        /* renamed from: b */
        public List<Slot> f112339b;

        public C41736b(ChatMemberListView chatMemberListView, List<Slot> list, List<Slot> list2) {
            this.f112338a = list;
            this.f112339b = list2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
            r2 = r9.online_user_status;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo11465a(int r8, int r9) {
            /*
                r7 = this;
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Slot> r0 = r7.f112338a
                java.lang.Object r8 = r0.get(r8)
                com.tencent.mm.plugin.game.autogen.chatroom.Slot r8 = (com.tencent.p014mm.plugin.game.autogen.chatroom.Slot) r8
                java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Slot> r0 = r7.f112339b
                java.lang.Object r9 = r0.get(r9)
                com.tencent.mm.plugin.game.autogen.chatroom.Slot r9 = (com.tencent.p014mm.plugin.game.autogen.chatroom.Slot) r9
                com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser r0 = r8.online_user_status
                r1 = 0
                if (r0 == 0) goto L_0x0039
                com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser r2 = r9.online_user_status
                if (r2 != 0) goto L_0x001a
                goto L_0x0039
            L_0x001a:
                int r8 = r8.slot_type
                int r3 = r9.slot_type
                if (r8 != r3) goto L_0x0039
                long r3 = r0.status
                long r5 = r2.status
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L_0x0039
                java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> r8 = r0.chat_user_data
                int r8 = r8.size()
                com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser r9 = r9.online_user_status
                java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> r9 = r9.chat_user_data
                int r9 = r9.size()
                if (r8 != r9) goto L_0x0039
                r1 = 1
            L_0x0039:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.ChatMemberListView.C41736b.mo11465a(int, int):boolean");
        }

        /* renamed from: b */
        public boolean mo11466b(int i, int i2) {
            OnlineUser onlineUser;
            Slot slot = this.f112338a.get(i);
            Slot slot2 = this.f112339b.get(i2);
            OnlineUser onlineUser2 = slot.online_user_status;
            if (onlineUser2 != null && !Util.isNullOrNil((List) onlineUser2.chat_user_data) && (onlineUser = slot2.online_user_status) != null && !Util.isNullOrNil((List) onlineUser.chat_user_data)) {
                Util.nullAsNil(slot.online_user_status.chat_user_data.get(0).username).equals(slot2.online_user_status.chat_user_data.get(0).username);
            }
            return false;
        }

        /* renamed from: d */
        public int mo11468d() {
            return this.f112339b.size();
        }

        /* renamed from: e */
        public int mo11469e() {
            return this.f112338a.size();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView$c */
    public class C41737c extends RecyclerView.C16613e<C41738a> {

        /* renamed from: d */
        public List<Slot> f112340d = new LinkedList();

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView$c$a */
        public class C41738a extends RecyclerView.C16631z implements View.OnClickListener, View.OnLongClickListener {

            /* renamed from: A */
            public ImageView f112342A;

            /* renamed from: B */
            public TextView f112343B;

            /* renamed from: C */
            public ImageView f112344C;

            /* renamed from: D */
            public ViewGroup f112345D;

            /* renamed from: E */
            public View f112346E;

            /* renamed from: F */
            public TextView f112347F;

            /* renamed from: G */
            public ImageView f112348G;

            /* renamed from: H */
            public ImageView f112349H;

            /* renamed from: I */
            public ChatroomUserData f112350I;

            /* renamed from: J */
            public JumpInfo f112351J;

            /* renamed from: K */
            public int f112352K;

            /* renamed from: z */
            public ImageView f112354z;

            /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView$c$a$a */
            public class C41739a implements C41985r.C41989d {
                public C41739a() {
                }

                /* renamed from: a */
                public void mo65429a(boolean z, boolean z2) {
                    int i;
                    Log.m105925i("GameChatRoom.ChatMemberListView", "checkPreload,  hasPreload:[%b], result[%b]", Boolean.valueOf(z), Boolean.valueOf(z2));
                    if (z) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("user_name", C41738a.this.f112350I.username);
                            jSONObject.put("user_data", C61937h.m72709h(C41738a.this.f112350I).toString());
                            jSONObject.put("raw_url", C41738a.this.f112351J.jump_url);
                            jSONObject.put("source_id", 1302);
                            String str = ChatMemberListView.this.f112334K1;
                            if (str != null) {
                                jSONObject.put("premade_info", str);
                            }
                        } catch (JSONException unused) {
                        }
                        String encode = URLEncoder.encode(jSONObject.toString());
                        ChatMemberListView chatMemberListView = ChatMemberListView.this;
                        i = C53601h.m60130i(chatMemberListView.f112326C1, chatMemberListView.f112333J1, 12, encode);
                        Log.m105925i("GameChatRoom.ChatMemberListView", "use preload personal profile url: %s", ChatMemberListView.this.f112333J1.jump_url);
                    } else {
                        C41738a aVar = C41738a.this;
                        i = C53601h.m60129h(ChatMemberListView.this.f112326C1, aVar.f112351J);
                        JumpInfo jumpInfo = C41738a.this.f112351J;
                        if (jumpInfo != null) {
                            Log.m105925i("GameChatRoom.ChatMemberListView", "slot jump url: %s", jumpInfo.jump_url);
                        }
                    }
                    C41738a.this.mo65455y(i);
                }
            }

            public C41738a(View view) {
                super(view);
                this.f112354z = (ImageView) view.findViewById(C0966R.C0970id.goq);
                this.f112342A = (ImageView) view.findViewById(C0966R.C0970id.gor);
                this.f112343B = (TextView) view.findViewById(C0966R.C0970id.f5790op);
                this.f112344C = (ImageView) view.findViewById(C0966R.C0970id.f2a);
                this.f112343B.setOnClickListener(this);
                this.f112344C.setOnClickListener(this);
                this.f112344C.setOnLongClickListener(this);
                this.f112345D = (ViewGroup) view.findViewById(C0966R.C0970id.l2g);
                this.f112346E = view.findViewById(C0966R.C0970id.l2i);
                this.f112347F = (TextView) view.findViewById(C0966R.C0970id.l2h);
                this.f112348G = (ImageView) view.findViewById(C0966R.C0970id.l2f);
                this.f112349H = (ImageView) view.findViewById(C0966R.C0970id.fn6);
            }

            public synchronized void onClick(View view) {
                JumpInfo jumpInfo;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ChatroomUserData chatroomUserData = this.f112350I;
                if (chatroomUserData == null || !"all".equals(chatroomUserData.username) || C53601h.m60126e(this.f112350I.chatroom_name).f150604a) {
                    ChatroomUserData chatroomUserData2 = this.f112350I;
                    if (chatroomUserData2 != null && !C53601h.m60126e(chatroomUserData2.chatroom_name).f150604a) {
                        JumpInfo jumpInfo2 = this.f112351J;
                        if (jumpInfo2 == null || jumpInfo2.jump_type != 1 || (jumpInfo = ChatMemberListView.this.f112333J1) == null || Util.isNullOrNil(jumpInfo.jump_url) || !Util.nullAsNil(ChatMemberListView.this.f112333J1.preload_id).equals(this.f112351J.preload_id)) {
                            mo65455y(C53601h.m60129h(ChatMemberListView.this.f112326C1, this.f112351J));
                            JumpInfo jumpInfo3 = this.f112351J;
                            if (jumpInfo3 != null) {
                                Log.m105925i("GameChatRoom.ChatMemberListView", "slot jump url: %s", jumpInfo3.jump_url);
                            }
                        } else {
                            C41985r.m45633a(ChatMemberListView.this.f112333J1.jump_url, new C41739a());
                        }
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                ChatMemberListView chatMemberListView = ChatMemberListView.this;
                mo65455y(C53601h.m60129h(chatMemberListView.f112326C1, chatMemberListView.f112335L1));
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                ChatroomUserData chatroomUserData = this.f112350I;
                if (chatroomUserData != null && !"all".equals(chatroomUserData.username) && !C53601h.m60126e(this.f112350I.chatroom_name).f150604a && !C53601h.m60126e(this.f112350I.chatroom_name).f150605b) {
                    ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = new ChatRoomAtFunctionEvent();
                    ChatRoomAtFunctionEvent.C40049a aVar = chatRoomAtFunctionEvent.f107397d;
                    ChatroomUserData chatroomUserData2 = this.f112350I;
                    aVar.f107398a = chatroomUserData2.username;
                    aVar.f107399b = chatroomUserData2.nickname;
                    chatRoomAtFunctionEvent.publish();
                    C40308d.C40309a aVar2 = C40308d.f108375a;
                    long j = (long) (this.f112352K + 1);
                    ChatMemberListView chatMemberListView = ChatMemberListView.this;
                    aVar2.mo63000l(j, 27, chatMemberListView.f112328E1, chatMemberListView.f112327D1, this.f112350I.username);
                }
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }

            /* renamed from: y */
            public final void mo65455y(int i) {
                long j;
                if (i == 1) {
                    j = 6;
                } else if (i == 2) {
                    j = 7;
                } else if (i == 3) {
                    j = 28;
                } else {
                    return;
                }
                long j2 = j;
                ChatroomUserData chatroomUserData = this.f112350I;
                if (chatroomUserData != null) {
                    ChatMemberListView chatMemberListView = ChatMemberListView.this;
                    C40308d.f108375a.mo63000l((long) (this.f112352K + 1), j2, chatMemberListView.f112328E1, chatMemberListView.f112327D1, chatroomUserData.username);
                }
            }

            /* renamed from: z */
            public final void mo65456z(Color color) {
                Integer m;
                GradientDrawable gradientDrawable;
                if (color != null && (m = C53601h.m60134m(Util.nullAsNil(color.dark_color))) != null && (gradientDrawable = (GradientDrawable) this.f112346E.getBackground()) != null) {
                    gradientDrawable.setColor(m.intValue());
                }
            }
        }

        public C41737c(C41735a aVar) {
        }

        public int getItemCount() {
            return ((LinkedList) this.f112340d).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C41738a aVar = (C41738a) zVar;
            Slot slot = (Slot) ((LinkedList) this.f112340d).get(i2);
            aVar.f112352K = i2;
            OnlineUser onlineUser = slot.online_user_status;
            if (onlineUser != null) {
                LinkedList<ChatroomUserData> linkedList = onlineUser.chat_user_data;
                if (!Util.isNullOrNil((List) linkedList)) {
                    aVar.f112351J = slot.jump_info;
                    aVar.f112354z.setVisibility(8);
                    aVar.f112342A.setVisibility(8);
                    boolean z = false;
                    if (linkedList.size() == 2) {
                        aVar.f112342A.setVisibility(0);
                    } else if (linkedList.size() > 2) {
                        aVar.f112354z.setVisibility(0);
                        aVar.f112342A.setVisibility(0);
                    }
                    ChatroomUserData chatroomUserData = linkedList.get(0);
                    aVar.f112350I = chatroomUserData;
                    if ("all".equals(chatroomUserData.username)) {
                        aVar.f112343B.setContentDescription(ChatMemberListView.this.f112326C1.getString(C0966R.string.f7552jf));
                        aVar.f112343B.setVisibility(0);
                        aVar.f112344C.setVisibility(8);
                        View view = aVar.f112346E;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Slot;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Slot;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    aVar.f112344C.setContentDescription(aVar.f112350I.nickname);
                    aVar.f112343B.setVisibility(8);
                    aVar.f112344C.setVisibility(0);
                    if (!((HashSet) ChatMemberListView.this.f112331H1).contains(aVar.f112350I.username)) {
                        ((C39639c) C86312j.m106911c(C39639c.class)).mo62192LM(aVar.f112350I);
                        ((HashSet) ChatMemberListView.this.f112331H1).add(aVar.f112350I.username);
                    }
                    C78039a.m94189a(aVar.f112344C, aVar.f112350I.username);
                    if (!Util.isNullOrNil(onlineUser.left_icon)) {
                        aVar.f112349H.setVisibility(0);
                        C52645f.m59023a().mo73595e(aVar.f112349H, onlineUser.left_icon, (C52645f.C52650d) null, (C52645f.C52652e) null);
                    } else {
                        aVar.f112349H.setVisibility(8);
                    }
                    C41740d dVar = new C41740d(ChatMemberListView.this, (C41735a) null);
                    dVar.f112357b = onlineUser.status;
                    TextInfo textInfo = onlineUser.text_desc;
                    if (textInfo != null && !Util.isNullOrNil(textInfo.desc)) {
                        View view3 = aVar.f112346E;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Slot;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Slot;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        aVar.f112347F.setVisibility(0);
                        aVar.f112348G.setVisibility(8);
                        aVar.mo65456z(onlineUser.text_desc.text_color);
                        aVar.f112347F.setText(onlineUser.text_desc.desc);
                    } else if (!Util.isNullOrNil(onlineUser.status_desc)) {
                        View view5 = aVar.f112346E;
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar4.mo10233c(0);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Slot;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Slot;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        aVar.f112347F.setVisibility(0);
                        aVar.f112348G.setVisibility(0);
                        C41737c cVar = C41737c.this;
                        ImageView imageView = aVar.f112348G;
                        String str = onlineUser.status_icon;
                        cVar.getClass();
                        C52645f.C52650d.C52651a aVar5 = new C52645f.C52650d.C52651a();
                        aVar5.f147020a = true;
                        C52645f.m59023a().mo73595e(imageView, str, aVar5.mo73598a(), (C52645f.C52652e) null);
                        aVar.mo65456z(onlineUser.icon_color);
                        aVar.f112347F.setText(onlineUser.status_desc);
                    } else {
                        View view7 = aVar.f112346E;
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar6.mo10233c(8);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Slot;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Slot;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        dVar.f112356a = 0;
                    }
                    int measureText = ((int) aVar.f112347F.getPaint().measureText(aVar.f112347F.getText().toString())) + aVar.f112347F.getPaddingLeft() + aVar.f112347F.getPaddingRight();
                    C41740d dVar2 = (C41740d) ((HashMap) ChatMemberListView.this.f112332I1).get(aVar.f112350I.username);
                    if (dVar2 == null || dVar2.f112357b != onlineUser.status) {
                        if (aVar.f112347F.getTag() instanceof C41741e) {
                            C41741e eVar = (C41741e) aVar.f112347F.getTag();
                            Runnable runnable = eVar.f112359b;
                            if (runnable != null) {
                                aVar.f112347F.removeCallbacks(runnable);
                            }
                            ValueAnimator valueAnimator = eVar.f112360c;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                        }
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aVar.f112347F.getLayoutParams();
                        layoutParams.width = measureText;
                        Log.m105919d("GameChatRoom.ChatMemberListView", "userStateTips width:%d", Integer.valueOf(measureText));
                        aVar.f112347F.setLayoutParams(layoutParams);
                    }
                    if (aVar.f112346E.getVisibility() != 8 && onlineUser.need_fold) {
                        if (dVar2 == null || dVar2.f112357b != onlineUser.status || dVar2.f112356a == 0) {
                            z = true;
                        }
                        if (z) {
                            dVar.f112356a = 1;
                            if (aVar.f112347F.getTag() instanceof C41741e) {
                                C41741e eVar2 = (C41741e) aVar.f112347F.getTag();
                                Runnable runnable2 = eVar2.f112359b;
                                if (runnable2 != null) {
                                    aVar.f112347F.removeCallbacks(runnable2);
                                }
                                ValueAnimator valueAnimator2 = eVar2.f112360c;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                            }
                            C41801i iVar = new C41801i(aVar);
                            C41741e eVar3 = new C41741e(ChatMemberListView.this, (C41735a) null);
                            eVar3.f112358a = aVar.f112350I.username;
                            eVar3.f112359b = iVar;
                            aVar.f112347F.setTag(eVar3);
                            aVar.f112347F.postDelayed(iVar, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        } else {
                            if (dVar2 != null) {
                                dVar.f112356a = dVar2.f112356a;
                            }
                            if (dVar2 != null && dVar2.f112356a == 2) {
                                aVar.f112347F.setVisibility(8);
                            }
                        }
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) aVar.f112345D.getLayoutParams();
                        layoutParams2.removeRule(14);
                        layoutParams2.addRule(9);
                        aVar.f112345D.setLayoutParams(layoutParams2);
                    } else if (aVar.f112346E.getVisibility() != 8 && !onlineUser.need_fold) {
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) aVar.f112347F.getLayoutParams();
                        layoutParams3.width = measureText;
                        Log.m105919d("GameChatRoom.ChatMemberListView", "userStateTips width:%d", Integer.valueOf(measureText));
                        aVar.f112347F.setLayoutParams(layoutParams3);
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) aVar.f112345D.getLayoutParams();
                        layoutParams4.removeRule(9);
                        layoutParams4.addRule(14);
                        aVar.f112345D.setLayoutParams(layoutParams4);
                    }
                    if (onlineUser.status == 0) {
                        aVar.f112344C.setAlpha(0.5f);
                    } else {
                        aVar.f112344C.setAlpha(1.0f);
                    }
                    ((HashMap) ChatMemberListView.this.f112332I1).put(aVar.f112350I.username, dVar);
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C41738a(LayoutInflater.from(ChatMemberListView.this.f112326C1).inflate(C0966R.C0971layout.awh, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView$d */
    public class C41740d {

        /* renamed from: a */
        public int f112356a = 0;

        /* renamed from: b */
        public long f112357b;

        public C41740d(ChatMemberListView chatMemberListView, C41735a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView$e */
    public class C41741e {

        /* renamed from: a */
        public String f112358a;

        /* renamed from: b */
        public Runnable f112359b;

        /* renamed from: c */
        public ValueAnimator f112360c;

        public C41741e(ChatMemberListView chatMemberListView, C41735a aVar) {
        }
    }

    public ChatMemberListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo65449B1(context);
    }

    /* renamed from: B1 */
    public final void mo65449B1(Context context) {
        this.f112326C1 = context;
        Activity activity = (Activity) context;
        this.f112327D1 = activity.getIntent().getLongExtra("game_report_sourceid", 0);
        this.f112328E1 = activity.getIntent().getLongExtra("game_report_ssid", 0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.mo16974W(0);
        setLayoutManager(linearLayoutManager);
        C41835s sVar = new C41835s(1);
        this.f112330G1 = sVar;
        sVar.f112760d = this.f112326C1;
        sVar.f112761e = this;
        sVar.f112767n = 5;
        mo17098m1(sVar);
        sVar.f112761e.mo17043c(sVar);
        sVar.f112771r = (LinearLayoutManager) sVar.f112761e.getLayoutManager();
        sVar.f112764h = new C41831q(sVar, sVar.f112761e.getContext());
        sVar.f112765i = new C41833r(sVar, sVar.f112761e.getContext());
        setItemViewCacheSize(15);
        C41737c cVar = new C41737c((C41735a) null);
        this.f112329F1 = cVar;
        setAdapter(cVar);
    }

    /* renamed from: K0 */
    public boolean mo17025K0(int i, int i2) {
        C41835s sVar = this.f112330G1;
        int a = sVar.mo65619a(sVar.f112762f + i);
        RecyclerView recyclerView = sVar.f112761e;
        if (recyclerView != null && sVar.f112776w) {
            sVar.f112765i.f44872a = a;
            sVar.f112777x = true;
            recyclerView.getLayoutManager().startSmoothScroll(sVar.f112765i);
        }
        return super.mo17025K0(i, i2);
    }

    public void setChatRoomName(String str) {
        if (this.f112336M1 == null) {
            this.f112336M1 = new Slot();
        }
        this.f112336M1.slot_type = 1;
        OnlineUser onlineUser = new OnlineUser();
        onlineUser.status = 1;
        LinkedList linkedList = new LinkedList();
        ChatroomUserData chatroomUserData = new ChatroomUserData();
        chatroomUserData.username = "all";
        chatroomUserData.chatroom_name = str;
        linkedList.add(chatroomUserData);
        onlineUser.chat_user_data.addAll(linkedList);
        this.f112336M1.online_user_status = onlineUser;
    }

    public void setPremadeCardInfo(String str) {
        this.f112334K1 = str;
    }

    public void setStateChangeListener(C39645h hVar) {
        this.f112337N1 = hVar;
    }

    public ChatMemberListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo65449B1(context);
    }
}
