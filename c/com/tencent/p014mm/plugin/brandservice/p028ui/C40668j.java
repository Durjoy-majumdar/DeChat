package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.p014mm.plugin.brandservice.p028ui.C40658c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hx0.C46126a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import qj3.C47856a;
import te3.C49629gy3;
import te3.C50274lk;
import te3.C51163rv3;
import te3.C51577uo3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.j */
public class C40668j extends C40658c {

    /* renamed from: t */
    public List<C51577uo3> f109258t = null;

    /* renamed from: u */
    public SparseArray<C46126a> f109259u = new SparseArray<>();

    /* renamed from: v */
    public int f109260v;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.j$a */
    public class C40669a implements C40658c.C40660b {
        public C40669a() {
        }

        /* renamed from: a */
        public void mo63467a(C40658c cVar, C47856a aVar, int i, String str, int i2, int i3) {
            String str2;
            C50274lk i4 = C40668j.this.mo63566i(i3);
            StringBuilder sb = new StringBuilder();
            sb.append(Util.nullAsNil(C40668j.this.f109232j));
            sb.append(",");
            sb.append(i);
            sb.append(",");
            sb.append(Util.nullAsNil(str));
            sb.append(",");
            sb.append(i2);
            sb.append(",");
            sb.append(cVar.f109236q);
            sb.append(",");
            if (i4 == null) {
                str2 = "";
            } else {
                str2 = i4.f137474j + ",0";
            }
            sb.append(str2);
            String sb4 = sb.toString();
            C115669n.INSTANCE.kvStat(10866, sb4);
            Log.m105918d("MicroMsg.SearchOrRecommendBizAdapter", "report : " + sb4);
        }
    }

    public C40668j(Context context) {
        super(context);
        this.f109238s = new C40669a();
    }

    /* renamed from: a */
    public Object[] mo63559a(int i) {
        C40658c.C40659a k = mo63568k(i);
        C50274lk i2 = mo63566i(i);
        if (k == null) {
            return super.mo63559a(i);
        }
        Object[] objArr = new Object[4];
        objArr[0] = this;
        objArr[1] = k.f109242d;
        objArr[2] = Integer.valueOf(i < this.f109260v ? 39 : 56);
        objArr[3] = i2 != null ? i2.f137474j : "";
        return objArr;
    }

    /* renamed from: b */
    public C47856a mo63579b(int i) {
        String str;
        String str2;
        C49629gy3 gy32;
        int i2 = this.f109230h;
        if (i2 != 0) {
            return super.getItem(i);
        }
        C46126a aVar = this.f109259u.get(i);
        if (aVar != null || this.f109258t.size() <= 0) {
            return aVar;
        }
        Iterator<C51577uo3> it = this.f109258t.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            C51577uo3 next = it.next();
            if (i2 == i) {
                C51163rv3 rv32 = next.f142986d;
                if (rv32 != null) {
                    str = rv32.f141175d;
                }
                gy32 = next.f142988f.get(0);
            } else if (i < next.f142988f.size() + i2) {
                gy32 = next.f142988f.get(i - i2);
                break;
            } else {
                i2 += next.f142988f.size();
            }
        }
        String str3 = str;
        str = gy32;
        str2 = str3;
        C40648b bVar = new C40648b(str, str2);
        bVar.f124288f = i;
        bVar.f124287e = i;
        this.f109259u.put(i, bVar);
        return bVar;
    }

    /* renamed from: f */
    public void mo63561f(C50274lk lkVar, boolean z) {
        super.mo63561f(lkVar, z);
        if (this.f109260v == 0) {
            this.f109260v = this.f109230h;
        }
    }

    /* renamed from: g */
    public void mo63562g() {
        super.mo63562g();
    }

    public int getCount() {
        List<C51577uo3> list;
        LinkedList<C49629gy3> linkedList;
        int i = this.f109230h;
        if (i == 0 && (list = this.f109258t) != null) {
            for (C51577uo3 next : list) {
                if (!(next == null || (linkedList = next.f142988f) == null)) {
                    i += linkedList.size();
                }
            }
        }
        return i;
    }

    /* renamed from: n */
    public void mo63570n(String str, List<C50274lk> list) {
        super.mo63570n(str, list);
        this.f109260v = this.f109230h;
    }
}
