package ix1;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgApp;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Color;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import uy1.C52645f;
import yw1.C53601h;

/* renamed from: ix1.a */
public class C46300a extends C46337n {

    /* renamed from: g1 */
    public ImageView f124749g1;

    /* renamed from: h1 */
    public Button f124750h1;

    /* renamed from: i1 */
    public TextView f124751i1;

    /* renamed from: j1 */
    public TextView f124752j1;

    /* renamed from: k1 */
    public TextView f124753k1;

    /* renamed from: ix1.a$a */
    public class C46301a implements C52645f.C52652e {

        /* renamed from: a */
        public final /* synthetic */ ChatroomMsgApp f124754a;

        /* renamed from: ix1.a$a$a */
        public class C46302a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f124756d;

            public C46302a(Bitmap bitmap) {
                this.f124756d = bitmap;
            }

            public void run() {
                Bitmap bitmap = this.f124756d;
                if (bitmap != null && !bitmap.isRecycled()) {
                    C46301a aVar = C46301a.this;
                    C46300a.this.f124749g1.setTag(aVar.f124754a.bg_pic_url);
                    C46300a.this.f124749g1.setImageBitmap(this.f124756d);
                }
            }
        }

        public C46301a(ChatroomMsgApp chatroomMsgApp) {
            this.f124754a = chatroomMsgApp;
        }

        /* renamed from: a */
        public void mo65432a(View view, Bitmap bitmap) {
            C46300a.this.f124749g1.post(new C46302a(bitmap));
        }

        /* renamed from: b */
        public void mo65433b(String str, View view) {
        }
    }

    public C46300a(View view, int i) {
        super(view, i);
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        MsgContent msgContent;
        ChatroomMsgApp chatroomMsgApp;
        String str;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgApp = msgContent.chatroom_app) != null) {
            this.f124751i1.setText(chatroomMsgApp.title);
            if (!Util.isNullOrNil(chatroomMsgApp.des)) {
                this.f124752j1.setVisibility(0);
                this.f124752j1.setText(chatroomMsgApp.des);
            } else {
                this.f124752j1.setVisibility(8);
            }
            if (!Util.isNullOrNil(chatroomMsgApp.second_des)) {
                this.f124753k1.setVisibility(0);
                this.f124753k1.setText(chatroomMsgApp.second_des);
            } else {
                this.f124753k1.setVisibility(8);
            }
            GradientDrawable gradientDrawable = (GradientDrawable) this.f124750h1.getBackground();
            if (gradientDrawable != null) {
                Color color = chatroomMsgApp.button_bg_color;
                if (color == null || (str = color.dark_color) == null) {
                    str = null;
                }
                gradientDrawable.setColor(C53601h.m60133l(str, C0966R.color.f2968ay));
            }
            this.f124750h1.setText(chatroomMsgApp.button_des);
            Object tag = this.f124749g1.getTag();
            if (!(tag instanceof String) || !((String) tag).equals(chatroomMsgApp.bg_pic_url)) {
                C52645f.m59023a().mo73595e((ImageView) null, chatroomMsgApp.bg_pic_url, (C52645f.C52650d) null, new C46301a(chatroomMsgApp));
            } else {
                Log.m105918d("GameChatRoom.GameChatItemAppVH", "dont need reload picture");
            }
        }
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.f359801av1, (ViewGroup) null);
        this.f124749g1 = (ImageView) inflate.findViewById(C0966R.C0970id.f6049vw);
        Button button = (Button) inflate.findViewById(C0966R.C0970id.f6048vv);
        this.f124750h1 = button;
        button.setClickable(false);
        this.f124751i1 = (TextView) inflate.findViewById(C0966R.C0970id.f6055w2);
        this.f124752j1 = (TextView) inflate.findViewById(C0966R.C0970id.f6051vy);
        this.f124753k1 = (TextView) inflate.findViewById(C0966R.C0970id.f6054w1);
        return inflate;
    }

    /* renamed from: K */
    public void mo71707K(View view) {
        MsgContent msgContent;
        long j;
        ChatroomMsgPack chatroomMsgPack = this.f124841G;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && msgContent.chatroom_app != null && !mo71734I()) {
            int h = C53601h.m60129h(this.f124838D, this.f124841G.msg_content.chatroom_app.jump_info);
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
            aVar.mo62997g(1, j2, j3, j4, chatroomMsgPack2.seq, chatroomMsgPack2.from_username, 0, this.f124874e1);
        }
    }
}
