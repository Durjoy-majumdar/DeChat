package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi */
public final class AppBrandCgiPrefetchApi {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchApi$PullPrefetchResultReq;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$PullPrefetchResultReq */
    public static final class PullPrefetchResultReq implements Parcelable {
        public static final C1921a CREATOR = new C1921a((C8480h) null);

        /* renamed from: d */
        public final String f11793d;

        /* renamed from: e */
        public final int f11794e;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$PullPrefetchResultReq$a */
        public static final class C1921a implements Parcelable.Creator<PullPrefetchResultReq> {
            public C1921a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                String readString = parcel.readString();
                C87412m.m108591d(readString);
                return new PullPrefetchResultReq(readString, parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new PullPrefetchResultReq[i];
            }
        }

        public PullPrefetchResultReq(String str, int i) {
            C87412m.m108594g(str, "instanceId");
            this.f11793d = str;
            this.f11794e = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeString(this.f11793d);
            parcel.writeInt(this.f11794e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchApi$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchApi$PullPrefetchResultReq;", "Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchedResp;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$a */
    public static final class C1922a implements C80916r<PullPrefetchResultReq, AppBrandCgiPrefetchedResp> {
        public Object invoke(Object obj) {
            C83302d a;
            PullPrefetchResultReq pullPrefetchResultReq = (PullPrefetchResultReq) obj;
            if (pullPrefetchResultReq != null) {
                C83297c cVar = C83297c.f243433a;
                int i = pullPrefetchResultReq.f11794e;
                String str = pullPrefetchResultReq.f11793d;
                synchronized (cVar) {
                    C87412m.m108594g(str, "instanceId");
                    a = cVar.mo115594a(i, str);
                    if (a != null) {
                        C83297c.f243434b.remove(a);
                    }
                }
                if (a != null) {
                    try {
                        return a.f243453c.get();
                    } catch (InterruptedException | CancellationException unused) {
                    }
                }
            }
            return null;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchApi$b;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchApi$PullPrefetchResultReq;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$b */
    public static final class C1923b implements C80916r<PullPrefetchResultReq, IPCBoolean> {
        public Object invoke(Object obj) {
            PullPrefetchResultReq pullPrefetchResultReq = (PullPrefetchResultReq) obj;
            if (pullPrefetchResultReq == null) {
                return new IPCBoolean(false);
            }
            C83302d a = C83297c.f243433a.mo115594a(pullPrefetchResultReq.f11794e, pullPrefetchResultReq.f11793d);
            return a == null ? new IPCBoolean(false) : new IPCBoolean(a.f243453c.isDone());
        }
    }

    /* renamed from: a */
    public final AppBrandCgiPrefetchedResp mo1809a(int i, String str) {
        C87412m.m108594g(str, "instanceId");
        AppBrandCgiPrefetchedResp appBrandCgiPrefetchedResp = (AppBrandCgiPrefetchedResp) C80907o.m98783f(MMApplicationContext.getMainProcessName(), new PullPrefetchResultReq(str, i), C1922a.class);
        StringBuilder sb = new StringBuilder();
        sb.append("pullPrefetchCgiResult: type=");
        sb.append(i);
        sb.append(" id=");
        sb.append(str);
        sb.append(" null?=");
        sb.append(appBrandCgiPrefetchedResp == null);
        Log.m105924i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", sb.toString());
        return appBrandCgiPrefetchedResp;
    }
}
