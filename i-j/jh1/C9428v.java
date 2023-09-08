package jh1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.view.View;
import android.widget.TextView;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: jh1.v */
public final class C9428v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f29421d;

    /* renamed from: e */
    public final /* synthetic */ C9421t f29422e;

    /* renamed from: f */
    public final /* synthetic */ C9433z f29423f;

    /* renamed from: g */
    public final /* synthetic */ String f29424g;

    /* renamed from: h */
    public final /* synthetic */ TextView f29425h;

    /* renamed from: i */
    public final /* synthetic */ View f29426i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneVoteWidget$refreshVoteState$4$2$1", mo125469f = "MileStoneVoteWidget.kt", mo125470l = {202}, mo125471m = "invokeSuspend")
    /* renamed from: jh1.v$a */
    public static final class C9429a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f29427d;

        /* renamed from: e */
        public final /* synthetic */ C9421t f29428e;

        /* renamed from: f */
        public final /* synthetic */ C9433z f29429f;

        /* renamed from: g */
        public final /* synthetic */ String f29430g;

        /* renamed from: h */
        public final /* synthetic */ TextView f29431h;

        /* renamed from: i */
        public final /* synthetic */ String f29432i;

        /* renamed from: j */
        public final /* synthetic */ View f29433j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9429a(C9421t tVar, C9433z zVar, String str, TextView textView, String str2, View view, C15601d<? super C9429a> dVar) {
            super(2, dVar);
            this.f29428e = tVar;
            this.f29429f = zVar;
            this.f29430g = str;
            this.f29431h = textView;
            this.f29432i = str2;
            this.f29433j = view;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C9429a(this.f29428e, this.f29429f, this.f29430g, this.f29431h, this.f29432i, this.f29433j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C9429a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f29427d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9421t tVar = this.f29428e;
                C9433z zVar = this.f29429f;
                String str = this.f29430g;
                TextView textView = this.f29431h;
                String str2 = this.f29432i;
                View view = this.f29433j;
                this.f29427d = 1;
                if (C9421t.m9119a(tVar, zVar, str, textView, str2, view, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public C9428v(String str, C9421t tVar, C9433z zVar, String str2, TextView textView, View view) {
        this.f29421d = str;
        this.f29422e = tVar;
        this.f29423f = zVar;
        this.f29424g = str2;
        this.f29425h = textView;
        this.f29426i = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteState$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9406j.m9112f(C9406j.f29357a, this.f29421d, 8, (String) null, (String) null, (Integer) null, 28, (Object) null);
        C9421t tVar = this.f29422e;
        C0000n0 n0Var = tVar.f29390b.f26744r;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C9429a(tVar, this.f29423f, this.f29424g, this.f29425h, this.f29421d, this.f29426i, (C15601d<? super C9429a>) null), 3, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteState$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
