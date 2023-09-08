package jh2;

import android.content.Context;
import com.tencent.p014mm.autogen.mmdata.rpt.VideoBGMSearchStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gy3.C8480h;
import java.util.ArrayList;
import kh2.C10093a;
import te3.C110975wt2;

/* renamed from: jh2.d */
public final class C108745d {

    /* renamed from: h */
    public static final C108746a f325632h = new C108746a((C8480h) null);

    /* renamed from: i */
    public static C108745d f325633i;

    /* renamed from: j */
    public static VideoBGMSearchStruct f325634j = new VideoBGMSearchStruct();

    /* renamed from: a */
    public int f325635a = 3;

    /* renamed from: b */
    public int f325636b;

    /* renamed from: c */
    public long f325637c;

    /* renamed from: d */
    public long f325638d;

    /* renamed from: e */
    public boolean f325639e;

    /* renamed from: f */
    public boolean f325640f = true;

    /* renamed from: g */
    public final ArrayList<C110975wt2> f325641g = new ArrayList<>();

    /* renamed from: jh2.d$a */
    public static final class C108746a {
        public C108746a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo159769a() {
            C108746a aVar = C108745d.f325632h;
            Log.m105918d("MicroMsg.AudioReporter", "reportAudioSearchStruct:\n " + C108745d.f325634j.mo1006q());
            C108745d.f325634j.mo86054n();
            C108745d.f325634j = new VideoBGMSearchStruct();
        }
    }

    /* renamed from: a */
    public final void mo159765a() {
        if (this.f325638d != 0) {
            C110975wt2 wt22 = new C110975wt2();
            wt22.f332321d = this.f325636b;
            if (this.f325639e) {
                wt22.f332322e = this.f325635a == 4 ? 11 : 5;
            } else {
                wt22.f332322e = this.f325635a == 4 ? 13 : 7;
            }
            wt22.f332324g = (int) Util.nowSecond();
            mo159766b();
            this.f325641g.add(wt22);
            Log.m105924i("MicroMsg.AudioReporter", "record cancel " + C108747e.m147548a(wt22));
            C86709a0.m107529k().f251779b.mo123460f(new C10093a(this.f325638d, this.f325641g));
            f325633i = null;
        }
    }

    /* renamed from: b */
    public final void mo159766b() {
        if (!this.f325640f) {
            C110975wt2 wt22 = new C110975wt2();
            long currentTimeMillis = System.currentTimeMillis();
            wt22.f332321d = this.f325636b;
            wt22.f332322e = this.f325635a == 3 ? 1 : 9;
            long j = this.f325637c;
            wt22.f332323f = (int) (currentTimeMillis - j);
            wt22.f332324g = (int) (j / ((long) 1000));
            this.f325641g.add(wt22);
            this.f325640f = true;
            Log.m105924i("MicroMsg.AudioReporter", "record pause " + C108747e.m147548a(wt22));
        }
    }

    /* renamed from: c */
    public final void mo159767c(int i, int i2) {
        this.f325636b = i;
        this.f325637c = System.currentTimeMillis();
        this.f325639e = true;
        this.f325640f = false;
        this.f325635a = i2;
    }

    /* renamed from: d */
    public final void mo159768d() {
        if (this.f325638d != 0) {
            C110975wt2 wt22 = new C110975wt2();
            wt22.f332321d = this.f325636b;
            int i = 2;
            if (this.f325639e) {
                wt22.f332322e = this.f325635a == 4 ? 10 : 2;
            } else {
                wt22.f332322e = this.f325635a == 4 ? 12 : 6;
            }
            wt22.f332324g = (int) Util.nowSecond();
            mo159766b();
            this.f325641g.add(wt22);
            Log.m105924i("MicroMsg.AudioReporter", "record send " + C108747e.m147548a(wt22));
            if (this.f325638d != 0) {
                Context context = MMApplicationContext.getContext();
                int i2 = NetStatusUtil.isWifi(context) ? 1 : NetStatusUtil.is4G(context) ? 6 : NetStatusUtil.is3G(context) ? 5 : NetStatusUtil.is2G(context) ? 4 : NetStatusUtil.isWap(context) ? 3 : 2;
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[11];
                objArr[0] = Integer.valueOf(i2);
                objArr[1] = 1;
                objArr[2] = "";
                objArr[3] = 0L;
                objArr[4] = 0L;
                objArr[5] = "";
                objArr[6] = Long.valueOf(this.f325638d);
                if (!this.f325639e) {
                    i = 1;
                }
                objArr[7] = Integer.valueOf(i);
                objArr[8] = Integer.valueOf(this.f325636b);
                objArr[9] = "";
                objArr[10] = "";
                nVar.mo160131h(16208, objArr);
            }
            C86709a0.m107529k().f251779b.mo123460f(new C10093a(this.f325638d, this.f325641g));
            f325633i = null;
        }
    }
}
