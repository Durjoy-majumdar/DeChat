package com.tencent.tencentmap.net;

import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.http.HttpCanceler;
import java.util.HashMap;

public class NetManager {
    private static NetManager sInstance;

    private NetManager() {
    }

    public static synchronized NetManager getInstance() {
        NetManager netManager;
        synchronized (NetManager.class) {
            if (sInstance == null) {
                sInstance = new NetManager();
            }
            netManager = sInstance;
        }
        return netManager;
    }

    public NetResponse doGet(String str) {
        NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).doGet();
        if (doGet != null) {
            return new NetResponse(doGet);
        }
        return null;
    }

    public NetResponse doPost(String str, byte[] bArr) {
        NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).postData(bArr).doPost();
        if (doPost != null) {
            return new NetResponse(doPost);
        }
        return null;
    }

    public NetResponse doPostNoBuffer(String str, String str2, byte[] bArr) {
        NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).postData(bArr).doPost();
        if (doPost != null) {
            return new NetResponse(doPost);
        }
        return null;
    }

    public void doRangePost(String str, byte[] bArr, String str2, String str3, String str4, String str5, HttpCanceler httpCanceler) {
        com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).token(str2).postData(bArr).nonce(str3).timestamp(str4).startTag(str5).canceler(httpCanceler).doPost();
    }

    public NetResponse doGet(String str, String str2) {
        NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).doGet();
        if (doGet != null) {
            return new NetResponse(doGet);
        }
        return null;
    }

    public NetResponse doPost(String str, String str2, byte[] bArr) {
        NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).postData(bArr).doPost();
        if (doPost != null) {
            return new NetResponse(doPost);
        }
        return null;
    }

    public NetResponse doGet(String str, String str2, int i) {
        NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i).doGet();
        if (doGet != null) {
            return new NetResponse(doGet);
        }
        return null;
    }

    public NetResponse doPost(String str, String str2, byte[] bArr, int i) {
        NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i).postData(bArr).doPost();
        if (doPost != null) {
            return new NetResponse(doPost);
        }
        return null;
    }

    public NetResponse doGet(String str, String str2, int i, int i2, HashMap<String, String> hashMap) {
        NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i).timeOut(i2).header(hashMap).doGet();
        if (doGet != null) {
            return new NetResponse(doGet);
        }
        return null;
    }

    public NetResponse doPost(String str, String str2, byte[] bArr, int i, int i2, HashMap<String, String> hashMap) {
        NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).timeOut(i2).retryNum(i).header(hashMap).postData(bArr).doPost();
        if (doPost != null) {
            return new NetResponse(doPost);
        }
        return null;
    }

    public NetResponse doGet(String str, int i, HttpCanceler httpCanceler) {
        NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).retryNum(i).canceler(httpCanceler).doGet();
        if (doGet != null) {
            return new NetResponse(doGet);
        }
        return null;
    }

    public NetResponse doGet(String str, String str2, int i, HttpCanceler httpCanceler) {
        NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i).canceler(httpCanceler).doGet();
        if (doGet != null) {
            return new NetResponse(doGet);
        }
        return null;
    }

    public NetResponse doPost(String str, byte[] bArr, int i, HttpCanceler httpCanceler) {
        NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).retryNum(i).canceler(httpCanceler).postData(bArr).doPost();
        if (doPost != null) {
            return new NetResponse(doPost);
        }
        return null;
    }

    public NetResponse doGet(String str, String str2, int i, HashMap<String, String> hashMap, HttpCanceler httpCanceler) {
        NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i).header(hashMap).canceler(httpCanceler).doGet();
        if (doGet != null) {
            return new NetResponse(doGet);
        }
        return null;
    }

    public NetResponse doPost(String str, String str2, byte[] bArr, int i, HttpCanceler httpCanceler) {
        NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i).canceler(httpCanceler).postData(bArr).doPost();
        if (doPost != null) {
            return new NetResponse(doPost);
        }
        return null;
    }

    public NetResponse doGet(String str, String str2, int i, int i2, HashMap<String, String> hashMap, HttpCanceler httpCanceler) {
        NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).timeOut(i2).retryNum(i).header(hashMap).canceler(httpCanceler).doGet();
        if (doGet != null) {
            return new NetResponse(doGet);
        }
        return null;
    }

    public NetResponse doPost(String str, String str2, byte[] bArr, int i, HashMap<String, String> hashMap, HttpCanceler httpCanceler) {
        NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i).header(hashMap).canceler(httpCanceler).postData(bArr).doPost();
        if (doPost != null) {
            return new NetResponse(doPost);
        }
        return null;
    }

    public NetResponse doPost(String str, String str2, byte[] bArr, int i, HashMap<String, String> hashMap, HttpCanceler httpCanceler, int i2) {
        NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).timeOut(i2).retryNum(i).header(hashMap).canceler(httpCanceler).postData(bArr).doPost();
        if (doPost != null) {
            return new NetResponse(doPost);
        }
        return null;
    }

    public NetResponse doPost(String str, String str2, byte[] bArr, int i, HashMap<String, String> hashMap, int i2) {
        NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).timeOut(i2).retryNum(i).header(hashMap).postData(bArr).doPost();
        if (doPost != null) {
            return new NetResponse(doPost);
        }
        return null;
    }
}
