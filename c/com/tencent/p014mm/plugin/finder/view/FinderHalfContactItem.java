package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import te3.hp4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHalfContactItem;", "Landroid/widget/FrameLayout;", "", "title", "Lrx3/b0;", "setTitle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderHalfContactItem */
public final class FinderHalfContactItem extends FrameLayout {

    /* renamed from: d */
    public String f111881d = "";

    /* renamed from: e */
    public final List<ImageView> f111882e = new LinkedList();

    /* renamed from: f */
    public hp4 f111883f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHalfContactItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo64652a();
    }

    /* renamed from: a */
    public final void mo64652a() {
        Object systemService = getContext().getSystemService("layout_inflater");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(C0966R.C0971layout.ayx, this, true);
        this.f111882e.clear();
        this.f111882e.add(findViewById(C0966R.C0970id.f4l));
        this.f111882e.add(findViewById(C0966R.C0970id.f4m));
        this.f111882e.add(findViewById(C0966R.C0970id.f4n));
        this.f111882e.add(findViewById(C0966R.C0970id.f4o));
    }

    /* renamed from: b */
    public final void mo64653b() {
        for (ImageView next : this.f111882e) {
            if (next != null) {
                next.setVisibility(8);
            }
        }
        hp4 hp4 = this.f111883f;
        if (hp4 != null) {
            int size = hp4.f134812d.size();
            int i = 0;
            while (i < size && i < ((LinkedList) this.f111882e).size()) {
                ImageView imageView = (ImageView) ((LinkedList) this.f111882e).get(i);
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ((C60200t1) C86312j.m106911c(C60200t1.class)).kc0().mo8974a(hp4.f134812d.get(i), imageView);
                i++;
            }
        }
    }

    public final void setTitle(String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f111881d = str;
        View findViewById = findViewById(C0966R.C0970id.f5772o8);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        if (!Util.isNullOrNil(this.f111881d)) {
            textView.setText(this.f111881d);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C76577a.m92157h(getContext(), C0966R.dimen.f3815f9);
            textView.setLayoutParams(layoutParams);
        } else {
            textView.setText("");
        }
        mo64653b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHalfContactItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo64652a();
    }
}
