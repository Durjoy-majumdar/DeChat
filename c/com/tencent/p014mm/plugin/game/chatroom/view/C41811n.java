package com.tencent.p014mm.plugin.game.chatroom.view;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.AbstractInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BanAction;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgText;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomRecInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomTag;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChattingInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.RestrictRule;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ShowIcon;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import cx1.C45219a;
import de3.C107029o;
import de3.C75355a0;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76901s0;
import org.json.JSONObject;
import pe3.C47465a;
import qo3.C47877k0;
import sw1.C48478n;
import uy1.C52645f;
import yw1.C53601h;
import zw1.C16408b;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.n */
public class C41811n {

    /* renamed from: a */
    public static C76901s0 f112667a;

    /* renamed from: b */
    public static MTimerHandler f112668b = new MTimerHandler(new C41812a(), false);

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$a */
    public class C41812a implements MTimerHandler.CallBack {
        public boolean onTimerExpired() {
            C41811n.m45332a();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$b */
    public static abstract class C41813b extends RecyclerView.C16631z {

        /* renamed from: z */
        public Context f112669z;

        public C41813b(View view) {
            super(view);
            this.f112669z = view.getContext();
        }

        /* renamed from: y */
        public abstract void mo65603y(C45219a aVar, Lbs lbs, int i, long j, long j2, List<BanAction> list);
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$c */
    public static class C41814c extends C41813b {

        /* renamed from: A */
        public TextView f112670A;

        /* renamed from: B */
        public ImageView f112671B;

        /* renamed from: C */
        public View f112672C;

        /* renamed from: D */
        public View f112673D;

        /* renamed from: E */
        public TextView f112674E;

        /* renamed from: F */
        public ImageView f112675F;

        /* renamed from: G */
        public TextView f112676G;

        /* renamed from: H */
        public MyChatroomInfo f112677H;

        /* renamed from: I */
        public ChatroomData f112678I;

        /* renamed from: J */
        public Lbs f112679J;

        /* renamed from: K */
        public int f112680K;

        /* renamed from: L */
        public long f112681L;

        /* renamed from: M */
        public long f112682M;

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$c$a */
        public class C41815a implements View.OnClickListener {
            public C41815a() {
            }

            public void onClick(View view) {
                ChatroomRecInfo chatroomRecInfo;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                MyChatroomInfo myChatroomInfo = C41814c.this.f112677H;
                if (!(myChatroomInfo == null || (chatroomRecInfo = myChatroomInfo.chatroom_info) == null || chatroomRecInfo.chatroom_data == null)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("reportStr", C41814c.this.f112677H.chatroom_info.chatroom_data.report_str);
                    } catch (Exception unused) {
                    }
                    C41814c cVar = C41814c.this;
                    int c = C41811n.m45334c(cVar.f112669z, 3, cVar.f112677H.chatroom_info.chatroom_data, cVar.f112679J, cVar.f112671B, (List<BanAction>) null, 0, 1001);
                    C41814c cVar2 = C41814c.this;
                    ChatroomData chatroomData = cVar2.f112678I;
                    String str = "";
                    String str2 = chatroomData == null ? str : chatroomData.appid;
                    if (chatroomData != null) {
                        str = chatroomData.chatroom_name;
                    }
                    String str3 = str;
                    if (c == 1) {
                        C40308d.f108375a.mo62999k(1001, (long) cVar2.f112680K, 6, 0, cVar2.f112681L, cVar2.f112682M, str2, str3, jSONObject.toString());
                    } else if (c == 2) {
                        C40308d.f108375a.mo62999k(1001, (long) cVar2.f112680K, 7, 0, cVar2.f112681L, cVar2.f112682M, str2, str3, jSONObject.toString());
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C41814c(View view) {
            super(view);
            this.f112670A = (TextView) view.findViewById(C0966R.C0970id.b0i);
            this.f112671B = (ImageView) view.findViewById(C0966R.C0970id.b0f);
            this.f112672C = view.findViewById(C0966R.C0970id.krh);
            this.f112673D = view.findViewById(C0966R.C0970id.l0c);
            this.f112674E = (TextView) view.findViewById(C0966R.C0970id.b0c);
            this.f112675F = (ImageView) view.findViewById(C0966R.C0970id.b0k);
            this.f112676G = (TextView) view.findViewById(C0966R.C0970id.b0l);
            view.setOnClickListener(new C41815a());
        }

        /* renamed from: y */
        public void mo65603y(C45219a aVar, Lbs lbs, int i, long j, long j2, List<BanAction> list) {
            Integer num;
            int i2;
            ChattingInfo chattingInfo;
            ChatroomData chatroomData;
            ChatroomData chatroomData2;
            ChatroomMsgPack chatroomMsgPack;
            MsgContent msgContent;
            ChatroomMsgText chatroomMsgText;
            C47465a aVar2 = aVar.f122539b;
            if (aVar2 instanceof MyChatroomInfo) {
                MyChatroomInfo myChatroomInfo = (MyChatroomInfo) aVar2;
                this.f112677H = myChatroomInfo;
                this.f112679J = lbs;
                this.f112680K = i;
                this.f112681L = j;
                this.f112682M = j2;
                if (myChatroomInfo.unread_msg_count > 0) {
                    View view = this.f112673D;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view3 = this.f112673D;
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                StringBuilder sb = new StringBuilder();
                AbstractInfo abstractInfo = this.f112677H.abstract_info;
                if (abstractInfo == null || Util.isNullOrNil(abstractInfo.abstract_desc)) {
                    num = null;
                    i2 = 0;
                } else {
                    sb.append(this.f112677H.abstract_info.abstract_desc);
                    sb.append(" ");
                    i2 = sb.length();
                    if (this.f112677H.abstract_info.word_color != null) {
                        num = C53601h.m60134m(C85875k4.m106211z() ? this.f112677H.abstract_info.word_color.dark_color : this.f112677H.abstract_info.word_color.light_color);
                    } else {
                        num = null;
                    }
                }
                if (!Util.isNullOrNil(this.f112677H.last_msg_desc)) {
                    sb.append(this.f112677H.last_msg_desc);
                } else {
                    ChatroomRecInfo chatroomRecInfo = this.f112677H.chatroom_info;
                    if (chatroomRecInfo != null && (chatroomMsgPack = chatroomRecInfo.last_chatroom_msg) != null) {
                        sb.append((chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgText = msgContent.chatroom_text) == null) ? "" : chatroomMsgText.content);
                    } else if (!(chatroomRecInfo == null || (chatroomData2 = chatroomRecInfo.chatroom_data) == null)) {
                        sb.append(chatroomData2.announcement);
                    }
                }
                if (num == null) {
                    num = Integer.valueOf(this.f112669z.getResources().getColor(C0966R.color.a_1));
                }
                SpannableString spannableString = new SpannableString(sb);
                spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, i2, 33);
                this.f112674E.setText(spannableString);
                View view5 = this.f112672C;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ChatroomRecInfo chatroomRecInfo2 = this.f112677H.chatroom_info;
                if (!(chatroomRecInfo2 == null || (chatroomData = chatroomRecInfo2.chatroom_data) == null)) {
                    this.f112678I = chatroomData;
                    this.f112670A.setText(chatroomData.room_name);
                    C52645f.m59023a().mo73595e(this.f112671B, this.f112677H.chatroom_info.chatroom_data.chatroom_icon, (C52645f.C52650d) null, (C52645f.C52652e) null);
                    if (this.f112678I.top_chatroom) {
                        View view7 = this.f112672C;
                        C9556a aVar6 = new C9556a();
                        aVar6.mo10233c(0);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$MyChatRoomVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                ChatroomRecInfo chatroomRecInfo3 = this.f112677H.chatroom_info;
                if (chatroomRecInfo3 != null && (chattingInfo = chatroomRecInfo3.chating_des) != null) {
                    int i3 = chattingInfo.chating_type;
                    this.f112676G.setText(chattingInfo.desc);
                    if (!Util.isNullOrNil(this.f112677H.chatroom_info.chating_des.avator)) {
                        C52645f.m59023a().mo73595e(this.f112675F, this.f112677H.chatroom_info.chating_des.avator, (C52645f.C52650d) null, (C52645f.C52652e) null);
                        this.f112675F.setVisibility(0);
                        return;
                    }
                    this.f112675F.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$d */
    public static class C41816d extends C41813b {

        /* renamed from: A */
        public TextView f112684A;

        /* renamed from: B */
        public ImageView f112685B;

        /* renamed from: C */
        public ImageView f112686C;

        public C41816d(View view) {
            super(view);
            this.f112684A = (TextView) view.findViewById(C0966R.C0970id.mhz);
            this.f112685B = (ImageView) view.findViewById(C0966R.C0970id.mei);
            this.f112686C = (ImageView) view.findViewById(C0966R.C0970id.fc_);
        }

        /* renamed from: y */
        public void mo65603y(C45219a aVar, Lbs lbs, int i, long j, long j2, List<BanAction> list) {
        }

        /* renamed from: z */
        public void mo65605z(boolean z, boolean z2) {
            if (z) {
                this.f112684A.setText("收起小组");
                this.f112685B.setVisibility(8);
                if (C85875k4.m106211z()) {
                    this.f112686C.setImageResource(C0966R.raw.icons_arrow_up_dark);
                } else {
                    this.f112686C.setImageResource(C0966R.raw.icons_arrow_up_grey);
                }
            } else {
                this.f112684A.setText("展开小组");
                if (C85875k4.m106211z()) {
                    this.f112686C.setImageResource(C0966R.raw.icons_arrow_down_dark);
                } else {
                    this.f112686C.setImageResource(C0966R.raw.icons_arrow_down_grey);
                }
                if (z2) {
                    this.f112685B.setVisibility(0);
                } else {
                    this.f112685B.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$e */
    public static class C41817e extends C41813b {

        /* renamed from: A */
        public TextView f112687A;

        /* renamed from: B */
        public ImageView f112688B;

        /* renamed from: C */
        public ImageView f112689C;

        /* renamed from: D */
        public ImageView f112690D;

        /* renamed from: E */
        public TextView f112691E;

        /* renamed from: F */
        public TextView f112692F;

        /* renamed from: G */
        public LinearLayout f112693G;

        /* renamed from: H */
        public LinearLayout f112694H;

        /* renamed from: I */
        public LinearLayout f112695I;

        /* renamed from: J */
        public ChatroomData f112696J;

        /* renamed from: K */
        public Lbs f112697K;

        /* renamed from: L */
        public int f112698L;

        /* renamed from: M */
        public long f112699M;

        /* renamed from: N */
        public long f112700N;

        /* renamed from: P */
        public boolean f112701P = false;

        /* renamed from: Q */
        public boolean f112702Q = false;

        /* renamed from: R */
        public List<BanAction> f112703R = new LinkedList();

        /* renamed from: S */
        public Map<Object, C41823f> f112704S;

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$e$a */
        public class C41818a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ View f112705d;

            public C41818a(View view) {
                this.f112705d = view;
            }

            public void onClick(View view) {
                ChatroomRecInfo chatroomRecInfo;
                ChatroomData chatroomData;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (!(!(this.f112705d.getTag() instanceof ChatroomRecInfo) || (chatroomRecInfo = (ChatroomRecInfo) this.f112705d.getTag()) == null || (chatroomData = chatroomRecInfo.chatroom_data) == null)) {
                    C41817e eVar = C41817e.this;
                    int c = C41811n.m45334c(eVar.f112669z, 4, chatroomData, eVar.f112697K, eVar.f112689C, eVar.f112703R, 0, eVar.f112702Q ? 1102 : 1002);
                    int i = 1;
                    if (c == 1 || c != 2) {
                        i = 3;
                    }
                    C41817e.m45340z(C41817e.this, i);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$e$b */
        public class C41819b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ChatroomRecInfo f112707d;

            /* renamed from: e */
            public final /* synthetic */ Lbs f112708e;

            public C41819b(ChatroomRecInfo chatroomRecInfo, Lbs lbs) {
                this.f112707d = chatroomRecInfo;
                this.f112708e = lbs;
            }

            public void onClick(View view) {
                ChatroomData chatroomData;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ChatroomRecInfo chatroomRecInfo = this.f112707d;
                if (!(chatroomRecInfo == null || (chatroomData = chatroomRecInfo.chatroom_data) == null)) {
                    C41817e eVar = C41817e.this;
                    C41811n.m45334c(eVar.f112669z, 1, chatroomData, this.f112708e, eVar.f112689C, eVar.f112703R, 0, eVar.f112702Q ? 1102 : 1002);
                    C41817e.m45340z(C41817e.this, 1);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$e$c */
        public class C41820c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ChatroomRecInfo f112710d;

            /* renamed from: e */
            public final /* synthetic */ Lbs f112711e;

            public C41820c(ChatroomRecInfo chatroomRecInfo, Lbs lbs) {
                this.f112710d = chatroomRecInfo;
                this.f112711e = lbs;
            }

            public void onClick(View view) {
                ChatroomData chatroomData;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ChatroomRecInfo chatroomRecInfo = this.f112710d;
                if (!(chatroomRecInfo == null || (chatroomData = chatroomRecInfo.chatroom_data) == null)) {
                    C41817e eVar = C41817e.this;
                    C41811n.m45334c(eVar.f112669z, 2, chatroomData, this.f112711e, eVar.f112689C, eVar.f112703R, 0, eVar.f112702Q ? 1102 : 1002);
                    C41817e.m45340z(C41817e.this, 2);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$e$d */
        public class C41821d implements Runnable {

            /* renamed from: d */
            public int f112713d = C76577a.m92151b(MMApplicationContext.getContext(), 8);

            /* renamed from: e */
            public List<View> f112714e;

            /* renamed from: f */
            public Object f112715f;

            public C41821d(Object obj, List<View> list) {
                ArrayList arrayList = new ArrayList();
                this.f112714e = arrayList;
                if (list != null) {
                    arrayList.addAll(list);
                }
                this.f112715f = obj;
            }

            public void run() {
                int measuredWidth = C41817e.this.f112693G.getMeasuredWidth();
                C41823f fVar = new C41823f();
                Iterator it = ((ArrayList) this.f112714e).iterator();
                int i = 0;
                boolean z = false;
                while (it.hasNext()) {
                    View view = (View) it.next();
                    int measuredWidth2 = view.getMeasuredWidth() > measuredWidth ? measuredWidth : view.getMeasuredWidth();
                    i += measuredWidth2;
                    if (i > measuredWidth || z) {
                        if (!z) {
                            z = true;
                        } else {
                            measuredWidth2 = i;
                        }
                        if (measuredWidth2 > measuredWidth) {
                            break;
                        }
                        C41817e.this.f112694H.addView(view);
                        fVar.f112721b = view.getMeasuredHeight();
                        if (measuredWidth - measuredWidth2 >= this.f112713d) {
                            C41817e.this.f112694H.addView(new View(C41817e.this.f112669z), new LinearLayout.LayoutParams(this.f112713d, 8));
                            measuredWidth2 += this.f112713d;
                        }
                        i = measuredWidth2;
                    } else {
                        C41817e.this.f112693G.addView(view);
                        fVar.f112720a = view.getMeasuredHeight();
                        if (measuredWidth - i >= this.f112713d) {
                            C41817e.this.f112693G.addView(new View(C41817e.this.f112669z), new LinearLayout.LayoutParams(this.f112713d, 8));
                            i += this.f112713d;
                        }
                    }
                }
                Object obj = this.f112715f;
                if (obj != null) {
                    C41817e.this.f112704S.put(obj, fVar);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$e$e */
        public class C41822e implements Runnable {

            /* renamed from: d */
            public int f112717d = C76577a.m92151b(MMApplicationContext.getContext(), 8);

            /* renamed from: e */
            public List<View> f112718e;

            public C41822e(List<View> list) {
                ArrayList arrayList = new ArrayList();
                this.f112718e = arrayList;
                if (list != null) {
                    arrayList.addAll(list);
                }
            }

            public void run() {
                C41817e.this.f112695I.removeAllViews();
                int measuredWidth = C41817e.this.f112695I.getMeasuredWidth();
                int i = 0;
                Iterator it = ((ArrayList) this.f112718e).iterator();
                while (it.hasNext()) {
                    View view = (View) it.next();
                    i += view.getMeasuredWidth() > measuredWidth ? measuredWidth : view.getMeasuredWidth();
                    if (i <= measuredWidth) {
                        C41817e.this.f112695I.addView(view);
                        if (measuredWidth - i >= this.f112717d) {
                            C41817e.this.f112695I.addView(new View(C41817e.this.f112669z), new LinearLayout.LayoutParams(this.f112717d, 8));
                            i += this.f112717d;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$e$f */
        public static class C41823f {

            /* renamed from: a */
            public int f112720a = 0;

            /* renamed from: b */
            public int f112721b = 0;
        }

        public C41817e(View view) {
            super(view);
            this.f112687A = (TextView) view.findViewById(C0966R.C0970id.b0i);
            this.f112688B = (ImageView) view.findViewById(C0966R.C0970id.b0j);
            this.f112692F = (TextView) view.findViewById(C0966R.C0970id.b0_);
            this.f112689C = (ImageView) view.findViewById(C0966R.C0970id.b0f);
            this.f112690D = (ImageView) view.findViewById(C0966R.C0970id.b0k);
            this.f112691E = (TextView) view.findViewById(C0966R.C0970id.b0l);
            this.f112693G = (LinearLayout) view.findViewById(C0966R.C0970id.iru);
            this.f112694H = (LinearLayout) view.findViewById(C0966R.C0970id.irv);
            this.f112695I = (LinearLayout) view.findViewById(C0966R.C0970id.kdz);
            view.setOnClickListener(new C41818a(view));
        }

        /* renamed from: z */
        public static void m45340z(C41817e eVar, int i) {
            C41817e eVar2 = eVar;
            int i2 = i;
            ChatroomData chatroomData = eVar2.f112696J;
            String str = "";
            String str2 = chatroomData == null ? str : chatroomData.appid;
            if (chatroomData != null) {
                str = chatroomData.chatroom_name;
            }
            String str3 = str;
            JSONObject jSONObject = new JSONObject();
            ChatroomData chatroomData2 = eVar2.f112696J;
            if (chatroomData2 != null) {
                try {
                    jSONObject.put("reportStr", chatroomData2.report_str);
                } catch (Exception unused) {
                }
            }
            long j = 4;
            if (eVar2.f112702Q) {
                C40308d.C40309a aVar = C40308d.f108375a;
                long j2 = (long) eVar2.f112698L;
                if (!eVar2.f112701P) {
                    j = (long) i2;
                }
                aVar.mo63002n(1102, j2, 2, j, eVar2.f112699M, eVar2.f112700N, str2, str3, jSONObject.toString());
                return;
            }
            C40308d.C40309a aVar2 = C40308d.f108375a;
            long j3 = (long) eVar2.f112698L;
            if (!eVar2.f112701P) {
                j = (long) i2;
            }
            aVar2.mo62999k(1002, j3, 2, j, eVar2.f112699M, eVar2.f112700N, str2, str3, jSONObject.toString());
        }

        /* renamed from: y */
        public void mo65603y(C45219a aVar, Lbs lbs, int i, long j, long j2, List<BanAction> list) {
            Integer num;
            Integer num2;
            Integer num3;
            if (aVar.f122539b instanceof ChatroomRecInfo) {
                this.f112702Q = aVar.f122540c;
                if (list != null) {
                    ((LinkedList) this.f112703R).addAll(list);
                }
                ChatroomRecInfo chatroomRecInfo = (ChatroomRecInfo) aVar.f122539b;
                this.f112697K = lbs;
                this.f112698L = i;
                this.f112699M = j;
                this.f112700N = j2;
                this.f44854d.setTag(chatroomRecInfo);
                ChatroomData chatroomData = chatroomRecInfo.chatroom_data;
                if (chatroomData != null) {
                    this.f112696J = chatroomData;
                    this.f112687A.setText(chatroomData.room_name);
                    C52645f.m59023a().mo73595e(this.f112689C, chatroomRecInfo.chatroom_data.chatroom_icon, (C52645f.C52650d) null, (C52645f.C52652e) null);
                    if (chatroomRecInfo.chatroom_data.is_private) {
                        this.f112692F.setText(C0966R.string.f7r);
                        this.f112692F.setTextColor(this.f112669z.getResources().getColor(C0966R.color.f2958ae));
                        this.f112688B.setVisibility(0);
                        this.f112692F.setOnClickListener(new C41819b(chatroomRecInfo, lbs));
                    } else {
                        this.f112692F.setText(C0966R.string.f7v);
                        this.f112688B.setVisibility(8);
                        this.f112692F.setOnClickListener(new C41820c(chatroomRecInfo, lbs));
                    }
                    if (chatroomRecInfo.chatroom_data.can_join) {
                        this.f112692F.setTextColor(this.f112669z.getResources().getColor(C0966R.color.f2958ae));
                    } else {
                        this.f112692F.setTextColor(this.f112669z.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
                        this.f112692F.setClickable(false);
                        this.f112701P = true;
                    }
                    LinkedList<RestrictRule> linkedList = chatroomRecInfo.chatroom_data.rule_list;
                    if (!Util.isNullOrNil((List) linkedList)) {
                        ArrayList arrayList = new ArrayList();
                        for (RestrictRule next : linkedList) {
                            View inflate = LayoutInflater.from(this.f112669z).inflate(C0966R.C0971layout.bqd, this.f112693G, false);
                            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.fe_);
                            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.fe8);
                            textView.setText(next.rule_desc);
                            if (next.color != null) {
                                num3 = C53601h.m60134m(C85875k4.m106211z() ? next.color.dark_color : next.color.light_color);
                            } else {
                                num3 = null;
                            }
                            if (num3 == null) {
                                num3 = next.can_pass ? Integer.valueOf(this.f112669z.getResources().getColor(C0966R.color.f2973b4)) : Integer.valueOf(this.f112669z.getResources().getColor(C0966R.color.FG_2));
                            }
                            textView.setTextColor(num3.intValue());
                            float p = C76577a.m92165p(this.f112669z);
                            imageView.getLayoutParams().height = (int) (((float) imageView.getLayoutParams().height) * p);
                            imageView.getLayoutParams().width = (int) (((float) imageView.getLayoutParams().width) * p);
                            imageView.requestLayout();
                            imageView.setVisibility(0);
                            if (next.show_icon != null) {
                                boolean z = C85875k4.m106211z();
                                ShowIcon showIcon = next.show_icon;
                                String str = z ? showIcon.dark_icon : showIcon.light_icon;
                                if (!Util.isNullOrNil(str)) {
                                    imageView.setVisibility(0);
                                    C52645f.m59023a().mo73595e(imageView, str, (C52645f.C52650d) null, (C52645f.C52652e) null);
                                } else {
                                    imageView.setVisibility(8);
                                }
                            } else if (next.can_pass) {
                                if (C85875k4.m106211z()) {
                                    imageView.setImageResource(C0966R.raw.chat_room_rule_pass_dark);
                                } else {
                                    imageView.setImageResource(C0966R.raw.chat_room_rule_pass_light);
                                }
                            } else if (C85875k4.m106211z()) {
                                imageView.setImageResource(C0966R.raw.chat_room_rule_reject_dark);
                            } else {
                                imageView.setImageResource(C0966R.raw.chat_room_rule_reject_light);
                            }
                            inflate.measure(0, 0);
                            arrayList.add(inflate);
                        }
                        this.f112693G.setVisibility(0);
                        this.f112694H.setVisibility(0);
                        C41823f fVar = this.f112704S.get(chatroomRecInfo);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f112693G.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f112694H.getLayoutParams();
                        if (fVar != null) {
                            int i2 = fVar.f112720a;
                            if (i2 != 0) {
                                layoutParams.height = i2;
                            } else {
                                layoutParams.height = 0;
                            }
                            int i3 = fVar.f112721b;
                            if (i3 != 0) {
                                layoutParams2.height = i3;
                            } else {
                                layoutParams2.height = 0;
                            }
                        } else {
                            layoutParams.height = -2;
                            layoutParams2.height = -2;
                        }
                        this.f112693G.setLayoutParams(layoutParams);
                        this.f112694H.setLayoutParams(layoutParams2);
                        this.f112693G.removeAllViews();
                        this.f112694H.removeAllViews();
                        this.f112693G.post(new C41821d(chatroomRecInfo, arrayList));
                    } else {
                        this.f112693G.setVisibility(8);
                        this.f112694H.setVisibility(8);
                    }
                    LinkedList<ChatroomTag> linkedList2 = chatroomRecInfo.chatroom_data.chatroom_tag_list;
                    if (!Util.isNullOrNil((List) linkedList2)) {
                        this.f112695I.setVisibility(0);
                        ArrayList arrayList2 = new ArrayList();
                        for (ChatroomTag next2 : linkedList2) {
                            View inflate2 = LayoutInflater.from(this.f112669z).inflate(C0966R.C0971layout.bqe, this.f112695I, false);
                            TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.feb);
                            ImageView imageView2 = (ImageView) inflate2.findViewById(C0966R.C0970id.fea);
                            textView2.setText(next2.desc);
                            if (next2.color != null) {
                                num = C53601h.m60134m(C85875k4.m106211z() ? next2.color.dark_color : next2.color.light_color);
                            } else {
                                num = null;
                            }
                            if (num == null) {
                                num = Integer.valueOf(this.f112669z.getResources().getColor(C0966R.color.FG_0));
                            }
                            textView2.setTextColor(num.intValue());
                            float p2 = C76577a.m92165p(this.f112669z);
                            imageView2.getLayoutParams().height = (int) (((float) imageView2.getLayoutParams().height) * p2);
                            imageView2.getLayoutParams().width = (int) (((float) imageView2.getLayoutParams().width) * p2);
                            imageView2.requestLayout();
                            if (!Util.isNullOrNil(next2.icon)) {
                                imageView2.setVisibility(0);
                                C52645f.m59023a().mo73595e(imageView2, next2.icon, (C52645f.C52650d) null, (C52645f.C52652e) null);
                            } else {
                                imageView2.setVisibility(8);
                            }
                            GradientDrawable gradientDrawable = (GradientDrawable) inflate2.getBackground();
                            if (gradientDrawable != null) {
                                if (next2.background_color != null) {
                                    num2 = C53601h.m60134m(C85875k4.m106211z() ? next2.background_color.dark_color : next2.background_color.light_color);
                                } else {
                                    num2 = null;
                                }
                                if (num2 == null) {
                                    num2 = Integer.valueOf(this.f112669z.getResources().getColor(C0966R.color.f2928b));
                                }
                                gradientDrawable.setColor(num2.intValue());
                            }
                            inflate2.measure(0, 0);
                            if (next2.tag_jump_info != null) {
                                inflate2.setOnClickListener(new C41827o(this, next2));
                            }
                            arrayList2.add(inflate2);
                        }
                        this.f112695I.post(new C41822e(arrayList2));
                    } else {
                        this.f112695I.setVisibility(8);
                    }
                }
                ChattingInfo chattingInfo = chatroomRecInfo.chating_des;
                if (chattingInfo != null) {
                    int i4 = chattingInfo.chating_type;
                    this.f112691E.setText(chattingInfo.desc);
                    if (!Util.isNullOrNil(chatroomRecInfo.chating_des.avator)) {
                        C52645f.m59023a().mo73595e(this.f112690D, chatroomRecInfo.chating_des.avator, (C52645f.C52650d) null, (C52645f.C52652e) null);
                        this.f112690D.setVisibility(0);
                        return;
                    }
                    this.f112690D.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$f */
    public static class C41824f extends C41813b {

        /* renamed from: A */
        public TextView f112722A;

        /* renamed from: B */
        public View f112723B;

        /* renamed from: C */
        public ImageView f112724C;

        /* renamed from: D */
        public JumpInfo f112725D;

        /* renamed from: E */
        public View f112726E;

        /* renamed from: F */
        public MMNeat7extView f112727F;

        /* renamed from: G */
        public View f112728G;

        /* renamed from: H */
        public long f112729H;

        /* renamed from: I */
        public long f112730I;

        /* renamed from: J */
        public List<BanAction> f112731J;

        /* renamed from: K */
        public Drawable f112732K;

        /* renamed from: L */
        public boolean f112733L;

        /* renamed from: M */
        public boolean f112734M = false;

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$f$b */
        public class C4441b implements View.OnClickListener {
            public C4441b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View view2 = C41824f.this.f112726E;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.n$f$a */
        public class C41825a implements View.OnClickListener {
            public C41825a() {
            }

            public void onClick(View view) {
                Class cls = C48478n.class;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (((C48478n) C86312j.m106911c(cls)).mo65675Go()) {
                    ((C48478n) C86312j.m106911c(cls)).mo65686fa();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (!Util.isNullOrNil((List) C41824f.this.f112731J)) {
                    for (BanAction next : C41824f.this.f112731J) {
                        if (next.type == 2) {
                            C41811n.m45335d(C41824f.this.f112669z, next.desc);
                            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    }
                }
                C41824f fVar = C41824f.this;
                C53601h.m60129h(fVar.f112669z, fVar.f112725D);
                C40308d.C40309a aVar = C40308d.f108375a;
                C41824f fVar2 = C41824f.this;
                aVar.mo62999k(1003, 2, 7, 0, fVar2.f112729H, fVar2.f112730I, "", "", "");
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C41824f(View view) {
            super(view);
            this.f112722A = (TextView) view.findViewById(C0966R.C0970id.ivo);
            this.f112723B = view.findViewById(C0966R.C0970id.bw8);
            this.f112724C = (ImageView) view.findViewById(C0966R.C0970id.bw7);
            this.f112723B.setOnClickListener(new C41825a());
            Context context = this.f112669z;
            this.f112732K = C74933u4.m89768e(context, C0966R.raw.game_add_icon, C76577a.m92153d(context, C0966R.color.FG_0_CARE));
            this.f112726E = view.findViewById(C0966R.C0970id.hub);
            MMNeat7extView mMNeat7extView = (MMNeat7extView) view.findViewById(C0966R.C0970id.hui);
            this.f112727F = mMNeat7extView;
            mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(this.f112727F.getContext())));
            this.f112728G = view.findViewById(C0966R.C0970id.hu7);
            float p = C76577a.m92165p(this.f112669z);
            this.f112728G.getLayoutParams().height = (int) (((float) this.f112728G.getLayoutParams().height) * p);
            this.f112728G.getLayoutParams().width = (int) (((float) this.f112728G.getLayoutParams().width) * p);
            this.f112728G.requestLayout();
            this.f112728G.setOnClickListener(new C4441b());
        }

        /* renamed from: y */
        public void mo65603y(C45219a aVar, Lbs lbs, int i, long j, long j2, List<BanAction> list) {
            C45219a aVar2 = aVar;
            this.f112729H = j;
            this.f112730I = j2;
            this.f112731J = list;
            this.f112725D = aVar2.f122542e;
            int i2 = aVar2.f122538a;
            boolean z = true;
            if (i2 == 1) {
                this.f112722A.setText(aVar2.f122541d);
            } else if (i2 == 3) {
                this.f112722A.setText(aVar2.f122541d);
            }
            if (this.f112725D != null) {
                this.f112724C.setImageDrawable(this.f112732K);
                View view = this.f112723B;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(0);
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view2 = this.f112723B;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (aVar2.f122538a != 3) {
                z = false;
            }
            this.f112733L = z;
        }
    }

    /* renamed from: a */
    public static void m45332a() {
        C76901s0 s0Var = f112667a;
        if (s0Var != null && s0Var.isShowing()) {
            f112667a.dismiss();
        }
        f112667a = null;
    }

    /* renamed from: b */
    public static ChatroomData m45333b(C45219a aVar) {
        ChatroomData chatroomData;
        ChatroomData chatroomData2;
        if (aVar == null) {
            return null;
        }
        C47465a aVar2 = aVar.f122539b;
        if (aVar2 instanceof MyChatroomInfo) {
            ChatroomRecInfo chatroomRecInfo = ((MyChatroomInfo) aVar2).chatroom_info;
            if (chatroomRecInfo == null || (chatroomData2 = chatroomRecInfo.chatroom_data) == null) {
                return null;
            }
            return chatroomData2;
        } else if (!(aVar2 instanceof ChatroomRecInfo) || (chatroomData = ((ChatroomRecInfo) aVar2).chatroom_data) == null) {
            return null;
        } else {
            return chatroomData;
        }
    }

    /* renamed from: c */
    public static int m45334c(Context context, int i, ChatroomData chatroomData, Lbs lbs, View view, List<BanAction> list, long j, long j2) {
        Context context2 = context;
        int i2 = i;
        ChatroomData chatroomData2 = chatroomData;
        View view2 = view;
        Class cls = C48478n.class;
        Class cls2 = C16408b.class;
        if (((C48478n) C86312j.m106911c(cls)).mo65675Go()) {
            ((C48478n) C86312j.m106911c(cls)).mo65686fa();
            return 0;
        }
        if (!Util.isNullOrNil((List) list)) {
            for (BanAction next : list) {
                if (next.type == 1) {
                    m45335d(context2, next.desc);
                    return 0;
                }
            }
        }
        if (chatroomData2 == null || Util.isNullOrNil(chatroomData2.chatroom_name)) {
            return 0;
        }
        ActivityOptions makeScaleUpAnimation = view2 != null ? ActivityOptions.makeScaleUpAnimation(view2, view.getWidth() / 2, view.getHeight() / 2, 0, 0) : null;
        Bundle bundle = new Bundle();
        bundle.putString("chat_room_title", chatroomData2.room_name);
        long j3 = j;
        C16408b.C16409a aVar = r9;
        C16408b.C16409a aVar2 = new C16408b.C16409a(chatroomData2.chatroom_name, chatroomData2.chatroom_icon, j3, j2, false, bundle);
        if (i2 == 1) {
            C53601h.m60129h(context2, chatroomData2.apply_jump_info);
            return 2;
        } else if (i2 == 2) {
            C16408b.C16409a aVar3 = aVar;
            aVar3.f43819c = true;
            ((C16408b) C86312j.m106911c(cls2)).W70(context, aVar3, lbs, makeScaleUpAnimation, false);
            return 1;
        } else if (i2 == 3) {
            ((C16408b) C86312j.m106911c(cls2)).W70(context, aVar, lbs, makeScaleUpAnimation, false);
            return 1;
        } else if (i2 != 4) {
            return 0;
        } else {
            if (chatroomData2.is_private || !chatroomData2.can_onlooker) {
                C53601h.m60129h(context2, chatroomData2.apply_jump_info);
                return 2;
            }
            ((C16408b) C86312j.m106911c(cls2)).W70(context, aVar, lbs, makeScaleUpAnimation, false);
            return 1;
        }
    }

    /* renamed from: d */
    public static void m45335d(Context context, String str) {
        m45332a();
        f112667a = C47877k0.m53189a((Activity) context, 1, C0966R.raw.tipsbar_icon_warning, context.getResources().getColor(C0966R.color.ahf), str, 0, (View.OnClickListener) null, (PopupWindow.OnDismissListener) null, (View.OnClickListener) null);
        f112668b.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, 0);
    }
}
