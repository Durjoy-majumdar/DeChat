package com.tencent.p014mm.plugin.emojicapture.p841ui.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0013R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewChangeMode;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "Lrx3/b0;", "d", "Lfy3/l;", "getOnModeSelected", "()Lfy3/l;", "setOnModeSelected", "(Lfy3/l;)V", "onModeSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewChangeMode */
public final class StickerPreviewChangeMode extends FrameLayout {

    /* renamed from: d */
    public C32226l<? super Integer, C13598b0> f197891d;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewChangeMode$a */
    public static final class C68875a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StickerPreviewChangeMode f197892d;

        public C68875a(StickerPreviewChangeMode stickerPreviewChangeMode) {
            this.f197892d = stickerPreviewChangeMode;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewChangeMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<Integer, C13598b0> onModeSelected = this.f197892d.getOnModeSelected();
            if (onModeSelected != null) {
                onModeSelected.invoke(0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewChangeMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewChangeMode$b */
    public static final class C68876b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StickerPreviewChangeMode f197893d;

        public C68876b(StickerPreviewChangeMode stickerPreviewChangeMode) {
            this.f197893d = stickerPreviewChangeMode;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewChangeMode$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<Integer, C13598b0> onModeSelected = this.f197893d.getOnModeSelected();
            if (onModeSelected != null) {
                onModeSelected.invoke(1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewChangeMode$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewChangeMode$c */
    public static final class C68877c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StickerPreviewChangeMode f197894d;

        public C68877c(StickerPreviewChangeMode stickerPreviewChangeMode) {
            this.f197894d = stickerPreviewChangeMode;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewChangeMode$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<Integer, C13598b0> onModeSelected = this.f197894d.getOnModeSelected();
            if (onModeSelected != null) {
                onModeSelected.invoke(2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/preview/StickerPreviewChangeMode$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPreviewChangeMode(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.c5o, this);
        findViewById(C0966R.C0970id.k2c).setOnClickListener(new C68875a(this));
        findViewById(C0966R.C0970id.k2e).setOnClickListener(new C68876b(this));
        findViewById(C0966R.C0970id.k2d).setOnClickListener(new C68877c(this));
    }

    public final C32226l<Integer, C13598b0> getOnModeSelected() {
        return this.f197891d;
    }

    public final void setOnModeSelected(C32226l<? super Integer, C13598b0> lVar) {
        this.f197891d = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickerPreviewChangeMode(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
