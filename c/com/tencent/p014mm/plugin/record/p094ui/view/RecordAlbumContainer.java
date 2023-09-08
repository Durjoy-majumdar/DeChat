package com.tencent.p014mm.plugin.record.p094ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.album.AlbumContainer;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/record/ui/view/RecordAlbumContainer;", "Lcom/tencent/mm/ui/widget/album/AlbumContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.record.ui.view.RecordAlbumContainer */
public final class RecordAlbumContainer extends AlbumContainer {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordAlbumContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo94649c() {
        setAlbumWidth(C76577a.m92151b(getContext(), 35));
        setAlbumHeight(C76577a.m92151b(getContext(), 35));
        super.mo94649c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordAlbumContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
