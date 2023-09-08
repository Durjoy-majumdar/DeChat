package com.tencent.p014mm.plugin.scanner.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.C19933b;
import com.tencent.qbar.C19937e;
import com.tencent.qbar.C19938f;
import com.tencent.scanlib.p325ui.ScanCodeView;
import ht3.C108258a;
import ht3.C108261e;
import ht3.C108267t;
import ht3.C21001c;
import yk2.C112475a;

/* renamed from: com.tencent.mm.plugin.scanner.view.ScanCodeRectView */
public class ScanCodeRectView extends ScanCodeView {

    /* renamed from: t */
    public static final /* synthetic */ int f53874t = 0;

    /* renamed from: r */
    public ScanRectDecorView f53875r;

    /* renamed from: s */
    public C19938f.C19941c f53876s;

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCodeRectView$a */
    public class C19140a implements C21001c.C21002a {

        /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCodeRectView$a$a */
        public class C19141a implements C108261e.C108262a {
            public C19141a() {
            }

            /* renamed from: a */
            public void mo24458a() {
                ScanCodeRectView.this.mo24382k(0);
            }
        }

        public C19140a() {
        }

        /* renamed from: a */
        public void mo24425a() {
            ScanCodeRectView.this.mo27898i(new C19141a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.view.ScanCodeRectView$b */
    public class C19142b implements C108261e.C108262a {
        public C19142b() {
        }

        /* renamed from: a */
        public void mo24458a() {
            ScanCodeRectView.this.mo24382k(0);
        }
    }

    public ScanCodeRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public void mo24370b() {
        this.f56970e = new C112475a();
    }

    /* renamed from: d */
    public void mo24371d() {
        super.mo24371d();
        ScanRectDecorView scanRectDecorView = new ScanRectDecorView(getContext());
        this.f53875r = scanRectDecorView;
        addView(scanRectDecorView, new FrameLayout.LayoutParams(-1, -1));
        this.f53876s = new C19145c(this);
    }

    /* renamed from: e */
    public void mo24372e() {
        C19938f.f56890w.mo27330h(this.f56954p);
        this.f56954p = 0;
        ScanRectDecorView scanRectDecorView = this.f53875r;
        scanRectDecorView.f53880d.cancel();
        scanRectDecorView.f53881e.setVisibility(8);
    }

    /* renamed from: f */
    public void mo24373f() {
        if (!((C108258a) this.f56970e).f324140b) {
            mo24374g(new C19140a());
        } else if (!((C108258a) this.f56970e).f324141c) {
            mo27898i(new C19142b());
        } else {
            mo24382k(0);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f56954p = currentTimeMillis;
        C19938f fVar = C19938f.f56890w;
        C19933b bVar = C19933b.f56833H;
        fVar.mo27329g(currentTimeMillis, 1, (C19938f.C19942d) null, this.f53876s);
        ScanRectDecorView scanRectDecorView = this.f53875r;
        if (!scanRectDecorView.f53880d.isStarted()) {
            scanRectDecorView.f53881e.setVisibility(0);
            scanRectDecorView.f53880d.start();
        }
    }

    public Rect getDecorRect() {
        return this.f53875r.getDecorRect();
    }

    /* renamed from: l */
    public void mo24534l() {
        super.mo24534l();
        C19938f.f56890w.mo27327e(getContext());
    }

    /* renamed from: m */
    public void mo24535m() {
        super.mo24535m();
        C19938f.f56890w.mo27328f();
    }

    /* renamed from: n */
    public void mo24536n() {
        super.mo24536n();
    }

    public void onAutoFocus(boolean z, Camera camera) {
        Log.m105925i("MicroMsg.ScanCodeRectView", "onAutoFocus %s", Boolean.valueOf(z));
        if (z) {
            mo24382k(0);
        }
        mo27896c((long) 1000);
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        super.onPreviewFrame(bArr, camera);
        StringBuilder sb = new StringBuilder();
        sb.append("onPreviewFrame null data:");
        int i = 0;
        sb.append(bArr == null);
        Log.m105918d("MicroMsg.ScanCodeRectView", sb.toString());
        if (this.f56954p != 0 && ((C108258a) this.f56970e).f324141c) {
            C108267t tVar = this.f56970e;
            Point point = ((C108258a) tVar).f324142d;
            C108258a aVar = (C108258a) tVar;
            Rect decorRect = getDecorRect();
            Rect rect = new Rect();
            ((Activity) getContext()).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            Point point2 = new Point(rect.width(), rect.height());
            Rect rect2 = new Rect();
            int height = (int) (((float) decorRect.height()) * 0.5f);
            int width = ((int) (((float) decorRect.width()) * 0.5f)) / 2;
            int i2 = decorRect.left - width;
            rect2.left = i2;
            int i3 = decorRect.right + width;
            rect2.right = i3;
            int i4 = height / 2;
            int i5 = decorRect.top - i4;
            rect2.top = i5;
            int i6 = decorRect.bottom + i4;
            rect2.bottom = i6;
            if (i2 < 0) {
                i2 = 0;
            }
            rect2.left = i2;
            int i7 = point2.x;
            if (i3 > i7) {
                i3 = i7;
            }
            rect2.right = i3;
            if (i5 >= 0) {
                i = i5;
            }
            rect2.top = i;
            int i8 = point2.y;
            if (i6 > i8) {
                i6 = i8;
            }
            rect2.bottom = i6;
            C19938f.f56890w.mo27326d(bArr, point, ((C108258a) this.f56970e).f324147i, aVar.mo158645g(rect2));
            if (!((C108258a) this.f56970e).mo158646h(true) && C19938f.f56890w.f56901k > 50) {
                Log.m105924i("MicroMsg.ScanCodeRectView", "change to FOCUS_MODE_AUTO");
                ((C108258a) this.f56970e).mo158649k("auto");
                mo27896c(100);
            }
        }
    }

    public void setDecorRect(Rect rect) {
        this.f53875r.setDecorRect(rect);
    }

    public void setScanCodeReaders(int[] iArr) {
        C19938f fVar = C19938f.f56890w;
        fVar.getClass();
        if (iArr != null && iArr.length > 0) {
            synchronized (fVar.f56903m) {
                fVar.f56895e = iArr;
                C19937e eVar = fVar.f56903m;
                if (eVar.f59753c) {
                    eVar.mo33091h(iArr);
                }
            }
        }
    }

    public ScanCodeRectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
