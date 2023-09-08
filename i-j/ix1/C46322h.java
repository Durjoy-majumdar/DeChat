package ix1;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax1.C39641d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgNotice;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgTpl;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TickleInfo;
import de3.C107029o;
import de3.C75355a0;

/* renamed from: ix1.h */
public class C46322h extends C46337n {

    /* renamed from: g1 */
    public MMNeat7extView f124808g1;

    /* renamed from: h1 */
    public C46331k0 f124809h1 = new C46331k0();

    /* renamed from: ix1.h$a */
    public class C46323a implements C46329j0 {

        /* renamed from: a */
        public final /* synthetic */ ChatroomMsgPack f124810a;

        public C46323a(ChatroomMsgPack chatroomMsgPack) {
            this.f124810a = chatroomMsgPack;
        }

        /* renamed from: a */
        public void mo71723a(SpannableStringBuilder spannableStringBuilder) {
            C39641d dVar;
            if (spannableStringBuilder != null) {
                C46322h hVar = C46322h.this;
                MMNeat7extView mMNeat7extView = hVar.f124808g1;
                ChatroomMsgPack chatroomMsgPack = this.f124810a;
                hVar.getClass();
                TickleInfo tickleInfo = chatroomMsgPack.msg_options.tickle_info;
                if (tickleInfo != null && tickleInfo.is_tickle && (dVar = hVar.f124861V0) != null && (dVar.getUserName().equals(chatroomMsgPack.from_username) || dVar.getUserName().equals(chatroomMsgPack.msg_options.tickle_info.to_username))) {
                    spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 18);
                }
                mMNeat7extView.mo104279b(spannableStringBuilder);
            }
        }

        /* renamed from: b */
        public void mo71724b(long j) {
            C40308d.C40309a aVar = C40308d.f108375a;
            C46322h hVar = C46322h.this;
            long j2 = hVar.f124840F;
            long j3 = hVar.f124839E;
            ChatroomMsgPack chatroomMsgPack = this.f124810a;
            aVar.mo62997g(1, j, j2, j3, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0, hVar.f124874e1);
        }
    }

    public C46322h(View view, int i) {
        super(view, i);
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        MsgContent msgContent;
        ChatroomMsgNotice chatroomMsgNotice;
        ChatroomMsgTpl chatroomMsgTpl;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgNotice = msgContent.chatroom_notice) != null && (chatroomMsgTpl = chatroomMsgNotice.chatroom_msg_tpl) != null) {
            this.f124809h1.mo71728a(this.f124838D, chatroomMsgTpl.tpl_block_list, mo71734I(), new C46323a(chatroomMsgPack));
        }
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.av9, viewGroup, false);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.eic);
        this.f124808g1 = mMNeat7extView;
        mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(this.f124808g1.getContext())));
        return inflate;
    }
}
