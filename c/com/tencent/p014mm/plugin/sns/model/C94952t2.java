package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.plugin.sns.model.t2 */
public class C94952t2 {

    /* renamed from: a */
    public String f275254a;

    /* renamed from: b */
    public String f275255b;

    /* renamed from: c */
    public int f275256c;

    /* renamed from: d */
    public C101804kv2 f275257d;

    /* renamed from: e */
    public int f275258e;

    /* renamed from: f */
    public String f275259f;

    /* renamed from: g */
    public int f275260g;

    /* renamed from: h */
    public int f275261h;

    /* renamed from: i */
    public int f275262i;

    /* renamed from: j */
    public int f275263j;

    /* renamed from: k */
    public int f275264k;

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.VideoTask");
        String str = "cdnMediaId " + this.f275255b + " isPlayMode " + this.f275256c + " createTime " + this.f275258e + " snsLocalId " + this.f275259f + " postName " + this.f275254a + " url " + this.f275257d.f298692g + " videoFlag " + this.f275257d.f298687U + " progress " + this.f275261h + " totalLength " + this.f275262i + " moovOffset " + this.f275263j + " moovLength " + this.f275264k;
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.VideoTask");
        return str;
    }
}
