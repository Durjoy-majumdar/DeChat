package com.tencent.p014mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import q20.C89449a;
import v20.C90739a;
import zt3.C119157j;

@Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask */
public abstract class MainProcessTask implements Parcelable {

    /* renamed from: d */
    public final C81954f f240349d = new C81954f((C81948a) null);

    /* renamed from: e */
    public final C81949b f240350e = new C81949b((C81948a) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask$b */
    public final class C81949b {

        /* renamed from: a */
        public final C81968n<Parcelable> f240351a = new C81968n<>(new C81950a());

        /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask$b$a */
        public class C81950a implements C1256g<Parcelable> {
            public C81950a() {
            }

            /* renamed from: a */
            public void mo894a(Object obj) {
                ((C119157j) C119157j.f356862d).mo183895z(new C81965k(this, (Parcelable) obj));
            }
        }

        public C81949b(C81948a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask$c */
    public static class C81951c implements C80883e<MainProcessTask, Parcelable> {
        private C81951c() {
        }

        public void invoke(Object obj, C1256g gVar) {
            MainProcessTask mainProcessTask = (MainProcessTask) obj;
            mainProcessTask.f240349d.f240354a = new C81966l(this, gVar, mainProcessTask);
            ((C119157j) C119157j.f356862d).mo183876g(new C81967m(this, mainProcessTask), "MicroMsg.AppBrand.MainProcessTask");
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask$d */
    public static class C81952d extends C81951c implements C1255d<MainProcessTask, Parcelable> {
        private C81952d() {
            super();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask$e */
    public static class C81953e implements C80916r<MainProcessTask, MainProcessTask> {
        private C81953e() {
        }

        public Object invoke(Object obj) {
            MainProcessTask mainProcessTask = (MainProcessTask) obj;
            mainProcessTask.mo1553j();
            return mainProcessTask;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask$f */
    public static final class C81954f {

        /* renamed from: a */
        public transient Runnable f240354a = null;

        public C81954f(C81948a aVar) {
        }
    }

    /* renamed from: b */
    public final boolean mo114394b() {
        Runnable runnable = this.f240349d.f240354a;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    /* renamed from: c */
    public final void mo114395c() {
        if (C90739a.m113806a(getClass(), C81969o.class)) {
            C80907o.m98782e(MMApplicationContext.getMainProcessName(), this, C81952d.class, (C1256g) null, "MicroMsg.AppBrand.MainProcessTask");
        } else {
            C80907o.m98782e(MMApplicationContext.getMainProcessName(), this, C81951c.class, this.f240350e.f240351a, "MicroMsg.AppBrand.MainProcessTask");
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final boolean mo114396f() {
        Parcelable f;
        if (!C80907o.m98784g(MMApplicationContext.getMainProcessName()) || (f = C80907o.m98783f(MMApplicationContext.getMainProcessName(), this, C81953e.class)) == null) {
            return false;
        }
        Parcel obtain = Parcel.obtain();
        f.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        mo1551g(obtain);
        obtain.recycle();
        mo1552i();
        return true;
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
    }

    @Deprecated
    /* renamed from: h */
    public final void mo114397h() {
        this.f240350e.f240351a.f240371d = null;
    }

    /* renamed from: i */
    public void mo1552i() {
    }

    /* renamed from: j */
    public abstract void mo1553j();

    public void writeToParcel(Parcel parcel, int i) {
    }
}
