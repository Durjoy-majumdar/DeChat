package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.C113667ef;
import com.tencent.mapsdk.internal.C113691eh;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.rm */
public final class C114155rm implements C114153rk {
    /* renamed from: a */
    public final C113667ef mo172777a(C113667ef efVar, String str) {
        return efVar;
    }

    /* renamed from: a */
    public final C113667ef mo172778a(byte[] bArr) {
        return (C113667ef) JsonUtils.parseToModel(new String(bArr), C113691eh.class, new Object[0]);
    }

    /* renamed from: a */
    public final BaseOverlayProvider mo172776a(C113667ef efVar) {
        C113667ef.C113676c.C113681d dVar;
        if (!(efVar instanceof C113691eh) || !efVar.mo171988c()) {
            return null;
        }
        C113691eh ehVar = (C113691eh) efVar;
        GradientVectorOverlayProvider gradientVectorOverlayProvider = new GradientVectorOverlayProvider();
        ArrayList arrayList = new ArrayList();
        for (C113667ef.C113668a.C113669a.C113670a next : ehVar.f340143a.f340095c.f340097b) {
            if (next instanceof C113667ef.C113668a.C113669a.C113674e) {
                arrayList.addAll(((C113667ef.C113668a.C113669a.C113674e) next).f340111c);
            }
        }
        gradientVectorOverlayProvider.weightedData(arrayList);
        int size = ehVar.f340143a.f340144a.f340145a.f340152a.f340156a.f340154b.f340127b.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ehVar.f340143a.f340144a.f340145a.f340152a.f340156a.f340154b.f340127b.get(i).intValue();
        }
        float[] fArr = new float[ehVar.f340143a.f340144a.f340145a.f340152a.f340156a.f340154b.f340126a.size()];
        for (int i2 = 0; i2 < size; i2++) {
            fArr[i2] = ehVar.f340143a.f340144a.f340145a.f340152a.f340156a.f340154b.f340126a.get(i2).floatValue();
        }
        gradientVectorOverlayProvider.gradient(iArr, fArr);
        gradientVectorOverlayProvider.radius(ehVar.f340143a.f340144a.f340145a.f340152a.f340156a.f340153a);
        gradientVectorOverlayProvider.setMaxHeight(ehVar.f340143a.f340144a.f340146b.f340150d.get(1).floatValue());
        C113691eh.C113692a.C113693a.C113694a aVar = ehVar.f340143a.f340144a.f340146b;
        gradientVectorOverlayProvider.setIntensityRange((float) aVar.f340148b, (float) aVar.f340147a);
        C113691eh.C113692a.C113693a.C113694a aVar2 = ehVar.f340143a.f340144a.f340146b;
        gradientVectorOverlayProvider.zoomRange(aVar2.f340121k, aVar2.f340120j);
        gradientVectorOverlayProvider.zIndex(ehVar.f340143a.f340144a.f340146b.f340117g);
        gradientVectorOverlayProvider.displayLevel(ehVar.f340143a.f340144a.f340146b.f340116f);
        gradientVectorOverlayProvider.enable3D(ehVar.f340143a.f340144a.f340146b.f340149c);
        gradientVectorOverlayProvider.opacity((float) ehVar.f340143a.f340144a.f340146b.f340119i);
        gradientVectorOverlayProvider.visibility(!ehVar.f340143a.f340144a.f340146b.f340118h);
        C113691eh.C113692a.C113693a aVar3 = ehVar.f340143a.f340144a;
        if (!aVar3.f340146b.f340151e || (dVar = aVar3.f340145a.f340152a.f340156a.f340155c) == null) {
            gradientVectorOverlayProvider.setAnimateDuration(0);
        } else {
            gradientVectorOverlayProvider.setAnimateDuration((int) (dVar.f340125c * 1000.0d));
        }
        return gradientVectorOverlayProvider;
    }
}
