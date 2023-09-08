package com.tencent.p014mm.plugin.game.luggage.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.webview.model.C6039j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy1.C45851g;

/* renamed from: com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask */
public class AddShortcutTask extends MainProcessTask {
    public static final Parcelable.Creator<AddShortcutTask> CREATOR = new C41905b();

    /* renamed from: f */
    public String f112903f;

    /* renamed from: g */
    public String f112904g;

    /* renamed from: h */
    public boolean f112905h;

    /* renamed from: i */
    public Runnable f112906i;

    /* renamed from: com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask$a */
    public class C41904a implements C6039j.C6043d {
        public C41904a() {
        }

        /* renamed from: a */
        public void mo7002a(String str, boolean z) {
            AddShortcutTask addShortcutTask = AddShortcutTask.this;
            addShortcutTask.f112905h = z;
            addShortcutTask.mo114394b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask$b */
    public class C41905b implements Parcelable.Creator<AddShortcutTask> {
        public Object createFromParcel(Parcel parcel) {
            return new AddShortcutTask(parcel, (C41904a) null);
        }

        public Object[] newArray(int i) {
            return new AddShortcutTask[i];
        }
    }

    public AddShortcutTask() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f112903f = parcel.readString();
        this.f112904g = parcel.readString();
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        this.f112905h = z;
    }

    /* renamed from: i */
    public void mo1552i() {
        Runnable runnable = this.f112906i;
        if (runnable != null) {
            ((C45851g.C45852a) runnable).run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        if (Util.isNullOrNil(this.f112904g) || Util.isNullOrNil(this.f112903f)) {
            Log.m105920e("MicroMsg.AddShortcutTask", "appid or username is null");
            this.f112905h = false;
            return;
        }
        C6039j.m5919a(MMApplicationContext.getContext(), this.f112903f, this.f112904g, new C41904a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112903f);
        parcel.writeString(this.f112904g);
        parcel.writeByte(this.f112905h ? (byte) 1 : 0);
    }

    public AddShortcutTask(Parcel parcel, C41904a aVar) {
        mo1551g(parcel);
    }
}
