package a61;

import android.net.Uri;
import com.tencent.p014mm.autogen.events.CheckResUpdatePreOperationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import i61.C98603i;

/* renamed from: a61.r */
public class C39497r extends IStaticListener<CheckResUpdatePreOperationEvent> {
    public boolean callback(IEvent iEvent) {
        Uri.Builder builder;
        CheckResUpdatePreOperationEvent checkResUpdatePreOperationEvent = (CheckResUpdatePreOperationEvent) iEvent;
        CheckResUpdatePreOperationEvent.C28721a aVar = checkResUpdatePreOperationEvent.f78750d;
        if (aVar.f78751a == 37) {
            if (aVar.f78752b == 5 && aVar.f78753c == 2) {
                C98603i d = C98603i.m128193d();
                d.getClass();
                Log.m105924i("MicroMsg.emoji.EmojiResUpdateMgr", "delete emoji egg!");
                try {
                    C86013q1.m106447h(C86709a0.m107535s().f251807e + "eggingfo.ini");
                    String c = C98603i.m128192c();
                    Uri n = c == null ? null : C116299g2.m163858n(c);
                    if (n == null) {
                        builder = new Uri.Builder().path("egg");
                    } else {
                        builder = n.buildUpon();
                        builder.appendPath("egg");
                    }
                    Uri build = builder.build();
                    String path = build.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!build.getPath().equals(k)) {
                            build = builder.path(k).build();
                        }
                    }
                    C86013q1.m106445f(C116299g2.m163865u(build));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", e, "", new Object[0]);
                }
                d.f289105b = null;
            }
            CheckResUpdatePreOperationEvent.C28721a aVar2 = checkResUpdatePreOperationEvent.f78750d;
            if (aVar2.f78753c == 0) {
                Log.m105925i("MicroMsg.emoji.EmojiResUpdateOperationListener", "cache res type:%d subType:%d", Integer.valueOf(aVar2.f78751a), Integer.valueOf(checkResUpdatePreOperationEvent.f78750d.f78752b));
            }
        }
        return false;
    }
}
