package kx0;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60906r;
import jq3.C60907t;
import mx0.C47111e;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: kx0.c */
public final class C46761c implements C60907t {

    /* renamed from: a */
    public final /* synthetic */ C46754a f125863a;

    /* renamed from: kx0.c$a */
    public static final class C46762a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46754a f125864d;

        /* renamed from: e */
        public final /* synthetic */ C60906r f125865e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46762a(C46754a aVar, C60906r rVar) {
            super(0);
            this.f125864d = aVar;
            this.f125865e = rVar;
        }

        public Object invoke() {
            C47111e eVar = (C47111e) C110818d0.m150917O(this.f125864d.mo72005d3().f272353o, this.f125865e.f173508d);
            TextView textView = this.f125864d.f125848h;
            if (textView != null) {
                textView.setText(eVar != null ? eVar.f126589f : null);
            }
            return C13598b0.f38549a;
        }
    }

    public C46761c(C46754a aVar) {
        this.f125863a = aVar;
    }

    /* renamed from: a */
    public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(rVar, "data");
        int size = this.f125863a.mo72005d3().f272353o.size();
        if (size > 0 && rVar.f173509e > size - 10) {
            MvvmList<C47111e> d3 = this.f125863a.mo72005d3();
            d3.mo129603e((Object) null, d3.f272346e.f150921b);
        }
        C61926c.m72668M(new C46762a(this.f125863a, rVar));
    }
}
