package com.tencent.p014mm.plugin.webview.luggage.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.game.luggage.page.C41969l;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask */
public class ActiveMainProcessTask extends MainProcessTask {
    public static final Parcelable.Creator<ActiveMainProcessTask> CREATOR = new C43597a();

    /* renamed from: f */
    public Runnable f117841f;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask$a */
    public class C43597a implements Parcelable.Creator<ActiveMainProcessTask> {
        public Object createFromParcel(Parcel parcel) {
            return new ActiveMainProcessTask(parcel, (C43597a) null);
        }

        public Object[] newArray(int i) {
            return new ActiveMainProcessTask[i];
        }
    }

    public ActiveMainProcessTask() {
    }

    /* renamed from: i */
    public void mo1552i() {
        Log.m105924i("MicroMsg.ActiveMainProcessTask", "runInClientProcess");
        Runnable runnable = this.f117841f;
        if (runnable != null) {
            ((C41969l) runnable).run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        Log.m105924i("MicroMsg.ActiveMainProcessTask", "active");
        mo114394b();
    }

    public ActiveMainProcessTask(Parcel parcel, C43597a aVar) {
    }
}
