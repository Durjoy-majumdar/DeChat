package com.tencent.luggage.sdk.processes.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.sdk.processes.C80263k;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.C80265m;
import com.tencent.luggage.sdk.processes.C80278n;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageRegisterTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public class LuggageRegisterTask extends LuggageMainProcessTaskExt {
    public static final Parcelable.Creator<LuggageRegisterTask> CREATOR = new C80272a();

    /* renamed from: g */
    public final RuntimeInfo f234982g;

    /* renamed from: com.tencent.luggage.sdk.processes.main.LuggageRegisterTask$a */
    public static final class C80272a implements Parcelable.Creator<LuggageRegisterTask> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LuggageRegisterTask(RuntimeInfo.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new LuggageRegisterTask[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuggageRegisterTask(RuntimeInfo runtimeInfo) {
        super(runtimeInfo);
        C87412m.m108594g(runtimeInfo, "runtimeInfo");
        this.f234982g = runtimeInfo;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: q */
    public RuntimeInfo mo111416q() {
        return this.f234982g;
    }

    /* renamed from: t */
    public void mo111421t(C80250c<C80278n> cVar) {
        C87412m.m108594g(cVar, "process");
        String str = mo111416q().f234989e;
        int i = mo111416q().f234990f;
        C80264l d = cVar.mo111359d(str);
        if (d == null) {
            d = cVar.mo111356a(mo111416q().f234989e, mo111416q().f234990f, mo111416q().f234993i, mo111416q().f234996o);
        }
        C80265m mVar = C80265m.RUNNING;
        d.getClass();
        d.f234967c = mVar;
        d.f234966b = i;
        if (!mo111416q().f234996o) {
            Class cls = C1523c3.class;
            if (C86312j.m106916h(cls)) {
                ((C1523c3) C86312j.m106911c(cls)).waitFor();
            }
            C80254f<C80250c<C80278n>, C80278n> fVar = C80254f.f234946e;
            if (fVar != null) {
                fVar.mo111393h(str, -1, C80263k.f234964d);
            } else {
                C87412m.m108603p("INSTANCE_");
                throw null;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        this.f234982g.writeToParcel(parcel, i);
    }
}
