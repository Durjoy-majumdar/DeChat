package cb3;

import ab3.C91983a;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import xa3.C102587c;

/* renamed from: cb3.d */
public class C92393d {

    /* renamed from: a */
    public int f264399a;

    /* renamed from: b */
    public int f264400b;

    /* renamed from: c */
    public int f264401c;

    /* renamed from: d */
    public int f264402d;

    /* renamed from: e */
    public C91983a f264403e;

    public C92393d(C91983a aVar) {
        this.f264403e = aVar;
        this.f264399a = -1;
        this.f264400b = -1;
        this.f264401c = -1;
        this.f264402d = -1;
    }

    /* renamed from: a */
    public int mo126357a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f264399a;
        if (i4 >= 0 && (i = this.f264400b) >= 0 && (i2 = this.f264401c) >= 0 && (i3 = this.f264402d) >= 0 && i4 <= i2 && (i4 != i2 || i <= i3)) {
            C102587c k = ((NoteEditorUI) this.f264403e).f283238X0.mo126201k(i4);
            C102587c k2 = ((NoteEditorUI) this.f264403e).f283238X0.mo126201k(this.f264401c);
            if (!(k == null || k2 == null)) {
                int i5 = this.f264399a;
                int i6 = this.f264401c;
                if (i5 == i6 && this.f264400b == this.f264402d) {
                    return 1;
                }
                return (i5 == i6 && k.mo142212c() == 1) ? 2 : 3;
            }
        }
        return 0;
    }

    public String toString() {
        return "NoteSelectInfo{sp=" + this.f264399a + ", so=" + this.f264400b + ", ep=" + this.f264401c + ", eo=" + this.f264402d + '}';
    }

    public C92393d(C91983a aVar, int i, int i2, int i3, int i4) {
        this.f264403e = aVar;
        this.f264399a = i;
        this.f264400b = i2;
        this.f264401c = i3;
        this.f264402d = i4;
    }
}
