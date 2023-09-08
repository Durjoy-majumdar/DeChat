package ix1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import gy3.C87412m;
import yw1.C53601h;

/* renamed from: ix1.g */
public final class C46320g extends C46337n {

    /* renamed from: g1 */
    public ImageView f124800g1;

    /* renamed from: h1 */
    public ImageView f124801h1;

    /* renamed from: i1 */
    public ImageView f124802i1;

    /* renamed from: j1 */
    public TextView f124803j1;

    /* renamed from: k1 */
    public View f124804k1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46320g(View view, int i) {
        super(view, i);
        C87412m.m108594g(view, "itemView");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r2.getHeight() != r1.pic_height) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ad, code lost:
        if (r2.getHeight() != r1.pic_height) goto L_0x00b4;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71705B(com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            if (r1 == 0) goto L_0x02dc
            com.tencent.mm.plugin.game.autogen.chatroom.MsgContent r1 = r1.msg_content
            if (r1 == 0) goto L_0x02dc
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink r1 = r1.chatroom_img_link
            if (r1 == 0) goto L_0x02dc
            int r2 = r1.pic_width
            r3 = 140(0x8c, float:1.96E-43)
            r4 = 8
            java.lang.String r5 = "portraitImg"
            r6 = 0
            java.lang.String r7 = "landscapeImg"
            r8 = 0
            if (r2 == 0) goto L_0x00ed
            int r9 = r1.pic_height
            if (r9 != 0) goto L_0x0022
            goto L_0x00ed
        L_0x0022:
            if (r2 <= r9) goto L_0x0089
            android.widget.ImageView r2 = r0.f124800g1
            if (r2 == 0) goto L_0x0085
            r2.setVisibility(r6)
            android.widget.ImageView r2 = r0.f124800g1
            if (r2 == 0) goto L_0x0081
            int r2 = r2.getWidth()
            int r9 = r1.pic_width
            if (r2 != r9) goto L_0x0048
            android.widget.ImageView r2 = r0.f124800g1
            if (r2 == 0) goto L_0x0044
            int r2 = r2.getHeight()
            int r9 = r1.pic_height
            if (r2 == r9) goto L_0x006c
            goto L_0x0048
        L_0x0044:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x0048:
            android.widget.ImageView r2 = r0.f124800g1
            if (r2 == 0) goto L_0x007d
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.content.Context r9 = r0.f124838D
            int r3 = kg3.C76577a.m92151b(r9, r3)
            r2.width = r3
            float r3 = (float) r3
            int r9 = r1.pic_height
            float r9 = (float) r9
            float r3 = r3 * r9
            int r9 = r1.pic_width
            float r9 = (float) r9
            float r3 = r3 / r9
            int r3 = (int) r3
            r2.height = r3
            android.widget.ImageView r3 = r0.f124800g1
            if (r3 == 0) goto L_0x0079
            r3.setLayoutParams(r2)
        L_0x006c:
            android.widget.ImageView r2 = r0.f124801h1
            if (r2 == 0) goto L_0x0075
            r2.setVisibility(r4)
            goto L_0x011c
        L_0x0075:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x0079:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x007d:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x0081:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x0085:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x0089:
            android.widget.ImageView r2 = r0.f124800g1
            if (r2 == 0) goto L_0x00e9
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r0.f124801h1
            if (r2 == 0) goto L_0x00e5
            r2.setVisibility(r6)
            android.widget.ImageView r2 = r0.f124801h1
            if (r2 == 0) goto L_0x00e1
            int r2 = r2.getWidth()
            int r9 = r1.pic_width
            if (r2 != r9) goto L_0x00b4
            android.widget.ImageView r2 = r0.f124801h1
            if (r2 == 0) goto L_0x00b0
            int r2 = r2.getHeight()
            int r9 = r1.pic_height
            if (r2 == r9) goto L_0x011c
            goto L_0x00b4
        L_0x00b0:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x00b4:
            android.widget.ImageView r2 = r0.f124801h1
            if (r2 == 0) goto L_0x00dd
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.content.Context r9 = r0.f124838D
            int r3 = kg3.C76577a.m92151b(r9, r3)
            r2.height = r3
            float r3 = (float) r3
            int r9 = r1.pic_width
            float r9 = (float) r9
            float r3 = r3 * r9
            int r9 = r1.pic_height
            float r9 = (float) r9
            float r3 = r3 / r9
            int r3 = (int) r3
            r2.width = r3
            android.widget.ImageView r3 = r0.f124801h1
            if (r3 == 0) goto L_0x00d9
            r3.setLayoutParams(r2)
            goto L_0x011c
        L_0x00d9:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x00dd:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x00e1:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x00e5:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x00e9:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x00ed:
            android.widget.ImageView r2 = r0.f124800g1
            if (r2 == 0) goto L_0x02d8
            r2.setVisibility(r6)
            android.widget.ImageView r2 = r0.f124800g1
            if (r2 == 0) goto L_0x02d4
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.content.Context r9 = r0.f124838D
            int r3 = kg3.C76577a.m92151b(r9, r3)
            r2.width = r3
            android.content.Context r3 = r0.f124838D
            r9 = 78
            int r3 = kg3.C76577a.m92151b(r3, r9)
            r2.height = r3
            android.widget.ImageView r3 = r0.f124800g1
            if (r3 == 0) goto L_0x02d0
            r3.setLayoutParams(r2)
            android.widget.ImageView r2 = r0.f124801h1
            if (r2 == 0) goto L_0x02cc
            r2.setVisibility(r4)
        L_0x011c:
            uy1.f$d$a r2 = new uy1.f$d$a
            r2.<init>()
            r2.f147024e = r6
            android.widget.ImageView r3 = r0.f124800g1
            if (r3 == 0) goto L_0x02c8
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0143
            uy1.f r3 = uy1.C52645f.m59023a()
            android.widget.ImageView r9 = r0.f124800g1
            if (r9 == 0) goto L_0x013f
            java.lang.String r10 = r1.pic_url
            uy1.f$d r2 = r2.mo73598a()
            r3.mo73595e(r9, r10, r2, r8)
            goto L_0x0154
        L_0x013f:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x0143:
            uy1.f r3 = uy1.C52645f.m59023a()
            android.widget.ImageView r9 = r0.f124801h1
            if (r9 == 0) goto L_0x02c4
            java.lang.String r10 = r1.pic_url
            uy1.f$d r2 = r2.mo73598a()
            r3.mo73595e(r9, r10, r2, r8)
        L_0x0154:
            android.widget.TextView r2 = r0.f124803j1
            java.lang.String r3 = "videoTime"
            if (r2 == 0) goto L_0x02c0
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r0.f124802i1
            java.lang.String r9 = "playIcon"
            if (r2 == 0) goto L_0x02bc
            r2.setVisibility(r4)
            android.view.View r2 = r0.f124804k1
            java.lang.String r18 = "maskView"
            if (r2 == 0) goto L_0x02b8
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r15.mo10233c(r10)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemMsgImgLinkVH"
            java.lang.String r13 = "bindMsgData"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomMsgPack;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r10 = r2
            r4 = r15
            r15 = r16
            r16 = r17
            r17 = r19
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r11 = "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemMsgImgLinkVH"
            java.lang.String r12 = "bindMsgData"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomMsgPack;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            int r2 = r1.type
            r4 = 1
            if (r2 != r4) goto L_0x02dc
            android.widget.TextView r2 = r0.f124803j1
            if (r2 == 0) goto L_0x02b4
            r2.setVisibility(r6)
            android.widget.TextView r2 = r0.f124803j1
            if (r2 == 0) goto L_0x02b0
            int r1 = r1.playtime
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.formatSecToMin(r1)
            r2.setText(r1)
            android.widget.ImageView r1 = r0.f124802i1
            if (r1 == 0) goto L_0x02ac
            r1.setVisibility(r6)
            android.view.View r1 = r0.f124804k1
            if (r1 == 0) goto L_0x02a8
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2.mo10233c(r4)
            java.lang.Object[] r11 = r2.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemMsgImgLinkVH"
            java.lang.String r13 = "bindMsgData"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomMsgPack;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r11 = "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemMsgImgLinkVH"
            java.lang.String r12 = "bindMsgData"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomMsgPack;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.widget.ImageView r1 = r0.f124800g1
            if (r1 == 0) goto L_0x02a4
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0224
            android.widget.ImageView r1 = r0.f124800g1
            if (r1 == 0) goto L_0x0220
            goto L_0x0228
        L_0x0220:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x0224:
            android.widget.ImageView r1 = r0.f124801h1
            if (r1 == 0) goto L_0x02a0
        L_0x0228:
            android.widget.ImageView r2 = r0.f124802i1
            if (r2 == 0) goto L_0x029c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            gy3.C87412m.m108592e(r2, r4)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r5 = 13
            r2.addRule(r5)
            android.widget.ImageView r5 = r0.f124802i1
            if (r5 == 0) goto L_0x0298
            r5.setLayoutParams(r2)
            android.widget.TextView r2 = r0.f124803j1
            if (r2 == 0) goto L_0x0294
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            gy3.C87412m.m108592e(r2, r4)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            int r4 = r1.getId()
            r5 = 8
            r2.addRule(r5, r4)
            r4 = 7
            int r5 = r1.getId()
            r2.addRule(r4, r5)
            android.widget.TextView r4 = r0.f124803j1
            if (r4 == 0) goto L_0x0290
            r4.setLayoutParams(r2)
            android.view.View r2 = r0.f124804k1
            if (r2 == 0) goto L_0x028c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            int r3 = r3.height
            r2.height = r3
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r1 = r1.width
            r2.width = r1
            android.view.View r1 = r0.f124804k1
            if (r1 == 0) goto L_0x0288
            r1.setLayoutParams(r2)
            goto L_0x02dc
        L_0x0288:
            gy3.C87412m.m108603p(r18)
            throw r8
        L_0x028c:
            gy3.C87412m.m108603p(r18)
            throw r8
        L_0x0290:
            gy3.C87412m.m108603p(r3)
            throw r8
        L_0x0294:
            gy3.C87412m.m108603p(r3)
            throw r8
        L_0x0298:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x029c:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x02a0:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x02a4:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x02a8:
            gy3.C87412m.m108603p(r18)
            throw r8
        L_0x02ac:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x02b0:
            gy3.C87412m.m108603p(r3)
            throw r8
        L_0x02b4:
            gy3.C87412m.m108603p(r3)
            throw r8
        L_0x02b8:
            gy3.C87412m.m108603p(r18)
            throw r8
        L_0x02bc:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x02c0:
            gy3.C87412m.m108603p(r3)
            throw r8
        L_0x02c4:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x02c8:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x02cc:
            gy3.C87412m.m108603p(r5)
            throw r8
        L_0x02d0:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x02d4:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x02d8:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x02dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ix1.C46320g.mo71705B(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack):void");
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.av4, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.eid);
        C87412m.m108593f(findViewById, "bodyView.findViewById(R.….game_chat_landscape_img)");
        this.f124800g1 = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.eif);
        C87412m.m108593f(findViewById2, "bodyView.findViewById(R.id.game_chat_portrait_img)");
        this.f124801h1 = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.eih);
        C87412m.m108593f(findViewById3, "bodyView.findViewById(R.…ame_chat_video_play_icon)");
        this.f124802i1 = (ImageView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.eii);
        C87412m.m108593f(findViewById4, "bodyView.findViewById(R.id.game_chat_video_time)");
        this.f124803j1 = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.eig);
        C87412m.m108593f(findViewById5, "bodyView.findViewById(R.id.game_chat_video_mask)");
        this.f124804k1 = findViewById5;
        return inflate;
    }

    /* renamed from: K */
    public void mo71707K(View view) {
        MsgContent msgContent;
        ChatroomMsgImgLink chatroomMsgImgLink;
        long j;
        ChatroomMsgPack chatroomMsgPack = this.f124841G;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgImgLink = msgContent.chatroom_img_link) != null && !mo71734I()) {
            int h = C53601h.m60129h(this.f124838D, chatroomMsgImgLink.jump_info);
            if (h == 1) {
                j = 6;
            } else if (h == 2) {
                j = 7;
            } else if (h == 3) {
                j = 28;
            } else {
                return;
            }
            long j2 = j;
            C40308d.C40309a aVar = C40308d.f108375a;
            long j3 = this.f124840F;
            long j4 = this.f124839E;
            ChatroomMsgPack chatroomMsgPack2 = this.f124841G;
            C40308d.C40309a.m43462j(aVar, 1, j2, j3, j4, chatroomMsgPack2.seq, chatroomMsgPack2.from_username, 0, this.f124874e1, (String) null, 256, (Object) null);
        }
    }
}
