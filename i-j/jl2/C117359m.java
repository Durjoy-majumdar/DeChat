package jl2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.autogen.events.ScanTranslationEvent;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.OCRTranslateReportStruct;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.plugin.scanner.C115670k;
import com.tencent.p014mm.plugin.scanner.C115674p;
import com.tencent.p014mm.plugin.scanner.C94457b;
import com.tencent.p014mm.plugin.scanner.model.C115671l1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashMap;
import p749xh.C38543c8;
import vl2.C118679t;

/* renamed from: jl2.m */
public class C117359m extends IStaticListener<ScanTranslationEvent> {
    public boolean callback(IEvent iEvent) {
        Bitmap decodeFile;
        ScanTranslationEvent scanTranslationEvent = (ScanTranslationEvent) iEvent;
        Class cls = C115674p.class;
        HashMap<Integer, C115671l1> hashMap = ((C115674p) C86312j.m106911c(cls)).f347031n;
        HashMap<Integer, OCRTranslateReportStruct> hashMap2 = ((C115674p) C86312j.m106911c(cls)).f347032o;
        HashMap<Integer, Long> hashMap3 = ((C115674p) C86312j.m106911c(cls)).f347033p;
        if (Util.isNullOrNil(scanTranslationEvent.f265085d.f265088c)) {
            return false;
        }
        try {
            ScanTranslationEvent.C92559a aVar = scanTranslationEvent.f265085d;
            Log.m105925i("ScanTranslationListener", "request to translate img %s, sessionId %d", aVar.f265088c, Integer.valueOf(aVar.f265087b));
            C38543c8 jo = ((C115674p) C86312j.m106911c(cls)).Cx0().mo60806jo(MD5Util.getMD5String(scanTranslationEvent.f265085d.f265088c + C86013q1.m106452m(scanTranslationEvent.f265085d.f265088c)));
            if (jo != null) {
                Log.m105924i("ScanTranslationListener", "already has translation result");
                String str = jo.field_resultFile;
                if (C86013q1.m106450k(str)) {
                    ScanTranslationResultEvent scanTranslationResultEvent = new ScanTranslationResultEvent();
                    ScanTranslationResultEvent.C92560a aVar2 = scanTranslationResultEvent.f265089d;
                    aVar2.f265090a = scanTranslationEvent.f265085d.f265087b;
                    aVar2.f265092c = true;
                    aVar2.f265093d = str;
                    aVar2.f265094e = jo.field_fromLang;
                    aVar2.f265095f = jo.field_toLang;
                    scanTranslationResultEvent.publish();
                    hashMap.remove(Integer.valueOf(scanTranslationEvent.f265085d.f265087b));
                    return true;
                }
                Log.m105928w("ScanTranslationListener", "can not find old translation result!");
            }
            OCRTranslateReportStruct oCRTranslateReportStruct = new OCRTranslateReportStruct();
            oCRTranslateReportStruct.f343788d = (long) C94457b.m119485a(scanTranslationEvent.f265085d.f265086a);
            hashMap2.put(Integer.valueOf(scanTranslationEvent.f265085d.f265087b), oCRTranslateReportStruct);
            C115671l1 l1Var = new C115671l1();
            String str2 = scanTranslationEvent.f265085d.f265088c;
            l1Var.f347007a = str2;
            l1Var.f347008b = str2;
            int orientationInDegree = Exif.fromFile(str2).getOrientationInDegree();
            Log.m105925i("ScanTranslationListener", "original img degree %s", Integer.valueOf(orientationInDegree));
            String str3 = scanTranslationEvent.f265085d.f265088c;
            String c = C118679t.m167368c(str3);
            if (!(orientationInDegree == 0 || (decodeFile = BitmapUtil.decodeFile(scanTranslationEvent.f265085d.f265088c, new BitmapFactory.Options())) == null)) {
                Bitmap rotate = BitmapUtil.rotate(decodeFile, (float) orientationInDegree);
                str3 = ((C115670k) C86312j.m106911c(C115670k.class)).mo57347wM("jpg");
                BitmapUtil.saveBitmapToImage(rotate, 80, Bitmap.CompressFormat.JPEG, str3, false);
                l1Var.f347008b = str3;
            }
            hashMap.put(Integer.valueOf(scanTranslationEvent.f265085d.f265087b), l1Var);
            long currentTimeMillis = System.currentTimeMillis();
            hashMap3.put(Integer.valueOf(scanTranslationEvent.f265085d.f265087b), Long.valueOf(currentTimeMillis));
            String str4 = str3;
            C118679t.m167367a(c, str4, 2, new C117358l(this, c, oCRTranslateReportStruct, currentTimeMillis, scanTranslationEvent, str4, hashMap2, hashMap3));
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("ScanTranslationListener", e, "", new Object[0]);
            ((C115674p) C86312j.m106911c(cls)).Dx0(scanTranslationEvent.f265085d.f265087b);
        }
    }
}
