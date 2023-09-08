package ub2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import nj3.C76879j;
import qn3.C77382c;

/* renamed from: ub2.z */
public final class C65318z implements C77382c.C77383a {

    /* renamed from: d */
    public final /* synthetic */ MusicMvCommentFooter f187991d;

    public C65318z(MusicMvCommentFooter musicMvCommentFooter) {
        this.f187991d = musicMvCommentFooter;
    }

    /* renamed from: L0 */
    public void mo4083L0(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        C76879j.m92738i(this.f187991d.getContext(), C0966R.string.jjy, C0966R.string.mpw);
    }

    /* renamed from: L3 */
    public void mo4084L3(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
    }

    /* renamed from: P4 */
    public void mo4086P4(String str) {
        MusicMvCommentFooter.C57088a aVar;
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        Log.m105924i("Music.MusicMvCommentFooter", "InputTextBoundaryCheck ok, ready to send, text:" + str);
        if (!Util.isNullOrNil(str) && (aVar = this.f187991d.f163535n) != null) {
            aVar.mo80540a(str, "");
        }
        MMEditText mMEditText = this.f187991d.f163528d;
        C87412m.m108591d(mMEditText);
        mMEditText.setText("");
    }
}
