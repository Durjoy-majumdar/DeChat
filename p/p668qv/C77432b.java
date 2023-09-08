package p668qv;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import zc2.C119093f;

/* renamed from: qv.b */
public class C77432b extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        if (aVar.f78744a == 96) {
            CheckResUpdateCacheFileEvent.C28720a aVar2 = checkResUpdateCacheFileEvent.f78743d;
            Log.m105925i("MicroMsg.PluginNotification", " ringtone update coming. subtype: %d, file path: %s, file version: %d", Integer.valueOf(aVar.f78745b), aVar2.f78746c, Integer.valueOf(aVar2.f78747d));
            CheckResUpdateCacheFileEvent.C28720a aVar3 = checkResUpdateCacheFileEvent.f78743d;
            int i = aVar3.f78745b;
            if (i == 1) {
                Uri n = C116299g2.m163858n(aVar3.f78746c);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                    String q = C86013q1.m106456q(checkResUpdateCacheFileEvent.f78743d.f78746c);
                    if (TextUtils.isEmpty(q)) {
                        Log.m105920e("MicroMsg.PluginNotification", "current_file_md5 is empty");
                    } else if (!q.equals(checkResUpdateCacheFileEvent.f78743d.f78749f)) {
                        Log.m105921e("MicroMsg.PluginNotification", "md5 is diff, current md5:%s, original md5:%s", q, checkResUpdateCacheFileEvent.f78743d.f78749f);
                    } else {
                        Log.m105925i("MicroMsg.PluginNotification", "md5 is same, current md5:%s, original md5:%s", q, checkResUpdateCacheFileEvent.f78743d.f78749f);
                        C119093f.wx0(checkResUpdateCacheFileEvent.f78743d.f78746c);
                        return true;
                    }
                } else {
                    Log.m105921e("MicroMsg.PluginNotification", "file not exits :%s", checkResUpdateCacheFileEvent.f78743d.f78746c);
                }
            } else {
                Log.m105921e("MicroMsg.PluginNotification", "sub type can't be handled!, subtype:%d", Integer.valueOf(i));
            }
        }
        return false;
    }
}
