package ca0;

import com.tencent.maas.model.MJMusicInfo;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p175j0.C60667k2;

/* renamed from: ca0.u */
public final class C54707u extends C87413o implements C32226l<Integer, Object> {

    /* renamed from: d */
    public final /* synthetic */ C60667k2<List<MJMusicInfo>> f153336d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54707u(C60667k2<? extends List<? extends MJMusicInfo>> k2Var) {
        super(1);
        this.f153336d = k2Var;
    }

    public Object invoke(Object obj) {
        String musicID = ((MJMusicInfo) C104353p.m139329h(this.f153336d).get(((Number) obj).intValue())).getMusicID();
        C87412m.m108593f(musicID, "musicInfos[it].musicID");
        return musicID;
    }
}
