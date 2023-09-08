package com.tencent.p014mm.view.manager;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;

/* renamed from: com.tencent.mm.view.manager.SmileyPanelManager$$j */
public class SmileyPanelManager$$j implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public final /* synthetic */ SmileyPanelManager f285749d;

    public SmileyPanelManager$$j(SmileyPanelManager smileyPanelManager) {
        this.f285749d = smileyPanelManager;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "emoji storage notify %s", str);
        if (str != null) {
            this.f285749d.f285726q.mo137246b();
        }
    }
}
