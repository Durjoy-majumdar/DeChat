package fx0;

import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import te3.C49566gj;

/* renamed from: fx0.n */
public class C32209n implements C11385n {

    /* renamed from: d */
    public LinkedList<C32210a> f85614d = new LinkedList<>();

    /* renamed from: e */
    public List<C49566gj> f85615e = new LinkedList();

    /* renamed from: f */
    public List<C49566gj> f85616f = new LinkedList();

    /* renamed from: fx0.n$a */
    public interface C32210a {
        void onChange();
    }

    public C32209n() {
        C86709a0.m107524d().mo123455a(387, this);
        C86709a0.m107524d().mo123460f(new C32211r());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072 A[EDGE_INSN: B:39:0x0072->B:22:0x0072 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r5, int r6, java.lang.String r7, ob0.C117747y r8) {
        /*
            r4 = this;
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1 = 0
            r7[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2 = 1
            r7[r2] = r0
            java.lang.String r0 = "MicroMsg.BrandService.BrandServiceMgr"
            java.lang.String r3 = "on scene end code(%d, %d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r7)
            if (r5 != 0) goto L_0x00b0
            if (r6 == 0) goto L_0x001e
            goto L_0x00b0
        L_0x001e:
            int r5 = r8.getType()
            r6 = 387(0x183, float:5.42E-43)
            if (r5 != r6) goto L_0x00b0
            fx0.r r8 = (fx0.C32211r) r8
            java.util.LinkedList<java.lang.String> r5 = r8.f85619f
            if (r5 != 0) goto L_0x0033
            java.lang.String r5 = "nameList is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            goto L_0x00b0
        L_0x0033:
            java.util.List<te3.gj> r6 = r4.f85615e
            if (r6 == 0) goto L_0x00ab
            java.util.List<te3.gj> r6 = r4.f85616f
            if (r6 != 0) goto L_0x003d
            goto L_0x00ab
        L_0x003d:
            int r6 = r5.size()
            java.util.List<te3.gj> r7 = r4.f85615e
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            int r7 = r7.size()
            java.util.List<te3.gj> r8 = r4.f85616f
            java.util.LinkedList r8 = (java.util.LinkedList) r8
            int r8 = r8.size()
            int r7 = r7 + r8
            if (r6 == r7) goto L_0x0055
            goto L_0x0092
        L_0x0055:
            java.util.List<te3.gj> r6 = r4.f85615e
            java.util.Iterator r6 = r6.iterator()
        L_0x005b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0072
            java.lang.Object r7 = r6.next()
            te3.gj r7 = (te3.C49566gj) r7
            if (r7 == 0) goto L_0x0071
            java.lang.String r7 = r7.f134062d
            boolean r7 = r5.contains(r7)
            if (r7 != 0) goto L_0x005b
        L_0x0071:
            r1 = 1
        L_0x0072:
            if (r1 != 0) goto L_0x0091
            java.util.List<te3.gj> r6 = r4.f85616f
            java.util.Iterator r6 = r6.iterator()
        L_0x007a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0091
            java.lang.Object r7 = r6.next()
            te3.gj r7 = (te3.C49566gj) r7
            if (r7 == 0) goto L_0x0092
            java.lang.String r7 = r7.f134062d
            boolean r7 = r5.contains(r7)
            if (r7 != 0) goto L_0x007a
            goto L_0x0092
        L_0x0091:
            r2 = r1
        L_0x0092:
            if (r2 != 0) goto L_0x0095
            goto L_0x00b0
        L_0x0095:
            java.util.LinkedList<fx0.n$a> r5 = r4.f85614d
            java.util.Iterator r5 = r5.iterator()
        L_0x009b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b0
            java.lang.Object r6 = r5.next()
            fx0.n$a r6 = (fx0.C32209n.C32210a) r6
            r6.onChange()
            goto L_0x009b
        L_0x00ab:
            java.lang.String r5 = "enterpriseItemList or subscribeAndServiceItemList is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fx0.C32209n.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
