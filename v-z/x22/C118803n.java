package x22;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PlaySound;

/* renamed from: x22.n */
public class C118803n implements View.OnTouchListener {

    /* renamed from: d */
    public boolean f355451d;

    /* renamed from: e */
    public final /* synthetic */ C118796l f355452e;

    /* renamed from: x22.n$a */
    public class C118804a implements PlaySound.OnPlayCompletionListener {
        public C118804a(C118803n nVar) {
        }

        public void onCompletion() {
            Log.m105924i("MicroMsg.TalkMgr", "play press sound end");
        }
    }

    public C118803n(C118796l lVar) {
        this.f355452e = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (r10 != 3) goto L_0x0176;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r10)
            r0.add(r11)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/location/ui/TalkMgr$7"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r9
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            int r10 = r11.getAction()
            r11 = 0
            java.lang.String r0 = "MicroMsg.TalkMgr"
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L_0x00d0
            if (r10 == r1) goto L_0x004b
            r1 = 2
            if (r10 == r1) goto L_0x0033
            r1 = 3
            if (r10 == r1) goto L_0x004b
            goto L_0x0176
        L_0x0033:
            boolean r10 = r9.f355451d
            if (r10 != 0) goto L_0x0045
            r3 = 0
            java.lang.String r5 = "com/tencent/mm/plugin/location/ui/TalkMgr$7"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r9
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r2
        L_0x0045:
            x22.l r10 = r9.f355452e
            boolean r10 = r10.f355434o
            goto L_0x0176
        L_0x004b:
            boolean r10 = r9.f355451d
            if (r10 != 0) goto L_0x005d
            r3 = 0
            java.lang.String r5 = "com/tencent/mm/plugin/location/ui/TalkMgr$7"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r9
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r2
        L_0x005d:
            x22.l r10 = r9.f355452e
            android.widget.Button r10 = r10.f355427e
            r10.setPressed(r2)
            x22.l r10 = r9.f355452e
            android.widget.RelativeLayout r10 = r10.f355429g
            r1 = 8
            r10.setVisibility(r1)
            x22.l r10 = r9.f355452e
            com.tencent.mm.plugin.location.ui.VolumeMeter r10 = r10.f355428f
            r10.f346421y = r11
            r10.f346411o = r11
            r10.f346412p = r11
            r10.f346413q = r11
            r10.postInvalidate()
            x22.l r10 = r9.f355452e
            com.tencent.mm.plugin.location.ui.VolumeMeter r11 = r10.f355428f
            r11.f346403d = r2
            boolean r11 = r10.f355434o
            if (r11 != 0) goto L_0x0088
            goto L_0x0176
        L_0x0088:
            r10.f355434o = r2
            int r10 = r10.f355435p
            r11 = 5
            if (r10 != r11) goto L_0x00a2
            java.lang.String r10 = "cancel during seize-success prepare time"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            x22.l r10 = r9.f355452e
            com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r10.f355438s
            r10.stopTimer()
            x22.l r10 = r9.f355452e
            com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r10.f355439t
            r10.stopTimer()
        L_0x00a2:
            x22.l r10 = r9.f355452e
            r10.f355435p = r2
            com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r10.f355443x
            r10.stopTimer()
            x22.l r10 = r9.f355452e
            dd0.c r10 = r10.f355441v
            sx2.m r10 = (sx2.C118325m) r10
            r10.mo183122o()
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r11 = 2131837699(0x7f114303, float:1.93086E38)
            com.tencent.p014mm.sdk.platformtools.PlaySound.play(r10, r11)
            x22.l r10 = r9.f355452e
            r10.mo183506a()
            x22.l r10 = r9.f355452e
            x22.l$f r10 = r10.f355442w
            if (r10 == 0) goto L_0x0176
            x22.j r10 = (x22.C112033j) r10
            r10.mo163752b()
            goto L_0x0176
        L_0x00d0:
            java.lang.Class<aw.d> r10 = p447aw.C103918d.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            r3 = r10
            aw.d r3 = (p447aw.C103918d) r3
            x22.l r10 = r9.f355452e
            android.app.Activity r4 = r10.f355426d
            r6 = 80
            java.lang.String r5 = "android.permission.RECORD_AUDIO"
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            boolean r10 = r3.mo125788z1(r4, r5, r6, r7, r8)
            r9.f355451d = r10
            if (r10 != 0) goto L_0x00fb
            r3 = 0
            java.lang.String r5 = "com/tencent/mm/plugin/location/ui/TalkMgr$7"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r9
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r2
        L_0x00fb:
            x22.l r10 = r9.f355452e
            r10.getClass()
            r10.f355434o = r1
            x22.l r10 = r9.f355452e
            android.widget.RelativeLayout r10 = r10.f355429g
            r10.setVisibility(r2)
            x22.l r10 = r9.f355452e
            com.tencent.mm.plugin.location.ui.VolumeMeter r10 = r10.f355428f
            r10.f346421y = r11
            r10.f346411o = r11
            r10.f346412p = r11
            r10.f346413q = r11
            r10.postInvalidate()
            x22.l r10 = r9.f355452e
            com.tencent.mm.plugin.location.ui.VolumeMeter r10 = r10.f355428f
            boolean r11 = r10.f346404e
            if (r11 == 0) goto L_0x0121
            goto L_0x013a
        L_0x0121:
            r10.f346403d = r1
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f346410n
            if (r11 != 0) goto L_0x0137
            com.tencent.mm.sdk.platformtools.MMHandler r11 = new com.tencent.mm.sdk.platformtools.MMHandler
            r11.<init>()
            x22.t r3 = new x22.t
            r3.<init>(r10)
            r4 = 100
            r11.postDelayed(r3, r4)
            goto L_0x013a
        L_0x0137:
            r11.post(r10)
        L_0x013a:
            x22.l r10 = r9.f355452e
            android.widget.Button r10 = r10.f355427e
            r10.setPressed(r1)
            x22.l r10 = r9.f355452e
            boolean r10 = r10.f355434o
            if (r10 != 0) goto L_0x0148
            goto L_0x0176
        L_0x0148:
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r11 = 2131837696(0x7f114300, float:1.9308594E38)
            x22.n$a r3 = new x22.n$a
            r3.<init>(r9)
            com.tencent.p014mm.sdk.platformtools.PlaySound.play((android.content.Context) r10, (int) r11, (com.tencent.p014mm.sdk.platformtools.PlaySound.OnPlayCompletionListener) r3)
            x22.l r10 = r9.f355452e
            r10.f355435p = r1
            java.lang.String r10 = "micBtn pressed down"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            x22.l r10 = r9.f355452e
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r10.f355437r = r0
            x22.l r10 = r9.f355452e
            dd0.c r10 = r10.f355441v
            sx2.m r10 = (sx2.C118325m) r10
            r10.mo183127t()
            x22.l r10 = r9.f355452e
            r10.mo183506a()
        L_0x0176:
            r3 = 0
            java.lang.String r5 = "com/tencent/mm/plugin/location/ui/TalkMgr$7"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r9
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x22.C118803n.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
