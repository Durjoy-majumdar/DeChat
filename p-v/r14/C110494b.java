package r14;

import com.tencent.xweb.file.XVFSFile;

/* renamed from: r14.b */
public final class C110494b {

    /* renamed from: a */
    public static final char[] f330396a = new char[117];

    static {
        C110494b bVar = new C110494b();
        for (int i = 0; i <= 31; i++) {
            bVar.mo161960a(i, 'u');
        }
        bVar.mo161960a(8, 'b');
        bVar.mo161960a(9, 't');
        bVar.mo161960a(10, 'n');
        bVar.mo161960a(12, 'f');
        bVar.mo161960a(13, 'r');
        bVar.mo161960a(47, XVFSFile.SEPARATOR_CHAR);
        bVar.mo161960a(34, '\"');
        bVar.mo161960a(92, '\\');
    }

    /* renamed from: a */
    public final void mo161960a(int i, char c) {
        if (c != 'u') {
            f330396a[c] = (char) i;
        }
    }
}
