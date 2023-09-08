package com.tencent.p014mm.plugin.album.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.album.AlbumContainer;
import com.tencent.p014mm.p136ui.widget.album.AlbumContainerViewBase;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p434ig.C98671a;
import p434ig.C98674g;
import uh0.C102037a;
import uh0.C102038b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/album/view/ChattingAlbumContainer;", "Lcom/tencent/mm/ui/widget/album/AlbumContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-album_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.album.view.ChattingAlbumContainer */
public final class ChattingAlbumContainer extends AlbumContainer {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChattingAlbumContainer(Context context, int i, int i2) {
        super(context, i, i2);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: d */
    public void mo94178d(long j, String str, String str2, boolean z, boolean z2) {
        C98671a aVar = new C98671a();
        if (str2 == null) {
            str2 = "";
        }
        aVar.mo141099d(str2);
        C98674g gVar = new C98674g();
        gVar.mo141099d(aVar.f289309p);
        setAlbumFiller(new C102037a(j, str == null ? "" : str, gVar, z, z2));
        mo104368f(gVar.f289364h.size());
    }

    /* renamed from: e */
    public List<Pair<View, String>> mo94179e(long j) {
        AlbumContainerViewBase albumContainerViewBase;
        KeyEvent.Callback callback;
        List<Pair<View, String>> e;
        boolean z;
        Iterator<T> it = getItemViews().iterator();
        while (true) {
            albumContainerViewBase = null;
            if (!it.hasNext()) {
                callback = null;
                break;
            }
            callback = it.next();
            if (((View) callback).getVisibility() == 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        KeyEvent.Callback callback2 = (View) callback;
        if (callback2 != null) {
            if (callback2 instanceof AlbumContainerViewBase) {
                albumContainerViewBase = (AlbumContainerViewBase) callback2;
            }
            if (!(albumContainerViewBase == null || (e = albumContainerViewBase.mo94179e(j)) == null)) {
                return e;
            }
        }
        return super.mo94179e(j);
    }

    /* renamed from: g */
    public final void mo94180g(C72963f4 f4Var, C98674g gVar) {
        C87412m.m108594g(gVar, "albumInfoItem");
        setAlbumFiller(new C102038b(f4Var, gVar, f4Var != null && f4Var.mo108769t2() == 0, false, 8, (C8480h) null));
        mo104368f(gVar.mo55348A().size());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChattingAlbumContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChattingAlbumContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
