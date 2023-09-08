package wg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sx3.C110818d0;
import te3.C49098d51;
import te3.C49386f61;
import te3.C50646o81;

/* renamed from: wg1.l4 */
public final class C15320l4 {

    /* renamed from: a */
    public static final C15320l4 f41639a = new C15320l4();

    /* renamed from: b */
    public static int f41640b;

    /* renamed from: c */
    public static final List<C49386f61> f41641c = new ArrayList();

    /* renamed from: wg1.l4$a */
    public static final class C15321a {

        /* renamed from: a */
        public boolean f41642a;

        /* renamed from: b */
        public C49098d51 f41643b;

        /* renamed from: c */
        public C50646o81 f41644c;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r0 = (r0 = r2.f41644c).f139022i;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo14173a() {
            /*
                r2 = this;
                boolean r0 = r2.f41642a
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0010
                te3.o81 r0 = r2.f41644c
                if (r0 == 0) goto L_0x0010
                java.lang.String r0 = r0.f139022i
                if (r0 != 0) goto L_0x000f
                goto L_0x0010
            L_0x000f:
                r1 = r0
            L_0x0010:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C15320l4.C15321a.mo14173a():java.lang.String");
        }
    }

    /* renamed from: a */
    public final C49386f61 mo14170a(int i) {
        Iterator it = ((ArrayList) f41641c).iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((C49386f61) it.next()).f133309d == i) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            return (C49386f61) C110818d0.m150916N(f41641c);
        }
        int i3 = i2 + 1;
        List<C49386f61> list = f41641c;
        return i3 >= ((ArrayList) list).size() ? (C49386f61) C110818d0.m150916N(list) : (C49386f61) ((ArrayList) list).get(i3);
    }

    /* renamed from: b */
    public final C49386f61 mo14171b(int i) {
        T t;
        boolean z;
        Iterator<T> it = f41641c.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C49386f61) t).f133309d == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C49386f61 f612 = (C49386f61) t;
        return f612 == null ? (C49386f61) C110818d0.m150916N(f41641c) : f612;
    }

    /* renamed from: c */
    public final void mo14172c(int i, boolean z, List<? extends C49386f61> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("#updateStyles version=");
        sb.append(i);
        sb.append(" disable=");
        sb.append(z);
        sb.append(" size=");
        sb.append(list != null ? Integer.valueOf(list.size()) : null);
        Log.m105924i("FinderLiveNoticeQRCodeHelper", sb.toString());
        if (list != null && (!list.isEmpty())) {
            f41640b = i;
            List<C49386f61> list2 = f41641c;
            ((ArrayList) list2).clear();
            ((ArrayList) list2).addAll(list);
        } else if (z) {
            f41640b = i;
            ((ArrayList) f41641c).clear();
        }
    }
}
