package com.tencent.p014mm.plugin.finder.view.indictor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import es1.C45691a;
import es1.C45692b;
import es1.C45693c;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import zp3.C23571u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'B%\b\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b&\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001d¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaBannerIndicator;", "Landroid/widget/LinearLayout;", "Lzp3/u;", "", "isShow", "Lrx3/b0;", "setShowOnlyOneIndicator", "", "count", "setCount", "getCount", "i", "setCurrentIndex", "getCurrentIndex", "Landroid/view/View;", "getView", "Lzp3/u$a;", "listener", "setOnSelectedPageListener", "getOnSelectedPageListener", "Landroid/widget/TextView;", "d", "Lrx3/g;", "getIndicatorTv", "()Landroid/widget/TextView;", "indicatorTv", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "e", "getIndicatorLeft", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "indicatorLeft", "f", "getIndicatorRight", "indicatorRight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.indictor.FinderMediaBannerIndicator */
public final class FinderMediaBannerIndicator extends LinearLayout implements C23571u {

    /* renamed from: d */
    public final C13601g f111935d = C36568h.m40985a(new C45693c(this));

    /* renamed from: e */
    public final C13601g f111936e = C36568h.m40985a(new C45691a(this));

    /* renamed from: f */
    public final C13601g f111937f = C36568h.m40985a(new C45692b(this));

    /* renamed from: g */
    public C23571u.C23572a f111938g;

    /* renamed from: h */
    public int f111939h;

    /* renamed from: i */
    public int f111940i;

    public FinderMediaBannerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.alg, this, true);
    }

    private final WeImageView getIndicatorLeft() {
        Object value = this.f111936e.getValue();
        C87412m.m108593f(value, "<get-indicatorLeft>(...)");
        return (WeImageView) value;
    }

    private final WeImageView getIndicatorRight() {
        Object value = this.f111937f.getValue();
        C87412m.m108593f(value, "<get-indicatorRight>(...)");
        return (WeImageView) value;
    }

    private final TextView getIndicatorTv() {
        Object value = this.f111935d.getValue();
        C87412m.m108593f(value, "<get-indicatorTv>(...)");
        return (TextView) value;
    }

    public int getCount() {
        return this.f111939h;
    }

    public int getCurrentIndex() {
        return this.f111940i;
    }

    public C23571u.C23572a getOnSelectedPageListener() {
        return this.f111938g;
    }

    public View getView() {
        return this;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C23571u.C23572a aVar;
        C23571u.C23572a aVar2;
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getX() <= ((float) (getWidth() / 2))) {
                int i = this.f111940i;
                if (i >= 1 && (aVar2 = this.f111938g) != null) {
                    aVar2.mo4664a(i - 1);
                }
            } else {
                int i2 = this.f111940i;
                if (i2 + 1 < this.f111939h && (aVar = this.f111938g) != null) {
                    aVar.mo4664a(i2 + 1);
                }
            }
        }
        return true;
    }

    public void setCount(int i) {
        this.f111939h = i;
        setCurrentIndex(0);
    }

    public void setCurrentIndex(int i) {
        int i2 = i + 1;
        int i3 = this.f111939h;
        int i4 = i2 > i3 ? 0 : i;
        if (i3 == 1) {
            getIndicatorRight().setIconColor(getContext().getResources().getColor(C0966R.color.f3580yc));
            getIndicatorLeft().setIconColor(getContext().getResources().getColor(C0966R.color.f3580yc));
        } else if (i4 == 0) {
            getIndicatorLeft().setIconColor(getContext().getResources().getColor(C0966R.color.f3580yc));
            getIndicatorRight().setIconColor(getContext().getResources().getColor(C0966R.color.f3585yj));
        } else if (i4 + 1 == i3) {
            getIndicatorRight().setIconColor(getContext().getResources().getColor(C0966R.color.f3580yc));
            getIndicatorLeft().setIconColor(getContext().getResources().getColor(C0966R.color.f3585yj));
        }
        this.f111940i = i;
        TextView indicatorTv = getIndicatorTv();
        indicatorTv.setText((i4 + 1) + " / " + this.f111939h);
    }

    public void setOnSelectedPageListener(C23571u.C23572a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f111938g = aVar;
    }

    public void setShowOnlyOneIndicator(boolean z) {
    }

    public FinderMediaBannerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.alg, this, true);
    }
}
