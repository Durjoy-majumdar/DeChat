package rs1;

import a14.C0000n0;
import android.widget.TextView;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderWifiHintUIC$showHint$1", mo125469f = "FinderWifiHintUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: rs1.hb */
public final class C36476hb extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C63555gb f97052d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f97053e;

    /* renamed from: f */
    public final /* synthetic */ long f97054f;

    /* renamed from: rs1.hb$a */
    public static final class C36477a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f97055d;

        /* renamed from: e */
        public final /* synthetic */ C63555gb f97056e;

        /* renamed from: f */
        public final /* synthetic */ String f97057f;

        public C36477a(long j, C63555gb gbVar, String str) {
            this.f97055d = j;
            this.f97056e = gbVar;
            this.f97057f = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r2 = r5.f97056e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                long r0 = r5.f97055d
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0013
                rs1.gb r2 = r5.f97056e
                android.widget.TextView r3 = r2.f180240d
                if (r3 == 0) goto L_0x0013
                java.lang.Runnable r2 = r2.f180241e
                r3.postDelayed(r2, r0)
            L_0x0013:
                rs1.gb r0 = r5.f97056e
                r1 = 1
                r0.mo88407c3(r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[showHint] hint:"
                r0.append(r1)
                java.lang.String r1 = r5.f97057f
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FinderWifiHintUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C36476hb.C36477a.run():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36476hb(C63555gb gbVar, C8478d0 d0Var, long j, C15601d<? super C36476hb> dVar) {
        super(2, dVar);
        this.f97052d = gbVar;
        this.f97053e = d0Var;
        this.f97054f = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C36476hb(this.f97052d, this.f97053e, this.f97054f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C36476hb) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        String string = this.f97052d.getActivity().getResources().getString(this.f97053e.f27483d);
        C87412m.m108593f(string, "activity.resources.getString(hintRes)");
        TextView textView = this.f97052d.f180240d;
        if (textView != null) {
            textView.setText(string);
        }
        TextView textView2 = this.f97052d.f180240d;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        C63555gb gbVar = this.f97052d;
        TextView textView3 = gbVar.f180240d;
        if (textView3 != null) {
            textView3.post(new C36477a(this.f97054f, gbVar, string));
        }
        return C13598b0.f38549a;
    }
}
