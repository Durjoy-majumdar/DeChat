package com.tencent.p014mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import android.os.Parcelable;
import b34.C79664a;
import b34.C79665b;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.C80893c;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86723g;
import java.util.Locale;
import java.util.concurrent.Executor;
import jp3.C9486a;
import jp3.C9487b;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import pe3.C47465a;
import q20.C89449a;
import u20.C90594b;
import u24.C90595a;
import wm0.C91035a;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi */
public final class IPCRunCgi {

    /* renamed from: a */
    public static final int[] f237777a = {1157, C91035a.CTRL_INDEX, 1133, 4602, 1912};

    /* renamed from: b */
    public static final C40324j.C40325b f237778b = new C80926a();

    /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$f */
    public static final class C28950f {

        /* renamed from: a */
        public static final Executor f79411a = new IPCRunCgi$f$$a();
    }

    /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper */
    public static final class IPCRunCgiParamsWrapper implements Parcelable {
        public static final Parcelable.Creator<IPCRunCgiParamsWrapper> CREATOR = new C80925a();

        /* renamed from: d */
        public String f237779d;

        /* renamed from: e */
        public C47350c f237780e;

        /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper$a */
        public class C80925a implements Parcelable.Creator<IPCRunCgiParamsWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new IPCRunCgiParamsWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new IPCRunCgiParamsWrapper[i];
            }
        }

        public IPCRunCgiParamsWrapper() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f237779d);
            C80893c.m98763d(this.f237780e, parcel);
        }

        public IPCRunCgiParamsWrapper(Parcel parcel) {
            this.f237779d = parcel.readString();
            this.f237780e = (C47350c) C80893c.m98762c("com.tencent.mm.ipcinvoker.wx_extension.CommReqRespTransfer", parcel);
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$a */
    public class C80926a implements C40324j.C40325b {
        /* renamed from: a */
        public C47350c mo63016a(C47350c cVar) {
            return cVar;
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$b */
    public class C80927b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C40324j.C40326a f237781d;

        /* renamed from: e */
        public final /* synthetic */ C47350c f237782e;

        public C80927b(C40324j.C40326a aVar, C47350c cVar) {
            this.f237781d = aVar;
            this.f237782e = cVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C40324j.C40326a aVar;
            if (3 == i && !yVar.hasCallBackToQueue() && (aVar = this.f237781d) != null) {
                aVar.mo288a(i, i2, str, this.f237782e);
            }
            try {
                C86723g.this.f251779b.mo123470p(yVar.getType(), this);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$c */
    public class C80928c implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C40324j.C40326a f237783d;

        /* renamed from: e */
        public final /* synthetic */ C11385n f237784e;

        public C80928c(C40324j.C40326a aVar, C11385n nVar) {
            this.f237783d = aVar;
            this.f237784e = nVar;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C40324j.C40326a aVar = this.f237783d;
            if (aVar != null) {
                aVar.mo288a(i, i2, str, cVar);
            }
            try {
                if (this.f237784e == null) {
                    return 0;
                }
                C86723g.this.f251779b.mo123470p(yVar.getType(), this.f237784e);
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$d */
    public static final class C80929d implements C1256g<IPCRunCgiRespWrapper>, C9486a {

        /* renamed from: d */
        public C40324j.C40326a f237785d;

        public C80929d(C40324j.C40326a aVar, C9487b<? extends C9486a> bVar) {
            this.f237785d = aVar;
            if (bVar != null) {
                bVar.keep(this);
            }
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCRunCgiRespWrapper iPCRunCgiRespWrapper = (IPCRunCgiRespWrapper) obj;
            C40324j.C40326a aVar = this.f237785d;
            if (!(aVar == null || iPCRunCgiRespWrapper == null)) {
                try {
                    aVar.mo288a(iPCRunCgiRespWrapper.f237792d, iPCRunCgiRespWrapper.f237793e, iPCRunCgiRespWrapper.f237794f, iPCRunCgiRespWrapper.f237795g);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.IPCRunCgi", e, "remoteCgiImpl do callback", new Object[0]);
                } catch (Throwable th) {
                    this.f237785d = null;
                    throw th;
                }
            }
            this.f237785d = null;
        }

        public void dead() {
            this.f237785d = null;
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$e */
    public static final class C80930e implements C1255d<IPCRunCgiParamsWrapper, IPCRunCgiRespWrapper> {
        private C80930e() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C40324j.C40325b bVar;
            IPCRunCgiParamsWrapper iPCRunCgiParamsWrapper = (IPCRunCgiParamsWrapper) obj;
            C47350c cVar = iPCRunCgiParamsWrapper.f237780e;
            if (cVar == null || cVar.f127056b.f127083a.getClass() == C47465a.class) {
                Log.m105921e("MicroMsg.IPCRunCgi", "InvokeTask, mm received invalid rr %s", cVar);
                if (gVar != null) {
                    IPCRunCgiRespWrapper iPCRunCgiRespWrapper = new IPCRunCgiRespWrapper();
                    iPCRunCgiRespWrapper.f237795g = cVar;
                    iPCRunCgiRespWrapper.f237794f = null;
                    iPCRunCgiRespWrapper.f237792d = 3;
                    iPCRunCgiRespWrapper.f237793e = -2;
                    gVar.mo894a(iPCRunCgiRespWrapper);
                    return;
                }
                return;
            }
            String str = iPCRunCgiParamsWrapper.f237779d;
            if (str == null) {
                bVar = IPCRunCgi.f237778b;
            } else {
                try {
                    bVar = (C40324j.C40325b) C79664a.m96762j(str).mo109790c().f233575b;
                } catch (C79665b e) {
                    Log.m105921e("MicroMsg.IPCRunCgi", "createInterceptor with name:%s, get exception:%s", iPCRunCgiParamsWrapper.f237779d, e);
                    bVar = IPCRunCgi.f237778b;
                }
            }
            IPCRunCgi.m98795b(cVar, bVar, new C80932k(this, gVar), (C9487b<? extends C9486a>) null);
        }
    }

    /* renamed from: a */
    public static C117747y m98794a(C47350c cVar, C40324j.C40326a aVar) {
        return m98795b(cVar, (C40324j.C40325b) null, aVar, (C9487b<? extends C9486a>) null);
    }

    /* renamed from: b */
    public static C117747y m98795b(C47350c cVar, C40324j.C40325b bVar, C40324j.C40326a aVar, C9487b<? extends C9486a> bVar2) {
        C80927b bVar3 = null;
        if (MMApplicationContext.isMainProcess()) {
            if (bVar == null) {
                bVar = f237778b;
            }
            if (C90595a.m113497a(f237777a, cVar.getType())) {
                bVar3 = new C80927b(aVar, cVar);
            }
            C117747y d = C89144l0.m111428d(bVar.mo63016a(cVar), new C80928c(aVar, bVar3), C28950f.f79411a, bVar2);
            if (!(d == null || bVar3 == null)) {
                try {
                    ((C86723g.C86724a) C89144l0.f256845a).mo121131a().mo123455a(d.getType(), bVar3);
                } catch (Exception unused) {
                }
            }
            return d;
        }
        if (bVar != null && !C90594b.m113493a(bVar.getClass())) {
            String format = String.format(Locale.ENGLISH, "remoteCgiImpl in client process, invalid interceptor %s", new Object[]{bVar.getClass().getName()});
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
                Assert.fail(format);
            }
            Log.printErrStackTrace("MicroMsg.IPCRunCgi", new Throwable(), format, new Object[0]);
            bVar = null;
        }
        IPCRunCgiParamsWrapper iPCRunCgiParamsWrapper = new IPCRunCgiParamsWrapper();
        String unused2 = iPCRunCgiParamsWrapper.f237779d = bVar == null ? null : bVar.getClass().getName();
        C47350c unused3 = iPCRunCgiParamsWrapper.f237780e = cVar;
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, iPCRunCgiParamsWrapper, C80930e.class, aVar == null ? null : new C80929d(aVar, bVar2));
        return null;
    }
}
