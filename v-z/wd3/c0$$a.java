package wd3;

import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import p1072al.C92042f;
import p441aq.C92054g;
import p911ml.C99924m;
import wc3.C78541w;

public final /* synthetic */ class c0$$a implements C92042f {

    /* renamed from: a */
    public final /* synthetic */ C78541w.C78542a f230092a;

    /* renamed from: b */
    public final /* synthetic */ EmojiInfo f230093b;

    /* renamed from: c */
    public final /* synthetic */ String f230094c;

    /* renamed from: d */
    public final /* synthetic */ long f230095d;

    public /* synthetic */ c0$$a(C78541w.C78542a aVar, EmojiInfo emojiInfo, String str, long j) {
        this.f230092a = aVar;
        this.f230093b = emojiInfo;
        this.f230094c = str;
        this.f230095d = j;
    }

    /* renamed from: a */
    public final void mo55799a(boolean z) {
        C78541w.C78542a aVar = this.f230092a;
        EmojiInfo emojiInfo = this.f230093b;
        String str = this.f230094c;
        long j = this.f230095d;
        if (aVar != null) {
            new C99924m(emojiInfo, new c0$$b(aVar, str, emojiInfo, j));
        } else if (z) {
            ((C92054g) C86312j.m106911c(C92054g.class)).xx0().mo138011S(str, emojiInfo, (C72963f4) null);
        }
    }
}
