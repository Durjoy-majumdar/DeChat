package p228rp;

import android.content.SharedPreferences;
import c51.C39890a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import nd3.C47223a;
import p237sp.C13749o;

@C86522b
/* renamed from: rp.a */
public class C36397a extends C86301e implements C13749o {
    public void gt0(long j, boolean z, C47223a aVar) {
        C39890a.m42668a(j, z, aVar);
    }

    /* renamed from: mu */
    public long mo13116mu(String str) {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("install_begin_time", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, 0);
        }
        return 0;
    }
}
