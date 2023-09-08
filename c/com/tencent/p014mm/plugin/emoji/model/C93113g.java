package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C8480h;
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
import p813fl.C97938w;

/* renamed from: com.tencent.mm.plugin.emoji.model.g */
public final class C93113g implements C97907h0 {

    /* renamed from: a */
    public final List<C97927q0> f268249a;

    /* renamed from: b */
    public int f268250b;

    public C93113g(boolean z) {
        LinkedList linkedList = new LinkedList();
        this.f268249a = linkedList;
        ArrayList<EmojiInfo> a = C97489o.m125592g().mo136760a();
        this.f268250b = a.size();
        if (z) {
            linkedList.add(new C97938w(0));
        }
        C92668a.C92674f fVar = C92668a.f266699q;
        int c = fVar.mo126718b(false).mo126701c();
        int b = fVar.mo126718b(false).mo126700b();
        Log.m105924i("MicroMsg.EmojiCustomItem", "sync: " + c + ", " + b);
        int i = 0;
        for (EmojiInfo next : a) {
            if (next.field_catalog == 18) {
                this.f268250b--;
            } else if (i >= b) {
                break;
            } else {
                if (i >= c) {
                    ((LinkedList) this.f268249a).add(new C97904g(next, 3, (String) null, 0, 12, (C8480h) null));
                } else {
                    ((LinkedList) this.f268249a).add(new C97904g(next, 0, (String) null, 0, 12, (C8480h) null));
                }
                i++;
            }
        }
        if (C92668a.f266699q.mo126718b(false).hasMore()) {
            ((LinkedList) this.f268249a).add(new C97894c0(0));
        }
    }

    /* renamed from: a */
    public List<C97927q0> mo127614a() {
        return this.f268249a;
    }

    /* renamed from: b */
    public boolean mo127615b() {
        return true;
    }

    public int getDataCount() {
        return this.f268250b;
    }

    /* renamed from: l */
    public C97923p mo127617l() {
        return C97929r0.m126480b();
    }
}
