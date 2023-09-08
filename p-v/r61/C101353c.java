package r61;

import android.content.Intent;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiSendDialogUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import fy3.C32224a;
import ke3.C88144b;
import p441aq.C92054g;
import q61.C101037a;
import qo3.C101218e0;
import rx3.C13598b0;

/* renamed from: r61.c */
public final class C101353c implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101358h f296901a;

    public C101353c(C101358h hVar) {
        this.f296901a = hVar;
    }

    /* renamed from: a */
    public final void mo2001a() {
        C101358h hVar = this.f296901a;
        hVar.getClass();
        Class cls = C92054g.class;
        ((C92054g) C86312j.m106911c(cls)).getClass();
        if (C30790w2.m39221h().mo57717d().mo142044TO(hVar.f296909e.field_md5) == null) {
            Log.m105924i(hVar.f296926y, "sendEmoji: db info is null");
            EmojiInfo emojiInfo = hVar.f296909e;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
            emojiInfo.field_catalog = 65;
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().mo142040Ow(hVar.f296909e);
        }
        Intent intent = new Intent(hVar.f296908d, EmojiSendDialogUI.class);
        intent.putExtra("emoji_info", hVar.f296909e);
        intent.putExtra("ad_uxInfo", hVar.f296921t);
        C88144b.m109795m(hVar.f296908d, "emoji", ".ui.EmojiSendDialogUI", intent, 0);
        this.f296901a.f296911g.mo140680z();
        C32224a<C13598b0> aVar = this.f296901a.f296919r;
        if (aVar != null) {
            aVar.invoke();
        }
        C101358h hVar2 = this.f296901a;
        C101037a.m132405c(hVar2.f296909e, 2, hVar2.f296922u, hVar2.f296923v, hVar2.f296924w);
    }
}
