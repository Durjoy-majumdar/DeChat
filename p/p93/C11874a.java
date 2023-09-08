package p93;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;

/* renamed from: p93.a */
public abstract class C11874a extends C103422m {
    public C11874a(Context context) {
        super(context, C0966R.style.f8368fy);
    }

    /* renamed from: E */
    public abstract View mo11752E();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r2 = (r2 = r2.getResources()).getDisplayMetrics();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            java.lang.String r4 = "MicroMsg.BrowseChooseDialog"
            java.lang.String r0 = "alvinluo BrowserDialog onCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.view.Window r4 = r3.getWindow()
            r0 = -2
            r1 = -1
            if (r4 == 0) goto L_0x0015
            r4.setLayout(r1, r0)
        L_0x0015:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L_0x0020
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r4.addFlags(r2)
        L_0x0020:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L_0x002b
            r2 = 1056964608(0x3f000000, float:0.5)
            r4.setDimAmount(r2)
        L_0x002b:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L_0x0037
            r2 = 2131886334(0x7f1200fe, float:1.9407244E38)
            r4.setWindowAnimations(r2)
        L_0x0037:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L_0x0067
            android.view.View r4 = r4.getDecorView()
            if (r4 == 0) goto L_0x0067
            android.content.Context r2 = r4.getContext()
            if (r2 == 0) goto L_0x0058
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x0058
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r2 == 0) goto L_0x0058
            int r2 = r2.widthPixels
            goto L_0x0060
        L_0x0058:
            android.content.Context r2 = r4.getContext()
            int r2 = kg3.C76577a.m92145A(r2)
        L_0x0060:
            r4.setMinimumWidth(r2)
            r2 = 0
            r4.setPadding(r2, r2, r2, r2)
        L_0x0067:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L_0x007b
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            if (r4 == 0) goto L_0x007b
            r4.width = r1
            r4.height = r0
            r0 = 80
            r4.gravity = r0
        L_0x007b:
            android.view.View r4 = r3.mo11752E()
            r3.setContentView((android.view.View) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p93.C11874a.onCreate(android.os.Bundle):void");
    }
}
