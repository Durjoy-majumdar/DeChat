package r03;

import com.tencent.p014mm.plugin.topstory.p113ui.home.TopStorySettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import s03.C48215c;
import te3.C49064cy1;
import te3.C50962qi;

/* renamed from: r03.a */
public class C47918a implements C11385n {

    /* renamed from: q */
    public static C47918a f128578q;

    /* renamed from: d */
    public List<String> f128579d;

    /* renamed from: e */
    public List<String> f128580e;

    /* renamed from: f */
    public long f128581f = 1;

    /* renamed from: g */
    public long f128582g = 1;

    /* renamed from: h */
    public C48215c f128583h;

    /* renamed from: i */
    public C48215c f128584i;

    /* renamed from: j */
    public List<String> f128585j;

    /* renamed from: n */
    public List<String> f128586n;

    /* renamed from: o */
    public C47919a f128587o;

    /* renamed from: p */
    public C47920b f128588p;

    /* renamed from: r03.a$a */
    public interface C47919a {
    }

    /* renamed from: r03.a$b */
    public interface C47920b {
    }

    public C47918a() {
        String a = m53243a("blacklist");
        if (C86013q1.m106450k(a)) {
            try {
                this.f128579d = Util.stringToList(C86013q1.m106432N(a), ",");
                long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_TOP_STORY_BLACK_LIST_VERSION_LONG, 1);
                this.f128581f = G;
                Log.m105925i("MicroMsg.TopStory.TopStoryBlackListMgr", "black version %d", Long.valueOf(G));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TopStory.TopStoryBlackListMgr", e, "read black cache file", new Object[0]);
            }
        }
        if (this.f128579d == null) {
            this.f128579d = new ArrayList();
        }
        String a2 = m53243a("unlikelist");
        if (C86013q1.m106450k(a2)) {
            try {
                this.f128579d = Util.stringToList(C86013q1.m106432N(a2), ",");
                long G2 = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_TOP_STORY_UNLIKE_LIST_VERSION_LONG, 1);
                this.f128582g = G2;
                Log.m105925i("MicroMsg.TopStory.TopStoryBlackListMgr", "unlike version %d", Long.valueOf(G2));
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.TopStory.TopStoryBlackListMgr", e2, "read unlike cache file", new Object[0]);
            }
        }
        if (this.f128580e == null) {
            this.f128580e = new ArrayList();
        }
        C86709a0.m107524d().mo123455a(2748, this);
    }

    /* renamed from: a */
    public static final String m53243a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107535s().f251806d + "topstory/");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public static C47918a m53244b() {
        if (f128578q == null) {
            f128578q = new C47918a();
        }
        return f128578q;
    }

    /* renamed from: c */
    public void mo72676c() {
        C86013q1.m106437S(m53243a("blacklist"), Util.listToString(this.f128579d, ",").getBytes());
    }

    /* renamed from: d */
    public void mo72677d() {
        C86013q1.m106437S(m53243a("unlikelist"), Util.listToString(this.f128580e, ",").getBytes());
    }

    /* renamed from: e */
    public void mo72678e(long j, int i) {
        if (this.f128583h != null) {
            C86709a0.m107524d().mo123458d(this.f128583h);
        }
        Log.m105925i("MicroMsg.TopStory.TopStoryBlackListMgr", "request black version %d offset %d", Long.valueOf(j), Integer.valueOf(i));
        this.f128583h = new C48215c(1, j, i);
        C86709a0.m107529k().f251779b.mo123460f(this.f128583h);
    }

    /* renamed from: f */
    public void mo72679f(long j, int i) {
        if (this.f128584i != null) {
            C86709a0.m107524d().mo123458d(this.f128584i);
        }
        Log.m105925i("MicroMsg.TopStory.TopStoryBlackListMgr", "request unlike version %d offset %d", Long.valueOf(j), Integer.valueOf(i));
        this.f128584i = new C48215c(3, j, i);
        C86709a0.m107529k().f251779b.mo123460f(this.f128584i);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.equals(this.f128583h)) {
            if (i == 0 && i2 == 0) {
                C49064cy1 cy12 = (C49064cy1) this.f128583h.f129203e.f127056b.f127083a;
                int i3 = cy12.f132024g;
                if (i3 == 1) {
                    if (this.f128585j == null) {
                        this.f128585j = new ArrayList();
                    }
                    Iterator<C50962qi> it = cy12.f132021d.iterator();
                    while (it.hasNext()) {
                        ((ArrayList) this.f128585j).add(it.next().f140321d);
                    }
                    if (cy12.f132022e == 1) {
                        Log.m105925i("MicroMsg.TopStory.TopStoryBlackListMgr", "sync black size %d version %d", Integer.valueOf(cy12.f132021d.size()), Long.valueOf(cy12.f132025h));
                        mo72678e(cy12.f132025h, cy12.f132026i);
                        return;
                    }
                    this.f128579d = this.f128585j;
                    this.f128585j = null;
                    long j = cy12.f132025h;
                    this.f128581f = j;
                    Log.m105925i("MicroMsg.TopStory.TopStoryBlackListMgr", "update black version %d total item %d", Long.valueOf(j), Integer.valueOf(this.f128579d.size()));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_BLACK_LIST_VERSION_LONG, Long.valueOf(this.f128581f));
                    mo72676c();
                    C47919a aVar = this.f128587o;
                    if (aVar != null) {
                        TopStorySettingUI.C43252b bVar = (TopStorySettingUI.C43252b) aVar;
                        TopStorySettingUI topStorySettingUI = TopStorySettingUI.this;
                        int i4 = TopStorySettingUI.f117042o;
                        topStorySettingUI.mo67486J7();
                        TopStorySettingUI.this.mo67487K7();
                    }
                } else if (i3 == 2) {
                    Log.m105924i("MicroMsg.TopStory.TopStoryBlackListMgr", "no need to update black list");
                } else if (i3 == 3) {
                    Log.m105924i("MicroMsg.TopStory.TopStoryBlackListMgr", "resync black list");
                    this.f128585j = null;
                    mo72678e(this.f128581f, 0);
                } else {
                    Log.m105925i("MicroMsg.TopStory.TopStoryBlackListMgr", "invalid black update flag %d", Integer.valueOf(i3));
                }
            }
        } else if (yVar.equals(this.f128584i) && i == 0 && i2 == 0) {
            C49064cy1 cy13 = (C49064cy1) this.f128584i.f129203e.f127056b.f127083a;
            int i5 = cy13.f132024g;
            if (i5 == 1) {
                if (this.f128586n == null) {
                    this.f128586n = new ArrayList();
                }
                Iterator<C50962qi> it4 = cy13.f132021d.iterator();
                while (it4.hasNext()) {
                    ((ArrayList) this.f128586n).add(it4.next().f140321d);
                }
                if (cy13.f132022e == 1) {
                    Log.m105925i("MicroMsg.TopStory.TopStoryBlackListMgr", "sync unlike size %d version", Integer.valueOf(cy13.f132021d.size()), Long.valueOf(cy13.f132025h));
                    mo72679f(cy13.f132025h, cy13.f132026i);
                    return;
                }
                this.f128580e = this.f128586n;
                this.f128586n = null;
                long j2 = cy13.f132025h;
                this.f128582g = j2;
                Log.m105925i("MicroMsg.TopStory.TopStoryBlackListMgr", "update unlike version %d total item %d", Long.valueOf(j2), Integer.valueOf(this.f128580e.size()));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_UNLIKE_LIST_VERSION_LONG, Long.valueOf(this.f128582g));
                mo72677d();
                C47920b bVar2 = this.f128588p;
                if (bVar2 != null) {
                    TopStorySettingUI.C43253c cVar = (TopStorySettingUI.C43253c) bVar2;
                    TopStorySettingUI topStorySettingUI2 = TopStorySettingUI.this;
                    int i6 = TopStorySettingUI.f117042o;
                    topStorySettingUI2.mo67486J7();
                    TopStorySettingUI.this.mo67487K7();
                }
            } else if (i5 == 2) {
                Log.m105924i("MicroMsg.TopStory.TopStoryBlackListMgr", "no need to update unlike list");
            } else if (i5 == 3) {
                Log.m105924i("MicroMsg.TopStory.TopStoryBlackListMgr", "resync unlike list");
                this.f128586n = null;
                mo72679f(this.f128582g, 0);
            } else {
                Log.m105925i("MicroMsg.TopStory.TopStoryBlackListMgr", "invalid unlike update flag %d", Integer.valueOf(i5));
            }
        }
    }
}
