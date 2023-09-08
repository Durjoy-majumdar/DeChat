package ny1;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import ny1.C100247i;
import p1081gi.C98121d;

/* renamed from: ny1.h */
public class C100246h implements C100247i.C100252d {

    /* renamed from: a */
    public final /* synthetic */ int f293695a;

    /* renamed from: b */
    public final /* synthetic */ C100247i f293696b;

    public C100246h(C100247i iVar, int i) {
        this.f293696b = iVar;
        this.f293695a = i;
    }

    /* renamed from: a */
    public void mo139530a(C100247i.C100253e eVar) {
        C100247i iVar = this.f293696b;
        int i = this.f293695a;
        iVar.getClass();
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195582i = 5;
        bVar.f195570f = eVar.f293714a;
        bVar.f195574g = Util.isNullOrNil(eVar.f293715b) ? iVar.f293698a.getString(C0966R.string.fbx) : eVar.f293715b;
        bVar.f195586j = eVar.f293717d;
        bVar.f195646y = eVar.f293716c;
        String s = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
        Intent intent = new Intent();
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_content", s);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("src_username", iVar.f293698a.getString(C0966R.string.fbx));
        intent.putExtra("src_displayname", iVar.f293698a.getString(C0966R.string.fbx));
        C88144b.m109802t(iVar.f293698a, ".ui.transmit.MsgRetransmitUI", intent, i);
    }
}
