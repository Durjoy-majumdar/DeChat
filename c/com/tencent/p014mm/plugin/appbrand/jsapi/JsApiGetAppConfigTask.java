package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import f40.C86709a0;
import ii0.C87732a;
import ki0.C33909b;
import wi0.C90992p;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask */
class JsApiGetAppConfigTask extends MainProcessTask {
    public static final Parcelable.Creator<JsApiGetAppConfigTask> CREATOR = new C81986b();

    /* renamed from: f */
    public String f240412f;

    /* renamed from: g */
    public String f240413g;

    /* renamed from: h */
    public String f240414h;

    /* renamed from: i */
    public int f240415i;

    /* renamed from: j */
    public int f240416j;

    /* renamed from: n */
    public Runnable f240417n;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask$a */
    public class C81985a implements C90992p.C90998f {
        public C81985a() {
        }

        /* renamed from: a */
        public void mo56512a(String str) {
            JsApiGetAppConfigTask jsApiGetAppConfigTask = JsApiGetAppConfigTask.this;
            jsApiGetAppConfigTask.f240414h = str;
            jsApiGetAppConfigTask.mo114394b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask$b */
    public class C81986b implements Parcelable.Creator<JsApiGetAppConfigTask> {
        public Object createFromParcel(Parcel parcel) {
            return new JsApiGetAppConfigTask(parcel);
        }

        public Object[] newArray(int i) {
            return new JsApiGetAppConfigTask[i];
        }
    }

    public JsApiGetAppConfigTask() {
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f240412f = parcel.readString();
        this.f240413g = parcel.readString();
        this.f240414h = parcel.readString();
        this.f240415i = parcel.readInt();
        this.f240416j = parcel.readInt();
    }

    /* renamed from: i */
    public void mo1552i() {
        Runnable runnable = this.f240417n;
        if (runnable != null) {
            ((C83057w2) runnable).run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        if (C86709a0.m107523b().f251765p) {
            Pair<Boolean, Integer> jo = ((C33909b) C81161g2.Bx0(C33909b.class)).mo59361jo("appId", this.f240412f, 4, this.f240416j);
            if (((Boolean) jo.first).booleanValue()) {
                C87732a.INSTANCE.mo122144a(((Integer) jo.second).intValue(), 166);
            }
            C90992p.m114159a(this.f240412f, this.f240415i, 0, new C81985a(), !((Boolean) jo.first).booleanValue());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f240412f);
        parcel.writeString(this.f240413g);
        parcel.writeString(this.f240414h);
        parcel.writeInt(this.f240415i);
        parcel.writeInt(this.f240416j);
    }

    public JsApiGetAppConfigTask(Parcel parcel) {
        mo1551g(parcel);
    }
}
