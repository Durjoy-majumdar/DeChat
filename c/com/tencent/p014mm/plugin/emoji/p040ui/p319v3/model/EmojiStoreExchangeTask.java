package com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C40008f;
import com.tencent.wxmm.v2helper;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import j61.C46439j;
import kotlin.Metadata;
import ob0.C11385n;
import ob0.C117747y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreExchangeTask;", "Landroidx/lifecycle/p;", "Lob0/n;", "", "productId", "seriesId", "productName", "iconUrl", "panelUrl", "Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreExchangeTask$a;", "callback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreExchangeTask$a;)V", "a", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask */
public final class EmojiStoreExchangeTask implements C103764p, C11385n {

    /* renamed from: d */
    public final String f269080d;

    /* renamed from: e */
    public final String f269081e;

    /* renamed from: f */
    public final String f269082f;

    /* renamed from: g */
    public final String f269083g;

    /* renamed from: h */
    public final String f269084h;

    /* renamed from: i */
    public C93271a f269085i;

    /* renamed from: j */
    public final String f269086j;

    /* renamed from: n */
    public C46439j f269087n;

    /* renamed from: o */
    public final EmojiStoreExchangeTask$mEmotionStateChangeListener$1 f269088o;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask$a */
    public interface C93271a {
        /* renamed from: a */
        void mo127924a(int i);

        /* renamed from: b */
        void mo127925b(int i);

        /* renamed from: c */
        void mo127926c(boolean z);
    }

    public EmojiStoreExchangeTask(String str, String str2, String str3, String str4, String str5, C93271a aVar) {
        C87412m.m108594g(str, "productId");
        this.f269080d = str;
        this.f269081e = str2;
        this.f269082f = str3;
        this.f269083g = str4;
        this.f269084h = str5;
        this.f269085i = aVar;
        this.f269086j = "MicroMsg.EmojiStoreExchangeTask";
        this.f269088o = new EmojiStoreExchangeTask$mEmotionStateChangeListener$1(this, C40008f.f107254d);
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        if (bVar == C39623j.C39625b.ON_DESTROY) {
            this.f269088o.dead();
            C86709a0.m107529k().f251779b.mo123470p(v2helper.EMethodSetNgStrength, this);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if ((yVar instanceof C46439j) && C87412m.m108589b(yVar, this.f269087n)) {
            if (i == 0 && i2 == 0) {
                C93271a aVar = this.f269085i;
                if (aVar != null) {
                    aVar.mo127926c(true);
                    return;
                }
                return;
            }
            C93271a aVar2 = this.f269085i;
            if (aVar2 != null) {
                aVar2.mo127926c(false);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmojiStoreExchangeTask(String str, String str2, String str3, String str4, String str5, C93271a aVar, int i, C8480h hVar) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : aVar);
    }
}
