package com.tencent.liteav.videobase.p309a;

import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.liteav.videobase.a.h */
public class C17195h extends C17189b {
    private static final String TAG = "TXCGPUImageFilterChain";
    private final List<C17189b> mFilters = new ArrayList();
    private final Map<C17189b, List<C17188a>> mInterceptorsBeforeFilter = new HashMap();
    private final List<C17188a> mLastInterceptors = new ArrayList();
    private final FloatBuffer mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
    private final FloatBuffer mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(Rotation.NORMAL, false, false);
    private long mTimestamp = 0;

    private C17222d doIntercept(List<C17188a> list, C17222d dVar) {
        if (list == null || list.isEmpty()) {
            return dVar;
        }
        C17222d dVar2 = null;
        Iterator<C17188a> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C17222d a = it.next().mo20104a(this.mTimestamp, dVar2 == null ? dVar : dVar2);
            if (a == null) {
                LiteavLog.m16898e(TAG, "doIntercept return null value");
                break;
            }
            if (!(dVar2 == null || a == dVar2)) {
                dVar2.release();
            }
            dVar2 = a;
        }
        return dVar2;
    }

    private C17222d doLastIntercept(C17222d dVar) {
        if (this.mLastInterceptors.isEmpty()) {
            return dVar;
        }
        if (dVar != null) {
            return doIntercept(this.mLastInterceptors, dVar);
        }
        LiteavLog.m16898e(TAG, "last interceptors intecept on surface.");
        return null;
    }

    /* access modifiers changed from: private */
    public void initFiltersAndInterceptors() {
        for (C17189b next : this.mFilters) {
            if (!next.isInitialized()) {
                next.initialize(this.mTexturePool);
            }
        }
        for (List<C17188a> next2 : this.mInterceptorsBeforeFilter.values()) {
            if (next2 != null && !next2.isEmpty()) {
                for (C17188a aVar : next2) {
                    if (!aVar.f46450a) {
                        aVar.mo20106a(this.mTexturePool);
                    }
                }
            }
        }
        for (C17188a next3 : this.mLastInterceptors) {
            if (!next3.f46450a) {
                next3.mo20106a(this.mTexturePool);
            }
        }
    }

    private void initFiltersAndInterceptorsOnDraw() {
        runOnDraw(C17196i.m17035a(this));
    }

    public synchronized void addFilter(C17189b bVar) {
        if (bVar != null) {
            if (!this.mLastInterceptors.isEmpty()) {
                if (this.mFilters.size() == 0) {
                    this.mFilters.add(new C17189b());
                    LiteavLog.m16905w(TAG, "add COPY filter to filter chain.");
                }
                this.mInterceptorsBeforeFilter.put(bVar, new ArrayList(this.mLastInterceptors));
                this.mLastInterceptors.clear();
            }
            this.mFilters.add(bVar);
            initFiltersAndInterceptorsOnDraw();
        }
    }

    public synchronized void addInterceptor(C17188a aVar) {
        if (aVar != null) {
            this.mLastInterceptors.add(aVar);
            initFiltersAndInterceptorsOnDraw();
        }
    }

    public void onDraw(int i, C17222d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (isInitialized()) {
            runPendingOnDrawTasks();
            if (i != -1) {
                List<C17189b> list = this.mFilters;
                int size = list.size();
                C17222d dVar2 = null;
                int i2 = 0;
                while (i2 < size) {
                    C17189b bVar = list.get(i2);
                    C104507p outputSize = bVar.getOutputSize();
                    if (dVar2 != null) {
                        C17222d doIntercept = doIntercept(this.mInterceptorsBeforeFilter.get(bVar), dVar2);
                        if (!(doIntercept == null || doIntercept == dVar2)) {
                            dVar2.release();
                        }
                        dVar2 = doIntercept;
                    }
                    boolean z = i2 < size + -1;
                    if (!z || !outputSize.equals(this.mOutputSize) || !bVar.canBeSkipped()) {
                        C17222d a = z ? this.mTexturePool.mo20199a(outputSize.f309736a, outputSize.f309737b) : dVar;
                        OpenGlUtils.glViewport(0, 0, outputSize.f309736a, outputSize.f309737b);
                        int a2 = dVar2 == null ? i : dVar2.mo20195a();
                        if (i2 == 0) {
                            bVar.onDraw(a2, a, floatBuffer, floatBuffer2);
                        } else {
                            bVar.onDraw(a2, a, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
                        }
                        if (dVar2 != null) {
                            dVar2.release();
                        }
                        dVar2 = a;
                    } else {
                        bVar.onFilterBeenSkipped();
                    }
                    i2++;
                }
                if (!(dVar2 == null || dVar2 == dVar)) {
                    dVar2.release();
                }
                C17222d doLastIntercept = doLastIntercept(dVar);
                if (doLastIntercept != null && doLastIntercept != dVar) {
                    OpenGlUtils.glViewport(0, 0, doLastIntercept.mo20197b(), doLastIntercept.mo20198c());
                    super.onDraw(doLastIntercept.mo20195a(), dVar, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
                    doLastIntercept.release();
                }
            }
        }
    }

    public void onInit(C17223e eVar) {
        super.onInit(eVar);
        initFiltersAndInterceptors();
    }

    public void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        for (C17189b onOutputSizeChanged : this.mFilters) {
            onOutputSizeChanged.onOutputSizeChanged(i, i2);
        }
    }

    public void onUninit() {
        super.onUninit();
        for (C17189b uninitialize : this.mFilters) {
            uninitialize.uninitialize();
        }
        for (List<C17188a> next : this.mInterceptorsBeforeFilter.values()) {
            if (next != null && !next.isEmpty()) {
                for (C17188a a : next) {
                    a.mo20105a();
                }
            }
        }
        for (C17188a a2 : this.mLastInterceptors) {
            a2.mo20105a();
        }
    }

    public synchronized void removeAllFilterAndInterceptor() {
        this.mFilters.clear();
        this.mInterceptorsBeforeFilter.clear();
        this.mLastInterceptors.clear();
    }

    public void setTimestamp(long j) {
        this.mTimestamp = j;
    }
}
