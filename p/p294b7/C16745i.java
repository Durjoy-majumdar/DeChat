package p294b7;

import java.util.regex.Pattern;

/* renamed from: b7.i */
public final class C16745i {

    /* renamed from: c */
    public static final Pattern f45247c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f45248a = -1;

    /* renamed from: b */
    public int f45249b = -1;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17753a(com.google.android.exoplayer2.metadata.Metadata r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = r8.f45801d
            int r3 = r2.length
            if (r1 >= r3) goto L_0x004c
            r2 = r2[r1]
            boolean r3 = r2 instanceof com.google.android.exoplayer2.metadata.id3.CommentFrame
            if (r3 == 0) goto L_0x0049
            com.google.android.exoplayer2.metadata.id3.CommentFrame r2 = (com.google.android.exoplayer2.metadata.id3.CommentFrame) r2
            java.lang.String r3 = r2.f45814f
            java.lang.String r2 = r2.f45815g
            java.lang.String r4 = "iTunSMPB"
            boolean r3 = r4.equals(r3)
            r4 = 1
            if (r3 != 0) goto L_0x001e
        L_0x001c:
            r2 = 0
            goto L_0x0046
        L_0x001e:
            java.util.regex.Pattern r3 = f45247c
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.find()
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = r2.group(r4)     // Catch:{ NumberFormatException -> 0x001c }
            r5 = 16
            int r3 = java.lang.Integer.parseInt(r3, r5)     // Catch:{ NumberFormatException -> 0x001c }
            r6 = 2
            java.lang.String r2 = r2.group(r6)     // Catch:{ NumberFormatException -> 0x001c }
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch:{ NumberFormatException -> 0x001c }
            if (r3 > 0) goto L_0x0041
            if (r2 <= 0) goto L_0x001c
        L_0x0041:
            r7.f45248a = r3     // Catch:{ NumberFormatException -> 0x001c }
            r7.f45249b = r2     // Catch:{ NumberFormatException -> 0x001c }
            r2 = 1
        L_0x0046:
            if (r2 == 0) goto L_0x0049
            return r4
        L_0x0049:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p294b7.C16745i.mo17753a(com.google.android.exoplayer2.metadata.Metadata):boolean");
    }
}
