package com.tencent.p014mm.pluginsdk.res.downloader.model;

import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.u */
public final class C115912u {

    /* renamed from: a */
    public static final HashMap<Integer, C115900h> f347792a;

    /* renamed from: b */
    public static volatile List<C115900h> f347793b = null;

    static {
        HashMap<Integer, C115900h> hashMap = new HashMap<>(1);
        f347792a = hashMap;
        hashMap.put(161516564, new CheckResUpdateHelper.CheckResUpdateResDownloaderPlugin());
    }

    /* renamed from: a */
    public static Collection<C115900h> m163042a() {
        if (f347793b != null) {
            return f347793b;
        }
        LinkedList linkedList = new LinkedList();
        for (Integer intValue : f347792a.keySet()) {
            C115900h hVar = f347792a.get(Integer.valueOf(intValue.intValue()));
            if (hVar != null) {
                linkedList.add(hVar);
            }
        }
        f347793b = linkedList;
        return linkedList;
    }
}
