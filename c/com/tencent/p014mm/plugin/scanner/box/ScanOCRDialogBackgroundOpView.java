package com.tencent.p014mm.plugin.scanner.box;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import vk2.C111550g;
import vk2.C111552g0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/box/ScanOCRDialogBackgroundOpView;", "Landroid/widget/RelativeLayout;", "Lvk2/g;", "", "getVieHeight", "Lvk2/g$a;", "listener", "Lrx3/b0;", "setOpListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView */
public final class ScanOCRDialogBackgroundOpView extends RelativeLayout implements C111550g {

    /* renamed from: d */
    public C111550g.C111551a f315796d;

    /* renamed from: e */
    public ImageView f315797e;

    /* renamed from: f */
    public int f315798f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanOCRDialogBackgroundOpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo151585a(int i) {
        if (i == 1) {
            ImageView imageView = this.f315797e;
            if (imageView != null) {
                imageView.setImageResource(C0966R.C0969drawable.c45);
            }
            ImageView imageView2 = this.f315797e;
            if (imageView2 != null) {
                imageView2.setContentDescription(getResources().getString(C0966R.string.f361233my0));
                return;
            }
            return;
        }
        ImageView imageView3 = this.f315797e;
        if (imageView3 != null) {
            imageView3.setImageResource(C0966R.C0969drawable.c46);
        }
        ImageView imageView4 = this.f315797e;
        if (imageView4 != null) {
            imageView4.setContentDescription(getResources().getString(C0966R.string.f361234my1));
        }
    }

    public int getVieHeight() {
        return this.f315798f;
    }

    public void release() {
        this.f315796d = null;
    }

    public void setOpListener(C111550g.C111551a aVar) {
        this.f315796d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanOCRDialogBackgroundOpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(C0966R.C0971layout.b4v, this, true).findViewById(C0966R.C0970id.lvo);
        this.f315797e = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new C111552g0(this));
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        Util.expandViewTouchArea(this.f315797e, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.f315798f = C76577a.m92151b(context, 28);
    }
}
