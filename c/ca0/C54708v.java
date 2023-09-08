package ca0;

import com.tencent.maas.model.MJMusicInfo;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p004b0.C103941f;
import p175j0.C108504h;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p560i2.C108325f;
import rx3.C13598b0;

/* renamed from: ca0.v */
public final class C54708v extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54683f0 f153337d;

    /* renamed from: e */
    public final /* synthetic */ C60667k2<List<MJMusicInfo>> f153338e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<C108325f> f153339f;

    /* renamed from: g */
    public final /* synthetic */ C60667k2<String> f153340g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54708v(C54683f0 f0Var, C60667k2<? extends List<? extends MJMusicInfo>> k2Var, C60690y0<C108325f> y0Var, C60667k2<String> k2Var2) {
        super(4);
        this.f153337d = f0Var;
        this.f153338e = k2Var;
        this.f153339f = y0Var;
        this.f153340g = k2Var2;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        C108504h hVar = (C108504h) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C87412m.m108594g((C103941f) obj, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= hVar.mo51592j(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) != 144 || !hVar.mo51575a()) {
            MJMusicInfo mJMusicInfo = (MJMusicInfo) C104353p.m139329h(this.f153338e).get(intValue);
            float f = this.f153339f.getValue().f324346d;
            String songName = mJMusicInfo.getSongName();
            C87412m.m108593f(songName, "musicInfo.songName");
            String singerNames = mJMusicInfo.getSingerNames();
            C87412m.m108593f(singerNames, "musicInfo.singerNames");
            C104353p.m139328g(f, songName, singerNames, this.f153337d.f153254f, C87412m.m108589b(this.f153340g.getValue(), mJMusicInfo.getMusicID()), (C32224a) null, hVar, 0, 32);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
