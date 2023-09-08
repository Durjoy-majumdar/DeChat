package ow1;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;

/* renamed from: ow1.d */
public class C62183d extends GridLayoutManager {

    /* renamed from: D */
    public final /* synthetic */ int f176797D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62183d(AlbumPreviewUI albumPreviewUI, Context context, int i, int i2) {
        super(context, i);
        this.f176797D = i2;
    }

    /* renamed from: M */
    public int mo16966M(RecyclerView.C16628w wVar) {
        int i = this.f176797D;
        return i != 0 ? i : super.mo16966M(wVar);
    }
}
