package zg3;

import com.tencent.p014mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import p490dl.C97489o;
import u61.C101964h;

/* renamed from: zg3.a */
public final class C103030a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f304009d;

    /* renamed from: e */
    public final /* synthetic */ EmojiInfo f304010e;

    public C103030a(long j, EmojiInfo emojiInfo) {
        this.f304009d = j;
        this.f304010e = emojiInfo;
    }

    public final void run() {
        RelatedEmoticonActionStruct relatedEmoticonActionStruct = new RelatedEmoticonActionStruct();
        relatedEmoticonActionStruct.f265792d = C79330c.f232896a;
        relatedEmoticonActionStruct.f265793e = 4;
        EmojiInfo emojiInfo = C79330c.f232897b;
        String str = null;
        relatedEmoticonActionStruct.mo126627u(emojiInfo != null ? emojiInfo.field_groupId : null);
        EmojiInfo emojiInfo2 = C79330c.f232897b;
        if (emojiInfo2 != null) {
            str = emojiInfo2.getMd5();
        }
        relatedEmoticonActionStruct.mo126626t(str);
        relatedEmoticonActionStruct.f265798j = this.f304009d;
        relatedEmoticonActionStruct.f265799k = 4;
        relatedEmoticonActionStruct.f265796h = relatedEmoticonActionStruct.mo86045b("Pid", this.f304010e.field_groupId, true);
        relatedEmoticonActionStruct.f265797i = relatedEmoticonActionStruct.mo86045b("Md5", this.f304010e.getMd5(), true);
        relatedEmoticonActionStruct.f265800l = relatedEmoticonActionStruct.mo86045b("IsFree2", String.valueOf(this.f304010e.f284128T1), true);
        relatedEmoticonActionStruct.f265802n = relatedEmoticonActionStruct.mo86045b("IsLocal2", C97489o.m125592g().mo136768j(this.f304010e) ? "2" : "1", true);
        if (C101964h.m134231m(this.f304010e)) {
            relatedEmoticonActionStruct.f265801m = relatedEmoticonActionStruct.mo86045b("Type2", "1", true);
        } else {
            relatedEmoticonActionStruct.f265801m = relatedEmoticonActionStruct.mo86045b("Type2", "2", true);
        }
        relatedEmoticonActionStruct.mo126625s(C79330c.f232898c);
        relatedEmoticonActionStruct.mo86054n();
    }
}
