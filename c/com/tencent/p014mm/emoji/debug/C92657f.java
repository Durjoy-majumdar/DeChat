package com.tencent.p014mm.emoji.debug;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.smiley.C96927c;
import com.tencent.p014mm.smiley.C96930d0;
import com.tencent.p014mm.smiley.C96964q;
import com.tencent.p014mm.smiley.C96965r;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: com.tencent.mm.emoji.debug.f */
public final class C92657f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C96964q f266647d;

    /* renamed from: e */
    public final /* synthetic */ EmojiDebugUI f266648e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92657f(C96964q qVar, EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f266647d = qVar;
        this.f266648e = emojiDebugUI;
    }

    public Object invoke() {
        C86013q1.m106445f("/sdcard/temp/emojiRes/system_emoji_new/");
        C86013q1.m106461v("/sdcard/temp/emojiRes/system_emoji_new/");
        LinkedList<C96927c> linkedList = this.f266647d.f284064d;
        C87412m.m108593f(linkedList, "header.emojiDataItems");
        EmojiDebugUI emojiDebugUI = this.f266648e;
        int i = 0;
        for (T next : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                C96927c cVar = (C96927c) next;
                boolean z = C96965r.f284067d;
                C96965r rVar = C96965r.C44649c.f121057a;
                String str = rVar.f284073c ? C96965r.f284070g : C96965r.f284069f;
                C96930d0 d0Var = cVar.f283944e;
                int i3 = d0Var.f283953d;
                C96965r.C96968b bVar = rVar.f284072b;
                byte[] O = C86013q1.m106433O(str, i3 + (bVar != null ? bVar.f284078d : 0), d0Var.f283954e);
                StringBuilder sb = new StringBuilder();
                LinkedList<Integer> linkedList2 = cVar.f283943d;
                C87412m.m108593f(linkedList2, "item.codePoints");
                int i4 = 0;
                for (T next2 : linkedList2) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        Integer num = (Integer) next2;
                        C87412m.m108593f(num, "codePoint");
                        sb.append(Integer.toHexString(num.intValue()));
                        if (i4 < cVar.f283943d.size() - 1) {
                            sb.append("-");
                        }
                        i4 = i5;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                C86013q1.m106437S("/sdcard/temp/emojiRes/system_emoji_new/" + sb + ".png", O);
                String str2 = emojiDebugUI.f266603d;
                Log.m105924i(str2, "emoji item: startPos=" + cVar.f283944e.f283953d + ", size=" + cVar.f283944e.f283954e);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        C61926c.m72668M(new C68038e(this.f266648e));
        return C13598b0.f38549a;
    }
}
