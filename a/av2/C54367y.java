package av2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a22.C67001a;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import b22.C28250a;
import b22.C28251b;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C44668u3;
import f14.C58901s;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C36570n;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2", mo125469f = "SnsLabelDetailDialog.kt", mo125470l = {160}, mo125471m = "invokeSuspend")
/* renamed from: av2.y */
public final class C54367y extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f152548d;

    /* renamed from: e */
    public final /* synthetic */ C54360w f152549e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2$2", mo125469f = "SnsLabelDetailDialog.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: av2.y$a */
    public static final class C54368a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C54360w f152550d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54368a(C54360w wVar, C15601d<? super C54368a> dVar) {
            super(2, dVar);
            this.f152550d = wVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2$2");
            C54368a aVar = new C54368a(this.f152550d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2$2");
            Object invokeSuspend = ((C54368a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2$2");
            ResultKt.throwOnFailure(obj);
            C54360w wVar = this.f152550d;
            int i = C54360w.f152530D;
            SnsMethodCalculate.markStartTimeMs("access$getDisplayTitleSpan$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            SpannableStringBuilder spannableStringBuilder = wVar.f152537v;
            SnsMethodCalculate.markEndTimeMs("access$getDisplayTitleSpan$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            spannableStringBuilder.append(" (" + C54360w.m61051L(this.f152550d).size() + ')');
            C54360w wVar2 = this.f152550d;
            SnsMethodCalculate.markStartTimeMs("access$getTitleView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            wVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getTitleView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            TextView textView = (TextView) ((C36570n) wVar2.f152540y).getValue();
            SnsMethodCalculate.markEndTimeMs("getTitleView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            SnsMethodCalculate.markEndTimeMs("access$getTitleView", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            if (textView != null) {
                C54360w wVar3 = this.f152550d;
                SnsMethodCalculate.markStartTimeMs("access$getDisplayTitleSpan$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
                SpannableStringBuilder spannableStringBuilder2 = wVar3.f152537v;
                SnsMethodCalculate.markEndTimeMs("access$getDisplayTitleSpan$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
                textView.setText(spannableStringBuilder2);
            }
            C54360w wVar4 = this.f152550d;
            SnsMethodCalculate.markStartTimeMs("access$getProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            wVar4.getClass();
            SnsMethodCalculate.markStartTimeMs("getProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            View view = (View) ((C36570n) wVar4.f152539x).getValue();
            SnsMethodCalculate.markEndTimeMs("getProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            SnsMethodCalculate.markEndTimeMs("access$getProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/sheet/SnsLabelDetailDialog$initView$2$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/sheet/SnsLabelDetailDialog$initView$2$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C54360w wVar5 = this.f152550d;
            SnsMethodCalculate.markStartTimeMs("access$getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            wVar5.getClass();
            SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            SnsMethodCalculate.markEndTimeMs("access$getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            ((C54359v) ((C36570n) wVar5.f152533C).getValue()).notifyDataSetChanged();
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2$2");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54367y(C54360w wVar, C15601d<? super C54367y> dVar) {
        super(2, dVar);
        this.f152549e = wVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2");
        C54367y yVar = new C54367y(this.f152549e, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2");
        return yVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2");
        Object invokeSuspend = ((C54367y) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152548d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C28251b a = C28250a.m38138a();
            C54360w wVar = this.f152549e;
            wVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getLabelName", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            String str = wVar.f152535t;
            SnsMethodCalculate.markEndTimeMs("getLabelName", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
            List<String> k = ((C67001a) C28250a.m38138a()).mo90973k(((C67001a) a).mo90968f(str));
            if (k != null) {
                C54360w wVar2 = this.f152549e;
                for (String str2 : k) {
                    ArrayList L = C54360w.m61051L(wVar2);
                    SnsMethodCalculate.markStartTimeMs("access$getCstg", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
                    SnsMethodCalculate.markStartTimeMs("getCstg", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
                    C44668u3 u3Var = (C44668u3) ((C36570n) wVar2.f152531A).getValue();
                    SnsMethodCalculate.markEndTimeMs("getCstg", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
                    SnsMethodCalculate.markEndTimeMs("access$getCstg", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog");
                    L.add(u3Var.get(str2));
                }
            }
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C54368a aVar2 = new C54368a(this.f152549e, (C15601d<? super C54368a>) null);
            this.f152548d = 1;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2");
            throw illegalStateException;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$2");
        return b0Var;
    }
}
