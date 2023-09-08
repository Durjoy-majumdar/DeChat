package ix1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bx1.C39870v;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ChatRoomAtFunctionEvent;
import com.tencent.p014mm.autogen.events.ChatRoomLocateInfoEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomJumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgOptions;
import com.tencent.p014mm.plugin.game.autogen.chatroom.VoteInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.io.IOException;
import ke3.C88144b;
import nj3.C11184p0;
import qo3.C77407n;
import yw1.C53601h;

public class n$$j implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124892d;

    public n$$j(C46337n nVar) {
        this.f124892d = nVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        ChatroomJumpInfo chatroomJumpInfo;
        JumpInfo jumpInfo;
        MsgOptions msgOptions;
        VoteInfo voteInfo;
        switch (menuItem.getItemId()) {
            case 9527:
                C46337n nVar = this.f124892d;
                if (nVar.f124841G != null && nVar.f124859U0 != null) {
                    ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = new ChatRoomAtFunctionEvent();
                    ChatRoomAtFunctionEvent.C40049a aVar = chatRoomAtFunctionEvent.f107397d;
                    C46337n nVar2 = this.f124892d;
                    aVar.f107398a = nVar2.f124841G.from_username;
                    aVar.f107399b = nVar2.f124859U0.getNickName();
                    chatRoomAtFunctionEvent.publish();
                    C40308d.C40309a aVar2 = C40308d.f108375a;
                    C46337n nVar3 = this.f124892d;
                    long j = nVar3.f124840F;
                    long j2 = nVar3.f124839E;
                    ChatroomMsgPack chatroomMsgPack = nVar3.f124841G;
                    aVar2.mo62997g(5, 2, j, j2, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0, nVar3.f124874e1);
                    return;
                }
                return;
            case 9528:
                if (this.f124892d.f124841G != null) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", this.f124892d.f124841G.msg_options.complaint_url);
                    C88144b.m109791i(this.f124892d.f124838D, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    return;
                }
                return;
            case 9529:
                C46337n nVar4 = this.f124892d;
                if (nVar4.f124859U0 != null && nVar4.f124861V0 != null && (chatroomJumpInfo = nVar4.f124865X0) != null && (jumpInfo = chatroomJumpInfo.manage_jump_info) != null) {
                    String str = jumpInfo.jump_url;
                    if (!Util.isNullOrNil(str)) {
                        String b = C53601h.m60123b(str, "username=" + this.f124892d.f124859U0.getUserName());
                        if (this.f124892d.f124861V0.mo62196E0() != null) {
                            b = C53601h.m60123b(b, "from_role=" + this.f124892d.f124861V0.mo62196E0().role);
                        }
                        if (this.f124892d.f124859U0.mo62196E0() != null) {
                            b = C53601h.m60123b(b, "to_role=" + this.f124892d.f124859U0.mo62196E0().role);
                        }
                        String b2 = C53601h.m60123b(b, "chatroom_name=" + this.f124892d.f124869Z0);
                        JumpInfo jumpInfo2 = new JumpInfo();
                        try {
                            jumpInfo2.parseFrom(this.f124892d.f124865X0.manage_jump_info.toByteArray());
                            jumpInfo2.jump_url = b2;
                            C53601h.m60129h(this.f124892d.f124838D, jumpInfo2);
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 9530:
                C46337n nVar5 = this.f124892d;
                ChatroomMsgPack chatroomMsgPack2 = nVar5.f124841G;
                if (chatroomMsgPack2 != null) {
                    long j3 = chatroomMsgPack2.seq;
                    C77407n nVar6 = new C77407n(nVar5.f124838D, 1, true);
                    nVar6.f225771i = new C46344r(nVar5);
                    nVar6.f225782p = new C46345s(nVar5, j3);
                    nVar6.mo107570o(true);
                    View inflate = LayoutInflater.from(nVar5.f124838D).inflate(C0966R.C0971layout.axw, (ViewGroup) null);
                    ((TextView) inflate.findViewById(C0966R.C0970id.f359196jj2)).setText(C0966R.string.f361359j73);
                    nVar6.mo107569n(inflate, false);
                    nVar6.mo107573q();
                    return;
                }
                return;
            case 9531:
                C46337n nVar7 = this.f124892d;
                ChatroomMsgPack chatroomMsgPack3 = nVar7.f124841G;
                if (chatroomMsgPack3 != null) {
                    C46337n.m51653y(nVar7, chatroomMsgPack3.seq, true);
                    return;
                }
                return;
            case 9532:
                C46337n nVar8 = this.f124892d;
                ChatroomMsgPack chatroomMsgPack4 = nVar8.f124841G;
                if (chatroomMsgPack4 != null) {
                    C46337n.m51653y(nVar8, chatroomMsgPack4.seq, false);
                    return;
                }
                return;
            case 9533:
                if (this.f124892d.f124841G != null) {
                    ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new ChatRoomLocateInfoEvent();
                    ChatRoomLocateInfoEvent.C40051a aVar3 = chatRoomLocateInfoEvent.f107403d;
                    aVar3.f107404a = 0;
                    aVar3.f107405b = this.f124892d.f124841G.seq;
                    aVar3.f107406c = true;
                    chatRoomLocateInfoEvent.publish();
                    C40308d.C40309a aVar4 = C40308d.f108375a;
                    C46337n nVar9 = this.f124892d;
                    long j4 = nVar9.f124840F;
                    long j5 = nVar9.f124839E;
                    ChatroomMsgPack chatroomMsgPack5 = nVar9.f124841G;
                    aVar4.mo62997g(13, 2, j4, j5, chatroomMsgPack5.seq, chatroomMsgPack5.from_username, 0, nVar9.f124874e1);
                    return;
                }
                return;
            case 9534:
                C46337n nVar10 = this.f124892d;
                ChatroomMsgPack chatroomMsgPack6 = nVar10.f124841G;
                if (chatroomMsgPack6 != null && (msgOptions = chatroomMsgPack6.msg_options) != null && (voteInfo = msgOptions.vote_info) != null && voteInfo.can_vote) {
                    C86709a0.m107524d().mo123460f(voteInfo.voted_by_me ? new C39870v(nVar10.f124869Z0, chatroomMsgPack6.seq, false, chatroomMsgPack6.from_username, 15) : new C39870v(nVar10.f124869Z0, chatroomMsgPack6.seq, true, chatroomMsgPack6.from_username, 15));
                    return;
                }
                return;
            default:
                this.f124892d.mo71727L(menuItem.getItemId());
                return;
        }
    }
}
