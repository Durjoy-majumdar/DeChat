package cm1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import gg1.C32444a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import pe3.C89349b;
import sk1.C63947a;
import sx3.C36907w;
import te3.C64273c21;
import te3.C64629pl1;
import tf1.C13914m;

/* renamed from: cm1.a0 */
public final class C0707a0 implements C0740i2 {

    /* renamed from: d */
    public C89349b f1690d;

    /* renamed from: e */
    public ArrayList<C0740i2> f1691e;

    /* renamed from: f */
    public long f1692f;

    /* renamed from: g */
    public boolean f1693g;

    /* renamed from: h */
    public final boolean f1694h;

    public C0707a0() {
        C32444a aVar = C32444a.f86121a;
        this.f1694h = C32444a.f86155i1.mo60266n().intValue() == 0;
        this.f1690d = null;
        this.f1691e = new ArrayList<>();
        new ArrayList();
        this.f1692f = mo684k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        r3 = r3.liveInfo;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo679a(long r8) {
        /*
            r7 = this;
            java.util.ArrayList<cm1.i2> r0 = r7.f1691e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x0008:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0036
            java.lang.Object r3 = r0.next()
            cm1.i2 r3 = (cm1.C0740i2) r3
            boolean r4 = r3 instanceof cm1.C0712b0
            r5 = 1
            if (r4 == 0) goto L_0x002f
            cm1.b0 r3 = (cm1.C0712b0) r3
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f1709d
            if (r3 == 0) goto L_0x002b
            te3.c21 r3 = r3.liveInfo
            if (r3 == 0) goto L_0x002b
            long r3 = r3.f182392d
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0036:
            r2 = -1
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cm1.C0707a0.mo679a(long):int");
    }

    /* renamed from: b */
    public final C0712b0 mo680b(long j) {
        T t;
        C64273c21 c212;
        Iterator<T> it = mo683j().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            FinderObject finderObject = ((C0712b0) t).f1709d;
            boolean z = false;
            if (!(finderObject == null || (c212 = finderObject.liveInfo) == null || c212.f182392d != j)) {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C0712b0) t;
    }

    /* renamed from: c */
    public int mo75c() {
        return 2003;
    }

    /* renamed from: d */
    public final ArrayList<C0740i2> mo681d() {
        return this.f1691e;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return ((mVar instanceof C0707a0 ? (C0707a0) mVar : null) == null || this.f1692f != ((C0707a0) mVar).f1692f) ? -1 : 0;
    }

    public long getItemId() {
        return this.f1692f;
    }

    /* renamed from: i */
    public final long mo682i() {
        return this.f1692f;
    }

    /* renamed from: j */
    public final ArrayList<C0712b0> mo683j() {
        try {
            ArrayList<C0740i2> arrayList = this.f1691e;
            ArrayList<C0712b0> arrayList2 = new ArrayList<>();
            for (T next : arrayList) {
                if (next instanceof C0712b0) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        } catch (Exception e) {
            Log.m105920e("FinderFeedLiveList", "get liveList:" + e.getMessage());
            return new ArrayList<>();
        }
    }

    /* renamed from: k */
    public final long mo684k() {
        long j = Util.MAX_32BIT_VALUE;
        for (C0740i2 itemId : this.f1691e) {
            j &= itemId.getItemId();
        }
        Log.m105924i("FinderFeedLiveList", "listId:" + j);
        return j;
    }

    /* renamed from: l */
    public final ArrayList<C0712b0> mo685l(List<? extends FinderObject> list) {
        ArrayList<FinderObject> arrayList = new ArrayList<>();
        for (T next : list) {
            if (C63947a.f181274a.mo88732r((FinderObject) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (FinderObject b0Var : arrayList) {
            arrayList2.add(new C0712b0(b0Var));
        }
        return new ArrayList<>(arrayList2);
    }

    /* renamed from: m */
    public final void mo686m(int i) {
        boolean z = true;
        if (i >= 0 && i < this.f1691e.size()) {
            this.f1691e.remove(i);
        }
        if (!mo683j().isEmpty()) {
            z = false;
        }
        if (z) {
            this.f1691e.clear();
            Log.m105924i("FinderFeedLiveList", "removeItem clear list!");
        }
    }

    /* renamed from: n */
    public final void mo687n() {
        if (this.f1694h && this.f1691e.size() > 0) {
            Iterator<C0740i2> it = this.f1691e.iterator();
            C87412m.m108593f(it, "list.iterator()");
            while (it.hasNext()) {
                C0740i2 next = it.next();
                C87412m.m108593f(next, "iterator.next()");
                if (next instanceof C0727e0) {
                    it.remove();
                }
            }
            if (mo683j().size() > 0) {
                this.f1691e.add(new C0727e0());
            }
        }
    }

    public String toString() {
        int size = this.f1691e.size();
        StringBuilder sb = new StringBuilder("liveListId,size:" + size + XVFSFile.PATH_SEPARATOR_CHAR);
        for (int i = 0; i < size; i++) {
            C0740i2 i2Var = this.f1691e.get(i);
            if (i2Var instanceof C0712b0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("[index:");
                sb4.append(i);
                sb4.append(",username:");
                C0712b0 b0Var = (C0712b0) i2Var;
                sb4.append(b0Var.f1709d.nickname);
                sb4.append(",feedId:");
                sb4.append(b0Var.f1709d.f164794id);
                sb4.append(",liveId:");
                C64273c21 c212 = b0Var.f1709d.liveInfo;
                sb4.append(c212 != null ? Long.valueOf(c212.f182392d) : null);
                sb4.append("，friendLikeCount:");
                sb4.append(b0Var.f1709d.friendLikeCount);
                sb4.append(']');
                sb.append(sb4.toString());
            } else {
                sb.append("[index:" + i + ",feedId:" + i2Var.getItemId() + ']');
            }
        }
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "sb.toString()");
        return sb5;
    }

    public C0707a0(C64629pl1 pl12) {
        C87412m.m108594g(pl12, "finderStreamCard");
        C32444a aVar = C32444a.f86121a;
        this.f1694h = C32444a.f86155i1.mo60266n().intValue() == 0;
        this.f1691e = new ArrayList<>();
        new ArrayList();
        ArrayList<C0740i2> arrayList = this.f1691e;
        LinkedList<FinderObject> linkedList = pl12.f184844h;
        C87412m.m108593f(linkedList, "finderStreamCard.`object`");
        arrayList.addAll(mo685l(linkedList));
        mo687n();
        this.f1690d = pl12.f184846j;
        this.f1692f = mo684k();
        this.f1693g = pl12.f184850q;
    }
}
