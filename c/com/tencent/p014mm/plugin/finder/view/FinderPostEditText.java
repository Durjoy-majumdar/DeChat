package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderPostEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "", "F", "I", "getLastSelection", "()I", "setLastSelection", "(I)V", "lastSelection", "Lkotlin/Function2;", "Lrx3/b0;", "G", "Lfy3/p;", "getOnSelectionChangedListener", "()Lfy3/p;", "setOnSelectionChangedListener", "(Lfy3/p;)V", "onSelectionChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderPostEditText */
public final class FinderPostEditText extends MMEditText {

    /* renamed from: E */
    public final String f198150E = "Finder.FinderPostEditText";

    /* renamed from: F */
    public int f198151F;

    /* renamed from: G */
    public C32227p<? super Integer, ? super Integer, C13598b0> f198152G;

    public FinderPostEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int getLastSelection() {
        return this.f198151F;
    }

    public final C32227p<Integer, Integer, C13598b0> getOnSelectionChangedListener() {
        return this.f198152G;
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        String str = this.f198150E;
        Log.m105924i(str, "onSelectionChanged start " + i + ", end " + i2);
        if (this.f198151F != i) {
            C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f198152G;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(i), Integer.valueOf(this.f198151F));
            }
            this.f198151F = i;
        }
    }

    public final void setLastSelection(int i) {
        this.f198151F = i;
    }

    public final void setOnSelectionChangedListener(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f198152G = pVar;
    }

    public FinderPostEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
