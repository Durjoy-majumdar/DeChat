package ww2;

import android.net.Uri;
import com.tencent.p014mm.autogen.events.VoiceReminderDeleteRecordMessageEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import java.util.HashMap;
import uw2.C78289d;
import uw2.C78291e;
import uw2.C78296j;
import uw2.C78306m;

/* renamed from: ww2.a */
public class C78733a extends IStaticListener<VoiceReminderDeleteRecordMessageEvent> {
    public boolean callback(IEvent iEvent) {
        String str = ((VoiceReminderDeleteRecordMessageEvent) iEvent).f194008d.f194009a;
        if (str != null) {
            String b = C78296j.m94584b(str, false);
            if (!Util.isNullOrNil(b)) {
                C78291e.xx0().mo108319c(b);
            }
            C78306m xx02 = C78291e.xx0();
            C78289d dVar = (C78289d) ((HashMap) xx02.f229384e).get(str);
            if (dVar != null) {
                dVar.mo108308a();
                ((HashMap) xx02.f229384e).remove(str);
            }
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                l.f348991a.mo119933c(l.f348992b);
            }
        }
        return false;
    }
}
