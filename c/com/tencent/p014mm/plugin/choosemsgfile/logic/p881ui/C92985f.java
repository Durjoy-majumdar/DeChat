package com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui;

import android.database.Cursor;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.C93015m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f11.C97792a;
import f11.C97801j;
import f11.C97804m;
import f40.C86709a0;
import f62.C75700k0;
import g11.C98065a;
import g11.C98068c;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.f */
public class C92985f extends C92978b {

    /* renamed from: d */
    public C92980d f267807d;

    /* renamed from: e */
    public List<C97792a> f267808e = new ArrayList();

    /* renamed from: f */
    public LinearLayoutManager f267809f;

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.f$a */
    public class C92986a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f267810d;

        /* renamed from: e */
        public final /* synthetic */ boolean f267811e;

        /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.f$a$a */
        public class C92987a implements Runnable {
            public C92987a() {
            }

            public void run() {
                C92986a aVar = C92986a.this;
                C92985f fVar = C92985f.this;
                C93015m mVar = fVar.f267798b;
                if (mVar != null) {
                    mVar.mo127413k(aVar.f267811e, ((ArrayList) fVar.f267808e).size());
                }
            }
        }

        public C92986a(String str, boolean z) {
            this.f267810d = str;
            this.f267811e = z;
        }

        /* JADX INFO: finally extract failed */
        public void run() {
            C68070l.C68072b u;
            LinkedList linkedList = new LinkedList();
            Cursor LL = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101073LL(C92985f.this.f267797a, 0, -1);
            if (LL == null) {
                Log.m105920e("MicroMsg.ChooseMsgFileListUIController", "[loadData] cursor is null!");
                return;
            }
            List<String> e = C98068c.m126680e(this.f267810d);
            long j = 0;
            while (true) {
                try {
                    boolean z = true;
                    if (LL.moveToNext()) {
                        C72963f4 f4Var = new C72963f4();
                        f4Var.convertFrom(LL);
                        String content = f4Var.getContent();
                        if (!(content == null || (u = C68070l.C68072b.m80422u(content, (String) null)) == null || u.f195582i != 6)) {
                            C92985f fVar = C92985f.this;
                            C97804m mVar = new C97804m(fVar.f267807d, f4Var, fVar.f267797a);
                            ArrayList arrayList = (ArrayList) e;
                            if (arrayList.size() != 0) {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    if (mVar.mo137119d().endsWith((String) it.next())) {
                                        break;
                                    }
                                }
                            }
                            if (z) {
                                long a = C74763a.m89510e().mo103933a(new Date(f4Var.getCreateTime()));
                                if (j != a) {
                                    linkedList.add(new C97801j(C92985f.this.f267807d, f4Var.getCreateTime()));
                                }
                                linkedList.add(mVar);
                                j = a;
                            }
                        }
                    } else {
                        LL.close();
                        ((ArrayList) C92985f.this.f267808e).addAll(linkedList);
                        linkedList.clear();
                        Log.m105925i("MicroMsg.ChooseMsgFileListUIController", "[loadData] data:%s", Integer.valueOf(((ArrayList) C92985f.this.f267808e).size()));
                        MMHandlerThread.postToMainThread(new C92987a());
                        return;
                    }
                } catch (Throwable th) {
                    LL.close();
                    throw th;
                }
            }
        }
    }

    public C92985f(C93015m mVar) {
        super(mVar);
    }

    /* renamed from: a */
    public static C98065a m117298a(C92985f fVar) {
        return fVar.f267798b.mo127409Q3();
    }

    /* renamed from: b */
    public void mo127402b(boolean z, String str, String str2) {
        Log.m105925i("MicroMsg.ChooseMsgFileListUIController", "[loadData] isFirst:%s", Boolean.valueOf(z));
        this.f267798b.mo127410f(z);
        if (z) {
            ((ArrayList) this.f267808e).clear();
        }
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C92986a(str2, z));
    }
}
