package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.j0 */
public class C69850j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f201538d;

    public C69850j0(SightCaptureUI sightCaptureUI) {
        this.f201538d = sightCaptureUI;
    }

    public void run() {
        View view = this.f201538d.f313878s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f201538d.f313876q.setBackgroundResource(C0966R.C0969drawable.f357282ah1);
        this.f201538d.f313876q.setImageResource(C0966R.raw.mmsight_camera_preview_icon_done);
        this.f201538d.f313876q.setEnabled(true);
    }
}
