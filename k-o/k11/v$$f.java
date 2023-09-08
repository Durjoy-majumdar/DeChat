package k11;

import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import nj3.C11182m0;
import nj3.C76874e0;

public final /* synthetic */ class v$$f implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ Resources f29757d;

    /* renamed from: e */
    public final /* synthetic */ int f29758e;

    public /* synthetic */ v$$f(Resources resources, int i) {
        this.f29757d = resources;
        this.f29758e = i;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        Resources resources = this.f29757d;
        int i = this.f29758e;
        long[] jArr = CleanChattingUI.f267888D;
        e0Var.mo107140d(1, resources.getColor(C0966R.color.a_3), resources.getStringArray(C0966R.array.f2567b5)[i]);
    }
}
