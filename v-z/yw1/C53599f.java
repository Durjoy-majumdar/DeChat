package yw1;

import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomUserData;
import ex1.C45709b;
import java.io.IOException;

/* renamed from: yw1.f */
public class C53599f {
    /* renamed from: a */
    public static C45709b m60119a(ChatroomUserData chatroomUserData) {
        C45709b bVar = new C45709b();
        if (chatroomUserData == null) {
            return bVar;
        }
        bVar.field_userName = chatroomUserData.username;
        bVar.field_roomName = chatroomUserData.chatroom_name;
        bVar.field_nickName = chatroomUserData.nickname;
        bVar.field_avatarURL = chatroomUserData.avatar;
        bVar.field_sex = chatroomUserData.sex;
        bVar.field_jumpInfo = chatroomUserData.jump_info;
        bVar.field_isAuthorized = chatroomUserData.is_authorized;
        bVar.field_tagInfo = chatroomUserData.tag_info;
        bVar.field_lbsInfo = chatroomUserData.lbs_info;
        bVar.field_role = chatroomUserData.role;
        bVar.field_canBeAt = chatroomUserData.can_be_at;
        bVar.field_isRobot = chatroomUserData.is_robot;
        bVar.field_canKickMember = chatroomUserData.can_kick_member;
        bVar.field_userRole = chatroomUserData.user_role;
        bVar.field_canBeKicked = chatroomUserData.can_be_kicked;
        bVar.field_canAtAll = chatroomUserData.can_at_all;
        try {
            bVar.field_rawPbData = chatroomUserData.toByteArray();
        } catch (IOException unused) {
        }
        return bVar;
    }
}
