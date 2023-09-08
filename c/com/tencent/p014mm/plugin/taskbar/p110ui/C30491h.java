package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.plugin.appbrand.appusage.C29373j1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import java.lang.ref.WeakReference;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.h */
public final class C30491h implements C29373j1 {

    /* renamed from: d */
    public static WeakReference<TaskBarViewPresenter> f82166d;

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.h$a */
    public static final class C30492a implements Runnable {

        /* renamed from: d */
        public static final C30492a f82167d = new C30492a();

        public final void run() {
            TaskBarViewPresenter taskBarViewPresenter;
            Log.m105924i("MicroMsg.TaskBarViewPresenter", "received myWeAppOnStorageChangeListener");
            WeakReference<TaskBarViewPresenter> weakReference = C30491h.f82166d;
            if (weakReference != null && (taskBarViewPresenter = weakReference.get()) != null) {
                taskBarViewPresenter.mo98235e(true, true);
            }
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        ((C119157j) C119157j.f356862d).mo183884o(C30492a.f82167d);
    }
}
