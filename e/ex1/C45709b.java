package ex1;

import ax1.C39641d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomUserData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TagInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.UserRole;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.io.IOException;
import o40.C61937h;
import p749xh.C53332d4;

/* renamed from: ex1.b */
public class C45709b extends C53332d4 implements C39641d {

    /* renamed from: W */
    public static final IAutoDBItem.MAutoDBInfo f123538W = C53332d4.initAutoDBInfo(C45709b.class);

    /* renamed from: E0 */
    public UserRole mo62196E0() {
        return this.field_userRole;
    }

    /* renamed from: K0 */
    public boolean mo62197K0() {
        return this.field_canBeKicked;
    }

    /* renamed from: Q1 */
    public boolean mo62198Q1() {
        return this.field_canBeAt;
    }

    /* renamed from: a */
    public JumpInfo mo62199a() {
        return this.field_jumpInfo;
    }

    /* renamed from: b1 */
    public boolean mo62200b1() {
        return this.field_canKickMember;
    }

    /* renamed from: b2 */
    public String mo62201b2() {
        ChatroomUserData chatroomUserData = null;
        if (this.field_rawPbData != null) {
            try {
                ChatroomUserData chatroomUserData2 = new ChatroomUserData();
                try {
                    chatroomUserData2.parseFrom(this.field_rawPbData);
                } catch (IOException unused) {
                }
                chatroomUserData = chatroomUserData2;
            } catch (IOException unused2) {
            }
        }
        return chatroomUserData != null ? C61937h.m72709h(chatroomUserData).toString() : "";
    }

    public String getAvatarUrl() {
        return this.field_avatarURL;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f123538W;
    }

    public String getNickName() {
        return this.field_nickName;
    }

    public long getUpdateTime() {
        return this.field_updateTime;
    }

    public String getUserName() {
        return this.field_userName;
    }

    /* renamed from: j1 */
    public boolean mo62206j1() {
        int i = this.field_role;
        return i == 1 || i == 2;
    }

    /* renamed from: l2 */
    public String mo71197l2() {
        return "userName: " + this.field_userName + "; roomName: " + this.field_roomName;
    }

    /* renamed from: u1 */
    public boolean mo62207u1() {
        return this.field_canAtAll;
    }

    /* renamed from: x1 */
    public TagInfo mo62208x1() {
        return this.field_tagInfo;
    }
}
