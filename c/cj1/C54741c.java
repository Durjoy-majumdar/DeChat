package cj1;

import al1.C54127h;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C9493c;
import pe3.C89349b;
import te3.C64331dw0;

/* renamed from: cj1.c */
public final class C54741c implements C9493c {

    /* renamed from: d */
    public final FinderJumpInfo f153440d;

    /* renamed from: e */
    public final ArrayList<C54127h> f153441e = new ArrayList<>();

    /* renamed from: f */
    public C89349b f153442f;

    /* renamed from: g */
    public int f153443g;

    /* renamed from: h */
    public C64331dw0 f153444h;

    public C54741c(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "data");
        this.f153440d = finderJumpInfo;
        this.f153444h = C54745d.f153453a.mo75642b(finderJumpInfo.ext_info);
    }

    /* renamed from: c */
    public int mo75c() {
        return 1;
    }

    public long getItemId() {
        return 0;
    }
}
