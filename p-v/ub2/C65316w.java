package ub2;

import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentFooter;
import qn3.C77382c;

/* renamed from: ub2.w */
public final class C65316w implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMvCommentFooter f187989d;

    public C65316w(MusicMvCommentFooter musicMvCommentFooter) {
        this.f187989d = musicMvCommentFooter;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        MusicMvCommentFooter musicMvCommentFooter = this.f187989d;
        C77382c b = C77382c.m93286b(musicMvCommentFooter.f163528d);
        b.f225611e = 0;
        b.f225610d = 80;
        b.f225607a = true;
        b.mo107499d(new C65318z(musicMvCommentFooter));
        return true;
    }
}
