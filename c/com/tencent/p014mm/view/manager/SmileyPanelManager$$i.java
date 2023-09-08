package com.tencent.p014mm.view.manager;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;

/* renamed from: com.tencent.mm.view.manager.SmileyPanelManager$$i */
public class SmileyPanelManager$$i implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public final /* synthetic */ SmileyPanelManager f285748d;

    public SmileyPanelManager$$i(SmileyPanelManager smileyPanelManager) {
        this.f285748d = smileyPanelManager;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (!TextUtils.isEmpty(str) && str.equals("event_update_group")) {
            Log.m105918d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "modify emoji group .");
            this.f285748d.f285726q.mo137246b();
        }
    }
}
