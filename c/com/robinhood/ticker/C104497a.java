package com.robinhood.ticker;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.robinhood.ticker.a */
public class C104497a {

    /* renamed from: a */
    public final int f309691a;

    /* renamed from: b */
    public final char[] f309692b;

    /* renamed from: c */
    public final Map<Character, Integer> f309693c;

    /* renamed from: com.robinhood.ticker.a$a */
    public class C104498a {

        /* renamed from: a */
        public final int f309694a;

        /* renamed from: b */
        public final int f309695b;

        public C104498a(C104497a aVar, int i, int i2) {
            this.f309694a = i;
            this.f309695b = i2;
        }
    }

    public C104497a(String str) {
        int i = 0;
        if (!str.contains(Character.toString(0))) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            this.f309691a = length;
            this.f309693c = new HashMap(length);
            for (int i2 = 0; i2 < length; i2++) {
                this.f309693c.put(Character.valueOf(charArray[i2]), Integer.valueOf(i2));
            }
            char[] cArr = new char[((length * 2) + 1)];
            this.f309692b = cArr;
            cArr[0] = 0;
            while (i < length) {
                char[] cArr2 = this.f309692b;
                int i3 = i + 1;
                cArr2[i3] = charArray[i];
                cArr2[length + 1 + i] = charArray[i];
                i = i3;
            }
            return;
        }
        throw new IllegalArgumentException("You cannot include TickerUtils.EMPTY_CHAR in the character list.");
    }

    /* renamed from: a */
    public final int mo147124a(char c) {
        if (c == 0) {
            return 0;
        }
        if (!((HashMap) this.f309693c).containsKey(Character.valueOf(c))) {
            return -1;
        }
        return ((Integer) ((HashMap) this.f309693c).get(Character.valueOf(c))).intValue() + 1;
    }
}
