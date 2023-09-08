package ar2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ar2.a */
public class C54325a {

    /* renamed from: a */
    public String f152459a;

    /* renamed from: b */
    public String f152460b;

    /* renamed from: c */
    public ArrayList<String> f152461c = new ArrayList<>();

    /* renamed from: a */
    public static C54325a m61036a(Map<String, String> map, String str) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionLabeInfo");
        String str3 = map.get(str + ".title");
        if (TextUtils.isEmpty(str3)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionLabeInfo");
            return null;
        }
        C54325a aVar = new C54325a();
        aVar.f152459a = str3;
        Util.safeParseInt(map.get(str + ".interactionType"));
        String nullAsNil = Util.nullAsNil(map.get(str + ".themeColor"));
        String nullAsNil2 = Util.nullAsNil(map.get(str + ".themeColorAlpha"));
        int i = 0;
        if (!TextUtils.isEmpty(nullAsNil) && !TextUtils.isEmpty(nullAsNil2)) {
            nullAsNil = String.format("#%02x%s", new Object[]{Integer.valueOf((int) (Util.safeParseDouble(nullAsNil2) * 255.0d)), nullAsNil.substring(1)});
        }
        aVar.f152460b = nullAsNil;
        String str4 = str + ".rollingLabels.item";
        while (true) {
            if (i != 0) {
                str2 = str4 + i;
            } else {
                str2 = str4;
            }
            String nullAsNil3 = Util.nullAsNil(map.get(str2));
            if (TextUtils.isEmpty(nullAsNil3)) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionLabeInfo");
                return aVar;
            }
            aVar.f152461c.add(nullAsNil3);
            i++;
        }
    }
}
