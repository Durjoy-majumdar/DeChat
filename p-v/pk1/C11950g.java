package pk1;

import al1.C54130j;
import android.view.MenuItem;
import cl1.C54963d0;
import eb0.C75592q0;
import fj1.C45795b;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import nj3.C11184p0;
import pk1.C11952i;

/* renamed from: pk1.g */
public final class C11950g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C11951h f34884d;

    public C11950g(C11951h hVar) {
        this.f34884d = hVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C54130j jVar;
        C11952i.C11957d dVar;
        C11952i.C11957d a;
        List<C54130j> list;
        C11952i.C11957d dVar2;
        C11952i.C11957d dVar3;
        C11973o oVar = C11973o.CHEERS;
        C11973o oVar2 = C11973o.STAR;
        Class cls = C54963d0.class;
        C11973o oVar3 = C11973o.ROCKET;
        C11973o oVar4 = C11973o.OX;
        C11973o oVar5 = C11973o.LOVE;
        int i2 = 1;
        C11952i.C11957d dVar4 = null;
        if (menuItem.getItemId() == 1) {
            C11951h hVar = this.f34884d;
            hVar.f34887c.clear();
            LinkedList<C11952i.C11957d> linkedList = hVar.f34887c;
            C11952i.C11957d a2 = hVar.mo11818a(oVar5, 1);
            if (a2 != null) {
                a2.f34897c = "1";
            } else {
                a2 = null;
            }
            linkedList.offerLast(a2);
            LinkedList<C11952i.C11957d> linkedList2 = hVar.f34887c;
            C11952i.C11957d a3 = hVar.mo11818a(oVar5, 5);
            if (a3 != null) {
                a3.f34898d = 4000;
                a3.f34897c = "1";
                dVar4 = a3;
            }
            linkedList2.offerLast(dVar4);
            C11952i.f34888a.mo11819a(hVar.f34887c, false);
        } else if (menuItem.getItemId() == 2) {
            C11951h hVar2 = this.f34884d;
            hVar2.f34887c.clear();
            LinkedList<C11952i.C11957d> linkedList3 = hVar2.f34887c;
            C11952i.C11957d a4 = hVar2.mo11818a(oVar3, 5);
            if (a4 != null) {
                a4.f34898d = 150;
            } else {
                a4 = null;
            }
            linkedList3.offerLast(a4);
            LinkedList<C11952i.C11957d> linkedList4 = hVar2.f34887c;
            C11952i.C11957d a5 = hVar2.mo11818a(oVar4, 1);
            if (a5 != null) {
                a5.f34898d = 250;
            } else {
                a5 = null;
            }
            linkedList4.offerLast(a5);
            int i3 = 0;
            while (i3 < 20) {
                LinkedList<C11952i.C11957d> linkedList5 = hVar2.f34887c;
                C11952i.C11957d a6 = hVar2.mo11818a(oVar5, i2);
                if (a6 != null) {
                    a6.f34898d = ((long) i3) * 100;
                    a6.f34897c = "1";
                } else {
                    a6 = null;
                }
                linkedList5.offerLast(a6);
                i3++;
                i2 = 1;
            }
            C11952i.f34888a.mo11819a(hVar2.f34887c, false);
        } else if (menuItem.getItemId() == 3) {
            C11951h hVar3 = this.f34884d;
            hVar3.f34887c.clear();
            hVar3.f34887c.offerLast(hVar3.mo11818a(oVar3, 1));
            LinkedList<C11952i.C11957d> linkedList6 = hVar3.f34887c;
            C11952i.C11957d a7 = hVar3.mo11818a(oVar4, 1);
            if (a7 != null) {
                a7.f34898d = 1000;
                a7.f34900f = true;
                a7.f34899e = C75592q0.m90783m();
                dVar4 = a7;
            }
            linkedList6.offerLast(dVar4);
            C11952i.f34888a.mo11819a(hVar3.f34887c, false);
        } else if (menuItem.getItemId() == 4) {
            C11951h hVar4 = this.f34884d;
            hVar4.f34887c.clear();
            C45795b bVar = C45795b.f123698n;
            if (!(bVar == null || (list = ((C54963d0) bVar.mo71262a(cls)).f154074q) == null)) {
                for (C54130j jVar2 : list) {
                    LinkedList<C11952i.C11957d> linkedList7 = hVar4.f34887c;
                    HashMap<C11973o, C11952i.C11955c> hashMap = C11952i.f34891d;
                    C11952i.C11955c cVar = hashMap.get(oVar5);
                    if (cVar == null || (dVar2 = C11952i.C11955c.C11956a.m11660a(cVar, 0, 1, (Object) null)) == null) {
                        dVar2 = null;
                    } else {
                        dVar2.mo11826c(jVar2.f151999c);
                    }
                    linkedList7.offerLast(dVar2);
                    LinkedList<C11952i.C11957d> linkedList8 = hVar4.f34887c;
                    C11952i.C11955c cVar2 = hashMap.get(oVar2);
                    if (cVar2 == null || (dVar3 = C11952i.C11955c.C11956a.m11660a(cVar2, 0, 1, (Object) null)) == null) {
                        dVar3 = null;
                    } else {
                        dVar3.f34898d = 1500;
                        dVar3.mo11826c(jVar2.f151999c);
                    }
                    linkedList8.offerLast(dVar3);
                }
            }
            C11952i.f34888a.mo11819a(hVar4.f34887c, false);
        } else if (menuItem.getItemId() == 5) {
            C11951h hVar5 = this.f34884d;
            hVar5.f34887c.clear();
            LinkedList<C11952i.C11957d> linkedList9 = hVar5.f34887c;
            C11952i.C11957d a8 = hVar5.mo11818a(oVar4, 1);
            if (a8 != null) {
                a8.f34897c = "1";
            } else {
                a8 = null;
            }
            linkedList9.offerLast(a8);
            LinkedList<C11952i.C11957d> linkedList10 = hVar5.f34887c;
            C11952i.C11957d a9 = hVar5.mo11818a(oVar4, 1);
            if (a9 != null) {
                a9.f34897c = "1";
                a9.f34898d = 6000;
                dVar4 = a9;
            }
            linkedList10.offerLast(dVar4);
            C11952i.f34888a.mo11819a(hVar5.f34887c, false);
        } else if (menuItem.getItemId() == 6) {
            C11951h hVar6 = this.f34884d;
            hVar6.f34887c.clear();
            String uuid = UUID.randomUUID().toString();
            C87412m.m108593f(uuid, "randomUUID().toString()");
            LinkedList<C11952i.C11957d> linkedList11 = hVar6.f34887c;
            C11952i.C11957d a15 = hVar6.mo11818a(oVar5, 1);
            if (a15 != null) {
                a15.f34897c = uuid;
            } else {
                a15 = null;
            }
            linkedList11.offerLast(a15);
            LinkedList<C11952i.C11957d> linkedList12 = hVar6.f34887c;
            C11952i.C11957d a16 = hVar6.mo11818a(oVar5, 1);
            if (a16 != null) {
                a16.f34897c = uuid;
                dVar4 = a16;
            }
            linkedList12.offerLast(dVar4);
            C11952i.f34888a.mo11819a(hVar6.f34887c, true);
        } else if (menuItem.getItemId() == 7) {
            C11951h hVar7 = this.f34884d;
            hVar7.f34887c.clear();
            String uuid2 = UUID.randomUUID().toString();
            C87412m.m108593f(uuid2, "randomUUID().toString()");
            LinkedList<C11952i.C11957d> linkedList13 = hVar7.f34887c;
            C11952i.C11957d a17 = hVar7.mo11818a(oVar5, 1);
            if (a17 != null) {
                a17.f34897c = uuid2;
                a17.mo11825b(uuid2);
            } else {
                a17 = null;
            }
            linkedList13.offerLast(a17);
            LinkedList<C11952i.C11957d> linkedList14 = hVar7.f34887c;
            C11952i.C11957d a18 = hVar7.mo11818a(oVar5, 1);
            if (a18 != null) {
                a18.f34897c = uuid2;
                a18.mo11825b(uuid2);
            } else {
                a18 = null;
            }
            linkedList14.offerLast(a18);
            LinkedList<C11952i.C11957d> linkedList15 = hVar7.f34887c;
            C11952i.C11957d a19 = hVar7.mo11818a(oVar5, 1);
            if (a19 != null) {
                a19.f34897c = uuid2;
                a19.mo11825b("");
            } else {
                a19 = null;
            }
            linkedList15.offerLast(a19);
            C11952i iVar = C11952i.f34888a;
            iVar.mo11819a(hVar7.f34887c, false);
            hVar7.f34887c.clear();
            String uuid3 = UUID.randomUUID().toString();
            C87412m.m108593f(uuid3, "randomUUID().toString()");
            LinkedList<C11952i.C11957d> linkedList16 = hVar7.f34887c;
            C11952i.C11957d a25 = hVar7.mo11818a(oVar, 1);
            if (a25 != null) {
                a25.f34897c = uuid3;
                a25.mo11825b(uuid3);
            } else {
                a25 = null;
            }
            linkedList16.offerLast(a25);
            LinkedList<C11952i.C11957d> linkedList17 = hVar7.f34887c;
            C11952i.C11957d a26 = hVar7.mo11818a(oVar, 1);
            if (a26 != null) {
                a26.f34897c = uuid3;
                a26.mo11825b(uuid3);
            } else {
                a26 = null;
            }
            linkedList17.offerLast(a26);
            LinkedList<C11952i.C11957d> linkedList18 = hVar7.f34887c;
            C11952i.C11957d a27 = hVar7.mo11818a(oVar, 1);
            if (a27 != null) {
                a27.f34897c = uuid3;
                a27.mo11825b("");
                dVar4 = a27;
            }
            linkedList18.offerLast(dVar4);
            iVar.mo11819a(hVar7.f34887c, true);
        } else if (menuItem.getItemId() == 8) {
            C11951h hVar8 = this.f34884d;
            hVar8.f34887c.clear();
            hVar8.f34887c.offerLast(hVar8.mo11818a(oVar5, 1));
            hVar8.f34887c.offerLast(hVar8.mo11818a(oVar5, 1));
            LinkedList<C11952i.C11957d> linkedList19 = hVar8.f34887c;
            C11952i.C11957d a28 = hVar8.mo11818a(oVar, 1);
            if (a28 != null) {
                a28.f34898d = 3900;
            } else {
                a28 = null;
            }
            linkedList19.offerLast(a28);
            LinkedList<C11952i.C11957d> linkedList20 = hVar8.f34887c;
            C11952i.C11957d a29 = hVar8.mo11818a(oVar, 1);
            if (a29 != null) {
                a29.f34898d = 3900;
            } else {
                a29 = null;
            }
            linkedList20.offerLast(a29);
            LinkedList<C11952i.C11957d> linkedList21 = hVar8.f34887c;
            C11952i.C11957d a35 = hVar8.mo11818a(oVar5, 1);
            if (a35 != null) {
                a35.f34898d = 7900;
            } else {
                a35 = null;
            }
            linkedList21.offerLast(a35);
            LinkedList<C11952i.C11957d> linkedList22 = hVar8.f34887c;
            C11952i.C11957d a36 = hVar8.mo11818a(oVar5, 1);
            if (a36 != null) {
                a36.f34898d = 7900;
            } else {
                a36 = null;
            }
            linkedList22.offerLast(a36);
            LinkedList<C11952i.C11957d> linkedList23 = hVar8.f34887c;
            C11952i.C11957d a37 = hVar8.mo11818a(C11973o.BALLOON, 1);
            if (a37 != null) {
                a37.f34898d = 1000;
            } else {
                a37 = null;
            }
            linkedList23.offerLast(a37);
            LinkedList<C11952i.C11957d> linkedList24 = hVar8.f34887c;
            C11952i.C11957d a38 = hVar8.mo11818a(oVar4, 1);
            if (a38 != null) {
                a38.f34898d = 7000;
                dVar4 = a38;
            }
            linkedList24.offerLast(dVar4);
            C11952i.f34888a.mo11819a(hVar8.f34887c, false);
        } else if (menuItem.getItemId() == 9) {
            C11951h hVar9 = this.f34884d;
            hVar9.f34887c.clear();
            String uuid4 = UUID.randomUUID().toString();
            C87412m.m108593f(uuid4, "randomUUID().toString()");
            LinkedList<C11952i.C11957d> linkedList25 = hVar9.f34887c;
            C11952i.C11957d a39 = hVar9.mo11818a(oVar5, 1);
            if (a39 != null) {
                a39.f34897c = uuid4;
            } else {
                a39 = null;
            }
            linkedList25.offerLast(a39);
            LinkedList<C11952i.C11957d> linkedList26 = hVar9.f34887c;
            C11952i.C11957d a44 = hVar9.mo11818a(oVar5, 10);
            if (a44 != null) {
                a44.f34897c = uuid4;
                a44.f34898d = 1000;
            } else {
                a44 = null;
            }
            linkedList26.offerLast(a44);
            LinkedList<C11952i.C11957d> linkedList27 = hVar9.f34887c;
            C11952i.C11957d a45 = hVar9.mo11818a(oVar4, 1);
            if (a45 != null) {
                a45.f34898d = 1001;
                dVar4 = a45;
            }
            linkedList27.offerLast(dVar4);
            C11952i.f34888a.mo11819a(hVar9.f34887c, false);
        } else if (menuItem.getItemId() == 10) {
            C11951h hVar10 = this.f34884d;
            hVar10.f34887c.clear();
            C45795b bVar2 = C45795b.f123698n;
            if (!(bVar2 == null || (jVar = ((C54963d0) bVar2.mo71262a(cls)).f154073p) == null)) {
                LinkedList<C11952i.C11957d> linkedList28 = hVar10.f34887c;
                HashMap<C11973o, C11952i.C11955c> hashMap2 = C11952i.f34891d;
                C11952i.C11955c cVar3 = hashMap2.get(oVar5);
                if (cVar3 == null || (dVar = C11952i.C11955c.C11956a.m11660a(cVar3, 0, 1, (Object) null)) == null) {
                    dVar = null;
                } else {
                    dVar.mo11826c(jVar.f151999c);
                }
                linkedList28.offerLast(dVar);
                LinkedList<C11952i.C11957d> linkedList29 = hVar10.f34887c;
                C11952i.C11955c cVar4 = hashMap2.get(oVar2);
                if (!(cVar4 == null || (a = C11952i.C11955c.C11956a.m11660a(cVar4, 0, 1, (Object) null)) == null)) {
                    a.f34898d = 1500;
                    a.mo11826c(jVar.f151999c);
                    dVar4 = a;
                }
                linkedList29.offerLast(dVar4);
            }
            C11952i.f34888a.mo11819a(hVar10.f34887c, false);
        }
    }
}
