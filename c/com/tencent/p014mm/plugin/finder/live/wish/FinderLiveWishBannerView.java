package com.tencent.p014mm.plugin.finder.live.wish;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cj1.C0639y1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.live.view.FinderFixedTextView;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveLoopBannerView;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import ht1.C60200t1;
import ig1.C8916d;
import k60.C60979d;
import kotlin.Metadata;
import l60.C99342a;
import l60.C99344b;
import ml1.C10928a;
import nh1.C11166u;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import te3.C50767p11;
import te3.C51428tp2;
import up1.C27696y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/wish/FinderLiveWishBannerView;", "Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView;", "Lte3/tp2;", "Lml1/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.wish.FinderLiveWishBannerView */
public final class FinderLiveWishBannerView extends FinderLiveLoopBannerView<C51428tp2, C10928a> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveWishBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* renamed from: d */
    public void mo3451d(RecyclerView.C16631z zVar, int i) {
        C10928a aVar = (C10928a) zVar;
        C87412m.m108594g(aVar, "holder");
        Object obj = getDataList().get(i);
        C87412m.m108593f(obj, "dataList[position]");
        C51428tp2 tp22 = (C51428tp2) obj;
        C11166u uVar = aVar.f32579z;
        C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2();
        C0639y1 y1Var = C0639y1.f1510a;
        C50767p11 p112 = tp22.f142318d;
        String str = null;
        C8916d d = y1Var.mo612d(p112 != null ? p112.f139507d : null);
        if (d != null) {
            str = d.field_thumbnailFileUrl;
        }
        C99344b<C100810g0, Bitmap> a = f2.mo85955a(new C11984n0(str, C27696y.THUMB_IMAGE));
        ImageView imageView = uVar.f32958b;
        C87412m.m108593f(imageView, "wishIcon");
        ((C99342a) a).mo85954d(imageView);
        if (tp22.f142320f >= tp22.f142319e) {
            uVar.f32960d.setVisibility(8);
            uVar.f32961e.setVisibility(8);
            uVar.f32959c.setVisibility(0);
            return;
        }
        uVar.f32960d.setVisibility(0);
        uVar.f32961e.setVisibility(0);
        uVar.f32959c.setVisibility(8);
        uVar.f32960d.setText(String.valueOf(tp22.f142320f));
        FinderFixedTextView finderFixedTextView = uVar.f32961e;
        StringBuilder sb = new StringBuilder();
        sb.append(XVFSFile.SEPARATOR_CHAR);
        sb.append(tp22.f142319e);
        finderFixedTextView.setText(sb.toString());
    }

    /* renamed from: e */
    public RecyclerView.C16631z mo3452e(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        return new C10928a(C11166u.m11043a(C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b1l, (ViewGroup) null, false)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveWishBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
