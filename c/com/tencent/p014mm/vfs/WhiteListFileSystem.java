package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.FileSystem;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.WhiteListFileSystem */
class WhiteListFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<WhiteListFileSystem> CREATOR = new C116263a();

    /* renamed from: g */
    public static final Pattern f348892g = Pattern.compile("^[0-9a-f]{32}");

    /* renamed from: e */
    public final FileSystem f348893e;

    /* renamed from: f */
    public final String[] f348894f;

    /* renamed from: com.tencent.mm.vfs.WhiteListFileSystem$b */
    public class C86000b extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c f250467e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f250468f;

        /* renamed from: g */
        public final String[] f250469g;

        public C86000b(FileSystem.C85995c cVar, String[] strArr) {
            this.f250467e = cVar;
            this.f250468f = Collections.singletonList(cVar);
            this.f250469g = strArr;
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f250468f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f250467e;
        }

        /* renamed from: N */
        public final boolean mo119953N(String str, boolean z) {
            if (z) {
                str = C116299g2.m163852h(str);
            }
            if (str == null || str.isEmpty()) {
                return true;
            }
            int binarySearch = Arrays.binarySearch(this.f250469g, str + 0);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (-binarySearch) - 2;
            if (i < 0) {
                return false;
            }
            String str2 = this.f250469g[i];
            return str2.charAt(str2.length() - 1) == 0 ? str.startsWith(str2) && str.substring(str2.length()).indexOf(47) == -1 : str.startsWith(str2) && (str.length() == str2.length() || str.charAt(str2.length()) == '/');
        }

        /* renamed from: b */
        public WritableByteChannel mo119932b(String str, boolean z) {
            if (mo119953N(str, true)) {
                return super.mo119932b(str, z);
            }
            String str2 = "Path not in white list: " + str + " -> " + this.f250467e.mo119930u().toString();
            Log.m105920e("VFS.WhiteListFileSystem", str2);
            throw new AssertionError(str2);
        }

        /* renamed from: g */
        public boolean mo119937g(String str) {
            if (str.isEmpty() || mo119953N(str, false)) {
                return super.mo119937g(str);
            }
            if (WhiteListFileSystem.f348892g.matcher(str).matches()) {
                return super.mo119937g(str);
            }
            String str2 = "Path not in white list: " + str + " -> " + this.f250467e.mo119930u().toString();
            Log.m105920e("VFS.WhiteListFileSystem", str2);
            throw new AssertionError(str2);
        }

        /* renamed from: m */
        public OutputStream mo119941m(String str, boolean z) {
            if (mo119953N(str, true)) {
                return super.mo119941m(str, z);
            }
            String str2 = "Path not in white list: " + str + " -> " + this.f250467e.mo119930u().toString();
            Log.m105920e("VFS.WhiteListFileSystem", str2);
            throw new AssertionError(str2);
        }

        public String toString() {
            return "whiteList <- " + this.f250467e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return WhiteListFileSystem.this;
        }
    }

    /* renamed from: com.tencent.mm.vfs.WhiteListFileSystem$a */
    public class C116263a implements Parcelable.Creator<WhiteListFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new WhiteListFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new WhiteListFileSystem[i];
        }
    }

    public WhiteListFileSystem(FileSystem fileSystem, String[] strArr) {
        this.f348893e = fileSystem;
        this.f348894f = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str == null || str.isEmpty()) {
                this.f348894f[i] = null;
            } else if (str.charAt(str.length() - 1) == '*') {
                String[] strArr2 = this.f348894f;
                strArr2[i] = str.substring(0, str.length() - 1) + 0;
            } else {
                this.f348894f[i] = str;
            }
        }
    }

    public String toString() {
        return "whiteList <- " + this.f348893e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_BLUE && !BuildInfo.IS_FLAVOR_PURPLE) {
            return (FileSystem.C85995c) this.f348893e.mo177578v(map);
        }
        TreeSet treeSet = new TreeSet();
        for (String vVar : this.f348894f) {
            String[] b = new C116330v(vVar).mo177822b(map);
            if (b != null) {
                for (String str : b) {
                    if (!str.isEmpty() && !str.equals("\u0000")) {
                        treeSet.add(C116299g2.m163855k(str, true, true));
                    }
                }
            }
        }
        String str2 = null;
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (str2 == null || !str3.startsWith(str2) || str3.charAt(str2.length()) != '/') {
                str2 = str3;
            } else {
                it.remove();
            }
        }
        return new C86000b((FileSystem.C85995c) this.f348893e.mo177578v(map), (String[]) treeSet.toArray(new String[0]));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, WhiteListFileSystem.class, 1);
        parcel.writeParcelable(this.f348893e, i);
        parcel.writeStringArray(this.f348894f);
    }

    public WhiteListFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, WhiteListFileSystem.class, 1);
        this.f348893e = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f348894f = parcel.createStringArray();
    }
}
