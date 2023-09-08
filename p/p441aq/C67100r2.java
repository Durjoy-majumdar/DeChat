package p441aq;

import android.content.Context;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72839w1;
import com.tencent.p014mm.view.SmileyPanelImpl;
import di3.C86301e;
import ei3.C86522b;
import p008bq.C67307q1;
import p248ug.C78158s0;

@C86522b
/* renamed from: aq.r2 */
public class C67100r2 extends C86301e implements C67307q1 {
    /* renamed from: Dv */
    public C78158s0 mo91195Dv() {
        return new C72839w1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Pg0(android.content.Context r10) {
        /*
            r9 = this;
            android.content.res.Resources r0 = r10.getResources()
            r1 = 2131166360(0x7f070498, float:1.7946963E38)
            int r0 = r0.getDimensionPixelOffset(r1)
            android.content.res.Resources r1 = r10.getResources()
            r2 = 2131165359(0x7f0700af, float:1.7944933E38)
            int r1 = r1.getDimensionPixelOffset(r2)
            android.content.res.Resources r2 = r10.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            boolean r5 = r10 instanceof android.app.Activity
            if (r5 == 0) goto L_0x003b
            r5 = r10
            android.app.Activity r5 = (android.app.Activity) r5
            r6 = 24
            boolean r6 = p206nj.C11171e.m11046c(r6)
            if (r6 == 0) goto L_0x003b
            boolean r5 = r5.isInMultiWindowMode()
            goto L_0x003c
        L_0x003b:
            r5 = 0
        L_0x003c:
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>()
            java.lang.String r7 = "window"
            java.lang.Object r7 = r10.getSystemService(r7)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            android.view.Display r7 = r7.getDefaultDisplay()
            r7.getSize(r6)
            java.lang.String r7 = "MicroMsg.SmileyPanelFeatureService"
            r8 = 2
            if (r2 == 0) goto L_0x0075
            if (r5 != 0) goto L_0x0075
            int r10 = r6.y
            int r10 = r10 / r8
            int r10 = r10 - r1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r4] = r2
            java.lang.String r2 = "getRecommendHeight: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r1)
            if (r10 <= 0) goto L_0x0074
            if (r10 >= r0) goto L_0x0074
            return r10
        L_0x0074:
            return r0
        L_0x0075:
            android.content.res.Resources r10 = r10.getResources()
            r0 = 2131166353(0x7f070491, float:1.7946949E38)
            int r10 = r10.getDimensionPixelOffset(r0)
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0[r3] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r0[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            r1 = 3
            int r2 = r6.y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "getRecommendHeight: %s, %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            int r0 = r6.y
            if (r0 <= 0) goto L_0x00ad
            int r1 = r0 / 2
            if (r10 <= r1) goto L_0x00ad
            int r0 = r0 / r8
            return r0
        L_0x00ad:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p441aq.C67100r2.Pg0(android.content.Context):int");
    }

    /* renamed from: TK */
    public SmileyPanel mo91197TK(Context context, boolean z) {
        return new SmileyPanelImpl(context, z);
    }

    /* renamed from: wG */
    public SmileyPanel mo91198wG(Context context) {
        return new SmileyPanelImpl(context, false);
    }
}
