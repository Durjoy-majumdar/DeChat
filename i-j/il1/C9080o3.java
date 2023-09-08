package il1;

import android.view.View;
import cj1.C0639y1;
import cl1.C0695w;
import cl1.C0696x;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import hp3.C87581a;
import ig1.C8916d;
import java.util.LinkedList;
import java.util.Map;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50172ks0;
import te3.C50477n10;

/* renamed from: il1.o3 */
public final class C9080o3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9048l3 f28646d;

    /* renamed from: il1.o3$a */
    public static final class C9081a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C50477n10 f28647a;

        /* renamed from: b */
        public final /* synthetic */ C8916d f28648b;

        /* renamed from: c */
        public final /* synthetic */ C9048l3 f28649c;

        public C9081a(C50477n10 n102, C8916d dVar, C9048l3 l3Var) {
            this.f28647a = n102;
            this.f28648b = dVar;
            this.f28649c = l3Var;
        }

        public Object call(Object obj) {
            LinkedList<C50477n10> linkedList;
            LinkedList<C50477n10> linkedList2;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            boolean z = true;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C0696x xVar = (C0696x) FinderLiveService.f159376d.mo77630e(C0696x.class);
                if (xVar != null) {
                    C50477n10 n102 = this.f28647a;
                    C87412m.m108594g(n102, "customItem");
                    C50172ks0 ks02 = xVar.f1647j;
                    if (!(ks02 == null || (linkedList2 = ks02.f137022d) == null)) {
                        C61926c.m72675T(linkedList2, new C0695w(n102));
                    }
                    C50172ks0 ks03 = xVar.f1647j;
                    if (!(ks03 == null || (linkedList = ks03.f137022d) == null)) {
                        linkedList.add(n102);
                    }
                }
                C8916d dVar = this.f28648b;
                if (dVar != null) {
                    C0639y1 y1Var = C0639y1.f1510a;
                    Log.m105924i("Finder.FinderLiveGiftLoader", "addOrReplaceGift " + dVar);
                    String str = dVar.field_rewardProductId;
                    if (!(str == null || str.length() == 0)) {
                        z = false;
                    }
                    if (!z) {
                        Map<String, C8916d> map = C0639y1.f1513d;
                        C87412m.m108593f(map, "giftCache");
                        map.put(str, dVar);
                        y1Var.mo619k(dVar, str);
                    }
                }
                C9048l3 l3Var = this.f28649c;
                l3Var.mo9873e();
                l3Var.postDelayed(new C9062m3(l3Var), 300);
                C32224a<C13598b0> aVar = l3Var.f28571h;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else {
                int i = cVar.f256794b;
                if (i == -200189) {
                    String str2 = cVar.f256795c;
                    if (!(str2 == null || str2.length() == 0)) {
                        z = false;
                    }
                    C76912y0.m92767f(this.f28649c.getContext(), z ? this.f28649c.getContext().getResources().getString(C0966R.string.dlt) : cVar.f256795c);
                } else if (i == -200190) {
                    String str3 = cVar.f256795c;
                    if (!(str3 == null || str3.length() == 0)) {
                        z = false;
                    }
                    C76912y0.m92767f(this.f28649c.getContext(), z ? this.f28649c.getContext().getResources().getString(C0966R.string.dls) : cVar.f256795c);
                } else {
                    String string = this.f28649c.getContext().getResources().getString(C0966R.string.dls);
                    C87412m.m108593f(string, "context.resources.getStr…ve_fans_club_modify_fail)");
                    C76912y0.m92767f(this.f28649c.getContext(), string);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C9080o3(C9048l3 l3Var) {
        this.f28646d = l3Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r21) {
        /*
            r20 = this;
            r7 = r20
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r21
            r0.add(r1)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r20
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            il1.l3 r0 = r7.f28646d
            te3.fy0 r1 = r0.f28584x
            r2 = 0
            if (r1 == 0) goto L_0x002a
            int r1 = r1.f133741n
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            java.lang.String r3 = "Finder.FinderLiveFansModifyGiftWidget"
            java.lang.String r4 = "(Landroid/view/View;)V"
            java.lang.String r5 = "onClick"
            java.lang.String r6 = "android/view/View$OnClickListener"
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$1"
            if (r1 <= 0) goto L_0x008a
            java.lang.String r0 = r0.f28566B
            int r0 = r0.length()
            if (r0 <= r1) goto L_0x008a
            il1.l3 r0 = r7.f28646d
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131827536(0x7f111b50, float:1.9287987E38)
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = "context.resources.getStr…e_gift_modify_text_limit)"
            gy3.C87412m.m108593f(r0, r2)
            il1.l3 r2 = r7.f28646d
            android.content.Context r2 = r2.getContext()
            r9 = 2131756148(0x7f100474, float:1.9143195E38)
            nj3.C76912y0.m92769h(r2, r0, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "textlimit "
            r0.append(r2)
            il1.l3 r2 = r7.f28646d
            java.lang.String r2 = r2.f28566B
            int r2 = r2.length()
            r0.append(r2)
            java.lang.String r2 = ", max:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            j20.C117292a.m165361g(r7, r8, r6, r5, r4)
            return
        L_0x008a:
            te3.n10 r1 = new te3.n10
            r1.<init>()
            il1.l3 r0 = r7.f28646d
            te3.fy0 r9 = r0.f28584x
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x009b
            java.lang.String r9 = r9.f133734d
            if (r9 != 0) goto L_0x009c
        L_0x009b:
            r9 = r10
        L_0x009c:
            r1.f138321d = r9
            te3.p11 r9 = r0.f28565A
            if (r9 == 0) goto L_0x00a6
            java.lang.String r9 = r9.f139507d
            if (r9 != 0) goto L_0x00a7
        L_0x00a6:
            r9 = r10
        L_0x00a7:
            r1.f138322e = r9
            boolean r9 = r0.mo9872d()
            if (r9 == 0) goto L_0x00b2
            java.lang.String r9 = r0.f28566B
            goto L_0x00b3
        L_0x00b2:
            r9 = r10
        L_0x00b3:
            r1.f138323f = r9
            java.lang.String r9 = r1.f138321d
            r11 = 1
            if (r9 == 0) goto L_0x00c3
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r9 = 0
            goto L_0x00c4
        L_0x00c3:
            r9 = 1
        L_0x00c4:
            r12 = 0
            if (r9 != 0) goto L_0x0152
            java.lang.String r9 = r1.f138322e
            if (r9 == 0) goto L_0x00d4
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r9 = 0
            goto L_0x00d5
        L_0x00d4:
            r9 = 1
        L_0x00d5:
            if (r9 == 0) goto L_0x00d9
            goto L_0x0152
        L_0x00d9:
            il1.l3 r0 = r7.f28646d
            te3.p11 r3 = r0.f28565A
            if (r3 == 0) goto L_0x0116
            ig1.d$a r9 = ig1.C8916d.f28211b1
            ig1.d r3 = r9.mo9727a(r3)
            te3.s11 r9 = new te3.s11
            r9.<init>()
            te3.p11 r0 = r0.f28565A
            if (r0 == 0) goto L_0x00f5
            pe3.b r0 = r0.f139522v
            if (r0 == 0) goto L_0x00f5
            byte[] r0 = r0.f257327a
            goto L_0x00f6
        L_0x00f5:
            r0 = r12
        L_0x00f6:
            if (r0 != 0) goto L_0x00fa
        L_0x00f8:
            r9 = r12
            goto L_0x010b
        L_0x00fa:
            r9.parseFrom(r0)     // Catch:{ Exception -> 0x00fe }
            goto L_0x010b
        L_0x00fe:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r2] = r9
            java.lang.String r2 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r10, r0)
            goto L_0x00f8
        L_0x010b:
            if (r9 == 0) goto L_0x0112
            byte[] r0 = r9.toByteArray()
            goto L_0x0113
        L_0x0112:
            r0 = r12
        L_0x0113:
            r3.field_customInfo = r0
            goto L_0x0117
        L_0x0116:
            r3 = r12
        L_0x0117:
            r0 = 3
            te3.ks0 r2 = new te3.ks0
            r2.<init>()
            java.util.LinkedList<te3.n10> r9 = r2.f137022d
            r9.add(r1)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            qg1.e r9 = new qg1.e
            r9.<init>((int) r0, (te3.C50172ks0) r2, (te3.C49712hj1) r12)
            il1.l3 r0 = r7.f28646d
            android.content.Context r14 = r0.getContext()
            java.lang.String r0 = "context"
            gy3.C87412m.m108593f(r14, r0)
            r16 = 0
            r18 = 4
            r19 = 0
            java.lang.String r15 = ""
            r13 = r9
            it1.C60625c.m70894l(r13, r14, r15, r16, r18, r19)
            nr3.e r0 = r9.mo9225i()
            il1.o3$a r2 = new il1.o3$a
            il1.l3 r9 = r7.f28646d
            r2.<init>(r1, r3, r9)
            r0.mo123062e(r2)
            j20.C117292a.m165361g(r7, r8, r6, r5, r4)
            return
        L_0x0152:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "giftId:"
            r1.append(r2)
            te3.fy0 r2 = r0.f28584x
            if (r2 == 0) goto L_0x0163
            java.lang.String r2 = r2.f133734d
            goto L_0x0164
        L_0x0163:
            r2 = r12
        L_0x0164:
            r1.append(r2)
            java.lang.String r2 = ", rewardid:"
            r1.append(r2)
            te3.p11 r0 = r0.f28565A
            if (r0 == 0) goto L_0x0172
            java.lang.String r12 = r0.f139507d
        L_0x0172:
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            j20.C117292a.m165361g(r7, r8, r6, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9080o3.onClick(android.view.View):void");
    }
}
