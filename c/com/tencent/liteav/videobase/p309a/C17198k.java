package com.tencent.liteav.videobase.p309a;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import java.lang.reflect.Array;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.liteav.videobase.a.k */
public abstract class C17198k extends C17189b {

    /* renamed from: a */
    public final C17199a f46464a;

    /* renamed from: b */
    private final FloatBuffer f46465b = OpenGlUtils.createNormalCubeVerticesBuffer();

    /* renamed from: c */
    private final FloatBuffer f46466c = OpenGlUtils.createTextureCoordsBuffer(Rotation.NORMAL, false, false);

    /* renamed from: d */
    private final List<C17199a> f46467d;

    /* renamed from: e */
    private final Map<C17199a, Integer> f46468e = new HashMap();

    /* renamed from: f */
    private C17199a f46469f;

    /* renamed from: g */
    private int[] f46470g;

    /* renamed from: h */
    private int f46471h;

    /* renamed from: i */
    private C17222d f46472i;

    /* renamed from: j */
    private FloatBuffer f46473j;

    /* renamed from: k */
    private FloatBuffer f46474k;

    /* renamed from: com.tencent.liteav.videobase.a.k$a */
    public static class C17199a {

        /* renamed from: a */
        public final C17189b f46475a;

        /* renamed from: b */
        public final Map<String, C17199a> f46476b;

        /* renamed from: c */
        public C17222d f46477c;

        /* renamed from: d */
        public int f46478d;

        public /* synthetic */ C17199a(C17189b bVar, byte b) {
            this(bVar);
        }

        /* renamed from: a */
        public final void mo20136a(C17199a aVar) {
            aVar.f46478d++;
            this.f46476b.put("input-texture-name-for-on-draw", aVar);
        }

        private C17199a(C17189b bVar) {
            this.f46476b = new HashMap();
            this.f46477c = null;
            this.f46478d = 0;
            this.f46475a = bVar;
        }

        /* renamed from: a */
        public final void mo20137a(String str, C17199a aVar) {
            aVar.f46478d++;
            this.f46476b.put(str, aVar);
        }
    }

    public C17198k() {
        ArrayList arrayList = new ArrayList();
        this.f46467d = arrayList;
        C17199a aVar = new C17199a((C17189b) null, (byte) 0);
        this.f46464a = aVar;
        arrayList.add(aVar);
    }

    /* renamed from: a */
    public final C17199a mo20135a(C17189b bVar) {
        C17199a aVar = new C17199a(bVar, (byte) 0);
        this.f46467d.add(aVar);
        return aVar;
    }

    public void onDraw(int i, C17222d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (isInitialized()) {
            runPendingOnDrawTasks();
            this.f46471h = i;
            this.f46472i = dVar;
            this.f46473j = floatBuffer;
            this.f46474k = floatBuffer2;
            Arrays.fill(this.f46470g, 0);
            m17037a(this.f46469f);
            Iterator<C17199a> it = this.f46467d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onInit(C17223e eVar) {
        super.onInit(eVar);
        for (C17199a aVar : this.f46467d) {
            C17189b bVar = aVar.f46475a;
            if (bVar != null) {
                bVar.initialize(eVar);
            }
        }
        for (int i = 0; i < this.f46467d.size(); i++) {
            this.f46468e.put(this.f46467d.get(i), Integer.valueOf(i));
        }
        int size = this.f46467d.size();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        int[] iArr = new int[2];
        iArr[1] = size;
        iArr[0] = size;
        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, iArr);
        for (int i3 = 0; i3 < this.f46467d.size(); i3++) {
            Arrays.fill(zArr[i3], false);
        }
        for (C17199a next : this.f46467d) {
            int intValue = this.f46468e.get(next).intValue();
            for (C17199a aVar2 : next.f46476b.values()) {
                zArr[this.f46468e.get(aVar2).intValue()][intValue] = true;
            }
        }
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        ArrayList arrayList2 = new ArrayList();
        while (arrayList.size() > 1) {
            Arrays.fill(iArr2, 0);
            Arrays.fill(iArr3, 0);
            arrayList2.clear();
            for (int i4 = 0; i4 < size; i4++) {
                for (int i5 = 0; i5 < size; i5++) {
                    if (zArr[i4][i5]) {
                        iArr3[i4] = iArr3[i4] + 1;
                        iArr2[i5] = iArr2[i5] + 1;
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (iArr2[intValue2] == 0 && iArr3[intValue2] != 0) {
                    arrayList2.add(Integer.valueOf(intValue2));
                }
            }
            if (arrayList2.isEmpty()) {
                break;
            }
            arrayList.removeAll(arrayList2);
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Arrays.fill(zArr[((Integer) it4.next()).intValue()], false);
            }
        }
        C17199a aVar3 = arrayList.size() == 1 ? this.f46467d.get(((Integer) arrayList.get(0)).intValue()) : null;
        this.f46469f = aVar3;
        if (aVar3 != null) {
            this.f46470g = new int[this.f46467d.size()];
            return;
        }
        throw new RuntimeException("Directed acyclic graph can't find a final node.");
    }

    public void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        for (C17199a aVar : this.f46467d) {
            C17189b bVar = aVar.f46475a;
            if (bVar != null) {
                bVar.onOutputSizeChanged(i, i2);
            }
        }
    }

    public void onUninit() {
        super.onUninit();
        for (C17199a aVar : this.f46467d) {
            C17189b bVar = aVar.f46475a;
            if (bVar != null) {
                bVar.uninitialize();
            }
        }
    }

    /* renamed from: a */
    private void m17037a(C17199a aVar) {
        for (C17199a next : aVar.f46476b.values()) {
            if (next != this.f46464a && next.f46477c == null) {
                m17037a(next);
            }
        }
        C17189b bVar = aVar.f46475a;
        if (bVar instanceof C17197j) {
            C17197j jVar = (C17197j) bVar;
            for (Map.Entry next2 : aVar.f46476b.entrySet()) {
                if (!"input-texture-name-for-on-draw".equals(next2.getKey())) {
                    if (next2.getValue() == this.f46464a) {
                        jVar.mo20134a((String) next2.getKey(), this.f46471h);
                    } else {
                        jVar.mo20134a((String) next2.getKey(), ((C17199a) next2.getValue()).f46477c.mo20195a());
                    }
                }
            }
        }
        C17222d dVar = this.f46472i;
        C104507p pVar = this.mOutputSize;
        int i = pVar.f309736a;
        int i2 = pVar.f309737b;
        if (aVar != this.f46469f) {
            i = aVar.f46475a.getOutputSize().f309736a;
            i2 = aVar.f46475a.getOutputSize().f309737b;
            dVar = this.mTexturePool.mo20199a(i, i2);
            aVar.f46477c = dVar;
        }
        C17199a aVar2 = aVar.f46476b.get("input-texture-name-for-on-draw");
        GLES20.glViewport(0, 0, i, i2);
        if (aVar2 == this.f46464a) {
            aVar.f46475a.onDraw(this.f46471h, dVar, this.f46473j, this.f46474k);
        } else {
            aVar.f46475a.onDraw(aVar2.f46477c.mo20195a(), dVar, this.f46465b, this.f46466c);
        }
        for (C17199a next3 : aVar.f46476b.values()) {
            int intValue = this.f46468e.get(next3).intValue();
            int[] iArr = this.f46470g;
            int i3 = iArr[intValue] + 1;
            iArr[intValue] = i3;
            C17222d dVar2 = next3.f46477c;
            if (dVar2 != null && i3 == next3.f46478d) {
                dVar2.release();
                next3.f46477c = null;
            }
        }
    }
}
