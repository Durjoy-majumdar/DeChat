package com.tencent.p014mm.plugin.scanner.p101ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.scanlib.p325ui.ScanCodeView;
import gt3.C20839a;
import nj3.C76879j;
import nj3.C88989a;

@C88989a(35)
/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanSampleActivity */
public class ScanSampleActivity extends MMActivity {

    /* renamed from: d */
    public ScanCodeView f53669d;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanSampleActivity$a */
    public class C19088a implements ScanCodeView.C20000d {
        public C19088a() {
        }

        /* renamed from: a */
        public void mo24366a(Bundle bundle) {
            if (bundle != null) {
                String string = bundle.getString("result_content", "");
                if (!C20839a.m22868d(string)) {
                    C76879j.m92748s(ScanSampleActivity.this, string, "");
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.buh;
    }

    public void initView() {
        ScanCodeView scanCodeView = (ScanCodeView) findViewById(C0966R.C0970id.j27);
        this.f53669d = scanCodeView;
        scanCodeView.setScanCallBack(new C19088a());
        this.f53669d.mo24534l();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getSupportActionBar().mo91104o();
        getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
        getController().mo177103x0(getResources().getColor(C0966R.color.ahf));
        getWindow().getDecorView().setSystemUiVisibility(5892);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f53669d.mo24535m();
    }

    public void onPause() {
        super.onPause();
        this.f53669d.mo24372e();
    }

    public void onResume() {
        super.onResume();
        this.f53669d.mo24373f();
    }

    public void onStop() {
        super.onStop();
        this.f53669d.mo24536n();
    }
}
