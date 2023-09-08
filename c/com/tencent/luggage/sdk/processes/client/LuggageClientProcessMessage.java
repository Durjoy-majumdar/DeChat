package com.tencent.luggage.sdk.processes.client;

import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;
import p963fc.C86812g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lfc/g;", "RUNTIME", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public abstract class LuggageClientProcessMessage<RUNTIME extends C86812g> implements Parcelable {

    /* renamed from: d */
    public final String f2138d;

    public LuggageClientProcessMessage(String str) {
        C87412m.m108594g(str, "appId");
        this.f2138d = str;
    }

    /* renamed from: b */
    public String mo892b() {
        return this.f2138d;
    }

    /* renamed from: c */
    public abstract void mo893c(RUNTIME runtime);
}
