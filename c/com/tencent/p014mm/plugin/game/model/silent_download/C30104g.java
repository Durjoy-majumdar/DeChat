package com.tencent.p014mm.plugin.game.model.silent_download;

import com.tencent.p014mm.autogen.events.GameSilentDownloadEvent;
import com.tencent.p014mm.autogen.events.GameSilentDownloadNotifyEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.model.silent_download.g */
public enum C30104g implements C38174i<GameSilentDownloadListener> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81411d;

    public Object get() {
        Object obj = this.f81411d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81411d;
                if (obj == obj2) {
                    obj = new GameSilentDownloadListener();
                    this.f81411d = obj;
                }
            }
        }
        return (GameSilentDownloadListener) obj;
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
        return Objects.equals(obj, GameSilentDownloadNotifyEvent.class) || Objects.equals(obj, GameSilentDownloadEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + GameSilentDownloadListener.class.getName();
    }
}
