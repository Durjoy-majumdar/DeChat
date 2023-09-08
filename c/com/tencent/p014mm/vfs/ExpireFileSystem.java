package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.ExpireFileSystem */
public class ExpireFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<ExpireFileSystem> CREATOR = new C116211a();

    /* renamed from: e */
    public final FileSystem f348751e;

    /* renamed from: f */
    public final long f348752f;

    /* renamed from: g */
    public final C116330v f348753g;

    /* renamed from: com.tencent.mm.vfs.ExpireFileSystem$a */
    public class C116211a implements Parcelable.Creator<ExpireFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new ExpireFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new ExpireFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.ExpireFileSystem$b */
    public class C116212b extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c f348754e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f348755f;

        /* renamed from: g */
        public final long f348756g;

        public C116212b(FileSystem.C85995c cVar, long j, Map<String, Object> map) {
            super(ExpireFileSystem.this, map);
            this.f348754e = cVar;
            this.f348755f = Collections.singletonList(cVar);
            this.f348756g = j;
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348755f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f348754e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo119928a(android.os.CancellationSignal r20) {
            /*
                r19 = this;
                r1 = r19
                java.lang.String r2 = "deleteFiles"
                java.lang.String r3 = "deleteSize"
                long r4 = java.lang.System.currentTimeMillis()
                long r6 = r1.f348756g
                long r4 = r4 - r6
                r9 = 4
                r11 = 0
                r12 = 1
                com.tencent.mm.vfs.FileSystem$c r0 = r1.f348754e     // Catch:{ Exception -> 0x0087, all -> 0x007f }
                java.lang.String r13 = ""
                r14 = 0
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C116299g2.m163860p(r0, r13, r12, r14)     // Catch:{ Exception -> 0x0087, all -> 0x007f }
                if (r0 == 0) goto L_0x005f
                qp3.a r0 = (qp3.C118196a) r0     // Catch:{ Exception -> 0x0087, all -> 0x007f }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0087, all -> 0x007f }
                r13 = 0
                r15 = 0
            L_0x0024:
                boolean r16 = r0.hasNext()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
                if (r16 == 0) goto L_0x0057
                java.lang.Object r16 = r0.next()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
                r10 = r16
                com.tencent.mm.vfs.b0 r10 = (com.tencent.p014mm.vfs.C86001b0) r10     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
                r20.throwIfCanceled()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
                boolean r6 = r10.f250476f     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
                if (r6 != 0) goto L_0x0054
                long r7 = r10.f250475e     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
                int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0040
                goto L_0x0054
            L_0x0040:
                boolean r6 = r10.mo119955b(r12)     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
                if (r6 == 0) goto L_0x0054
                long r6 = r10.f250474d     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
                r17 = 0
                int r8 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
                if (r8 >= 0) goto L_0x0050
                long r6 = r10.f250473c     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            L_0x0050:
                long r13 = r13 + r6
                int r15 = r15 + 1
                goto L_0x0024
            L_0x0054:
                r17 = 0
                goto L_0x0024
            L_0x0057:
                r7 = r13
                goto L_0x0064
            L_0x0059:
                r0 = move-exception
                r7 = r13
                goto L_0x0098
            L_0x005c:
                r0 = move-exception
                r7 = r13
                goto L_0x008d
            L_0x005f:
                r17 = 0
                r7 = r17
                r15 = 0
            L_0x0064:
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r11] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r7)
                r0[r12] = r3
                r3 = 2
                r0[r3] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
                r3 = 3
                r0[r3] = r2
                r1.mo177781F(r3, r0)
                super.mo119928a(r20)
                return
            L_0x007f:
                r0 = move-exception
                r17 = 0
                r7 = r17
                r4 = 3
                r15 = 0
                goto L_0x0099
            L_0x0087:
                r0 = move-exception
                r17 = 0
                r7 = r17
                r15 = 0
            L_0x008d:
                boolean r4 = r0 instanceof android.os.OperationCanceledException     // Catch:{ all -> 0x0097 }
                if (r4 == 0) goto L_0x0093
                r4 = 4
                goto L_0x0094
            L_0x0093:
                r4 = 5
            L_0x0094:
                throw r0     // Catch:{ all -> 0x0095 }
            L_0x0095:
                r0 = move-exception
                goto L_0x0099
            L_0x0097:
                r0 = move-exception
            L_0x0098:
                r4 = 3
            L_0x0099:
                java.lang.Object[] r5 = new java.lang.Object[r9]
                r5[r11] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r7)
                r5[r12] = r3
                r3 = 2
                r5[r3] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
                r3 = 3
                r5[r3] = r2
                r1.mo177781F(r4, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.ExpireFileSystem.C116212b.mo119928a(android.os.CancellationSignal):void");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C116212b)) {
                return false;
            }
            C116212b bVar = (C116212b) obj;
            return this.f348754e.equals(bVar.f348754e) && this.f348756g == bVar.f348756g;
        }

        public int hashCode() {
            int hashCode = C116212b.class.hashCode();
            Object[] objArr = {this.f348754e, Long.valueOf(this.f348756g)};
            Pattern pattern = C116299g2.f349012a;
            return hashCode ^ Arrays.deepHashCode(objArr);
        }

        public String toString() {
            return "expire(" + C116299g2.m163851g(this.f348756g) + ") <- " + this.f348754e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return ExpireFileSystem.this;
        }
    }

    public ExpireFileSystem(FileSystem fileSystem, long j) {
        this.f348751e = fileSystem;
        this.f348752f = j;
        this.f348753g = null;
    }

    /* renamed from: b */
    public FileSystem.C85995c mo177578v(Map<String, Object> map) {
        FileSystem.C85995c cVar = (FileSystem.C85995c) this.f348751e.mo177578v(map);
        C116330v vVar = this.f348753g;
        return new C116212b(cVar, vVar == null ? this.f348752f : C116299g2.m163857m(vVar.mo177821a(map), this.f348752f), map);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpireFileSystem)) {
            return false;
        }
        ExpireFileSystem expireFileSystem = (ExpireFileSystem) obj;
        return this.f348751e.equals(expireFileSystem.f348751e) && this.f348752f == expireFileSystem.f348752f && C116299g2.m163849e(this.f348753g, expireFileSystem.f348753g);
    }

    public int hashCode() {
        int hashCode = ExpireFileSystem.class.hashCode();
        Object[] objArr = {this.f348751e, Long.valueOf(this.f348752f), this.f348753g};
        Pattern pattern = C116299g2.f349012a;
        return hashCode ^ Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("expire(");
        C116330v vVar = this.f348753g;
        sb.append(vVar == null ? C116299g2.m163851g(this.f348752f) : vVar.toString());
        sb.append(") <- ");
        sb.append(this.f348751e);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, ExpireFileSystem.class, 2);
        parcel.writeParcelable(this.f348751e, i);
        parcel.writeLong(this.f348752f);
        C116330v vVar = this.f348753g;
        parcel.writeString(vVar == null ? null : vVar.f349099a);
    }

    public ExpireFileSystem(FileSystem fileSystem, long j, String str) {
        C116330v vVar;
        this.f348751e = fileSystem;
        this.f348752f = j;
        if (str == null) {
            vVar = null;
        } else {
            vVar = new C116330v(str);
        }
        this.f348753g = vVar;
    }

    public ExpireFileSystem(Parcel parcel) {
        C116330v vVar;
        C116299g2.m163845a(parcel, ExpireFileSystem.class, 2);
        FileSystem fileSystem = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f348751e = fileSystem;
        if (fileSystem != null) {
            this.f348752f = parcel.readLong();
            String readString = parcel.readString();
            if (readString == null) {
                vVar = null;
            } else {
                vVar = new C116330v(readString);
            }
            this.f348753g = vVar;
            return;
        }
        throw new IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
