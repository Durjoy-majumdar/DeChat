package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j61.C46439j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p441aq.C92054g;

/* renamed from: com.tencent.mm.plugin.emoji.model.h0 */
public final class C41048h0 {

    /* renamed from: a */
    public static final Set<String> f110524a;

    /* renamed from: b */
    public static final Set<String> f110525b;

    /* renamed from: c */
    public static final Set<String> f110526c;

    static {
        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet());
        C87412m.m108593f(synchronizedSet, "synchronizedSet(HashSet())");
        f110524a = synchronizedSet;
        Set<String> synchronizedSet2 = Collections.synchronizedSet(new HashSet());
        C87412m.m108593f(synchronizedSet2, "synchronizedSet(HashSet())");
        f110525b = synchronizedSet2;
        Set<String> synchronizedSet3 = Collections.synchronizedSet(new HashSet());
        C87412m.m108593f(synchronizedSet3, "synchronizedSet(HashSet())");
        f110526c = synchronizedSet3;
    }

    /* renamed from: a */
    public static final void m44497a() {
        Set<String> set = f110525b;
        C87412m.m108591d(set);
        if (set.isEmpty()) {
            Log.m105924i("MicroMsg.emoji.WearEmojiLogic", "no emoji need download");
            return;
        }
        Set<String> set2 = f110526c;
        C87412m.m108591d(set2);
        if (!set2.isEmpty()) {
            Log.m105925i("MicroMsg.emoji.WearEmojiLogic", "downloading emoji %s", set2.toString());
            return;
        }
        C87412m.m108591d(set);
        Iterator<String> it = set.iterator();
        if (it != null) {
            String next = it.next();
            C87412m.m108591d(set);
            set.remove(next);
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            EmojiGroupInfo bF = C30790w2.m39221h().mo57715b().mo142025bF(next, true);
            if (bF == null || (bF.field_flag & 256) <= 0) {
                Log.m105925i("MicroMsg.emoji.WearEmojiLogic", "start to download emoji %s", next);
                C87412m.m108591d(set2);
                set2.add(next);
                C86709a0.m107529k().f251779b.mo123460f(new C46439j(next, (String) null, "", (String) null, (String) null, (EmojiGroupInfo) null, 0, 0, 0, (String) null));
                return;
            }
            Log.m105925i("MicroMsg.emoji.WearEmojiLogic", "emoji already exist %s", next);
            m44497a();
        }
    }
}
