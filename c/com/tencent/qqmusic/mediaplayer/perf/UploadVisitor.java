package com.tencent.qqmusic.mediaplayer.perf;

import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UploadVisitor implements PerformanceTracer.Visitor, Collectable {
    private HashMap<String, Long> prefInfos = new HashMap<>();

    public void accept(ErrorUploadCollector errorUploadCollector) {
    }

    public void accept(PlayerInfoCollector playerInfoCollector) {
        if (!this.prefInfos.entrySet().isEmpty()) {
            for (Map.Entry next : this.prefInfos.entrySet()) {
                playerInfoCollector.putLong((String) next.getKey(), ((Long) next.getValue()).longValue());
            }
        }
    }

    public void visitSpeedCheck(List<PerformanceTracer.SpeedCheck> list, PerformanceTracer.OverallInfo overallInfo) {
        for (PerformanceTracer.SpeedCheck next : list) {
            HashMap<String, Long> hashMap = this.prefInfos;
            hashMap.put(next.getName() + ".ms", Long.valueOf(next.getTotalTimeMs()));
            HashMap<String, Long> hashMap2 = this.prefInfos;
            hashMap2.put(next.getName() + ".bytes", Long.valueOf(next.getTotalBufferLength()));
        }
    }
}
