package mx1;

import a14.C0000n0;
import androidx.lifecycle.C54219z;
import cx1.C45221c;
import ex1.C45711d;
import ex1.C45712e;
import fy3.C32227p;
import gy3.C8480h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomMemberViewModel$searchUser$1$1", mo125469f = "ChatroomMemberViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: mx1.m */
public final class C47137m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C47127f f126653d;

    /* renamed from: e */
    public final /* synthetic */ String f126654e;

    /* renamed from: f */
    public final /* synthetic */ String f126655f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47137m(C47127f fVar, String str, String str2, C15601d<? super C47137m> dVar) {
        super(2, dVar);
        this.f126653d = fVar;
        this.f126654e = str;
        this.f126655f = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47137m(this.f126653d, this.f126654e, this.f126655f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47137m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        List<C45711d> Mj0 = ((C45712e) this.f126653d.f126631h.getValue()).Mj0(this.f126654e, this.f126655f);
        C54219z<List<C45221c>> zVar = this.f126653d.f126628e;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(Mj0, 10));
        for (C45711d l2 : Mj0) {
            arrayList.add(new C45221c((C13604l) null, l2.mo71200l2(), false, 701, 5, (C8480h) null));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((C45221c) next).f122549b.f122555a)) {
                arrayList2.add(next);
            }
        }
        zVar.postValue(arrayList2);
        return C13598b0.f38549a;
    }
}
