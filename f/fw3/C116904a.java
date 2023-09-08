package fw3;

import ew3.C116791a;
import gw3.C116997a;
import gw3.C116999c;
import gw3.C117002f;
import gw3.C117003g;
import gw3.C117004h;
import gw3.C117005i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kw3.C117428b;
import rv3.C118245h;
import uv3.C118616f;
import vv3.C118702d;
import xv3.C118905a;
import yv3.C118997b;

/* renamed from: fw3.a */
public abstract class C116904a {

    /* renamed from: a */
    public int f350322a;

    /* renamed from: b */
    public C118702d f350323b;

    /* renamed from: c */
    public C118616f f350324c;

    /* renamed from: d */
    public C118997b f350325d;

    public C116904a(C118702d dVar, C118997b bVar) {
        this.f350323b = dVar;
        this.f350325d = bVar;
        this.f350324c = bVar.f356433d;
    }

    /* renamed from: a */
    public C116997a mo180866a(C116999c cVar, List<C117005i> list, List<C117004h> list2) {
        C116997a aVar = new C116997a();
        aVar.f350595f = System.currentTimeMillis();
        C117002f fVar = new C117002f();
        fVar.f350629d = System.currentTimeMillis();
        ArrayList<C116999c> arrayList = new ArrayList<>();
        arrayList.add(cVar);
        fVar.f350630e = arrayList;
        int i = this.f350322a + 1;
        this.f350322a = i;
        fVar.f350631f = i;
        if (list != null && !list.isEmpty()) {
            fVar.f350632g = new ArrayList<>(list);
        }
        if (list2 != null && !list2.isEmpty()) {
            fVar.f350633h = new ArrayList<>(list2);
        }
        ArrayList<C117002f> arrayList2 = new ArrayList<>();
        arrayList2.add(fVar);
        aVar.f350596g = arrayList2;
        return aVar;
    }

    /* renamed from: b */
    public void mo180867b() {
    }

    /* renamed from: c */
    public abstract void mo180868c(HashMap<Integer, List<C117003g>> hashMap, List<C117005i> list, List<C117004h> list2, C117428b bVar);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r3 = r2.f350630e.get(0);
        r4 = r3.f350617e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r3 = r2.f350632g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r6.f350596g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = r6.f350596g.get(0);
        r3 = r2.f350630e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo180869d(gw3.C116997a r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x0062
            java.util.ArrayList<gw3.f> r2 = r6.f350596g
            if (r2 == 0) goto L_0x0062
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0062
            java.util.ArrayList<gw3.f> r2 = r6.f350596g
            java.lang.Object r2 = r2.get(r0)
            if (r2 != 0) goto L_0x0017
            goto L_0x0062
        L_0x0017:
            java.util.ArrayList<gw3.f> r2 = r6.f350596g
            java.lang.Object r2 = r2.get(r0)
            gw3.f r2 = (gw3.C117002f) r2
            java.util.ArrayList<gw3.c> r3 = r2.f350630e
            if (r3 == 0) goto L_0x0062
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0062
            java.util.ArrayList<gw3.c> r3 = r2.f350630e
            java.lang.Object r3 = r3.get(r0)
            if (r3 != 0) goto L_0x0032
            goto L_0x0062
        L_0x0032:
            java.util.ArrayList<gw3.c> r3 = r2.f350630e
            java.lang.Object r3 = r3.get(r0)
            gw3.c r3 = (gw3.C116999c) r3
            java.util.ArrayList<gw3.g> r4 = r3.f350617e
            if (r4 == 0) goto L_0x0062
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0062
            java.util.ArrayList<gw3.g> r3 = r3.f350617e
            java.lang.Object r3 = r3.get(r0)
            if (r3 != 0) goto L_0x004d
            goto L_0x0062
        L_0x004d:
            java.util.ArrayList<gw3.i> r3 = r2.f350632g
            if (r3 == 0) goto L_0x0062
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0062
            java.util.ArrayList<gw3.i> r2 = r2.f350632g
            java.lang.Object r2 = r2.get(r0)
            if (r2 != 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r2 = 0
            goto L_0x0063
        L_0x0062:
            r2 = 1
        L_0x0063:
            if (r2 == 0) goto L_0x0066
            return r1
        L_0x0066:
            byte[] r6 = r6.toByteArray()
            if (r6 == 0) goto L_0x0070
            int r6 = r6.length
            if (r6 <= r7) goto L_0x0070
            return r1
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fw3.C116904a.mo180869d(gw3.a, int):boolean");
    }

    /* renamed from: e */
    public void mo180870e(int i, C116997a aVar, C117428b bVar) {
        C118616f fVar;
        if (bVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[method: onCSReqCallBack ] errorCode : ");
            sb.append(i);
            sb.append(" null == csReq? ");
            sb.append(aVar == null);
            C118245h.m166799a("sensor_AbsDataHandle", sb.toString());
            C118905a.m167654a(this.f350323b, aVar, this.f350324c.f354955c);
            if (!(aVar == null || (fVar = this.f350324c) == null)) {
                aVar.f350593d = fVar.f354953a;
                aVar.f350599j = fVar.f354954b;
                Map<String, String> b = C118905a.m167655b(this.f350323b.f355205a);
                if (!((HashMap) b).isEmpty()) {
                    if (aVar.f350592F == null) {
                        aVar.f350592F = new HashMap();
                    }
                    aVar.f350592F.putAll(b);
                }
            }
            C116791a aVar2 = ((C118997b) bVar).f356435f;
            if (aVar2 != null) {
                aVar2.mo180765a(i, aVar);
            }
            this.f350323b.f355211g.getClass();
        }
    }
}
