package com.tencent.p014mm.plugin.sns.p106ui.item.improve.click;

import android.content.Context;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.event.IListener;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter */
public final class TimelineItemClickEventCenter {

    /* renamed from: a */
    public static final ArrayList<IListener<?>> f280079a;

    /* renamed from: b */
    public static Context f280080b;

    static {
        ArrayList<IListener<?>> arrayList = new ArrayList<>();
        f280079a = arrayList;
        C40008f fVar = C40008f.f107254d;
        TimelineItemClickEventCenter$profileJumperListener$1 timelineItemClickEventCenter$profileJumperListener$1 = new TimelineItemClickEventCenter$profileJumperListener$1(fVar);
        TimelineItemClickEventCenter$permissionSettingJumperListener$1 timelineItemClickEventCenter$permissionSettingJumperListener$1 = new TimelineItemClickEventCenter$permissionSettingJumperListener$1(fVar);
        TimelineItemClickEventCenter$reportJumperListener$1 timelineItemClickEventCenter$reportJumperListener$1 = new TimelineItemClickEventCenter$reportJumperListener$1(fVar);
        TimelineItemClickEventCenter$otherFeedClickIListener$1 timelineItemClickEventCenter$otherFeedClickIListener$1 = new TimelineItemClickEventCenter$otherFeedClickIListener$1(fVar);
        TimelineItemClickEventCenter$finderPostListener$1 timelineItemClickEventCenter$finderPostListener$1 = new TimelineItemClickEventCenter$finderPostListener$1(fVar);
        TimelineItemClickEventCenter$snsRepostListener$1 timelineItemClickEventCenter$snsRepostListener$1 = new TimelineItemClickEventCenter$snsRepostListener$1(fVar);
        arrayList.add(timelineItemClickEventCenter$profileJumperListener$1);
        arrayList.add(timelineItemClickEventCenter$permissionSettingJumperListener$1);
        arrayList.add(timelineItemClickEventCenter$reportJumperListener$1);
        arrayList.add(timelineItemClickEventCenter$otherFeedClickIListener$1);
        arrayList.add(timelineItemClickEventCenter$finderPostListener$1);
        arrayList.add(timelineItemClickEventCenter$snsRepostListener$1);
    }
}
