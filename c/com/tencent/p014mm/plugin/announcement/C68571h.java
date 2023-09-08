package com.tencent.p014mm.plugin.announcement;

import a11.C39479c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.executor.DeleteExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import o21.C100273b;
import p749xh.C38564g1;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101801kd0;
import te3.C101834rc0;
import vh0.C78415b;

@C86522b
/* renamed from: com.tencent.mm.plugin.announcement.h */
public class C68571h extends C86301e implements C78415b {
    public static void vx0(long j) {
        Class<C38564g1> cls = C38564g1.class;
        ISQLiteDatabase db = C29091f.f79662e.getDB();
        List<C38564g1> multiQuery = C38564g1.f102317i.selectAll().where(C38564g1.f102318j.equal((Number) Long.valueOf(j))).log("MicroMsg.SDK.BaseChatroomNoticeAttachIndex").build().multiQuery(db, cls);
        Log.m105925i("MicroMsg.PluginAnnouncement", "del msg. msgId%d, index size:%d", Long.valueOf(j), Integer.valueOf(multiQuery.size()));
        for (C38564g1 next : multiQuery) {
            new DeleteExecutor(next, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseChatroomNoticeAttachIndex").execute(C29091f.f79662e.getDB());
            if (C38564g1.f102317i.selectAll().where(C38564g1.f102319n.equal(next.field_dataId)).log("MicroMsg.SDK.BaseChatroomNoticeAttachIndex").build().multiQuery(db, cls).size() < 1) {
                C86013q1.m106447h(next.field_dataPath);
                C86013q1.m106447h(next.field_thumbPath);
                Log.m105925i("MicroMsg.PluginAnnouncement", "del attach:%s, dataPath:%s, thumbPath:%s", next.field_dataId, next.field_dataPath, next.field_thumbPath);
            }
        }
    }

    /* renamed from: DD */
    public void mo94220DD(Context context, String str, String str2) {
        mo94221az(context, str, str2, false);
    }

    /* renamed from: az */
    public void mo94221az(Context context, String str, String str2, boolean z) {
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        boolean equals = Util.isNullOrNil(Lo.field_roomowner) ? false : Lo.field_roomowner.equals(C75592q0.m90789s());
        boolean u2 = Lo.mo69793u2(C75592q0.m90789s());
        Intent intent = new Intent();
        intent.putExtra("RoomInfo_Id", str);
        Map<String, String> parseXml = XmlParser.parseXml(str2, "msg", (String) null);
        intent.putExtra("room_notice", parseXml.get(".msg.appmsg.textannouncement"));
        intent.putExtra("room_notice_xml", parseXml.get(".msg.appmsg.announcement"));
        Map<String, String> parseXml2 = XmlParser.parseXml(parseXml.get(".msg.appmsg.announcement"), "group_notice_item", (String) null);
        if (parseXml2 != null) {
            intent.putExtra("room_notice_publish_time", Util.getLong(parseXml2.get(".group_notice_item.edittime"), 0));
        }
        intent.putExtra("room_notice_editor", parseXml.get(".msg.fromusername"));
        intent.putExtra("from_scene", 5);
        intent.putExtra("Is_RoomOwner", equals);
        intent.putExtra("Is_RoomManager", u2);
        intent.putExtra("room_member_count", Lo.field_memberCount);
        intent.putExtra("room_notice_reedit", z);
        mo94224yh(context, intent);
    }

    /* renamed from: eD */
    public void mo94222eD(Activity activity, Intent intent, int i) {
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_chatroom_announcement_richtext_switch, 1) != 1) {
            z = false;
        }
        intent.setClass(activity, z ? ChatroomNoticeUI.class : RoomCardUI.class);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/announcement/PluginAnnouncement", "startActivityForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: jL */
    public String[] mo94223jL(C72963f4 f4Var, String str) {
        LinkedList<C101834rc0> linkedList;
        C100755z z = C100734q.m131886z(str.replaceAll("group_notice_item", "favitem"), 18);
        ArrayList arrayList = new ArrayList();
        C101801kd0 kd02 = z.field_favProto;
        if (!(kd02 == null || (linkedList = kd02.f298618f) == null)) {
            Iterator<C101834rc0> it = linkedList.iterator();
            while (it.hasNext()) {
                C101834rc0 next = it.next();
                if (!Util.isNullOrNil(next.f299305h)) {
                    arrayList.add(C100273b.m131077e(next));
                }
                if (!Util.isNullOrNil(next.f299325s)) {
                    arrayList.add(C100273b.m131075c(next));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: yh */
    public void mo94224yh(Context context, Intent intent) {
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_chatroom_announcement_richtext_switch, 1) != 1) {
            z = false;
        }
        intent.setClass(context, z ? ChatroomNoticeUI.class : RoomCardUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/announcement/PluginAnnouncement", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/announcement/PluginAnnouncement", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
