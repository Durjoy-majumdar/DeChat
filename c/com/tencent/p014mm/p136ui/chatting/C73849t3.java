package com.tencent.p014mm.p136ui.chatting;

import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import kg3.C76577a;
import kw0.C46746a;
import yb2.C15946a;

/* renamed from: com.tencent.mm.ui.chatting.t3 */
public class C73849t3 extends C15946a {

    /* renamed from: d */
    public int f216723d;

    /* renamed from: e */
    public C73721i3 f216724e;

    /* renamed from: f */
    public ChattingUIFragment f216725f;

    /* renamed from: g */
    public boolean f216726g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73849t3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[Catch:{ Exception -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ Exception -> 0x0073 }] */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo82031g3() {
        /*
            r8 = this;
            java.lang.Class<ym.q> r0 = p763ym.C79140q.class
            java.lang.String r1 = "HalfScreenChattingUIC"
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0073 }
            r4 = 30
            if (r3 < r4) goto L_0x0026
            androidx.appcompat.app.AppCompatActivity r3 = r8.getActivity()     // Catch:{ Exception -> 0x0073 }
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch:{ Exception -> 0x0073 }
            if (r3 == 0) goto L_0x003b
            android.view.WindowMetrics r3 = r3.getCurrentWindowMetrics()     // Catch:{ Exception -> 0x0073 }
            if (r3 == 0) goto L_0x003b
            android.graphics.Rect r3 = r3.getBounds()     // Catch:{ Exception -> 0x0073 }
            if (r3 == 0) goto L_0x003b
            int r3 = r3.height()     // Catch:{ Exception -> 0x0073 }
            goto L_0x003c
        L_0x0026:
            androidx.appcompat.app.AppCompatActivity r3 = r8.getActivity()     // Catch:{ Exception -> 0x0073 }
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch:{ Exception -> 0x0073 }
            if (r3 == 0) goto L_0x003b
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch:{ Exception -> 0x0073 }
            if (r3 == 0) goto L_0x003b
            int r3 = r3.getHeight()     // Catch:{ Exception -> 0x0073 }
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            if (r3 > 0) goto L_0x0049
            androidx.appcompat.app.AppCompatActivity r4 = r8.getActivity()     // Catch:{ Exception -> 0x0073 }
            android.graphics.Point r4 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r4)     // Catch:{ Exception -> 0x0073 }
            int r4 = r4.y     // Catch:{ Exception -> 0x0073 }
            goto L_0x004a
        L_0x0049:
            r4 = r3
        L_0x004a:
            di3.d r5 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0073 }
            ym.q r5 = (p763ym.C79140q) r5     // Catch:{ Exception -> 0x0073 }
            int r5 = r5.mo108877K2()     // Catch:{ Exception -> 0x0073 }
            int r5 = r4 - r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0073 }
            r6.<init>()     // Catch:{ Exception -> 0x0073 }
            java.lang.String r7 = "getCurrentWindowHeight tmpWindowHeight:"
            r6.append(r7)     // Catch:{ Exception -> 0x0073 }
            r6.append(r3)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r3 = "  finalWindowHeight:"
            r6.append(r3)     // Catch:{ Exception -> 0x0073 }
            r6.append(r4)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x0073 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ Exception -> 0x0073 }
            goto L_0x0091
        L_0x0073:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "getCurrentWindowHeight"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r4, r2)
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.y
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.q r0 = (p763ym.C79140q) r0
            int r0 = r0.mo108877K2()
            int r5 = r2 - r0
        L_0x0091:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getCurrentWindowHeight height:"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73849t3.mo82031g3():int");
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        this.f216723d = mo82031g3();
        WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        attributes.dimAmount = 0.5f;
        getActivity().getWindow().setAttributes(attributes);
        getActivity().getWindow().setLayout(-1, this.f216723d);
        getActivity().getWindow().addFlags(2);
        C73721i3 i3Var = this.f216724e;
        if (i3Var != null) {
            int i = this.f216723d;
            i3Var.f216468j = i;
            i3Var.f216467i = ((float) i) * 0.3f;
        }
        C46746a aVar = C46746a.f125826a;
        aVar.mo71977j(getActivity().getWindow().getDecorView(), (float) C76577a.m92151b(MMApplicationContext.getContext(), 12), true, false);
        getActivity().getWindow().getDecorView().setBackgroundColor(0);
        getActivity().getWindow().getDecorView().setPadding(0, 0, 0, 0);
        getActivity().setFinishOnTouchOutside(true);
        int i2 = this.f216723d;
        C73721i3 i3Var2 = new C73721i3(getActivity(), new C73846s3(this));
        this.f216724e = i3Var2;
        i3Var2.mo102796a(i2);
        aVar.mo71977j(this.f216724e, (float) C76577a.m92151b(MMApplicationContext.getContext(), 12), true, false);
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        getActivity().overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2469dt);
        getIntent().putExtra("finish_direct", true);
        getIntent().putExtra("KIsHalfScreen", true);
    }

    public void onFinished() {
        super.onFinished();
        getActivity().overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2469dt);
        getIntent().putExtra(MMFragmentActivity.EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM, true);
    }
}
