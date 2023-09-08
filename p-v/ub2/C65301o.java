package ub2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvAlbumPreviewUI;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8478d0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import mb2.C61461c;
import nb2.C61645c0;
import nj3.C76912y0;
import te3.C64525lh3;

/* renamed from: ub2.o */
public final class C65301o implements C61461c.C61464c {

    /* renamed from: a */
    public final /* synthetic */ MusicMVCardChooseView f187959a;

    public C65301o(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187959a = musicMVCardChooseView;
    }

    /* renamed from: a */
    public void mo86438a(int i, View view, int i2) {
        View view2 = view;
        int i3 = i2;
        if (i3 == 1) {
            MusicMVCardChooseView musicMVCardChooseView = this.f187959a;
            C61461c cVar = musicMVCardChooseView.f163488f;
            GalleryItem$MediaItem F4 = cVar != null ? cVar.mo86436F4(i) : null;
            if (F4 == null || Util.isNullOrNil(F4.f162747d)) {
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(F4 == null);
                Log.m105929w("MicroMsg.Mv.MusicMVCardChooseView", "item is null %s, item original path is null", objArr);
            } else if (!musicMVCardChooseView.mo80518h()) {
                if (F4 instanceof GalleryItem$VideoMediaItem) {
                    int i4 = ((GalleryItem$VideoMediaItem) F4).f162766w;
                    if (C61645c0.m72361a(i4) < C61645c0.m72363c(MusicMVCardChooseView.f163455X0)) {
                        Log.m105928w("MicroMsg.Mv.MusicMVCardChooseView", "durationMs:" + i4 + " is not in range of choose to mv ");
                        C76912y0.m92773l(musicMVCardChooseView.getContext(), musicMVCardChooseView.getContext().getString(C0966R.string.mpf, new Object[]{Integer.valueOf(C61645c0.m72363c(MusicMVCardChooseView.f163455X0))}));
                        return;
                    }
                }
                boolean z = musicMVCardChooseView.f163481U0;
                C8478d0 d0Var = new C8478d0();
                C8478d0 d0Var2 = new C8478d0();
                if (!z) {
                    RecyclerView recyclerView = musicMVCardChooseView.f163487e;
                    C87412m.m108591d(recyclerView);
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    C87412m.m108591d(layoutManager);
                    C87412m.m108591d(view);
                    int decoratedTop = layoutManager.getDecoratedTop(view2);
                    int paddingTop = layoutManager.getPaddingTop();
                    int i5 = decoratedTop - paddingTop;
                    Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "[debugScroll] viewTop: " + decoratedTop + ", boxTop:" + paddingTop + ", offsetOfMoveToFirstRow:" + i5);
                    RecyclerView recyclerView2 = musicMVCardChooseView.f163487e;
                    C87412m.m108591d(recyclerView2);
                    int computeVerticalScrollRange = recyclerView2.computeVerticalScrollRange();
                    RecyclerView recyclerView3 = musicMVCardChooseView.f163487e;
                    C87412m.m108591d(recyclerView3);
                    int computeVerticalScrollOffset = recyclerView3.computeVerticalScrollOffset();
                    RecyclerView recyclerView4 = musicMVCardChooseView.f163487e;
                    C87412m.m108591d(recyclerView4);
                    int height = recyclerView4.getHeight();
                    int height2 = view.getHeight();
                    int i6 = ((computeVerticalScrollRange - computeVerticalScrollOffset) - height) + (musicMVCardChooseView.f163477S0 - musicMVCardChooseView.f163475R0);
                    Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "[debugScroll] totalHeight: " + computeVerticalScrollRange + ", scrollY:" + computeVerticalScrollOffset + ", albumRvHeight:" + height + ", itemHeight:" + height2 + ", availableSpace:" + i6);
                    d0Var.f27483d = Math.max(0, Math.min(i5, i6));
                }
                musicMVCardChooseView.mo80519i(true, new C65305q(z, d0Var, d0Var2, musicMVCardChooseView), new C65310r(view2, musicMVCardChooseView, F4));
            } else {
                if (F4 instanceof GalleryItem$VideoMediaItem) {
                    int i7 = ((GalleryItem$VideoMediaItem) F4).f162766w;
                    if (C61645c0.m72361a(i7) < C61645c0.m72363c(MusicMVCardChooseView.f163456Y0)) {
                        Log.m105928w("MicroMsg.Mv.MusicMVCardChooseView", "durationMs:" + i7 + " is not in range of choose to mv ");
                        C76912y0.m92773l(musicMVCardChooseView.getContext(), musicMVCardChooseView.getContext().getString(C0966R.string.mpf, new Object[]{Integer.valueOf(C61645c0.m72363c(MusicMVCardChooseView.f163456Y0))}));
                        return;
                    }
                }
                String str = "local_" + F4.f162751h;
                C64525lh3 lh32 = MusicMvAlbumPreviewUI.f163015d;
                MusicMvAlbumPreviewUI.f163015d = musicMVCardChooseView.mo80516f(str, "0");
                Intent intent = new Intent(musicMVCardChooseView.getContext(), MusicMvAlbumPreviewUI.class);
                if (musicMVCardChooseView.getContext() instanceof Activity) {
                    Context context = musicMVCardChooseView.getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(10041);
                    aVar.mo10233c(intent);
                    C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView", "onMediaClick", "(ILandroid/view/View;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
            }
        } else if (i3 == 2) {
            MusicMVCardChooseView musicMVCardChooseView2 = this.f187959a;
            Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "on click open camera, valid click times[%d]", Integer.valueOf(musicMVCardChooseView2.f163472Q));
            if (musicMVCardChooseView2.f163471P) {
                Log.m105928w("MicroMsg.Mv.MusicMVCardChooseView", "click open camera, but camera is opening");
                return;
            }
            musicMVCardChooseView2.f163472Q++;
            musicMVCardChooseView2.f163471P = true;
            if (musicMVCardChooseView2.mo80518h()) {
                MusicMVCardChooseView.C57080a aVar2 = musicMVCardChooseView2.f163463G;
                if (aVar2 != null) {
                    aVar2.mo80370p6(2000);
                    return;
                }
                return;
            }
            MusicMVCardChooseView.C57080a aVar3 = musicMVCardChooseView2.f163463G;
            if (aVar3 != null) {
                aVar3.mo80370p6((C61645c0.m72363c(MusicMVCardChooseView.f163455X0) * 1000) + 500);
            }
        }
    }

    /* renamed from: b */
    public boolean mo86439b(boolean z, GalleryItem$MediaItem galleryItem$MediaItem) {
        C87412m.m108594g(galleryItem$MediaItem, "item");
        MusicMVCardChooseView musicMVCardChooseView = this.f187959a;
        int i = MusicMVCardChooseView.f163455X0;
        if (!musicMVCardChooseView.mo80518h()) {
            return true;
        }
        MusicMVCardChooseView.C57080a aVar = this.f187959a.f163463G;
        if (aVar != null) {
            return aVar.mo80369b6(z, galleryItem$MediaItem, 0);
        }
        return false;
    }
}
