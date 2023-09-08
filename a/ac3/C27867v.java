package ac3;

import com.tencent.p014mm.autogen.events.CheckResUpdatePreOperationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import o40.C61926c;
import te3.b05;

/* renamed from: ac3.v */
public final class C27867v extends IStaticListener<CheckResUpdatePreOperationEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdatePreOperationEvent checkResUpdatePreOperationEvent = (CheckResUpdatePreOperationEvent) iEvent;
        C87412m.m108594g(checkResUpdatePreOperationEvent, "event");
        CheckResUpdatePreOperationEvent.C28721a aVar = checkResUpdatePreOperationEvent.f78750d;
        int i = aVar.f78751a;
        int i2 = aVar.f78752b;
        if (!C27862u0.f77007f.contains(Integer.valueOf(i))) {
            return false;
        }
        int i3 = checkResUpdatePreOperationEvent.f78750d.f78753c;
        if (i3 == 2) {
            Log.m105928w("MicroMsg.WeVisModelMgr", "operation: delete res " + i + '.' + i2);
            C86013q1.m106445f(C91992q0.f263334d + XVFSFile.SEPARATOR_CHAR + i + '.' + i2);
            LinkedList<b05> linkedList = C27862u0.f77005d.f130188d;
            C87412m.m108593f(linkedList, "WeVisModelMgr.localModelInfo.NewConfigList");
            C61926c.m72675T(linkedList, new C27860t(i, i2));
            C61926c.m72675T(C27862u0.f77004c, new C27861u(i, i2));
            C27855h1.f76992a.mo55643b(2, i, i2);
            return false;
        } else if (i3 != 0) {
            return false;
        } else {
            LinkedHashSet<String> linkedHashSet = C27862u0.f77008g;
            synchronized (linkedHashSet) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('.');
                sb.append(i2);
                linkedHashSet.add(sb.toString());
            }
            return false;
        }
    }
}
