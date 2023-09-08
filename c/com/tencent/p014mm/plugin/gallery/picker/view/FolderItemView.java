package com.tencent.p014mm.plugin.gallery.picker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import gy3.C87412m;
import kotlin.Metadata;
import oj3.C62040b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/FolderItemView;", "Landroid/widget/FrameLayout;", "", "getLayoutId", "Loj3/b;", "d", "Loj3/b;", "getHolder", "()Loj3/b;", "setHolder", "(Loj3/b;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gallery.picker.view.FolderItemView */
public final class FolderItemView extends FrameLayout {

    /* renamed from: d */
    public C62040b f19097d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C85868k2.m106137b(getContext()).inflate(getLayoutId(), this).setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    public final C62040b getHolder() {
        C62040b bVar = this.f19097d;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("holder");
        throw null;
    }

    public final int getLayoutId() {
        return C0966R.C0971layout.buw;
    }

    public final void setHolder(C62040b bVar) {
        C87412m.m108594g(bVar, "<set-?>");
        this.f19097d = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C85868k2.m106137b(getContext()).inflate(getLayoutId(), this).setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }
}
