package ez2;

import android.content.Context;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import jq3.C60905o;
import zb2.C53769h;

/* renamed from: ez2.o */
public final class C45731o extends C87413o implements C32224a<MvvmList<C45723c>> {

    /* renamed from: d */
    public final /* synthetic */ C45724d f123573d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f123574e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45731o(C45724d dVar, C60905o oVar) {
        super(0);
        this.f123573d = dVar;
        this.f123574e = oVar;
    }

    public Object invoke() {
        C45724d dVar = this.f123573d;
        C53769h hVar = new C53769h();
        Context context = this.f123574e.f173499A;
        C87412m.m108592e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        return new MvvmList(dVar, hVar, (C0125s) context, (LifecycleScope) null, (List) null, 24, (C8480h) null);
    }
}
