package com.tencent.p014mm.plugin.sight.base;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.sight.base.a */
public class C94554a {

    /* renamed from: a */
    public int f273443a = 0;

    /* renamed from: b */
    public int f273444b = 0;

    /* renamed from: c */
    public int f273445c = 0;

    /* renamed from: d */
    public int f273446d = 0;

    /* renamed from: e */
    public int f273447e = 0;

    /* renamed from: f */
    public int f273448f = 0;

    /* renamed from: g */
    public int f273449g = 0;

    /* renamed from: h */
    public int f273450h = 0;

    /* renamed from: i */
    public int f273451i = 0;

    /* renamed from: j */
    public int f273452j = 0;

    /* renamed from: k */
    public int f273453k = 0;

    /* renamed from: l */
    public int f273454l = -1;

    /* renamed from: m */
    public boolean f273455m = false;

    /* renamed from: n */
    public int f273456n = -1;

    /* renamed from: o */
    public String f273457o = "";

    /* renamed from: p */
    public String f273458p = "";

    /* renamed from: a */
    public int mo130041a() {
        return Util.videoMsToSec((long) this.f273443a);
    }

    public String toString() {
        return "[ videoDuration: " + this.f273443a + " videoBitrate: " + this.f273444b + " width: " + this.f273445c + " height: " + this.f273446d + " frameRate: " + this.f273447e + " audioChannel: " + this.f273448f + " audioBitrate: " + this.f273449g + " audioSampleRate: " + this.f273450h + " useABA: " + this.f273451i + " useMinMaxQP: " + this.f273452j + " bitrateAdaptiveUp: " + this.f273453k + " hasH264: " + this.f273455m + "]";
    }
}
