package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.C24212ij;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.il */
public final class C24215il extends C24212ij {

    /* renamed from: b */
    public boolean f69307b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ArrayList<C24212ij> f69308c = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public HashMap<C24212ij, C24221e> f69309d = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList<C24221e> f69310e = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<C24221e> f69311f = new ArrayList<>();

    /* renamed from: g */
    private boolean f69312g = true;

    /* renamed from: h */
    private C24217a f69313h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f69314i = false;

    /* renamed from: j */
    private long f69315j = 0;

    /* renamed from: k */
    private C24237iy f69316k = null;

    /* renamed from: l */
    private long f69317l = -1;

    /* renamed from: com.tencent.mapsdk.internal.il$a */
    public class C24217a implements C24212ij.C24213a {

        /* renamed from: b */
        private C24215il f69322b;

        public C24217a(C24215il ilVar) {
            this.f69322b = ilVar;
        }

        /* renamed from: a */
        public final void mo40977a() {
            ArrayList<C24212ij.C24213a> arrayList;
            C24215il ilVar = C24215il.this;
            if (!ilVar.f69307b && ilVar.f69308c.size() == 0 && (arrayList = C24215il.this.f69306a) != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C24215il.this.f69306a.get(i).mo40977a();
                }
            }
        }

        /* renamed from: a */
        public final void mo40978a(C24212ij ijVar) {
        }

        /* renamed from: b */
        public final void mo40979b() {
        }

        /* renamed from: b */
        public final void mo40980b(C24212ij ijVar) {
            ijVar.mo40969b((C24212ij.C24213a) this);
            C24215il.this.f69308c.remove(ijVar);
            boolean z = true;
            ((C24221e) this.f69322b.f69309d.get(ijVar)).f69337f = true;
            if (!C24215il.this.f69307b) {
                ArrayList c = this.f69322b.f69311f;
                int size = c.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (!((C24221e) c.get(i)).f69337f) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    ArrayList<C24212ij.C24213a> arrayList = C24215il.this.f69306a;
                    if (arrayList != null) {
                        ArrayList arrayList2 = (ArrayList) arrayList.clone();
                        int size2 = arrayList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((C24212ij.C24213a) arrayList2.get(i2)).mo40980b(this.f69322b);
                        }
                    }
                    boolean unused = this.f69322b.f69314i = false;
                }
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.il$c */
    public static class C24219c {

        /* renamed from: a */
        public static final int f69325a = 0;

        /* renamed from: b */
        public static final int f69326b = 1;

        /* renamed from: c */
        public C24221e f69327c;

        /* renamed from: d */
        public int f69328d;

        public C24219c(C24221e eVar, int i) {
            this.f69327c = eVar;
            this.f69328d = i;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.il$d */
    public static class C24220d implements C24212ij.C24213a {

        /* renamed from: a */
        private C24215il f69329a;

        /* renamed from: b */
        private C24221e f69330b;

        /* renamed from: c */
        private int f69331c;

        public C24220d(C24215il ilVar, C24221e eVar, int i) {
            this.f69329a = ilVar;
            this.f69330b = eVar;
            this.f69331c = i;
        }

        /* renamed from: c */
        private void m30181c(C24212ij ijVar) {
            if (!this.f69329a.f69307b) {
                C24219c cVar = null;
                int size = this.f69330b.f69334c.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C24219c cVar2 = this.f69330b.f69334c.get(i);
                    if (cVar2.f69328d == this.f69331c && cVar2.f69327c.f69332a == ijVar) {
                        ijVar.mo40969b((C24212ij.C24213a) this);
                        cVar = cVar2;
                        break;
                    }
                    i++;
                }
                this.f69330b.f69334c.remove(cVar);
                if (this.f69330b.f69334c.size() == 0) {
                    this.f69330b.f69332a.mo40963a();
                    this.f69329a.f69308c.add(this.f69330b.f69332a);
                }
            }
        }

        /* renamed from: a */
        public final void mo40977a() {
        }

        /* renamed from: a */
        public final void mo40978a(C24212ij ijVar) {
            if (this.f69331c == 0) {
                m30181c(ijVar);
            }
        }

        /* renamed from: b */
        public final void mo40979b() {
        }

        /* renamed from: b */
        public final void mo40980b(C24212ij ijVar) {
            if (this.f69331c == 1) {
                m30181c(ijVar);
            }
        }
    }

    /* renamed from: i */
    private ArrayList<C24212ij> m30157i() {
        ArrayList<C24212ij> arrayList = new ArrayList<>();
        Iterator<C24221e> it = this.f69310e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f69332a);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C24215il mo40976h() {
        C24215il ilVar = (C24215il) super.clone();
        ilVar.f69312g = true;
        ilVar.f69307b = false;
        ilVar.f69314i = false;
        ilVar.f69308c = new ArrayList<>();
        ilVar.f69309d = new HashMap<>();
        ilVar.f69310e = new ArrayList<>();
        ilVar.f69311f = new ArrayList<>();
        HashMap hashMap = new HashMap();
        Iterator<C24221e> it = this.f69310e.iterator();
        while (it.hasNext()) {
            C24221e next = it.next();
            C24221e a = next.clone();
            hashMap.put(next, a);
            ilVar.f69310e.add(a);
            ilVar.f69309d.put(a.f69332a, a);
            ArrayList arrayList = null;
            a.f69333b = null;
            a.f69334c = null;
            a.f69336e = null;
            a.f69335d = null;
            ArrayList<C24212ij.C24213a> arrayList2 = a.f69332a.f69306a;
            if (arrayList2 != null) {
                Iterator<C24212ij.C24213a> it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C24212ij.C24213a next2 = it4.next();
                    if (next2 instanceof C24217a) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList != null) {
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        arrayList2.remove((C24212ij.C24213a) it5.next());
                    }
                }
            }
        }
        Iterator<C24221e> it6 = this.f69310e.iterator();
        while (it6.hasNext()) {
            C24221e next3 = it6.next();
            C24221e eVar = (C24221e) hashMap.get(next3);
            ArrayList<C24219c> arrayList3 = next3.f69333b;
            if (arrayList3 != null) {
                Iterator<C24219c> it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    C24219c next4 = it7.next();
                    eVar.mo40984a(new C24219c((C24221e) hashMap.get(next4.f69327c), next4.f69328d));
                }
            }
        }
        return ilVar;
    }

    /* renamed from: k */
    private void m30159k() {
        if (this.f69312g) {
            this.f69311f.clear();
            ArrayList arrayList = new ArrayList();
            int size = this.f69310e.size();
            for (int i = 0; i < size; i++) {
                C24221e eVar = this.f69310e.get(i);
                ArrayList<C24219c> arrayList2 = eVar.f69333b;
                if (arrayList2 == null || arrayList2.size() == 0) {
                    arrayList.add(eVar);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            while (arrayList.size() > 0) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C24221e eVar2 = (C24221e) arrayList.get(i2);
                    this.f69311f.add(eVar2);
                    ArrayList<C24221e> arrayList4 = eVar2.f69336e;
                    if (arrayList4 != null) {
                        int size3 = arrayList4.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            C24221e eVar3 = eVar2.f69336e.get(i3);
                            eVar3.f69335d.remove(eVar2);
                            if (eVar3.f69335d.size() == 0) {
                                arrayList3.add(eVar3);
                            }
                        }
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList3);
                arrayList3.clear();
            }
            this.f69312g = false;
            if (this.f69311f.size() != this.f69310e.size()) {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
            return;
        }
        int size4 = this.f69310e.size();
        for (int i4 = 0; i4 < size4; i4++) {
            C24221e eVar4 = this.f69310e.get(i4);
            ArrayList<C24219c> arrayList5 = eVar4.f69333b;
            if (arrayList5 != null && arrayList5.size() > 0) {
                int size5 = eVar4.f69333b.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    C24219c cVar = eVar4.f69333b.get(i5);
                    if (eVar4.f69335d == null) {
                        eVar4.f69335d = new ArrayList<>();
                    }
                    if (!eVar4.f69335d.contains(cVar.f69327c)) {
                        eVar4.f69335d.add(cVar.f69327c);
                    }
                }
            }
            eVar4.f69337f = false;
        }
    }

    /* renamed from: f */
    public final boolean mo40974f() {
        Iterator<C24221e> it = this.f69310e.iterator();
        while (it.hasNext()) {
            if (it.next().f69332a.mo40974f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo40975g() {
        return this.f69314i;
    }

    /* renamed from: a */
    private void m30150a(C24212ij... ijVarArr) {
        if (ijVarArr != null) {
            this.f69312g = true;
            C24218b a = m30146a(ijVarArr[0]);
            for (int i = 1; i < ijVarArr.length; i++) {
                a.mo40981a(ijVarArr[i]);
            }
        }
    }

    /* renamed from: b */
    private void m30152b(C24212ij... ijVarArr) {
        if (ijVarArr != null) {
            this.f69312g = true;
            int i = 0;
            if (ijVarArr.length == 1) {
                m30146a(ijVarArr[0]);
                return;
            }
            while (i < ijVarArr.length - 1) {
                i++;
                m30146a(ijVarArr[i]).mo40982b(ijVarArr[i]);
            }
        }
    }

    /* renamed from: c */
    public final void mo40970c() {
        this.f69307b = true;
        if (this.f69314i) {
            if (this.f69311f.size() != this.f69310e.size()) {
                m30159k();
                Iterator<C24221e> it = this.f69311f.iterator();
                while (it.hasNext()) {
                    C24221e next = it.next();
                    if (this.f69313h == null) {
                        this.f69313h = new C24217a(this);
                    }
                    next.f69332a.mo40966a((C24212ij.C24213a) this.f69313h);
                }
            }
            C24237iy iyVar = this.f69316k;
            if (iyVar != null) {
                iyVar.mo40968b();
            }
            if (this.f69311f.size() > 0) {
                Iterator<C24221e> it4 = this.f69311f.iterator();
                while (it4.hasNext()) {
                    it4.next().f69332a.mo40970c();
                }
            }
            ArrayList<C24212ij.C24213a> arrayList = this.f69306a;
            if (arrayList != null) {
                Iterator it5 = ((ArrayList) arrayList.clone()).iterator();
                while (it5.hasNext()) {
                    ((C24212ij.C24213a) it5.next()).mo40980b(this);
                }
            }
            this.f69314i = false;
        }
    }

    /* renamed from: d */
    public final long mo40972d() {
        return this.f69315j;
    }

    /* renamed from: e */
    public final long mo40973e() {
        return this.f69317l;
    }

    /* renamed from: com.tencent.mapsdk.internal.il$b */
    public class C24218b {

        /* renamed from: b */
        private C24221e f69324b;

        public C24218b(C24212ij ijVar) {
            C24221e eVar = (C24221e) C24215il.this.f69309d.get(ijVar);
            this.f69324b = eVar;
            if (eVar == null) {
                this.f69324b = new C24221e(ijVar);
                C24215il.this.f69309d.put(ijVar, this.f69324b);
                C24215il.this.f69310e.add(this.f69324b);
            }
        }

        /* renamed from: c */
        private C24218b m30178c(C24212ij ijVar) {
            C24221e eVar = (C24221e) C24215il.this.f69309d.get(ijVar);
            if (eVar == null) {
                eVar = new C24221e(ijVar);
                C24215il.this.f69309d.put(ijVar, eVar);
                C24215il.this.f69310e.add(eVar);
            }
            this.f69324b.mo40984a(new C24219c(eVar, 1));
            return this;
        }

        /* renamed from: a */
        public final C24218b mo40981a(C24212ij ijVar) {
            C24221e eVar = (C24221e) C24215il.this.f69309d.get(ijVar);
            if (eVar == null) {
                eVar = new C24221e(ijVar);
                C24215il.this.f69309d.put(ijVar, eVar);
                C24215il.this.f69310e.add(eVar);
            }
            eVar.mo40984a(new C24219c(this.f69324b, 0));
            return this;
        }

        /* renamed from: b */
        public final C24218b mo40982b(C24212ij ijVar) {
            C24221e eVar = (C24221e) C24215il.this.f69309d.get(ijVar);
            if (eVar == null) {
                eVar = new C24221e(ijVar);
                C24215il.this.f69309d.put(ijVar, eVar);
                C24215il.this.f69310e.add(eVar);
            }
            eVar.mo40984a(new C24219c(this.f69324b, 1));
            return this;
        }

        /* renamed from: a */
        private C24218b m30177a(long j) {
            C24237iy b = C24237iy.m30290b(0.0d, 1.0d);
            b.mo40967b(j);
            C24221e eVar = (C24221e) C24215il.this.f69309d.get(b);
            if (eVar == null) {
                eVar = new C24221e(b);
                C24215il.this.f69309d.put(b, eVar);
                C24215il.this.f69310e.add(eVar);
            }
            this.f69324b.mo40984a(new C24219c(eVar, 1));
            return this;
        }
    }

    /* renamed from: a */
    private void m30148a(Collection<C24212ij> collection) {
        if (collection != null && collection.size() > 0) {
            this.f69312g = true;
            C24218b bVar = null;
            for (C24212ij next : collection) {
                if (bVar == null) {
                    bVar = m30146a(next);
                } else {
                    bVar.mo40981a(next);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo40968b() {
        this.f69307b = true;
        if (this.f69314i) {
            ArrayList arrayList = null;
            ArrayList<C24212ij.C24213a> arrayList2 = this.f69306a;
            if (arrayList2 != null) {
                arrayList = (ArrayList) arrayList2.clone();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C24212ij.C24213a) it.next()).mo40977a();
                }
            }
            C24237iy iyVar = this.f69316k;
            if (iyVar != null && iyVar.mo40974f()) {
                this.f69316k.mo40968b();
            } else if (this.f69311f.size() > 0) {
                Iterator<C24221e> it4 = this.f69311f.iterator();
                while (it4.hasNext()) {
                    it4.next().f69332a.mo40968b();
                }
            }
            if (arrayList != null) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((C24212ij.C24213a) it5.next()).mo40980b(this);
                }
            }
            this.f69314i = false;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.il$e */
    public static class C24221e implements Cloneable {

        /* renamed from: a */
        public C24212ij f69332a;

        /* renamed from: b */
        public ArrayList<C24219c> f69333b = null;

        /* renamed from: c */
        public ArrayList<C24219c> f69334c = null;

        /* renamed from: d */
        public ArrayList<C24221e> f69335d = null;

        /* renamed from: e */
        public ArrayList<C24221e> f69336e = null;

        /* renamed from: f */
        public boolean f69337f = false;

        public C24221e(C24212ij ijVar) {
            this.f69332a = ijVar;
        }

        /* renamed from: a */
        public final void mo40984a(C24219c cVar) {
            if (this.f69333b == null) {
                this.f69333b = new ArrayList<>();
                this.f69335d = new ArrayList<>();
            }
            this.f69333b.add(cVar);
            if (!this.f69335d.contains(cVar.f69327c)) {
                this.f69335d.add(cVar.f69327c);
            }
            C24221e eVar = cVar.f69327c;
            if (eVar.f69336e == null) {
                eVar.f69336e = new ArrayList<>();
            }
            eVar.f69336e.add(this);
        }

        /* renamed from: a */
        public final C24221e clone() {
            try {
                C24221e eVar = (C24221e) super.clone();
                eVar.f69332a = this.f69332a.clone();
                return eVar;
            } catch (CloneNotSupportedException unused) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    private void m30149a(List<C24212ij> list) {
        if (list != null && list.size() > 0) {
            this.f69312g = true;
            int i = 0;
            if (list.size() == 1) {
                m30146a(list.get(0));
                return;
            }
            while (i < list.size() - 1) {
                i++;
                m30146a(list.get(i)).mo40982b(list.get(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo40965a(Interpolator interpolator) {
        Iterator<C24221e> it = this.f69310e.iterator();
        while (it.hasNext()) {
            it.next().f69332a.mo40965a(interpolator);
        }
    }

    /* renamed from: a */
    private C24218b m30146a(C24212ij ijVar) {
        if (ijVar == null) {
            return null;
        }
        this.f69312g = true;
        return new C24218b(ijVar);
    }

    /* renamed from: c */
    private C24215il m30153c(long j) {
        if (j >= 0) {
            Iterator<C24221e> it = this.f69310e.iterator();
            while (it.hasNext()) {
                it.next().f69332a.mo40967b(j);
            }
            this.f69317l = j;
            return this;
        }
        throw new IllegalArgumentException("duration must be a value of zero or greater");
    }

    /* renamed from: a */
    public final void mo40964a(long j) {
        this.f69315j = j;
    }

    /* renamed from: b */
    public final /* synthetic */ C24212ij mo40967b(long j) {
        if (j >= 0) {
            Iterator<C24221e> it = this.f69310e.iterator();
            while (it.hasNext()) {
                it.next().f69332a.mo40967b(j);
            }
            this.f69317l = j;
            return this;
        }
        throw new IllegalArgumentException("duration must be a value of zero or greater");
    }

    /* renamed from: a */
    public final void mo40963a() {
        this.f69307b = false;
        this.f69314i = true;
        m30159k();
        int size = this.f69311f.size();
        for (int i = 0; i < size; i++) {
            C24221e eVar = this.f69311f.get(i);
            ArrayList<C24212ij.C24213a> arrayList = eVar.f69332a.f69306a;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    C24212ij.C24213a aVar = (C24212ij.C24213a) it.next();
                    if ((aVar instanceof C24220d) || (aVar instanceof C24217a)) {
                        eVar.f69332a.mo40969b(aVar);
                    }
                }
            }
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            C24221e eVar2 = this.f69311f.get(i2);
            if (this.f69313h == null) {
                this.f69313h = new C24217a(this);
            }
            ArrayList<C24219c> arrayList3 = eVar2.f69333b;
            if (arrayList3 == null || arrayList3.size() == 0) {
                arrayList2.add(eVar2);
            } else {
                int size2 = eVar2.f69333b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C24219c cVar = eVar2.f69333b.get(i3);
                    cVar.f69327c.f69332a.mo40966a((C24212ij.C24213a) new C24220d(this, eVar2, cVar.f69328d));
                }
                eVar2.f69334c = (ArrayList) eVar2.f69333b.clone();
            }
            eVar2.f69332a.mo40966a((C24212ij.C24213a) this.f69313h);
        }
        if (this.f69315j <= 0) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                C24221e eVar3 = (C24221e) it4.next();
                eVar3.f69332a.mo40963a();
                this.f69308c.add(eVar3.f69332a);
            }
        } else {
            C24237iy b = C24237iy.m30290b(0.0d, 1.0d);
            this.f69316k = b;
            b.mo40967b(this.f69315j);
            this.f69316k.mo40966a((C24212ij.C24213a) new C24214ik() {

                /* renamed from: a */
                public boolean f69318a = false;

                /* renamed from: a */
                public final void mo40977a() {
                    this.f69318a = true;
                }

                /* renamed from: b */
                public final void mo40980b(C24212ij ijVar) {
                    if (!this.f69318a) {
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            C24221e eVar = (C24221e) arrayList2.get(i);
                            eVar.f69332a.mo40963a();
                            C24215il.this.f69308c.add(eVar.f69332a);
                        }
                    }
                }
            });
            this.f69316k.mo40963a();
        }
        ArrayList<C24212ij.C24213a> arrayList4 = this.f69306a;
        if (arrayList4 != null) {
            ArrayList arrayList5 = (ArrayList) arrayList4.clone();
            int size3 = arrayList5.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((C24212ij.C24213a) arrayList5.get(i4)).mo40978a(this);
            }
        }
        if (this.f69310e.size() == 0 && this.f69315j == 0) {
            this.f69314i = false;
            ArrayList<C24212ij.C24213a> arrayList6 = this.f69306a;
            if (arrayList6 != null) {
                ArrayList arrayList7 = (ArrayList) arrayList6.clone();
                int size4 = arrayList7.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((C24212ij.C24213a) arrayList7.get(i5)).mo40980b(this);
                }
            }
        }
    }
}
