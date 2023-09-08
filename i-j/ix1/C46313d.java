package ix1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import gy3.C87412m;
import uy1.C52645f;
import yw1.C53601h;

/* renamed from: ix1.d */
public final class C46313d extends C46337n {

    /* renamed from: g1 */
    public ImageView f124777g1;

    /* renamed from: h1 */
    public ImageView f124778h1;

    /* renamed from: i1 */
    public MMNeat7extView f124779i1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46313d(View view, int i) {
        super(view, i);
        C87412m.m108594g(view, "itemView");
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        MsgContent msgContent;
        ChatroomMsgImgCard chatroomMsgImgCard;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgImgCard = msgContent.chatroom_img_card) != null) {
            C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
            aVar.f147024e = false;
            C52645f a = C52645f.m59023a();
            ImageView imageView = this.f124777g1;
            if (imageView != null) {
                a.mo73595e(imageView, chatroomMsgImgCard.pic_url, aVar.mo73598a(), (C52645f.C52652e) null);
                if (chatroomMsgImgCard.show_video_play) {
                    ImageView imageView2 = this.f124778h1;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    } else {
                        C87412m.m108603p("playImg");
                        throw null;
                    }
                } else {
                    ImageView imageView3 = this.f124778h1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    } else {
                        C87412m.m108603p("playImg");
                        throw null;
                    }
                }
                MMNeat7extView mMNeat7extView = this.f124779i1;
                if (mMNeat7extView != null) {
                    mMNeat7extView.mo104279b(chatroomMsgImgCard.desc);
                } else {
                    C87412m.m108603p("descTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("bgImg");
                throw null;
            }
        }
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.f359803av3, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.f358449f62);
        C87412m.m108593f(findViewById, "bodyView.findViewById(R.id.img_card_bg)");
        this.f124777g1 = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.f3s);
        C87412m.m108593f(findViewById2, "bodyView.findViewById(R.…age_card_video_play_icon)");
        this.f124778h1 = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.f3r);
        C87412m.m108593f(findViewById3, "bodyView.findViewById(R.id.image_card_desc)");
        this.f124779i1 = (MMNeat7extView) findViewById3;
        return inflate;
    }

    /* renamed from: K */
    public void mo71707K(View view) {
        MsgContent msgContent;
        ChatroomMsgImgCard chatroomMsgImgCard;
        ChatroomMsgPack chatroomMsgPack = this.f124841G;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgImgCard = msgContent.chatroom_img_card) != null && !mo71734I()) {
            C53601h.m60129h(this.f124838D, chatroomMsgImgCard.img_jump_info);
        }
    }
}
