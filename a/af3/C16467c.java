package af3;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import df3.C86274c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: af3.c */
public abstract class C16467c extends C86274c.C20456b {

    /* renamed from: c */
    public final String f43961c;

    public C16467c(String str) {
        super(str);
        this.f43961c = str;
    }

    /* renamed from: a */
    public final void mo14949a(Context context) {
        if (((ArrayList) this.f57487a).size() != 0) {
            MultiProcessMMKV.init();
            SharedPreferences.Editor edit = ("".equals(this.f43961c) ? MultiProcessMMKV.getDefault() : MultiProcessMMKV.getMMKV(this.f43961c)).edit();
            Iterator it = ((ArrayList) this.f57487a).iterator();
            while (it.hasNext()) {
                C86274c.C20456b.C20457a aVar = (C86274c.C20456b.C20457a) it.next();
                aVar.f57491c = edit;
                if (edit != null) {
                    aVar.mo32007a(edit);
                    StringBuilder sb = this.f57488b;
                    sb.append(aVar.getDescription());
                    sb.append(";\n");
                } else {
                    throw new IllegalStateException("Call #attach first!");
                }
            }
            edit.apply();
        }
    }
}
