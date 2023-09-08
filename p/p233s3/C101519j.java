package p233s3;

import android.view.Choreographer;
import android.view.View;
import gy3.C87412m;
import java.util.List;

/* renamed from: s3.j */
public class C101519j extends C101517i {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101519j(C101514g gVar, View view) {
        super(gVar, view);
        C87412m.m108594g(gVar, "jankStats");
        C87412m.m108594g(view, "view");
    }

    /* renamed from: b */
    public C101507b mo141004b(View view, Choreographer choreographer, List<C101525o> list) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(choreographer, "choreographer");
        C87412m.m108594g(list, "delegates");
        return new C101510c(view, choreographer, list);
    }
}
