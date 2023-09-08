package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jp3.C9487b;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import p166hy.C60229z;
import rx3.C13604l;
import sx3.C36907w;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50397mg0;
import te3.C51163rv3;
import te3.C51822we1;
import te3.C64523lg0;
import te3.C64650q60;
import te3.C64800wf1;

/* renamed from: je1.l */
public final class C60803l extends C60625c<C50397mg0> {

    /* renamed from: s */
    public C64523lg0 f173182s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C60803l(java.util.List r9, int r10, int r11, int r12, java.lang.String r13, java.lang.String r14, te3.C64650q60 r15, int r16, int r17, gy3.C8480h r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0017
            r4 = 0
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 16
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0020
            r5 = r6
            goto L_0x0021
        L_0x0020:
            r5 = r13
        L_0x0021:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r6 = r14
        L_0x0027:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x002d
            r7 = 0
            goto L_0x002e
        L_0x002d:
            r7 = r15
        L_0x002e:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r2 = r16
        L_0x0035:
            r10 = r8
            r11 = r9
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60803l.<init>(java.util.List, int, int, int, java.lang.String, java.lang.String, te3.q60, int, int, gy3.h):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50397mg0) eu32, "resp");
        Log.m105924i("Cgi.FinderBatchGetObjectAsyncLoadInfo", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60803l(List<? extends C64800wf1> list, int i, int i2, int i3, String str, String str2, C64650q60 q602, int i4) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C49842ig0 ig02;
        LinkedList<C51822we1> linkedList;
        List<? extends C64800wf1> list2 = list;
        String str3 = str;
        String str4 = str2;
        C64650q60 q603 = q602;
        int i5 = i4;
        C87412m.m108594g(list2, "units");
        C87412m.m108594g(str3, "finderUserName");
        C87412m.m108594g(str4, "uxInfo");
        C64523lg0 lg02 = new C64523lg0();
        this.f173182s = lg02;
        lg02.f184092d = C46523h2.f125330a.mo71859a(6449);
        StringBuilder sb = new StringBuilder();
        sb.append("[init] idList ");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
        for (C64800wf1 wf12 : list) {
            arrayList.add(C61926c.m72691p(wf12.f186081d) + '#' + wf12.f186083f);
        }
        sb.append(arrayList);
        sb.append(" triggerScene:");
        sb.append(i5);
        Log.m105924i("Cgi.FinderBatchGetObjectAsyncLoadInfo", sb.toString());
        this.f173182s.f184093e.addAll(list2);
        C64523lg0 lg03 = this.f173182s;
        lg03.f184094f = i;
        lg03.f184095g = i2;
        lg03.f184096h = i3;
        lg03.f184097i = str3;
        lg03.f184098j = ((C60229z) C86312j.m106911c(C60229z.class)).O10();
        C64523lg0 lg04 = this.f173182s;
        lg04.f184099n = str4;
        lg04.f184102q = i5;
        ArrayList arrayList2 = new ArrayList();
        for (C64800wf1 wf13 : list) {
            arrayList2.add(new C13604l(Integer.valueOf(i3), Long.valueOf(wf13.f186081d)));
        }
        C46523h2.f125330a.mo71865g(this.f173182s.f184092d, arrayList2, (C49712hj1) null);
        if (!(q603 == null || (ig02 = this.f173182s.f184092d) == null || (linkedList = ig02.f135319n) == null)) {
            for (C51822we1 we12 : linkedList) {
                if (we12.f143984d == q603.f184972d) {
                    String str5 = q603.f184973e;
                    we12.f143990j = str5 == null ? "" : str5;
                    Log.m105924i("Cgi.FinderBatchGetObjectAsyncLoadInfo", "objectBaseInfo.id:" + C61926c.m72691p(we12.f143984d) + ", ec_source:" + q603.f184973e);
                }
            }
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f173182s;
        C50397mg0 mg02 = new C50397mg0();
        mg02.setBaseResponse(new C49966ja());
        mg02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = mg02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderbatchgetobjectasyncloadinfo";
        bVar.f127069d = 6449;
        mo123453j(bVar.mo72403a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C60803l(List list, int i, int i2, String str, String str2, int i3, C8480h hVar) {
        this(list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60803l(java.util.List<rx3.C13604l<java.lang.Long, java.lang.String>> r14, int r15, int r16, java.lang.String r17, java.lang.String r18) {
        /*
            r13 = this;
            r0 = r14
            java.lang.String r1 = "objectIds"
            gy3.C87412m.m108594g(r14, r1)
            java.lang.String r1 = "finderUserName"
            r7 = r17
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "uxInfo"
            r8 = r18
            gy3.C87412m.m108594g(r8, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 10
            int r1 = sx3.C36907w.m41090l(r14, r1)
            r3.<init>(r1)
            java.util.Iterator r0 = r14.iterator()
        L_0x0024:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0049
            java.lang.Object r1 = r0.next()
            rx3.l r1 = (rx3.C13604l) r1
            te3.wf1 r2 = new te3.wf1
            r2.<init>()
            A r4 = r1.f38555d
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            r2.f186081d = r4
            B r1 = r1.f38556e
            java.lang.String r1 = (java.lang.String) r1
            r2.f186082e = r1
            r3.add(r2)
            goto L_0x0024
        L_0x0049:
            r5 = 0
            r9 = 0
            r10 = 0
            r11 = 192(0xc0, float:2.69E-43)
            r12 = 0
            r2 = r13
            r4 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60803l.<init>(java.util.List, int, int, java.lang.String, java.lang.String):void");
    }
}
