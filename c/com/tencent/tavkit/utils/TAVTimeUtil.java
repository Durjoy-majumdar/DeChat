package com.tencent.tavkit.utils;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TAVTimeUtil {
    public static float factorForTime(CMTime cMTime, CMTimeRange cMTimeRange) {
        if (cMTimeRange == null) {
            return 0.0f;
        }
        return cMTime.sub(cMTimeRange.getStart()).getTimeSeconds() / cMTimeRange.getDuration().getTimeSeconds();
    }

    public static CMTimeRange getIntersection(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
        if (cMTimeRange == null || cMTimeRange2 == null) {
            return null;
        }
        if (cMTimeRange.getStart().bigThan(cMTimeRange2.getStart())) {
            CMTimeRange cMTimeRange3 = cMTimeRange2;
            cMTimeRange2 = cMTimeRange;
            cMTimeRange = cMTimeRange3;
        }
        if (cMTimeRange.getEnd().smallThan(cMTimeRange2.getStart())) {
            return null;
        }
        CMTime start = cMTimeRange.getStart().bigThan(cMTimeRange2.getStart()) ? cMTimeRange.getStart() : cMTimeRange2.getStart();
        return new CMTimeRange(start, (cMTimeRange.getEnd().smallThan(cMTimeRange2.getEnd()) ? cMTimeRange.getEnd() : cMTimeRange2.getEnd()).sub(start));
    }

    public static List<CMTimeRange> mixTimeRangesWithMinTimeRange(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2, CMTimeRange cMTimeRange3) {
        if (cMTimeRange3.containsTimeRange(cMTimeRange)) {
            ArrayList arrayList = new ArrayList();
            CMTime sub = cMTimeRange2.getStart().sub(cMTimeRange3.getStart());
            if (sub.getTimeSeconds() > 0.0f) {
                arrayList.add(new CMTimeRange(cMTimeRange3.getStart(), sub));
            }
            arrayList.add(cMTimeRange2);
            CMTime sub2 = cMTimeRange3.getEnd().sub(cMTimeRange2.getEnd());
            if (sub2.getTimeSeconds() > 0.0f) {
                arrayList.add(new CMTimeRange(cMTimeRange2.getEnd(), sub2));
            }
            return arrayList;
        } else if (cMTimeRange.equals(cMTimeRange3)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(cMTimeRange2);
            return arrayList2;
        } else {
            ArrayList arrayList3 = new ArrayList();
            CMTimeRange cMTimeRange4 = new CMTimeRange(cMTimeRange.getStart(), cMTimeRange.getDuration().sub(cMTimeRange2.getDuration()));
            if (cMTimeRange4.getDuration().getTimeSeconds() > 0.0f) {
                arrayList3.add(cMTimeRange4);
            }
            arrayList3.add(cMTimeRange2);
            CMTimeRange cMTimeRange5 = new CMTimeRange(cMTimeRange2.getEnd(), cMTimeRange3.getEnd().sub(cMTimeRange2.getEnd()));
            if (cMTimeRange5.getDuration().getTimeSeconds() > 0.0f) {
                arrayList3.add(cMTimeRange5);
            }
            return arrayList3;
        }
    }

    public static List<CMTimeRange> sliceTimeRangesForTimeRange1(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
        List<CMTimeRange> list;
        CMTimeRange intersection = getIntersection(cMTimeRange, cMTimeRange2);
        if (intersection.getDuration().getTimeSeconds() > 0.0f) {
            list = (cMTimeRange2.containsTimeRange(cMTimeRange) || (cMTimeRange.getStart().getTimeSeconds() < cMTimeRange2.getStart().getTimeSeconds() && cMTimeRange.getEnd().getTimeSeconds() < cMTimeRange2.getEnd().getTimeSeconds())) ? mixTimeRangesWithMinTimeRange(cMTimeRange, intersection, cMTimeRange2) : mixTimeRangesWithMinTimeRange(cMTimeRange2, intersection, cMTimeRange);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(cMTimeRange);
            arrayList.add(cMTimeRange2);
            list = arrayList;
        }
        Collections.sort(list, new Comparator<CMTimeRange>() {
            public int compare(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
                CMTime start = cMTimeRange.getStart();
                CMTime start2 = cMTimeRange2.getStart();
                if (start.equalsTo(start2)) {
                    return 0;
                }
                return start.smallThan(start2) ? -1 : 1;
            }
        });
        return list;
    }

    public static List<CMTimeRange> timeRange(CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
        CMTimeRange intersection = getIntersection(cMTimeRange, cMTimeRange2);
        if (intersection == null || intersection.getDuration().getTimeSeconds() <= 0.0f) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(cMTimeRange);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        CMTimeRange cMTimeRange3 = new CMTimeRange(cMTimeRange.getStart(), intersection.getStart().sub(cMTimeRange.getStart()));
        if (cMTimeRange3.getDuration().getTimeSeconds() > 0.0f) {
            arrayList2.add(cMTimeRange3);
        }
        CMTimeRange cMTimeRange4 = new CMTimeRange(intersection.getEnd(), cMTimeRange.getEnd().sub(intersection.getEnd()));
        if (cMTimeRange4.getDuration().getTimeSeconds() > 0.0f) {
            arrayList2.add(cMTimeRange4);
        }
        return arrayList2;
    }
}
