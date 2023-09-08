package ix1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;

/* renamed from: ix1.m */
public class C46336m extends C46337n {

    /* renamed from: g1 */
    public MMNeat7extView f124834g1;

    public C46336m(View view, int i) {
        super(view, i);
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        this.f124834g1.mo104279b(this.f124838D.getString(C0966R.string.f7q));
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.avb, (ViewGroup) null);
        this.f124834g1 = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.eic);
        return inflate;
    }
}
