package aw0;

import android.content.Context;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import xv0.C112184g;

/* renamed from: aw0.c */
public final class C103921c implements C112184g {

    /* renamed from: d */
    public final Context f307281d;

    /* renamed from: e */
    public ImageView f307282e;

    /* renamed from: f */
    public BallInfo f307283f;

    public C103921c(Context context) {
        C87412m.m108594g(context, "context");
        this.f307281d = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo145544B(java.util.List<com.tencent.p014mm.plugin.ball.model.BallInfo> r9, com.tencent.p014mm.plugin.ball.model.BallInfo r10) {
        /*
            r8 = this;
            java.lang.String r10 = "ballInfoList"
            gy3.C87412m.m108594g(r9, r10)
            java.util.List r9 = aw0.C103925l.m138631e(r9)
            java.util.List r9 = aw0.C103925l.m138630d(r9)
            r10 = 0
            java.lang.Object r9 = sx3.C110818d0.m150917O(r9, r10)
            com.tencent.mm.plugin.ball.model.BallInfo r9 = (com.tencent.p014mm.plugin.ball.model.BallInfo) r9
            java.lang.String r0 = ""
            if (r9 != 0) goto L_0x001a
            r1 = r0
            goto L_0x0042
        L_0x001a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.f311688f
            r1.append(r2)
            r2 = 44
            r1.append(r2)
            int r3 = r9.f311686d
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = r9.f311695p
            r1.append(r3)
            r1.append(r2)
            int r2 = r9.f311698s
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x0042:
            r2 = 0
            boolean r1 = gy3.C87412m.m108589b(r2, r1)
            java.lang.String r3 = "MicroMsg.FloatBallContentViewHelper"
            if (r1 == 0) goto L_0x0051
            java.lang.String r9 = "onFloatBallInfoChanged key not changed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r9)
            return
        L_0x0051:
            r8.f307283f = r9
            r1 = 8
            if (r9 != 0) goto L_0x006d
            java.lang.String r9 = "loadImage currentBall is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
            android.widget.ImageView r9 = r8.f307282e
            if (r9 != 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r9.setVisibility(r1)
        L_0x0064:
            android.widget.ImageView r9 = r8.f307282e
            if (r9 == 0) goto L_0x00e6
            r9.setImageBitmap(r2)
            goto L_0x00e6
        L_0x006d:
            r4 = 1
            int r5 = r9.f311698s     // Catch:{ Exception -> 0x0093 }
            r6 = -1
            if (r5 == r6) goto L_0x009b
            android.widget.ImageView r6 = r8.f307282e     // Catch:{ Exception -> 0x0093 }
            if (r6 != 0) goto L_0x0078
            goto L_0x007b
        L_0x0078:
            r6.setVisibility(r10)     // Catch:{ Exception -> 0x0093 }
        L_0x007b:
            android.widget.ImageView r6 = r8.f307282e     // Catch:{ Exception -> 0x0093 }
            if (r6 == 0) goto L_0x0082
            r6.setImageResource(r5)     // Catch:{ Exception -> 0x0093 }
        L_0x0082:
            java.lang.String r5 = "loadResource type: %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0093 }
            int r7 = r9.f311686d     // Catch:{ Exception -> 0x0093 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0093 }
            r6[r10] = r7     // Catch:{ Exception -> 0x0093 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r6)     // Catch:{ Exception -> 0x0093 }
            r5 = 1
            goto L_0x009c
        L_0x0093:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r7 = "loadResource exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r5, r7, r6)
        L_0x009b:
            r5 = 0
        L_0x009c:
            if (r5 != 0) goto L_0x00e6
            java.lang.String r5 = r9.f311695p
            if (r5 != 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r0 = r5
        L_0x00a4:
            int r5 = r0.length()
            if (r5 != 0) goto L_0x00ac
            r5 = 1
            goto L_0x00ad
        L_0x00ac:
            r5 = 0
        L_0x00ad:
            if (r5 == 0) goto L_0x00b0
            goto L_0x00cf
        L_0x00b0:
            java.lang.String r5 = lb0.C88394b.f255384g
            lb0.b r5 = lb0.C88394b.C88418q.f255427a
            aw0.b r6 = new aw0.b
            r6.<init>(r8, r0)
            r5.mo122796o(r6, r0, r2)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r6 = r9.f311686d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r10] = r6
            r5[r4] = r0
            java.lang.String r10 = "loadResource type: %s, url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r10, r5)
            r10 = 1
        L_0x00cf:
            if (r10 != 0) goto L_0x00e6
            boolean r9 = r8.mo145545a(r9)
            if (r9 != 0) goto L_0x00e6
            android.widget.ImageView r9 = r8.f307282e
            if (r9 != 0) goto L_0x00dc
            goto L_0x00df
        L_0x00dc:
            r9.setVisibility(r1)
        L_0x00df:
            android.widget.ImageView r9 = r8.f307282e
            if (r9 == 0) goto L_0x00e6
            r9.setImageBitmap(r2)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aw0.C103921c.mo145544B(java.util.List, com.tencent.mm.plugin.ball.model.BallInfo):void");
    }

    /* renamed from: a */
    public final boolean mo145545a(BallInfo ballInfo) {
        int k;
        if (ballInfo == null || (k = C103925l.m138637k(ballInfo)) == -1) {
            return false;
        }
        ImageView imageView = this.f307282e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f307282e;
        if (imageView2 != null) {
            imageView2.setImageResource(k);
        }
        Log.m105919d("MicroMsg.FloatBallContentViewHelper", "loadDefault type: %s", Integer.valueOf(ballInfo.f311686d));
        return true;
    }
}
