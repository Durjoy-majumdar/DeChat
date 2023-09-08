package yt2;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import gy3.C87412m;
import kg3.C76577a;
import nj3.C76875f0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: yt2.k */
public final class C102906k implements C39160b {

    /* renamed from: a */
    public final Context f303732a;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance", mo125469f = "RecordEntrance.kt", mo125470l = {73}, mo125471m = "handleSelect")
    /* renamed from: yt2.k$a */
    public static final class C102907a extends C66704d {

        /* renamed from: d */
        public Object f303733d;

        /* renamed from: e */
        public /* synthetic */ Object f303734e;

        /* renamed from: f */
        public final /* synthetic */ C102906k f303735f;

        /* renamed from: g */
        public int f303736g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102907a(C102906k kVar, C15601d<? super C102907a> dVar) {
            super(dVar);
            this.f303735f = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance$handleSelect$1");
            this.f303734e = obj;
            this.f303736g |= Integer.MIN_VALUE;
            Object b = this.f303735f.mo61965b((C32226l<? super Boolean, C13598b0>) null, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance$handleSelect$1");
            return b;
        }
    }

    public C102906k(Context context) {
        C87412m.m108594g(context, "context");
        this.f303732a = context;
    }

    /* renamed from: a */
    public C76875f0 mo61964a() {
        SnsMethodCalculate.markStartTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        C76875f0 f0Var = new C76875f0(this.f303732a, 3, 0);
        f0Var.f224717i = C76577a.m92166q(this.f303732a, C0966R.string.f7980y8);
        f0Var.f224721p = C76577a.m92166q(this.f303732a, C0966R.string.f7985yd);
        SnsMethodCalculate.markEndTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        return f0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo61965b(fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r23, wx3.C15601d<? super rx3.C13598b0> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            java.lang.String r2 = "handleSelect"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            boolean r4 = r1 instanceof yt2.C102906k.C102907a
            if (r4 == 0) goto L_0x001e
            r4 = r1
            yt2.k$a r4 = (yt2.C102906k.C102907a) r4
            int r5 = r4.f303736g
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f303736g = r5
            goto L_0x0023
        L_0x001e:
            yt2.k$a r4 = new yt2.k$a
            r4.<init>(r0, r1)
        L_0x0023:
            java.lang.Object r1 = r4.f303734e
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f303736g
            java.lang.String r7 = "MicroMsg.RecordEntrance"
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L_0x0045
            if (r6 != r9) goto L_0x003a
            java.lang.Object r4 = r4.f303733d
            yt2.k r4 = (yt2.C102906k) r4
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0107
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r1
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6 = r23
            r6.invoke(r1)
            com.tencent.mm.plugin.sns.statistics.l$a r6 = com.tencent.p014mm.plugin.sns.statistics.C57354l.f164333a
            r6.mo80968e(r9)
            java.lang.Class<rw.l> r6 = p232rw.C77572l.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            rw.l r6 = (p232rw.C77572l) r6
            android.content.Context r10 = r0.f303732a
            java.lang.String r11 = "null cannot be cast to non-null type androidx.activity.ComponentActivity"
            gy3.C87412m.m108592e(r10, r11)
            androidx.activity.ComponentActivity r10 = (androidx.activity.ComponentActivity) r10
            java.lang.String r11 = "getProvider"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r3)
            com.tencent.mm.plugin.mmsight.SightParams r12 = new com.tencent.mm.plugin.mmsight.SightParams
            r13 = 2
            r12.<init>(r13, r8)
            iv2.c r14 = iv2.C33419c.f90549a
            rx3.l r14 = r14.mo59134b()
            A r15 = r14.f38555d
            r17 = r15
            java.lang.String r17 = (java.lang.String) r17
            B r14 = r14.f38556e
            r18 = r14
            java.lang.String r18 = (java.lang.String) r18
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r8] = r17
            r14[r9] = r18
            java.lang.String r15 = "record video path:%s thumb path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r15, r14)
            com.tencent.mm.plugin.sns.statistics.f r16 = com.tencent.p014mm.plugin.sns.statistics.C94992f.f275600a
            com.tencent.mm.modelcontrol.VideoTransPara r14 = r12.f248452f
            java.lang.String r15 = "params.videoParams"
            gy3.C87412m.m108593f(r14, r15)
            com.tencent.mm.modelcontrol.VideoTransPara r12 = r12.f248452f
            int r12 = r12.f267170h
            int r12 = r12 * 1000
            r21 = 49
            r19 = r14
            r20 = r12
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r12 = r16.mo131399a(r17, r18, r19, r20, r21)
            java.lang.Class<h81.h> r14 = h81.C32735h.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            h81.h r14 = (h81.C32735h) r14
            h81.h$c r15 = h81.C32735h.C32737c.clicfg_sns_ignore_remux_without_edit
            boolean r14 = r14.mo58784wf(r15, r8)
            if (r14 == 0) goto L_0x00bb
            r12.f272919d = r13
        L_0x00bb:
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r13 = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo
            r13.<init>()
            r13.f272940d = r9
            r12.f272908I = r13
            com.tencent.mm.component.api.jumper.UICustomParam r13 = new com.tencent.mm.component.api.jumper.UICustomParam
            r13.<init>()
            java.util.Map<java.lang.String, java.lang.Boolean> r14 = r13.f266575h
            java.util.HashMap r14 = (java.util.HashMap) r14
            java.lang.String r15 = "plugin_filter"
            r14.put(r15, r1)
            java.util.Map<java.lang.String, java.lang.Boolean> r14 = r13.f266575h
            java.util.HashMap r14 = (java.util.HashMap) r14
            java.lang.String r15 = "plugin_tip"
            r14.put(r15, r1)
            java.util.Map<java.lang.String, java.lang.Boolean> r14 = r13.f266575h
            java.util.HashMap r14 = (java.util.HashMap) r14
            java.lang.String r15 = "plugin_poi"
            r14.put(r15, r1)
            java.util.Map<java.lang.String, java.lang.Boolean> r14 = r13.f266575h
            java.util.HashMap r14 = (java.util.HashMap) r14
            java.lang.String r15 = "plugin_menu"
            r14.put(r15, r1)
            r12.f272927o = r13
            r12.f272932t = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r3)
            r4.f303733d = r0
            r4.f303736g = r9
            java.lang.Object r1 = r6.mo107612ZM(r10, r12, r4)
            if (r1 != r5) goto L_0x0106
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L_0x0106:
            r4 = r0
        L_0x0107:
            rw.r r1 = (p232rw.C77575r) r1
            r4.getClass()
            java.lang.String r5 = "handleResult"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            java.lang.String r6 = "mediaOptResult"
            gy3.C87412m.m108594g(r1, r6)
            com.tencent.mm.plugin.sns.statistics.l$a r6 = com.tencent.p014mm.plugin.sns.statistics.C57354l.f164333a
            r15 = 17
            r6.mo80965b(r15)
            int r10 = r1.f226147b
            r13 = -1
            if (r10 == r13) goto L_0x0156
            k21.c$a r10 = k21.C60960c.f173618a
            r11 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            i21.i r12 = i21.C60242i.DEFAULT
            java.lang.String r13 = "SnsPublishProcess"
            java.lang.String r14 = "opresult_"
            r10.mo85927k(r13, r14, r11, r12)
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r10 = r6
            r8 = -1
            r9 = 0
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r10.mo80976m(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6.mo80966c(r9)
            goto L_0x0158
        L_0x0156:
            r8 = -1
            r9 = 0
        L_0x0158:
            int r6 = r1.f226147b
            if (r6 != r8) goto L_0x02a8
            int r6 = r1.f226148c
            if (r6 != 0) goto L_0x02a8
            rw.q r6 = r1.f226149d
            if (r6 != 0) goto L_0x0169
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L_0x02ab
        L_0x0169:
            boolean r8 = r6.mo107739a()
            java.lang.String r10 = "Kis_take_photo"
            java.lang.String r11 = "KTouchCameraTime"
            java.lang.String r12 = "KSnsFrom"
            java.lang.String r13 = "KSnsPostManu"
            if (r8 == 0) goto L_0x023c
            java.lang.String r1 = "jumpToUploadUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            com.tencent.mm.sdk.platformtools.MMHandler r7 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r7.<init>((android.os.Looper) r8)
            yt2.l r8 = yt2.C66700l.f191742d
            r7.post(r8)
            java.lang.String r6 = r6.f226143b
            hi2.h r7 = hi2.C98453h.f288774a
            r7.mo137820r(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "pre_temp_sns_pic"
            r8.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            long r14 = java.lang.System.currentTimeMillis()
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            java.nio.charset.Charset r14 = z04.C119027c.f356488a
            byte[] r9 = r9.getBytes(r14)
            java.lang.String r14 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r9, r14)
            java.lang.String r9 = p823sg.C90193h.m112878f(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120263iU()
            os2.C100408j0.m131382Ow(r9, r6, r8)
            r7.mo137811i(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120263iU()
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r8 = r4.f303732a
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsUploadUI> r9 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.class
            r7.<init>(r8, r9)
            r8 = 1
            r7.putExtra(r13, r8)
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r7.putExtra(r11, r13)
            java.lang.String r9 = "sns_kemdia_path"
            r7.putExtra(r9, r6)
            r7.putExtra(r10, r8)
            r8 = 17
            r7.putExtra(r12, r8)
            android.content.Context r4 = r4.f303732a
            java.lang.String r6 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r4, r6)
            r8 = r4
            android.app.Activity r8 = (android.app.Activity) r8
            r4 = 6
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.mo10233c(r4)
            r6.mo10233c(r7)
            java.lang.Object[] r9 = r6.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/RecordEntrance"
            java.lang.String r11 = "jumpToUploadUI"
            java.lang.String r12 = "(Lcom/tencent/mm/feature/recordvideo/api/MediaOptModel;)V"
            java.lang.String r13 = "android/app/Activity"
            java.lang.String r14 = "startActivityForResult"
            java.lang.String r15 = "(Landroid/content/Intent;I)V"
            j20.C117292a.m165364j(r8, r9, r10, r11, r12, r13, r14, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            goto L_0x02a8
        L_0x023c:
            r8 = 17
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            java.lang.String r15 = r6.f226143b
            java.lang.String r9 = "KSightPath"
            r14.putExtra(r9, r15)
            java.lang.String r9 = r6.f226144c
            java.lang.String r15 = "KSightThumbPath"
            r14.putExtra(r15, r9)
            android.os.Bundle r1 = r1.f226150e
            java.lang.String r9 = "key_extra_data"
            r14.putExtra(r9, r1)
            java.lang.String r1 = r6.f226143b
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106456q(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r15 = "path:"
            r9.append(r15)
            java.lang.String r6 = r6.f226143b
            r9.append(r6)
            java.lang.String r6 = " md5:"
            r9.append(r6)
            r9.append(r1)
            java.lang.String r6 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            java.lang.String r6 = "sight_md5"
            r14.putExtra(r6, r1)
            r1 = 1
            r14.putExtra(r13, r1)
            r14.putExtra(r12, r8)
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r14.putExtra(r11, r6)
            r1 = 14
            java.lang.String r6 = "Ksnsupload_type"
            r14.putExtra(r6, r1)
            r1 = 0
            r14.putExtra(r10, r1)
            android.content.Context r1 = r4.f303732a
            java.lang.String r4 = "sns"
            java.lang.String r6 = ".ui.SnsUploadUI"
            r7 = 0
            ke3.C88144b.m109791i(r1, r4, r6, r14, r7)
        L_0x02a8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        L_0x02ab:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yt2.C102906k.mo61965b(fy3.l, wx3.d):java.lang.Object");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
    }

    public boolean show() {
        SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        return true;
    }

    public int type() {
        SnsMethodCalculate.markStartTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        int a = C53572c.RECORD.mo74217a();
        SnsMethodCalculate.markEndTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        return a;
    }
}
