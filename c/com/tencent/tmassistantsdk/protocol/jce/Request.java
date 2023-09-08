package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

public final class Request extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "Request";
    public static byte[] cache_body;
    public static ReqHead cache_head;
    public byte[] body;
    public ReqHead head;

    static {
        Class<Request> cls = Request.class;
    }

    public Request() {
        this.head = null;
        this.body = null;
    }

    public String className() {
        return "jce.Request";
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
        Request request = (Request) obj;
        return JceUtil.equals((Object) this.head, (Object) request.head) && JceUtil.equals((Object) this.body, (Object) request.body);
    }

    public String fullClassName() {
        return TAG;
    }

    public byte[] getBody() {
        return this.body;
    }

    public ReqHead getHead() {
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
            cache_head = new ReqHead();
        }
        this.head = (ReqHead) jceInputStream.read((JceStruct) cache_head, 0, true);
        if (cache_body == null) {
            byte[] bArr = new byte[1];
            cache_body = bArr;
            bArr[0] = 0;
        }
        this.body = jceInputStream.read(cache_body, 1, false);
    }

    public void setBody(byte[] bArr) {
        this.body = bArr;
    }

    public void setHead(ReqHead reqHead) {
        this.head = reqHead;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write((JceStruct) this.head, 0);
        byte[] bArr = this.body;
        if (bArr != null) {
            jceOutputStream.write(bArr, 1);
        }
    }

    public Request(ReqHead reqHead, byte[] bArr) {
        this.head = reqHead;
        this.body = bArr;
    }
}
