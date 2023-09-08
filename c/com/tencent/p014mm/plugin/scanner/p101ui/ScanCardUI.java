package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import bl2.C0315a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.autogen.events.ScanCardResultEvent;
import com.tencent.p014mm.autogen.events.ScanQRCodeOprationEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayScanBankCardNumberStruct;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.scanner.view.ScanCardRectView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.stubs.logger.Log;
import di3.C86312j;
import f40.C86737h0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import kg3.C76577a;
import ml2.C10931f;
import nj3.C76879j;
import nj3.C88989a;
import p447aw.C103918d;

@C86737h0
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanCardUI */
public class ScanCardUI extends MMActivity implements C10931f.C10932b {

    /* renamed from: p */
    public static final /* synthetic */ int f20575p = 0;

    /* renamed from: d */
    public int f20576d;

    /* renamed from: e */
    public ScanCardRectView f20577e;

    /* renamed from: f */
    public boolean f20578f;

    /* renamed from: g */
    public boolean f20579g = true;

    /* renamed from: h */
    public C0315a f20580h;

    /* renamed from: i */
    public long f20581i;

    /* renamed from: j */
    public WCPayScanBankCardNumberStruct f20582j = new WCPayScanBankCardNumberStruct();

    /* renamed from: n */
    public ScanCardRectView.C5175g f20583n = new C5162a();

    /* renamed from: o */
    public ScanCardRectView.C5175g f20584o = new C5163b();

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanCardUI$a */
    public class C5162a implements ScanCardRectView.C5175g {
        public C5162a() {
        }

        /* renamed from: a */
        public void mo6126a(long j, Bundle bundle) {
            C0315a aVar = ScanCardUI.this.f20580h;
            if (aVar != null) {
                aVar.mo360a(j, bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanCardUI$b */
    public class C5163b implements ScanCardRectView.C5175g {
        public C5163b() {
        }

        /* renamed from: a */
        public void mo6126a(long j, Bundle bundle) {
            if (bundle.containsKey("param_card_bitmap")) {
                Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bundle.getByteArray("param_card_bitmap"));
                if (ScanCardUI.this.f20576d == 11) {
                    ScanCardResultEvent scanCardResultEvent = new ScanCardResultEvent();
                    ScanCardResultEvent.C1127a aVar = scanCardResultEvent.f9468d;
                    aVar.f9469a = "identity_pay_auth";
                    aVar.f9470b = 1;
                    aVar.f9471c = decodeByteArray;
                    scanCardResultEvent.publish();
                    ScanCardUI.this.finish();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanCardUI$c */
    public class C5164c implements View.OnClickListener {
        public C5164c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanCardUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ScanCardUI scanCardUI = ScanCardUI.this;
            int i = ScanCardUI.f20575p;
            scanCardUI.mo6124H7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanCardUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanCardUI$d */
    public class C5165d implements DialogInterface.OnClickListener {
        public C5165d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(ScanCardUI.this.getContext());
            ScanCardUI scanCardUI = ScanCardUI.this;
            scanCardUI.f20579g = true;
            scanCardUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanCardUI$e */
    public class C5166e implements DialogInterface.OnClickListener {
        public C5166e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ScanCardUI scanCardUI = ScanCardUI.this;
            scanCardUI.f20579g = true;
            scanCardUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanCardUI$f */
    public static class C5167f extends MMBaseAccessibilityConfig {
        public C5167f(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.bu7);
            root.disable(C0966R.C0970id.a5n);
            root.disable(C0966R.C0970id.a5p);
            root.focusFirst(C0966R.C0970id.f357561ai0);
            root.view(C0966R.C0970id.kr9).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.a5p).valueByString(C0966R.string.ib8).type(ViewType.Button).clickAs(C0966R.C0970id.a5n);
        }
    }

    /* renamed from: H7 */
    public final void mo6124H7() {
        ScanQRCodeOprationEvent scanQRCodeOprationEvent = new ScanQRCodeOprationEvent();
        scanQRCodeOprationEvent.f9472d.f9473a = 1;
        scanQRCodeOprationEvent.publish();
        setResult(0);
        mo6125q();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bu8;
    }

    public void initView() {
        getWindow().getDecorView().setSystemUiVisibility(5892);
        setActionbarColor(getResources().getColor(C0966R.color.ahf));
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.iwf);
        ScanCardRectView scanCardRectView = new ScanCardRectView(this);
        this.f20577e = scanCardRectView;
        frameLayout.addView(scanCardRectView, 0, new FrameLayout.LayoutParams(-1, -1));
        Button button = new Button(this);
        button.setWidth(C76577a.m92151b(getContext(), 36));
        button.setHeight(C76577a.m92151b(getContext(), 36));
        Drawable drawable = getResources().getDrawable(C0966R.raw.icons_filled_close2);
        C74933u4.m89769f(drawable, -1);
        button.setBackgroundDrawable(drawable);
        button.setContentDescription(getContext().getString(C0966R.string.bfj));
        button.setOnClickListener(new C5164c());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(getResources().getDimensionPixelSize(C0966R.dimen.f3745cw), getResources().getDimensionPixelSize(C0966R.dimen.f3761db), 0, 0);
        frameLayout.addView(button, layoutParams);
        this.f20577e.setMode(this.f20576d);
        ScanCardRectView scanCardRectView2 = this.f20577e;
        scanCardRectView2.getClass();
        Log.m106505i("ScanView", "onCreate");
        scanCardRectView2.mo24371d();
        switch (this.f20576d) {
            case 7:
                setMMTitle((int) C0966R.string.ibo);
                WCPayScanBankCardNumberStruct wCPayScanBankCardNumberStruct = this.f20582j;
                wCPayScanBankCardNumberStruct.f10092d = 1;
                wCPayScanBankCardNumberStruct.mo86054n();
                this.f20577e.setScanCallback(this.f20583n);
                C0315a aVar = new C0315a(this.f20576d, this.f20577e, this, this.f20582j);
                this.f20580h = aVar;
                aVar.f898i = this.f20578f;
                return;
            case 9:
                setMMTitle((int) C0966R.string.ibs);
                this.f20577e.setScanCallback(this.f20584o);
                return;
            case 10:
                setMMTitle((int) C0966R.string.ibq);
                this.f20577e.setScanCallback(this.f20584o);
                return;
            case 11:
                setMMTitle((int) C0966R.string.ibt);
                this.f20577e.setScanCallback(this.f20584o);
                return;
            default:
                setMMTitle("");
                return;
        }
    }

    public void onBackPressed() {
        mo6124H7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        int intExtra = getIntent().getIntExtra("BaseScanUI_select_scan_mode", -1);
        this.f20576d = intExtra;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ScanCardUI", "scanMode %d", Integer.valueOf(intExtra));
        this.f20578f = getIntent().getBooleanExtra("scan_bankcard_with_confirm_ui", false);
        initView();
        this.f20581i = System.currentTimeMillis();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f20577e.mo24512m();
        C0315a aVar = this.f20580h;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ScanCardUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults len[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr.length), Long.valueOf(Thread.currentThread().getId()));
        if (i == 16 && iArr.length > 0 && iArr[0] == -1) {
            this.f20579g = false;
            C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C5165d(), new C5166e());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003d, code lost:
        if (r1 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r10 = this;
            super.onResume()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r2 = r10.f20579g
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.ScanCardUI"
            java.lang.String r4 = "should check camera %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            boolean r1 = r10.f20579g
            if (r1 == 0) goto L_0x0040
            java.lang.Class<aw.d> r1 = p447aw.C103918d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r4 = r1
            aw.d r4 = (p447aw.C103918d) r4
            r7 = 16
            r8 = 0
            r9 = 0
            java.lang.String r6 = "android.permission.CAMERA"
            r5 = r10
            boolean r1 = r4.mo125788z1(r5, r6, r7, r8, r9)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r4[r3] = r5
            java.lang.String r5 = "summerper checkPermission checkCamera[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            if (r1 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r3 = 1
        L_0x0041:
            if (r3 == 0) goto L_0x007a
            boolean r1 = p903ij.C76359b.m91785b()
            if (r1 != 0) goto L_0x0075
            r1 = 2131833941(0x7f113455, float:1.9300978E38)
            java.lang.String r3 = r10.getString(r1)
            r1 = 2131833973(0x7f113475, float:1.9301043E38)
            java.lang.String r4 = r10.getString(r1)
            r1 = 2131831713(0x7f112ba1, float:1.929646E38)
            java.lang.String r5 = r10.getString(r1)
            r1 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r6 = r10.getString(r1)
            r7 = 0
            com.tencent.mm.plugin.scanner.ui.j r8 = new com.tencent.mm.plugin.scanner.ui.j
            r8.<init>(r10)
            com.tencent.mm.plugin.scanner.ui.k r9 = new com.tencent.mm.plugin.scanner.ui.k
            r9.<init>(r10)
            r2 = r10
            nj3.C76879j.m92709C(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x007a
        L_0x0075:
            com.tencent.mm.plugin.scanner.view.ScanCardRectView r1 = r10.f20577e
            r1.mo24373f()
        L_0x007a:
            android.content.Context r1 = r10.getApplicationContext()
            boolean r1 = p182kk.C61104a.m71651g(r1)
            if (r1 != 0) goto L_0x0098
            android.content.Context r1 = r10.getApplicationContext()
            boolean r1 = p182kk.C61104a.m71667w(r1)
            if (r1 != 0) goto L_0x0098
            android.content.Context r1 = r10.getApplicationContext()
            boolean r0 = p182kk.C61104a.m71647c(r1, r0)
            if (r0 == 0) goto L_0x009b
        L_0x0098:
            r10.mo6124H7()
        L_0x009b:
            android.view.Window r0 = r10.getWindow()
            r1 = 128(0x80, float:1.794E-43)
            r0.addFlags(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.ScanCardUI.onResume():void");
    }

    public void onStop() {
        super.onStop();
        this.f20577e.mo24513n();
    }

    /* renamed from: q */
    public void mo6125q() {
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.ScanCardUI", "finishUI");
        if (this.f20576d == 7) {
            WCPayScanBankCardNumberStruct wCPayScanBankCardNumberStruct = this.f20582j;
            if (wCPayScanBankCardNumberStruct.f10092d == 1) {
                wCPayScanBankCardNumberStruct.f10092d = 4;
            }
            wCPayScanBankCardNumberStruct.f10093e = System.currentTimeMillis() - this.f20581i;
            this.f20582j.mo86054n();
        }
        finish();
        overridePendingTransition(0, 0);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5167f.class);
    }
}
