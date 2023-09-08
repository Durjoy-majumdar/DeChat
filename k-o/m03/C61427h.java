package m03;

import com.tencent.p014mm.plugin.thumbplayer.view.MMTPVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import j03.C60695a;
import rx3.C13598b0;

/* renamed from: m03.h */
public final class C61427h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MMTPVideoLayout f174672d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61427h(MMTPVideoLayout mMTPVideoLayout) {
        super(0);
        this.f174672d = mMTPVideoLayout;
    }

    public Object invoke() {
        String str = this.f174672d.f164630d;
        StringBuilder sb = new StringBuilder();
        sb.append("init effector finished, player:");
        C60695a player = this.f174672d.getPlayer();
        sb.append(player != null ? player.hashCode() : 0);
        Log.m105924i(str, sb.toString());
        return C13598b0.f38549a;
    }
}
