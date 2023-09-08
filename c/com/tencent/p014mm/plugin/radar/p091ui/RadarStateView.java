package com.tencent.p014mm.plugin.radar.p091ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.radar.model.RadarAddContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import fg2.C45778r;
import fg2.C45780t;
import fg2.C45781u;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarStateView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$d;", "d", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$d;", "getState", "()Lcom/tencent/mm/plugin/radar/model/RadarAddContact$d;", "setState", "(Lcom/tencent/mm/plugin/radar/model/RadarAddContact$d;)V", "state", "Landroid/view/animation/Animation;", "g", "Lrx3/g;", "getSlideOutAnim", "()Landroid/view/animation/Animation;", "slideOutAnim", "h", "getSlideInAnim", "slideInAnim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarStateView */
public final class RadarStateView extends RelativeLayout {

    /* renamed from: j */
    public static final /* synthetic */ int f115873j = 0;

    /* renamed from: d */
    public RadarAddContact.C70378d f115874d = RadarAddContact.C70378d.Stranger;

    /* renamed from: e */
    public boolean f115875e = true;

    /* renamed from: f */
    public final C45781u f115876f = new C45781u(this);

    /* renamed from: g */
    public final C13601g f115877g = C36568h.m40985a(new C45780t(this));

    /* renamed from: h */
    public final C13601g f115878h = C36568h.m40985a(new C45778r(this));

    /* renamed from: i */
    public ImageView f115879i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    private final Animation getSlideInAnim() {
        Object value = this.f115878h.getValue();
        C87412m.m108593f(value, "<get-slideInAnim>(...)");
        return (Animation) value;
    }

    private final Animation getSlideOutAnim() {
        Object value = this.f115877g.getValue();
        C87412m.m108593f(value, "<get-slideOutAnim>(...)");
        return (Animation) value;
    }

    /* renamed from: a */
    public final void mo66962a() {
        if (this.f115879i == null) {
            this.f115879i = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.setMargins(0, 0, C76577a.m92151b(getContext(), 5), C76577a.m92151b(getContext(), 2));
            ImageView imageView = this.f115879i;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            addView(this.f115879i);
        }
    }

    /* renamed from: b */
    public final void mo66963b() {
        if (this.f115875e) {
            mo66962a();
            mo66965d();
            startAnimation(getSlideInAnim());
        }
    }

    /* renamed from: c */
    public final void mo66964c() {
        if (this.f115875e) {
            mo66962a();
            mo66965d();
            startAnimation(getSlideOutAnim());
        }
    }

    /* renamed from: d */
    public final void mo66965d() {
        Log.m105918d("MicroMsg.RadarStateView", " state : " + this.f115874d);
        if (!this.f115875e) {
            setVisibility(8);
            return;
        }
        int ordinal = this.f115874d.ordinal();
        if (ordinal == 0) {
            setVisibility(8);
        } else if (ordinal == 1) {
            setBackgroundResource(C0966R.raw.radar_search_blue_bg);
            ImageView imageView = this.f115879i;
            C87412m.m108591d(imageView);
            imageView.setImageResource(C0966R.raw.radar_search_waiting);
            setVisibility(0);
        } else if (ordinal == 2) {
            setBackgroundResource(C0966R.raw.radar_search_green_bg);
            ImageView imageView2 = this.f115879i;
            C87412m.m108591d(imageView2);
            imageView2.setImageResource(C0966R.raw.radar_search_ok);
            setVisibility(0);
        } else if (ordinal == 3) {
            setBackgroundResource(C0966R.raw.radar_search_green_bg);
            ImageView imageView3 = this.f115879i;
            C87412m.m108591d(imageView3);
            imageView3.setImageResource(C0966R.raw.radar_search_hi);
            setVisibility(0);
        }
    }

    public final RadarAddContact.C70378d getState() {
        return this.f115874d;
    }

    public final void setState(RadarAddContact.C70378d dVar) {
        C87412m.m108594g(dVar, "<set-?>");
        this.f115874d = dVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
