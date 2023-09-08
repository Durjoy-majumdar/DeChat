package com.tencent.p014mm.plugin.sns.p106ui.improve.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import eu2.C97709g;
import gy3.C87412m;
import iu2.C98799a;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import kotlin.Metadata;
import rx3.C13598b0;
import vt2.C102279c;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveRepostView;", "Lcom/tencent/mm/view/x2c/X2CLinearLayout;", "Leu2/g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView */
public final class ImproveRepostView extends X2CLinearLayout implements C97709g {

    /* renamed from: d */
    public C98799a f279901d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView$a */
    public static final class C95896a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveRepostView f279902d;

        public C95896a(ImproveRepostView improveRepostView) {
            this.f279902d = improveRepostView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveRepostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView$1");
            C94866e1.cy0().mo131278b(this.f279902d.getContext());
            C39818r rVar = C39818r.f106831a;
            Context context = this.f279902d.getContext();
            C87412m.m108593f(context, "context");
            MvvmList<C98799a> d3 = ((C102279c) rVar.mo62443b(context).mo75002a(C102279c.class)).mo141841d3();
            ImproveRepostView improveRepostView = this.f279902d;
            SnsMethodCalculate.markStartTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
            C98799a aVar = improveRepostView.f279901d;
            SnsMethodCalculate.markEndTimeMs("access$getItem$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
            C87412m.m108591d(aVar);
            d3.mo129612p(aVar);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRepostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public ImproveRepostView(Context context) {
        super(context);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d5n, this, true);
        findViewById(C0966R.C0970id.jvj).setOnClickListener(new C95896a(this));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    /* renamed from: c */
    public void mo133276c() {
        SnsMethodCalculate.markStartTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        SnsMethodCalculate.markEndTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
    }

    /* renamed from: d */
    public void mo133277d() {
        SnsMethodCalculate.markStartTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
    }

    /* renamed from: f */
    public boolean mo133278f(C60905o oVar, C98799a aVar, int i) {
        SnsMethodCalculate.markStartTimeMs("measure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        SnsMethodCalculate.markEndTimeMs("measure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        return true;
    }

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        this.f279901d = aVar;
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        return b0Var;
    }

    /* renamed from: h */
    public void mo81008h() {
        SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
    }

    public String name() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        return "ImproveRepostView";
    }

    public ImproveRepostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d5n, this, true);
        findViewById(C0966R.C0970id.jvj).setOnClickListener(new C95896a(this));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public ImproveRepostView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d5n, this, true);
        findViewById(C0966R.C0970id.jvj).setOnClickListener(new C95896a(this));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }
}
