package ez2;

import android.content.Context;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.textstatus.convert.topic.TopicSquareItemConvert$buildItemConvertFactory$1;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13601g;
import zb2.C103009m;

/* renamed from: ez2.l */
public final class C45730l extends C87413o implements C32224a<C103009m<C45723c>> {

    /* renamed from: d */
    public final /* synthetic */ C45733q f123570d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f123571e;

    /* renamed from: f */
    public final /* synthetic */ C13601g<MvvmList<C45723c>> f123572f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45730l(C45733q qVar, C60905o oVar, C13601g<? extends MvvmList<C45723c>> gVar) {
        super(0);
        this.f123570d = qVar;
        this.f123571e = oVar;
        this.f123572f = gVar;
    }

    public Object invoke() {
        C45733q qVar = this.f123570d;
        Context context = this.f123571e.f173499A;
        C87412m.m108593f(context, "holder.context");
        qVar.getClass();
        return new C103009m(this.f123572f.getValue(), new TopicSquareItemConvert$buildItemConvertFactory$1(qVar, context), false, 4, (C8480h) null);
    }
}
