package rb0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gw0.C76073b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import s90.C77627f;
import s90.C77630j;
import te3.C49618gw;
import te3.C49939j34;
import te3.C52054y14;

/* renamed from: rb0.q */
public class C48001q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C52054y14 f128748d;

    /* renamed from: e */
    public final /* synthetic */ String f128749e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f128750f;

    /* renamed from: g */
    public final /* synthetic */ int f128751g;

    /* renamed from: h */
    public final /* synthetic */ C47997p f128752h;

    public C48001q(C47997p pVar, C52054y14 y142, String str, C72963f4 f4Var, int i) {
        this.f128752h = pVar;
        this.f128748d = y142;
        this.f128749e = str;
        this.f128750f = f4Var;
        this.f128751g = i;
    }

    public void run() {
        this.f128752h.mo72790c(this.f128748d, this.f128749e);
        C72963f4 f4Var = this.f128750f;
        if (f4Var == null || !f4Var.mo100967F3()) {
            this.f128752h.mo72789b(this.f128749e, 10, 0, 0.0f, 0.0f, 0, (LinkedList<C49618gw>) null, this.f128751g, this.f128748d, (C49939j34) null);
            return;
        }
        LinkedList linkedList = new LinkedList();
        C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(this.f128750f.getMsgId(), this.f128750f.getContent());
        if (JZ == null || Util.isNullOrNil((List) JZ.f226295i)) {
            this.f128752h.mo72789b(this.f128749e, 10, 0, 0.0f, 0.0f, 0, (LinkedList<C49618gw>) null, this.f128751g, this.f128748d, (C49939j34) null);
            return;
        }
        Iterator<C77630j> it = JZ.f226295i.iterator();
        while (it.hasNext()) {
            C77630j next = it.next();
            String str = next.f226326e;
            if (!Util.isNullOrNil(str)) {
                Uri parse = Uri.parse(str);
                try {
                    String queryParameter = parse.getQueryParameter("mid");
                    String queryParameter2 = parse.getQueryParameter("idx");
                    C49618gw gwVar = new C49618gw();
                    gwVar.f134308d = Util.getLong(queryParameter, 0);
                    gwVar.f134309e = Util.getInt(queryParameter2, 0);
                    gwVar.f134310f = next.f226340v;
                    gwVar.f134311g = next.f226337s;
                    linkedList.add(gwVar);
                } catch (UnsupportedOperationException e) {
                    Log.m105929w("MicroMsg.ReportLocation", "UnsupportedOperationException %s", e.getMessage());
                }
            }
        }
        this.f128752h.mo72789b(this.f128749e, 10, 0, 0.0f, 0.0f, 0, linkedList, this.f128751g, this.f128748d, (C49939j34) null);
    }
}
