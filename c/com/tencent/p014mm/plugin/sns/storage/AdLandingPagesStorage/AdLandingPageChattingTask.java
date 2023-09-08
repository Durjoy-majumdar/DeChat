package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import kr0.C76629w0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask */
public class AdLandingPageChattingTask extends MainProcessTask {
    public static final Parcelable.Creator<AdLandingPageChattingTask> CREATOR = new C85463b();

    /* renamed from: f */
    public String f249076f;

    /* renamed from: g */
    public String f249077g;

    /* renamed from: h */
    public String f249078h;

    /* renamed from: i */
    public Runnable f249079i;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$a */
    public class C85462a implements C76629w0.C61144a {
        public C85462a() {
        }

        /* renamed from: a */
        public void mo21208a(WxaAttributes wxaAttributes) {
            SnsMethodCalculate.markStartTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$1");
            if (wxaAttributes == null) {
                Log.m105928w("MicroMsg.AdLandingPageChattingTask", "info is null, err");
            }
            AdLandingPageChattingTask adLandingPageChattingTask = AdLandingPageChattingTask.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
            adLandingPageChattingTask.mo114394b();
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
            SnsMethodCalculate.markEndTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$b */
    public class C85463b implements Parcelable.Creator<AdLandingPageChattingTask> {
        public Object createFromParcel(Parcel parcel) {
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$2");
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$2");
            AdLandingPageChattingTask adLandingPageChattingTask = new AdLandingPageChattingTask(parcel);
            SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$2");
            SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$2");
            return adLandingPageChattingTask;
        }

        public Object[] newArray(int i) {
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$2");
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$2");
            AdLandingPageChattingTask[] adLandingPageChattingTaskArr = new AdLandingPageChattingTask[i];
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$2");
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$2");
            return adLandingPageChattingTaskArr;
        }
    }

    public AdLandingPageChattingTask() {
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        SnsMethodCalculate.markStartTimeMs("parseFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        this.f249076f = parcel.readString();
        this.f249077g = parcel.readString();
        this.f249078h = parcel.readString();
        SnsMethodCalculate.markEndTimeMs("parseFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    /* renamed from: i */
    public void mo1552i() {
        SnsMethodCalculate.markStartTimeMs("runInClientProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        Runnable runnable = this.f249079i;
        if (runnable != null) {
            runnable.run();
        }
        SnsMethodCalculate.markEndTimeMs("runInClientProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    /* renamed from: j */
    public void mo1553j() {
        Class cls = C75700k0.class;
        SnsMethodCalculate.markStartTimeMs("runInMainProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        if (!C86709a0.m107523b().f251765p) {
            mo114394b();
            SnsMethodCalculate.markEndTimeMs("runInMainProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
            return;
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(this.f249077g);
        Log.m105919d("MicroMsg.AdLandingPageChattingTask", "sessionFrom:%s,username:%s,nickname:%s", this.f249076f, this.f249077g, this.f249078h);
        if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
            C72996z1 z1Var2 = new C72996z1(this.f249077g);
            z1Var2.setType(0);
            z1Var2.mo62878U2(this.f249078h);
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(z1Var2);
            Log.m105925i("MicroMsg.AdLandingPageChattingTask", "%s save to contact_table", this.f249077g);
        }
        ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106878CE(this.f249077g, new C85462a());
        SnsMethodCalculate.markEndTimeMs("runInMainProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        parcel.writeString(this.f249076f);
        parcel.writeString(this.f249077g);
        parcel.writeString(this.f249078h);
        SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    public AdLandingPageChattingTask(Parcel parcel) {
        mo1551g(parcel);
    }
}
