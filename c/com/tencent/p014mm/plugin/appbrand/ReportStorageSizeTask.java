package com.tencent.p014mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29328h;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29331i;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29337l;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29338m;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import f40.C86709a0;
import lu3.C88656g;
import ni0.C88943a;
import p1039tb.C90388a;
import p224ra.C89909e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.ReportStorageSizeTask */
public class ReportStorageSizeTask extends MainProcessTask {
    public static final Parcelable.Creator<ReportStorageSizeTask> CREATOR = new C81101b();

    /* renamed from: f */
    public String f238363f;

    /* renamed from: com.tencent.mm.plugin.appbrand.ReportStorageSizeTask$a */
    public class C81100a implements C88656g {
        public C81100a() {
        }

        public String getKey() {
            return "MicroMsg.AppBrand.ReportStorageSizeTask#" + ReportStorageSizeTask.this.f238363f;
        }

        public void run() {
            try {
                ReportStorageSizeTask.m99329q(ReportStorageSizeTask.this);
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.AppBrand.ReportStorageSizeTask", "doReport appId:%s, e:%s", ReportStorageSizeTask.this.f238363f, th);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ReportStorageSizeTask$b */
    public class C81101b implements Parcelable.Creator<ReportStorageSizeTask> {
        public Object createFromParcel(Parcel parcel) {
            ReportStorageSizeTask reportStorageSizeTask = new ReportStorageSizeTask();
            reportStorageSizeTask.f238363f = parcel.readString();
            return reportStorageSizeTask;
        }

        public Object[] newArray(int i) {
            return new ReportStorageSizeTask[i];
        }
    }

    /* renamed from: q */
    public static void m99329q(ReportStorageSizeTask reportStorageSizeTask) {
        Integer num;
        long j;
        reportStorageSizeTask.getClass();
        C81161g2.requireAccountInitializedOnDemand();
        C29328h hVar = C81161g2.f238469e;
        if (hVar != null) {
            int a = C29331i.f80084a.mo56609a(reportStorageSizeTask.f238363f);
            if (a != 1) {
                String str = reportStorageSizeTask.f238363f;
                num = Integer.valueOf(((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(str, a, C88943a.f256519a.mo123331a(str, C86709a0.m107523b().mo121110g())).mo56589Bk(reportStorageSizeTask.f238363f));
            } else {
                num = Integer.valueOf(hVar.mo56589Bk(reportStorageSizeTask.f238363f));
            }
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[6];
            String str2 = reportStorageSizeTask.f238363f;
            objArr[0] = str2;
            objArr[1] = "";
            objArr[2] = "";
            objArr[3] = num;
            C86009m1 m1Var = new C86009m1(AppBrandLocalMediaObjectManager.m99832e(str2));
            C86009m1[] m1VarArr = null;
            C86009m1[] v = (!m1Var.mo119967g() || !m1Var.mo119977o()) ? null : m1Var.mo119985v(new C29338m());
            long j2 = 0;
            if (v == null || v.length <= 0) {
                j = 0;
            } else {
                j = 0;
                for (C86009m1 r : v) {
                    j += r.mo119980r();
                }
            }
            objArr[4] = Long.valueOf(j);
            C86009m1 m1Var2 = new C86009m1(AppBrandLocalMediaObjectManager.m99832e(reportStorageSizeTask.f238363f));
            if (m1Var2.mo119967g() && m1Var2.mo119977o()) {
                m1VarArr = m1Var2.mo119985v(new C29337l());
            }
            if (m1VarArr != null && m1VarArr.length > 0) {
                for (C86009m1 r2 : m1VarArr) {
                    j2 += r2.mo119980r();
                }
            }
            objArr[5] = Long.valueOf(j2);
            nVar.mo160131h(14073, objArr);
        }
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f238363f = parcel.readString();
    }

    /* renamed from: j */
    public void mo1553j() {
        ((C119157j) C119157j.f356862d).mo183875f(new C81100a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f238363f);
    }
}
