package qg2;

import com.tencent.p014mm.autogen.events.QueryRecordMsgMediaListEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.xweb.file.XVFSFile;
import java.util.Iterator;
import te3.C101834rc0;

/* renamed from: qg2.k */
public class C101149k extends IStaticListener<QueryRecordMsgMediaListEvent> {
    public boolean callback(IEvent iEvent) {
        QueryRecordMsgMediaListEvent queryRecordMsgMediaListEvent = (QueryRecordMsgMediaListEvent) iEvent;
        QueryRecordMsgMediaListEvent.C92546a aVar = queryRecordMsgMediaListEvent.f265003d;
        String str = aVar.f265005a;
        long j = aVar.f265006b;
        Iterator<C101834rc0> it = C101147j0.m132643x(str).f227155f.iterator();
        String str2 = "";
        while (it.hasNext()) {
            str2 = str2 + C101147j0.m132636q(it.next(), j, 1) + XVFSFile.PATH_SEPARATOR;
        }
        queryRecordMsgMediaListEvent.f265004e.f265007a = str2;
        return true;
    }
}
