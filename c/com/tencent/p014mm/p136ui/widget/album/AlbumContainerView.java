package com.tencent.p014mm.p136ui.widget.album;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010@\u001a\u00020?\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DB#\b\u0016\u0012\u0006\u0010@\u001a\u00020?\u0012\b\u0010B\u001a\u0004\u0018\u00010A\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bC\u0010GJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR$\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR$\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR$\u0010&\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR$\u0010*\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010\t\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR$\u0010.\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010\t\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\rR$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010:\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R$\u0010>\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u00103\"\u0004\b=\u00105¨\u0006H"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/album/AlbumContainerView;", "Lcom/tencent/mm/ui/widget/album/AlbumContainerViewBase;", "", "Landroid/view/View;", "targets", "Lrx3/b0;", "setItemVisibility", "Landroid/widget/ImageView;", "n", "Landroid/widget/ImageView;", "getImgItemView1", "()Landroid/widget/ImageView;", "setImgItemView1", "(Landroid/widget/ImageView;)V", "imgItemView1", "o", "getImgItemView2", "setImgItemView2", "imgItemView2", "p", "getImgItemView3", "setImgItemView3", "imgItemView3", "q", "getImgItemView4", "setImgItemView4", "imgItemView4", "r", "getImgItemView5", "setImgItemView5", "imgItemView5", "s", "getImgItemView6", "setImgItemView6", "imgItemView6", "t", "getImgItemView7", "setImgItemView7", "imgItemView7", "u", "getImgItemView8", "setImgItemView8", "imgItemView8", "v", "getImgItemView9", "setImgItemView9", "imgItemView9", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", "getTopContainer", "()Landroid/widget/LinearLayout;", "setTopContainer", "(Landroid/widget/LinearLayout;)V", "topContainer", "x", "getCenterContainer", "setCenterContainer", "centerContainer", "y", "getButtomContainer", "setButtomContainer", "buttomContainer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.album.AlbumContainerView */
public final class AlbumContainerView extends AlbumContainerViewBase {

    /* renamed from: n */
    public ImageView f220492n;

    /* renamed from: o */
    public ImageView f220493o;

    /* renamed from: p */
    public ImageView f220494p;

    /* renamed from: q */
    public ImageView f220495q;

    /* renamed from: r */
    public ImageView f220496r;

    /* renamed from: s */
    public ImageView f220497s;

    /* renamed from: t */
    public ImageView f220498t;

    /* renamed from: u */
    public ImageView f220499u;

    /* renamed from: v */
    public ImageView f220500v;

    /* renamed from: w */
    public LinearLayout f220501w;

    /* renamed from: x */
    public LinearLayout f220502x;

    /* renamed from: y */
    public LinearLayout f220503y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumContainerView(Context context, int i, int i2) {
        super(context, i, i2);
        C87412m.m108594g(context, "context");
    }

    private final void setItemVisibility(List<? extends View> list) {
        for (View view : list) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/widget/album/AlbumContainerView", "setItemVisibility", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/widget/album/AlbumContainerView", "setItemVisibility", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ArrayList<View> itemViews = getItemViews();
        ArrayList<View> arrayList = new ArrayList<>();
        for (T next : itemViews) {
            if (!list.contains((View) next)) {
                arrayList.add(next);
            }
        }
        for (View view3 : arrayList) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/widget/album/AlbumContainerView", "setItemVisibility", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/widget/album/AlbumContainerView", "setItemVisibility", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.height = 0;
            view3.setLayoutParams(layoutParams);
            ImageView imageView = view3 instanceof ImageView ? (ImageView) view3 : null;
            if (imageView != null) {
                imageView.setImageBitmap((Bitmap) null);
            }
        }
    }

    /* renamed from: c */
    public void mo94649c() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        linearLayout.setOrientation(1);
        addView(linearLayout, layoutParams);
        this.f220501w = new LinearLayout(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout2 = this.f220501w;
        if (linearLayout2 != null) {
            linearLayout2.setOrientation(0);
        }
        linearLayout.addView(this.f220501w, layoutParams2);
        int albumWidth = (getAlbumWidth() - (getGap() * 2)) / 3;
        int albumHeight = (getAlbumHeight() - (getGap() * 2)) / 3;
        ImageView imageView = new ImageView(getContext());
        getItemViews().add(imageView);
        this.f220492n = imageView;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(albumWidth, albumHeight);
        ImageView imageView2 = this.f220492n;
        if (imageView2 != null) {
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        LinearLayout linearLayout3 = this.f220501w;
        if (linearLayout3 != null) {
            linearLayout3.addView(this.f220492n, layoutParams3);
        }
        ImageView imageView3 = new ImageView(getContext());
        getItemViews().add(imageView3);
        this.f220493o = imageView3;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(albumWidth, albumHeight);
        layoutParams4.leftMargin = getGap();
        ImageView imageView4 = this.f220493o;
        if (imageView4 != null) {
            imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        LinearLayout linearLayout4 = this.f220501w;
        if (linearLayout4 != null) {
            linearLayout4.addView(this.f220493o, layoutParams4);
        }
        ImageView imageView5 = new ImageView(getContext());
        getItemViews().add(imageView5);
        this.f220494p = imageView5;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(albumWidth, albumHeight);
        layoutParams5.leftMargin = getGap();
        ImageView imageView6 = this.f220494p;
        if (imageView6 != null) {
            imageView6.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        LinearLayout linearLayout5 = this.f220501w;
        if (linearLayout5 != null) {
            linearLayout5.addView(this.f220494p, layoutParams5);
        }
        this.f220502x = new LinearLayout(getContext());
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout6 = this.f220502x;
        if (linearLayout6 != null) {
            linearLayout6.setOrientation(0);
        }
        linearLayout.addView(this.f220502x, layoutParams6);
        ImageView imageView7 = new ImageView(getContext());
        getItemViews().add(imageView7);
        this.f220495q = imageView7;
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(albumWidth, albumHeight);
        layoutParams7.topMargin = getGap();
        ImageView imageView8 = this.f220495q;
        if (imageView8 != null) {
            imageView8.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        LinearLayout linearLayout7 = this.f220502x;
        if (linearLayout7 != null) {
            linearLayout7.addView(this.f220495q, layoutParams7);
        }
        ImageView imageView9 = new ImageView(getContext());
        getItemViews().add(imageView9);
        this.f220496r = imageView9;
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(albumWidth, albumHeight);
        layoutParams8.leftMargin = getGap();
        layoutParams8.topMargin = getGap();
        ImageView imageView10 = this.f220496r;
        if (imageView10 != null) {
            imageView10.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        LinearLayout linearLayout8 = this.f220502x;
        if (linearLayout8 != null) {
            linearLayout8.addView(this.f220496r, layoutParams8);
        }
        ImageView imageView11 = new ImageView(getContext());
        getItemViews().add(imageView11);
        this.f220497s = imageView11;
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(albumWidth, albumHeight);
        layoutParams9.leftMargin = getGap();
        layoutParams9.topMargin = getGap();
        ImageView imageView12 = this.f220497s;
        if (imageView12 != null) {
            imageView12.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        LinearLayout linearLayout9 = this.f220502x;
        if (linearLayout9 != null) {
            linearLayout9.addView(this.f220497s, layoutParams9);
        }
        this.f220503y = new LinearLayout(getContext());
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout10 = this.f220503y;
        if (linearLayout10 != null) {
            linearLayout10.setOrientation(0);
        }
        linearLayout.addView(this.f220503y, layoutParams10);
        ImageView imageView13 = new ImageView(getContext());
        getItemViews().add(imageView13);
        this.f220498t = imageView13;
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(albumWidth, albumHeight);
        layoutParams11.topMargin = getGap();
        ImageView imageView14 = this.f220498t;
        if (imageView14 != null) {
            imageView14.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        LinearLayout linearLayout11 = this.f220503y;
        if (linearLayout11 != null) {
            linearLayout11.addView(this.f220498t, layoutParams11);
        }
        ImageView imageView15 = new ImageView(getContext());
        getItemViews().add(imageView15);
        this.f220499u = imageView15;
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(albumWidth, albumHeight);
        layoutParams12.leftMargin = getGap();
        layoutParams12.topMargin = getGap();
        ImageView imageView16 = this.f220499u;
        if (imageView16 != null) {
            imageView16.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        LinearLayout linearLayout12 = this.f220503y;
        if (linearLayout12 != null) {
            linearLayout12.addView(this.f220499u, layoutParams12);
        }
        ImageView imageView17 = new ImageView(getContext());
        getItemViews().add(imageView17);
        this.f220500v = imageView17;
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(albumWidth, albumHeight);
        layoutParams13.leftMargin = getGap();
        layoutParams13.topMargin = getGap();
        ImageView imageView18 = this.f220500v;
        if (imageView18 != null) {
            imageView18.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        LinearLayout linearLayout13 = this.f220503y;
        if (linearLayout13 != null) {
            linearLayout13.addView(this.f220500v, layoutParams13);
        }
    }

    /* renamed from: f */
    public final void mo104371f(int i) {
        if (i != 0) {
            ViewGroup.LayoutParams layoutParams = null;
            switch (i) {
                case 1:
                    ImageView imageView = this.f220492n;
                    if (imageView != null) {
                        layoutParams = imageView.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        layoutParams.width = getAlbumWidth();
                    }
                    if (layoutParams != null) {
                        layoutParams.height = getAlbumHeight();
                    }
                    ImageView imageView2 = this.f220492n;
                    if (imageView2 != null) {
                        imageView2.setLayoutParams(layoutParams);
                    }
                    ArrayList<View> itemViews = getItemViews();
                    ArrayList arrayList = new ArrayList();
                    for (T next : itemViews) {
                        if (C87412m.m108589b((View) next, this.f220492n)) {
                            arrayList.add(next);
                        }
                    }
                    setItemVisibility(arrayList);
                    C13598b0 b0Var = C13598b0.f38549a;
                    return;
                case 2:
                    int albumWidth = (getAlbumWidth() - getGap()) / 2;
                    ImageView imageView3 = this.f220492n;
                    ViewGroup.LayoutParams layoutParams2 = imageView3 != null ? imageView3.getLayoutParams() : null;
                    if (layoutParams2 != null) {
                        layoutParams2.width = albumWidth;
                    }
                    if (layoutParams2 != null) {
                        layoutParams2.height = getAlbumHeight();
                    }
                    ImageView imageView4 = this.f220492n;
                    if (imageView4 != null) {
                        imageView4.setLayoutParams(layoutParams2);
                    }
                    ImageView imageView5 = this.f220493o;
                    if (imageView5 != null) {
                        layoutParams = imageView5.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        layoutParams.width = albumWidth;
                    }
                    if (layoutParams != null) {
                        layoutParams.height = getAlbumHeight();
                    }
                    ImageView imageView6 = this.f220493o;
                    if (imageView6 != null) {
                        imageView6.setLayoutParams(layoutParams);
                    }
                    ArrayList<View> itemViews2 = getItemViews();
                    ArrayList arrayList2 = new ArrayList();
                    for (T next2 : itemViews2) {
                        View view = (View) next2;
                        if (C87412m.m108589b(view, this.f220492n) || C87412m.m108589b(view, this.f220493o)) {
                            arrayList2.add(next2);
                        }
                    }
                    setItemVisibility(arrayList2);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    return;
                case 3:
                    int albumWidth2 = (getAlbumWidth() - getGap()) / 2;
                    int albumHeight = (getAlbumHeight() - getGap()) / 2;
                    ImageView imageView7 = this.f220492n;
                    ViewGroup.LayoutParams layoutParams3 = imageView7 != null ? imageView7.getLayoutParams() : null;
                    if (layoutParams3 != null) {
                        layoutParams3.width = albumWidth2;
                    }
                    if (layoutParams3 != null) {
                        layoutParams3.height = albumHeight;
                    }
                    ImageView imageView8 = this.f220492n;
                    if (imageView8 != null) {
                        imageView8.setLayoutParams(layoutParams3);
                    }
                    ImageView imageView9 = this.f220493o;
                    ViewGroup.LayoutParams layoutParams4 = imageView9 != null ? imageView9.getLayoutParams() : null;
                    if (layoutParams4 != null) {
                        layoutParams4.width = albumWidth2;
                    }
                    if (layoutParams4 != null) {
                        layoutParams4.height = albumHeight;
                    }
                    ImageView imageView10 = this.f220493o;
                    if (imageView10 != null) {
                        imageView10.setLayoutParams(layoutParams4);
                    }
                    ImageView imageView11 = this.f220495q;
                    if (imageView11 != null) {
                        layoutParams = imageView11.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        layoutParams.width = getAlbumWidth();
                    }
                    if (layoutParams != null) {
                        layoutParams.height = albumHeight;
                    }
                    ImageView imageView12 = this.f220495q;
                    if (imageView12 != null) {
                        imageView12.setLayoutParams(layoutParams);
                    }
                    ArrayList<View> itemViews3 = getItemViews();
                    ArrayList arrayList3 = new ArrayList();
                    for (T next3 : itemViews3) {
                        View view2 = (View) next3;
                        if (C87412m.m108589b(view2, this.f220492n) || C87412m.m108589b(view2, this.f220493o) || C87412m.m108589b(view2, this.f220495q)) {
                            arrayList3.add(next3);
                        }
                    }
                    setItemVisibility(arrayList3);
                    C13598b0 b0Var3 = C13598b0.f38549a;
                    return;
                case 4:
                    int albumWidth3 = (getAlbumWidth() - getGap()) / 2;
                    int albumHeight2 = (getAlbumHeight() - getGap()) / 2;
                    ImageView imageView13 = this.f220492n;
                    ViewGroup.LayoutParams layoutParams5 = imageView13 != null ? imageView13.getLayoutParams() : null;
                    if (layoutParams5 != null) {
                        layoutParams5.width = albumWidth3;
                    }
                    if (layoutParams5 != null) {
                        layoutParams5.height = albumHeight2;
                    }
                    ImageView imageView14 = this.f220492n;
                    if (imageView14 != null) {
                        imageView14.setLayoutParams(layoutParams5);
                    }
                    ImageView imageView15 = this.f220493o;
                    ViewGroup.LayoutParams layoutParams6 = imageView15 != null ? imageView15.getLayoutParams() : null;
                    if (layoutParams6 != null) {
                        layoutParams6.width = albumWidth3;
                    }
                    if (layoutParams6 != null) {
                        layoutParams6.height = albumHeight2;
                    }
                    ImageView imageView16 = this.f220493o;
                    if (imageView16 != null) {
                        imageView16.setLayoutParams(layoutParams6);
                    }
                    ImageView imageView17 = this.f220495q;
                    ViewGroup.LayoutParams layoutParams7 = imageView17 != null ? imageView17.getLayoutParams() : null;
                    if (layoutParams7 != null) {
                        layoutParams7.width = albumWidth3;
                    }
                    if (layoutParams7 != null) {
                        layoutParams7.height = albumHeight2;
                    }
                    ImageView imageView18 = this.f220495q;
                    if (imageView18 != null) {
                        imageView18.setLayoutParams(layoutParams7);
                    }
                    ImageView imageView19 = this.f220496r;
                    if (imageView19 != null) {
                        layoutParams = imageView19.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        layoutParams.width = albumWidth3;
                    }
                    if (layoutParams != null) {
                        layoutParams.height = albumHeight2;
                    }
                    ImageView imageView20 = this.f220496r;
                    if (imageView20 != null) {
                        imageView20.setLayoutParams(layoutParams);
                    }
                    ArrayList<View> itemViews4 = getItemViews();
                    ArrayList arrayList4 = new ArrayList();
                    for (T next4 : itemViews4) {
                        View view3 = (View) next4;
                        if (C87412m.m108589b(view3, this.f220492n) || C87412m.m108589b(view3, this.f220493o) || C87412m.m108589b(view3, this.f220495q) || C87412m.m108589b(view3, this.f220496r)) {
                            arrayList4.add(next4);
                        }
                    }
                    setItemVisibility(arrayList4);
                    C13598b0 b0Var4 = C13598b0.f38549a;
                    return;
                case 5:
                    int albumWidth4 = (getAlbumWidth() - (getGap() * 2)) / 3;
                    int albumHeight3 = (getAlbumHeight() - getGap()) / 2;
                    ImageView imageView21 = this.f220492n;
                    ViewGroup.LayoutParams layoutParams8 = imageView21 != null ? imageView21.getLayoutParams() : null;
                    if (layoutParams8 != null) {
                        layoutParams8.width = albumWidth4;
                    }
                    if (layoutParams8 != null) {
                        layoutParams8.height = albumHeight3;
                    }
                    ImageView imageView22 = this.f220492n;
                    if (imageView22 != null) {
                        imageView22.setLayoutParams(layoutParams8);
                    }
                    ImageView imageView23 = this.f220493o;
                    ViewGroup.LayoutParams layoutParams9 = imageView23 != null ? imageView23.getLayoutParams() : null;
                    if (layoutParams9 != null) {
                        layoutParams9.width = albumWidth4;
                    }
                    if (layoutParams9 != null) {
                        layoutParams9.height = albumHeight3;
                    }
                    ImageView imageView24 = this.f220493o;
                    if (imageView24 != null) {
                        imageView24.setLayoutParams(layoutParams9);
                    }
                    ImageView imageView25 = this.f220494p;
                    ViewGroup.LayoutParams layoutParams10 = imageView25 != null ? imageView25.getLayoutParams() : null;
                    if (layoutParams10 != null) {
                        layoutParams10.width = albumWidth4;
                    }
                    if (layoutParams10 != null) {
                        layoutParams10.height = albumHeight3;
                    }
                    ImageView imageView26 = this.f220494p;
                    if (imageView26 != null) {
                        imageView26.setLayoutParams(layoutParams10);
                    }
                    ImageView imageView27 = this.f220495q;
                    ViewGroup.LayoutParams layoutParams11 = imageView27 != null ? imageView27.getLayoutParams() : null;
                    if (layoutParams11 != null) {
                        layoutParams11.width = albumWidth4;
                    }
                    if (layoutParams11 != null) {
                        layoutParams11.height = albumHeight3;
                    }
                    ImageView imageView28 = this.f220495q;
                    if (imageView28 != null) {
                        imageView28.setLayoutParams(layoutParams11);
                    }
                    ImageView imageView29 = this.f220496r;
                    if (imageView29 != null) {
                        layoutParams = imageView29.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        layoutParams.width = (albumWidth4 * 2) + getGap();
                    }
                    if (layoutParams != null) {
                        layoutParams.height = albumHeight3;
                    }
                    ImageView imageView30 = this.f220496r;
                    if (imageView30 != null) {
                        imageView30.setLayoutParams(layoutParams);
                    }
                    ArrayList<View> itemViews5 = getItemViews();
                    ArrayList arrayList5 = new ArrayList();
                    for (T next5 : itemViews5) {
                        View view4 = (View) next5;
                        if (C87412m.m108589b(view4, this.f220492n) || C87412m.m108589b(view4, this.f220493o) || C87412m.m108589b(view4, this.f220494p) || C87412m.m108589b(view4, this.f220495q) || C87412m.m108589b(view4, this.f220496r)) {
                            arrayList5.add(next5);
                        }
                    }
                    setItemVisibility(arrayList5);
                    C13598b0 b0Var5 = C13598b0.f38549a;
                    return;
                case 6:
                    int albumWidth5 = (getAlbumWidth() - (getGap() * 2)) / 3;
                    int albumHeight4 = (getAlbumHeight() - getGap()) / 2;
                    ImageView imageView31 = this.f220492n;
                    ViewGroup.LayoutParams layoutParams12 = imageView31 != null ? imageView31.getLayoutParams() : null;
                    if (layoutParams12 != null) {
                        layoutParams12.width = albumWidth5;
                    }
                    if (layoutParams12 != null) {
                        layoutParams12.height = albumHeight4;
                    }
                    ImageView imageView32 = this.f220492n;
                    if (imageView32 != null) {
                        imageView32.setLayoutParams(layoutParams12);
                    }
                    ImageView imageView33 = this.f220493o;
                    ViewGroup.LayoutParams layoutParams13 = imageView33 != null ? imageView33.getLayoutParams() : null;
                    if (layoutParams13 != null) {
                        layoutParams13.width = albumWidth5;
                    }
                    if (layoutParams13 != null) {
                        layoutParams13.height = albumHeight4;
                    }
                    ImageView imageView34 = this.f220493o;
                    if (imageView34 != null) {
                        imageView34.setLayoutParams(layoutParams13);
                    }
                    ImageView imageView35 = this.f220494p;
                    ViewGroup.LayoutParams layoutParams14 = imageView35 != null ? imageView35.getLayoutParams() : null;
                    if (layoutParams14 != null) {
                        layoutParams14.width = albumWidth5;
                    }
                    if (layoutParams14 != null) {
                        layoutParams14.height = albumHeight4;
                    }
                    ImageView imageView36 = this.f220494p;
                    if (imageView36 != null) {
                        imageView36.setLayoutParams(layoutParams14);
                    }
                    ImageView imageView37 = this.f220495q;
                    ViewGroup.LayoutParams layoutParams15 = imageView37 != null ? imageView37.getLayoutParams() : null;
                    if (layoutParams15 != null) {
                        layoutParams15.width = albumWidth5;
                    }
                    if (layoutParams15 != null) {
                        layoutParams15.height = albumHeight4;
                    }
                    ImageView imageView38 = this.f220495q;
                    if (imageView38 != null) {
                        imageView38.setLayoutParams(layoutParams15);
                    }
                    ImageView imageView39 = this.f220496r;
                    ViewGroup.LayoutParams layoutParams16 = imageView39 != null ? imageView39.getLayoutParams() : null;
                    if (layoutParams16 != null) {
                        layoutParams16.width = albumWidth5;
                    }
                    if (layoutParams16 != null) {
                        layoutParams16.height = albumHeight4;
                    }
                    ImageView imageView40 = this.f220496r;
                    if (imageView40 != null) {
                        imageView40.setLayoutParams(layoutParams16);
                    }
                    ImageView imageView41 = this.f220497s;
                    if (imageView41 != null) {
                        layoutParams = imageView41.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        layoutParams.width = albumWidth5;
                    }
                    if (layoutParams != null) {
                        layoutParams.height = albumHeight4;
                    }
                    ImageView imageView42 = this.f220497s;
                    if (imageView42 != null) {
                        imageView42.setLayoutParams(layoutParams);
                    }
                    ArrayList<View> itemViews6 = getItemViews();
                    ArrayList arrayList6 = new ArrayList();
                    for (T next6 : itemViews6) {
                        View view5 = (View) next6;
                        if (!(C87412m.m108589b(view5, this.f220498t) || C87412m.m108589b(view5, this.f220499u) || C87412m.m108589b(view5, this.f220500v))) {
                            arrayList6.add(next6);
                        }
                    }
                    setItemVisibility(arrayList6);
                    C13598b0 b0Var6 = C13598b0.f38549a;
                    return;
                case 7:
                    int albumWidth6 = (getAlbumWidth() - (getGap() * 2)) / 3;
                    int albumHeight5 = (getAlbumHeight() - (getGap() * 2)) / 3;
                    ImageView imageView43 = this.f220492n;
                    ViewGroup.LayoutParams layoutParams17 = imageView43 != null ? imageView43.getLayoutParams() : null;
                    if (layoutParams17 != null) {
                        layoutParams17.width = albumWidth6;
                    }
                    if (layoutParams17 != null) {
                        layoutParams17.height = albumHeight5;
                    }
                    ImageView imageView44 = this.f220492n;
                    if (imageView44 != null) {
                        imageView44.setLayoutParams(layoutParams17);
                    }
                    ImageView imageView45 = this.f220493o;
                    ViewGroup.LayoutParams layoutParams18 = imageView45 != null ? imageView45.getLayoutParams() : null;
                    if (layoutParams18 != null) {
                        layoutParams18.width = albumWidth6;
                    }
                    if (layoutParams18 != null) {
                        layoutParams18.height = albumHeight5;
                    }
                    ImageView imageView46 = this.f220493o;
                    if (imageView46 != null) {
                        imageView46.setLayoutParams(layoutParams18);
                    }
                    ImageView imageView47 = this.f220494p;
                    ViewGroup.LayoutParams layoutParams19 = imageView47 != null ? imageView47.getLayoutParams() : null;
                    if (layoutParams19 != null) {
                        layoutParams19.width = albumWidth6;
                    }
                    if (layoutParams19 != null) {
                        layoutParams19.height = albumHeight5;
                    }
                    ImageView imageView48 = this.f220494p;
                    if (imageView48 != null) {
                        imageView48.setLayoutParams(layoutParams19);
                    }
                    ImageView imageView49 = this.f220495q;
                    ViewGroup.LayoutParams layoutParams20 = imageView49 != null ? imageView49.getLayoutParams() : null;
                    if (layoutParams20 != null) {
                        layoutParams20.width = albumWidth6;
                    }
                    if (layoutParams20 != null) {
                        layoutParams20.height = albumHeight5;
                    }
                    ImageView imageView50 = this.f220495q;
                    if (imageView50 != null) {
                        imageView50.setLayoutParams(layoutParams20);
                    }
                    ImageView imageView51 = this.f220496r;
                    ViewGroup.LayoutParams layoutParams21 = imageView51 != null ? imageView51.getLayoutParams() : null;
                    if (layoutParams21 != null) {
                        layoutParams21.width = albumWidth6;
                    }
                    if (layoutParams21 != null) {
                        layoutParams21.height = albumHeight5;
                    }
                    ImageView imageView52 = this.f220496r;
                    if (imageView52 != null) {
                        imageView52.setLayoutParams(layoutParams21);
                    }
                    ImageView imageView53 = this.f220497s;
                    ViewGroup.LayoutParams layoutParams22 = imageView53 != null ? imageView53.getLayoutParams() : null;
                    if (layoutParams22 != null) {
                        layoutParams22.width = albumWidth6;
                    }
                    if (layoutParams22 != null) {
                        layoutParams22.height = albumHeight5;
                    }
                    ImageView imageView54 = this.f220497s;
                    if (imageView54 != null) {
                        imageView54.setLayoutParams(layoutParams22);
                    }
                    ImageView imageView55 = this.f220498t;
                    if (imageView55 != null) {
                        layoutParams = imageView55.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        layoutParams.width = getAlbumWidth();
                    }
                    if (layoutParams != null) {
                        layoutParams.height = albumHeight5;
                    }
                    ImageView imageView56 = this.f220498t;
                    if (imageView56 != null) {
                        imageView56.setLayoutParams(layoutParams);
                    }
                    ArrayList<View> itemViews7 = getItemViews();
                    ArrayList arrayList7 = new ArrayList();
                    for (T next7 : itemViews7) {
                        View view6 = (View) next7;
                        if (!(C87412m.m108589b(view6, this.f220499u) || C87412m.m108589b(view6, this.f220500v))) {
                            arrayList7.add(next7);
                        }
                    }
                    setItemVisibility(arrayList7);
                    C13598b0 b0Var7 = C13598b0.f38549a;
                    return;
                case 8:
                    int albumWidth7 = (getAlbumWidth() - (getGap() * 2)) / 3;
                    int albumHeight6 = (getAlbumHeight() - (getGap() * 2)) / 3;
                    ImageView imageView57 = this.f220492n;
                    ViewGroup.LayoutParams layoutParams23 = imageView57 != null ? imageView57.getLayoutParams() : null;
                    if (layoutParams23 != null) {
                        layoutParams23.width = albumWidth7;
                    }
                    if (layoutParams23 != null) {
                        layoutParams23.height = albumHeight6;
                    }
                    ImageView imageView58 = this.f220492n;
                    if (imageView58 != null) {
                        imageView58.setLayoutParams(layoutParams23);
                    }
                    ImageView imageView59 = this.f220493o;
                    ViewGroup.LayoutParams layoutParams24 = imageView59 != null ? imageView59.getLayoutParams() : null;
                    if (layoutParams24 != null) {
                        layoutParams24.width = albumWidth7;
                    }
                    if (layoutParams24 != null) {
                        layoutParams24.height = albumHeight6;
                    }
                    ImageView imageView60 = this.f220493o;
                    if (imageView60 != null) {
                        imageView60.setLayoutParams(layoutParams24);
                    }
                    ImageView imageView61 = this.f220494p;
                    ViewGroup.LayoutParams layoutParams25 = imageView61 != null ? imageView61.getLayoutParams() : null;
                    if (layoutParams25 != null) {
                        layoutParams25.width = albumWidth7;
                    }
                    if (layoutParams25 != null) {
                        layoutParams25.height = albumHeight6;
                    }
                    ImageView imageView62 = this.f220494p;
                    if (imageView62 != null) {
                        imageView62.setLayoutParams(layoutParams25);
                    }
                    ImageView imageView63 = this.f220495q;
                    ViewGroup.LayoutParams layoutParams26 = imageView63 != null ? imageView63.getLayoutParams() : null;
                    if (layoutParams26 != null) {
                        layoutParams26.width = albumWidth7;
                    }
                    if (layoutParams26 != null) {
                        layoutParams26.height = albumHeight6;
                    }
                    ImageView imageView64 = this.f220495q;
                    if (imageView64 != null) {
                        imageView64.setLayoutParams(layoutParams26);
                    }
                    ImageView imageView65 = this.f220496r;
                    ViewGroup.LayoutParams layoutParams27 = imageView65 != null ? imageView65.getLayoutParams() : null;
                    if (layoutParams27 != null) {
                        layoutParams27.width = albumWidth7;
                    }
                    if (layoutParams27 != null) {
                        layoutParams27.height = albumHeight6;
                    }
                    ImageView imageView66 = this.f220496r;
                    if (imageView66 != null) {
                        imageView66.setLayoutParams(layoutParams27);
                    }
                    ImageView imageView67 = this.f220497s;
                    ViewGroup.LayoutParams layoutParams28 = imageView67 != null ? imageView67.getLayoutParams() : null;
                    if (layoutParams28 != null) {
                        layoutParams28.width = albumWidth7;
                    }
                    if (layoutParams28 != null) {
                        layoutParams28.height = albumHeight6;
                    }
                    ImageView imageView68 = this.f220497s;
                    if (imageView68 != null) {
                        imageView68.setLayoutParams(layoutParams28);
                    }
                    ImageView imageView69 = this.f220498t;
                    ViewGroup.LayoutParams layoutParams29 = imageView69 != null ? imageView69.getLayoutParams() : null;
                    if (layoutParams29 != null) {
                        layoutParams29.width = albumWidth7;
                    }
                    if (layoutParams29 != null) {
                        layoutParams29.height = albumHeight6;
                    }
                    ImageView imageView70 = this.f220498t;
                    if (imageView70 != null) {
                        imageView70.setLayoutParams(layoutParams29);
                    }
                    ImageView imageView71 = this.f220499u;
                    if (imageView71 != null) {
                        layoutParams = imageView71.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        layoutParams.width = (albumWidth7 * 2) + getGap();
                    }
                    if (layoutParams != null) {
                        layoutParams.height = albumHeight6;
                    }
                    ImageView imageView72 = this.f220499u;
                    if (imageView72 != null) {
                        imageView72.setLayoutParams(layoutParams);
                    }
                    ArrayList<View> itemViews8 = getItemViews();
                    ArrayList arrayList8 = new ArrayList();
                    for (T next8 : itemViews8) {
                        if (!C87412m.m108589b((View) next8, this.f220500v)) {
                            arrayList8.add(next8);
                        }
                    }
                    setItemVisibility(arrayList8);
                    C13598b0 b0Var8 = C13598b0.f38549a;
                    return;
                default:
                    int albumWidth8 = (getAlbumWidth() - (getGap() * 2)) / 3;
                    int albumHeight7 = (getAlbumHeight() - (getGap() * 2)) / 3;
                    ImageView imageView73 = this.f220492n;
                    ViewGroup.LayoutParams layoutParams30 = imageView73 != null ? imageView73.getLayoutParams() : null;
                    if (layoutParams30 != null) {
                        layoutParams30.width = albumWidth8;
                    }
                    if (layoutParams30 != null) {
                        layoutParams30.height = albumHeight7;
                    }
                    ImageView imageView74 = this.f220492n;
                    if (imageView74 != null) {
                        imageView74.setLayoutParams(layoutParams30);
                    }
                    ImageView imageView75 = this.f220493o;
                    ViewGroup.LayoutParams layoutParams31 = imageView75 != null ? imageView75.getLayoutParams() : null;
                    if (layoutParams31 != null) {
                        layoutParams31.width = albumWidth8;
                    }
                    if (layoutParams31 != null) {
                        layoutParams31.height = albumHeight7;
                    }
                    ImageView imageView76 = this.f220493o;
                    if (imageView76 != null) {
                        imageView76.setLayoutParams(layoutParams31);
                    }
                    ImageView imageView77 = this.f220494p;
                    ViewGroup.LayoutParams layoutParams32 = imageView77 != null ? imageView77.getLayoutParams() : null;
                    if (layoutParams32 != null) {
                        layoutParams32.width = albumWidth8;
                    }
                    if (layoutParams32 != null) {
                        layoutParams32.height = albumHeight7;
                    }
                    ImageView imageView78 = this.f220494p;
                    if (imageView78 != null) {
                        imageView78.setLayoutParams(layoutParams32);
                    }
                    ImageView imageView79 = this.f220495q;
                    ViewGroup.LayoutParams layoutParams33 = imageView79 != null ? imageView79.getLayoutParams() : null;
                    if (layoutParams33 != null) {
                        layoutParams33.width = albumWidth8;
                    }
                    if (layoutParams33 != null) {
                        layoutParams33.height = albumHeight7;
                    }
                    ImageView imageView80 = this.f220495q;
                    if (imageView80 != null) {
                        imageView80.setLayoutParams(layoutParams33);
                    }
                    ImageView imageView81 = this.f220496r;
                    ViewGroup.LayoutParams layoutParams34 = imageView81 != null ? imageView81.getLayoutParams() : null;
                    if (layoutParams34 != null) {
                        layoutParams34.width = albumWidth8;
                    }
                    if (layoutParams34 != null) {
                        layoutParams34.height = albumHeight7;
                    }
                    ImageView imageView82 = this.f220496r;
                    if (imageView82 != null) {
                        imageView82.setLayoutParams(layoutParams34);
                    }
                    ImageView imageView83 = this.f220497s;
                    ViewGroup.LayoutParams layoutParams35 = imageView83 != null ? imageView83.getLayoutParams() : null;
                    if (layoutParams35 != null) {
                        layoutParams35.width = albumWidth8;
                    }
                    if (layoutParams35 != null) {
                        layoutParams35.height = albumHeight7;
                    }
                    ImageView imageView84 = this.f220497s;
                    if (imageView84 != null) {
                        imageView84.setLayoutParams(layoutParams35);
                    }
                    ImageView imageView85 = this.f220498t;
                    ViewGroup.LayoutParams layoutParams36 = imageView85 != null ? imageView85.getLayoutParams() : null;
                    if (layoutParams36 != null) {
                        layoutParams36.width = albumWidth8;
                    }
                    if (layoutParams36 != null) {
                        layoutParams36.height = albumHeight7;
                    }
                    ImageView imageView86 = this.f220498t;
                    if (imageView86 != null) {
                        imageView86.setLayoutParams(layoutParams36);
                    }
                    ImageView imageView87 = this.f220499u;
                    ViewGroup.LayoutParams layoutParams37 = imageView87 != null ? imageView87.getLayoutParams() : null;
                    if (layoutParams37 != null) {
                        layoutParams37.width = albumWidth8;
                    }
                    if (layoutParams37 != null) {
                        layoutParams37.height = albumHeight7;
                    }
                    ImageView imageView88 = this.f220499u;
                    if (imageView88 != null) {
                        imageView88.setLayoutParams(layoutParams37);
                    }
                    ImageView imageView89 = this.f220500v;
                    if (imageView89 != null) {
                        layoutParams = imageView89.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        layoutParams.width = albumWidth8;
                    }
                    if (layoutParams != null) {
                        layoutParams.height = albumHeight7;
                    }
                    ImageView imageView90 = this.f220500v;
                    if (imageView90 != null) {
                        imageView90.setLayoutParams(layoutParams);
                    }
                    setItemVisibility(getItemViews());
                    C13598b0 b0Var9 = C13598b0.f38549a;
                    return;
            }
        }
    }

    public final LinearLayout getButtomContainer() {
        return this.f220503y;
    }

    public final LinearLayout getCenterContainer() {
        return this.f220502x;
    }

    public final ImageView getImgItemView1() {
        return this.f220492n;
    }

    public final ImageView getImgItemView2() {
        return this.f220493o;
    }

    public final ImageView getImgItemView3() {
        return this.f220494p;
    }

    public final ImageView getImgItemView4() {
        return this.f220495q;
    }

    public final ImageView getImgItemView5() {
        return this.f220496r;
    }

    public final ImageView getImgItemView6() {
        return this.f220497s;
    }

    public final ImageView getImgItemView7() {
        return this.f220498t;
    }

    public final ImageView getImgItemView8() {
        return this.f220499u;
    }

    public final ImageView getImgItemView9() {
        return this.f220500v;
    }

    public final LinearLayout getTopContainer() {
        return this.f220501w;
    }

    public final void setButtomContainer(LinearLayout linearLayout) {
        this.f220503y = linearLayout;
    }

    public final void setCenterContainer(LinearLayout linearLayout) {
        this.f220502x = linearLayout;
    }

    public final void setImgItemView1(ImageView imageView) {
        this.f220492n = imageView;
    }

    public final void setImgItemView2(ImageView imageView) {
        this.f220493o = imageView;
    }

    public final void setImgItemView3(ImageView imageView) {
        this.f220494p = imageView;
    }

    public final void setImgItemView4(ImageView imageView) {
        this.f220495q = imageView;
    }

    public final void setImgItemView5(ImageView imageView) {
        this.f220496r = imageView;
    }

    public final void setImgItemView6(ImageView imageView) {
        this.f220497s = imageView;
    }

    public final void setImgItemView7(ImageView imageView) {
        this.f220498t = imageView;
    }

    public final void setImgItemView8(ImageView imageView) {
        this.f220499u = imageView;
    }

    public final void setImgItemView9(ImageView imageView) {
        this.f220500v = imageView;
    }

    public final void setTopContainer(LinearLayout linearLayout) {
        this.f220501w = linearLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
