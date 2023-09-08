package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiGetContactMessageCountTask */
class JsApiGetContactMessageCountTask extends MainProcessTask {
    public static final Parcelable.Creator<JsApiGetContactMessageCountTask> CREATOR = new C29509a();

    /* renamed from: f */
    public String f80386f;

    /* renamed from: g */
    public int f80387g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiGetContactMessageCountTask$a */
    public class C29509a implements Parcelable.Creator<JsApiGetContactMessageCountTask> {
        public Object createFromParcel(Parcel parcel) {
            return new JsApiGetContactMessageCountTask(parcel);
        }

        public Object[] newArray(int i) {
            return new JsApiGetContactMessageCountTask[i];
        }
    }

    public JsApiGetContactMessageCountTask() {
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f80386f = parcel.readString();
        this.f80387g = parcel.readInt();
    }

    /* renamed from: i */
    public void mo1552i() {
    }

    /* renamed from: j */
    public void mo1553j() {
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69771j(this.f80386f);
        if (j == null) {
            this.f80387g = -1;
            mo114394b();
            return;
        }
        this.f80387g = j.mo108786G2();
        mo114394b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f80386f);
        parcel.writeInt(this.f80387g);
    }

    public JsApiGetContactMessageCountTask(Parcel parcel) {
        mo1551g(parcel);
    }
}
