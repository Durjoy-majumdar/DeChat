package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.C113598cj;
import com.tencent.mapsdk.internal.C113638du;
import com.tencent.mapsdk.internal.C113640dv;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.cy */
public interface C113612cy extends C113598cj.C113599a {
    @NetRequest(constQuery = "pf=androidsdk&fr=02001", method = NetMethod.POST, path = "fileupdate", queryKeys = {"sdkver", "suid", "appsuid", "nt", "api_key"})
    @NetJceResolver(inJce = CSFileUpdateReq.class, outJce = SCFileUpdateRsp.class, queryRange = {5, 10})
    C113640dv.C113641a<SCFileUpdateRsp> checkUpdate(String str, String str2, String str3, String str4, String str5, ArrayList<FileUpdateReq> arrayList, String str6, String str7, String str8, String str9, String str10);

    @NetRequest(authority = "mapapi.qq.com", method = NetMethod.GET, path = "sdk/config/offline_city_detail_v2.json")
    @NetFileResolver(outFile = "offline_city_list.json", queryRange = {0})
    C113638du.C113639a downloadOfflineMapCityList(String str);
}
