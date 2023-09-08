package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29328h;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1039tb.C90388a;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask */
class JsApiGetStorageTask extends MainProcessTask {
    public static final Parcelable.Creator<JsApiGetStorageTask> CREATOR = new C82999a();

    /* renamed from: f */
    public String f242667f;

    /* renamed from: g */
    public int f242668g;

    /* renamed from: h */
    public Runnable f242669h;

    /* renamed from: i */
    public boolean f242670i;

    /* renamed from: j */
    public int f242671j;

    /* renamed from: n */
    public int f242672n;

    /* renamed from: o */
    public int f242673o;

    /* renamed from: p */
    public String f242674p;

    /* renamed from: q */
    public String f242675q;

    /* renamed from: r */
    public String f242676r;

    /* renamed from: s */
    public String f242677s;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask$a */
    public class C82999a implements Parcelable.Creator<JsApiGetStorageTask> {
        public Object createFromParcel(Parcel parcel) {
            JsApiGetStorageTask jsApiGetStorageTask = new JsApiGetStorageTask();
            jsApiGetStorageTask.mo1551g(parcel);
            return jsApiGetStorageTask;
        }

        public Object[] newArray(int i) {
            return new JsApiGetStorageTask[i];
        }
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f242667f = parcel.readString();
        this.f242668g = parcel.readInt();
        this.f242670i = parcel.readByte() != 0;
        this.f242671j = parcel.readInt();
        this.f242672n = parcel.readInt();
        this.f242673o = parcel.readInt();
        this.f242674p = parcel.readString();
        this.f242675q = parcel.readString();
        this.f242676r = parcel.readString();
        this.f242677s = parcel.readString();
    }

    /* renamed from: i */
    public void mo1552i() {
        if (this.f242670i) {
            try {
                mo115254q(C83011c0.m101818c(this.f242677s));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.JsApiGetStorageTask", e.getMessage());
            } catch (Throwable th) {
                C83011c0.m101817b(this.f242677s);
                throw th;
            }
            C83011c0.m101817b(this.f242677s);
        }
        Runnable runnable = this.f242669h;
        if (runnable != null) {
            ((C83020m) runnable).run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        Class cls = C90388a.class;
        if (((C90388a) C89909e.m112436a(cls)) == null) {
            mo114394b();
            return;
        }
        C29328h Np0 = ((C90388a) C89909e.m112436a(cls)).Np0();
        if (Np0 == null) {
            mo114394b();
            return;
        }
        Object[] xf = Np0.mo56596xf(this.f242668g, this.f242667f, this.f242674p);
        if (((C81414g0.C29326a) xf[0]) == C81414g0.C29326a.NONE) {
            String str = (String) xf[1];
            String str2 = (String) xf[2];
            if (C83011c0.m101816a(str, str2) > 102400) {
                this.f242672n = C83011c0.m101816a(str);
                this.f242673o = C83011c0.m101816a(str2);
                try {
                    C83011c0.m101820e(this.f242677s, str, str2);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.JsApiGetStorageTask", e.getMessage());
                }
                this.f242670i = true;
            } else {
                this.f242670i = false;
                this.f242675q = str;
                this.f242676r = str2;
            }
        }
        mo114394b();
    }

    /* renamed from: q */
    public final void mo115254q(String str) {
        int length = str.length();
        int i = this.f242672n;
        if (length == this.f242673o + i) {
            this.f242675q = str.substring(0, i);
            int i2 = this.f242672n;
            this.f242676r = str.substring(i2, this.f242673o + i2);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242667f);
        parcel.writeInt(this.f242668g);
        parcel.writeByte(this.f242670i ? (byte) 1 : 0);
        parcel.writeInt(this.f242671j);
        parcel.writeInt(this.f242672n);
        parcel.writeInt(this.f242673o);
        parcel.writeString(this.f242674p);
        parcel.writeString(this.f242675q);
        parcel.writeString(this.f242676r);
        parcel.writeString(this.f242677s);
    }
}
