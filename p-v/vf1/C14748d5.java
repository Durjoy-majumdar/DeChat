package vf1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTeenModeLimitUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import ky2.C10432i;
import lc3.C10485b;
import o40.C61926c;
import rx3.C13598b0;
import ts1.C14080d;
import up1.C37521f;
import wd3.C15153w0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI$initGuardianView$1", mo125469f = "FinderTeenModeLimitUI.kt", mo125470l = {112}, mo125471m = "invokeSuspend")
/* renamed from: vf1.d5 */
public final class C14748d5 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f40720d;

    /* renamed from: e */
    public final /* synthetic */ FinderTeenModeLimitUI f40721e;

    /* renamed from: vf1.d5$a */
    public static final class C14749a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderTeenModeLimitUI f40722d;

        /* renamed from: e */
        public final /* synthetic */ View f40723e;

        /* renamed from: vf1.d5$a$a */
        public static final class C14750a implements C15153w0 {

            /* renamed from: a */
            public final /* synthetic */ FinderTeenModeLimitUI f40724a;

            /* renamed from: vf1.d5$a$a$a */
            public static final class C14751a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ FinderTeenModeLimitUI f40725d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C14751a(FinderTeenModeLimitUI finderTeenModeLimitUI) {
                    super(0);
                    this.f40725d = finderTeenModeLimitUI;
                }

                public Object invoke() {
                    this.f40725d.setResult(11112);
                    FinderTeenModeLimitUI finderTeenModeLimitUI = this.f40725d;
                    if (!finderTeenModeLimitUI.isDestroyed() && !finderTeenModeLimitUI.isFinishing()) {
                        this.f40725d.finish();
                    }
                    return C13598b0.f38549a;
                }
            }

            public C14750a(FinderTeenModeLimitUI finderTeenModeLimitUI) {
                this.f40724a = finderTeenModeLimitUI;
            }

            /* renamed from: a */
            public final void mo5557a(boolean z) {
                if (z) {
                    C61926c.m72666K(600, new C14751a(this.f40724a));
                }
            }
        }

        public C14749a(FinderTeenModeLimitUI finderTeenModeLimitUI, View view) {
            this.f40722d = finderTeenModeLimitUI;
            this.f40723e = view;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initGuardianView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f40722d.f14834p) {
                StringBuilder sb = new StringBuilder();
                C14080d dVar = C14080d.f39488a;
                sb.append(dVar.mo13495b());
                sb.append(":00");
                str = this.f40723e.getResources().getString(C0966R.string.f360788er0, new Object[]{sb.toString(), '0' + dVar.mo13494a() + ":00"});
                str2 = "finder_limit_curfew_" + C31543z5.m39455e();
                i = 6;
            } else {
                C37521f.f99374d.getClass();
                str = this.f40723e.getResources().getString(C0966R.string.er6, new Object[]{Integer.valueOf((C37521f.f99434j6.mo60266n().intValue() == 1 ? 10 : ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderAntiAddictInterval", 2400)) / 60)});
                str2 = "finder_limit_time_lock_" + C31543z5.m39455e();
                i = 5;
            }
            C87412m.m108593f(str, "if (isCurfew) {\n        …  )\n                    }");
            Log.m105924i("FinderHotWordTimelineUI", "key: " + str2);
            ((C10432i) C86312j.m106911c(C10432i.class)).Ql0(this.f40723e.getContext(), i, str2, this.f40723e.getResources().getString(C0966R.string.erh), str, "", (byte[]) null, new C14750a(this.f40722d));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initGuardianView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14748d5(FinderTeenModeLimitUI finderTeenModeLimitUI, C15601d<? super C14748d5> dVar) {
        super(2, dVar);
        this.f40721e = finderTeenModeLimitUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14748d5(this.f40721e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C14748d5) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f40720d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FinderTeenModeLimitUI finderTeenModeLimitUI = this.f40721e;
            this.f40720d = 1;
            int i2 = FinderTeenModeLimitUI.f14832q;
            finderTeenModeLimitUI.getClass();
            obj = C53895h.m60469g(C53872d1.f151119c, new C14741c5((C15601d<? super C14741c5>) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C72996z1 z1Var = (C72996z1) obj;
        FinderTeenModeLimitUI finderTeenModeLimitUI2 = this.f40721e;
        View view = finderTeenModeLimitUI2.f14833o;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.kyc);
            textView.setText(textView.getResources().getString(C0966R.string.erk));
            view.setOnClickListener(new C14749a(finderTeenModeLimitUI2, view));
            int i3 = z1Var != null ? 0 : 8;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i3));
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initGuardianView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initGuardianView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return C13598b0.f38549a;
        }
        C87412m.m108603p("guardianView");
        throw null;
    }
}
