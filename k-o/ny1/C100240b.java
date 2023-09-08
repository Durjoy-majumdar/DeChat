package ny1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.media.preview.GameVideoPreviewUI;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: ny1.b */
public class C100240b implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ GameVideoPreviewUI f293689d;

    public C100240b(GameVideoPreviewUI gameVideoPreviewUI) {
        this.f293689d = gameVideoPreviewUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107154n(2, this.f293689d.f271820d.getString(C0966R.string.f360850fc1), this.f293689d.f271820d.getString(C0966R.string.f360849fc0), C0966R.raw.game_icon_share_wechat);
    }
}
