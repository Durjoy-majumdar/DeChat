package com.tencent.p014mm.plugin.radar.p091ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import eg2.C75617h;
import fg2.C45774n;
import fg2.C45776p;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarStateChooseView;", "Landroid/widget/RelativeLayout;", "Landroid/view/animation/Animation;", "d", "Lrx3/g;", "getSlideOutAnim", "()Landroid/view/animation/Animation;", "slideOutAnim", "e", "getSlideInAnim", "slideInAnim", "Leg2/h$a;", "g", "Leg2/h$a;", "getMStatus", "()Leg2/h$a;", "setMStatus", "(Leg2/h$a;)V", "mStatus", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarStateChooseView */
public final class RadarStateChooseView extends RelativeLayout {

    /* renamed from: h */
    public static final /* synthetic */ int f115868h = 0;

    /* renamed from: d */
    public final C13601g f115869d = C36568h.m40985a(new C45776p(this));

    /* renamed from: e */
    public final C13601g f115870e = C36568h.m40985a(new C45774n(this));

    /* renamed from: f */
    public boolean f115871f = true;

    /* renamed from: g */
    public C75617h.C45657a f115872g = C75617h.C45657a.UnSelected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarStateChooseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    private final Animation getSlideInAnim() {
        return (Animation) this.f115870e.getValue();
    }

    private final Animation getSlideOutAnim() {
        return (Animation) this.f115869d.getValue();
    }

    /* renamed from: a */
    public final void mo66958a() {
        int ordinal = this.f115872g.ordinal();
        if (ordinal == 0) {
            setBackgroundResource(C0966R.raw.radar_select);
            setVisibility(0);
        } else if (ordinal != 1) {
            setVisibility(4);
        } else {
            setVisibility(4);
        }
    }

    /* renamed from: b */
    public final void mo66959b(C75617h.C45657a aVar) {
        C87412m.m108594g(aVar, "status");
        if (this.f115872g != aVar) {
            this.f115872g = aVar;
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && this.f115871f) {
                    mo66958a();
                    startAnimation(getSlideInAnim());
                }
            } else if (this.f115871f) {
                mo66958a();
                startAnimation(getSlideOutAnim());
            }
        }
    }

    public final C75617h.C45657a getMStatus() {
        return this.f115872g;
    }

    public final void setMStatus(C75617h.C45657a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f115872g = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarStateChooseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
