package e32;

import android.content.Intent;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import p740wo.C53193b;
import wd3.C65953v0;

/* renamed from: e32.c */
public final class C75553c implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ C75550b f221948a;

    /* renamed from: b */
    public final /* synthetic */ String f221949b;

    public C75553c(C75550b bVar, String str) {
        this.f221948a = bVar;
        this.f221949b = str;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        if (z) {
            Intent intent = new Intent(this.f221948a.getContext(), LuckyMoneyPrepareUI.class);
            if (this.f221948a.f221944f) {
                C115669n nVar = C115669n.INSTANCE;
                C75550b bVar = this.f221948a;
                String str2 = bVar.f221942d;
                nVar.mo160131h(27809, 3, str2, str2, this.f221949b, bVar.f221943e, Long.valueOf(System.currentTimeMillis()), 12);
                intent.putExtra("key_way", 11);
            } else {
                C115669n nVar2 = C115669n.INSTANCE;
                C75550b bVar2 = this.f221948a;
                String str3 = bVar2.f221942d;
                nVar2.mo160131h(27809, 3, str3, str3, this.f221949b, bVar2.f221943e, Long.valueOf(System.currentTimeMillis()), 10);
                intent.putExtra("key_way", 9);
            }
            if (C72996z1.m85820U5(this.f221949b)) {
                intent.putExtra("key_chatroom_num", ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(this.f221949b));
                intent.putExtra("key_type", 1);
                intent.putExtra("key_from", 1);
                intent.putExtra("key_username", this.f221949b);
                intent.putExtra("pay_channel", 14);
                intent.putExtra("key_enter_from_quick_send_packet", true);
                intent.putExtra("key_session_id", this.f221948a.f221943e);
                intent.putExtra("key_quick_send_packet_origin_materialid", this.f221948a.f221942d);
            } else {
                intent.putExtra("key_type", 0);
                intent.putExtra("key_from", 1);
                intent.putExtra("key_username", this.f221949b);
                intent.putExtra("pay_channel", 11);
                intent.putExtra("key_enter_from_quick_send_packet", true);
                intent.putExtra("key_session_id", this.f221948a.f221943e);
                intent.putExtra("key_quick_send_packet_origin_materialid", this.f221948a.f221942d);
            }
            this.f221948a.getActivity().startActivityForResult(intent, this.f221948a.f221945g);
        } else if (this.f221948a.f221944f) {
            C115669n nVar3 = C115669n.INSTANCE;
            C75550b bVar3 = this.f221948a;
            String str4 = bVar3.f221942d;
            nVar3.mo160131h(27809, 4, str4, str4, this.f221949b, bVar3.f221943e, Long.valueOf(System.currentTimeMillis()), 12);
        } else {
            C115669n nVar4 = C115669n.INSTANCE;
            C75550b bVar4 = this.f221948a;
            String str5 = bVar4.f221942d;
            nVar4.mo160131h(27809, 4, str5, str5, this.f221949b, bVar4.f221943e, Long.valueOf(System.currentTimeMillis()), 10);
        }
    }
}
