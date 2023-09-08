package y03;

import android.view.View;
import com.tencent.p014mm.plugin.topstory.p113ui.video.p114fs.TopStoryFSVideoUI;

/* renamed from: y03.q */
public class C15922q implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ TopStoryFSVideoUI f42791d;

    public C15922q(TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f42791d = topStoryFSVideoUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0069, code lost:
        if (r0 <= ((float) r7)) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r18, android.view.MotionEvent r19) {
        /*
            r17 = this;
            r6 = r17
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r18
            r0.add(r1)
            r7 = r19
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$6"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r17
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI r0 = r6.f42791d
            android.view.View r0 = r0.f54674u
            int r0 = r0.getVisibility()
            r8 = 0
            if (r0 != 0) goto L_0x00cc
            float r0 = r19.getX()
            float r1 = r19.getY()
            com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI r2 = r6.f42791d
            android.view.View r3 = r2.f54676w
            r2.getClass()
            r2 = 1
            if (r3 != 0) goto L_0x0043
            goto L_0x006c
        L_0x0043:
            r4 = 2
            int[] r4 = new int[r4]
            r3.getLocationOnScreen(r4)
            r5 = r4[r8]
            r4 = r4[r2]
            int r7 = r3.getMeasuredWidth()
            int r7 = r7 + r5
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r4
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x006c
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x006c
            float r1 = (float) r5
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x006c
            float r1 = (float) r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            if (r2 == 0) goto L_0x0086
            java.lang.String r0 = "MicroMsg.TopStory.TopStoryFSVideoUI"
            java.lang.String r1 = "touch in mContentViewNotFull"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$6"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r17
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x0086:
            com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI r0 = r6.f42791d
            android.view.View r0 = r0.f54674u
            r1 = 8
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r1)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$6"
            java.lang.String r12 = "onTouch"
            java.lang.String r13 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r2.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$6"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x00cc:
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$6"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r17
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y03.C15922q.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
