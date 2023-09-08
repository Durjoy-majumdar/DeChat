package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.KNetworkMockManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import ob0.C117746w;
import qe3.C101125b1;
import qe3.C89631w;

public class WXPCommReqResp extends C117746w {
    private int funcId;
    public WeakReference<KNetworkMockManager> m_mockMgr;
    private int newExtFlag;
    private int option = 0;
    private Req req = null;
    private WXPRequestWrapper requestWrapper;
    private Resp resp = null;
    private WXPResponseWrapper responseWrapper;
    private byte[] transferHeader;
    private String uri;

    public static final class Resp extends C89631w.C89636e implements C89631w.C89635c {
        /* access modifiers changed from: private */
        public int cmdId;
        private boolean needHeader;
        /* access modifiers changed from: private */
        public WXPResponseWrapper rImpl;

        public Resp(WXPResponseWrapper wXPResponseWrapper, int i, boolean z) {
            this.rImpl = wXPResponseWrapper;
            this.cmdId = i;
            this.needHeader = z;
        }

        public int fromProtoBuf(byte[] bArr) {
            this.rImpl.setData(bArr);
            return 0;
        }

        public int getCmdId() {
            return this.cmdId;
        }

        public WXPResponseWrapper getResponseWrapper() {
            return this.rImpl;
        }
    }

    public static final class WXPRequestWrapper {
        private byte[] data;

        public WXPRequestWrapper() {
        }

        public byte[] getData() {
            return this.data;
        }

        public void setData(byte[] bArr) {
            this.data = bArr;
        }

        public WXPRequestWrapper(byte[] bArr) {
            this.data = bArr;
        }
    }

    public class WXPResponseWrapper {
        private byte[] data;
        private String newData = null;

        public WXPResponseWrapper() {
        }

        public byte[] getData() {
            return this.data;
        }

        public String getNewData() {
            return this.newData;
        }

        public void setData(byte[] bArr) {
            this.data = bArr;
        }

        public void setNewData(String str) {
            this.newData = str;
        }
    }

    public WXPCommReqResp(byte[] bArr, String str, int i, int i2, int i3, boolean z, int i4, int i5, String str2, KNetworkMockManager kNetworkMockManager) {
        byte[] bArr2 = bArr;
        this.requestWrapper = new WXPRequestWrapper(bArr);
        this.responseWrapper = new WXPResponseWrapper();
        this.req = new Req(this.requestWrapper, i, i2, z, i4, i5, str2);
        this.resp = new Resp(this.responseWrapper, i3, z);
        this.uri = str;
        this.funcId = i;
        this.m_mockMgr = new WeakReference<>(kNetworkMockManager);
        this.newExtFlag = 0;
        this.transferHeader = null;
        if (i4 == 0) {
            setIsUserCmd(true);
        }
    }

    public void addNewExtFlag(int i) {
        this.newExtFlag = i | this.newExtFlag;
    }

    public void clearNewExtFlag() {
        this.newExtFlag = 0;
    }

    public int getNewExtFlags() {
        return this.newExtFlag;
    }

    public int getOptions() {
        return this.option;
    }

    public final int getReqCmdId() {
        return this.req.cmdId;
    }

    public final WXPRequestWrapper getRequestProtoBuf() {
        return this.req.rImpl;
    }

    public final int getRespCmdId() {
        return this.resp.cmdId;
    }

    public final WXPResponseWrapper getResponseProtoBuf() {
        return this.resp.rImpl;
    }

    public byte[] getTransHeader() {
        return this.transferHeader;
    }

    public final int getType() {
        return this.funcId;
    }

    public final String getUri() {
        return this.uri;
    }

    public byte[] getWXPReqData() {
        return this.requestWrapper.getData();
    }

    public byte[] getWXPRespData() {
        return this.responseWrapper.getData();
    }

    public String getWXPRespNewData() {
        return this.responseWrapper.getNewData();
    }

    public String resp2Json(byte[] bArr) {
        WeakReference<KNetworkMockManager> weakReference = this.m_mockMgr;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.m_mockMgr.get().responseDataToJson(bArr);
    }

    public void setOptions(int i) {
        this.option = i;
    }

    public void setRsaInfo(C101125b1 b1Var) {
        this.req.setRsaInfo(b1Var);
    }

    public void setTransferHeader(byte[] bArr) {
        this.transferHeader = bArr;
    }

    public void setWXPReqData(byte[] bArr) {
        this.requestWrapper.setData(bArr);
    }

    public void setWXPRespData(byte[] bArr) {
        this.responseWrapper.setData(bArr);
    }

    public void setWXPRespNewData(String str) {
        this.responseWrapper.setNewData(str);
        WeakReference<KNetworkMockManager> weakReference = this.m_mockMgr;
        if (weakReference != null && weakReference.get() != null) {
            setWXPRespData(this.m_mockMgr.get().jsonToResponseData(str));
        }
    }

    public final Req getReqObjImp() {
        return this.req;
    }

    public final Resp getRespObj() {
        return this.resp;
    }

    public static final class Req extends C89631w.C89634d implements C89631w.C89633b {
        /* access modifiers changed from: private */
        public int cmdId;
        private int funcId;
        private boolean needHeader;
        /* access modifiers changed from: private */
        public WXPRequestWrapper rImpl;

        public Req(WXPRequestWrapper wXPRequestWrapper, int i, int i2, boolean z) {
            this.rImpl = wXPRequestWrapper;
            this.funcId = i;
            this.cmdId = i2;
            this.needHeader = z;
        }

        public int getCmdId() {
            return this.cmdId;
        }

        public int getFuncId() {
            return this.funcId;
        }

        public WXPRequestWrapper getImpl() {
            return this.rImpl;
        }

        public byte[] toProtoBuf() {
            return this.rImpl.getData();
        }

        public Req(WXPRequestWrapper wXPRequestWrapper, int i, int i2, boolean z, int i3, int i4, String str) {
            this.rImpl = wXPRequestWrapper;
            this.funcId = i;
            this.cmdId = i2;
            this.needHeader = z;
            setRouteInfo(Util.getInt(str, 0));
        }
    }
}
