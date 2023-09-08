package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import gy3.C87412m;
import kotlin.Metadata;
import ok1.C62042e;
import vd3.C78407r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000b¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/LiveNeat7extView;", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "", "V", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "W", "getInvalidateVerifyPassTag", "setInvalidateVerifyPassTag", "(Ljava/lang/String;)V", "invalidateVerifyPassTag", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.LiveNeat7extView */
public final class LiveNeat7extView extends MMNeat7extView {

    /* renamed from: V */
    public final String f270601V = "LiveNeat7extView";

    /* renamed from: W */
    public String f270602W = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveNeat7extView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public final String getInvalidateVerifyPassTag() {
        return this.f270602W;
    }

    public final String getTAG() {
        return this.f270601V;
    }

    public void invalidateDrawable(Drawable drawable) {
        C87412m.m108594g(drawable, "drawable");
        C62042e eVar = C62042e.f176370a;
        String str = this.f270601V;
        StringBuilder sb = new StringBuilder();
        sb.append("invalidateDrawable drawable:");
        String str2 = null;
        C78407r rVar = drawable instanceof C78407r ? (C78407r) drawable : null;
        if (rVar != null) {
            str2 = rVar.f229749j;
        }
        sb.append(str2);
        eVar.mo86998D1(str, sb.toString());
        super.invalidateDrawable(drawable);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C87412m.m108594g(drawable, "who");
        C87412m.m108594g(runnable, "what");
        C62042e eVar = C62042e.f176370a;
        String str = this.f270601V;
        StringBuilder sb = new StringBuilder();
        sb.append("scheduleDrawable drawable:");
        String str2 = null;
        C78407r rVar = drawable instanceof C78407r ? (C78407r) drawable : null;
        if (rVar != null) {
            str2 = rVar.f229749j;
        }
        sb.append(str2);
        eVar.mo86998D1(str, sb.toString());
        super.scheduleDrawable(drawable, runnable, j);
    }

    public final void setInvalidateVerifyPassTag(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f270602W = str;
    }

    public void unscheduleDrawable(Drawable drawable) {
        C62042e eVar = C62042e.f176370a;
        String str = this.f270601V;
        StringBuilder sb = new StringBuilder();
        sb.append("unscheduleDrawable drawable:");
        String str2 = null;
        C78407r rVar = drawable instanceof C78407r ? (C78407r) drawable : null;
        if (rVar != null) {
            str2 = rVar.f229749j;
        }
        sb.append(str2);
        eVar.mo86998D1(str, sb.toString());
        super.unscheduleDrawable(drawable);
    }

    public boolean verifyDrawable(Drawable drawable) {
        C87412m.m108594g(drawable, "who");
        boolean verifyDrawable = super.verifyDrawable(drawable);
        C62042e eVar = C62042e.f176370a;
        String str = this.f270601V;
        StringBuilder sb = new StringBuilder();
        sb.append("verifyDrawable superValud:");
        sb.append(verifyDrawable);
        sb.append(" view tag:");
        sb.append(this.f270602W);
        sb.append(",drawable tag:");
        boolean z = drawable instanceof C78407r;
        String str2 = null;
        C78407r rVar = z ? (C78407r) drawable : null;
        sb.append(rVar != null ? rVar.f229749j : null);
        eVar.mo86998D1(str, sb.toString());
        if (!verifyDrawable) {
            String str3 = this.f270602W;
            C78407r rVar2 = z ? (C78407r) drawable : null;
            if (rVar2 != null) {
                str2 = rVar2.f229749j;
            }
            return C87412m.m108589b(str3, str2);
        }
    }
}
