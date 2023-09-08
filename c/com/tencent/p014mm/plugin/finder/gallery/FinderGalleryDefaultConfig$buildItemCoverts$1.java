package com.tencent.p014mm.plugin.finder.gallery;

import ag1.C0040b;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dq1.C7461a;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import hp1.C8703w0;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import kotlin.Metadata;
import p629ny.C76979h;
import ve1.C14590p;
import ve1.C14632t2;
import ve1.C14648u3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/gallery/FinderGalleryDefaultConfig$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryDefaultConfig$buildItemCoverts$1 */
public final class FinderGalleryDefaultConfig$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderGalleryDefaultConfig this$0;

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryDefaultConfig$buildItemCoverts$1$a */
    public static final class C3116a extends C14648u3 {

        /* renamed from: s */
        public final /* synthetic */ FinderGalleryDefaultConfig f14983s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3116a(FinderGalleryDefaultConfig finderGalleryDefaultConfig) {
            super(0, (C7461a) null, (C32229r) null, (C32224a) null, 15, (C8480h) null);
            this.f14983s = finderGalleryDefaultConfig;
        }

        /* renamed from: l */
        public void mo44e(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            if (this.f14983s.mo77478c()) {
                int color = oVar.f173499A.getResources().getColor(C0966R.color.f2949a6);
                int color2 = oVar.f173499A.getResources().getColor(C0966R.color.BW_100_Alpha_0_8);
                int color3 = oVar.f173499A.getResources().getColor(C0966R.color.f2975b6);
                View D = oVar.mo85812D(C0966R.C0970id.e2z);
                if (D != null) {
                    D.setBackgroundColor(color);
                }
                TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.e3v);
                if (textView != null) {
                    textView.setTextColor(color2);
                }
                TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.d86);
                if (textView2 != null) {
                    textView2.setTextColor(color3);
                }
            }
            TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.d86);
            if (textView3 != null) {
                if (!Util.isNullOrNil(baseFinderFeed.mo3513o().getDescription())) {
                    textView3.setVisibility(0);
                    C8703w0 w0Var = C8703w0.f27927a;
                    int i3 = C8703w0.f27928b;
                    Context context = MMApplicationContext.getContext();
                    String description = baseFinderFeed.mo3513o().getDescription();
                    TextPaint paint = textView3.getPaint();
                    C87412m.m108593f(paint, "paint");
                    textView3.setText(((C76979h) C86312j.m106911c(C76979h.class)).Te0(context, w0Var.mo9551b(description, paint, i3, "", true), 0.0f));
                } else {
                    textView3.setVisibility(8);
                    textView3.setText("");
                }
            }
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.d78);
            TextView textView4 = (TextView) oVar.mo85812D(C0966R.C0970id.e3v);
            imageView.setClickable(false);
            imageView.setEnabled(false);
            textView4.setClickable(false);
            textView4.setEnabled(false);
            C0040b bVar = C0040b.f48a;
            View view = oVar.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            bVar.mo46a(view, baseFinderFeed, true, this.f14983s.mo77478c());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryDefaultConfig$buildItemCoverts$1$b */
    public static final class C3117b extends C14632t2 {

        /* renamed from: s */
        public final /* synthetic */ FinderGalleryDefaultConfig f14984s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3117b(FinderGalleryDefaultConfig finderGalleryDefaultConfig) {
            super(0, (C7461a) null, (C32229r) null, (C32224a) null, 15, (C8480h) null);
            this.f14984s = finderGalleryDefaultConfig;
        }

        /* renamed from: l */
        public void mo44e(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            if (this.f14984s.mo77478c()) {
                int color = oVar.f173499A.getResources().getColor(C0966R.color.f2949a6);
                int color2 = oVar.f173499A.getResources().getColor(C0966R.color.BW_100_Alpha_0_8);
                int color3 = oVar.f173499A.getResources().getColor(C0966R.color.f2975b6);
                View D = oVar.mo85812D(C0966R.C0970id.e2z);
                if (D != null) {
                    D.setBackgroundColor(color);
                }
                TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.e3v);
                if (textView != null) {
                    textView.setTextColor(color2);
                }
                TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.d86);
                if (textView2 != null) {
                    textView2.setTextColor(color3);
                }
                ImageIndicatorView imageIndicatorView = (ImageIndicatorView) oVar.mo85812D(C0966R.C0970id.f4i);
                if (imageIndicatorView != null) {
                    imageIndicatorView.setBackgroundColor(oVar.f173499A.getResources().getColor(C0966R.color.f2949a6));
                }
            }
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.d78);
            TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.e3v);
            imageView.setClickable(false);
            imageView.setEnabled(false);
            textView3.setClickable(false);
            textView3.setEnabled(false);
            C0040b bVar = C0040b.f48a;
            View view = oVar.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            bVar.mo46a(view, baseFinderFeed, true, this.f14984s.mo77478c());
        }
    }

    public FinderGalleryDefaultConfig$buildItemCoverts$1(FinderGalleryDefaultConfig finderGalleryDefaultConfig) {
        this.this$0 = finderGalleryDefaultConfig;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == 2) {
            return new C3117b(this.this$0);
        }
        if (i == 4 || i == 9) {
            return new C3116a(this.this$0);
        }
        C58784w3.f168295a.mo83916b("FinderStaggeredConfig", i);
        return new C14590p();
    }
}
