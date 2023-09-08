package com.tencent.p014mm.plugin.gamelife.p062ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Lrx3/b0;", "callback", "setOnClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gamelife_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView */
public final class GameLifeLoadingCoverView extends FrameLayout {

    /* renamed from: d */
    public final View f19331d;

    /* renamed from: e */
    public final View f19332e;

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView$a */
    public static final class C4575a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ GameLifeLoadingCoverView f19333d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f19334e;

        public C4575a(GameLifeLoadingCoverView gameLifeLoadingCoverView, C32224a<C13598b0> aVar) {
            this.f19333d = gameLifeLoadingCoverView;
            this.f19334e = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f19333d.f19332e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f19333d.f19331d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f19334e.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView$setOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GameLifeLoadingCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GameLifeLoadingCoverView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setOnClickListener(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f19332e.setOnClickListener(new C4575a(this, aVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GameLifeLoadingCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setBackgroundResource(C0966R.color.f2929c);
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.ay_, this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(inflate, layoutParams);
        this.f19331d = findViewById(C0966R.C0970id.g2z);
        this.f19332e = findViewById(C0966R.C0970id.g3_);
    }
}
