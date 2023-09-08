package ov1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import lv1.C21461d;
import lv1.C99672i;
import lv1.C99681n;
import pv1.C22019b;

/* renamed from: ov1.f */
public interface C21891f {

    /* renamed from: ov1.f$a */
    public static class C21892a {

        /* renamed from: a */
        public int f61904a = Integer.MAX_VALUE;

        /* renamed from: b */
        public boolean f61905b = true;

        /* renamed from: c */
        public int f61906c = Integer.MAX_VALUE;

        /* renamed from: d */
        public boolean f61907d = false;

        /* renamed from: e */
        public int f61908e = 0;

        /* renamed from: f */
        public List<C99681n> f61909f = null;

        /* renamed from: g */
        public C99672i f61910g = null;

        /* renamed from: h */
        public boolean f61911h = true;

        /* renamed from: i */
        public C99681n f61912i;

        /* renamed from: j */
        public int f61913j = 0;

        public String toString() {
            Object[] objArr = new Object[7];
            int i = 0;
            objArr[0] = Integer.valueOf(this.f61904a);
            objArr[1] = Boolean.valueOf(this.f61905b);
            objArr[2] = Integer.valueOf(this.f61906c);
            objArr[3] = Boolean.valueOf(this.f61907d);
            objArr[4] = Integer.valueOf(this.f61908e);
            List<C99681n> list = this.f61909f;
            if (list != null) {
                i = list.size();
            }
            objArr[5] = Integer.valueOf(i);
            objArr[6] = Integer.valueOf(this.f61913j);
            return String.format("{%d, %b, %d, %b, %d, %d, %d}", objArr);
        }
    }

    /* renamed from: ov1.f$b */
    public interface C21893b {
        /* renamed from: a */
        void mo23811a(C21891f fVar, String str, boolean z);
    }

    /* renamed from: a */
    long mo17719a();

    /* renamed from: b */
    boolean mo17718b(View view, C22019b bVar, boolean z);

    /* renamed from: c */
    LinkedList<Integer> mo17720c();

    /* renamed from: d */
    int mo17721d(int i);

    /* renamed from: e */
    void mo17722e();

    /* renamed from: f */
    C22019b mo17723f(int i);

    /* renamed from: g */
    int mo17724g();

    int getType();

    /* renamed from: h */
    void mo17725h(String str, MMHandler mMHandler, HashSet<String> hashSet, long j);

    /* renamed from: i */
    List<C21461d> mo17726i(long j);

    /* renamed from: l */
    void mo17727l();
}
