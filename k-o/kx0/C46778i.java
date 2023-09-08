package kx0;

import ac2.C39535k;
import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: kx0.i */
public final class C46778i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizPCRecentReadUI f125891d;

    /* renamed from: e */
    public final /* synthetic */ C46754a f125892e;

    /* renamed from: f */
    public final /* synthetic */ C46768h f125893f;

    /* renamed from: kx0.i$a */
    public static final class C46779a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46754a f125894d;

        /* renamed from: e */
        public final /* synthetic */ C46768h f125895e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46779a(C46754a aVar, C46768h hVar) {
            super(0);
            this.f125894d = aVar;
            this.f125895e = hVar;
        }

        public Object invoke() {
            C46754a aVar = this.f125894d;
            aVar.f125845e.f126592f = false;
            this.f125895e.mo72008c3(C39535k.UIRefresh, aVar.mo72005d3());
            return C13598b0.f38549a;
        }
    }

    public C46778i(BizPCRecentReadUI bizPCRecentReadUI, C46754a aVar, C46768h hVar) {
        this.f125891d = bizPCRecentReadUI;
        this.f125892e = aVar;
        this.f125893f = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initHasClosedTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BizPCRecentReadUI bizPCRecentReadUI = this.f125891d;
        C46754a aVar = this.f125892e;
        bizPCRecentReadUI.mo63581H7(aVar.f125845e.f126591e, false, new C46779a(aVar, this.f125893f));
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initHasClosedTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
