package r14;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import q14.C110345b;
import q14.C110346e;
import q14.C110347l;
import q14.C25542j;
import q14.C25543k;

/* renamed from: r14.d */
public final class C26097d {

    /* renamed from: a */
    public final boolean f72948a;

    /* renamed from: b */
    public final C26098e f72949b;

    public C26097d(C26096c cVar, C26098e eVar) {
        C87412m.m108594g(cVar, "configuration");
        C87412m.m108594g(eVar, "reader");
        this.f72949b = eVar;
        this.f72948a = cVar.f72939c;
    }

    /* renamed from: a */
    public final C110346e mo52955a() {
        C26098e eVar;
        byte b;
        C26098e eVar2;
        byte b2;
        boolean z = false;
        if (this.f72949b.mo52961f()) {
            C26098e eVar3 = this.f72949b;
            byte b3 = eVar3.f72951b;
            if (b3 == 0) {
                return mo52956b(false);
            }
            if (b3 == 1) {
                return mo52956b(true);
            }
            if (b3 != 6) {
                if (b3 != 8) {
                    if (b3 == 10) {
                        C25543k kVar = C25543k.f72235e;
                        eVar3.mo52962g();
                        return kVar;
                    }
                    C26098e.m33448d(eVar3, "Can't begin reading element, unexpected token", 0, 2, (Object) null);
                    throw null;
                } else if (b3 == 8) {
                    eVar3.mo52962g();
                    C26098e eVar4 = this.f72949b;
                    boolean z2 = eVar4.f72951b != 4;
                    int i = eVar4.f72950a;
                    if (z2) {
                        ArrayList arrayList = new ArrayList();
                        do {
                            boolean z3 = false;
                            while (this.f72949b.mo52961f()) {
                                arrayList.add(mo52955a());
                                eVar2 = this.f72949b;
                                b2 = eVar2.f72951b;
                                if (b2 == 4) {
                                    eVar2.mo52962g();
                                    z3 = true;
                                }
                            }
                            C26098e eVar5 = this.f72949b;
                            boolean z4 = !z3;
                            int i2 = eVar5.f72950a;
                            if (z4) {
                                eVar5.mo52962g();
                                return new C110345b(arrayList);
                            }
                            eVar5.mo52959c("Unexpected trailing comma", i2);
                            throw null;
                        } while (b2 == 9);
                        eVar2.mo52959c("Expected end of the array or comma", eVar2.f72952c);
                        throw null;
                    }
                    eVar4.mo52959c("Unexpected leading comma", i);
                    throw null;
                } else {
                    eVar3.mo52959c("Expected start of the array", eVar3.f72952c);
                    throw null;
                }
            } else if (b3 == 6) {
                eVar3.mo52962g();
                C26098e eVar6 = this.f72949b;
                boolean z5 = eVar6.f72951b != 4;
                int i3 = eVar6.f72950a;
                if (z5) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    do {
                        boolean z6 = false;
                        while (this.f72949b.mo52961f()) {
                            String h = this.f72948a ? this.f72949b.mo52963h() : this.f72949b.mo52965j();
                            C26098e eVar7 = this.f72949b;
                            if (eVar7.f72951b == 5) {
                                eVar7.mo52962g();
                                linkedHashMap.put(h, mo52955a());
                                eVar = this.f72949b;
                                b = eVar.f72951b;
                                if (b == 4) {
                                    eVar.mo52962g();
                                    z6 = true;
                                }
                            } else {
                                eVar7.mo52959c("Expected ':'", eVar7.f72952c);
                                throw null;
                            }
                        }
                        C26098e eVar8 = this.f72949b;
                        if (!z6 && eVar8.f72951b == 7) {
                            z = true;
                        }
                        int i4 = eVar8.f72950a;
                        if (z) {
                            eVar8.mo52962g();
                            return new C110347l(linkedHashMap);
                        }
                        eVar8.mo52959c("Expected end of the object", i4);
                        throw null;
                    } while (b == 7);
                    eVar.mo52959c("Expected end of the object or comma", eVar.f72952c);
                    throw null;
                }
                eVar6.mo52959c("Unexpected leading comma", i3);
                throw null;
            } else {
                eVar3.mo52959c("Expected start of the object", eVar3.f72952c);
                throw null;
            }
        } else {
            C26098e.m33448d(this.f72949b, "Can't begin reading value from here", 0, 2, (Object) null);
            throw null;
        }
    }

    /* renamed from: b */
    public final C110346e mo52956b(boolean z) {
        String str;
        if (this.f72948a) {
            str = this.f72949b.mo52963h();
        } else {
            C26098e eVar = this.f72949b;
            str = z ? eVar.mo52965j() : eVar.mo52963h();
        }
        return new C25542j(str, z);
    }
}
