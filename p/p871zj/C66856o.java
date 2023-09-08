package p871zj;

import android.graphics.Point;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p001ak.C54053a;
import p001ak.C54056d;
import p006bk.C54479b;
import p006bk.C54486i;
import p848dk.C58298c;
import p848dk.C58301e;
import p848dk.C58302f;
import p848dk.C58306h;
import p850ek.C58613d;
import p850ek.C58614e;

/* renamed from: zj.o */
public class C66856o extends C66834a {

    /* renamed from: i */
    public int f192032i;

    /* renamed from: j */
    public int f192033j;

    /* renamed from: k */
    public int[] f192034k;

    /* renamed from: l */
    public C54053a[] f192035l;

    /* renamed from: m */
    public List<List<C54053a>> f192036m;

    /* renamed from: n */
    public List<C54053a> f192037n;

    public C66856o(C54479b bVar, C66835b bVar2, Comparator<C54053a> comparator, C58302f fVar, C58298c cVar) {
        super(bVar, bVar2, comparator, fVar, cVar);
    }

    /* renamed from: a */
    public void mo90807a() {
        for (int i = 0; i < this.f192033j; i++) {
            this.f192035l[i] = null;
        }
        int size = ((ArrayList) this.f192036m).size();
        for (int i2 = 0; i2 < size; i2++) {
            Iterator it = ((List) ((ArrayList) this.f192036m).get(i2)).iterator();
            while (it.hasNext()) {
                it.remove();
                this.f191958a--;
                ((LinkedList) this.f191960c).add((C54053a) it.next());
            }
        }
    }

    /* renamed from: e */
    public C54053a mo90811e(C58306h hVar) {
        int size = ((ArrayList) this.f192036m).size();
        for (int i = 0; i < size; i++) {
            for (C54053a aVar : (List) ((ArrayList) this.f192036m).get(i)) {
                aVar.getClass();
                if (C54479b.m61196c().f152761h) {
                    Point point = hVar.f166949b;
                    float f = (float) point.x;
                    float f2 = (float) point.y;
                    float f3 = (float) hVar.f166950c;
                    float[] e = aVar.mo74713e(hVar.f166948a);
                    if (e != null && e[0] <= f && f <= e[2] + f3 && e[1] <= f2 && f2 <= e[3]) {
                        if (C58614e.f167821b >= 5) {
                            C58614e.m68070g("Danmaku_R2LWindow", "onClick:", aVar, "[left:", Float.valueOf(aVar.mo74712d()), ",top:", Float.valueOf(aVar.mo74719i()), "]");
                        }
                        return aVar;
                    }
                }
            }
        }
        C58614e.m68069f("Danmaku_R2LWindow", "onClick:null");
        return null;
    }

    /* renamed from: f */
    public void mo90812f() {
        C54486i c = C54479b.m61196c();
        this.f192032i = c.f152755b;
        if (this.f192034k == null || this.f192033j != c.f152756c) {
            int i = c.f152756c;
            this.f192033j = i;
            this.f192034k = new int[i];
            C54053a[] aVarArr = new C54053a[i];
            C54053a[] aVarArr2 = this.f192035l;
            if (aVarArr2 != null) {
                System.arraycopy(aVarArr2, 0, aVarArr, 0, Math.min(i, aVarArr2.length));
            }
            this.f192035l = aVarArr;
            List<List<C54053a>> list = this.f192036m;
            if (list != null) {
                int size = ((ArrayList) list).size();
                if (size < this.f192033j) {
                    while (size < this.f192033j) {
                        ((ArrayList) this.f192036m).add(new LinkedList());
                        size++;
                    }
                } else {
                    for (int i2 = size - 1; i2 >= this.f192033j; i2--) {
                        ((ArrayList) this.f192036m).remove(i2);
                    }
                }
            } else {
                this.f192036m = new ArrayList(this.f192033j);
                for (int i3 = 0; i3 < this.f192033j; i3++) {
                    ((ArrayList) this.f192036m).add(new LinkedList());
                }
            }
        }
        this.f191962e.getClass();
        C54486i c2 = C54479b.m61196c();
        TextPaint textPaint = C58613d.f167816a;
        int ceil = (int) Math.ceil((double) (C58613d.m68063a(c2.f152765l) + ((float) (C54479b.m61196c().f152757d * 2)) + (c2.f152766m * 2.0f) + (c2.f152767n * 2.0f)));
        StringBuilder sb = new StringBuilder("[");
        int i4 = 0;
        while (i4 < this.f192033j) {
            int[] iArr = this.f192034k;
            int i5 = (i4 * ceil) + this.f192032i;
            iArr[i4] = i5;
            sb.append(i5);
            sb.append(i4 != this.f192033j - 1 ? ", " : "");
            i4++;
        }
        sb.append("]");
        C58614e.m68065b("Danmaku_R2LWindow", "reloadConfig, mRowCount = %d, mMarginTop = %d, lineHeight = %d, lineTops = %s", Integer.valueOf(this.f192033j), Integer.valueOf(this.f192032i), Integer.valueOf(ceil), sb);
        mo90862h(this.f192036m, this.f192034k);
        mo90862h(this.f192036m, this.f192034k);
    }

    /* renamed from: g */
    public final void mo90861g(C54053a aVar, int i, int i2) {
        if (aVar.f151355l && C54486i.f152753q) {
            this.f191963f.getClass();
        }
        aVar.mo74725o((float) i2, (float) i, this.f191964g.f166940a, this.f191965h.f166934a);
    }

    /* renamed from: h */
    public final void mo90862h(List<List<C54053a>> list, int[] iArr) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (C54053a aVar : list.get(i)) {
                C54056d dVar = (C54056d) aVar;
                dVar.getClass();
                dVar.f151347d = new C58301e((long) C54479b.m61196c().f152754a);
                long j = this.f191965h.f166934a;
                int i2 = (int) dVar.f151369A;
                mo90810d(dVar);
                dVar.f151346c = j - ((long) ((int) (((float) (dVar.mo74716g() - i2)) / (-(-dVar.f151372D)))));
                dVar.f151370B = (float) iArr[i];
                dVar.f151369A = (float) i2;
            }
        }
    }
}
