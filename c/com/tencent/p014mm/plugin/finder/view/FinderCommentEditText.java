package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aR)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderCommentEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "", "", "Ljava/util/LinkedList;", "", "E", "Ljava/util/Map;", "getPastedList", "()Ljava/util/Map;", "pastedList", "F", "J", "getFeedId", "()J", "setFeedId", "(J)V", "feedId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentEditText */
public final class FinderCommentEditText extends MMEditText {

    /* renamed from: E */
    public final Map<Long, LinkedList<String>> f198148E = new HashMap();

    /* renamed from: F */
    public long f198149F = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCommentEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f220606r.add(new C68954g1(this));
    }

    public final long getFeedId() {
        return this.f198149F;
    }

    public final Map<Long, LinkedList<String>> getPastedList() {
        return this.f198148E;
    }

    public final void setFeedId(long j) {
        this.f198149F = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCommentEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f220606r.add(new C68954g1(this));
    }
}
