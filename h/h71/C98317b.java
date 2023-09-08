package h71;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EditorItemContainer;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EmojiEditorItemView;
import d71.C107004d;
import gy3.C87412m;

/* renamed from: h71.b */
public final class C98317b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditorItemContainer f288172d;

    /* renamed from: e */
    public final /* synthetic */ C98318c f288173e;

    /* renamed from: f */
    public final /* synthetic */ Matrix f288174f;

    public C98317b(EditorItemContainer editorItemContainer, C98318c cVar, Matrix matrix) {
        this.f288172d = editorItemContainer;
        this.f288173e = cVar;
        this.f288174f = matrix;
    }

    public final void run() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        ViewGroup viewGroup = this.f288172d.f269359g;
        C98318c cVar = this.f288173e;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type android.view.View");
        viewGroup.addView((View) cVar, layoutParams);
        this.f288173e.mo137605b(this.f288172d.getValidRect(), this.f288172d.getContext().getResources().getDimension(C0966R.dimen.a3c));
        this.f288172d.setEditing(this.f288173e);
        EditorItemContainer editorItemContainer = this.f288172d;
        editorItemContainer.f269359g.bringChildToFront(editorItemContainer.getTextItem());
        Matrix matrix = this.f288174f;
        if (matrix != null) {
            C98318c cVar2 = this.f288173e;
            if (cVar2 instanceof EmojiEditorItemView) {
                EmojiEditorItemView emojiEditorItemView = (EmojiEditorItemView) cVar2;
                emojiEditorItemView.getClass();
                C87412m.m108594g(matrix, "m");
                ((C107004d) emojiEditorItemView.f312515r).f320309b.f321806g.set(matrix);
            }
        }
    }
}
