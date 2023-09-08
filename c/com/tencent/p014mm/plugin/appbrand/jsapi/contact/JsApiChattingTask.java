package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import kr0.C76629w0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask */
public class JsApiChattingTask extends MainProcessTask {
    public static final Parcelable.Creator<JsApiChattingTask> CREATOR = new C82320c();

    /* renamed from: f */
    public String f241243f;

    /* renamed from: g */
    public String f241244g;

    /* renamed from: h */
    public String f241245h;

    /* renamed from: i */
    public String f241246i;

    /* renamed from: j */
    public Runnable f241247j;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask$a */
    public class C82318a implements C76629w0.C61144a {
        public C82318a() {
        }

        /* renamed from: a */
        public void mo21208a(WxaAttributes wxaAttributes) {
            if (wxaAttributes == null) {
                Log.m105929w("MicroMsg.JsApiChattingTask", "privateUsername:%s info is null, err", JsApiChattingTask.this.f241244g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask$b */
    public class C82319b implements C76629w0.C61144a {
        public C82319b() {
        }

        /* renamed from: a */
        public void mo21208a(WxaAttributes wxaAttributes) {
            if (wxaAttributes == null) {
                Log.m105928w("MicroMsg.JsApiChattingTask", "info is null, err");
            }
            JsApiChattingTask.this.mo114394b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask$c */
    public class C82320c implements Parcelable.Creator<JsApiChattingTask> {
        public Object createFromParcel(Parcel parcel) {
            return new JsApiChattingTask(parcel);
        }

        public Object[] newArray(int i) {
            return new JsApiChattingTask[i];
        }
    }

    public JsApiChattingTask() {
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f241243f = parcel.readString();
        this.f241245h = parcel.readString();
        this.f241246i = parcel.readString();
        this.f241244g = parcel.readString();
    }

    /* renamed from: i */
    public void mo1552i() {
        Runnable runnable = this.f241247j;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        Class cls = C76629w0.class;
        Class cls2 = C75700k0.class;
        if (!C86709a0.m107523b().f251765p) {
            mo114394b();
            return;
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(this.f241245h);
        Log.m105919d("MicroMsg.JsApiChattingTask", "sessionFrom:%s,username:%s,nickname:%s", this.f241243f, this.f241245h, this.f241246i);
        if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
            C72996z1 z1Var2 = new C72996z1(this.f241245h);
            z1Var2.setType(0);
            z1Var2.mo62878U2(this.f241246i);
            ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().mo69667P3(z1Var2);
            Log.m105925i("MicroMsg.JsApiChattingTask", "%s save to contact_table", this.f241245h);
        }
        if (!Util.isNullOrNil(this.f241244g)) {
            ((C76629w0) C86312j.m106911c(cls)).mo106878CE(this.f241244g, new C82318a());
        }
        ((C76629w0) C86312j.m106911c(cls)).mo106878CE(this.f241245h, new C82319b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f241243f);
        parcel.writeString(this.f241245h);
        parcel.writeString(this.f241246i);
        parcel.writeString(this.f241244g);
    }

    public JsApiChattingTask(Parcel parcel) {
        mo1551g(parcel);
    }
}
