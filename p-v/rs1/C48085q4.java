package rs1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.webview.FinderWebViewScrollViewWrapper;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

@C113200q(initialMode = 2)
/* renamed from: rs1.q4 */
public final class C48085q4 extends UIComponent {

    /* renamed from: d */
    public FinderWebViewScrollViewWrapper f128939d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48085q4(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onBackPressed() {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.webview.FinderWebViewScrollViewWrapper r0 = r4.f128939d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            zs1.h r3 = r0.f111984b
            boolean r3 = r3.isAttachedToWindow()
            if (r3 != 0) goto L_0x0015
            boolean r0 = r0.f111987e
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            if (r0 != r2) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0032
            com.tencent.mm.plugin.finder.webview.FinderWebViewScrollViewWrapper r0 = r4.f128939d
            if (r0 == 0) goto L_0x002e
            zs1.h r1 = r0.f111984b
            boolean r1 = r1.isAttachedToWindow()
            if (r1 == 0) goto L_0x002e
            zs1.h r0 = r0.f111984b
            r0.mo74384a()
        L_0x002e:
            r0 = 0
            r4.f128939d = r0
            return r2
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C48085q4.onBackPressed():boolean");
    }

    public void onCreate(Bundle bundle) {
    }
}
