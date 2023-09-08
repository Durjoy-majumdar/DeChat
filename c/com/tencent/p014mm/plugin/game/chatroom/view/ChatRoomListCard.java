package com.tencent.p014mm.plugin.game.chatroom.view;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.AbstractInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgText;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomRecInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import uy1.C52645f;
import yw1.C53591c;
import yw1.C53601h;
import zw1.C16408b;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard */
public class ChatRoomListCard extends MRecyclerView {

    /* renamed from: G1 */
    public static int f112376G1;

    /* renamed from: C1 */
    public Context f112377C1;

    /* renamed from: D1 */
    public long f112378D1;

    /* renamed from: E1 */
    public long f112379E1;

    /* renamed from: F1 */
    public C41744a f112380F1;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard$a */
    public class C41744a extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public List<MyChatroomInfo> f112381d = new LinkedList();

        /* renamed from: e */
        public List<String> f112382e = new ArrayList();

        public C41744a() {
        }

        public int getItemCount() {
            return ((LinkedList) this.f112381d).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            Integer num;
            int i2;
            ChatroomData chatroomData;
            ChatroomData chatroomData2;
            ChatroomMsgPack chatroomMsgPack;
            ChatroomMsgText chatroomMsgText;
            int i3 = i;
            if (zVar != null && i3 < ((LinkedList) this.f112381d).size()) {
                C41745b bVar = (C41745b) zVar;
                MyChatroomInfo myChatroomInfo = (MyChatroomInfo) ((LinkedList) this.f112381d).get(i3);
                bVar.f112387D = i3;
                bVar.f112388E = myChatroomInfo;
                if (myChatroomInfo.unread_msg_count > 0) {
                    View view = bVar.f112385B;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomListCard$RoomCardVH", "onBindData", "(ILcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomInfo;)Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomData;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomListCard$RoomCardVH", "onBindData", "(ILcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomInfo;)Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomData;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view3 = bVar.f112385B;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomListCard$RoomCardVH", "onBindData", "(ILcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomInfo;)Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomData;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomListCard$RoomCardVH", "onBindData", "(ILcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomInfo;)Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomData;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                StringBuilder sb = new StringBuilder();
                AbstractInfo abstractInfo = bVar.f112388E.abstract_info;
                ChatroomData chatroomData3 = null;
                if (abstractInfo == null || Util.isNullOrNil(abstractInfo.abstract_desc)) {
                    num = null;
                    i2 = 0;
                } else {
                    sb.append(bVar.f112388E.abstract_info.abstract_desc);
                    sb.append(" ");
                    i2 = sb.length();
                    if (bVar.f112388E.abstract_info.word_color != null) {
                        num = C53601h.m60134m(C85875k4.m106211z() ? bVar.f112388E.abstract_info.word_color.dark_color : bVar.f112388E.abstract_info.word_color.light_color);
                    } else {
                        num = null;
                    }
                }
                if (!Util.isNullOrNil(bVar.f112388E.last_msg_desc)) {
                    sb.append(bVar.f112388E.last_msg_desc);
                } else {
                    ChatroomRecInfo chatroomRecInfo = bVar.f112388E.chatroom_info;
                    if (chatroomRecInfo != null && (chatroomMsgPack = chatroomRecInfo.last_chatroom_msg) != null) {
                        MsgContent msgContent = chatroomMsgPack.msg_content;
                        sb.append((msgContent == null || (chatroomMsgText = msgContent.chatroom_text) == null) ? "" : chatroomMsgText.content);
                    } else if (!(chatroomRecInfo == null || (chatroomData2 = chatroomRecInfo.chatroom_data) == null)) {
                        sb.append(chatroomData2.announcement);
                    }
                }
                if (num == null) {
                    num = Integer.valueOf(ChatRoomListCard.this.f112377C1.getResources().getColor(C0966R.color.a_1));
                }
                SpannableString spannableString = new SpannableString(sb);
                spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, i2, 33);
                bVar.f112386C.setText(spannableString);
                ChatroomRecInfo chatroomRecInfo2 = bVar.f112388E.chatroom_info;
                if (!(chatroomRecInfo2 == null || (chatroomData = chatroomRecInfo2.chatroom_data) == null)) {
                    bVar.f112390z.setText(chatroomData.room_name);
                    C52645f.m59023a().mo73595e(bVar.f112384A, bVar.f112388E.chatroom_info.chatroom_data.chatroom_icon, (C52645f.C52650d) null, (C52645f.C52652e) null);
                    chatroomData3 = bVar.f112388E.chatroom_info.chatroom_data;
                }
                if (chatroomData3 != null) {
                    if (!((ArrayList) this.f112382e).contains(chatroomData3.chatroom_name)) {
                        ((ArrayList) this.f112382e).add(chatroomData3.chatroom_name);
                        C40308d.C40309a aVar3 = C40308d.f108375a;
                        long j = (long) (i3 + 1);
                        ChatRoomListCard chatRoomListCard = ChatRoomListCard.this;
                        aVar3.mo63006r(j, 1, 0, chatRoomListCard.f112379E1, chatRoomListCard.f112378D1);
                    }
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            ChatRoomListCard chatRoomListCard = ChatRoomListCard.this;
            return new C41745b(LayoutInflater.from(chatRoomListCard.f112377C1).inflate(C0966R.C0971layout.f6801ox, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard$b */
    public class C41745b extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f112384A;

        /* renamed from: B */
        public View f112385B;

        /* renamed from: C */
        public TextView f112386C;

        /* renamed from: D */
        public int f112387D;

        /* renamed from: E */
        public MyChatroomInfo f112388E;

        /* renamed from: z */
        public TextView f112390z;

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard$b$a */
        public class C41746a implements View.OnClickListener {
            public C41746a(ChatRoomListCard chatRoomListCard) {
            }

            public void onClick(View view) {
                ChatroomRecInfo chatroomRecInfo;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomListCard$RoomCardVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C40308d.C40309a aVar = C40308d.f108375a;
                C41745b bVar = C41745b.this;
                ChatRoomListCard chatRoomListCard = ChatRoomListCard.this;
                aVar.mo63006r((long) (bVar.f112387D + 1), 2, 0, chatRoomListCard.f112379E1, chatRoomListCard.f112378D1);
                MyChatroomInfo myChatroomInfo = C41745b.this.f112388E;
                if (!(myChatroomInfo == null || (chatroomRecInfo = myChatroomInfo.chatroom_info) == null || chatroomRecInfo.chatroom_data == null)) {
                    C53591c.f150600b = false;
                    Bundle bundle = new Bundle();
                    bundle.putString("chat_room_title", C41745b.this.f112388E.chatroom_info.chatroom_data.room_name);
                    ChatroomData chatroomData = C41745b.this.f112388E.chatroom_info.chatroom_data;
                    ((C16408b) C86312j.m106911c(C16408b.class)).W70(ChatRoomListCard.this.f112377C1, new C16408b.C16409a(chatroomData.chatroom_name, chatroomData.chatroom_icon, 9999, 0, false, bundle), (Lbs) null, (ActivityOptions) null, true);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomListCard$RoomCardVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C41745b(View view) {
            super(view);
            this.f112390z = (TextView) view.findViewById(C0966R.C0970id.b0i);
            this.f112384A = (ImageView) view.findViewById(C0966R.C0970id.b0f);
            this.f112385B = view.findViewById(C0966R.C0970id.l0c);
            this.f112386C = (TextView) view.findViewById(C0966R.C0970id.b0c);
            view.setOnClickListener(new C41746a(ChatRoomListCard.this));
        }
    }

    public ChatRoomListCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo65463B1(context);
    }

    /* renamed from: B1 */
    public final void mo65463B1(Context context) {
        Context context2 = context;
        this.f112377C1 = context2;
        this.f112378D1 = ((Activity) context2).getIntent().getLongExtra("game_report_sourceid", 0);
        long longExtra = ((Activity) this.f112377C1).getIntent().getLongExtra("game_report_ssid", 0);
        this.f112379E1 = longExtra;
        C40308d.f108375a.mo63006r(0, 1, 0, longExtra, this.f112378D1);
        f112376G1 = C76577a.m92151b(context2, 400);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2);
        linearLayoutManager.mo16974W(1);
        setLayoutManager(linearLayoutManager);
        setItemAnimator((RecyclerView.C16616j) null);
        C41744a aVar = new C41744a();
        this.f112380F1 = aVar;
        setAdapter(aVar);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105924i("MicroMsg.ChatRoomListCard", "onAttachedToWindow");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105924i("MicroMsg.ChatRoomListCard", "onDetachedFromWindow");
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = f112376G1;
        if (i3 <= size && i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Float.valueOf((float) i3).intValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setData(List<MyChatroomInfo> list) {
        C41744a aVar = this.f112380F1;
        if (aVar == null) {
            return;
        }
        if (list != null) {
            ((LinkedList) aVar.f112381d).clear();
            ((LinkedList) aVar.f112381d).addAll(list);
            aVar.notifyDataSetChanged();
            return;
        }
        aVar.getClass();
    }

    public ChatRoomListCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo65463B1(context);
    }
}
