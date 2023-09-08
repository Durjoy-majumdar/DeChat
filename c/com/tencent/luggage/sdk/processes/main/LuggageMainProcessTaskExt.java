package com.tencent.luggage.sdk.processes.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.sdk.processes.C80278n;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import sx3.C36907w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public class LuggageMainProcessTaskExt extends MainProcessTask {
    public static final Parcelable.Creator<LuggageMainProcessTaskExt> CREATOR = new C80269a();

    /* renamed from: f */
    public final RuntimeInfo f234979f;

    /* renamed from: com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt$a */
    public static final class C80269a implements Parcelable.Creator<LuggageMainProcessTaskExt> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LuggageMainProcessTaskExt(RuntimeInfo.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new LuggageMainProcessTaskExt[i];
        }
    }

    public LuggageMainProcessTaskExt(RuntimeInfo runtimeInfo) {
        C87412m.m108594g(runtimeInfo, "runtimeInfo");
        this.f234979f = runtimeInfo;
    }

    /* renamed from: j */
    public void mo1553j() {
        C80250c<C80278n> cVar;
        Class cls = C1523c3.class;
        try {
            if (C86312j.m106916h(cls)) {
                ((C1523c3) C86312j.m106911c(cls)).waitFor();
            }
            C80254f<C80250c<C80278n>, C80278n> fVar = C80254f.f234946e;
            if (fVar != null) {
                cVar = fVar.mo111388c(mo111416q().f234988d);
                if (cVar != null) {
                    Log.m105924i("Luggage.LuggageMainProcessTaskExt", "runInMainProcess: [" + mo111416q().f234989e + "] run [" + getClass().getSimpleName() + "] by process [" + mo111416q().f234988d + "][" + cVar.mo111363h() + ']');
                    try {
                        mo111421t(cVar);
                    } catch (Throwable th) {
                        Object[] objArr = new Object[5];
                        objArr[0] = getClass().getCanonicalName();
                        objArr[1] = th.getMessage();
                        objArr[2] = th.getStackTrace();
                        if (C86312j.m106916h(cls)) {
                            ((C1523c3) C86312j.m106911c(cls)).waitFor();
                        }
                        C80254f<C80250c<C80278n>, C80278n> fVar2 = C80254f.f234946e;
                        if (fVar2 != null) {
                            List<C80250c<C80278n>> j = fVar2.mo111395j();
                            ArrayList arrayList = new ArrayList(C36907w.m41090l(j, 10));
                            for (C80250c cVar2 : j) {
                                arrayList.add(cVar2.toString());
                            }
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                Object next = it.next();
                                while (it.hasNext()) {
                                    next = ((String) next) + 10 + ((String) it.next());
                                }
                                objArr[3] = (String) next;
                                objArr[4] = mo111416q();
                                Log.m105921e("Luggage.LuggageMainProcessTaskExt", "invoke[%s]: fatal error[%s][%s]\ndump processes[%s]\ndump origin invoke info[%s]", objArr);
                                throw th;
                            }
                            throw new UnsupportedOperationException("Empty collection can't be reduced.");
                        }
                        C87412m.m108603p("INSTANCE_");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("INSTANCE_");
                throw null;
            }
        } catch (Exception unused) {
            Log.m105928w("Luggage.LuggageMainProcessTaskExt", "Main process index list has been changed and give up registering task.The consequence is we can't do clearDuplicatedApp() because runtime record is lost. processIndex:" + mo111416q().f234988d + ", appId:" + mo111416q().f234989e);
            cVar = null;
        }
    }

    /* renamed from: q */
    public RuntimeInfo mo111416q() {
        return this.f234979f;
    }

    /* renamed from: t */
    public void mo111421t(C80250c<C80278n> cVar) {
        C87412m.m108594g(cVar, "process");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        this.f234979f.writeToParcel(parcel, i);
    }
}
