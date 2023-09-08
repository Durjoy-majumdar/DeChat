package com.tencent.scanlib.p325ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.p014mm.plugin.scanner.p101ui.ScanSampleActivity;
import com.tencent.qbar.C19931a;
import com.tencent.stubs.logger.Log;
import gt3.C20839a;
import ht3.C108258a;
import ht3.C108261e;
import ht3.C108267t;
import ht3.C21001c;
import it3.C21134a;
import it3.C21135c;
import java.util.List;

/* renamed from: com.tencent.scanlib.ui.ScanCodeView */
public class ScanCodeView extends ScanView {

    /* renamed from: o */
    public C20000d f56953o;

    /* renamed from: p */
    public long f56954p;

    /* renamed from: q */
    public C21135c.C21138c f56955q = new C19993a();

    /* renamed from: com.tencent.scanlib.ui.ScanCodeView$a */
    public class C19993a implements C21135c.C21138c {

        /* renamed from: com.tencent.scanlib.ui.ScanCodeView$a$a */
        public class C19994a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f56957d;

            /* renamed from: e */
            public final /* synthetic */ long f56958e;

            public C19994a(long j, long j2) {
                this.f56957d = j;
                this.f56958e = j2;
            }

            public void run() {
                long j = this.f56957d;
                ScanCodeView scanCodeView = ScanCodeView.this;
                if (j == scanCodeView.f56954p && j != 0) {
                    scanCodeView.mo24382k(this.f56958e);
                }
            }
        }

        /* renamed from: com.tencent.scanlib.ui.ScanCodeView$a$b */
        public class C19995b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f56960d;

            /* renamed from: e */
            public final /* synthetic */ List f56961e;

            public C19995b(long j, List list) {
                this.f56960d = j;
                this.f56961e = list;
            }

            public void run() {
                ScanCodeView scanCodeView = ScanCodeView.this;
                long j = scanCodeView.f56954p;
                long j2 = this.f56960d;
                if (j == j2 && j2 != 0) {
                    C21135c.f59755k.mo33092b(j);
                    scanCodeView.f56954p = 0;
                    List list = this.f56961e;
                    if (list != null && !list.isEmpty()) {
                        Bundle bundle = new Bundle();
                        String str = ((C19931a.C19932a) this.f56961e.get(0)).f56829f;
                        bundle.putString("result_content", str);
                        int i = ((C19931a.C19932a) this.f56961e.get(0)).f56827d;
                        bundle.putInt("result_code_format", i);
                        bundle.putString("result_code_name", ((C19931a.C19932a) this.f56961e.get(0)).f56828e);
                        byte[] bArr = ((C19931a.C19932a) this.f56961e.get(0)).f56830g;
                        if (bArr != null) {
                            bundle.putByteArray("result_raw_data", bArr);
                        }
                        Log.m106505i("ScanCodeView", String.format("scan result format: %d, content:%s", new Object[]{Integer.valueOf(i), str}));
                        C20000d dVar = ScanCodeView.this.f56953o;
                        if (dVar != null) {
                            ((ScanSampleActivity.C19088a) dVar).mo24366a(bundle);
                        }
                    }
                }
            }
        }

        /* renamed from: com.tencent.scanlib.ui.ScanCodeView$a$c */
        public class C19996c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f56963d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f56964e;

            public C19996c(long j, Bundle bundle) {
                this.f56963d = j;
                this.f56964e = bundle;
            }

            public void run() {
                long j = this.f56963d;
                if (j == ScanCodeView.this.f56954p && j != 0 && this.f56964e.containsKey("param_zoom_ratio")) {
                    float f = this.f56964e.getFloat("param_zoom_ratio", 0.0f);
                    if (f > 0.0f && ((C108258a) ScanCodeView.this.f56970e).f324141c) {
                        ((C108258a) ScanCodeView.this.f56970e).mo158655q((int) (((float) ((C108258a) ScanCodeView.this.f56970e).mo158641c()) * f));
                    }
                }
            }
        }

        public C19993a() {
        }

        /* renamed from: a */
        public void mo27884a(long j, long j2) {
            ScanCodeView.this.post(new C19994a(j, j2));
        }

        /* renamed from: b */
        public void mo27885b(long j, Bundle bundle) {
            ScanCodeView.this.post(new C19996c(j, bundle));
        }

        /* renamed from: c */
        public void mo27886c(long j, List<C19931a.C19932a> list) {
            Log.m106493d("ScanCodeView", String.format("after decode %d", new Object[]{Long.valueOf(j)}));
            if (list != null && !list.isEmpty()) {
                ScanCodeView.this.post(new C19995b(j, list));
            }
        }
    }

    /* renamed from: com.tencent.scanlib.ui.ScanCodeView$b */
    public class C19997b implements C21001c.C21002a {

        /* renamed from: com.tencent.scanlib.ui.ScanCodeView$b$a */
        public class C19998a implements C108261e.C108262a {
            public C19998a() {
            }

            /* renamed from: a */
            public void mo24458a() {
                ScanCodeView.this.mo24382k(0);
            }
        }

        public C19997b() {
        }

        /* renamed from: a */
        public void mo24425a() {
            ScanCodeView.this.mo27898i(new C19998a());
        }
    }

    /* renamed from: com.tencent.scanlib.ui.ScanCodeView$c */
    public class C19999c implements C108261e.C108262a {
        public C19999c() {
        }

        /* renamed from: a */
        public void mo24458a() {
            ScanCodeView.this.mo24382k(0);
        }
    }

    /* renamed from: com.tencent.scanlib.ui.ScanCodeView$d */
    public interface C20000d {
    }

    public ScanCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: e */
    public void mo24372e() {
        super.mo24372e();
        C21135c.f59755k.mo33092b(this.f56954p);
        this.f56954p = 0;
    }

    /* renamed from: f */
    public void mo24373f() {
        super.mo24373f();
        if (!((C108258a) this.f56970e).f324140b) {
            mo24374g(new C19997b());
        } else if (!((C108258a) this.f56970e).f324141c) {
            mo27898i(new C19999c());
        } else {
            mo24382k(0);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f56954p = currentTimeMillis;
        C21135c cVar = C21135c.f59755k;
        C21135c.C21138c cVar2 = this.f56955q;
        synchronized (cVar.f59758c) {
            cVar.f59761f = currentTimeMillis;
            cVar.f59762g = cVar2;
            cVar.f59764i = 0;
        }
    }

    /* renamed from: l */
    public void mo24534l() {
        Log.m106505i("ScanView", "onCreate");
        mo24371d();
        C21135c cVar = C21135c.f59755k;
        Context context = getContext();
        synchronized (cVar.f59765j) {
            C21134a aVar = cVar.f59765j;
            if (!aVar.f59753c) {
                aVar.mo33089f(context.getApplicationContext(), 0, C20839a.m22865a(context));
                C21134a aVar2 = cVar.f59765j;
                if (aVar2.f59753c) {
                    aVar2.mo33091h(cVar.f59756a);
                }
            }
        }
    }

    /* renamed from: m */
    public void mo24535m() {
        Log.m106505i("ScanView", "onDestroy");
        this.f56969d.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        C21135c cVar = C21135c.f59755k;
        cVar.getClass();
        Log.m106505i("ScanDecodeQueue", "release QBar");
        synchronized (cVar.f59765j) {
            cVar.f59765j.mo33090g();
        }
    }

    /* renamed from: n */
    public void mo24536n() {
        Log.m106505i("ScanView", "onStop");
        mo24381j();
        mo27895a();
    }

    public void onAutoFocus(boolean z, Camera camera) {
        Log.m106506i("ScanCodeView", "onAutoFocus %s", Boolean.valueOf(z));
        if (z) {
            mo24382k(0);
        }
        mo27896c(1000);
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f56973h = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("onPreviewFrame null data:");
        sb.append(bArr == null);
        Log.m106493d("ScanCodeView", sb.toString());
        if (this.f56954p != 0 && ((C108258a) this.f56970e).f324141c) {
            C108267t tVar = this.f56970e;
            Point point = ((C108258a) tVar).f324142d;
            Rect g = ((C108258a) tVar).mo158645g(new Rect(0, 0, getWidth(), getHeight()));
            C21135c cVar = C21135c.f59755k;
            int i = ((C108258a) this.f56970e).f324147i;
            synchronized (cVar.f59758c) {
                Log.m106493d("ScanDecodeQueue", String.format("%d submit crop gray", new Object[]{Long.valueOf(cVar.f59761f)}));
                long j = cVar.f59761f;
                if (j != 0) {
                    cVar.f59759d.execute(new C21135c.C21136a(j, bArr, point, i, g));
                }
            }
            if (!((C108258a) this.f56970e).mo158646h(true) && C21135c.f59755k.f59764i > 50) {
                Log.m106505i("ScanCodeView", "change to FOCUS_MODE_AUTO");
                ((C108258a) this.f56970e).mo158649k("auto");
                mo27896c(100);
            }
        }
    }

    public void setScanCallBack(C20000d dVar) {
        this.f56953o = dVar;
    }

    public void setScanCodeReaders(int[] iArr) {
        C21135c cVar = C21135c.f59755k;
        cVar.getClass();
        if (iArr != null && iArr.length > 0) {
            synchronized (cVar.f59765j) {
                cVar.f59756a = iArr;
                C21134a aVar = cVar.f59765j;
                if (aVar.f59753c) {
                    aVar.mo33091h(iArr);
                }
            }
        }
    }

    public ScanCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
