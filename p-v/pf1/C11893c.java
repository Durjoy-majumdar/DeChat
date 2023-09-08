package pf1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.wcdb.FileUtils;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import jq3.C60905o;
import mf1.C10786a1;
import rs1.C13442s8;

/* renamed from: pf1.c */
public final class C11893c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C11894d f34758d;

    /* renamed from: e */
    public final /* synthetic */ View f34759e;

    /* renamed from: f */
    public final /* synthetic */ C11924s f34760f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f34761g;

    /* renamed from: h */
    public final /* synthetic */ String f34762h;

    public C11893c(C11894d dVar, View view, C11924s sVar, C60905o oVar, String str) {
        this.f34758d = dVar;
        this.f34759e = view;
        this.f34760f = sVar;
        this.f34761g = oVar;
        this.f34762h = str;
    }

    public final void run() {
        String str;
        this.f34758d.mo11783z(this.f34759e, this.f34760f);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = this.f34761g.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        if (f == null || (str = f.f38098n) == null) {
            str = "";
        }
        String str2 = str;
        C39818r rVar = C39818r.f106831a;
        Context context2 = this.f34761g.f173499A;
        C87412m.m108593f(context2, "holder.context");
        long j = ((C10786a1) rVar.mo62443b(context2).mo75002a(C10786a1.class)).f32261v;
        String str3 = this.f34762h;
        int i = C87412m.m108589b(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str3) ? 2 : C87412m.m108589b("TWO_FLOW", str3) ? 4 : 1;
        if (!this.f34760f.f34860l) {
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C11924s sVar = this.f34760f;
            C58417y0.Py0((C58417y0) c, str2, false, false, sVar.f34783f, sVar.f34861m, sVar.f34862n, 0, 0, 0, sVar.f34787j, sVar.f34786i, j, i, FileUtils.S_IRWXU, (Object) null);
            this.f34760f.f34860l = true;
        }
    }
}
