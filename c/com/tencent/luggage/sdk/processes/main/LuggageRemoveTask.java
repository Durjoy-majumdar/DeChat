package com.tencent.luggage.sdk.processes.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.C80278n;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageRemoveTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class LuggageRemoveTask extends LuggageMainProcessTaskExt {
    public static final Parcelable.Creator<LuggageRemoveTask> CREATOR = new C80273a();

    /* renamed from: g */
    public final RuntimeInfo f234983g;

    /* renamed from: h */
    public final boolean f234984h;

    /* renamed from: com.tencent.luggage.sdk.processes.main.LuggageRemoveTask$a */
    public static final class C80273a implements Parcelable.Creator<LuggageRemoveTask> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LuggageRemoveTask(RuntimeInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new LuggageRemoveTask[i];
        }
    }

    /* renamed from: com.tencent.luggage.sdk.processes.main.LuggageRemoveTask$b */
    public static final class C80274b extends C87413o implements C32226l<C80264l, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C80250c<C80278n> f234985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80274b(C80250c<C80278n> cVar) {
            super(1);
            this.f234985d = cVar;
        }

        public Object invoke(Object obj) {
            C80264l lVar = (C80264l) obj;
            C87412m.m108594g(lVar, "record");
            this.f234985d.mo111358c(lVar);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuggageRemoveTask(RuntimeInfo runtimeInfo, boolean z) {
        super(runtimeInfo);
        C87412m.m108594g(runtimeInfo, "runtimeInfo");
        this.f234983g = runtimeInfo;
        this.f234984h = z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: q */
    public RuntimeInfo mo111416q() {
        return this.f234983g;
    }

    /* renamed from: t */
    public void mo111421t(C80250c<C80278n> cVar) {
        C87412m.m108594g(cVar, "process");
        Class cls = C1523c3.class;
        if (C86312j.m106916h(cls)) {
            ((C1523c3) C86312j.m106911c(cls)).waitFor();
        }
        C80254f<C80250c<C80278n>, C80278n> fVar = C80254f.f234946e;
        if (fVar != null) {
            RuntimeInfo runtimeInfo = this.f234983g;
            fVar.mo111393h(runtimeInfo.f234989e, runtimeInfo.f234990f, new C80274b(cVar));
            if (this.f234984h) {
                new LuggageOnRuntimeFinishTask(this.f234983g).mo1553j();
                return;
            }
            return;
        }
        C87412m.m108603p("INSTANCE_");
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        this.f234983g.writeToParcel(parcel, i);
        parcel.writeInt(this.f234984h ? 1 : 0);
    }
}
