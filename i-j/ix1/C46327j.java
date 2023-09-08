package ix1;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgSys;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgTpl;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.plugin.game.chatroom.view.C69010m;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C107029o;
import de3.C75355a0;
import di3.C86312j;
import kg3.C76577a;
import p629ny.C76979h;
import zp3.C79406f;

/* renamed from: ix1.j */
public class C46327j extends C46337n {

    /* renamed from: g1 */
    public MMNeat7extView f124819g1;

    /* renamed from: h1 */
    public C46331k0 f124820h1 = new C46331k0();

    /* renamed from: ix1.j$a */
    public class C46328a implements C46329j0 {

        /* renamed from: a */
        public final /* synthetic */ ChatroomMsgPack f124821a;

        public C46328a(ChatroomMsgPack chatroomMsgPack) {
            this.f124821a = chatroomMsgPack;
        }

        /* renamed from: a */
        public void mo71723a(SpannableStringBuilder spannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (spannableStringBuilder != null) {
                String str = this.f124821a.msg_content.chatroom_sys.title;
                if (!Util.isNullOrNil(str)) {
                    SpannableString spannableString = new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(C46327j.this.f124838D, str));
                    spannableString.setSpan(new C69010m(str, C46327j.this.f124838D.getResources().getColor(C0966R.color.BW_100_Alpha_0_3), C46327j.this.f124838D.getResources().getColor(C0966R.color.BW_100_Alpha_0_8), (int) (((float) C79406f.m96347a(C46327j.this.f124838D, 10.0f)) * C76577a.m92165p(C46327j.this.f124838D)), C79406f.m96347a(C46327j.this.f124838D, 13.0f), C79406f.m96347a(C46327j.this.f124838D, 6.0f), C79406f.m96347a(C46327j.this.f124838D, 6.0f), C79406f.m96347a(C46327j.this.f124838D, 3.0f), C79406f.m96347a(C46327j.this.f124838D, 3.0f)), 0, str.length(), 33);
                    spannableStringBuilder2.append(spannableString).append("  ").append(spannableStringBuilder);
                } else {
                    spannableStringBuilder2.append(spannableStringBuilder);
                }
                C46327j.this.f124819g1.mo104279b(spannableStringBuilder2);
            }
        }

        /* renamed from: b */
        public void mo71724b(long j) {
            C40308d.C40309a aVar = C40308d.f108375a;
            C46327j jVar = C46327j.this;
            long j2 = jVar.f124840F;
            long j3 = jVar.f124839E;
            ChatroomMsgPack chatroomMsgPack = this.f124821a;
            aVar.mo62997g(1, j, j2, j3, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0, jVar.f124874e1);
        }
    }

    public C46327j(View view, int i) {
        super(view, i);
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        MsgContent msgContent;
        ChatroomMsgSys chatroomMsgSys;
        ChatroomMsgTpl chatroomMsgTpl;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgSys = msgContent.chatroom_sys) != null && (chatroomMsgTpl = chatroomMsgSys.chatroom_msg_tpl) != null) {
            this.f124820h1.mo71728a(this.f124838D, chatroomMsgTpl.tpl_block_list, mo71734I(), new C46328a(chatroomMsgPack));
        }
    }

    /* renamed from: D */
    public boolean mo71725D() {
        return true;
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.ava, (ViewGroup) null);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.eic);
        this.f124819g1 = mMNeat7extView;
        mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(this.f124819g1.getContext())));
        return inflate;
    }
}
