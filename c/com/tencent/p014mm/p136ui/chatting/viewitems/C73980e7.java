package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73953d7;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72963f4;
import de3.C75369r;
import di3.C86312j;
import eb0.C97625j3;
import java.util.regex.Matcher;
import p629ny.C76979h;
import uc0.C52515a;
import uc0.C52517f0;
import uj3.C78208e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.e7 */
public class C73980e7 extends C73953d7.C73954a {
    /* renamed from: a */
    public void mo103021a(C74023i.C74026c cVar, C78208e eVar, C67391b bVar, C72963f4 f4Var, String str) {
        Class cls = C76979h.class;
        C73953d7.C73955b bVar2 = (C73953d7.C73955b) cVar;
        bVar2.f217055b.mo104279b(f4Var.getContent());
        bVar2.f217055b.setTag(new C74243t8(f4Var, bVar.mo91583x(), bVar2, (String) null));
        Bundle bundle = new Bundle();
        bundle.putString("chatroom_name", bVar.mo91577r());
        bundle.putLong("msg_id", f4Var.getMsgId());
        String content = f4Var.getContent();
        if (f4Var.getType() == 268445456) {
            content = f4Var.f230762x0;
        }
        String str2 = content;
        if ((f4Var.mo108762o2() & 8) != 0) {
            bVar2.f217055b.mo104280c(((C76979h) C86312j.m106911c(cls)).mo107066eo(bVar.mo91565f(), str2, (int) bVar2.f217055b.getTextSize(), false, 1, bundle), TextView.BufferType.SPANNABLE, (Boolean) null);
            bVar2.f217055b.setClickable(true);
        } else {
            bVar2.f217055b.mo104280c(((C76979h) C86312j.m106911c(cls)).mo107066eo(bVar.mo91565f(), str2, (int) bVar2.f217055b.getTextSize(), true, 1, bundle), TextView.BufferType.SPANNABLE, (Boolean) null);
        }
        if (f4Var.getContent().contains("weixin://wxpay/transfer/remindrcvmsg")) {
            Matcher matcher = C75369r.f221592h.matcher(f4Var.getContent());
            if (matcher.find()) {
                Uri parse = Uri.parse(matcher.group(1));
                String queryParameter = parse.getQueryParameter("transferid");
                String queryParameter2 = parse.getQueryParameter("transfer_msg_type");
                C115669n.INSTANCE.mo160131h(20467, "transfer_to_change", "read message", "", "", "", "", 4, queryParameter, queryParameter2);
            }
        }
        C52515a jo = C52517f0.vx0().mo73451jo(bVar.mo91577r());
        int intValue = ((Integer) C97625j3.m125812b().mo105906u().mo119684e(12311, -2)).intValue();
        if ((jo == null || jo.f146672b == -2) && (jo != null || intValue == -2)) {
            bVar2.f217055b.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.FG_2));
            bVar2.f217055b.setBackground(bVar.mo91565f().getResources().getDrawable(C0966R.C0969drawable.f4746lo));
        } else {
            bVar2.f217055b.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f3245kn));
            bVar2.f217055b.setBackground(bVar.mo91565f().getResources().getDrawable(C0966R.C0969drawable.f4747lp));
        }
        bVar2.f217055b.invalidate();
    }
}
