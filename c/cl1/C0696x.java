package cl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p749xh.C38596k3;
import te3.C49486fy0;
import te3.C50172ks0;
import te3.C50326ly0;

/* renamed from: cl1.x */
public final class C0696x extends C39970c<C45795b> {

    /* renamed from: f */
    public boolean f1643f;

    /* renamed from: g */
    public C50326ly0 f1644g;

    /* renamed from: h */
    public C38596k3 f1645h;

    /* renamed from: i */
    public final List<C49486fy0> f1646i = new ArrayList();

    /* renamed from: j */
    public C50172ks0 f1647j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0696x(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveBuContext");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (gy3.C87412m.m108589b(r2, r1) == false) goto L_0x0047;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo659c3(te3.C50326ly0 r5) {
        /*
            r4 = this;
            te3.ly0 r0 = r4.f1644g
            r1 = 0
            if (r5 == 0) goto L_0x0008
            java.lang.String r2 = r5.f137706d
            goto L_0x0009
        L_0x0008:
            r2 = r1
        L_0x0009:
            if (r0 == 0) goto L_0x000e
            java.lang.String r3 = r0.f137706d
            goto L_0x000f
        L_0x000e:
            r3 = r1
        L_0x000f:
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x0047
            if (r5 == 0) goto L_0x001e
            int r2 = r5.f137708f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x001f
        L_0x001e:
            r2 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0028
            int r3 = r0.f137708f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0029
        L_0x0028:
            r3 = r1
        L_0x0029:
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x0047
            if (r5 == 0) goto L_0x0038
            boolean r2 = r5.f137707e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0039
        L_0x0038:
            r2 = r1
        L_0x0039:
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.f137707e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0041:
            boolean r0 = gy3.C87412m.m108589b(r2, r1)
            if (r0 != 0) goto L_0x0067
        L_0x0047:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "printNewFansClubInfo "
            r0.append(r1)
            if (r5 != 0) goto L_0x0056
            java.lang.String r1 = ""
            goto L_0x0057
        L_0x0056:
            r1 = r5
        L_0x0057:
            org.json.JSONObject r1 = o40.C61937h.m72709h(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LiveFansClubSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0067:
            r4.f1644g = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C0696x.mo659c3(te3.ly0):void");
    }

    /* renamed from: d3 */
    public final void mo660d3(boolean z) {
        C58739j4 j4Var = C58739j4.f168176a;
        if (j4Var.mo83692U()) {
            Log.m105924i("LiveFansClubSlice", "isFansClubMember:" + this.f1643f + ",new:" + z);
        }
        if (z != this.f1643f) {
            if (j4Var.mo83692U()) {
                Log.printInfoStack("LiveFansClubSlice", "isFansClubMember:" + this.f1643f + ",new:" + z, new Object[0]);
            } else {
                Log.m105924i("LiveFansClubSlice", "isFansClubMember:" + this.f1643f + ",new:" + z);
            }
        }
        this.f1643f = z;
    }

    /* renamed from: e3 */
    public final void mo661e3(C38596k3 k3Var) {
        Float f = null;
        String str = k3Var != null ? k3Var.field_rewardProductId : null;
        C38596k3 k3Var2 = this.f1645h;
        if (!C87412m.m108589b(str, k3Var2 != null ? k3Var2.field_rewardProductId : null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("joinGift:");
            C38596k3 k3Var3 = this.f1645h;
            sb.append(k3Var3 != null ? k3Var3.field_rewardProductId : null);
            sb.append(',');
            C38596k3 k3Var4 = this.f1645h;
            sb.append(k3Var4 != null ? Integer.valueOf(k3Var4.field_flag) : null);
            sb.append(',');
            C38596k3 k3Var5 = this.f1645h;
            sb.append(k3Var5 != null ? Integer.valueOf(k3Var5.field_unlockIntimacyLevel) : null);
            sb.append(',');
            C38596k3 k3Var6 = this.f1645h;
            sb.append(k3Var6 != null ? Float.valueOf(k3Var6.field_price) : null);
            sb.append(",new:");
            sb.append(k3Var != null ? k3Var.field_rewardProductId : null);
            sb.append(',');
            sb.append(k3Var != null ? Integer.valueOf(k3Var.field_flag) : null);
            sb.append(',');
            sb.append(k3Var != null ? Integer.valueOf(k3Var.field_unlockIntimacyLevel) : null);
            sb.append(',');
            if (k3Var != null) {
                f = Float.valueOf(k3Var.field_price);
            }
            sb.append(f);
            Log.m105924i("LiveFansClubSlice", sb.toString());
        }
        this.f1645h = k3Var;
    }

    public void onCleared() {
        mo660d3(false);
        mo659c3((C50326ly0) null);
        mo661e3((C38596k3) null);
    }
}
