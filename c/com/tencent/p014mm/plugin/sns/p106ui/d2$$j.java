package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.sns.ui.d2$$j */
public class d2$$j {

    /* renamed from: a */
    public ArrayList<String> f279345a = new ArrayList<>();

    /* renamed from: b */
    public Map<String, Boolean> f279346b = new HashMap();

    /* renamed from: c */
    public Map<String, Integer> f279347c = new HashMap();

    public d2$$j(C95754d2 d2Var) {
    }

    /* renamed from: a */
    public static /* synthetic */ ArrayList m122603a(d2$$j d2__j) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        ArrayList<String> arrayList = d2__j.f279345a;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return arrayList;
    }

    /* renamed from: b */
    public d2$$j mo133207b(String str, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("addMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        this.f279345a.add(str);
        ((HashMap) this.f279347c).put(str, Integer.valueOf(i));
        ((HashMap) this.f279346b).put(str, Boolean.valueOf(z));
        Log.m105919d("MicroMsg.PicWidget", "addMedia: path:%s, filter:%b, isFromTakePicture:%b", str, Integer.valueOf(i), Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("addMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return this;
    }

    /* renamed from: c */
    public int mo133208c() {
        SnsMethodCalculate.markStartTimeMs("getMediaSize", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        int size = this.f279345a.size();
        SnsMethodCalculate.markEndTimeMs("getMediaSize", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return size;
    }

    /* renamed from: d */
    public ArrayList<String> mo133209d() {
        SnsMethodCalculate.markStartTimeMs("getMedias", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        ArrayList<String> arrayList = this.f279345a;
        SnsMethodCalculate.markEndTimeMs("getMedias", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return arrayList;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        Iterator<String> it = this.f279345a.iterator();
        String str = "";
        while (it.hasNext()) {
            String next = it.next();
            int i = 0;
            Map<String, Integer> map = this.f279347c;
            if (map != null) {
                i = ((Integer) ((HashMap) map).get(next)).intValue();
            }
            str = str + next + "," + i + ";";
        }
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return str;
    }
}
