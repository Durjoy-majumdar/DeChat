package com.tencent.p014mm.plugin.finder.live.view;

import al1.C54130j;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import cj1.C54795n5;
import fj1.C45795b;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0019R\"\u0010\t\u001a\u00020\u00028\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u00020\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkView;", "Landroid/widget/RelativeLayout;", "", "d", "I", "getInitIndex", "()I", "setInitIndex", "(I)V", "initIndex", "", "isCurrentSelect", "Z", "()Z", "setCurrentSelect", "(Z)V", "isPanelOpen", "setPanelOpen", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveApplyLinkView */
public abstract class FinderLiveApplyLinkView extends RelativeLayout {

    /* renamed from: d */
    public int f159586d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveApplyLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo77789a(int i) {
    }

    /* renamed from: b */
    public void mo77768b() {
    }

    /* renamed from: c */
    public void mo77769c(int i) {
    }

    /* renamed from: d */
    public void mo77770d(int i) {
    }

    /* renamed from: e */
    public void mo77771e(C45795b bVar, C54795n5 n5Var) {
    }

    /* renamed from: f */
    public void mo77790f() {
    }

    /* renamed from: g */
    public abstract void mo77772g(boolean z, int i);

    public final int getInitIndex() {
        return this.f159586d;
    }

    /* renamed from: h */
    public abstract void mo77774h(long j);

    /* renamed from: i */
    public void mo77792i(C45795b bVar) {
    }

    /* renamed from: j */
    public abstract void mo77775j();

    /* renamed from: k */
    public abstract void mo77776k(boolean z, C54130j jVar);

    /* renamed from: l */
    public abstract void mo77777l(C45795b bVar);

    /* renamed from: m */
    public void mo77778m() {
    }

    public final void setCurrentSelect(boolean z) {
    }

    public final void setInitIndex(int i) {
        this.f159586d = i;
    }

    public final void setPanelOpen(boolean z) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveApplyLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
