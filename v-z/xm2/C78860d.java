package xm2;

import com.tencent.p014mm.app.C114663g0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.setting.p102ui.fixtools.FixToolsUpLogUploadingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75576f4;
import f40.C86709a0;
import xm2.C78862e;

/* renamed from: xm2.d */
public class C78860d implements C75576f4.C75578b {

    /* renamed from: a */
    public final /* synthetic */ int f231700a;

    /* renamed from: b */
    public final /* synthetic */ int f231701b;

    /* renamed from: c */
    public final /* synthetic */ int f231702c;

    /* renamed from: d */
    public final /* synthetic */ int f231703d;

    /* renamed from: e */
    public final /* synthetic */ C78862e f231704e;

    /* renamed from: xm2.d$a */
    public class C78861a implements C114663g0.C114666c {
        public C78861a() {
        }

        /* renamed from: a */
        public void mo105672a(String str) {
            mo108884c(-1, 0, 0);
        }

        /* renamed from: b */
        public void mo105673b(String str, int i, long j, long j2) {
            mo108884c(i, j, j2);
            Log.m105919d("MicroMsg.FixToolsUplogModel", "ipxx progress:%d, isUploading:%b", Integer.valueOf(i), Boolean.valueOf(C78860d.this.f231704e.f231708a));
        }

        /* renamed from: c */
        public final void mo108884c(int i, long j, long j2) {
            if (i < 0 || i >= 100) {
                C78862e.C78863a aVar = C78862e.f231706b;
                if (aVar != null) {
                    ((FixToolsUpLogUploadingUI.C71036a) aVar).mo97689a(i, j, j2);
                    C78862e.f231706b = null;
                }
                C78860d.this.f231704e.f231708a = false;
                return;
            }
            C78862e.C78863a aVar2 = C78862e.f231706b;
            if (aVar2 != null) {
                ((FixToolsUpLogUploadingUI.C71036a) aVar2).mo97689a(i, j, j2);
            }
        }
    }

    public C78860d(C78862e eVar, int i, int i2, int i3, int i4) {
        this.f231704e = eVar;
        this.f231700a = i;
        this.f231701b = i2;
        this.f231702c = i3;
        this.f231703d = i4;
    }

    /* renamed from: a */
    public void mo57753a(C114770g gVar) {
        C86709a0.m107524d().mo123463i();
        Log.appenderFlush();
        C114663g0.m161244d(new int[]{this.f231700a}, C86709a0.m107522a(), (long) this.f231701b, this.f231702c, this.f231703d, (String) null, new C78861a());
    }
}
