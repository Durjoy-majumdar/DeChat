package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng;
import com.tencent.map.sdk.utilities.visualization.p1182od.ArcLineOverlayProvider;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.C113655eb;
import com.tencent.mapsdk.internal.C113667ef;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.ri */
public final class C114144ri implements C114153rk {
    /* renamed from: a */
    public final C113667ef mo172777a(C113667ef efVar, String str) {
        return efVar;
    }

    /* renamed from: a */
    public final C113667ef mo172778a(byte[] bArr) {
        return (C113667ef) JsonUtils.parseToModel(new String(bArr), C113655eb.class, new Object[0]);
    }

    /* renamed from: a */
    public final BaseOverlayProvider mo172776a(C113667ef efVar) {
        if (!(efVar instanceof C113655eb) || !efVar.mo171988c()) {
            return null;
        }
        C113655eb ebVar = (C113655eb) efVar;
        ArcLineOverlayProvider arcLineOverlayProvider = new ArcLineOverlayProvider();
        if (ebVar.f340064a.f340095c.f340097b != null) {
            ArrayList arrayList = new ArrayList();
            for (C113667ef.C113668a.C113669a.C113670a next : ebVar.f340064a.f340095c.f340097b) {
                if (next instanceof C113667ef.C113668a.C113669a.C113671b) {
                    C113667ef.C113668a.C113669a.C113671b bVar = (C113667ef.C113668a.C113669a.C113671b) next;
                    arrayList.add(new FromToLatLng(bVar.f340100c.get(0), bVar.f340100c.get(1)));
                }
            }
            arcLineOverlayProvider.data(arrayList);
        }
        C113667ef.C113676c.C113682e eVar = ebVar.f340064a.f340065a.f340066a.f340074a.f340081a.f340077c;
        if (eVar != null) {
            int size = eVar.f340127b.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = ebVar.f340064a.f340065a.f340066a.f340074a.f340081a.f340077c.f340127b.get(i).intValue();
            }
            arcLineOverlayProvider.gradient(iArr);
        }
        arcLineOverlayProvider.width((float) ebVar.f340064a.f340065a.f340066a.f340074a.f340081a.f340075a);
        arcLineOverlayProvider.radian((float) (ebVar.f340064a.f340065a.f340066a.f340074a.f340081a.f340076b * 90.0d));
        C113655eb.C113656a.C113657a.C113658a aVar = ebVar.f340064a.f340065a.f340067b;
        arcLineOverlayProvider.zoomRange(aVar.f340121k, aVar.f340120j);
        arcLineOverlayProvider.zIndex(ebVar.f340064a.f340065a.f340067b.f340117g);
        arcLineOverlayProvider.displayLevel(ebVar.f340064a.f340065a.f340067b.f340116f);
        arcLineOverlayProvider.enable3D(ebVar.f340064a.f340065a.f340067b.f340068a);
        arcLineOverlayProvider.opacity((float) ebVar.f340064a.f340065a.f340067b.f340119i);
        arcLineOverlayProvider.visibility(!ebVar.f340064a.f340065a.f340067b.f340118h);
        C113655eb.C113656a.C113657a.C113658a aVar2 = ebVar.f340064a.f340065a.f340067b;
        if (aVar2.f340069b) {
            arcLineOverlayProvider.setAnimateDuration((int) (aVar2.f340070c.f340073c * 1000.0d));
            arcLineOverlayProvider.setHighlightDuration((int) (ebVar.f340064a.f340065a.f340067b.f340070c.f340071a * 1000.0d));
            arcLineOverlayProvider.animateColor(ebVar.f340064a.f340065a.f340067b.f340070c.f340072b);
        } else {
            arcLineOverlayProvider.setAnimateDuration(0);
        }
        return arcLineOverlayProvider;
    }
}
