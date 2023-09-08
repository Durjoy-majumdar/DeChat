package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

public final class Response extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "Response";
    public static byte[] cache_body;
    public static RspHead cache_head;
    public byte[] body;
    public RspHead head;

    static {
        Class<Response> cls = Response.class;
    }

    public Response() {
        this.head = null;
        this.body = null;
    }

    public String className() {
        return "jce.Response";
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
        jceDisplayer.display((JceStruct) this.head, "head");
        jceDisplayer.display(this.body, "body");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple((JceStruct) this.head, true);
        jceDisplayer.displaySimple(this.body, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Response response = (Response) obj;
        return JceUtil.equals((Object) this.head, (Object) response.head) && JceUtil.equals((Object) this.body, (Object) response.body);
    }

    public String fullClassName() {
        return TAG;
    }

    public byte[] getBody() {
        return this.body;
    }

    public RspHead getHead() {
        return this.head;
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return 0;
        }
    }

    public void readFrom(JceInputStream jceInputStream) {
        if (cache_head == null) {
            cache_head = new RspHead();
        }
        this.head = (RspHead) jceInputStream.read((JceStruct) cache_head, 0, true);
        if (cache_body == null) {
            byte[] bArr = new byte[1];
            cache_body = bArr;
            bArr[0] = 0;
        }
        this.body = jceInputStream.read(cache_body, 1, true);
    }

    public void setBody(byte[] bArr) {
        this.body = bArr;
    }

    public void setHead(RspHead rspHead) {
        this.head = rspHead;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write((JceStruct) this.head, 0);
        jceOutputStream.write(this.body, 1);
    }

    public Response(RspHead rspHead, byte[] bArr) {
        this.head = rspHead;
        this.body = bArr;
    }
}
