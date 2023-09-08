package p357lo;

import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.pigeon.BizPigeon;
import java.util.LinkedList;
import java.util.List;
import p007bo.C16801f;
import rb0.C48009v0;
import sx3.C110818d0;
import zh3.C91753f;

/* renamed from: lo.c */
public final class C21453c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizPigeon.Result<List<BizPigeon.MassSendCardMsg>> f60737d;

    /* renamed from: e */
    public final /* synthetic */ long f60738e;

    /* renamed from: f */
    public final /* synthetic */ boolean f60739f;

    /* renamed from: g */
    public final /* synthetic */ boolean f60740g;

    public C21453c(BizPigeon.Result<List<BizPigeon.MassSendCardMsg>> result, long j, boolean z, boolean z2) {
        this.f60737d = result;
        this.f60738e = j;
        this.f60739f = z;
        this.f60740g = z2;
    }

    public final void run() {
        List<C19623o0> list;
        BizPigeon.Result<List<BizPigeon.MassSendCardMsg>> result = this.f60737d;
        if (result != null) {
            C16801f fVar = C16801f.f45399a;
            long j = this.f60738e;
            boolean z = this.f60739f;
            boolean z2 = this.f60740g;
            LinkedList linkedList = new LinkedList();
            if (z) {
                C19625p0 Jx0 = C48009v0.Jx0();
                list = Jx0.mo25797bD(Jx0.f55550d.query("BizTimeLineInfo", (String[]) null, "type=? ", new String[]{"285212721"}, (String) null, (String) null, "orderFlag DESC limit 10"));
            } else if (z2) {
                C19625p0 Jx02 = C48009v0.Jx0();
                C91753f fVar2 = Jx02.f55550d;
                list = Jx02.mo25797bD(fVar2.query("BizTimeLineInfo", (String[]) null, "type=? and orderFlag>=?", new String[]{"285212721", "" + j}, (String) null, (String) null, "orderFlag DESC"));
            } else {
                C19625p0 Jx03 = C48009v0.Jx0();
                C91753f fVar3 = Jx03.f55550d;
                list = Jx03.mo25797bD(fVar3.query("BizTimeLineInfo", (String[]) null, "type=? and orderFlag<? ", new String[]{"285212721", "" + j}, (String) null, (String) null, "orderFlag DESC limit 10"));
            }
            for (C19623o0 o0Var : list) {
                if (o0Var.mo25754B2()) {
                    linkedList.add(C16801f.f45399a.mo17841a(o0Var));
                }
            }
            result.success(C110818d0.m150900B0(linkedList));
        }
    }
}
