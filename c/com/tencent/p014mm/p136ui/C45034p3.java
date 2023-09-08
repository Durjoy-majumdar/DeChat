package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32226l;
import java.lang.ref.WeakReference;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.p3 */
public class C45034p3 implements C32226l<SubscribeMsgRequestResult, C13598b0> {

    /* renamed from: d */
    public final WeakReference<Activity> f122139d;

    /* renamed from: e */
    public final String f122140e;

    public C45034p3(Activity activity, String str) {
        this.f122139d = new WeakReference<>(activity);
        this.f122140e = str;
    }

    public Object invoke(Object obj) {
        Activity activity;
        SubscribeMsgRequestResult subscribeMsgRequestResult = (SubscribeMsgRequestResult) obj;
        if (subscribeMsgRequestResult != null) {
            MMHandlerThread.postToMainThread(new C74803o3(this, subscribeMsgRequestResult));
            return null;
        } else if (this.f122139d.get() == null || (activity = this.f122139d.get()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return null;
        } else {
            C76912y0.makeText((Context) activity, (CharSequence) activity.getString(C0966R.string.f360087a11), 1).show();
            return null;
        }
    }
}
