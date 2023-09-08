package com.tencent.qqmusic.mediaplayer.perf;

import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Reporters {
    public static PerformanceTracer.Visitor detail(final AudioInformation audioInformation, final Map<String, String> map) {
        return new PerformanceTracer.Visitor() {
            public void visitSpeedCheck(List<PerformanceTracer.SpeedCheck> list, PerformanceTracer.OverallInfo overallInfo) {
                long round = Math.round(((double) overallInfo.totalPcmToBePlayed) / ((double) overallInfo.timeCostInMs));
                long playSample = audioInformation.getPlaySample() * ((long) audioInformation.getChannels());
                int i = 1;
                if (audioInformation.getBitDepth() != 1) {
                    i = 2;
                }
                double d = ((double) (playSample * ((long) i))) / 1000.0d;
                StringBuilder sb = new StringBuilder("\n============== Info start ==============\n");
                sb.append("媒体文件信息:\n");
                sb.append("\t播放时间: ");
                sb.append(new Date().toString());
                sb.append("\n");
                sb.append("\t音频类型: ");
                sb.append(audioInformation.getAudioType().toString());
                sb.append("\n");
                sb.append("\t文件采样率: ");
                sb.append(audioInformation.getSampleRate());
                sb.append("\n");
                sb.append("\t播放采样率: ");
                sb.append(audioInformation.getPlaySample());
                sb.append("\n");
                sb.append("\t位深: ");
                sb.append(audioInformation.getBitDepth());
                sb.append("\n");
                sb.append("\t声道数: ");
                sb.append(audioInformation.getChannels());
                sb.append("\n");
                sb.append("\t时长: ");
                sb.append(audioInformation.getDuration());
                sb.append("\n");
                sb.append("\n整体性能");
                sb.append("\n");
                sb.append("\t总耗时 (ms): ");
                sb.append(overallInfo.timeCostInMs);
                sb.append("\n");
                sb.append("\t播放PCM数据量 (byte): ");
                sb.append(overallInfo.totalPcmToBePlayed);
                sb.append("\n");
                sb.append("\t总速度 (byte/ms): ");
                sb.append(round);
                sb.append(" (");
                sb.append(Math.round(((double) round) / d));
                sb.append(" 倍于最低要求速度)");
                sb.append("\n");
                sb.append("\t最低要求速度 (byte/ms): ");
                sb.append(d);
                sb.append("\n");
                sb.append("\n额外信息:");
                for (Map.Entry entry : map.entrySet()) {
                    sb.append("\n\t");
                    sb.append((String) entry.getKey());
                    sb.append(": ");
                    sb.append((String) entry.getValue());
                }
                sb.append("\n");
                Reporters.generateDetailedPerformance(list, sb, overallInfo.timeCostInMs);
                sb.append("============== Info end ==============");
                Logger.m21791i("PERFORMANCE", sb.toString());
            }
        };
    }

    /* access modifiers changed from: private */
    public static void generateDetailedPerformance(List<PerformanceTracer.SpeedCheck> list, StringBuilder sb, long j) {
        StringBuilder sb4 = sb;
        sb4.append("\n详细性能数据:\n");
        int i = 5;
        sb4.append(String.format(Locale.getDefault(), "\t%15s%15s%15s%15s%15s", new Object[]{"名称", "平均速度(byte/ms)", "耗时(ms)", "数据量(byte)", "占总耗时比"}));
        for (PerformanceTracer.SpeedCheck next : list) {
            sb4.append("\n");
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[i];
            objArr[0] = next.getName();
            objArr[1] = Double.valueOf(next.getAvg());
            objArr[2] = Long.valueOf(next.getTotalTimeMs());
            objArr[3] = Long.valueOf(next.getTotalBufferLength());
            objArr[4] = Double.valueOf(((double) next.getTotalTimeMs()) / ((double) j));
            sb4.append(String.format(locale, "\t%15s%15.0f%15d%15d%13.2f", objArr));
            i = 5;
        }
        sb4.append("\n");
    }
}
