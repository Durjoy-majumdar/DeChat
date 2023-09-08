package cj1;

import al1.C54126g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import te3.C48701ae3;

/* renamed from: cj1.a1 */
public final class C54733a1 {

    /* renamed from: a */
    public String f153388a;

    /* renamed from: b */
    public long f153389b;

    /* renamed from: c */
    public int f153390c;

    /* renamed from: d */
    public int f153391d;

    /* renamed from: e */
    public int f153392e;

    /* renamed from: f */
    public final List<C54126g> f153393f;

    /* renamed from: g */
    public final String f153394g;

    public C54733a1() {
        this((String) null, 0, 0, 0, 0, (List) null, 63, (C8480h) null);
    }

    public C54733a1(String str, long j, int i, int i2, int i3, List<C54126g> list, int i4, C8480h hVar) {
        str = (i4 & 1) != 0 ? null : str;
        j = (i4 & 2) != 0 ? 0 : j;
        i = (i4 & 4) != 0 ? 0 : i;
        i2 = (i4 & 8) != 0 ? 0 : i2;
        i3 = (i4 & 16) != 0 ? 0 : i3;
        if ((i4 & 32) != 0) {
            list = Collections.synchronizedList(new ArrayList());
            C87412m.m108593f(list, "synchronizedList(ArrayList())");
        }
        C87412m.m108594g(list, "playerInfo");
        this.f153388a = str;
        this.f153389b = j;
        this.f153390c = i;
        this.f153391d = i2;
        this.f153392e = i3;
        this.f153393f = list;
        this.f153394g = "Finder.FinderLiveBattleData";
    }

    /* renamed from: a */
    public final String mo75622a() {
        return this.f153388a;
    }

    /* renamed from: b */
    public final C54126g mo75623b(String str) {
        T t;
        String str2 = this.f153394g;
        Log.m105924i(str2, "getOtherBattleUser anchorUsername:" + str);
        List<C54126g> list = this.f153393f;
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!Util.isEqual(((C54126g) t).f151973a, str)) {
                    break;
                }
            }
        }
        return (C54126g) t;
    }

    /* renamed from: c */
    public final C54126g mo75624c(String str) {
        T t;
        String str2 = this.f153394g;
        Log.m105924i(str2, "getSelfBattleUser anchorUsername:" + str);
        List<C54126g> list = this.f153393f;
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Util.isEqual(((C54126g) t).f151973a, str)) {
                    break;
                }
            }
        }
        return (C54126g) t;
    }

    /* renamed from: d */
    public final void mo75625d(List<? extends C48701ae3> list) {
        C87412m.m108594g(list, "remotePlayerInfo");
        ArrayList arrayList = new ArrayList();
        for (C48701ae3 ae32 : list) {
            String str = this.f153394g;
            Log.m105924i(str, "updatePlayerInfo remotePlayerInfo:[" + ae32.f130472d + ", " + ae32.f130473e + ", " + ae32.f130474f + ']');
            arrayList.add(new C54126g(ae32.f130472d, ae32.f130473e, ae32.f130474f));
        }
        this.f153393f.clear();
        this.f153393f.addAll(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54733a1)) {
            return false;
        }
        C54733a1 a1Var = (C54733a1) obj;
        return C87412m.m108589b(this.f153388a, a1Var.f153388a) && this.f153389b == a1Var.f153389b && this.f153390c == a1Var.f153390c && this.f153391d == a1Var.f153391d && this.f153392e == a1Var.f153392e && C87412m.m108589b(this.f153393f, a1Var.f153393f);
    }

    public int hashCode() {
        String str = this.f153388a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f153389b;
        return (((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f153390c) * 31) + this.f153391d) * 31) + this.f153392e) * 31) + this.f153393f.hashCode();
    }

    public String toString() {
        return "FinderLiveBattleData(battleId=" + this.f153388a + ", battleSeq=" + this.f153389b + ", leftTime=" + this.f153390c + ", battleResult=" + this.f153391d + ", battleStatus=" + this.f153392e + ", playerInfo=" + this.f153393f + ')';
    }
}
