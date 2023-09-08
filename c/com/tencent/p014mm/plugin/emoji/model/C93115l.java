package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiIPSetInfo;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p441aq.C92054g;
import p490dl.C45411m;
import p490dl.C97489o;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import t61.C101728d;
import t61.C101730f;
import t61.C101731g;

/* renamed from: com.tencent.mm.plugin.emoji.model.l */
public final class C93115l implements C93102b0 {

    /* renamed from: a */
    public final boolean f268255a;

    /* renamed from: b */
    public final LinkedList<C101728d> f268256b = new LinkedList<>();

    /* renamed from: c */
    public final LinkedList<EmojiGroupInfo> f268257c = new LinkedList<>();

    public C93115l(boolean z) {
        this.f268255a = z;
        reset();
    }

    /* renamed from: a */
    public void mo127604a() {
        int i = 0;
        for (T next : this.f268257c) {
            int i2 = i + 1;
            if (i >= 0) {
                EmojiGroupInfo emojiGroupInfo = (EmojiGroupInfo) next;
                Log.m105924i("MicroMsg.EmojiMineListDataSource", "updateSort: " + emojiGroupInfo.field_packName + ' ' + i);
                emojiGroupInfo.field_idx = i;
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().mo142033uP(this.f268257c);
    }

    /* renamed from: b */
    public LinkedList<EmojiGroupInfo> mo127605b() {
        return this.f268257c;
    }

    public List getDataList() {
        return this.f268256b;
    }

    public void onMove(int i, int i2) {
        EmojiGroupInfo emojiGroupInfo;
        C101728d dVar = this.f268256b.get(i);
        C87412m.m108593f(dVar, "dataList[from]");
        C101728d dVar2 = dVar;
        LinkedList<EmojiGroupInfo> linkedList = new LinkedList<>();
        int i3 = 0;
        if (dVar2 instanceof C101730f) {
            emojiGroupInfo = ((C101730f) dVar2).f297806a;
        } else if (dVar2 instanceof C101731g) {
            C101731g gVar = (C101731g) dVar2;
            linkedList.addAll(gVar.f297808b);
            linkedList.removeFirst();
            EmojiGroupInfo emojiGroupInfo2 = gVar.f297808b.get(0);
            C87412m.m108593f(emojiGroupInfo2, "{\n                otherG…roupList[0]\n            }");
            emojiGroupInfo = emojiGroupInfo2;
        } else {
            return;
        }
        C101728d dVar3 = (C101728d) C110818d0.m150917O(this.f268256b, i2);
        String str = null;
        EmojiGroupInfo emojiGroupInfo3 = dVar3 instanceof C101730f ? ((C101730f) dVar3).f297806a : dVar3 instanceof C101731g ? ((C101731g) dVar3).f297808b.get(0) : null;
        if (emojiGroupInfo3 != null) {
            i3 = this.f268257c.indexOf(emojiGroupInfo3);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onMove: index:");
        sb.append(i);
        sb.append(" -> ");
        sb.append(i2);
        sb.append(" (toOriginIndex:");
        sb.append(i3);
        sb.append("), from:");
        sb.append(emojiGroupInfo.field_packName);
        sb.append(" toAfter:");
        if (emojiGroupInfo3 != null) {
            str = emojiGroupInfo3.field_packName;
        }
        sb.append(str);
        Log.m105924i("MicroMsg.EmojiMineListDataSource", sb.toString());
        this.f268257c.remove(emojiGroupInfo);
        this.f268257c.add(i3, emojiGroupInfo);
        for (EmojiGroupInfo emojiGroupInfo4 : linkedList) {
            int indexOf = this.f268257c.indexOf(emojiGroupInfo4);
            if (indexOf <= i3) {
                Log.m105924i("MicroMsg.EmojiMineListDataSource", "onMove: other group: " + indexOf + " -> " + i3 + ", " + emojiGroupInfo4.field_packName);
                this.f268257c.remove(emojiGroupInfo4);
                this.f268257c.add(i3, emojiGroupInfo4);
            }
        }
    }

    public void reset() {
        this.f268256b.clear();
        this.f268257c.clear();
        this.f268257c.addAll(C97489o.m125592g().mo136763d());
        for (EmojiGroupInfo emojiGroupInfo : this.f268257c) {
            Log.m105924i("MicroMsg.EmojiMineListDataSource", "beforeSort: " + emojiGroupInfo.field_packName);
        }
        if (this.f268255a) {
            for (C45411m mVar : C45411m.f122928c.mo70911a(this.f268257c)) {
                if (!mVar.f122930b.isEmpty()) {
                    EmojiIPSetInfo emojiIPSetInfo = mVar.f122929a;
                    if (emojiIPSetInfo == null) {
                        LinkedList<C101728d> linkedList = this.f268256b;
                        EmojiGroupInfo emojiGroupInfo2 = mVar.f122930b.get(0);
                        C87412m.m108593f(emojiGroupInfo2, "it.groupList[0]");
                        linkedList.add(new C101730f(emojiGroupInfo2));
                    } else {
                        C101731g gVar = new C101731g(emojiIPSetInfo);
                        gVar.f297808b.addAll(mVar.f122930b);
                        this.f268256b.add(gVar);
                    }
                }
            }
            return;
        }
        LinkedList<C101728d> linkedList2 = this.f268256b;
        LinkedList<EmojiGroupInfo> linkedList3 = this.f268257c;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList3, 10));
        for (EmojiGroupInfo fVar : linkedList3) {
            arrayList.add(new C101730f(fVar));
        }
        linkedList2.addAll(arrayList);
    }
}
