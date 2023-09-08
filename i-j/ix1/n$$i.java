package ix1;

import android.view.ContextMenu;
import android.view.View;
import ax1.C39641d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomJumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChosenInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgOptions;
import com.tencent.p014mm.plugin.game.autogen.chatroom.VoteInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76874e0;
import nj3.C76891l0;
import yw1.C53601h;

public class n$$i implements C76891l0 {

    /* renamed from: a */
    public final /* synthetic */ C46337n f124891a;

    public n$$i(C46337n nVar) {
        this.f124891a = nVar;
    }

    /* renamed from: a */
    public void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C39641d dVar;
        C46337n nVar;
        ChatroomJumpInfo chatroomJumpInfo;
        C39641d dVar2;
        MsgOptions msgOptions;
        C39641d dVar3;
        MsgOptions msgOptions2;
        VoteInfo voteInfo;
        ChatroomMsgPack chatroomMsgPack;
        C46337n nVar2;
        ChatroomMsgPack chatroomMsgPack2;
        ChosenInfo chosenInfo;
        C76874e0 e0Var2 = e0Var;
        C39641d dVar4 = this.f124891a.f124861V0;
        if (!(dVar4 == null || !dVar4.mo62206j1() || (chatroomMsgPack2 = nVar2.f124841G) == null)) {
            if (chatroomMsgPack2.channel_id == 1) {
                e0Var2.mo107144g(9532, nVar2.f124838D.getString(C0966R.string.f7m), C0966R.raw.icons_filled_remove_chosen);
                C40308d.C40309a aVar = C40308d.f108375a;
                C46337n nVar3 = this.f124891a;
                long j = nVar3.f124840F;
                long j2 = nVar3.f124839E;
                ChatroomMsgPack chatroomMsgPack3 = nVar3.f124841G;
                aVar.mo62997g(12, 1, j, j2, chatroomMsgPack3.seq, chatroomMsgPack3.from_username, 0, nVar3.f124874e1);
            } else {
                MsgOptions msgOptions3 = chatroomMsgPack2.msg_options;
                if (!(msgOptions3 == null || (chosenInfo = msgOptions3.chosen_info) == null || !chosenInfo.can_be_chosen)) {
                    e0Var2.mo107144g(9531, (nVar2 = this.f124891a).f124838D.getString(C0966R.string.f7h), C0966R.raw.icons_filled_add_chosen);
                    C40308d.C40309a aVar2 = C40308d.f108375a;
                    C46337n nVar4 = this.f124891a;
                    long j3 = nVar4.f124840F;
                    long j4 = nVar4.f124839E;
                    ChatroomMsgPack chatroomMsgPack4 = nVar4.f124841G;
                    aVar2.mo62997g(11, 1, j3, j4, chatroomMsgPack4.seq, chatroomMsgPack4.from_username, 0, nVar4.f124874e1);
                }
            }
        }
        C46337n nVar5 = this.f124891a;
        if (!(nVar5.f124874e1 == 0) && (chatroomMsgPack = nVar5.f124841G) != null && chatroomMsgPack.seq >= nVar5.f124875f1) {
            e0Var2.mo107144g(9533, nVar5.f124838D.getString(C0966R.string.f7k), C0966R.raw.icons_filled_chats);
            C40308d.C40309a aVar3 = C40308d.f108375a;
            C46337n nVar6 = this.f124891a;
            long j5 = nVar6.f124840F;
            long j6 = nVar6.f124839E;
            ChatroomMsgPack chatroomMsgPack5 = nVar6.f124841G;
            aVar3.mo62997g(13, 1, j5, j6, chatroomMsgPack5.seq, chatroomMsgPack5.from_username, 0, nVar6.f124874e1);
        }
        C39641d dVar5 = this.f124891a.f124859U0;
        if (dVar5 != null && dVar5.mo62198Q1() && !C53601h.m60126e(this.f124891a.f124869Z0).f150605b) {
            e0Var2.mo107144g(9527, this.f124891a.f124838D.getString(C0966R.string.f7i), C0966R.raw.icons_outlined_at);
            C46337n nVar7 = this.f124891a;
            ChatroomMsgPack chatroomMsgPack6 = nVar7.f124841G;
            if (chatroomMsgPack6 != null) {
                C40308d.f108375a.mo62997g(5, 1, nVar7.f124840F, nVar7.f124839E, chatroomMsgPack6.seq, chatroomMsgPack6.from_username, 0, nVar7.f124874e1);
            }
        }
        C46337n nVar8 = this.f124891a;
        ChatroomMsgPack chatroomMsgPack7 = nVar8.f124841G;
        if (!(chatroomMsgPack7 == null || (msgOptions2 = chatroomMsgPack7.msg_options) == null || (voteInfo = msgOptions2.vote_info) == null || !voteInfo.can_vote)) {
            if (voteInfo.voted_by_me) {
                e0Var2.mo107144g(9534, nVar8.f124838D.getString(C0966R.string.i3i), C0966R.raw.icons_filled_game_no_favour_menu);
            } else {
                e0Var2.mo107144g(9534, nVar8.f124838D.getString(C0966R.string.f7378ej), C0966R.raw.icons_filled_game_no_favour_menu);
            }
            C46337n nVar9 = this.f124891a;
            ChatroomMsgPack chatroomMsgPack8 = nVar9.f124841G;
            if (chatroomMsgPack8 != null) {
                C40308d.f108375a.mo62997g(15, 1, nVar9.f124840F, nVar9.f124839E, chatroomMsgPack8.seq, chatroomMsgPack8.from_username, 0, nVar9.f124874e1);
            }
        }
        ChatroomMsgPack chatroomMsgPack9 = this.f124891a.f124841G;
        if (!(chatroomMsgPack9 == null || (msgOptions = chatroomMsgPack9.msg_options) == null || Util.isNullOrNil(msgOptions.complaint_url) || (dVar3 = this.f124891a.f124861V0) == null || Util.nullAsNil(dVar3.getUserName()).equals(this.f124891a.f124841G.from_username))) {
            e0Var2.mo107144g(9528, this.f124891a.f124838D.getString(C0966R.string.f7968xs), C0966R.raw.icons_filled_report_problem);
        }
        C46337n nVar10 = this.f124891a;
        if (!(nVar10.f124841G == null || (dVar2 = nVar10.f124861V0) == null || !dVar2.mo62206j1())) {
            C46337n nVar11 = this.f124891a;
            if (nVar11.f124874e1 == 0) {
                e0Var2.mo107144g(9530, nVar11.f124838D.getString(C0966R.string.f7n), C0966R.raw.icons_filled_eyes_off);
                C46337n nVar12 = this.f124891a;
                ChatroomMsgPack chatroomMsgPack10 = nVar12.f124841G;
                if (chatroomMsgPack10 != null) {
                    C40308d.f108375a.mo62997g(10, 1, nVar12.f124840F, nVar12.f124839E, chatroomMsgPack10.seq, chatroomMsgPack10.from_username, 0, nVar12.f124874e1);
                }
            }
        }
        C39641d dVar6 = this.f124891a.f124859U0;
        if (!(dVar6 == null || !dVar6.mo62197K0() || (dVar = this.f124891a.f124861V0) == null || !dVar.mo62200b1() || (chatroomJumpInfo = nVar.f124865X0) == null || chatroomJumpInfo.manage_jump_info == null)) {
            e0Var2.mo107144g(9529, (nVar = this.f124891a).f124838D.getString(C0966R.string.f7l), C0966R.raw.icons_filled_more2);
        }
        this.f124891a.mo71726J(e0Var2);
    }
}
