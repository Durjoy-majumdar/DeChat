package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.aggregation.HoneyCombVectorOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.aggregation.SquareVectorOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.C113648ea;
import com.tencent.mapsdk.internal.C113667ef;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.rh */
public final class C114143rh implements C114153rk {
    /* renamed from: b */
    private static C113648ea m159316b(byte[] bArr) {
        return (C113648ea) JsonUtils.parseToModel(new String(bArr), C113648ea.class, new Object[0]);
    }

    /* renamed from: a */
    public final BaseOverlayProvider mo172776a(C113667ef efVar) {
        AggregationOverlayProvider aggregationOverlayProvider;
        C113667ef.C113676c.C113681d dVar;
        if (!(efVar instanceof C113648ea) || !efVar.mo171988c()) {
            return null;
        }
        C113648ea eaVar = (C113648ea) efVar;
        if (eaVar.f340048a.f340049a.f340050a.f340057a.f340063a.f340060c.equals("hexagon")) {
            aggregationOverlayProvider = new HoneyCombVectorOverlayProvider();
        } else {
            aggregationOverlayProvider = eaVar.f340048a.f340049a.f340050a.f340057a.f340063a.f340060c.equals("grid") ? new SquareVectorOverlayProvider() : null;
        }
        if (aggregationOverlayProvider == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C113667ef.C113668a.C113669a.C113670a next : eaVar.f340048a.f340095c.f340097b) {
            if (next instanceof C113667ef.C113668a.C113669a.C113674e) {
                arrayList.addAll(((C113667ef.C113668a.C113669a.C113674e) next).f340111c);
            }
        }
        AggregationOverlayProvider nodes = aggregationOverlayProvider.nodes((WeightedLatLng[]) arrayList.toArray(new WeightedLatLng[0]));
        int size = eaVar.f340048a.f340049a.f340050a.f340057a.f340063a.f340061d.f340127b.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = eaVar.f340048a.f340049a.f340050a.f340057a.f340063a.f340061d.f340127b.get(i).intValue();
        }
        double[] dArr = new double[eaVar.f340048a.f340049a.f340050a.f340057a.f340063a.f340061d.f340126a.size()];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = eaVar.f340048a.f340049a.f340050a.f340057a.f340063a.f340061d.f340126a.get(i2).doubleValue();
        }
        nodes.colors(iArr, dArr);
        nodes.size((float) eaVar.f340048a.f340049a.f340050a.f340057a.f340063a.f340059b);
        nodes.gap((float) eaVar.f340048a.f340049a.f340050a.f340057a.f340063a.f340058a);
        nodes.setHeightRange(eaVar.f340048a.f340049a.f340051b.f340055d.get(0).doubleValue(), eaVar.f340048a.f340049a.f340051b.f340055d.get(1).doubleValue());
        C113648ea.C113649a.C113650a.C113651a aVar = eaVar.f340048a.f340049a.f340051b;
        nodes.setIntensityRange(aVar.f340053b, aVar.f340052a);
        C113648ea.C113649a.C113650a.C113651a aVar2 = eaVar.f340048a.f340049a.f340051b;
        nodes.zoomRange(aVar2.f340121k, aVar2.f340120j);
        nodes.zIndex(eaVar.f340048a.f340049a.f340051b.f340117g);
        nodes.displayLevel(eaVar.f340048a.f340049a.f340051b.f340116f);
        nodes.enable3D(eaVar.f340048a.f340049a.f340051b.f340054c);
        nodes.opacity((float) eaVar.f340048a.f340049a.f340051b.f340119i);
        nodes.visibility(!eaVar.f340048a.f340049a.f340051b.f340118h);
        C113648ea.C113649a.C113650a aVar3 = eaVar.f340048a.f340049a;
        if (!aVar3.f340051b.f340056e || (dVar = aVar3.f340050a.f340057a.f340063a.f340062e) == null) {
            nodes.setAnimateDuration(0);
        } else {
            nodes.setAnimateDuration((int) (dVar.f340125c * 1000.0d));
        }
        return nodes;
    }

    /* renamed from: a */
    public final C113667ef mo172777a(C113667ef efVar, String str) {
        return efVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C113667ef mo172778a(byte[] bArr) {
        return (C113648ea) JsonUtils.parseToModel(new String(bArr), C113648ea.class, new Object[0]);
    }
}
