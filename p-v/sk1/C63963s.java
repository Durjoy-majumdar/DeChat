package sk1;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import gy3.C87412m;
import pe3.C47465a;
import pe3.C89349b;
import te3.C50626o21;
import tf1.C13914m;

/* renamed from: sk1.s */
public final class C63963s extends C63956k {

    /* renamed from: s */
    public C50626o21 f181315s;

    /* renamed from: t */
    public final String f181316t;

    /* renamed from: u */
    public final String f181317u;

    /* renamed from: v */
    public final String f181318v;

    /* renamed from: w */
    public final String f181319w;

    /* renamed from: x */
    public final String f181320x;

    public C63963s(C50626o21 o212) {
        String str;
        C87412m.m108594g(o212, "data");
        this.f181315s = o212;
        FinderJumpInfo finderJumpInfo = o212.f138912d;
        String str2 = null;
        this.f181316t = finderJumpInfo != null ? finderJumpInfo.recommend_reason : null;
        this.f181317u = finderJumpInfo != null ? finderJumpInfo.wording : null;
        this.f181318v = finderJumpInfo != null ? finderJumpInfo.icon_url : null;
        this.f181319w = finderJumpInfo != null ? finderJumpInfo.icon_name : str2;
        FinderJumpInfo finderJumpInfo2 = this.f181315s.f138912d;
        this.f181320x = (finderJumpInfo2 == null || (str = finderJumpInfo2.jump_id) == null) ? "" : str;
    }

    /* renamed from: a */
    public C89349b mo13072a() {
        return this.f181292e;
    }

    /* renamed from: b */
    public C47465a mo13073b() {
        return this.f181315s;
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
        return (long) this.f181315s.hashCode();
    }
}
