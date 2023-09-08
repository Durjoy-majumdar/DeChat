package com.tencent.scanlib.p325ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.scanner.p101ui.ScanSampleActivity;
import com.tencent.qbar.C19931a;
import com.tencent.scanlib.model.DetectCode;
import com.tencent.scanlib.p325ui.ScanCodeView;
import com.tencent.stubs.logger.Log;
import ht3.C108258a;
import ht3.C108261e;
import ht3.C21001c;
import it3.C21135c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.scanlib.ui.ScanCodeDetectView */
public class ScanCodeDetectView extends ScanCodeView {

    /* renamed from: t */
    public static final /* synthetic */ int f56936t = 0;

    /* renamed from: r */
    public DetectCodeView f56937r;

    /* renamed from: s */
    public C21135c.C21138c f56938s = new C19985a();

    /* renamed from: com.tencent.scanlib.ui.ScanCodeDetectView$a */
    public class C19985a implements C21135c.C21138c {

        /* renamed from: com.tencent.scanlib.ui.ScanCodeDetectView$a$a */
        public class C19986a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f56940d;

            /* renamed from: e */
            public final /* synthetic */ long f56941e;

            public C19986a(long j, long j2) {
                this.f56940d = j;
                this.f56941e = j2;
            }

            public void run() {
                long j = this.f56940d;
                ScanCodeDetectView scanCodeDetectView = ScanCodeDetectView.this;
                if (j == scanCodeDetectView.f56954p && j != 0) {
                    scanCodeDetectView.mo24382k(this.f56941e);
                }
            }
        }

        /* renamed from: com.tencent.scanlib.ui.ScanCodeDetectView$a$b */
        public class C19987b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f56943d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f56944e;

            public C19987b(long j, Bundle bundle) {
                this.f56943d = j;
                this.f56944e = bundle;
            }

            public void run() {
                ArrayList<DetectCode> parcelableArrayList;
                long j = this.f56943d;
                if (j == ScanCodeDetectView.this.f56954p && j != 0) {
                    if (this.f56944e.containsKey("param_zoom_ratio")) {
                        float f = this.f56944e.getFloat("param_zoom_ratio", 0.0f);
                        if (f > 0.0f && ((C108258a) ScanCodeDetectView.this.f56970e).f324141c) {
                            ((C108258a) ScanCodeDetectView.this.f56970e).mo158655q((int) (((float) ((C108258a) ScanCodeDetectView.this.f56970e).mo158641c()) * f));
                        }
                    }
                    if (this.f56944e.containsKey("param_detect_codes") && (parcelableArrayList = this.f56944e.getParcelableArrayList("param_detect_codes")) != null && !parcelableArrayList.isEmpty()) {
                        for (DetectCode detectCode : parcelableArrayList) {
                            ArrayList arrayList = new ArrayList(detectCode.f221377e.size());
                            for (Point next : detectCode.f221377e) {
                                ScanCodeDetectView scanCodeDetectView = ScanCodeDetectView.this;
                                int i = ScanCodeDetectView.f56936t;
                                float f2 = ((C108258a) scanCodeDetectView.f56970e).f324145g;
                                arrayList.add(new Point((int) (((float) next.x) * f2), (int) (((float) next.y) * f2)));
                            }
                            detectCode.f221377e = arrayList;
                        }
                        ScanCodeDetectView.this.f56937r.setDetectedCodes(parcelableArrayList);
                    }
                }
            }
        }

        /* renamed from: com.tencent.scanlib.ui.ScanCodeDetectView$a$c */
        public class C19988c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f56946d;

            /* renamed from: e */
            public final /* synthetic */ List f56947e;

            /* renamed from: com.tencent.scanlib.ui.ScanCodeDetectView$a$c$a */
            public class C19989a implements Runnable {
                public C19989a() {
                }

                public void run() {
                    ScanCodeDetectView.this.f56937r.setDetectedCodes((List<DetectCode>) null);
                }
            }

            public C19988c(long j, List list) {
                this.f56946d = j;
                this.f56947e = list;
            }

            public void run() {
                long j = ScanCodeDetectView.this.f56954p;
                long j2 = this.f56946d;
                if (j == j2 && j2 != 0) {
                    C21135c.f59755k.mo33092b(j);
                    ScanCodeDetectView scanCodeDetectView = ScanCodeDetectView.this;
                    scanCodeDetectView.f56954p = 0;
                    scanCodeDetectView.postDelayed(new C19989a(), 500);
                    List list = this.f56947e;
                    if (list != null && !list.isEmpty()) {
                        Bundle bundle = new Bundle();
                        String str = ((C19931a.C19932a) this.f56947e.get(0)).f56829f;
                        bundle.putString("result_content", str);
                        int i = ((C19931a.C19932a) this.f56947e.get(0)).f56827d;
                        bundle.putInt("result_code_format", i);
                        bundle.putString("result_code_name", ((C19931a.C19932a) this.f56947e.get(0)).f56828e);
                        byte[] bArr = ((C19931a.C19932a) this.f56947e.get(0)).f56830g;
                        if (bArr != null) {
                            bundle.putByteArray("result_raw_data", bArr);
                        }
                        Log.m106505i("ScanCodeDetectView", String.format("scan result format: %d, content:%s", new Object[]{Integer.valueOf(i), str}));
                        ScanCodeView.C20000d dVar = ScanCodeDetectView.this.f56953o;
                        if (dVar != null) {
                            ((ScanSampleActivity.C19088a) dVar).mo24366a(bundle);
                        }
                    }
                }
            }
        }

        public C19985a() {
        }

        /* renamed from: a */
        public void mo27884a(long j, long j2) {
            ScanCodeDetectView.this.post(new C19986a(j, j2));
        }

        /* renamed from: b */
        public void mo27885b(long j, Bundle bundle) {
            ScanCodeDetectView.this.post(new C19987b(j, bundle));
        }

        /* renamed from: c */
        public void mo27886c(long j, List<C19931a.C19932a> list) {
            if (list != null && !list.isEmpty()) {
                ScanCodeDetectView.this.post(new C19988c(j, list));
            }
        }
    }

    /* renamed from: com.tencent.scanlib.ui.ScanCodeDetectView$b */
    public class C19990b implements C21001c.C21002a {

        /* renamed from: com.tencent.scanlib.ui.ScanCodeDetectView$b$a */
        public class C19991a implements C108261e.C108262a {
            public C19991a() {
            }

            /* renamed from: a */
            public void mo24458a() {
                ScanCodeDetectView.this.mo24382k(0);
            }
        }

        public C19990b() {
        }

        /* renamed from: a */
        public void mo24425a() {
            ScanCodeDetectView.this.mo27898i(new C19991a());
        }
    }

    /* renamed from: com.tencent.scanlib.ui.ScanCodeDetectView$c */
    public class C19992c implements C108261e.C108262a {
        public C19992c() {
        }

        /* renamed from: a */
        public void mo24458a() {
            ScanCodeDetectView.this.mo24382k(0);
        }
    }

    public ScanCodeDetectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    public void mo24371d() {
        super.mo24371d();
        DetectCodeView detectCodeView = new DetectCodeView(getContext());
        this.f56937r = detectCodeView;
        addView(detectCodeView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: f */
    public void mo24373f() {
        if (!((C108258a) this.f56970e).f324140b) {
            mo24374g(new C19990b());
        } else if (!((C108258a) this.f56970e).f324141c) {
            mo27898i(new C19992c());
        } else {
            mo24382k(0);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f56954p = currentTimeMillis;
        C21135c cVar = C21135c.f59755k;
        C21135c.C21138c cVar2 = this.f56938s;
        synchronized (cVar.f59758c) {
            cVar.f59761f = currentTimeMillis;
            cVar.f59762g = cVar2;
            cVar.f59764i = 0;
        }
    }

    public ScanCodeDetectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
