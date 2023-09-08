package i72;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85796t4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import f72.C97842b;
import h81.C32735h;
import i72.C108383i;
import lc3.C10485b;
import nj3.C76912y0;
import p156gj.C107822b0;
import p156gj.C107835h0;
import p206nj.C11171e;

/* renamed from: i72.k */
public class C108388k {

    /* renamed from: a */
    public static boolean f324537a = true;

    /* renamed from: b */
    public static boolean f324538b;

    /* renamed from: c */
    public static boolean f324539c;

    /* renamed from: d */
    public static C108392r f324540d;

    /* renamed from: e */
    public static int f324541e;

    /* renamed from: f */
    public static double f324542f;

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0170 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m146835a(android.hardware.Camera.Parameters r13, boolean r14, com.tencent.p014mm.modelcontrol.VideoTransPara r15) {
        /*
            java.lang.Class<lc3.b> r15 = lc3.C10485b.class
            boolean r0 = f324538b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0030
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r15 = 2131831355(0x7f112a3b, float:1.9295733E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            i72.r r3 = f324540d
            if (r3 != 0) goto L_0x001c
            java.lang.String r3 = ""
            goto L_0x0022
        L_0x001c:
            int r3 = r3.f324553c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0022:
            r0[r1] = r3
            java.lang.String r14 = r14.getString(r15, r0)
            android.widget.Toast r13 = nj3.C76912y0.makeText((android.content.Context) r13, (java.lang.CharSequence) r14, (int) r2)
            r13.show()
            return
        L_0x0030:
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            gj.b0 r4 = p156gj.C107835h0.f322852i
            int r4 = r4.f322659h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            boolean r4 = f324539c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r2] = r4
            java.lang.String r4 = "MicroMsg.MMSightRecorderConfig"
            java.lang.String r5 = "autoConfig, recorderOption: %s, isUseRecorderOption: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
            boolean r3 = f324539c
            if (r3 == 0) goto L_0x0051
            return
        L_0x0051:
            android.graphics.Point r3 = f72.C97842b.m126294k()
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r5 = com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance()
            java.lang.String r6 = "Sight720pRecordMinApiLevel"
            java.lang.String r7 = "Sight1080pRecordMinApiLevel"
            java.lang.String r8 = "SightMediaCodecMinApiLevel"
            r9 = 19
            if (r5 == 0) goto L_0x008e
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            if (r5 != 0) goto L_0x008e
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r15 = com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance()
            java.lang.String r15 = r15.getDynamicConfig(r8)
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r9)
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r5 = com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance()
            java.lang.String r5 = r5.getDynamicConfig(r7)
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r9)
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r7 = com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance()
            java.lang.String r6 = r7.getDynamicConfig(r6)
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r9)
            goto L_0x00c6
        L_0x008e:
            k40.a r5 = f40.C86709a0.m107533q(r15)
            lc3.b r5 = (lc3.C10485b) r5
            pj.f r5 = r5.vh0()
            java.lang.String r5 = r5.mo107405c(r8)
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r9)
            k40.a r8 = f40.C86709a0.m107533q(r15)
            lc3.b r8 = (lc3.C10485b) r8
            pj.f r8 = r8.vh0()
            java.lang.String r7 = r8.mo107405c(r7)
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r9)
            k40.a r15 = f40.C86709a0.m107533q(r15)
            lc3.b r15 = (lc3.C10485b) r15
            pj.f r15 = r15.vh0()
            java.lang.String r15 = r15.mo107405c(r6)
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r9)
            r15 = r5
            r5 = r7
        L_0x00c6:
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r7[r1] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            r7[r2] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            r7[r0] = r15
            java.lang.String r15 = "apiLevel: %s record1080pApiLevel: %s, record720pApiLevel: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r15, r7)
            gj.b0 r15 = p156gj.C107835h0.f322852i
            int r15 = r15.f322658g
            r7 = 4655301445678006272(0x409af40000000000, double:1725.0)
            r9 = 512(0x200, float:7.175E-43)
            r10 = -1
            if (r15 == r10) goto L_0x00f2
            r11 = r15 & 1
            if (r11 == 0) goto L_0x0142
        L_0x00f2:
            if (r15 == r10) goto L_0x00ff
            r15 = r15 & r2
            if (r15 == 0) goto L_0x00ff
            i72.r r15 = f324540d
            r15.mo158925b()
            r15.f324556f = r2
            goto L_0x0140
        L_0x00ff:
            boolean r15 = p206nj.C11171e.m11046c(r5)
            if (r15 == 0) goto L_0x0142
            int r15 = f324541e
            if (r15 < r9) goto L_0x0142
            double r11 = f324542f
            int r15 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r15 < 0) goto L_0x0142
            int r15 = r3.x
            int r5 = r3.y
            int r15 = java.lang.Math.min(r15, r5)
            r5 = 1080(0x438, float:1.513E-42)
            if (r15 < r5) goto L_0x0142
            i72.r r15 = f324540d
            r15.getClass()
            android.graphics.Point r5 = f72.C97842b.m126294k()
            com.tencent.mm.modelcontrol.VideoTransPara r15 = r15.f324552b
            int r15 = r15.f267166d
            int r15 = r15 * 2
            i72.i$d r15 = i72.C108383i.m146830d(r13, r5, r15, r1, r14)
            if (r15 == 0) goto L_0x0136
            android.graphics.Point r15 = r15.f324531a
            if (r15 == 0) goto L_0x0136
            r15 = 1
            goto L_0x0137
        L_0x0136:
            r15 = 0
        L_0x0137:
            if (r15 == 0) goto L_0x0142
            i72.r r15 = f324540d
            r15.mo158925b()
            r15.f324556f = r2
        L_0x0140:
            r15 = 1
            goto L_0x0143
        L_0x0142:
            r15 = 0
        L_0x0143:
            gj.b0 r5 = p156gj.C107835h0.f322852i
            int r11 = r5.f322653b
            if (r11 == r10) goto L_0x0153
            i72.r r12 = f324540d
            if (r11 != r2) goto L_0x014f
            r11 = 1
            goto L_0x0150
        L_0x014f:
            r11 = 0
        L_0x0150:
            r12.f324555e = r11
            goto L_0x0157
        L_0x0153:
            i72.r r11 = f324540d
            r11.f324555e = r1
        L_0x0157:
            int r5 = r5.f322658g
            if (r5 == r10) goto L_0x015f
            r11 = r5 & 2
            if (r11 == 0) goto L_0x01aa
        L_0x015f:
            r11 = 720(0x2d0, float:1.009E-42)
            if (r5 == r10) goto L_0x0170
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0170
            i72.r r13 = f324540d
            r13.f324557g = r11
            r13.f324556f = r1
            r13.mo158926c()
            goto L_0x01aa
        L_0x0170:
            if (r15 != 0) goto L_0x01aa
            boolean r15 = p206nj.C11171e.m11046c(r6)
            if (r15 == 0) goto L_0x01aa
            int r15 = f324541e
            if (r15 < r9) goto L_0x01aa
            double r5 = f324542f
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 < 0) goto L_0x01aa
            int r15 = r3.x
            int r0 = r3.y
            int r15 = java.lang.Math.min(r15, r0)
            if (r15 < r11) goto L_0x01aa
            i72.r r15 = f324540d
            r15.getClass()
            android.graphics.Point r15 = f72.C97842b.m126294k()
            i72.i$d r13 = i72.C108383i.m146830d(r13, r15, r11, r1, r14)
            if (r13 == 0) goto L_0x01a1
            android.graphics.Point r13 = r13.f324531a
            if (r13 == 0) goto L_0x01a1
            r13 = 1
            goto L_0x01a2
        L_0x01a1:
            r13 = 0
        L_0x01a2:
            if (r13 == 0) goto L_0x01aa
            i72.r r13 = f324540d
            r13.f324557g = r11
            r13.f324556f = r2
        L_0x01aa:
            i72.r r13 = f324540d
            r13.f324553c = r10
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.String r13 = r13.toString()
            r14[r1] = r13
            java.lang.String r13 = "autoConfig parameter byserver %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i72.C108388k.m146835a(android.hardware.Camera$Parameters, boolean, com.tencent.mm.modelcontrol.VideoTransPara):void");
    }

    /* renamed from: b */
    public static boolean m146836b(Point point) {
        if (f324538b) {
            Context context = MMApplicationContext.getContext();
            Resources resources = MMApplicationContext.getResources();
            Object[] objArr = new Object[1];
            C108392r rVar = f324540d;
            objArr[0] = rVar == null ? "" : Integer.valueOf(rVar.f324553c);
            C76912y0.makeText(context, (CharSequence) resources.getString(C0966R.string.f360886fn0, objArr), 1).show();
            return false;
        }
        Log.m105925i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy, deviceInfo recorderType: %s, recorderOption: %s, isUseRecorderOption: %s", Integer.valueOf(C107835h0.f322852i.f322652a), Integer.valueOf(C107835h0.f322852i.f322659h), Boolean.valueOf(f324539c));
        if (f324539c) {
            return false;
        }
        if (C107835h0.f322852i.f322652a != -1) {
            return true;
        }
        C108392r rVar2 = f324540d;
        if (rVar2 != null && 1 == rVar2.f324551a) {
            return true;
        }
        if (point == null) {
            return false;
        }
        int i = point.x;
        boolean z = C97842b.f286991a;
        if (i % 16 == 0) {
            if (point.y % 16 == 0) {
                return true;
            }
        }
        if (f324540d != null) {
            Log.m105925i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy not happy %s", point.toString());
            f324540d.f324551a = 1;
        }
        return false;
    }

    /* renamed from: c */
    public static void m146837c(C108383i.C108387d dVar) {
        if (dVar.f324531a == null) {
            Log.m105925i("MicroMsg.MMSightRecorderConfig", "checkMore start %s", dVar.toString());
            dVar.f324531a = dVar.f324534d;
            Point point = dVar.f324535e;
            dVar.f324532b = point;
            dVar.f324533c = dVar.f324536f;
            int min = Math.min(point.y, point.x);
            C108392r rVar = f324540d;
            if (min >= rVar.f324552b.f267166d + 16) {
                rVar.mo158926c();
                C108392r rVar2 = f324540d;
                rVar2.f324556f = false;
                rVar2.f324555e = false;
                Log.m105925i("MicroMsg.MMSightRecorderConfig", "checkMore out %s", dVar.toString());
            }
        }
    }

    /* renamed from: d */
    public static void m146838d(VideoTransPara videoTransPara) {
        int i;
        int i2;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LOCAL_SIGHT_CAMERA_API_INT_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_LOCAL_SIGHT_CAPTURE_TYPE_INT_SYNC;
        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_LOCAL_SIGHT_FOCUS_INT_SYNC;
        C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC;
        boolean z = false;
        f324538b = false;
        f324539c = false;
        f324541e = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        f324542f = (double) C97842b.m126299p(MMApplicationContext.getContext());
        String jo = C85796t4.m105983jo();
        int i3 = (CaptureMMProxy.getInstance() == null || MMApplicationContext.isMMProcess()) ? Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SightMediaCodecMinApiLevel"), 19) : Util.getInt(CaptureMMProxy.getInstance().getDynamicConfig("SightMediaCodecMinApiLevel"), 19);
        Log.m105925i("MicroMsg.MMSightRecorderConfig", "MXM_DynaCfg_AV_Item_Key_SightMediaCodecMinApiLevel: %s", Integer.valueOf(i3));
        if (CaptureMMProxy.getInstance() == null || MMApplicationContext.isMMProcess()) {
            C86709a0.m107528h();
            C107835h0.m146105b(C86709a0.m107535s().mo121144k().mo119656Lo(77825));
        } else {
            C107835h0.m146105b(CaptureMMProxy.getInstance().getDeviceInfoConfig());
        }
        Log.m105925i("MicroMsg.MMSightRecorderConfig", "init large memory class: %sMB, totalMemory: %sGB  fingerprint: %s mmSightRecorderInfo: %s", Integer.valueOf(f324541e), Double.valueOf(f324542f), jo, C107835h0.f322852i);
        if (CaptureMMProxy.getInstance() == null || MMApplicationContext.isMMProcess()) {
            C86709a0.m107528h();
            i = C86709a0.m107535s().mo121142i().mo119689j(aVar4, -1);
            C86709a0.m107528h();
            i2 = C86709a0.m107535s().mo121142i().mo119689j(aVar3, 1);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119689j(aVar2, 1);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119689j(aVar, 2);
        } else {
            i = CaptureMMProxy.getInstance().getInt(aVar4, -1);
            i2 = CaptureMMProxy.getInstance().getInt(aVar3, 1);
            CaptureMMProxy.getInstance().getInt(aVar2, 1);
            CaptureMMProxy.getInstance().getInt(aVar, 2);
        }
        C108392r a = C108392r.m146847a(i, videoTransPara);
        f324540d = a;
        if (a != null) {
            a.f324558h = i2 == 1;
            f324538b = true;
            Context context = MMApplicationContext.getContext();
            Resources resources = MMApplicationContext.getResources();
            Object[] objArr = new Object[1];
            C108392r rVar = f324540d;
            objArr[0] = rVar == null ? "" : Integer.valueOf(rVar.f324553c);
            C76912y0.makeText(context, (CharSequence) resources.getString(C0966R.string.f360886fn0, objArr), 1).show();
            return;
        }
        int i4 = C107835h0.f322852i.f322659h;
        Log.m105925i("MicroMsg.MMSightRecorderConfig", "recorderOption: %s", Integer.valueOf(i4));
        if (i4 != -1) {
            f324540d = C108392r.m146847a(i4, videoTransPara);
        }
        C108392r rVar2 = f324540d;
        if (rVar2 != null) {
            if (i2 == 1) {
                rVar2.f324558h = true;
            } else {
                rVar2.f324558h = false;
            }
            f324539c = true;
            return;
        }
        C108392r a2 = C108392r.m146847a(1, videoTransPara);
        f324540d = a2;
        if (i2 == 1) {
            a2.f324558h = true;
        } else {
            a2.f324558h = false;
        }
        a2.getClass();
        f324540d.getClass();
        int i5 = C107835h0.f322852i.f322652a;
        if (i5 != -1) {
            f324540d.f324551a = i5;
        } else {
            if (C11171e.m11046c(i3)) {
                f324540d.f324551a = 2;
            } else {
                f324540d.f324551a = 1;
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_face_flash_record_use_soft, false)) {
                f324540d.f324551a = 1;
            }
        }
        C107822b0 b0Var = C107835h0.f322852i;
        int i6 = b0Var.f322655d;
        if (i6 != -1) {
            f324537a = i6 == 1;
        }
        int i7 = b0Var.f322653b;
        if (i7 != -1) {
            C108392r rVar3 = f324540d;
            if (i7 == 1) {
                z = true;
            }
            rVar3.f324555e = z;
            return;
        }
        f324540d.f324555e = false;
    }

    /* renamed from: e */
    public static void m146839e() {
        Log.m105924i("MicroMsg.MMSightRecorderConfig", "initSimple");
        C108392r rVar = new C108392r();
        f324540d = rVar;
        rVar.f324555e = false;
        rVar.f324556f = false;
        if (C11171e.m11046c(19)) {
            f324540d.f324551a = 2;
        } else {
            f324540d.f324551a = 1;
        }
    }
}
