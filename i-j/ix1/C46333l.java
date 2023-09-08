package ix1;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ax1.C39639c;
import ax1.C39641d;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ChatRoomAtFunctionEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgTpl;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.plugin.game.chatroom.view.C4442t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C107029o;
import de3.C75355a0;
import di3.C86312j;
import sn0.C90259e;
import xr3.C112173c;
import yw1.C53601h;

/* renamed from: ix1.l */
public class C46333l extends C46337n {

    /* renamed from: g1 */
    public MMNeat7extView f124829g1;

    /* renamed from: h1 */
    public C46331k0 f124830h1 = new C46331k0();

    /* renamed from: ix1.l$a */
    public class C46334a extends C107029o {
        public C46334a(NeatTextView neatTextView, View.OnTouchListener onTouchListener) {
            super(neatTextView, onTouchListener);
        }

        public void onLongPress(MotionEvent motionEvent) {
            Log.m105924i("GameChatRoom.GameChatItemTplVH", C90259e.C90260a.NAME);
            C112173c cVar = this.f320039g;
            if (cVar != null) {
                CharacterStyle characterStyle = cVar.f335874g;
                if (characterStyle instanceof C4442t) {
                    C4442t tVar = (C4442t) characterStyle;
                    Object obj = tVar.f19177e;
                    if (obj instanceof C46319f0) {
                        C46319f0 f0Var = (C46319f0) obj;
                        if (!Util.isNullOrNil(f0Var.f124798d) && f0Var.f124799e) {
                            C46333l lVar = C46333l.this;
                            String str = ((C46319f0) tVar.f19177e).f124798d;
                            lVar.getClass();
                            C39641d X3 = ((C39639c) C86312j.m106911c(C39639c.class)).mo62193X3(str);
                            if (X3 != null && !lVar.mo71734I() && !C53601h.m60126e(lVar.f124869Z0).f150605b) {
                                ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = new ChatRoomAtFunctionEvent();
                                chatRoomAtFunctionEvent.f107397d.f107398a = X3.getUserName();
                                chatRoomAtFunctionEvent.f107397d.f107399b = X3.getNickName();
                                chatRoomAtFunctionEvent.publish();
                            }
                        }
                    }
                }
            }
            super.onLongPress(motionEvent);
        }
    }

    /* renamed from: ix1.l$b */
    public class C46335b implements C46329j0 {

        /* renamed from: a */
        public final /* synthetic */ ChatroomMsgPack f124832a;

        public C46335b(ChatroomMsgPack chatroomMsgPack) {
            this.f124832a = chatroomMsgPack;
        }

        /* renamed from: a */
        public void mo71723a(SpannableStringBuilder spannableStringBuilder) {
            if (spannableStringBuilder != null) {
                C46333l.this.f124829g1.mo104279b(spannableStringBuilder);
            }
        }

        /* renamed from: b */
        public void mo71724b(long j) {
            C40308d.C40309a aVar = C40308d.f108375a;
            C46333l lVar = C46333l.this;
            long j2 = lVar.f124840F;
            long j3 = lVar.f124839E;
            ChatroomMsgPack chatroomMsgPack = this.f124832a;
            aVar.mo62997g(1, j, j2, j3, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0, lVar.f124874e1);
        }
    }

    public C46333l(View view, int i) {
        super(view, i);
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        MsgContent msgContent;
        ChatroomMsgTpl chatroomMsgTpl;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgTpl = msgContent.chatroom_tpl) != null) {
            this.f124830h1.mo71728a(this.f124838D, chatroomMsgTpl.tpl_block_list, mo71734I(), new C46335b(chatroomMsgPack));
        }
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.avb, (ViewGroup) null);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.eic);
        this.f124829g1 = mMNeat7extView;
        mMNeat7extView.setOnTouchListener(new C46334a(mMNeat7extView, new C75355a0(this.f124829g1.getContext())));
        return inflate;
    }
}
