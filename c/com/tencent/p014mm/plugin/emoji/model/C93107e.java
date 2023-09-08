package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p490dl.C97489o;
import p813fl.C97894c0;
import p813fl.C97904g;
import p813fl.C97907h0;
import p813fl.C97923p;
import p813fl.C97927q0;
import p813fl.C97929r0;

/* renamed from: com.tencent.mm.plugin.emoji.model.e */
public final class C93107e implements C97907h0 {

    /* renamed from: a */
    public final List<C97927q0> f268233a = new LinkedList();

    /* renamed from: b */
    public final int f268234b;

    public C93107e() {
        ArrayList<EmojiInfo> b = C97489o.m125592g().mo136761b(false);
        this.f268234b = b.size();
        C92668a.C92674f fVar = C92668a.f266699q;
        int c = fVar.mo126717a(false).mo126701c();
        int b2 = fVar.mo126717a(false).mo126700b();
        int i = 0;
        for (EmojiInfo next : b) {
            if (i >= b2) {
                break;
            }
            if (i >= c) {
                List<C97927q0> list = this.f268233a;
                C87412m.m108593f(next, "info");
                list.add(new C97904g(next, 3, (String) null, 0, 12, (C8480h) null));
            } else {
                List<C97927q0> list2 = this.f268233a;
                C87412m.m108593f(next, "info");
                list2.add(new C97904g(next, 1, (String) null, 0, 12, (C8480h) null));
            }
            i++;
        }
        if (C92668a.f266699q.mo126717a(false).hasMore()) {
            this.f268233a.add(new C97894c0(1));
        }
    }

    /* renamed from: a */
    public List<C97927q0> mo127614a() {
        return this.f268233a;
    }

    /* renamed from: b */
    public boolean mo127615b() {
        return true;
    }

    public int getDataCount() {
        return this.f268234b;
    }

    /* renamed from: l */
    public C97923p mo127617l() {
        return C97929r0.m126479a();
    }
}
