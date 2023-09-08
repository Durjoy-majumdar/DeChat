package rf2;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.ProfileLiveNotifyTextLayout;
import kg3.C76577a;

/* renamed from: rf2.g */
public final class C63403g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProfileLiveNotifyTextLayout f179886d;

    /* renamed from: e */
    public final /* synthetic */ View f179887e;

    /* renamed from: f */
    public final /* synthetic */ View f179888f;

    public C63403g(ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout, View view, View view2) {
        this.f179886d = profileLiveNotifyTextLayout;
        this.f179887e = view;
        this.f179888f = view2;
    }

    public final void run() {
        Rect rect = new Rect();
        int b = C76577a.m92151b(this.f179886d.getContext(), 24);
        this.f179887e.getHitRect(rect);
        rect.left -= b;
        rect.top -= b;
        rect.right += b;
        rect.bottom += b;
        this.f179888f.setTouchDelegate(new TouchDelegate(rect, this.f179887e));
    }
}
