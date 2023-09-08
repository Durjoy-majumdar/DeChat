package com.tencent.p014mm.vfs;

import android.os.Parcel;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qp3.C118196a;

/* renamed from: com.tencent.mm.vfs.w */
public final class C116335w {

    /* renamed from: a */
    public final Object[] f349111a;

    public C116335w(Object... objArr) {
        Object[] objArr2 = new Object[objArr.length];
        this.f349111a = objArr2;
        int i = 0;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        int length = objArr2.length;
        while (i < length) {
            Object obj = objArr2[i];
            if ((obj instanceof FileSystem) || (obj instanceof C116336a)) {
                i++;
            } else {
                throw new IllegalArgumentException("Invalid type of FileSystem: " + obj.getClass());
            }
        }
    }

    /* renamed from: a */
    public List<FileSystem.C85995c> mo177834a(Map<String, Object> map) {
        Iterable<FileSystem.C85995c> a;
        ArrayList arrayList = new ArrayList(this.f349111a.length);
        for (Object obj : this.f349111a) {
            if (obj instanceof FileSystem) {
                FileSystem.C85995c cVar = (FileSystem.C85995c) ((FileSystem) obj).mo177578v(map);
                if (cVar != NullFileSystem.m163697z()) {
                    arrayList.add(cVar);
                }
            } else if ((obj instanceof C116336a) && (a = ((C116336a) obj).mo177839a(map)) != null) {
                Iterator it = ((C118196a) a).iterator();
                while (it.hasNext()) {
                    arrayList.add((FileSystem.C85995c) it.next());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo177835b(Parcel parcel) {
        parcel.writeInt(this.f349111a.length);
        for (Object obj : this.f349111a) {
            if (obj instanceof FileSystem) {
                parcel.writeByte((byte) 0);
                parcel.writeParcelable((FileSystem) obj, 0);
            } else if (obj instanceof C116336a) {
                parcel.writeByte((byte) 1);
                ((C116336a) obj).mo177841c(parcel);
            }
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C116335w) && Arrays.equals(this.f349111a, ((C116335w) obj).f349111a);
    }

    public int hashCode() {
        return C116335w.class.hashCode() ^ Arrays.hashCode(this.f349111a);
    }

    public String toString() {
        return Arrays.toString(this.f349111a);
    }

    /* renamed from: com.tencent.mm.vfs.w$a */
    public static final class C116336a {

        /* renamed from: f */
        public static final Pattern f349112f = Pattern.compile("[A-Za-z0-9_]+");

        /* renamed from: a */
        public final Object f349113a;

        /* renamed from: b */
        public final C116330v f349114b;

        /* renamed from: c */
        public final String f349115c;

        /* renamed from: d */
        public ArrayList<String> f349116d;

        /* renamed from: e */
        public char f349117e;

        /* renamed from: com.tencent.mm.vfs.w$a$a */
        public class C116337a implements C118196a.C89789a<String, FileSystem.C85995c> {

            /* renamed from: a */
            public final /* synthetic */ Map f349118a;

            public C116337a(Map map) {
                this.f349118a = map;
            }

            /* renamed from: a */
            public Iterable mo119949a(Object obj) {
                String str = (String) obj;
                HashMap hashMap = new HashMap(this.f349118a);
                C116336a aVar = C116336a.this;
                if (aVar.f349116d == null) {
                    hashMap.put(aVar.f349115c, str);
                } else {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        int indexOf = str.indexOf(C116336a.this.f349117e, i);
                        if (indexOf < 0 || C116336a.this.f349116d.size() - i2 <= 1) {
                            hashMap.put(C116336a.this.f349116d.get(i2), str.substring(i));
                        } else {
                            hashMap.put(C116336a.this.f349116d.get(i2), str.substring(i, indexOf));
                            i = indexOf + 1;
                            i2++;
                        }
                    }
                    hashMap.put(C116336a.this.f349116d.get(i2), str.substring(i));
                }
                Object obj2 = C116336a.this.f349113a;
                if (!(obj2 instanceof FileSystem)) {
                    return ((C116336a) obj2).mo177839a(hashMap);
                }
                FileSystem.C85995c cVar = (FileSystem.C85995c) ((FileSystem) obj2).mo177578v(hashMap);
                if (cVar == NullFileSystem.m163697z()) {
                    return null;
                }
                return Collections.singleton(cVar);
            }
        }

        public C116336a(FileSystem fileSystem, String str, String str2) {
            this.f349113a = fileSystem;
            this.f349114b = new C116330v(str);
            this.f349115c = str2;
            mo177840b();
        }

        /* renamed from: a */
        public Iterable<FileSystem.C85995c> mo177839a(Map<String, Object> map) {
            String[] b = this.f349114b.mo177822b(map);
            if (b == null) {
                return null;
            }
            return new C118196a(Arrays.asList(b), new C116337a(map));
        }

        /* renamed from: b */
        public final void mo177840b() {
            Matcher matcher = f349112f.matcher(this.f349115c);
            if (matcher.find()) {
                int end = matcher.end();
                if (end == this.f349115c.length()) {
                    this.f349116d = null;
                    return;
                }
                this.f349117e = this.f349115c.charAt(end);
                this.f349116d = new ArrayList<>();
                do {
                    this.f349116d.add(matcher.group());
                } while (matcher.find());
                return;
            }
            throw new IllegalArgumentException("No output variable recognized: " + this.f349115c);
        }

        /* renamed from: c */
        public void mo177841c(Parcel parcel) {
            parcel.writeString(this.f349114b.f349099a);
            parcel.writeString(this.f349115c);
            if (this.f349113a instanceof FileSystem) {
                parcel.writeByte((byte) 0);
                parcel.writeParcelable((FileSystem) this.f349113a, 0);
                return;
            }
            parcel.writeByte((byte) 1);
            ((C116336a) this.f349113a).mo177841c(parcel);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C116336a)) {
                return false;
            }
            C116336a aVar = (C116336a) obj;
            return this.f349113a.equals(aVar.f349113a) && this.f349114b.equals(aVar.f349114b) && this.f349115c.equals(aVar.f349115c);
        }

        public int hashCode() {
            Object[] objArr = {this.f349113a, this.f349114b, this.f349115c};
            Pattern pattern = C116299g2.f349012a;
            return Arrays.deepHashCode(objArr);
        }

        public String toString() {
            return "$:" + this.f349113a;
        }

        public C116336a(Parcel parcel) {
            this.f349114b = new C116330v(parcel.readString());
            this.f349115c = parcel.readString();
            if (parcel.readByte() == 0) {
                this.f349113a = parcel.readParcelable(C116336a.class.getClassLoader());
            } else {
                this.f349113a = new C116336a(parcel);
            }
            mo177840b();
        }
    }

    public C116335w(Collection<?> collection) {
        Object[] array = collection.toArray();
        this.f349111a = array;
        int length = array.length;
        int i = 0;
        while (i < length) {
            Object obj = array[i];
            if ((obj instanceof FileSystem) || (obj instanceof C116336a)) {
                i++;
            } else {
                throw new IllegalArgumentException("Invalid type of FileSystem: " + obj.getClass());
            }
        }
    }

    public C116335w(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f349111a = new Object[readInt];
        for (int i = 0; i < readInt; i++) {
            byte readByte = parcel.readByte();
            if (readByte == 0) {
                this.f349111a[i] = parcel.readParcelable(C116335w.class.getClassLoader());
            } else if (readByte == 1) {
                this.f349111a[i] = new C116336a(parcel);
            }
        }
    }
}
