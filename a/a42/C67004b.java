package a42;

import b42.C67149a;
import b42.C67151c;
import b42.C67152d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.wallet_core.model.C75097a;
import g32.C75846b;
import java.util.Iterator;
import ob0.C89132b;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C51206s72;
import te3.C77973op3;
import te3.C77993rp3;
import te3.vb4;

/* renamed from: a42.b */
public class C67004b extends C75097a<C51206s72, C39486a> {
    /* renamed from: a */
    public C49335eu3 mo66604a() {
        String str = ((C39486a) this.f221004c).f106032p;
        C67149a aVar = new C67149a();
        aVar.field_packet_id = str;
        if (!C75846b.zx0().Cx0().get(aVar, new String[0])) {
            return null;
        }
        C77993rp3 l2 = C67149a.m79405l2(aVar);
        l2.f228181i.addAll(C75846b.zx0().Ex0().mo91256jo(((C39486a) this.f221004c).f106032p));
        C51206s72 s722 = new C51206s72();
        s722.BaseResponse = new C49966ja();
        s722.f141354d = l2;
        return s722;
    }

    /* renamed from: b */
    public void mo66605b(C89132b.C89134c<C51206s72> cVar) {
        int i;
        Log.m105925i("MicroMsg.RedPacketStoryInfoAsyncLoader", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a));
        if (cVar.f256793a == 0 && cVar.f256794b == 0 && ((C51206s72) cVar.f256796d).f141354d != null) {
            C67149a aVar = new C67149a();
            aVar.field_packet_id = ((C39486a) this.f221004c).f106032p;
            T t = cVar.f256796d;
            ((C51206s72) t).f141354d.f228175C = ((C51206s72) t).f141355e;
            boolean z = C75846b.zx0().Cx0().get(aVar, new String[0]);
            Log.m105925i("MicroMsg.RedPacketStoryInfoAsyncLoader", "get story info: %s, %s", ((C39486a) this.f221004c).f106032p, Boolean.valueOf(z));
            T t2 = cVar.f256796d;
            C77993rp3 rp32 = ((C51206s72) t2).f141354d;
            String str = ((C39486a) this.f221004c).f106032p;
            int i2 = ((C51206s72) t2).f141355e;
            if (rp32 != null) {
                aVar.field_title = rp32.f228176d;
                aVar.field_corp_name = rp32.f228180h;
                aVar.field_action_app_nickname = rp32.f228185p;
                aVar.field_action_app_username = rp32.f228184o;
                aVar.field_action_emotion_designer_uin = rp32.f228189t;
                aVar.field_action_type = rp32.f228182j;
                aVar.field_action_url = rp32.f228183n;
                aVar.field_description = rp32.f228179g;
                aVar.field_logo_url = rp32.f228177e;
                aVar.field_logo_md5 = rp32.f228178f;
                aVar.field_action_jump_text = rp32.f228192w;
                aVar.field_joint_label_text = rp32.f228194y;
                aVar.field_same_receive_link = rp32.f228193x;
                aVar.field_action_before_jump_text = rp32.f228195z;
                aVar.field_action_normal_icon_url = rp32.f228173A;
                aVar.field_action_dark_icon_url = rp32.f228174B;
                aVar.field_packet_id = str;
                aVar.field_subtype_id = i2;
                C77973op3 op32 = rp32.f228187r;
                if (op32 != null) {
                    aVar.field_detail_dynamic_url = op32.f227944J;
                }
            }
            aVar.field_update_time = System.currentTimeMillis();
            if (z) {
                C75846b.zx0().Cx0().update(aVar, new String[0]);
            } else {
                C75846b.zx0().Cx0().insert(aVar);
            }
            C67152d Ex0 = C75846b.zx0().Ex0();
            String str2 = ((C39486a) this.f221004c).f106032p;
            Ex0.getClass();
            if (Util.isNullOrNil(str2)) {
                i = -1;
            } else {
                Log.m105925i("MicroMsg.LocalRedPacketStoryInfoStorage", "delete story detail: %s", str2);
                i = Ex0.f192822d.delete("LocalStoryDetail", "packet_id=?", new String[]{str2});
            }
            Log.m105925i("MicroMsg.RedPacketStoryInfoAsyncLoader", "delete story detail: %s", Integer.valueOf(i));
            if (!((C51206s72) cVar.f256796d).f141354d.f228181i.isEmpty()) {
                ISQLiteDatabase iSQLiteDatabase = C75846b.zx0().Ex0().f192822d;
                long beginTransaction = iSQLiteDatabase != null ? iSQLiteDatabase.beginTransaction(Thread.currentThread().getId()) : -1;
                Iterator<vb4> it = ((C51206s72) cVar.f256796d).f141354d.f228181i.iterator();
                while (it.hasNext()) {
                    vb4 next = it.next();
                    String str3 = ((C39486a) this.f221004c).f106032p;
                    C67151c cVar2 = new C67151c();
                    if (next != null) {
                        cVar2.field_packet_id = str3;
                        cVar2.field_height = next.f228309g;
                        cVar2.field_width = next.f228310h;
                        cVar2.field_media_type = next.f228306d;
                        cVar2.field_media_md5 = next.f228308f;
                        cVar2.field_media_url = next.f228307e;
                        cVar2.field_media_fuzzy_thumbnail_url = next.f228311i;
                        cVar2.field_media_fuzzy_thumbnail_md5 = next.f228312j;
                    }
                    C75846b.zx0().Ex0().insert(cVar2);
                }
                ISQLiteDatabase iSQLiteDatabase2 = C75846b.zx0().Ex0().f192822d;
                if (iSQLiteDatabase2 != null) {
                    iSQLiteDatabase2.endTransaction(beginTransaction);
                    return;
                }
                return;
            }
            Log.m105928w("MicroMsg.RedPacketStoryInfoAsyncLoader", "story detail is empty!!");
        }
    }
}
