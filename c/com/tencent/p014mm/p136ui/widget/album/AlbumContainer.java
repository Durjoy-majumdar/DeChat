package com.tencent.p014mm.p136ui.widget.album;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import gy3.C87412m;
import ho3.C76238a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/album/AlbumContainer;", "Lcom/tencent/mm/ui/widget/album/AlbumContainerViewBase;", "Lho3/a;", "o", "Lho3/a;", "getAlbumFiller", "()Lho3/a;", "setAlbumFiller", "(Lho3/a;)V", "albumFiller", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.album.AlbumContainer */
public class AlbumContainer extends AlbumContainerViewBase {

    /* renamed from: n */
    public AlbumContainerView f220490n;

    /* renamed from: o */
    public C76238a f220491o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumContainer(Context context, int i, int i2) {
        super(context, i, i2);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo94649c() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        AlbumContainerView albumContainerView = new AlbumContainerView(context, getAlbumWidth(), getGap());
        this.f220490n = albumContainerView;
        albumContainerView.setVisibility(0);
        addView(albumContainerView, new FrameLayout.LayoutParams(-2, -2));
        ArrayList<View> itemViews = getItemViews();
        AlbumContainerView albumContainerView2 = this.f220490n;
        if (albumContainerView2 != null) {
            itemViews.add(albumContainerView2);
        } else {
            C87412m.m108603p("chattingAlbumView");
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo104368f(int i) {
        AlbumContainerView albumContainerView = this.f220490n;
        if (albumContainerView != null) {
            albumContainerView.mo104371f(i);
            C76238a aVar = this.f220491o;
            if (aVar != null) {
                AlbumContainerView albumContainerView2 = this.f220490n;
                if (albumContainerView2 != null) {
                    aVar.mo106487a(albumContainerView2);
                } else {
                    C87412m.m108603p("chattingAlbumView");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("chattingAlbumView");
            throw null;
        }
    }

    public final C76238a getAlbumFiller() {
        return this.f220491o;
    }

    public final void setAlbumFiller(C76238a aVar) {
        this.f220491o = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AlbumContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C87412m.m108594g(context, "context");
    }
}
