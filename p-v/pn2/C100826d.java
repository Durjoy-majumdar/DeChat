package pn2;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.MusicActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.xweb.WCWebUpdater;
import java.util.ArrayList;
import nn2.C47288f;
import nn2.C76942m;
import sn2.C64057o;
import tn2.C78073b;

/* renamed from: pn2.d */
public class C100826d extends IStaticListener<MusicActionEvent> {
    public boolean callback(IEvent iEvent) {
        MusicActionEvent musicActionEvent = (MusicActionEvent) iEvent;
        if (!(musicActionEvent instanceof MusicActionEvent)) {
            return false;
        }
        MusicActionEvent.C92531a aVar = musicActionEvent.f264920d;
        int i = aVar.f264922a;
        if (i == -4) {
            Cursor rawQuery = C76942m.zx0().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by shakeItemID desc ", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
            musicActionEvent.f264921e.f264932c = new ArrayList();
            while (rawQuery != null && rawQuery.moveToNext()) {
                C47288f fVar = new C47288f();
                fVar.convertFrom(rawQuery);
                ((ArrayList) musicActionEvent.f264921e.f264932c).add(C64057o.m75411b(fVar.field_lvbuffer, 0));
            }
            if (rawQuery == null) {
                return false;
            }
            rawQuery.close();
            return false;
        } else if (i != 12) {
            return false;
        } else {
            musicActionEvent.f264921e.f264934e = C78073b.m94203b(aVar.f264928g);
            return false;
        }
    }
}
