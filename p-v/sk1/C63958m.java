package sk1;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import gy3.C87412m;
import pe3.C47465a;
import pe3.C89349b;
import tf1.C13914m;

/* renamed from: sk1.m */
public final class C63958m extends C63956k {

    /* renamed from: s */
    public FinderJumpInfo f181304s;

    /* renamed from: t */
    public final String f181305t;

    /* renamed from: u */
    public final String f181306u;

    /* renamed from: v */
    public final String f181307v;

    /* renamed from: w */
    public final String f181308w;

    /* renamed from: x */
    public final int f181309x;

    /* renamed from: y */
    public final String f181310y;

    public C63958m(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "data");
        this.f181304s = finderJumpInfo;
        this.f181305t = finderJumpInfo.recommend_reason;
        this.f181306u = finderJumpInfo.wording;
        this.f181307v = finderJumpInfo.icon_url;
        this.f181308w = finderJumpInfo.icon_name;
        this.f181309x = finderJumpInfo.support_share;
        String str = finderJumpInfo.jump_id;
        this.f181310y = str == null ? "" : str;
    }

    /* renamed from: a */
    public C89349b mo13072a() {
        return this.f181292e;
    }

    /* renamed from: b */
    public C47465a mo13073b() {
        return this.f181304s;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    /* renamed from: d */
    public long mo13074d() {
        return this.f181291d;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return 0;
    }

    public long getItemId() {
        return (long) this.f181304s.hashCode();
    }
}
