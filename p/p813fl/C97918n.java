package p813fl;

import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiIPSetInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import p490dl.C45411m;
import p490dl.C97489o;
import rx3.C13598b0;
import z51.C39315g;
import zc3.C103010b;

/* renamed from: fl.n */
public final class C97918n {

    /* renamed from: a */
    public final C97906h f287233a;

    /* renamed from: b */
    public final C97913k0 f287234b;

    /* renamed from: c */
    public C97921o f287235c = new C97921o();

    /* renamed from: d */
    public C97921o f287236d = new C97921o();

    /* renamed from: e */
    public C54248l.C54251c f287237e;

    /* renamed from: f */
    public C54248l.C54251c f287238f;

    /* renamed from: g */
    public boolean f287239g;

    /* renamed from: h */
    public boolean f287240h;

    /* renamed from: fl.n$a */
    public static final class C97919a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C97918n f287241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97919a(C97918n nVar) {
            super(0);
            this.f287241d = nVar;
        }

        /* JADX INFO: finally extract failed */
        public Object invoke() {
            T t;
            Object obj;
            C97918n nVar = this.f287241d;
            nVar.f287236d.f287244b.clear();
            nVar.f287236d.f287245c.clear();
            boolean z = true;
            if (nVar.f287233a.f287205b) {
                nVar.f287236d.f287245c.add(new C97934u0(new C97926q(3), -1));
                nVar.f287236d.f287246d = 1;
            }
            if (nVar.f287233a.f287206c) {
                nVar.mo137245a(C97929r0.m126481c());
            }
            if (nVar.f287233a.f287207d) {
                nVar.mo137245a(C97929r0.m126480b());
            }
            C97906h hVar = nVar.f287233a;
            if (hVar.f287210g) {
                boolean z2 = hVar.f287211h;
                C97903f0 f0Var = new C97903f0(C97929r0.m126479a());
                LinkedList linkedList = new LinkedList();
                ArrayList<EmojiInfo> b = C97489o.m125592g().mo136761b(true);
                b.size();
                if (!b.isEmpty()) {
                    linkedList.add(f0Var);
                    if (z2) {
                        linkedList.add(new C97938w(1));
                    }
                    C92668a.C92674f fVar = C92668a.f266699q;
                    int c = fVar.mo126717a(false).mo126701c();
                    int b2 = fVar.mo126717a(false).mo126700b();
                    int i = 0;
                    for (EmojiInfo next : b) {
                        if (i >= b2) {
                            break;
                        }
                        if (i >= c) {
                            C87412m.m108593f(next, "info");
                            C97904g gVar = r10;
                            C97904g gVar2 = new C97904g(next, 3, (String) null, 0, 12, (C8480h) null);
                            linkedList.add(gVar);
                        } else {
                            C87412m.m108593f(next, "info");
                            linkedList.add(new C97904g(next, 1, (String) null, 0, 12, (C8480h) null));
                        }
                        i++;
                    }
                    if (C92668a.f266699q.mo126717a(false).hasMore()) {
                        z = true;
                        linkedList.add(new C97894c0(1));
                    } else {
                        z = true;
                    }
                } else if (z2) {
                    linkedList.add(new C97890b());
                }
                if (linkedList.isEmpty() ^ z) {
                    nVar.mo137245a(C97929r0.m126479a());
                }
            }
            C97906h hVar2 = nVar.f287233a;
            hVar2.f287215l = false;
            if (hVar2.f287212i) {
                if (!hVar2.f287214k) {
                    LinkedList<C97923p> linkedList2 = new LinkedList<>();
                    HashMap hashMap = new HashMap();
                    C103010b provider = ((C39315g) C86312j.m106911c(C39315g.class)).getProvider();
                    ArrayList<EmojiGroupInfo> d = C97489o.m125592g().mo136763d();
                    C87412m.m108593f(d, "getInstance().emojiGroupInfoList");
                    for (EmojiGroupInfo emojiGroupInfo : d) {
                        String str = emojiGroupInfo.field_ipKey;
                        EmojiIPSetInfo p = provider.mo138031p(str);
                        if (p == null) {
                            linkedList2.add(new C97928r(0, emojiGroupInfo));
                        } else {
                            C97930s sVar = (C97930s) hashMap.get(str);
                            if (sVar == null) {
                                sVar = new C97930s(p);
                                C87412m.m108593f(str, "ipKey");
                                hashMap.put(str, sVar);
                            }
                            sVar.f287258c.add(emojiGroupInfo);
                            C97928r rVar = new C97928r(0, emojiGroupInfo);
                            if (nVar.f287233a.f287213j) {
                                linkedList2.add(new C97932t(rVar, sVar));
                            } else {
                                linkedList2.add(new C97928r(0, emojiGroupInfo));
                            }
                        }
                    }
                    for (C97923p pVar : linkedList2) {
                        if (pVar instanceof C97932t) {
                            C97932t tVar = (C97932t) pVar;
                            if (tVar.f287262c.f287258c.size() == 1) {
                                nVar.mo137245a(tVar.f287261b);
                            }
                        }
                        nVar.mo137245a(pVar);
                    }
                } else {
                    LinkedList<C97923p> linkedList3 = new LinkedList<>();
                    C97489o g = C97489o.m125592g();
                    g.getClass();
                    try {
                        g.f286137i.lock();
                        ArrayList<EmojiGroupInfo> d2 = g.mo136763d();
                        if (g.f286136h == null) {
                            ArrayList<C45411m> arrayList = new ArrayList<>();
                            g.f286136h = arrayList;
                            arrayList.addAll(C45411m.f122928c.mo70911a(d2));
                        }
                        ArrayList<C45411m> arrayList2 = g.f286136h;
                        g.f286137i.unlock();
                        C87412m.m108593f(arrayList2, "ipSetGroupList");
                        Iterator<C45411m> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C45411m next2 = it.next();
                            EmojiIPSetInfo emojiIPSetInfo = next2.f122929a;
                            if (next2.f122930b.size() == 1) {
                                EmojiGroupInfo emojiGroupInfo2 = next2.f122930b.get(0);
                                C87412m.m108593f(emojiGroupInfo2, "it.groupList[0]");
                                linkedList3.add(new C97928r(0, emojiGroupInfo2));
                            } else if (emojiIPSetInfo != null) {
                                C97930s sVar2 = new C97930s(emojiIPSetInfo);
                                sVar2.f287258c.addAll(next2.f122930b);
                                sVar2.f287259d = nVar.f287233a.f287218o;
                                linkedList3.add(sVar2);
                                nVar.f287233a.f287215l = true;
                            }
                        }
                        for (C97923p a : linkedList3) {
                            nVar.mo137245a(a);
                        }
                    } catch (Throwable th) {
                        g.f286137i.unlock();
                        throw th;
                    }
                }
            }
            for (C97923p pVar2 : nVar.f287236d.f287244b) {
                Iterator<T> it4 = nVar.f287235c.f287243a.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it4.next();
                    if (((C97924p0) t).mo127612b().mo127617l().mo137248b(pVar2)) {
                        break;
                    }
                }
                C97924p0 p0Var = (C97924p0) t;
                if (p0Var != null) {
                    p0Var.mo137253c();
                    if ((p0Var instanceof C97895c1) && (pVar2 instanceof C97928r)) {
                        C97928r rVar2 = (C97928r) pVar2;
                        C87412m.m108594g(rVar2, "<set-?>");
                        ((C97895c1) p0Var).f287185d = rVar2;
                    }
                    nVar.f287236d.f287243a.add(p0Var);
                } else {
                    LinkedList<C97924p0<?>> linkedList4 = nVar.f287236d.f287243a;
                    C97906h hVar3 = nVar.f287233a;
                    C87412m.m108594g(hVar3, "config");
                    C87412m.m108594g(pVar2, "group");
                    String c2 = pVar2.mo137249c();
                    if (C87412m.m108589b(c2, "smiley")) {
                        obj = new C97943y0(hVar3);
                    } else if (C87412m.m108589b(c2, "custom")) {
                        obj = new C97902f(hVar3);
                    } else if (C87412m.m108589b(c2, "capture")) {
                        obj = new C97896d(hVar3);
                    } else {
                        obj = pVar2 instanceof C97930s ? new C97901e1((C97930s) pVar2) : pVar2 instanceof C97932t ? new C97898d1((C97932t) pVar2) : new C97895c1((C97928r) pVar2);
                    }
                    linkedList4.add(obj);
                }
            }
            C97918n nVar2 = this.f287241d;
            nVar2.getClass();
            nVar2.f287237e = C54248l.m60949a(new C97908i(nVar2), false);
            C97918n nVar3 = this.f287241d;
            nVar3.getClass();
            nVar3.f287238f = C54248l.m60949a(new C97910j(nVar3), false);
            C97918n nVar4 = this.f287241d;
            nVar4.f287235c = nVar4.f287236d;
            nVar4.f287236d = new C97921o();
            C61926c.m72668M(new C97916m(nVar4, nVar4.f287235c));
            return C13598b0.f38549a;
        }
    }

    public C97918n(C97906h hVar, C97913k0 k0Var) {
        C87412m.m108594g(hVar, "config");
        C87412m.m108594g(k0Var, "dataListener");
        this.f287233a = hVar;
        this.f287234b = k0Var;
        new HashSet();
    }

    /* renamed from: a */
    public final void mo137245a(C97923p pVar) {
        int size = this.f287236d.f287244b.size();
        this.f287236d.f287244b.add(pVar);
        this.f287236d.f287245c.add(new C97934u0(pVar, size));
    }

    /* renamed from: b */
    public final synchronized void mo137246b() {
        if (this.f287239g) {
            this.f287240h = true;
            return;
        }
        Log.m105924i("MicroMsg.EmojiPanelData", "updateData: start " + this.f287233a.f287206c + ", " + this.f287233a.f287207d + ", " + this.f287233a.f287210g + ", " + this.f287233a.f287212i);
        this.f287239g = true;
        C61926c.m72657B("EmojiPanelData_updateData", true, new C97919a(this));
    }
}
