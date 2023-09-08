package com.tencent.luggage.sdk.processes.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.sdk.processes.C80278n;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageInitTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class LuggageInitTask extends MainProcessTask {
    public static final Parcelable.Creator<LuggageInitTask> CREATOR = new C80267a();

    /* renamed from: f */
    public final String f234977f;

    /* renamed from: com.tencent.luggage.sdk.processes.main.LuggageInitTask$a */
    public static final class C80267a implements Parcelable.Creator<LuggageInitTask> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LuggageInitTask(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new LuggageInitTask[i];
        }
    }

    /* renamed from: com.tencent.luggage.sdk.processes.main.LuggageInitTask$b */
    public static final class C80268b extends C87413o implements C32226l<C80250c<C80278n>, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ LuggageInitTask f234978d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80268b(LuggageInitTask luggageInitTask) {
            super(1);
            this.f234978d = luggageInitTask;
        }

        public Object invoke(Object obj) {
            C80250c cVar = (C80250c) obj;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(cVar.mo111363h(), this.f234978d.f234977f));
        }
    }

    public LuggageInitTask(String str) {
        C87412m.m108594g(str, ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
        this.f234977f = str;
    }

    /* renamed from: j */
    public void mo1553j() {
        Class cls = C1523c3.class;
        if (C86312j.m106916h(cls)) {
            ((C1523c3) C86312j.m106911c(cls)).waitFor();
        }
        C80254f<C80250c<C80278n>, C80278n> fVar = C80254f.f234946e;
        if (fVar != null) {
            for (C80250c r : fVar.mo111391f(new C80268b(this))) {
                r.mo111372r();
            }
            return;
        }
        C87412m.m108603p("INSTANCE_");
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f234977f);
    }
}
