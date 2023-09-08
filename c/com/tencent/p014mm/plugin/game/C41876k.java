package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.autogen.events.GameCenterOperationEvent;
import com.tencent.p014mm.autogen.events.GameCommOperationEvent;
import com.tencent.p014mm.autogen.events.GameDebugSettingEvent;
import com.tencent.p014mm.autogen.events.GameDownloadReport4WebViewEvent;
import com.tencent.p014mm.autogen.events.GameJsApiCommandEvent;
import com.tencent.p014mm.autogen.events.GameMsgDownloadImgEvent;
import com.tencent.p014mm.autogen.events.GamePBCacheEvent;
import com.tencent.p014mm.autogen.events.GameWatchReportEvent;
import com.tencent.p014mm.autogen.events.GetGameDebugDownloaderTypeEvent;
import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import com.tencent.p014mm.autogen.events.NotifyGameWebviewOperationEvent;
import com.tencent.p014mm.autogen.events.OpenGameCenterEvent;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.autogen.events.QueryGameLifeMsgEvent;
import com.tencent.p014mm.autogen.events.QueryGameMessageEvent;
import com.tencent.p014mm.autogen.events.ReportGameCenterEvent;
import com.tencent.p014mm.autogen.events.ReportMsgClickEvent;
import com.tencent.p014mm.autogen.events.SetEntranceMsgExposureEvent;
import com.tencent.p014mm.autogen.events.ShowGameCenterEntranceEvent;
import com.tencent.p014mm.autogen.events.SwitcherEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.k */
public enum C41876k implements C38174i<GameEventListener> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f112829d;

    public Object get() {
        Object obj = this.f112829d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f112829d;
                if (obj == obj2) {
                    obj = new GameEventListener();
                    this.f112829d = obj;
                }
            }
        }
        return (GameEventListener) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, NotifyGameWebviewOperationEvent.class) || Objects.equals(obj, GameDownloadReport4WebViewEvent.class) || Objects.equals(obj, QueryGameMessageEvent.class) || Objects.equals(obj, SwitcherEvent.class) || Objects.equals(obj, GameCenterOperationEvent.class) || Objects.equals(obj, GameJsApiCommandEvent.class) || Objects.equals(obj, OpenGameCenterEvent.class) || Objects.equals(obj, ReportGameCenterEvent.class) || Objects.equals(obj, ReportMsgClickEvent.class) || Objects.equals(obj, GameDebugSettingEvent.class) || Objects.equals(obj, GetGameDebugDownloaderTypeEvent.class) || Objects.equals(obj, GameCommOperationEvent.class) || Objects.equals(obj, GameWatchReportEvent.class) || Objects.equals(obj, PostSyncTaskEvent.class) || Objects.equals(obj, ManualAuthEvent.class) || Objects.equals(obj, GameMsgDownloadImgEvent.class) || Objects.equals(obj, QueryGameLifeMsgEvent.class) || Objects.equals(obj, ShowGameCenterEntranceEvent.class) || Objects.equals(obj, GamePBCacheEvent.class) || Objects.equals(obj, SetEntranceMsgExposureEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + GameEventListener.class.getName();
    }
}
