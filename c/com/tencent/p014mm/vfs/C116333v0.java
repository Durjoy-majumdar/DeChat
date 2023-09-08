package com.tencent.p014mm.vfs;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Printer;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.SchemeResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.v0 */
public final class C116333v0 {

    /* renamed from: g */
    public static final Comparator<C116330v> f349104g = new C116334a();

    /* renamed from: a */
    public final Map<String, C116342y0<SchemeResolver, SchemeResolver.C116250a>> f349105a;

    /* renamed from: b */
    public final Map<String, C116342y0<FileSystem, FileSystem.C85995c>> f349106b;

    /* renamed from: c */
    public final Map<String, C116342y0<FileSystem, FileSystem.C85995c>> f349107c;

    /* renamed from: d */
    public final SortedMap<C116330v, String> f349108d;

    /* renamed from: e */
    public final Map<String, Object> f349109e;

    /* renamed from: f */
    public C116342y0<FileSystem, FileSystem.C85995c> f349110f;

    /* renamed from: com.tencent.mm.vfs.v0$a */
    public class C116334a implements Comparator<C116330v> {
        public int compare(Object obj, Object obj2) {
            return ((C116330v) obj).f349099a.compareTo(((C116330v) obj2).f349099a);
        }
    }

    public C116333v0() {
        this.f349105a = new LinkedHashMap();
        this.f349106b = new LinkedHashMap();
        this.f349107c = new LinkedHashMap();
        this.f349108d = new TreeMap(f349104g);
        this.f349109e = new LinkedHashMap();
        this.f349110f = null;
    }

    /* renamed from: b */
    public static C116333v0 m163940b(Bundle bundle) {
        C116333v0 v0Var = new C116333v0();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("sl");
        Bundle bundle2 = bundle.getBundle("sm");
        if (!(parcelableArrayList == null || bundle2 == null)) {
            for (String next : bundle2.keySet()) {
                int i = bundle2.getInt(next);
                if (i >= 0 && i < parcelableArrayList.size()) {
                    v0Var.f349105a.put(next, new C116342y0((SchemeResolver) parcelableArrayList.get(i)));
                }
            }
        }
        Bundle bundle3 = bundle.getBundle("fs");
        if (bundle3 != null) {
            bundle3.setClassLoader(bundle.getClassLoader());
            for (String next2 : bundle3.keySet()) {
                v0Var.f349106b.put(next2, new C116342y0((FileSystem) bundle3.getParcelable(next2)));
            }
        }
        Bundle bundle4 = bundle.getBundle("mfs");
        if (bundle4 != null) {
            bundle4.setClassLoader(bundle.getClassLoader());
            for (String next3 : bundle4.keySet()) {
                v0Var.f349107c.put(next3, new C116342y0((FileSystem) bundle4.getParcelable(next3)));
            }
        }
        Bundle bundle5 = bundle.getBundle(WeChatBrands.Business.GROUP_MP);
        if (bundle5 != null) {
            bundle5.setClassLoader(bundle.getClassLoader());
            for (String next4 : bundle5.keySet()) {
                ((TreeMap) v0Var.f349108d).put(new C116330v(next4), bundle5.getString(next4));
            }
        }
        Bundle bundle6 = bundle.getBundle("env");
        Map<String, Object> map = v0Var.f349109e;
        if (bundle6 != null) {
            for (String next5 : bundle6.keySet()) {
                String[] stringArray = bundle6.getStringArray(next5);
                if (!(stringArray == null || stringArray.length == 0)) {
                    if (stringArray.length == 1) {
                        map.put(next5, stringArray[0]);
                    } else {
                        map.put(next5, stringArray);
                    }
                }
            }
        }
        FileSystem fileSystem = (FileSystem) bundle.getParcelable("root");
        v0Var.f349110f = fileSystem == null ? null : new C116342y0<>(fileSystem);
        return v0Var;
    }

    /* renamed from: c */
    public static <K, V> void m163941c(Map<K, V> map, Map<K, V> map2) {
        for (Map.Entry next : map2.entrySet()) {
            if (next.getValue() == null) {
                map.remove(next.getKey());
            } else {
                map.put(next.getKey(), next.getValue());
            }
        }
    }

    /* renamed from: e */
    public static <K, V> void m163942e(Printer printer, Map<K, V> map) {
        StringBuilder sb = new StringBuilder(256);
        for (Map.Entry next : map.entrySet()) {
            sb.setLength(0);
            sb.append("  ");
            sb.append(next.getKey());
            sb.append(" => ");
            Object value = next.getValue();
            if (value == null) {
                sb.append("(deleted)\n");
            } else if (value.getClass().isArray()) {
                sb.append(Arrays.toString((Object[]) value));
            } else {
                sb.append(next.getValue());
            }
            printer.println(sb.toString());
        }
    }

    /* renamed from: a */
    public C116333v0 mo177827a(C116333v0 v0Var) {
        m163941c(this.f349105a, v0Var.f349105a);
        m163941c(this.f349106b, v0Var.f349106b);
        m163941c(this.f349107c, v0Var.f349107c);
        m163941c(this.f349108d, v0Var.f349108d);
        m163941c(this.f349109e, v0Var.f349109e);
        C116342y0<FileSystem, FileSystem.C85995c> y0Var = v0Var.f349110f;
        if (y0Var != null) {
            this.f349110f = y0Var;
        }
        return this;
    }

    /* renamed from: d */
    public void mo177828d(Printer printer) {
        if (!this.f349105a.isEmpty()) {
            printer.println("[Scheme]");
            m163942e(printer, this.f349105a);
        }
        if (!this.f349106b.isEmpty()) {
            printer.println("[FileSystems]");
            m163942e(printer, this.f349106b);
        }
        if (!this.f349107c.isEmpty()) {
            printer.println("[Maintenance-only]");
            m163942e(printer, this.f349107c);
        }
        if (!this.f349108d.isEmpty()) {
            printer.println("[Mount points]");
            m163942e(printer, this.f349108d);
        }
        if (!this.f349109e.isEmpty()) {
            printer.println("[Environment]");
            m163942e(printer, this.f349109e);
        }
        if (this.f349110f != null) {
            printer.println("[Root] " + this.f349110f);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C116333v0)) {
            return false;
        }
        C116333v0 v0Var = (C116333v0) obj;
        return this.f349105a.equals(v0Var.f349105a) && this.f349106b.equals(v0Var.f349106b) && this.f349107c.equals(v0Var.f349107c) && this.f349108d.equals(v0Var.f349108d) && this.f349109e.equals(v0Var.f349109e) && C116299g2.m163849e(this.f349110f, v0Var.f349110f);
    }

    /* renamed from: f */
    public C116333v0 mo177830f() {
        C116333v0 v0Var = new C116333v0(this);
        for (C116342y0<SchemeResolver, SchemeResolver.C116250a> y0Var : v0Var.f349105a.values()) {
            y0Var.f349132b = null;
        }
        for (C116342y0<FileSystem, FileSystem.C85995c> y0Var2 : v0Var.f349106b.values()) {
            y0Var2.f349132b = null;
        }
        for (C116342y0<FileSystem, FileSystem.C85995c> y0Var3 : v0Var.f349107c.values()) {
            y0Var3.f349132b = null;
        }
        return v0Var;
    }

    /* renamed from: g */
    public Bundle mo177831g() {
        Bundle bundle = new Bundle();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(this.f349105a.size());
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : ((LinkedHashMap) this.f349105a).entrySet()) {
            SchemeResolver schemeResolver = (SchemeResolver) ((C116342y0) entry.getValue()).f349131a;
            Integer num = (Integer) hashMap.get(schemeResolver);
            if (num == null) {
                num = Integer.valueOf(arrayList.size());
                arrayList.add(schemeResolver);
                hashMap.put(schemeResolver, num);
            }
            bundle2.putInt((String) entry.getKey(), num.intValue());
        }
        bundle.putParcelableArrayList("sl", arrayList);
        bundle.putBundle("sm", bundle2);
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : ((LinkedHashMap) this.f349106b).entrySet()) {
            bundle3.putParcelable((String) entry2.getKey(), (Parcelable) ((C116342y0) entry2.getValue()).f349131a);
        }
        bundle.putBundle("fs", bundle3);
        Bundle bundle4 = new Bundle();
        for (Map.Entry entry3 : ((LinkedHashMap) this.f349107c).entrySet()) {
            bundle4.putParcelable((String) entry3.getKey(), (Parcelable) ((C116342y0) entry3.getValue()).f349131a);
        }
        bundle.putBundle("mfs", bundle4);
        Bundle bundle5 = new Bundle();
        for (Map.Entry entry4 : ((TreeMap) this.f349108d).entrySet()) {
            bundle5.putString(((C116330v) entry4.getKey()).f349099a, (String) entry4.getValue());
        }
        bundle.putBundle(WeChatBrands.Business.GROUP_MP, bundle5);
        Bundle bundle6 = new Bundle();
        for (Map.Entry entry5 : ((LinkedHashMap) this.f349109e).entrySet()) {
            Object value = entry5.getValue();
            if (value instanceof String) {
                bundle6.putStringArray((String) entry5.getKey(), new String[]{(String) value});
            } else if (value instanceof String[]) {
                bundle6.putStringArray((String) entry5.getKey(), (String[]) value);
            }
        }
        bundle.putBundle("env", bundle6);
        C116342y0<FileSystem, FileSystem.C85995c> y0Var = this.f349110f;
        bundle.putParcelable("root", y0Var == null ? null : (Parcelable) y0Var.f349131a);
        return bundle;
    }

    public int hashCode() {
        Object[] objArr = {this.f349105a, this.f349106b, this.f349107c, this.f349108d, this.f349109e, this.f349110f};
        Pattern pattern = C116299g2.f349012a;
        return Arrays.deepHashCode(objArr);
    }

    public C116333v0(C116333v0 v0Var) {
        this.f349105a = new LinkedHashMap(v0Var.f349105a);
        this.f349106b = new LinkedHashMap(v0Var.f349106b);
        this.f349107c = new LinkedHashMap(v0Var.f349107c);
        this.f349108d = new TreeMap(v0Var.f349108d);
        this.f349109e = new LinkedHashMap(v0Var.f349109e);
        this.f349110f = v0Var.f349110f;
    }
}
