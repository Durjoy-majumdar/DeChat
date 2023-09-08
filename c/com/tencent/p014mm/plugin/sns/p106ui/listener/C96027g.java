package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import ke3.C88144b;
import os2.C100416r;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.g */
public class C96027g extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280433d;

    public C96027g(TimelineClickListener timelineClickListener) {
        this.f280433d = timelineClickListener;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
        Object tag = view.getTag();
        boolean z = tag instanceof BaseTimeLineItem.BaseViewHolder;
        if (z || (tag instanceof SnsInfo)) {
            SnsInfo snsInfo = null;
            if (z) {
                snsInfo = C100416r.m131408a(((BaseTimeLineItem.BaseViewHolder) tag).f279950d);
            } else if (tag instanceof SnsInfo) {
                snsInfo = (SnsInfo) tag;
            }
            C88144b.m109788f("favorite");
            ADXml adXml = snsInfo.getAdXml();
            ADInfo l = TimelineClickListener.m122990l(this.f280433d, snsInfo);
            if (adXml.isLinkAd()) {
                if (adXml.isLandingPagesAd()) {
                    contextMenu.add(0, 2, 0, view.getContext().getString(C0966R.string.f361137hk2));
                } else if (l.adActionType == 0) {
                    contextMenu.add(0, 3, 0, view.getContext().getString(C0966R.string.f361137hk2));
                }
            }
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236181b = snsInfo.getLocalid();
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                contextMenu.add(0, 18, 0, view.getContext().getString(C0966R.string.a19));
            }
            if (snsInfo != null) {
                NotInteresetABTestManager.m119627b(contextMenu, snsInfo);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
        if ((view.getTag() instanceof BaseTimeLineItem.BaseViewHolder) || (view.getTag() instanceof SnsInfo)) {
            Object tag = view.getTag();
            SnsInfo snsInfo = null;
            if (tag instanceof BaseTimeLineItem.BaseViewHolder) {
                snsInfo = C100416r.m131408a(((BaseTimeLineItem.BaseViewHolder) view.getTag()).f279950d);
            } else if (tag instanceof SnsInfo) {
                snsInfo = (SnsInfo) tag;
            }
            if (snsInfo != null) {
                this.f280433d.f280381k.mo133554b(view, snsInfo.getLocalid(), snsInfo.getTimeLine());
            }
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
        return false;
    }
}
