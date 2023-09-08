package gr1;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import dp1.C58368h1;
import dp1.C58403t;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import pl1.C62367r0;
import rs1.C13442s8;
import rx3.C13598b0;

/* renamed from: gr1.u1 */
public final class C59677u1 extends C87413o implements C32226l<C59670o2, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f170498d;

    /* renamed from: e */
    public final /* synthetic */ FinderVideoLayout.C56521b f170499e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59677u1(FinderVideoLayout finderVideoLayout, FinderVideoLayout.C56521b bVar) {
        super(1);
        this.f170498d = finderVideoLayout;
        this.f170499e = bVar;
    }

    public Object invoke(Object obj) {
        C58403t k3;
        C59670o2 o2Var = (C59670o2) obj;
        if (o2Var != null) {
            FinderVideoLayout finderVideoLayout = this.f170498d;
            FinderVideoLayout.C56521b bVar = this.f170499e;
            finderVideoLayout.setVideoView(o2Var);
            C62367r0 r0Var = bVar.f161894c;
            bVar.f161892a.getExpectId();
            boolean z = bVar.f161897f;
            if (!C87412m.m108589b(o2Var.getVideoMediaId(), bVar.f161894c.mo11841b())) {
                C59667n2 seekBarLayout = finderVideoLayout.getSeekBarLayout();
                if (seekBarLayout != null) {
                    seekBarLayout.setVisibility(0);
                }
                o2Var.setAlpha(0.0f);
                finderVideoLayout.mo79542E(o2Var, r0Var, z, bVar.f161892a);
            }
            if (o2Var instanceof FinderThumbPlayerProxy) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = finderVideoLayout.getContext();
                C87412m.m108593f(context, "this@FinderVideoLayout.context");
                C13442s8 f = aVar.mo12873f(context);
                if (!(f == null || (k3 = f.mo12855k3(-1)) == null || !(k3 instanceof C58368h1))) {
                    ((FinderThumbPlayerProxy) o2Var).setCommentScene(k3.f167327h.f134675i);
                }
            }
            o2Var.setLoop(finderVideoLayout.f161887z);
            o2Var.mo51228s();
            String fTPPTag = finderVideoLayout.getFTPPTag();
            Log.m105924i(fTPPTag, "[FinderVideoLayout#prepareToPlay] layout=[" + finderVideoLayout.getWidth() + XVFSFile.PATH_SEPARATOR_CHAR + finderVideoLayout.getHeight() + "] videoView=[" + o2Var.getWidth() + XVFSFile.PATH_SEPARATOR_CHAR + o2Var.getHeight() + "] video=[" + r0Var.f177253e.f185270h + XVFSFile.PATH_SEPARATOR_CHAR + r0Var.f177253e.f185271i + "] " + finderVideoLayout.mo79549P() + " media=" + r0Var + ' ');
        }
        return C13598b0.f38549a;
    }
}
