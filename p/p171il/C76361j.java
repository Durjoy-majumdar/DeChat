package p171il;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import i61.C98602h;
import qo3.C47883u;
import z51.C39315g;

/* renamed from: il.j */
public final class C76361j implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ IEmojiInfo f223631a;

    public C76361j(IEmojiInfo iEmojiInfo) {
        this.f223631a = iEmojiInfo;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        if (z && !Util.isNullOrNil(this.f223631a.getMd5())) {
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137993A(this.f223631a.getMd5());
        }
    }
}
