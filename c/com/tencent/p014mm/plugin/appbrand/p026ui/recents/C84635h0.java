package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.StartNearbyFromLauncherRecentsListEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import u24.C90595a;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.h0 */
public final class C84635h0 {

    /* renamed from: a */
    public boolean f246933a = false;

    /* renamed from: b */
    public Intent f246934b = null;

    /* renamed from: c */
    public long f246935c;

    /* renamed from: d */
    public WAMainFrameEnterHistoryListExposeStruct f246936d = null;

    /* renamed from: e */
    public LinkedHashSet<AppBrandRecentTaskInfo> f246937e = null;

    /* renamed from: f */
    public IListener<StartNearbyFromLauncherRecentsListEvent> f246938f;

    /* renamed from: a */
    public final void mo117345a(String str, Activity activity) {
        int i;
        int i2;
        Log.m105919d("MicroMsg.AppBrand.RecentsReporter", "reportExitAction reason[%s]", str);
        if (this.f246936d != null) {
            long longExtra = activity.getIntent().getLongExtra("extra_start_activity_click_timestamp_ms", this.f246935c);
            WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct = this.f246936d;
            wAMainFrameEnterHistoryListExposeStruct.f236469d = longExtra;
            wAMainFrameEnterHistoryListExposeStruct.f236470e = Util.nowMilliSecond();
            if (wAMainFrameEnterHistoryListExposeStruct.f236471f <= 0) {
                if ("onDestroy".equals(str)) {
                    wAMainFrameEnterHistoryListExposeStruct.f236471f = 1;
                } else {
                    Intent intent = this.f246934b;
                    if (intent != null) {
                        try {
                            if (intent.getComponent() != null) {
                                String shortClassName = intent.getComponent().getShortClassName();
                                if (!Util.isNullOrNil(shortClassName)) {
                                    String substring = shortClassName.substring(shortClassName.lastIndexOf(46) + 1);
                                    if (C90595a.m113498b(new String[]{"AppBrandNearbyEmptyUI", "AppBrandNearbyWebViewUI"}, substring)) {
                                        i2 = 3;
                                    } else if (C90595a.m113498b(new String[]{"AppBrandSearchUI"}, substring)) {
                                        i2 = 5;
                                    } else if ("AppBrandLauncherFolderUI".equals(substring) && intent.getIntExtra("KEY_MODE", 0) == 2) {
                                        i2 = 4;
                                    }
                                    wAMainFrameEnterHistoryListExposeStruct.f236471f = (long) i2;
                                }
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.AppBrand.RecentsReporter", "makeFromMainFrameExitReportLeaveType e=%s", e);
                        }
                    }
                    i2 = 0;
                    wAMainFrameEnterHistoryListExposeStruct.f236471f = (long) i2;
                }
            }
            String[] strArr = new String[4];
            LinkedList linkedList = new LinkedList();
            ArrayList arrayList = new ArrayList(this.f246937e);
            int i3 = 0;
            while (i3 < 4) {
                linkedList.clear();
                int i4 = i3 * 5;
                while (true) {
                    i = i3 + 1;
                    if (i4 >= Math.min(arrayList.size(), i * 5)) {
                        break;
                    }
                    linkedList.addLast(((AppBrandRecentTaskInfo) arrayList.get(i4)).f239041e);
                    i4++;
                }
                strArr[i3] = C90599h.m113512e(linkedList, "|");
                i3 = i;
            }
            WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct2 = this.f246936d;
            wAMainFrameEnterHistoryListExposeStruct2.f236476k = wAMainFrameEnterHistoryListExposeStruct2.mo86045b("AppidFrom1And5", strArr[0], true);
            WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct3 = this.f246936d;
            wAMainFrameEnterHistoryListExposeStruct3.f236477l = wAMainFrameEnterHistoryListExposeStruct3.mo86045b("AppidFrom6And10", strArr[1], true);
            WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct4 = this.f246936d;
            wAMainFrameEnterHistoryListExposeStruct4.f236478m = wAMainFrameEnterHistoryListExposeStruct4.mo86045b("AppidFrom11And15", strArr[2], true);
            WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct5 = this.f246936d;
            wAMainFrameEnterHistoryListExposeStruct5.f236479n = wAMainFrameEnterHistoryListExposeStruct5.mo86045b("AppidFrom16And20", strArr[3], true);
            wAMainFrameEnterHistoryListExposeStruct.mo86054n();
            this.f246936d = null;
        }
        IListener<StartNearbyFromLauncherRecentsListEvent> iListener = this.f246938f;
        if (iListener != null) {
            iListener.dead();
            this.f246938f = null;
        }
    }
}
