package zg3;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import p490dl.C97489o;
import u61.C101964h;

/* renamed from: zg3.b */
public final class C103031b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f304011d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<IEmojiInfo> f304012e;

    public C103031b(long j, ArrayList<IEmojiInfo> arrayList) {
        this.f304011d = j;
        this.f304012e = arrayList;
    }

    public final void run() {
        RelatedEmoticonActionStruct relatedEmoticonActionStruct = new RelatedEmoticonActionStruct();
        relatedEmoticonActionStruct.f265792d = C79330c.f232896a;
        relatedEmoticonActionStruct.f265793e = 3;
        EmojiInfo emojiInfo = C79330c.f232897b;
        String str = null;
        relatedEmoticonActionStruct.mo126627u(emojiInfo != null ? emojiInfo.field_groupId : null);
        EmojiInfo emojiInfo2 = C79330c.f232897b;
        if (emojiInfo2 != null) {
            str = emojiInfo2.getMd5();
        }
        relatedEmoticonActionStruct.mo126626t(str);
        relatedEmoticonActionStruct.f265798j = this.f304011d;
        relatedEmoticonActionStruct.f265799k = 4;
        relatedEmoticonActionStruct.f265796h = relatedEmoticonActionStruct.mo86045b("Pid", "", true);
        relatedEmoticonActionStruct.f265797i = relatedEmoticonActionStruct.mo86045b("Md5", "", true);
        relatedEmoticonActionStruct.f265800l = relatedEmoticonActionStruct.mo86045b("IsFree2", "", true);
        relatedEmoticonActionStruct.f265801m = relatedEmoticonActionStruct.mo86045b("Type2", "", true);
        relatedEmoticonActionStruct.f265802n = relatedEmoticonActionStruct.mo86045b("IsLocal2", "", true);
        for (IEmojiInfo iEmojiInfo : this.f304012e) {
            relatedEmoticonActionStruct.f265796h = relatedEmoticonActionStruct.mo86045b("Pid", relatedEmoticonActionStruct.f265796h + iEmojiInfo.getGroupId() + '#', true);
            relatedEmoticonActionStruct.f265797i = relatedEmoticonActionStruct.mo86045b("Md5", relatedEmoticonActionStruct.f265797i + iEmojiInfo.getMd5() + '#', true);
            relatedEmoticonActionStruct.f265800l = relatedEmoticonActionStruct.mo86045b("IsFree2", relatedEmoticonActionStruct.f265800l + iEmojiInfo.mo62650V1() + '#', true);
            StringBuilder sb = new StringBuilder();
            sb.append(relatedEmoticonActionStruct.f265802n);
            sb.append(C97489o.m125592g().mo136768j(iEmojiInfo) ? "2" : "1");
            sb.append('#');
            relatedEmoticonActionStruct.f265802n = relatedEmoticonActionStruct.mo86045b("IsLocal2", sb.toString(), true);
            if (C101964h.m134231m(iEmojiInfo)) {
                relatedEmoticonActionStruct.f265801m = relatedEmoticonActionStruct.mo86045b("Type2", relatedEmoticonActionStruct.f265801m + "1#", true);
            } else {
                relatedEmoticonActionStruct.f265801m = relatedEmoticonActionStruct.mo86045b("Type2", relatedEmoticonActionStruct.f265801m + "2#", true);
            }
        }
        relatedEmoticonActionStruct.mo126625s(C79330c.f232898c);
        relatedEmoticonActionStruct.mo86054n();
    }
}
