package aa2;

import aa2.C112765c;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C33631s;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import n92.C117617a;
import p640ox.C77049b;
import sx3.C64197v;
import te3.C110964i13;
import te3.i25;
import v92.C65558a;

/* renamed from: aa2.f */
public final class C112775f implements C60907t {

    /* renamed from: a */
    public final /* synthetic */ C112765c f337686a;

    public C112775f(C112765c cVar) {
        this.f337686a = cVar;
    }

    /* renamed from: a */
    public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
        MultiTaskInfo multiTaskInfo;
        long j;
        String str;
        C60906r rVar2 = rVar;
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(rVar2, "data");
        LinkedList<C33631s> linkedList = rVar2.f173513i;
        C112765c cVar = this.f337686a;
        char c = 0;
        int i = 0;
        for (T next : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                C33631s sVar = (C33631s) next;
                if ((sVar.f91020a instanceof C65558a) && ((MultiTaskUIC) C39818r.f106831a.mo62444c(cVar.getActivity()).mo75002a(MultiTaskUIC.class)).mo90994b0()) {
                    C9493c cVar2 = sVar.f91020a;
                    C87412m.m108592e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.ui.minusscreen.data.RVMultiTaskData");
                    MultiTaskInfo multiTaskInfo2 = ((C65558a) cVar2).f188631d;
                    Context context = recyclerView.getContext();
                    C87412m.m108593f(context, "recyclerView.context");
                    C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(C77049b.class)).mo72346DT(context, 5);
                    long G3 = (long) cVar.mo164517G3(multiTaskInfo2.field_id);
                    Object[] objArr = new Object[2];
                    objArr[c] = multiTaskInfo2.field_id;
                    objArr[1] = Long.valueOf(G3);
                    Log.m105919d("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "Item Exposed, itemId: %s, pos: %s", objArr);
                    if (i132 != null) {
                        String str2 = i132.f332061h;
                        if (multiTaskInfo2.field_type == 2) {
                            i25 i25 = new i25();
                            try {
                                i25.parseFrom(multiTaskInfo2.field_data);
                            } catch (Exception unused) {
                            }
                            str = i25.f135051e;
                        } else {
                            str = str2;
                        }
                        C117617a aVar = C117617a.f351848a;
                        String str3 = multiTaskInfo2.field_id;
                        C87412m.m108593f(str3, "multiTaskInfo.field_id");
                        C117617a.f351849b.put(str3, Long.valueOf(C31543z5.m39453c()));
                        multiTaskInfo = multiTaskInfo2;
                        j = G3;
                        aVar.mo182341c(multiTaskInfo2, i132.f332057d, G3, 1, str);
                    } else {
                        multiTaskInfo = multiTaskInfo2;
                        j = G3;
                    }
                    C112765c.C112766a aVar2 = cVar.f337664r;
                    if (aVar2 != null) {
                        aVar2.mo164525a(multiTaskInfo, (int) j);
                    }
                }
                i = i2;
                c = 0;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
