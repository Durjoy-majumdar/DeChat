package mx1;

import a14.C0000n0;
import com.tencent.stubs.logger.Log;
import cx1.C45220b;
import cx1.C45221c;
import ex1.C45711d;
import ex1.C45712e;
import fy3.C32227p;
import gy3.C8480h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64197v;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomMemberViewModel$loadMemberFromLocal$1", mo125469f = "ChatroomMemberViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: mx1.j */
public final class C47134j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C47127f f126644d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47134j(C47127f fVar, C15601d<? super C47134j> dVar) {
        super(2, dVar);
        this.f126644d = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47134j(this.f126644d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47134j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C47127f fVar = this.f126644d;
        String str = fVar.f126629f;
        if (str != null) {
            List<C45711d> Rh0 = ((C45712e) fVar.f126631h.getValue()).Rh0(str, 400);
            long fS = ((C45712e) fVar.f126631h.getValue()).mo71206fS(str);
            Log.m106505i("GameChatRoom.ChatroomMemberViewModel", "getMemberFromLocal localMemberNum = " + fS);
            int i = 0;
            boolean z = fS > 400;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(Rh0, 10));
            for (T next : Rh0) {
                int i2 = i + 1;
                if (i >= 0) {
                    C45711d dVar = (C45711d) next;
                    arrayList.add(i == 0 ? new C45221c(new C13604l(Boolean.TRUE, "其他成员"), dVar.mo71200l2(), false, 201, 4, (C8480h) null) : i == Rh0.size() + -1 ? new C45221c((C13604l) null, dVar.mo71200l2(), z, 201, 1, (C8480h) null) : new C45221c((C13604l) null, dVar.mo71200l2(), false, 201, 5, (C8480h) null));
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (!fVar.f126632i.contains(((C45221c) next2).f122549b.f122555a)) {
                    arrayList2.add(next2);
                }
            }
            fVar.f126627d.postValue(C45220b.m50019a(fVar.mo72234d3(), (List) null, (C13604l) null, (C13604l) null, new C13604l(Boolean.TRUE, arrayList2), 7, (Object) null));
        }
        return C13598b0.f38549a;
    }
}
