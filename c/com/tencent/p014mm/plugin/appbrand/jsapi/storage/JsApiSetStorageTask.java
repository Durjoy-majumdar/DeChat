package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29328h;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83003a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1039tb.C90388a;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask */
class JsApiSetStorageTask extends MainProcessTask {
    public static final Parcelable.Creator<JsApiSetStorageTask> CREATOR = new C83001a();

    /* renamed from: f */
    public String f242681f;

    /* renamed from: g */
    public int f242682g;

    /* renamed from: h */
    public Runnable f242683h;

    /* renamed from: i */
    public boolean f242684i;

    /* renamed from: j */
    public int f242685j;

    /* renamed from: n */
    public int f242686n;

    /* renamed from: o */
    public int f242687o;

    /* renamed from: p */
    public String f242688p;

    /* renamed from: q */
    public String f242689q;

    /* renamed from: r */
    public String f242690r;

    /* renamed from: s */
    public String f242691s = (Process.myPid() + String.valueOf(super.hashCode()));

    /* renamed from: t */
    public String f242692t;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask$a */
    public class C83001a implements Parcelable.Creator<JsApiSetStorageTask> {
        public Object createFromParcel(Parcel parcel) {
            JsApiSetStorageTask jsApiSetStorageTask = new JsApiSetStorageTask();
            jsApiSetStorageTask.mo1551g(parcel);
            return jsApiSetStorageTask;
        }

        public Object[] newArray(int i) {
            return new JsApiSetStorageTask[i];
        }
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f242681f = parcel.readString();
        this.f242682g = parcel.readInt();
        this.f242684i = parcel.readByte() != 0;
        this.f242685j = parcel.readInt();
        this.f242686n = parcel.readInt();
        this.f242687o = parcel.readInt();
        this.f242688p = parcel.readString();
        this.f242689q = parcel.readString();
        this.f242690r = parcel.readString();
        this.f242692t = parcel.readString();
        this.f242691s = parcel.readString();
    }

    /* renamed from: i */
    public void mo1552i() {
        Runnable runnable = this.f242683h;
        if (runnable != null) {
            ((C83003a0.C83006c) runnable).run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        C81414g0.C29326a j0;
        Class cls = C90388a.class;
        if (this.f242684i) {
            try {
                mo115259q(C83011c0.m101818c(this.f242691s));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.JsApiSetStorageTask", e.getMessage());
            } catch (Throwable th) {
                C83011c0.m101817b(this.f242691s);
                throw th;
            }
            C83011c0.m101817b(this.f242691s);
        }
        C29328h Np0 = C89909e.m112436a(cls) == null ? null : ((C90388a) C89909e.m112436a(cls)).Np0();
        if (Np0 == null) {
            this.f242692t = "fail:internal error get DB fail";
            this.f242688p = null;
            this.f242689q = null;
            this.f242690r = null;
            mo114394b();
            return;
        }
        synchronized (C29328h.class) {
            j0 = Np0.mo56595j0(this.f242682g, this.f242681f, this.f242688p, this.f242689q, this.f242690r);
        }
        this.f242692t = C83011c0.m101819d(j0);
        this.f242688p = null;
        this.f242689q = null;
        this.f242690r = null;
        mo114394b();
    }

    /* renamed from: q */
    public final void mo115259q(String str) {
        int length = str.length();
        int i = this.f242685j;
        if (length == this.f242686n + i + this.f242687o) {
            this.f242688p = str.substring(0, i);
            int i2 = this.f242685j;
            this.f242689q = str.substring(i2, this.f242686n + i2);
            int i3 = this.f242685j;
            int i4 = this.f242686n;
            this.f242690r = str.substring(i3 + i4, i3 + i4 + this.f242687o);
        }
    }

    /* renamed from: t */
    public void mo115260t(String str, String str2, String str3) {
        if (C83011c0.m101816a(str, str2, str3) > 102400) {
            this.f242685j = C83011c0.m101816a(str);
            this.f242686n = C83011c0.m101816a(str2);
            this.f242687o = C83011c0.m101816a(str3);
            try {
                C83011c0.m101820e(this.f242691s, str, str2, str3);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.JsApiSetStorageTask", e.getMessage());
            }
            this.f242684i = true;
            return;
        }
        this.f242684i = false;
        this.f242688p = str;
        this.f242689q = str2;
        this.f242690r = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242681f);
        parcel.writeInt(this.f242682g);
        parcel.writeByte(this.f242684i ? (byte) 1 : 0);
        parcel.writeInt(this.f242685j);
        parcel.writeInt(this.f242686n);
        parcel.writeInt(this.f242687o);
        parcel.writeString(this.f242688p);
        parcel.writeString(this.f242689q);
        parcel.writeString(this.f242690r);
        parcel.writeString(this.f242692t);
        parcel.writeString(this.f242691s);
    }
}
