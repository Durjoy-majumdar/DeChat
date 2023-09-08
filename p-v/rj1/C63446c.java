package rj1;

import gy3.C8480h;
import java.util.LinkedList;
import te3.C50585ns0;
import te3.C51059r51;

/* renamed from: rj1.c */
public final class C63446c {

    /* renamed from: a */
    public final int f179952a;

    /* renamed from: b */
    public final int f179953b;

    /* renamed from: c */
    public final LinkedList<C51059r51> f179954c;

    /* renamed from: d */
    public final C51059r51 f179955d;

    /* renamed from: e */
    public final C50585ns0 f179956e;

    /* renamed from: f */
    public final String f179957f;

    public C63446c(int i, int i2, LinkedList<C51059r51> linkedList, C51059r51 r512, C50585ns0 ns02, String str, int i3, C8480h hVar) {
        linkedList = (i3 & 4) != 0 ? null : linkedList;
        r512 = (i3 & 8) != 0 ? null : r512;
        ns02 = (i3 & 16) != 0 ? null : ns02;
        str = (i3 & 32) != 0 ? "" : str;
        this.f179952a = i;
        this.f179953b = i2;
        this.f179954c = linkedList;
        this.f179955d = r512;
        this.f179956e = ns02;
        this.f179957f = str;
    }
}
