package com.tencent.p014mm.plugin.vlog.model;

import ac3.C103353f0;
import ac3.C27850e0;
import ci2.C104380d;
import com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.decoder.logger.Logger;
import gy3.C8480h;
import gy3.C87412m;
import sp3.C110801c;
import sp3.C110803f;
import yp3.C112478a;

/* renamed from: com.tencent.mm.plugin.vlog.model.q0 */
public final class C106205q0 implements C57468y {

    /* renamed from: a */
    public String f316490a;

    /* renamed from: b */
    public int f316491b;

    /* renamed from: c */
    public int f316492c;

    /* renamed from: d */
    public final int f316493d;

    /* renamed from: e */
    public final C104380d f316494e;

    /* renamed from: f */
    public int f316495f;

    /* renamed from: g */
    public int f316496g;

    /* renamed from: h */
    public float f316497h;

    /* renamed from: i */
    public final C106204p f316498i;

    /* renamed from: j */
    public int f316499j;

    /* renamed from: k */
    public final MediaEditReportInfo.EditItem f316500k;

    /* renamed from: l */
    public final C110801c f316501l;

    static {
        Logger.setLogProxy(new C27850e0());
        Logger.setLevel(2);
        C112478a.f336787a = new C103353f0();
        int i = C110803f.f331484a;
        C110803f.f331485b = 4000;
    }

    public C106205q0(String str, int i, int i2) {
        C87412m.m108594g(str, "path");
        this.f316490a = str;
        this.f316491b = i;
        this.f316492c = i2;
        int hashCode = hashCode();
        this.f316493d = hashCode;
        this.f316494e = new C104380d(0, false, 3, (C8480h) null);
        this.f316497h = 1.0f;
        this.f316498i = new C106204p();
        this.f316499j = -1;
        this.f316500k = new MediaEditReportInfo.EditItem();
        Log.m105924i("MicroMsg.VLogCompositionTrack", "create VLogCompositionTrack path:" + this.f316490a + ", type:" + this.f316491b + ", id:" + hashCode);
        String i3 = C86013q1.m106448i(this.f316490a, false);
        this.f316501l = new C110801c(i3 == null ? "" : i3, this.f316491b);
    }

    /* renamed from: a */
    public void mo81187a(long j) {
        this.f316501l.mo162365c(j);
    }

    /* renamed from: b */
    public void mo81188b(long j) {
        this.f316501l.mo162367e(j);
    }

    /* renamed from: c */
    public long mo81189c() {
        return this.f316501l.f331470h;
    }

    /* renamed from: d */
    public void mo81190d(long j) {
        this.f316501l.mo162368f(j);
    }

    /* renamed from: e */
    public void mo81191e(long j) {
        this.f316501l.mo162366d(j);
    }

    /* renamed from: f */
    public C106204p mo81192f() {
        return this.f316498i;
    }

    /* renamed from: g */
    public long mo152156g() {
        return this.f316501l.f331465c;
    }

    /* renamed from: h */
    public float mo152157h() {
        return this.f316501l.f331468f;
    }

    /* renamed from: i */
    public long mo152158i() {
        return this.f316501l.f331464b;
    }

    /* renamed from: j */
    public C110801c mo152159j() {
        return this.f316501l;
    }

    /* renamed from: k */
    public long mo152160k() {
        return this.f316501l.f331466d;
    }

    /* renamed from: l */
    public int mo152161l() {
        return this.f316499j;
    }

    /* renamed from: m */
    public void mo152162m(float f) {
        C110801c cVar = this.f316501l;
        if (f > ((float) 0)) {
            cVar.f331468f = f;
        } else {
            cVar.getClass();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C106205q0(String str, int i, int i2, int i3, C8480h hVar) {
        this(str, i, (i3 & 4) != 0 ? 0 : i2);
    }
}
