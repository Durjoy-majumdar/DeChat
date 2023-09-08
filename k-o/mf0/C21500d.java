package mf0;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.p014mm.picker.base.view.WheelView;
import nf0.C21623a;

/* renamed from: mf0.d */
public final class C21500d extends Handler {

    /* renamed from: a */
    public final WheelView f60870a;

    public C21500d(WheelView wheelView) {
        this.f60870a = wheelView;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.f60870a.invalidate();
        } else if (i == 2000) {
            this.f60870a.mo22033f(WheelView.C17836a.FLING);
        } else if (i == 3000) {
            WheelView wheelView = this.f60870a;
            String b = wheelView.mo22029b(wheelView.getCurrentItem());
            String obj = b == null ? "" : b.toString();
            if (!TextUtils.isEmpty(obj)) {
                wheelView.setContentDescription(obj);
            }
            if (wheelView.f49146i != null) {
                wheelView.postDelayed(new C21623a(wheelView), 200);
            }
        }
    }
}
