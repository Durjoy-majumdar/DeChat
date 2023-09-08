package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import kw0.C46746a;
import nj3.C88989a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/BizHalfScreenChattingUI;", "Lcom/tencent/mm/ui/chatting/ChattingUI;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.ui.chatting.BizHalfScreenChattingUI */
public final class BizHalfScreenChattingUI extends ChattingUI {

    /* renamed from: x */
    public static final /* synthetic */ int f215238x = 0;

    /* renamed from: s */
    public int f215239s;

    /* renamed from: t */
    public C73721i3 f215240t;

    /* renamed from: u */
    public boolean f215241u;

    /* renamed from: v */
    public boolean f215242v;

    /* renamed from: w */
    public boolean f215243w;

    /* renamed from: Q7 */
    public final boolean mo102042Q7(Context context, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        int i = -scaledWindowTouchSlop;
        return x < i || y < i || x > decorView.getWidth() + scaledWindowTouchSlop || y > decorView.getHeight() + scaledWindowTouchSlop;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[Catch:{ Exception -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[Catch:{ Exception -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102043R7() {
        /*
            r8 = this;
            java.lang.Class<ym.q> r0 = p763ym.C79140q.class
            java.lang.String r1 = "MicroMsg.BizDialogChattingUI"
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0067 }
            r4 = 30
            if (r3 < r4) goto L_0x0022
            android.view.WindowManager r3 = r8.getWindowManager()     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0033
            android.view.WindowMetrics r3 = r3.getCurrentWindowMetrics()     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0033
            android.graphics.Rect r3 = r3.getBounds()     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0033
            int r3 = r3.height()     // Catch:{ Exception -> 0x0067 }
            goto L_0x0034
        L_0x0022:
            android.view.WindowManager r3 = r8.getWindowManager()     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0033
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0033
            int r3 = r3.getHeight()     // Catch:{ Exception -> 0x0067 }
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r3 > 0) goto L_0x003d
            android.graphics.Point r4 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r8)     // Catch:{ Exception -> 0x0067 }
            int r4 = r4.y     // Catch:{ Exception -> 0x0067 }
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            di3.d r5 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0067 }
            ym.q r5 = (p763ym.C79140q) r5     // Catch:{ Exception -> 0x0067 }
            int r5 = r5.mo108877K2()     // Catch:{ Exception -> 0x0067 }
            int r5 = r4 - r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0067 }
            r6.<init>()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r7 = "getCurrentWindowHeight tmpWindowHeight:"
            r6.append(r7)     // Catch:{ Exception -> 0x0067 }
            r6.append(r3)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = "  finalWindowHeight:"
            r6.append(r3)     // Catch:{ Exception -> 0x0067 }
            r6.append(r4)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x0067 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0081
        L_0x0067:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "getCurrentWindowHeight"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r4, r2)
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r8)
            int r2 = r2.y
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.q r0 = (p763ym.C79140q) r0
            int r0 = r0.mo108877K2()
            int r5 = r2 - r0
        L_0x0081:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getCurrentWindowHeight height:"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r8.f215239s = r5
            android.view.Window r0 = r8.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r1 = -1
            r0.width = r1
            r0.height = r1
            r2 = 80
            r0.gravity = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.dimAmount = r2
            android.view.Window r2 = r8.getWindow()
            r2.setAttributes(r0)
            android.view.Window r0 = r8.getWindow()
            int r2 = r8.f215239s
            r0.setLayout(r1, r2)
            android.view.Window r0 = r8.getWindow()
            r1 = 2
            r0.addFlags(r1)
            com.tencent.mm.ui.chatting.i3 r0 = r8.f215240t
            if (r0 == 0) goto L_0x00d4
            int r1 = r8.f215239s
            r0.f216468j = r1
            float r1 = (float) r1
            r2 = 1050253722(0x3e99999a, float:0.3)
            float r1 = r1 * r2
            r0.f216467i = r1
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.BizHalfScreenChattingUI.mo102043R7():void");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        if (!this.f215243w) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f215242v = mo102042Q7(this, motionEvent);
            } else if (action == 1) {
                boolean Q7 = mo102042Q7(this, motionEvent);
                if (this.f215242v && Q7) {
                    this.f215243w = true;
                    Log.m105918d("MicroMsg.BizDialogChattingUI", "hadClickSpaceFinish");
                    this.f215277j.f215220f.f193280d.mo102429Q5();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2469dt);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log.m105924i("MicroMsg.BizDialogChattingUI", "onConfigurationChanged  isInMultiWindowMode:" + isInMultiWindowMode());
    }

    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2469dt);
        super.onCreate(bundle);
        mo102043R7();
        C46746a aVar = C46746a.f125826a;
        aVar.mo71977j(getWindow().getDecorView(), (float) C76577a.m92151b(MMApplicationContext.getContext(), 12), true, false);
        getWindow().getDecorView().setBackgroundColor(0);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        setFinishOnTouchOutside(true);
        int i = this.f215239s;
        C73721i3 i3Var = new C73721i3(this, new C73737l0(this));
        this.f215240t = i3Var;
        i3Var.mo102796a(i);
        aVar.mo71977j(this.f215240t, (float) C76577a.m92151b(MMApplicationContext.getContext(), 12), true, false);
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        Log.m105924i("MicroMsg.BizDialogChattingUI", "onMultiWindowModeChanged  isInMultiWindowMode:" + z + "  newConfig:" + configuration);
        mo102043R7();
    }

    public void setRequestedOrientation(int i) {
        super.setRequestedOrientation(1);
    }

    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        Log.m105924i("MicroMsg.BizDialogChattingUI", "onMultiWindowModeChanged  isInMultiWindowMode:" + z);
        mo102043R7();
    }
}
