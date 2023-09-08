package i61;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import java.util.ArrayList;
import p441aq.C92054g;

/* renamed from: i61.c */
public class C46174c {

    /* renamed from: b */
    public static C46174c f124469b;

    /* renamed from: a */
    public ArrayList<String> f124470a = new ArrayList<>();

    /* renamed from: a */
    public void mo71608a(EmojiInfo emojiInfo, boolean z) {
        EmojiInfo emojiInfo2 = emojiInfo;
        Class cls = C92054g.class;
        if (emojiInfo2 != null) {
            emojiInfo2.field_reserved4 = 0;
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().X90(emojiInfo2);
            ((C92054g) C86312j.m106911c(cls)).mo62467VJ(emojiInfo2);
            if (z) {
                C115669n.INSTANCE.idkeyStat(231, 0, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(231, 1, 1, false);
            }
        }
    }
}
