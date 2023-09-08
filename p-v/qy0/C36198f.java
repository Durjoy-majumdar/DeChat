package qy0;

import android.os.Message;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import java.util.List;
import ob0.C89132b;
import qy0.C36193e;
import rx3.C13598b0;
import te3.C51561ul;
import u60.C14121l;
import u60.C65234n;

/* renamed from: qy0.f */
public final class C36198f<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C36193e f96415a;

    /* renamed from: b */
    public final /* synthetic */ List<Integer> f96416b;

    /* renamed from: c */
    public final /* synthetic */ int f96417c;

    /* renamed from: d */
    public final /* synthetic */ C14121l f96418d;

    public C36198f(C36193e eVar, List<Integer> list, int i, C14121l lVar) {
        this.f96415a = eVar;
        this.f96416b = list;
        this.f96417c = i;
        this.f96418d = lVar;
    }

    /* JADX INFO: finally extract failed */
    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C65234n nVar = C65234n.OK;
        try {
            int i = cVar.f256793a;
            if (i == 0 && cVar.f256794b == 0) {
                LinkedList<Integer> linkedList = ((C51561ul) cVar.f256796d).f142922d;
                C87412m.m108593f(linkedList, "it.resp.resp_continue_flag");
                if (!linkedList.isEmpty()) {
                    C36193e eVar = this.f96415a;
                    LinkedList<Integer> linkedList2 = ((C51561ul) cVar.f256796d).f142922d;
                    C87412m.m108593f(linkedList2, "it.resp.resp_continue_flag");
                    C36193e.m40919b(eVar, linkedList2, C36193e.C36194a.CONTINUE, true, 0, 8, (Object) null);
                }
                Message obtainMessage = this.f96415a.f96399c.obtainMessage(1, ((C51561ul) cVar.f256796d).f142924f);
                LinkedList<Integer> linkedList3 = ((C51561ul) cVar.f256796d).f142922d;
                C87412m.m108593f(linkedList3, "it.resp.resp_continue_flag");
                obtainMessage.arg1 = linkedList3.isEmpty() ^ true ? 1 : 0;
                obtainMessage.sendToTarget();
            } else {
                if (i != 3) {
                    this.f96415a.mo60565a(this.f96416b, C36193e.C36194a.RETRY, false, this.f96417c + 1);
                }
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo160131h(20845, Integer.valueOf(cVar.f256793a), 1, cVar.f256793a + XVFSFile.PATH_SEPARATOR_CHAR + cVar.f256794b + XVFSFile.PATH_SEPARATOR_CHAR + cVar.f256795c, 1);
                nVar2.mo175913w(1465, 100, 1);
                nVar2.mo175913w(1465, ((long) 100) + ((long) cVar.f256793a), 1);
            }
            this.f96418d.mo11853b(nVar);
            return C13598b0.f38549a;
        } catch (Throwable th) {
            this.f96418d.mo11853b(nVar);
            throw th;
        }
    }
}
