package vr2;

import p200lx.C99712h0;
import vr2.C102251n;

/* renamed from: vr2.o */
public class C102258o implements C99712h0.C99713a {

    /* renamed from: a */
    public final /* synthetic */ C102251n.C102257c f301162a;

    /* renamed from: b */
    public final /* synthetic */ String f301163b;

    /* renamed from: c */
    public final /* synthetic */ C102251n f301164c;

    public C102258o(C102251n nVar, C102251n.C102257c cVar, String str) {
        this.f301164c = nVar;
        this.f301162a = cVar;
        this.f301163b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0154  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24342a(long r18, p200lx.C99712h0.C99715c r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            java.lang.String r2 = "afterDecode"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$6"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            vr2.n r4 = r0.f301164c
            java.lang.String r5 = "access$700"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.data.SnsAdQRHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.ref.WeakReference<android.content.Context> r4 = r4.f301149o
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            java.lang.String r7 = "SnsAdQRHelper"
            r8 = 0
            if (r4 != 0) goto L_0x003e
            vr2.n$c r1 = r0.f301162a
            if (r1 == 0) goto L_0x002f
            java.lang.String r4 = r0.f301163b
            vr2.n r5 = r0.f301164c
            android.os.Bundle r5 = vr2.C102251n.m134810e(r5)
            java.lang.String r6 = "contextRef is null"
            r1.mo131644a(r4, r8, r6, r5)
        L_0x002f:
            vr2.n r1 = r0.f301164c
            r1.mo141818l()
            java.lang.String r1 = "onClickDirectForSearchJsapi, afterDecode, contextRef is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x003e:
            vr2.n r4 = r0.f301164c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.ref.WeakReference<android.content.Context> r4 = r4.f301149o
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            if (r4 != 0) goto L_0x0070
            vr2.n$c r1 = r0.f301162a
            if (r1 == 0) goto L_0x0061
            java.lang.String r4 = r0.f301163b
            vr2.n r5 = r0.f301164c
            android.os.Bundle r5 = vr2.C102251n.m134810e(r5)
            java.lang.String r6 = "context is null"
            r1.mo131644a(r4, r8, r6, r5)
        L_0x0061:
            vr2.n r1 = r0.f301164c
            r1.mo141818l()
            java.lang.String r1 = "onClickDirectForSearchJsapi, afterDecode, contextRef get is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0070:
            r5 = 0
            if (r1 == 0) goto L_0x0076
            java.util.List<com.tencent.qbar.a$a> r9 = r1.f292251a
            goto L_0x0077
        L_0x0076:
            r9 = r5
        L_0x0077:
            if (r1 == 0) goto L_0x007c
            java.util.List<com.tencent.qbar.WxQbarNative$QBarReportMsg> r1 = r1.f292253c
            goto L_0x007d
        L_0x007c:
            r1 = r5
        L_0x007d:
            if (r9 == 0) goto L_0x0231
            int r10 = r9.size()
            if (r10 <= 0) goto L_0x0231
            java.lang.Object r10 = r9.get(r8)
            com.tencent.qbar.a$a r10 = (com.tencent.qbar.C19931a.C19932a) r10
            java.lang.String r10 = r10.f56828e
            int r10 = com.tencent.p014mm.plugin.scanner.C5177x.m5204a(r10)
            java.lang.Object r9 = r9.get(r8)
            com.tencent.qbar.a$a r9 = (com.tencent.qbar.C19931a.C19932a) r9
            java.lang.String r9 = r9.f56829f
            r11 = -1
            if (r1 == 0) goto L_0x00aa
            boolean r12 = r1.isEmpty()
            if (r12 != 0) goto L_0x00aa
            java.lang.Object r1 = r1.get(r8)
            com.tencent.qbar.WxQbarNative$QBarReportMsg r1 = (com.tencent.qbar.WxQbarNative.QBarReportMsg) r1
            int r11 = r1.qrcodeVersion
        L_0x00aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r12 = "QRCodeStr is "
            r1.append(r12)
            r1.append(r9)
            java.lang.String r12 = ", QRCodeType is "
            r1.append(r12)
            r1.append(r10)
            java.lang.String r12 = ", QRCodeVer is "
            r1.append(r12)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            vr2.n r1 = r0.f301164c
            r1.getClass()
            java.lang.String r12 = "isValidQRCodeForSearchJsapi"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r6)
            boolean r13 = android.text.TextUtils.isEmpty(r9)
            r15 = 1
            if (r13 == 0) goto L_0x00e4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r6)
            goto L_0x0109
        L_0x00e4:
            java.lang.Class<lx.x> r13 = p200lx.C61416x.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            lx.x r13 = (p200lx.C61416x) r13
            boolean r14 = r13.mo71995PE(r10, r9)
            if (r14 == 0) goto L_0x00f8
            r1.f301141g = r15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r6)
            goto L_0x0104
        L_0x00f8:
            boolean r13 = r13.mo71996Qz(r10, r9)
            if (r13 == 0) goto L_0x0106
            r13 = 6
            r1.f301141g = r13
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r6)
        L_0x0104:
            r1 = 1
            goto L_0x010a
        L_0x0106:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r6)
        L_0x0109:
            r1 = 0
        L_0x010a:
            java.lang.String r12 = "access$1000"
            java.lang.String r13 = "access$900"
            java.lang.String r14 = "access$800"
            if (r1 != 0) goto L_0x0154
            java.lang.String r1 = "isValidQRCode is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            r1 = 2
            vr2.n r4 = r0.f301164c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r6)
            java.lang.String r4 = r4.f301143i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r6)
            vr2.n r7 = r0.f301164c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r6)
            java.lang.String r7 = r7.f301148n
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r6)
            vr2.n r9 = r0.f301164c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r6)
            int r9 = r9.f301141g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r6)
            vr2.C102251n.m134812p(r1, r5, r4, r7, r9)
            vr2.n$c r1 = r0.f301162a
            if (r1 == 0) goto L_0x014b
            java.lang.String r4 = r0.f301163b
            vr2.n r5 = r0.f301164c
            android.os.Bundle r5 = vr2.C102251n.m134810e(r5)
            java.lang.String r6 = "inValid QRCode"
            r1.mo131644a(r4, r8, r6, r5)
        L_0x014b:
            vr2.n r1 = r0.f301164c
            r1.mo141818l()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0154:
            vr2.n r1 = r0.f301164c
            java.lang.String r5 = "access$402"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r1.f301138d = r10
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            vr2.n r1 = r0.f301164c
            java.lang.String r5 = "access$302"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r1.f301140f = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            vr2.n r1 = r0.f301164c
            java.lang.String r5 = "access$502"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r1.f301139e = r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r1 != 0) goto L_0x019f
            vr2.n r1 = r0.f301164c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r6)
            java.lang.String r1 = r1.f301143i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r6)
            vr2.n r5 = r0.f301164c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r6)
            java.lang.String r5 = r5.f301148n
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r6)
            vr2.n r10 = r0.f301164c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r6)
            int r10 = r10.f301141g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r6)
            vr2.C102251n.m134812p(r8, r9, r1, r5, r10)
        L_0x019f:
            java.lang.String r1 = "onClickDirectForSearchJsapi createIntent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsAdProxyUI> r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdProxyUI.class
            r1.<init>(r4, r5)
            java.lang.String r5 = "action_type"
            r1.putExtra(r5, r15)
            vr2.n r5 = r0.f301164c
            java.lang.String r5 = vr2.C102251n.m134808c(r5)
            java.lang.String r7 = "qrcodeStr"
            r1.putExtra(r7, r5)
            vr2.n r5 = r0.f301164c
            int r5 = vr2.C102251n.m134809d(r5)
            java.lang.String r7 = "qrcodeType"
            r1.putExtra(r7, r5)
            vr2.n r5 = r0.f301164c
            java.lang.String r7 = "access$500"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            int r5 = r5.f301139e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            java.lang.String r6 = "qrcodeVer"
            r1.putExtra(r6, r5)
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r1)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$6"
            java.lang.String r12 = "afterDecode"
            java.lang.String r13 = "(JLcom/tencent/mm/feature/scanner/api/IWxFileDecodeQueue$ScanCodeForFileResult;)V"
            java.lang.String r14 = "Undefined"
            java.lang.String r1 = "startActivity"
            java.lang.String r16 = "(Landroid/content/Intent;)V"
            r9 = r4
            r6 = 1
            r15 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r5.mo10231a(r8)
            android.content.Intent r1 = (android.content.Intent) r1
            r4.startActivity(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$6"
            java.lang.String r11 = "afterDecode"
            java.lang.String r12 = "(JLcom/tencent/mm/feature/scanner/api/IWxFileDecodeQueue$ScanCodeForFileResult;)V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "startActivity"
            java.lang.String r15 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = r4 instanceof android.app.Activity
            if (r1 == 0) goto L_0x021f
            android.app.Activity r4 = (android.app.Activity) r4
            r1 = 2130771992(0x7f010018, float:1.714709E38)
            r4.overridePendingTransition(r1, r1)
        L_0x021f:
            vr2.n$c r1 = r0.f301162a
            if (r1 == 0) goto L_0x0248
            java.lang.String r4 = r0.f301163b
            vr2.n r5 = r0.f301164c
            android.os.Bundle r5 = vr2.C102251n.m134810e(r5)
            java.lang.String r7 = ""
            r1.mo131644a(r4, r6, r7, r5)
            goto L_0x0248
        L_0x0231:
            java.lang.String r1 = "onClickDirectForSearchJsapi afterDecode, results is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            vr2.n$c r1 = r0.f301162a
            if (r1 == 0) goto L_0x0248
            java.lang.String r4 = r0.f301163b
            vr2.n r5 = r0.f301164c
            android.os.Bundle r5 = vr2.C102251n.m134810e(r5)
            java.lang.String r6 = "QR result is empty"
            r1.mo131644a(r4, r8, r6, r5)
        L_0x0248:
            vr2.n r1 = r0.f301164c
            r1.mo141818l()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.C102258o.mo24342a(long, lx.h0$c):void");
    }
}
