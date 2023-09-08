package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R(\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView$a;", "searchViewListener", "Lrx3/b0;", "setSearchViewListener", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "<set-?>", "e", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "getFtsEditText", "()Lcom/tencent/mm/ui/search/FTSEditTextView;", "ftsEditText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView */
public final class FTSSearchNoActionBarView extends LinearLayout {

    /* renamed from: d */
    public View f163428d;

    /* renamed from: e */
    public FTSEditTextView f163429e;

    /* renamed from: f */
    public C57073a f163430f;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView$a */
    public interface C57073a {
        void onClickBackBtn(View view);
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView$b */
    public static final class C57074b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FTSSearchNoActionBarView f163431d;

        public C57074b(FTSSearchNoActionBarView fTSSearchNoActionBarView) {
            this.f163431d = fTSSearchNoActionBarView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C57073a aVar = this.f163431d.f163430f;
            if (aVar != null) {
                C87412m.m108591d(aVar);
                aVar.onClickBackBtn(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public FTSSearchNoActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo80502a();
    }

    /* renamed from: a */
    public final void mo80502a() {
        Object systemService = getContext().getSystemService("layout_inflater");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(C0966R.C0971layout.atn, this, true);
        View findViewById = findViewById(C0966R.C0970id.apy);
        this.f163428d = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new C57074b(this));
        }
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.j5t);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        View findViewById2 = findViewById(C0966R.C0970id.eg6);
        C87412m.m108592e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.ui.search.FTSEditTextView");
        this.f163429e = (FTSEditTextView) findViewById2;
    }

    public final FTSEditTextView getFtsEditText() {
        return this.f163429e;
    }

    public final void setSearchViewListener(C57073a aVar) {
        this.f163430f = aVar;
    }

    public FTSSearchNoActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo80502a();
    }
}
