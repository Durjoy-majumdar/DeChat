package com.tencent.p014mm.plugin.game.chatroom.view;

import android.view.View;
import bx1.C39861m;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomEnterInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomUserData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.r0 */
public final class C41834r0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatroomData f112754d;

    /* renamed from: e */
    public final /* synthetic */ ChatroomUserData f112755e;

    /* renamed from: f */
    public final /* synthetic */ JoinRoomExternalConfirmView f112756f;

    /* renamed from: g */
    public final /* synthetic */ ChatroomEnterInfo f112757g;

    /* renamed from: h */
    public final /* synthetic */ Lbs f112758h;

    /* renamed from: i */
    public final /* synthetic */ JumpInfo f112759i;

    public C41834r0(ChatroomData chatroomData, ChatroomUserData chatroomUserData, JoinRoomExternalConfirmView joinRoomExternalConfirmView, ChatroomEnterInfo chatroomEnterInfo, Lbs lbs, JumpInfo jumpInfo) {
        this.f112754d = chatroomData;
        this.f112755e = chatroomUserData;
        this.f112756f = joinRoomExternalConfirmView;
        this.f112757g = chatroomEnterInfo;
        this.f112758h = lbs;
        this.f112759i = jumpInfo;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/JoinRoomExternalConfirmView$attachData$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f112754d == null || this.f112755e == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/JoinRoomExternalConfirmView$attachData$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C40308d.C40309a aVar = C40308d.f108375a;
        JoinRoomExternalConfirmView joinRoomExternalConfirmView = this.f112756f;
        aVar.mo63004p(1, 13, 0, joinRoomExternalConfirmView.f112589e, joinRoomExternalConfirmView.f112588d, this.f112757g.report_str);
        ChatroomUserData chatroomUserData = this.f112755e;
        if (chatroomUserData.is_authorized) {
            String str = this.f112754d.chatroom_name;
            Lbs lbs = this.f112758h;
            JoinRoomExternalConfirmView joinRoomExternalConfirmView2 = this.f112756f;
            C86709a0.m107524d().mo123460f(new C39861m(str, lbs, true, joinRoomExternalConfirmView2.f112589e, joinRoomExternalConfirmView2.f112588d));
        } else if (chatroomUserData.create_account_jump_info != null) {
            JumpInfo jumpInfo = this.f112759i;
            if (jumpInfo == null || Util.isNullOrNil(jumpInfo.jump_url) || !C87412m.m108589b(Util.nullAsNil(this.f112759i.preload_id), this.f112755e.create_account_jump_info.preload_id)) {
                C53601h.m60130i(this.f112756f.getContext(), this.f112755e.create_account_jump_info, 11, (String) null);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("source_id", 1311);
                } catch (JSONException unused) {
                }
                String encode = URLEncoder.encode(jSONObject.toString());
                C87412m.m108593f(encode, "encode(jsonObject.toString())");
                C53601h.m60130i(this.f112756f.getContext(), this.f112755e.create_account_jump_info, 11, encode);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/JoinRoomExternalConfirmView$attachData$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
