package r61;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import fy3.C32224a;
import p207nl.C100128a;
import p441aq.C92054g;
import q61.C101037a;
import qo3.C101218e0;
import rx3.C13598b0;

/* renamed from: r61.b */
public final class C101352b implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101358h f296900a;

    public C101352b(C101358h hVar) {
        this.f296900a = hVar;
    }

    /* renamed from: a */
    public final void mo2001a() {
        C101358h hVar = this.f296900a;
        hVar.getClass();
        Class cls = C92054g.class;
        ((C92054g) C86312j.m106911c(cls)).getClass();
        if (C30790w2.m39221h().mo57717d().mo142044TO(hVar.f296909e.field_md5) == null) {
            Log.m105924i(hVar.f296926y, "doAddAction: db info is null");
            EmojiInfo emojiInfo = hVar.f296909e;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
            emojiInfo.field_catalog = 65;
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().mo142040Ow(hVar.f296909e);
        }
        new C100128a(hVar.f296908d, hVar.f296909e, hVar.f296921t, new C101351a(hVar));
        hVar.f296911g.mo140680z();
        this.f296900a.mo140840a();
        C32224a<C13598b0> aVar = this.f296900a.f296920s;
        if (aVar != null) {
            aVar.invoke();
        }
        C101358h hVar2 = this.f296900a;
        C101037a.m132405c(hVar2.f296909e, 1, hVar2.f296922u, hVar2.f296923v, hVar2.f296924w);
    }
}
