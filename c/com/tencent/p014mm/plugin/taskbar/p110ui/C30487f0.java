package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.plugin.appbrand.appusage.C29377k1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import java.lang.ref.WeakReference;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.f0 */
public final class C30487f0 implements C29377k1 {

    /* renamed from: d */
    public static WeakReference<TaskBarViewPresenter> f82160d;

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.f0$a */
    public static final class C30488a implements Runnable {

        /* renamed from: d */
        public static final C30488a f82161d = new C30488a();

        public final void run() {
            TaskBarViewPresenter taskBarViewPresenter;
            Log.m105924i("MicroMsg.TaskBarViewPresenter", "received weAppOnStorageChangeListener");
            WeakReference<TaskBarViewPresenter> weakReference = C30487f0.f82160d;
            if (weakReference != null && (taskBarViewPresenter = weakReference.get()) != null) {
                taskBarViewPresenter.mo98235e(true, false);
            }
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        ((C119157j) C119157j.f356862d).mo183884o(C30488a.f82161d);
    }
}
