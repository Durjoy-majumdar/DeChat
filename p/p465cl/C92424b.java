package p465cl;

import com.tencent.p014mm.storage.emotion.EmojiInfo;
import v51.C102148e;

/* renamed from: cl.b */
public final class C92424b {
    /* renamed from: a */
    public final void mo126423a(C92425c cVar, boolean z) {
        if (z) {
            int i = cVar.f264474g;
            if (i == 1) {
                C102148e.m134580a(7, 1);
            } else if (i == 2) {
                C102148e.m134580a(11, 1);
            } else if (i == 3) {
                C102148e.m134580a(24, 1);
            }
        } else {
            EmojiInfo emojiInfo = cVar.f264468a;
            int i2 = cVar.f264474g;
            if (i2 == 1) {
                C102148e.m134580a(8, 1);
                C102148e.m134581b(emojiInfo.getMd5(), 3, 0, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
            } else if (i2 == 2) {
                C102148e.m134580a(12, 1);
                C102148e.m134581b(emojiInfo.getMd5(), 4, 0, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
            } else if (i2 == 3) {
                C102148e.m134580a(25, 1);
            }
        }
    }
}
