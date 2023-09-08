package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p1094c4.a$$c;

/* renamed from: androidx.lifecycle.f0 */
public final class C103759f0 {

    /* renamed from: e */
    public static final Class[] f306517e = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    public final Map<String, Object> f306518a;

    /* renamed from: b */
    public final Map<String, a$$c> f306519b;

    /* renamed from: c */
    public final Map<String, Object> f306520c;

    /* renamed from: d */
    public final a$$c f306521d;

    /* renamed from: androidx.lifecycle.f0$a */
    public class C103760a implements a$$c {
        public C103760a() {
        }

        /* renamed from: a */
        public Bundle mo144852a() {
            for (Map.Entry entry : new HashMap(C103759f0.this.f306519b).entrySet()) {
                Bundle a = ((a$$c) entry.getValue()).mo144852a();
                C103759f0 f0Var = C103759f0.this;
                String str = (String) entry.getKey();
                if (a != null) {
                    f0Var.getClass();
                    Class[] clsArr = C103759f0.f306517e;
                    int i = 0;
                    while (i < 29) {
                        if (!clsArr[i].isInstance(a)) {
                            i++;
                        }
                    }
                    throw new IllegalArgumentException("Can't put value with type " + a.getClass() + " into saved state");
                }
                C54219z zVar = (C54219z) ((HashMap) f0Var.f306520c).get(str);
                if (zVar != null) {
                    zVar.setValue(a);
                } else {
                    ((HashMap) f0Var.f306518a).put(str, a);
                }
            }
            Set<String> keySet = ((HashMap) C103759f0.this.f306518a).keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String str2 : keySet) {
                arrayList.add(str2);
                arrayList2.add(((HashMap) C103759f0.this.f306518a).get(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    public C103759f0(Map<String, Object> map) {
        this.f306519b = new HashMap();
        this.f306520c = new HashMap();
        this.f306521d = new C103760a();
        this.f306518a = new HashMap(map);
    }

    public C103759f0() {
        this.f306519b = new HashMap();
        this.f306520c = new HashMap();
        this.f306521d = new C103760a();
        this.f306518a = new HashMap();
    }
}
