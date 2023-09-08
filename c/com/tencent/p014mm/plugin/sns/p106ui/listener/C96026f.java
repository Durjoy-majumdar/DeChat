package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import ke3.C88144b;
import lo2.C99542h0;
import nt2.C100165c;
import os2.C100416r;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.f */
public class C96026f extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280432d;

    public C96026f(TimelineClickListener timelineClickListener) {
        this.f280432d = timelineClickListener;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
        Object tag = view.getTag();
        boolean z = tag instanceof BaseTimeLineItem.BaseViewHolder;
        if (z || (tag instanceof SnsInfo) || (tag instanceof C96066m2) || (tag instanceof C96235u4) || (tag instanceof C100165c)) {
            SnsInfo snsInfo = null;
            if (z) {
                snsInfo = C100416r.m131408a(((BaseTimeLineItem.BaseViewHolder) tag).f279950d);
            } else if (tag instanceof SnsInfo) {
                snsInfo = (SnsInfo) tag;
            } else if (tag instanceof C96066m2) {
                snsInfo = C94866e1.Yx0().mo139798DN(((C96066m2) tag).f280499b);
            } else if (view.getTag() instanceof C96235u4) {
                snsInfo = C94866e1.Yx0().mo139798DN(((C96235u4) view.getTag()).f281206a);
            } else if (view.getTag() instanceof C100165c) {
                snsInfo = ((C100165c) view.getTag()).f293412e;
            }
            if (snsInfo == null) {
                SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
                return;
            } else if (!snsInfo.isAd()) {
                SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
                return;
            } else if (snsInfo.getAdXml() == null || !snsInfo.getAdXml().isCardAd()) {
                SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
                return;
            } else if (TimelineClickListener.m122990l(this.f280432d, snsInfo).actionExtWeApp != null) {
                SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
                return;
            } else if (C99542h0.m129910h(snsInfo.getAdXml(), snsInfo.getAdInfo())) {
                SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
                return;
            } else {
                C88144b.m109788f("favorite");
                if (snsInfo.getAdXml().isCardAd()) {
                    contextMenu.add(0, 20, 0, view.getContext().getString(C0966R.string.f361137hk2));
                }
                ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent.f236178d.f236181b = snsInfo.getLocalid();
                exDeviceHaveBindNetworkDeviceEvent.publish();
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                    contextMenu.add(0, 18, 0, view.getContext().getString(C0966R.string.a19));
                }
                NotInteresetABTestManager.m119627b(contextMenu, snsInfo);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
        if ((view.getTag() instanceof BaseTimeLineItem.BaseViewHolder) || (view.getTag() instanceof SnsInfo) || (view.getTag() instanceof C96066m2) || (view.getTag() instanceof C96235u4) || (view.getTag() instanceof C100165c)) {
            Object tag = view.getTag();
            SnsInfo snsInfo = null;
            if (tag instanceof BaseTimeLineItem.BaseViewHolder) {
                snsInfo = C100416r.m131408a(((BaseTimeLineItem.BaseViewHolder) view.getTag()).f279950d);
            } else if (tag instanceof SnsInfo) {
                snsInfo = (SnsInfo) tag;
            } else if (tag instanceof C96066m2) {
                snsInfo = C94866e1.Yx0().mo139798DN(((C96066m2) tag).f280499b);
            } else if (view.getTag() instanceof C96235u4) {
                snsInfo = C94866e1.Yx0().mo139798DN(((C96235u4) view.getTag()).f281206a);
            } else if (view.getTag() instanceof C100165c) {
                snsInfo = ((C100165c) view.getTag()).f293412e;
            }
            if (snsInfo != null) {
                if (!snsInfo.isAd()) {
                    SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
                    return false;
                } else if (snsInfo.getAdXml() == null || !snsInfo.getAdXml().isCardAd() || snsInfo.getAdXml().adLiveInfo != null) {
                    SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
                    return false;
                } else {
                    this.f280432d.f280381k.mo133554b(view, snsInfo.getLocalid(), snsInfo.getTimeLine());
                }
            }
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$12");
        return false;
    }
}
