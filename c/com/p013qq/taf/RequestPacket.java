package com.p013qq.taf;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.qq.taf.RequestPacket */
public final class RequestPacket extends JceStruct {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Map<String, String> cache_context = null;
    public static byte[] cache_sBuffer = null;
    public byte cPacketType;
    public Map<String, String> context;
    public int iMessageType;
    public int iRequestId;
    public int iTimeout;
    public short iVersion;
    public byte[] sBuffer;
    public String sFuncName;
    public String sServantName;
    public Map<String, String> status;

    static {
        Class<RequestPacket> cls = RequestPacket.class;
    }

    public RequestPacket() {
        this.iVersion = 0;
        this.cPacketType = 0;
        this.iMessageType = 0;
        this.iRequestId = 0;
        this.sServantName = null;
        this.sFuncName = null;
        this.iTimeout = 0;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void display(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.display(this.iVersion, "iVersion");
        jceDisplayer.display(this.cPacketType, "cPacketType");
        jceDisplayer.display(this.iMessageType, "iMessageType");
        jceDisplayer.display(this.iRequestId, "iRequestId");
        jceDisplayer.display(this.sServantName, "sServantName");
        jceDisplayer.display(this.sFuncName, "sFuncName");
        jceDisplayer.display(this.sBuffer, "sBuffer");
        jceDisplayer.display(this.iTimeout, "iTimeout");
        jceDisplayer.display(this.context, "context");
        jceDisplayer.display(this.status, "status");
    }

    public boolean equals(Object obj) {
        RequestPacket requestPacket = (RequestPacket) obj;
        return JceUtil.equals(1, (int) requestPacket.iVersion) && JceUtil.equals(1, (int) requestPacket.cPacketType) && JceUtil.equals(1, requestPacket.iMessageType) && JceUtil.equals(1, requestPacket.iRequestId) && JceUtil.equals((Object) 1, (Object) requestPacket.sServantName) && JceUtil.equals((Object) 1, (Object) requestPacket.sFuncName) && JceUtil.equals((Object) 1, (Object) requestPacket.sBuffer) && JceUtil.equals(1, requestPacket.iTimeout) && JceUtil.equals((Object) 1, (Object) requestPacket.context) && JceUtil.equals((Object) 1, (Object) requestPacket.status);
    }

    public void readFrom(JceInputStream jceInputStream) {
        try {
            this.iVersion = jceInputStream.read(this.iVersion, 1, true);
            this.cPacketType = jceInputStream.read(this.cPacketType, 2, true);
            this.iMessageType = jceInputStream.read(this.iMessageType, 3, true);
            this.iRequestId = jceInputStream.read(this.iRequestId, 4, true);
            this.sServantName = jceInputStream.readString(5, true);
            this.sFuncName = jceInputStream.readString(6, true);
            if (cache_sBuffer == null) {
                cache_sBuffer = new byte[1];
            }
            this.sBuffer = jceInputStream.read(cache_sBuffer, 7, true);
            this.iTimeout = jceInputStream.read(this.iTimeout, 8, true);
            if (cache_context == null) {
                HashMap hashMap = new HashMap();
                cache_context = hashMap;
                hashMap.put("", "");
            }
            this.context = (Map) jceInputStream.read(cache_context, 9, true);
            if (cache_context == null) {
                HashMap hashMap2 = new HashMap();
                cache_context = hashMap2;
                hashMap2.put("", "");
            }
            this.status = (Map) jceInputStream.read(cache_context, 10, true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.iVersion, 1);
        jceOutputStream.write(this.cPacketType, 2);
        jceOutputStream.write(this.iMessageType, 3);
        jceOutputStream.write(this.iRequestId, 4);
        jceOutputStream.write(this.sServantName, 5);
        jceOutputStream.write(this.sFuncName, 6);
        jceOutputStream.write(this.sBuffer, 7);
        jceOutputStream.write(this.iTimeout, 8);
        jceOutputStream.write(this.context, 9);
        jceOutputStream.write(this.status, 10);
    }

    public RequestPacket(short s, byte b, int i, int i2, String str, String str2, byte[] bArr, int i3, Map<String, String> map, Map<String, String> map2) {
        this.iVersion = s;
        this.cPacketType = b;
        this.iMessageType = i;
        this.iRequestId = i2;
        this.sServantName = str;
        this.sFuncName = str2;
        this.sBuffer = bArr;
        this.iTimeout = i3;
        this.context = map;
        this.status = map2;
    }
}
