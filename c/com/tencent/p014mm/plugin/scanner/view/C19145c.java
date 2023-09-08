package com.tencent.p014mm.plugin.scanner.view;

import android.os.Bundle;
import com.tencent.p014mm.plugin.scanner.p101ui.ScanSampleActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.C19938f;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.WxQbarNative;
import com.tencent.scanlib.p325ui.ScanCodeView;
import ht3.C108258a;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.scanner.view.c */
public class C19145c implements C19938f.C19941c {

    /* renamed from: a */
    public final /* synthetic */ ScanCodeRectView f53889a;

    /* renamed from: com.tencent.mm.plugin.scanner.view.c$a */
    public class C19146a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f53890d;

        /* renamed from: e */
        public final /* synthetic */ long f53891e;

        public C19146a(long j, long j2) {
            this.f53890d = j;
            this.f53891e = j2;
        }

        public void run() {
            long j = this.f53890d;
            ScanCodeRectView scanCodeRectView = C19145c.this.f53889a;
            int i = ScanCodeRectView.f53874t;
            if (j == scanCodeRectView.f56954p && j != 0) {
                scanCodeRectView.mo24382k(this.f53891e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.view.c$b */
    public class C19147b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f53893d;

        /* renamed from: e */
        public final /* synthetic */ List f53894e;

        /* renamed from: f */
        public final /* synthetic */ List f53895f;

        public C19147b(long j, List list, List list2) {
            this.f53893d = j;
            this.f53894e = list;
            this.f53895f = list2;
        }

        public void run() {
            ScanCodeRectView scanCodeRectView = C19145c.this.f53889a;
            int i = ScanCodeRectView.f53874t;
            long j = scanCodeRectView.f56954p;
            long j2 = this.f53893d;
            if (j == j2 && j2 != 0) {
                C19938f.f56890w.mo27330h(j);
                C19145c.this.f53889a.f56954p = 0;
                List list = this.f53894e;
                if (list != null && !list.isEmpty()) {
                    Bundle bundle = new Bundle();
                    String str = ((C19931a.C19932a) this.f53894e.get(0)).f56829f;
                    bundle.putString("result_content", str);
                    int i2 = ((C19931a.C19932a) this.f53894e.get(0)).f56827d;
                    bundle.putInt("result_code_format", i2);
                    bundle.putString("result_code_name", ((C19931a.C19932a) this.f53894e.get(0)).f56828e);
                    byte[] bArr = ((C19931a.C19932a) this.f53894e.get(0)).f56830g;
                    if (bArr != null) {
                        bundle.putByteArray("result_raw_data", bArr);
                    }
                    List list2 = this.f53895f;
                    if (list2 != null && !list2.isEmpty()) {
                        bundle.putInt("result_code_version", ((WxQbarNative.QBarReportMsg) this.f53895f.get(0)).qrcodeVersion);
                    }
                    ScanRectDecorView scanRectDecorView = C19145c.this.f53889a.f53875r;
                    scanRectDecorView.f53880d.cancel();
                    scanRectDecorView.f53881e.setVisibility(8);
                    Log.m105925i("MicroMsg.ScanCodeRectView", "scan result format: %d, content:", Integer.valueOf(i2), str);
                    ScanCodeView.C20000d dVar = C19145c.this.f53889a.f56953o;
                    if (dVar != null) {
                        ((ScanSampleActivity.C19088a) dVar).mo24366a(bundle);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.view.c$c */
    public class C19148c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f53897d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f53898e;

        public C19148c(long j, Bundle bundle) {
            this.f53897d = j;
            this.f53898e = bundle;
        }

        public void run() {
            long j = this.f53897d;
            ScanCodeRectView scanCodeRectView = C19145c.this.f53889a;
            int i = ScanCodeRectView.f53874t;
            if (j == scanCodeRectView.f56954p && j != 0 && this.f53898e.containsKey("param_zoom_ratio")) {
                float f = (float) this.f53898e.getInt("param_zoom_ratio", 0);
                if (f > 0.0f && ((C108258a) C19145c.this.f53889a.f56970e).f324141c) {
                    ((C108258a) C19145c.this.f53889a.f56970e).mo158655q((int) (((float) ((C108258a) C19145c.this.f53889a.f56970e).mo158641c()) * f));
                }
            }
        }
    }

    public C19145c(ScanCodeRectView scanCodeRectView) {
        this.f53889a = scanCodeRectView;
    }

    /* renamed from: a */
    public void mo24429a(long j, long j2) {
        this.f53889a.post(new C19146a(j, j2));
    }

    /* renamed from: b */
    public void mo24430b(long j, Bundle bundle) {
        this.f53889a.post(new C19148c(j, bundle));
    }

    /* renamed from: c */
    public void mo24431c(long j, List<C19931a.C19932a> list, List<QbarNative.QBarPoint> list2, List<WxQbarNative.QBarReportMsg> list3, Bundle bundle) {
        Log.m105918d("MicroMsg.ScanCodeRectView", String.format("after decode %d", new Object[]{Long.valueOf(j)}));
        if (list != null && !list.isEmpty()) {
            this.f53889a.post(new C19147b(j, list, list3));
        }
    }

    /* renamed from: d */
    public void mo24432d(byte[] bArr) {
    }
}
