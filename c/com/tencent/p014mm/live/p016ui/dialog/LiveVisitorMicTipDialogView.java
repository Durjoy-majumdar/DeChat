package com.tencent.p014mm.live.p016ui.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/live/ui/dialog/LiveVisitorMicTipDialogView;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function1;", "", "Lrx3/b0;", "listener", "setOnButtonClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.ui.dialog.LiveVisitorMicTipDialogView */
public final class LiveVisitorMicTipDialogView extends RelativeLayout {

    /* renamed from: d */
    public C32226l<? super Boolean, C13598b0> f108421d;

    /* renamed from: com.tencent.mm.live.ui.dialog.LiveVisitorMicTipDialogView$a */
    public static final class C40335a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LiveVisitorMicTipDialogView f108422d;

        public C40335a(LiveVisitorMicTipDialogView liveVisitorMicTipDialogView) {
            this.f108422d = liveVisitorMicTipDialogView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/ui/dialog/LiveVisitorMicTipDialogView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<? super Boolean, C13598b0> lVar = this.f108422d.f108421d;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/ui/dialog/LiveVisitorMicTipDialogView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveVisitorMicTipDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        TextView textView = (TextView) LayoutInflater.from(context).inflate(C0966R.C0971layout.b7q, this, true).findViewById(C0966R.C0970id.fwe);
        if (textView != null) {
            textView.setOnClickListener(new C40335a(this));
        }
    }

    public final void setOnButtonClickListener(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f108421d = lVar;
    }
}
