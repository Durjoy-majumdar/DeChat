package vl1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0798z0;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;

/* renamed from: vl1.f */
public final class C14897f extends C60896i<C0798z0> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ahw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (r9 == null) goto L_0x0058;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r5, jq3.C9493c r6, int r7, int r8, boolean r9, java.util.List r10) {
        /*
            r4 = this;
            cm1.z0 r6 = (cm1.C0798z0) r6
            java.lang.String r7 = "holder"
            gy3.C87412m.m108594g(r5, r7)
            java.lang.String r7 = "item"
            gy3.C87412m.m108594g(r6, r7)
            r5.f173503E = r6
            android.content.Context r7 = r5.f173499A
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131308212(0x7f092eb4, float:1.8234673E38)
            android.view.View r8 = r5.mo85812D(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r9 = r6.mo731b()
            boolean r10 = r9 instanceof te3.C52204z21
            java.lang.String r0 = "FinderLotteryHistoryData"
            r1 = 33
            java.lang.String r2 = ""
            if (r10 == 0) goto L_0x0036
            ok1.e r10 = ok1.C62042e.f176370a
            te3.z21 r9 = (te3.C52204z21) r9
            te3.u21 r9 = r9.f145645i
            java.lang.String r9 = r10.mo87103o0(r9)
            goto L_0x0059
        L_0x0036:
            boolean r10 = r9 instanceof te3.C50191kx2
            if (r10 == 0) goto L_0x0041
            te3.kx2 r9 = (te3.C50191kx2) r9
            java.lang.String r9 = r9.f137082e
            if (r9 != 0) goto L_0x0059
            goto L_0x0058
        L_0x0041:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "getPersonalMsgScene fail,lottery is "
            r10.append(r3)
            r10.append(r9)
            r10.append(r1)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
        L_0x0058:
            r9 = r2
        L_0x0059:
            r8.setText(r9)
            java.lang.Object r8 = r6.mo731b()
            boolean r9 = r8 instanceof te3.C52204z21
            if (r9 == 0) goto L_0x0069
            te3.z21 r8 = (te3.C52204z21) r8
            java.lang.String r2 = r8.f145644h
            goto L_0x0089
        L_0x0069:
            boolean r9 = r8 instanceof te3.C50191kx2
            if (r9 == 0) goto L_0x0072
            te3.kx2 r8 = (te3.C50191kx2) r8
            java.lang.String r2 = r8.f137081d
            goto L_0x0089
        L_0x0072:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "getLotteryDesc fail,lottery is "
            r9.append(r10)
            r9.append(r8)
            r9.append(r1)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
        L_0x0089:
            r8 = 2131308262(0x7f092ee6, float:1.8234775E38)
            if (r2 == 0) goto L_0x00b7
            int r9 = r2.length()
            r10 = 0
            r0 = 1
            if (r9 <= 0) goto L_0x0098
            r9 = 1
            goto L_0x0099
        L_0x0098:
            r9 = 0
        L_0x0099:
            if (r9 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r2 = 0
        L_0x009d:
            if (r2 == 0) goto L_0x00b7
            android.view.View r8 = r5.mo85812D(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131827856(0x7f111c90, float:1.9288636E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r10] = r2
            java.lang.String r7 = r7.getString(r9, r0)
            r8.setText(r7)
            r8.getVisibility()
            goto L_0x00c0
        L_0x00b7:
            android.view.View r7 = r5.mo85812D(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.getVisibility()
        L_0x00c0:
            r7 = 2131315233(0x7f094a21, float:1.8248913E38)
            android.view.View r7 = r5.mo85812D(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.content.Context r5 = r5.f173499A
            r8 = 2131830343(0x7f112647, float:1.929368E38)
            java.lang.String r5 = r5.getString(r8)
            int r6 = r6.mo732d()
            long r8 = (long) r6
            r6 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r6
            long r8 = r8 * r0
            java.lang.String r5 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85114g(r5, r8)
            r7.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl1.C14897f.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
