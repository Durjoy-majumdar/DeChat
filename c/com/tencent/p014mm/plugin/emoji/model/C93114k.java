package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import p441aq.C92054g;
import p490dl.C97489o;
import sx3.C110818d0;
import sx3.C64197v;
import t61.C101728d;
import t61.C101730f;

/* renamed from: com.tencent.mm.plugin.emoji.model.k */
public final class C93114k implements C93102b0 {

    /* renamed from: a */
    public final String f268251a;

    /* renamed from: b */
    public final String f268252b = "MicroMsg.EmojiMineIPListDataSource";

    /* renamed from: c */
    public final LinkedList<C101728d> f268253c = new LinkedList<>();

    /* renamed from: d */
    public final LinkedList<EmojiGroupInfo> f268254d = new LinkedList<>();

    public C93114k(String str) {
        C87412m.m108594g(str, "ipSetKey");
        this.f268251a = str;
        reset();
    }

    /* renamed from: a */
    public void mo127604a() {
        int i = 0;
        for (T next : this.f268254d) {
            int i2 = i + 1;
            if (i >= 0) {
                EmojiGroupInfo emojiGroupInfo = (EmojiGroupInfo) next;
                String str = this.f268252b;
                Log.m105924i(str, "updateSort: " + emojiGroupInfo.field_packName + ' ' + i);
                emojiGroupInfo.field_idx = i;
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().mo142033uP(this.f268254d);
    }

    /* renamed from: b */
    public LinkedList<EmojiGroupInfo> mo127605b() {
        return this.f268254d;
    }

    public List getDataList() {
        return this.f268253c;
    }

    public void onMove(int i, int i2) {
        C101728d dVar = this.f268253c.get(i);
        String str = null;
        C101730f fVar = dVar instanceof C101730f ? (C101730f) dVar : null;
        EmojiGroupInfo emojiGroupInfo = fVar != null ? fVar.f297806a : null;
        C101728d dVar2 = this.f268253c.get(i2);
        C101730f fVar2 = dVar2 instanceof C101730f ? (C101730f) dVar2 : null;
        EmojiGroupInfo emojiGroupInfo2 = fVar2 != null ? fVar2.f297806a : null;
        int P = C110818d0.m150918P(this.f268254d, emojiGroupInfo);
        int P2 = C110818d0.m150918P(this.f268254d, emojiGroupInfo2);
        String str2 = this.f268252b;
        StringBuilder sb = new StringBuilder();
        sb.append("onMove: ");
        sb.append(emojiGroupInfo != null ? emojiGroupInfo.field_packName : null);
        sb.append(" -> ");
        if (emojiGroupInfo2 != null) {
            str = emojiGroupInfo2.field_packName;
        }
        sb.append(str);
        sb.append("; originList:");
        sb.append(P);
        sb.append(" -> ");
        sb.append(P2);
        Log.m105924i(str2, sb.toString());
        boolean z = true;
        if (P >= 0 && P < this.f268254d.size()) {
            if (P2 < 0 || P2 >= this.f268254d.size()) {
                z = false;
            }
            if (z) {
                EmojiGroupInfo remove = this.f268254d.remove(P);
                C87412m.m108593f(remove, "originList.removeAt(fromIndex)");
                this.f268254d.add(P2, remove);
            }
        }
    }

    public void reset() {
        this.f268253c.clear();
        this.f268254d.clear();
        this.f268254d.addAll(C97489o.m125592g().mo136763d());
        for (EmojiGroupInfo emojiGroupInfo : this.f268254d) {
            if (C87412m.m108589b(emojiGroupInfo.field_ipKey, this.f268251a)) {
                this.f268253c.add(new C101730f(emojiGroupInfo));
            }
        }
    }
}
