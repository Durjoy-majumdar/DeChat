package com.tencent.p014mm.storage;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;

/* renamed from: com.tencent.mm.storage.o3 */
public class C96983o3 {

    /* renamed from: c */
    public static final C96983o3 f284131c = new C96983o3("timeline");

    /* renamed from: d */
    public static final C96983o3 f284132d = new C96983o3("album_friend");

    /* renamed from: e */
    public static final C96983o3 f284133e = new C96983o3("album_self");

    /* renamed from: f */
    public static final C96983o3 f284134f = new C96983o3("album_stranger");

    /* renamed from: g */
    public static final C96983o3 f284135g = new C96983o3("profile_friend");

    /* renamed from: h */
    public static final C96983o3 f284136h = new C96983o3("profile_stranger");

    /* renamed from: i */
    public static final C96983o3 f284137i = new C96983o3(FFmpegMetadataRetriever.METADATA_KEY_COMMENT);

    /* renamed from: j */
    public static final C96983o3 f284138j = new C96983o3("comment_detail");

    /* renamed from: k */
    public static final C96983o3 f284139k = new C96983o3("other");

    /* renamed from: l */
    public static final C96983o3 f284140l = new C96983o3("snssight");

    /* renamed from: m */
    public static final C96983o3 f284141m = new C96983o3("fts");

    /* renamed from: n */
    public static final C96983o3 f284142n = new C96983o3("storysight");

    /* renamed from: o */
    public static final C96983o3 f284143o = new C96983o3("storyalbum");

    /* renamed from: a */
    public String f284144a;

    /* renamed from: b */
    public int f284145b = 0;

    public C96983o3(String str) {
        this.f284144a = str;
    }

    /* renamed from: b */
    public static C96983o3 m124650b() {
        return new C96983o3("snssight");
    }

    /* renamed from: c */
    public static C96983o3 m124651c() {
        return new C96983o3("timeline");
    }

    /* renamed from: a */
    public C96983o3 mo135628a(int i) {
        this.f284145b = i;
        return this;
    }

    public boolean equals(Object obj) {
        return obj instanceof C96983o3 ? ((C96983o3) obj).f284144a.equals(this.f284144a) : super.equals(obj);
    }

    public String toString() {
        return this.f284144a + "@" + this.f284145b;
    }
}
