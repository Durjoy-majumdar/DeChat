package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.api.ParcelableMultiTaskData;
import com.tencent.p014mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import com.tencent.p014mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import java.util.ArrayList;
import java.util.List;
import p823sg.C77710q;
import wi0.C66117m;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC */
public class AppBrandInitConfigWC extends AppBrandInitConfigLU {
    public static final Parcelable.Creator<AppBrandInitConfigWC> CREATOR = new C81617a();

    /* renamed from: A1 */
    public String f239371A1;

    /* renamed from: B1 */
    public C66117m f239372B1;

    /* renamed from: d1 */
    public boolean f239373d1;

    /* renamed from: e1 */
    public long f239374e1;

    /* renamed from: f1 */
    public String f239375f1;

    /* renamed from: g1 */
    public String f239376g1;

    /* renamed from: h1 */
    public boolean f239377h1;

    /* renamed from: i1 */
    public WebRenderingCacheDirectoryDescriptor f239378i1;

    /* renamed from: j1 */
    public volatile QualitySession f239379j1;

    /* renamed from: k1 */
    public boolean f239380k1;

    /* renamed from: l1 */
    public boolean f239381l1;

    /* renamed from: m1 */
    public int f239382m1;

    /* renamed from: n1 */
    public String f239383n1;

    /* renamed from: o1 */
    public AppBrandLaunchFromNotifyReferrer f239384o1;

    /* renamed from: p1 */
    public String f239385p1;

    /* renamed from: q1 */
    public int f239386q1;

    /* renamed from: r1 */
    public int f239387r1;

    /* renamed from: s1 */
    public int f239388s1;

    /* renamed from: t1 */
    public boolean f239389t1;

    /* renamed from: u1 */
    public List<String> f239390u1;

    /* renamed from: v1 */
    public WeAppOpenDeclarePromptBundle f239391v1;

    /* renamed from: w1 */
    public WeAppOpenUICallbackIPCProxy f239392w1;

    /* renamed from: x1 */
    public boolean f239393x1;

    /* renamed from: y1 */
    public ParcelableMultiTaskData f239394y1;

    /* renamed from: z1 */
    public String f239395z1;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC$a */
    public class C81617a implements Parcelable.Creator<AppBrandInitConfigWC> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandInitConfigWC(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandInitConfigWC[i];
        }
    }

    public AppBrandInitConfigWC() {
        this.f239377h1 = false;
        this.f239389t1 = false;
        this.f239390u1 = new ArrayList();
        this.f239393x1 = false;
        this.f239394y1 = null;
        this.f239395z1 = "";
        this.f239371A1 = "";
        this.f239372B1 = C66117m.NORMAL;
    }

    /* renamed from: b */
    public Parcel mo113913b() {
        Parcel obtain = Parcel.obtain();
        obtain.setDataPosition(0);
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        return obtain;
    }

    /* renamed from: k */
    public boolean mo111300k() {
        return this.f234841u == 4;
    }

    /* renamed from: t */
    public AppBrandInitConfigWC mo111294e() {
        Parcel b = mo113913b();
        AppBrandInitConfigWC appBrandInitConfigWC = new AppBrandInitConfigWC(b);
        b.recycle();
        return appBrandInitConfigWC;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppBrandInitConfigWC {visitingSessionId='");
        sb.append(this.f234837q);
        sb.append('\'');
        sb.append(", wxaLaunchInstanceId=");
        sb.append(this.f234838r);
        sb.append(", clickTimestamp=");
        sb.append(this.f234800D);
        sb.append(", username='");
        sb.append(this.f234839s);
        sb.append('\'');
        sb.append(", appId='");
        sb.append(this.f239362d);
        sb.append('\'');
        sb.append(", brandName='");
        sb.append(this.f239363e);
        sb.append('\'');
        sb.append(", debugType=");
        sb.append(this.f239365g);
        sb.append(", uin=");
        sb.append(C77710q.m93738a(this.f234818T));
        sb.append(", isPluginApp=");
        sb.append(this.f239373d1);
        sb.append(", isAdContact=");
        sb.append(this.f239380k1);
        sb.append(", isGameAdContact=");
        sb.append(this.f239381l1);
        sb.append(", performanceValue=");
        sb.append(this.f239382m1);
        sb.append(", orientation='");
        sb.append(this.f239366h);
        sb.append('\'');
        sb.append(", enterPath='");
        sb.append(this.f239367i);
        sb.append('\'');
        sb.append(", shareName='");
        sb.append(this.f234843w);
        sb.append('\'');
        sb.append(", shareKey='");
        sb.append(this.f234844x);
        sb.append('\'');
        sb.append(", startTime=");
        sb.append(this.f234800D);
        sb.append(", attrsFromCgi=");
        sb.append(this.f234825W0);
        sb.append(", referrer=");
        sb.append(this.f234846y);
        sb.append(", extInfo=");
        sb.append(this.f234797A);
        sb.append(", appVersion=");
        sb.append(this.f234802F);
        sb.append(", launchMode=");
        sb.append(this.f234813Q0);
        sb.append("， triggerServiceName=");
        sb.append(this.f239376g1);
        sb.append("， createdAsHalfScreen=");
        sb.append(this.f234817S0);
        sb.append(", halfScreenConfig=");
        sb.append(this.f234815R0.mo76931c() ? this.f234815R0.toString() : "dummy");
        sb.append(", secFlagForSinglePageMode=");
        sb.append(this.f234819T0);
        sb.append(", showRelievedBuyFlag=");
        sb.append(this.f239386q1);
        sb.append(", showFlagshipFlag=");
        sb.append(this.f239387r1);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f239373d1 ? (byte) 1 : 0);
        parcel.writeByte(this.f239380k1 ? (byte) 1 : 0);
        parcel.writeByte(this.f239381l1 ? (byte) 1 : 0);
        parcel.writeInt(this.f239382m1);
        parcel.writeLong(this.f239374e1);
        parcel.writeString(this.f239375f1);
        parcel.writeParcelable(this.f239379j1, i);
        parcel.writeByte(this.f239377h1 ? (byte) 1 : 0);
        parcel.writeString(this.f239376g1);
        parcel.writeParcelable(this.f239378i1, i);
        parcel.writeString(this.f239383n1);
        parcel.writeParcelable(this.f239384o1, i);
        parcel.writeString(this.f239385p1);
        parcel.writeInt(this.f239386q1);
        parcel.writeInt(this.f239387r1);
        parcel.writeInt(this.f239388s1);
        parcel.writeByte(this.f239389t1 ? (byte) 1 : 0);
        parcel.writeParcelable(this.f239391v1, i);
        parcel.writeStringList(this.f239390u1);
        parcel.writeParcelable(this.f239392w1, i);
        parcel.writeByte(this.f239393x1 ? (byte) 1 : 0);
        parcel.writeParcelable(this.f239394y1, i);
        parcel.writeString(this.f239395z1);
        parcel.writeString(this.f239371A1);
        parcel.writeString(this.f239372B1.name());
    }

    public AppBrandInitConfigWC(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.f239377h1 = false;
        this.f239389t1 = false;
        this.f239390u1 = new ArrayList();
        this.f239393x1 = false;
        this.f239394y1 = null;
        this.f239395z1 = "";
        this.f239371A1 = "";
        C66117m mVar = C66117m.NORMAL;
        this.f239372B1 = mVar;
        this.f239373d1 = parcel.readByte() != 0;
        this.f239380k1 = parcel.readByte() != 0;
        this.f239381l1 = parcel.readByte() != 0;
        this.f239382m1 = parcel.readInt();
        this.f239374e1 = parcel.readLong();
        this.f239375f1 = parcel.readString();
        this.f239379j1 = (QualitySession) parcel.readParcelable(QualitySession.class.getClassLoader());
        this.f239377h1 = parcel.readByte() > 0;
        this.f239376g1 = parcel.readString();
        this.f239378i1 = (WebRenderingCacheDirectoryDescriptor) parcel.readParcelable(WebRenderingCacheDirectoryDescriptor.class.getClassLoader());
        this.f239383n1 = parcel.readString();
        this.f239384o1 = (AppBrandLaunchFromNotifyReferrer) parcel.readParcelable(AppBrandLaunchFromNotifyReferrer.class.getClassLoader());
        this.f239385p1 = parcel.readString();
        this.f239386q1 = parcel.readInt();
        this.f239387r1 = parcel.readInt();
        this.f239388s1 = parcel.readInt();
        this.f239389t1 = parcel.readByte() > 0;
        this.f239391v1 = (WeAppOpenDeclarePromptBundle) parcel.readParcelable(WeAppOpenDeclarePromptBundle.class.getClassLoader());
        parcel.readStringList(this.f239390u1);
        this.f239392w1 = (WeAppOpenUICallbackIPCProxy) parcel.readParcelable(WeAppOpenUICallbackIPCProxy.class.getClassLoader());
        this.f239393x1 = parcel.readByte() > 0 ? true : z;
        this.f239394y1 = (ParcelableMultiTaskData) parcel.readParcelable(ParcelableMultiTaskData.class.getClassLoader());
        this.f239395z1 = parcel.readString();
        this.f239371A1 = parcel.readString();
        String readString = parcel.readString();
        this.f239372B1 = !TextUtils.isEmpty(readString) ? C66117m.valueOf(readString) : mVar;
    }
}
