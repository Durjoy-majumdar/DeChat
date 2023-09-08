package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100B%\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u00101\u001a\u00020\u001f¢\u0006\u0004\b/\u00102R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%¨\u00063"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderJumperView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "d", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getIconIv", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "iconIv", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getDescTv", "()Landroid/widget/TextView;", "descTv", "f", "getTipsTv", "tipsTv", "Landroid/widget/ImageView;", "g", "Landroid/widget/ImageView;", "getIconDefaultIv", "()Landroid/widget/ImageView;", "iconDefaultIv", "", "h", "Ljava/lang/String;", "getDefaultTitle", "()Ljava/lang/String;", "setDefaultTitle", "(Ljava/lang/String;)V", "defaultTitle", "", "i", "I", "getDefaultIconId", "()I", "setDefaultIconId", "(I)V", "defaultIconId", "j", "getFilledIconId", "setFilledIconId", "filledIconId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderJumperView */
public final class FinderJumperView extends RelativeLayout {

    /* renamed from: n */
    public static final /* synthetic */ int f17821n = 0;

    /* renamed from: d */
    public final WeImageView f17822d;

    /* renamed from: e */
    public final TextView f17823e;

    /* renamed from: f */
    public final TextView f17824f;

    /* renamed from: g */
    public final ImageView f17825g;

    /* renamed from: h */
    public String f17826h = "";

    /* renamed from: i */
    public int f17827i;

    /* renamed from: j */
    public int f17828j;

    public FinderJumperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.alc, this, true);
        View findViewById = findViewById(C0966R.C0970id.baz);
        C87412m.m108593f(findViewById, "findViewById(R.id.choose_product_iv)");
        this.f17822d = (WeImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.f357702bb2);
        C87412m.m108593f(findViewById2, "findViewById(R.id.choose_product_tv)");
        this.f17823e = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.o5m);
        C87412m.m108593f(findViewById3, "findViewById(R.id.choose_product_tips_tv)");
        this.f17824f = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f357700bb0);
        C87412m.m108593f(findViewById4, "findViewById(R.id.choose_product_iv_default)");
        this.f17825g = (ImageView) findViewById4;
        mo4599b();
    }

    /* renamed from: a */
    public final void mo4598a(String str) {
        if (str == null || str.length() == 0) {
            this.f17824f.setVisibility(8);
            return;
        }
        this.f17824f.setVisibility(0);
        this.f17824f.setText(str);
    }

    /* renamed from: b */
    public final void mo4599b() {
        this.f17822d.setVisibility(0);
        this.f17825g.setVisibility(8);
        this.f17822d.setImageResource(this.f17827i);
        this.f17822d.setIconColor(getContext().getResources().getColor(C0966R.color.FG_0));
        this.f17823e.setText(this.f17826h);
    }

    /* renamed from: c */
    public final void mo4600c(String str, boolean z) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (z) {
            this.f17822d.setVisibility(0);
            this.f17825g.setVisibility(8);
            this.f17822d.setImageResource(this.f17828j);
            this.f17822d.setIconColor(getContext().getResources().getColor(C0966R.color.f2939n));
        } else {
            this.f17822d.setVisibility(8);
            this.f17825g.setVisibility(0);
        }
        this.f17823e.setText(str);
    }

    public final int getDefaultIconId() {
        return this.f17827i;
    }

    public final String getDefaultTitle() {
        return this.f17826h;
    }

    public final TextView getDescTv() {
        return this.f17823e;
    }

    public final int getFilledIconId() {
        return this.f17828j;
    }

    public final ImageView getIconDefaultIv() {
        return this.f17825g;
    }

    public final WeImageView getIconIv() {
        return this.f17822d;
    }

    public final TextView getTipsTv() {
        return this.f17824f;
    }

    public final void setDefaultIconId(int i) {
        this.f17827i = i;
    }

    public final void setDefaultTitle(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f17826h = str;
    }

    public final void setFilledIconId(int i) {
        this.f17828j = i;
    }

    public FinderJumperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.alc, this, true);
        View findViewById = findViewById(C0966R.C0970id.baz);
        C87412m.m108593f(findViewById, "findViewById(R.id.choose_product_iv)");
        this.f17822d = (WeImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.f357702bb2);
        C87412m.m108593f(findViewById2, "findViewById(R.id.choose_product_tv)");
        this.f17823e = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.o5m);
        C87412m.m108593f(findViewById3, "findViewById(R.id.choose_product_tips_tv)");
        this.f17824f = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f357700bb0);
        C87412m.m108593f(findViewById4, "findViewById(R.id.choose_product_iv_default)");
        this.f17825g = (ImageView) findViewById4;
        mo4599b();
    }
}
