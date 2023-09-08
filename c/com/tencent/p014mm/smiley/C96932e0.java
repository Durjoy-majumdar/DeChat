package com.tencent.p014mm.smiley;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.util.LinkedList;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.smiley.e0 */
public final class C96932e0 implements C96974x {

    /* renamed from: a */
    public final int f283965a;

    /* renamed from: b */
    public final String f283966b;

    /* renamed from: c */
    public final String f283967c;

    /* renamed from: d */
    public final String f283968d;

    /* renamed from: e */
    public final int[] f283969e;

    public C96932e0(int i, String str, String str2, String str3) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, MimeTypes.BASE_TYPE_TEXT);
        this.f283965a = i;
        this.f283966b = str;
        this.f283967c = str2;
        this.f283968d = str3;
        int length = str2.length();
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str2.codePointAt(i2);
            linkedList.add(Integer.valueOf(codePointAt));
            i2 += Character.charCount(codePointAt);
        }
        this.f283969e = C110818d0.m150952x0(linkedList);
    }

    /* renamed from: a */
    public int[] mo135527a() {
        return this.f283969e;
    }
}
