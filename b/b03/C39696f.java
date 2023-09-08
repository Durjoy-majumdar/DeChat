package b03;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import gy3.C87412m;
import java.nio.charset.Charset;
import p823sg.C90193h;
import z04.C119027c;

/* renamed from: b03.f */
public final class C39696f {

    /* renamed from: a */
    public static final C39696f f106501a = new C39696f();

    /* renamed from: a */
    public final void mo62318a(String str, int i) {
        C87412m.m108594g(str, "username");
        boolean z = false;
        boolean h = (i & 1) > 0 ? C86013q1.m106447h(mo62321d("thumb", str)) : false;
        boolean h2 = (i & 2) > 0 ? C86013q1.m106447h(mo62321d("image", str)) : false;
        if ((i & 4) > 0) {
            z = C86013q1.m106447h(mo62321d("video", str));
        }
        Log.m105924i("MicroMsg.TextStatus.PathProvider", "clearPath " + i + ' ' + str + ' ' + h + ' ' + h2 + ' ' + z);
    }

    /* renamed from: b */
    public final String mo62319b(String str, String str2) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "username");
        StringBuilder sb = new StringBuilder();
        sb.append(mo62322e());
        sb.append("history/");
        Charset charset = C119027c.f356488a;
        byte[] bytes = str2.getBytes(charset);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(C90193h.m112878f(bytes));
        String sb4 = sb.toString();
        if (!C86013q1.m106450k(sb4)) {
            C86013q1.m106461v(sb4);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(XVFSFile.SEPARATOR_CHAR);
        byte[] bytes2 = str.getBytes(charset);
        C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
        sb5.append(C90193h.m112878f(bytes2));
        return sb5.toString();
    }

    /* renamed from: c */
    public final String mo62320c(String str) {
        C87412m.m108594g(str, "username");
        String str2 = mo62322e() + "local/video";
        if (!C86013q1.m106450k(str2)) {
            C86013q1.m106461v(str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(C90193h.m112878f(bytes));
        return sb.toString();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r3.equals("video") != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        if (r3.equals("thumb") == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (r3.equals("image") == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r3.equals("ptmptmb") == false) goto L_0x0043;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo62321d(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "type"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "username"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.mo62322e()
            r0.append(r1)
            int r1 = r3.hashCode()
            switch(r1) {
                case -253705982: goto L_0x003b;
                case 100313435: goto L_0x0032;
                case 110342614: goto L_0x0029;
                case 112202875: goto L_0x001f;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0043
        L_0x001f:
            java.lang.String r1 = "video"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0029:
            java.lang.String r1 = "thumb"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0045
            goto L_0x0043
        L_0x0032:
            java.lang.String r1 = "image"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0045
            goto L_0x0043
        L_0x003b:
            java.lang.String r1 = "ptmptmb"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r3 = "other"
        L_0x0045:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r0 != 0) goto L_0x0055
            com.tencent.p014mm.vfs.C86013q1.m106461v(r3)
        L_0x0055:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 47
            r0.append(r3)
            java.nio.charset.Charset r3 = z04.C119027c.f356488a
            byte[] r3 = r4.getBytes(r3)
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.String r3 = p823sg.C90193h.m112878f(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39696f.mo62321d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public final String mo62322e() {
        return C86709a0.m107535s().f251806d + "textstatus/";
    }
}
