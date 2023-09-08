package ao1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C64315dj1;
import te3.C64638pv3;
import te3.C64689rq2;
import te3.m44;

/* renamed from: ao1.m1 */
public final class C54270m1 extends UIComponent {

    /* renamed from: d */
    public final String f152316d = "Finder.SdkShareUIC";

    /* renamed from: e */
    public m44 f152317e;

    /* renamed from: f */
    public C64315dj1 f152318f;

    /* renamed from: g */
    public String f152319g = "";

    /* renamed from: h */
    public String f152320h = "";

    /* renamed from: i */
    public int f152321i;

    /* renamed from: j */
    public String f152322j = "";

    /* renamed from: n */
    public String f152323n = "";

    /* renamed from: o */
    public int f152324o = 4;

    /* renamed from: p */
    public final LinkedList<C64689rq2> f152325p = new LinkedList<>();

    /* renamed from: q */
    public String f152326q = "";

    /* renamed from: r */
    public int f152327r;

    /* renamed from: s */
    public String f152328s = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54270m1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final String mo75060c3() {
        String str;
        C64638pv3 pv32;
        m44 m44 = this.f152317e;
        if (m44 == null || (pv32 = m44.f184201e) == null || (str = pv32.f184893e) == null) {
            C64315dj1 dj12 = this.f152318f;
            str = dj12 != null ? dj12.f182751p : null;
        }
        return str == null ? "" : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0042 A[SYNTHETIC, Splitter:B:10:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateBefore(android.os.Bundle r18) {
        /*
            r17 = this;
            r1 = r17
            super.onCreateBefore(r18)
            te3.m44 r0 = new te3.m44
            r0.<init>()
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r3 = "KEY_POST_FROM_SHARE"
            byte[] r2 = r2.getByteArrayExtra(r3)
            java.lang.String r3 = "safeParser"
            r4 = 1
            r5 = 0
            r6 = 0
            java.lang.String r7 = ""
            if (r2 != 0) goto L_0x001f
        L_0x001d:
            r0 = r6
            goto L_0x002d
        L_0x001f:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x002d
        L_0x0023:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r7, r0)
            goto L_0x001d
        L_0x002d:
            r1.f152317e = r0
            te3.dj1 r0 = new te3.dj1
            r0.<init>()
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r8 = "KEY_REMOTE_MEDIA_POST_INFO"
            byte[] r2 = r2.getByteArrayExtra(r8)
            if (r2 != 0) goto L_0x0042
        L_0x0040:
            r0 = r6
            goto L_0x0050
        L_0x0042:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0046 }
            goto L_0x0050
        L_0x0046:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r7, r0)
            goto L_0x0040
        L_0x0050:
            r1.f152318f = r0
            java.lang.String r0 = r17.mo75060c3()
            r1.f152319g = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "KEY_POST_FROM_APP_SOURCE"
            int r0 = r0.getIntExtra(r2, r5)
            if (r0 != 0) goto L_0x006c
            te3.dj1 r0 = r1.f152318f
            if (r0 == 0) goto L_0x006b
            int r0 = r0.f182752q
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            r1.f152321i = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "KEY_MIAOJIAN_EXTINFO"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 != 0) goto L_0x0085
            te3.dj1 r0 = r1.f152318f
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = r0.f182753r
            goto L_0x0082
        L_0x0081:
            r0 = r6
        L_0x0082:
            if (r0 != 0) goto L_0x0085
            r0 = r7
        L_0x0085:
            r1.f152320h = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "KEY_POST_REMOTE_URL"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 != 0) goto L_0x0094
            r0 = r7
        L_0x0094:
            r1.f152322j = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "KEY_POST_FROM_APP_PARAMJSON"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 != 0) goto L_0x00a3
            r0 = r7
        L_0x00a3:
            r1.f152323n = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "KEY_SHARE_VIDEO_SOURCE"
            r3 = 4
            int r0 = r0.getIntExtra(r2, r3)
            r1.f152324o = r0
            te3.dj1 r0 = r1.f152318f
            if (r0 == 0) goto L_0x00b9
            java.lang.String r2 = r0.f182742d
            goto L_0x00ba
        L_0x00b9:
            r2 = r6
        L_0x00ba:
            if (r2 != 0) goto L_0x00bd
            r2 = r7
        L_0x00bd:
            r1.f152326q = r2
            if (r0 == 0) goto L_0x00c4
            int r0 = r0.f182754s
            goto L_0x00c5
        L_0x00c4:
            r0 = 0
        L_0x00c5:
            r1.f152327r = r0
            java.lang.String r0 = r1.f152319g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00e4
            int r0 = r1.f152324o
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r2 = dp1.C58408t0.f167337b
            if (r2 == 0) goto L_0x00d7
            r2.videoSource = r0
        L_0x00d7:
            java.lang.String r0 = r1.f152319g
            java.lang.String r2 = "appId"
            gy3.C87412m.m108594g(r0, r2)
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r2 = dp1.C58408t0.f167337b
            if (r2 == 0) goto L_0x00e4
            r2.forwardingAppId = r0
        L_0x00e4:
            java.lang.String r0 = r1.f152319g
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00ee
            r0 = 1
            goto L_0x00ef
        L_0x00ee:
            r0 = 0
        L_0x00ef:
            if (r0 == 0) goto L_0x0125
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "KEY_POST_MIAOJIAN_TONGKUAN_META"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 != 0) goto L_0x00fe
            r0 = r7
        L_0x00fe:
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r4 = 0
        L_0x0106:
            if (r4 != 0) goto L_0x0125
            r1.f152320h = r0
            java.lang.String r2 = "wxa5e0de08d96cc09d"
            r1.f152319g = r2
            java.lang.String r2 = r1.f152316d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "miaojianTongkuanMeta "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x0125:
            te3.dj1 r0 = r1.f152318f
            if (r0 == 0) goto L_0x0198
            java.util.LinkedList<te3.rq2> r2 = r1.f152325p
            sg.i<java.lang.String, java.lang.String> r4 = vp1.C65840n.f189341a
            te3.rq2 r4 = new te3.rq2
            r4.<init>()
            java.lang.String r5 = r0.f182743e
            r4.f185266d = r5
            r4.f185278r = r5
            java.lang.String r8 = r0.f182744f
            r4.f185267e = r8
            r4.f185279s = r8
            java.lang.String r9 = r0.f182745g
            r4.f185283w = r9
            r4.f185237D = r9
            int r9 = r0.f182746h
            r4.f185273n = r9
            int r10 = r0.f182747i
            r4.f185274o = r10
            int r11 = r0.f182748j
            float r11 = (float) r11
            r4.f185270h = r11
            int r12 = r0.f182749n
            float r12 = (float) r12
            r4.f185271i = r12
            int r0 = r0.f182750o
            r4.f185269g = r0
            long r13 = (long) r0
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            r4.f185238E = r13
            r4.f185242I = r5
            r4.f185249Q = r5
            r4.f185239F = r8
            r4.f185241H = r8
            r4.f185246M = r9
            r4.f185247N = r10
            r4.f185243J = r11
            r4.f185244K = r12
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r7)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            r4.f185275p = r0
            java.lang.String r0 = r4.f185267e
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            r4.f185285x0 = r0
            java.lang.String r0 = r4.f185283w
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            r4.f185287y0 = r0
            r4.f185268f = r3
            r2.add(r4)
        L_0x0198:
            te3.m44 r0 = r1.f152317e
            if (r0 == 0) goto L_0x01a2
            te3.pv3 r0 = r0.f184201e
            if (r0 == 0) goto L_0x01a2
            java.lang.String r6 = r0.f184899n
        L_0x01a2:
            if (r6 != 0) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r7 = r6
        L_0x01a6:
            r1.f152328s = r7
            java.lang.String r0 = r1.f152316d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sdkshare, fromAppId:"
            r2.append(r3)
            java.lang.String r3 = r1.f152319g
            r2.append(r3)
            java.lang.String r3 = ", remoteUrl:"
            r2.append(r3)
            java.lang.String r3 = r1.f152322j
            r2.append(r3)
            java.lang.String r3 = ", paramsJson:"
            r2.append(r3)
            java.lang.String r3 = r1.f152323n
            r2.append(r3)
            java.lang.String r3 = ", extInfo:"
            r2.append(r3)
            java.lang.String r3 = r1.f152320h
            r2.append(r3)
            java.lang.String r3 = ", sdkExtInfo:"
            r2.append(r3)
            java.lang.String r3 = r1.f152328s
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ao1.C54270m1.onCreateBefore(android.os.Bundle):void");
    }
}
