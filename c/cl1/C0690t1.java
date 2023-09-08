package cl1;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C24564k0;
import gy3.C87412m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import sk1.C63947a;
import te3.C51020qw0;
import te3.C51745vv0;
import te3.C51946xa1;

/* renamed from: cl1.t1 */
public final class C0690t1 extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f1626f = "Finder.LiveWhiteSlice";

    /* renamed from: g */
    public List<byte[]> f1627g;

    /* renamed from: h */
    public List<byte[]> f1628h;

    /* renamed from: i */
    public int f1629i;

    /* renamed from: j */
    public int f1630j;

    /* renamed from: n */
    public final ArrayList<String> f1631n = new ArrayList<>();

    /* renamed from: o */
    public final ArrayList<String> f1632o = new ArrayList<>();

    /* renamed from: p */
    public boolean f1633p;

    /* renamed from: q */
    public C51020qw0 f1634q;

    /* renamed from: r */
    public C51946xa1 f1635r;

    /* renamed from: s */
    public boolean f1636s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0690t1(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo650c3(int r6) {
        /*
            r5 = this;
            r0 = 1
            boolean r1 = o40.C61926c.m72696u(r6, r0)
            if (r1 == 0) goto L_0x0016
            java.util.List<byte[]> r1 = r5.f1628h
            if (r1 == 0) goto L_0x0010
            int r1 = r1.size()
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            if (r1 > 0) goto L_0x0016
            r1 = r6 & -2
            goto L_0x0017
        L_0x0016:
            r1 = r6
        L_0x0017:
            r2 = 2
            boolean r3 = o40.C61926c.m72696u(r6, r2)
            if (r3 == 0) goto L_0x0028
            java.util.ArrayList<java.lang.String> r3 = r5.f1631n
            int r3 = r3.size()
            if (r3 > 0) goto L_0x0028
            r1 = r6 & -3
        L_0x0028:
            r3 = 4
            boolean r4 = o40.C61926c.m72696u(r6, r3)
            if (r4 == 0) goto L_0x0039
            java.util.ArrayList<java.lang.String> r4 = r5.f1632o
            int r4 = r4.size()
            if (r4 > 0) goto L_0x0039
            r1 = r6 & -5
        L_0x0039:
            boolean r0 = o40.C61926c.m72696u(r6, r0)
            if (r0 != 0) goto L_0x0046
            java.util.List<byte[]> r0 = r5.f1628h
            if (r0 == 0) goto L_0x0046
            r0.clear()
        L_0x0046:
            boolean r0 = o40.C61926c.m72696u(r6, r2)
            if (r0 != 0) goto L_0x0051
            java.util.ArrayList<java.lang.String> r0 = r5.f1631n
            r0.clear()
        L_0x0051:
            boolean r0 = o40.C61926c.m72696u(r6, r3)
            if (r0 != 0) goto L_0x005c
            java.util.ArrayList<java.lang.String> r0 = r5.f1632o
            r0.clear()
        L_0x005c:
            java.lang.String r0 = r5.f1626f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkVisibilityMode oriMode:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " finalMode:"
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C0690t1.mo650c3(int):int");
    }

    /* renamed from: d3 */
    public final void mo651d3() {
        LinkedList<C51745vv0> linkedList;
        LinkedList<String> linkedList2;
        LinkedList<String> linkedList3;
        if (this.f1629i == 0) {
            this.f1631n.clear();
            this.f1632o.clear();
            List<byte[]> list = this.f1628h;
            if (list != null) {
                list.clear();
            }
            C51946xa1 xa12 = this.f1635r;
            if (!(xa12 == null || (linkedList3 = xa12.f144557d) == null)) {
                linkedList3.clear();
            }
            C51946xa1 xa13 = this.f1635r;
            if (!(xa13 == null || (linkedList2 = xa13.f144559f) == null)) {
                linkedList2.clear();
            }
            C51946xa1 xa14 = this.f1635r;
            if (xa14 != null && (linkedList = xa14.f144560g) != null) {
                linkedList.clear();
            }
        }
    }

    /* renamed from: e3 */
    public final void mo652e3(Intent intent) {
        C87412m.m108594g(intent, "intent");
        List<byte[]> list = this.f1627g;
        byte[] bArr = null;
        intent.putExtra("KEY_PARAMS_WHITE_LIST", list instanceof Serializable ? (Serializable) list : null);
        List<byte[]> list2 = this.f1628h;
        intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", list2 instanceof Serializable ? (Serializable) list2 : null);
        intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM", this.f1631n);
        intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_USER", this.f1632o);
        C51020qw0 qw02 = this.f1634q;
        intent.putExtra("KEY_PARAMS_LIVE_CHARGE", qw02 != null ? qw02.toByteArray() : null);
        C51946xa1 xa12 = this.f1635r;
        if (xa12 != null) {
            bArr = xa12.toByteArray();
        }
        intent.putExtra("KEY_PARAMS_LIVE_PART_WHITE_LIST", bArr);
        intent.putExtra("KEY_PARAMS_VISIBILITY_MODE", this.f1629i);
        intent.putExtra("KEY_PARAMS_IS_TEST_LIVE", this.f1630j == 1);
        LinkedList<String> linkedList = ((C54991o) business(C54991o.class)).f154376v2.f513a;
        if (true ^ linkedList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(linkedList);
            C13598b0 b0Var = C13598b0.f38549a;
            intent.putStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST", arrayList);
        }
    }

    /* renamed from: f3 */
    public final boolean mo653f3() {
        return this.f1634q != null;
    }

    /* renamed from: g3 */
    public final void mo654g3(Intent intent) {
        C51020qw0 qw02;
        byte[] byteArrayExtra;
        byte[] byteArrayExtra2;
        C51946xa1 xa12 = null;
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST") : null;
        this.f1628h = C24564k0.m30743g(serializableExtra) ? (List) serializableExtra : null;
        ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM") : null;
        if (stringArrayListExtra != null) {
            this.f1631n.clear();
            this.f1631n.addAll(stringArrayListExtra);
        }
        ArrayList<String> stringArrayListExtra2 = intent != null ? intent.getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_USER") : null;
        if (stringArrayListExtra2 != null) {
            this.f1632o.clear();
            this.f1632o.addAll(stringArrayListExtra2);
        }
        if (intent == null || (byteArrayExtra2 = intent.getByteArrayExtra("KEY_PARAMS_LIVE_CHARGE")) == null) {
            qw02 = null;
        } else {
            qw02 = new C51020qw0();
            qw02.parseFrom(byteArrayExtra2);
        }
        mo656j3(qw02);
        if (!(intent == null || (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_LIVE_PART_WHITE_LIST")) == null)) {
            xa12 = new C51946xa1();
            xa12.parseFrom(byteArrayExtra);
        }
        mo657k3(xa12);
        boolean z = false;
        int intExtra = intent != null ? intent.getIntExtra("KEY_PARAMS_VISIBILITY_MODE", 0) : 0;
        this.f1629i = mo650c3(intExtra);
        if (intent != null) {
            z = intent.getBooleanExtra("KEY_PARAMS_IS_TEST_LIVE", false);
        }
        this.f1630j = z ? 1 : 0;
        mo651d3();
        Log.m105924i(this.f1626f, "anchorChooseMode:" + intExtra);
    }

    /* renamed from: i3 */
    public final void mo655i3(boolean z) {
        String str = this.f1626f;
        Log.m105924i(str, "set isBussinessVisitor:" + z + ",ori value:" + this.f1633p);
        this.f1633p = z;
    }

    /* renamed from: j3 */
    public final void mo656j3(C51020qw0 qw02) {
        String str = this.f1626f;
        StringBuilder sb = new StringBuilder();
        sb.append("liveChargePost:");
        C63947a aVar = C63947a.f181274a;
        sb.append(aVar.mo88724j(qw02));
        sb.append(",ori value:");
        sb.append(aVar.mo88724j(this.f1634q));
        Log.m105924i(str, sb.toString());
        this.f1634q = qw02;
    }

    /* renamed from: k3 */
    public final void mo657k3(C51946xa1 xa12) {
        String str = this.f1626f;
        StringBuilder sb = new StringBuilder();
        sb.append("partWhiteList:");
        C63947a aVar = C63947a.f181274a;
        sb.append(aVar.mo88730p(xa12));
        sb.append(",ori value:");
        sb.append(aVar.mo88730p(this.f1635r));
        Log.m105924i(str, sb.toString());
        this.f1635r = xa12;
    }

    public void onCleared() {
        this.f1627g = null;
        this.f1629i = 0;
        this.f1630j = 0;
        this.f1628h = null;
        mo655i3(false);
        this.f1631n.clear();
        mo656j3((C51020qw0) null);
        mo657k3((C51946xa1) null);
    }
}
