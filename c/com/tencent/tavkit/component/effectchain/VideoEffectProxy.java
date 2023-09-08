package com.tencent.tavkit.component.effectchain;

import android.text.TextUtils;
import com.tencent.tavkit.ciimage.CIImage;
import com.tencent.tavkit.composition.video.RenderInfo;
import com.tencent.tavkit.composition.video.TAVVideoEffect;
import com.tencent.tavkit.report.FilterChainReportSession;
import com.tencent.tavkit.report.IReportable;
import com.tencent.tavkit.report.MemoryReportHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class VideoEffectProxy implements TAVVideoEffect {
    private boolean autoCheckEffectRemove = true;
    private CopyOnWriteArrayList<TAVVideoEffect> effects = new CopyOnWriteArrayList<>();
    private final List<FilterProxy> filterProxies = new ArrayList();

    public static class FilterProxy implements TAVVideoEffect.Filter, IReportable {
        private final HashMap<String, TAVVideoEffect.Filter> filterMap;
        private boolean onEffectRemove;
        private final FilterChainReportSession reportSession;

        private FilterProxy() {
            this.filterMap = new HashMap<>();
            this.reportSession = new FilterChainReportSession();
        }

        private void checkRuntimeRelease(List<TAVVideoEffect> list) {
            this.onEffectRemove = false;
            ArrayList arrayList = new ArrayList();
            for (TAVVideoEffect next : list) {
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

        private TAVVideoEffect.Filter getCacheFilter(TAVVideoEffect tAVVideoEffect) {
            if (tAVVideoEffect == null || TextUtils.isEmpty(tAVVideoEffect.effectId())) {
                return null;
            }
            String effectId = tAVVideoEffect.effectId();
            if (this.filterMap.containsKey(effectId)) {
                return this.filterMap.get(effectId);
            }
            TAVVideoEffect.Filter createFilter = tAVVideoEffect.createFilter();
            this.filterMap.put(effectId, createFilter);
            return createFilter;
        }

        public CIImage apply(TAVVideoEffect tAVVideoEffect, CIImage cIImage, RenderInfo renderInfo) {
            if (!(tAVVideoEffect instanceof VideoEffectProxy)) {
                return cIImage;
            }
            VideoEffectProxy videoEffectProxy = (VideoEffectProxy) tAVVideoEffect;
            List<TAVVideoEffect> effects = videoEffectProxy.getEffects();
            if (videoEffectProxy.isAutoCheckEffectRemove() || this.onEffectRemove) {
                checkRuntimeRelease(effects);
            }
            for (TAVVideoEffect next : effects) {
                TAVVideoEffect.Filter cacheFilter = getCacheFilter(next);
                if (cacheFilter != null) {
                    String str = null;
                    long nanoTime = System.nanoTime();
                    if (cacheFilter instanceof IReportable) {
                        str = ((IReportable) cacheFilter).getReportKey();
                    }
                    cIImage = cacheFilter.apply(next, cIImage, renderInfo);
                    if (!TextUtils.isEmpty(str)) {
                        this.reportSession.tick(str, System.nanoTime() - nanoTime);
                    }
                }
            }
            return cIImage;
        }

        public String getReportKey() {
            return MemoryReportHelper.appendReportKey(this.filterMap.values());
        }

        public void notifyOnEffectRemove() {
            this.onEffectRemove = true;
        }

        public synchronized void release() {
            for (TAVVideoEffect.Filter release : this.filterMap.values()) {
                release.release();
            }
            this.filterMap.clear();
            this.reportSession.commit();
        }
    }

    public TAVVideoEffect.Filter createFilter() {
        FilterProxy filterProxy = new FilterProxy();
        this.filterProxies.add(filterProxy);
        return filterProxy;
    }

    public String effectId() {
        return "VideoEffectProxy" + Integer.toHexString(hashCode());
    }

    public synchronized List<TAVVideoEffect> getEffects() {
        return this.effects;
    }

    public boolean isAutoCheckEffectRemove() {
        return this.autoCheckEffectRemove;
    }

    public void notifyOnEffectRemove() {
        for (FilterProxy notifyOnEffectRemove : this.filterProxies) {
            notifyOnEffectRemove.notifyOnEffectRemove();
        }
    }

    public void setAutoCheckEffectRemove(boolean z) {
        this.autoCheckEffectRemove = z;
    }

    public synchronized void setEffects(CopyOnWriteArrayList<TAVVideoEffect> copyOnWriteArrayList) {
        this.effects = copyOnWriteArrayList;
    }
}
