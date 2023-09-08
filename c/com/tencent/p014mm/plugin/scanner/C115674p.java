package com.tencent.p014mm.plugin.scanner;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.OCRTranslateReportStruct;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.plugin.scanner.model.C115671l1;
import com.tencent.p014mm.plugin.scanner.model.C115672t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import i40.C98598e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p1081gi.C98124g;
import p663qo.C77384i;
import p749xh.C38543c8;
import sl2.C36681b;
import vl2.C118684u;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.scanner.p */
public class C115674p extends C98598e implements C94466j {

    /* renamed from: i */
    public volatile C118684u f347029i;

    /* renamed from: j */
    public C36681b f347030j;

    /* renamed from: n */
    public HashMap<Integer, C115671l1> f347031n = new HashMap<>();

    /* renamed from: o */
    public HashMap<Integer, OCRTranslateReportStruct> f347032o = new HashMap<>();

    /* renamed from: p */
    public HashMap<Integer, Long> f347033p = new HashMap<>();

    /* renamed from: q */
    public C118684u.C118686b f347034q = new p$$b(this);

    /* renamed from: r */
    public C55384i f347035r;

    /* renamed from: s */
    public boolean f347036s = false;

    static {
        new HashMap();
    }

    public String Ax0(String str) {
        StringBuilder sb = new StringBuilder();
        String str2 = ((C115670k) C86312j.m106911c(C115670k.class)).Gp0() + "scan_result/";
        if (!this.f347036s) {
            C86013q1.m106460u(str2);
            this.f347036s = true;
        }
        sb.append(str2);
        sb.append(String.format("%s_%d.%s", new Object[]{"translation", Long.valueOf(System.currentTimeMillis()), str}));
        return sb.toString();
    }

    public C118684u Bx0() {
        if (this.f347029i == null) {
            synchronized (this) {
                if (this.f347029i == null) {
                    this.f347029i = new C118684u();
                }
            }
        }
        return this.f347029i;
    }

    public C36681b Cx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f347030j == null) {
            this.f347030j = new C36681b(C86709a0.m107535s().f251811i);
        }
        return this.f347030j;
    }

    public void Dx0(int i) {
        OCRTranslateReportStruct oCRTranslateReportStruct;
        ScanTranslationResultEvent scanTranslationResultEvent = new ScanTranslationResultEvent();
        ScanTranslationResultEvent.C92560a aVar = scanTranslationResultEvent.f265089d;
        aVar.f265090a = i;
        aVar.f265092c = false;
        if (this.f347031n.containsKey(Integer.valueOf(i)) && (oCRTranslateReportStruct = this.f347032o.get(Integer.valueOf(i))) != null) {
            scanTranslationResultEvent.f265089d.f265091b = (int) oCRTranslateReportStruct.f343788d;
        }
        scanTranslationResultEvent.publish();
        this.f347031n.remove(Integer.valueOf(i));
    }

    public C55384i Ex0(int i, C115672t tVar, C118684u.C118686b bVar) {
        long currentTimeMillis = System.currentTimeMillis() - tVar.f347017i;
        if (this.f347032o.containsKey(Integer.valueOf(i))) {
            this.f347032o.get(Integer.valueOf(i)).f343792h = currentTimeMillis;
        }
        Log.m105925i("MicroMsg.PluginScanTranslation", "startTranslationSpr: sessionId:%s  scene cost:%s", Integer.valueOf(i), String.valueOf(currentTimeMillis));
        String Ax0 = Ax0("jpg");
        C86013q1.m106461v(Ax0);
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_TranslateImageResultDownload";
        gVar.field_fullpath = Ax0;
        gVar.field_fileType = 2;
        gVar.field_totalLen = tVar.f347022q;
        gVar.field_aesKey = tVar.f347021p;
        gVar.field_fileId = tVar.f347020o;
        gVar.field_mediaId = tVar.f347020o + i;
        gVar.field_priority = 2;
        p$$a p__a = new p$$a(System.currentTimeMillis(), Ax0, bVar, i);
        ((C77384i) C86312j.m106911c(C77384i.class)).mo107504hs(gVar, new WeakReference(p__a));
        return p__a;
    }

    public C38543c8 Gb0(String str) {
        String mD5String = MD5Util.getMD5String(str + C86013q1.m106452m(str));
        Log.m105925i("MicroMsg.PluginScanTranslation", "getTranslationResult %s, md5 %s", str, mD5String);
        return Cx0().mo60806jo(mD5String);
    }
}
