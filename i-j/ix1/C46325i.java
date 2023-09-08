package ix1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import uy1.C52645f;
import yw1.C53601h;

/* renamed from: ix1.i */
public final class C46325i extends C46337n {

    /* renamed from: g1 */
    public ImageView f124814g1;

    /* renamed from: h1 */
    public MMNeat7extView f124815h1;

    /* renamed from: i1 */
    public MMNeat7extView f124816i1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46325i(View view, int i) {
        super(view, i);
        C87412m.m108594g(view, "itemView");
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        MsgContent msgContent;
        ChatroomMsgShareLink chatroomMsgShareLink;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgShareLink = msgContent.chatroom_share_link) != null) {
            if (Util.isNullOrNil(chatroomMsgShareLink.pic_url)) {
                ImageView imageView = this.f124814g1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                } else {
                    C87412m.m108603p("rightImg");
                    throw null;
                }
            } else {
                ImageView imageView2 = this.f124814g1;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                } else {
                    C87412m.m108603p("rightImg");
                    throw null;
                }
            }
            C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
            aVar.f147024e = false;
            C52645f a = C52645f.m59023a();
            ImageView imageView3 = this.f124814g1;
            if (imageView3 != null) {
                a.mo73595e(imageView3, chatroomMsgShareLink.pic_url, aVar.mo73598a(), (C52645f.C52652e) null);
                MMNeat7extView mMNeat7extView = this.f124815h1;
                if (mMNeat7extView != null) {
                    mMNeat7extView.mo104279b(chatroomMsgShareLink.title);
                    MMNeat7extView mMNeat7extView2 = this.f124816i1;
                    if (mMNeat7extView2 != null) {
                        mMNeat7extView2.mo104279b(chatroomMsgShareLink.desc);
                    } else {
                        C87412m.m108603p("descTv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("titleTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("rightImg");
                throw null;
            }
        }
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.av_, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.jia);
        C87412m.m108593f(findViewById, "bodyView.findViewById(R.id.share_link_right_pic)");
        this.f124814g1 = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.jib);
        C87412m.m108593f(findViewById2, "bodyView.findViewById(R.id.share_link_title)");
        this.f124815h1 = (MMNeat7extView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.ji_);
        C87412m.m108593f(findViewById3, "bodyView.findViewById(R.id.share_link_desc)");
        this.f124816i1 = (MMNeat7extView) findViewById3;
        return inflate;
    }

    /* renamed from: K */
    public void mo71707K(View view) {
        MsgContent msgContent;
        ChatroomMsgShareLink chatroomMsgShareLink;
        ChatroomMsgPack chatroomMsgPack = this.f124841G;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgShareLink = msgContent.chatroom_share_link) != null && !mo71734I()) {
            C53601h.m60129h(this.f124838D, chatroomMsgShareLink.jump_info);
        }
    }
}
