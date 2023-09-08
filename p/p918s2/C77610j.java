package p918s2;

import android.os.Bundle;
import java.util.Set;

/* renamed from: s2.j */
public final class C77610j {

    /* renamed from: a */
    public final String f226260a;

    /* renamed from: b */
    public final CharSequence f226261b;

    /* renamed from: c */
    public final CharSequence[] f226262c;

    /* renamed from: d */
    public final boolean f226263d;

    /* renamed from: e */
    public final int f226264e;

    /* renamed from: f */
    public final Bundle f226265f;

    /* renamed from: g */
    public final Set<String> f226266g;

    public C77610j(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f226260a = str;
        this.f226261b = charSequence;
        this.f226262c = charSequenceArr;
        this.f226263d = z;
        this.f226264e = i;
        this.f226265f = bundle;
        this.f226266g = set;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
}
