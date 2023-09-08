package vr2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.LinkedList;
import java.util.List;
import te3.C101804kv2;

/* renamed from: vr2.v */
public class C102268v {

    /* renamed from: a */
    public List<C101804kv2> f301200a;

    /* renamed from: b */
    public String f301201b;

    /* renamed from: c */
    public int f301202c;

    public C102268v() {
        this.f301200a = new LinkedList();
    }

    /* renamed from: a */
    public int mo141829a() {
        SnsMethodCalculate.markStartTimeMs("getDecodeType", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        int i = this.f301202c;
        SnsMethodCalculate.markEndTimeMs("getDecodeType", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        return i;
    }

    /* renamed from: b */
    public List<C101804kv2> mo141830b() {
        SnsMethodCalculate.markStartTimeMs("getMediaList", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        List<C101804kv2> list = this.f301200a;
        SnsMethodCalculate.markEndTimeMs("getMediaList", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        return list;
    }

    /* renamed from: c */
    public String mo141831c() {
        SnsMethodCalculate.markStartTimeMs("getRequestId", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        String str = this.f301201b;
        SnsMethodCalculate.markEndTimeMs("getRequestId", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        return str;
    }

    /* renamed from: d */
    public void mo141832d(int i) {
        SnsMethodCalculate.markStartTimeMs("setDecodeType", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        this.f301202c = i;
        SnsMethodCalculate.markEndTimeMs("setDecodeType", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
    }

    /* renamed from: e */
    public void mo141833e(String str) {
        SnsMethodCalculate.markStartTimeMs("setRequestId", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
        this.f301201b = str;
        SnsMethodCalculate.markEndTimeMs("setRequestId", "com.tencent.mm.plugin.sns.data.SnsDecodeElment");
    }

    public C102268v(C101804kv2 kv22) {
        LinkedList linkedList = new LinkedList();
        this.f301200a = linkedList;
        linkedList.add(kv22);
    }

    public C102268v(List<C101804kv2> list) {
        new LinkedList();
        this.f301200a = list;
    }
}
