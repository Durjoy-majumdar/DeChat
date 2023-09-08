package dg2;

import com.tencent.p014mm.plugin.qqmail.p090ui.MailWebViewUI;

/* renamed from: dg2.f */
public class C45338f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f122809d;

    /* renamed from: e */
    public final /* synthetic */ MailWebViewUI f122810e;

    public C45338f(MailWebViewUI mailWebViewUI, int i) {
        this.f122810e = mailWebViewUI;
        this.f122809d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.getWidth();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r3 = this;
            com.tencent.mm.plugin.qqmail.ui.MailWebViewUI r0 = r3.f122810e
            com.tencent.mm.ui.widget.MMWebView r0 = r0.f115846d
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0031
            int r0 = r0.getWidth()
            int r1 = r3.f122809d
            if (r1 <= r0) goto L_0x0031
            r2 = 10
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0019:
            com.tencent.mm.plugin.qqmail.ui.MailWebViewUI r1 = r3.f122810e
            com.tencent.mm.ui.widget.MMWebView r1 = r1.f115846d
            float r1 = r1.getScale()
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0031
            int r2 = r2 + -1
            if (r2 <= 0) goto L_0x0031
            com.tencent.mm.plugin.qqmail.ui.MailWebViewUI r1 = r3.f122810e
            com.tencent.mm.ui.widget.MMWebView r1 = r1.f115846d
            r1.zoomOut()
            goto L_0x0019
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dg2.C45338f.run():void");
    }
}
