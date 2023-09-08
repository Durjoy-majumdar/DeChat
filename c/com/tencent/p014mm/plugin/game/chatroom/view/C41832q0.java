package com.tencent.p014mm.plugin.game.chatroom.view;

import android.view.View;
import bx1.C39861m;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomUserData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.q0 */
public class C41832q0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatroomUserData f112748d;

    /* renamed from: e */
    public final /* synthetic */ ChatroomData f112749e;

    /* renamed from: f */
    public final /* synthetic */ Lbs f112750f;

    /* renamed from: g */
    public final /* synthetic */ JumpInfo f112751g;

    /* renamed from: h */
    public final /* synthetic */ JoinChatRoomConfirmView f112752h;

    public C41832q0(JoinChatRoomConfirmView joinChatRoomConfirmView, ChatroomUserData chatroomUserData, ChatroomData chatroomData, Lbs lbs, JumpInfo jumpInfo) {
        this.f112752h = joinChatRoomConfirmView;
        this.f112748d = chatroomUserData;
        this.f112749e = chatroomData;
        this.f112750f = lbs;
        this.f112751g = jumpInfo;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/JoinChatRoomConfirmView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C40308d.C40309a aVar = C40308d.f108375a;
        JoinChatRoomConfirmView joinChatRoomConfirmView = this.f112752h;
        aVar.mo63003o(1, 13, 0, joinChatRoomConfirmView.f112579f, joinChatRoomConfirmView.f112578e);
        ChatroomUserData chatroomUserData = this.f112748d;
        if (chatroomUserData.is_authorized) {
            String str = this.f112749e.chatroom_name;
            Lbs lbs = this.f112750f;
            JoinChatRoomConfirmView joinChatRoomConfirmView2 = this.f112752h;
            C86709a0.m107524d().mo123460f(new C39861m(str, lbs, true, joinChatRoomConfirmView2.f112579f, joinChatRoomConfirmView2.f112578e));
        } else if (chatroomUserData.create_account_jump_info != null) {
            JumpInfo jumpInfo = this.f112751g;
            if (jumpInfo == null || Util.isNullOrNil(jumpInfo.jump_url) || !Util.nullAsNil(this.f112751g.preload_id).equals(this.f112748d.create_account_jump_info.preload_id)) {
                C53601h.m60130i(this.f112752h.f112577d, this.f112748d.create_account_jump_info, 11, (String) null);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("source_id", 1311);
                } catch (JSONException unused) {
                }
                C53601h.m60130i(this.f112752h.f112577d, this.f112748d.create_account_jump_info, 11, URLEncoder.encode(jSONObject.toString()));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/JoinChatRoomConfirmView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
