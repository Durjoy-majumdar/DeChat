package a52;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import nj3.C76912y0;

/* renamed from: a52.b */
public final class C0013b<T extends C7594e> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "showToast";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108593f(optString, "data.optString(\"title\")");
        String optString2 = hVar.optString("icon", "");
        C87412m.m108593f(optString2, "data.optString(\"icon\", \"\")");
        if (optString.length() == 0) {
            mo120840p().invoke(mo120842g(1, "title can not empty!"));
        }
        Log.m105924i("MBJsApiShowToast", "title:" + optString + " icon:" + optString2);
        int hashCode = optString2.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != 3387192) {
                if (hashCode == 96784904 && optString2.equals("error")) {
                    C76912y0.m92767f(MMApplicationContext.getContext(), optString);
                    mo120840p().invoke(mo120844i());
                }
            } else if (optString2.equals("none")) {
                C76912y0.m92773l(MMApplicationContext.getContext(), optString);
                mo120840p().invoke(mo120844i());
            }
        } else if (optString2.equals("success")) {
            C76912y0.m92768g(MMApplicationContext.getContext(), optString);
            mo120840p().invoke(mo120844i());
        }
        C76912y0.m92773l(MMApplicationContext.getContext(), optString);
        mo120840p().invoke(mo120844i());
    }
}
