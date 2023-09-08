package ux2;

import android.view.View;
import com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PlaySound;

/* renamed from: ux2.f */
public class C118635f implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ TalkRoomUI f354984d;

    /* renamed from: ux2.f$a */
    public class C118636a implements PlaySound.OnPlayCompletionListener {
        public C118636a(C118635f fVar) {
        }

        public void onCompletion() {
            Log.m105924i("MicroMsg.TalkRoomUI", "play press sound end");
        }
    }

    /* renamed from: ux2.f$b */
    public class C118637b implements PlaySound.OnPlayCompletionListener {
        public C118637b(C118635f fVar) {
        }

        public void onCompletion() {
            Log.m105924i("MicroMsg.TalkRoomUI", "play up sound end");
        }
    }

    public C118635f(TalkRoomUI talkRoomUI) {
        this.f354984d = talkRoomUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI.m162871E7(r10, r11) != false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r10 != 3) goto L_0x00de;
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
            java.lang.String r1 = "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$5"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r9
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            int r10 = r11.getAction()
            java.lang.String r0 = "MicroMsg.TalkRoomUI"
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L_0x0098
            if (r10 == r1) goto L_0x0042
            r1 = 2
            if (r10 == r1) goto L_0x0032
            r11 = 3
            if (r10 == r11) goto L_0x0042
            goto L_0x00de
        L_0x0032:
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            boolean r1 = r10.f347416I
            if (r1 != 0) goto L_0x003a
            goto L_0x00de
        L_0x003a:
            boolean r10 = com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI.m162871E7(r10, r11)
            if (r10 == 0) goto L_0x0042
            goto L_0x00de
        L_0x0042:
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            boolean r11 = r10.f347416I
            if (r11 != 0) goto L_0x004a
            goto L_0x00de
        L_0x004a:
            r10.f347416I = r2
            int r10 = r10.f347436v
            r11 = 5
            if (r10 != r11) goto L_0x0064
            java.lang.String r10 = "cancel during seize-success prepare time"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r10.f347419L
            r10.stopTimer()
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r10.f347438x
            r10.stopTimer()
        L_0x0064:
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            android.widget.ImageButton r10 = r10.f347425h
            r11 = 2131235178(0x7f08116a, float:1.8086543E38)
            r10.setImageResource(r11)
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            r10.f347436v = r2
            r10.mo176188G7()
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r10.f347408A
            r10.stopTimer()
            sx2.m r10 = sx2.C118318d.yx0()
            r10.mo183122o()
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r11 = 2131837699(0x7f114303, float:1.93086E38)
            ux2.f$b r0 = new ux2.f$b
            r0.<init>(r9)
            com.tencent.p014mm.sdk.platformtools.PlaySound.play((android.content.Context) r10, (int) r11, (com.tencent.p014mm.sdk.platformtools.PlaySound.OnPlayCompletionListener) r0)
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            r10.mo176189H7()
            goto L_0x00de
        L_0x0098:
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            boolean r11 = com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI.m162871E7(r10, r11)
            r10.f347416I = r11
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            boolean r11 = r10.f347416I
            if (r11 != 0) goto L_0x00a7
            goto L_0x00de
        L_0x00a7:
            android.widget.ImageButton r10 = r10.f347425h
            r11 = 2131235179(0x7f08116b, float:1.8086545E38)
            r10.setImageResource(r11)
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r11 = 2131837696(0x7f114300, float:1.9308594E38)
            ux2.f$a r3 = new ux2.f$a
            r3.<init>(r9)
            com.tencent.p014mm.sdk.platformtools.PlaySound.play((android.content.Context) r10, (int) r11, (com.tencent.p014mm.sdk.platformtools.PlaySound.OnPlayCompletionListener) r3)
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            r10.f347436v = r1
            r10.mo176188G7()
            java.lang.String r10 = "micBtn pressed down"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r10.f347418K = r0
            sx2.m r10 = sx2.C118318d.yx0()
            r10.mo183127t()
            com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r10 = r9.f354984d
            r10.mo176189H7()
        L_0x00de:
            r3 = 0
            java.lang.String r5 = "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$5"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r9
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ux2.C118635f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
