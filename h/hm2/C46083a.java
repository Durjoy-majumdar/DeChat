package hm2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dm2.C45424g;
import dm2.C45425h;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import pe3.C47465a;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C51313sy;
import te3.C51462ty;
import te3.C51612uy;

@C113200q(initialMode = 2)
/* renamed from: hm2.a */
public final class C46083a extends UIComponent {

    /* renamed from: d */
    public final String f124238d = "MicroMsg.SecData.SecDataUIC";

    /* renamed from: e */
    public final C51462ty f124239e = new C51462ty();

    /* renamed from: f */
    public final HashMap<Integer, C45425h<?>> f124240f = new HashMap<>();

    /* renamed from: g */
    public final HashMap<Integer, C45424g<?>> f124241g = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46083a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final <T extends C47465a> C45424g<T> mo71518c3(int i) {
        C45424g<?> gVar = this.f124241g.get(Integer.valueOf(i));
        if (gVar instanceof C45424g) {
            return gVar;
        }
        return null;
    }

    /* renamed from: d3 */
    public final <T extends C47465a> T mo71519d3(int i, int i2, Class<T> cls) {
        C51313sy syVar;
        LinkedList<C51612uy> linkedList;
        T t;
        boolean z;
        C87412m.m108594g(cls, "clazz");
        LinkedList<C51313sy> linkedList2 = this.f124239e.f142468d;
        if (!(linkedList2.size() > i)) {
            linkedList2 = null;
        }
        if (!(linkedList2 == null || (syVar = linkedList2.get(i)) == null || (linkedList = syVar.f141825i) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C51612uy) t).f143178d == i2) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C51612uy uyVar = (C51612uy) t;
            if (uyVar != null) {
                T t2 = (C47465a) cls.newInstance();
                t2.parseFrom(uyVar.f143179e.mo123703f());
                return t2;
            }
        }
        return null;
    }

    /* renamed from: e3 */
    public final C45425h<?> mo71520e3(int i) {
        return this.f124240f.get(Integer.valueOf(i));
    }

    /* renamed from: f3 */
    public final void mo71521f3(Intent intent) {
        C13598b0 b0Var;
        this.f124240f.clear();
        this.f124241g.clear();
        this.f124239e.f142468d.clear();
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ReportKey.CommonReportObjKey");
            if (byteArrayExtra != null) {
                this.f124239e.parseFrom(byteArrayExtra);
            }
        } catch (Exception unused) {
        }
        C51313sy syVar = new C51313sy();
        syVar.f141820d = getActivity().getClass().getSimpleName();
        syVar.f141822f = C31543z5.m39453c();
        LinkedList<C51313sy> linkedList = this.f124239e.f142468d;
        C87412m.m108593f(linkedList, "reportObjList.List");
        C51313sy syVar2 = (C51313sy) C110818d0.m150916N(linkedList);
        if (syVar2 != null) {
            syVar.f141821e = syVar2.f141821e;
            syVar.f141823g = syVar2.f141823g;
            syVar.f141824h = 0;
            String str = this.f124238d;
            Log.m105924i(str, "fromPage:" + syVar2.f141820d + " contextId:" + syVar2.f141821e + " currentPage:" + syVar.f141820d);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            syVar.f141821e = UUID.randomUUID().toString();
            syVar.f141823g = 0;
            syVar.f141824h = 1;
            String str2 = this.f124238d;
            Log.m105924i(str2, "firstPage:" + syVar.f141820d + " contextId:" + syVar.f141821e);
        }
        this.f124239e.f142468d.addFirst(syVar);
        if (this.f124239e.f142468d.size() > 5) {
            this.f124239e.f142468d.removeLast();
        }
    }

    /* renamed from: g3 */
    public final <T extends C47465a> void mo71522g3(C45425h<T> hVar) {
        C87412m.m108594g(hVar, "secData");
        this.f124240f.put(Integer.valueOf(hVar.getType()), hVar);
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        mo71521f3(getIntent());
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i(this.f124238d, "onNewIntent " + intent);
        Intent intent2 = null;
        if (intent != null) {
            if (!intent.getBooleanExtra("ReportKey.CommonReportNewIntentClearKey", false)) {
                intent = null;
            }
            if (intent != null) {
                mo71521f3(intent);
                return;
            }
        }
        Intent intent3 = getIntent();
        if (intent3.getBooleanExtra("ReportKey.CommonReportNewIntentClearKey", false)) {
            intent2 = intent3;
        }
        if (intent2 != null) {
            mo71521f3(intent2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        r5 = r5.f141825i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStartActivityForResult(android.content.Intent r10, int r11, android.os.Bundle r12) {
        /*
            r9 = this;
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x0159 }
            r0.<init>()     // Catch:{ Exception -> 0x0159 }
            java.util.HashMap<java.lang.Integer, dm2.h<?>> r1 = r9.f124240f     // Catch:{ Exception -> 0x0159 }
            java.util.Collection r1 = r1.values()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r2 = "pageSecDataMap.values"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x0159 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0159 }
        L_0x0015:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r3 = "reportObjList.List"
            if (r2 == 0) goto L_0x006c
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0159 }
            dm2.h r2 = (dm2.C45425h) r2     // Catch:{ Exception -> 0x0159 }
            boolean r4 = r2.mo70913b(r10)     // Catch:{ Exception -> 0x0159 }
            if (r4 == 0) goto L_0x0015
            te3.uy r4 = new te3.uy     // Catch:{ Exception -> 0x0159 }
            r4.<init>()     // Catch:{ Exception -> 0x0159 }
            int r5 = r2.getType()     // Catch:{ Exception -> 0x0159 }
            r4.f143178d = r5     // Catch:{ Exception -> 0x0159 }
            pe3.b r5 = new pe3.b     // Catch:{ Exception -> 0x0159 }
            pe3.a r6 = r2.mo70914c()     // Catch:{ Exception -> 0x0159 }
            byte[] r6 = r6.toByteArray()     // Catch:{ Exception -> 0x0159 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0159 }
            r4.f143179e = r5     // Catch:{ Exception -> 0x0159 }
            te3.ty r5 = r9.f124239e     // Catch:{ Exception -> 0x0159 }
            java.util.LinkedList<te3.sy> r5 = r5.f142468d     // Catch:{ Exception -> 0x0159 }
            gy3.C87412m.m108593f(r5, r3)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r3 = sx3.C110818d0.m150916N(r5)     // Catch:{ Exception -> 0x0159 }
            te3.sy r3 = (te3.C51313sy) r3     // Catch:{ Exception -> 0x0159 }
            if (r3 == 0) goto L_0x005a
            java.util.LinkedList<te3.uy> r3 = r3.f141825i     // Catch:{ Exception -> 0x0159 }
            if (r3 == 0) goto L_0x005a
            r3.add(r4)     // Catch:{ Exception -> 0x0159 }
        L_0x005a:
            boolean r3 = r2.mo70912a()     // Catch:{ Exception -> 0x0159 }
            if (r3 != 0) goto L_0x0015
            int r2 = r2.getType()     // Catch:{ Exception -> 0x0159 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0159 }
            r0.add(r2)     // Catch:{ Exception -> 0x0159 }
            goto L_0x0015
        L_0x006c:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0159 }
        L_0x0070:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0159 }
            if (r1 == 0) goto L_0x008a
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0159 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ Exception -> 0x0159 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0159 }
            java.util.HashMap<java.lang.Integer, dm2.h<?>> r2 = r9.f124240f     // Catch:{ Exception -> 0x0159 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0159 }
            r2.remove(r1)     // Catch:{ Exception -> 0x0159 }
            goto L_0x0070
        L_0x008a:
            r0 = 262144(0x40000, float:3.67342E-40)
            te3.ty r1 = r9.f124239e     // Catch:{ Exception -> 0x0159 }
            byte[] r1 = r1.toByteArray()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r2 = r9.f124238d     // Catch:{ Exception -> 0x0159 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159 }
            r4.<init>()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r5 = "onStartActivityForResult SubObjList.size:"
            r4.append(r5)     // Catch:{ Exception -> 0x0159 }
            te3.ty r5 = r9.f124239e     // Catch:{ Exception -> 0x0159 }
            java.util.LinkedList<te3.sy> r5 = r5.f142468d     // Catch:{ Exception -> 0x0159 }
            gy3.C87412m.m108593f(r5, r3)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)     // Catch:{ Exception -> 0x0159 }
            te3.sy r5 = (te3.C51313sy) r5     // Catch:{ Exception -> 0x0159 }
            if (r5 == 0) goto L_0x00bb
            java.util.LinkedList<te3.uy> r5 = r5.f141825i     // Catch:{ Exception -> 0x0159 }
            if (r5 == 0) goto L_0x00bb
            int r5 = r5.size()     // Catch:{ Exception -> 0x0159 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0159 }
            goto L_0x00bc
        L_0x00bb:
            r5 = 0
        L_0x00bc:
            r4.append(r5)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r5 = ", requestCode:"
            r4.append(r5)     // Catch:{ Exception -> 0x0159 }
            r4.append(r11)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = " options:"
            r4.append(r11)     // Catch:{ Exception -> 0x0159 }
            r4.append(r12)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = " byteSize:"
            r4.append(r11)     // Catch:{ Exception -> 0x0159 }
            int r11 = r1.length     // Catch:{ Exception -> 0x0159 }
            r4.append(r11)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = r4.toString()     // Catch:{ Exception -> 0x0159 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)     // Catch:{ Exception -> 0x0159 }
            int r11 = r1.length     // Catch:{ Exception -> 0x0159 }
            if (r11 <= r0) goto L_0x0131
            int r11 = r1.length     // Catch:{ Exception -> 0x0159 }
            te3.ty r12 = r9.f124239e     // Catch:{ Exception -> 0x0159 }
            java.util.LinkedList<te3.sy> r12 = r12.f142468d     // Catch:{ Exception -> 0x0159 }
            gy3.C87412m.m108593f(r12, r3)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r12 = sx3.C110818d0.m150916N(r12)     // Catch:{ Exception -> 0x0159 }
            te3.sy r12 = (te3.C51313sy) r12     // Catch:{ Exception -> 0x0159 }
            if (r12 == 0) goto L_0x0100
            te3.ty r1 = r9.f124239e     // Catch:{ Exception -> 0x0159 }
            java.util.LinkedList<te3.sy> r1 = r1.f142468d     // Catch:{ Exception -> 0x0159 }
            r1.clear()     // Catch:{ Exception -> 0x0159 }
            te3.ty r1 = r9.f124239e     // Catch:{ Exception -> 0x0159 }
            java.util.LinkedList<te3.sy> r1 = r1.f142468d     // Catch:{ Exception -> 0x0159 }
            r1.add(r12)     // Catch:{ Exception -> 0x0159 }
        L_0x0100:
            te3.ty r12 = r9.f124239e     // Catch:{ Exception -> 0x0159 }
            byte[] r1 = r12.toByteArray()     // Catch:{ Exception -> 0x0159 }
            int r12 = r1.length     // Catch:{ Exception -> 0x0159 }
            java.lang.String r2 = r9.f124238d     // Catch:{ Exception -> 0x0159 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159 }
            r4.<init>()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r5 = "data size large than 256KB origin:"
            r4.append(r5)     // Catch:{ Exception -> 0x0159 }
            long r5 = (long) r11     // Catch:{ Exception -> 0x0159 }
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r5, r7)     // Catch:{ Exception -> 0x0159 }
            r4.append(r11)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = " current:"
            r4.append(r11)     // Catch:{ Exception -> 0x0159 }
            long r11 = (long) r12     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r11, r7)     // Catch:{ Exception -> 0x0159 }
            r4.append(r11)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = r4.toString()     // Catch:{ Exception -> 0x0159 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)     // Catch:{ Exception -> 0x0159 }
        L_0x0131:
            int r11 = r1.length     // Catch:{ Exception -> 0x0159 }
            if (r11 >= r0) goto L_0x013c
            if (r10 == 0) goto L_0x0143
            java.lang.String r11 = "ReportKey.CommonReportObjKey"
            r10.putExtra(r11, r1)     // Catch:{ Exception -> 0x0159 }
            goto L_0x0143
        L_0x013c:
            java.lang.String r10 = r9.f124238d     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = "data size two large"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r11)     // Catch:{ Exception -> 0x0159 }
        L_0x0143:
            te3.ty r10 = r9.f124239e     // Catch:{ Exception -> 0x0159 }
            java.util.LinkedList<te3.sy> r10 = r10.f142468d     // Catch:{ Exception -> 0x0159 }
            gy3.C87412m.m108593f(r10, r3)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r10 = sx3.C110818d0.m150916N(r10)     // Catch:{ Exception -> 0x0159 }
            te3.sy r10 = (te3.C51313sy) r10     // Catch:{ Exception -> 0x0159 }
            if (r10 == 0) goto L_0x0159
            java.util.LinkedList<te3.uy> r10 = r10.f141825i     // Catch:{ Exception -> 0x0159 }
            if (r10 == 0) goto L_0x0159
            r10.clear()     // Catch:{ Exception -> 0x0159 }
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hm2.C46083a.onStartActivityForResult(android.content.Intent, int, android.os.Bundle):void");
    }
}
