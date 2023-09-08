package p534gl;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: gl.b */
public final class C32469b implements C32481n {

    /* renamed from: a */
    public final /* synthetic */ C32471d f86267a;

    /* renamed from: b */
    public final /* synthetic */ boolean f86268b;

    /* renamed from: c */
    public final /* synthetic */ LinkedList<C32482o> f86269c;

    /* renamed from: d */
    public final /* synthetic */ C32481n f86270d;

    public C32469b(C32471d dVar, boolean z, LinkedList<C32482o> linkedList, C32481n nVar) {
        this.f86267a = dVar;
        this.f86268b = z;
        this.f86269c = linkedList;
        this.f86270d = nVar;
    }

    /* renamed from: a */
    public void mo57547a(List<C32482o> list, C32483p pVar) {
        List<C32482o> list2 = list;
        C32483p pVar2 = pVar;
        C87412m.m108594g(list2, "emojiList");
        C87412m.m108594g(pVar2, "wordInfo");
        Log.m105924i("MicroMsg.IEmojiSuggest", "onResult: remote " + list.size());
        if (this.f86267a.f86266e) {
            T t = null;
            if (this.f86268b) {
                LinkedList<C32482o> linkedList = this.f86269c;
                ArrayList arrayList = new ArrayList();
                for (T next : linkedList) {
                    if (((C32482o) next).f86293a.field_catalog == 81) {
                        arrayList.add(next);
                    }
                }
                LinkedList<C32482o> linkedList2 = this.f86269c;
                ArrayList arrayList2 = new ArrayList();
                for (T next2 : linkedList2) {
                    if (((C32482o) next2).f86293a.field_catalog != 81) {
                        arrayList2.add(next2);
                    }
                }
                LinkedList linkedList3 = new LinkedList(list2);
                linkedList3.addAll(this.f86269c);
                ArrayList arrayList3 = new ArrayList();
                for (Object next3 : linkedList3) {
                    if (((C32482o) next3).f86293a.field_lastUseTime != 0) {
                        arrayList3.add(next3);
                    }
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    t = it.next();
                    if (it.hasNext()) {
                        long j = ((C32482o) t).f86293a.field_lastUseTime;
                        do {
                            T next4 = it.next();
                            long j2 = ((C32482o) next4).f86293a.field_lastUseTime;
                            if (j < j2) {
                                t = next4;
                                j = j2;
                            }
                        } while (it.hasNext());
                    }
                }
                C32482o oVar = (C32482o) t;
                if (oVar != null) {
                    oVar.f86295c = 1;
                    this.f86267a.f86276h.add(oVar);
                }
                C32471d dVar = this.f86267a;
                C32471d.m39735a(dVar, dVar.f86276h, arrayList);
                C32471d dVar2 = this.f86267a;
                C32471d.m39735a(dVar2, dVar2.f86276h, list2);
                C32471d dVar3 = this.f86267a;
                C32471d.m39735a(dVar3, dVar3.f86276h, arrayList2);
            } else {
                Iterator<T> it4 = this.f86269c.iterator();
                if (it4.hasNext()) {
                    t = it4.next();
                    if (it4.hasNext()) {
                        long j3 = ((C32482o) t).f86293a.field_lastUseTime;
                        do {
                            T next5 = it4.next();
                            long j4 = ((C32482o) next5).f86293a.field_lastUseTime;
                            if (j3 < j4) {
                                t = next5;
                                j3 = j4;
                            }
                        } while (it4.hasNext());
                    }
                }
                C32482o oVar2 = (C32482o) t;
                if (oVar2 != null) {
                    oVar2.f86295c = 1;
                    this.f86267a.f86276h.add(oVar2);
                }
                C32471d dVar4 = this.f86267a;
                C32471d.m39735a(dVar4, dVar4.f86276h, this.f86269c);
                C32471d dVar5 = this.f86267a;
                C32471d.m39735a(dVar5, dVar5.f86276h, list2);
            }
            C32481n nVar = this.f86270d;
            if (nVar != null) {
                nVar.mo57547a(this.f86267a.f86276h, pVar2);
            }
            C32473f fVar = C32473f.f86278a;
            LinkedList<C32482o> linkedList4 = this.f86267a.f86276h;
            C87412m.m108594g(linkedList4, "emojiList");
            if (!linkedList4.isEmpty()) {
                int size = linkedList4.size();
                ArrayList arrayList4 = new ArrayList();
                for (T next6 : linkedList4) {
                    if (((C32482o) next6).f86294b == 0) {
                        arrayList4.add(next6);
                    }
                }
                int size2 = arrayList4.size();
                fVar.mo58650a(1);
                if (size <= 2) {
                    fVar.mo58650a(2);
                } else if (size <= 5) {
                    fVar.mo58650a(3);
                } else if (size <= 10) {
                    fVar.mo58650a(4);
                } else if (size <= 50) {
                    fVar.mo58650a(5);
                } else {
                    fVar.mo58650a(9);
                }
                if (size2 > 0) {
                    fVar.mo58650a(11);
                    if (size2 <= 2) {
                        fVar.mo58650a(12);
                    } else if (size2 <= 5) {
                        fVar.mo58650a(13);
                    } else if (size2 <= 10) {
                        fVar.mo58650a(14);
                    } else if (size2 <= 50) {
                        fVar.mo58650a(15);
                    } else {
                        fVar.mo58650a(19);
                    }
                }
            }
        }
    }
}
