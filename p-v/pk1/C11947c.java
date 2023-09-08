package pk1;

import cj1.C0639y1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import gy3.C87412m;
import ig1.C8916d;
import pe3.C89349b;
import te3.C50037ju0;
import te3.C50767p11;

/* renamed from: pk1.c */
public final class C11947c {

    /* renamed from: a */
    public final MMActivity f34881a;

    /* renamed from: b */
    public final C45795b f34882b;

    public C11947c(MMActivity mMActivity, C45795b bVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar, "liveData");
        this.f34881a = mMActivity;
        this.f34882b = bVar;
    }

    /* renamed from: a */
    public static final FinderJumpInfo m11654a(C11947c cVar) {
        cVar.getClass();
        FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
        finderJumpInfo.wording = "test_稀有礼物被抽到，快去围观";
        C8916d dVar = C0639y1.f1513d.get("MMFinderLiveGift100001");
        C50767p11 p2 = dVar != null ? dVar.mo9725p2() : null;
        C50037ju0 ju02 = new C50037ju0();
        ju02.f136332g = p2;
        finderJumpInfo.ext_buff = new C89349b(ju02.toByteArray());
        return finderJumpInfo;
    }
}
