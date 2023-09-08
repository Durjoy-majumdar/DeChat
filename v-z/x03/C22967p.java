package x03;

import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p03.C21914h;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import t03.C22426h;
import te3.xh4;
import te3.yh4;

/* renamed from: x03.p */
public class C22967p {

    /* renamed from: a */
    public C22947b f65989a;

    /* renamed from: b */
    public String f65990b;

    /* renamed from: c */
    public Map<String, yh4> f65991c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    public Set<String> f65992d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e */
    public int f65993e = 0;

    /* renamed from: x03.p$b */
    public class C22969b implements Runnable {

        /* renamed from: d */
        public String f65994d;

        /* renamed from: x03.p$b$a */
        public class C22970a implements Comparator<C86009m1> {
            public C22970a(C22969b bVar) {
            }

            public int compare(Object obj, Object obj2) {
                return Long.compare(((C86009m1) obj2).mo119979q(), ((C86009m1) obj).mo119979q());
            }
        }

        public C22969b(String str) {
            this.f65994d = str;
        }

        public void run() {
            xh4 xh4;
            C86009m1 m1Var = new C86009m1(this.f65994d);
            if (m1Var.mo119967g()) {
                C86009m1[] u = m1Var.mo119984u();
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(C22967p.this.f65992d.size());
                objArr[1] = Integer.valueOf(C22967p.this.f65991c.size());
                objArr[2] = Integer.valueOf(u != null ? u.length : 0);
                objArr[3] = this.f65994d;
                Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "DeleteVideoCacheTask preloadSize: %d cacheSize: %d folderSize: %d folderPath: %s", objArr);
                if (u != null && u.length > 10) {
                    ArrayList arrayList = new ArrayList(u.length);
                    for (C86009m1 add : u) {
                        arrayList.add(add);
                    }
                    Collections.sort(arrayList, new C22970a(this));
                    Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "First: %s Last: %s", C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, ((C86009m1) arrayList.get(0)).mo119979q() / 1000), C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, ((C86009m1) arrayList.get(arrayList.size() - 1)).mo119979q() / 1000));
                    List<C86009m1> subList = arrayList.subList(10, arrayList.size());
                    C22947b bVar = C22967p.this.f65989a;
                    String b = (bVar == null || (xh4 = bVar.mo24995y5().f66030d) == null) ? "" : C22426h.m26100b(xh4.f64729h, xh4.f64741v);
                    for (C86009m1 m1Var2 : subList) {
                        String str = m1Var2.getName().split("\\.")[0];
                        if (!str.equals(b) && !C22967p.this.f65992d.contains(str)) {
                            Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "Delete cache video %s %s", m1Var2.getName(), C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, m1Var2.mo119979q() / 1000));
                            C22967p.this.f65991c.remove(str);
                            m1Var2.mo119966f();
                        }
                    }
                    return;
                }
                return;
            }
            Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "DeleteVideoCacheTask folder %s not exist", this.f65994d);
        }
    }

    /* renamed from: x03.p$d */
    public class C22971d implements C98124g.C98126b {
        public C22971d(C22968a aVar) {
        }

        /* renamed from: b */
        public void mo31987b(String str, C98121d dVar) {
            if (C22967p.this.f65991c.containsKey(str)) {
                yh4 yh4 = C22967p.this.f65991c.get(str);
                long j = dVar.field_recvedBytes;
                yh4.f354604e = j;
                yh4.f354605f = C22967p.this.mo36185a(j, (long) ((int) dVar.field_fileLength));
                yh4.f354606g = (long) ((int) dVar.field_fileLength);
                C22967p.this.f65991c.put(str, yh4);
                Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "VideoPreloadCallback onFinish %s %d %s", str, Long.valueOf(yh4.f354605f), Util.getSizeMB(yh4.f354604e, 100.0d));
            }
        }
    }

    /* renamed from: x03.p$e */
    public class C22972e implements C98124g.C98125a {
        public C22972e(C22968a aVar) {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            if (cVar == null || cVar.field_toltalLength <= 0 || !C22967p.this.f65991c.containsKey(str)) {
                return 0;
            }
            yh4 yh4 = C22967p.this.f65991c.get(str);
            long j = cVar.field_finishedLength;
            yh4.f354604e = j;
            yh4.f354605f = C22967p.this.mo36185a(j, cVar.field_toltalLength);
            yh4.f354606g = cVar.field_toltalLength;
            C22967p.this.f65991c.put(str, yh4);
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* renamed from: x03.p$c */
    public class C22973c implements Runnable {

        /* renamed from: d */
        public String f65998d;

        public C22973c(C22967p pVar, String str) {
            this.f65998d = str;
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C86013q1.m106445f(this.f65998d);
            Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "DeleteVideoFolderTask %s %d", this.f65998d, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: a */
    public final long mo36185a(long j, long j2) {
        if (j2 != 0) {
            return (j * 100) / j2;
        }
        return 0;
    }

    /* renamed from: b */
    public void mo36186b() {
        for (String Gm0 : this.f65992d) {
            ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(Gm0);
        }
    }

    /* renamed from: c */
    public void mo36187c(C22947b bVar) {
        int i = this.f65993e + 1;
        this.f65993e = i;
        Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "onUICreate %d", Integer.valueOf(i));
        this.f65989a = bVar;
        this.f65990b = C21914h.m25161i(bVar.mo24989r4().f64648r);
    }

    /* renamed from: d */
    public void mo36188d() {
        int i = this.f65993e - 1;
        this.f65993e = i;
        Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "onUIDestroy %d", Integer.valueOf(i));
        if (this.f65993e <= 0) {
            mo36186b();
            this.f65992d.clear();
            ThreadPool.post(new C22973c(this, this.f65990b), "TopStory.DeleteVideoFolderTask");
            this.f65989a = null;
        }
    }
}
