package ml2;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.PublishScanCodeResultEvent;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI;
import com.tencent.p014mm.plugin.scanner.view.C94528d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qbar.ScanIdentifyReportInfo;
import com.tencent.scanlib.p325ui.ScanView;
import f40.C86709a0;
import java.util.ArrayList;
import ml2.C10931f;
import ob0.C11385n;
import vl2.C102210d;
import vl2.C102212j;

/* renamed from: ml2.e */
public class C99930e extends C10931f<Bundle> implements C10931f.C10933a, C11385n {

    /* renamed from: g */
    public int f292792g;

    /* renamed from: h */
    public boolean f292793h;

    /* renamed from: i */
    public C102212j f292794i;

    /* renamed from: j */
    public C99931a f292795j;

    /* renamed from: n */
    public C94528d f292796n;

    /* renamed from: ml2.e$a */
    public interface C99931a extends C10931f.C10932b {
    }

    public C99930e(int i, int i2, boolean z, ScanView scanView, C99931a aVar, C94528d dVar) {
        this.f292792g = i2;
        this.f32580d = scanView;
        this.f292795j = aVar;
        this.f32582f = scanView.getContext();
        this.f292796n = dVar;
        this.f292793h = z;
        C86709a0.m107524d().mo123455a(971, this);
    }

    /* renamed from: b */
    public void mo361b(int i, Bundle bundle) {
        Log.m105925i("MicroMsg.QRCodeHandler", "notify Event: %d", Integer.valueOf(i));
        switch (i) {
            case 1:
                this.f32580d.mo24373f();
                return;
            case 2:
                this.f32580d.mo24373f();
                return;
            case 3:
                C99931a aVar = this.f292795j;
                if (aVar != null) {
                    ((BaseScanUI) aVar).mo6125q();
                    return;
                }
                return;
            case 5:
                this.f32580d.mo24372e();
                return;
            case 6:
                C99931a aVar2 = this.f292795j;
                if (aVar2 != null) {
                    ((BaseScanUI) aVar2).mo24309j8(1, bundle);
                    return;
                }
                return;
            case 7:
                C99931a aVar3 = this.f292795j;
                if (aVar3 != null) {
                    ((BaseScanUI) aVar3).mo24309j8(2, bundle);
                    return;
                }
                return;
            case 8:
                C99931a aVar4 = this.f292795j;
                if (aVar4 != null) {
                    ((BaseScanUI) aVar4).mo24309j8(3, bundle);
                    return;
                }
                return;
            case 9:
                C99931a aVar5 = this.f292795j;
                if (aVar5 != null) {
                    ((BaseScanUI) aVar5).mo24309j8(4, bundle);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public void mo360a(long j, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle2 != null) {
            String string = bundle2.getString("result_content", "");
            String string2 = bundle2.getString("result_code_name", "");
            int a = C5177x.m5204a(string2);
            int i = bundle2.getInt("result_code_version", 0);
            int i2 = bundle2.getInt("qbar_string_scan_source", 0);
            boolean z = bundle2.getBoolean("key_disable_bar_code_jump_scan_goods", false);
            ArrayList<Integer> integerArrayList = bundle2.getIntegerArrayList("key_scan_tab_bar_type_list");
            ScanIdentifyReportInfo scanIdentifyReportInfo = (ScanIdentifyReportInfo) bundle2.getParcelable("ScanIdentifyReportInfo.DecodeKey");
            boolean z2 = true;
            int i3 = 4;
            Log.m105925i("MicroMsg.QRCodeHandler", "alvinluo handleResult content %s, codeType %d, codeName %s, codeVersion %d, disableJumpScanGoods: %s", string, Integer.valueOf(a), string2, Integer.valueOf(i), Boolean.valueOf(z));
            if (!Util.isNullOrNil(string)) {
                PublishScanCodeResultEvent publishScanCodeResultEvent = new PublishScanCodeResultEvent();
                PublishScanCodeResultEvent.C67760a aVar = publishScanCodeResultEvent.f193844d;
                aVar.f193847b = string2;
                aVar.f193848c = string;
                aVar.f193846a = 1;
                publishScanCodeResultEvent.publish();
                publishScanCodeResultEvent.f193845e.getClass();
                C102212j jVar = this.f292794i;
                if (jVar != null) {
                    jVar.mo141740c();
                }
                if (C5177x.m5205b(a)) {
                    C102212j jVar2 = new C102212j();
                    this.f292794i = jVar2;
                    Activity activity = (Activity) this.f32580d.getContext();
                    if (i2 != 0) {
                        i3 = 34;
                    }
                    jVar2.mo141742e(activity, string, i2, i3, string2, a, i, this, this.f292796n, (Bundle) null, this.f292792g, false, -1, this.f292793h, scanIdentifyReportInfo);
                    return;
                }
                int i4 = i2 == 1 ? 1 : 0;
                C102210d dVar = new C102210d();
                Activity activity2 = (Activity) this.f32580d.getContext();
                C94528d dVar2 = this.f292796n;
                if (i2 != 1) {
                    z2 = false;
                }
                dVar.mo141737b(activity2, this, dVar2, string, z2, i, string2, (Bundle) null, this.f292792g, false, -1, this.f292793h, z, i4, integerArrayList);
            }
        }
    }

    public void destroy() {
        C86709a0.m107524d().mo123470p(971, this);
        C102212j jVar = this.f292794i;
        if (jVar != null) {
            jVar.mo141740c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r9, int r10, java.lang.String r11, ob0.C117747y r12) {
        /*
            r8 = this;
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r4 = 1
            r1[r4] = r2
            r2 = 2
            r1[r2] = r11
            java.lang.String r5 = "MicroMsg.QRCodeHandler"
            java.lang.String r6 = "errType %d, errCode %d, errMsg %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r1)
            if (r9 == r4) goto L_0x0033
            if (r9 == r2) goto L_0x0021
            r1 = 0
            goto L_0x0072
        L_0x0021:
            android.content.Context r1 = r8.f32582f
            r5 = 2131821610(0x7f11042a, float:1.9275968E38)
            java.lang.String r5 = r1.getString(r5)
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r5, (int) r4)
            r1.show()
        L_0x0031:
            r1 = 1
            goto L_0x0072
        L_0x0033:
            ob0.b0 r1 = f40.C86709a0.m107524d()
            boolean r1 = r1.mo123466l()
            if (r1 == 0) goto L_0x0045
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123465k()
            goto L_0x0031
        L_0x0045:
            android.content.Context r1 = r8.f32582f
            boolean r1 = com.tencent.p014mm.network.C114786m0.m161568a(r1)
            if (r1 == 0) goto L_0x0053
            android.content.Context r1 = r8.f32582f
            com.tencent.p014mm.pluginsdk.p133ui.tools.C6692y0.m7002a(r1)
            goto L_0x0031
        L_0x0053:
            android.content.Context r1 = r8.f32582f
            r5 = 2131830324(0x7f112634, float:1.9293642E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6[r3] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r6[r4] = r7
            java.lang.String r5 = r1.getString(r5, r6)
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r5, (int) r4)
            r1.show()
            goto L_0x0031
        L_0x0072:
            r5 = 0
            if (r1 == 0) goto L_0x0079
            r8.mo361b(r3, r5)
            return
        L_0x0079:
            r1 = 4
            if (r9 != r1) goto L_0x008c
            r1 = -2004(0xfffffffffffff82c, float:NaN)
            if (r10 != r1) goto L_0x008c
            android.content.Context r9 = r8.f32582f
            r10 = 2131834284(0x7f1135ac, float:1.9301674E38)
            r11 = 2131821704(0x7f110488, float:1.9276159E38)
            nj3.C76879j.m92738i(r9, r10, r11)
            return
        L_0x008c:
            if (r9 != 0) goto L_0x009d
            if (r10 == 0) goto L_0x0091
            goto L_0x009d
        L_0x0091:
            int r9 = r12.getType()
            r10 = 971(0x3cb, float:1.36E-42)
            if (r9 != r10) goto L_0x009c
            r8.mo361b(r0, r5)
        L_0x009c:
            return
        L_0x009d:
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.getErrMsgContent(r11)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r12 == 0) goto L_0x00be
            android.content.Context r11 = r8.f32582f
            r12 = 2131830378(0x7f11266a, float:1.9293752E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r3] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0[r4] = r9
            java.lang.String r11 = r11.getString(r12, r0)
        L_0x00be:
            android.content.Context r9 = r8.f32582f
            android.widget.Toast r9 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r11, (int) r3)
            r9.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.C99930e.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
