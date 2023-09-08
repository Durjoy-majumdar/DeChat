package p647po;

import a14.C53934p0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.modelcdntran.C92782j;
import com.tencent.p014mm.modelcdntran.C92788l;
import com.tencent.p014mm.modelcdntran.C92789m;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p663qo.C63287k;
import rx3.C36570n;
import wx3.C15601d;

@C86522b
/* renamed from: po.g */
public final class C100831g extends C86301e implements C63287k {
    /* renamed from: kj */
    public void mo88181kj(C92795s sVar) {
        C87412m.m108594g(sVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C92782j Bx0 = C92779i0.Bx0();
        if (Bx0 != null) {
            synchronized (Bx0.mo127014l3()) {
                Bx0.mo127014l3().remove(sVar);
            }
            Log.m105924i("MicroMsg.CdnMediaFSC", "remove listener " + sVar + ", now listener count:" + Bx0.mo127014l3().size());
        }
    }

    /* renamed from: lc */
    public boolean mo88182lc(String str) {
        C87412m.m108594g(str, "mediaId");
        C92782j Bx0 = C92779i0.Bx0();
        if (Bx0 == null) {
            return false;
        }
        LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) Bx0.f267062j).getValue(), (C53934p0) null, new C92788l(Bx0, str, (C15601d<? super C92788l>) null), 1, (Object) null);
        return false;
    }

    /* renamed from: rC */
    public String mo88183rC(String str) {
        C92782j Bx0 = C92779i0.Bx0();
        if (Bx0 != null) {
            return Bx0.mo127012j3(str);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r11.f157731m, r11.f157729k) != false) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
    /* renamed from: wS */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p1081gi.C98124g mo88184wS(com.tencent.p014mm.modelcdntran.C55385t r11) {
        /*
            r10 = this;
            java.lang.String r0 = "taskInfo"
            gy3.C87412m.m108594g(r11, r0)
            com.tencent.mm.modelcdntran.j r0 = com.tencent.p014mm.modelcdntran.C92779i0.Bx0()
            r1 = 0
            if (r0 == 0) goto L_0x00d3
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = r11.f157721c
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = r11.f157722d
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = r11.f157726h
            r6 = 2
            r2[r6] = r3
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r2)
            if (r2 == 0) goto L_0x0026
            goto L_0x0056
        L_0x0026:
            long r2 = r11.f157724f
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0056
            int r2 = r11.f157727i
            if (r2 > 0) goto L_0x0033
            goto L_0x0056
        L_0x0033:
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r3 = r11.f157720b
            r2[r4] = r3
            java.lang.String r3 = r11.f157719a
            r2[r5] = r3
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r2)
            if (r2 == 0) goto L_0x0054
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r3 = r11.f157731m
            r2[r4] = r3
            java.lang.String r3 = r11.f157729k
            r2[r5] = r3
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r2)
            if (r2 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r2 = 1
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            if (r2 != 0) goto L_0x0072
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "add task illegal, task mediaId:"
            r0.append(r2)
            java.lang.String r11 = r11.f157722d
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "MicroMsg.CdnMediaFSC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            goto L_0x00d3
        L_0x0072:
            gi.g r2 = new gi.g
            r2.<init>()
            java.lang.String r3 = r11.f157722d
            r2.field_mediaId = r3
            java.lang.String r7 = "task_RecordMsgCDNService"
            r2.f287660d = r7
            r2.f287661e = r4
            r2.field_priority = r6
            r2.field_needStorage = r4
            long r6 = r11.f157724f
            int r4 = (int) r6
            r2.field_totalLen = r4
            java.lang.String r4 = r11.f157719a
            r2.field_aesKey = r4
            java.lang.String r4 = r11.f157720b
            r2.field_fileId = r4
            java.lang.String r3 = r0.mo127012j3(r3)
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x009c
            r3 = r4
        L_0x009c:
            r2.field_fullpath = r3
            int r3 = r11.f157727i
            r2.field_fileType = r3
            java.lang.String r3 = r11.f157732n
            r2.field_filemd5 = r3
            java.lang.String r3 = r11.f157731m
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x00c0
            r3 = 19
            r2.field_fileType = r3
            java.lang.String r3 = r11.f157730l
            r2.field_authKey = r3
            java.lang.String r3 = r11.f157729k
            r2.field_aesKey = r3
            java.lang.String r3 = r11.f157731m
            r2.f287672s = r3
            r2.field_fileId = r4
        L_0x00c0:
            rx3.g r3 = r0.f267062j
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.sdk.coroutines.LifecycleScope r3 = (com.tencent.p014mm.sdk.coroutines.LifecycleScope) r3
            com.tencent.mm.modelcdntran.r r4 = new com.tencent.mm.modelcdntran.r
            r4.<init>(r0, r2, r11, r1)
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r3, r1, r4, r5, r1)
            r1 = r2
        L_0x00d3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p647po.C100831g.mo88184wS(com.tencent.mm.modelcdntran.t):gi.g");
    }

    /* renamed from: wy */
    public void mo88185wy(C92795s sVar) {
        C87412m.m108594g(sVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C92782j Bx0 = C92779i0.Bx0();
        if (Bx0 != null) {
            for (C92795s b : Bx0.mo127014l3()) {
                if (C87412m.m108589b(b, sVar)) {
                    Log.m105924i("MicroMsg.CdnMediaFSC", "try add listener " + sVar + ", but already add this listener, now listener count:" + Bx0.mo127014l3().size());
                    return;
                }
            }
            synchronized (Bx0.mo127014l3()) {
                Bx0.mo127014l3().add(sVar);
            }
            Log.m105924i("MicroMsg.CdnMediaFSC", "add listener " + sVar + ", now listener count:" + Bx0.mo127014l3().size());
        }
    }

    /* renamed from: yO */
    public boolean mo88186yO() {
        C92782j Bx0 = C92779i0.Bx0();
        if (Bx0 == null) {
            return false;
        }
        LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) Bx0.f267062j).getValue(), (C53934p0) null, new C92789m(Bx0, (C15601d<? super C92789m>) null), 1, (Object) null);
        return false;
    }
}
