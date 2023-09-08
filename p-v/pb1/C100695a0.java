package pb1;

import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import kj2.C117407d;
import te3.C101835rd0;
import xb1.C102614d;

/* renamed from: pb1.a0 */
public class C100695a0 {

    /* renamed from: a */
    public static Map<Long, Long> f295014a = new HashMap();

    /* renamed from: b */
    public static Map<Long, Long> f295015b = new HashMap();

    /* renamed from: pb1.a0$a */
    public static class C100696a {

        /* renamed from: a */
        public int f295016a;

        /* renamed from: b */
        public int f295017b;

        /* renamed from: c */
        public long f295018c;

        /* renamed from: d */
        public int f295019d;

        /* renamed from: e */
        public String f295020e;

        /* renamed from: f */
        public int f295021f;

        /* renamed from: g */
        public long f295022g;

        /* renamed from: h */
        public long f295023h;

        /* renamed from: i */
        public long f295024i;

        /* renamed from: j */
        public boolean f295025j;

        /* renamed from: k */
        public int f295026k;

        /* renamed from: l */
        public int f295027l;

        /* renamed from: m */
        public int f295028m;

        /* renamed from: n */
        public int f295029n;

        /* renamed from: o */
        public int f295030o;

        /* renamed from: p */
        public boolean f295031p;

        /* renamed from: q */
        public boolean f295032q;

        /* renamed from: r */
        public int f295033r;

        /* renamed from: s */
        public String f295034s;

        /* renamed from: t */
        public int f295035t;

        /* renamed from: u */
        public String f295036u;

        /* renamed from: v */
        public String f295037v;

        public String toString() {
            return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{Integer.valueOf(this.f295016a), Integer.valueOf(this.f295017b), Long.valueOf(this.f295018c), Integer.valueOf(this.f295019d), this.f295020e, Integer.valueOf(this.f295021f), Long.valueOf(this.f295022g), Long.valueOf(this.f295023h), Long.valueOf(this.f295024i), Integer.valueOf(this.f295025j ? 1 : 0), Integer.valueOf(this.f295026k), Integer.valueOf(this.f295027l), Integer.valueOf(this.f295028m), Integer.valueOf(this.f295029n), Integer.valueOf(this.f295030o), Integer.valueOf(this.f295031p ? 1 : 0), Integer.valueOf(this.f295032q ? 1 : 0), Integer.valueOf(this.f295033r), this.f295034s, Integer.valueOf(this.f295035t), this.f295036u, this.f295037v});
        }
    }

    /* renamed from: a */
    public static long m131726a(long j) {
        Long l = (Long) ((HashMap) f295014a).get(Long.valueOf(j));
        if (l == null) {
            return -1;
        }
        return System.currentTimeMillis() - l.longValue();
    }

    /* renamed from: b */
    public static final void m131727b(int i) {
        C117407d.INSTANCE.idkeyStat(802, (long) i, 1, false);
    }

    /* renamed from: c */
    public static final void m131728c(int i, int i2) {
        C117407d.INSTANCE.idkeyStat(802, (long) i, (long) i2, false);
    }

    /* renamed from: d */
    public static void m131729d(long j, int i, int i2, int i3) {
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j);
        if (Yt != null) {
            C101835rd0 rd02 = Yt.field_favProto.f298616d;
            int i4 = rd02.f299346d;
            String str = rd02.f299348f;
            int i5 = i == 1 ? C72996z1.m85820U5(str) ? 2 : 1 : 0;
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 40;
            aVar.f264838d = Yt.field_favProto;
            favoriteOperationEvent.publish();
            C115669n.INSTANCE.mo160131h(10651, Integer.valueOf(Yt.field_type), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(Yt.field_id), C100734q.m131816G(Yt), Long.valueOf(Yt.field_updateTime / 1000), Integer.valueOf(i4), str, Integer.valueOf(i5), "", favoriteOperationEvent.f264834e.f264864j, Integer.valueOf(i3));
        }
    }

    /* renamed from: e */
    public static void m131730e(long j, int i, int i2) {
        Class cls = C100718j1.class;
        C100755z qq = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142273qq(j);
        if (qq != null) {
            C115669n.INSTANCE.mo160131h(11122, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(((C100718j1) C86312j.m106911c(cls)).mo128204NU().mo140139e()), Integer.valueOf(i2), Integer.valueOf(qq.field_type), C100734q.m131816G(qq), Long.valueOf(qq.field_updateTime), Integer.valueOf(qq.field_favProto.f298616d.f299346d), qq.field_favProto.f298616d.f299348f);
        }
    }
}
