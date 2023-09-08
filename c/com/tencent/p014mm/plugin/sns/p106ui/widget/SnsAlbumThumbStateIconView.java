package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13603j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView */
public final class SnsAlbumThumbStateIconView extends FrameLayout {

    /* renamed from: d */
    public final String f21263d;

    /* renamed from: e */
    public FrameLayout f21264e;

    /* renamed from: f */
    public ImageView f21265f;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$a */
    public enum C5485a {
        Group,
        Private,
        Error
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsAlbumThumbStateIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f21263d = "MicroMsg.SnsAlbumThumbStateIconView";
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d5o, this, true);
    }

    /* renamed from: a */
    public final void mo6500a(C5485a aVar) {
        Drawable drawable;
        SnsMethodCalculate.markStartTimeMs("showIconWithState", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
        C87412m.m108594g(aVar, "state");
        if (this.f21264e == null) {
            this.f21264e = (FrameLayout) findViewById(C0966R.C0970id.nwj);
        }
        if (this.f21265f == null) {
            FrameLayout frameLayout = this.f21264e;
            this.f21265f = frameLayout != null ? (ImageView) frameLayout.findViewById(C0966R.C0970id.nwi) : null;
        }
        String str = this.f21263d;
        Log.m105924i(str, "showIconWithState state: " + aVar);
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            drawable = C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_group_detail, getContext().getResources().getColor(C0966R.color.al9));
        } else if (ordinal == 1) {
            drawable = C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_lock, getContext().getResources().getColor(C0966R.color.al9));
        } else if (ordinal == 2) {
            drawable = C76577a.m92158i(getContext(), C0966R.C0969drawable.bj9);
        } else {
            C13603j jVar = new C13603j();
            SnsMethodCalculate.markEndTimeMs("showIconWithState", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
            throw jVar;
        }
        if (drawable != null) {
            FrameLayout frameLayout2 = this.f21264e;
            if (frameLayout2 != null) {
                frameLayout2.setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.cnx));
            }
            ImageView imageView = this.f21265f;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            ImageView imageView2 = this.f21265f;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        SnsMethodCalculate.markEndTimeMs("showIconWithState", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SnsAlbumThumbStateIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
