package vf1;

import ad0.C54012a;
import ad0.C54019i;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAlbumTimelineUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C7888v2;
import gy3.C87412m;
import ht1.C60158d;
import nj3.C11184p0;
import p166hy.C60228r0;
import te3.C49712hj1;
import te3.C64629pl1;

/* renamed from: vf1.c */
public final class C65691c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderAlbumTimelineUI f189036d;

    public C65691c(FinderAlbumTimelineUI finderAlbumTimelineUI) {
        this.f189036d = finderAlbumTimelineUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C60228r0.class;
        int i2 = FinderAlbumTimelineUI.f158817G;
        StringBuilder sb = new StringBuilder();
        sb.append("[clickMoreMenu] itemId=");
        sb.append(menuItem.getItemId());
        sb.append(" getRelatedScene=");
        sb.append(this.f189036d.mo77393X7());
        sb.append(" streamCard=");
        sb.append(this.f189036d.mo77395Z7() != null);
        Log.m105924i("Finder.AlbumTimelineUI", sb.toString());
        int itemId = menuItem.getItemId();
        FinderAlbumTimelineUI finderAlbumTimelineUI = this.f189036d;
        if (itemId != finderAlbumTimelineUI.f158822E) {
            int itemId2 = menuItem.getItemId();
            FinderAlbumTimelineUI finderAlbumTimelineUI2 = this.f189036d;
            if (itemId2 != finderAlbumTimelineUI2.f158823F) {
                return;
            }
            if (finderAlbumTimelineUI2.mo77393X7() == 10 || this.f189036d.mo77393X7() == 11) {
                C54012a ht = ((C60228r0) C86312j.m106911c(cls)).mo84724ht();
                C64629pl1 Z7 = this.f189036d.mo77395Z7();
                if (Z7 != null) {
                    ((C54019i) ht).f151288a = C7888v2.f26513a.mo9006d(Z7);
                }
                C7888v2.C7889a aVar = C7888v2.f26513a;
                FinderAlbumTimelineUI finderAlbumTimelineUI3 = this.f189036d;
                C87412m.m108593f(ht, "snsShare");
                aVar.mo9014l(finderAlbumTimelineUI3, ht, FinderAlbumTimelineUI.m63527V7(this.f189036d));
            } else if (this.f189036d.mo77393X7() == 14) {
                C54012a ht4 = ((C60228r0) C86312j.m106911c(cls)).mo84724ht();
                byte[] byteArrayExtra = this.f189036d.getIntent().getByteArrayExtra("FINDER_SHARE_ALBUM");
                if (byteArrayExtra != null) {
                    ((C54019i) ht4).f151288a.parseFrom(byteArrayExtra);
                }
                C7888v2.C7889a aVar2 = C7888v2.f26513a;
                FinderAlbumTimelineUI finderAlbumTimelineUI4 = this.f189036d;
                C87412m.m108593f(ht4, "snsShare");
                aVar2.mo9014l(finderAlbumTimelineUI4, ht4, FinderAlbumTimelineUI.m63527V7(this.f189036d));
            }
        } else if (finderAlbumTimelineUI.mo77393X7() == 10 || this.f189036d.mo77393X7() == 11) {
            C64629pl1 Z72 = this.f189036d.mo77395Z7();
            if (Z72 != null) {
                FinderAlbumTimelineUI finderAlbumTimelineUI5 = this.f189036d;
                C7888v2.C7889a aVar3 = C7888v2.f26513a;
                C49712hj1 V7 = FinderAlbumTimelineUI.m63527V7(finderAlbumTimelineUI5);
                aVar3.getClass();
                C87412m.m108594g(finderAlbumTimelineUI5, "context");
                C60158d dVar = new C60158d();
                dVar.f171700b = aVar3.mo9006d(Z72);
                aVar3.mo9013k(finderAlbumTimelineUI5, dVar, V7);
            }
        } else if (this.f189036d.mo77393X7() == 14) {
            C60158d dVar2 = new C60158d();
            byte[] byteArrayExtra2 = this.f189036d.getIntent().getByteArrayExtra("FINDER_SHARE_ALBUM");
            if (byteArrayExtra2 != null) {
                dVar2.f171700b.parseFrom(byteArrayExtra2);
            }
            C7888v2.C7889a aVar4 = C7888v2.f26513a;
            FinderAlbumTimelineUI finderAlbumTimelineUI6 = this.f189036d;
            aVar4.mo9013k(finderAlbumTimelineUI6, dVar2, FinderAlbumTimelineUI.m63527V7(finderAlbumTimelineUI6));
        }
    }
}
