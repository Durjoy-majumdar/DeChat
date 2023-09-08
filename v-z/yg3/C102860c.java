package yg3;

import al3.C0086a;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct;
import com.tencent.p014mm.p136ui.C85978w1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.search.data.SimilarEmojiQueryModel;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import gy3.C87412m;
import i61.C98602h;
import ke3.C88144b;
import p171il.C98711d;
import p813fl.C97904g;
import p813fl.C97927q0;
import p813fl.C97937v0;
import qo3.C77389a;
import qo3.C77398g;
import z51.C39315g;
import zg3.C103030a;
import zg3.C79330c;
import zt3.C119157j;

/* renamed from: yg3.c */
public final class C102860c extends C98711d {

    /* renamed from: f */
    public SimilarEmojiQueryModel f303617f;

    public C102860c(int i) {
        super(i);
    }

    /* renamed from: c */
    public void mo127711c(View view, Context context, int i, C97927q0 q0Var) {
        C87412m.m108594g(context, "context");
        if (q0Var != null && WeChatBrands.Business.Entries.ContextSearch.checkAvailable(context)) {
            boolean z = q0Var instanceof C97904g;
            String md5 = z ? ((C97904g) q0Var).f287200b.getMd5() : "";
            Log.m105924i("MicroMsg.SimilarEmoji", "onClick: " + i + ", md5 :" + md5);
            if (z) {
                C97904g gVar = (C97904g) q0Var;
                if (gVar.f287201c == 102) {
                    C115669n.INSTANCE.mo175912v(1257, 4);
                    IEmojiInfo iEmojiInfo = gVar.f287200b;
                    C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
                    ((C119157j) C119157j.f356862d).mo183875f(new C103030a((long) i, (EmojiInfo) iEmojiInfo));
                    if (gVar.f287200b.mo62654b0() == 1) {
                        if (!Util.isNullOrNil(gVar.f287200b.getGroupId())) {
                            if (((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138006M(gVar.f287200b.getGroupId())) {
                                Log.m105924i("MicroMsg.SimilarEmoji", "buy and resend emoji");
                            }
                        }
                        IEmojiInfo iEmojiInfo2 = gVar.f287200b;
                        C77389a aVar = new C77389a();
                        aVar.f225644a = "";
                        aVar.f225660q = context.getString(C0966R.string.j8r);
                        aVar.f225668y = true;
                        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.c4k);
                        aVar.f225620C = new C53522b(iEmojiInfo2, context);
                        aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
                        C77398g gVar2 = new C77398g(context, C0966R.style.a66);
                        gVar2.mo107525e(aVar);
                        Window window = gVar2.getWindow();
                        if (window != null) {
                            window.setSoftInputMode(48);
                            window.setFlags(131072, 131072);
                        }
                        gVar2.show();
                        return;
                    }
                    IEmojiInfo iEmojiInfo3 = gVar.f287200b;
                    if (C30790w2.m39221h().mo57717d().mo142044TO(iEmojiInfo3.getMd5()) == null) {
                        C30790w2.m39221h().mo57717d().insert((EmojiInfo) iEmojiInfo3);
                    }
                    C72837v1 v1Var = this.f289454b;
                    if (v1Var != null) {
                        v1Var.mo65586X1(iEmojiInfo3);
                        return;
                    }
                    return;
                }
            }
            if ((q0Var instanceof C97937v0) && ((C97937v0) q0Var).f287272b == 101) {
                if (this.f303617f == null) {
                    Log.m105924i("MicroMsg.SimilarEmoji", "can not jump for null data!");
                    return;
                }
                RelatedEmoticonActionStruct relatedEmoticonActionStruct = new RelatedEmoticonActionStruct();
                relatedEmoticonActionStruct.f265792d = C79330c.f232896a;
                relatedEmoticonActionStruct.f265793e = 5;
                EmojiInfo emojiInfo = C79330c.f232897b;
                String str = null;
                relatedEmoticonActionStruct.mo126627u(emojiInfo != null ? emojiInfo.field_groupId : null);
                EmojiInfo emojiInfo2 = C79330c.f232897b;
                if (emojiInfo2 != null) {
                    str = emojiInfo2.getMd5();
                }
                relatedEmoticonActionStruct.mo126626t(str);
                relatedEmoticonActionStruct.f265799k = 4;
                relatedEmoticonActionStruct.mo126625s(C79330c.f232898c);
                relatedEmoticonActionStruct.mo86054n();
                Intent intent = new Intent();
                intent.putExtra("KEY_NET_PARAM", this.f303617f);
                C88144b.m109795m(((C85978w1) context).getBaseContext(), "webview", ".emojistore.ui.SosSimilarUI", intent, 229);
            }
        }
    }
}
