package lo2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53901i0;
import a14.C53921m;
import a14.C53934p0;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import co2.C55059u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.C19934c;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import org.json.JSONObject;
import p200lx.C99712h0;
import p200lx.C99716u;
import qo3.C89779i0;
import rq2.C63489a;
import rx3.C13598b0;
import rx3.C90107a;
import uo2.C90717a;
import wx3.C15601d;
import wx3.C66206a;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: lo2.u */
public final class C61326u {

    /* renamed from: a */
    public static final C61326u f174449a = new C61326u();

    /* renamed from: b */
    public static final C53901i0 f174450b = new C61331d(C53901i0.C39480a.f106019d);

    /* renamed from: lo2.u$a */
    public static final class C61327a {

        /* renamed from: a */
        public final String f174451a;

        /* renamed from: b */
        public final String f174452b;

        /* renamed from: c */
        public final String f174453c;

        /* renamed from: d */
        public final int f174454d;

        /* renamed from: e */
        public final int f174455e;

        /* renamed from: f */
        public final String f174456f;

        /* renamed from: g */
        public final String f174457g;

        /* renamed from: h */
        public final String f174458h;

        /* renamed from: i */
        public final int f174459i;

        /* renamed from: j */
        public final String f174460j;

        public C61327a(String str, String str2, String str3, int i, int i2, int i3, String str4, String str5, String str6, int i4, int i5, String str7) {
            this.f174451a = str;
            this.f174452b = str2;
            this.f174453c = str3;
            this.f174454d = i;
            this.f174455e = i3;
            this.f174456f = str4;
            this.f174457g = str5;
            this.f174458h = str6;
            this.f174459i = i5;
            this.f174460j = str7;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1", mo125469f = "AdQrClickHelper.kt", mo125470l = {66}, mo125471m = "invokeSuspend")
    /* renamed from: lo2.u$b */
    public static final class C61328b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174461d;

        /* renamed from: e */
        public final /* synthetic */ C55059u f174462e;

        /* renamed from: f */
        public final /* synthetic */ MMActivity f174463f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C89779i0> f174464g;

        /* renamed from: h */
        public final /* synthetic */ String f174465h;

        /* renamed from: i */
        public final /* synthetic */ String f174466i;

        /* renamed from: j */
        public final /* synthetic */ String f174467j;

        /* renamed from: n */
        public final /* synthetic */ int f174468n;

        /* renamed from: o */
        public final /* synthetic */ String f174469o;

        /* renamed from: lo2.u$b$a */
        public static final class C61329a implements C99712h0.C99713a {

            /* renamed from: a */
            public final /* synthetic */ String f174470a;

            /* renamed from: b */
            public final /* synthetic */ String f174471b;

            /* renamed from: c */
            public final /* synthetic */ String f174472c;

            /* renamed from: d */
            public final /* synthetic */ int f174473d;

            /* renamed from: e */
            public final /* synthetic */ C55059u f174474e;

            /* renamed from: f */
            public final /* synthetic */ String f174475f;

            /* renamed from: g */
            public final /* synthetic */ C8479f0<C89779i0> f174476g;

            /* renamed from: h */
            public final /* synthetic */ MMActivity f174477h;

            public C61329a(String str, String str2, String str3, int i, C55059u uVar, String str4, C8479f0<C89779i0> f0Var, MMActivity mMActivity) {
                this.f174470a = str;
                this.f174471b = str2;
                this.f174472c = str3;
                this.f174473d = i;
                this.f174474e = uVar;
                this.f174475f = str4;
                this.f174476g = f0Var;
                this.f174477h = mMActivity;
            }

            /* JADX WARNING: Removed duplicated region for block: B:41:0x013d  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0142  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0148  */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x0160  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo24342a(long r26, p200lx.C99712h0.C99715c r28) {
                /*
                    r25 = this;
                    r0 = r25
                    r1 = r28
                    java.lang.String r2 = "afterDecode"
                    java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1$1"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                    r4 = 0
                    if (r1 == 0) goto L_0x0011
                    java.util.List<com.tencent.qbar.a$a> r5 = r1.f292251a
                    goto L_0x0012
                L_0x0011:
                    r5 = r4
                L_0x0012:
                    if (r1 == 0) goto L_0x0016
                    java.util.List<com.tencent.qbar.WxQbarNative$QBarReportMsg> r4 = r1.f292253c
                L_0x0016:
                    java.lang.String r1 = "AdQrClickHelper"
                    java.lang.String r6 = "getQrExtInfo"
                    java.lang.String r7 = "getQrUrl"
                    java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo"
                    if (r5 == 0) goto L_0x01e4
                    int r9 = r5.size()
                    if (r9 <= 0) goto L_0x01e4
                    r9 = 0
                    java.lang.Object r10 = r5.get(r9)
                    com.tencent.qbar.a$a r10 = (com.tencent.qbar.C19931a.C19932a) r10
                    java.lang.String r10 = r10.f56828e
                    int r10 = com.tencent.p014mm.plugin.scanner.C5177x.m5204a(r10)
                    java.lang.Object r5 = r5.get(r9)
                    com.tencent.qbar.a$a r5 = (com.tencent.qbar.C19931a.C19932a) r5
                    java.lang.String r5 = r5.f56829f
                    if (r4 == 0) goto L_0x004c
                    boolean r11 = r4.isEmpty()
                    if (r11 != 0) goto L_0x004c
                    java.lang.Object r4 = r4.get(r9)
                    com.tencent.qbar.WxQbarNative$QBarReportMsg r4 = (com.tencent.qbar.WxQbarNative.QBarReportMsg) r4
                    int r4 = r4.qrcodeVersion
                    goto L_0x004d
                L_0x004c:
                    r4 = -1
                L_0x004d:
                    lo2.u r15 = lo2.C61326u.f174449a
                    r15.mo86287d()
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                    r11.<init>()
                    java.lang.String r12 = "QRCodeStr="
                    r11.append(r12)
                    r11.append(r5)
                    java.lang.String r12 = ", QRCodeType="
                    r11.append(r12)
                    r11.append(r10)
                    java.lang.String r12 = ", QRCodeVer="
                    r11.append(r12)
                    r11.append(r4)
                    java.lang.String r11 = r11.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
                    java.lang.String r11 = "getQrCodeType"
                    java.lang.String r14 = "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r14)
                    boolean r12 = android.text.TextUtils.isEmpty(r5)
                    if (r12 == 0) goto L_0x0087
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
                    goto L_0x00df
                L_0x0087:
                    java.lang.Class<lx.x> r12 = p200lx.C61416x.class
                    di3.d r12 = di3.C86312j.m106911c(r12)
                    lx.x r12 = (p200lx.C61416x) r12
                    boolean r16 = r12.mo71999h3(r10, r5)
                    if (r16 == 0) goto L_0x009c
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
                    r11 = 2
                    r24 = 2
                    goto L_0x00e1
                L_0x009c:
                    boolean r16 = r12.mo71997TM(r10, r5)
                    if (r16 == 0) goto L_0x00a9
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
                    r11 = 3
                    r24 = 3
                    goto L_0x00e1
                L_0x00a9:
                    boolean r16 = r12.mo72000oi(r10, r5)
                    if (r16 == 0) goto L_0x00b6
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
                    r11 = 4
                    r24 = 4
                    goto L_0x00e1
                L_0x00b6:
                    boolean r16 = r12.mo72003sl(r10, r5)
                    if (r16 == 0) goto L_0x00c3
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
                    r11 = 5
                    r24 = 5
                    goto L_0x00e1
                L_0x00c3:
                    boolean r16 = r12.mo71995PE(r10, r5)
                    if (r16 == 0) goto L_0x00cf
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
                    r24 = 1
                    goto L_0x00e1
                L_0x00cf:
                    boolean r12 = r12.mo71996Qz(r10, r5)
                    if (r12 == 0) goto L_0x00dc
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
                    r11 = 6
                    r24 = 6
                    goto L_0x00e1
                L_0x00dc:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
                L_0x00df:
                    r24 = 0
                L_0x00e1:
                    lo2.u$a r12 = new lo2.u$a
                    java.lang.String r11 = r0.f174470a
                    java.lang.String r13 = r0.f174471b
                    java.lang.String r9 = r0.f174472c
                    r16 = r11
                    int r11 = r0.f174473d
                    int r17 = lo2.C61326u.m71940b(r15, r11)
                    r18 = 10
                    boolean r19 = android.text.TextUtils.isEmpty(r5)
                    co2.u r11 = r0.f174474e
                    r11.getClass()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
                    java.lang.String r11 = r11.f154594b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                    co2.u r7 = r0.f174474e
                    r7.getClass()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
                    java.lang.String r7 = r7.f154593a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
                    r21 = 1
                    java.lang.String r6 = r0.f174475f
                    r20 = r11
                    r8 = r16
                    r11 = r12
                    r28 = r4
                    r4 = r12
                    r12 = r8
                    r8 = 1
                    r8 = r14
                    r14 = r9
                    r9 = r15
                    r15 = r17
                    r16 = r18
                    r17 = r19
                    r18 = r20
                    r19 = r5
                    r20 = r7
                    r22 = r24
                    r23 = r6
                    r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                    java.lang.String r6 = "isValidQRType"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
                    switch(r24) {
                        case 1: goto L_0x0142;
                        case 2: goto L_0x0142;
                        case 3: goto L_0x0142;
                        case 4: goto L_0x0142;
                        case 5: goto L_0x0142;
                        case 6: goto L_0x0142;
                        default: goto L_0x013d;
                    }
                L_0x013d:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
                    r13 = 0
                    goto L_0x0146
                L_0x0142:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
                    r13 = 1
                L_0x0146:
                    if (r13 != 0) goto L_0x0160
                    r9.mo86287d()
                    java.lang.String r5 = "isValidQRCode=false"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
                    r9.mo86288f(r4)
                    gy3.f0<qo3.i0> r1 = r0.f174476g
                    T r1 = r1.f27484d
                    qo3.i0 r1 = (qo3.C89779i0) r1
                    lo2.C61326u.m71939a(r9, r1)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    return
                L_0x0160:
                    r9.mo86288f(r4)
                    r9.mo86287d()
                    java.lang.String r4 = "onClickDirect createIntent"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
                    android.content.Intent r1 = new android.content.Intent
                    com.tencent.mm.ui.MMActivity r4 = r0.f174477h
                    java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsAdProxyUI> r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdProxyUI.class
                    r1.<init>(r4, r6)
                    java.lang.String r4 = "action_type"
                    r6 = 1
                    r1.putExtra(r4, r6)
                    java.lang.String r4 = "qrcodeStr"
                    r1.putExtra(r4, r5)
                    java.lang.String r4 = "qrcodeType"
                    r1.putExtra(r4, r10)
                    java.lang.String r4 = "qrcodeVer"
                    r5 = r28
                    r1.putExtra(r4, r5)
                    com.tencent.mm.ui.MMActivity r4 = r0.f174477h
                    k20.a r5 = new k20.a
                    r5.<init>()
                    r5.mo10233c(r1)
                    java.lang.Object[] r11 = r5.mo10232b()
                    java.lang.String r12 = "com/tencent/mm/plugin/sns/ad/helper/AdQrClickHelper$openQr$1$1"
                    java.lang.String r13 = "afterDecode"
                    java.lang.String r14 = "(JLcom/tencent/mm/feature/scanner/api/IWxFileDecodeQueue$ScanCodeForFileResult;)V"
                    java.lang.String r15 = "Undefined"
                    java.lang.String r16 = "startActivity"
                    java.lang.String r17 = "(Landroid/content/Intent;)V"
                    r10 = r4
                    j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                    r1 = 0
                    java.lang.Object r1 = r5.mo10231a(r1)
                    android.content.Intent r1 = (android.content.Intent) r1
                    r4.startActivity(r1)
                    java.lang.String r11 = "com/tencent/mm/plugin/sns/ad/helper/AdQrClickHelper$openQr$1$1"
                    java.lang.String r12 = "afterDecode"
                    java.lang.String r13 = "(JLcom/tencent/mm/feature/scanner/api/IWxFileDecodeQueue$ScanCodeForFileResult;)V"
                    java.lang.String r14 = "Undefined"
                    java.lang.String r15 = "startActivity"
                    java.lang.String r16 = "(Landroid/content/Intent;)V"
                    j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                    com.tencent.mm.ui.MMActivity r1 = r0.f174477h
                    boolean r4 = r1 instanceof android.app.Activity
                    if (r4 == 0) goto L_0x01da
                    java.lang.String r4 = "null cannot be cast to non-null type android.app.Activity"
                    gy3.C87412m.m108592e(r1, r4)
                    r4 = 2130771992(0x7f010018, float:1.714709E38)
                    r1.overridePendingTransition(r4, r4)
                L_0x01da:
                    gy3.f0<qo3.i0> r1 = r0.f174476g
                    T r1 = r1.f27484d
                    qo3.i0 r1 = (qo3.C89779i0) r1
                    lo2.C61326u.m71939a(r9, r1)
                    goto L_0x0237
                L_0x01e4:
                    lo2.u r4 = lo2.C61326u.f174449a
                    r4.mo86287d()
                    java.lang.String r5 = "afterDecode, results is empty"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
                    lo2.u$a r1 = new lo2.u$a
                    java.lang.String r10 = r0.f174470a
                    java.lang.String r11 = r0.f174471b
                    java.lang.String r12 = r0.f174472c
                    int r5 = r0.f174473d
                    int r13 = lo2.C61326u.m71940b(r4, r5)
                    r14 = 10
                    r15 = 1
                    co2.u r5 = r0.f174474e
                    r5.getClass()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
                    java.lang.String r5 = r5.f154594b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                    co2.u r7 = r0.f174474e
                    r7.getClass()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
                    java.lang.String r7 = r7.f154593a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
                    r19 = 1
                    r20 = 0
                    java.lang.String r6 = r0.f174475f
                    java.lang.String r17 = ""
                    r9 = r1
                    r16 = r5
                    r18 = r7
                    r21 = r6
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                    r4.mo86288f(r1)
                    gy3.f0<qo3.i0> r1 = r0.f174476g
                    T r1 = r1.f27484d
                    qo3.i0 r1 = (qo3.C89779i0) r1
                    lo2.C61326u.m71939a(r4, r1)
                L_0x0237:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: lo2.C61326u.C61328b.C61329a.mo24342a(long, lx.h0$c):void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61328b(C55059u uVar, MMActivity mMActivity, C8479f0<C89779i0> f0Var, String str, String str2, String str3, int i, String str4, C15601d<? super C61328b> dVar) {
            super(2, dVar);
            this.f174462e = uVar;
            this.f174463f = mMActivity;
            this.f174464g = f0Var;
            this.f174465h = str;
            this.f174466i = str2;
            this.f174467j = str3;
            this.f174468n = i;
            this.f174469o = str4;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
            C61328b bVar = new C61328b(this.f174462e, this.f174463f, this.f174464g, this.f174465h, this.f174466i, this.f174467j, this.f174468n, this.f174469o, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
            Object invokeSuspend = ((C61328b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C89779i0 i0Var;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174461d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C61326u uVar = C61326u.f174449a;
                C55059u uVar2 = this.f174462e;
                uVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("getQrUrl", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
                String str = uVar2.f154594b;
                SnsMethodCalculate.markEndTimeMs("getQrUrl", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
                if (str == null) {
                    str = "";
                }
                this.f174461d = 1;
                SnsMethodCalculate.markStartTimeMs("downloadImgWithPath", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                C63489a.m74828c(str, new C61332v(str, mVar));
                obj2 = mVar.mo74608o();
                SnsMethodCalculate.markEndTimeMs("downloadImgWithPath", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
                if (obj2 == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
                throw illegalStateException;
            }
            String str2 = (String) obj2;
            if (str2 == null || C112551y.m153811k(str2)) {
                C61326u.f174449a.mo86287d();
                Log.m105920e("AdQrClickHelper", "downloadImgWithPath is null!");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
                return b0Var;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.f174463f.isFinishing()) {
                this.f174464g.f27484d = C90717a.m113753f(this.f174463f, C0966R.string.j_t, (DialogInterface.OnCancelListener) null);
            }
            C89779i0 i0Var2 = (C89779i0) this.f174464g.f27484d;
            if (i0Var2 == null || !i0Var2.isShowing()) {
                z = false;
            }
            if (!z && (i0Var = (C89779i0) this.f174464g.f27484d) != null) {
                i0Var.show();
            }
            C99712h0 wa02 = ((C99716u) C86312j.m106911c(C99716u.class)).wa0();
            MMActivity mMActivity = this.f174463f;
            C19934c cVar = (C19934c) wa02;
            cVar.mo27315b(mMActivity, currentTimeMillis, str2, new C61329a(this.f174465h, this.f174466i, this.f174467j, this.f174468n, this.f174462e, this.f174469o, this.f174464g, mMActivity));
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
            return b0Var2;
        }
    }

    /* renamed from: lo2.u$c */
    public static final class C61330c extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f174478d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61330c(C8479f0<C89779i0> f0Var) {
            super(1);
            this.f174478d = f0Var;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$2");
            C61326u uVar = C61326u.f174449a;
            uVar.mo86287d();
            Log.m105924i("AdQrClickHelper", "openQr() called end! " + ((Throwable) obj));
            C61326u.m71939a(uVar, (C89779i0) this.f174478d.f27484d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$2");
            return b0Var;
        }
    }

    /* renamed from: lo2.u$d */
    public static final class C61331d extends C66206a implements C53901i0 {
        public C61331d(C53901i0.C39480a aVar) {
            super(aVar);
        }

        public void handleException(C66212f fVar, Throwable th) {
            SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$special$$inlined$CoroutineExceptionHandler$1");
            C61326u.f174449a.mo86287d();
            Log.m105920e("AdQrClickHelper", "error = " + C90107a.m112736b(th));
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$special$$inlined$CoroutineExceptionHandler$1");
                throw th;
            } else {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$special$$inlined$CoroutineExceptionHandler$1");
            }
        }
    }

    static {
        int i = C53901i0.f151153a0;
    }

    /* renamed from: a */
    public static final void m71939a(C61326u uVar, C89779i0 i0Var) {
        SnsMethodCalculate.markStartTimeMs("access$dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        uVar.getClass();
        SnsMethodCalculate.markStartTimeMs("dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        if (i0Var != null) {
            try {
                if (i0Var.isShowing()) {
                    i0Var.dismiss();
                }
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        SnsMethodCalculate.markEndTimeMs("access$dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
    }

    /* renamed from: b */
    public static final int m71940b(C61326u uVar, int i) {
        SnsMethodCalculate.markStartTimeMs("access$toScene", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        uVar.getClass();
        SnsMethodCalculate.markStartTimeMs("toScene", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        int i2 = 1;
        if (i == 1 || i == 2) {
            i2 = 2;
        }
        SnsMethodCalculate.markEndTimeMs("toScene", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        SnsMethodCalculate.markEndTimeMs("access$toScene", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        return i2;
    }

    /* renamed from: e */
    public static final void m71941e(C55059u uVar, MMActivity mMActivity, String str, String str2, String str3, int i, String str4) {
        SnsMethodCalculate.markStartTimeMs("openQr", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (uVar == null) {
            SnsMethodCalculate.markEndTimeMs("openQr", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
            return;
        }
        C8479f0 f0Var = new C8479f0();
        C0000n0 lifecycleScope = LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) mMActivity);
        C53896h0 h0Var = C53872d1.f151117a;
        ((C53884f2) C53895h.m60466d(lifecycleScope, C58901s.f168555a.plus(f174450b), (C53934p0) null, new C61328b(uVar, mMActivity, f0Var, str, str3, str2, i, str4, (C15601d<? super C61328b>) null), 2, (Object) null)).mo74515E(new C61330c(f0Var));
        SnsMethodCalculate.markEndTimeMs("openQr", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
    }

    /* renamed from: c */
    public final JSONObject mo86286c(C61327a aVar) {
        SnsMethodCalculate.markStartTimeMs("buildExtData", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        C87412m.m108594g(aVar, "reportInfo");
        JSONObject jSONObject = new JSONObject();
        try {
            SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            jSONObject.put("type", 10);
            SnsMethodCalculate.markStartTimeMs("getQrResult", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            int i = aVar.f174455e;
            SnsMethodCalculate.markEndTimeMs("getQrResult", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            jSONObject.put("qrResult", i);
            SnsMethodCalculate.markStartTimeMs("getQrUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            String str = aVar.f174456f;
            SnsMethodCalculate.markEndTimeMs("getQrUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject.put("qrUrl", str);
            SnsMethodCalculate.markStartTimeMs("getQrResultUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            String str3 = aVar.f174457g;
            SnsMethodCalculate.markEndTimeMs("getQrResultUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            if (str3 == null) {
                str3 = str2;
            }
            jSONObject.put("qrResultUrl", str3);
            SnsMethodCalculate.markStartTimeMs("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            String str4 = aVar.f174458h;
            SnsMethodCalculate.markEndTimeMs("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            if (str4 != null) {
                str2 = str4;
            }
            jSONObject.put("qrExtInfo", str2);
            SnsMethodCalculate.markStartTimeMs("getDirectJump", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            SnsMethodCalculate.markEndTimeMs("getDirectJump", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            jSONObject.put("directJump", 1);
            SnsMethodCalculate.markStartTimeMs("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            int i2 = aVar.f174459i;
            SnsMethodCalculate.markEndTimeMs("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            if (i2 != 0) {
                SnsMethodCalculate.markStartTimeMs("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
                int i3 = aVar.f174459i;
                SnsMethodCalculate.markEndTimeMs("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
                jSONObject.put("qrResultUrlType", i3);
            }
        } catch (Exception e) {
            Log.m105920e("AdQrClickHelper", "buildKVData exp:" + e);
        }
        SnsMethodCalculate.markEndTimeMs("buildExtData", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        return jSONObject;
    }

    /* renamed from: d */
    public final String mo86287d() {
        SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        return "AdQrClickHelper";
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x010b A[Catch:{ Exception -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0117 A[Catch:{ Exception -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0144 A[Catch:{ Exception -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014c A[Catch:{ Exception -> 0x0152 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86288f(lo2.C61326u.C61327a r20) {
        /*
            r19 = this;
            r1 = r20
            java.lang.String r2 = "getScene"
            java.lang.String r3 = "getUxInfo"
            java.lang.String r4 = "getSnsId"
            java.lang.String r5 = ""
            java.lang.String r6 = "AdQrClickHelper"
            java.lang.String r7 = "report"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.String r0 = "reportInfo"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "getQrResult"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)
            int r10 = r1.f174455e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
            r0 = 1612(0x64c, float:2.259E-42)
            if (r10 != 0) goto L_0x0032
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 111(0x6f, float:1.56E-43)
            r10.mo175911u(r0, r11)
            goto L_0x0039
        L_0x0032:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 112(0x70, float:1.57E-43)
            r10.mo175911u(r0, r11)
        L_0x0039:
            org.json.JSONObject r0 = r19.mo86286c(r20)
            java.lang.String r0 = r0.toString()
            java.lang.String r10 = "data.toString()"
            gy3.C87412m.m108593f(r0, r10)
            java.lang.String r10 = "reportKV17539"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r11 = r1.f174452b     // Catch:{ Exception -> 0x00d6 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)     // Catch:{ Exception -> 0x00d6 }
            if (r11 != 0) goto L_0x0057
            r11 = r5
        L_0x0057:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r9)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r12 = r1.f174451a     // Catch:{ Exception -> 0x00d6 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r9)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r13 = "getAid"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r9)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r14 = r1.f174453c     // Catch:{ Exception -> 0x00d6 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r9)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r14)     // Catch:{ Exception -> 0x00d6 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r9)     // Catch:{ Exception -> 0x00d6 }
            int r14 = r1.f174454d     // Catch:{ Exception -> 0x00d6 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r9)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r15 = "UTF-8"
            java.lang.String r15 = java.net.URLEncoder.encode(r0, r15)     // Catch:{ Exception -> 0x00d6 }
            r16 = r5
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00d4 }
            r17 = r7
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00d2 }
            r18 = 0
            r7[r18] = r11     // Catch:{ Exception -> 0x00d2 }
            r18 = 1
            r7[r18] = r13     // Catch:{ Exception -> 0x00d2 }
            r18 = 2
            r7[r18] = r12     // Catch:{ Exception -> 0x00d2 }
            r18 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x00d2 }
            r7[r18] = r14     // Catch:{ Exception -> 0x00d2 }
            r14 = 4
            r7[r14] = r15     // Catch:{ Exception -> 0x00d2 }
            r14 = 17539(0x4483, float:2.4577E-41)
            r5.mo160131h(r14, r7)     // Catch:{ Exception -> 0x00d2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d2 }
            r5.<init>()     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r7 = "reportKV17539 snsId="
            r5.append(r7)     // Catch:{ Exception -> 0x00d2 }
            r5.append(r11)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r7 = ", aid="
            r5.append(r7)     // Catch:{ Exception -> 0x00d2 }
            r5.append(r13)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r7 = ", uxInfo="
            r5.append(r7)     // Catch:{ Exception -> 0x00d2 }
            r5.append(r12)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r7 = ", kvData="
            r5.append(r7)     // Catch:{ Exception -> 0x00d2 }
            r5.append(r0)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x00d2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x00d2 }
            goto L_0x00f0
        L_0x00d2:
            r0 = move-exception
            goto L_0x00db
        L_0x00d4:
            r0 = move-exception
            goto L_0x00d9
        L_0x00d6:
            r0 = move-exception
            r16 = r5
        L_0x00d9:
            r17 = r7
        L_0x00db:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "reportKV17539 exp:"
            r5.append(r7)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x00f0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            java.lang.String r5 = "buildCgiReportData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            org.json.JSONObject r0 = r19.mo86286c(r20)     // Catch:{ Exception -> 0x0152 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r9)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r10 = r1.f174451a     // Catch:{ Exception -> 0x0152 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r9)     // Catch:{ Exception -> 0x0152 }
            if (r10 != 0) goto L_0x010d
            r10 = r16
        L_0x010d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r3 = r1.f174452b     // Catch:{ Exception -> 0x0152 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)     // Catch:{ Exception -> 0x0152 }
            if (r3 != 0) goto L_0x0119
            r3 = r16
        L_0x0119:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r9)     // Catch:{ Exception -> 0x0152 }
            int r4 = r1.f174454d     // Catch:{ Exception -> 0x0152 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r9)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r2 = "extInfo"
            r7.put(r2, r0)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r0 = "uxinfo"
            r7.put(r0, r10)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r0 = "snsId"
            r7.put(r0, r3)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r0 = "scene"
            r7.put(r0, r4)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r0 = "getAdExtInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = r1.f174460j     // Catch:{ Exception -> 0x0152 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)     // Catch:{ Exception -> 0x0152 }
            if (r1 != 0) goto L_0x0146
            r1 = r16
        L_0x0146:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0152 }
            if (r0 != 0) goto L_0x0167
            java.lang.String r0 = "adExtInfo"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x0152 }
            goto L_0x0167
        L_0x0152:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buildCgiReportData exp:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0167:
            java.lang.String r0 = r7.toString()
            java.lang.String r1 = "reportJson.toString()"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buildCgiReportData ret="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            java.lang.String r1 = "17539"
            vr2.C102260r.m134858a(r1, r0)
            r1 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C61326u.mo86288f(lo2.u$a):void");
    }
}
