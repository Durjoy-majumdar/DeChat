package com.tencent.p014mm.plugin.magicbrush;

import android.os.Parcel;
import android.os.Parcelable;
import d42.C86181h;
import d42.C86192w;
import d42.C86193x;
import e42.C7594e;
import e42.C86431j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import rx3.C13604l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/MBBuildConfig;", "Le42/e;", "T", "Landroid/os/Parcelable;", "mb-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.MBBuildConfig */
public final class MBBuildConfig<T extends C7594e> implements Parcelable {
    public static final Parcelable.Creator<MBBuildConfig<?>> CREATOR = new C85243a();

    /* renamed from: d */
    public final HashSet<C13604l<String, Boolean>> f248368d;

    /* renamed from: e */
    public final HashSet<String> f248369e;

    /* renamed from: f */
    public String f248370f;

    /* renamed from: g */
    public String f248371g;

    /* renamed from: h */
    public boolean f248372h;

    /* renamed from: i */
    public boolean f248373i;

    /* renamed from: j */
    public HashMap<String, C86431j<? extends T>> f248374j;

    /* renamed from: n */
    public C86193x f248375n;

    /* renamed from: o */
    public C86181h f248376o;

    /* renamed from: p */
    public C86192w f248377p;

    /* renamed from: q */
    public T f248378q;

    /* renamed from: com.tencent.mm.plugin.magicbrush.MBBuildConfig$a */
    public static final class C85243a implements Parcelable.Creator<MBBuildConfig<?>> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            int readInt = parcel.readInt();
            HashSet hashSet = new HashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                hashSet.add(parcel.readSerializable());
            }
            int readInt2 = parcel.readInt();
            HashSet hashSet2 = new HashSet(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                hashSet2.add(parcel.readString());
            }
            return new MBBuildConfig(hashSet, hashSet2, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new MBBuildConfig[i];
        }
    }

    public MBBuildConfig() {
        this((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
    }

    public MBBuildConfig(HashSet<C13604l<String, Boolean>> hashSet, HashSet<String> hashSet2, String str, String str2, boolean z, boolean z2) {
        C87412m.m108594g(hashSet, "jsapiNameSet");
        C87412m.m108594g(hashSet2, "extSet");
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "process");
        this.f248368d = hashSet;
        this.f248369e = hashSet2;
        this.f248370f = str;
        this.f248371g = str2;
        this.f248372h = z;
        this.f248373i = z2;
        this.f248374j = new HashMap<>();
    }

    /* renamed from: a */
    public final MBBuildConfig<T> mo118367a(Collection<? extends C86431j<? extends T>> collection) {
        C87412m.m108594g(collection, "jsapi");
        for (C86431j jVar : collection) {
            this.f248368d.add(new C13604l(jVar.mo16e(), Boolean.valueOf(jVar.mo120839f())));
            this.f248374j.put(jVar.mo16e(), jVar);
        }
        return this;
    }

    /* renamed from: b */
    public final T mo118368b() {
        T t = this.f248378q;
        if (t != null) {
            return t;
        }
        C87412m.m108603p("bizContext");
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MBBuildConfig)) {
            return false;
        }
        MBBuildConfig mBBuildConfig = (MBBuildConfig) obj;
        return C87412m.m108589b(this.f248368d, mBBuildConfig.f248368d) && C87412m.m108589b(this.f248369e, mBBuildConfig.f248369e) && C87412m.m108589b(this.f248370f, mBBuildConfig.f248370f) && C87412m.m108589b(this.f248371g, mBBuildConfig.f248371g) && this.f248372h == mBBuildConfig.f248372h && this.f248373i == mBBuildConfig.f248373i;
    }

    public int hashCode() {
        int hashCode = ((((((this.f248368d.hashCode() * 31) + this.f248369e.hashCode()) * 31) + this.f248370f.hashCode()) * 31) + this.f248371g.hashCode()) * 31;
        boolean z = this.f248372h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f248373i;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "MBBuildConfig(jsapiNameSet=" + this.f248368d + ", extSet=" + this.f248369e + ", sessionId=" + this.f248370f + ", process=" + this.f248371g + ", enableInspector=" + this.f248372h + ", enableRenderEngine=" + this.f248373i + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        HashSet<C13604l<String, Boolean>> hashSet = this.f248368d;
        parcel.writeInt(hashSet.size());
        Iterator<C13604l<String, Boolean>> it = hashSet.iterator();
        while (it.hasNext()) {
            parcel.writeSerializable(it.next());
        }
        HashSet<String> hashSet2 = this.f248369e;
        parcel.writeInt(hashSet2.size());
        Iterator<String> it4 = hashSet2.iterator();
        while (it4.hasNext()) {
            parcel.writeString(it4.next());
        }
        parcel.writeString(this.f248370f);
        parcel.writeString(this.f248371g);
        parcel.writeInt(this.f248372h ? 1 : 0);
        parcel.writeInt(this.f248373i ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MBBuildConfig(java.util.HashSet r5, java.util.HashSet r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10, int r11, gy3.C8480h r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0009
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
        L_0x0009:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x0012
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
        L_0x0012:
            r12 = r6
            r6 = r11 & 4
            java.lang.String r0 = ""
            if (r6 == 0) goto L_0x001b
            r1 = r0
            goto L_0x001c
        L_0x001b:
            r1 = r7
        L_0x001c:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = r8
        L_0x0022:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0029
            r9 = 0
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = r9
        L_0x002a:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0031
            r10 = 1
            r3 = 1
            goto L_0x0032
        L_0x0031:
            r3 = r10
        L_0x0032:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r0
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.magicbrush.MBBuildConfig.<init>(java.util.HashSet, java.util.HashSet, java.lang.String, java.lang.String, boolean, boolean, int, gy3.h):void");
    }
}
