package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import f40.C86718e;
import iq0.C87791a;
import java.util.Objects;
import mp3.C88819d;
import te3.C90422jy;
import te3.b85;
import te3.l65;
import te3.p45;
import wo0.C66142j;
import wo0.C91044c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder */
public final class AppBrandTaskUsageRecorder {
    /* renamed from: a */
    public static void m102194a(AppBrandRuntimeWC appBrandRuntimeWC) {
        AppBrandInitConfigWC M1 = appBrandRuntimeWC.mo113210l1();
        AppBrandSysConfigWC S1 = appBrandRuntimeWC.mo113213o1();
        AppBrandStatObject n1 = appBrandRuntimeWC.mo121253n1();
        Log.m105925i("MicroMsg.AppBrandTaskUsageRecorder", "updateUsage, appId %s, type %d", M1.f239362d, Integer.valueOf(M1.f239365g));
        String str = M1.f234837q;
        new UpdateTask(new LaunchCheckParams(M1, n1, S1.f261072r.pkgVersion, str, M1.f239379j1, appBrandRuntimeWC.mo113184O1(false), MMApplicationContext.getProcessName(), appBrandRuntimeWC.f238275K1)).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$UpdateTask */
    public static final class UpdateTask extends MainProcessTask {
        public static final Parcelable.Creator<UpdateTask> CREATOR = new C83257a();

        /* renamed from: f */
        public LaunchCheckParams f243222f;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$UpdateTask$a */
        public class C83257a implements Parcelable.Creator<UpdateTask> {
            public Object createFromParcel(Parcel parcel) {
                return new UpdateTask(parcel);
            }

            public Object[] newArray(int i) {
                return new UpdateTask[i];
            }
        }

        public UpdateTask(LaunchCheckParams launchCheckParams) {
            this.f243222f = launchCheckParams;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f243222f = (LaunchCheckParams) parcel.readParcelable(LaunchCheckParams.class.getClassLoader());
        }

        /* renamed from: j */
        public void mo1553j() {
            if (C86709a0.m107523b().f251765p && !C86718e.m107551r()) {
                Objects.requireNonNull(this.f243222f);
                AppBrandLaunchReferrer appBrandLaunchReferrer = this.f243222f.f243214d.f234846y;
                b85 b = C66142j.m77970b(appBrandLaunchReferrer);
                l65 a = C66142j.m77969a(appBrandLaunchReferrer);
                p45 p45 = new p45();
                LaunchCheckParams launchCheckParams = this.f243222f;
                AppBrandInitConfigWC appBrandInitConfigWC = launchCheckParams.f243214d;
                p45.f259731d = appBrandInitConfigWC.f239365g;
                p45.f259732e = launchCheckParams.f243216f;
                AppBrandStatObject appBrandStatObject = launchCheckParams.f243215e;
                int i = appBrandStatObject.f245533f;
                p45.f259733f = i;
                p45.f259734g = appBrandInitConfigWC.f239367i;
                p45.f259735h = 1;
                p45.f259736i = appBrandStatObject.f245531d;
                String str = null;
                if (1173 == i) {
                    str = C87791a.m109237b(appBrandInitConfigWC.f234807K);
                }
                String str2 = str;
                C90422jy jyVar = new C90422jy();
                LaunchCheckParams launchCheckParams2 = this.f243222f;
                jyVar.f259639d = launchCheckParams2.f243215e.f245533f;
                launchCheckParams2.f243214d.f234829Y0.mo111350a(jyVar);
                jyVar.f259641f = 1;
                LaunchCheckParams launchCheckParams3 = this.f243222f;
                String str3 = launchCheckParams3.f243214d.f239362d;
                String str4 = launchCheckParams3.f243217g;
                int a2 = launchCheckParams3.f243219i.mo113371a();
                LaunchCheckParams launchCheckParams4 = this.f243222f;
                QualitySession qualitySession = launchCheckParams4.f243218h;
                AppBrandInitConfigWC appBrandInitConfigWC2 = launchCheckParams4.f243214d;
                C88819d.LOGIC.arrange(new C91044c(new CgiLaunchWxaApp(str3, false, p45, b, a, str4, a2, qualitySession, "", appBrandInitConfigWC2.f239384o1, str2, jyVar, appBrandInitConfigWC2.f234813Q0, launchCheckParams4.f243221n)));
                if (C81289m.C81290a.m99664b(this.f243222f.f243214d.f239365g)) {
                    LaunchCheckParams launchCheckParams5 = this.f243222f;
                    AppBrandInitConfigWC appBrandInitConfigWC3 = launchCheckParams5.f243214d;
                    new C83518x0(appBrandInitConfigWC3, launchCheckParams5.f243215e.f245533f, launchCheckParams5.f243219i, new IPCUpdateStateNotifier(launchCheckParams5.f243220j, appBrandInitConfigWC3.f239362d)).mo115811a();
                }
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f243222f, i);
        }

        public UpdateTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams */
    public static final class LaunchCheckParams implements Parcelable {
        public static final Parcelable.Creator<LaunchCheckParams> CREATOR = new C83256a();

        /* renamed from: d */
        public final AppBrandInitConfigWC f243214d;

        /* renamed from: e */
        public final AppBrandStatObject f243215e;

        /* renamed from: f */
        public final int f243216f;

        /* renamed from: g */
        public final String f243217g;

        /* renamed from: h */
        public final QualitySession f243218h;

        /* renamed from: i */
        public final ICommLibReader f243219i;

        /* renamed from: j */
        public final String f243220j;

        /* renamed from: n */
        public final boolean f243221n;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams$a */
        public class C83256a implements Parcelable.Creator<LaunchCheckParams> {
            public Object createFromParcel(Parcel parcel) {
                return new LaunchCheckParams(parcel);
            }

            public Object[] newArray(int i) {
                return new LaunchCheckParams[i];
            }
        }

        public LaunchCheckParams(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject, int i, String str, QualitySession qualitySession, ICommLibReader iCommLibReader, String str2, boolean z) {
            this.f243214d = appBrandInitConfigWC;
            this.f243215e = appBrandStatObject;
            this.f243216f = i;
            this.f243217g = str;
            this.f243218h = qualitySession;
            this.f243219i = iCommLibReader;
            this.f243220j = str2;
            this.f243221n = z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f243214d, i);
            parcel.writeParcelable(this.f243215e, i);
            parcel.writeInt(this.f243216f);
            parcel.writeString(this.f243217g);
            parcel.writeParcelable(this.f243218h, i);
            ICommLibReader.C29316b.m38624b(this.f243219i, parcel, i);
            parcel.writeString(this.f243220j);
            parcel.writeByte(this.f243221n ? (byte) 1 : 0);
        }

        public LaunchCheckParams(Parcel parcel) {
            this.f243214d = (AppBrandInitConfigWC) parcel.readParcelable(AppBrandInitConfigWC.class.getClassLoader());
            this.f243215e = (AppBrandStatObject) parcel.readParcelable(AppBrandStatObject.class.getClassLoader());
            this.f243216f = parcel.readInt();
            this.f243217g = parcel.readString();
            this.f243218h = (QualitySession) parcel.readParcelable(QualitySession.class.getClassLoader());
            this.f243219i = ICommLibReader.C29316b.m38623a(parcel);
            this.f243220j = parcel.readString();
            this.f243221n = parcel.readByte() > 0;
        }
    }
}
