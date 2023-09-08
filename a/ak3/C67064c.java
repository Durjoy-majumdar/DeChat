package ak3;

import androidx.recyclerview.widget.C54258u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import l31.C61212e;
import ln3.C76709a;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;

/* renamed from: ak3.c */
public final class C67064c implements C54258u {

    /* renamed from: a */
    public final /* synthetic */ C67056a f192634a;

    /* renamed from: b */
    public final /* synthetic */ List<C76709a<?>> f192635b;

    /* renamed from: c */
    public final /* synthetic */ LinkedList<C76709a<?>> f192636c;

    public C67064c(C67056a aVar, List<? extends C76709a<?>> list, LinkedList<C76709a<?>> linkedList) {
        this.f192634a = aVar;
        this.f192635b = list;
        this.f192636c = linkedList;
    }

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        String str = this.f192634a.f192607e;
        Log.m105918d(str, "onRemoved() called with: position = " + i + ", count = " + i2);
        int i3 = i2 + i;
        while (i < i3) {
            if (this.f192636c.size() > i) {
                C76709a<?> aVar = this.f192636c.get(i);
                C87412m.m108593f(aVar, "oldData[i]");
                C76709a aVar2 = aVar;
                int i4 = aVar2.f224436e;
                if (i4 != -1) {
                    ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("group_msg_set_top_detach", (Object) null, C90364q0.m113149h(C90363p0.m113143b(new C13604l("group_bar_close_scene", Integer.valueOf(i4))), aVar2.mo106997b()), 26356);
                }
            }
            i++;
        }
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        String str = this.f192634a.f192607e;
        Log.m105918d(str, "onInserted() called with: position = " + i + ", count = " + i2);
        int i3 = i2 + i;
        while (i < i3) {
            if (this.f192635b.size() > i) {
                C76709a aVar = this.f192635b.get(i);
                C87412m.m108594g(aVar, "data");
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("group_msg_set_top_create", (Object) null, aVar.mo106997b(), 26356);
            }
            i++;
        }
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
        String str = this.f192634a.f192607e;
        Log.m105918d(str, "onChanged() called with: position = " + i + ", count = " + i2 + ", payload = " + obj);
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        String str = this.f192634a.f192607e;
        Log.m105918d(str, "onMoved() called with: fromPosition = " + i + ", toPosition = " + i2);
    }
}
