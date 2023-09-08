package com.tencent.p014mm.plugin.magicbrush.api;

import d42.C86184l;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.plugin.magicbrush.api.IMBNetworkService */
public interface IMBNetworkService {

    @Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/api/IMBNetworkService$Key;", "", "(Ljava/lang/String;I)V", "Download", "CDNDownload", "Request", "mb-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key */
    public enum Key {
        Download,
        CDNDownload,
        Request
    }

    /* renamed from: NQ */
    String mo118376NQ(Key key);

    /* renamed from: r3 */
    C86184l mo118377r3(String str, Key key);

    /* renamed from: xf */
    C86184l mo118378xf(String str, Key key);
}
