package gz0;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p823sg.C77710q;

/* renamed from: gz0.i */
public class C76094i {

    /* renamed from: a */
    public int f223003a;

    /* renamed from: b */
    public String f223004b;

    /* renamed from: c */
    public int f223005c;

    /* renamed from: a */
    public static C76094i m91423a(C68070l.C68072b bVar) {
        Map<String, String> map = bVar.f195491G2;
        C76094i iVar = new C76094i();
        iVar.f223004b = Util.nullAs(map.get(".msg.appmsg.giftcard_info.order_id"), "");
        iVar.f223003a = C77710q.m93739b(map.get(".msg.appmsg.giftcard_info.biz_uin"));
        Util.nullAs(map.get(".msg.appmsg.giftcard_info.app_name"), "");
        Util.nullAs(map.get(".msg.appmsg.giftcard_info.recv_digest"), "");
        Util.nullAs(map.get(".msg.appmsg.giftcard_info.send_digest"), "");
        Util.nullAs(map.get(".msg.appmsg.giftcard_info.background_pic_url"), "");
        Util.nullAs(map.get(".msg.appmsg.giftcard_info.title_color"), "");
        Util.nullAs(map.get(".msg.appmsg.giftcard_info.des_color"), "");
        iVar.f223005c = C77710q.m93739b(map.get(".msg.appmsg.giftcard_info.ver"));
        return iVar;
    }
}
