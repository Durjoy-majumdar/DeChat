package ee2;

import android.text.TextUtils;
import com.tencent.matrix.hook.C80379a;
import com.tencent.p014mm.plugin.performance.diagnostic.C85311d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;

/* renamed from: ee2.a */
public class C86510a extends C85311d.C85313b {

    /* renamed from: l */
    public final String f251340l;

    /* renamed from: m */
    public final String f251341m;

    /* renamed from: n */
    public final String f251342n;

    /* renamed from: o */
    public final String f251343o;

    /* renamed from: p */
    public final String f251344p;

    /* renamed from: q */
    public final String f251345q;

    /* renamed from: r */
    public final String f251346r;

    /* renamed from: s */
    public final String f251347s;

    /* renamed from: t */
    public final String f251348t;

    public C86510a(C85311d<? extends C80379a, ? extends C85311d.C85313b> dVar) {
        super(dVar);
        this.f251340l = dVar.mo56049b() + ".$hook";
        this.f251341m = dVar.mo56049b() + ".$ignore";
        this.f251342n = dVar.mo56049b() + ".$stack";
        this.f251343o = dVar.mo56049b() + ".$min";
        this.f251344p = dVar.mo56049b() + ".$max";
        this.f251345q = dVar.mo56049b() + ".$sampling";
        this.f251346r = dVar.mo56049b() + ".$extreme";
        this.f251347s = dVar.mo56049b() + ".$mmap";
        this.f251348t = dVar.mo56049b() + ".$stacklog";
    }

    /* renamed from: a */
    public void mo118543a(Map<String, String> map) {
        super.mo118543a(map);
        String str = map.get(this.f251340l);
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.MemoryHookConfigStg", "ERROR(MemoryHook): hook regex is blank");
            return;
        }
        String str2 = map.get(this.f251341m);
        boolean equals = "1".equals(map.get(this.f251342n));
        int i = 0;
        int i2 = Util.getInt(map.get(this.f251343o), 0);
        int i3 = Util.getInt(map.get(this.f251344p), 0);
        double d = Util.getDouble(map.get(this.f251345q), 1.0d);
        boolean equals2 = "1".equals(map.get(this.f251346r));
        boolean equals3 = "1".equals(map.get(this.f251347s));
        int i4 = Util.getInt(map.get(this.f251348t), 52428800);
        if (!equals2) {
            if (str2 == null) {
                str2 = ".*libutils\\.so$;.*libcutils\\.so$;.*libskia\\.so$;.*libbinder.*\\.so$;.*libhwbinder\\.so$;.*libicuuc\\.so$;.*libicui18n\\.so$;.*libart.*\\.so$;.*libandroidfw\\.so$;.*libandroid_runtime\\.so$;.*libjavacore\\.so$;.*libopenjdk.*\\.so$;.*libmemfence\\.so$";
            } else {
                if (!TextUtils.isEmpty(str2) && !str2.endsWith(";")) {
                    str2 = str2 + ";";
                }
                str2 = str2 + ".*libutils\\.so$;.*libcutils\\.so$;.*libskia\\.so$;.*libbinder.*\\.so$;.*libhwbinder\\.so$;.*libicuuc\\.so$;.*libicui18n\\.so$;.*libart.*\\.so$;.*libandroidfw\\.so$;.*libandroid_runtime\\.so$;.*libjavacore\\.so$;.*libopenjdk.*\\.so$;.*libmemfence\\.so$";
            }
        }
        if (i4 > 524288000) {
            i4 = 524288000;
        }
        if (i4 >= 0) {
            i = i4;
        }
        this.f248523a.encode(this.f251340l, str);
        this.f248523a.encode(this.f251341m, str2);
        this.f248523a.encode(this.f251342n, equals);
        this.f248523a.encode(this.f251343o, i2);
        this.f248523a.encode(this.f251344p, i3);
        this.f248523a.encode(this.f251345q, d);
        this.f248523a.encode(this.f251346r, equals2);
        this.f248523a.encode(this.f251347s, equals3);
        this.f248523a.encode(this.f251348t, i);
    }
}
