package p269xe;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p269xe.C91186h;
import p723vf.C118672d;
import p723vf.C90779e;

/* renamed from: xe.f */
public class C91184f extends C91186h {

    /* renamed from: c */
    public final long f261439c;

    /* renamed from: d */
    public final SharedPreferences.Editor f261440d;

    /* renamed from: e */
    public final HashMap<String, Long> f261441e = new HashMap<>();

    /* renamed from: f */
    public final Context f261442f;

    public C91184f(Context context, long j, String str, C91186h.C91187a aVar) {
        super(aVar);
        this.f261442f = context;
        this.f261439c = j;
        String str2 = "Matrix_" + str + C90779e.m113846a(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
        long currentTimeMillis = System.currentTimeMillis();
        this.f261440d = sharedPreferences.edit();
        HashSet hashSet = sharedPreferences.getAll() != null ? new HashSet(sharedPreferences.getAll().keySet()) : null;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                try {
                    long j2 = sharedPreferences.getLong(str3, 0);
                    long j3 = currentTimeMillis - j2;
                    if (j2 > 0) {
                        if (j3 <= this.f261439c) {
                            this.f261441e.put(str3, Long.valueOf(j2));
                        }
                    }
                    this.f261440d.remove(str3);
                } catch (ClassCastException e) {
                    C118672d.m167354d("Matrix.FilePublisher", e, "might be polluted - sp: %s, key: %s, value : %s", str2, str3, sharedPreferences.getAll().get(str3));
                }
            }
        }
        SharedPreferences.Editor editor = this.f261440d;
        if (editor != null) {
            editor.apply();
        }
    }

    /* renamed from: a */
    public boolean mo125241a(String str) {
        if (!this.f261441e.containsKey(str)) {
            return false;
        }
        long longValue = this.f261441e.get(str).longValue();
        if (longValue > 0 && System.currentTimeMillis() - longValue <= this.f261439c) {
            return true;
        }
        SharedPreferences.Editor remove = this.f261440d.remove(str);
        if (remove != null) {
            remove.apply();
        }
        this.f261441e.remove(str);
        return false;
    }

    /* renamed from: b */
    public void mo125242b(String str, boolean z) {
        SharedPreferences.Editor putLong;
        if (str != null && !this.f261441e.containsKey(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f261441e.put(str, Long.valueOf(currentTimeMillis));
            if (z && (putLong = this.f261440d.putLong(str, currentTimeMillis)) != null) {
                putLong.apply();
            }
        }
    }
}
