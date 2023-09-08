package kd0;

import android.text.TextUtils;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kj2.C117407d;
import ob0.C35136m;
import ob0.C77002r;
import p1081gi.C98120c;
import p1081gi.C98124g;

public final /* synthetic */ class f$$a implements C55384i {

    /* renamed from: a */
    public final /* synthetic */ C76539f f224006a;

    public /* synthetic */ f$$a(C76539f fVar) {
        this.f224006a = fVar;
    }

    /* renamed from: a */
    public final void mo11363a(C92798v vVar) {
        C76551y o;
        C92798v vVar2 = vVar;
        C76539f fVar = this.f224006a;
        String str = fVar.f223996f;
        C98124g gVar = vVar2.f267133d;
        if (gVar != null && !TextUtils.isEmpty(gVar.field_fullpath)) {
            str = gVar.field_fullpath;
        }
        Log.m105925i("MicroMsg.NetSceneDownloadVoice", "CdnPLCJavaHelperListener fullPath: $s, fileName:%s %s %s", str, fVar.f223996f, vVar2.f267130a, Integer.valueOf(vVar2.f267132c));
        int ordinal = vVar2.f267130a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C117407d.INSTANCE.idkeyStat(111, 57, 1, false);
                if (vVar2.f267135f != null) {
                    boolean U5 = C72996z1.m85820U5(fVar.f223998h);
                    int x = C76552z.m92086x(fVar.f223996f, (int) vVar2.f267135f.field_fileLength, (C35136m.C35137a) null);
                    Log.m105925i("MicroMsg.NetSceneDownloadVoice", "cdn voice download success %s ret:%s", Long.valueOf(vVar2.f267135f.field_fileLength), Integer.valueOf(x));
                    int i = -1;
                    C76537d l = C76552z.m92074l(fVar.f223997g, fVar.f223996f);
                    if (l != null) {
                        i = l.mo106770c(str);
                    } else {
                        Log.m105920e("MicroMsg.NetSceneDownloadVoice", "cdn download, fileOperator is null");
                        C86013q1.m106447h(str);
                    }
                    if (i < 0 || x == 0) {
                        Log.m105920e("MicroMsg.NetSceneDownloadVoice", "cdn voice Write Failed File:" + fVar.f223996f + " ret:" + x + "newSize: " + i);
                        fVar.f224000j = true;
                        fVar.doScene(fVar.dispatcher(), fVar.f223994d);
                        C21321k.m23907a(fVar.f223996f, 2, 220, Util.ticksToNow(fVar.f224002o), U5, (String) null);
                        return;
                    } else if (x < 0) {
                        String str2 = fVar.f223996f;
                        long ticksToNow = Util.ticksToNow(fVar.f224002o);
                        C21321k.m23907a(str2, 2, 225, ticksToNow, U5, x + "");
                        C115669n.INSTANCE.idkeyStat(111, 229, 1, false);
                        fVar.f223994d.onSceneEnd(0, 0, "", fVar);
                        return;
                    } else if (x == 1) {
                        C21321k.m23907a(fVar.f223996f, 2, 100, Util.ticksToNow(fVar.f224002o), U5, (String) null);
                        fVar.mo106776j1();
                        fVar.f223994d.onSceneEnd(0, 0, "", fVar);
                        return;
                    } else {
                        Log.m105920e("MicroMsg.NetSceneDownloadVoice", "cdn voice download unreachable code");
                        return;
                    }
                } else {
                    return;
                }
            } else if (ordinal == 3) {
                C98120c cVar = vVar2.f267134e;
                if (cVar != null) {
                    Log.m105925i("MicroMsg.NetSceneDownloadVoice", "cdn voice download progress filename:%s %s/%s ret:%s", fVar.f223996f, Long.valueOf(vVar2.f267134e.field_finishedLength), Long.valueOf(vVar2.f267134e.field_toltalLength), Integer.valueOf(C76552z.m92086x(fVar.f223996f, (int) cVar.field_finishedLength, (C35136m.C35137a) null)));
                    return;
                }
                return;
            } else if (!(ordinal == 11 || ordinal == 7 || ordinal == 8)) {
                return;
            }
        }
        Log.m105921e("MicroMsg.NetSceneDownloadVoice", "cdn download error, fallback to cgi download %s", vVar2.f267130a.name());
        boolean U52 = C72996z1.m85820U5(fVar.f223998h);
        String str3 = fVar.f223996f;
        C92798v.C92799a aVar = vVar2.f267130a;
        C87412m.m108594g(aVar, "event");
        int ordinal2 = aVar.ordinal();
        C21321k.m23907a(str3, 2, ordinal2 != 0 ? ordinal2 != 11 ? ordinal2 != 7 ? ordinal2 != 8 ? 230 : 232 : 231 : 234 : 233, Util.ticksToNow(fVar.f224002o), U52, (String) null);
        fVar.f224000j = true;
        String str4 = fVar.f223996f;
        HashMap<String, WeakReference<C77002r>> hashMap = C76552z.f224074a;
        Log.m105925i("MicroMsg.VoiceLogic", "clearDownloadStatus: %s", str4);
        if (!(str4 == null || (o = C76552z.m92077o(str4)) == null)) {
            o.f224056g = 0;
            o.f224058i = 5;
            o.f224050a = 80;
            if (!C76552z.m92088z(o)) {
                Log.m105929w("MicroMsg.VoiceLogic", "clearDownloadStatus: update storage error %s", str4);
            }
        }
        C86013q1.m106447h(str);
        fVar.doScene(fVar.dispatcher(), fVar.f223994d);
    }
}
