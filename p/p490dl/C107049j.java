package p490dl;

import com.google.android.gms.dynamite.ProviderConstants;
import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;
import uc0.C90638g;

/* renamed from: dl.j */
public final class C107049j extends C97484a {

    /* renamed from: b */
    public final String f320463b = "MicroMsg.EggListParser";

    /* renamed from: c */
    public final C90638g f320464c = new C90638g();

    /* renamed from: a */
    public void mo125838a(XmlPullParser xmlPullParser) {
        C87412m.m108594g(xmlPullParser, "parser");
        this.f320464c.f260402e = (double) mo136750c(xmlPullParser, ProviderConstants.API_COLNAME_FEATURE_VERSION);
        super.mo125838a(xmlPullParser);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if ((r9.length() > 0) != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if ((r9 == null || r9.length() == 0) == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008d, code lost:
        if (r3 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00aa, code lost:
        if (r9 == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b4, code lost:
        if (r8.f332888r == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bd, code lost:
        if (r8.f332885o == null) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo125836b(java.lang.String r8, org.xmlpull.v1.XmlPullParser r9) {
        /*
            r7 = this;
            java.lang.String r0 = "tag"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "parser"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "Item"
            boolean r0 = gy3.C87412m.m108589b(r8, r0)
            java.lang.String r1 = "ItemNew"
            r2 = 1
            if (r0 == 0) goto L_0x0017
            r0 = 1
            goto L_0x001b
        L_0x0017:
            boolean r0 = gy3.C87412m.m108589b(r8, r1)
        L_0x001b:
            if (r0 == 0) goto L_0x012f
            dl.i r0 = new dl.i
            boolean r8 = gy3.C87412m.m108589b(r8, r1)
            r0.<init>(r8)
            r0.mo125838a(r9)
            uc0.e r8 = r0.f320461c
            int r9 = r8.f332884n
            r1 = 3
            r3 = 10
            r4 = 4
            r5 = 0
            if (r9 < r3) goto L_0x0067
            int r3 = r8.f332887q
            r6 = 5
            if (r3 != r6) goto L_0x0067
            uc0.h r9 = r8.f332892v
            if (r9 == 0) goto L_0x004e
            java.lang.String r9 = r9.f332894d
            if (r9 == 0) goto L_0x004e
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0049
            r9 = 1
            goto L_0x004a
        L_0x0049:
            r9 = 0
        L_0x004a:
            if (r9 != r2) goto L_0x004e
            r9 = 1
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            if (r9 == 0) goto L_0x00d0
            uc0.h r9 = r8.f332892v
            java.lang.String r9 = r9.f332895e
            java.lang.String r1 = "info.miniAppInfo.userName"
            gy3.C87412m.m108593f(r9, r1)
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0062
            r9 = 1
            goto L_0x0063
        L_0x0062:
            r9 = 0
        L_0x0063:
            if (r9 == 0) goto L_0x00d0
            goto L_0x00c6
        L_0x0067:
            r3 = 8
            if (r9 < r3) goto L_0x007c
            java.lang.String r9 = r8.f332891u
            if (r9 == 0) goto L_0x0078
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r9 = 0
            goto L_0x0079
        L_0x0078:
            r9 = 1
        L_0x0079:
            if (r9 != 0) goto L_0x007c
            goto L_0x00c6
        L_0x007c:
            int r9 = r8.f332884n
            r3 = 0
            switch(r9) {
                case 0: goto L_0x00c8;
                case 1: goto L_0x00c0;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00b7;
                case 4: goto L_0x00ad;
                case 5: goto L_0x0090;
                case 6: goto L_0x0083;
                case 7: goto L_0x0090;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x00d0
        L_0x0083:
            int r9 = r8.f332887q
            if (r9 != r4) goto L_0x00c6
            uc0.i r9 = r8.f332889s
            if (r9 == 0) goto L_0x008d
            uc0.v r3 = r9.f332897e
        L_0x008d:
            if (r3 == 0) goto L_0x00d0
            goto L_0x00c6
        L_0x0090:
            int r9 = r8.f332887q
            if (r9 != r1) goto L_0x00c6
            uc0.r r9 = r8.f332885o
            if (r9 == 0) goto L_0x009a
            uc0.s r3 = r9.f332915x
        L_0x009a:
            if (r3 == 0) goto L_0x00d0
            java.lang.String r9 = r9.f332914w
            if (r9 == 0) goto L_0x00a9
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r9 = 0
            goto L_0x00aa
        L_0x00a9:
            r9 = 1
        L_0x00aa:
            if (r9 != 0) goto L_0x00d0
            goto L_0x00c6
        L_0x00ad:
            int r9 = r8.f332887q
            r1 = 2
            if (r9 != r1) goto L_0x00c6
            uc0.d r9 = r8.f332888r
            if (r9 == 0) goto L_0x00d0
            goto L_0x00c6
        L_0x00b7:
            int r9 = r8.f332887q
            if (r2 != r9) goto L_0x00c6
            uc0.r r9 = r8.f332885o
            if (r9 == 0) goto L_0x00d0
            goto L_0x00c6
        L_0x00c0:
            int r9 = r8.f332887q
            if (r9 == 0) goto L_0x00c6
            r8.f332887q = r5
        L_0x00c6:
            r9 = 1
            goto L_0x00d1
        L_0x00c8:
            int r9 = r8.f332887q
            if (r9 == 0) goto L_0x00ce
            r8.f332887q = r5
        L_0x00ce:
            r9 = 1
            goto L_0x00d2
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            r1 = 4
        L_0x00d2:
            java.util.LinkedList<uc0.v> r3 = r8.f332886p
            java.util.Iterator r3 = r3.iterator()
        L_0x00d8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00eb
            java.lang.Object r4 = r3.next()
            uc0.v r4 = (uc0.C111157v) r4
            int r6 = r4.f332918e
            if (r6 <= r1) goto L_0x00d8
            r4.f332918e = r5
            goto L_0x00d8
        L_0x00eb:
            java.lang.String r1 = r7.f320463b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "validEggInfo: "
            r3.append(r4)
            java.lang.String r4 = r8.f332878e
            r3.append(r4)
            java.lang.String r4 = ", "
            r3.append(r4)
            int r6 = r8.f332884n
            r3.append(r6)
            r3.append(r4)
            int r6 = r8.f332887q
            r3.append(r6)
            r3.append(r4)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            int r8 = r8.f332884n
            r9 = 11
            if (r8 > r9) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r2 = 0
        L_0x0123:
            if (r2 == 0) goto L_0x0132
            uc0.g r8 = r7.f320464c
            java.util.LinkedList<uc0.e> r8 = r8.f260401d
            uc0.e r9 = r0.f320461c
            r8.add(r9)
            goto L_0x0132
        L_0x012f:
            r7.mo136754g(r9)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p490dl.C107049j.mo125836b(java.lang.String, org.xmlpull.v1.XmlPullParser):void");
    }
}
