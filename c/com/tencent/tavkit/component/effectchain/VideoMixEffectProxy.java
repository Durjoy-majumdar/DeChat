package com.tencent.tavkit.component.effectchain;

import android.text.TextUtils;
import com.tencent.tavkit.ciimage.CIImage;
import com.tencent.tavkit.composition.video.ImageCollection;
import com.tencent.tavkit.composition.video.RenderInfo;
import com.tencent.tavkit.composition.video.TAVVideoMixEffect;
import com.tencent.tavkit.report.FilterChainReportSession;
import com.tencent.tavkit.report.IReportable;
import com.tencent.tavkit.report.MemoryReportHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class VideoMixEffectProxy implements TAVVideoMixEffect {
    private boolean autoCheckEffectRemove = true;
    private CopyOnWriteArrayList<TAVVideoMixEffect> effects = new CopyOnWriteArrayList<>();
    private final List<FilterProxy> filterProxies = new ArrayList();

    public static class FilterProxy implements TAVVideoMixEffect.Filter, IReportable {
        private final HashMap<String, TAVVideoMixEffect.Filter> filterMap;
        private boolean onEffectRemove;
        private final FilterChainReportSession reportSession;

        private FilterProxy() {
            this.filterMap = new HashMap<>();
            this.reportSession = new FilterChainReportSession();
        }

        private void checkRuntimeRelease(List<TAVVideoMixEffect> list) {
            if (this.onEffectRemove) {
                this.onEffectRemove = false;
                ArrayList arrayList = new ArrayList();
                for (TAVVideoMixEffect next : list) {
                    if (!TextUtils.isEmpty(next.effectId())) {
                        arrayList.add(next.effectId());
                    }
                }
                Iterator it = new HashSet(this.filterMap.keySet()).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!arrayList.contains(str)) {
                        this.filterMap.get(str).release();
                        this.filterMap.remove(str);
                    }
                }
            }
        }

        private TAVVideoMixEffect.Filter getCacheFilter(TAVVideoMixEffect tAVVideoMixEffect) {
            if (tAVVideoMixEffect == null || TextUtils.isEmpty(tAVVideoMixEffect.effectId())) {
                return null;
            }
            String effectId = tAVVideoMixEffect.effectId();
            if (this.filterMap.containsKey(effectId)) {
                return this.filterMap.get(effectId);
            }
            TAVVideoMixEffect.Filter createFilter = tAVVideoMixEffect.createFilter();
            this.filterMap.put(effectId, createFilter);
            return createFilter;
        }

        /* access modifiers changed from: private */
        public void notifyOnEffectRemove() {
            this.onEffectRemove = true;
        }

        public CIImage apply(TAVVideoMixEffect tAVVideoMixEffect, ImageCollection imageCollection, RenderInfo renderInfo) {
            if (!(tAVVideoMixEffect instanceof VideoMixEffectProxy)) {
                return null;
            }
            VideoMixEffectProxy videoMixEffectProxy = (VideoMixEffectProxy) tAVVideoMixEffect;
            List<TAVVideoMixEffect> effects = videoMixEffectProxy.getEffects();
            if (videoMixEffectProxy.isAutoCheckEffectRemove() || this.onEffectRemove) {
                checkRuntimeRelease(effects);
            }
            CIImage cIImage = null;
            for (TAVVideoMixEffect next : effects) {
                TAVVideoMixEffect.Filter cacheFilter = getCacheFilter(next);
                if (cacheFilter != null) {
                    long nanoTime = System.nanoTime();
                    String reportKey = cacheFilter instanceof IReportable ? ((IReportable) cacheFilter).getReportKey() : null;
                    CIImage apply = cacheFilter.apply(next, imageCollection, renderInfo);
                    if (!TextUtils.isEmpty(reportKey)) {
                        this.reportSession.tick(reportKey, System.nanoTime() - nanoTime);
                    }
                    cIImage = apply;
                }
            }
            return cIImage;
        }

        public String getReportKey() {
            return MemoryReportHelper.appendReportKey(this.filterMap.values());
        }

        public synchronized void release() {
            for (TAVVideoMixEffect.Filter release : this.filterMap.values()) {
                release.release();
            }
            this.filterMap.clear();
            this.reportSession.commit();
        }
    }

    public TAVVideoMixEffect.Filter createFilter() {
        FilterProxy filterProxy = new FilterProxy();
        this.filterProxies.add(filterProxy);
        return filterProxy;
    }

    public String effectId() {
        return "VideoMixEffectProxy" + Integer.toHexString(hashCode());
    }

    public List<TAVVideoMixEffect> getEffects() {
        return this.effects;
    }

    public boolean isAutoCheckEffectRemove() {
        return this.autoCheckEffectRemove;
    }

    public void notifyOnEffectRemove() {
        for (FilterProxy access$000 : this.filterProxies) {
            access$000.notifyOnEffectRemove();
        }
    }

    public void setAutoCheckEffectRemove(boolean z) {
        this.autoCheckEffectRemove = z;
    }

    public void setEffects(CopyOnWriteArrayList<TAVVideoMixEffect> copyOnWriteArrayList) {
        this.effects = copyOnWriteArrayList;
    }
}
