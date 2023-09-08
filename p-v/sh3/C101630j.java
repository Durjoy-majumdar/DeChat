package sh3;

import com.tencent.p014mm.sticker.loader.StickerLoadInfo;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedList;
import rx3.C13598b0;
import u60.C65220d;
import u60.C65234n;

/* renamed from: sh3.j */
public abstract class C101630j extends C65220d {

    /* renamed from: f */
    public final StickerLoadInfo f297495f;

    /* renamed from: g */
    public final LinkedList<C32226l<Boolean, C13598b0>> f297496g = new LinkedList<>();

    public C101630j(StickerLoadInfo stickerLoadInfo) {
        C87412m.m108594g(stickerLoadInfo, "info");
        this.f297495f = stickerLoadInfo;
    }

    /* renamed from: e */
    public void mo141083e(boolean z) {
        for (C32226l invoke : this.f297496g) {
            invoke.invoke(Boolean.valueOf(z));
        }
        if (z) {
            mo11853b(C65234n.OK);
        } else {
            mo11853b(C65234n.Fail);
        }
    }
}
