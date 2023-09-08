package ty1;

import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ty1.b */
public final class C52392b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C52393c f146447d;

    /* renamed from: e */
    public final /* synthetic */ int f146448e;

    /* renamed from: f */
    public final /* synthetic */ int f146449f;

    /* renamed from: g */
    public final /* synthetic */ boolean f146450g;

    /* renamed from: h */
    public final /* synthetic */ boolean f146451h;

    public C52392b(C52393c cVar, int i, int i2, boolean z, boolean z2) {
        this.f146447d = cVar;
        this.f146448e = i;
        this.f146449f = i2;
        this.f146450g = z;
        this.f146451h = z2;
    }

    public final void run() {
        C52393c cVar = this.f146447d;
        int i = this.f146448e;
        int i2 = this.f146449f;
        boolean z = this.f146450g;
        boolean z2 = this.f146451h;
        int i3 = C52393c.f146452a1;
        cVar.getClass();
        Log.m105925i("GameWebSettingActionBar", "get chat unread count: %d,  notifyUnreadCount:%d, hasChatRoomUnreadMsg:%b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        if (z2) {
            TextView textView = cVar.f146466y0;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = cVar.f146465x0;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            TextView textView2 = cVar.f146466y0;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            ImageView imageView2 = cVar.f146465x0;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        if (!cVar.f146461X0) {
            cVar.f146457U0 = z2;
            cVar.f146458V0 = i;
            cVar.f146461X0 = true;
            if (cVar.f146460W0 && !cVar.f146455S0) {
                cVar.f146455S0 = true;
                cVar.mo73394q(false, cVar.f146462Y0);
            }
        }
    }
}
