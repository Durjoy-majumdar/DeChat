package f11;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C16631z;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92977a;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.storage.C72963f4;
import g11.C98065a;

/* renamed from: f11.a */
public abstract class C97792a<T extends RecyclerView.C16631z> {

    /* renamed from: a */
    public C92993j f286877a;

    /* renamed from: b */
    public C72963f4 f286878b;

    /* renamed from: c */
    public int f286879c;

    /* renamed from: d */
    public int f286880d;

    /* renamed from: e */
    public int f286881e = 0;

    public C97792a(C92993j jVar) {
        this.f286877a = jVar;
    }

    /* renamed from: a */
    public C98065a mo137116a() {
        return ((C92977a) this.f286877a).f267793d.mo127409Q3();
    }

    /* renamed from: b */
    public Context mo137117b() {
        return ((C92977a) this.f286877a).f267793d.getContext();
    }

    /* renamed from: c */
    public String mo137118c() {
        return "";
    }

    /* renamed from: d */
    public String mo137119d() {
        return "";
    }

    /* renamed from: e */
    public int mo137120e() {
        return 0;
    }

    public boolean equals(Object obj) {
        C72963f4 f4Var = this.f286878b;
        return (f4Var == null || !(obj instanceof C72963f4) || obj == null) ? super.equals(obj) : f4Var.getMsgId() == ((C72963f4) obj).getMsgId();
    }

    /* renamed from: f */
    public long mo137122f() {
        return this.f286878b.getMsgId();
    }

    /* renamed from: g */
    public long mo137123g() {
        return this.f286878b.getCreateTime();
    }

    /* renamed from: h */
    public abstract int mo137124h();

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo137125i() {
        /*
            r6 = this;
            com.tencent.mm.plugin.choosemsgfile.logic.ui.j r0 = r6.f286877a
            com.tencent.mm.plugin.choosemsgfile.logic.ui.a r0 = (com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92977a) r0
            com.tencent.mm.plugin.choosemsgfile.ui.m r0 = r0.f267793d
            g11.a r0 = r0.mo127409Q3()
            java.util.Map<java.lang.Long, g11.a$a> r1 = r0.f287512b
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0019
            java.lang.String r0 = "MicroMsg.ChooseMsgFileHelper"
            java.lang.String r1 = "isInvalid() msgIdToMsgFile is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x0025
        L_0x0019:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            int r1 = r1.size()
            int r0 = r0.f287511a
            if (r1 < r0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 == 0) goto L_0x004c
            com.tencent.mm.plugin.choosemsgfile.logic.ui.j r0 = r6.f286877a
            com.tencent.mm.plugin.choosemsgfile.logic.ui.a r0 = (com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92977a) r0
            com.tencent.mm.plugin.choosemsgfile.ui.m r0 = r0.f267793d
            g11.a r0 = r0.mo127409Q3()
            com.tencent.mm.storage.f4 r1 = r6.f286878b
            long r4 = r1.getMsgId()
            java.util.Map<java.lang.Long, g11.a$a> r0 = r0.f287512b
            if (r0 != 0) goto L_0x003e
            r0 = 0
            goto L_0x0048
        L_0x003e:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r1)
        L_0x0048:
            if (r0 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f11.C97792a.mo137125i():boolean");
    }

    /* renamed from: j */
    public void mo137126j(T t, int i, C97792a aVar) {
    }

    /* renamed from: k */
    public void mo137127k(View view, C97792a aVar) {
    }

    /* renamed from: l */
    public void mo137128l(T t) {
    }

    public String toString() {
        return "MsgItem{msgInfo=" + this.f286878b.getMsgId() + '}';
    }

    public C97792a(C92993j jVar, C72963f4 f4Var) {
        this.f286877a = jVar;
        this.f286878b = f4Var;
    }
}
