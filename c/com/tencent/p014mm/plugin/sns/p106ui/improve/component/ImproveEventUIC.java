package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import ut2.C102084a;

/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC */
public final class ImproveEventUIC extends C102084a {

    /* renamed from: d */
    public final ArrayList<IListener<?>> f279635d;

    /* renamed from: e */
    public String f279636e = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveEventUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        ArrayList<IListener<?>> arrayList = new ArrayList<>();
        this.f279635d = arrayList;
        ImproveEventUIC$profileJumperListener$1 improveEventUIC$profileJumperListener$1 = new ImproveEventUIC$profileJumperListener$1(this, getLifecycleOwner());
        ImproveEventUIC$permissionSettingJumperListener$1 improveEventUIC$permissionSettingJumperListener$1 = new ImproveEventUIC$permissionSettingJumperListener$1(this, getLifecycleOwner());
        ImproveEventUIC$reportJumperListener$1 improveEventUIC$reportJumperListener$1 = new ImproveEventUIC$reportJumperListener$1(this, getLifecycleOwner());
        ImproveEventUIC$otherFeedClickIListener$1 improveEventUIC$otherFeedClickIListener$1 = new ImproveEventUIC$otherFeedClickIListener$1(this, getLifecycleOwner());
        ImproveEventUIC$finderPostListener$1 improveEventUIC$finderPostListener$1 = new ImproveEventUIC$finderPostListener$1(getLifecycleOwner());
        ImproveEventUIC$snsRepostListener$1 improveEventUIC$snsRepostListener$1 = new ImproveEventUIC$snsRepostListener$1(getLifecycleOwner());
        ImproveEventUIC$snsUploadPostDoneListener$1 improveEventUIC$snsUploadPostDoneListener$1 = new ImproveEventUIC$snsUploadPostDoneListener$1(getLifecycleOwner());
        ImproveEventUIC$snsExposeItemNotifyListener$1 improveEventUIC$snsExposeItemNotifyListener$1 = new ImproveEventUIC$snsExposeItemNotifyListener$1(getLifecycleOwner());
        ImproveEventUIC$snsFavFeedForDataReportListener$1 improveEventUIC$snsFavFeedForDataReportListener$1 = new ImproveEventUIC$snsFavFeedForDataReportListener$1(this, getLifecycleOwner());
        ImproveEventUIC$snsPermissionNotifyListener$1 improveEventUIC$snsPermissionNotifyListener$1 = new ImproveEventUIC$snsPermissionNotifyListener$1(this, getLifecycleOwner());
        ImproveEventUIC$newNotificationListener$1 improveEventUIC$newNotificationListener$1 = new ImproveEventUIC$newNotificationListener$1(getLifecycleOwner());
        ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1 improveEventUIC$snsForwardFeedToSnsForDataReportListener$1 = new ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1(getLifecycleOwner());
        C95822xb707982b improveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1 = new C95822xb707982b(getLifecycleOwner());
        ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1 improveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1 = new ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1(getLifecycleOwner());
        C95821xe5281eab improveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1 = new C95821xe5281eab(getLifecycleOwner());
        arrayList.add(improveEventUIC$profileJumperListener$1);
        arrayList.add(improveEventUIC$permissionSettingJumperListener$1);
        arrayList.add(improveEventUIC$reportJumperListener$1);
        arrayList.add(improveEventUIC$otherFeedClickIListener$1);
        arrayList.add(improveEventUIC$finderPostListener$1);
        arrayList.add(improveEventUIC$snsRepostListener$1);
        arrayList.add(improveEventUIC$snsUploadPostDoneListener$1);
        arrayList.add(improveEventUIC$snsExposeItemNotifyListener$1);
        arrayList.add(improveEventUIC$snsFavFeedForDataReportListener$1);
        arrayList.add(improveEventUIC$snsPermissionNotifyListener$1);
        arrayList.add(improveEventUIC$newNotificationListener$1);
        arrayList.add(improveEventUIC$snsForwardFeedToSnsForDataReportListener$1);
        arrayList.add(improveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1);
        arrayList.add(improveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1);
        arrayList.add(improveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1);
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        super.onCreate(bundle);
        for (IListener alive : this.f279635d) {
            alive.alive();
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        super.onDestroy();
        for (IListener dead : this.f279635d) {
            dead.dead();
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
    }
}
