package el2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.plugin.scanner.C115674p;
import com.tencent.p014mm.plugin.scanner.model.C115671l1;
import com.tencent.p014mm.plugin.scanner.model.C115672t;
import com.tencent.p014mm.plugin.scanner.p$$b;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.LinkedList;
import java.util.List;
import ob0.C117747y;
import ob0.C35142u;
import te3.C118462r33;
import te3.bk4;
import vl2.C118684u;

/* renamed from: el2.f */
public class C116779f implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C115674p pVar = (C115674p) C86312j.m106911c(C115674p.class);
        pVar.getClass();
        Log.m105925i("MicroMsg.PluginScanTranslation", "onSceneEnd errType %d, errCode %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (yVar.getType() == 294) {
            C115672t tVar = (C115672t) yVar;
            int i3 = tVar.f347016h;
            if (i == 0 && i2 == 0) {
                Log.m105925i("MicroMsg.PluginScanTranslation", "TranslationSpr useNewCgi: %d newOcrmt: %s", 1, String.valueOf(tVar.f347019n));
                if (tVar.f347019n) {
                    pVar.f347035r = pVar.Ex0(i3, tVar, pVar.f347034q);
                    return;
                }
                List<bk4> list = tVar.f347015g;
                if (list != null) {
                    LinkedList linkedList = (LinkedList) list;
                    Log.m105925i("MicroMsg.PluginScanTranslation", "session %d, angle %f, translationInfos length %d", Integer.valueOf(i3), Float.valueOf(tVar.mo175931j1()), Integer.valueOf(linkedList.size()));
                    if (pVar.f347032o.containsKey(Integer.valueOf(i3))) {
                        pVar.f347032o.get(Integer.valueOf(i3)).f343792h = System.currentTimeMillis() - tVar.f347017i;
                    }
                    if (linkedList.size() <= 0 || !pVar.f347031n.containsKey(Integer.valueOf(i3))) {
                        if (pVar.f347032o.containsKey(Integer.valueOf(i3)) && pVar.f347033p.containsKey(Integer.valueOf(i3))) {
                            pVar.f347032o.get(Integer.valueOf(i3)).f343793i = System.currentTimeMillis() - pVar.f347033p.get(Integer.valueOf(i3)).longValue();
                        }
                        pVar.Dx0(i3);
                        return;
                    }
                    C115671l1 l1Var = pVar.f347031n.get(Integer.valueOf(i3));
                    l1Var.f347009c = tVar.f347019n ? tVar.f347024s : ((C118462r33) tVar.f347013e.f127056b.f127083a).f354302h;
                    l1Var.f347010d = tVar.mo175932k1();
                    l1Var.f347011e = tVar.f347019n ? tVar.f347026u : ((C118462r33) tVar.f347013e.f127056b.f127083a).f354304j;
                    if (pVar.f347032o.containsKey(Integer.valueOf(i3))) {
                        pVar.f347032o.get(Integer.valueOf(i3)).f343790f = 1;
                    }
                    C118684u Bx0 = pVar.Bx0();
                    float j1 = tVar.mo175931j1();
                    String str2 = l1Var.f347008b;
                    C118684u.C118686b bVar = pVar.f347034q;
                    Bx0.getClass();
                    if (i3 != 0 && linkedList.size() > 0 && bVar != null) {
                        Bitmap decodeFile = BitmapUtil.decodeFile(str2, new BitmapFactory.Options());
                        if (decodeFile == null) {
                            ((p$$b) bVar).mo175938W6(i3, (Bitmap) null);
                            return;
                        }
                        if (!(Bx0.f355144a == 0 || i3 == Bx0.f355144a)) {
                            Log.m105925i("MicroMsg.ScanTranslationRender", "stop current session %d, start new session %d", Integer.valueOf(Bx0.f355144a), Integer.valueOf(i3));
                            Bx0.f355144a = 0;
                            Bx0.f355145b = null;
                        }
                        Bx0.f355144a = i3;
                        Bx0.f355145b = bVar;
                        new C118684u.C118685a(i3, list, j1, decodeFile).mo119143f(new Void[0]);
                        return;
                    }
                    return;
                }
                return;
            }
            if (pVar.f347032o.containsKey(Integer.valueOf(i3)) && pVar.f347033p.containsKey(Integer.valueOf(i3))) {
                pVar.f347032o.get(Integer.valueOf(i3)).f343793i = System.currentTimeMillis() - pVar.f347033p.get(Integer.valueOf(i3)).longValue();
                pVar.f347032o.get(Integer.valueOf(i3)).f343790f = 5;
                pVar.f347032o.get(Integer.valueOf(i3)).mo86054n();
                pVar.f347032o.remove(Integer.valueOf(i3));
                pVar.f347033p.remove(Integer.valueOf(i3));
                Log.m105925i("MicroMsg.PluginScanTranslation", "translationReports size %d, translationUpload size %d", Integer.valueOf(pVar.f347032o.size()), Integer.valueOf(pVar.f347033p.size()));
            }
            pVar.Dx0(i3);
        }
    }
}
