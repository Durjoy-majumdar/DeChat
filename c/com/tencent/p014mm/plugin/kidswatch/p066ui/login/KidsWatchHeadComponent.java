package com.tencent.p014mm.plugin.kidswatch.p066ui.login;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import p192l4.C10462b;
import rx3.C13598b0;
import v12.C14404b;
import x12.C15616a;
import x12.C15617b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent;", "Landroid/widget/RelativeLayout;", "", "title", "Lrx3/b0;", "setTitle", "", "resId", "setCloseIconResId", "Lkotlin/Function0;", "d", "Lfy3/a;", "getCloseBtnCallBack", "()Lfy3/a;", "setCloseBtnCallBack", "(Lfy3/a;)V", "closeBtnCallBack", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent */
public final class KidsWatchHeadComponent extends RelativeLayout {

    /* renamed from: d */
    public C32224a<C13598b0> f19754d;

    /* renamed from: e */
    public C14404b f19755e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KidsWatchHeadComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359842b33, this, false);
        addView(inflate);
        int i2 = C0966R.C0970id.be5;
        WeImageView weImageView = (WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.be5);
        if (weImageView != null) {
            i2 = C0966R.C0970id.evn;
            WeImageView weImageView2 = (WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.evn);
            if (weImageView2 != null) {
                i2 = C0966R.C0970id.f359389ko0;
                TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f359389ko0);
                if (textView != null) {
                    this.f19755e = new C14404b((LinearLayout) inflate, weImageView, weImageView2, textView);
                    setNestedScrollingEnabled(true);
                    this.f19755e.f39984c.setVisibility(4);
                    this.f19755e.f39983b.setVisibility(4);
                    this.f19755e.f39982a.setBackground(getContext().getDrawable(C0966R.raw.icons_outlined_close));
                    this.f19755e.f39982a.setOnClickListener(new C15616a(this));
                    this.f19755e.f39983b.setOnClickListener(new C15617b(this));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public final C32224a<C13598b0> getCloseBtnCallBack() {
        return this.f19754d;
    }

    public final void setCloseBtnCallBack(C32224a<C13598b0> aVar) {
        this.f19754d = aVar;
    }

    public final void setCloseIconResId(int i) {
        this.f19755e.f39982a.setBackground(getContext().getDrawable(i));
    }

    public final void setTitle(String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f19755e.f39984c.setText(str);
        this.f19755e.f39984c.setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KidsWatchHeadComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
